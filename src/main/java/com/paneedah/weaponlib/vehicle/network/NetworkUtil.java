package com.paneedah.weaponlib.vehicle.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec3d;

public class NetworkUtil {
	
	public static void writeVec3d(ByteBuf buf, Vec3d v) {
		buf.writeDouble(v.x);
		buf.writeDouble(v.y);
		buf.writeDouble(v.z);
	}
	
	public static Vec3d readVec3d(ByteBuf buf) {
		return new Vec3d( buf.readDouble(),
						  buf.readDouble(),
						  buf.readDouble() );
	}

}
