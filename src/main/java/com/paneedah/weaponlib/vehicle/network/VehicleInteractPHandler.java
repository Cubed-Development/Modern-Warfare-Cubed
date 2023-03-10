package com.paneedah.weaponlib.vehicle.network;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;

public class VehicleInteractPHandler implements CompatibleMessageHandler<VehicleInteractPacket, CompatibleMessage> {
	
	public static ModContext context;

	public VehicleInteractPHandler(ModContext context) {
		this.context = context;
	}

	@Override
	public <T extends CompatibleMessage> T onCompatibleMessage(VehicleInteractPacket m, CompatibleMessageContext ctx) {
		if(ctx.isServerSide()) {
			ctx.runInMainThread(() -> {
				EntityVehicle vehicle = (EntityVehicle) ctx.getPlayer().world.getEntityByID(m.vehicleID);
				EntityPlayer player = (EntityPlayer) ctx.getPlayer().world.getEntityByID(m.playerID);
				
				if(m.right) {
					if(vehicle.canFitPassenger(player)) {
						
						player.startRiding(vehicle);
					}
				} else {
					
					vehicle.setDead();
					
					
				}
				
				
				
				
			});
		}
		
		return null;
	}

}
