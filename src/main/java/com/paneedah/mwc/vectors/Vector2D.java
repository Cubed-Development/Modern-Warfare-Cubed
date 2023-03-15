package com.paneedah.mwc.vectors;

/**
 * Represents a two-dimensional vector with `x` and `y` coordinates using double.
 * @author Desoroxxx
 */
public class Vector2D {

    /** The x component of this vector. */
    public double x;
    /** The y component of this vector. */
    public double y;

    /**
     * Constructs a new empty vector.
     */
    public Vector2D() {
    }

    /**
     * Constructs a new vector with the given x and y coordinates.
     *
     * @param inputX The X coordinate
     * @param inputY The Y coordinate
     */
    public Vector2D(double inputX, double inputY) {
        x = inputX;
        y = inputY;
    }
}
