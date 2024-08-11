package com.paneedah.weaponlib;

import net.minecraft.util.SoundEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaterialImpactSound {
    private List<SoundEvent> sounds = new ArrayList<>();
    private float volume;
    private Random rand = new Random();

    public MaterialImpactSound(float volume) {
        this.volume = volume;
    }

    public void addSound(SoundEvent sound) {
        sounds.add(sound);
    }

    public SoundEvent getSound() {
        int soundIndex = rand.nextInt(sounds.size());
        return sounds.get(soundIndex);
    }

    public float getVolume() {
        return volume;
    }
}
