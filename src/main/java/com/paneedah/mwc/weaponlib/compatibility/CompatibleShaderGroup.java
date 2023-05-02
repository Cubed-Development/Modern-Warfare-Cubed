package com.paneedah.mwc.weaponlib.compatibility;

import com.google.gson.JsonSyntaxException;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.util.JsonException;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class CompatibleShaderGroup extends ShaderGroup {

    public CompatibleShaderGroup(TextureManager textureManager, IResourceManager resourceManagerIn,
            Framebuffer mainFramebufferIn, ResourceLocation p_i1050_4_)
            throws JsonException, IOException, JsonSyntaxException {
        super(textureManager, resourceManagerIn, mainFramebufferIn, p_i1050_4_);
    }

    @Override
    public void render(float partialTicks) {
        super.render(partialTicks);
    }
}
