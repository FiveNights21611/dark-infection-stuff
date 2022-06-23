package net.mcreator.darkinfection.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;
import net.minecraft.Util;

import net.mcreator.darkinfection.network.DarkInfectionModVariables;
import net.mcreator.darkinfection.init.DarkInfectionModEntities;
import net.mcreator.darkinfection.init.DarkInfectionModBlocks;
import net.mcreator.darkinfection.entity.VoidkingbossEntity;

import java.util.Map;

public class SummonVoidKingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boolean found = false;
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("dark_infection:the_void")));
			if (world != null) {
				if (DarkInfectionModVariables.WorldVariables.get(world).VoidKingSpawned == false) {
					if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).isEmpty()) {
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = DarkInfectionModBlocks.CHISSELDVOIDSTONEBRICKS.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new VoidkingbossEntity(DarkInfectionModEntities.VOIDKINGBOSS.get(), _level);
							entityToSpawn.moveTo(x, (y + 2), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
							entityToSpawn.setVisualOnly(false);
							_level.addFreshEntity(entityToSpawn);
						}
						if (!world.isClientSide()) {
							MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
							if (_mcserv != null)
								_mcserv.getPlayerList().broadcastMessage(new TextComponent("The Void King Has Spawned"), ChatType.SYSTEM,
										Util.NIL_UUID);
						}
						DarkInfectionModVariables.WorldVariables.get(world).VoidKingSpawned = true;
						DarkInfectionModVariables.WorldVariables.get(world).syncData(world);
					}
				} else if (DarkInfectionModVariables.WorldVariables.get(world).VoidKingSpawned == true) {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent("The Void King has already been found"), ChatType.SYSTEM,
									Util.NIL_UUID);
					}
				}
			}
			world = _worldorig;
		}
	}
}
