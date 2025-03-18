package com.paneedah.weaponlib.melee;

import lombok.Getter;

@Getter
public class AsyncMeleeState {

    private final MeleeState state;
    private final long timestamp;
    private final long duration;
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

}
