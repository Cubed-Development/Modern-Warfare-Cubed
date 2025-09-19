package com.paneedah.weaponlib.vehicle;

import com.paneedah.mwc.MWC;
import net.minecraft.util.SoundEvent;

public class GeneralVehicleSounds {

    public static SoundEvent driftConcrete1;
    public static SoundEvent driftDirt1;
    public static SoundEvent driftGround1;

    public static void setup() {
        driftConcrete1 = MWC.modContext.registerSound("drift_concrete");
        driftDirt1 = MWC.modContext.registerSound("drift_dirt");
        driftGround1 = MWC.modContext.registerSound("drift_ground");
    }
}
