package com.paneedah.mwc.weaponlib;

import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.ITickableTextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;

import java.util.function.UnaryOperator;

public class TransformingTextureManager extends TextureManager {

    private TextureManager delegate;
    private UnaryOperator<ResourceLocation> locationTransformer;

    public TransformingTextureManager(TextureManager delegate, UnaryOperator<ResourceLocation> locationTransformer) {
        super(null);
        this.delegate = delegate;
        this.locationTransformer = locationTransformer;
    }

    public void bindTexture(ResourceLocation resource) {
        delegate.bindTexture(locationTransformer.apply(resource));
    }

    public boolean loadTickableTexture(ResourceLocation textureLocation, ITickableTextureObject textureObj) {
        return delegate.loadTickableTexture(locationTransformer.apply(textureLocation), textureObj);
    }

    public boolean loadTexture(ResourceLocation textureLocation, ITextureObject textureObj) {
        return delegate.loadTexture(locationTransformer.apply(textureLocation), textureObj);
    }

    public ITextureObject getTexture(ResourceLocation textureLocation) {
        return delegate.getTexture(locationTransformer.apply(textureLocation));
    }

    public ResourceLocation getDynamicTextureLocation(String name, DynamicTexture texture) {
        return delegate.getDynamicTextureLocation(name, texture);
    }

    public void tick() {
        delegate.tick();
    }

    public void deleteTexture(ResourceLocation textureLocation) {
        delegate.deleteTexture(locationTransformer.apply(textureLocation));
    }

    public void onResourceManagerReload(IResourceManager resourceManager) {
        delegate.onResourceManagerReload(resourceManager);
    }
}
