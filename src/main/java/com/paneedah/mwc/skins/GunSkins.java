package com.paneedah.mwc.skins;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.paneedah.weaponlib.CommonRegistry;
import com.paneedah.weaponlib.ItemSkin;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import static com.paneedah.mwc.utils.ModReference.LOG;

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

    public static void init() {
        GunSkins.WoodlandCamo = new ItemSkin.Builder()
                .withTexture("woodlandcamo")
                .withName("WoodlandCamo")
                .build(ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.WoodlandCamo);

        GunSkins.PinkCamo = new ItemSkin.Builder()
                .withTexture("pinkcamo")
                .withName("PinkCamo")
                .build(ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.PinkCamo);

        GunSkins.ArcticCamo = new ItemSkin.Builder()
                .withTexture("arcticcamo")
                .withName("ArcticCamo")
                .build(ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.ArcticCamo);

        GunSkins.BlueCamo = new ItemSkin.Builder()
                .withTexture("bluecamo")
                .withName("BlueCamo")
                .build(ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.BlueCamo);

        GunSkins.Unit01Camo = new ItemSkin.Builder()
                .withTexture("unit01camo")
                .withName("Unit01Camo")
                .build(ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.Unit01Camo);

        GunSkins.BloodForestCamo = new ItemSkin.Builder()
                .withTexture("bloodforestcamo")
                .withName("BloodForestCamo")
                .build(ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.BloodForestCamo);

        GunSkins.DiamondCamo = new ItemSkin.Builder()
                .withTexture("diamondcamo")
                .withName("DiamondCamo")
                .build(ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.DiamondCamo);

        GunSkins.GoldCamo = new ItemSkin.Builder()
                .withTexture("goldcamo")
                .withName("GoldCamo")
                .build(ItemSkin.class);
        CommonRegistry.gunSkins.add(GunSkins.GoldCamo);

        File customSkinsDir = new File("./config/mwc/skins");
        if (!customSkinsDir.exists())
            customSkinsDir.mkdirs();

        ClassLoader classLoader = GunSkins.class.getClassLoader();

        if (FMLCommonHandler.instance().getSide() == Side.SERVER) {
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
                            .withTexture("customskin_" + skinName.toLowerCase())
                            .withName(skinName)
                            .build(ItemSkin.class);
                    CommonRegistry.gunSkins.add(skin);
                    LOG.info("Registered custom gun skin: " + skinName);
                }

            } catch (Exception e) {
                LOG.error("Failed to set up custom skins directory!");
                e.printStackTrace();
                return;
            }
            return;
        }

        URL imageUrl = classLoader.getResource("assets/mwc/textures/models/oldiepinkcamo.png");
        if (imageUrl == null)
            throw new RuntimeException("Failed to find default custom skin (oldiepinkcamo.png).");

        try {
            FileUtils.copyURLToFile(imageUrl, new File(customSkinsDir, "oldiepinkcamo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        File[] files = customSkinsDir.listFiles();
        if (files == null)
            return;

        for (File f : files) {
            String name = f.getName();
            if (!name.endsWith(".png"))
                continue;

            ItemSkin skin = new ItemSkin.Builder()
                    .withTexture("customskin_" + name.toLowerCase().replace(".png", ""))
                    .withName(name.replace(".png", ""))
                    .build(ItemSkin.class);
            CommonRegistry.gunSkins.add(skin);
            LOG.info("Registered custom gun skin: " + name);
        }
    }
}
