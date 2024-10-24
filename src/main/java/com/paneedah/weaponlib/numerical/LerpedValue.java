package com.paneedah.weaponlib.numerical;

import com.paneedah.weaponlib.animation.MatrixHelper;
import lombok.Getter;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class LerpedValue {

    @Getter
    public double previousValue;
    public double currentValue;


    public LerpedValue() {

    }


    /**
     * Called before changes are made, sets the previous value to the
     * current one.
     */
    public void updatePrevious() {
        previousValue = currentValue;
    }

    public void update(double newValue) {
        previousValue = currentValue;
        currentValue = newValue;
    }

    public void add(double value) {
        currentValue += value;
    }

    public void dampen(double damper) {
        currentValue *= damper;
    }

    public double getValue() {
        return currentValue;
    }

    public double getLerped() {
        return MatrixHelper.solveLerp(previousValue, currentValue, MC.getRenderPartialTicks());
    }

    public float getLerpedFloat() {
        return (float) getLerped();
    }


}
