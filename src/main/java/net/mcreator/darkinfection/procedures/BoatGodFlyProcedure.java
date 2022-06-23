package net.mcreator.darkinfection.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.darkinfection.network.DarkInfectionModVariables;

public class BoatGodFlyProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getDisplayName().getString()).equals("BoatGod69") || (entity.getDisplayName().getString()).equals("Dev"))
				&& DarkInfectionModVariables.WorldVariables.get(world).BoatGodFlyON == false) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (entity instanceof Player _player) {
						_player.getAbilities().mayfly = (false);
						_player.onUpdateAbilities();
					}
					DarkInfectionModVariables.WorldVariables.get(world).BoatGodFlyON = true;
					DarkInfectionModVariables.WorldVariables.get(world).syncData(world);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 1);
		} else if (((entity.getDisplayName().getString()).equals("BoatGod69") || (entity.getDisplayName().getString()).equals("Dev"))
				&& DarkInfectionModVariables.WorldVariables.get(world).BoatGodFlyON == true) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (entity instanceof Player _player) {
						_player.getAbilities().mayfly = (false);
						_player.onUpdateAbilities();
					}
					DarkInfectionModVariables.WorldVariables.get(world).BoatGodFlyON = false;
					DarkInfectionModVariables.WorldVariables.get(world).syncData(world);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 1);
		}
	}
}
