package cc.panada.mwc.vectors;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a two-dimensional vector with `x` and `y` coordinates.
 * <p>
 * By Red Studio
 * <p>
 * Created & Maintained by Desoroxxx
 */
public class Vector2D {

    /** The x component of this vector. */
    public float x;
    /** The y component of this vector. */
    public  float y;

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
    public Vector2D(final float inputX, final float inputY) {
        x = inputX;
        y = inputY;
    }

    /**
     * Constructs a new vector with the same coordinates as the given `inputVector` vector.
     *
     * @param inputVector The vector to copy the coordinates from
     */
    public Vector2D(@NotNull final Vector2D inputVector) {
        x = inputVector.x;
        y = inputVector.y;
    }

    /**
     * Copies the coordinates of the given vector to this vector.
     *
     * @param inputVector The vector to copy from
     */
    public void copy(@NotNull final Vector2D inputVector) {
        x = inputVector.x;
        y = inputVector.y;
    }

    /**
     * Sets the coordinates of this vector to the given `x`, and `y` values.
     *
     * @param inputX The X coordinate
     * @param inputY The Y coordinate
     */
    public void set(final float inputX, final float inputY) {
        x = inputX;
        y = inputY;
    }

    /**
     * Adds the given vector to this vector.
     *
     * @param inputVector The vector to add
     */
    public void add(@NotNull final Vector2D inputVector) {
        x += inputVector.x;
        y += inputVector.y;
    }

    /**
     * Sets all coordinates of this vector to zero.
     */
    public void zero() {
        x = y = 0;
    }

    /**
     * Scales the coordinates of this vector by the given multiplier.
     *
     * @param multiplier The value to multiply the coordinates by
     */
    public void scale(final float multiplier) {
        x *= multiplier;
        y *= multiplier;
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
    public void partialVector(@NotNull final Vector2D previousVector, final float partialTicks, @NotNull final Vector2D newVector) {
        newVector.x = previousVector.x + (x - previousVector.x) * partialTicks;
        newVector.y = previousVector.y + (y - previousVector.y) * partialTicks;
    }
}
