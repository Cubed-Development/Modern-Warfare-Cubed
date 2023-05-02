package com.paneedah.mwc.weaponlib.shader;

public interface DynamicShaderGroupSourceProvider {

    public DynamicShaderGroupSource getShaderSource(DynamicShaderPhase phase);
}
