package com.paneedah.weaponlib;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.apache.commons.codec.binary.Hex;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static com.paneedah.mw.utils.ModReference.log;

public abstract class JSONDatabaseManager {

	protected static final Gson GSON_MANAGER = new GsonBuilder().setPrettyPrinting().create();
	protected static MessageDigest SHA_256_DIGEST;
	
	static {
		try {
			SHA_256_DIGEST = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			log.error("Failed to create SHA-256 digester!");
			log.catching(e);
		}
	}
	

	
	public abstract JsonObject toJSON();
	public abstract void fromJSON(JsonObject object);
	
	public abstract File getDirectory();
	
	public abstract void loadDirectory();
	
	public static String getFileDigestHex(File file) {
		return Hex.encodeHexString(getDigest(file));
	}
	
	public static byte[] getDigest(File f) {
		if(SHA_256_DIGEST == null) return null;
		
		// Try to create an input stream and generate a hash from it
		try(InputStream is = new FileInputStream(f)) {
			return getDigest(is);
		} catch (FileNotFoundException e) {
			log.error("Could not find file {}", f);
			log.catching(e);
		} catch (IOException e) {
			log.error("Could not read file {}", f);
			log.catching(e);
		}
		
		return null;
	}
	
	public static byte[] getDigest(InputStream is) {
		try {
			// Read our input stream into the byte array.
			byte[] byteArray = new byte[is.available()];
			is.read(byteArray);
			return byteArray;
		} catch(IOException e) {
			log.error("Could not create SHA-256 digest for {}", is.toString());
			log.catching(e);
		}
		return null;
	}




	
	protected static Gson getGSON() {
		return GSON_MANAGER;
	}

}
