package com.paneedah.mwc.vectors;

import net.jafama.FastMath;
import net.minecraft.util.math.Vec3d;

/**
 * Represents a three-dimensional vector with `x`, `y`, and `z` coordinates using double.
 * <p>
 * The double version of my vectors are not polished, and are made for Modern Warfare Cubed.
 * <p>
 * Which means that they are probably not as good as the float version.
 * <p>
 * For example, they contain reference to Minecraft.
 * @author Desoroxxx
 */
public class Vector3D {

    /** The X coordinate */
    public double x;
    /** The Y coordinate */
    public double y;
    /** The Z coordinate */
    public double z;

    /**
     * Constructs a new empty vector.
     */
    public Vector3D() {
    }

    /**
     * Constructs a new vector with the given `x`, `y`, and `z` coordinates.
     *
     * @param inputX The X coordinate
     * @param inputY The Y coordinate
     * @param inputZ The Z coordinate
     */
    public Vector3D(double inputX, double inputY, double inputZ) {
        x = inputX;
        y = inputY;
        z = inputZ;
    }

    /**
     * Constructs a new vector with the same coordinates as the given `inputVector` vector.
     *
     * @param inputVector The vector to copy the coordinates from
     */
    public Vector3D(Vector3D inputVector) {
        x = inputVector.x;
        y = inputVector.y;
        z = inputVector.z;
    }

    /**
     * Copies the coordinates of the given vector to this vector.
     *
     * @param inputVector The vector to copy from
     */
    public void copy(Vector3D inputVector) {
        x = inputVector.x;
        y = inputVector.y;
        z = inputVector.z;
    }

    /**
     * Sets the coordinates of this vector to the given `x`, `y`, and `z` values.
     *
     * @param inputX The X coordinate
     * @param inputY The Y coordinate
     * @param inputZ The Z coordinate
     */
    public void set(double inputX, double inputY, double inputZ) {
        x = inputX;
        y = inputY;
        z = inputZ;
    }

    /**
     * Adds the given vector to this vector.
     *
     * @param inputVector The vector to add
     */
    public void add(Vector3D inputVector) {
        x += inputVector.x;
        y += inputVector.y;
        z += inputVector.z;
    }

    /**
     * Sets all coordinates of this vector to zero.
     */
    public void zero() {
        x = y = z = 0;
    }

    /**
     * Scales the coordinates of this vector by the given multiplier.
     *
     * @param multiplier The value to multiply the coordinates by
     */
    public void scale(double multiplier) {
        x *= multiplier;
        y *= multiplier;
        z *= multiplier;
    }

    /**
     * Calculates a new vector by interpolating between the coordinates of the current vector and another given vector using linear interpolation.
     * <p>
     * The interpolation is based on a given partial ticks value, which represents a fraction of the elapsed time between
     * two frames in a frame-based animation. The method sets the coordinates of the new vector to the interpolated values,
     * allowing the caller to smoothly animate an object from one position to another.
     *
     * @param previousVector The previous vector to interpolate from
     * @param partialTicks The fraction of elapsed time between two frames in a frame-based animation
     * @param newVector The new vector to store the interpolated coordinates in
     */
    public void partialVector(Vector3D previousVector, double partialTicks, Vector3D newVector) {
        newVector.x = previousVector.x + (x - previousVector.x) * partialTicks;
        newVector.y = previousVector.y + (y - previousVector.y) * partialTicks;
        newVector.z = previousVector.z + (z - previousVector.z) * partialTicks;
    }

    public double distanceTo(Vector3D vector) {
        double xDistance = vector.x - x;
        double yDistance = vector.y - y;
        double zDistance = vector.z - z;
        return FastMath.sqrt(xDistance * xDistance + yDistance * yDistance + zDistance * zDistance);
    }

    // Minecraft's vectors conversions below...
    // It is sad we need to do this, but it sadly we need to...
    // So at least let's keep it under here, so we know where it is.

    public Vector3D(Vec3d vec3d) {
        x = vec3d.x;
        y = vec3d.y;
        z = vec3d.z;
    }

    public Vec3d toVec3d() {
        return new Vec3d(x, y, z);
    }
}
