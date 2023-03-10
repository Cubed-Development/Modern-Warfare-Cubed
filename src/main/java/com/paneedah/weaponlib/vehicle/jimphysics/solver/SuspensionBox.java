package com.paneedah.weaponlib.vehicle.jimphysics.solver;

import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class SuspensionBox {
	
	public double prevRoll;
	public double roll;
	
	public double prevPitch;
	public double pitch;
	
	
	
	public SuspensionBox() {
		
	}
	
	public void applyForwardAccel(double inertia, double acceleration) {
	
	}
	
	public void update() {
		
	}
	
	
	
	public double pti(double o, double n) {
		return InterpolationKit.interpolateValue(o, n, mc.getRenderPartialTicks());
	}

}
