package com.paneedah.weaponlib.vehicle.smoothlib;

import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class PTIVal {

    public float prev;
    public float cur;

    public PTIVal() {}

    public void updatePrev() {
        prev = cur;
    }

    public void setValue(float val) {
        cur = val;
    }

    public float getPTI() {
        return (float) InterpolationKit.interpolateValue(prev, cur, MC.getRenderPartialTicks());
    }

}
