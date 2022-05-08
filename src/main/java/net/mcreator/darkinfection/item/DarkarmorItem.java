
package net.mcreator.darkinfection.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.darkinfection.procedures.DarkarmorBodyTickEventProcedure;
import net.mcreator.darkinfection.init.DarkInfectionModTabs;
import net.mcreator.darkinfection.init.DarkInfectionModItems;

public abstract class DarkarmorItem extends ArmorItem {
	public DarkarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 7, 8, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 25;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DarkInfectionModItems.ITEMORBOFDARKNESS.get()));
			}

			@Override
			public String getName() {
				return "darkarmor";
			}

			@Override
			public float getToughness() {
				return 0.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DarkarmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/models/armor/dark__layer_1.png";
		}
	}

	public static class Chestplate extends DarkarmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/models/armor/dark__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			DarkarmorBodyTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends DarkarmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/models/armor/dark__layer_2.png";
		}
	}

	public static class Boots extends DarkarmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/models/armor/dark__layer_1.png";
		}
	}
}
