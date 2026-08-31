package net.msg.ultimate_storage.common.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.msg.ultimate_storage.UltimateStorage;
import net.msg.ultimate_storage.common.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UltimateStorage.MODID);
    public static LinkedHashSet<DeferredItem<Item>> ITEMS_LIST = new LinkedHashSet<>();


    public static final DeferredItem<Item> SCRAP_METAL = registerWithTab("scrap_metal");
    public static final DeferredItem<Item> SILICON = registerWithTab("silicon");
    public static final DeferredItem<Item> GLASS_LENS = registerWithTab("glass_lens");

    public static final DeferredItem<Item> STORAGE_CHIP = registerWithTab("storage_chip");

    public static final DeferredItem<Item> SCRAP_METAL_BLOCK = registerWithTab("scrap_metal_block",
            () -> new BlockItem(ModBlocks.SCRAP_METAL_BLOCK.get(), new Item.Properties()));
    public static final DeferredItem<Item> SILICON_BLOCK = registerWithTab("silicon_block",
            () -> new BlockItem(ModBlocks.SILICON_BLOCK.get(), new Item.Properties()));
    public static final DeferredItem<Item> GLASS_LENS_BLOCK = registerWithTab("glass_lens_block",
            () -> new BlockItem(ModBlocks.GLASS_LENS_BLOCK.get(), new Item.Properties()));

    public static final DeferredItem<Item> FLINT_BLOCK = registerWithTab("flint_block",
            () -> new BlockItem(ModBlocks.FLINT_BLOCK.get(), new Item.Properties()));

    public static final DeferredItem<Item> STORAGE_COMPONENT = registerWithTab("storage_component",
            () -> new BlockItem(ModBlocks.STORAGE_COMPONENT.get(), new Item.Properties()));

    public static final DeferredItem<Item> STORAGE_UNIT = registerWithTab("storage_unit",
            () -> new BlockItem(ModBlocks.STORAGE_UNIT.get(), new Item.Properties()));

    public static final DeferredItem<Item> STORAGE_CORE = registerWithTab("storage_core",
            () -> new BlockItem(ModBlocks.STORAGE_CORE.get(), new Item.Properties()));

    public static final DeferredItem<Item> STORAGE_TERMINAL = registerWithTab("storage_terminal",
            () -> new BlockItem(ModBlocks.STORAGE_TERMINAL.get(), new Item.Properties()));



    public static DeferredItem<Item> registerWithTab(final String name, final Supplier<Item> sup) {
        DeferredItem<Item> itemBlock = ITEMS.register(name, sup);
        ITEMS_LIST.add(itemBlock);
        return itemBlock;
    }

    public static DeferredItem<Item> registerWithTab(final String name) {
        DeferredItem<Item> item = ITEMS.registerSimpleItem(name);
        ITEMS_LIST.add(item);
        return item;
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
