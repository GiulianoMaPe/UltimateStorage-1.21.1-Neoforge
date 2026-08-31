package net.msg.ultimate_storage.common.block;

import net.minecraft.world.level.block.Block;
import net.msg.ultimate_storage.UltimateStorage;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(UltimateStorage.MODID);

    public static final DeferredBlock<Block> SCRAP_METAL_BLOCK = BLOCKS.registerSimpleBlock("scrap_metal_block");
    public static final DeferredBlock<Block> SILICON_BLOCK = BLOCKS.registerSimpleBlock("silicon_block");
    public static final DeferredBlock<Block> GLASS_LENS_BLOCK = BLOCKS.registerSimpleBlock("glass_lens_block");

    public static final DeferredBlock<Block> FLINT_BLOCK = BLOCKS.registerSimpleBlock("flint_block");

    public static final DeferredBlock<Block> STORAGE_COMPONENT = BLOCKS.registerSimpleBlock("storage_component");
    public static final DeferredBlock<Block> STORAGE_UNIT = BLOCKS.registerSimpleBlock("storage_unit");
    public static final DeferredBlock<Block> STORAGE_CORE = BLOCKS.registerSimpleBlock("storage_core");
    public static final DeferredBlock<Block> STORAGE_TERMINAL = BLOCKS.registerSimpleBlock("storage_terminal");
    // public static final DeferredBlock<Block> STORAGE_CONNECTOR = BLOCKS.registerSimpleBlock("storage_connector");


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
