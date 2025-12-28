package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class MAS21Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("mas_21")
                .withFireRate(0.5f)
                .withRecoil(2f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.HANDGUN)
                .withShellType(Type.PISTOL)
                .withMaxShots(1)
                .withShootSound("m9a1")
                .withSilencedShootSound("m9a1_silenced")
                .withReloadSound("m9a1_reload")
                .withUnloadSound("pistol_unload")
                .withInspectSound("inspection")
                .withDrawSound("handgun_draw")
                .withReloadingTime(50)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.13f)
                .withFlashOffsetY(() -> 0.14f)
//      .withShellCasingForwardOffset(0.001f)
                .withInaccuracy(3)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        2.5f, // x
                        0.5f, // y
                        1.5f) // z

                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withCompatibleAttachment(Attachments.M9A1Body, true, (model) -> {
//          GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.MAS21Slide, true, (model) -> {
                    if (model instanceof MAS21Slide) {
                        GlStateManager.scale(1F, 1F, 1F);
//                GlStateManager.translate(0F, 0F, 0.37F);
                    } else if (model instanceof P226rearsight) {
                        GlStateManager.translate(-0.15F, -1.05F, -0.05F);
                        GlStateManager.scale(0.25F, 0.2F, 0.25F);
                    } else if (model instanceof P226frontsight) {
                        GlStateManager.translate(-0.145F, -1.05F, -1.45F);
                        GlStateManager.scale(0.2F, 0.2F, 0.2F);
                    }
                })
                .withCompatibleAttachment(AuxiliaryAttachments.MAS21Barrel, true, (model) -> {
//        	GlStateManager.translate(0f, 0f, 0.8f);
//            GlStateManager.translate(-0.00F, -0F, 0.1F);
//            GlStateManager.rotate(360F, 0f, 0f, 1f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.MAS21Part, true, (model) -> {
//            GlStateManager.translate(0F, 0F, 0.28F);
                })
                .withCompatibleAttachment(Magazines.M9A1Mag, (model) -> {
                    GlStateManager.translate(-0.01F, 0F, 0.05F);
                    GlStateManager.scale(0.9F, 0.9F, 0.9F);
                })
                .withCompatibleAttachment(Magazines.M9Mag30, (model) -> {
                    GlStateManager.translate(-0.01F, 0F, -0.07F);
                    GlStateManager.scale(0.9F, 0.9F, 0.9F);
                })
                .withCompatibleAttachment(Magazines.M9DrumMag, (model) -> {
                    GlStateManager.translate(-0.01F, 0F, -0.07F);
                    GlStateManager.scale(0.9F, 0.9F, 0.9F);
                })
                .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
                    GlStateManager.translate(0.01F, -0.6F, -2.05F);
                    GlStateManager.scale(1.1F, 1.1F, 1.1F);
                    GlStateManager.rotate(-90F, 0f, 0f, -4f);
                })
                .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
                    GlStateManager.translate(-0.22F, -1.2F, -4.35F);
                    GlStateManager.scale(1.3F, 1.3F, 1.3F);
                })
                .withCompatibleAttachment(Attachments.MAS21Mount, (p, s) -> {
//            GlStateManager.translate(-0.23f, -0.53f, -1.9f);
//            GlStateManager.scale(0.7F, 0.6F, 0.7F);
                })
                .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
                    GlStateManager.translate(-0.5F, -0.6F, -1.4F);
                    GlStateManager.scale(0.36F, 0.36F, 0.36F);
                    GlStateManager.rotate(-90F, 0f, 0f, 1f);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.1F, -0.5F);
                        GlStateManager.scale(0.2F, 0.2F, 0.2F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GlStateManager.translate(-0.155F, -1.83F, -1.2F);
                    GlStateManager.scale(0.48F, 0.48F, 0.48F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.08F, 0.97F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    } else if (model instanceof SightMount) {
                        //        	GlStateManager.translate(-0.15F, -1.82F, -1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withTextureNames("mas21")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new MAS21())
                        //.withTextureName("M9")
                        //.withWeaponProximity(0.99F)
                        //.withYOffsetZoom(5F)
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.4F, 0.4F, 0.4F);
                            GlStateManager.rotate(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.35F, 0.35F, 0.35F);
                            GlStateManager.translate(0, 0.8f, 0);
                            GlStateManager.rotate(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GlStateManager.scale(0.6F, 0.6F, 0.6F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                            GlStateManager.translate(0.100000f, 1.950000f, 1.700000f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.scale(2F, 2F, 2F);
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(10F, 0f, 0f, 1f);
                            GlStateManager.translate(-0.150000f, 0.645000f, -1.225000f);

//	                GlStateManager.scale(2F, 2F, 2F);
//	                GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
//	                GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
//	                GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
//	                GlStateManager.translate(0.400000f, 1.075000f, -0.625000f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.scale(2F, 2F, 2F);
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(10F, 0f, 0f, 1f);
                            GlStateManager.translate(-0.150000f, 0.645000f, -0.925000f);
                            GlStateManager.rotate(-5F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.MAS21Slide.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, 0F, 0.37F);
//              GlStateManager.rotate(45F, 0f, 1f, 0f);
//              GlStateManager.scale(0.55F, 0.55F, 0.55F);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.MAS21Slide.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, 0F, 0.37F);
//              GlStateManager.rotate(45F, 0f, 1f, 0f);
//              GlStateManager.scale(0.55F, 0.55F, 0.55F);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.MAS21Slide.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GlStateManager.translate(0F, 0F, 0.37F);
                            }
                        })

                        .withFirstPersonCustomPositioning(Magazines.M9A1Mag, (renderContext) -> {
//          	 GlStateManager.translate(0.1f, 1f, 0.2f);
//          	 GlStateManager.rotate(-20F, 0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningReloading(

                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-13.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-12.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, 0.520000f, -1.624999f);
                                }, 300, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-17.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-13.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, 0.480000f, -1.624999f);
                                }, 180, 50),

                                // mag slides in

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.200000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-11.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, 0.30000f, -1.624999f);
                                }, 150, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, 0.360000f, -1.624999f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-12.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, 0.380000f, -1.624999f);
                                }, 90, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-14.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, 0.380000f, -1.624999f);
                                }, 120, 0),

                                // gun rotates (ready to push release button)

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 230, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-12.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 70, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-14.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-9.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 100, 0),

                                // slide releases

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-8.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 70, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-6.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-9.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 80, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 100, 0),

                                // gun turns to the side

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, 1.075000f, -0.625000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(68.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, 1.075000f, -0.625000f);
                                }, 60, 0),

                                // Part moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(69.500000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, 1.075000f, -0.605000f);
                                }, 80, 0),

                                // Barrel moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(71.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, 1.075000f, -0.612000f);
                                }, 100, 0),

                                // barrel twists 180

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(71.400000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, 1.075000f, -0.609000f);
                                }, 100, 0),

                                // barrel twists another 180

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(69.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, 1.075000f, -0.605000f);
                                }, 100, 0),

                                // Part moves forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, 1.075000f, -0.645000f);
                                }, 80, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, 1.075000f, -0.615000f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, 1.075000f, -0.625000f);
                                }, 90, 0)
                        )

                        .withFirstPersonPositioningUnloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-10F, 1f, 0f, 0f);
                                    GlStateManager.rotate(36F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.73f, 0.4f, -1.6f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-17F, 1f, 0f, 0f);
                                    GlStateManager.rotate(38F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.73f, 1f, -1.6f);
                                }, 150, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-14F, 1f, 0f, 0f);
                                    GlStateManager.rotate(38F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-1F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.73f, 0.9f, -1.6f);
                                }, 120, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(Magazines.M9A1Mag,
                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 3f, 0.2f);
                                    GlStateManager.rotate(-20F, 0f, 0f, 1f);
                                }, 300, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.07f, 1f, 0.2f);
                                    GlStateManager.rotate(-20F, 0f, 0f, 1f);
                                }, 200, 0),

                                // mag slides in

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(-0.02f, 0f, 0f);
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
                                }, 70, 0),

                                // gun turns to the side

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // Part moves back

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 80, 0),

                                // Barrel moves back

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 200, 0),

                                // barrel twists 180

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 200, 0),

                                // barrel twists another 180

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 200, 0),

                                // Part moves forward

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 80, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 90, 0)
                        )

                        .withFirstPersonCustomPositioningUnloading(Magazines.M9A1Mag,
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(0F, 1F, 0.4F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 1.7F, 0.4F);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Magazines.M9Mag30,
                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 3f, 0.2f);
                                    GlStateManager.rotate(-20F, 0f, 0f, 1f);
                                }, 300, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.07f, 1f, 0.2f);
                                    GlStateManager.rotate(-20F, 0f, 0f, 1f);
                                }, 200, 0),

                                // mag slides in

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(-0.02f, 0f, 0f);
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
                                }, 70, 0),

// gun turns to the side

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // Part moves back

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // Barrel moves back

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 80, 0),

                                // barrel twists 180

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 70, 0),

                                // barrel twists another 180

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 70, 0),

                                // Part moves forward

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 90, 0)
                        )

                        .withFirstPersonCustomPositioningUnloading(Magazines.M9Mag30,
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(0F, 1F, 0.4F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 1.7F, 0.4F);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Magazines.M9DrumMag,
                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 3f, 0.2f);
                                    GlStateManager.rotate(-20F, 0f, 0f, 1f);
                                }, 300, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.07f, 1f, 0.2f);
                                    GlStateManager.rotate(-20F, 0f, 0f, 1f);
                                }, 200, 0),

                                // mag slides in

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(-0.02f, 0f, 0f);
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
                                }, 70, 0),

// gun turns to the side

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // Part moves back

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // Barrel moves back

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 80, 0),

                                // barrel twists 180

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 70, 0),

                                // barrel twists another 180

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 70, 0),

                                // Part moves forward

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 90, 0)
                        )

                        .withFirstPersonCustomPositioningUnloading(Magazines.M9DrumMag,
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(0F, 1F, 0.4F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 1.7F, 0.4F);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MAS21Slide.getRenderablePart(),
                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 300, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // mag slides in

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // gun rotates (ready to push release button)

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 270, 50),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 270, 50),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.37F);
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
                                }, 70, 0),

// gun turns to the side

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // Part moves back

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // Barrel moves back

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 80, 0),

                                // barrel twists 180

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 70, 0),

                                // barrel twists another 180

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 70, 0),

                                // Part moves forward

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//	                   	 GlStateManager.scale(2F, 2F, 2F);
//	                   	 GlStateManager.rotate(-7.000000f, 1f, 0f, 0f);
//	                   	 GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//	                   	 GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
//	                   	 GlStateManager.translate(-0.875000f, 0.825000f, -1.624999f);
                                }, 90, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MAS21Part.getRenderablePart(),
                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
//                        GlStateManager.translate(0F, 0F, 0.37F);
                                }, 300, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // mag slides in

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // gun rotates (ready to push release button)

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 270, 50),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 270, 50),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
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
                                }, 70, 0),

// gun turns to the side

                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 60, 0),

                                // Part moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.28F);
                                }, 60, 0),

                                // Barrel moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.28F);
                                }, 80, 0),

                                // barrel twists 180

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.28F);
                                }, 70, 0),

                                // barrel twists another 180

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.28F);
                                }, 70, 0),

                                // Part moves forward

                                new Transition((renderContext) -> { // Reload position
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 90, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MAS21Barrel.getRenderablePart(),
                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
//                        GlStateManager.translate(0F, 0F, 0.37F);
                                }, 300, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // mag slides in

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 200, 0),

                                // gun rotates (ready to push release button)

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 270, 50),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
                                }, 270, 50),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(0F, 0F, 0.37F);
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
                                }, 70, 0),

// gun turns to the side

                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 60, 0),

                                // Part moves back

                                new Transition((renderContext) -> { // Reload position
                                }, 60, 0),

                                // Barrel moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.1F);
                                }, 80, 0),

                                // barrel twists 180

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.45F, -0.06F, 0.1F);
                                    GlStateManager.rotate(30F, 0f, 0f, 1f);
                                }, 70, 0),

                                // barrel twists another 180

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.29F, -0.09F, 0.05F);
                                    GlStateManager.rotate(-20F, 0f, 0f, 1f);
                                }, 70, 0),

                                // Part moves forward

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(-0.00F, -0F, 0.1F);
//                        GlStateManager.rotate(360F, 0f, 0f, 1f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 90, 0)
                        )

                        .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.MAS21Slide.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.149999f, 0.575000f, -0.725000f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.950000f, -1.075000f);
                                }, 350, 600)
                        )

                        .withThirdPersonPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 200, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 130, 10),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 200, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 200, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 270, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 70, 50)
                        )


                        .withThirdPersonCustomPositioningReloading(Attachments.M9A1Slide.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0F);
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(30F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8F, 0f, 0f, 1f);
                                    GlStateManager.rotate(4F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.2f, 1.3f, -1.8f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(30F, 0f, 1f, 0f);
                                    GlStateManager.rotate(15F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.translate(0.1f, 1.2f, -1.8f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(32F, 0f, 1f, 0f);
                                    GlStateManager.rotate(40F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.translate(0.3f, 1f, -1.8f);
                                }, 180, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(33F, 0f, 1f, 0f);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-9F, 1f, 0f, 0f);
                                    GlStateManager.translate(0.3f, 1.1f, -1.75f);
                                }, 130, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(35F, 0f, 1f, 0f);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.translate(0.3f, 1f, -1.8f);
                                }, 120, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.MAS21Slide.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.37F);
                                }, 130, 60),
                                new Transition((renderContext) -> { // Reload position
                                }, 110, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3F, 3F, 3F);
                            GlStateManager.translate(0.350000f, 0.47f, -1.5f);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(-0.755f, -0.43f, 0.7f);
                                GlStateManager.rotate(87F, 0f, 0f, 1f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.2f, 0f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3F, 3F, 3F);
                            GlStateManager.translate(0.350000f, 0.47f, -1.2f);
                            GlStateManager.rotate(-3F, 1f, 0f, 0f);
                            GlStateManager.rotate(-1F, 0f, 0f, 1f);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(-0.755f, -0.43f, 0.7f);
                                GlStateManager.rotate(87F, 0f, 0f, 1f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.2f, 0f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.scale(2F, 2F, 2F);
                            GlStateManager.rotate(40F, 0f, 1f, 0f);
                            GlStateManager.rotate(15F, 0f, 0f, 1f);
                            GlStateManager.rotate(7F, 1f, 0f, 0f);
                            GlStateManager.translate(0.200000f, 0.600000f, -1.5f);
                        })
                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(3F, 3F, 3F);
                            GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.425000f, 1.674999f, -0.900000f);
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            GlStateManager.scale(3F, 3F, 3F);
                            GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-1.774999f, 0.100000f, -1.949999f);
                        })
                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(4.00000f, 4.00000f, 4.00000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.800000f, 0.075000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.465000f, 0.175000f);
                                })

                        .withFirstPersonHandPositioningRunning(
                                (renderContext) -> {
                                    GlStateManager.scale(4.00000f, 4.00000f, 4.00000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.800000f, 0.075000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.465000f, 0.175000f);
                                })
                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.125000f, 0.400000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.465000f, 0.175000f);
                                })
                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(110.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.750000f, 0.025000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.550000f, 0.125000f);
                                })
                        .withFirstPersonLeftHandPositioningReloading(

                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.825000f, 0.200000f);
                                }, 300, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.900000f, 0.225000f);
                                }, 200, 0),

                                // mag slides in

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.800000f, 0.200000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.800000f, 0.200000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.800000f, 0.200000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.800000f, 0.200000f);
                                }, 200, 0),

                                // gun rotates (ready to push release button)

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.875000f, -0.025000f);
                                }, 270, 50),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.875000f, -0.025000f);
                                }, 270, 50),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.875000f, -0.025000f);
                                }, 270, 50),

                                // slide releases

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.875000f, -0.025000f);
                                }, 70, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.875000f, -0.025000f);
                                }, 70, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.875000f, -0.025000f);
                                }, 70, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.875000f, -0.025000f);
                                }, 70, 0),
// gun turns to the side

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.00000f, 4.00000f, 4.00000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.550000f, 0.050000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.00000f, 4.00000f, 4.00000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.550000f, 0.050000f);
                                }, 60, 0),

                                // Part moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.00000f, 4.00000f, 4.00000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.550000f, 0.050000f);
                                }, 60, 0),

                                // Barrel moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.00000f, 4.00000f, 4.00000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.550000f, 0.050000f);
                                }, 80, 0),

                                // barrel twists 180

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.00000f, 4.00000f, 4.00000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.550000f, 0.050000f);
                                }, 70, 0),

                                // barrel twists another 180

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.00000f, 4.00000f, 4.00000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.550000f, 0.050000f);
                                }, 70, 0),

                                // Part moves forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.00000f, 4.00000f, 4.00000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.550000f, 0.050000f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.00000f, 4.00000f, 4.00000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.550000f, 0.050000f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.00000f, 4.00000f, 4.00000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.550000f, 0.050000f);
                                }, 90, 0)
                        )

                        .withFirstPersonRightHandPositioningReloading(

                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.330000f, -0.505000f, 0.185000f);
                                }, 300, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.330000f, -0.505000f, 0.185000f);
                                }, 200, 0),

                                // mag slides in

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.330000f, -0.505000f, 0.185000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.330000f, -0.505000f, 0.185000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.330000f, -0.505000f, 0.185000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.330000f, -0.505000f, 0.185000f);
                                }, 200, 0),

                                // gun rotates (ready to push release button)

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.175000f);
                                }, 270, 50),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.175000f);
                                }, 270, 50),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.175000f);
                                }, 270, 50),

                                // slide releases

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.410000f, -0.490000f, 0.160000f);
                                }, 70, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.410000f, -0.490000f, 0.160000f);
                                }, 70, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.410000f, -0.490000f, 0.160000f);
                                }, 70, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.410000f, -0.490000f, 0.160000f);
                                }, 70, 0),
// gun turns to the side

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.465000f, 0.175000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.465000f, 0.175000f);
                                }, 60, 0),

                                // Part moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.465000f, 0.175000f);
                                }, 60, 0),

                                // Barrel moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.465000f, 0.175000f);
                                }, 80, 0),

                                // barrel twists 180

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.465000f, 0.175000f);
                                }, 70, 0),

                                // barrel twists another 180

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.465000f, 0.175000f);
                                }, 70, 0),

                                // Part moves forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.465000f, 0.175000f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.465000f, 0.175000f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.465000f, 0.175000f);
                                }, 90, 0)
                        )

                        .withFirstPersonLeftHandPositioningUnloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.850000f, 0.125000f);
                                }, 330, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -1.000000f, 0.250000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -1.000000f, 0.250000f);
                                }, 250, 0))

                        .withFirstPersonRightHandPositioningUnloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.330000f, -0.505000f, 0.185000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.330000f, -0.505000f, 0.185000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.330000f, -0.505000f, 0.185000f);
                                }, 250, 0))

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(4.00000f, 4.00000f, 4.00000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.800000f, 0.075000f);
                                },
                                (renderContext) -> {
                                    RenderContext<?> rc = renderContext;
                                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                            AttachmentCategory.SCOPE, rc.getWeaponInstance());
                                    if (activeAttachment == Attachments.RMR) {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.505000f, -0.460000f, 0.175000f);
                                    } else {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.370000f, -0.465000f, 0.175000f);
                                    }
                                })

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.775000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.775000f, 0.125000f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.490000f, 0.150000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.490000f, 0.150000f);
                                }, 250, 50))

                        .withThirdPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.100000f, 0.100000f);
                                }, 330, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.100000f, 0.125000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.050000f, 0.025000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.050000f, 0.025000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.100000f, 0.125000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.100000f, 0.100000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.100000f, 0.100000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-48.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(43.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.100000f, 0.100000f);
                                }, 250, 0))

                        .withThirdPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-67.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-11.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-67.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-66.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-9.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-62.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-62.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-57.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0))

                        .withFirstPersonLeftHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.800000f, 0.075000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.800000f, 0.075000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-160.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, -0.675000f, 0.150000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-160.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, -0.725000f, 0.025000f);
                                }, 130, 60),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-160.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, -0.675000f, 0.150000f);
                                }, 110, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.385000f, -0.500000f, 0.170000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.385000f, -0.500000f, 0.170000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.385000f, -0.500000f, 0.170000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.385000f, -0.500000f, 0.170000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.385000f, -0.500000f, 0.170000f);
                                }, 280, 0)
                        )

                        .build())
                .withSpawnEntityDamage(5.5f)
                .withSpawnEntityGravityVelocity(0.02f)


                .build(MWC.modContext);
    }
}
