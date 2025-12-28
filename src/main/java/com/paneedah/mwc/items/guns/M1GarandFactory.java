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

public class M1GarandFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("m1_garand")
                .withAmmoCapacity(8)
                .withFireRate(0.2f)
                .withRecoil(3.5f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.RIFLE)
                .withMaxShots(1)
                .withShootSound("m1garand")
//        .withSilencedShootSound("m4a1_silenced")
                .withReloadSound("m1garand_reload")
                .withEndOfShootSound("m1garandping")
//        .withInspectSound("m4a1_inspection")
//        .withDrawSound("m4_draw")
                .withReloadingTime(50)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.1f)
                .withShellCasingForwardOffset(0.05f)
                .withShellCasingVerticalOffset(-0.03f)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        3f, // x
                        2f, // y
                        6f) // z

                .withCompatibleBullet(Bullets.Bullet3006Springfield, (model) -> {})
                .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
                    if (model instanceof M4Iron1) {
                        GlStateManager.translate(0.162F, -1.75F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GlStateManager.translate(-0.055F, -1.35F, -4.05F);
//                GlStateManager.scale(0.8F, 0.68F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GlStateManager.translate(0.26F, -1.55F, -2.35F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron1) {
                        GlStateManager.translate(0.125F, -1.8F, -0.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GlStateManager.translate(0.13F, -1.55F, -3.05F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GlStateManager.translate(0.092F, -1.91F, -0.9F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof G36CIron1) {
                        GlStateManager.translate(-0.22F, -1.94F, 0.13F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof G36CIron2) {
                        GlStateManager.translate(-0.205F, -1.9F, -3.15F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof ScarIron1) {
                        GlStateManager.translate(0.165F, -1.65F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof ScarIron2) {
                        GlStateManager.translate(0.25F, -1.55F, -2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof FALIron) {
                        GlStateManager.translate(-0.153F, -1.245F, -6.15F);
                        GlStateManager.scale(0.3F, 0.3F, 1.2F);
                    } else if (model instanceof M14Iron) {
                        GlStateManager.translate(0.129F, -1.63F, -2.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M1GarandAction, true, (model) -> {
//        	GlStateManager.translate(0f, 0f, 0.44f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M1GarandMag, true, (model) -> {
//          GlStateManager.scale(0.5F, 0.5F, 0.5F);
                    GlStateManager.translate(-0.1f, 0f, 1f);
//          GlStateManager.rotate(-20F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Mk14EBRsight, true, (model) -> {
                    GlStateManager.translate(-0.125F, -1.075F, -0.85F);
                    GlStateManager.scale(0.11F, 0.11F, 0.11F);
                })
                .withTextureNames("M1Garand")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new M1Garand())
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
                            GlStateManager.translate(0, 0f, 3f);
                            GlStateManager.rotate(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.35F, 0.35F, 0.35F);
                            GlStateManager.translate(1, 2f, -1.2f);
                            GlStateManager.rotate(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GlStateManager.scale(0.6F, 0.6F, 0.6F);
                            GlStateManager.translate(-1.7F, -0.8F, 1.9F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                            GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.175000f, 1.050000f, 0.175000f);

//                GlStateManager.rotate(41F, 0f, 1f, 0f);
//                GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
//                GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
//                GlStateManager.rotate(1.000000f, 1f, 0f, 0f);
//                GlStateManager.translate(-0.175000f, 1.150000f, 0.2f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                            GlStateManager.rotate(13.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.175000f, 1.050000f, 0.475000f);
                            GlStateManager.rotate(-2F, 1f, 0f, 0f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.M1GarandAction.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GlStateManager.translate(0F, 0F, 0.44F);
                            }
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M1GarandAction.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, 0F, 0.44F);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M1GarandAction.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, 0F, 0.44F);
                        })

                        .withFirstPersonPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(12.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.14000f, 1.150000f, 0.135000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(9.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-3.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.175000f, 1.150000f, 0.25f);
                                }, 200, 30),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(1.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.175000f, 1.150000f, 0.2f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.175000f, 1.150000f, 0.2f);
                                }, 270, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(9.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.175000f, 1.150000f, 0.2f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(13.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.175000f, 1.150000f, 0.2f);
                                }, 220, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(12.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.175000f, 1.22000f, 0.22f);
                                }, 150, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(14.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.175000f, 1.220000f, 0.15f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(12.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.175000f, 1.10000f, 0.175000f);
                                }, 80, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M1GarandAction.getRenderablePart(),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.44F);
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.44f);
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.44f);
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.44f);
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.44f);
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.44f);
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.44f);
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 0.44f);
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 200)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M1GarandMag.getRenderablePart(),

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 200),

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 200),

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-1.8f, -1f, -3f);
                                    GlStateManager.rotate(-20F, 1f, 0f, 0f);
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-0.15f, -2.15f, -4.1f);
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-0.15f, -2.02f, -4.1f);
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-0.15f, -2.02f, -4.1f);
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-0.15f, -1.62f, -4.1f);
                                }, 250, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-0.15f, -1.62f, -4.1f);
                                }, 250, 200)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.8f, 0.6f, 0.3f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(50F, 0f, 1f, 0f);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(0.4f, 1.4f, -0.3f);
                                }, 350, 600)
                        )

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(2F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.375000f, 1.350000f, 0.375000f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(10F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.375000f, 1.250000f, 0.375000f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(25F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(18.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.275000f, 1.250000f, 0.25000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(35F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(3.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.175000f, 1.150000f, 0.175000f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.175000f, 1.050000f, 0.175000f);
                                }, 170, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.352f, 0.69f, 0.4f);

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.03f, 0.3f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.352f, 0.71f, 0.5f);
                            GlStateManager.rotate(-2F, 1f, 0f, 0f);

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.03f, 0.3f);
                            }

                            // Everything else
                            else {
                            }


                        })


                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.rotate(35F, 0f, 1f, 0f);
                            GlStateManager.scale(2.00000f, 2.00000f, 2.00000f);
                            GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                            GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                            GlStateManager.translate(-0.075000f, 1.050000f, 0.775000f);
                        })
                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.425000f, 0.700000f, 0.100000f);
                        })

                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.025000f, 0.275000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);

//                         GlStateManager.scale(3f, 3f, 3f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.025000f, 0.275000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.025000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.025000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.025000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.025000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.025000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.025000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.025000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.025000f, 0.275000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.025000f, 0.275000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.025000f, 0.275000f);
                                }, 250, 0))

                        .withFirstPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.425000f, 0.100000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.050000f, -0.000000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -0.250000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -0.250000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-85.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -0.300000f, 0.150000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.250000f, -0.150000f, 0.125000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 0))

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.350000f, 0.225000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.350000f, 0.225000f);
                                }, 250, 50)
                        )

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 50)
                        )

                        .withFirstPersonLeftHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.250000f, 0.225000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.250000f, 0.225000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.250000f, 0.225000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.250000f, 0.225000f);
                                }, 130, 60),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.250000f, 0.225000f);
                                }, 110, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 130, 60),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 110, 0)
                        )

                        .build())
                .withSpawnEntityDamage(15f)
                .withSpawnEntityGravityVelocity(0.0118f)


                .build(MWC.modContext);
    }
}
