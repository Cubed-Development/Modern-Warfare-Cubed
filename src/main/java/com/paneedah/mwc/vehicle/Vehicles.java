package com.paneedah.mwc.vehicle;

import com.paneedah.mwc.models.VehicleKey;
import com.paneedah.mwc.models.VehicleLock;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.render.QRL;
import com.paneedah.weaponlib.vehicle.AccessibleVehicleGUI;
import com.paneedah.weaponlib.vehicle.GeneralVehicleSounds;

public class Vehicles {

    public static void init(ModContext modContext) {

        // Panda: Is this still the case? I don't think so.

        // due to the fact that advanced warfare cannot be accessed from
        // weaponlib, here are things that need to be set from this end.
        GeneralVehicleSounds.setup(modContext);
        AccessibleVehicleGUI.remotelySetModels(new VehicleKey(), new VehicleLock(),
                QRL.quickLoc("gui", "vehiclekey"), QRL.quickLoc("gui", "keylock"));

        //new SampleVehicleFactory().createVehicle(modContext);
        new AudiS4Factory().createVehicle(modContext);
        new McLarenSennaFactory().createVehicle(modContext);
        new AE86TruenoFactory().createVehicle(modContext);
        new ATVFactory().createVehicle(modContext);
    }
}
