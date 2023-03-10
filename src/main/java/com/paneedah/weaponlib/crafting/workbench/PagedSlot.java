package com.paneedah.weaponlib.crafting.workbench;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

import java.util.function.Supplier;

/**
 * Paged slot class that works off a supplier lambda,
 * will only render should the integer align with the proper
 * page ID.
 * 
 * @author Homer Riva-Cambrin, 2022
 */
public class PagedSlot extends Slot {
	
	private Supplier<Integer> pageNumber;
	private int pageID;

	public PagedSlot(Supplier<Integer> pageNumber, IInventory inventoryIn, int index, int pageID, int xPosition, int yPosition) {
		super(inventoryIn, index, xPosition, yPosition);
		this.pageNumber = pageNumber;
		this.pageID = pageID;
	}
	
	@Override
	public boolean isEnabled() {
		return pageNumber.get() == pageID;
	}

}
