package com.paneedah.weaponlib.crafting.base;

import com.paneedah.weaponlib.compatibility.CompatibleContainer;
import net.minecraft.entity.player.EntityPlayer;

import java.util.function.Supplier;

public class ContainerStation extends CompatibleContainer {
	

	protected int page;
	protected Supplier<Integer> currentPageSupplier = () -> page;
	
	
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return true;
	}

	

}
