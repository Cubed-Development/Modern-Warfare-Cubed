package com.paneedah.weaponlib;

import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;

public enum MagazineState implements ManagedState<MagazineState> {

	READY(false), 
	LOAD_REQUESTED, 
	LOAD(null, LOAD_REQUESTED, null, true),
	UNLOAD_REQUESTED, 
	UNLOAD(null, UNLOAD_REQUESTED, null, true);
	
	private static final int DEFAULT_PRIORITY = 0;

	private MagazineState preparingPhase;
	
	private MagazineState permitRequestedPhase;
	
	private MagazineState commitPhase;
	
	private boolean isTransient;
	
	private int priority = DEFAULT_PRIORITY;
	
	private MagazineState() {
		this(null, null, null, true);
	}
	
	private MagazineState(int priority) {
		this(priority, null, null, null, true);
	}
	
	private MagazineState(boolean isTransient) {
		this(null, null, null, isTransient);
	}
	
//	private WeaponState(WeaponState permitRequestedState, WeaponState transactionFinalState) {
//		this(permitRequestedState, transactionFinalState, true);
//	}
	
	private MagazineState(MagazineState preparingPhase, MagazineState permitRequestedState, MagazineState transactionFinalState, boolean isTransient) {
		this(DEFAULT_PRIORITY, preparingPhase, permitRequestedState, transactionFinalState, isTransient);
	}
	
	private MagazineState(int priority, MagazineState preparingPhase, MagazineState permitRequestedState, MagazineState transactionFinalState, boolean isTransient) {
		this.priority = priority;
		this.preparingPhase = preparingPhase;
		this.permitRequestedPhase = permitRequestedState;
		this.commitPhase = transactionFinalState;
		this.isTransient = false; //isTransient; // TODO: make states non-transient, remove flag from constructor
		//this is required to have up-to-date state on server, e.g. preparing, requested; 
		// otherwise issus arise, e.g. item toss would not work correctly
	}
	
	@Override
	public boolean isTransient() {
		return isTransient;
	}
	
	@Override
	public MagazineState preparingPhase() {
		return preparingPhase;
	}
	
	@Override
	public MagazineState permitRequestedPhase() {
		return permitRequestedPhase;
	}
	

	@Override
	public MagazineState commitPhase() {
		return commitPhase;
	}
	
	public int getPriority() {
		return priority;
	}

	@Override
	public void init(ByteBuf buf) {
		// not need to initialize anything, type registry will take care of everything
	}

	@Override
	public void serialize(ByteBuf buf) {
		// not need to serialize anything, parent type registry should take care of it
	}
	
	static {
		TypeRegistry.getInstance().register(MagazineState.class);
	}

	
}
