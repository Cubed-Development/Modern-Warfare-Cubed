package com.paneedah.weaponlib.render.cam;

import com.paneedah.weaponlib.numerical.SpringValue;
import net.minecraft.util.math.Vec3d;

public class ShockVector {

    private SpringValue x, y, z;


    public ShockVector() {
        x = new SpringValue(0, 0, 0);
        y = new SpringValue(0, 0, 0);
        z = new SpringValue(0, 0, 0);
    }

    public void configure(double dampening, double mass, double k) {

        x.configure(k, mass, dampening);
        y.configure(k, mass, dampening);
        z.configure(k, mass, dampening);
    }

    public void update(double dt) {
        x.update(dt);
        y.update(dt);
        z.update(dt);
    }

    public void applyForce(double forceX, double forceY, double forceZ) {
        x.setVelocity(x.getVelocity() + forceX);
        y.setVelocity(y.getVelocity() + forceY);
        z.setVelocity(z.getVelocity() + forceZ);

    }

    public Vec3d getShockVector() {
        return new Vec3d(x.getPosition(), y.getPosition(), z.getPosition());
    }


}
