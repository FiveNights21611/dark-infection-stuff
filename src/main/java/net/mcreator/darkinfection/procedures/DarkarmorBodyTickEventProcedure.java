package net.mcreator.darkinfection.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Score;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.darkinfection.init.DarkInfectionModItems;

public class DarkarmorBodyTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == DarkInfectionModItems.DARKARMOR_BOOTS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == DarkInfectionModItems.DARKARMOR_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == DarkInfectionModItems.DARKARMOR_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == DarkInfectionModItems.DARKARMOR_HELMET.get()) {
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
			}.getScore("infected", entity) == 0) {
				if (entity instanceof Player _player) {
					Scoreboard _sc = _player.getScoreboard();
					Objective _so = _sc.getObjective("infected");
					if (_so == null)
						_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, new TextComponent("infected"),
								ObjectiveCriteria.RenderType.INTEGER);
					Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
					_scr.setScore(1);
				}
				if (entity instanceof Player _player) {
					Scoreboard _sc = _player.getScoreboard();
					Objective _so = _sc.getObjective("imune");
					if (_so == null)
						_so = _sc.addObjective("imune", ObjectiveCriteria.DUMMY, new TextComponent("imune"), ObjectiveCriteria.RenderType.INTEGER);
					Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
					_scr.setScore(0);
				}
			} else if (new Object() {
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
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 0, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 0, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 0, (false), (false)));
			} else if (new Object() {
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
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 1, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 0, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 120, 0, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1, (false), (false)));
			} else if (new Object() {
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
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 1, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 120, 0, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 60, 1, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 60, 0, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 2, (false), (false)));
			}
		}
	}
}
