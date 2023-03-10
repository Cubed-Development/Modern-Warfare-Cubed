package com.paneedah.mw.vehicle;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.models.VehicleKey;
import com.paneedah.mw.models.VehicleLock;
import com.paneedah.mw.proxies.CommonProxy;
import com.paneedah.weaponlib.render.QRL;
import com.paneedah.weaponlib.vehicle.AccessibleVehicleGUI;
import com.paneedah.weaponlib.vehicle.GeneralVehicleSounds;

public class Vehicles {
	
	public static void init(CommonProxy commonProxy) {

		// Panda: Is this still the case? I don't think so.

		// due to the fact that advanced warfare cannot be accessed from
		// weaponlib, here are things that need to be set from this end.
		GeneralVehicleSounds.setup(ModernWarfareMod.MOD_CONTEXT);
		AccessibleVehicleGUI.remotelySetModels(new VehicleKey(), new VehicleLock(),
				QRL.quickLoc("gui", "vehiclekey"), QRL.quickLoc("gui", "keylock"));
		
		//new SampleVehicleFactory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
		new AudiS4Factory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
		new McLarenSennaFactory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
		new AE86TruenoFactory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
		new ATVFactory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
	}
}
