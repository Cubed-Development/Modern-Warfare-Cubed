package com.paneedah.weaponlib.crafting;

import com.paneedah.mwc.bases.ManufacturingItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;

/**
 * CraftingEntry class stores an item, the count, and an optional OreDictionary name.
 * <p>
 * Features:
 * 1. Can be initialized with a block (similar to ItemStack)
 * 2. Can be initialized with an OreDictionary name (you do have to give it a default item though for dismantling)
 * 3. Can be printed to a string
 *
 * @author Homer Riva-Cambrin
 * @version October 9th, 2022
 */
public class CraftingEntry {

    private Ingredient ingredient;
    private int count;
    private String oreDictionary;

    private double yield = 1;

    public CraftingEntry(Item i, int c) {
        this.ingredient = Ingredient.fromItem(i);
        this.count = c;
    }

    public CraftingEntry(Block i, int c) {
        this.ingredient = Ingredient.fromItem(Item.getItemFromBlock(i));
        this.count = c;
    }

    public CraftingEntry(Item dismantle, String oreDictionary, int count) {
        this.ingredient = Ingredient.fromItem(dismantle);
        this.oreDictionary = oreDictionary;
        this.count = count;
    }

    public CraftingEntry(Block dismantle, String oreDictionary, int count) {
        this.ingredient = Ingredient.fromItem(Item.getItemFromBlock(dismantle));
        this.oreDictionary = oreDictionary;
        this.count = count;
    }

    public CraftingEntry(Item i, int c, double yield) {
        this.ingredient = Ingredient.fromItem(i);
        this.count = c;
        this.yield = yield;
    }

    public CraftingEntry(Block i, int c, double yield) {
        this.ingredient = Ingredient.fromItem(Item.getItemFromBlock(i));
        this.count = c;
        this.yield = yield;
    }

    public CraftingEntry(Item dismantle, String oreDictionary, int count, double yield) {
        this.ingredient = Ingredient.fromItem(dismantle);
        this.oreDictionary = oreDictionary;
        this.count = count;
        this.yield = yield;
    }

    public CraftingEntry(Block dismantle, String oreDictionary, int count, double yield) {
        this.ingredient = Ingredient.fromItem(Item.getItemFromBlock(dismantle));
        this.oreDictionary = oreDictionary;
        this.count = count;
        this.yield = yield;
    }

    public CraftingEntry(Ingredient mcIngredient, int amount, Double yield) {
        this.ingredient = mcIngredient;
        this.count = amount;
        this.yield = yield;
    }

    public int getCount() {
        return this.count;
    }

    public Ingredient getIngredient() {
        return this.ingredient;
    }

    public String getOreDictionaryEntry() {
        return this.oreDictionary;
    }

    public boolean isOreDictionary() {
        //return this.oreDictionary != null && !this.oreDictionary.isEmpty(); // Commented out as currently nothing is truly oredict capable
        // TODO: Add oredict compat to the mod, search `TODO: OREDICT` to find places where changes are needed.
        return false;
    }

    @Override
    public String toString() {
        if (isOreDictionary())
            return "(" + this.oreDictionary + "[" + this.ingredient.toString() + "], " + getCount() + ")";
        else
            return "(" + this.ingredient.toString() + ", " + getCount() + ")";
    }

    public double getYield() {
        for(ItemStack stack:this.ingredient.getMatchingStacks())
            if(stack.getItem() instanceof ManufacturingItemBase && this.yield == 1)
                return ((ManufacturingItemBase) stack.getItem()).getRecoveryChance();
        return this.yield;
    }
}
