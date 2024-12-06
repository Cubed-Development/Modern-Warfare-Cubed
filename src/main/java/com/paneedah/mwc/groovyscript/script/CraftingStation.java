package com.paneedah.mwc.groovyscript.script;

import com.cleanroommc.groovyscript.api.GroovyLog;
import com.cleanroommc.groovyscript.api.IIngredient;
import com.cleanroommc.groovyscript.api.documentation.annotations.*;
import com.cleanroommc.groovyscript.helper.Alias;
import com.cleanroommc.groovyscript.helper.recipe.AbstractRecipeBuilder;
import com.cleanroommc.groovyscript.registry.VirtualizedRegistry;
import com.paneedah.mwc.ProjectConstants;
import com.paneedah.mwc.groovyscript.recipes.GSCraftingRecipe;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.ICraftingRecipe;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static com.paneedah.mwc.ProjectConstants.NAME;
import static com.paneedah.mwc.groovyscript.MWCGroovyPlugin.CRAFTING_STATION;
import static com.paneedah.weaponlib.crafting.CraftingGroup.*;
import static com.paneedah.weaponlib.crafting.CraftingRegistry.craftingMap;
import static com.paneedah.weaponlib.crafting.CraftingRegistry.deleteRecipeRegistry;
import static com.paneedah.weaponlib.crafting.CraftingRegistry.registerRecipe;

/**
 * @author yor42
 * @version 2024-12-04
 * @since 0.1
 */
@SuppressWarnings("unused")
@RegistryDescription(linkGenerator = ProjectConstants.ID)
public final class CraftingStation extends VirtualizedRegistry<ICraftingRecipe> {

    @Override
    public void onReload() {
        removeScripted().forEach(CraftingRegistry::deleteRecipeRegistry);
        restoreFromBackup().forEach(CraftingRegistry::registerRecipe);
    }

    @Override
    public List<String> getAliases() {
        return Alias.generateOfClassAnd(CraftingStation.class, "AmmoPress");
    }

    /**
     * Remove ALL recipes. no matter the category.
     */
    @MethodDescription(priority = 4000)
    public void removeAll() {
        for (CraftingGroup list : craftingMap.keySet())
            removeInGroupWithFilter(e -> true, list);
    }

    /**
     * Remove Recipe that outputs given Ingredient.
     *
     * @param ingredient Target Ingredient. any recipe with matching output will be removed.
     */
    @MethodDescription(example = @Example("ore('oreDiamond')"), priority = 2000)
    public void removeByOutput(IIngredient ingredient) {
        for (CraftingGroup list : craftingMap.keySet())
            removeInGroupWithFilter(ingredient, list);
    }

    /**
     * Remove ALL recipes of Given Category.
     *
     * @param group CraftingGroup to remove all recipes inside. valid values = "GUN", "ATTACHMENT_NORMAL", "ATTACHMENT_MODIFICATION", "BULLET", "MAGAZINE"
     */
    @MethodDescription(priority = 3000)
    public void removeByGroup(CraftingGroup group) {
        removeInGroupWithFilter((s) -> true, group);
    }

    /**
     * Remove ALL recipes of Given Category.
     *
     * @param group CraftingGroup to remove all recipes inside. valid values = "GUN", "ATTACHMENT_NORMAL", "ATTACHMENT_MODIFICATION", "BULLET", "MAGAZINE"
     */
    @MethodDescription(priority = 3000)
    public void removeByGroup(String group) {
        removeInGroupWithFilter((s) -> true, CraftingGroup.valueOf(group));
    }

    /**
     * Remove ALL recipes of Gun Category.
     */
    @MethodDescription()
    public void removeAllGun() {
        removeByGroup(GUN);
    }

    /**
     * Remove ALL recipes of Normal Attachment Category.
     */
    @MethodDescription()
    public void removeAllNormalAttachment() {
        removeByGroup(ATTACHMENT_NORMAL);
    }

    /**
     * Remove ALL recipes of Modification Attachment Category.
     */
    @MethodDescription()
    public void removeAllModificationAttachment() {
        removeByGroup(ATTACHMENT_MODIFICATION);
    }

    /**
     * Remove ALL recipes of Bullet Category.
     */
    @MethodDescription()
    public void removeAllBullet() {
        removeByGroup(BULLET);
    }

    /**
     * Remove ALL recipes of Magazine Category.
     */
    @MethodDescription()
    public void removeAllMagazine() {
        removeByGroup(MAGAZINE);
    }

    /**
     * Remove ALL recipes of Grenade Category.
     */
    @MethodDescription()
    public void removeAllGrenade() {
        removeByGroup(GRENADE);
    }

    /**
     * Remove recipe that outputs matching item of given `ingredient` from given category.
     *
     * @param ingredient Output item of the recipe. recipe with matching output will be removed.
     * @param group CraftingGroup to remove matching recipes inside. valid values = "GUN", "ATTACHMENT_NORMAL", "ATTACHMENT_MODIFICATION", "BULLET", "MAGAZINE"
     */
    @MethodDescription(priority = 2000)
    public void removeInGroupByOutput(IIngredient ingredient, CraftingGroup group) {
        removeInGroupWithFilter(ingredient, group);
    }

    /**
     * Remove recipe that outputs matching item of given `ingredient` from given category.
     *
     * @param ingredient Output item of the recipe. recipe with matching output will be removed.
     * @param group CraftingGroup to remove matching recipes inside. valid values = "GUN", "ATTACHMENT_NORMAL", "ATTACHMENT_MODIFICATION", "BULLET", "MAGAZINE"
     */
    @MethodDescription(priority = 2000)
    public void removeInGroupByOutput(IIngredient ingredient, String group) {
        removeInGroupByOutput(ingredient, CraftingGroup.valueOf(group));
    }

    /**
     * Removes recipe that outputs matching item of given `ingredient` from gun category.
     *
     * @param ingredient Output item of the recipe. recipe with matching output will be removed.
     */
    @MethodDescription(example = @Example("ore('oreDiamond')"), priority = 1500)
    public void removeGunByOutput(IIngredient ingredient) {
        removeInGroupByOutput(ingredient, GUN);
    }

    /**
     * Removes recipe that outputs matching item of given `ingredient` from normal attachment category.
     *
     * @param ingredient Output item of the recipe. recipe with matching output will be removed.
     */
    @MethodDescription(example = @Example("ore('oreDiamond')"), priority = 1500)
    public void removeNormalAttachmentByOutput(IIngredient ingredient) {
        removeInGroupByOutput(ingredient, ATTACHMENT_NORMAL);
    }

    /**
     * Removes recipe that outputs matching item of given `ingredient` from modification attachment category.
     *
     * @param ingredient Output item of the recipe. recipe with matching output will be removed.
     */
    @MethodDescription(example = @Example("ore('oreDiamond')"), priority = 1500)
    public void removeModificationAttachmentByOutput(IIngredient ingredient) {
        removeInGroupByOutput(ingredient, ATTACHMENT_MODIFICATION);
    }

    /**
     * Removes recipe that outputs matching item of given `ingredient` from bullet category.
     *
     * @param ingredient Output item of the recipe. recipe with matching output will be removed.
     */
    @MethodDescription(example = @Example("ore('oreDiamond')"), priority = 1500)
    public void removeBulletByOutput(IIngredient ingredient) {
        removeInGroupByOutput(ingredient, BULLET);
    }

    /**
     * Removes recipe that outputs matching item of given `ingredient` from magazine category.
     *
     * @param ingredient Output item of the recipe. recipe with matching output will be removed.
     */
    @MethodDescription(example = @Example("ore('oreDiamond')"), priority = 1500)
    public void removeMagazineByOutput(IIngredient ingredient) {
        removeInGroupByOutput(ingredient, MAGAZINE);
    }

    /**
     * Removes recipe that outputs matching item of given `ingredient` from grenade category.
     *
     * @param ingredient Output item of the recipe. recipe with matching output will be removed.
     */
    @MethodDescription(example = @Example("ore('oreDiamond')"), priority = 1500)
    public void removeGrenadeByOutput(IIngredient ingredient) {
        removeInGroupByOutput(ingredient, GRENADE);
    }

    public void removeInGroupWithFilter(Predicate<ItemStack> ingredient, CraftingGroup group) {
        List<ICraftingRecipe> recipesToRemove = new ArrayList<>();

        for (ICraftingRecipe recipe : craftingMap.get(group))
            if (ingredient.test(recipe.getOutput()))
                recipesToRemove.add(recipe);

        for (ICraftingRecipe recipe : recipesToRemove)
            removeRecipe(recipe);
    }

    public void addRecipe(ICraftingRecipe crafting) {
        registerRecipe(crafting);
        addScripted(crafting);
    }

    public void removeRecipe(ICraftingRecipe crafting) {
        deleteRecipeRegistry(crafting);
        addBackup(crafting);
    }

    /**
     * Start Recipe Builder for GroovyScript.
     */
    @RecipeBuilderDescription(example = {
            @Example(".input(1, item('minecraft:clay')).output(item('minecraft:diamond'))"),
            @Example(".input(0.5, item('minecraft:gold_ingot')).output(item('minecraft:clay') * 2)")
    })
    public RecipeBuilder recipeBuilder() {
        return new RecipeBuilder();
    }

    @Property(property = "group", comp = @Comp(not = "null"))
    @Property(property = "input", comp = @Comp(gt = 0))
    @Property(property = "output", comp = @Comp(eq = 1))
    public static class RecipeBuilder extends AbstractRecipeBuilder<GSCraftingRecipe> {

        @Property(defaultValue = "GUN", comp = @Comp(not = "null"))
        private CraftingGroup group = GUN;
        private final List<CraftingEntry> input = new ArrayList<>();

        @Override
        public String getErrorMsg() {
            return "Error adding " + NAME + " Workbench Recipe: " + name;
        }

        @Override
        public void validate(GroovyLog.Msg msg) {
            // Max input == container size of crafting station.
            validateItems(msg, 0, 0, 1, 1);

            msg.add(group == null, "group must not be null!");
            msg.add(input.isEmpty(), "Input must contain at least one ingredient.");
            msg.add(input.stream().anyMatch(entry -> entry.getYield() < 0), "Yield values must be non-negative!");
        }

        /**
         * Add Ingredient of recipe With ItemStack
         *
         * @param ingredient crafting ingredient
         *
         * @return AbstractRecipeBuilder
         */
        @Override
        @RecipeBuilderMethodDescription(field = "input")
        public AbstractRecipeBuilder<GSCraftingRecipe> input(IIngredient ingredient) {
            return input(0, ingredient);
        }

        /**
         * Add Ingredient of recipe With ItemStack
         *
         * @param ingredient crafting ingredient
         * @param yield refund yield of ingredient
         *
         * @return AbstractRecipeBuilder
         */
        @RecipeBuilderMethodDescription(field = "input")
        public AbstractRecipeBuilder<GSCraftingRecipe> input(double yield, IIngredient ingredient) {
            input.add(new CraftingEntry(ingredient.toMcIngredient(), ingredient.getAmount(), Math.max(0, yield)));

            return this;
        }

        /**
         * Add Ingredient of recipe With ItemStack
         *
         * @param ingredients crafting ingredients
         * @param yield refund yield of ingredient
         *
         * @return AbstractRecipeBuilder
         */
        @RecipeBuilderMethodDescription(field = "input")
        public AbstractRecipeBuilder<GSCraftingRecipe> input(double yield, IIngredient... ingredients) {
            for (IIngredient ingredient : ingredients)
                input(yield, ingredient);

            return this;
        }

        @RecipeBuilderMethodDescription(field = "group")
        public RecipeBuilder setGroupGun() {
            return setGroup(GUN);
        }

        @RecipeBuilderMethodDescription(field = "group")
        public RecipeBuilder setGroupNormalAttachment() {
            return setGroup(ATTACHMENT_NORMAL);
        }

        @RecipeBuilderMethodDescription(field = "group")
        public RecipeBuilder setGroupModificationAttachment() {
            return setGroup(ATTACHMENT_MODIFICATION);
        }

        @RecipeBuilderMethodDescription(field = "group")
        public RecipeBuilder setGroupBullet() {
            return setGroup(BULLET);
        }

        @RecipeBuilderMethodDescription(field = "group")
        public RecipeBuilder setGroupMagazine() {
            return setGroup(MAGAZINE);
        }

        @RecipeBuilderMethodDescription(field = "group")
        public RecipeBuilder setGroupGrenade() {
            return setGroup(GRENADE);
        }

        @RecipeBuilderMethodDescription(field = "group", priority = 2500)
        public RecipeBuilder setGroup(String string) {
            return setGroup(CraftingGroup.valueOf(string));
        }

        /**
         * Set Category of Recipe
         *
         * @param group Group of the Recipe. valid values = "GUN", "ATTACHMENT_NORMAL", "ATTACHMENT_MODIFICATION", "BULLET", "MAGAZINE"
         *
         * @return this RecipeBuilder
         */
        @RecipeBuilderMethodDescription(field = "group", priority = 3000)
        public RecipeBuilder setGroup(CraftingGroup group) {
            this.group = group;
            return this;
        }

        /**
         * Finalize the recipe and register it
         *
         * @return Finished Recipe
         */
        @Override
        @RecipeBuilderRegistrationMethod
        public GSCraftingRecipe register() {
            if (!validate())
                return null;

            final ArrayList<CraftingEntry> entries = new ArrayList<>(input);
            final GSCraftingRecipe recipe = new GSCraftingRecipe(output.get(0), group, entries.toArray(new CraftingEntry[0]));

            CRAFTING_STATION.addRecipe(recipe);

            return recipe;
        }
    }
}
