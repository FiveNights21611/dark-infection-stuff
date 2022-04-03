
package net.mcreator.darkinfection.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PureafyingappItem extends Item {

	public PureafyingappItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("pureafyingapp");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
