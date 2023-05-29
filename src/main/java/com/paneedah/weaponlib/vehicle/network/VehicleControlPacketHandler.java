package com.paneedah.weaponlib.vehicle.network;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class VehicleControlPacketHandler implements IMessageHandler<VehicleControlPacket, IMessage> {
	
	public ModContext context;

	public VehicleControlPacketHandler() {
	}

	public VehicleControlPacketHandler(ModContext context) {
		this.context = context;
	}

	@Override
	public IMessage onMessage(VehicleControlPacket message, MessageContext messageContext) {
		if(messageContext.side == Side.SERVER) {
			messageContext.getServerHandler().player.getServer().addScheduledTask(() -> {
				VehicleDataContainer cont = message.serializer;
				EntityVehicle vehicle = (EntityVehicle) messageContext.getServerHandler().player.world.getEntityByID(cont.entityID);
				cont.vehicle = vehicle;

				if(vehicle == null)
					return;

				for(EntityPlayer p: messageContext.getServerHandler().player.world.playerEntities) {
					boolean b = vehicle.getPassengers().isEmpty() || vehicle.getPassengers().get(0) == p;
					if(!b)
						context.getChannel().sendTo(new VehicleClientPacket(cont), (EntityPlayerMP) p);
				}
			});
		}
		
		return null;
	}

}
