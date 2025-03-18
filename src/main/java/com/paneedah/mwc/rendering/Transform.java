package com.paneedah.mwc.rendering;

import dev.redstudio.redcore.math.ClampUtil;
import dev.redstudio.redcore.math.vectors.Vector3F;
import net.minecraft.client.renderer.GlStateManager;

import static com.paneedah.mwc.ProjectConstants.LOGGER;

/**
 * Represents a 3D transformation containing position, pivot point, rotation, and scale.
 * <p>
 * All operations are directly performed on the transform.
 *
 * @author Luna Mira Lage (Desoroxxx)
 * @version 0.2
 */
public final class Transform {

    /**
     * The position vector of the transform.
     */
    public final Vector3F position = new Vector3F();
    /**
     * The pivot point vector of the transform.
     */
    public final Vector3F pivotPoint = new Vector3F();
    /**
     * The rotation vector of the transform.
     * <p>
     * Using Euler angles in the XYZ order.
     * They are applied in the ZYX order.
     *
     * @see #applyTransformations() #applyTransformations() to see how rotations are applied and how to use them.
     * @see <a href="https://en.wikipedia.org/wiki/Euler_angles">Euler Angles <a/>
     */
    public final Vector3F rotation = new Vector3F();
    /**
     * The scale vector of the transform.
     */
    public final Vector3F scale = new Vector3F();

    /**
     * @return A new fully zero transform with a scale of 1
     */
    public static Transform getZero() {
        return new Transform().withScale(1, 1, 1);
    }

    /**
     * Sets the position of the transform in the 3D space.
     * <p>
     * This method updates the x, y, and z values of the position vector.
     * <p>
     * Remember that Y is flipped.
     *
     * @param x The X-coordinate of the position
     * @param y The Y-coordinate of the position
     * @param z The Z-coordinate of the position
     *
     * @return This transform
     */
    public Transform withPosition(final float x, final float y, final float z) {
        position.x = x;
        position.y = y;
        position.z = z;

        return this;
    }

    /**
     * Sets the pivot point of the transform in 3D space.
     * <p>
     * This method updates the x, y, and z values of the pivot point vector.
     *
     * @param x The X-coordinate of the pivot point
     * @param y The Y-coordinate of the pivot point
     * @param z The Z-coordinate of the pivot point
     *
     * @return This transform
     */
    public Transform withPivotPoint(final float x, final float y, final float z) {
        pivotPoint.x = x;
        pivotPoint.y = y;
        pivotPoint.z = z;

        return this;
    }

    /**
     * Sets the rotation of the transform in the 3D space.
     * <p>
     * This method updates the x, y, and z values of the rotation vector.
     * <p>
     * Ensures rotation values are within the range of -360 to 360 degrees.
     *
     * @param x The -X rotation in degrees (tilt clockwise when looking straight at the screen)
     * @param y The -Y rotation in degrees (turn to the right)
     * @param z The +Z rotation in degrees (tilt head downwards)
     *
     * @return This transform
     *
     * @see #applyTransformations() #applyTransformations() to see how rotations are applied and how to use them.
     * @see <a href="https://en.wikipedia.org/wiki/Euler_angles">Euler Angles <a/>
     */
    public Transform withRotation(final float x, final float y, final float z) {
        if (x < -360 || x > 360 || y < -360 || y > 360 || z < -360 || z > 360) {
            LOGGER.warn("Something is setting rotation values exceeding the allowed range.\nClamping to the range of -360 to 360.\nThis will cause visual issues.\nRotation Values: X: {}, Y: {}, Z: {}", x, y, z, new IllegalArgumentException("Rotation Out of Range for Transform"));

            rotation.x = ClampUtil.clampMaxFirst(x, -360, 360);
            rotation.y = ClampUtil.clampMaxFirst(y, -360, 360);
            rotation.z = ClampUtil.clampMaxFirst(z, -360, 360);
        } else {
            rotation.x = x;
            rotation.y = y;
            rotation.z = z;
        }

        return this;
    }

    /**
     * Sets the rotation of the transform in the 3D space.
     * <p>
     * This method updates the x, y, and z values of the rotation vector.
     * <p>
     * Ensures rotation values are within the range of -360 to 360 degrees.
     * <p>
     * Converts Blockbench rotations to the game's and/or render's (still haven't figured it out) rotation system and updates the transform.
     * Specifically, this method inverts the X and Y rotations.
     *
     * @param x The +X rotation in degrees (once converted tilt clockwise when looking straight at the screen)
     * @param y The +Y rotation in degrees (once converted turn to the right)
     * @param z The +Z rotation in degrees (tilt head downwards)
     *
     * @return This transform
     *
     * @see #applyTransformations() #applyTransformations() to see how rotations are applied and how to use them.
     * @see <a href="https://en.wikipedia.org/wiki/Euler_angles">Euler Angles <a/>
     */
    public Transform withBBRotation(final float x, final float y, final float z) {
        withRotation(-x, -y, z);

        return this;
    }

    /**
     * Sets the scale of the transform in the 3D space.
     * <p>
     * This method updates the x, y, and z values of the scale vector.
     * <p>
     * Ensures that the scale values are non-negative.
     *
     * @param x The X scale
     * @param y The Y scale
     * @param z The Z scale
     *
     * @return This transform
     */
    public Transform withScale(final float x, final float y, final float z) {
        if (x < 0 || y < 0 || z < 0) {
            LOGGER.warn("Something is setting one or more negative scale values to a transform.\nClamping to the range of 0 to biggest float.\nThis will cause visual issues.\nScale Values: X: {}, Y: {}, Z: {}", x, y, z, new IllegalArgumentException("Negative Scale for Transform"));

            scale.x = ClampUtil.clampMinFirst(x, 0, Float.MAX_VALUE);
            scale.y = ClampUtil.clampMinFirst(y, 0, Float.MAX_VALUE);
            scale.z = ClampUtil.clampMinFirst(z, 0, Float.MAX_VALUE);
        } else {
            scale.x = x;
            scale.y = y;
            scale.z = z;
        }

        return this;
    }

    /**
     * Copies the values of the vectors from the given transform into this transform vectors.
     *
     * @param transform The source transform to set from
     *
     * @return This transform
     */
    public Transform copy(final Transform transform) {
        position.copy(transform.position);
        pivotPoint.copy(transform.pivotPoint);
        rotation.copy(transform.rotation);
        scale.copy(transform.scale);

        return this;
    }

    /**
     * @return A new, identical copy of this transform
     */
    public Transform duplicate() {
        return new Transform().copy(this);
    }

    /**
     * Applies the transform's position, rotation using the pivot point, and scale to the current OpenGL state using {@link GlStateManager}.
     * <p>
     * The transformations are applied in the following order:
     * <ol>
     *     <li>Translate to the position vector</li>
     *     <li>Translate by the pivot point vector to set the rotation origin</li>
     *     <li>Rotate around the Z-axis (tilt clockwise when looking straight at the screen)</li>
     *     <li>Rotate around the Y-axis (turn to the right)</li>
     *     <li>Rotate around the X-axis (tilt head downwards)</li>
     *     <li>Translate by the pivot point vector to restore the original origin</li>
     *     <li>Scale according to the scale vector</li>
     * </ol>
     * <b>Note:</b> Adjusting the pivot point is essential for ensuring that rotations occur around the desired location.
     *
     * @see GlStateManager#translate(float, float, float)
     * @see GlStateManager#rotate(float, float, float, float)
     * @see GlStateManager#scale(float, float, float)
     * @see <a href="https://en.wikipedia.org/wiki/Euler_angles">Euler Angles <a/>
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
     *          .withPosition(1, 2, 3)
     *          .withPivotPoint(1, 1, 1)
     *          .withRotation(45, 90, 180)
     *          .withScale(1, 2, 2);
     * </pre>
     */
    public void printTransformCreationCode() {
        final String result = String.format("%n new Transform()") +
                String.format("%n        .withPosition(%ff, %ff, %ff)", position.x, position.y, position.z) +
                String.format("%n        .withPivotPoint(%ff, %ff, %ff)", pivotPoint.x, pivotPoint.y, pivotPoint.z) +
                String.format("%n        .withRotation(%ff, %ff, %ff)", rotation.x, rotation.y, rotation.z) +
                String.format("%n        .withScale(%ff, %ff, %ff)", scale.x, scale.y, scale.z);

        LOGGER.info(result);
    }
}
