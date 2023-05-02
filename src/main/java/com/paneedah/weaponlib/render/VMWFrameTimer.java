package com.paneedah.weaponlib.render;

public class VMWFrameTimer {
	private long previousFrame = System.currentTimeMillis();
	private long currentFrame = System.currentTimeMillis();
	
	
	public void markFrame() {
		previousFrame = currentFrame;
		currentFrame = System.currentTimeMillis();
	}
	
	public double getFramerate() {
		return 1/((currentFrame-previousFrame)/1000.0);
	}

}
