package com.paneedah.weaponlib.state;

import java.util.function.BiConsumer;

public interface PermitManager {
	
	public <S extends ManagedState<S>, P extends Permit<S>, E extends ExtendedState<S>> 
		void request(P permit, E extendedState, BiConsumer<P, E> callback);
	
	public <S extends ManagedState<S>, P extends Permit<S>, E extends ExtendedState<S>> 
		void registerEvaluator(Class<? extends P> permitClass, Class<? extends E> esClass, BiConsumer<P, E> evaluator);
}