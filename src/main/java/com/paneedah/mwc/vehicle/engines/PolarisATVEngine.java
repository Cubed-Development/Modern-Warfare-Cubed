package com.paneedah.mwc.vehicle.engines;

import com.paneedah.weaponlib.vehicle.jimphysics.Engine;

public class PolarisATVEngine extends Engine {

    public PolarisATVEngine(String name, String engineBrand, int maxRPM, int redLine, int idleRPM) {
        super(name, engineBrand, maxRPM, redLine, idleRPM);
    }
    // technically for s4 b8, SRC: https://www.audiworld.com/forums/s4-b8-platform-discussion-134/dynod-my-b8-s4-2808650/

    // converted using https://www.unitconverters.net/energy/ft-lb-to-nm.htm
    @Override
    public void setupTorqueCurve() {
        addPoint(1031, 25);
        addPoint(1292, 38);
        addPoint(1554, 50);
        addPoint(1923, 61);
        addPoint(2246, 67);
        addPoint(2462, 69);
        addPoint(2738, 69);
        addPoint(3754, 68);
        addPoint(4769, 65);
        addPoint(5615, 62);
        addPoint(5892, 57);
        addPoint(6015, 54);
        //12
        //addPoint(9000, 328);
    }


}
