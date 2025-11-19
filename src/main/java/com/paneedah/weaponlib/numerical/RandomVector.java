package com.paneedah.weaponlib.numerical;

import com.paneedah.weaponlib.animation.MatrixHelper;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.util.math.Vec3d;

import static com.paneedah.mwc.proxies.ClientProxy.MC;


/**
 * Random walk vector, allows for smooth random moments through
 * introduction of second order randomness that is integrated into
 * the position.
 *
 * @author Homer Riva-Cambrin
 */
public class RandomVector {

    private double dirX, dirY, dirZ;
    @Getter private double x, y, z;
    private double prevX, prevY, prevZ;

    // value between 0.0-1.0
    @Setter private double aggressiveness = 0.2;


    public void update(double speed, double dampening) {
        prevX = x;
        prevY = y;
        prevZ = z;

        x += dirX * speed;
        y += dirY * speed;
        z += dirZ * speed;

        dirX *= dampening;
        dirY *= dampening;
        dirZ *= dampening;

        x *= dampening;
        y *= dampening;
        z *= dampening;
    }

    public void callRandom(double mag) {
        double halfMag = mag / 2;

        if (Math.random() < aggressiveness) {
            this.dirX = Math.random() * mag - halfMag;
            this.dirY = Math.random() * mag - halfMag;
            this.dirZ = Math.random() * mag - halfMag;
        }

    }

    public Vec3d getVector(double amplitude) {
        return new Vec3d(this.x * amplitude, this.y * amplitude, this.z * amplitude);
    }

    public Vec3d getInterpolatedVector(double amplitude) {
        float ticks = MC.getRenderPartialTicks();
        return new Vec3d(MatrixHelper.solveLerp(this.prevX, this.x, ticks),
                MatrixHelper.solveLerp(this.prevY, this.y, ticks),
                MatrixHelper.solveLerp(this.prevZ, this.z, ticks)).scale(amplitude);
    }

}
