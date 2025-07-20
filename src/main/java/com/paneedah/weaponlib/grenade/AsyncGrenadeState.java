package com.paneedah.weaponlib.grenade;

import lombok.Getter;

@Getter
public class AsyncGrenadeState {

    private final GrenadeState state;
    private final long timestamp;
    private final long duration;
    private boolean isInfinite;

    public AsyncGrenadeState(GrenadeState state, long timestamp) {
        this.state = state;
        this.timestamp = timestamp;
        this.duration = Integer.MAX_VALUE;
        this.isInfinite = true;
    }

    public AsyncGrenadeState(GrenadeState state, long timestamp, long duration) {
        this.state = state;
        this.timestamp = timestamp;
        this.duration = duration;
    }

}
