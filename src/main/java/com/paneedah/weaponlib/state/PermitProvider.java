package com.paneedah.weaponlib.state;

public interface PermitProvider<S extends ManagedState<S>, Context> {

    void set(Permit<S> permit, S targetState, Context context);

    Permit<S> get(S targetState, Context context);
}
