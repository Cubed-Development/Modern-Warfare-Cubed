package com.paneedah.weaponlib.numerical;

import net.minecraft.util.math.Vec3d;

public class SpringVector implements ISimulator {


    private final SpringValue x;
    private final SpringValue y;
    private final SpringValue z;

    public SpringVector(double mass, double constant, double damper) {
        x = new SpringValue(constant, mass, damper);
        y = new SpringValue(constant, mass, damper);
        z = new SpringValue(constant, mass, damper);
    }

    public Vec3d getPosition() {
        return new Vec3d(x.getPosition(), y.getPosition(), z.getPosition());
    }


    public void addVelocity(double x, double y, double z) {
        this.x.velocity += x;
        this.y.velocity += y;
        this.z.velocity += z;
    }

    public void addPosition(double x, double y, double z) {
        this.x.position += x;
        this.y.position += y;
        this.z.position += z;
    }

    public void setXSpringParam(double mass, double constant, double damper) {
        x.setDamping(damper);
        x.setMass(mass);
        x.setSpringConstant(constant);
    }

    public void setYSpringParam(double mass, double constant, double damper) {
        y.setDamping(damper);
        y.setMass(mass);
        y.setSpringConstant(constant);
    }

    public void setZSpringParam(double mass, double constant, double damper) {
        z.setDamping(damper);
        z.setMass(mass);
        z.setSpringConstant(constant);
    }

    public void setDampening(double d) {
        x.setDamping(d);
        y.setDamping(d);
        z.setDamping(d);
    }

    public void setConstant(double k) {
        x.setSpringConstant(k);
        y.setSpringConstant(k);
        z.setSpringConstant(k);
    }

    public void setMass(double m) {
        x.setMass(m);
        y.setMass(m);
        z.setMass(m);
    }

    @Override
    public void update(double dt) {
        x.update(dt);
        y.update(dt);
        z.update(dt);
    }

    public void setPosition(double x, double y, double z) {
        this.x.setPosition(x);
        this.y.setPosition(y);
        this.z.setPosition(z);
    }

    public Vec3d getInterpolatedVec() {
        return new Vec3d(x.getLerpedPosition(), y.getLerpedPosition(), z.getLerpedPosition());
    }

    public Vec3d getInterpolatedVec(double mu) {
        return new Vec3d(x.getLerpedPosition(mu), y.getLerpedPosition(mu), z.getLerpedPosition(mu));

    }
}
