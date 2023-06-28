package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class M712Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("m712")
        .withFireRate(0.75f)
        .withRecoil(4f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SIDEARM)
        .withMaxShots(1, Integer.MAX_VALUE)
        .withShootSound("m712")
        .withSilencedShootSound("colt_m45a1_silenced")
        .withReloadSound("m712_reload")
        .withUnloadSound("m712_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 1f)
        .withFlashOffsetX(() -> 0.17f)
        .withFlashOffsetY(() -> 0.18f)
//      .withShellCasingForwardOffset(0.001f)
        .withInaccuracy(1)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Machine Pistol", 
        "Damage: 5.4", 
        "Cartridge: 7.63x25mm Mauser",
        "Fire Rate: AUTO",
        "Rate of Fire: 75/100",
        "Magazines:",
        "20rnd 7.63x25mm Mauser Magazine"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 1.5f, // x 
                 1.5f, // y
                 3f) // z
         
        .withCompatibleAttachment(AuxiliaryAttachments.M712action, true, (model) -> {
            if(model instanceof M712action) {
                GL11.glScaled(1F, 1F, 1F);
//                GL11.glTranslatef(0F, 0F, 0.6F);
            }
        })
        .withCompatibleAttachment(Magazines.M712Mag, (model) -> {
//        	GL11.glTranslatef(0.1f, 1f, -0.1f);
//        	GL11.glRotatef(-5F, 1f, 0f, 0f);
//        	GL11.glRotatef(-6F, 0f, 0f, 1f);
        	
//        	GL11.glTranslatef(0f, 0.9f, 0f);
//        	GL11.glRotatef(2F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.17F, -1.42F, 0.43F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(-0.11F, -1.29F, -9.7F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.03F, -1.5F, -4.5F);
                GL11.glScaled(0.6F, 0.5F, 0.25F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, -1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.207F, -1.245F, -9.165F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.1F, -1.77F, -4.6F);
                GL11.glScaled(0.2F, 0.5F, 1.5F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withTextureNames("m712")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new M712())
            //.withTextureName("M9")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.25F, 0.25F, 0.25F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F); 
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(-2.6F, -1.3F, 2.8F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScaled(1F, 1F, 1F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(14F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.3f, 0.8f, -2.0f);
                
//                GL11.glScaled(1F, 1F, 1F);
//                GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(41.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(3.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.225000f, 0.875000f, -1.849999f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glScaled(1F, 1F, 1F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(14F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.3f, 0.7f, -1.1f);
                GL11.glRotatef(-6F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.8f, 1.1f, -3f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.8f, 1.1f, -2.6f);
                GL11.glRotatef(-6F, 1f, 0f, 0f);    
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M712action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M712action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M712action.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.6F);
                }
            })
                
            .withFirstPersonPositioningReloading(
            		
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(29.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.54f, -2.024999f);
                        
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, 0.425000f, 0.525000f);
                    }, 250, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(29.600000f, 0f, 1f, 0f);
                        GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.51f, -2.024999f);
                        
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, 0.425000f, 0.525000f);
                    }, 210, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.48f, -2.024999f);
                        
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, 0.425000f, 0.525000f);
                    }, 65, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-12.700000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.48f, -2.024999f);
                        
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, 0.425000f, 0.525000f);
                    }, 85, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-18.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.2f, -2.024999f);
                        
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, 0.425000f, 0.525000f);
                    }, 80, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.17f, -2.024999f);
                        
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, 0.425000f, 0.525000f);
                    }, 50, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-12.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-23.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.21f, -2.024999f);
                        
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, 0.425000f, 0.525000f);
                    }, 70, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.700000f, 0f, 1f, 0f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.325000f, 0.975000f, -1.449999f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-18.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.325000f, 0.995000f, -1.049999f);
                    }, 90, 0),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.700000f, 0f, 1f, 0f);
                        GL11.glRotatef(16.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.325000f, 0.975000f, -1.519999f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.325000f, 0.975000f, -1.449999f);
                    }, 60, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-5.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.325000f, 0.975000f, -1.589999f);
                    }, 80, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-3.200000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.325000f, 0.975000f, -1.769999f);
                    }, 100, 0)
                )
                
            .withFirstPersonPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glRotatef(36F, 0f, 1f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 0.4f, -1.8f);
                    }, 220, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-17F, 1f, 0f, 0f);
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(-3F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 1.3f, -1.8f);
                    }, 110, 0),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(-14F, 1f, 0f, 0f);
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(-1F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 1.2f, -1.8f);
                    }, 100, 0)
                )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.M712Mag,
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 4f, 1f);
                     	 GL11.glRotatef(20F, 1f, 0f, 0f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1f, -0.1f);
                    	GL11.glRotatef(-5F, 1f, 0f, 0f);
                    	GL11.glRotatef(-6F, 0f, 0f, 1f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0.9f, 0f);
                    	GL11.glRotatef(2F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0.9f, 0f);
                    	GL11.glRotatef(2F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
//                    	GL11.glTranslatef(-0.02f, 0f, 0f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0)
                )
                        
            .withFirstPersonCustomPositioningUnloading(Magazines.M712Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 4F, 0F);
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M712action.getRenderablePart(),
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 270, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0)
                )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.400000f, 0.880000f, -1.150000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScaled(2F, 2F, 2F);
                      GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.750000f, 1.779999f, -1.450000f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 10),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 270, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 70, 50)
                )
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M712action.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                        GL11.glRotatef(14F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.8f, 2.3f, -2.6f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(11F, 0f, 0f, 1f);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.8f, 2.3f, -2.6f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(39F, 0f, 1f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.8f, 1.8f, -2.6f);
                    }, 180, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(9F, 0f, 0f, 1f);
                        GL11.glRotatef(5F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.8f, 1.6f, -2.6f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.8f, 1.4f, -2.6f);
                    }, 120, 0)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 1.34f, -2f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.25f, 1.34f, -1.8f);
                GL11.glRotatef(-6F, 1f, 0f, 0f);
                GL11.glRotatef(3F, 0f, 0f, 1f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(1F, 1F, 1F);
                GL11.glRotatef(-10F, 0f, 1f, 0f);
                GL11.glRotatef(18F, 0f, 0f, 1f);
                GL11.glRotatef(6F, 1f, 0f, 0f);
                GL11.glTranslatef(-0.6f, 1.6f, -1.5f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(2F, 2F, 2F);
                 GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.400000f, 0.880000f, -1.150000f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, 0.000000f, 0.325000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
                   }, 
                   (renderContext) -> {
                       GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                   })
            .withFirstPersonHandPositioningProning(
                    (renderContext) -> {
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.875000f, 0.075000f);
                  }, 
                  (renderContext) -> {
                      GL11.glScalef(6f, 6f, 6f);
                      GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.375000f, -0.500000f, 0.200000f);
                  })
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, 0.000000f, 0.325000f);
                  }, 
                  (renderContext) -> {
                      GL11.glScalef(6f, 6f, 6f);
                      GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.375000f, -0.500000f, 0.200000f);
                  })
            .withFirstPersonLeftHandPositioningReloading(
                    
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.275000f, -0.075000f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.325000f, -0.025000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.150000f, -0.350000f, 0.000000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.150000f, -0.350000f, 0.000000f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, -0.450000f, -0.050000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, -0.450000f, -0.050000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, -0.450000f, -0.050000f);
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, -0.625000f, -0.100000f);
                    }, 270, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, -0.625000f, -0.100000f);
                   }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(85.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.850000f, -0.625000f, -0.075000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                    	 GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(85.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(-0.975000f, -0.625000f, -0.075000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                    	 GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(85.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(-0.975000f, -0.625000f, -0.075000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                    	 GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(85.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(-0.975000f, -0.625000f, -0.075000f);
                    }, 70, 0)
                )
                    
            .withFirstPersonRightHandPositioningReloading(
                    
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                 	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                 }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 200, 0),
                    
// jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 270, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 70, 0)
                )
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, 0.000000f, 0.625000f);
                    }, 330, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, 0.000000f, 0.625000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, 0.000000f, 0.625000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.420000f, -0.450000f, 0.140000f);
                    }, 250, 0))
                    
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, 0.000000f, 0.325000f);
                  }, 
                  (renderContext) -> {
                      GL11.glScalef(6f, 6f, 6f);
                      GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.375000f, -0.500000f, 0.200000f);
                  })
                  
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, 0.000000f, 0.325000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, 0.000000f, 0.325000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.200000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.200000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 330, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.150000f, 0.100000f);
                    }, 250, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-66.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.150000f, 0.150000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.150000f, 0.150000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, 0.000000f, 0.325000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, 0.000000f, 0.325000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, 0.000000f, 0.325000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, 0.000000f, 0.325000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, 0.000000f, 0.325000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.200000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.200000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.200000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.200000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.200000f);
                    }, 280, 0)
                    )
                          
            .build())
        .withSpawnEntityDamage(5.4f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(MWC.modContext);
    }
}
