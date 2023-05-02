package com.paneedah.mwc.skins;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.weaponlib.CommonRegistry;
import com.paneedah.weaponlib.ItemSkin;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;

public class GunSkins {

    public static ItemSkin WoodlandCamo;
    public static ItemSkin PinkCamo;
    public static ItemSkin ArcticCamo;
    public static ItemSkin BlueCamo;
    public static ItemSkin Unit01Camo;
    public static ItemSkin DiamondCamo;
    public static ItemSkin BloodForestCamo;
    public static ItemSkin GoldCamo;

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
    }
}
