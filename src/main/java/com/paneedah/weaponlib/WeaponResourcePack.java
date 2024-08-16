package com.paneedah.weaponlib;

import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WeaponResourcePack implements IResourcePack {

    private static final String WEAPONLIB_RESOURCE_DOMAIN = "weaponlib";

    private static final Set<String> RESOURCE_DOMAINS = Collections.unmodifiableSet(new HashSet<>(
            Collections.singleton(WEAPONLIB_RESOURCE_DOMAIN)));

    @Override
    public InputStream getInputStream(ResourceLocation resourceLocation) {
        return getClass().getResourceAsStream(modifyResourcePath(resourceLocation));
    }

    private String modifyResourcePath(ResourceLocation resourceLocation) {
        String resourcePath = resourceLocation.getPath();
        if (resourcePath.startsWith("textures")) {
            int lastIndexOfSlash = resourcePath.lastIndexOf('/');
            if (lastIndexOfSlash >= 0) {
                String fileName = resourcePath.substring(lastIndexOfSlash + 1);
                resourcePath = '/' + getClass().getPackage().getName().replace('.', '/') + "/resources/" + fileName;
            }
        }
        return resourcePath;
    }

    @Override
    public boolean resourceExists(ResourceLocation resourceLocation) {
        String resourcePath = modifyResourcePath(resourceLocation);
        boolean value = WEAPONLIB_RESOURCE_DOMAIN.equals(resourceLocation.getNamespace())
                && getClass().getResource(resourcePath) != null;
        return value;
    }


    @Override
    public final Set<String> getResourceDomains() {
        return RESOURCE_DOMAINS;
    }

    @Nullable
    @Override
    public <T extends IMetadataSection> T getPackMetadata(@Nullable MetadataSerializer metadataSerializer, @Nullable String metadataSectionName) {
        return null;
    }

    @Override
    public BufferedImage getPackImage() {
        return null;
    }

    @Override
    public String getPackName() {
        return getClass().getSimpleName();
    }
}
