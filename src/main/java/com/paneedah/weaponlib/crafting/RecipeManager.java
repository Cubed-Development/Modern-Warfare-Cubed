package com.paneedah.weaponlib.crafting;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.ProjectConstants.LOGGER;

public class RecipeManager {

    private final RecipeGenerator recipeGenerator = new RecipeGenerator();

    private final Map<Item, List<Object>> recipes = new HashMap<>();

    public List<Object> createShapedRecipe(Item item, String name, OptionsMetadata optionsMetadata) {
        List<Object> recipe = recipeGenerator.createShapedRecipe(name, optionsMetadata);
        if (recipes.put(item, recipe) != null) {
            LOGGER.warn("Duplicate recipe registered for item {}", item);
        }
        return recipe;
    }

    public List<Object> registerShapedRecipe(Item item, Object... recipe) {
        return registerShapedRecipe(new ItemStack(item), recipe);
    }

    public List<Object> registerShapedRecipe(ItemStack itemStack, Object... recipe) {
        List<Object> recipeAslist = new ArrayList<>(recipe.length);
        boolean hasOres = false;
        for (Object option : recipe) {
            if (option instanceof String) {
                hasOres = true;
            }
            recipeAslist.add(option);
        }

        ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, recipeAslist.toArray()).setMirrored(false).setRegistryName(ID, itemStack.getItem().getTranslationKey() + "_recipe") /*TODO: temporary hack*/);

        if (recipes.put(itemStack.getItem(), recipeAslist) != null) {
            LOGGER.warn("Duplicate recipe registered for item {}", itemStack.getItem());
        }
        return recipeAslist;
    }

    public List<Object> getRecipe(Item item) {
        return recipes.get(item);
    }

}
