package com.paneedah.weaponlib.vehicle.network;

import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import io.netty.buffer.ByteBuf;

import java.io.IOException;

public class VehicleControlPacket implements CompatibleMessage {

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
