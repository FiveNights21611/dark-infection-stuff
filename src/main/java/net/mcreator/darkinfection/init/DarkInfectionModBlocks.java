
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.darkinfection.block.VoidstoneBlock;
import net.mcreator.darkinfection.block.VoidCobbleBlock;
import net.mcreator.darkinfection.block.InfectedsoilBlock;
import net.mcreator.darkinfection.block.GravityvoidBlock;
import net.mcreator.darkinfection.block.DarkdirtBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DarkInfectionModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block INFECTEDSOIL = register(new InfectedsoilBlock());
	public static final Block VOIDSTONE = register(new VoidstoneBlock());
	public static final Block DARKDIRT = register(new DarkdirtBlock());
	public static final Block VOID_COBBLE = register(new VoidCobbleBlock());
	public static final Block GRAVITYVOID = register(new GravityvoidBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
