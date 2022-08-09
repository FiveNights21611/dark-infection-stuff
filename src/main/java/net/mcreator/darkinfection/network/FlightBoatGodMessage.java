
package net.mcreator.darkinfection.network;

import net.mcreator.darkinfection.DarkInfectionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FlightBoatGodMessage {

	int type, pressedms;

	public FlightBoatGodMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public FlightBoatGodMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(FlightBoatGodMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(FlightBoatGodMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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

		if (type == 1) {

			BoatGodFlyProcedure.execute();
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DarkInfectionMod.addNetworkMessage(FlightBoatGodMessage.class, FlightBoatGodMessage::buffer, FlightBoatGodMessage::new,
				FlightBoatGodMessage::handler);
	}

}
