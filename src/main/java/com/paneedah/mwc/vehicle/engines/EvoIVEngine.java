package com.paneedah.mwc.vehicle.engines;

import com.paneedah.weaponlib.vehicle.jimphysics.Engine;

public class EvoIVEngine extends Engine {

	
	public EvoIVEngine(String name, String engineBrand, int maxRPM, int redLine, int idleRPM) {
		super(name, engineBrand, maxRPM, redLine, idleRPM);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setupTorqueCurve() {
		addPoint(1000, 100.0);
		addPoint(1500, 200.0);
		addPoint(2000, 275.0);
		addPoint(2500, 345.0);
		addPoint(3000, 578.0);
		addPoint(3500, 390.0);
		addPoint(4000, 385.0);
		addPoint(4500, 380.0);
		addPoint(5000, 373.0);
		addPoint(6000, 325.0);
		addPoint(7000, 250.0);
	}

}
