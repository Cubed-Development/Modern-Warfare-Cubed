package com.paneedah.mwc.skins;

import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;

import javax.imageio.ImageIO;
import java.io.File;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.ID;
import static com.paneedah.mwc.utils.ModReference.RED_LOG;

/**
 * @author paneedah
 * @since 0.1
 */
public final class CustomSkin {

    // TODO: This entire system needs re-doing. It's a mess.

    private ResourceLocation resourceLocation;

    public CustomSkin(final String name, final File file) {
        try {
            resourceLocation = new ResourceLocation(ID, "customskin_" + name.toLowerCase());
            MC.getTextureManager().loadTexture(resourceLocation, new DynamicTexture(ImageIO.read(file)));
            MC.getTextureManager().bindTexture(resourceLocation);
        } catch (Exception e) {
            RED_LOG.printFramedError("Load Custom Skin", "Failed to load custom skin: " + name + " from file: " + file.getAbsolutePath(), "Skin will not be loaded.");
        }
    }

    public static ResourceLocation getCustomSkinResource(final String skinName) {
        if (!Skins.customSkins.containsKey(skinName))
            Skins.customSkins.put(skinName, new CustomSkin(skinName, new File("./config/mwc/skins/" + skinName)));

        return Skins.customSkins.get(skinName).resourceLocation;
    }
}
