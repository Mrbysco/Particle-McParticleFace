package com.mrbysco.particlemimicry.platform.services;

import net.minecraft.network.protocol.common.custom.CustomPacketPayload;

public interface IPlatformHelper {

    /**
     * Sends a custom packet payload to the server.
     *
     * @param payload The payload to send to the server.
     */
    void sendPayloadToServer(CustomPacketPayload payload);

}
