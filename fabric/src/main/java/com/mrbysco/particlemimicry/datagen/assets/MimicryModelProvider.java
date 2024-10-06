package com.mrbysco.particlemimicry.datagen.assets;

import com.mrbysco.particlemimicry.Constants;
import com.mrbysco.particlemimicry.registration.MimicryRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.resources.ResourceLocation;

public class MimicryModelProvider extends FabricModelProvider {

	public MimicryModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
		blockStateModelGenerator.family(MimicryRegistry.PARTICLE_EMITTER.get());
//		ResourceLocation location = MimicryRegistry.PARTICLE_EMITTER.getId();
//		ModelFile model = models().cubeAll(location.getPath(), modLoc("block/" + location.getPath()));
//		getVariantBuilder(MimicryRegistry.PARTICLE_EMITTER.get()).forAllStates(state -> ConfiguredModel.builder().modelFile(model).build());
	}

	@Override
	public void generateItemModels(ItemModelGenerators itemModelGenerator) {
//		itemModelGenerator

	}

	private ResourceLocation modLoc(String path) {
		return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, path);
	}
}
