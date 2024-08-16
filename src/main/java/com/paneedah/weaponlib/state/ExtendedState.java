package com.paneedah.weaponlib.state;

public interface ExtendedState<T extends ManagedState<T>> {

    boolean setState(T updateToState);

    T getState();

    long getStateUpdateTimestamp();

    <E extends ExtendedState<T>> void prepareTransaction(E finallyUpdateToState);

}
