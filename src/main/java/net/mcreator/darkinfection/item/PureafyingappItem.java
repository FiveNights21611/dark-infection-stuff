
package net.mcreator.darkinfection.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.darkinfection.init.DarkInfectionModTabs;

public class PureafyingappItem extends Item {
	public PureafyingappItem() {
		super(new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
