package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class M1911Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("m1911")
                .withFireRate(0.5f)
                .withRecoil(3f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.HANDGUN)
                .withShellType(Type.PISTOL)
                .withMaxShots(1)
                .withShootSound("colt_m45a1")
                .withSilencedShootSound("colt_m45a1_silenced")
                .withReloadSound("m45a1_reload")
                .withUnloadSound("pistol_unload")
                .withInspectSound("inspection")
                .withDrawSound("handgun_draw")
                .withReloadingTime(50)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.13f)
                .withFlashOffsetY(() -> 0.12f)
//      .withShellCasingForwardOffset(0.001f)
                .withInaccuracy(3)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        3f, // x
                        0.1f, // y
                        1f) // z

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withCompatibleAttachment(Attachments.PistolPlaceholder, true, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.M1911Body, true, (model) -> {
//            GlStateManager.translate(0.01f, -0.19f, -0.4f);
//            GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.M191144MagBody, (model) -> {
//          GlStateManager.translate(0.01f, -0.19f, -0.4f);
//          GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.M1911Slide, true, (model) -> {
                    if (model instanceof M1911Slide) {
                        GlStateManager.scale(1F, 1F, 1F);
//                GlStateManager.translate(0F, 0F, 0.5F);
                    } else if (model instanceof makarovrearsight) {
                        GlStateManager.translate(-0.155F, -1.155F, -0.15F);
                        GlStateManager.scale(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof M1911frontsight) {
                        GlStateManager.translate(-0.15F, -1.145F, -2.35F);
                        GlStateManager.scale(0.25F, 0.25F, 0.25F);
                    }
                })
                .withCompatibleAttachment(Attachments.M191144MagSlide, (model) -> {
                    if (model instanceof M191144MagSlide) {
                        GlStateManager.scale(1F, 1F, 1F);
//                GlStateManager.translate(0F, 0F, 0.5F);
                    } else if (model instanceof makarovrearsight) {
                        GlStateManager.translate(-0.155F, -1.155F, -0.15F);
                        GlStateManager.scale(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof M1911frontsight) {
                        GlStateManager.translate(-0.15F, -1.145F, -2.8F);
                        GlStateManager.scale(0.25F, 0.25F, 0.25F);
                    }
                })
                .withCompatibleAttachment(Magazines.M45A1Mag, (model) -> {
                    GlStateManager.translate(0F, 0.2F, 0.12F);
                })
                .withCompatibleAttachment(Magazines.M45A1Mag14, (model) -> {
                })
                .withCompatibleAttachment(Magazines.M1911_44Mag, (model) -> {
                    GlStateManager.translate(0F, 0.2F, 0.12F);
                })
                .withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
                    GlStateManager.translate(-0.23F, -1.14F, -4.92F);
                    GlStateManager.scale(1.5F, 1.5F, 1.5F);
                })
                .withTextureNames("m1911")
                .withRenderer(new WeaponRenderer.Builder()
                        .withModel(new M1911())

                        //.withBakedModel(WavefrontLoader.loadWeaponModel("m1911test", Arrays.asList("body", "handle"), false))
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
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
                            GlStateManager.translate(-1.8F, -1F, 2F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
//                    GlStateManager.scale(2F, 2F, 2F);
//                    GlStateManager.rotate(45F, 0f, 1f, 0f);
//                    GlStateManager.rotate(10F, 0f, 0f, 1f);
//                    GlStateManager.translate(-0.200000f, 0.70000f, -2.1f);

                            GlStateManager.scale(2F, 2F, 2F);
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(0.000000f, 0.800000f, -1.949999f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
//                    GlStateManager.scale(2F, 2F, 2F);
//                    GlStateManager.rotate(45F, 0f, 1f, 0f);
//                    GlStateManager.rotate(10F, 0f, 0f, 1f);
//                    GlStateManager.translate(-0.200000f, 0.730000f, -1.6f);
//                    GlStateManager.rotate(-7F, 1f, 0f, 0f);

                            GlStateManager.scale(2F, 2F, 2F);
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(0.000000f, 0.800000f, -1.449999f);
                            GlStateManager.rotate(-7F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(Attachments.M1911Slide.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, 0F, 0.5F);
//              GlStateManager.rotate(45F, 0f, 1f, 0f);
//              GlStateManager.scale(0.55F, 0.55F, 0.55F);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(Attachments.M1911Slide.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, 0F, 0.5F);
//              GlStateManager.rotate(45F, 0f, 1f, 0f);
//              GlStateManager.scale(0.55F, 0.55F, 0.55F);
                        })


                        .withFirstPersonCustomPositioning(Attachments.M1911Slide.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GlStateManager.translate(0F, 0F, 0.5F);
                            }
                        })

                        .withFirstPersonPositioningCustomRecoiled(Attachments.M191144MagSlide.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, 0F, 0.5F);
//              GlStateManager.rotate(45F, 0f, 1f, 0f);
//              GlStateManager.scale(0.55F, 0.55F, 0.55F);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(Attachments.M191144MagSlide.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, 0F, 0.5F);
//              GlStateManager.rotate(45F, 0f, 1f, 0f);
//              GlStateManager.scale(0.55F, 0.55F, 0.55F);
                        })


                        .withFirstPersonCustomPositioning(Attachments.M191144MagSlide.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GlStateManager.translate(0F, 0F, 0.5F);
                            }
                        })

                        .withFirstPersonPositioningReloading(

                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-13.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(29.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, 0.54f, -2.024999f);
                                }, 250, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-13.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(29.600000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-14.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, 0.51f, -2.024999f);
                                }, 210, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-13.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.200000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-13.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, 0.48f, -2.024999f);
                                }, 65, 0),

                                // mag slides in

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-14.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-18.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, 0.25f, -2.024999f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-13.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-23.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, 0.22f, -2.024999f);
                                }, 50, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-12.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, 0.23f, -2.024999f);
                                }, 70, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-12.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-17.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, 0.25f, -2.024999f);
                                }, 90, 0),

                                // gun rotates (ready to push release button)

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, 0.825000f, -2.024999f);
                                }, 200, 0),

                                // slide releases

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(34.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, 0.805000f, -2.174999f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-9.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(34.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-6.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, 0.805000f, -2.044999f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-7.800000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.100000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, 0.805000f, -2.074999f);
                                }, 70, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-5.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(34.800000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, 0.805000f, -2.074999f);
                                }, 90, 0)
                        )

                        .withFirstPersonPositioningUnloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-10F, 1f, 0f, 0f);
                                    GlStateManager.rotate(36F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.73f, 0.4f, -1.8f);
                                }, 220, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-17F, 1f, 0f, 0f);
                                    GlStateManager.rotate(38F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.73f, 1f, -1.8f);
                                }, 110, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(-14F, 1f, 0f, 0f);
                                    GlStateManager.rotate(38F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-1F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.73f, 0.9f, -1.8f);
                                }, 100, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(Magazines.M45A1Mag,
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

                        .withFirstPersonCustomPositioningUnloading(Magazines.M45A1Mag,
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

                        .withFirstPersonCustomPositioningReloading(Magazines.M45A1Mag14,
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

                        .withFirstPersonCustomPositioningUnloading(Magazines.M45A1Mag14,
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

                        .withFirstPersonCustomPositioningReloading(Magazines.M1911_44Mag,
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

                        .withFirstPersonCustomPositioningUnloading(Magazines.M1911_44Mag,
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

                        .withFirstPersonCustomPositioningReloading(Attachments.M1911Slide.getRenderablePart(),
// left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 300, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 200, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 200, 0),

                                // mag slides in

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 200, 0),

                                // gun rotates (ready to push release button)

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
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

                        .withFirstPersonCustomPositioningUnloading(Attachments.M1911Slide.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.6F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.6F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.6F);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.M191144MagSlide.getRenderablePart(),
// left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 300, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 200, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 200, 0),

                                // mag slides in

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
                                }, 200, 0),

                                // gun rotates (ready to push release button)

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.6f);
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

                        .withFirstPersonCustomPositioningUnloading(Attachments.M191144MagSlide.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.6F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.6F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.6F);
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

                        .withThirdPersonCustomPositioningReloading(Attachments.M1911Slide.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0F);
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(35F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8F, 0f, 0f, 1f);
                                    GlStateManager.rotate(15F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.200000f, 0.700000f, -2.1f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8F, 0f, 0f, 1f);
                                    GlStateManager.rotate(7F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.200000f, 0.700000f, -2.1f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8F, 0f, 0f, 1f);
                                    GlStateManager.rotate(0F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.200000f, 0.700000f, -2.1f);
                                }, 180, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-5F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.200000f, 0.80000f, -1.9f);
                                }, 130, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2F, 2F, 2F);
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.200000f, 0.700000f, -2.1f);
                                }, 120, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(Attachments.M1911Slide.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.6F);
                                }, 130, 60),
                                new Transition((renderContext) -> { // Reload position
                                }, 110, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(Attachments.M191144MagSlide.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.6F);
                                }, 130, 60),
                                new Transition((renderContext) -> { // Reload position
                                }, 110, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3F, 3F, 3F);
                            GlStateManager.translate(0.350000f, 0.62f, -2f);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.22f, 0f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3F, 3F, 3F);
                            GlStateManager.translate(0.350000f, 0.64f, -1.5f);
                            GlStateManager.rotate(-8F, 1f, 0f, 0f);
                            GlStateManager.rotate(-3F, 0f, 0f, 1f);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.22f, 0f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.scale(1F, 1F, 1F);
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(8F, 0f, 0f, 1f);
                            GlStateManager.rotate(-55F, 1f, 0f, 0f);
                            GlStateManager.translate(-0.600000f, 1.20000f, -0.6f);
                        })
                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(3F, 3F, 3F);
                            GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-1.374999f, 0.600000f, -1.449999f);
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
//                             GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
//                             GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
//                             GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
//                             GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
//                             GlStateManager.translate(0.050000f, -0.025000f, 0.475000f);

                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.750000f, 0.075000f);
                                },
                                (renderContext) -> {
//                	   GlStateManager.scale(4.5f, 4.5f, 4.5f);
//                       GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
//                       GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
//                       GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
//                       GlStateManager.translate(0.385000f, -0.500000f, 0.170000f);

                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.485000f, 0.160000f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.800000f, 0.075000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.405000f, -0.514000f, 0.140000f);
                                })

                        .withFirstPersonHandPositioningRunning(
                                (renderContext) -> {
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.025000f, 0.475000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.385000f, -0.500000f, 0.170000f);
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
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.370000f, -0.490000f, 0.150000f);
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
                                }, 70, 0)
                        )

                        .withFirstPersonRightHandPositioningReloading(

                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.165000f);
                                }, 300, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.165000f);
                                }, 200, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.165000f);
                                }, 200, 0),

                                // mag slides in

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.165000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.165000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.165000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.165000f);
                                }, 200, 0),

                                // gun rotates (ready to push release button)

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.175000f);
                                }, 270, 0),

                                // slide releases

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.410000f, -0.490000f, 0.170000f);
                                }, 90, 0),

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
                                }, 70, 0)
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
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.165000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.165000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.500000f, 4.500000f, 4.500000f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.165000f);
                                }, 250, 0))

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
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.100000f, 0.100000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.150000f, 0.100000f);
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
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.150000f, 0.150000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-62.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.150000f, 0.150000f);
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
                .withSpawnEntityDamage(5.3f)
                .withSpawnEntityGravityVelocity(0.02f)


                .build(MWC.modContext);
    }
}
