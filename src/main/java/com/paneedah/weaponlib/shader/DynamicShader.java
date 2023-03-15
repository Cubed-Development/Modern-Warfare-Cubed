package com.paneedah.weaponlib.shader;

import com.paneedah.weaponlib.compatibility.CompatibleShader;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderUniform;
import net.minecraft.client.util.JsonException;

import java.io.IOException;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

class DynamicShader extends CompatibleShader {

    private DynamicShaderGroup shaderGroup;

    public DynamicShader(IResourceManager resourceManager, String programName, Framebuffer framebufferInIn, Framebuffer framebufferOutIn, DynamicShaderGroup shaderGroup) throws JsonException, IOException {
        super(resourceManager, programName, framebufferInIn, framebufferOutIn);
        this.shaderGroup = shaderGroup;
    }

    @Override
    public void render(float partialTicks) {
    	
        shaderGroup.getUniforms().forEach((name, value) -> {
        
            ShaderUniform uniform = compatibility.getShaderUniform(getShaderManager(), name);
            if(uniform != null) {
                if(value instanceof Float) {
                    compatibility.setUniform(uniform, (float)value);
                } else if(value instanceof float[]) {
                    float values[] = (float[]) value;
                    if(values.length == 1) {
                        compatibility.setUniform(uniform, values[0]);
                    } else if(values.length == 2) {
                        compatibility.setUniform(uniform, values[0], values[1]);
                    } else if(values.length == 3) {
                        compatibility.setUniform(uniform, values[0], values[1], values[2]);
                    } else if(values.length == 4) {
                        compatibility.setUniform(uniform, values[0], values[1], values[2], values[3]);
                    }
                } else if(value instanceof Float[]) {
                    Float values[] = (Float[]) value;
                    if(values.length == 1) {
                        compatibility.setUniform(uniform, values[0]);
                    } else if(values.length == 2) {
                        compatibility.setUniform(uniform, values[0], values[1]);
                    } else if(values.length == 3) {
                        compatibility.setUniform(uniform, values[0], values[1], values[2]);
                    } else if(values.length == 4) {
                        compatibility.setUniform(uniform, values[0], values[1], values[2], values[3]);
                    }
                } else {
                	
                }
               
            }
        });

        super.render(partialTicks);
    }
    
    public int getShaderId() {
    	return this.getShaderManager().getProgram();
    }
}
