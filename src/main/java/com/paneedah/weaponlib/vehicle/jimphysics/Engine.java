package com.paneedah.weaponlib.vehicle.jimphysics;

import lombok.Getter;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Engine {

    @Getter
    private int maxRPM;
    private int redlineRPM;
    @Getter
    private int idleRPM;

    @Getter
    private final String engineName;
    @Getter
    private final String engineBrand;

    public LinkedHashMap<Double, Double> torqueCurve = new LinkedHashMap<Double, Double>();

    public Engine(String name, String engineBrand, int maxRPM, int redLine, int idleRPM) {
        engineName = name;
        this.engineBrand = engineBrand;
        this.maxRPM = maxRPM;
        redlineRPM = redLine;
        this.idleRPM = idleRPM;
        setupTorqueCurve();

    }

    public void addPoint(double rpm, double nm) {
        torqueCurve.put(Double.valueOf(rpm), Double.valueOf(nm));
    }

    public void setupTorqueCurve() {}

    public double getTorqueAtRPM(double rpm) {

        if (rpm < getIdleRPM()) {
            return 0;
        }

        if (torqueCurve.containsKey(Double.valueOf(rpm))) {
            return torqueCurve.get(Double.valueOf(rpm)).doubleValue();
        }
        double firstBound = 0;
        double secondBound = 0;


        ArrayList<Double> keys = new ArrayList<Double>(torqueCurve.keySet());
        for (int f = 0; f < keys.size() - 1; ++f) {
            double min = keys.get(f).doubleValue();
            double max = keys.get(f + 1).doubleValue();
            if (min < rpm && rpm < max) {
                firstBound = min;
                secondBound = max;
            }
        }


        // retrieve curve values
        double t1 = torqueCurve.get(Double.valueOf(firstBound)).doubleValue();
        double t2 = torqueCurve.get(Double.valueOf(secondBound)).doubleValue();

        // Calculate step
        double tStep = (rpm - firstBound) / (secondBound - firstBound);
        //	System.out.println("F: " + firstBound + " | S: " + secondBound + " | tS: " + tStep + " | T1: " + t1 + " | T2: " + t2 + " | st: " + stepped);

        return t1 + (t2 - t1) * tStep;

    }

    public int getRedline() {
        return redlineRPM;
    }
}
