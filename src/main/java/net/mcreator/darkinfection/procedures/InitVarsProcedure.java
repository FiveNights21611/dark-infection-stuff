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
	}
}
