package com.paneedah.weaponlib;

import com.paneedah.mwc.network.ISerializable;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public interface Exposure extends ISerializable {

    boolean isEffective(World world);

    void update(Entity entity);

    long getLastSyncTimestamp();

    void updateFrom(Exposure anotherExposure);
}
