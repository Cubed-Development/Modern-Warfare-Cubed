package com.paneedah.weaponlib.shader;

public interface DynamicShaderGroupSourceProvider {

    public DynamicShaderGroupSource getShaderSource(DynamicShaderPhase phase);
}
