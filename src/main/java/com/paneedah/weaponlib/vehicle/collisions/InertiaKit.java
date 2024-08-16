package com.paneedah.weaponlib.vehicle.collisions;

import javax.vecmath.Matrix3f;

/**
 * Creates inertia tensors for common/complex shapes based on given parameters.
 *
 * @author Jim Holden, Contender
 */
public class InertiaKit {


    public static Matrix3f inertiaTensorCube(float mass, float h, float w, float d) {
        float mV = mass / 12;
        return new Matrix3f(mV * (h * h + d * d), 0.0f, 0.0f,
                0.0f, mV * (w * w + d * d), 0.0f,
                0.0f, 0.0f, mV * (w * w + h * h));
    }

    public static Matrix3f inertiaTensorCylinder(float mass, float r, float h) {
        float mV = mass / 12;
        float mH = mass / 2;
        return new Matrix3f(mV * (3 * r * r + h * h), 0.0f, 0.0f,
                0.0f, mV * (3 * r * r + h * h), 0.0f,
                0.0f, 0.0f, mH * r * r);
    }

}
