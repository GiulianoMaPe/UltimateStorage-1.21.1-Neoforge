package net.msg.ultimate_storage.common.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.msg.ultimate_storage.UltimateStorage;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UltimateStorage.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ULTIMATE_STORAGE_TAB =
            CREATIVE_MODE_TABS.register("ultimate_storage_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("ultimate_storage.ultimate_storage_tab"))
                    .icon(() -> ModItems.SCRAP_METAL.get().getDefaultInstance())
                    .displayItems((parameters, output) -> ModItems.ITEMS_LIST.forEach(output::accept))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
