package com.paneedah.weaponlib.vehicle.smoothlib;

import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class QPTI {

    public static float pti(float a, float b) {
        return (float) InterpolationKit.interpolateValue(a, b, MC.getRenderPartialTicks());
    }

    public static double pti(double a, double b) {
        return InterpolationKit.interpolateValue(a, b, MC.getRenderPartialTicks());

    }

}
