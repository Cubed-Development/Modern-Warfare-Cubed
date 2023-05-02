package com.paneedah.mwc.weaponlib;

import com.paneedah.mwc.weaponlib.state.ManagedState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public interface PlayerItemInstanceFactory<T extends PlayerItemInstance<S>, S extends ManagedState<S>> {

	public T createItemInstance(EntityLivingBase player, ItemStack stack, int slot);
}
