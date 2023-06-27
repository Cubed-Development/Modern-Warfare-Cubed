package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.wearables.Bullets;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class M1941JohnsonRifleFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("m1941_johnson_rifle")
        .withAmmoCapacity(10)
        .withFireRate(0.5f)
        .withRecoil(2.5f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.RIFLES)
        .withMaxShots(1)
        //.withMaxShots(5)
        .withShootSound("m1941")
        .withSilencedShootSound("ak15_silenced")
        .withReloadSound("m1941_rifle_reload")
        .withUnloadSound("ak_unload")
        .withInspectSound("inspection")
        .withDrawSound("ak_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.12f)
//        .withShellCasingSideOffset(0f)
        .withShellCasingVerticalOffset(-0.1f)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Semi-Automatic Rifle",
        "Damage: 15", 
        "Cartridge: .30-06 Springfield",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 50/100",
        "Cartridge:",
        ".30-06 Springfield"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                3f, // x 
                2f, // y
                6f) // z
        
        .withCompatibleBullet(Bullets.Bullet3006Springfield, (model) -> {})
        .withCompatibleAttachment(AuxiliaryAttachments.JohnsonRifleACTION, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.StripperClip, true, (model) -> {
            GL11.glTranslatef(0F, 0.7F, 1.2F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.StripperClipBullets, true, (model) -> {
            GL11.glTranslatef(0F, 0.7F, 1.2F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.185F, -1.32F, -5.95F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.25F, -1.65F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.155F, -1.74F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(0.48F, -0.56F, 2.19F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron1) {
                    GL11.glTranslatef(0.165F, -1.65F, 1F);
                    GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                    GL11.glTranslatef(0.25F, -1.55F, -2F);
                    GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.02F, -0.135F, -4.1F);
                GL11.glScaled(0.53F, 0.53F, 0.8F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.JohnsonRifleSight, true, (model) -> {
            GL11.glTranslatef(-0.04F, -0.1F, 2.2F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        })
        .withTextureNames("johnsonrifle") 
        .withRenderer(new WeaponRenderer.Builder()

            .withModel(new JohnsonRifle())
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
                GL11.glTranslatef(-1F, 0.5F, 0.7F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, -0.2f, -3.499999f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, -0.2f, -2.999999f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.775000f, -0.025000f, -3.000001f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.775000f, -0.025000f, -2.600001f);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.StripperClipBullets.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(-0.7F, -0F, 0F);
//                GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                
//                GL11.glTranslatef(-0.9F, -0.1F, 0F);
//                GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
//                
//                GL11.glTranslatef(-0.6F, -0F, 0F);
//                GL11.glRotatef(-66.000000f, 0f, 0f, 1f);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.JohnsonRifleACTION.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.JohnsonRifleACTION.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
            
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.2f, -3.499999f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.2f, -3.499999f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(39F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.2f, -3.499999f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.2f, -3.499999f);
                    }, 200, 40),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(39F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, -0.2f, -3.499999f);
                    }, 100, 0),
                    
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.2f, -3.499999f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.2f, -3.499999f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(39F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.2f, -3.499999f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.2f, -3.499999f);
                    }, 200, 40),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(39F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, -0.2f, -3.499999f);
                    }, 100, 0)
            )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.StripperClip.getRenderablePart(),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.5F, 1F, 0.5F);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.7F, -0F, 0F);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.9F, -0.1F, 0F);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.6F, -0F, 0F);
                        GL11.glRotatef(-66.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.5F, 1F, 0.5F);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.7F, -0F, 0F);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.9F, -0.1F, 0F);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.6F, -0F, 0F);
                        GL11.glRotatef(-66.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50)
                        )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.StripperClipBullets.getRenderablePart(),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.5F, 1F, 0.5F);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.7F, -0F, 0F);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.9F, -0.1F, 0F);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.6F, -0F, 0F);
                        GL11.glRotatef(-66.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.5F, 1F, 0.5F);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.7F, -0F, 0F);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.9F, -0.1F, 0F);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.6F, -0F, 0F);
                        GL11.glRotatef(-66.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50)
                        )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, -0.275000f, -3f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.2f, 0.2f, -3.5f);
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
                    GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                }, 300, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 3.6F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(95F, 1f, 0f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                }, 120, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                }, 120, 0)
//                }, 100, 0)
            )
                        
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.675000f, 0.375000f, -3.400001f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.675000f, 0.275000f, -3.500001f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.675000f, 0.175000f, -3.600001f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.675000f, 0.075000f, -3.700001f);
                    }, 190, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.675000f, 0.075000f, -3.600001f);
                    }, 190, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.19f, -0.44f, -3.3f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.24f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.19f, -0.44f, -3f);
                GL11.glRotatef(-0.3F, 1f, 0f, 0f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.24f, -0.05f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glTranslatef(-0.675000f, 0.3f, -3.500001f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1f, -0.275000f, -3f);
             })
             
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1f, -0.275000f, -3f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.680000f, -1.140000f, 0.510000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
                     })
                     
            .withFirstPersonHandPositioningProning(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.680000f, -1.140000f, 0.510000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.680000f, -1.140000f, 0.510000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.680000f, -1.140000f, 0.510000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
                    })
                     
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.680000f, -1.140000f, 0.510000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 470, 130),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 460, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 480, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 100, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 100, 0),
                    
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 470, 130),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 460, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 480, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 100, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 100, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.375000f, -1.075000f, 0.450000f);
                    }, 470, 130),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.975000f, 0.250000f);
                    }, 460, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.975000f, 0.075000f);
                    }, 480, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.925000f, 0.200000f);
                    }, 100, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.925000f, 0.325000f);
                    }, 100, 0),
                    
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.375000f, -1.075000f, 0.450000f);
                    }, 470, 130),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.975000f, 0.250000f);
                    }, 460, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.975000f, 0.075000f);
                    }, 480, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.925000f, 0.200000f);
                    }, 100, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.925000f, 0.325000f);
                    }, 100, 0))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.000000f, -0.900000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.000000f, -0.900000f, 0.175000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.975000f, 0.375000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.975000f, 0.375000f);
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
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 280, 0))
                    
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
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.025000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                    }, 300, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.975000f, 0.225000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.680000f, -1.140000f, 0.510000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.680000f, -1.140000f, 0.510000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.680000f, -1.140000f, 0.510000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.680000f, -1.140000f, 0.510000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.680000f, -1.140000f, 0.510000f);
                    }, 280, 0)
                    )
             
            .build())
        .withSpawnEntityDamage(15f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

