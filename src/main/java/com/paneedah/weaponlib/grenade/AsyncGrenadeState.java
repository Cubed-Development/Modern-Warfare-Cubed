package com.paneedah.weaponlib.grenade;

import lombok.Getter;

public class AsyncGrenadeState {

    @Getter
    private final GrenadeState state;
    @Getter
    private final long timestamp;
    @Getter
    private final long duration;
    private boolean isInfinite;

    public AsyncGrenadeState(GrenadeState state, long timestamp) {
        this.state = state;
        this.timestamp = timestamp;
        duration = Integer.MAX_VALUE;
        isInfinite = true;
    }

    public AsyncGrenadeState(GrenadeState state, long timestamp, long duration) {
        this.state = state;
        this.timestamp = timestamp;
        this.duration = duration;
    }

    public boolean isInfinite() {
        return isInfinite;
    }

}
