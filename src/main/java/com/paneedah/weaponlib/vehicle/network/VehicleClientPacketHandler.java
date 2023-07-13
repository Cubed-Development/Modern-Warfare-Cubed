package com.paneedah.weaponlib.vehicle.network;

import com.paneedah.weaponlib.vehicle.EntityVehicle;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.MWC.MC;

public class VehicleClientPacketHandler implements IMessageHandler<VehicleClientPacket, IMessage> {

	public VehicleClientPacketHandler() {
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IMessage onMessage(VehicleClientPacket message, MessageContext messageContext) {
		MC.addScheduledTask(() -> {
		   VehicleDataContainer cont = message.serializer;

		   EntityVehicle vehicle = (EntityVehicle) MC.player.world.getEntityByID(cont.entityID);

		   VehiclePacketLatencyTracker.push(vehicle);
		   if(vehicle != null) {
			   vehicle.smoothShell.upload(cont);

			   //cont.updateVehicle(vehicle);
		   }
	   });

		return null;
	}

}
