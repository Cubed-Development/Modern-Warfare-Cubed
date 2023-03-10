package com.paneedah.weaponlib.grenade;

import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;

public enum GrenadeState implements ManagedState<GrenadeState> {

	READY(false),

	SAFETY_PING_OFF(9),

	STRIKER_LEVER_RELEASED(9),

	THROWING(9),

	THROWN(9),

	EXPLODED_IN_HANDS(9);

	private static final int DEFAULT_PRIORITY = 0;

	private GrenadeState preparingPhase;

	private GrenadeState permitRequestedPhase;

	private GrenadeState commitPhase;

	private boolean isTransient;

	private int priority = DEFAULT_PRIORITY;

	private GrenadeState() {
		this(null, null, null, true);
	}

	private GrenadeState(int priority) {
		this(priority, null, null, null, true);
	}

	private GrenadeState(boolean isTransient) {
		this(null, null, null, isTransient);
	}

	private GrenadeState(GrenadeState preparingPhase, GrenadeState permitRequestedState, GrenadeState transactionFinalState, boolean isTransient) {
		this(DEFAULT_PRIORITY, preparingPhase, permitRequestedState, transactionFinalState, isTransient);
	}

	private GrenadeState(int priority, GrenadeState preparingPhase, GrenadeState permitRequestedState, GrenadeState transactionFinalState, boolean isTransient) {
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
	public GrenadeState preparingPhase() {
		return preparingPhase;
	}

	@Override
	public GrenadeState permitRequestedPhase() {
		return permitRequestedPhase;
	}


	@Override
	public GrenadeState commitPhase() {
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
		TypeRegistry.getInstance().register(GrenadeState.class);
	}


}
