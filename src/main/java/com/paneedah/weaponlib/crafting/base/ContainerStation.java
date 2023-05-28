package com.paneedah.weaponlib.crafting.base;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

import java.util.function.Supplier;

public class ContainerStation extends Container {

	protected int page;
	protected Supplier<Integer> currentPageSupplier = () -> page;

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return true;
	}
}
