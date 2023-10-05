package com.paneedah.weaponlib.shader;

import lombok.Getter;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.shader.Framebuffer;

import java.util.HashMap;
import java.util.Map;

public class DynamicShaderContext {

    @Getter private float partialTicks;
    @Getter private DynamicShaderPhase phase;
    private Map<String, Object> properties;
    @Getter private Framebuffer mainFramebuffer;
    @Getter private EntityRenderer entityRenderer;

    public DynamicShaderContext(DynamicShaderPhase phase, EntityRenderer entityRenderer, Framebuffer mainFramebuffer, float partialTicks) {
        this.partialTicks = partialTicks;
        this.phase = phase;
        this.mainFramebuffer = mainFramebuffer;
        this.entityRenderer = entityRenderer;
    }

    public DynamicShaderContext withProperty(String name, Object value) {
        if (properties == null) {
            properties = new HashMap<>();
        }
        properties.put(name, value);
        return this;
    }

    public <T> T getProperty(String name) {
        return (T) properties.get(name);
    }
}
