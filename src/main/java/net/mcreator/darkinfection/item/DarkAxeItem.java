
package net.mcreator.darkinfection.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.darkinfection.init.DarkInfectionModItems;

public class DarkAxeItem extends AxeItem {
	public DarkAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4062;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 10f;
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
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
