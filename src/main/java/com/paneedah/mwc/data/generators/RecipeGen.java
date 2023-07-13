package com.paneedah.mwc.data.generators;
import com.paneedah.mwc.ModernWarfareCubed;
import com.paneedah.mwc.client.ModRegistry;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class RecipeGen extends RecipeProvider implements IConditionBuilder {
    public RecipeGen(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, List.of(ModRegistry.RAW_ALUMINUM.get()), RecipeCategory.MISC,
                ModRegistry.ALUMINUM_INGOT.get(), 0.6f, 200, "aluminum");
        oreBlasting(consumer, List.of(ModRegistry.RAW_ALUMINUM.get()), RecipeCategory.MISC,
                ModRegistry.ALUMINUM_INGOT.get(), 0.6f, 150, "aluminum");
        oreSmelting(consumer, List.of(ModRegistry.RAW_LEAD.get()), RecipeCategory.MISC,
                ModRegistry.LEAD_INGOT.get(), 0.7f, 200, "lead");
        oreBlasting(consumer, List.of(ModRegistry.RAW_LEAD.get()), RecipeCategory.MISC,
                ModRegistry.LEAD_INGOT.get(), 0.7f, 150, "lead");
        oreSmelting(consumer, List.of(ModRegistry.RAW_TITANIUM.get()), RecipeCategory.MISC,
                ModRegistry.TITANIUM_INGOT.get(), 0.8f, 200, "titanium");
        oreBlasting(consumer, List.of(ModRegistry.RAW_TITANIUM.get()), RecipeCategory.MISC,
                ModRegistry.TITANIUM_INGOT.get(), 0.8f, 150, "titanium");
        oreSmelting(consumer, List.of(ModRegistry.RAW_TUNGSTEN.get()), RecipeCategory.MISC,
                ModRegistry.TUNGSTEN_INGOT.get(), 0.9f, 200, "tungsten");
        oreBlasting(consumer, List.of(ModRegistry.RAW_TUNGSTEN.get()), RecipeCategory.MISC,
                ModRegistry.TUNGSTEN_INGOT.get(), 0.9f, 150, "tungsten");
        oreSmelting(consumer, List.of(ModRegistry.SULFUR.get()), RecipeCategory.MISC,
                Items.GUNPOWDER, 1.0f, 110, "sulfur");
        oreBlasting(consumer, List.of(ModRegistry.SULFUR.get()), RecipeCategory.MISC,
                Items.GUNPOWDER, 1.0f, 40, "sulfur");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GUNPOWDER, 2)
                .requires(ModRegistry.SULFUR.get())
                .requires(ModRegistry.SALT_PETER.get())
                .requires(ModRegistry.SALT_PETER.get())
                .requires(Items.CHARCOAL)
                .unlockedBy("has_sulfur", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModRegistry.SULFUR.get()).build()))
                .unlockedBy("has_salt_peter", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModRegistry.SALT_PETER.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModRegistry.STIMPAK.get())
                .define('F', ModRegistry.EMPTY_SYRINGE.get())
                .define('K', Items.NETHER_WART)
                .pattern(" K ")
                .pattern("KFK")
                .pattern(" K ")
                .unlockedBy("has_empty_syringe", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModRegistry.EMPTY_SYRINGE.get()).build()))
                .save(consumer);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> consumer, List<ItemLike> input, RecipeCategory recipeCategory, ItemLike output, float experience, int time, String category) {
        oreCooking(consumer, RecipeSerializer.SMELTING_RECIPE, input, recipeCategory, output, experience, time, category, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> consumer, List<ItemLike> input, RecipeCategory recipeCategory, ItemLike output, float experience, int time, String category) {
        oreCooking(consumer, RecipeSerializer.BLASTING_RECIPE, input, recipeCategory, output, experience, time, category, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> p_250791_, RecipeSerializer<? extends AbstractCookingRecipe> p_251817_, List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_, float p_251871_, int p_251316_, String p_251450_, String p_249236_) {
        for(ItemLike itemlike : p_249619_) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), p_251154_, p_250066_, p_251871_, p_251316_, p_251817_).group(p_251450_)
                    .unlockedBy(getHasName(itemlike), has(itemlike)).save(p_250791_, new ResourceLocation(ModernWarfareCubed.MOD_ID, getItemName(p_250066_)) + p_249236_ + "_" + getItemName(itemlike));
        }
    }
}
