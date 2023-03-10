package com.paneedah.weaponlib.crafting;

import net.minecraft.item.Item;

/**
 * Important interface that defines several properties:
 * 1. What item are we referring to?
 * 2. What items (and how many of each) do we need to craft this item?
 * 3. Which group does this item belong to?
 * 
 * 
 * @author Homer Riva-Cambrin
 * @version September 23rd, 2022
 */
public interface IModernCrafting {
	
	public CraftingEntry[] getModernRecipe();
	public Item getItem();
	public CraftingGroup getCraftingGroup();

	public void setCraftingRecipe(CraftingEntry[] recipe);
	public void setCraftingGroup(CraftingGroup group);

}
