package net.mcreator.darkinfection.procedures;

import net.minecraft.world.entity.Entity;

public class BoatGodBoatSummoningProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("BoatGod69") || (entity.getDisplayName().getString()).equals("Dev")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"/summon minecraft:boat ^0 ^1 ^5 {PersistenceRequired:1,CustomName:\"\\\"Gift from the BoatGod <3\\\"\",ActiveEffects:[{Id:1,Amplifier:1,Duration:999999,ShowParticles:0b},{Id:10,Amplifier:1,Duration:999999,ShowParticles:0b}]}");
			}
		}
	}
}
