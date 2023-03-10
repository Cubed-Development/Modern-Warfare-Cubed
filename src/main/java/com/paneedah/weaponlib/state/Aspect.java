package com.paneedah.weaponlib.state;

public interface Aspect<T extends ManagedState<T>, E extends ExtendedState<T>> {

	public void setStateManager(StateManager<T, ? super E> stateManager);

	public void setPermitManager(PermitManager permitManager);
}
