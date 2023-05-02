package com.paneedah.mwc.weaponlib.network;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import static com.paneedah.mwc.utils.ModReference.log;

public class CompressionUtil {
	
	public static byte[] compressString(String str) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		GZIPOutputStream gos = null;
		try {
			gos = new GZIPOutputStream(bos);
		} catch (IOException e1) {
			log.catching(e1);
		}
		
		if(gos == null) {
			log.error("Failure to create compression output stream.");
			return null;
		}
		
		try {
			gos.write(str.getBytes());
		} catch (IOException e) {
			log.catching(e);
		}
		try {
			bos.close();
			gos.close();
		} catch (IOException e) {
			log.catching(e);
			log.error("Failed to close output streams.");
		}
		
		
		return bos.toByteArray();
	}
	
	public static String decompressString(byte[] bytes) {
		String line = "";

			ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
			GZIPInputStream gis = null;
			try {
				gis = new GZIPInputStream(bis);
			} catch (IOException e1) {
				log.catching(e1);
			}
			
			if(gis == null) {
				log.error("Error creating compression input stream!");
				return null;
			}
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(gis));
			
			try {
				while(reader.ready()) {
					line += reader.readLine();
				}
			} catch (IOException e1) {
				log.catching(e1);
				log.error("Failed while reading lines from compression stream.");
			}
			
			try {
				gis.close();
				bis.close();
				reader.close();
			} catch(IOException e) {
				log.catching(e);
				log.debug("Failed to close input streams");
			}
			
	
		
		
		return line;
	}

}
