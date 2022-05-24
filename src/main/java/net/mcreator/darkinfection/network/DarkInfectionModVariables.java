package net.mcreator.darkinfection.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DarkInfectionModVariables {
	public static List<Block> infectable_blocks = new ArrayList<Block>();
	public static List<Block> infected_blocks = new ArrayList<Block>();

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
