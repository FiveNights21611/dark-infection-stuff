
package net.mcreator.darkinfection.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PureafyingappItem extends Item {

	public PureafyingappItem() {
		super(new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED).stacksTo(64).rarity(Rarity.RARE));
		setRegistryName("pureafyingapp");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
