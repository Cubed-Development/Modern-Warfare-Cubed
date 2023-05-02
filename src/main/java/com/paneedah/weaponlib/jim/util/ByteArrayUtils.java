package com.paneedah.weaponlib.jim.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayUtils {
	
	public static ByteArrayOutputStream createByteArrayOutputStreamFromBytes(byte[] bytes) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(bytes.length);
		try {
			baos.write(bytes);
		} catch (IOException e) {
			return null;
		}
		return baos;
	}

}
