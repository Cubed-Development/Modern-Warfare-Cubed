package com.paneedah.mwc.groovyscript.recipes;

import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.IModernCraftingRecipe;
import net.minecraft.item.ItemStack;

public class GSCrafting implements IModernCraftingRecipe {

    private final ItemStack output;
    private CraftingEntry[] recipe;
    private CraftingGroup group;

    public GSCrafting(ItemStack output, CraftingGroup group, CraftingEntry... recipe){
        this.output = output;
        this.group = group;
        this.recipe = recipe;
    }
    
    @Override
    public CraftingEntry[] getModernRecipe() {
        return this.recipe;
    }

    @Override
    public ItemStack getItemStack() {
        return this.output;
    }

    @Override
    public CraftingGroup getCraftingGroup() {
        return this.group;
    }

    @Override
    public void setCraftingRecipe(CraftingEntry[] recipe) {
        this.recipe = recipe;
    }

    @Override
    public void setCraftingGroup(CraftingGroup group) {
        this.group = group;
    }
}
