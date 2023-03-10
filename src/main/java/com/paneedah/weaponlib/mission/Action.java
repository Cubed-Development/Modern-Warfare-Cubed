package com.paneedah.weaponlib.mission;

import com.paneedah.weaponlib.network.UniversallySerializable;
import net.minecraft.entity.player.EntityPlayer;

public abstract class Action implements UniversallySerializable {

    public abstract int matches(Action anotherAction, EntityPlayer player);
    
    public Object getResult(EntityPlayer player) {
        return null;
    }
    
    public boolean isTransient() {
        return true;
    }

    public boolean quantityMatches(EntityPlayer player, int requiredQuantity) {
        return false;
    }
}
