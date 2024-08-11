package com.paneedah.weaponlib.state;

import com.paneedah.mwc.network.NetworkPermitManager;

public interface Aspect<T extends ManagedState<T>, E extends ExtendedState<T>> {

    public void setStateManager(StateManager<T, ? super E> stateManager);

    public void setPermitManager(NetworkPermitManager permitManager);
}
