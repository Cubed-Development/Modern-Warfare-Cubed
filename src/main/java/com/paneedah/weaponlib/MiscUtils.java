package com.paneedah.weaponlib;

import dev.redstudio.redcore.math.ClampUtil;

public class MiscUtils {

    /**
     * Cubic Hermite
     */
    public static float smoothstep(float edge0, float edge1, float x) {
        x = ClampUtil.clamp((x - edge0) / (edge1 - edge0), 0, 1);
        return x * x * (3 - 2 * x);
    }
}
