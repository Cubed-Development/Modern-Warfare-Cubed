package com.paneedah.weaponlib.vehicle.jimphysics;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Engine {

    private int maxRPM = 0;
    private int redlineRPM = 0;
    private int idleRPM = 0;

    private String engineName;
    private String engineBrand;

    public LinkedHashMap<Double, Double> torqueCurve = new LinkedHashMap<Double, Double>();

    public Engine(String name, String engineBrand, int maxRPM, int redLine, int idleRPM) {
        this.engineName = name;
        this.engineBrand = engineBrand;
        this.maxRPM = maxRPM;
        this.redlineRPM = redLine;
        this.idleRPM = idleRPM;
        setupTorqueCurve();

    }

    public void addPoint(double rpm, double nm) {
        torqueCurve.put(rpm, nm);
    }

    public void setupTorqueCurve() {}

    public double getTorqueAtRPM(double rpm) {

        if (rpm < getIdleRPM()) {
            return 0;
        }

        if (torqueCurve.containsKey(rpm)) {
            return torqueCurve.get(rpm);
        }
        double firstBound = 0;
        double secondBound = 0;


        ArrayList<Double> keys = new ArrayList<Double>();
        keys.addAll(torqueCurve.keySet());
        for (int f = 0; f < keys.size() - 1; ++f) {
            double min = keys.get(f);
            double max = keys.get(f + 1);
            if (min < rpm && rpm < max) {
                firstBound = min;
                secondBound = max;
            }
        }


        // retrieve curve values
        double t1 = torqueCurve.get(firstBound);
        double t2 = torqueCurve.get(secondBound);

        // Calculate step
        double tStep = (((double) rpm) - firstBound) / (secondBound - firstBound);
        double stepped = t1 + (t2 - t1) * tStep;
        //	System.out.println("F: " + firstBound + " | S: " + secondBound + " | tS: " + tStep + " | T1: " + t1 + " | T2: " + t2 + " | st: " + stepped);

        return stepped;

    }

    public int getIdleRPM() {
        return this.idleRPM;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public String getEngineName() {
        return engineName;
    }

    public int getMaxRPM() {
        return this.maxRPM;
    }

    public int getRedline() {
        return this.redlineRPM;
    }
}
