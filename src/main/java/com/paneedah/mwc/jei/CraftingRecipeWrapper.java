package com.paneedah.mwc.jei;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;
import com.paneedah.weaponlib.crafting.IModernCraftingRecipe;
import com.paneedah.weaponlib.crafting.CraftingEntry;

import java.util.ArrayList;
import java.util.List;

public class CraftingRecipeWrapper implements IRecipeWrapper {

    private final IModernCraftingRecipe recipe;

    public CraftingRecipeWrapper(IModernCraftingRecipe recipe) {
        this.recipe = recipe;
    }

    /**
     * Populates JEI's ingredient list with inputs and outputs from the recipe.
     *
     * @param ingredients JEI's ingredient manager for inputs and outputs.
     */
    @Override
    public void getIngredients(IIngredients ingredients) {
        // Extract inputs from the recipe
        List<ItemStack> inputs = new ArrayList<>();
        for (CraftingEntry entry : recipe.getModernRecipe()) {
            for (ItemStack matchingStack : entry.getIngredient().getMatchingStacks()) {
                ItemStack stack = matchingStack.copy();
                stack.setCount(entry.getCount());
                inputs.add(stack);
            }
        }

        // Output is directly fetched from the recipe
        ItemStack output = recipe.getItemStack();

        // Populate JEI ingredients
        ingredients.setInputs(ItemStack.class, inputs);
        ingredients.setOutput(ItemStack.class, output);
    }

    /**
     * Optional method to draw additional information about the recipe.
     */
    @Override
    public void drawInfo(net.minecraft.client.Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY) {
        // This method can remain empty unless additional drawing is needed
    }

    /**
     * Optional method to handle tooltips for this recipe.
     *
     * @return A list of strings to be shown as tooltips.
     */
    @Override
    public List<String> getTooltipStrings(int mouseX, int mouseY) {
        return IRecipeWrapper.super.getTooltipStrings(mouseX, mouseY);
    }

    /**
     * Optional method to handle click events on the recipe.
     *
     * @return True if the click was handled, false otherwise.
     */
    @Override
    public boolean handleClick(net.minecraft.client.Minecraft minecraft, int mouseX, int mouseY, int mouseButton) {
        return false;
    }
}
