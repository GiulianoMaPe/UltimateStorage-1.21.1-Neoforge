package net.msg.ultimate_storage.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.msg.ultimate_storage.UltimateStorage;
import net.msg.ultimate_storage.common.item.ModItems;
import net.msg.ultimate_storage.common.util.ModTags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, UltimateStorage.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        /*
        tag(ModTags.Items.WORMHOLE_DEVICES)
                .add(ModItems.WORMHOLE_ARTIFACT.get())
                .add(ModItems.WORMHOLE_REMOTE.get());
         */
    }
}
