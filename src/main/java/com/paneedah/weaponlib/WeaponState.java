package com.paneedah.weaponlib;

import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;

public enum WeaponState implements ManagedState<WeaponState> {

    DRAWING,
    READY(false),
    COMPOUND_REQUESTED,
    COMPOUND_EMTPY_REQUESTED,
    TACTICAL_RELOAD,
    COMPOUND_RELOAD,
    COMPOUND_RELOAD_EMPTY,

    COMPOUND_RELOAD_UNLOAD(null, COMPOUND_REQUESTED, null, true),
    COMPOUND_RELOAD_FINISH(null, COMPOUND_REQUESTED, null, true),
    COMPOUND_RELOAD_FINISHED(null, COMPOUND_REQUESTED, null, true),

    // COMPOUND_RELOAD(null, COMPOUND_REQUESTED, null, true),
    // COMPOUND_RELOAD_EMPTY(null, COMPOUND_EMTPY_REQUESTED, null, true),

    LOAD_REQUESTED,
    LOAD(null, LOAD_REQUESTED, null, true),
    LOAD_ITERATION,
    LOAD_ITERATION_COMPLETED,
    ALL_LOAD_ITERATIONS_COMPLETED, // Applies to iterated loads

    AWAIT_FURTHER_LOAD_INSTRUCTIONS,
    UNLOAD_PREPARING,
    UNLOAD_REQUESTED,
    UNLOAD(UNLOAD_PREPARING, UNLOAD_REQUESTED, READY, true),

    FIRING(9),
    RECOILED(10),
    PAUSED(10),
    EJECT_REQUIRED,
    EJECTING,

    // STOPPED,
    // EJECT_SPENT_ROUND_REQUIRED,
    // EJECTED_SPENT_ROUND,

    MODIFYING_REQUESTED(1),
    MODIFYING(2, null, MODIFYING_REQUESTED, null, false),

    NEXT_ATTACHMENT_REQUESTED,
    NEXT_ATTACHMENT(2, null, NEXT_ATTACHMENT_REQUESTED, null, false),

    ALERT,
    INSPECTING;

    private static final int DEFAULT_PRIORITY = 0;

    private WeaponState preparingPhase;
    private WeaponState permitRequestedPhase;
    private WeaponState commitPhase;
    private boolean isTransient;
    private int priority = DEFAULT_PRIORITY;

    private WeaponState() {
        this(null, null, null, true);
    }

    private WeaponState(int priority) {
        this(priority, null, null, null, true);
    }

    private WeaponState(boolean isTransient) {
        this(null, null, null, isTransient);
    }

    WeaponState(WeaponState preparingPhase, WeaponState permitRequestedState, WeaponState transactionFinalState, boolean isTransient) {
        this(DEFAULT_PRIORITY, preparingPhase, permitRequestedState, transactionFinalState, isTransient);
    }

    WeaponState(int priority, WeaponState preparingPhase, WeaponState permitRequestedState, WeaponState transactionFinalState, boolean isTransient) {
        this.priority = priority;
        this.preparingPhase = preparingPhase;
        this.permitRequestedPhase = permitRequestedState;
        this.commitPhase = transactionFinalState;
        this.isTransient = false; // TODO: make states non-transient, remove flag from constructor
        // This is required to have up-to-date state on server, e.g. preparing, requested;
        // Otherwise issues arise, e.g. item toss would not work correctly
    }

    @Override
    public boolean isTransient() {
        return isTransient;
    }

    @Override
    public WeaponState preparingPhase() {
        return preparingPhase;
    }

    @Override
    public WeaponState permitRequestedPhase() {
        return permitRequestedPhase;
    }

    @Override
    public WeaponState commitPhase() {
        return commitPhase;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public void init(ByteBuf buf) {
        // No need to initialize anything, type registry will take care of everything
    }

    @Override
    public void serialize(ByteBuf buf) {
        // No need to serialize anything, parent type registry should take care of it
    }

    static {
        TypeRegistry.getInstance().register(WeaponState.class);
    }
}

