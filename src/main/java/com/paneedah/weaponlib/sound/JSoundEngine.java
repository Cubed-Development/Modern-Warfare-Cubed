package com.paneedah.weaponlib.sound;

import com.paneedah.mwc.utils.ModReference;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.EFX10;
import org.lwjgl.openal.EFXUtil;
import org.lwjgl.util.WaveData;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

/**
 * $Id$
 * <p>
 * Lesson 1: Single Static Source
 * </p>
 * 
 * @author Brian Matzon <brian@matzon.dk>
 * @version $Revision$
 */
public class JSoundEngine {

	/** Buffers hold sound data. */
	IntBuffer buffer = BufferUtils.createIntBuffer(1);

	/** Sources are points emitting sound. */
	IntBuffer source = BufferUtils.createIntBuffer(8);

	/** Position of the source sound. */
	FloatBuffer sourcePos = BufferUtils.createFloatBuffer(3).put(new float[] { 0.0f, 0.0f, 0.0f });

	/*
	 * These are 3D cartesian vector coordinates. A structure or class would be a
	 * more flexible of handling these, but for the sake of simplicity we will just
	 * leave it as is.
	 */

	public float[] volumes = new float[] {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
	
	/** Velocity of the source sound. */
	FloatBuffer sourceVel = BufferUtils.createFloatBuffer(3).put(new float[] { 0.0f, 0.0f, 0.0f });

	/** Position of the listener. */
	FloatBuffer listenerPos = BufferUtils.createFloatBuffer(3).put(new float[] { 0.0f, 0.0f, 0.0f });

	/** Velocity of the listener. */
	FloatBuffer listenerVel = BufferUtils.createFloatBuffer(3).put(new float[] { 0.0f, 0.0f, 0.0f });

	/**
	 * Orientation of the listener. (first 3 elements are "at", second 3 are "up")
	 * Also note that these should be units of '1'.
	 */
	FloatBuffer listenerOri = BufferUtils.createFloatBuffer(6).put(new float[] { 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f });

	public static JSoundEngine instance;

	public static JSoundEngine getInstance() {
		if (instance == null) {
			instance = new JSoundEngine();
		}
		return instance;
	}

	public JSoundEngine() {

		// CRUCIAL!
		// any buffer that has data added, must be flipped to establish its position and
		// limits
		sourcePos.flip();
		sourceVel.flip();
		listenerPos.flip();
		listenerVel.flip();
		listenerOri.flip();
	}

	public static int auxFXSlot0;
	public static int echo0;
	public static int sendFilter0;
	public static int directFilter0;

	/**
	 * boolean LoadALData()
	 *
	 * This function will load our sample data from the disk using the Alut utility
	 * and send the data into OpenAL as a buffer. A source is then also created to
	 * play that buffer.
	 */
	int loadALData() {
		// Load wav data into a buffer.
		AL10.alGenBuffers(buffer);

		if (AL10.alGetError() != AL10.AL_NO_ERROR) {

			return AL10.AL_FALSE;
		}

		ResourceLocation loc = new ResourceLocation(ModReference.ID + ":sounds/m4a1.wav");
		InputStream is = null;
		try {
			is = mc.getResourceManager().getResource(loc).getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedInputStream bis = new BufferedInputStream(is);
		// http://forum.lwjgl.org/index.php?topic=3890.0

		WaveData waveFile = WaveData.create(bis);

		// WaveData waveFile = WaveData.create("FancyPants.wav");

		// AL10.alBufferData(buffer.get(0), 0, vorb.getNextAudioPacket()., 0);
		AL10.alBufferData(buffer.get(0), waveFile.format, waveFile.data, waveFile.samplerate);
		waveFile.dispose();

		if (AL10.alGetError() != AL10.AL_NO_ERROR) {
			System.out.println("Error buffering");
			return AL10.AL_FALSE;
		}
		
		if(1+1==2) {
			return AL10.AL_TRUE;
		}
		/*
		
		// Bind the buffer with the source.
		AL10.alGenSources(source);

		int er = AL10.alGetError();
		if (er != AL10.AL_NO_ERROR) {
			System.out.println(getALErrorString(er));
			// System.out.println("Error generating source!");
			return AL10.AL_FALSE;
		}
		FloatBuffer sourcesad = BufferUtils.createFloatBuffer(3).put(new float[] { 100.0f, 0.0f, 0.0f });

		AL10.alSourcei(source.get(0), AL10.AL_BUFFER, buffer.get(0));
		AL10.alSourcef(source.get(0), AL10.AL_PITCH, 1.0f);
		AL10.alSourcef(source.get(0), AL10.AL_GAIN, 1.0f);
		AL10.alSource(source.get(0), AL10.AL_POSITION, sourcesad);
		AL10.alSource(source.get(0), AL10.AL_VELOCITY, sourceVel);
		
		*/
		
		//AL10.alSourcei(source.get(0), AL10.AL_LOOPING, AL10.AL_FALSE);

		// sllots
		/*
		 * auxFXSlot0 = EFX10.alGenAuxiliaryEffectSlots();
		 * EFX10.alAuxiliaryEffectSloti(auxFXSlot0,
		 * EFX10.AL_EFFECTSLOT_AUXILIARY_SEND_AUTO, AL10.AL_TRUE);
		 * 
		 * echo0 = EFX10.alGenEffects(); EFX10.alEffecti(echo0, EFX10.AL_EFFECT_TYPE,
		 * EFX10.AL_EFFECT_EAXREVERB);
		 * 
		 * sendFilter0 = EFX10.alGenFilters(); EFX10.alFilteri(sendFilter0,
		 * EFX10.AL_FILTER_TYPE, EFX10.AL_FILTER_LOWPASS);
		 * 
		 * directFilter0 = EFX10.alGenFilters(); EFX10.alFilteri(directFilter0,
		 * EFX10.AL_FILTER_TYPE, EFX10.AL_FILTER_LOWPASS);
		 * 
		 * // do stuff EFX10.alFilterf(sendFilter0, EFX10.AL_LOWPASS_GAIN, 1);
		 * EFX10.alFilterf(sendFilter0, EFX10.AL_LOWPASS_GAINHF, 1);
		 * AL11.alSource3i(source.get(0), EFX10.AL_AUXILIARY_SEND_FILTER, auxFXSlot0, 0,
		 * sendFilter0);
		 * 
		 * EFX10.alFilterf(directFilter0, EFX10.AL_LOWPASS_GAIN, 1);
		 * EFX10.alFilterf(directFilter0, EFX10.AL_LOWPASS_GAINHF, 1);
		 * AL10.alSourcei(source.get(0), EFX10.AL_DIRECT_FILTER, directFilter0);
		 */
		// Do another error check and return.
		if (AL10.alGetError() == AL10.AL_NO_ERROR)
			return AL10.AL_TRUE;

		return AL10.AL_FALSE;
	}

	public HashMap<Integer, Float> volumesMap = new HashMap<>();
	public ArrayList<Integer> toDim = new ArrayList<>();
	
	public int createFirstBuffer() {
		//System.out.println(velo);
		
		ArrayList<Integer> removal = new ArrayList<>();
	//	toDim.clear();
		for(int i : toDim) {
			
			
			if(!volumesMap.containsKey(i)) {
				volumesMap.put(i, 1.0f);
			}
			volumesMap.put(i, volumesMap.get(i)-0.05f);
			
			if(volumesMap.get(i) < 0.0) {
				volumesMap.remove(i);
			} else {
				
				AL10.alSourcef(source.get(i), AL10.AL_GAIN, volumesMap.get(i));
				
			}
			 
		}
		
		for(int i : removal) {
			toDim.remove(toDim.indexOf(i));
		}
		
	
		
		//System.out.println(AL10.alIsSource(0));
		// AL10.alSourcef(source.get(0), AL10.AL_PITCH, 1.0f);
		    
		
		
		
		
		return 0;
	}
	
	private void addSource(int type) {
	    int position = source.position();
	    source.limit(position + 1);
	    
	    System.out.println(position);
	    AL10.alGenSources(source);

	    if (AL10.alGetError() != AL10.AL_NO_ERROR) {
	      System.out.println("Error generating audio source.");
	      //System.exit(-1);
	    }
	    
	   // toDim.clear();
	   
	    toDim.add(position-1);
	    
	 	
	 	
	    
	    AL10.alSourcei(source.get(position), AL10.AL_BUFFER,   buffer.get(type) );
	    AL10.alSourcef(source.get(position), AL10.AL_PITCH,    1.1f             );
	    AL10.alSourcef(source.get(position), AL10.AL_GAIN,     1.0f             );
	    AL10.alSource (source.get(position), AL10.AL_POSITION, sourcePos        );
	    AL10.alSource (source.get(position), AL10.AL_VELOCITY, sourceVel        );
	    AL10.alSourcei(source.get(position), AL10.AL_LOOPING,  AL10.AL_FALSE     );

	    
	    AL10.alSourcePlay(source.get(position));

	    
	    
	    
	   
	    
	    // next index
	    if(position+1 != source.capacity()) {
	    	source.position(position+1);
	    } else {
	    	for(int x = 0; x < source.capacity()/2; ++x) {
	    		toDim.remove(toDim.indexOf(x));
	    		AL10.alDeleteSources(source.get(x));
	    	}
	    	source.position(0);
	    	 
	    }
	    
	  }
	

	/**
	 * void setListenerValues()
	 *
	 * We already defined certain values for the Listener, but we need to tell
	 * OpenAL to use that data. This function does just that.
	 */
	void setListenerValues() {
		AL10.alListener(AL10.AL_POSITION, listenerPos);
		AL10.alListener(AL10.AL_VELOCITY, listenerVel);
		AL10.alListener(AL10.AL_ORIENTATION, listenerOri);
	}

	/**
	 * void killALData()
	 *
	 * We have allocated memory for our buffers and sources which needs to be
	 * returned to the system. This function frees that memory.
	 */
	public void killALData() {
		AL10.alDeleteSources(source);
		AL10.alDeleteBuffers(buffer);
	}

	public static float velo = 0.0f;
	public static long time = System.currentTimeMillis();

	public static boolean loaded = false;

	public void playSound() {

		if(!loaded) {
			source.rewind();
			loadALData();
			//addSource(0);
			//addSource(1);
			loaded = true;
		}
		/*
		if (!loaded) {
			loaded = true;
			AL10.alGetError();

			// Load the wav data.
			if (loadALData() == AL10.AL_FALSE) {
				System.out.println("Error loading data.");
				return;
			}
		}*/
		
		//setListenerValues();
		addSource(0);
		velo = 1.0f;
		//AL10.alSourcePlay(source.get(0));
		
	}

	public void execute() {
		// Initialize OpenAL and clear the error bit.
		/*
		 * try { //AL.create(null, 15, 22050, true); } catch (LWJGLException le) {
		 * le.printStackTrace(); return; }
		 */
		AL10.alGetError();

		// Load the wav data.
		if (loadALData() == AL10.AL_FALSE) {
			System.out.println("Error loading data.");
			return;
		}

		setListenerValues();
		// checkSupport();
		AL10.alSourcePlay(source.get(0));

		if (1 + 1 == 2)
			return;

		System.out.print("MindCode's OpenAL Lesson 1: Single Static Source\n\n");
		System.out.print("Controls:\n");
		System.out.print("p) Play\n");
		System.out.print("s) Stop\n");
		System.out.print("h) Hold (pause)\n");
		System.out.print("q) Quit\n\n");

		// Loop.
		char c = ' ';
		while (c != 'q') {
			try {
				c = (char) System.in.read();
			} catch (IOException ioe) {
				c = 'q';
			}

			switch (c) {
			// Pressing 'p' will begin playing the sample.
			case 'p':
				AL10.alSourcePlay(source.get(0));
				break;

			// Pressing 's' will stop the sample from playing.
			case 's':
				AL10.alSourceStop(source.get(0));
				break;

			// Pressing 'h' will pause the sample.
			case 'h':
				AL10.alSourcePause(source.get(0));
				break;
			// case '1': System.out.println("Suspend");ALC10.alcSuspendContext(); break;
			// case '2': ALC10.alcProcessContext(); break;

			}
			;

		}

		killALData();
	}

	public static void checkSupport() {
		System.out.println("Checking supported effects ...");
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_NULL)) {
			System.out.println("AL_EFFECT_NULL is supported.");
		} else {
			System.out.println("AL_EFFECT_NULL is NOT supported.");
		}
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_EAXREVERB)) {
			System.out.println("AL_EFFECT_EAXREVERB is supported.");
		} else {
			System.out.println("AL_EFFECT_EAXREVERB is NOT supported.");
		}
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_REVERB)) {
			System.out.println("AL_EFFECT_REVERB is supported.");
		} else {
			System.out.println("AL_EFFECT_REVERB is NOT supported.");
		}
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_CHORUS)) {
			System.out.println("AL_EFFECT_CHORUS is supported.");
		} else {
			System.out.println("AL_EFFECT_CHORUS is NOT supported.");
		}
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_DISTORTION)) {
			System.out.println("AL_EFFECT_DISTORTION is supported.");
		} else {
			System.out.println("AL_EFFECT_DISTORTION is NOT supported.");
		}
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_ECHO)) {
			System.out.println("AL_EFFECT_ECHO is supported.");
		} else {
			System.out.println("AL_EFFECT_ECHO is NOT supported.");
		}
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_FLANGER)) {
			System.out.println("AL_EFFECT_FLANGER is supported.");
		} else {
			System.out.println("AL_EFFECT_FLANGER is NOT supported.");
		}
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_FREQUENCY_SHIFTER)) {
			System.out.println("AL_EFFECT_FREQUENCY_SHIFTER is supported.");
		} else {
			System.out.println("AL_EFFECT_FREQUENCY_SHIFTER is NOT supported.");
		}
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_VOCAL_MORPHER)) {
			System.out.println("AL_EFFECT_VOCAL_MORPHER is supported.");
		} else {
			System.out.println("AL_EFFECT_VOCAL_MORPHER is NOT supported.");
		}
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_PITCH_SHIFTER)) {
			System.out.println("AL_EFFECT_PITCH_SHIFTER is supported.");
		} else {
			System.out.println("AL_EFFECT_PITCH_SHIFTER is NOT supported.");
		}
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_RING_MODULATOR)) {
			System.out.println("AL_EFFECT_RING_MODULATOR is supported.");
		} else {
			System.out.println("AL_EFFECT_RING_MODULATOR is NOT supported.");
		}
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_AUTOWAH)) {
			System.out.println("AL_EFFECT_AUTOWAH is supported.");
		} else {
			System.out.println("AL_EFFECT_AUTOWAH is NOT supported.");
		}
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_COMPRESSOR)) {
			System.out.println("AL_EFFECT_COMPRESSOR is supported.");
		} else {
			System.out.println("AL_EFFECT_COMPRESSOR is NOT supported.");
		}
		if (EFXUtil.isEffectSupported(EFX10.AL_EFFECT_EQUALIZER)) {
			System.out.println("AL_EFFECT_EQUALIZER is supported.");
		} else {
			System.out.println("AL_EFFECT_EQUALIZER is NOT supported.");
		}

		System.out.println();
		System.out.println("Checking supported filters ...");
		if (EFXUtil.isFilterSupported(EFX10.AL_FILTER_NULL)) {
			System.out.println("AL_FILTER_NULL is supported.");
		} else {
			System.out.println("AL_FILTER_NULL is NOT supported.");
		}
		if (EFXUtil.isFilterSupported(EFX10.AL_FILTER_LOWPASS)) {
			System.out.println("AL_FILTER_LOWPASS is supported.");
		} else {
			System.out.println("AL_FILTER_LOWPASS is NOT supported.");
		}
		if (EFXUtil.isFilterSupported(EFX10.AL_FILTER_HIGHPASS)) {
			System.out.println("AL_FILTER_HIGHPASS is supported.");
		} else {
			System.out.println("AL_FILTER_HIGHPASS is NOT supported.");
		}
		if (EFXUtil.isFilterSupported(EFX10.AL_FILTER_BANDPASS)) {
			System.out.println("AL_FILTER_BANDPASS is supported.");
		} else {
			System.out.println("AL_FILTER_BANDPASS is NOT supported.");
		}
	}

	public static void main(String[] args) {

		new JSoundEngine().execute();
		// System.out.println("yo");
		//

	}

	public String getALErrorString(int err) {
		switch (err) {
		case AL10.AL_NO_ERROR:
			return "AL_NO_ERROR";
		case AL10.AL_INVALID_NAME:
			return "AL_INVALID_NAME";
		case AL10.AL_INVALID_ENUM:
			return "AL_INVALID_ENUM";
		case AL10.AL_INVALID_VALUE:
			return "AL_INVALID_VALUE";
		case AL10.AL_INVALID_OPERATION:
			return "AL_INVALID_OPERATION";
		case AL10.AL_OUT_OF_MEMORY:
			return "AL_OUT_OF_MEMORY";
		default:
			return "No such error code";
		}
	}

}
