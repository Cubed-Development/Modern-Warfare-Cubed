package com.paneedah.mwc.jei;

import com.paneedah.weaponlib.crafting.CraftingGroup;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IModIngredientRegistration;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCraftingRecipe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@JEIPlugin
public class MWCJEIPlugin implements IModPlugin {

    @Override
    public void registerCategories(IRecipeCategoryRegistration registry) {
        // You can register custom recipe categories here if needed
        // Example: registry.addRecipeCategories(new CustomRecipeCategory());
    }

    @Override
    public void register(IModRegistry registry) {
        // Register the recipes from CraftingRegistry
        List<IModernCraftingRecipe> allRecipes = new ArrayList<>();

        for (CraftingGroup group : CraftingGroup.values()) {
            allRecipes.addAll(CraftingRegistry.getCraftingListForGroup(group));
        }

        // Add each recipe as a wrapper
        for (IModernCraftingRecipe recipe : allRecipes) {
            registry.addRecipes((Collection<?>) new CraftingRecipeWrapper(recipe), VanillaRecipeCategoryUid.CRAFTING);
        }
    }

    @Override
    public void registerIngredients(IModIngredientRegistration registry) {
        // You can register custom ingredients here
        // Example: registry.registerIngredientType(CustomIngredient.class);
    }
}
