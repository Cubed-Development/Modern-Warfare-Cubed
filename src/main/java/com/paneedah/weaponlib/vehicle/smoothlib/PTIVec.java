package com.paneedah.weaponlib.vehicle.smoothlib;

import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;
import net.minecraft.util.math.Vec3d;

import static com.paneedah.mwc.MWC.MC;

public class PTIVec {
	
	public Vec3d prev = Vec3d.ZERO;
	public Vec3d cur = Vec3d.ZERO;

	public void updatePrev() {
		prev = cur;
	}
	
	public void set(Vec3d cur) {
		this.cur = cur;
	}
	
	
	public Vec3d get() {
		return InterpolationKit.interpolateVector(prev, cur, MC.getRenderPartialTicks());
	}

}
