package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.util.JsonException;

import java.io.IOException;

public class CompatibleShader extends Shader {

    public CompatibleShader(IResourceManager resourceManager, String programName, Framebuffer framebufferInIn, Framebuffer framebufferOutIn) throws JsonException, IOException {
        super(resourceManager, programName, framebufferInIn, framebufferOutIn);
    }
    
    @Override
    public void render(float partialTicks) {
        super.render(partialTicks);
    }

}
