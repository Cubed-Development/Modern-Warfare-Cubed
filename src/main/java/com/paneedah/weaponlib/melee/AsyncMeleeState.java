package com.paneedah.weaponlib.melee;

import lombok.Getter;

public class AsyncMeleeState {

    @Getter
    private final MeleeState state;
    @Getter
    private final long timestamp;
    @Getter
    private final long duration;
    private boolean isInfinite;

    public AsyncMeleeState(MeleeState state, long timestamp) {
        this.state = state;
        this.timestamp = timestamp;
        duration = Integer.MAX_VALUE;
        isInfinite = true;
    }

    public AsyncMeleeState(MeleeState state, long timestamp, long duration) {
        this.state = state;
        this.timestamp = timestamp;
        this.duration = duration;
    }

    public boolean isInfinite() {
        return isInfinite;
    }

}
