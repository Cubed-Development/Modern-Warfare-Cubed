package com.paneedah.weaponlib.mission;

import net.minecraft.entity.player.EntityPlayer;

import java.util.Map;
import java.util.UUID;

public interface MissionAssigner {

    public int getEntityId();
    
    public void redeem(Mission mission, EntityPlayer player);

    public Map<UUID,MissionOffering> getMissionOfferings();
    
    public void assign(MissionOffering offering, EntityPlayer player);
}
