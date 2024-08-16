package com.paneedah.weaponlib.shader;

import com.google.gson.JsonSyntaxException;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.util.JsonException;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicShaderGroup extends ShaderGroup {

    private final Map<String, Object> uniforms = new HashMap<>();
    private boolean deleted;

    public DynamicShaderGroup(TextureManager textureManager, IResourceManager resourceManager, Framebuffer mainFramebufferIn, ResourceLocation resourceLocation) throws IOException, JsonSyntaxException {
        super(textureManager, resourceManager, mainFramebufferIn, resourceLocation);
    }

    @Override
    public Shader addShader(String name, Framebuffer framebufferIn, Framebuffer framebufferOut)
            throws JsonException /*, IOException*/ {
        IResourceManager resourceManager = getResourceManager(this);
        DynamicShader shader;
        try {
            shader = new DynamicShader(resourceManager, name, framebufferIn, framebufferOut, this);
            List<Shader> listShaders = getShaders(this);
            listShaders.add(listShaders.size(), shader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return shader;
    }

    @Override
    public void deleteShaderGroup() {
        super.deleteShaderGroup();
        deleted = true;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setUniform(String name, Object value) {
        uniforms.put(name, value);
    }

    protected Map<String, Object> getUniforms() {
        return uniforms;
    }

    private static IResourceManager getResourceManager(ShaderGroup shaderGroup) {
        return ObfuscationReflectionHelper.getPrivateValue(ShaderGroup.class, shaderGroup, "resourceManager", "field_148033_b");
    }

    private static List<Shader> getShaders(ShaderGroup shaderGroup) {
        return ObfuscationReflectionHelper.getPrivateValue(ShaderGroup.class, shaderGroup, "listShaders", "field_148031_d");
    }
}
