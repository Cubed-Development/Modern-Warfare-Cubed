package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class CompatibleSound {
    
    public static final CompatibleSound SNOWBALL_THROW = new CompatibleSound(SoundEvents.ENTITY_SNOWBALL_THROW);
	
	private SoundEvent soundEvent;
	private ResourceLocation soundResourceLocation;
	
	public CompatibleSound(ResourceLocation soundResourceLocation) {
		this.soundResourceLocation = soundResourceLocation;
		this.soundEvent = new SoundEvent(soundResourceLocation);
	}

	private CompatibleSound(SoundEvent soundEvent) {
        this.soundEvent = soundEvent;
    }

    public SoundEvent getSound() {
		return soundEvent;
	}

	public ResourceLocation getResourceLocation() {
		return soundResourceLocation;
	}
}
