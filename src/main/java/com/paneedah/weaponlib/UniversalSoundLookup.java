package com.paneedah.weaponlib;

import net.minecraft.util.SoundEvent;

import java.util.HashMap;

public class UniversalSoundLookup {

    private static final HashMap<String, SoundEvent> registry = new HashMap<>();


    public static void initialize(ModContext context) {
        registry.replaceAll((k, v) -> context.registerSound(k));
    }

    public static boolean hasSound(String name) {
        return registry.containsKey(name.toLowerCase());
    }

    public static SoundEvent lookupSound(String soundName) {
        return registry.get(soundName.toLowerCase());
    }

    public static void registerSoundToLookup(String name) {
        registry.put(name.toLowerCase(), null);
    }


}
