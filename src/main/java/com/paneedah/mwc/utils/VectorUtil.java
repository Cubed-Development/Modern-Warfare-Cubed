package com.paneedah.mwc.utils;

import dev.redstudio.redcore.math.vectors.Vector3D;
import dev.redstudio.redcore.math.vectors.Vector3F;
import io.netty.buffer.ByteBuf;
import lombok.experimental.UtilityClass;
import net.minecraft.util.math.Vec3d;

import java.awt.*;

/// Utility class for vector operations.
///
/// Red Core Candidate
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-02
/// @since 0.2
@UtilityClass
public final class VectorUtil {

    public static Vec3d convertToVec3d(Vector3D vector) {
        return new Vec3d(vector.x, vector.y, vector.z);
    }

    public static Vector3F convertToVector3F(Vec3d vector) {
        return new Vector3F((float) vector.x, (float) vector.y, (float) vector.z);
    }

    public static Vector3D convertToVector3D(Vec3d vector) {
        return new Vector3D(vector.x, vector.y, vector.z);
    }

    /**
     * Split a Hex into a Vec3d with the RGB color info
     */
    public static Vec3d extractColorVec3d(int color) {
        Color col = new Color(color);
        return new Vec3d(col.getRed() / 255f, col.getBlue() / 255f, col.getGreen() / 255f);
    }

    /**
     * Split a Hex into a Vector3D with the RGB color info
     */
    public static Vector3D extractColorVector3D(int color) {
        Color col = new Color(color);
        return new Vector3D(col.getRed() / 255f, col.getBlue() / 255f, col.getGreen() / 255f);
    }

    /**
     * Rotate a Vec3d
     */
    public static Vec3d rotateVec3d(Vec3d toRot, Vec3d toOrigin, float pitch, float yaw) {
        return toRot.subtract(toOrigin).rotatePitch(pitch).rotateYaw(yaw).add(toOrigin);
    }

    @UtilityClass
    public static class Networking {

        public static Vec3d read(ByteBuf byteBuf) {
            return new Vec3d(byteBuf.readDouble(), byteBuf.readDouble(), byteBuf.readDouble());
        }

        public static void read(ByteBuf byteBuf, Vector3F vector) {
            vector.x = byteBuf.readFloat();
            vector.y = byteBuf.readFloat();
            vector.z = byteBuf.readFloat();
        }

        public static void read(ByteBuf byteBuf, Vector3D vector) {
            vector.x = byteBuf.readDouble();
            vector.y = byteBuf.readDouble();
            vector.z = byteBuf.readDouble();
        }

        public static void write(ByteBuf byteBuf, Vec3d vector) {
            byteBuf.writeDouble(vector.x);
            byteBuf.writeDouble(vector.y);
            byteBuf.writeDouble(vector.z);
        }

        public static void write(ByteBuf byteBuf, Vector3F vector) {
            byteBuf.writeFloat(vector.x);
            byteBuf.writeFloat(vector.y);
            byteBuf.writeFloat(vector.z);
        }

        public static void write(ByteBuf byteBuf, Vector3D vector) {
            byteBuf.writeDouble(vector.x);
            byteBuf.writeDouble(vector.y);
            byteBuf.writeDouble(vector.z);
        }
    }
}
