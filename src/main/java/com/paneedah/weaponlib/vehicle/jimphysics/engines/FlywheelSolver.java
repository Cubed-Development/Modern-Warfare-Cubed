package com.paneedah.weaponlib.vehicle.jimphysics.engines;

import com.paneedah.weaponlib.vehicle.collisions.InertiaKit;

public class FlywheelSolver {

    public double mass;
    public double radius;
    public double inertia;


    public double angularVelocity = 0.0;
    public double angularAcceleration = 0.0;

    public FlywheelSolver(double mass, double radius, double thickness) {
        this.mass = mass;
        this.radius = radius;
        inertia = InertiaKit.inertiaTensorCylinder((float) mass, (float) radius, (float) thickness).m22;
    }

    /**
     * Applies torque to the flywheel
     * <p>
     * SOURCE: <a href="https://openstax.org/books/university-physics-volume-1/pages/10-7-newtons-second-law-for-rotation">...</a>
     *
     * @param torque - n/m
     *
     */
    public void applyTorque(double torque) {
        double a = torque / inertia;
        angularAcceleration += a;
    }

    public void determineResistiveForces() {
        // https://illinois.digication.com/flywheel-energy-storage/cost
        // https://www.researchgate.net/publication/343930266_Analysis_of_Standby_Losses_and_Charging_Cycles_in_Flywheel_Energy_Storage_Systems

        // decided to cheese it
        angularAcceleration += 5000.5 * Math.signum(angularVelocity * -1);

    }

    public void doPhysics(double dt) {

        determineResistiveForces();

        angularVelocity += angularAcceleration * dt;
        angularAcceleration = 0;

    }


    public double getRPM() {
        //https://www.inchcalculator.com/convert/radian-per-second-to-revolution-per-minute/

        return angularVelocity / (2 * Math.PI) * 60;

    }


}
