package com.paneedah.weaponlib;

import lombok.Getter;

public class AsyncWeaponState {

    @Getter
    private final WeaponState state;
    @Getter
    private final long timestamp;
    @Getter
    private final long duration;
    private boolean isInfinite;

    public AsyncWeaponState(WeaponState state, long timestamp) {
        this.state = state;
        this.timestamp = timestamp;
        duration = Integer.MAX_VALUE;
        isInfinite = true;
    }

    public AsyncWeaponState(WeaponState state, long timestamp, long duration) {
        this.state = state;
        this.timestamp = timestamp;
        this.duration = duration;
    }

    public boolean isInfinite() {
        return isInfinite;
    }

}
