package net.msg.ultimate_storage.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.msg.ultimate_storage.UltimateStorage;
import net.msg.ultimate_storage.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UltimateStorage.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ULTIMATE_STORAGE_TAB =
            CREATIVE_MODE_TABS.register("ultimate_storage_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.EXAMPLE_BLOCK.get()))
                    .title(Component.translatable("creative_tab.ultimate_storage.ultimate_storage_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.EXAMPLE_ITEM.get());
                        output.accept(ModBlocks.EXAMPLE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
