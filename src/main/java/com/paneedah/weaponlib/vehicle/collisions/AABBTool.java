package com.paneedah.weaponlib.vehicle.collisions;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;

public class AABBTool {

    public static AxisAlignedBB createAABB(Vec3d min, Vec3d max) {
        return new AxisAlignedBB(min.x, min.y, min.z, max.x, max.y, max.z);
    }

}
