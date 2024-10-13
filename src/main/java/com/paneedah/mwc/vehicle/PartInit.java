package com.paneedah.mwc.vehicle;

import com.paneedah.weaponlib.vehicle.GearShiftPattern;
import com.paneedah.weaponlib.vehicle.jimphysics.Transmission;

public class PartInit {

    // Vehicle transmissions

    public static final Transmission audiS4B7Transmission = new Transmission(3.889f, 3.4f, 4500, 1800)
            .quickSixSpeed(3.667f, 2.050f, 1.462f, 1.133f, 0.919f, 0.778f)
            .withEcoShift(2500, 1200);

    public static final Transmission McLarenSennaTransmission = new Transmission(3.31f, 2.8f, 8450, 4000)
            .quickSpeed(3.98f, 2.61f, 1.9f, 1.48f, 1.16f, 0.91f, 0.69f)
            .withEcoShift(2500, 1200);

    public static final Transmission AE86TruenoTransmission = new Transmission(4.3f, 4.2f, 5300, 3000)
            .quickSixSpeed(3.587f, 2.022f, 1.384f, 1.00f, 0.861f, 0.778f)
            .withEcoShift(2500, 1200);

    public static final Transmission ATVTransmission = new Transmission(3.937f, 3.544f, 2462, 2738)
            .quickSixSpeed(3.525f, 2.218f, 1.433f, 1f, 0.861f, 0.778f)
            .withEcoShift(2500, 1200);


    //Gear shift patterns
    public static final GearShiftPattern STANDARD_SIX_SHIFT = new GearShiftPattern()
            .withNormalBranch(1, 2)
            .withNormalBranch(3, 4)
            .withNormalBranch(5, 6);


}
