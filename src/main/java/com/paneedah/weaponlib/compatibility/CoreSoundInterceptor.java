package com.paneedah.weaponlib.compatibility;

import net.minecraft.util.math.MathHelper;
import org.lwjgl.openal.*;
import paulscode.sound.SoundSystem;

public class CoreSoundInterceptor {

	public static SoundSystem soundSystem;
	
	private static int reverb0;
    private static int auxFXSlot0;
    
    private static int distortion0;
    private static int auxFXSlot1;
    
    private static int dFilter0;
    private static int sFilter0;
    
    private static int dFilter1;
    private static int sFilter1;
	
    private static int echo0;
    
    public static void init(SoundSystem snds) {
		soundSystem = snds;
		try {
			setup();
		} catch (Throwable e) {
			System.out.println("Failed to setup the sound system. Might be an incompatibility.");
		}
	}
    
	public static void setup() {
		ALCcontext context = ALC10.alcGetCurrentContext();
		ALCdevice device = ALC10.alcGetContextsDevice(context);
		
		if(!ALC10.alcIsExtensionPresent(device, "ALC_EXT_EFX")) {
			System.out.println("Setup failed!");
			return;
		}
		
		
		
		System.out.println(EFXUtil.isEfxSupported());
		System.out.println("Reverb: " + EFXUtil.isEffectSupported(EFX10.AL_EFFECT_EAXREVERB));
		System.out.println("Disto: " + EFXUtil.isEffectSupported(EFX10.AL_EFFECT_DISTORTION));
		System.out.println("Comp: " + EFXUtil.isEffectSupported(EFX10.AL_EFFECT_COMPRESSOR));
		
		System.out.println("Echo: " + EFXUtil.isEffectSupported(EFX10.AL_EFFECT_ECHO));
		System.out.println("PitchShift: " + EFXUtil.isEffectSupported(EFX10.AL_EFFECT_PITCH_SHIFTER));
		System.out.println("RingMod: " + EFXUtil.isEffectSupported(EFX10.AL_EFFECT_RING_MODULATOR));
		
		System.out.println("VocMorph: " + EFXUtil.isEffectSupported(EFX10.AL_EFFECT_VOCAL_MORPHER));
		
		
		auxFXSlot0 = EFX10.alGenAuxiliaryEffectSlots();
		EFX10.alAuxiliaryEffectSloti(auxFXSlot0, EFX10.AL_EFFECTSLOT_AUXILIARY_SEND_AUTO, AL10.AL_TRUE);
		
		//disto auxFX
		auxFXSlot1 = EFX10.alGenAuxiliaryEffectSlots();
		EFX10.alAuxiliaryEffectSloti(auxFXSlot1, EFX10.AL_EFFECTSLOT_AUXILIARY_SEND_AUTO, AL10.AL_TRUE);
		
		// disto filter
		distortion0 = EFX10.alGenEffects();
		EFX10.alEffecti(distortion0, EFX10.AL_EFFECT_TYPE, EFX10.AL_EFFECT_DISTORTION);
		checkErrorLog("fuck you");
		
		// echo filter
		echo0 = EFX10.alGenEffects();
		EFX10.alEffecti(echo0, EFX10.AL_EFFECT_TYPE, EFX10.AL_EFFECT_FLANGER);
		
		
		reverb0 = EFX10.alGenEffects();
		EFX10.alEffecti(reverb0, EFX10.AL_EFFECT_TYPE, EFX10.AL_EFFECT_REVERB);
		
		dFilter0 = EFX10.alGenFilters();
		EFX10.alFilteri(dFilter0, EFX10.AL_FILTER_TYPE, EFX10.AL_FILTER_LOWPASS);
		
		sFilter0 = EFX10.alGenFilters();
		EFX10.alFilteri(sFilter0, EFX10.AL_FILTER_TYPE, EFX10.AL_FILTER_LOWPASS);
		
		sFilter1 = EFX10.alGenFilters();
		EFX10.alFilteri(sFilter1, EFX10.AL_FILTER_TYPE, EFX10.AL_FILTER_LOWPASS);
		
		
		System.out.println("Setup complete!");
		//setupReverbSlot(reverb0, auxFXSlot0);
		
		setupReverbSlot(reverb0, auxFXSlot0);
		setupDistortionSlot(distortion0, auxFXSlot1);
		
	}
	
	
	
	
	public static void onPlaySound(final float posX, final float posY, final float posZ, final int sourceID) {
		
		
		/*
		EFX10.alFilterf(sFilter0, EFX10.AL_LOWPASS_GAIN, 0.6f);
		EFX10.alFilterf(sFilter0, EFX10.AL_LOWPASS_GAINHF, 0.3f);
		AL11.alSource3i(sourceID, EFX10.AL_AUXILIARY_SEND_FILTER, auxFXSlot0, 0, sFilter0);
		*/
	
		//setupEchoSlot(distortion0, auxFXSlot1);
		/*
		EFX10.alFilterf(sFilter1, EFX10.AL_LOWPASS_GAIN, 0.0f);
		EFX10.alFilterf(sFilter1, EFX10.AL_LOWPASS_GAINHF, 1.0f);*/
		AL11.alSource3i(sourceID, EFX10.AL_AUXILIARY_SEND_FILTER, auxFXSlot1, 1, EFX10.AL_FILTER_NULL);
		
	
		
		float directCutoff = 0.7f;

		EFX10.alFilterf(dFilter0, EFX10.AL_LOWPASS_GAIN, (float) Math.pow(directCutoff, 0.1));
		EFX10.alFilterf(dFilter0, EFX10.AL_LOWPASS_GAINHF, directCutoff);
		AL10.alSourcei(sourceID, EFX10.AL_DIRECT_FILTER, dFilter0);

		AL10.alSourcef(sourceID, EFX10.AL_AIR_ABSORPTION_FACTOR, MathHelper.clamp(1.0f * 0.4f,0.0f,10.0f));
		//System.out.println("what the fuck is up bro?");
	}
	
	
	public static void setupReverbSlot(int slot, int auxiliarySlot) {
		float decayTime = 4.15f;
    	float density = 0.0f;
    	float diffusion = 1.0f;
    	float gain = 0.2f * 0.85f;
    	float gainHF = 0.99f;
    	float decayHFRatio = 0.6f;
    	float reflectionsGain = 2.5f;
    	float reflectionsDelay = 0.001f;
    	float lateReverbGain = 1.26f;
    	float lateReverbDelay = 0.011f;
    	float airAbsorptionGainHF = 0.994f;
    	float roomRolloffFactor = 0.16f;
    	float echoTime = 0.090f;
    	float echoDepth = 0.1f;
		
		
		EFX10.alEffectf(slot, EFX10.AL_EAXREVERB_DENSITY, density);
		EFX10.alEffectf(slot, EFX10.AL_EAXREVERB_DIFFUSION, diffusion);
		EFX10.alEffectf(slot, EFX10.AL_EAXREVERB_GAIN, gain);
		EFX10.alEffectf(slot, EFX10.AL_EAXREVERB_GAINHF, gainHF);
		EFX10.alEffectf(slot, EFX10.AL_EAXREVERB_DECAY_TIME, decayTime);
		EFX10.alEffectf(slot, EFX10.AL_EAXREVERB_DECAY_HFRATIO, decayHFRatio);
		EFX10.alEffectf(slot, EFX10.AL_EAXREVERB_REFLECTIONS_GAIN, reflectionsGain);
		EFX10.alEffectf(slot, EFX10.AL_EAXREVERB_LATE_REVERB_GAIN, lateReverbGain);
		EFX10.alEffectf(slot, EFX10.AL_EAXREVERB_LATE_REVERB_DELAY, lateReverbDelay);
		EFX10.alEffectf(slot, EFX10.AL_EAXREVERB_AIR_ABSORPTION_GAINHF, airAbsorptionGainHF);
		EFX10.alEffectf(slot, EFX10.AL_EAXREVERB_ROOM_ROLLOFF_FACTOR, roomRolloffFactor);
		EFX10.alEffectf(slot, EFX10.AL_EAXREVERB_ECHO_TIME, echoTime);
		EFX10.alEffectf(slot, EFX10.AL_EAXREVERB_ECHO_DEPTH, echoDepth);

		EFX10.alAuxiliaryEffectSloti(auxiliarySlot, EFX10.AL_EFFECTSLOT_EFFECT, slot);
		System.out.println("Reverb setup complete :)");
	}
	
	public static void setupDistortionSlot(int slot, int aux) {
		
		float dEdge = 1.0f;
		float dGain = 0.05f;
		float dLowPass = 8000f;
		float dEQCenter = 3600f;
		float dEQBand = 360000f;
		
		EFX10.alEffectf(slot, EFX10.AL_DISTORTION_EDGE, dEdge);
		EFX10.alEffectf(slot, EFX10.AL_DISTORTION_GAIN, dGain);
		EFX10.alEffectf(slot, EFX10.AL_DISTORTION_LOWPASS_CUTOFF, dLowPass);
		EFX10.alEffectf(slot, EFX10.AL_DISTORTION_EQCENTER, dEQCenter);
		EFX10.alEffectf(slot, EFX10.AL_DISTORTION_EQBANDWIDTH, dEQBand);
		
		EFX10.alAuxiliaryEffectSloti(aux, EFX10.AL_EFFECTSLOT_EFFECT, slot);
		System.out.println("Distortion setup complete :)");
		
	}
	
	public static void setupEchoSlot(int slot, int aux) {
		EFX10.alAuxiliaryEffectSloti(aux, EFX10.AL_EFFECTSLOT_EFFECT, slot);
		System.out.println("Echo setup complete :)");
	}
	
	protected static boolean checkErrorLog(final String errorMessage) {
		final int error = AL10.alGetError();
		if (error == AL10.AL_NO_ERROR) {
			return false;
		}

		String errorName;

		switch (error) {
			case AL10.AL_INVALID_NAME:
				errorName = "AL_INVALID_NAME";
				break;
			case AL10.AL_INVALID_ENUM:
				errorName = "AL_INVALID_ENUM";
				break;
			case AL10.AL_INVALID_VALUE:
				errorName = "AL_INVALID_VALUE";
				break;
			case AL10.AL_INVALID_OPERATION:
				errorName = "AL_INVALID_OPERATION";
				break;
			case AL10.AL_OUT_OF_MEMORY:
				errorName = "AL_OUT_OF_MEMORY";
				break;
			default:
				errorName = Integer.toString(error);
				break;
		}

		System.out.println(errorMessage + " OpenAL error " + errorName);
		return true;
	}

}
