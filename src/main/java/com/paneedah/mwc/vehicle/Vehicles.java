package com.paneedah.mwc.vehicle;

import com.paneedah.mwc.models.VehicleKey;
import com.paneedah.mwc.models.VehicleLock;
import com.paneedah.mwc.utils.QuickResourceLocation;
import com.paneedah.weaponlib.vehicle.AccessibleVehicleGUI;
import com.paneedah.weaponlib.vehicle.GeneralVehicleSounds;

public class Vehicles {

    public static void init() {

        // Panda: Is this still the case? I don't think so.

        // due to the fact that advanced warfare cannot be accessed from
        // weaponlib, here are things that need to be set from this end.
        GeneralVehicleSounds.setup();
        AccessibleVehicleGUI.remotelySetModels(new VehicleKey(), new VehicleLock(),
                QuickResourceLocation.quickLoc("gui", "vehiclekey"), QuickResourceLocation.quickLoc("gui", "keylock"));

        //new SampleVehicleFactory().createVehicle();
        new AudiS4Factory().createVehicle();
        new McLarenSennaFactory().createVehicle();
        new AE86TruenoFactory().createVehicle();
        new ATVFactory().createVehicle();
    }
}
