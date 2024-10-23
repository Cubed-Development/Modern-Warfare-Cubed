package com.paneedah.weaponlib.shader;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderUniform;

import java.io.IOException;

class DynamicShader extends Shader {

    private final DynamicShaderGroup shaderGroup;

    public DynamicShader(IResourceManager resourceManager, String programName, Framebuffer framebufferInIn, Framebuffer framebufferOutIn, DynamicShaderGroup shaderGroup) throws IOException {
        super(resourceManager, programName, framebufferInIn, framebufferOutIn);
        this.shaderGroup = shaderGroup;
    }

    @Override
    public void render(float partialTicks) {

        shaderGroup.getUniforms().forEach((name, value) -> {

            ShaderUniform uniform = getShaderManager().getShaderUniform(name);
            if (uniform != null) {
                if (value instanceof Float) {
                    uniform.set(((Float) value).floatValue());
                } else if (value instanceof float[]) {
                    float[] values = (float[]) value;
                    if (values.length == 1) {
                        uniform.set(values[0]);
                    } else if (values.length == 2) {
                        uniform.set(values[0], values[1]);
                    } else if (values.length == 3) {
                        uniform.set(values[0], values[1], values[2]);
                    } else if (values.length == 4) {
                        uniform.set(values[0], values[1], values[2], values[3]);
                    }
                } else if (value instanceof Float[]) {
                    Float[] values = (Float[]) value;
                    if (values.length == 1) {
                        uniform.set(values[0]);
                    } else if (values.length == 2) {
                        uniform.set(values[0], values[1]);
                    } else if (values.length == 3) {
                        uniform.set(values[0], values[1], values[2]);
                    } else if (values.length == 4) {
                        uniform.set(values[0], values[1], values[2], values[3]);
                    }
                } else {

                }

            }
        });

        super.render(partialTicks);
    }

    public int getShaderId() {
        return getShaderManager().getProgram();
    }
}
