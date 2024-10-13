package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.ClientModContext;
import com.paneedah.weaponlib.Pair;
import com.paneedah.weaponlib.animation.MatrixHelper;
import com.paneedah.weaponlib.numerical.RandomVector;
import com.paneedah.weaponlib.numerical.SpringVector;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class NewScreenshakingManager {

    public RandomVector randomVec = new RandomVector();

    public double prevIntensity, intensity;


    public SpringVector springVector = new SpringVector(1, 2, 2);

    private double prevX, prevY, prevZ, prevRotX, prevRotY, prevRotZ;
    private double y;
    private double rotX;
    private double rotY;
    private double rotZ;


    private double getRandom(double min, double max) {
        return Math.random() * (max - min + 1) + min;
    }

    private double getRandomWithNegative(double min, double max) {
        double random = Math.random() * (max - min + 1) + min;
        if (Math.random() < 0.5) {
            random *= -1;
        }
        return random;

    }

    public void impulse(double mag) {

        //mag *= 1000;

        intensity += mag;


        double x = -10 * mag;
        double z = 2 * mag;
        springVector.addVelocity(x, y, z);

    }


    public void applyWorld() {
        float pt = MC.getRenderPartialTicks();
        //double i = MatrixHelper.solveLerp(prevIntensity, intensity, pt);


        if (ClientModContext.getContext() != null && ClientModContext.getContext().getMainHeldWeapon() != null) {

            Pair<Double, Double> param = ClientModContext.getContext().getMainHeldWeapon().getScreenShakeParameters();
            springVector.setXSpringParam(2, 3000 * param.getSecond().doubleValue(), 200 * param.getSecond().doubleValue());
            springVector.setZSpringParam(4, 9000 * param.getSecond().doubleValue(), 75 * param.getSecond().doubleValue());
        } else {
            springVector.setXSpringParam(2, 3000, 200);
            springVector.setZSpringParam(4, 9000, 75);
        }


        //System.out.println("yo " + (accumulator/dt));
        Vec3d rotVec = interpolated;
        GlStateManager.rotate((float) rotVec.z, 0, 0, 1);
        //GlStateManager.rotate((float) rotVec.y, 0, 1, 0);
        GlStateManager.rotate((float) rotVec.x, 1, 0, 0);


    }

    public void applyHead() {

        float pt = MC.getRenderPartialTicks();
        double i = MatrixHelper.solveLerp(prevIntensity, intensity, pt);


    }

    public double dt = (double) 1 / 20;
    public long currentTime = System.currentTimeMillis();
    public double accumulator;
    public Vec3d interpolated = Vec3d.ZERO;


    public void update() {
        dt = 1 / 120.0;

        long newTime = System.currentTimeMillis();
        double frameTime = (newTime - currentTime) / 1000.0;
        currentTime = newTime;

        // Prevents massive timesteps from accumuating
        if (frameTime > 0.25) {
            frameTime = 0.25;
        }

        accumulator += frameTime;


        Vec3d prev = springVector.getPosition();

        while (accumulator >= dt) {
            springVector.update(dt);
            accumulator -= dt;
        }

        interpolated = MatrixHelper.lerpVectors(prev, springVector.getPosition(), (float) (accumulator / dt));


    }

}
