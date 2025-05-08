package com.paneedah.weaponlib.shader.dynamic;

public interface DynamicShaderGroupSourceProvider {

    DynamicShaderGroupSource getShaderSource(DynamicShaderPhase phase);
}
