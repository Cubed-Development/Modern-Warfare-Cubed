package com.paneedah.mwc.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec3d;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import static com.paneedah.mwc.utils.ModReference.RED_LOG;

public final class NetworkUtil {

	public static Vec3d readVec3d(final ByteBuf byteBuf) {
		return new Vec3d(byteBuf.readDouble(), byteBuf.readDouble(), byteBuf.readDouble());
	}
	
	public static void writeVec3d(final ByteBuf byteBuf, final Vec3d vec3d) {
		byteBuf.writeDouble(vec3d.x);
		byteBuf.writeDouble(vec3d.y);
		byteBuf.writeDouble(vec3d.z);
	}

	public static byte[] compressString(final String string) {
		final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		GZIPOutputStream gzipOutputStream;

		try {
			gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);
		} catch (IOException ioException) {
			RED_LOG.printFramedError("Networking", "Failed to create compression output stream.", "", ioException.getMessage());
			return new byte[0];
		}

		try {
			gzipOutputStream.write(string.getBytes());
		} catch (IOException ioException) {
			RED_LOG.printFramedError("Networking", "Failed to compress string.", "", ioException.getMessage());
		}

		try {
			byteArrayOutputStream.close();
			gzipOutputStream.close();
		} catch (IOException ioException) {
			RED_LOG.printFramedError("Networking", "Failed to close output stream.", "", ioException.getMessage());
		}

		return byteArrayOutputStream.toByteArray();
	}

	public static String decompressString(final byte[] bytes) {
		final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

		GZIPInputStream gzipInputStream;
		StringBuilder line = new StringBuilder();

		try {
			gzipInputStream = new GZIPInputStream(byteArrayInputStream);
		} catch (IOException ioException) {
			RED_LOG.printFramedError("Networking", "Failed to create compression input stream.", "", ioException.getMessage());
			return "";
		}

		final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gzipInputStream));

		try {
			while (bufferedReader.ready())
				line.append(bufferedReader.readLine());
		} catch (IOException ioException) {
			RED_LOG.printFramedError("Networking", "Failed to read lines from compression stream.", "", ioException.getMessage());
		}

		try {
			byteArrayInputStream.close();
			gzipInputStream.close();
			bufferedReader.close();
		} catch (IOException ioException) {
			RED_LOG.printFramedError("Networking", "Failed to close input stream.", "", ioException.getMessage());
		}

		return line.toString();
	}
}
