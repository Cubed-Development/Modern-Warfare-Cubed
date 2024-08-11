package com.paneedah.weaponlib.vehicle.jimphysics;

import com.paneedah.weaponlib.vehicle.EntityVehicle;

import java.util.ArrayList;

public class Transmission {


    /**
     * Constant ratios
     */
    public float differentialRatio = 0.0F;
    public float reverseGearRatio = 0.0F;


    /**
     * Min & Max Gears
     */
    public int currentGear = 0;
    public int highestGear = 0;


    /**
     * Transmission RPM settings
     */
    public int upshiftRPM = 0;
    public int downshiftRPM = 0;

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
        return this.isNeutral;
    }

    public void setNeutral(boolean v) {
        this.isNeutral = v;
    }

    public MechanicalClutch getClutch() {
        return this.clutch;
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
        this.isOnEcoShift = !this.isOnEcoShift;
    }

    public void setEcoState(boolean state) {
        this.isOnEcoShift = state;
    }

    public void ecoOff() {
        this.isOnEcoShift = false;
    }

    public void ecoOn() {
        this.isOnEcoShift = true;
    }

    public boolean isEcoModeOn() {
        return this.isOnEcoShift;
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
     * @param engineRPM
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
            //System.out.println("sussy");


            //vehicle.clutchTimer = 0;
            //clutch.applyPedalPressure(1.0-getClutch().engagementPoint);
            setNeutral(false);
        } else if (vehicle.solver.getVelocityVector().length() > 0.1 && vehicle.throttle > 0.2 && inNeutral()) {
            setNeutral(false);
        }

        if (this.getClutch().getSlippage() != 1 && this.getClutch().getSlippage() != 0) {

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
        //System.out.println(vehicle.solver.getLongitudinalSpeed());
        //System.out.println("conditions: " + (vehicle.solver.getVelocityVector().length() == 0.0 && vehicle.throttle > 0.5));
        //System.out.println("shawty " + vehicle.throttle + " | " + vehicle.solver.getVelocityVector().length());


        //System.out.println(clutch.getSlippage());
        //System.out.println("Pedal Pressure: " + clutch.pedalPressure);
        //System.out.println(1.0-pressure);


        int uShift = 0;
        int dShift = 0;


        if (!isOnEcoShift) {
            uShift = this.upshiftRPM;
            dShift = this.downshiftRPM;
        } else {
            uShift = this.eUShift;
            dShift = this.eDShift;
        }


        if (markedForUpshift || markedForDownshift) {
            if (engineRPM > uShift && (this.getCurrentGear()) != highestGear && vehicle.throttle > 0.1 /*&& !launchControl*/) {
                markedForUpshift = true;
            } else {

                markedForUpshift = false;
            }

            if (engineRPM < dShift && this.getCurrentGear() != 1 /*&& vehicle.throttle < 0.5*/) {
                markedForDownshift = true;
            } else {
                markedForDownshift = false;
            }
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

        if (engineRPM > uShift && (this.getCurrentGear()) != highestGear && vehicle.throttle > 0.1 /*&& !launchControl*/) {

            markedForUpshift = true;
        }

        if (engineRPM < dShift && this.getCurrentGear() != 1 /*&& vehicle.throttle < 0.5*/) {
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
     * @return
     */

    public float getCurrentGearRatio() {
        if (isReverseGear) {
            return reverseGearRatio;
        }
        return vehicleGears.get(currentGear).gearRatio;
    }

    public float getDifferentialRatio() {
        return differentialRatio;
    }

    /**
     * GEARS
     */


    class Gear {
        public float gearRatio = 0.0F;

        public Gear(float gR) {
            gearRatio = gR;
        }


    }

    public void gearWithRatio(float gR) {
        vehicleGears.add(new Gear(gR));
        highestGear += 1;
    }

    public Transmission withEcoShift(int upshift, int downShift) {
        this.eUShift = upshift;
        this.eDShift = downShift;
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

