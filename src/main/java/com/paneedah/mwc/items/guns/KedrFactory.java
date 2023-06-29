package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.Kedr;
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

public class KedrFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("pp91_kedr")
        .withFireRate(0.7f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SMG)
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("kedr")
        .withSilencedShootSound("kbp9a91_silenced")
        .withReloadSound("kedr_reload")
        .withUnloadSound("kedr_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.18f)
        .withInaccuracy(2f)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Submachine Gun",
        "Damage: 5", 
        "Cartridge: 9x19mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 70/100",
        "Magazines:",
        "20rnd 9x19mm Magazine (Kedr)"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                2f, // x 
                0.1f, // y
                3f) // z
        
        .withCompatibleAttachment(AuxiliaryAttachments.KedrAction, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.KedrStock, true, (model) -> {
//        	GL11.glTranslatef(0F, -0.7F, 1.55F);
//        	GL11.glRotatef(100F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Magazines.KedrMag, (model) -> {
//        	GL11.glTranslatef(0F, 0.25F, 0F);
//            GL11.glRotatef(5F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
          GL11.glTranslatef(-0.25F, -1.1F, -4.8F);
          GL11.glScaled(1.5F, 1.5F, 1.5F);
        })
        .withTextureNames("kedr")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new Kedr())
            //.withTextureName("AK47")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.28F, 0.28F, 0.28F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.150000f, 0.850000f, -1.125000f);
                
//                GL11.glScalef(2f, 2f, 2f);
//                GL11.glRotatef(15.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.575000f, 0.800000f, -0.775000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.150000f, 0.850000f, -0.825000f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.3f, 0.6f, -0.85f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.3f, 0.6f, -0.8f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.KedrAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1.2f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.KedrAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1.2f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.KedrAction.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 1.2F);
                }
            })
            
            .withFirstPersonPositioningReloading(
                    
            		// hand goes down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.900000f, 1.2f, -0.900000f);
                    }, 250, 0),
                    
                    // mag touches gun
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-36.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.900000f, 1.100000f, -0.900000f);
                    }, 290, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-34.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.900000f, 1.15f, -0.900000f);
                    }, 100, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.900000f, 1.13f, -0.900000f);
                    }, 130, 0),
                
                    // mag inserts
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-37.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.900000f, 1f, -0.900000f);
                }, 110, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.900000f, 1.100000f, -0.900000f);
                }, 60, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-8.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.900000f, 1.04f, -0.900000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.900000f, 1.06f, -0.900000f);
                }, 80, 0),
                
             // grabs action
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.600000f, 1.300000f, -1.000000f);
                }, 240, 0),
                // jiggle
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(4.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.600000f, 1.300000f, -1.000000f);
                }, 70, 0),
                // pulls action back
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-28.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.600000f, 1.300000f, -0.9f);
                }, 80, 0),
                // action snaps forward
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-18.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.600000f, 1.300000f, -1.2f);
                }, 70, 0),
                // jiggle
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-19.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.600000f, 1.300000f, -1.1f);
                }, 60, 0),
             // jiggle
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-18.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.600000f, 1.300000f, -1.17f);
                }, 70, 0),
             // jiggle
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-17.30000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.600000f, 1.300000f, -1.13f);
                }, 90, 0)
                )
            
            .withFirstPersonPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.3f, 1.000000f, -1.125000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.4f, 1.04f, -1.125000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-11.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.4f, 1.06f, -1.125000f);
                    }, 180, 0)
            )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.KedrAction.getRenderablePart(),
            		// mag down
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 250, 1000),
                    // mag touch gun
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 250, 1000),
                    // mag inserts
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 250, 1000),
                 // grabs action
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 240, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 70, 0),
                    // pulls action back
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 80, 0),
                    // action snaps forward
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    }, 60, 0),
                 // jiggle
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                 // jiggle
                    new Transition((renderContext) -> { // Reload position
                    }, 90, 0)
                    )
                        
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.KedrAction.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.2F);
                    }, 500, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.KedrMag,
            		// mag down
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 3F, 0.4F);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 250, 1000),
                    // mag touches gun
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0.25F, 0F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.15F, 0F);
                        GL11.glRotatef(5F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.2F, 0F);
                    }, 250, 1000),
                    // mag inserts
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                 // grabs action
                    new Transition((renderContext) -> { // Reload position
                    }, 240, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    // pulls action back
                    new Transition((renderContext) -> { // Reload position
                    }, 80, 0),
                    // action snaps forward
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    }, 60, 0),
                 // jiggle
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                 // jiggle
                    new Transition((renderContext) -> { // Reload position
                    }, 90, 0)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.KedrMag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0.45F, -0.15F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2F, -0.15F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.100000f, 1.150000f, -0.500000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(2f, 2f, 2f);
                      GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.300000f, 1.050000f, -1.400000f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.150000f, 1.149999f, 0.175000f);
//                    }, 200, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 60),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 120, 190),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 300, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 120, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 120, 0)
//                }, 100, 0)
            )
            
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.KedrAction.getRenderablePart(),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 0.800000f, -0.775000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(18.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 0.800000f, -0.775000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(17.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 0.800000f, -0.775000f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.275000f, 0.800000f, -0.975000f);
                    }, 190, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, 0.800000f, -1.175000f);
                    }, 190, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.KedrStock.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0F, -2.05F, 0.75F);
                    	GL11.glRotatef(190F, 1f, 0f, 0f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0F, -0.7F, 1.55F);
                    	GL11.glRotatef(100F, 1f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.59f, -1f);

                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.07F, 0.13f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.015F, 0.17f, 0.7f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.59f, -0.7f);
                GL11.glRotatef(-0.6F, 1f, 0f, 0f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.07F, 0.13f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.015F, 0.17f, 0.65f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
            	GL11.glScalef(1f, 1f, 1f);
                GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.725000f, 0.800000f, -0.575000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(2f, 2f, 2f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.300000f, 0.400000f, -0.550000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.100000f, -0.500000f, 0.075000f);
                    	 
//                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    	 
//                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.100000f, -0.375000f, 0.175000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.325000f, -0.400000f, 0.075000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })
            
            .withFirstPersonHandPositioningRunning(
            		(renderContext) -> {
            			GL11.glScalef(3.5f, 3.5f, 3.5f);
            			GL11.glRotatef(50.000000f, 1f, 0f, 0f);
            			GL11.glRotatef(0.000000f, 0f, 1f, 0f);
            			GL11.glRotatef(0.000000f, 0f, 0f, 1f);
            			GL11.glTranslatef(0.475000f, 0.050000f, 0.225000f);
                  }, 
                  (renderContext) -> {
                	  GL11.glScalef(3.5f, 3.5f, 3.5f);
                 	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                 	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                 	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                 	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                  })
                     
            .withFirstPersonLeftHandPositioningReloading(
            		// mag down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.725000f, -0.450000f, 0.075000f);
                    }, 50, 200),
                    // mag touches gun
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.275000f, -0.500000f, 0.125000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.250000f, -0.475000f, 0.125000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.250000f, -0.525000f, 0.125000f);
                    }, 50, 200),
                    // mag inserts
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.175000f, -0.475000f, 0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.175000f, -0.475000f, 0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.175000f, -0.475000f, 0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.175000f, -0.475000f, 0.050000f);
                    }, 250, 0),
                 // grabs action
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.325000f, -0.775000f, 0.100000f);
                    }, 240, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.325000f, -0.775000f, 0.100000f);
                    }, 70, 0),
                    // pulls action back
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.325000f, -0.795000f, 0.100000f);
                    }, 80, 0),
                    // action snaps forward
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.315000f, -0.985000f, 0.100000f);
                    }, 70, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.315000f, -0.985000f, 0.100000f);
                    }, 60, 0),
                 // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.315000f, -0.985000f, 0.100000f);
                    }, 70, 0),
                 // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.315000f, -0.985000f, 0.100000f);
                    }, 90, 0)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
            		
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                   }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                   }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                   }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                   }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                   }, 260, 0),
                 // grabs action
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 240, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 70, 0),
                    // pulls action back
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 80, 0),
                    // action snaps forward
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 70, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 60, 0),
                 // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 70, 0),
                 // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 90, 0)
                    )
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.550000f, 0.150000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.475000f, 0.150000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.600000f, 0.100000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(30.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.275000f, -0.125000f, 0.325000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, -0.500000f, 0.025000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.500000f, -0.475000f, 0.150000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(3.5f, 3.5f, 3.5f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.250000f, -0.175000f, 0.225000f);
//                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.025000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.100000f, 0.125000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.025000f, 0.075000f);
                    }, 300, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 5f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
//                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-49.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.200000f, 0.050000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.200000f, 0.050000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(21.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.200000f, 0.050000f);
                    }, 280, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(55.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.000000f, -0.475000f, 0.000000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.525000f, -0.400000f, -0.100000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(125.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.725000f, -0.450000f, 0.125000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(125.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.725000f, -0.450000f, 0.125000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(125.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.725000f, -0.450000f, 0.125000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.395000f, -0.470000f, 0.190000f);
                    }, 280, 0)
                    )
             
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

