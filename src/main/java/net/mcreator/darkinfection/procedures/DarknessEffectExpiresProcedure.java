package net.mcreator.darkinfection.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Score;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.darkinfection.init.DarkInfectionModMobEffects;
import net.mcreator.darkinfection.init.DarkInfectionModBlocks;

public class DarknessEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
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
		}.getScore("imune", entity) == 0 && new Object() {
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
			if (entity instanceof Player _player) {
				Scoreboard _sc = _player.getScoreboard();
				Objective _so = _sc.getObjective("infected");
				if (_so == null)
					_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, new TextComponent("infected"), ObjectiveCriteria.RenderType.INTEGER);
				Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
				_scr.setScore(1);
			}
		} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(DarkInfectionModMobEffects.DARKNESS.get())
				? _livEnt.getEffect(DarkInfectionModMobEffects.DARKNESS.get()).getAmplifier()
				: 0) == 3) {
			if (entity instanceof Player _player) {
				Scoreboard _sc = _player.getScoreboard();
				Objective _so = _sc.getObjective("infected");
				if (_so == null)
					_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, new TextComponent("infected"), ObjectiveCriteria.RenderType.INTEGER);
				Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
				_scr.setScore(3);
			}
		} else {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DarkInfectionModBlocks.INFECTEDSOIL.get()
					|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DarkInfectionModBlocks.VOIDSTONE.get()
					|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DarkInfectionModBlocks.DARKDIRT.get()) {
				if (entity instanceof Player _player) {
					Scoreboard _sc = _player.getScoreboard();
					Objective _so = _sc.getObjective("imune");
					if (_so == null)
						_so = _sc.addObjective("imune", ObjectiveCriteria.DUMMY, new TextComponent("imune"), ObjectiveCriteria.RenderType.INTEGER);
					Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
					_scr.setScore(0);
				}
			}
		}
	}
}
