package net.mcreator.darkinfection.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import java.util.Random;

public class SpawnIntoTheVoidProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double PickOne = 0;
		double randomX = 0;
		double randomZ = 0;
		if ((entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("dark_infection:the_void_advancement")))
						.isDone()
				: false) == true) {
			if ((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("dark_infection:the_void")))) {
				if (world instanceof ServerLevel _origLevel) {
					LevelAccessor _worldorig = world;
					world = _origLevel.getServer()
							.getLevel(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("dark_infection:the_void")));
					if (world != null) {
						randomX = Mth.nextInt(new Random(), -1000, 1000);
						randomZ = Mth.nextInt(new Random(), -1000, 1000);
						{
							Entity _ent = entity;
							_ent.teleportTo(randomX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) randomX, (int) randomZ)),
									randomZ);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(randomX,
										(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) randomX, (int) randomZ)), randomZ,
										_ent.getYRot(), _ent.getXRot());
						}
					}
					world = _worldorig;
				}
			}
		}
	}
}
