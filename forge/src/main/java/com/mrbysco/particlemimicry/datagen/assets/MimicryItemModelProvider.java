package com.mrbysco.particlemimicry.datagen.assets;

import com.mrbysco.particlemimicry.Constants;
import com.mrbysco.particlemimicry.registration.MimicryRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class MimicryItemModelProvider extends ItemModelProvider {
	public MimicryItemModelProvider(PackOutput output, ExistingFileHelper helper) {
		super(output, Constants.MOD_ID, helper);
	}

	@Override
	protected void registerModels() {
		ResourceLocation location = MimicryRegistry.PARTICLE_EMITTER.getId();
		withExistingParent(location.getPath(), modLoc("block/particle_emitter"));
	}
}
