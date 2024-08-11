package com.paneedah.weaponlib;

import net.minecraft.entity.player.EntityPlayer;

public interface Reloadable {

    public void reloadMainHeldItemForPlayer(EntityPlayer player);

    public void unloadMainHeldItemForPlayer(EntityPlayer player);
}
