package com.paneedah.weaponlib.animation;

public enum Interpolation {
    LINEAR,
    ACCELERATION,
    DECELERATION,
    SMOOTHSTEP,
    COSINE,
    STEP,
    DAMPEDSPRING;

    public double interpolate(double input) {
        switch (this) {
            case LINEAR:
                return input;
            case ACCELERATION:
                return input * input;
            case DECELERATION:
                return 1 - ((1 - input) * (1 - input));
            case SMOOTHSTEP:
                return input * input * (3 - (2 * input));
            default:
                return input;
        }
    }

}
