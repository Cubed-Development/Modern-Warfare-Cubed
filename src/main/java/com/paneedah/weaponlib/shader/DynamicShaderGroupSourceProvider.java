package com.paneedah.weaponlib.shader;

public interface DynamicShaderGroupSourceProvider {

    DynamicShaderGroupSource getShaderSource(DynamicShaderPhase phase);
}
