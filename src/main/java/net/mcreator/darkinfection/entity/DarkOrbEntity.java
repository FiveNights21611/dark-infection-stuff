
package net.mcreator.darkinfection.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.darkinfection.init.DarkInfectionModItems;
import net.mcreator.darkinfection.init.DarkInfectionModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class DarkOrbEntity extends AbstractArrow implements ItemSupplier {
	public DarkOrbEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(DarkInfectionModEntities.DARK_ORB.get(), world);
	}

	public DarkOrbEntity(EntityType<? extends DarkOrbEntity> type, Level world) {
		super(type, world);
	}

	public DarkOrbEntity(EntityType<? extends DarkOrbEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public DarkOrbEntity(EntityType<? extends DarkOrbEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(DarkInfectionModItems.DARK_STAR.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static DarkOrbEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		DarkOrbEntity entityarrow = new DarkOrbEntity(DarkInfectionModEntities.DARK_ORB.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static DarkOrbEntity shoot(LivingEntity entity, LivingEntity target) {
		DarkOrbEntity entityarrow = new DarkOrbEntity(DarkInfectionModEntities.DARK_ORB.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 3f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(7);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(true);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
