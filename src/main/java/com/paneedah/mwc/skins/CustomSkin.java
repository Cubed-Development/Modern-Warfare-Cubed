package com.paneedah.mwc.skins;

import com.paneedah.mwc.utils.ModReference;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;

import javax.imageio.ImageIO;
import java.io.File;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class CustomSkin {

    protected ResourceLocation resourceLocation;

    public CustomSkin(String name, File file) {
        try {
            resourceLocation = new ResourceLocation(ModReference.id, "customskin_"+name.toLowerCase());
            mc.getTextureManager().loadTexture(resourceLocation, new DynamicTexture(ImageIO.read(file)));
            mc.getTextureManager().bindTexture(resourceLocation);
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static ResourceLocation getCustomSkinResource(String skinName) {
        File image = new File("./config/mwc/skins/"+skinName+".png");
        if (!image.exists())
            return new ResourceLocation(ModReference.id+":textures/models/"+GunSkins.WoodlandCamo.getTextureName()+".png");

        if (!GunSkins.customSkins.containsKey(skinName))
            GunSkins.customSkins.put(skinName, new CustomSkin(skinName, image));

        return GunSkins.customSkins.get(skinName).resourceLocation;
    }
}
