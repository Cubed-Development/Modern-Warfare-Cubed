package com.paneedah.mwc.vehicle.engines;

import com.paneedah.weaponlib.vehicle.jimphysics.Engine;

public class McLarenSennaEngine extends Engine {

	public McLarenSennaEngine(String name, String engineBrand, int maxRPM, int redLine, int idleRPM) {
		super(name, engineBrand, maxRPM, redLine, idleRPM);
	}
	// technically for s4 b8, SRC: https://www.audiworld.com/forums/s4-b8-platform-discussion-134/dynod-my-b8-s4-2808650/

	// converted using https://www.unitconverters.net/energy/ft-lb-to-nm.htm
	@Override
	public void setupTorqueCurve() {
		addPoint(1008, 357);
		addPoint(1303, 477);
		addPoint(1662, 569);
		addPoint(2191, 649);
		addPoint(3061, 719);
		addPoint(3792, 755);
		addPoint(4507, 777);
		addPoint(5514, 798);
		addPoint(6894, 798);
		addPoint(7526, 750);
		addPoint(8142, 688);
		addPoint(8513, 600);
//		addPoint(9000, 328);
	}
	
}
