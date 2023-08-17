package com.paneedah.mwc.rendering;

import io.redstudioragnarok.redcore.vectors.Vector3D;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.utils.ModReference.LOG;

public final class Transform {

    public static final Transform ZERO = new Transform().withPosition(0, 0, 0).withRotation(0, 0, 0).withRotationPoint(0, 0, 0).withScale(1, 1, 1);

    public final Vector3D position = new Vector3D();
    public final Vector3D rotationPoint = new Vector3D();
    public final Vector3D rotation = new Vector3D();
    public final Vector3D scale = new Vector3D();

    public Transform withPosition(final double x, final double y, final double z) {
        position.set(x, y, z);
        return this;
    }

    public Transform withRotationPoint(final double x, final double y, final double z) {
        rotationPoint.set(x, y, z);
        return this;
    }

    /**
     * When going from Blockbench to the game, the X and Y rotations are inverted. Todo: Why?
     * This method will automatically convert it for you.
     */
    public Transform withBBRotation(final double x, final double y, final double z) {
        rotation.set(-x, -y, z);
        return this;
    }

    public Transform withRotation(final double x, final double y, final double z) {
        rotation.set(x, y, z);
        return this;
    }

    public Transform withScale(final double x, final double y, final double z) {
        scale.set(x, y, z);
        return this;
    }

    public void copy(final Transform transform) {
        position.copy(transform.position);
        rotationPoint.copy(transform.rotationPoint);
        rotation.copy(transform.rotation);
        scale.copy(transform.scale);
    }

    public Transform copy() {
        final Transform transformCopy = new Transform();

        transformCopy.position.copy(position);
        transformCopy.rotationPoint.copy(rotationPoint);
        transformCopy.rotation.copy(rotation);
        transformCopy.scale.copy(scale);

        return transformCopy;
    }

    public void doGLDirect() {
        GL11.glTranslated(position.x, position.y, position.z);

        // Offset rotation point
        GL11.glTranslated(rotationPoint.x, rotationPoint.y, rotationPoint.z);

        // This is aero-spatial euler angles we need to know what Blockbench uses, since it seems odd that a modern day software uses that
        GL11.glRotated(rotation.z, 0, 0, 1);
        GL11.glRotated(rotation.y, 0, 1, 0);
        GL11.glRotated(rotation.x, 1, 0, 0);

        // Revert rotation point
        GL11.glTranslated(-rotationPoint.x, -rotationPoint.y, -rotationPoint.z);

        GL11.glScaled(scale.x, scale.y, scale.z);
    }

    public void printTransformCreationCode() {
        final String result = String.format("%n new Transform()") +
                String.format("%n.withPosition(%ff, %ff, %ff)", position.x, position.y, position.z) +
                String.format("%n.withRotationPoint(%ff, %ff, %ff)", rotationPoint.x, rotationPoint.y, rotationPoint.z) +
                String.format("%n.withRotation(%ff, %ff, %ff)", rotation.x, rotation.y, rotation.z) +
                String.format("%n.withScale(%ff, %ff, %ff)", scale.x, scale.y, scale.z);

        LOG.info(result);
    }
}
