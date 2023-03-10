package com.paneedah.weaponlib.electronics;

import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;

public enum TabletState implements ManagedState<TabletState> {

	READY(false), 
	
	MODIFYING_REQUESTED(1),
	
	MODIFYING(2, null, MODIFYING_REQUESTED, null, false),
	
	NEXT_ATTACHMENT_REQUESTED,
	
	NEXT_ATTACHMENT(2, null, NEXT_ATTACHMENT_REQUESTED, null, false),
	
	ALERT;
	
	private static final int DEFAULT_PRIORITY = 0;

	private TabletState preparingPhase;
	
	private TabletState permitRequestedPhase;
	
	private TabletState commitPhase;
	
	private boolean isTransient;
	
	private int priority = DEFAULT_PRIORITY;
	
	private TabletState() {
		this(null, null, null, true);
	}
	
	private TabletState(int priority) {
		this(priority, null, null, null, true);
	}
	
	private TabletState(boolean isTransient) {
		this(null, null, null, isTransient);
	}
	
//	private WeaponState(WeaponState permitRequestedState, WeaponState transactionFinalState) {
//		this(permitRequestedState, transactionFinalState, true);
//	}
	
	private TabletState(TabletState preparingPhase, TabletState permitRequestedState, TabletState transactionFinalState, boolean isTransient) {
		this(DEFAULT_PRIORITY, preparingPhase, permitRequestedState, transactionFinalState, isTransient);
	}
	
	private TabletState(int priority, TabletState preparingPhase, TabletState permitRequestedState, TabletState transactionFinalState, boolean isTransient) {
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
	public TabletState preparingPhase() {
		return preparingPhase;
	}
	
	@Override
	public TabletState permitRequestedPhase() {
		return permitRequestedPhase;
	}
	

	@Override
	public TabletState commitPhase() {
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
		TypeRegistry.getInstance().register(TabletState.class);
	}

	
}
