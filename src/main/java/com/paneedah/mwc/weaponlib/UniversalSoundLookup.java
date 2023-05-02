package com.paneedah.mwc.weaponlib;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleSound;

import java.util.HashMap;

public class UniversalSoundLookup {
	
	private static HashMap<String, CompatibleSound> registry = new HashMap<>();
	
	
	public static void initialize(ModContext context) {
		//	System.out.println("Properly initialized " + entry.getKey() + " | " + registry.get(entry.getKey()));
		registry.replaceAll((k, v) -> context.registerSound(k));
	}
	
	public static boolean hasSound(String name) {
		return registry.containsKey(name.toLowerCase());
	}
	
	public static CompatibleSound lookupSound(String soundName) {
		return registry.get(soundName.toLowerCase());
	}
	
	public static void registerSoundToLookup(String name) {
		registry.put(name.toLowerCase(), null);
	}
	

}
