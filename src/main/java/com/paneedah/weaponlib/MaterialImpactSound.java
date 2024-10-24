package com.paneedah.weaponlib;

import lombok.Getter;
import net.minecraft.util.SoundEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaterialImpactSound {
    private final List<SoundEvent> sounds = new ArrayList<>();
    @Getter
    private final float volume;
    private final Random rand = new Random();

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

}
