
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.darkinfection.entity.VoidkingbossEntity;
import net.mcreator.darkinfection.entity.DarkOrbEntity;
import net.mcreator.darkinfection.DarkInfectionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DarkInfectionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, DarkInfectionMod.MODID);
	public static final RegistryObject<EntityType<VoidkingbossEntity>> VOIDKINGBOSS = register("voidkingboss",
			EntityType.Builder.<VoidkingbossEntity>of(VoidkingbossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(VoidkingbossEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DarkOrbEntity>> DARK_ORB = register("projectile_dark_orb",
			EntityType.Builder.<DarkOrbEntity>of(DarkOrbEntity::new, MobCategory.MISC).setCustomClientFactory(DarkOrbEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			VoidkingbossEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(VOIDKINGBOSS.get(), VoidkingbossEntity.createAttributes().build());
	}
}
