package net.msg.ultimate_storage.datagen;


import net.minecraft.data.PackOutput;
import net.msg.ultimate_storage.UltimateStorage;
import net.msg.ultimate_storage.common.item.ModItems;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, UltimateStorage.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SCRAP_METAL.get());
        basicItem(ModItems.SILICON.get());
        basicItem(ModItems.GLASS_LENS.get());
    }
}
