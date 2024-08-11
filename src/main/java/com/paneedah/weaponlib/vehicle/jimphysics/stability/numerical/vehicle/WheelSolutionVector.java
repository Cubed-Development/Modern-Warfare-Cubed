package com.paneedah.weaponlib.vehicle.jimphysics.stability.numerical.vehicle;

public class WheelSolutionVector {

    public double slipRatio = 0.0;
    public double velocity = 0.0;
    public double longSpeed = 0.0;

    public WheelSolutionVector() {}


    public void add(double dt, WheelSolutionVector vec) {
        this.slipRatio += dt * vec.slipRatio;
        this.velocity += dt * vec.velocity;
        this.longSpeed += dt * vec.longSpeed;
    }

}
