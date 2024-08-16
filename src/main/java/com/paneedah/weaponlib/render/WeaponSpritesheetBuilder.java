package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.ClientModContext;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.render.SpriteSheetTools.Sprite;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WeaponSpritesheetBuilder {
	
	private static ClientModContext modContext;
	private static int lastInt = 0;
	private static HashMap<String, Integer> weaponSprites = new HashMap<>();
	
	private static HashMap<Object, BufferedImage> imageMappings = new HashMap<>();
	
	
	public static void provideModContext(ClientModContext context) {
		modContext = context;
	}
	
	public static int getTotalRegistries() {
		return weaponSprites.size();
	}
	
	public static boolean hasSpriteID(Object obj) {
		
		
		
		return weaponSprites.containsKey(obj);
	}
	
	public static int getSpriteID(Object obj) {
		return weaponSprites.get(obj);
	}
	
	public static int getTotalImagesProcessed() {
		return imageMappings.size();
	}
	
	public static void registerSprite(String name) {
		weaponSprites.put(name, lastInt++);
	}
	
	public static boolean hasBeenBuilt(String name) {
		return imageMappings.containsKey(name);
	}
	
	public static void uploadImage(String name, BufferedImage image) {
		imageMappings.put(name, image);
	}
	
	public static void build() {
		if(modContext == null) return;

		
		
		AffineTransform at = new AffineTransform();
	    at.concatenate(AffineTransform.getScaleInstance(1, -1));
	    at.concatenate(AffineTransform.getTranslateInstance(0, -128));
	    
	    
		
		Map<Object, Integer> mappings = modContext.getInventoryTextureMap();

		int bestSize = (int) Math.round(Math.sqrt((double) mappings.size()));
		BufferedImage master = new BufferedImage(bestSize*128, bestSize*128, BufferedImage.TYPE_INT_ARGB);
		Graphics2D masterGraphics = (Graphics2D) master.getGraphics();
		
		
		int id;
		for(Entry<Object, Integer> map : mappings.entrySet()) {
			 
			BufferedImage captured = ImageCaptureUtil.captureImage(map.getValue(), 128, 128, at);
			id = getSpriteID(((WeaponRenderer) map.getKey()).name);
			Sprite coords = SpriteSheetTools.getSquareSprite(id, 128, master.getWidth(), master.getHeight());
			masterGraphics.drawImage(captured, (int) (coords.getMinU()*master.getWidth()), (int) (coords.getMinV()*master.getHeight()), null);
			
		}
		

		File result = new File("guniconsheet.png");
		try {
			result.createNewFile();
		} catch (IOException e) {
			System.err.println("Error creating icon sheet file!");
			e.printStackTrace();
		}
		
		ImageCaptureUtil.saveImageToDisk(result, master);
	}
	
}
