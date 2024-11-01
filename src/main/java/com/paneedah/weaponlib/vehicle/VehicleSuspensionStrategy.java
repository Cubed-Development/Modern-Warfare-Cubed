package com.paneedah.weaponlib.vehicle;

import lombok.Getter;

import java.util.Arrays;

@Getter
public abstract class VehicleSuspensionStrategy {

    public static class StepSuspensionStrategy extends VehicleSuspensionStrategy {

        private static class Threshold implements Comparable<Threshold> {
            float speed;
            float rate;
            float amplitude;

            @Override
            public int compareTo(Threshold o) {
                return Float.compare(speed, o.speed);
            }
        }

        private final Threshold[] thresholds;

        public StepSuspensionStrategy(float... data) {
            if (data.length % 3 != 0) {
                throw new IllegalArgumentException();
            }
            thresholds = new Threshold[Math.round((float) data.length / 3)];
            for (int i = 0, j = 0; i < data.length; i += 3, j++) {
                thresholds[j] = new Threshold();
                thresholds[j].speed = data[i];
                thresholds[j].rate = data[i + 1];
                thresholds[j].amplitude = data[i + 2];
            }
            Arrays.sort(thresholds);
        }

        @Override
        public void update(double speed, double yawDelta) {
            amplitude = 0f;
            rate = 0f;
            for (int i = 0; i < thresholds.length; i++) {
                if (speed > thresholds[i].speed) {
                    rate = thresholds[i].rate;
                    amplitude = thresholds[i].amplitude;
                } else {
                    break;
                }
            }
        }
    }

    protected float rate;
    protected float amplitude;

    public abstract void update(double speed, double yawDelta);

}
