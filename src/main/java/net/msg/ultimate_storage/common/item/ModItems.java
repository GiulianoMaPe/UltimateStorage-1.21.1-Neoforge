package net.msg.ultimate_storage.common.item;

import net.minecraft.world.item.Item;
import net.msg.ultimate_storage.UltimateStorage;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UltimateStorage.MODID);
    public static LinkedHashSet<DeferredItem<Item>> ITEMS_LIST = new LinkedHashSet<>();


    public static final DeferredItem<Item> METAL_SCRAP = registerWithTab("metal_scrap");
    public static final DeferredItem<Item> SILICON = registerWithTab("silicon");
    public static final DeferredItem<Item> GLASS_LENS = registerWithTab("glass_lens");


    public static DeferredItem<Item> registerWithTab(final String name, final Supplier<Item> sup) {
        DeferredItem<Item> itemBlock = ITEMS.register(name, sup);
        ITEMS_LIST.add(itemBlock);
        return itemBlock;
    }

    public static DeferredItem<Item> registerWithTab(final String name) {
        DeferredItem<Item> itemBlock = ITEMS.registerSimpleItem(name);
        ITEMS_LIST.add(itemBlock);
        return itemBlock;
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
