package com.paneedah.weaponlib.numerical;

import lombok.Getter;

public class SynchronizedSimulator {

    private final ISimulator simulator;
    private long previousFrameTime = System.currentTimeMillis();
    private double accumulator;
    private final double dt;

    @Getter
    private double remainder;

    public SynchronizedSimulator(ISimulator simulator, double dt) {
        this.simulator = simulator;
        this.dt = dt;
    }

    public void update() {

        long newTime = System.currentTimeMillis();
        double frameTime = (newTime - previousFrameTime) / 1000.0;
        previousFrameTime = newTime;

        if (frameTime > 0.25) {
            frameTime = 0.25;
        }

        accumulator += frameTime;

        while (accumulator >= dt) {
            //System.out.println("hi");
            simulator.update(dt);
            accumulator -= dt;
        }

        remainder = accumulator;


    }


}
