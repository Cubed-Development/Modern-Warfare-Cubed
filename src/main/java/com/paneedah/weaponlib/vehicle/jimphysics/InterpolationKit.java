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

    public static Vec3d interpolateVector(Vec3d start, Vec3d end, double mu) {

        double x = interpolateValue(start.x, end.x, mu);
        double y = interpolateValue(start.y, end.y, mu);
        double z = interpolateValue(start.z, end.z, mu);
        return new Vec3d(x, y, z);

    }


}
