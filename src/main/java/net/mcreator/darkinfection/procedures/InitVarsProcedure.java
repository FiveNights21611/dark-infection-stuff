package net.mcreator.darkinfection.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.WorldEvent;

import net.minecraft.world.level.block.Blocks;

import net.mcreator.darkinfection.network.DarkInfectionModVariables;
import net.mcreator.darkinfection.init.DarkInfectionModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InitVarsProcedure {
	@SubscribeEvent
	public static void onWorldLoad(WorldEvent.Load event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		DarkInfectionModVariables.infectable_blocks.add(Blocks.STONE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOIDSTONE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.DEEPSLATE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOIDSTONE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.SAND);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.GRAVITYVOID.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.GRAVEL);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.GRAVITYVOID.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.DIRT);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.DARKDIRT.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.GRASS_BLOCK);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.INFECTEDSOIL.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.COBBLESTONE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_COBBLE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.COBBLED_DEEPSLATE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_COBBLE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.COAL_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.DEEPSLATE_COAL_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.IRON_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.DEEPSLATE_IRON_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.REDSTONE_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.DEEPSLATE_REDSTONE_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.REDSTONE_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.LAPIS_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.DEEPSLATE_LAPIS_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.EMERALD_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.DEEPSLATE_EMERALD_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.DIAMOND_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.DEEPSLATE_DIAMOND_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.COPPER_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.DEEPSLATE_COPPER_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.GOLD_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.DEEPSLATE_GOLD_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get());
		DarkInfectionModVariables.infectable_blocks.add(Blocks.NETHER_GOLD_ORE);
		DarkInfectionModVariables.infected_blocks.add(DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get());
	}
}
