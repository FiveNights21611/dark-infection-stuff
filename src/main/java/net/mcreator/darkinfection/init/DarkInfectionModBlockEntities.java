
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.darkinfection.block.entity.VoidStoneBrickWallsBlockEntity;
import net.mcreator.darkinfection.DarkInfectionMod;

public class DarkInfectionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			DarkInfectionMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> VOID_STONE_BRICK_WALLS = register("void_stone_brick_walls",
			DarkInfectionModBlocks.VOID_STONE_BRICK_WALLS, VoidStoneBrickWallsBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
