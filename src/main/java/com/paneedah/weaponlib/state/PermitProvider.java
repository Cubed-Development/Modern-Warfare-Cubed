package com.paneedah.weaponlib.state;

public interface PermitProvider<S extends ManagedState<S>, Context> {

	public void set(Permit<S> permit, S targetState, Context context);
	
	public Permit<S> get(S targetState, Context context);
}
