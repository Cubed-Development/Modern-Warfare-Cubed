package com.paneedah.weaponlib.vehicle.jimphysics;

import lombok.Getter;

public class MechanicalClutch {

    public double engagementPoint;
    public double currentPressure = 0.0;

    @Getter
    public double pedalPressure = 0.0;

    public MechanicalClutch(double engagementPoint) {
        this.engagementPoint = engagementPoint;
    }

    public void applyPedalPressure(double p) {
        pedalPressure = p;
        updatePedalPressure();
    }

    public void addPedalPressure(double p) {
        pedalPressure += p;
        if (pedalPressure > 1) {
            pedalPressure = 1;
        }
        updatePedalPressure();
    }

    public void removePressure(double p) {
        pedalPressure -= p;
        if (pedalPressure < 0) {
            pedalPressure = 0;
        }
        updatePedalPressure();
    }


    public void updatePedalPressure() {
        currentPressure = 1.0 - pedalPressure;
    }


    public double getSlippage() {
        updatePedalPressure();
        if (currentPressure <= engagementPoint) {
            return 0;
        }
        return (currentPressure - engagementPoint) / (1.0 - engagementPoint);
        //return (1 - Math.cos(mu * Math.PI)) / 2;
    }

    public MechanicalClutch clone() {
        MechanicalClutch mechanicalClutch = (MechanicalClutch) super.clone();
        return new MechanicalClutch(engagementPoint);
    }


}
