package com.paneedah.mwc.groovyscript.script;

import com.cleanroommc.groovyscript.api.GroovyLog;
import com.cleanroommc.groovyscript.api.IIngredient;
import com.cleanroommc.groovyscript.helper.ingredient.ItemsIngredient;
import com.cleanroommc.groovyscript.helper.ingredient.OreDictIngredient;
import com.cleanroommc.groovyscript.helper.recipe.AbstractRecipeBuilder;
import com.cleanroommc.groovyscript.registry.VirtualizedRegistry;
import com.paneedah.mwc.groovyscript.MWCGroovyContainer;
import com.paneedah.mwc.groovyscript.recipes.GSCrafting;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCrafting;

import java.util.ArrayList;

import static com.paneedah.weaponlib.crafting.CraftingGroup.*;
import static com.paneedah.weaponlib.crafting.CraftingRegistry.*;

public class CraftingStation extends VirtualizedRegistry<IModernCrafting> {

    @Override
    public void onReload() {
        this.removeScripted().forEach(CraftingRegistry::deleteRecipeRegistry);
        this.restoreFromBackup().forEach(CraftingRegistry::registerRecipe);
    }

    /**
     * Remove ALL recipes. no matter the category.
     */
    public void removeAll() {
        for (ArrayList<IModernCrafting> list : craftingMap.values()) {
            for (IModernCrafting recipe : list) {
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
        for (ArrayList<IModernCrafting> list : craftingMap.values()) {
            for (IModernCrafting recipe : list) {
                if (ingredient.test(recipe.getItem())) {
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

    public void removeinGroup(IIngredient ingredient, CraftingGroup group) {
        for (IModernCrafting recipe : craftingMap.get(group)) {
            if (ingredient.test(recipe.getItem())) {
                deleteRecipeRegistry(recipe);
                this.addBackup(recipe);
            }
        }
    }

    public void removeinGroup(IIngredient ingredient, String group) {
        removeinGroup(ingredient, CraftingGroup.valueOf(group));
    }

    public void addRecipe(IModernCrafting crafting) {
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
            return "Error adding Modern Warefare Cubed Workbench Recipe: "+this.name;
        }

        @Override
        public void validate(GroovyLog.Msg msg) {

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
         * @param group: name of the Group. valid values = "GUN", "ATTACHMENT_NORMAL", "ATTACHMENT_MODIFICATION", "BULLET", "MAGAZINE"
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

            ArrayList<CraftingEntry> entries = new ArrayList<>();

            int i = 0;

            for (IIngredient ingredient : this.input) {
                i++;
                if (ingredient instanceof OreDictIngredient) {
                    OreDictIngredient dict = (OreDictIngredient) ingredient;
                    entries.add(new CraftingEntry(dict.getFirst().getItem(), dict.getOreDict(), dict.getAmount(), this.yields.get(i)));
                } else if (ingredient instanceof ItemsIngredient) {
                    ItemsIngredient item = (ItemsIngredient) ingredient;
                    entries.add(new CraftingEntry(item.getMatchingStacks()[0].getItem(), item.getAmount(), this.yields.get(i)));
                }
            }
            GSCrafting recipe = new GSCrafting(this.output.get(0), this.group, entries.toArray(new CraftingEntry[0]));
            MWCGroovyContainer.MWC.get().craftingStation.addRecipe(recipe);
            return recipe;
        }
    }
}
