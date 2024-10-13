package com.paneedah.weaponlib.vehicle.jimphysics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Very useful tire size calculator
 *
 * @author Jim Holden, 2021
 */
public class TyreSize {

    // STATIC PROPERTIES
    public static final Pattern numPattern = Pattern.compile("\\d+");
    public static final Matcher numMatcher = numPattern.matcher("");


    public String sizeString;

    // TIRE PROPERTIES in (m)
    public double width;
    public double diameter;
    public double radius;
    public double circumference;
    public double sideWall;

    /**
     * Tyre Size
     *
     */
    public TyreSize(String ss) {
        sizeString = ss;

        // https://devqa.io/extract-numbers-string-java-regular-expressions/
        numMatcher.reset(sizeString);
        int[] p = new int[3];
        for (int x = 0; x < 3; ++x) {
            numMatcher.find();
            p[x] = Integer.parseInt(numMatcher.group());
        }

        // initialize parameters
        width = p[0];
        sideWall = p[0] * (p[1] / 100.0);
        diameter = (p[2] * 25.4) + (sideWall * 2);
        radius = diameter / 2;
        circumference = diameter * Math.PI;

    }

    /**
     * Converts millimeters to meters
     *
     * @return Magnitude in meters (m)
     */
    public double toM(double mm) {
        return mm / 1000.0;
    }

    public double getRadius() {
        return toM(radius);
    }

    public double getDiamter() {
        return toM(diameter);
    }

    public double getWidth() {
        return toM(width);
    }

    public double getCircumference() {
        return toM(circumference);
    }

    public double getSideWall() {
        return toM(sideWall);
    }

}
