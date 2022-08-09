
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.darkinfection.block.VoidstonebricksBlock;
import net.mcreator.darkinfection.block.VoidstoneBlock;
import net.mcreator.darkinfection.block.VoidStoneRedstoneOreLitBlock;
import net.mcreator.darkinfection.block.VoidStoneRedstoneOreBlock;
import net.mcreator.darkinfection.block.VoidStoneLapisOreBlock;
import net.mcreator.darkinfection.block.VoidStoneIronOreBlock;
import net.mcreator.darkinfection.block.VoidStoneGoldOreBlock;
import net.mcreator.darkinfection.block.VoidStoneEmeraldOreBlock;
import net.mcreator.darkinfection.block.VoidStoneDiamondOreBlock;
import net.mcreator.darkinfection.block.VoidStoneCopperOreBlock;
import net.mcreator.darkinfection.block.VoidStoneCoalOreBlock;
import net.mcreator.darkinfection.block.VoidStoneBrickWallsBlock;
import net.mcreator.darkinfection.block.VoidStoneBrickStairsBlock;
import net.mcreator.darkinfection.block.VoidStoneBrickSlabsBlock;
import net.mcreator.darkinfection.block.VoidKingSpawnerBlock;
import net.mcreator.darkinfection.block.VoidCobbleBlock;
import net.mcreator.darkinfection.block.QuartzEnrichedAncientDebrisBlock;
import net.mcreator.darkinfection.block.InfectedsoilBlock;
import net.mcreator.darkinfection.block.GravityvoidBlock;
import net.mcreator.darkinfection.block.DarkdirtBlock;
import net.mcreator.darkinfection.block.DarkWoodWoodBlock;
import net.mcreator.darkinfection.block.DarkWoodStairsBlock;
import net.mcreator.darkinfection.block.DarkWoodSlabBlock;
import net.mcreator.darkinfection.block.DarkWoodPressurePlateBlock;
import net.mcreator.darkinfection.block.DarkWoodPlanksBlock;
import net.mcreator.darkinfection.block.DarkWoodLogBlock;
import net.mcreator.darkinfection.block.DarkWoodLeavesBlock;
import net.mcreator.darkinfection.block.DarkWoodFenceGateBlock;
import net.mcreator.darkinfection.block.DarkWoodFenceBlock;
import net.mcreator.darkinfection.block.DarkWoodButtonBlock;
import net.mcreator.darkinfection.block.DarkAncientDebrisBlock;
import net.mcreator.darkinfection.block.ChisseldvoidstonebricksBlock;
import net.mcreator.darkinfection.DarkInfectionMod;

public class DarkInfectionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DarkInfectionMod.MODID);
	public static final RegistryObject<Block> INFECTEDSOIL = REGISTRY.register("infectedsoil", () -> new InfectedsoilBlock());
	public static final RegistryObject<Block> VOIDSTONE = REGISTRY.register("voidstone", () -> new VoidstoneBlock());
	public static final RegistryObject<Block> DARKDIRT = REGISTRY.register("darkdirt", () -> new DarkdirtBlock());
	public static final RegistryObject<Block> VOID_COBBLE = REGISTRY.register("void_cobble", () -> new VoidCobbleBlock());
	public static final RegistryObject<Block> GRAVITYVOID = REGISTRY.register("gravityvoid", () -> new GravityvoidBlock());
	public static final RegistryObject<Block> VOIDSTONEBRICKS = REGISTRY.register("voidstonebricks", () -> new VoidstonebricksBlock());
	public static final RegistryObject<Block> CHISSELDVOIDSTONEBRICKS = REGISTRY.register("chisseldvoidstonebricks",
			() -> new ChisseldvoidstonebricksBlock());
	public static final RegistryObject<Block> VOID_STONE_COAL_ORE = REGISTRY.register("void_stone_coal_ore", () -> new VoidStoneCoalOreBlock());
	public static final RegistryObject<Block> VOID_STONE_IRON_ORE = REGISTRY.register("void_stone_iron_ore", () -> new VoidStoneIronOreBlock());
	public static final RegistryObject<Block> VOID_STONE_REDSTONE_ORE = REGISTRY.register("void_stone_redstone_ore",
			() -> new VoidStoneRedstoneOreBlock());
	public static final RegistryObject<Block> VOID_STONE_LAPIS_ORE = REGISTRY.register("void_stone_lapis_ore", () -> new VoidStoneLapisOreBlock());
	public static final RegistryObject<Block> VOID_STONE_EMERALD_ORE = REGISTRY.register("void_stone_emerald_ore",
			() -> new VoidStoneEmeraldOreBlock());
	public static final RegistryObject<Block> VOID_STONE_DIAMOND_ORE = REGISTRY.register("void_stone_diamond_ore",
			() -> new VoidStoneDiamondOreBlock());
	public static final RegistryObject<Block> VOID_STONE_COPPER_ORE = REGISTRY.register("void_stone_copper_ore", () -> new VoidStoneCopperOreBlock());
	public static final RegistryObject<Block> VOID_STONE_GOLD_ORE = REGISTRY.register("void_stone_gold_ore", () -> new VoidStoneGoldOreBlock());
	public static final RegistryObject<Block> VOID_KING_SPAWNER = REGISTRY.register("void_king_spawner", () -> new VoidKingSpawnerBlock());
	public static final RegistryObject<Block> VOID_STONE_BRICK_STAIRS = REGISTRY.register("void_stone_brick_stairs",
			() -> new VoidStoneBrickStairsBlock());
	public static final RegistryObject<Block> VOID_STONE_BRICK_SLABS = REGISTRY.register("void_stone_brick_slabs",
			() -> new VoidStoneBrickSlabsBlock());
	public static final RegistryObject<Block> VOID_STONE_BRICK_WALLS = REGISTRY.register("void_stone_brick_walls",
			() -> new VoidStoneBrickWallsBlock());
	public static final RegistryObject<Block> VOID_STONE_REDSTONE_ORE_LIT = REGISTRY.register("void_stone_redstone_ore_lit",
			() -> new VoidStoneRedstoneOreLitBlock());
	public static final RegistryObject<Block> DARK_ANCIENT_DEBRIS = REGISTRY.register("dark_ancient_debris", () -> new DarkAncientDebrisBlock());
	public static final RegistryObject<Block> QUARTZ_ENRICHED_ANCIENT_DEBRIS = REGISTRY.register("quartz_enriched_ancient_debris",
			() -> new QuartzEnrichedAncientDebrisBlock());
	public static final RegistryObject<Block> DARK_WOOD_WOOD = REGISTRY.register("dark_wood_wood", () -> new DarkWoodWoodBlock());
	public static final RegistryObject<Block> DARK_WOOD_LOG = REGISTRY.register("dark_wood_log", () -> new DarkWoodLogBlock());
	public static final RegistryObject<Block> DARK_WOOD_PLANKS = REGISTRY.register("dark_wood_planks", () -> new DarkWoodPlanksBlock());
	public static final RegistryObject<Block> DARK_WOOD_LEAVES = REGISTRY.register("dark_wood_leaves", () -> new DarkWoodLeavesBlock());
	public static final RegistryObject<Block> DARK_WOOD_STAIRS = REGISTRY.register("dark_wood_stairs", () -> new DarkWoodStairsBlock());
	public static final RegistryObject<Block> DARK_WOOD_SLAB = REGISTRY.register("dark_wood_slab", () -> new DarkWoodSlabBlock());
	public static final RegistryObject<Block> DARK_WOOD_FENCE = REGISTRY.register("dark_wood_fence", () -> new DarkWoodFenceBlock());
	public static final RegistryObject<Block> DARK_WOOD_FENCE_GATE = REGISTRY.register("dark_wood_fence_gate", () -> new DarkWoodFenceGateBlock());
	public static final RegistryObject<Block> DARK_WOOD_PRESSURE_PLATE = REGISTRY.register("dark_wood_pressure_plate",
			() -> new DarkWoodPressurePlateBlock());
	public static final RegistryObject<Block> DARK_WOOD_BUTTON = REGISTRY.register("dark_wood_button", () -> new DarkWoodButtonBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			VoidStoneBrickWallsBlock.registerRenderLayer();
		}
	}
}
