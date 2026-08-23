package net.msg.ultimate_storage.datagen;


import net.minecraft.data.PackOutput;
import net.msg.ultimate_storage.UltimateStorage;
import net.msg.ultimate_storage.common.block.ModBlocks;
import net.msg.ultimate_storage.common.item.ModItems;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, UltimateStorage.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        addItem(ModItems.SCRAP_METAL, "Scrap Metal");
        addItem(ModItems.SILICON, "Silicon");
        addItem(ModItems.GLASS_LENS, "Glass Lens");


        addBlock(ModBlocks.SCRAP_METAL_BLOCK, "Block of Scrap Metal");
        addBlock(ModBlocks.SILICON_BLOCK, "Block of Silicon");
        addBlock(ModBlocks.GLASS_LENS_BLOCK, "Block of Glass Lens");

        addBlock(ModBlocks.FLINT_BLOCK, "Block of Flint");

        addBlock(ModBlocks.STORAGE_UNIT, "Storage Unit");

        add("ultimate_storage.ultimate_storage_tab", "Ultimate Storage");
    }
}
