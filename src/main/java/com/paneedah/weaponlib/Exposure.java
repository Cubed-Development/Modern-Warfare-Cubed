package com.paneedah.weaponlib;

import com.paneedah.weaponlib.network.UniversallySerializable;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public interface Exposure extends UniversallySerializable {

    boolean isEffective(World world);
    
    void update(Entity entity);
    
    long getLastSyncTimestamp();
    
    void updateFrom(Exposure anotherExposure);
}
