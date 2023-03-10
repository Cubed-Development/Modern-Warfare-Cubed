package com.paneedah.mw.vehicle.engines;

import com.paneedah.weaponlib.vehicle.jimphysics.Engine;

public class AudiS4Engine extends Engine {

	public AudiS4Engine(String name, String engineBrand, int maxRPM, int redLine, int idleRPM) {
		super(name, engineBrand, maxRPM, redLine, idleRPM);
	}
	// technically for s4 b8, SRC: https://www.audiworld.com/forums/s4-b8-platform-discussion-134/dynod-my-b8-s4-2808650/

	// converted using https://www.unitconverters.net/energy/ft-lb-to-nm.htm
	@Override
	public void setupTorqueCurve() {
		addPoint(1019, 301);
		addPoint(1075, 325);
		addPoint(1113, 344);
		addPoint(1188, 367);
		addPoint(1319, 394);
		addPoint(1432, 399);
		addPoint(3327, 399);
		addPoint(3430, 391);
		addPoint(3674, 364);
		addPoint(3937, 342);
		addPoint(4218, 318);
		addPoint(4603, 287);
//		addPoint(9000, 328);
	}
	

	
}
