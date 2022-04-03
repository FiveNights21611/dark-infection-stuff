
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.darkinfection.item.QuartzEnrichedNetheriteItem;
import net.mcreator.darkinfection.item.QuartzEnrichedNetheriteArmorItem;
import net.mcreator.darkinfection.item.ItemorbofdarknessItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DarkInfectionModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item ITEMORBOFDARKNESS = register(new ItemorbofdarknessItem());
	public static final Item INFECTEDSOIL = register(DarkInfectionModBlocks.INFECTEDSOIL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item VOIDSTONE = register(DarkInfectionModBlocks.VOIDSTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item DARKDIRT = register(DarkInfectionModBlocks.DARKDIRT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item VOID_COBBLE = register(DarkInfectionModBlocks.VOID_COBBLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item GRAVITYVOID = register(DarkInfectionModBlocks.GRAVITYVOID, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item QUARTZ_ENRICHED_NETHERITE_ARMOR_HELMET = register(new QuartzEnrichedNetheriteArmorItem.Helmet());
	public static final Item QUARTZ_ENRICHED_NETHERITE_ARMOR_CHESTPLATE = register(new QuartzEnrichedNetheriteArmorItem.Chestplate());
	public static final Item QUARTZ_ENRICHED_NETHERITE_ARMOR_LEGGINGS = register(new QuartzEnrichedNetheriteArmorItem.Leggings());
	public static final Item QUARTZ_ENRICHED_NETHERITE_ARMOR_BOOTS = register(new QuartzEnrichedNetheriteArmorItem.Boots());
	public static final Item QUARTZ_ENRICHED_NETHERITE = register(new QuartzEnrichedNetheriteItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
