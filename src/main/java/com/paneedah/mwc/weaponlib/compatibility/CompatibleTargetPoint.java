package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;

public class CompatibleTargetPoint {

    private TargetPoint targetPoint;

    public CompatibleTargetPoint(int dimension, double x, double y, double z, double range) {
        this.targetPoint = new TargetPoint(dimension, x, y, z, range);
    }
    
    TargetPoint getTargetPoint() {
        return targetPoint;
    }
    
}
