package com.paneedah.weaponlib.vehicle.jimphysics.stability;

import com.paneedah.mwc.utils.InterpolationUtil;
import lombok.Setter;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;

public class InertialStabilizer {

    // INERTIA TENSOR (X, Y, Z)
    public Vec3d tensor = new Vec3d(0, 0, 0);


    @Setter public Vec3d position = new Vec3d(0, 0, 0);
    @Setter public Vec3d positionTarget = new Vec3d(0, 0, 0);

    public Vec3d rP = new Vec3d(0, 0, 0);
    public Vec3d prevRP = new Vec3d(0, 0, 0);


    // CURRENT VALUES
    public double rotationYaw;
    public double rotationPitch;
    public double rotationRoll;

    // PREVIOUS VALUES
    public double prevRotationYaw;
    public double prevRotationPitch;
    public double prevRotationRoll;


    public InertialStabilizer(Vec3d tensor) {
        this.tensor = tensor;
    }


    /*
     * OPENGL TOOLS
     */

    public void applyVectorGLTranslation(Vec3d position) {
        GlStateManager.translate(position.x, position.y, position.z);
    }


    public void applyVectorGLRotation(Vec3d rotation) {
        applyVectorGLRotation(rotation.x, rotation.y, rotation.z);
    }

    public void applyVectorGLRotation(double yaw, double pitch, double roll) {
        GlStateManager.rotate((float) position.z, 0, 0, (float) roll);
        GlStateManager.rotate((float) position.y, 0, (float) pitch, 0);
        GlStateManager.rotate((float) position.x, (float) yaw, 0, 0);
    }

    /*
     * APPLICATION
     */
    public void updateCameraTransforms() {
        // POSITION ADJUSTMENTS //

        position = InterpolationUtil.interpolateVector(position, positionTarget, 0.005);
        prevRotationRoll = rotationRoll;
        double change = positionTarget.y - position.y;

        rotationPitch += change * 0.3;
        double dampener = 0.1;
        System.out.println(rotationPitch);
        if (rotationPitch > 0) {
            rotationPitch -= -(0 - rotationPitch) * dampener;
        } else if (rotationPitch < 0) {
            rotationPitch += (0 - rotationPitch) * dampener;
        }

        //double iy = InterpolationKit.interpolateValue(prevRotationRoll, rotationRoll, MC.getRenderPartialTicks());

        GlStateManager.translate(0.0, rotationPitch, 0.0);


        //System.out.println("Change in Height: " + changeInHeight + "m");

    }

}
