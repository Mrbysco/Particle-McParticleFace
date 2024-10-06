package com.mrbysco.particlemimicry.platform;

import com.mrbysco.particlemimicry.platform.services.IPlatformHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;

public class FabricPlatformHelper implements IPlatformHelper {

	@Override
	public void sendPayloadToServer(CustomPacketPayload payload) {
		ClientPlayNetworking.send(payload);
	}
}
