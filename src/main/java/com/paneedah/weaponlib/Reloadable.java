package com.paneedah.weaponlib;

import net.minecraft.entity.player.EntityPlayer;

public interface Reloadable {

    void reloadMainHeldItemForPlayer(EntityPlayer player);

    void unloadMainHeldItemForPlayer(EntityPlayer player);
}
