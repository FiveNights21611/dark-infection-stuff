
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.darkinfection.item.VoidvileItem;
import net.mcreator.darkinfection.item.VoidkingItem;
import net.mcreator.darkinfection.item.StrangevItem;
import net.mcreator.darkinfection.item.QuartzEnrichedNetheriteItem;
import net.mcreator.darkinfection.item.QuartzEnrichedNetheriteArmorItem;
import net.mcreator.darkinfection.item.PureafyingappItem;
import net.mcreator.darkinfection.item.PoppedOrbOfDarknessItem;
import net.mcreator.darkinfection.item.ItemorbofdarknessItem;
import net.mcreator.darkinfection.item.EnhancedDarkStarItem;
import net.mcreator.darkinfection.item.EmptyvileItem;
import net.mcreator.darkinfection.item.DarkarmorItem;
import net.mcreator.darkinfection.item.DarkStarItem;
import net.mcreator.darkinfection.item.DarkCarrotItem;
import net.mcreator.darkinfection.item.CurevItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DarkInfectionModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item ITEMORBOFDARKNESS = register(new ItemorbofdarknessItem());
	public static final Item INFECTEDSOIL = register(DarkInfectionModBlocks.INFECTEDSOIL, DarkInfectionModTabs.TAB_DARKINFECTED);
	public static final Item VOIDSTONE = register(DarkInfectionModBlocks.VOIDSTONE, DarkInfectionModTabs.TAB_DARKINFECTED);
	public static final Item DARKDIRT = register(DarkInfectionModBlocks.DARKDIRT, DarkInfectionModTabs.TAB_DARKINFECTED);
	public static final Item VOID_COBBLE = register(DarkInfectionModBlocks.VOID_COBBLE, DarkInfectionModTabs.TAB_DARKINFECTED);
	public static final Item GRAVITYVOID = register(DarkInfectionModBlocks.GRAVITYVOID, DarkInfectionModTabs.TAB_DARKINFECTED);
	public static final Item QUARTZ_ENRICHED_NETHERITE_ARMOR_HELMET = register(new QuartzEnrichedNetheriteArmorItem.Helmet());
	public static final Item QUARTZ_ENRICHED_NETHERITE_ARMOR_CHESTPLATE = register(new QuartzEnrichedNetheriteArmorItem.Chestplate());
	public static final Item QUARTZ_ENRICHED_NETHERITE_ARMOR_LEGGINGS = register(new QuartzEnrichedNetheriteArmorItem.Leggings());
	public static final Item QUARTZ_ENRICHED_NETHERITE_ARMOR_BOOTS = register(new QuartzEnrichedNetheriteArmorItem.Boots());
	public static final Item QUARTZ_ENRICHED_NETHERITE = register(new QuartzEnrichedNetheriteItem());
	public static final Item DARKARMOR_HELMET = register(new DarkarmorItem.Helmet());
	public static final Item DARKARMOR_CHESTPLATE = register(new DarkarmorItem.Chestplate());
	public static final Item DARKARMOR_LEGGINGS = register(new DarkarmorItem.Leggings());
	public static final Item DARKARMOR_BOOTS = register(new DarkarmorItem.Boots());
	public static final Item DARK_CARROT = register(new DarkCarrotItem());
	public static final Item PUREAFYINGAPP = register(new PureafyingappItem());
	public static final Item POPPED_ORB_OF_DARKNESS = register(new PoppedOrbOfDarknessItem());
	public static final Item DARK_STAR = register(new DarkStarItem());
	public static final Item ENHANCED_DARK_STAR = register(new EnhancedDarkStarItem());
	public static final Item VOIDKING_HELMET = register(new VoidkingItem.Helmet());
	public static final Item VOIDKING_CHESTPLATE = register(new VoidkingItem.Chestplate());
	public static final Item VOIDKING_LEGGINGS = register(new VoidkingItem.Leggings());
	public static final Item VOIDKING_BOOTS = register(new VoidkingItem.Boots());
	public static final Item VOIDVILE = register(new VoidvileItem());
	public static final Item CUREV = register(new CurevItem());
	public static final Item STRANGEV = register(new StrangevItem());
	public static final Item EMPTYVILE = register(new EmptyvileItem());
	public static final Item VOIDKINGBOSS = register(
			new SpawnEggItem(DarkInfectionModEntities.VOIDKINGBOSS, -3342337, -52, new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED))
					.setRegistryName("voidkingboss_spawn_egg"));

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
