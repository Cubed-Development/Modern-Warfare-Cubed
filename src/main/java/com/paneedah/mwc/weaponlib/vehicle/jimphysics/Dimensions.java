package com.paneedah.mwc.weaponlib.vehicle.jimphysics;

import net.minecraft.util.math.Vec3d;

public class Dimensions {
	
	public double length;
	public double width;
	public double height;
	
	public Dimensions(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public Vec3d getZForwardFormat() {
		return new Vec3d(width, height, length);
	}
	
	public double getVolume() {
		return width*length*height;
	}

}
