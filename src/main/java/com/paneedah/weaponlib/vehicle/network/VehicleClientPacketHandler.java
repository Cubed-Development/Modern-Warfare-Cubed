package com.paneedah.weaponlib.vehicle.network;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class VehicleClientPacketHandler implements CompatibleMessageHandler<VehicleClientPacket, IMessage> {
	
	public static ModContext context;

	public VehicleClientPacketHandler() {
	}

	public VehicleClientPacketHandler(ModContext context) {
		this.context = context;
	}

	@Override
	public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(VehicleClientPacket message, MessageContext messageContext) {
		 if(messageContext.side == Side.CLIENT) {
	            compatibility.runInMainClientThread(() -> {
				
	            	
	            	
				EntityPlayer player = compatibility.clientPlayer();
				VehicleDataContainer cont = message.serializer;
				
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
