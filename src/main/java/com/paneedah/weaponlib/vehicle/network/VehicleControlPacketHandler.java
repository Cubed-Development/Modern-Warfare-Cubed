package com.paneedah.weaponlib.vehicle.network;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class VehicleControlPacketHandler implements CompatibleMessageHandler<VehicleControlPacket, IMessage> {
	
	public static ModContext context;

	public VehicleControlPacketHandler() {
	}

	public VehicleControlPacketHandler(ModContext context) {
		this.context = context;
	}

	@Override
	public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(VehicleControlPacket message, MessageContext messageContext) {
		if(messageContext.side == Side.SERVER) {
			messageContext.getServerHandler().player.getServer().addScheduledTask(() -> {

				EntityPlayer player = messageContext.getServerHandler().player;
				VehicleDataContainer cont = message.serializer;



				//System.out.println("Ent ID: " + cont.entityID + " | " + player.world.getEntityByID(cont.entityID));

				/*
				for(Entity e : player.world.getLoadedEntityList()) {
					if(e instanceof EntityVehicle) {
						System.out.println("fuckin' vehicle bruh: " + e.getEntityId());
					}
				}*/
				EntityVehicle vehicle = (EntityVehicle) messageContext.getServerHandler().player.world.getEntityByID(cont.entityID);
				/*
				System.out.println(cont.synthAccelFor);
				System.out.println("what the fuck " + ctx.getPlayer().world.getEntityByID(cont.entityID));
				*/
				cont.vehicle = vehicle;

				if(vehicle == null) return;
				//System.out.println("fucking success");

				for(EntityPlayer p: messageContext.getServerHandler().player.world.playerEntities) {



					boolean b = vehicle.getPassengers().isEmpty() || vehicle.getPassengers().get(0) == p;
					if(!b) {

						context.getChannel().sendTo(new VehicleClientPacket(cont), (EntityPlayerMP) p);
					}
				}




			});
		}
		
		return null;
	}

}
