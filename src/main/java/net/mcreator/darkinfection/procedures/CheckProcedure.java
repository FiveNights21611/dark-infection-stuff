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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.darkinfection.init.DarkInfectionModMobEffects;
import net.mcreator.darkinfection.init.DarkInfectionModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CheckProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		Entity entity = event.getEntityLiving();
		execute(event, entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == DarkInfectionModBlocks.INFECTEDSOIL
				|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == DarkInfectionModBlocks.VOIDSTONE
				|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == DarkInfectionModBlocks.DARKDIRT)
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(DarkInfectionModMobEffects.DARKNESS) : false) == false
				&& (new Object() {
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
				}.getScore("infected", entity) == 1) == false) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(DarkInfectionModMobEffects.DARKNESS, 10000, 1, (false), (false)));
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.STONE
				|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.DIRT)
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(DarkInfectionModMobEffects.DARKNESS) : false) == true
				&& (new Object() {
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
				}.getScore("infected", entity) == 1) == false) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(DarkInfectionModMobEffects.DARKNESS);
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
