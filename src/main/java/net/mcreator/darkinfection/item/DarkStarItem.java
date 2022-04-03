
package net.mcreator.darkinfection.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class DarkStarItem extends Item {

	public DarkStarItem() {
		super(new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED).durability(50).fireResistant().rarity(Rarity.RARE));
		setRegistryName("dark_star");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("The Darkness Shall Grow..."));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		BallofdarknessRightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getItemInHand());
		return retval;
	}

}
