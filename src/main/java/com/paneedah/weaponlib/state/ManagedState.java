package com.paneedah.weaponlib.state;

import com.paneedah.weaponlib.network.UniversallySerializable;

public interface ManagedState<T extends ManagedState<T>> extends UniversallySerializable {

	public default T preparingPhase() {
		return null;
	}
	
	public default T permitRequestedPhase() {
		return null;
	}
	
	public default T commitPhase() {
		return null;
	}
	
	public default boolean isTransient() {
		return false;
	}
	
	public int ordinal();
	
	/**
	 * Verifies if the mainState matches this state, preparing phase of this state or permit requested phase
	 * of this state.
	 * 
	 * @param mainState
	 * @return
	 */
	public default boolean matches(T mainState) {
		return mainState == this 
				|| mainState == preparingPhase() 
				|| mainState == permitRequestedPhase();
	}
}
