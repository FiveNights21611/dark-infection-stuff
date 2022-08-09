
package net.mcreator.darkinfection.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.darkinfection.init.DarkInfectionModTabs;

public abstract class DarkDiamondItem extends ArmorItem {
	public DarkDiamondItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 33;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 7, 8, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 10;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "dark_diamond";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DarkDiamondItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/models/armor/dark_diamond__layer_1.png";
		}
	}

	public static class Chestplate extends DarkDiamondItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/models/armor/dark_diamond__layer_1.png";
		}
	}

	public static class Leggings extends DarkDiamondItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/models/armor/dark_diamond__layer_2.png";
		}
	}

	public static class Boots extends DarkDiamondItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/models/armor/dark_diamond__layer_1.png";
		}
	}
}
