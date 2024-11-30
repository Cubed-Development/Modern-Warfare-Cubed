package com.paneedah.weaponlib.vehicle.jimphysics;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class InterpolationKit {


    public static Vec3d interpolatedEntityPosition(Entity en) {
        return new Vec3d(interpolateValue(en.prevPosX, en.posX, MC.getRenderPartialTicks()),
                interpolateValue(en.prevPosY, en.posY, MC.getRenderPartialTicks()),
                interpolateValue(en.prevPosZ, en.posZ, MC.getRenderPartialTicks())
        );

    }

    public static double interpolateValue(double old, double newVal, double partialTicks) {
        return old + (newVal - old) * partialTicks;
    }

    public static Vec3d interpolateVector(Vec3d start, Vec3d end, double partialTicks) {
        double x = interpolateValue(start.x, end.x, partialTicks);
        double y = interpolateValue(start.y, end.y, partialTicks);
        double z = interpolateValue(start.z, end.z, partialTicks);

        return new Vec3d(x, y, z);

    }


}
