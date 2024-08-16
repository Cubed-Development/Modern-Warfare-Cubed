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
     * @param Tyre Sizing (ex. 315/30R20)
     */
    public TyreSize(String ss) {
        this.sizeString = ss;

        // https://devqa.io/extract-numbers-string-java-regular-expressions/
        numMatcher.reset(sizeString);
        int[] p = new int[3];
        for (int x = 0; x < 3; ++x) {
            numMatcher.find();
            p[x] = Integer.parseInt(numMatcher.group());
        }

        // initialize parameters
        this.width = p[0];
        this.sideWall = p[0] * (p[1] / 100.0);
        this.diameter = (p[2] * 25.4) + (this.sideWall * 2);
        this.radius = this.diameter / 2;
        this.circumference = this.diameter * Math.PI;

    }

    /**
     * Converts millimeters to meters
     *
     * @param Magnitude in millimeters (mm)
     *
     * @return Magnitude in meters (m)
     */
    public double toM(double mm) {
        return mm / 1000.0;
    }

    public double getRadius() {
        return toM(this.radius);
    }

    public double getDiamter() {
        return toM(this.diameter);
    }

    public double getWidth() {
        return toM(this.width);
    }

    public double getCircumference() {
        return toM(this.circumference);
    }

    public double getSideWall() {
        return toM(this.sideWall);
    }

}
