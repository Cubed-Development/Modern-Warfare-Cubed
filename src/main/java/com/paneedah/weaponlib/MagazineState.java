package com.paneedah.weaponlib;

import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;
import lombok.Getter;

public enum MagazineState implements ManagedState<MagazineState> {

    READY(false),
    LOAD_REQUESTED,
    LOAD(null, LOAD_REQUESTED, null, true),
    UNLOAD_REQUESTED,
    UNLOAD(null, UNLOAD_REQUESTED, null, true);

    private static final int DEFAULT_PRIORITY = 0;

    private final MagazineState preparingPhase;

    private final MagazineState permitRequestedPhase;

    private final MagazineState commitPhase;

    private final boolean isTransient;

    @Getter
    private int priority;

    MagazineState() {
        this(null, null, null, true);
    }

    MagazineState(int priority) {
        this(priority, null, null, null, true);
    }

    MagazineState(boolean isTransient) {
        this(null, null, null, isTransient);
    }

    MagazineState(MagazineState preparingPhase, MagazineState permitRequestedState, MagazineState transactionFinalState, boolean isTransient) {
        this(DEFAULT_PRIORITY, preparingPhase, permitRequestedState, transactionFinalState, isTransient);
    }

    MagazineState(int priority, MagazineState preparingPhase, MagazineState permitRequestedState, MagazineState transactionFinalState, boolean isTransient) {
        this.priority = priority;
        this.preparingPhase = preparingPhase;
        permitRequestedPhase = permitRequestedState;
        commitPhase = transactionFinalState;
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

    @Override
    public void read(ByteBuf byteBuf) {
        // not need to initialize anything, type registry will take care of everything
    }

    @Override
    public void write(ByteBuf byteBuf) {
        // not need to write anything, parent type registry should take care of it
    }

    static {
        TypeRegistry.getINSTANCE().register(MagazineState.class);
    }


}
