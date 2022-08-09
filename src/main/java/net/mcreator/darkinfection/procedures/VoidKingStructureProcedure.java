package net.mcreator.darkinfection.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class VoidKingStructureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (DarkInfectionModVariables.WorldVariables.get(world).StructureGenerated == false) {
			if (world instanceof ServerLevel _origLevel) {
				LevelAccessor _worldorig = world;
				world = _origLevel.getServer()
						.getLevel(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("dark_infection:the_void")));
				if (world != null) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("dark_infection", "void_king_spawner"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0), 0),
									new BlockPos(0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0), 0),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("You feel a pull towards the middle of this... place."), (false));
					DarkInfectionModVariables.WorldVariables.get(world).StructureGenerated = true;
					DarkInfectionModVariables.WorldVariables.get(world).syncData(world);
				}
				world = _worldorig;
			}
		} else if (DarkInfectionModVariables.WorldVariables.get(world).StructureGenerated == true) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayBuild = (true);
				_player.onUpdateAbilities();
			}
		}
	}
}
