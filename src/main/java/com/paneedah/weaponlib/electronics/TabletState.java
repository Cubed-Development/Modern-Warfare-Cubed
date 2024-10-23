package com.paneedah.weaponlib.electronics;

import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;
import lombok.Getter;

public enum TabletState implements ManagedState<TabletState> {

    READY(false),

    MODIFYING_REQUESTED(1),

    MODIFYING(2, null, MODIFYING_REQUESTED, null, false),

    NEXT_ATTACHMENT_REQUESTED,

    NEXT_ATTACHMENT(2, null, NEXT_ATTACHMENT_REQUESTED, null, false),

    ALERT;

    private static final int DEFAULT_PRIORITY = 0;

    private final TabletState preparingPhase;

    private final TabletState permitRequestedPhase;

    private final TabletState commitPhase;

    private final boolean isTransient;

    @Getter
    private int priority;

    TabletState() {
        this(null, null, null, true);
    }

    TabletState(int priority) {
        this(priority, null, null, null, true);
    }

    TabletState(boolean isTransient) {
        this(null, null, null, isTransient);
    }

    TabletState(TabletState preparingPhase, TabletState permitRequestedState, TabletState transactionFinalState, boolean isTransient) {
        this(DEFAULT_PRIORITY, preparingPhase, permitRequestedState, transactionFinalState, isTransient);
    }

    TabletState(int priority, TabletState preparingPhase, TabletState permitRequestedState, TabletState transactionFinalState, boolean isTransient) {
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

    @Override
    public void read(ByteBuf byteBuf) {
        // not need to initialize anything, type registry will take care of everything
    }

    @Override
    public void write(ByteBuf byteBuf) {
        // not need to write anything, parent type registry should take care of it
    }

    static {
        TypeRegistry.getINSTANCE().register(TabletState.class);
    }


}
