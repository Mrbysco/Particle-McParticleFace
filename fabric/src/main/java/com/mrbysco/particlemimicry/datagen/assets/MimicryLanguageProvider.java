package com.mrbysco.particlemimicry.datagen.assets;

import com.mrbysco.particlemimicry.registration.MimicryRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MimicryLanguageProvider extends FabricLanguageProvider {
	public MimicryLanguageProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
		super(output, registryLookup);
	}

	@Override
	public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
		translationBuilder.add(MimicryRegistry.PARTICLE_EMITTER.get(), "Particle Emitter");

		translationBuilder.add("particlemimicry.particle", "Particle Type");
		translationBuilder.add("particlemimicry.setParticle", "Set Particle Type");
		translationBuilder.add("particlemimicry.offset", "Delta");
		translationBuilder.add("particlemimicry.specialParameters", "Special Parameters");
		translationBuilder.add("particlemimicry.delta", "Delta");
		translationBuilder.add("particlemimicry.speed", "Speed");
		translationBuilder.add("particlemimicry.count", "Count");
		translationBuilder.add("particlemimicry.interval", "Interval");

		translationBuilder.add("particlemimicry.networking.set_particle_data.failed", "Failed to set Particle Emitter data %s");
	}
}
