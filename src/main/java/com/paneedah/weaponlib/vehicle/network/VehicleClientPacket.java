package com.paneedah.weaponlib.vehicle.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

import java.io.IOException;

public class VehicleClientPacket implements IMessage {

	public VehicleDataContainer serializer;

	public VehicleClientPacket() {}
	
	public VehicleClientPacket(VehicleDataContainer serializer) {
		this.serializer = serializer;
	}
	

	public void fromBytes(ByteBuf buf) {
		try {
			this.serializer = serializer.read(buf);
			
			//this.serializer.vehicle = (EntityVehicle) mc.player.world.getEntityByID(this.serializer.entityID);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void toBytes(ByteBuf buf) {
		//System.out.println("my brotha: " + this.serializer.vehicle);
		this.serializer.write(buf, this.serializer);
	}

	
}
