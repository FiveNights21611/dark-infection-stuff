package net.mcreator.darkinfection.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Score;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.darkinfection.init.DarkInfectionModItems;

public class VoidkingBodyTickEventProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
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
		}.getScore("infected", entity) == 5) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
					.getItem() == DarkInfectionModItems.VOIDKING_BOOTS
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
							.getItem() == DarkInfectionModItems.VOIDKING_LEGGINGS
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
							.getItem() == DarkInfectionModItems.VOIDKING_CHESTPLATE
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
							.getItem() == DarkInfectionModItems.VOIDKING_HELMET) {
				if (entity instanceof Player _player) {
					_player.getAbilities().mayfly = (true);
					_player.onUpdateAbilities();
				}
				entity.fallDistance = 0;
				if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY))
						.getDamageValue() == 400) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("You feel yourself fade as you and the voice, as one, are extinguished..."),
								(false));
					if (entity instanceof Player _player)
						_player.getInventory().clearContent();
					if (entity instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective("infected");
						if (_so == null)
							_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, new TextComponent("infected"),
									ObjectiveCriteria.RenderType.INTEGER);
						Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
						_scr.setScore(0);
					}
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("gone").bypassArmor(), 30);
				}
			} else {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == (ItemStack.EMPTY).getItem()
						&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
								.getItem() == (ItemStack.EMPTY).getItem()
						&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
								.getItem() == DarkInfectionModItems.VOIDKING_CHESTPLATE
						&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
								.getItem() == (ItemStack.EMPTY).getItem()) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("You feel your Will slip away as a voice speaks in your mind... my voice =)"),
								(false));
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 999999999, 0, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 999999999, 0, (false), (false)));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent(
								"You struggle to get the armor that is controlling you off, but it does not work, and that voice tries to tell you to give up... eventually, you fall, and that voice starts to become your own... You struggle to get the armor that is controlling you off, but it does not work, and that voice tries to tell you to give up..."),
								(false));
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
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(
										new TextComponent("Eventually, you fall to your knees, and that voice starts to become your own..."),
										(false));
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
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(
												new TextComponent("You suddenly feel... like you are right where you want to be."), (false));
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 180);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 240);
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.POISON);
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.CONFUSION);
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(20);
					(new ItemStack(DarkInfectionModItems.VOIDKING_BOOTS)).enchant(Enchantments.BINDING_CURSE, 1);
					(new ItemStack(DarkInfectionModItems.VOIDKING_LEGGINGS)).enchant(Enchantments.BINDING_CURSE, 1);
					(new ItemStack(DarkInfectionModItems.VOIDKING_CHESTPLATE)).enchant(Enchantments.BINDING_CURSE, 1);
					(new ItemStack(DarkInfectionModItems.VOIDKING_HELMET)).enchant(Enchantments.BINDING_CURSE, 1);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(DarkInfectionModItems.VOIDKING_HELMET);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(DarkInfectionModItems.VOIDKING_CHESTPLATE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(DarkInfectionModItems.VOIDKING_BOOTS);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(DarkInfectionModItems.VOIDKING_LEGGINGS);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof LivingEntity _entity) {
					if (_entity instanceof Player _player)
						_player.getInventory().armor.set(0, new ItemStack(DarkInfectionModItems.VOIDKING_BOOTS));
					else
						_entity.setItemSlot(EquipmentSlot.FEET, new ItemStack(DarkInfectionModItems.VOIDKING_BOOTS));
					if (_entity instanceof ServerPlayer _serverPlayer)
						_serverPlayer.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					if (_entity instanceof Player _player)
						_player.getInventory().armor.set(1, new ItemStack(DarkInfectionModItems.VOIDKING_LEGGINGS));
					else
						_entity.setItemSlot(EquipmentSlot.LEGS, new ItemStack(DarkInfectionModItems.VOIDKING_LEGGINGS));
					if (_entity instanceof ServerPlayer _serverPlayer)
						_serverPlayer.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					if (_entity instanceof Player _player)
						_player.getInventory().armor.set(2, new ItemStack(DarkInfectionModItems.VOIDKING_CHESTPLATE));
					else
						_entity.setItemSlot(EquipmentSlot.CHEST, new ItemStack(DarkInfectionModItems.VOIDKING_CHESTPLATE));
					if (_entity instanceof ServerPlayer _serverPlayer)
						_serverPlayer.getInventory().setChanged();
				}
				if (entity instanceof LivingEntity _entity) {
					if (_entity instanceof Player _player)
						_player.getInventory().armor.set(3, new ItemStack(DarkInfectionModItems.VOIDKING_HELMET));
					else
						_entity.setItemSlot(EquipmentSlot.HEAD, new ItemStack(DarkInfectionModItems.VOIDKING_HELMET));
					if (_entity instanceof ServerPlayer _serverPlayer)
						_serverPlayer.getInventory().setChanged();
				}
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
		}.getScore("infected", entity) == 3) {
			if (entity instanceof Player _player) {
				Scoreboard _sc = _player.getScoreboard();
				Objective _so = _sc.getObjective("infected");
				if (_so == null)
					_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, new TextComponent("infected"), ObjectiveCriteria.RenderType.INTEGER);
				Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
				_scr.setScore(5);
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
		}.getScore("infected", entity) == 0) {
			if (entity instanceof Player _player) {
				Scoreboard _sc = _player.getScoreboard();
				Objective _so = _sc.getObjective("infected");
				if (_so == null)
					_so = _sc.addObjective("infected", ObjectiveCriteria.DUMMY, new TextComponent("infected"), ObjectiveCriteria.RenderType.INTEGER);
				Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
				_scr.setScore(1);
			}
		}
	}
}
