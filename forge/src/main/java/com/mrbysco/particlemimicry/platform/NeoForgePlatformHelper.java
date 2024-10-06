package com.mrbysco.particlemimicry.platform;

import com.mrbysco.particlemimicry.platform.services.IPlatformHelper;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.neoforged.neoforge.network.PacketDistributor;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public void sendPayloadToServer(CustomPacketPayload payload) {
        PacketDistributor.sendToServer(payload);
    }
}
