package com.paneedah.weaponlib.melee;

public class AsyncMeleeState {

	private MeleeState state;
	private long timestamp;
	private long duration;
	private boolean isInfinite;
	
	public AsyncMeleeState(MeleeState state, long timestamp) {
		this.state = state;
		this.timestamp = timestamp;
		this.duration = Integer.MAX_VALUE;
		this.isInfinite = true;
	}

	public AsyncMeleeState(MeleeState state, long timestamp, long duration) {
		this.state = state;
		this.timestamp = timestamp;
		this.duration = duration;
	}

	public MeleeState getState() {
		return state;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public long getDuration() {
		return duration;
	}

	public boolean isInfinite() {
		return isInfinite;
	}

}
