package com.paneedah.mwc.skins;

import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;

import javax.imageio.ImageIO;
import java.io.File;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.ID;
import static com.paneedah.mwc.utils.ModReference.RED_LOG;

public class CustomSkin {

    protected ResourceLocation resourceLocation;

    public CustomSkin(String name, File file) {
        try {
            resourceLocation = new ResourceLocation(ID, "customskin_" + name);
            mc.getTextureManager().loadTexture(resourceLocation, new DynamicTexture(ImageIO.read(file)));
            mc.getTextureManager().bindTexture(resourceLocation);
        } catch (Exception e) {
            RED_LOG.printFramedError("Load Custom Skin", "Failed to load custom skin: " + name + " from file: " + file.getAbsolutePath(), "Skin will not be loaded.");
        }
    }

    public static ResourceLocation getCustomSkinResource(final String skinName) {
        final File image = new File("./config/mwc/skins/" + skinName.replace("customskin_", "") + ".png");

        if (!image.exists())
            return new ResourceLocation(ID + ":textures/models/" + GunSkins.WoodlandCamo.getTextureName() + ".png");

        if (!GunSkins.customSkins.containsKey(skinName))
            GunSkins.customSkins.put(skinName, new CustomSkin(skinName, image));

        return GunSkins.customSkins.get(skinName).resourceLocation;
    }
}
