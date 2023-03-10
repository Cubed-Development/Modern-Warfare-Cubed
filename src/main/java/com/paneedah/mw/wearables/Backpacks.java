package com.paneedah.mw.wearables;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.weaponlib.ItemStorage;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.weaponlib.config.ConfigurationManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class Backpacks {

    //public static ItemAttachment<Object> Tablet;

    public static Item TacticalPushPack;
    
    public static Item CombatSustainmentBackpack;
    public static Item CombatSustainmentBackpackBlack;
    public static Item CombatSustainmentBackpackForest;
    
    public static Item AssaultBackpack;
    public static Item AssaultBackpackBlack;
    public static Item AssaultBackpackForest;
    
    public static Item F5SwitchbladeBackpack;
    
    public static Item TruSpecCorduraBackpack;
    public static Item TruSpecCorduraBackpackBlack;
    public static Item TruSpecCorduraBackpackForest;
    
    public static Item MilSpecAliceBackpack;
    
    public static Item Dufflebag;
    
    public static Item PilgrimBackpack;
    
    public static Item F4MTerminatorBackpack;
    
    public static Item BergenBackpack;
    
    public static Item G2Gunslinger2Backpack;

    public static void preInit(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        
        TacticalPushPack = new ItemStorage.Builder()
        .withName("tactical_push_backpack")
        .withSize(8)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.paneedah.mw.models.TacticalPushPack())
        .withModelTextureName("black_tru_spec_cordura_backpack.png")
        .withGuiTextureName("tactical_push_pack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0.2f, -0.55f, 0f);
            GL11.glRotatef(23F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 0f, 0f, 1f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        CombatSustainmentBackpack = new ItemStorage.Builder()
        .withName("combat_sustainment_backpack")
        .withSize(10)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.paneedah.mw.models.CombatSustainmentBackpack", "combatsustainmentbackpack.png")
        .withGuiTextureName("combat_sustainment_backpack.png")
//        .withCustomEquippedPositioning((player, stack) -> {
//            GL11.glScalef(0.6f, 0.6f, 0.6f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.15, -4.5, 0.35)
	        .withRotation(18, -50, 0)
	        .withScale(3.2, 3.2, 3.2)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        CombatSustainmentBackpackBlack = new ItemStorage.Builder()
                .withName("combat_sustainment_backpack_black")
                .withSize(10)
                .withGuiTextureWidth(256)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mw.models.CombatSustainmentBackpack", "combatsustainmentblack.png")
                .withGuiTextureName("combat_sustainment_backpack.png")
//                .withCustomEquippedPositioning((player, stack) -> {
//                    GL11.glScalef(0.6f, 0.6f, 0.6f);
//                    GL11.glTranslatef(0f, 0f, 0f);
//                    GL11.glRotatef(0F, 0f, 0f, 1f);
//                })
                .withInventoryPositioning(stack -> {
        	        new Transform()
        	        .withPosition(-0.15, -4.5, 0.35)
        	        .withRotation(18, -50, 0)
        	        .withScale(3.2, 3.2, 3.2)
        	        .doGLDirect();
                })
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        CombatSustainmentBackpackForest = new ItemStorage.Builder()
                .withName("combat_sustainment_backpack_forest")
                .withSize(10)
                .withGuiTextureWidth(256)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mw.models.CombatSustainmentBackpack", "combatsustainmentforest.png")
                .withGuiTextureName("combat_sustainment_backpack.png")
//                .withCustomEquippedPositioning((player, stack) -> {
//                    GL11.glScalef(0.6f, 0.6f, 0.6f);
//                    GL11.glTranslatef(0f, 0f, 0f);
//                    GL11.glRotatef(0F, 0f, 0f, 1f);
//                })
                .withInventoryPositioning(stack -> {
        	        new Transform()
        	        .withPosition(-0.15, -4.5, 0.35)
        	        .withRotation(18, -50, 0)
        	        .withScale(3.2, 3.2, 3.2)
        	        .doGLDirect();
                })
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AssaultBackpack = new ItemStorage.Builder()
        .withName("assault_backpack")
        .withSize(16)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.paneedah.mw.models.AssaultBackpack", "assaultbackpack.png")
//        .withModel(new com.paneedah.mw.models.AssaultBackpack())
//        .withModelTextureName("assaultbackpack.png")
        .withGuiTextureName("assault_backpack.png")
//        .withCustomEquippedPositioning((player, stack) -> {
////            GL11.glScalef(0.6f, 0.6f, 0.6f);
////            GL11.glTranslatef(0f, 0f, 0f);
////            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.15, -4.5, 0.35)
	        .withRotation(18, -50, 0)
	        .withScale(3.2, 3.2, 3.2)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        AssaultBackpackBlack = new ItemStorage.Builder()
                .withName("assault_backpack_black")
                .withSize(16)
                .withGuiTextureWidth(256)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mw.models.AssaultBackpack", "assaultbackpackblack.png")
//                .withModel(new com.paneedah.mw.models.AssaultBackpack())
//                .withModelTextureName("assaultbackpack.png")
                .withGuiTextureName("assault_backpack.png")
//                .withCustomEquippedPositioning((player, stack) -> {
////                    GL11.glScalef(0.6f, 0.6f, 0.6f);
////                    GL11.glTranslatef(0f, 0f, 0f);
////                    GL11.glRotatef(0F, 0f, 0f, 1f);
//                })
                .withInventoryPositioning(stack -> {
        	        new Transform()
        	        .withPosition(-0.15, -4.5, 0.35)
        	        .withRotation(18, -50, 0)
        	        .withScale(3.2, 3.2, 3.2)
        	        .doGLDirect();
                })
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AssaultBackpackForest = new ItemStorage.Builder()
                .withName("assault_backpack_forest")
                .withSize(16)
                .withGuiTextureWidth(256)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mw.models.AssaultBackpack", "assaultbackpackforest.png")
//                .withModel(new com.paneedah.mw.models.AssaultBackpack())
//                .withModelTextureName("assaultbackpack.png")
                .withGuiTextureName("assault_backpack.png")
//                .withCustomEquippedPositioning((player, stack) -> {
////                    GL11.glScalef(0.6f, 0.6f, 0.6f);
////                    GL11.glTranslatef(0f, 0f, 0f);
////                    GL11.glRotatef(0F, 0f, 0f, 1f);
//                })
                .withInventoryPositioning(stack -> {
        	        new Transform()
        	        .withPosition(-0.15, -4.5, 0.35)
        	        .withRotation(18, -50, 0)
        	        .withScale(3.2, 3.2, 3.2)
        	        .doGLDirect();
                })
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        F5SwitchbladeBackpack = new ItemStorage.Builder()
                .withName("f5switchbladebackpack")
                .withSize(16)
                .withGuiTextureWidth(256)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mw.models.F5SwitchbladeBackpack", "f5switchbladebackpack.png")
//                .withModel(new com.paneedah.mw.models.AssaultBackpack())
//                .withModelTextureName("assaultbackpack.png")
                .withGuiTextureName("assault_backpack.png")
//                .withCustomEquippedPositioning((player, stack) -> {
////                    GL11.glScalef(0.6f, 0.6f, 0.6f);
////                    GL11.glTranslatef(0f, 0f, 0f);
////                    GL11.glRotatef(0F, 0f, 0f, 1f);
//                })
                .withInventoryPositioning(stack -> {
        	        new Transform()
        	        .withPosition(-0.15, -4.5, 0.35)
        	        .withRotation(18, -50, 0)
        	        .withScale(3.2, 3.2, 3.2)
        	        .doGLDirect();
                })
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        TruSpecCorduraBackpack = new ItemStorage.Builder()
        .withName("tru_spec_cordura_backpack")
        .withSize(20)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.paneedah.mw.models.TruSpecCorduraBackpack", "truspeccordurabackpack.png")
        .withGuiTextureName("tru_spec_cordura_backpack.png")
//        .withCustomEquippedPositioning((player, stack) -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.15, -4.5, 0.35)
	        .withRotation(18, -50, 0)
	        .withScale(3.2, 3.2, 3.2)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        TruSpecCorduraBackpackBlack = new ItemStorage.Builder()
                .withName("tru_spec_cordura_backpack_black")
                .withSize(20)
                .withGuiTextureWidth(256)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mw.models.TruSpecCorduraBackpack", "truspeccordurablack.png")
                .withGuiTextureName("tru_spec_cordura_backpack.png")
//                .withCustomEquippedPositioning((player, stack) -> {
//                    GL11.glScalef(0.8f, 0.8f, 0.8f);
//                    GL11.glTranslatef(0f, 0f, 0f);
//                    GL11.glRotatef(0F, 0f, 0f, 1f);
//                })
                .withInventoryPositioning(stack -> {
        	        new Transform()
        	        .withPosition(-0.15, -4.5, 0.35)
        	        .withRotation(18, -50, 0)
        	        .withScale(3.2, 3.2, 3.2)
        	        .doGLDirect();
                })
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        TruSpecCorduraBackpackForest = new ItemStorage.Builder()
                .withName("tru_spec_cordura_backpack_forest")
                .withSize(20)
                .withGuiTextureWidth(256)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mw.models.TruSpecCorduraBackpack", "truspeccorduraforest.png")
                .withGuiTextureName("tru_spec_cordura_backpack.png")
//                .withCustomEquippedPositioning((player, stack) -> {
//                    GL11.glScalef(0.8f, 0.8f, 0.8f);
//                    GL11.glTranslatef(0f, 0f, 0f);
//                    GL11.glRotatef(0F, 0f, 0f, 1f);
//                })
                .withInventoryPositioning(stack -> {
        	        new Transform()
        	        .withPosition(-0.15, -4.5, 0.35)
        	        .withRotation(18, -50, 0)
        	        .withScale(3.2, 3.2, 3.2)
        	        .doGLDirect();
                })
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Dufflebag = new ItemStorage.Builder()
        .withName("duffle_bag")
        .withSize(24)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.paneedah.mw.models.Dufflebag", "dufflebag.png")
        .withGuiTextureName("duffle_bag.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.15, -4.2, 0.35)
	        .withRotation(18, -50, 0)
	        .withScale(2.8, 2.8, 2.8)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        PilgrimBackpack = new ItemStorage.Builder()
        .withName("pilgrim_backpack")
        .withSize(34)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.paneedah.mw.models.PilgrimBackpack())
        .withModelTextureName("pilgrim_backpack.png")
        .withGuiTextureName("pilgrim_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.15f, -0.7f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        F4MTerminatorBackpack = new ItemStorage.Builder()
        .withName("f4m_terminator_backpack")
        .withSize(35)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.paneedah.mw.models.F4MTerminatorBackpack())
        .withModelTextureName("f4m_terminator_backpack.png")
        .withGuiTextureName("f4m_terminator_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.15f, -0.7f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        BergenBackpack = new ItemStorage.Builder()
        .withName("bergen_backpack")
        .withSize(36)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.paneedah.mw.models.BergenBackpack())
        .withModelTextureName("bergen_backpack.png")
        .withGuiTextureName("big_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.2f, -0.5f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        G2Gunslinger2Backpack = new ItemStorage.Builder()
        .withName("g2_gunslinger2_backpack")
        .withSize(10)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> (item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.paneedah.mw.models.G2Gunslinger2Backpack())
        .withModelTextureName("f4m_terminator_backpack.png")
        .withGuiTextureName("combat_sustainment_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.2f, -0.5f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        /*
         * item ->
         * 
         *    (item instanceof ItemAmmo) only Ammo allowed
         *    !(item instanceof ItemAmmo) only Ammo NOT allowed
         *    
         *    (item instanceof Weapon) only Guns allowed
         *    
         *    !(item instanceof Weapon) only Guns NOT allowed
         * 
         *    (item instanceof Weapon && item instanceof ItemAmmo) only guns and ammo allowed
         *    
         *    !(item instanceof Weapon && item instanceof ItemAmmo) only guns and ammo NOT allowed
         *    
         *    (item instanceof Weapon && !item instanceof ItemAmmo) guns allowed but ammo NOT allowed
         */

    }
}
