
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
import net.mcreator.darkinfection.block.VoidCobbleBlock;
import net.mcreator.darkinfection.block.InfectedsoilBlock;
import net.mcreator.darkinfection.block.GravityvoidBlock;
import net.mcreator.darkinfection.block.DarkdirtBlock;
import net.mcreator.darkinfection.DarkInfectionMod;

public class DarkInfectionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DarkInfectionMod.MODID);
	public static final RegistryObject<Block> INFECTEDSOIL = REGISTRY.register("infectedsoil", () -> new InfectedsoilBlock());
	public static final RegistryObject<Block> VOIDSTONE = REGISTRY.register("voidstone", () -> new VoidstoneBlock());
	public static final RegistryObject<Block> DARKDIRT = REGISTRY.register("darkdirt", () -> new DarkdirtBlock());
	public static final RegistryObject<Block> VOID_COBBLE = REGISTRY.register("void_cobble", () -> new VoidCobbleBlock());
	public static final RegistryObject<Block> GRAVITYVOID = REGISTRY.register("gravityvoid", () -> new GravityvoidBlock());
	public static final RegistryObject<Block> VOIDSTONEBRICKS = REGISTRY.register("voidstonebricks", () -> new VoidstonebricksBlock());
}
