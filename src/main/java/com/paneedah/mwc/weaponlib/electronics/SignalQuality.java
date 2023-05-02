package com.paneedah.mwc.weaponlib.electronics;

import java.util.Random;

public class SignalQuality {

    private int quality;

    private boolean interrupted;

    private static Random random = new Random();

    public SignalQuality(int quality, boolean interrupted) {
        this.quality = quality;
        this.interrupted = interrupted;
    }

    public int getQuality() {
        return quality;
    }

    public boolean isInterrupted() {
        return interrupted;
    }

    public static SignalQuality getQuality(int currentDistance, int maxDistance) {
        double allowedRange = (double) currentDistance / maxDistance;
        double adjustedAllowedRange = 1.0 - allowedRange * allowedRange * allowedRange;
        if(adjustedAllowedRange > 0.97) {
            adjustedAllowedRange = 1.0;
        }
        double r = random.nextDouble();
        int signalQuality = (int) (adjustedAllowedRange * 100);
        return new SignalQuality(signalQuality, r >= adjustedAllowedRange);
    }
}
