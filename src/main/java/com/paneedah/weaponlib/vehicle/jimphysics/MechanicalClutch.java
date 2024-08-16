package com.paneedah.weaponlib.vehicle.jimphysics;

public class MechanicalClutch {

    public double engagementPoint = 0.4;
    public double currentPressure = 0.0;

    public double pedalPressure = 0.0;

    public MechanicalClutch(double engagementPoint) {
        this.engagementPoint = engagementPoint;
    }

    public void applyPedalPressure(double p) {
        this.pedalPressure = p;
        updatePedalPressure();
    }

    public void addPedalPressure(double p) {
        this.pedalPressure += p;
        if (this.pedalPressure > 1) {
            this.pedalPressure = 1;
        }
        updatePedalPressure();
    }

    public void removePressure(double p) {
        this.pedalPressure -= p;
        if (this.pedalPressure < 0) {
            this.pedalPressure = 0;
        }
        updatePedalPressure();
    }

    public double getPedalPressure() {
        return this.pedalPressure;
    }


    public void updatePedalPressure() {
        currentPressure = 1.0 - pedalPressure;
    }


    public double getSlippage() {
        updatePedalPressure();
        if (currentPressure <= engagementPoint) {
            return 0;
        }
        double mu = (currentPressure - engagementPoint) / (1.0 - engagementPoint);
        return mu;
        //return (1 - Math.cos(mu * Math.PI)) / 2;
    }

    public MechanicalClutch clone() {
        return new MechanicalClutch(this.engagementPoint);
    }


}
