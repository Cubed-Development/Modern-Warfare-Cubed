package com.paneedah.weaponlib.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * CraftingEntry class stores an item, the count, and an optional OreDictionary name.
 * 
 * Features:
 * 1. Can be initialized with a block (similar to ItemStack)
 * 2. Can be initialized with an OreDictionary name (you do have to give it a default item though for dismantling)
 * 3. Can be printed to a string
 * 
 * @author Homer Riva-Cambrin
 * @version October 9th, 2022
 */
public class CraftingEntry {
	
	private Item item;
	private int count;
	private String oreDictionary;
	
	public CraftingEntry(Item i, int c) {
		this.item = i;
		this.count = c;
	}
	
	public CraftingEntry(Block i, int c) {
		this.item = Item.getItemFromBlock(i);
		this.count = c;
	}
	 
	public CraftingEntry(Item dismantle, String oreDictionary, int count) {
		this.item = dismantle;
		this.oreDictionary = oreDictionary;
		this.count = count;
	}
	
	public CraftingEntry(Block dismantle, String oreDictionary, int count) {
		this.item = Item.getItemFromBlock(dismantle);
		this.oreDictionary = oreDictionary;
		this.count = count;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public String getOreDictionaryEntry() {
		return this.oreDictionary;
	}
	
	public boolean isOreDictionary() {
		return this.oreDictionary != null && this.oreDictionary.length() != 0;
	}
	
	@Override
	public String toString() {
		if(isOreDictionary()) {
			return "(" + this.oreDictionary + "[" + this.item.getRegistryName().toString() + "], " + getCount() + ")";
		} else {
			return "(" + this.item.getRegistryName().toString()  + ", " + getCount() + ")";
		}
	}

}
