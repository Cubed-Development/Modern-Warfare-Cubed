package com.paneedah.weaponlib.vehicle.smoothlib;

import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class PTIVal {
	
	public float prev;
	public float cur;
	
	public PTIVal() {};
	
	public void updatePrev() {
		this.prev = cur;
	}
	
	public void setValue(float val) {
		this.cur = val;
	}
	
	public float getPTI() {
		return (float) InterpolationKit.interpolateValue(prev, cur, mc.getRenderPartialTicks());
	}

}
