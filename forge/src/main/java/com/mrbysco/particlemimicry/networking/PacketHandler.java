package com.mrbysco.particlemimicry.networking;

import com.mrbysco.particlemimicry.Constants;
import com.mrbysco.particlemimicry.networking.handler.ServerPayloadHandler;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

public class PacketHandler {
	public static void setupPackets(final RegisterPayloadHandlersEvent event) {
		final PayloadRegistrar registrar = event.registrar(Constants.MOD_ID);

		registrar.playToServer(SetParticleDataPayload.ID, SetParticleDataPayload.CODEC,
				ServerPayloadHandler.getInstance()::handleParticleData);
	}
}
