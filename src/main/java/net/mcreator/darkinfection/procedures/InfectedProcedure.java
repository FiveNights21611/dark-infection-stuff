package net.mcreator.darkinfection.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Score;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InfectedProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		Entity entity = event.getEntityLiving();
		execute(event, entity.level, entity);
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
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
				if (new Object() {
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
				}.getScore("infected", entity) == 1) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 1, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 0, (false), (false)));
				}
				if (new Object() {
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
				}.getScore("infected", entity) == 2) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 1, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 0, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 1, (false), (false)));
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.HEALTH_BOOST) : false) == false) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100000, 0, (false), (false)));
					}
				}
				if (new Object() {
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
				}.getScore("infected", entity) == 3) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 2, (false), (false)));
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.HEALTH_BOOST) : false) == false) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100000, 2, (false), (false)));
					}
				}
				if (new Object() {
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
				}.getScore("infected", entity) == 3) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 3, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 3, (false), (false)));
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.HEALTH_BOOST) : false) == false) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100000, 2, (false), (false)));
					}
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 1, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 60, 1, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 60, 1, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 60, 1, (false), (false)));
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 60);
	}
}
