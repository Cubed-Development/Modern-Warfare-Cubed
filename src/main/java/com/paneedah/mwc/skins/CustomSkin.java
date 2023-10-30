package com.paneedah.mwc.skins;

import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;

import javax.imageio.ImageIO;
import java.io.File;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.ID;

public class CustomSkin {

    protected ResourceLocation resourceLocation;

    public CustomSkin(String name, File file) {
        try {
            resourceLocation = new ResourceLocation(ID, "customskin_" + name.toLowerCase());
            MC.getTextureManager().loadTexture(resourceLocation, new DynamicTexture(ImageIO.read(file)));
            MC.getTextureManager().bindTexture(resourceLocation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResourceLocation getCustomSkinResource(String skinName) {
        File image = new File("./config/mwc/skins/" + skinName + ".png");
        if (!image.exists())
            return new ResourceLocation(ID + ":textures/models/" + GunSkins.WoodlandCamo.getTexturedModels().get(0).getTextureName() + ".png");

        if (!GunSkins.customSkins.containsKey(skinName))
            GunSkins.customSkins.put(skinName, new CustomSkin(skinName, image));

        return GunSkins.customSkins.get(skinName).resourceLocation;
    }
}
