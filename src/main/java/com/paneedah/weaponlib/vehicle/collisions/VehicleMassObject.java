package com.paneedah.weaponlib.vehicle.collisions;

import net.minecraft.util.math.Vec3d;

import javax.vecmath.Matrix3f;

public class VehicleMassObject {

    public double mass;
    public Matrix3f inertia;
    public Vec3d centerOfGravity;

    public VehicleMassObject(double mass, Matrix3f inertia, Vec3d cog) {
        this.mass = mass;
        this.inertia = inertia;
        centerOfGravity = cog;
    }

}
