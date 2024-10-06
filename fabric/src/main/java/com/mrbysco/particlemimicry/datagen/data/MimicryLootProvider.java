package com.mrbysco.particlemimicry.datagen.data;

import com.mrbysco.particlemimicry.registration.MimicryRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MimicryLootProvider extends FabricBlockLootTableProvider {
	public MimicryLootProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
		super(output, lookupProvider);
	}

	@Override
	public void generate() {
		dropSelf(MimicryRegistry.PARTICLE_EMITTER.get());
	}
}
