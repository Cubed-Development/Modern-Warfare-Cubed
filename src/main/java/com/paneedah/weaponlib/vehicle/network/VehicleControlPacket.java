package com.paneedah.weaponlib.vehicle.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

import java.io.IOException;

public class VehicleControlPacket implements IMessage {

	public VehicleDataContainer serializer;

	public VehicleControlPacket() {}
	
	public VehicleControlPacket(VehicleDataContainer serializer) {
		this.serializer = serializer;
	}
	

	public void fromBytes(ByteBuf buf) {
		try {
			this.serializer = this.serializer.read(buf);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void toBytes(ByteBuf buf) {
		
		
		this.serializer.write(buf, this.serializer);
	}

	
}
