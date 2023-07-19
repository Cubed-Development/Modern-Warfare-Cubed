package com.paneedah.mwc.network;

import io.netty.buffer.ByteBuf;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import io.redstudioragnarok.redcore.vectors.Vector3F;
import net.minecraft.util.math.Vec3d;

public final class NetworkUtil {

	public static Vector3F readVector3F(final ByteBuf byteBuf) {
		return new Vector3F(byteBuf.readFloat(), byteBuf.readFloat(), byteBuf.readFloat());
	}

	public static void writeVector3F(final ByteBuf byteBuf, final Vector3F vector3F) {
        byteBuf.writeFloat(vector3F.x);
        byteBuf.writeFloat(vector3F.y);
        byteBuf.writeFloat(vector3F.z);
    }

	public static Vector3D readVector3D(final ByteBuf byteBuf) {
		return new Vector3D(byteBuf.readDouble(), byteBuf.readDouble(), byteBuf.readDouble());
	}

	public static void writeVector3D(final ByteBuf byteBuf, final Vector3D vector3D) {
        byteBuf.writeDouble(vector3D.x);
        byteBuf.writeDouble(vector3D.y);
        byteBuf.writeDouble(vector3D.z);
    }

	public static Vec3d readVec3d(final ByteBuf byteBuf) {
		return new Vec3d(byteBuf.readDouble(), byteBuf.readDouble(), byteBuf.readDouble());
	}
	
	public static void writeVec3d(final ByteBuf byteBuf, final Vec3d vec3d) {
		byteBuf.writeDouble(vec3d.x);
		byteBuf.writeDouble(vec3d.y);
		byteBuf.writeDouble(vec3d.z);
	}
}
