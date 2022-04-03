
package net.mcreator.darkinfection.potion;

public class GivevoidcureMobEffect extends MobEffect {

	public GivevoidcureMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
		setRegistryName("givevoidcure");
	}

	@Override
	public String getDescriptionId() {
		return "effect.dark_infection.givevoidcure";
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GivevoidcureEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
