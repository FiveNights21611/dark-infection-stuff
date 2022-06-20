
package net.mcreator.darkinfection.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.darkinfection.procedures.VoidkingbossItIsStruckByLightningProcedure;
import net.mcreator.darkinfection.procedures.VoidKingLevitateProcedure;
import net.mcreator.darkinfection.init.DarkInfectionModItems;
import net.mcreator.darkinfection.init.DarkInfectionModEntities;

import java.util.Random;
import java.util.EnumSet;

public class VoidkingbossEntity extends Monster implements RangedAttackMob {
	private final ServerBossEvent bossInfo = new ServerBossEvent(this.getDisplayName(), ServerBossEvent.BossBarColor.YELLOW,
			ServerBossEvent.BossBarOverlay.NOTCHED_20);

	public VoidkingbossEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(DarkInfectionModEntities.VOIDKINGBOSS.get(), world);
	}

	public VoidkingbossEntity(EntityType<VoidkingbossEntity> type, Level world) {
		super(type, world);
		xpReward = 10000;
		setNoAi(false);
		setCustomName(new TextComponent("Void King"));
		setCustomNameVisible(true);
		setPersistenceRequired();
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(DarkInfectionModItems.VOIDKINGSWORD.get()));
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(DarkInfectionModItems.VOIDKING_HELMET.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(DarkInfectionModItems.VOIDKING_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(DarkInfectionModItems.VOIDKING_LEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(DarkInfectionModItems.VOIDKING_BOOTS.get()));
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, Player.class, (float) 50));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, true, true));
		this.goalSelector.addGoal(3, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (VoidkingbossEntity.this.getTarget() != null && !VoidkingbossEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return VoidkingbossEntity.this.getMoveControl().hasWanted() && VoidkingbossEntity.this.getTarget() != null
						&& VoidkingbossEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = VoidkingbossEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				VoidkingbossEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 0.15);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = VoidkingbossEntity.this.getTarget();
				if (VoidkingbossEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					VoidkingbossEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = VoidkingbossEntity.this.distanceToSqr(livingentity);
					if (d0 < 50) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						VoidkingbossEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 0.15);
					}
				}
			}
		});
		this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 0.15, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.goalSelector.addGoal(5, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(6, new RandomStrollGoal(this, 0.5, 20) {
			@Override
			protected Vec3 getPosition() {
				Random random = VoidkingbossEntity.this.getRandom();
				double dir_x = VoidkingbossEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = VoidkingbossEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = VoidkingbossEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}
		});
		this.targetSelector.addGoal(7, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(8, new LeapAtTargetGoal(this, (float) 1));
		this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(10, new FloatGoal(this));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(DarkInfectionModItems.STRANGEV.get()));
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.impact"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.hit_ground"));
	}

	@Override
	public void thunderHit(ServerLevel serverWorld, LightningBolt lightningBolt) {
		super.thunderHit(serverWorld, lightningBolt);
		VoidkingbossItIsStruckByLightningProcedure.execute(this);
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		if (source == DamageSource.LIGHTNING_BOLT)
			return false;
		if (source.isExplosion())
			return false;
		if (source == DamageSource.ANVIL)
			return false;
		if (source == DamageSource.DRAGON_BREATH)
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void baseTick() {
		super.baseTick();
		VoidKingLevitateProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		DarkOrbEntity.shoot(this, target);
	}

	@Override
	public boolean canChangeDimensions() {
		return false;
	}

	@Override
	public void startSeenByPlayer(ServerPlayer player) {
		super.startSeenByPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	public void stopSeenByPlayer(ServerPlayer player) {
		super.stopSeenByPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	public void customServerAiStep() {
		super.customServerAiStep();
		this.bossInfo.setProgress(this.getHealth() / this.getMaxHealth());
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		for (int l = 0; l < 4; ++l) {
			double x0 = x + random.nextFloat();
			double y0 = y + random.nextFloat();
			double z0 = z + random.nextFloat();
			double dx = (random.nextFloat() - 0.5D) * 0.8D;
			double dy = (random.nextFloat() - 0.5D) * 0.8D;
			double dz = (random.nextFloat() - 0.5D) * 0.8D;
			world.addParticle(ParticleTypes.END_ROD, x0, y0, z0, dx, dy, dz);
		}
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.7000000000000001);
		builder = builder.add(Attributes.MAX_HEALTH, 150);
		builder = builder.add(Attributes.ARMOR, 4);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 7);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5);
		builder = builder.add(Attributes.FLYING_SPEED, 0.7000000000000001);
		return builder;
	}
}
