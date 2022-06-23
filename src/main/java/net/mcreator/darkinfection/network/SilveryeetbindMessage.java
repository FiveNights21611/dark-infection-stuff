
package net.mcreator.darkinfection.network;

import net.mcreator.darkinfection.DarkInfectionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SilveryeetbindMessage {

	int type, pressedms;

	public SilveryeetbindMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public SilveryeetbindMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(SilveryeetbindMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(SilveryeetbindMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if (type == 0) {

			SilveryeetProcedure.execute();
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DarkInfectionMod.addNetworkMessage(SilveryeetbindMessage.class, SilveryeetbindMessage::buffer, SilveryeetbindMessage::new,
				SilveryeetbindMessage::handler);
	}

}
