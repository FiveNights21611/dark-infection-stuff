package net.mcreator.darkinfection.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.darkinfection.network.DarkInfectionModVariables;

import java.util.Random;

public class InfectedBlockUpdatecul8tersmodProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double i = 0;
		if (1 == Mth.nextInt(new Random(), 1, 10)) {
			for (int index0 = 0; index0 < (int) (27); index0++) {
				i = i + 1;
				if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == DarkInfectionModVariables.infectable_blocks.get((int) i)) {
					world.setBlock(new BlockPos(x, y + 1, z), DarkInfectionModVariables.infected_blocks.get((int) i).defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DarkInfectionModVariables.infectable_blocks.get((int) i)) {
					world.setBlock(new BlockPos(x, y - 1, z), DarkInfectionModVariables.infected_blocks.get((int) i).defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == DarkInfectionModVariables.infectable_blocks.get((int) i)) {
					world.setBlock(new BlockPos(x + 1, y, z), DarkInfectionModVariables.infected_blocks.get((int) i).defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == DarkInfectionModVariables.infectable_blocks.get((int) i)) {
					world.setBlock(new BlockPos(x - 1, y, z), DarkInfectionModVariables.infected_blocks.get((int) i).defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == DarkInfectionModVariables.infectable_blocks.get((int) i)) {
					world.setBlock(new BlockPos(x, y, z + 1), DarkInfectionModVariables.infected_blocks.get((int) i).defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == DarkInfectionModVariables.infectable_blocks.get((int) i)) {
					world.setBlock(new BlockPos(x, y, z - 1), DarkInfectionModVariables.infected_blocks.get((int) i).defaultBlockState(), 3);
				}
			}
		}
	}
}
