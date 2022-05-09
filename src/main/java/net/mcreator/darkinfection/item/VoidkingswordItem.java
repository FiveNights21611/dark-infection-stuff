
package net.mcreator.darkinfection.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.darkinfection.init.DarkInfectionModTabs;
import net.mcreator.darkinfection.init.DarkInfectionModItems;

import java.util.List;

public class VoidkingswordItem extends SwordItem {
	public VoidkingswordItem() {
		super(new Tier() {
			public int getUses() {
				return 95374;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DarkInfectionModItems.DELETED_MOD_ELEMENT.get()));
			}
		}, 3, -3.4f, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Feels Powerful... and ready. =)"));
	}
}
