
package net.mcreator.darkinfection.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.darkinfection.init.DarkInfectionModTabs;

import java.util.List;

public class CurevItem extends Item {
	public CurevItem() {
		super(new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED).stacksTo(64).rarity(Rarity.UNCOMMON));
		setRegistryName("curev");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Feels sanitary..."));
	}
}