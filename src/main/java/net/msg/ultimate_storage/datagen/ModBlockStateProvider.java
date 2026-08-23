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
        /*
        simpleBlockWithItem(ModBlocks.ENDER_NACRE_BLOCK.get(), cubeAll(ModBlocks.ENDER_NACRE_BLOCK.get()));
         */
    }
}
