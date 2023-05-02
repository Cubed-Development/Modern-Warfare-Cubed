package com.paneedah.mwc.weaponlib.vehicle.network;

import com.paneedah.mwc.weaponlib.ModContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.mwc.weaponlib.vehicle.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class VehicleClientPacketHandler implements CompatibleMessageHandler<VehicleClientPacket, CompatibleMessage> {
	
	public static ModContext context;

	public VehicleClientPacketHandler(ModContext context) {
		this.context = context;
	}

	@Override
	public <T extends CompatibleMessage> T onCompatibleMessage(VehicleClientPacket m, CompatibleMessageContext ctx) {
		 if(!ctx.isServerSide()) {
	            compatibility.runInMainClientThread(() -> {
				
	            	
	            	
				EntityPlayer player = compatibility.clientPlayer();
				VehicleDataContainer cont = m.serializer;
				
				EntityVehicle vehicle = (EntityVehicle) player.world.getEntityByID(cont.entityID);
				
				VehiclePacketLatencyTracker.push(vehicle);
				//System.out.println("There we go! " + vehicle);
				if(vehicle != null) {
					
					vehicle.smoothShell.upload(cont);
					
					//cont.updateVehicle(vehicle);
				}
				
				
				
			});
		}
		
		return null;
	}

}
