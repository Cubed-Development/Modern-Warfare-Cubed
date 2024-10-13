package com.paneedah.weaponlib.vehicle.jimphysics.solver;

import com.paneedah.weaponlib.vehicle.jimphysics.VehiclePhysUtil;
import lombok.Getter;

public class SuspensionSolver {

    public double length;
    @Getter
    public double springRate;
    public double currentLength;
    public double joules;
    public double force;

    public SuspensionSolver(double k, double l) {
        length = l;
        springRate = k;
    }

    public double getStretch() {
        return currentLength - length;
    }

    public void applyForce(double force) {
        double stretch = force / springRate;
        currentLength = length + stretch;
    }

    public void setCurrentLength(double len) {
        currentLength = len;
        updateEnergy();
        updateForce();
    }

    public double getEnergy() {
        return joules;
    }

    public void updateEnergy() {
        joules = VehiclePhysUtil.springEnergy(getSpringRate(), getStretch());
    }

    public void updateForce() {
        force = VehiclePhysUtil.springForce(getSpringRate(), getStretch());
    }

    public void setEnergy(double e) {
        double s = VehiclePhysUtil.springStretchFromEnergy(getSpringRate(), e);
        currentLength = length - s;
        joules = e;

        updateForce();
    }

}
