package com.paneedah.weaponlib.state;

public interface ExtendedState<T extends ManagedState<T>> {

	public boolean setState(T updateToState);

	public T getState();
	
	public long getStateUpdateTimestamp();
	
	public <E extends ExtendedState<T>>void prepareTransaction(E finallyUpdateToState);

}
