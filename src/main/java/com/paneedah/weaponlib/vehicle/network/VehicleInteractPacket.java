package com.paneedah.weaponlib.vehicle.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class VehicleInteractPacket implements IMessage {

	public boolean right;
	public int vehicleID;
	public int playerID;
	
	public VehicleInteractPacket() {}
	
	public VehicleInteractPacket(boolean right, int entityID, int playerID) {
		this.right = right;
		this.vehicleID = entityID;
		this.playerID = playerID;
	}
	

	public void fromBytes(ByteBuf buf) {
		this.right = buf.readBoolean();
		this.vehicleID = buf.readInt();
		this.playerID = buf.readInt();
	}

	public void toBytes(ByteBuf buf) {
		buf.writeBoolean(right);
		buf.writeInt(this.vehicleID);
		buf.writeInt(this.playerID);
	}

	
}
