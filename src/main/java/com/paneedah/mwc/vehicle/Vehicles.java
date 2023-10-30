package com.paneedah.mwc.vehicle;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.VehicleKey;
import com.paneedah.mwc.models.weapons.VehicleLock;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.weaponlib.render.QRL;
import com.paneedah.weaponlib.vehicle.AccessibleVehicleGUI;
import com.paneedah.weaponlib.vehicle.GeneralVehicleSounds;

public class Vehicles {
	
	public static void init(CommonProxy commonProxy) {

		// Panda: Is this still the case? I don't think so.
		// Desoroxxx: It is not the case anymore, but the best way would be to remove the modContext system entirely, probably after the rendering rewrite.

		// due to the fact that advanced warfare cannot be accessed from
		// weaponlib, here are things that need to be set from this end.
		GeneralVehicleSounds.setup(MWC.modContext);
		AccessibleVehicleGUI.remotelySetModels(new VehicleKey(), new VehicleLock(), QRL.quickLoc("gui", "vehiclekey"), QRL.quickLoc("gui", "keylock"));
		
		//new SampleVehicleFactory().createVehicle(MWC.modContext);
		new AudiS4Factory().createVehicle(MWC.modContext);
		new McLarenSennaFactory().createVehicle(MWC.modContext);
		new AE86TruenoFactory().createVehicle(MWC.modContext);
		new ATVFactory().createVehicle(MWC.modContext);
	}
}
