package com.paneedah.mwc.instancing;

import com.paneedah.weaponlib.state.ManagedState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @since 0.2
 */
public interface PlayerItemInstanceFactory<T extends PlayerItemInstance<S>, S extends ManagedState<S>> {

    T createItemInstance(final EntityLivingBase entityLivingBase, final ItemStack itemStack, final int slot);
}
