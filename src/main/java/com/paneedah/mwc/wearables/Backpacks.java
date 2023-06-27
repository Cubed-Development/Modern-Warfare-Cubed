package com.paneedah.mwc.wearables;

import com.paneedah.mwc.MWC;
import com.paneedah.weaponlib.ItemStorage;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.animation.Transform;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class Backpacks {
    
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
    
    public static Item Dufflebag;

    public static void init(Object mod) {
        
        CombatSustainmentBackpack = new ItemStorage.Builder()
        .withName("combat_sustainment_backpack")
        .withSize(10)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(MWC.ARMOR_TAB)
        .withProperModel("com.paneedah.mwc.models.CombatSustainmentBackpack", "combatsustainmentbackpack.png")
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
        .build(MWC.modContext);
        
        CombatSustainmentBackpackBlack = new ItemStorage.Builder()
                .withName("combat_sustainment_backpack_black")
                .withSize(10)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.CombatSustainmentBackpack", "combatsustainmentblack.png")
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
                .build(MWC.modContext);
        
        CombatSustainmentBackpackForest = new ItemStorage.Builder()
                .withName("combat_sustainment_backpack_forest")
                .withSize(10)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.CombatSustainmentBackpack", "combatsustainmentforest.png")
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
                .build(MWC.modContext);
        
        AssaultBackpack = new ItemStorage.Builder()
        .withName("assault_backpack")
        .withSize(16)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(MWC.ARMOR_TAB)
        .withProperModel("com.paneedah.mwc.models.AssaultBackpack", "assaultbackpack.png")
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
        .build(MWC.modContext);
        
        AssaultBackpackBlack = new ItemStorage.Builder()
                .withName("assault_backpack_black")
                .withSize(16)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.AssaultBackpack", "assaultbackpackblack.png")
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
                .build(MWC.modContext);
        
        AssaultBackpackForest = new ItemStorage.Builder()
                .withName("assault_backpack_forest")
                .withSize(16)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.AssaultBackpack", "assaultbackpackforest.png")
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
                .build(MWC.modContext);
        
        F5SwitchbladeBackpack = new ItemStorage.Builder()
                .withName("f5switchbladebackpack")
                .withSize(16)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.F5SwitchbladeBackpack", "f5switchbladebackpack.png")
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
                .build(MWC.modContext);
        
        TruSpecCorduraBackpack = new ItemStorage.Builder()
        .withName("tru_spec_cordura_backpack")
        .withSize(20)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(MWC.ARMOR_TAB)
        .withProperModel("com.paneedah.mwc.models.TruSpecCorduraBackpack", "truspeccordurabackpack.png")
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
        .build(MWC.modContext);
        
        TruSpecCorduraBackpackBlack = new ItemStorage.Builder()
                .withName("tru_spec_cordura_backpack_black")
                .withSize(20)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.TruSpecCorduraBackpack", "truspeccordurablack.png")
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
                .build(MWC.modContext);
        
        TruSpecCorduraBackpackForest = new ItemStorage.Builder()
                .withName("tru_spec_cordura_backpack_forest")
                .withSize(20)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.TruSpecCorduraBackpack", "truspeccorduraforest.png")
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
                .build(MWC.modContext);
        
        Dufflebag = new ItemStorage.Builder()
        .withName("duffle_bag")
        .withSize(24)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(MWC.ARMOR_TAB)
        .withProperModel("com.paneedah.mwc.models.Dufflebag", "dufflebag.png")
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
        .build(MWC.modContext);
        
        /*
         * item ->
         * 
         *    (item instanceof ItemAmmo) only Ammo allowed
	 *
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
