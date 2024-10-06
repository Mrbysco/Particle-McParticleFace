package com.mrbysco.particlemimicry.registration;

import com.mrbysco.particlemimicry.Constants;
import com.mrbysco.particlemimicry.blocks.ParticleEmitterBlock;
import com.mrbysco.particlemimicry.blocks.entity.ParticleEmitterBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.MapColor;

public class MimicryRegistry {

    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(BuiltInRegistries.BLOCK, Constants.MOD_ID);
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(BuiltInRegistries.ITEM, Constants.MOD_ID);
    public static final RegistrationProvider<BlockEntityType<?>> BLOCK_ENTITIES = RegistrationProvider.get(BuiltInRegistries.BLOCK_ENTITY_TYPE, Constants.MOD_ID);

    public static final RegistryObject<ParticleEmitterBlock> PARTICLE_EMITTER = BLOCKS.register("particle_emitter", () ->
            new ParticleEmitterBlock(Block.Properties.of().mapColor(MapColor.TERRACOTTA_BLUE).strength(0.8F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<BlockItem> PARTICLE_EMITTER_ITEM = ITEMS.register("particle_emitter", () -> new BlockItem(PARTICLE_EMITTER.get(), new Item.Properties()));

    public static final RegistryObject<BlockEntityType<ParticleEmitterBlockEntity>> PARTICLE_EMITTER_ENTITY = BLOCK_ENTITIES.register("particle_emitter", () ->
            BlockEntityType.Builder.of(ParticleEmitterBlockEntity::new, PARTICLE_EMITTER.get()).build(null));

    // Called in the mod initializer / constructor in order to make sure that items are registered
    public static void loadClass() {
    }
}
