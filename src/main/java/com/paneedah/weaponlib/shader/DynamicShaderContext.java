package com.paneedah.weaponlib.shader;

import net.minecraft.client.shader.Framebuffer;

import java.util.HashMap;
import java.util.Map;

public class DynamicShaderContext {

    private float partialTicks;
    private DynamicShaderPhase phase;
    private Map<String, Object> properties;
    private Framebuffer mainFramebuffer;
    private Object target;

    public DynamicShaderContext(DynamicShaderPhase phase, Object target, Framebuffer mainFramebuffer, float partialTicks) {
        this.partialTicks = partialTicks;
        this.phase = phase;
        this.mainFramebuffer = mainFramebuffer;
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public DynamicShaderContext withProperty(String name, Object value) {
        if(properties == null) {
            properties = new HashMap<>();
        }
        properties.put(name, value);
        return this;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProperty(String name) {
        return (T) properties.get(name);
    }

    public float getPartialTicks() {
        return partialTicks;
    }

    public DynamicShaderPhase getPhase() {
        return phase;
    }

    public Framebuffer getMainFramebuffer() {
        return mainFramebuffer;
    }
}
