package net.msg.ultimate_storage.datagen;

import net.minecraft.data.PackOutput;
import net.msg.ultimate_storage.UltimateStorage;
import net.msg.ultimate_storage.common.block.ModBlocks;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, UltimateStorage.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.SCRAP_METAL_BLOCK.get(), cubeAll(ModBlocks.SCRAP_METAL_BLOCK.get()));
        simpleBlockWithItem(ModBlocks.SILICON_BLOCK.get(), cubeAll(ModBlocks.SILICON_BLOCK.get()));
        simpleBlockWithItem(ModBlocks.GLASS_LENS_BLOCK.get(), cubeAll(ModBlocks.GLASS_LENS_BLOCK.get()));

        simpleBlockWithItem(ModBlocks.FLINT_BLOCK.get(), cubeAll(ModBlocks.FLINT_BLOCK.get()));

        simpleBlockWithItem(ModBlocks.STORAGE_UNIT.get(), cubeAll(ModBlocks.STORAGE_UNIT.get()));
    }
}
