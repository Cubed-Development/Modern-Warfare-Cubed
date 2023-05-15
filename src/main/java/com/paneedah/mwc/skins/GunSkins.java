package com.paneedah.mwc.skins;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.CommonRegistry;
import com.paneedah.weaponlib.ItemSkin;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GunSkins {

    public static ItemSkin WoodlandCamo;
    public static ItemSkin PinkCamo;
    public static ItemSkin ArcticCamo;
    public static ItemSkin BlueCamo;
    public static ItemSkin Unit01Camo;
    public static ItemSkin DiamondCamo;
    public static ItemSkin BloodForestCamo;
    public static ItemSkin GoldCamo;

    public static HashMap<String, CustomSkin> customSkins = new HashMap<>();

    public static void init(Object mod, CompatibleFmlPreInitializationEvent event) {
        GunSkins.WoodlandCamo = new ItemSkin.Builder()
        		.withTextureVariant("woodlandcamo")
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withName("WoodlandCamo")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.WoodlandCamo);
        
        GunSkins.PinkCamo = new ItemSkin.Builder()
        		.withTextureVariant("pinkcamo")
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withName("PinkCamo")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.PinkCamo);
        
        GunSkins.ArcticCamo = new ItemSkin.Builder()
        		.withTextureVariant("arcticcamo")
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withName("ArcticCamo")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.ArcticCamo);
        
        GunSkins.BlueCamo = new ItemSkin.Builder()
        		.withTextureVariant("bluecamo")
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withName("BlueCamo")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.BlueCamo);
        
        GunSkins.Unit01Camo = new ItemSkin.Builder()
        		.withTextureVariant("unit01camo")
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withName("Unit01Camo")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.Unit01Camo);
        
        GunSkins.BloodForestCamo = new ItemSkin.Builder()
        		.withTextureVariant("bloodforestcamo")
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withName("BloodForestCamo")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.BloodForestCamo);
        
        GunSkins.DiamondCamo = new ItemSkin.Builder()
        		.withTextureVariant("diamondcamo")
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withName("DiamondCamo")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.DiamondCamo);
        
        GunSkins.GoldCamo = new ItemSkin.Builder()
        		.withTextureVariant("goldcamo")
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withName("GoldCamo")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.GoldCamo);

        File customSkinsDir = new File("./config/mwc/skins");
        if (!customSkinsDir.exists())
            customSkinsDir.mkdirs();

        ClassLoader classLoader = GunSkins.class.getClassLoader();

        if (event.getEvent().getSide() == Side.SERVER) {
            try {
                File skinsConfiguration = new File(customSkinsDir, "skins.json");
                if (!skinsConfiguration.exists()) {
                    URL inputUrl = classLoader.getResource("skins.json");
                    if (inputUrl == null)
                        throw new FileNotFoundException("Failed to find skins.json");

                    FileUtils.copyURLToFile(inputUrl, skinsConfiguration);
                }

                JsonObject jsonObject = new JsonParser().parse(new JsonReader(new FileReader(skinsConfiguration))).getAsJsonObject();
                for (JsonElement element : jsonObject.getAsJsonArray("skins")) {
                    String skinName = element.getAsString();
                    ItemSkin skin = new ItemSkin.Builder()
                            .withTextureVariant("customskin_" + skinName.toLowerCase())
                            .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                            .withName(skinName)
                            .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
                    CommonRegistry.gunSkins.add(skin);
                    ModReference.log.info("Registered custom gun skin: " + skinName);
                }

            } catch (Exception e) {
                ModReference.log.error("Failed to set up custom skins directory!");
                e.printStackTrace();
                return;
            }
            return;
        }

        URL imageUrl = classLoader.getResource("assets/mwc/textures/models/oldiepinkcamo.png");
        if (imageUrl == null)
            throw new RuntimeException("Failed to find default custom skin (oldiepinkcamo.png).");

        try { FileUtils.copyURLToFile(imageUrl, new File(customSkinsDir, "oldiepinkcamo.png")); }
        catch (IOException e) { e.printStackTrace(); }

        File[] files = customSkinsDir.listFiles();
        if (files == null)
            return;

        for (File f : files) {
            String name = f.getName();
            if (!name.endsWith(".png"))
                continue;

            ItemSkin skin = new ItemSkin.Builder()
                    .withTextureVariant("customskin_" + name.toLowerCase().replace(".png", ""))
                    .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                    .withName(name.replace(".png", ""))
                    .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
            CommonRegistry.gunSkins.add(skin);
            ModReference.log.info("Registered custom gun skin: " + name);
        }
    }
}
