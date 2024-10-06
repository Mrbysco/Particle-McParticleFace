package com.mrbysco.particlemimicry.datagen.assets;

import com.mrbysco.particlemimicry.Constants;
import com.mrbysco.particlemimicry.registration.MimicryRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class MimicryLanguageProvider extends LanguageProvider {
	public MimicryLanguageProvider(PackOutput output) {
		super(output, Constants.MOD_ID, "en_us");
	}

	@Override
	protected void addTranslations() {
		addBlock(MimicryRegistry.PARTICLE_EMITTER, "Particle Emitter");

		add("particlemimicry.particle", "Particle Type");
		add("particlemimicry.setParticle", "Set Particle Type");
		add("particlemimicry.offset", "Delta");
		add("particlemimicry.specialParameters", "Special Parameters");
		add("particlemimicry.delta", "Delta");
		add("particlemimicry.speed", "Speed");
		add("particlemimicry.count", "Count");
		add("particlemimicry.interval", "Interval");

		add("particlemimicry.networking.set_particle_data.failed", "Failed to set Particle Emitter data %s");
	}
}
