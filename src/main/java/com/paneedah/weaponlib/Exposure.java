package com.paneedah.weaponlib;

import com.paneedah.mwc.network.ISerializable;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public interface Exposure extends ISerializable {

    public boolean isEffective(World world);
    
    public void update(Entity entity);
    
    public long getLastSyncTimestamp();
    
    public void updateFrom(Exposure anotherExposure);
}
