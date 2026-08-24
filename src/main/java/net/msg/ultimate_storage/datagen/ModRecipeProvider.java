package net.msg.ultimate_storage.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.msg.ultimate_storage.UltimateStorage;
import net.msg.ultimate_storage.common.item.ModItems;
import net.msg.ultimate_storage.common.util.ModTags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.common.crafting.CompoundIngredient;
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLASS_LENS, 1)
                .pattern(" G ")
                .pattern("G G")
                .pattern(" G ")
                .define('G', Blocks.GLASS)
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .save(recipeOutput);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.FLINT), RecipeCategory.MISC, ModItems.SILICON, 0.1f, 200)
                .unlockedBy("has_flint", has(Items.FLINT))
                .save(recipeOutput);

        nineBlockStorageRecipes(
                recipeOutput,
                RecipeCategory.MISC,
                ModItems.SCRAP_METAL.get(),
                RecipeCategory.BUILDING_BLOCKS,
                ModItems.SCRAP_METAL_BLOCK.get()
        );

        nineBlockStorageRecipes(
                recipeOutput,
                RecipeCategory.MISC,
                ModItems.SILICON.get(),
                RecipeCategory.BUILDING_BLOCKS,
                ModItems.SILICON_BLOCK.get()
        );

        nineBlockStorageRecipes(
                recipeOutput,
                RecipeCategory.MISC,
                ModItems.GLASS_LENS.get(),
                RecipeCategory.BUILDING_BLOCKS,
                ModItems.GLASS_LENS_BLOCK.get()
        );

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.FLINT_BLOCK, 1)
                .pattern("FF")
                .pattern("FF")
                .define('F', Items.FLINT)
                .unlockedBy("has_flint", has(Items.FLINT))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Items.FLINT, 4)
                .requires(ModItems.FLINT_BLOCK, 1)
                .unlockedBy("has_flint", has(Items.FLINT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STORAGE_UNIT, 1)
                .pattern("MMM")
                .pattern("MCM")
                .pattern("MMM")
                .define('M', ModItems.SCRAP_METAL)
                .define('C', CompoundIngredient.of(
                        Ingredient.of(ModTags.Items.COMMON_CHESTS),
                        Ingredient.of(ModTags.Items.COMMON_BARRELS)
                ))
                .unlockedBy("has_scrap_metal", has(ModItems.SCRAP_METAL))
                .save(recipeOutput);

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
