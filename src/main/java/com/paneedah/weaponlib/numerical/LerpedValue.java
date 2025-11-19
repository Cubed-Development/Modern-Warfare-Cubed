package com.paneedah.weaponlib.numerical;

import com.paneedah.weaponlib.animation.MatrixHelper;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@Getter
@NoArgsConstructor
public class LerpedValue {

    private double previousValue;
    @Setter private double currentValue;

    /**
     * Call before changes are made, sets the previous value to the
     * current one.
     */
    public void updatePrevious() {
        previousValue = currentValue;
    }

    /**
     * Update the lerped value, this calls updatePrevious
     *
     * @param newValue the new currentValue
     */
    public void update(double newValue) {
        updatePrevious();
        currentValue = newValue;
    }

    /**
     * Add something the lerped value, this DOES NOT call updatePrevious
     *
     * @param value the amount to add to currentValue
     */
    public void add(double value) {
        currentValue += value;
    }

    /**
     * Dampen the lerped value, this DOES NOT call updatePrevious
     *
     * @param damper the amount to dampen the currentValue
     */
    public void dampen(double damper) {
        currentValue *= damper;
    }

    public double getLerped() {
        return MatrixHelper.solveLerp(previousValue, currentValue, MC.getRenderPartialTicks());
    }

    public float getLerpedFloat() {
        return (float) getLerped();
    }


}
