package com.paneedah.weaponlib.state;

import com.paneedah.mwc.network.NetworkPermitManager;

public interface Aspect<T extends ManagedState<T>, E extends ExtendedState<T>> {

    void setStateManager(StateManager<T, ? super E> stateManager);

    void setPermitManager(NetworkPermitManager permitManager);
}
