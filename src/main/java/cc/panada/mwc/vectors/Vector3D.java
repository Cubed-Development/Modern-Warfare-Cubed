package cc.panada.mwc.vectors;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a three-dimensional vector with `x`, `y`, and `z` coordinates.
 * <p>
 * By Red Studio
 * <p>
 * Created & Maintained by Desoroxxx
 */
public class Vector3D {

	/** The X coordinate */
	public float x;
	/** The Y coordinate */
	public float y;
	/** The Z coordinate */
	public float z;

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
	public Vector3D(final float inputX, final float inputY, final float inputZ) {
		x = inputX;
		y = inputY;
		z = inputZ;
	}

	/**
	 * Constructs a new vector with the same coordinates as the given `inputVector` vector.
	 *
	 * @param inputVector The vector to copy the coordinates from
	 */
	public Vector3D(@NotNull final Vector3D inputVector) {
		x = inputVector.x;
		y = inputVector.y;
		z = inputVector.z;
	}

	/**
	 * Copies the coordinates of the given vector to this vector.
	 *
	 * @param inputVector The vector to copy from
	 */
	public void copy(@NotNull final Vector3D inputVector) {
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
	public void set(final float inputX, final float inputY, final float inputZ) {
		x = inputX;
		y = inputY;
		z = inputZ;
	}

	/**
	 * Adds the given vector to this vector.
	 *
	 * @param inputVector The vector to add
	 */
	public void add(@NotNull final Vector3D inputVector) {
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
	public void scale(final float multiplier) {
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
	public void partialVector(@NotNull final Vector3D previousVector, final float partialTicks, @NotNull final Vector3D newVector) {
		newVector.x = previousVector.x + (x - previousVector.x) * partialTicks;
		newVector.y = previousVector.y + (y - previousVector.y) * partialTicks;
		newVector.z = previousVector.z + (z - previousVector.z) * partialTicks;
	}
}
