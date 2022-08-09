
package net.mcreator.darkinfection.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class QuartzSwordItem extends SwordItem {
	public QuartzSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 4062;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 40;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE.get()));
			}
		},

				3, -2.4f,

				new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED).fireResistant());
	}

}
