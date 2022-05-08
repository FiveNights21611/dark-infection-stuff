package net.mcreator.darkinfection.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.darkinfection.init.DarkInfectionModItems;

import java.util.Iterator;

public class CoverMeInQuartzLogicProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_HELMET.get()))
				: false)
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory()
								.contains(new ItemStack(DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_CHESTPLATE.get()))
						: false)
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_LEGGINGS.get()))
						: false)
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(DarkInfectionModItems.QUARTZ_ENRICHED_NETHERITE_ARMOR_BOOTS.get()))
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
