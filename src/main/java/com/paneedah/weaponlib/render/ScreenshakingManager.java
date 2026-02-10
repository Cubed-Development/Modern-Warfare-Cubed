package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.ClientModContext;
import com.paneedah.weaponlib.Pair;
import com.paneedah.weaponlib.animation.MatrixHelper;
import com.paneedah.weaponlib.numerical.SpringVector;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;

/**
 * Manages smooth, spring-based screen shake for weapons.
 */
public class ScreenshakingManager {

    // Spring vector controlling shake
    public SpringVector springVector = new SpringVector(1, 2, 2);

    // Current interpolated position for rendering
    public Vec3d interpolated = Vec3d.ZERO;


    public double dt = 1.0 / 120.0;
    public long lastUpdateTime = System.currentTimeMillis();
    public double accumulator = 0;

    /**
     * Apply an impulse to the spring based on the magnitude of an event
     * (e.g., firing a weapon).
     *
     * @param mag The magnitude of the impulse
     */
    public void impulse(double mag) {
        // Apply directional velocity to spring
        double x = -1 * mag;
        double z = 1.05 * mag;
        double y = 0;
        springVector.addVelocity(x, y, z);
    }

    /**
     * Update the spring simulation with a fixed timestep and interpolate
     * using partialTicks.
     *
     * @param partialTicks Fraction of the current tick elapsed
     */
    public void update(float partialTicks) {
        // Calculate frame time
        long now = System.currentTimeMillis();
        double frameTime = (now - lastUpdateTime) / 1000.0;
        lastUpdateTime = now;

        // Clamp to avoid huge jumps
        if (frameTime > 0.25) frameTime = 0.25;
        accumulator += frameTime;

        Vec3d prev = springVector.getPosition();

        // Step the spring fixed timestep until we catch up
        while (accumulator >= dt) {
            springVector.update(dt);
            accumulator -= dt;
        }

        // Interpolate within this frame using partialTicks
        interpolated = MatrixHelper.lerpVectors(prev, springVector.getPosition(), partialTicks);
    }


    /**
     * Apply shake to the world (rotational shake).
     */
    public void applyWorld() {
        if (ClientModContext.getContext() != null && ClientModContext.getContext().getMainHeldWeapon() != null) {
            Pair<Double, Double> params = ClientModContext.getContext().getMainHeldWeapon().getScreenShakeParameters();
            springVector.setXSpringParam(2, 3000 * params.getSecond(), 200 * params.getSecond());
            springVector.setZSpringParam(4, 9000 * params.getSecond(), 75 * params.getSecond());
        } else {
            springVector.setXSpringParam(2, 3000, 200);
            springVector.setZSpringParam(4, 9000, 75);
        }

        // Apply rotations using the interpolated vector
        GlStateManager.rotate((float) interpolated.z, 0, 0, 1);
        GlStateManager.rotate((float) interpolated.x, 1, 0, 0);
    }
}
