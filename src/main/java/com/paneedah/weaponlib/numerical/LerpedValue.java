package com.paneedah.weaponlib.numerical;

import com.paneedah.weaponlib.animation.MatrixHelper;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@NoArgsConstructor
@Getter
public class LerpedValue {

    public double previousValue;
    public double currentValue;

    /**
     * Called before changes are made, sets the previous value to the
     * current one.
     */
    public void updatePrevious() {
        previousValue = currentValue;
    }

    public void update(double newValue) {
        this.previousValue = this.currentValue;
        this.currentValue = newValue;
    }

    public void add(double value) {
        this.currentValue += value;
    }

    public void dampen(double damper) {
        this.currentValue *= damper;
    }

    public double getValue() {
        return this.currentValue;
    }

    public double getLerped() {
        return MatrixHelper.solveLerp(this.previousValue, this.currentValue, MC.getRenderPartialTicks());
    }

    public float getLerpedFloat() {
        return (float) getLerped();
    }


}
