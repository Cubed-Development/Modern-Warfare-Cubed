package com.paneedah.mwc.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec3d;

public final class NetworkUtil {

	public static Vec3d readVec3d(final ByteBuf byteBuf) {
		return new Vec3d(byteBuf.readDouble(), byteBuf.readDouble(), byteBuf.readDouble());
	}
	
	public static void writeVec3d(final ByteBuf byteBuf, final Vec3d vec3d) {
		byteBuf.writeDouble(vec3d.x);
		byteBuf.writeDouble(vec3d.y);
		byteBuf.writeDouble(vec3d.z);
	}
}
