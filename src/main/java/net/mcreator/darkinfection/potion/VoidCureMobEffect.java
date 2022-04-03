
package net.mcreator.darkinfection.potion;

public class VoidCureMobEffect extends MobEffect {

	public VoidCureMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
		setRegistryName("void_cure");
	}

	@Override
	public String getDescriptionId() {
		return "effect.dark_infection.void_cure";
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		VoidCureEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
