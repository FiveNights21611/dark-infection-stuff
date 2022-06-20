package net.mcreator.darkinfection.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Score;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.darkinfection.init.DarkInfectionModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CrptProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_BOOTS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_HELMET.get()) == false) {
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
			}.getScore("crtp", entity) == 1 && new Object() {
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
			}.getScore("imune", entity) == 0) {
				if (entity instanceof Player _player) {
					Scoreboard _sc = _player.getScoreboard();
					Objective _so = _sc.getObjective("crtp");
					if (_so == null)
						_so = _sc.addObjective("crtp", ObjectiveCriteria.DUMMY, new TextComponent("crtp"), ObjectiveCriteria.RenderType.INTEGER);
					Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
					_scr.setScore(0);
				}
				if (entity instanceof Player _player) {
					Scoreboard _sc = _player.getScoreboard();
					Objective _so = _sc.getObjective("infected");
					if (_so == null)
						_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, new TextComponent("infected"),
								ObjectiveCriteria.RenderType.INTEGER);
					Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
					_scr.setScore(1);
				}
			} else {
				if (entity instanceof Player _player) {
					Scoreboard _sc = _player.getScoreboard();
					Objective _so = _sc.getObjective("crtp");
					if (_so == null)
						_so = _sc.addObjective("crtp", ObjectiveCriteria.DUMMY, new TextComponent("crtp"), ObjectiveCriteria.RenderType.INTEGER);
					Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
					_scr.setScore(0);
				}
				if (entity instanceof Player _player) {
					Scoreboard _sc = _player.getScoreboard();
					Objective _so = _sc.getObjective("imune");
					if (_so == null)
						_so = _sc.addObjective("imune", ObjectiveCriteria.DUMMY, new TextComponent("imune"), ObjectiveCriteria.RenderType.INTEGER);
					Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
					_scr.setScore(0);
				}
			}
		} else if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_BOOTS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_HELMET.get()) == true) {
			if (Math.random() > 0.975) {
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
				}.getScore("crtp", entity) == 1 && new Object() {
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
				}.getScore("imune", entity) == 0) {
					if (entity instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective("crtp");
						if (_so == null)
							_so = _sc.addObjective("crtp", ObjectiveCriteria.DUMMY, new TextComponent("crtp"), ObjectiveCriteria.RenderType.INTEGER);
						Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
						_scr.setScore(0);
					}
					if (entity instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective("infected");
						if (_so == null)
							_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, new TextComponent("infected"),
									ObjectiveCriteria.RenderType.INTEGER);
						Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
						_scr.setScore(1);
					}
				} else {
					if (entity instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective("crtp");
						if (_so == null)
							_so = _sc.addObjective("crtp", ObjectiveCriteria.DUMMY, new TextComponent("crtp"), ObjectiveCriteria.RenderType.INTEGER);
						Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
						_scr.setScore(0);
					}
					if (entity instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective("imune");
						if (_so == null)
							_so = _sc.addObjective("imune", ObjectiveCriteria.DUMMY, new TextComponent("imune"),
									ObjectiveCriteria.RenderType.INTEGER);
						Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
						_scr.setScore(0);
					}
				}
			}
		}
	}
}
