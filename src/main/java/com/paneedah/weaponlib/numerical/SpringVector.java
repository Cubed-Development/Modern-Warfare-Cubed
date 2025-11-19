package com.paneedah.weaponlib.numerical;

import net.minecraft.util.math.Vec3d;

public class SpringVector implements ISimulator {

    private final SpringValue X;
    private final SpringValue Y;
    private final SpringValue Z;

    public SpringVector(double mass, double constant, double damper) {
        X = new SpringValue(constant, mass, damper);
        Y = new SpringValue(constant, mass, damper);
        Z = new SpringValue(constant, mass, damper);
    }

    public SpringVector() {
        X = new SpringValue(0, 0, 0);
        Y = new SpringValue(0, 0, 0);
        Z = new SpringValue(0, 0, 0);
    }

    public void configure(double dampening, double mass, double k) {

        X.configure(k, mass, dampening);
        Y.configure(k, mass, dampening);
        Z.configure(k, mass, dampening);
    }

    public Vec3d getPosition() {
        return new Vec3d(X.getPosition(), Y.getPosition(), Z.getPosition());
    }

    public void addVelocity(double x, double y, double z) {
        X.velocity += x;
        Y.velocity += y;
        Z.velocity += z;
    }

    public void addPosition(double x, double y, double z) {
        X.position += x;
        Y.position += y;
        Z.position += z;
    }

    public void setXSpringParam(double mass, double constant, double damper) {
        X.setDamping(damper);
        X.setMass(mass);
        X.setSpringConstant(constant);
    }

    public void setYSpringParam(double mass, double constant, double damper) {
        Y.setDamping(damper);
        Y.setMass(mass);
        Y.setSpringConstant(constant);
    }

    public void setZSpringParam(double mass, double constant, double damper) {
        Z.setDamping(damper);
        Z.setMass(mass);
        Z.setSpringConstant(constant);
    }

    public void setDampening(double d) {
        X.setDamping(d);
        Y.setDamping(d);
        Z.setDamping(d);
    }

    public void setSpringConstant(double k) {
        X.setSpringConstant(k);
        Y.setSpringConstant(k);
        Z.setSpringConstant(k);
    }

    public void setMass(double m) {
        X.setMass(m);
        Y.setMass(m);
        Z.setMass(m);
    }

    @Override
    public void update(double dt) {
        X.update(dt);
        Y.update(dt);
        Z.update(dt);
    }

    public void setPosition(double x, double y, double z) {
        X.setPosition(x);
        Y.setPosition(y);
        Z.setPosition(z);
    }

    public Vec3d getInterpolatedVec() {
        return new Vec3d(X.getLerpedPosition(), Y.getLerpedPosition(), Z.getLerpedPosition());
    }

    public Vec3d getInterpolatedVec(double mu) {
        return new Vec3d(X.getLerpedPosition(mu), Y.getLerpedPosition(mu), Z.getLerpedPosition(mu));

    }
}
