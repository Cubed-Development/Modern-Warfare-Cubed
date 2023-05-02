package com.paneedah.mwc.weaponlib.vehicle;

public class SimpleAnimationTimer {
	
	private int time = 0, maxTime;
	private boolean isDone = false;
	private boolean shouldLoop = false;
	
	public SimpleAnimationTimer(int maxTime, boolean loop) {
		this.maxTime = maxTime;
		this.shouldLoop = loop;
	}
	
	public void setMaxTime(int max) {
		this.maxTime = maxTime;
	}
	
	public void setLoop(boolean shouldLoop) {
		this.shouldLoop = shouldLoop;
	}
	
	public void tick() {
		if(shouldLoop) {
			if(isDone) reset();
		} else {
			if(isDone) return;
		}
		time += 1;
		if(time >= maxTime) {
			isDone = true;
			time = maxTime;
		}
	}
	
	public boolean isComplete() {
		return this.isDone;
	}
	
	public void reset() {
		isDone = false;
		time = 0;
	}
	
	public double getLinearProgress() {
		return time/(double) maxTime;
	}
	
	public double getSmoothStepProgress() {
		float mu2 = (float) ((1 - Math.cos(getLinearProgress() * Math.PI)) / 2f);
		return mu2;
	}
	
	public double smoothInterpDouble(double start, double end) {
		return start + (end-start)*getSmoothStepProgress();
	}

}
