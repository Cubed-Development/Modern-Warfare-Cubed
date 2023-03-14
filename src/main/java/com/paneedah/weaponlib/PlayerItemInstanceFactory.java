package com.paneedah.weaponlib;

import com.paneedah.weaponlib.state.ManagedState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public interface PlayerItemInstanceFactory<T extends PlayerItemInstance<S>, S extends ManagedState<S>> {

	T createItemInstance(EntityLivingBase player, ItemStack stack, int slot);
}
