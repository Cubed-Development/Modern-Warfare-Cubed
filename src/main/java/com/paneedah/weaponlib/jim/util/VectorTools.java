package com.paneedah.weaponlib.jim.util;

import net.minecraft.util.math.Vec3d;

public class VectorTools {
	
	
	public static boolean vectorsEqual(Vec3d v1, Vec3d v2) {
		return v1.x == v2.x && v1.y == v2.y && v1.z == v2.z;
	}

}
