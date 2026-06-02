package com.paneedah.weaponlib.vehicle.jimphysics.solver;

import com.paneedah.mwc.utils.InterpolationUtil;
import lombok.NoArgsConstructor;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@NoArgsConstructor
public class SuspensionBox {

    public double prevRoll;
    public double roll;

    public double prevPitch;
    public double pitch;


    public void applyForwardAccel(double inertia, double acceleration) {

    }

    public void update() {

    }


    public double pti(double o, double n) {
        return InterpolationUtil.interpolateValue(o, n, MC.getRenderPartialTicks());
    }

}
