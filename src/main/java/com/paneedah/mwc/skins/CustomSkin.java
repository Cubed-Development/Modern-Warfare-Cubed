package com.paneedah.mwc.skins;

import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;

import javax.imageio.ImageIO;
import java.io.File;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.ProjectConstants.RED_LOGGER;

public class CustomSkin {

    private ResourceLocation resourceLocation;

    public CustomSkin(final String name, final File file) {
        try {
            resourceLocation = new ResourceLocation(ID, "customskin_" + name.toLowerCase());
            MC.getTextureManager().loadTexture(resourceLocation, new DynamicTexture(ImageIO.read(file)));
            MC.getTextureManager().bindTexture(resourceLocation);
        } catch (Exception e) {
            RED_LOGGER.printFramedError("Load Custom Skin", "Failed to load custom skin: " + name + " from file: " + file.getAbsolutePath(), "Skin will not be loaded.");
        }
    }

    public static ResourceLocation getCustomSkinResource(final String skinName) {
        if (!GunSkins.customSkins.containsKey(skinName)) {
            GunSkins.customSkins.put(skinName, new CustomSkin(skinName, new File("./config/mwc/skins/" + skinName)));
        }

        return GunSkins.customSkins.get(skinName).resourceLocation;
    }
}
