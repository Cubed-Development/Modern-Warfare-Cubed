package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleSound;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaterialImpactSound {

    private final List<CompatibleSound> sounds = new ArrayList<>();
    private final float volume;
    private final Random rand = new Random();
    
    public MaterialImpactSound(float volume) {
        this.volume = volume;
    }
    
    public void addSound(CompatibleSound sound) {
        sounds.add(sound);
    }
    
    public CompatibleSound getSound() {
        int soundIndex = rand.nextInt(sounds.size());
        return sounds.get(soundIndex);
    }
    
    public float getVolume() {
        return volume;
    }
}