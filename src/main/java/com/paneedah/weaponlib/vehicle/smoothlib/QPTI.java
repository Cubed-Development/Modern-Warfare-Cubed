package com.paneedah.weaponlib.vehicle.smoothlib;

import com.paneedah.mwc.utils.InterpolationUtil;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class QPTI {

    public static float pti(float a, float b) {
        return (float) InterpolationUtil.interpolateValue(a, b, MC.getRenderPartialTicks());
    }

    public static double pti(double a, double b) {
        return InterpolationUtil.interpolateValue(a, b, MC.getRenderPartialTicks());
    }

}
