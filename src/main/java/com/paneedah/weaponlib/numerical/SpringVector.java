package com.paneedah.weaponlib.numerical;

import net.minecraft.util.math.Vec3d;

public class SpringVector implements ISimulator {

    private final SpringValue SPRING_X;
    private final SpringValue SPRING_Y;
    private final SpringValue SPRING_Z;

    public SpringVector(double mass, double constant, double damper) {
        SPRING_X = new SpringValue(constant, mass, damper);
        SPRING_Y = new SpringValue(constant, mass, damper);
        SPRING_Z = new SpringValue(constant, mass, damper);
    }

    public SpringVector() {
        SPRING_X = new SpringValue(0, 0, 0);
        SPRING_Y = new SpringValue(0, 0, 0);
        SPRING_Z = new SpringValue(0, 0, 0);
    }

    public void configure(double dampening, double mass, double k) {

        SPRING_X.configure(k, mass, dampening);
        SPRING_Y.configure(k, mass, dampening);
        SPRING_Z.configure(k, mass, dampening);
    }

    public Vec3d getPosition() {
        return new Vec3d(SPRING_X.getPosition(), SPRING_Y.getPosition(), SPRING_Z.getPosition());
    }

    public void addVelocity(double x, double y, double z) {
        this.SPRING_X.velocity += x;
        this.SPRING_Y.velocity += y;
        this.SPRING_Z.velocity += z;
    }

    public void addPosition(double x, double y, double z) {
        this.SPRING_X.position += x;
        this.SPRING_Y.position += y;
        this.SPRING_Z.position += z;
    }

    public void setXSpringParam(double mass, double constant, double damper) {
        SPRING_X.setDamping(damper);
        SPRING_X.setMass(mass);
        SPRING_X.setSpringConstant(constant);
    }

    public void setYSpringParam(double mass, double constant, double damper) {
        SPRING_Y.setDamping(damper);
        SPRING_Y.setMass(mass);
        SPRING_Y.setSpringConstant(constant);
    }

    public void setZSpringParam(double mass, double constant, double damper) {
        SPRING_Z.setDamping(damper);
        SPRING_Z.setMass(mass);
        SPRING_Z.setSpringConstant(constant);
    }

    public void setDampening(double d) {
        SPRING_X.setDamping(d);
        SPRING_Y.setDamping(d);
        SPRING_Z.setDamping(d);
    }

    public void setSpringConstant(double k) {
        SPRING_X.setSpringConstant(k);
        SPRING_Y.setSpringConstant(k);
        SPRING_Z.setSpringConstant(k);
    }

    public void setMass(double m) {
        SPRING_X.setMass(m);
        SPRING_Y.setMass(m);
        SPRING_Z.setMass(m);
    }

    @Override
    public void update(double dt) {
        SPRING_X.update(dt);
        SPRING_Y.update(dt);
        SPRING_Z.update(dt);
    }

    public void setPosition(double x, double y, double z) {
        this.SPRING_X.setPosition(x);
        this.SPRING_Y.setPosition(y);
        this.SPRING_Z.setPosition(z);
    }

    public Vec3d getInterpolatedVec() {
        return new Vec3d(SPRING_X.getLerpedPosition(), SPRING_Y.getLerpedPosition(), SPRING_Z.getLerpedPosition());
    }

    public Vec3d getInterpolatedVec(double mu) {
        return new Vec3d(SPRING_X.getLerpedPosition(mu), SPRING_Y.getLerpedPosition(mu), SPRING_Z.getLerpedPosition(mu));

    }
}
