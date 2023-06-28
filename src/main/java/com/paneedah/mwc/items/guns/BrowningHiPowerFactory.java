package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.BrowningHiPower;
import com.paneedah.mwc.models.Emp1911Slide;
import com.paneedah.mwc.models.M1911frontsight;
import com.paneedah.mwc.models.makarovrearsight;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class BrowningHiPowerFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("browning_hi_power")
        .withFireRate(0.65f)
        .withRecoil(4f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SIDEARM)
        .withMaxShots(1)
        .withShootSound("hi_power")
        .withSilencedShootSound("colt_m45a1_silenced")
        .withReloadSound("m45a1_reload")
        .withUnloadSound("pistol_unload")
        .withInspectSound("inspection")
        .withDrawSound("handgun_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.13f)
        .withFlashOffsetY(() -> 0.12f)
//      .withShellCasingForwardOffset(0.001f)
        .withInaccuracy(3)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Single Action Semi-Automatic Pistol", 
        "Damage: 5", 
        "Cartridge: 9x19mm",
        "Fire Rate: SEMI",
        "Rate of Fire: 65/100",
        "Magazines:",
        "13rnd 9x19mm Magazine"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 4f, // x 
                 0.1f, // y
                 1.5f) // z
         
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withCompatibleAttachment(Attachments.PistolPlaceholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.BrowningHiPowerSlide, true, (model) -> {
            if(model instanceof Emp1911Slide) {
                GL11.glScaled(1F, 1F, 1F);
//                GL11.glTranslatef(0F, 0F, 0.5F);
            }
            else if(model instanceof makarovrearsight) {
                GL11.glTranslatef(-0.155F, -1.155F, -0.15F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            }
            else if(model instanceof M1911frontsight) {
                GL11.glTranslatef(-0.15F, -1.145F, -2.45F);
                GL11.glScaled(0.25F, 0.25F, 0.25F);
            }
        })
        .withCompatibleAttachment(Magazines.HiPowerMag, (model) -> {
            GL11.glTranslatef(0F, 0.2F, 0.12F);
        })
//        .withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
//            GL11.glTranslatef(-0.23F, -1.14F, -4.92F);
//            GL11.glScaled(1.5F, 1.5F, 1.5F);
//        })
        .withTextureNames("BrowningHiPower")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new BrowningHiPower())
            //.withTextureName("M9")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(12F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.100000f, 0.80000f, -2.1f);
                
//                GL11.glScaled(2F, 2F, 2F);
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glRotatef(13F, 0f, 0f, 1f);
//                GL11.glTranslatef(0.400000f, 0.750000f, -2.1f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(12F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.100000f, 0.800000f, -1.4f);
                GL11.glRotatef(-9F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(14F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.25f, 0.45f, -2f);
                
//                GL11.glScaled(2F, 2F, 2F);
//                GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(36.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(35.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.5f, 1.1f, -1.8f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(18F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.25f, 0.45f, -1.8f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);    
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.BrowningHiPowerSlide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.BrowningHiPowerSlide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.BrowningHiPowerSlide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.5F);
                }
            })
               
            .withFirstPersonPositioningReloading(
            		
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(29.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.54f, -2.024999f);
                    }, 250, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(29.600000f, 0f, 1f, 0f);
                        GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.51f, -2.024999f);
                    }, 210, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.48f, -2.024999f);
                    }, 65, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-18.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.25f, -2.024999f);
                    }, 100, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-23.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.22f, -2.024999f);
                    }, 50, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-12.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.23f, -2.024999f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-12.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.25f, -2.024999f);
                    }, 90, 0),
                    
                 // hand goes on slide
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, 1.149999f, -1.449999f);
                    }, 240, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-9.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(21.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, 1.149999f, -1.249999f);
                    }, 60, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(19.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, 1.149999f, -1.149999f);
                    }, 80, 0),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, 1.149999f, -1.649999f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, 1.149999f, -1.349999f);
                    }, 60, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(21.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, 1.149999f, -1.45f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(1.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.500000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, 1.149999f, -1.409999f);
                    }, 90, 0)
                )
                
            .withFirstPersonPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glRotatef(36F, 0f, 1f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 0.4f, -1.8f);
                    }, 220, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-17F, 1f, 0f, 0f);
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(-3F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 1f, -1.8f);
                    }, 110, 0),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-14F, 1f, 0f, 0f);
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(-1F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 0.9f, -1.8f);
                    }, 100, 0)
                )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.HiPowerMag,
// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.05f, 3f, 0.2f);
                     	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.07f, 1f, 0.2f);
                     	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.07f, 1f, 0.2f);
                     	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
//                    	GL11.glTranslatef(-0.02f, 0f, 0f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                 // gun rotates (ready to push release button)
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // jiggle
                    
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
                        
            .withFirstPersonCustomPositioningUnloading(Magazines.HiPowerMag,
            		new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(0F, 1F, 0.4F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1.7F, 0.4F);
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.BrowningHiPowerSlide.getRenderablePart(),
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
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // jiggle
                    
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
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 270, 50),
                    
                    // jiggle
                    
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
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.BrowningHiPowerSlide.getRenderablePart(),
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.149999f, 0.575000f, -0.725000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScaled(2F, 2F, 2F);
                      GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.375000f, 0.950000f, -1.075000f);
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
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.BrowningHiPowerSlide.getRenderablePart(),
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
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.200000f, 0.700000f, -2.1f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(7F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.200000f, 0.700000f, -2.1f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(0F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.200000f, 0.700000f, -2.1f);
                    }, 180, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(-5F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.200000f, 0.80000f, -1.9f);
                    }, 130, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, 0.700000f, -2.1f);
                    }, 120, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.BrowningHiPowerSlide.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 0.62f, -2f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.22f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 0.64f, -1.5f);
                GL11.glRotatef(-8F, 1f, 0f, 0f);
                GL11.glRotatef(-4F, 0f, 0f, 1f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.22f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                 GL11.glScaled(1F, 1F, 1F);
                 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glRotatef(8F, 0f, 0f, 1f);
                 GL11.glRotatef(-55F, 1f, 0f, 0f);
                 GL11.glTranslatef(-0.600000f, 1.20000f, -0.6f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(3F, 3F, 3F);
                 GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.374999f, 0.600000f, -1.449999f);
             })
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScaled(3F, 3F, 3F);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.774999f, 0.100000f, -1.949999f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                       GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                       GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.050000f, -0.025000f, 0.475000f);
                   }, 
                   (renderContext) -> {
                	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                   })
            .withFirstPersonHandPositioningProning(
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.050000f, -0.025000f, 0.475000f);
                   }, 
                   (renderContext) -> {
                	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                   })
            .withFirstPersonHandPositioningRunning(
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.050000f, -0.025000f, 0.475000f);
                     }, 
                     (renderContext) -> {
                  	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                     })      
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.275000f, -0.125000f, 0.400000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                     })
            .withFirstPersonHandPositioningModifyingAlt(
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(110.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.025000f, -0.750000f, 0.025000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.300000f, -0.550000f, 0.125000f);
                     })
            .withFirstPersonLeftHandPositioningReloading(
                    
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.825000f, 0.200000f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.250000f, -0.900000f, 0.225000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.250000f, -0.900000f, 0.225000f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.800000f, 0.200000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.800000f, 0.200000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.800000f, 0.200000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.800000f, 0.200000f);
                    }, 200, 0),
                    
                 // gun rotates (ready to push release button)
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
           			 GL11.glRotatef(-190.000000f, 1f, 0f, 0f);
           			 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
           			 GL11.glRotatef(105.000000f, 0f, 0f, 1f);
           			 GL11.glTranslatef(-0.425000f, -0.700000f, -0.075000f);
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
           			 GL11.glRotatef(-190.000000f, 1f, 0f, 0f);
           			 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
           			 GL11.glRotatef(105.000000f, 0f, 0f, 1f);
           			 GL11.glTranslatef(-0.425000f, -0.700000f, -0.075000f);
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-195.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(105.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.425000f, -0.700000f, -0.095000f);
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-200.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(105.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.375000f, -0.750000f, -0.365000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-200.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(105.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.375000f, -0.660000f, -0.395000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-200.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(105.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.375000f, -0.660000f, -0.435000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-200.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(105.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.375000f, -0.660000f, -0.435000f);
                    }, 70, 0)
                )
                    
            .withFirstPersonRightHandPositioningReloading(
                    
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                 // gun rotates (ready to push release button)
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                   }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.410000f, -0.490000f, 0.160000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.410000f, -0.490000f, 0.160000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.410000f, -0.490000f, 0.160000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.410000f, -0.490000f, 0.160000f);
                    }, 70, 0)
                )
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.850000f, 0.125000f);
                    }, 330, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -1.000000f, 0.250000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -1.000000f, 0.250000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 250, 0))
                    
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.025000f, 0.475000f);
                  }, 
                  (renderContext) -> {
                      GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                      GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                  })
                  
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.775000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.775000f, 0.125000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
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
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.800000f, 0.075000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.800000f, 0.075000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, -0.675000f, 0.150000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, -0.725000f, 0.025000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, -0.675000f, 0.150000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                 	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                 	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                 	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                 	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                 	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                    }, 280, 0)
                    )
                          
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(MWC.modContext);
    }
}
