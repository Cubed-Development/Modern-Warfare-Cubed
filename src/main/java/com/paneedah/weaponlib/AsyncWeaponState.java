package com.paneedah.weaponlib;

import lombok.Getter;

@Getter
public class AsyncWeaponState {

    private final WeaponState state;
    private final long timestamp;
    private final long duration;
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

}
