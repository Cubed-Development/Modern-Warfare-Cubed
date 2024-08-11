package com.paneedah.weaponlib;

public enum RenderableState {
    NORMAL, MODIFYING, MODIFYING_ALT, ZOOMING, RUNNING,
    UNLOADING, RELOADING, LOAD_ITERATION, LOAD_ITERATION_COMPLETED, ALL_LOAD_ITERATIONS_COMPLETED,

    // Modern animations
    COMPOUND_RELOAD, COMPOUND_RELOAD_EMPTY,
    LOAD_EMPTY, UNLOAD_EMPTY, TACTICAL_RELOAD,

    // Ads
    COMPOUND_RELOAD_ADS,

    SHOOTING, AUTO_SHOOTING, RECOILED, ZOOMING_RECOILED, ZOOMING_SHOOTING, EJECT_SPENT_ROUND, EJECT_SPENT_ROUND_AIMED,
    INSPECTING, DRAWING
}
