
package net.mcreator.darkinfection.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.darkinfection.procedures.DarknessEffectExpiresProcedure;

public class DarknessMobEffect extends MobEffect {
	public DarknessMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777216);
		setRegistryName("darkness");
	}

	@Override
	public String getDescriptionId() {
		return "effect.dark_infection.darkness";
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DarknessEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
