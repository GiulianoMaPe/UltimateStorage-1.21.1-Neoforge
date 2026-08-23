package net.msg.ultimate_storage.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.msg.ultimate_storage.UltimateStorage;
import net.msg.ultimate_storage.common.item.ModItems;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    String modId(String recipeId) {
        return UltimateStorage.MODID +":"+ recipeId;
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        /*
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WORMHOLE_ARTIFACT, 1)
                .pattern("CCC")
                .pattern("NPN")
                .pattern("CCC")
                .define('C', Blocks.COPPER_BLOCK)
                .define('P', Items.ENDER_PEARL)
                .define('N', ModItems.ENDER_NACRE)
                .unlockedBy("has_ender_nacre", has(ModItems.ENDER_NACRE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDER_NACRE, 4)
                .requires(Items.ENDER_PEARL, 1)
                .unlockedBy("has_ender_pearl", has(Items.ENDER_PEARL))
                .save(recipeOutput);
         */

    }
}
