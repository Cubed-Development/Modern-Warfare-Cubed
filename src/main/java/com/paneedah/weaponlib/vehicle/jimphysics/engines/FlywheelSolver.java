package com.paneedah.weaponlib.vehicle.jimphysics.engines;

import com.paneedah.weaponlib.vehicle.collisions.InertiaKit;

public class FlywheelSolver {

    public double mass = 0.0;
    public double radius = 0.0;
    public double inertia = 0.0;


    public double angularVelocity = 0.0;
    public double angularAcceleration = 0.0;

    public FlywheelSolver(double mass, double radius, double thickness) {
        this.mass = mass;
        this.radius = radius;
        this.inertia = InertiaKit.inertiaTensorCylinder((float) mass, (float) radius, (float) thickness).m22;
    }

    /**
     * Applies torque to the flywheel
     * <p>
     * SOURCE: https://openstax.org/books/university-physics-volume-1/pages/10-7-newtons-second-law-for-rotation
     *
     * @param torque - n/m
     *
     * @return
     */
    public void applyTorque(double torque) {
        double a = torque / inertia;
        this.angularAcceleration += a;
    }

    public void determineResistiveForces() {
        // https://illinois.digication.com/flywheel-energy-storage/cost
        // https://www.researchgate.net/publication/343930266_Analysis_of_Standby_Losses_and_Charging_Cycles_in_Flywheel_Energy_Storage_Systems

        // decided to cheese it
        angularAcceleration += 5000.5 * Math.signum(this.angularVelocity * -1);

    }

    public void doPhysics(double dt) {

        determineResistiveForces();

        this.angularVelocity += this.angularAcceleration * dt;
        this.angularAcceleration = 0;

    }


    public double getRPM() {
        //https://www.inchcalculator.com/convert/radian-per-second-to-revolution-per-minute/

        return angularVelocity / (2 * Math.PI) * 60;

    }


}
