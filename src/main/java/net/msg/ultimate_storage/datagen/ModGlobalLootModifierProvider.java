package net.msg.ultimate_storage.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithEnchantedBonusCondition;
import net.msg.ultimate_storage.UltimateStorage;
import net.msg.ultimate_storage.common.item.ModItems;
import net.msg.ultimate_storage.common.loot.custom.AddItemModifier;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, UltimateStorage.MODID);
    }

    @Override
    protected void start() {
        this.add("scrap_metal_from_clay",
                new AddItemModifier(new LootItemCondition[] {
                        LootItemBlockStatePropertyCondition
                                .hasBlockStateProperties(Blocks.CLAY)
                                .build(),
                        LootItemRandomChanceWithEnchantedBonusCondition
                                .randomChanceAndLootingBoost(this.registries, 0.75f, 0.25f)
                                .build()
                }, ModItems.SCRAP_METAL.get()));
    }
}
