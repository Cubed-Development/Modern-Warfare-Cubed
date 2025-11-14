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
            case ACCELERATION:
                return input * input;
            case DECELERATION:
                return 1 - ((1 - input) * (1 - input));
            case SMOOTHSTEP:
                return input * input * (3 - (2 * input));
            case COSINE:
                return (1 - Math.cos(input * Math.PI)) / 2;
            case STEP:
                return input < 0.5 ? 0.0 : 1.0;
            case DAMPEDSPRING:
                // Produces a slight overshoot and settling motion
                double damping = 5.0;   // higher = more damping
                double frequency = 8.0; // oscillation speed
                return 1 - Math.exp(-damping * input) *
                        Math.cos(frequency * input);
            case LINEAR:
            default:
                return input;
        }
    }
}
