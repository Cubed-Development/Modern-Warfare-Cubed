package com.paneedah.weaponlib.vehicle.jimphysics;

import com.paneedah.weaponlib.vehicle.EntityVehicle;
import lombok.Getter;

import java.util.ArrayList;

public class Transmission {


    /**
     * Constant ratios
     */
    @Getter
    public float differentialRatio;
    public float reverseGearRatio;


    /**
     * Min & Max Gears
     */
    public int currentGear = 0;
    public int highestGear = 0;


    /**
     * Transmission RPM settings
     */
    public int upshiftRPM;
    public int downshiftRPM;

    public int eUShift = 0;
    public int eDShift = 0;

    /**
     * Transmission Alterable Settings
     */
    public boolean isReverseGear = false;
    public boolean isOnEcoShift = false;


    /*
     * Clutch
     */
    public boolean declutched = false;
    public float slippage = 1.0f;


    /**
     * Vehicle Gears
     */
    public ArrayList<Gear> vehicleGears = new ArrayList<>();

    /**
     * For animations and such
     */
    public int startGear = 1;
    public int targetGear = 1;

    /**
     * Shift timer
     */
    public boolean runningAShift = false;
    public int maxShiftTime = 75;
    public int shiftTimer = 0;


    public boolean isNeutral = true;

    @Getter
    public MechanicalClutch clutch = new MechanicalClutch(0.4);


    /**
     * Creates a new Transmission with various paramets.
     * WARNING: YOU MUST STILL ADD GEARS!!!
     *
     * @param diffRatio The final drive ratio.
     * @param rRatio The vehicle's reverse ratio.
     * @param uRPM The RPM at which the transmission will attempt to upshift
     * @param dRPM The RPM at which the transmission will try to downshift
     */
    public Transmission(float diffRatio, float rRatio, int uRPM, int dRPM) {

        differentialRatio = diffRatio;
        upshiftRPM = uRPM;
        reverseGearRatio = rRatio;
        downshiftRPM = dRPM;
    }

    public boolean inNeutral() {
        return isNeutral;
    }

    public void setNeutral(boolean v) {
        isNeutral = v;
    }


    public int getCurrentGear() {
        if (isReverseGear) {
            return -1;
        }
        return currentGear + 1;
    }

    public void addGear(Gear gear) {
        vehicleGears.add(gear);
        ++highestGear;
    }


    public void declutch() {
        declutched = true;
    }

    public void clutch() {
        declutched = false;
    }

    public boolean isEngineDeclutched() {
        return declutched;
    }


    /**
     * ECO
     */
    public void toggleECO() {
        isOnEcoShift = !isOnEcoShift;
    }

    public void setEcoState(boolean state) {
        isOnEcoShift = state;
    }

    public void ecoOff() {
        isOnEcoShift = false;
    }

    public void ecoOn() {
        isOnEcoShift = true;
    }

    public boolean isEcoModeOn() {
        return isOnEcoShift;
    }

    /**
     * SHIFTING
     */

    public void upShift() {
        //System.out.println("Trying to upshift @ " + getCurrentGear() + " BOOE: " + (getCurrentGear() < vehicleGears.size()));
        if (getCurrentGear() < vehicleGears.size()) {
            currentGear += 1;
        }
    }

    public void downShift() {
        if (currentGear > 0) {
            currentGear -= 1;
        }
    }

    public void forceShift(int targetGear) {
        currentGear = targetGear - 1;
    }

    /**
     * REVERSE
     */

    public void enterReverse() {
        isReverseGear = true;
    }

    public void exitReverse() {
        isReverseGear = false;
    }

    public void notifyShift() {
        runningAShift = true;
        //shiftTimer = 0;
    }

    public void tickTransmission() {

        if (runningAShift) {

            shiftTimer += 1;
        }

        if (shiftTimer >= maxShiftTime) {
            //System.out.println("SHIFT COMPLETED!");
            runningAShift = false;
            shiftTimer = 0;
            startGear = targetGear;
        }
    }

    boolean markedForUpshift = false;
    boolean markedForDownshift = false;

    /**
     * AUTOMATIC TRANSMISSION RUNNER
     *
     */

    public void runAutomaticTransmission(EntityVehicle vehicle, double engineRPM) {

        //this.upshiftRPM = 4000;
        //System.out.println(this.upshiftRPM);

        //tick
        tickTransmission();


        if ((((getCurrentGear() == 1 || isReverseGear) && engineRPM <= vehicle.solver.engine.getIdleRPM()) || (vehicle.solver.getVelocityVector().length() == 0 && vehicle.throttle == 0 && engineRPM < 1100)) && vehicle.getRealSpeed() < 10.0 && !inNeutral()) {
            setNeutral(true);
        } else if (vehicle.solver.getVelocityVector().length() < 0.1 && vehicle.throttle > 0.5 && inNeutral()) {
            vehicle.solver.engineSolver.rpm += 2000;


            setNeutral(false);
        } else if (vehicle.solver.getVelocityVector().length() > 0.1 && vehicle.throttle > 0.2 && inNeutral()) {
            setNeutral(false);
        }

        if (getClutch().getSlippage() != 1) {
            getClutch().getSlippage();
        }


        if (!vehicle.isBraking) {
            int delta = 0;
            if (vehicle.solver.transmission.isReverseGear) {
                delta = 350;
            }
            double nonStallWheelRatio = VehiclePhysUtil.wheelAngularVelocity(vehicle.getSolver().engineSolver.engineTemplate.getIdleRPM() + delta, getCurrentGearRatio(), getDifferentialRatio());
            double wheelAngularVelocity = vehicle.getSolver().rearAxel.getWheelAngularVelocity();

            double mu = Math.min(wheelAngularVelocity / nonStallWheelRatio, 1);

            double pressure = getClutch().engagementPoint + (1.0 - getClutch().engagementPoint) * mu;
            //System.out.println("pressure: " + (1.0-pressure));
            clutch.applyPedalPressure(1.0 - pressure);
        } else {
            clutch.applyPedalPressure(1.0);
        }

        if (vehicle.solver.engineSolver.rpm < 1200 && vehicle.throttle < 0.3) {
            clutch.applyPedalPressure(1.0);
        }


        // cancels automatic transmission update if
        // the car is in reverse

        if (isReverseGear || isEngineDeclutched()) {
            return;
        }


        int uShift;
        int dShift;


        if (!isOnEcoShift) {
            uShift = upshiftRPM;
            dShift = downshiftRPM;
        } else {
            uShift = eUShift;
            dShift = eDShift;
        }


        if (markedForUpshift || markedForDownshift) {
            /*&& !launchControl*/
            markedForUpshift = engineRPM > uShift && (getCurrentGear()) != highestGear && vehicle.throttle > 0.1;

            /*&& vehicle.throttle < 0.5*/
            markedForDownshift = engineRPM < dShift && getCurrentGear() != 1;
        }

        //System.out.println(markedForUpshift);
        if (markedForUpshift) {

            if (runningAShift) {
                double median = maxShiftTime / 2.0;
                if (shiftTimer > median) {
                    startGear = getCurrentGear();
                    shiftTimer = maxShiftTime - shiftTimer;
                }


            } else {
                startGear = getCurrentGear();
            }

            upShift();
            vehicle.notifyOfShift(getCurrentGear());
            targetGear = getCurrentGear();
            notifyShift();
            markedForUpshift = false;

        }


        if (markedForDownshift) {
            if (runningAShift) {
                double median = maxShiftTime / 2.0;
                if (shiftTimer > median) {
                    startGear = getCurrentGear();
                    shiftTimer = maxShiftTime - shiftTimer;
                }


            } else {
                startGear = getCurrentGear();
            }
            downShift();
            vehicle.notifyOfShift(getCurrentGear());
            targetGear = getCurrentGear();
            notifyShift();
            markedForDownshift = false;
            //System.out.println("Shifted down to gear " + getCurrentGear() + " RPM : " + engineRPM);
        }

        if (engineRPM > uShift && (getCurrentGear()) != highestGear && vehicle.throttle > 0.1 /*&& !launchControl*/) {

            markedForUpshift = true;
        }

        if (engineRPM < dShift && getCurrentGear() != 1 /*&& vehicle.throttle < 0.5*/) {
            markedForDownshift = true;
        }

    }

    public Transmission cloneTransmission() {
        Transmission t = this;
        Transmission newT = new Transmission(t.differentialRatio, t.reverseGearRatio, t.upshiftRPM, t.downshiftRPM);
        for (Transmission.Gear g : t.vehicleGears) {
            newT.addGear(g);
        }
        return newT;
    }

    /**
     * GET RATIOS
     *
     */

    public float getCurrentGearRatio() {
        if (isReverseGear) {
            return reverseGearRatio;
        }
        return vehicleGears.get(currentGear).gearRatio;
    }

    /**
     * GEARS
     */


    static class Gear {
        public float gearRatio;

        public Gear(float gR) {
            gearRatio = gR;
        }


    }

    public void gearWithRatio(float gR) {
        vehicleGears.add(new Gear(gR));
        highestGear += 1;
    }

    public Transmission withEcoShift(int upshift, int downShift) {
        eUShift = upshift;
        eDShift = downShift;
        return this;
    }


    /**
     * ENGINE RPM
     */
    public void getEngineSpeed(float driveWheelSpeed) {

    }

    /**
     * QUICK INITIALIZERS FOR EASY TRANSMISSION GENERATION
     */

    public Transmission quickSpeed(float... gears) {
        for (float f : gears) {
            gearWithRatio(f);
        }
        return this;
    }

    public Transmission quickSixSpeed(float one, float two, float three, float four, float five, float six) {
        gearWithRatio(one);
        gearWithRatio(two);
        gearWithRatio(three);
        gearWithRatio(four);
        gearWithRatio(five);
        gearWithRatio(six);
        return this;
    }

    public Transmission quickFiveSpeed(float one, float two, float three, float four, float five) {
        gearWithRatio(one);
        gearWithRatio(two);
        gearWithRatio(three);
        gearWithRatio(four);
        gearWithRatio(five);
        return this;
    }

    public Transmission quickFourSpeed(float one, float two, float three, float four) {
        gearWithRatio(one);
        gearWithRatio(two);
        gearWithRatio(three);
        gearWithRatio(four);
        return this;
    }


}

