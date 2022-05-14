
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.darkinfection.block.VoidstonebricksBlock;
import net.mcreator.darkinfection.block.VoidstoneBlock;
import net.mcreator.darkinfection.block.VoidStoneRedstoneOreBlock;
import net.mcreator.darkinfection.block.VoidStoneLapisOreBlock;
import net.mcreator.darkinfection.block.VoidStoneIronOreBlock;
import net.mcreator.darkinfection.block.VoidStoneGoldOreBlock;
import net.mcreator.darkinfection.block.VoidStoneEmeraldOreBlock;
import net.mcreator.darkinfection.block.VoidStoneDiamondOreBlock;
import net.mcreator.darkinfection.block.VoidStoneCopperOreBlock;
import net.mcreator.darkinfection.block.VoidStoneCoalOreBlock;
import net.mcreator.darkinfection.block.VoidCobbleBlock;
import net.mcreator.darkinfection.block.InfectedsoilBlock;
import net.mcreator.darkinfection.block.GravityvoidBlock;
import net.mcreator.darkinfection.block.DarkdirtBlock;
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
}
