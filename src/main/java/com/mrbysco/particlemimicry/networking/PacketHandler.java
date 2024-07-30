package com.mrbysco.particlemimicry.networking;

import com.mrbysco.particlemimicry.ParticleMimicry;
import com.mrbysco.particlemimicry.networking.handler.ServerPayloadHandler;
import com.mrbysco.particlemimicry.networking.message.SetParticleDataPayload;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

public class PacketHandler {
	public static void setupPackets(final RegisterPayloadHandlersEvent event) {
		final PayloadRegistrar registrar = event.registrar(ParticleMimicry.MOD_ID);

		registrar.playToServer(SetParticleDataPayload.ID, SetParticleDataPayload.CODEC, ServerPayloadHandler.getInstance()::handleParticleData);
	}
}
