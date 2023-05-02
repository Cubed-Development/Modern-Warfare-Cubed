package com.paneedah.mwc.weaponlib;

public class AsyncWeaponState {

	private WeaponState state;
	private long timestamp;
	private long duration;
	private boolean isInfinite;
	
	public AsyncWeaponState(WeaponState state, long timestamp) {
		this.state = state;
		this.timestamp = timestamp;
		this.duration = Integer.MAX_VALUE;
		this.isInfinite = true;
	}

	public AsyncWeaponState(WeaponState state, long timestamp, long duration) {
		this.state = state;
		this.timestamp = timestamp;
		this.duration = duration;
	}

	public WeaponState getState() {
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
