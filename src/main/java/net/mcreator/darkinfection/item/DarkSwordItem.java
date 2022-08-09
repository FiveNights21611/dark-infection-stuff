
package net.mcreator.darkinfection.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.darkinfection.init.DarkInfectionModTabs;
import net.mcreator.darkinfection.init.DarkInfectionModItems;

public class DarkSwordItem extends SwordItem {
	public DarkSwordItem() {
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
				return Ingredient.of(new ItemStack(DarkInfectionModItems.DARK_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED).fireResistant());
	}
}
