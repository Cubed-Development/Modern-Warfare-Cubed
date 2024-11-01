package com.paneedah.weaponlib.vehicle.jimphysics.solver;

import net.minecraft.util.math.Vec3d;

public class WheelAxel {

    public VehiclePhysicsSolver solver;

    public WheelSolver leftWheel;
    public WheelSolver rightWheel;
    double loadOnAxel;
    public boolean isDriveWheel;
    public double COGoffset;
    public boolean isHandbraking;
    public double tractionTorque;

    public WheelAxel(double offsetFromCOG, boolean isDriveWheel) {
        this.isDriveWheel = isDriveWheel;
        COGoffset = offsetFromCOG;
    }

    public WheelAxel newInstance() {
        WheelAxel newAxel = new WheelAxel(COGoffset, isDriveWheel);
        newAxel.withWheels(leftWheel.newInstance(), rightWheel.newInstance());

        return newAxel;
    }

    public void addWheels(WheelSolver left, WheelSolver right) {
        leftWheel = left;
        rightWheel = right;


    }

    public void assignSolver(VehiclePhysicsSolver solver) {
        this.solver = solver;

        leftWheel.assignSolver(solver);
        rightWheel.assignSolver(solver);

        this.solver.wheels.add(leftWheel);
        this.solver.wheels.add(rightWheel);
    }

    public void applyHandbrake() {
        isHandbraking = true;
    }

    public void releaseHandbrake() {
        isHandbraking = false;
    }

    /**
     * Tells the wheels to apply a braking force
     * (affects wheel acceleration and velocity)
     *
     */
    public void applyBrakingForce(double magnitude) {

        leftWheel.driveTorque -= magnitude;
        rightWheel.driveTorque -= magnitude;
    }

    public void setSteeringAngle(double angle) {
        leftWheel.wheelAngle = -angle;
        rightWheel.wheelAngle = -angle;
    }

    public Vec3d getLongitudinalForce() {
        return leftWheel.longitudinalForce.add(rightWheel.longitudinalForce);
    }

    public double latNonVec() {
        return leftWheel.lateralForce + rightWheel.lateralForce;
    }

    public double longNonVec() {
        return leftWheel.longForce + rightWheel.longForce;
    }

    public Vec3d getLateralForce() {
        return leftWheel.lateralForceVec.add(rightWheel.lateralForceVec);
    }

    public Vec3d adjLateralForce() {

        return getLateralForce()/*.rotatePitch((float) Math.toRadians(solver.vehicle.rotationPitch))*/.rotateYaw((float) Math.toRadians(-solver.vehicle.rotationYaw + solver.vehicle.driftTuner));
    }

    public double getWheelAngularVelocity() {
        return leftWheel.wheelAngularVelocity;
    }

    public void applyDriveTorque(double torque) {
        leftWheel.driveTorque += torque;
        rightWheel.driveTorque += torque;

    }

    public void applySuspensionLoad(double load) {
        leftWheel.applySuspensionLoad(load);
        rightWheel.applySuspensionLoad(load);
    }

    public void distributeLoad(double load) {
        loadOnAxel = load;

        leftWheel.loadOnWheel = load;
        rightWheel.loadOnWheel = load;
    }

    public void doPhysics() {


        leftWheel.doPhysics();
        rightWheel.doPhysics();

        double drTorque = leftWheel.driveTorque + rightWheel.driveTorque;


        tractionTorque = leftWheel.tractionTorque + rightWheel.tractionTorque;


        double totalTorque = drTorque + tractionTorque;


        double inertia = leftWheel.wheelInertia + rightWheel.wheelInertia;
        double angularAccel = totalTorque / inertia;

        //System.out.println("Angular Acceleration: " + angularAccel);

        leftWheel.wheelAngularAcceleration = angularAccel;
        rightWheel.wheelAngularAcceleration = angularAccel;


        // resetTorque
        leftWheel.driveTorque = 0;
        rightWheel.driveTorque = 0;


    }

    public WheelAxel withWheels(WheelSolver left, WheelSolver right) {
        left.axel = this;

        right.axel = this;


        addWheels(left, right);
        return this;
    }
}
