package com.paneedah.weaponlib;

public class MiscUtils {


    /**
     * Cubic Hermite
     */
    public static float smoothstep(float edge0, float edge1, float x) {
        x = clamp((x - edge0) / (edge1 - edge0), 0.0f, 1.0f);
        return x * x * (3 - 2 * x);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.math.ClampUtil} instead.
     */
    @Deprecated
    public static float clamp(float x, float lowerlimit, float upperlimit) {
        if (x < lowerlimit) {
            x = lowerlimit;
        }
        if (x > upperlimit) {
            x = upperlimit;
        }
        return x;
    }
}
