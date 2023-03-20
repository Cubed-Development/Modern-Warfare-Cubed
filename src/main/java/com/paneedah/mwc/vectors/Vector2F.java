package com.paneedah.mwc.vectors;

/**
 * Represents a two-dimensional vector with `x` and `y` coordinates using float.
 * @author Desoroxxx
 */
public class Vector2F {

    /** The x component of this vector. */
    public float x;
    /** The y component of this vector. */
    public float y;

    /**
     * Constructs a new empty vector.
     */
    public Vector2F() {
    }

    /**
     * Constructs a new vector with the given x and y coordinates.
     *
     * @param inputX The X coordinate
     * @param inputY The Y coordinate
     */
    public Vector2F(float inputX, float inputY) {
        x = inputX;
        y = inputY;
    }
}
