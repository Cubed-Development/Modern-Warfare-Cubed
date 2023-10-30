package com.paneedah.mwc.rendering;

import dev.redstudio.redcore.utils.MathUtil;
import dev.redstudio.redcore.vectors.Vector3F;
import net.minecraft.client.renderer.GlStateManager;

import static com.paneedah.mwc.utils.ModReference.LOG;

/**
 * Represents a 3D transformation containing position, rotation, scale, and rotation pivot point.
 * <p>
 * This class allows the manipulation of 3D transformations typically used for graphics.
 * The transformations can be applied to objects in a 3D space, providing capabilities to move, rotate, and scale them.
 * <p>
 * All operations are directly performed on the transform.
 *
 * @author Luna Lage (Desoroxxx)
 * @version 0.1
 */
public final class Transform {

    public static final Transform ZERO = new Transform().withScale(1, 1, 1);

    /**
     * Position vector of the transform.
     */
    public final Vector3F position = new Vector3F();
    /**
     * Point around which the rotation occurs.
     */
    public final Vector3F pivotPoint = new Vector3F();
    /**
     * Euler angles representing the rotation in the XYZ order.
     * Which are applied in the ZYX order.
     * <p>
     * See {@link #applyTransformations()} to see how rotations are applied and how to use them.
     *
     * @see <a href="https://en.wikipedia.org/wiki/Euler_angles">Euler Angles <a/>
     */
    public final Vector3F rotation = new Vector3F();
    /**
     * Scale vector of the transform.
     */
    public final Vector3F scale = new Vector3F();

    /**
     * Sets the position of the transform in the 3D space.
     * <p>
     * This method updates the x, y, and z coordinates for the position.
     * <p>
     * Remember that Y is flipped.
     *
     * @param x The X-coordinate of the position.
     * @param y The Y-coordinate of the position.
     * @param z The Z-coordinate of the position.
     *
     * @return The updated transform with the new position.
     */
    public Transform withPosition(final float x, final float y, final float z) {
        position.set(x, y, z);
        return this;
    }

    /**
     * Updates the pivot point of the transform in 3D space.
     * <p>
     * This method modifies the x, y, and z coordinates for the pivot point.
     *
     * @param x The X-coordinate of the pivot point.
     * @param y The Y-coordinate of the pivot point.
     * @param z The Z-coordinate of the pivot point.
     *
     * @return The updated transform with the new pivot point.
     */
    public Transform withPivotPoint(final float x, final float y, final float z) {
        pivotPoint.set(x, y, z);
        return this;
    }

    /**
     * Sets the rotation of the transform in the 3D space.
     * <p>
     * Ensures rotation values are within the range of -360 to 360 degrees.
     *
     * @param x -X rotation in degrees (tilt clockwise when looking straight at the screen).
     * @param y -Y rotation in degrees (turn to the right).
     * @param z +Z rotation in degrees (tilt head downwards).
     *
     * @return The updated transform with the specified rotation.
     */
    public Transform withRotation(final float x, final float y, final float z) {
        if (x < -360 || x > 360 || y < -360 || y > 360 || z < -360 || z > 360) {
            LOG.warn(String.format("Something is setting rotation values exceeding the allowed range.%nClamping to the range of -360 to 360.%nThis will cause visual issues.%nRotation Values: X: %s, Y: %s, Z: %s", x, y, z), new IllegalArgumentException("Rotation Out of Range for Transform"));

            rotation.set(MathUtil.clampMaxFirst(x, -360, 360), MathUtil.clampMaxFirst(y, -360, 360), MathUtil.clampMaxFirst(z, -360, 360));
        } else
            rotation.set(x, y, z);

        return this;
    }

    /**
     * Converts Blockbench rotations to the game's and/or render's (still haven't figured it out) rotation system and updates the transform.
     * <p>
     * Specifically, this method inverts the X and Y rotations and ensures the values are within the allowed range.
     *
     * @param x X rotation in degrees.
     * @param y Y rotation in degrees.
     * @param z Z rotation in degrees.
     *
     * @return The updated transform with the converted rotations.
     */
    public Transform withBBRotation(final float x, final float y, final float z) {
        final float negativeX = -x;
        final float negativeY = -y;

        if (negativeX < -360 || negativeX > 360 || negativeY < -360 || negativeY > 360 || z < -360 || z > 360) {
            LOG.warn(String.format("Something is setting rotation values exceeding the allowed range.%nClamping to the range of -360 to 360.%nThis will cause visual issues.%nRotation Values: X: %s, Y: %s, Z: %s%nBlockbench Rotation Values: X: %s, Y: %s, Z: %s", negativeX, negativeY, z, x, y, z), new IllegalArgumentException("Rotation Out of Range for Transform"));

            rotation.set(MathUtil.clampMaxFirst(negativeX, -360, 360), MathUtil.clampMaxFirst(negativeY, -360, 360), MathUtil.clampMaxFirst(z, -360, 360));
        } else
            rotation.set(negativeX, negativeY, z);

        return this;
    }

    /**
     * Sets the scale of the transform in the 3D space.
     * <p>
     * Ensures that the scale values are non-negative.
     *
     * @param x X scale.
     * @param y Y scale.
     * @param z Z scale.
     *
     * @return The updated transform with the specified scale.
     */
    public Transform withScale(final float x, final float y, final float z) {
        if (x < 0 || y < 0 || z < 0) {
            LOG.warn(String.format("Something is setting a negative scale value to a transform.%nClamping to the range of 0 to biggest float.%nThis will cause visual issues.%nTransform Scale: X: %s, Y: %s, Z: %s", x, y, z), new IllegalArgumentException("Negative Scale for Transform"));

            scale.set(MathUtil.clampMinFirst(x, 0, Float.MAX_VALUE), MathUtil.clampMinFirst(y, 0, Float.MAX_VALUE), MathUtil.clampMinFirst(z, 0, Float.MAX_VALUE));
        } else
            scale.set(x, y, z);

        return this;
    }

    /**
     * Copies the values from the given transform into this transform.
     *
     * @param transform The source transform to set from
     */
    public void copy(final Transform transform) {
        position.copy(transform.position);
        pivotPoint.copy(transform.pivotPoint);
        rotation.copy(transform.rotation);
        scale.copy(transform.scale);
    }

    /**
     * Creates a set of this transform and returns it.
     *
     * @return A new Transform object that is a set of this transform
     */
    public Transform duplicate() {
        final Transform transformCopy = new Transform();

        transformCopy.position.copy(position);
        transformCopy.pivotPoint.copy(pivotPoint);
        transformCopy.rotation.copy(rotation);
        transformCopy.scale.copy(scale);

        return transformCopy;
    }

    /**
     * Applies a series of transformations to the current OpenGL state using {@link GlStateManager}.
     * <p>
     * The transformations occur in the following order:
     * <ol>
     *     <li>Translation to the specified position.</li>
     *     <li>Move the pivot point to a specified location.</li>
     *     <li>Rotation about the Z-axis (tilt clockwise when looking straight at the screen).</li>
     *     <li>Rotation about the Y-axis (turn to the right).</li>
     *     <li>Rotation about the X-axis (tilt head downwards).</li>
     *     <li>Return the pivot point back to its original location.</li>
     *     <li>Scaling as per specified dimensions.</li>
     * </ol>
     * </p>
     * Note: The pivot point movement is crucial for ensuring rotations occur around the desired location.
     *
     * @see GlStateManager#translate(float, float, float)
     * @see GlStateManager#rotate(float, float, float, float)
     * @see GlStateManager#scale(float, float, float)
     */
    public void applyTransformations() {
        GlStateManager.translate(position.x, position.y, position.z);

        // Move the pivot point to the desired location
        // This ensures subsequent rotations occur around this point
        GlStateManager.translate(pivotPoint.x, pivotPoint.y, pivotPoint.z);

        // Rotation (+Z, -Y, -X)
        GlStateManager.rotate(rotation.z, 0, 0, 1); // +Z rotation (tilt clockwise when looking straight at the screen)
        GlStateManager.rotate(rotation.y, 0, 1, 0); // -Y rotation (turn to the right)
        GlStateManager.rotate(rotation.x, 1, 0, 0); // -X rotation (tilt head downwards)

        // Return the pivot point back to its original location.
        GlStateManager.translate(-pivotPoint.x, -pivotPoint.y, -pivotPoint.z);

        GlStateManager.scale(scale.x, scale.y, scale.z);
    }

    /**
     * Outputs a log containing initialization code for the current transform state.
     * Useful for debugging and generating setup code.
     * <p>
     * Example output:
     * <pre>
     *  new Transform()
     * .withPosition(1.0f, 2.0f, 3.0f)
     * .withPivotPoint(1.0f, 1.0f, 1.0f)
     * .withRotation(45.0f, 90.0f, 180.0f)
     * .withScale(1.0f, 2.0f, 2.0f);
     * </pre>
     */
    public void printTransformCreationCode() {
        final String result = String.format("%n new Transform()") +
                String.format("%n.withPosition(%ff, %ff, %ff)", position.x, position.y, position.z) +
                String.format("%n.withPivotPoint(%ff, %ff, %ff)", pivotPoint.x, pivotPoint.y, pivotPoint.z) +
                String.format("%n.withRotation(%ff, %ff, %ff)", rotation.x, rotation.y, rotation.z) +
                String.format("%n.withScale(%ff, %ff, %ff)", scale.x, scale.y, scale.z);

        LOG.info(result);
    }
}
