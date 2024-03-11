package com.paneedah.mwc.groovyscript.script;

import com.cleanroommc.groovyscript.api.GroovyLog;
import com.cleanroommc.groovyscript.api.IIngredient;
import com.cleanroommc.groovyscript.helper.ingredient.OreDictIngredient;
import com.cleanroommc.groovyscript.helper.recipe.AbstractRecipeBuilder;
import com.cleanroommc.groovyscript.registry.VirtualizedRegistry;
import com.paneedah.mwc.groovyscript.recipes.GSCrafting;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCraftingRecipe;

import java.util.ArrayList;

import static com.paneedah.mwc.groovyscript.MWCGroovyPlugin.craftingStation;
import static com.paneedah.weaponlib.crafting.CraftingGroup.*;
import static com.paneedah.weaponlib.crafting.CraftingRegistry.*;

public class CraftingStation extends VirtualizedRegistry<IModernCraftingRecipe> {

    @Override
    public void onReload() {
        this.removeScripted().forEach(CraftingRegistry::deleteRecipeRegistry);
        this.restoreFromBackup().forEach(CraftingRegistry::registerRecipe);
    }

    /**
     * Remove ALL recipes. no matter the category.
     */
    public void removeAll() {
        for (ArrayList<IModernCraftingRecipe> list : craftingMap.values()) {
            for (IModernCraftingRecipe recipe : list) {
                deleteRecipeRegistry(recipe);
                this.addBackup(recipe);
            }
        }
    }

    /**
     * Remove Recipe that outputs given Ingredient.
     *
     * @param ingredient Target Ingredient. any recipe with matching output will be removed.
     */
    public void remove(IIngredient ingredient) {
        for (ArrayList<IModernCraftingRecipe> list : craftingMap.values()) {
            for (IModernCraftingRecipe recipe : list) {
                if (ingredient.test(recipe.getItemStack())) {
                    deleteRecipeRegistry(recipe);
                    this.addBackup(recipe);
                }
            }
        }
    }

    /**
     * Remove ALL recipes of Given Category.
     *
     * @param group CraftingGroup to remove all recipes inside. valid values = "GUN", "ATTACHMENT_NORMAL", "ATTACHMENT_MODIFICATION", "BULLET", "MAGAZINE"
     */
    public void removeAllinGroup(String group) {
        clearGroup(CraftingGroup.valueOf(group));
    }

    public void removeInGroup(IIngredient ingredient, CraftingGroup group) {
        for (IModernCraftingRecipe recipe : craftingMap.get(group)) {
            if (ingredient.test(recipe.getItemStack())) {
                deleteRecipeRegistry(recipe);
                this.addBackup(recipe);
            }
        }
    }

    public void removeInGroup(IIngredient ingredient, String group) {
        removeInGroup(ingredient, CraftingGroup.valueOf(group));
    }

    public void addRecipe(IModernCraftingRecipe crafting) {
        registerRecipe(crafting);
        this.addScripted(crafting);
    }

    /**
     * Start Recipe Builder for GroovyScript.
     */
    public RecipeBuilder recipeBuilder() {
        return new RecipeBuilder();
    }

    public static class RecipeBuilder extends AbstractRecipeBuilder<GSCrafting> {

        @Override
        public String getErrorMsg() {
            return "Error adding " + ModReference.NAME + " Workbench Recipe: " + name;
        }

        @Override
        public void validate(GroovyLog.Msg msg) {
            // max input == container size of crafting station.
            this.validateItems(msg, 1, 27,1,1);
        }

        private final ArrayList<Double> yields = new ArrayList<>();
        private double yield = 1.0;

        private CraftingGroup group = GUN;

        /**
         * Add Ingredient of recipe With ItemStack
         *
         * @param ingredient crafting ingredient
         * @return AbstractRecipeBuilder
         */
        @Override
        public AbstractRecipeBuilder<GSCrafting> input(IIngredient ingredient) {
            this.yields.add(this.yield);
            return super.input(ingredient);
        }

        /**
         * Set return Yield of upcoming Ingredient.
         *
         * @param yield return Yield of upcoming ingredients
         * @return this RecipeBuilder
         */
        public RecipeBuilder setYield(double yield) {
            this.yield = yield;
            return this;
        }

        /**
         * Set Category of Recipe
         *
         * @param group name of the Group. valid values = "GUN", "ATTACHMENT_NORMAL", "ATTACHMENT_MODIFICATION", "BULLET", "MAGAZINE"
         * @return this RecipeBuilder
         */
        public RecipeBuilder setGroup(String group) {
            this.group = CraftingGroup.valueOf(group);
            return this;
        }

        /**
         * Finalize the recipe and register it
         *
         * @return Finished Recipe
         */
        @Override
        public GSCrafting register() {
            if (!this.validate())
                return null;

            final ArrayList<CraftingEntry> entries = new ArrayList<>();

            for (int i = 0; i < this.input.size(); i++) {
                final IIngredient ingredient = this.input.get(i);
                if (ingredient instanceof OreDictIngredient) {
                    final OreDictIngredient dict = (OreDictIngredient) ingredient;
                    entries.add(new CraftingEntry(dict.getFirst().getItem(), dict.getOreDict(), dict.getAmount(), this.yields.get(i)));
                } else {
                    entries.add(new CraftingEntry(ingredient.getMatchingStacks()[0].getItem(), ingredient.getAmount(), this.yields.get(i)));
                }
            }

            final GSCrafting recipe = new GSCrafting(this.output.get(0), this.group, entries.toArray(new CraftingEntry[0]));
            craftingStation.addRecipe(recipe);
            return recipe;
        }
    }
}
