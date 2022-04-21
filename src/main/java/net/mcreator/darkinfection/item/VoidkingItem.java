
package net.mcreator.darkinfection.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.darkinfection.procedures.VoidkingBodyTickEventProcedure;
import net.mcreator.darkinfection.init.DarkInfectionModTabs;
import net.mcreator.darkinfection.client.model.Modelvoidking_armor;

import java.util.Map;
import java.util.Collections;

public abstract class VoidkingItem extends ArmorItem {
	public VoidkingItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 37;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{11, 16, 15, 13}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 25;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.growl"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "voidking";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends VoidkingItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED).fireResistant());
			setRegistryName("voidking_helmet");
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("head",
							new Modelvoidking_armor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelvoidking_armor.LAYER_LOCATION)).Head,
							"hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/voidking_armor.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			VoidkingBodyTickEventProcedure.execute(world, entity);
		}
	}

	public static class Chestplate extends VoidkingItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED).fireResistant());
			setRegistryName("voidking_chestplate");
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("body",
							new Modelvoidking_armor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelvoidking_armor.LAYER_LOCATION)).Body,
							"left_arm",
							new Modelvoidking_armor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelvoidking_armor.LAYER_LOCATION)).LeftArm,
							"right_arm",
							new Modelvoidking_armor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelvoidking_armor.LAYER_LOCATION)).RightArm,
							"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/voidking_armor.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			VoidkingBodyTickEventProcedure.execute(world, entity);
		}
	}

	public static class Leggings extends VoidkingItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED).fireResistant());
			setRegistryName("voidking_leggings");
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("left_leg",
							new Modelvoidking_armor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelvoidking_armor.LAYER_LOCATION)).LeftLeg,
							"right_leg",
							new Modelvoidking_armor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelvoidking_armor.LAYER_LOCATION)).RightLeg,
							"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/voidking_armor.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			VoidkingBodyTickEventProcedure.execute(world, entity);
		}
	}

	public static class Boots extends VoidkingItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED));
			setRegistryName("voidking_boots");
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("left_leg",
							new Modelvoidking_armor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelvoidking_armor.LAYER_LOCATION)).lboot,
							"right_leg",
							new Modelvoidking_armor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelvoidking_armor.LAYER_LOCATION)).rboot,
							"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/voidking_armor.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			VoidkingBodyTickEventProcedure.execute(world, entity);
		}
	}
}
