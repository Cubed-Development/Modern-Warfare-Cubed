package com.paneedah.weaponlib.animation;

import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.Vec3d;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MultipartTransition<Part, Context> {

    private static final Consumer<?> DEFAULT_POSITION = c -> {};

    @SuppressWarnings("unchecked")
    public static <Context> Consumer<Context> anchoredPosition() {
        return (Consumer<Context>) DEFAULT_POSITION;
    }

    public Context cont;
    
    private Map<Part, Consumer<Context>> multipartPositionFunctions = new HashMap<>();
	private Map<Part, Part> attachedTo = new HashMap<>();
	private long duration;
	private long pause;
	
	public SoundEvent sound;
	
	public Vec3d beizer;
	public Interpolation interp = Interpolation.SMOOTHSTEP;
	
	public MultipartTransition(Part part, Consumer<Context> positionFunction, long duration, long pause) {
		this.duration = duration;
		this.pause = pause;
		multipartPositionFunctions.put(part, positionFunction);
	}

	public MultipartTransition(Part part, Consumer<Context> positionFunction, long duration) {
		this(part, positionFunction, duration, 0);
	}

	public MultipartTransition(long duration, long pause) {
		this.duration = duration;
		this.pause = pause;
	}
	
	public MultipartTransition(long duration, long pause, Interpolation interp) {
		this.duration = duration;
		this.pause = pause;
		this.interp = interp;
	}
	
	public MultipartTransition(long duration, long pause, Vec3d beizer) {
		this.duration = duration;
		this.pause = pause;
		this.beizer = beizer;
	}
	
	public boolean animationUsesBeizer() {
		return this.beizer != null;
	}
	
	public Interpolation getInterpolationType() {
		return this.interp;
	}

	public MultipartTransition(long duration) {
		this(duration, 0);
	}

	public MultipartTransition<Part, Context> withPartPositionFunction(Part part, Consumer<Context> positionFunction) {
        return withPartPositionFunction(part, null, positionFunction);
    }

	public MultipartTransition<Part, Context> withPartPositionFunction(Part part, Part attachedTo, Consumer<Context> positionFunction) {
		this.multipartPositionFunctions.put(part, positionFunction);
		this.attachedTo.put(part, attachedTo);
		return this;
	}

	public void position(Part part, Context context) {
		
		Consumer<Context> positionFunction = multipartPositionFunctions.get(part);
		if(positionFunction == null) {
//			throw new IllegalArgumentException("Don't know anything about part " + part);
			positionFunction = anchoredPosition();
		}
		positionFunction.accept(context);
	}

	public Consumer<Context> getPositioning(Part part) {
	    return multipartPositionFunctions.get(part);
	}
	
	public Context getContext() {
		return this.cont;
	}

	public long getDuration() {
		return duration;
	}

	public long getPause() {
		return pause;
	}

    public Part getAttachedTo(Part part) {
        return attachedTo.get(part);
    }
}
