package com.paneedah.weaponlib.crafting;

import com.paneedah.mwc.bases.ManufacturingItemBase;
import lombok.Getter;
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

    @Getter
    private final Ingredient ingredient;
    @Getter
    private final int count;
    private String oreDictionary;

    private double yield = 1;

    public CraftingEntry(Item i, int c) {
        ingredient = Ingredient.fromItem(i);
        count = c;
    }

    public CraftingEntry(Block i, int c) {
        ingredient = Ingredient.fromItem(Item.getItemFromBlock(i));
        count = c;
    }

    public CraftingEntry(Item dismantle, String oreDictionary, int count) {
        ingredient = Ingredient.fromItem(dismantle);
        this.oreDictionary = oreDictionary;
        this.count = count;
    }

    public CraftingEntry(Block dismantle, String oreDictionary, int count) {
        ingredient = Ingredient.fromItem(Item.getItemFromBlock(dismantle));
        this.oreDictionary = oreDictionary;
        this.count = count;
    }

    public CraftingEntry(Item i, int c, double yield) {
        ingredient = Ingredient.fromItem(i);
        count = c;
        this.yield = yield;
    }

    public CraftingEntry(Block i, int c, double yield) {
        ingredient = Ingredient.fromItem(Item.getItemFromBlock(i));
        count = c;
        this.yield = yield;
    }

    public CraftingEntry(Item dismantle, String oreDictionary, int count, double yield) {
        ingredient = Ingredient.fromItem(dismantle);
        this.oreDictionary = oreDictionary;
        this.count = count;
        this.yield = yield;
    }

    public CraftingEntry(Block dismantle, String oreDictionary, int count, double yield) {
        ingredient = Ingredient.fromItem(Item.getItemFromBlock(dismantle));
        this.oreDictionary = oreDictionary;
        this.count = count;
        this.yield = yield;
    }

    public CraftingEntry(Ingredient mcIngredient, int amount, Double yield) {
        ingredient = mcIngredient;
        count = amount;
        this.yield = yield.doubleValue();
    }

    public String getOreDictionaryEntry() {
        return oreDictionary;
    }

    public boolean isOreDictionary() {
        //return this.oreDictionary != null && !this.oreDictionary.isEmpty(); // Commented out as currently nothing is truly oredict capable
        // TODO: Add oredict compat to the mod, search `TODO: OREDICT` to find places where changes are needed.
        return false;
    }

    @Override
    public String toString() {
        if (isOreDictionary()) {
            return "(" + oreDictionary + "[" + ingredient.toString() + "], " + getCount() + ")";
        } else {
            return "(" + ingredient.toString() + ", " + getCount() + ")";
        }
    }

    public double getYield() {
        for (ItemStack stack : ingredient.getMatchingStacks())
            if (stack.getItem() instanceof ManufacturingItemBase && yield == 1) {
                return ((ManufacturingItemBase) stack.getItem()).getRecoveryChance();
            }
        return yield;
    }
}
