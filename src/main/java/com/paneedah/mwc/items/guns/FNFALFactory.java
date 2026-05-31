package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;

public class FNFALFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("fnfal")
                .withFireRate(0.6f)
                .withRecoil(5f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.DMR)
                .withMuzzlePosition(new Vec3d(-0.13600000405311594, -0.9239999977350232, -8.896000071406363))
                .withMaxShots(1, Integer.MAX_VALUE)
                //.withMaxShots(5)
                .withShootSound("fnfal")
                .withSilencedShootSound("ak15_silenced")
                .withReloadSound("fnfal_reload")
                .withUnloadSound("fnfal_unload")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(45)
                .withFlashIntensity(0.6f)
                .withFlashScale(() -> 0.5f)
                .withFlashOffsetX(() -> 0.09f)
                .withFlashOffsetY(() -> 0.11f)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        // The weapon power
                        15.0,
                        // Muzzle climb divisor
                        15.75,
                        // "Stock Length"
                        50.0,
                        // Recovery rate from initial shot
                        0.4,
                        // Recovery rate @ "stock"
                        0.3125,
                        // Recoil rotation (Y)
                        0.0,
                        // Recoil rotation (Z)
                        0.0,
                        // Ads similarity divisor
                        1.0
                ))


                .withScreenShaking(RenderableState.SHOOTING,
                        2f, // x
                        1f, // y
                        4.5f) // z

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)

                .withCompatibleAttachment(Attachments.FNFALDustCover, true, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.SA58DustCover, (model) -> {
                    if (model instanceof SA58DustCover) {
//                GlStateManager.scale(1F, 0.98F, 1);
                    } else if (model instanceof AKRail) {
                        GlStateManager.translate(-0.21F, -1.43F, -2.43f);
                        GlStateManager.scale(0.65F, 0.8F, 1F);
                    }
                })
                .withCompatibleAttachment(Attachments.FNFALHandguard, true, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.FNFALPARAHandguard, (model) -> {
                    if (model instanceof FNFALPARAHandguard) {
//                GlStateManager.scale(1F, 0.98F, 1);
                    } else if (model instanceof AKRail) {
                        GlStateManager.translate(-0.03F, -0.75F, -4.8f);
                        GlStateManager.scale(0.65F, 0.8F, 0.8F);
                        GlStateManager.rotate(180.000000f, 0f, 0f, 1f);
                    }
                })
                .withCompatibleAttachment(Attachments.FNFALStock, true, (model) -> {
//            GlStateManager.translate(0.02f, 0.2f, -0.2f);
//            GlStateManager.scale(1.2F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Attachments.FNFALGrip, true, (model) -> {
//            GlStateManager.translate(0.02f, 0.2f, -0.4f);
//            GlStateManager.scale(1.2F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
                    if (model instanceof AKMiron1) {
                        GlStateManager.translate(0.125F, -1.8F, -0.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GlStateManager.translate(-0.185F, -1.32F, -5.95F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GlStateManager.translate(-0.25F, -1.65F, -3.05F);
                        GlStateManager.scale(0F, 0F, 0F);
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
                        GlStateManager.translate(0.48F, -0.56F, 2.19F);
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
                        GlStateManager.translate(-0.215F, -1.51F, -5.8F);
                        GlStateManager.scale(0.8F, 0.8F, 1.5F);
                    } else if (model instanceof M14Iron) {
                        GlStateManager.translate(0.129F, -1.63F, -2.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(AuxiliaryAttachments.FNFALAction, true, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.FNFALActionLever, true, (model) -> {
//          GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Magazines.FNFALMag, (model) -> {
//        	GlStateManager.rotate(35.000000f, 1f, 0f, 0f);
//        	GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
//            GlStateManager.translate(0.9f, 3.8f, -3.5f);
                })
                .withCompatibleAttachment(Attachments.FNFALRearSights, true, (model) -> {
                    GlStateManager.scale(0.3F, 0.3F, 0.3F);
                    GlStateManager.translate(-0.525f, -4.95f, 0.3f);
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GlStateManager.translate(-0.21F, -1.5F, -2F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.295F, -1.52F, -0.7F);
                    GlStateManager.scale(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GlStateManager.translate(-0.018F, -0.25F, 0.13F);
                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GlStateManager.translate(0.243F, -0.23F, 0.68f);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })

                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
                    GlStateManager.translate(-0.155F, -1.35F, -1.6F);
                    GlStateManager.scale(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.076F, -0.67F, 4.0251F);
                        GlStateManager.scale(0.04F, 0.04F, 0.04F);
                    }
                })

                .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
                    GlStateManager.translate(-0.185F, -1.22F, -1F);
                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GlStateManager.translate(-0.15F, -2.05F, -1F);
                    GlStateManager.scale(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.08F, 0.97F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    } else if (model instanceof SightMount) {
                        //        	GlStateManager.translate(-0.15F, -1.82F, -1F);
                        //            GlStateManager.scale(0.4F, 0.4F, 0.4F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GlStateManager.translate(-0.177F, -1.52F, -1.2F);
                    GlStateManager.scale(0.36F, 0.36F, 0.36F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.177F, -1.52F, -1.2F);
                    GlStateManager.scale(0.36F, 0.36F, 0.36F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GlStateManager.translate(-0.065F, -1.34F, -1.2F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GlStateManager.translate(-0.066F, -1.32F, -1.2F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.68F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(-0.042F, -1.38F, -1.2F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(-0.042F, -1.38F, -1.2F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GlStateManager.translate(-0.042F, -1.38F, -1.2F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof EotechScopeRing) {
                        GlStateManager.translate(-0.2F, -0.41F, 1.8F);
                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
                    }
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.118F, -0.535F, 1.9F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    }
                })

                .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
                    GlStateManager.translate(-0.3F, -1.55F, -1.3F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(0.395F, -0.33F, -0.1F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(-0.044F, -1.39F, -1F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GlStateManager.translate(-0.044F, -1.39F, -1F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GlStateManager.translate(-0.2F, -0.32F, -4F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GlStateManager.translate(-0.2F, -0.32F, -3.5F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.32F, -3.5F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.28F, -3.5F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.32F, -3.5F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Silencer762x51, (model) -> {
                    GlStateManager.translate(-0.2F, -1.18F, -9F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withTextureNames("fnfal")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new FNFAL())
                        .withActionPiece(AuxiliaryAttachments.FNFALAction)
                        .withActionTransform(new Transform().withPosition(0, 0, 1))
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
                            GlStateManager.scale(0.45F, 0.45F, 0.45F);
                            GlStateManager.translate(-2.1F, -1.1F, 2.2F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.225000f, 4.065000f, -2.845000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                        .withScale(3, 3, 3)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.210000f, 0.105000f, -0.820000f)
                                        .withBBRotation(-7.1415F, -27.3003F, 52.6433F)
                                        .withScale(2.8F, 2.8F, 4)
                                        .withPivotPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.200000f, 0.180000f, 1.640000f)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3, 3, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("fnfal", AuxiliaryAttachments.FNFALActionLever)
                        .setupModernMagazineAnimations("fnfal",
                                Magazines.FNFALMag)

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
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 240, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 400, 150),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 60),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
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


                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.FNFALAction.getRenderablePart(),
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
                                    GlStateManager.translate(0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.145f, 1.03f, -0.5f);


                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.15f, 0.6f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(-0.003F, 0.17f, 0.8f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(-0.003F, 0.12f, 0.35f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(-0.003F, 0.09f, 0.8f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.185f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.14f, 0.9f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.14f, 0.9f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.14f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.11f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.19f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.19f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(-0.003F, 0.18f, 0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.19f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.2f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.2f, 0.7f);
                            }

                            // Everything else
                            else {
                            }

                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.905000f, 4.065000f, -3.645000f)
                                    .withRotation(0.000000f, -30.514396f, -26.062789f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.425000f, 3.545000f, -5.685000f)
                                    .withRotation(-0.187566f, -46.164037f, -11.869230f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(1.730000f, 0.065000f, -0.980000f)
                                            .withRotation(93.414678f, 23.699100f, 15.553163f)
                                            .withScale(2.6F, 2.6F, 4)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.2F, 0.1F, 2)
                                            .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withPivotPoint(0, 0, 0)
                                            .applyTransformations();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.450000f, -0.335000f, -0.660000f)
                                            .withRotation(93.766422f, 50.841130f, 4.679372f)
                                            .withScale(2.600000f, 2.600000f, 4.000000f)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.600000f, 0.340000f, 1.880000f)
                                            .withRotation(-12.193518f, -4.780500f, 1.399459f)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                })

                        .withThirdPersonLeftHandPositioningReloading(
//                   new Transition((renderContext) -> { // Reload position
//                       GlStateManager.scale(3.5f, 3.5f, 3.5f);
//                       GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
//                       GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
//                       GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
//                       GlStateManager.translate(0.250000f, -0.175000f, 0.225000f);
//                   }, 50, 200),
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
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
                                }, 280, 0))

                        .withThirdPersonRightHandPositioningReloading(
//                   new Transition((renderContext) -> { // Reload position
//                       GlStateManager.scale(4f, 4f, 5f);
//                       GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
//                       GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
//                       GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
//                       GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
//                   }, 250, 1000),
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

                        .build())
                .withSpawnEntityDamage(10f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}

