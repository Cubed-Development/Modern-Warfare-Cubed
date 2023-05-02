package com.paneedah.weaponlib.crafting.workbench;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import java.util.function.Supplier;

/**
 * Paged slot class that works off a supplier lambda,
 * will only render should the integer align with the proper
 * page ID.
 * 
 * @author Homer Riva-Cambrin, 2022
 */
public class PagedSlotItemHandler extends SlotItemHandler {
	
	private Supplier<Integer> pageNumber;
	private int pageID;

	public PagedSlotItemHandler(Supplier<Integer> pageNumber, IItemHandler itemHandler, int index, int pageID, int xPosition, int yPosition) {
		super(itemHandler, index, xPosition, yPosition);
		this.pageNumber = pageNumber;
		this.pageID = pageID;
	}	

	@Override
	public boolean isEnabled() {
		return pageNumber.get() == pageID;
	}

}
