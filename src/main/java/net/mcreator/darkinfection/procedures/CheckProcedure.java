package net.mcreator.darkinfection.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Score;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.darkinfection.network.DarkInfectionModVariables;
import net.mcreator.darkinfection.init.DarkInfectionModMobEffects;
import net.mcreator.darkinfection.init.DarkInfectionModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CheckProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		execute(event, event.getEntityLiving().level, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ(),
				event.getEntityLiving());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double i = 0;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_BOOTS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_HELMET.get()) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayBuild = (true);
				_player.onUpdateAbilities();
			}
		} else {
			i = 0;
			for (int index0 = 0; index0 < (int) (25); index0++) {
				i = i + 1;
				if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DarkInfectionModVariables.infected_blocks.get((int) i)
						&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(DarkInfectionModMobEffects.DARKNESS.get()) : false) == false
						&& new Object() {
							public int getScore(String score, Entity _ent) {
								if (_ent instanceof Player _player) {
									Scoreboard _sc = _player.getScoreboard();
									Objective _so = _sc.getObjective(score);
									if (_so != null) {
										Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
										return _scr.getScore();
									}
								}
								return 0;
							}
						}.getScore("infected", entity) == 0) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(DarkInfectionModMobEffects.DARKNESS.get(), 3600, 1, (false), (true)));
				} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DarkInfectionModVariables.infectable_blocks.get((int) i)
						&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(DarkInfectionModMobEffects.DARKNESS.get()) : false) == true
						&& new Object() {
							public int getScore(String score, Entity _ent) {
								if (_ent instanceof Player _player) {
									Scoreboard _sc = _player.getScoreboard();
									Objective _so = _sc.getObjective(score);
									if (_so != null) {
										Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
										return _scr.getScore();
									}
								}
								return 0;
							}
						}.getScore("infected", entity) == 0) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(DarkInfectionModMobEffects.DARKNESS.get());
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							if (entity instanceof Player _player) {
								Scoreboard _sc = _player.getScoreboard();
								Objective _so = _sc.getObjective("infected");
								if (_so == null)
									_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, new TextComponent("infected"),
											ObjectiveCriteria.RenderType.INTEGER);
								Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
								_scr.setScore(0);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 20);
				}
			}
		}
	}
}
