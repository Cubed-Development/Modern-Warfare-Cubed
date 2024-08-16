package com.paneedah.mwc.vehicle.engines;

import com.paneedah.weaponlib.vehicle.jimphysics.Engine;

public class AE86TruenoEngine extends Engine {

	public AE86TruenoEngine(String name, String engineBrand, int maxRPM, int redLine, int idleRPM) {
		super(name, engineBrand, maxRPM, redLine, idleRPM);
	}
	// technically for s4 b8, SRC: https://www.audiworld.com/forums/s4-b8-platform-discussion-134/dynod-my-b8-s4-2808650/

	// converted using https://www.unitconverters.net/energy/ft-lb-to-nm.htm
	@Override
	public void setupTorqueCurve() {
		addPoint(1001, 64);
		addPoint(1257, 83);
		addPoint(1664, 102);
		addPoint(2232, 117);
		addPoint(2693, 124);
		addPoint(3235, 130);
		addPoint(4210, 137);
		addPoint(5212, 142);
		addPoint(5944, 139);
		addPoint(6607, 132);
		addPoint(6905, 121);
		addPoint(7095, 110);
		//12
//		addPoint(9000, 328);
	}
	
	
}
