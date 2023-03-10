package com.paneedah.weaponlib.vehicle.collisions;

import net.minecraft.util.math.Vec3d;

public class GJKResult {
	
	
	public Status status;
	
	/**
	 * This is the contact normal
	 */
	public Vec3d separationVector = Vec3d.ZERO;
	
	/**
	 * How far deep are the colliders inside eachother?
	 */
	public double penetrationDepth = 0.0;
	
	/**
	 * Two contact points
	 */
	public Vec3d contactPointA;
	public Vec3d contactPointB;
	
	public GJKResult() {}
	
	public enum Status {
		COLLIDING,
		SEPARATED,
		FAILED
	}

}
