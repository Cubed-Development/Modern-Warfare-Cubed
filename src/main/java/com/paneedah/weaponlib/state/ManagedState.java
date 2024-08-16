package com.paneedah.weaponlib.state;

import com.paneedah.mwc.network.ISerializable;

public interface ManagedState<T extends ManagedState<T>> extends ISerializable {

    default T preparingPhase() {
        return null;
    }

    default T permitRequestedPhase() {
        return null;
    }

    default T commitPhase() {
        return null;
    }

    default boolean isTransient() {
        return false;
    }

    int ordinal();

    /**
     * Verifies if the mainState matches this state, preparing phase of this state or permit requested phase
     * of this state.
     *
     * @param mainState
     *
     * @return
     */
    default boolean matches(T mainState) {
        return mainState == this
                || mainState == preparingPhase()
                || mainState == permitRequestedPhase();
    }
}
