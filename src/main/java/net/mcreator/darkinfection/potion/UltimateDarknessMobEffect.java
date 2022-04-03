
package net.mcreator.darkinfection.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.darkinfection.procedures.WhenUDAppliedProcedure;
import net.mcreator.darkinfection.procedures.UDExpireProcedure;

public class UltimateDarknessMobEffect extends MobEffect {
	public UltimateDarknessMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777216);
		setRegistryName("ultimate_darkness");
	}

	@Override
	public String getDescriptionId() {
		return "effect.dark_infection.ultimate_darkness";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		WhenUDAppliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		UDExpireProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
