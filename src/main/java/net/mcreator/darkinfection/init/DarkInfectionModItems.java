
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.darkinfection.item.VoidvileItem;
import net.mcreator.darkinfection.item.VoidkingswordItem;
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
import net.mcreator.darkinfection.DarkInfectionMod;

public class DarkInfectionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DarkInfectionMod.MODID);
	public static final RegistryObject<Item> ITEMORBOFDARKNESS = REGISTRY.register("itemorbofdarkness", () -> new ItemorbofdarknessItem());
	public static final RegistryObject<Item> INFECTEDSOIL = block(DarkInfectionModBlocks.INFECTEDSOIL, DarkInfectionModTabs.TAB_DARKINFECTED);
	public static final RegistryObject<Item> VOIDSTONE = block(DarkInfectionModBlocks.VOIDSTONE, DarkInfectionModTabs.TAB_DARKINFECTED);
	public static final RegistryObject<Item> DARKDIRT = block(DarkInfectionModBlocks.DARKDIRT, DarkInfectionModTabs.TAB_DARKINFECTED);
	public static final RegistryObject<Item> VOID_COBBLE = block(DarkInfectionModBlocks.VOID_COBBLE, DarkInfectionModTabs.TAB_DARKINFECTED);
	public static final RegistryObject<Item> GRAVITYVOID = block(DarkInfectionModBlocks.GRAVITYVOID, DarkInfectionModTabs.TAB_DARKINFECTED);
	public static final RegistryObject<Item> QUARTZ_ENRICHED_NETHERITE_ARMOR_HELMET = REGISTRY.register("quartz_enriched_netherite_armor_helmet",
			() -> new QuartzEnrichedNetheriteArmorItem.Helmet());
	public static final RegistryObject<Item> QUARTZ_ENRICHED_NETHERITE_ARMOR_CHESTPLATE = REGISTRY
			.register("quartz_enriched_netherite_armor_chestplate", () -> new QuartzEnrichedNetheriteArmorItem.Chestplate());
	public static final RegistryObject<Item> QUARTZ_ENRICHED_NETHERITE_ARMOR_LEGGINGS = REGISTRY.register("quartz_enriched_netherite_armor_leggings",
			() -> new QuartzEnrichedNetheriteArmorItem.Leggings());
	public static final RegistryObject<Item> QUARTZ_ENRICHED_NETHERITE_ARMOR_BOOTS = REGISTRY.register("quartz_enriched_netherite_armor_boots",
			() -> new QuartzEnrichedNetheriteArmorItem.Boots());
	public static final RegistryObject<Item> QUARTZ_ENRICHED_NETHERITE = REGISTRY.register("quartz_enriched_netherite",
			() -> new QuartzEnrichedNetheriteItem());
	public static final RegistryObject<Item> DARKARMOR_HELMET = REGISTRY.register("darkarmor_helmet", () -> new DarkarmorItem.Helmet());
	public static final RegistryObject<Item> DARKARMOR_CHESTPLATE = REGISTRY.register("darkarmor_chestplate", () -> new DarkarmorItem.Chestplate());
	public static final RegistryObject<Item> DARKARMOR_LEGGINGS = REGISTRY.register("darkarmor_leggings", () -> new DarkarmorItem.Leggings());
	public static final RegistryObject<Item> DARKARMOR_BOOTS = REGISTRY.register("darkarmor_boots", () -> new DarkarmorItem.Boots());
	public static final RegistryObject<Item> PUREAFYINGAPP = REGISTRY.register("pureafyingapp", () -> new PureafyingappItem());
	public static final RegistryObject<Item> POPPED_ORB_OF_DARKNESS = REGISTRY.register("popped_orb_of_darkness",
			() -> new PoppedOrbOfDarknessItem());
	public static final RegistryObject<Item> DARK_STAR = REGISTRY.register("dark_star", () -> new DarkStarItem());
	public static final RegistryObject<Item> ENHANCED_DARK_STAR = REGISTRY.register("enhanced_dark_star", () -> new EnhancedDarkStarItem());
	public static final RegistryObject<Item> VOIDKING_HELMET = REGISTRY.register("voidking_helmet", () -> new VoidkingItem.Helmet());
	public static final RegistryObject<Item> VOIDKING_CHESTPLATE = REGISTRY.register("voidking_chestplate", () -> new VoidkingItem.Chestplate());
	public static final RegistryObject<Item> VOIDKING_LEGGINGS = REGISTRY.register("voidking_leggings", () -> new VoidkingItem.Leggings());
	public static final RegistryObject<Item> VOIDKING_BOOTS = REGISTRY.register("voidking_boots", () -> new VoidkingItem.Boots());
	public static final RegistryObject<Item> VOIDVILE = REGISTRY.register("voidvile", () -> new VoidvileItem());
	public static final RegistryObject<Item> CUREV = REGISTRY.register("curev", () -> new CurevItem());
	public static final RegistryObject<Item> STRANGEV = REGISTRY.register("strangev", () -> new StrangevItem());
	public static final RegistryObject<Item> EMPTYVILE = REGISTRY.register("emptyvile", () -> new EmptyvileItem());
	public static final RegistryObject<Item> VOIDKINGBOSS = REGISTRY.register("voidkingboss_spawn_egg",
			() -> new ForgeSpawnEggItem(DarkInfectionModEntities.VOIDKINGBOSS, -3342337, -52,
					new Item.Properties().tab(DarkInfectionModTabs.TAB_DARKINFECTED)));
	public static final RegistryObject<Item> VOIDKINGSWORD = REGISTRY.register("voidkingsword", () -> new VoidkingswordItem());
	public static final RegistryObject<Item> VOIDSTONEBRICKS = block(DarkInfectionModBlocks.VOIDSTONEBRICKS, DarkInfectionModTabs.TAB_DARKINFECTED);
	public static final RegistryObject<Item> DARK_CARROT = REGISTRY.register("dark_carrot", () -> new DarkCarrotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
