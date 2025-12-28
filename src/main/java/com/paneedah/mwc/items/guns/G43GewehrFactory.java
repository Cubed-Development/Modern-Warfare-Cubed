package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class G43GewehrFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("g43_gewehr")
                .withFireRate(0.25f)
                .withRecoil(4.5f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.RIFLE)
                .withMaxShots(1)
                //.withMaxShots(5)
                .withShootSound("g43_gewehr")
                .withReloadSound("g43_gewehr_reload")
                .withUnloadSound("g43_gewehr_unload")
                .withInspectSound("inspection")
                .withDrawSound("g43_gewehr_draw")
                .withReloadingTime(45)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.13f)
                .withInaccuracy(1f)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        3f, // x
                        2f, // y
                        6f) // z

//        .withCompatibleBullet(Bullets.Bullet792x57, (model) -> {})
                .withCompatibleAttachment(AuxiliaryAttachments.G43GewehrAction, true, (model) -> {

                })
                .withCompatibleAttachment(Magazines.G43GewehrMag, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
                    if (model instanceof AKMiron1) {
                        GlStateManager.translate(0.125F, -1.8F, -0.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GlStateManager.translate(-0.183F, -1.32F, -5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GlStateManager.translate(-0.18F, -1.05F, -1.4F);
                        GlStateManager.scale(0.65F, 0.7F, 0.6F);
                    } else if (model instanceof M4Iron1) {
                        GlStateManager.translate(0.155F, -1.74F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GlStateManager.translate(0.26F, -1.55F, -2.35F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GlStateManager.translate(0.26F, -1.55F, -2.35F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof G36CIron1) {
                        GlStateManager.translate(-0.22F, -1.94F, 0.13F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof G36CIron2) {
                        GlStateManager.translate(-0.119F, -0.73F, -5.14F);
                        GlStateManager.scale(0.3F, 0.45F, 0.6F);
                    } else if (model instanceof ScarIron1) {
                        GlStateManager.translate(0.165F, -1.65F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof ScarIron2) {
                        GlStateManager.translate(0.25F, -1.55F, -2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof FALIron) {
                        GlStateManager.translate(-0.16F, -1.36F, -7.25F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M14Iron) {
                        GlStateManager.translate(0.129F, -1.63F, -2.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withTextureNames("g43gewehr")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new G43Gewehr())
                        //.withTextureName("AK47")
                        //.withWeaponProximity(0.99F)
                        //.withYOffsetZoom(5F)
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.35F, 0.35F, 0.35F);
                            GlStateManager.rotate(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.28F, 0.28F, 0.28F);
                            GlStateManager.translate(1, 2f, -1.2f);
                            GlStateManager.rotate(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GlStateManager.scale(0.55F, 0.55F, 0.55F);
                            GlStateManager.translate(-1.1F, 0.2F, 1.3F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2.5f, 2.5f, 2.5f);
                            GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.150000f, 0.375000f, -1.150000f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2.5f, 2.5f, 2.5f);
                            GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.150000f, 0.375000f, -0.650000f);
                            GlStateManager.rotate(-1F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.G43GewehrAction.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0f, 0f, 0.9f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.G43GewehrAction.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0f, 0f, 0.9f);
                        })

                        .withFirstPersonPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-1.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.375000f, -1.150000f);
                                }, 200, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-1.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(4.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.375000f, -1.150000f);
                                }, 300, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(1.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.375000f, -1.150000f);
                                }, 120, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-4.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(2.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.375000f, -1.150000f);
                                }, 260, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.375000f, -0.850000f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(1.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.375000f, -1.050000f);
                                }, 120, 0)
//                }, 100, 0)
                        )

                        .withFirstPersonPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.375000f, -1.150000f);
                                }, 210, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(3.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.375000f, -1.150000f);
                                }, 180, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(4.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.375000f, -1.150000f);
                                }, 240, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.G43GewehrAction.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0f, 0f, 0.9f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.G43GewehrAction.getRenderablePart(),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Magazines.G43GewehrMag,
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 2F, -0.15F);
                                    GlStateManager.rotate(-15F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.8F, -0.15F);
                                    GlStateManager.rotate(-15F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningUnloading(Magazines.G43GewehrMag,
//                    new Transition((renderContext) -> {
//                    }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.8F, -0.15F);
                                    GlStateManager.rotate(-15F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 2F, -0.15F);
                                    GlStateManager.rotate(-15F, 1f, 0f, 0f);
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.6f, 0.275000f, -1f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 0.650000f, -0.450000f);
                                }, 350, 600)
                        )

                        .withThirdPersonPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
//                        GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
//                        GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
//                        GlStateManager.rotate(65.000000f, 0f, 0f, 1f);
//                        GlStateManager.translate(0.150000f, 1.149999f, 0.175000f);
//                    }, 200, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2F, -2.5F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2F, -2.5F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2F, -2.5F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 240, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2F, -2.5F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 400, 150),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2F, -2.5F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 60),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2F, -2.5F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 120, 190),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2.7F, 3.6F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                    GlStateManager.rotate(12F, 0f, 0f, 1f);
                                }, 300, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 3.6F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(95F, 1f, 0f, 0f);
                                    GlStateManager.rotate(12F, 0f, 0f, 1f);
                                }, 120, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2.7F, 3.6F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                    GlStateManager.rotate(12F, 0f, 0f, 1f);
                                }, 120, 0)
//                }, 100, 0)
                        )

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(20F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.575000f, -1.150000f);
                                }, 120, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(25F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(8.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.475000f, -1.150000f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(30F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.375000f, -1.150000f);
                                }, 270, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(35F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.375000f, -1.150000f);
                                }, 190, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.375000f, -1.150000f);
                                }, 120, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.G43GewehrAction.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.9f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 130, 60),
                                new Transition((renderContext) -> { // Reload position
                                }, 110, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.31f, 0.19f, -0.8f);


                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.285f, 2.2f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.31f, 0.19f, -0.5f);
                            GlStateManager.rotate(-0.8F, 1f, 0f, 0f);


                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.285f, 2.1f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.rotate(12.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.175000f, 0.45f, -0.6f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.6f, 0.275000f, -1f);
                        })

                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.325000f, 0.425000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.550000f, -0.850000f, 0.125000f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.325000f, 0.425000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.550000f, -0.850000f, 0.125000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.525000f, 0.100000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.550000f, -0.850000f, 0.125000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.525000f, 0.275000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.525000f, 0.275000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.675000f, 0.325000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.275000f, -0.750000f, 0.200000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, -0.875000f, 0.125000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.800000f, -0.825000f, 0.125000f);
                                }, 300, 0))


                        .withFirstPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.550000f, -0.850000f, 0.125000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.550000f, -0.850000f, 0.125000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.550000f, -0.850000f, 0.125000f);
                                }, 260, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.550000f, -0.850000f, 0.125000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.550000f, -0.850000f, 0.125000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.550000f, -0.850000f, 0.125000f);
                                }, 280, 0))

                        .withFirstPersonLeftHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.675000f, 0.325000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.525000f, 0.275000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.525000f, 0.275000f);
                                }, 50, 200))


                        .withFirstPersonRightHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.550000f, -0.850000f, 0.125000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.550000f, -0.850000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.550000f, -0.850000f, 0.125000f);
                                }, 250, 50))

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.525000f, 0.100000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.450000f, 0.075000f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 50))

                        .withThirdPersonLeftHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GlStateManager.scale(3.5f, 3.5f, 3.5f);
//                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
//                        GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
//                        GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
//                        GlStateManager.translate(0.250000f, -0.175000f, 0.225000f);
//                    }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, -0.075000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, -0.075000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, -0.025000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, -0.025000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, -0.025000f);
                                }, 280, 0))

                        .withThirdPersonRightHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GlStateManager.scale(4f, 4f, 5f);
//                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
//                        GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
//                        GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
//                        GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
//                    }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-49.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(14.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.100000f);
                                }, 260, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, 0.050000f, 0.000000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.075000f, 0.025000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, 0.050000f, 0.000000f);
                                }, 300, 0))

                        .withFirstPersonLeftHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, -0.875000f, 0.125000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.800000f, -0.825000f, 0.125000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.325000f, 0.425000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.325000f, 0.425000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.325000f, 0.425000f);
                                }, 110, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.100000f, 0.075000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.200000f, 0.130000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.100000f, 0.075000f);
                                }, 280, 0))

                        .build())
                .withSpawnEntityDamage(13.5f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}

