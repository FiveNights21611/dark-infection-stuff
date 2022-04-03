
package net.mcreator.darkinfection.item;

import net.minecraft.sounds.SoundEvent;

public abstract class DarkarmorItem extends ArmorItem {

	public DarkarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{11, 16, 16, 13}[slot.getIndex()];
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
				return Ingredient.of(new ItemStack(DarkInfectionModItems.ITEMORBOFDARKNESS));
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
				return 5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DarkarmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED));

			setRegistryName("darkarmor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/models/armor/dark__layer_1.png";
		}

	}

	public static class Chestplate extends DarkarmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED));

			setRegistryName("darkarmor_chestplate");
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

			setRegistryName("darkarmor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/models/armor/dark__layer_2.png";
		}

	}

	public static class Boots extends DarkarmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED));

			setRegistryName("darkarmor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dark_infection:textures/models/armor/dark__layer_1.png";
		}

	}

}
