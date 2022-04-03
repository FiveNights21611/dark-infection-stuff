package net.mcreator.darkinfection.procedures;

import net.minecraftforge.eventbus.api.Event;

public class CoverMeInQuartzLogicProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_HELMET))
				: false)
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_CHESTPLATE))
						: false)
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_LEGGINGS))
						: false)
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_BOOTS))
						: false)) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("dark_infection:cover_me_in_quartz"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
	}
}
