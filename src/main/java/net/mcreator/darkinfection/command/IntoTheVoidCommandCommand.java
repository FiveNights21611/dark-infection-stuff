
package net.mcreator.darkinfection.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.Commands;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.darkinfection.procedures.SpawnIntoTheVoidProcedure;

import java.util.HashMap;
import java.util.Arrays;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

@Mod.EventBusSubscriber
public class IntoTheVoidCommandCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(Commands.literal("intothevoid").requires(s -> s.hasPermission(4))
						.then(Commands.argument("arguments", StringArgumentType.greedyString()).executes(IntoTheVoidCommandCommand::execute))
						.executes(IntoTheVoidCommandCommand::execute));
	}

	private static int execute(CommandContext<CommandSourceStack> ctx) {
		ServerLevel world = ctx.getSource().getLevel();
		double x = ctx.getSource().getPosition().x();
		double y = ctx.getSource().getPosition().y();
		double z = ctx.getSource().getPosition().z();
		Entity entity = ctx.getSource().getEntity();
		if (entity == null)
			entity = FakePlayerFactory.getMinecraft(world);
		HashMap<String, String> cmdparams = new HashMap<>();
		int[] index = {-1};
		Arrays.stream(ctx.getInput().split("\\s+")).forEach(param -> {
			if (index[0] >= 0)
				cmdparams.put(Integer.toString(index[0]), param);
			index[0]++;
		});

		SpawnIntoTheVoidProcedure.execute(world, entity);
		return 0;
	}
}
