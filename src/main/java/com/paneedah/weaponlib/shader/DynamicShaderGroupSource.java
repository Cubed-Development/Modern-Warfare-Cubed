package com.paneedah.weaponlib.shader;

import com.paneedah.weaponlib.Tuple;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

public class DynamicShaderGroupSource {

    private final ResourceLocation shaderLocation;

    private final List<AdvUniform> advUniforms;

    private final List<Tuple<String, Function<DynamicShaderContext, Object>>> uniforms;
    private final UUID sourceId;

    public DynamicShaderGroupSource(UUID sourceId, ResourceLocation location) {
        this.sourceId = sourceId;
        this.shaderLocation = location;
        this.uniforms = new ArrayList<>();
        this.advUniforms = new ArrayList<>();
    }

    public UUID getSourceId() {
        return sourceId;
    }

    public DynamicShaderGroupSource withUniform(String name, Function<DynamicShaderContext, Object> value) {
        uniforms.add(new Tuple<>(name, value));
        return this;
    }

    public DynamicShaderGroupSource withAdvUniform(AdvUniform u) {
        advUniforms.add(u);
        return this;
    }

    public ResourceLocation getShaderLocation() {
        return shaderLocation;
    }

    public List<Tuple<String, Function<DynamicShaderContext, Object>>> getUniforms(DynamicShaderContext context) {
        return Collections.unmodifiableList(uniforms);
    }

    public interface AdvUniform {
        void apply(DynamicShaderGroupSource src);
    }
}
