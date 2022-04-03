
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DarkInfectionModTabs {
	public static CreativeModeTab TAB_DARKINFECTED;

	public static void load() {
		TAB_DARKINFECTED = new CreativeModeTab("tabdarkinfected") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DarkInfectionModBlocks.DARKDIRT);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
