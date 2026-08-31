package net.msg.ultimate_storage.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.msg.ultimate_storage.common.block.ModBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.SCRAP_METAL_BLOCK.get());
        dropSelf(ModBlocks.SILICON_BLOCK.get());
        dropSelf(ModBlocks.GLASS_LENS_BLOCK.get());

        dropSelf(ModBlocks.FLINT_BLOCK.get());

        dropSelf(ModBlocks.STORAGE_COMPONENT.get());
        dropSelf(ModBlocks.STORAGE_UNIT.get());
        dropSelf(ModBlocks.STORAGE_CORE.get());
        dropSelf(ModBlocks.STORAGE_TERMINAL.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
