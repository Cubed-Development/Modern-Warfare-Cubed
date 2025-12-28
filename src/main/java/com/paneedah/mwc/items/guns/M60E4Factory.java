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

public class M60E4Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("m60e4")
                .withFireRate(0.6f)
                .withRecoil(2f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.HEAVY)
                .withMaxShots(Integer.MAX_VALUE)
                //.withMaxShots(5)
                .withShootSound("m60")
                .withSilencedShootSound("ak15_silenced")
                .withReloadSound("m60_reload")
                .withUnloadSound("m60_unload")
                .withInspectSound("inspection")
                .withDrawSound("mg42_draw")
//        .withDrawSound("mg42_reload")
                .withReloadingTime(45)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.16f)
                .withInaccuracy(1f)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        2f, // x
                        1f, // y
                        6f) // z

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withCompatibleAttachment(Attachments.M60HandGuard, true, (model) -> {
//             GlStateManager.translate(0.01f, -0.19f, -0.4f);
//             GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.M60E4HandGuard, true, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(0.33F, 0.45F, 0.1F);
                        GlStateManager.scale(0.6F, 0.6F, 0.7F);
                        GlStateManager.rotate(90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail2) {
                        GlStateManager.translate(-0.25F, 0.63F, 0.1F);
                        GlStateManager.scale(0.6F, 0.6F, 0.7F);
                        GlStateManager.rotate(-90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail3) {
                        GlStateManager.translate(0.12F, 1.35F, -0.7F);
                        GlStateManager.scale(0.6F, 0.6F, 1.05F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    }
                })
                .withCompatibleAttachment(Attachments.M60FrontSight, true, (model) -> {
//           GlStateManager.translate(0.01f, -0.19f, -0.4f);
//           GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.M60Rail, (model) -> {
                    GlStateManager.translate(-0.073f, -0.12f, 2.9f);
                    GlStateManager.scale(0.78F, 0.83F, 0.6F);
                })
//        .withCompatibleAttachment(AuxiliaryAttachments.MG42action, true, (model) -> {
////            GlStateManager.translate(0F, 0F, 1F);
//        })
                .withCompatibleAttachment(AuxiliaryAttachments.M60Hatch, true, (model) -> {
//            GlStateManager.translate(0F, 2.9F, 1.6F);
//            GlStateManager.rotate(70F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M60Belt, true, (model) -> {
//            GlStateManager.translate(-0.5F, 0.4F, 0F);
                })
                .withCompatibleAttachment(Magazines.M60Mag, (model) -> {
//            GlStateManager.translate(0.3F, 0.1F, 0F);
//            GlStateManager.rotate(-15F, 0f, 0f, 1f);

//        	GlStateManager.translate(0.12F, -0.4F, 0F);
//        	GlStateManager.rotate(-2F, 0f, 1f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
                    if (model instanceof AKMiron1) {
                        GlStateManager.translate(0.125F, -1.8F, -0.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GlStateManager.translate(-0.183F, -1.32F, -5F);
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
                        GlStateManager.translate(0.06F, -0.15F, -2.32F);
                        GlStateManager.scale(0.15F, 0.3F, 0.8F);
                        GlStateManager.rotate(-180F, 0f, 0f, 1f);
                    } else if (model instanceof M14Iron) {
                        GlStateManager.translate(0.129F, -1.63F, -2.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GlStateManager.translate(-0.05F, -0.2F, 2.8F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.16F, -0.24F, 4F);
                    GlStateManager.scale(0.83F, 0.83F, 0.83F);
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GlStateManager.translate(-0.018F, -0.25F, 0.13F);
                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GlStateManager.translate(0.243F, -0.23F, 0.68f);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
                    GlStateManager.translate(-0.03F, 0.09F, 3.7F);
                    GlStateManager.scale(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GlStateManager.translate(0.095F, -0.015F, 3.3F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GlStateManager.translate(0.012F, -0.73F, 3.3F);
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
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GlStateManager.translate(0.1F, -0F, 3.3F);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.68F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(0.12F, -0.06F, 3.7F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(0.12F, -0.06F, 3.7F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GlStateManager.translate(0.12F, -0.06F, 3.3F);
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
                    GlStateManager.translate(-0.14F, -0.26F, 3.3F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(0.395F, -0.33F, -0.1F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(0.118F, -0.06F, 3.8F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GlStateManager.translate(0.118F, -0.06F, 3.8F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GlStateManager.translate(-0.02F, -0.25F, 3.8F);
                    GlStateManager.scale(0.38F, 0.38F, 0.38F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.02F, -0.25F, 3.8F);
                    GlStateManager.scale(0.38F, 0.38F, 0.38F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GlStateManager.translate(-0.05F, 1.75F, 0.4F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GlStateManager.translate(-0.05F, 1.75F, 0.4F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GlStateManager.translate(-0.05F, 1.85F, 0.4F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GlStateManager.translate(-0.05F, 1.75F, 0.4F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
//        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
//            GlStateManager.translate(-0.2F, -0.41F, -3.7F);
//            GlStateManager.scale(1F, 1F, 1F);
//        })
                .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
                    GlStateManager.translate(0.2F, 0.45F, 0F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                })
                .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
                    GlStateManager.translate(0.2F, 0.45F, 0F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                })
                .withTextureNames("m60")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new M60())
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
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
                            GlStateManager.translate(0F, 2.3F, -0F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2f, 2f, 2f);
                            GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.500000f, -0.200000f, -5.074998f);

//                GlStateManager.scale(2f, 2f, 2f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2f, 2f, 2f);
                            GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.500000f, -0.200000f, -4.674998f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M60Belt.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.5F, -0.1F, 0F);
                            GlStateManager.rotate(40F, 0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M60Belt.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.5F, -0.1F, 0F);
                            GlStateManager.rotate(40F, 0f, 0f, 1f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.M60Belt.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GlStateManager.translate(-0.5F, 0.4F, 0F);
                            }
                        })

                        .withFirstPersonPositioningReloading(

                                //hand grabs latch
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(23.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(21.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.100000f, -5.699997f);
                                }, 300, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(22.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(18.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.130000f, -5.699997f);
                                }, 80, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.200000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.200000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.50000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.130000f, -5.699997f);
                                }, 95, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(21.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(19.800000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.130000f, -5.699997f);
                                }, 105, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.700000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.900000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.130000f, -5.699997f);
                                }, 115, 0),

                                //hand opens latch
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(21.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(17.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.150000f, -5.699997f);
                                }, 220, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(14.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.14000f, -5.699997f);
                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(14.200000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(21.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(18.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.130000f, -5.699997f);
                                }, 95, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(14.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(21.200000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(19.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.130000f, -5.699997f);
                                }, 110, 0),

                                //gun movement to indicate character grabbing new magazine
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(21.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(28.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, -0.000000f, -5.729997f);
                                }, 360, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(20.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, -0.000000f, -5.699997f);
                                }, 120, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 10
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(18.100000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(32.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.000000f, -5.699997f);
                                }, 140, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(17.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(34.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.500000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, -0.000000f, -5.699997f);
                                }, 120, 0),

                                //magazine touches gun
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(34.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.000000f, -5.699997f);
                                }, 340, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(4.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(34.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(13.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.000000f, -5.699997f);
                                }, 90, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(5.200000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.000000f, -5.699997f);
                                }, 120, 0),

                                //left hand pushes magazine in

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(7.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(13.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.120000f, -5.699997f);
                                }, 120, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.07000f, -5.699997f);
                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(6.00000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(12.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.100000f, -5.699997f);
                                }, 90, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(34.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.8000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.100000f, -5.699997f);
                                }, 110, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(34.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(8.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.100000f, -5.699997f);
                                }, 140, 0),

                                //left hand grabs belt
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 22
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(41.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, -0.200000f, -5.599997f);
                                }, 350, 0),

                                //left hand drags belt
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 23
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(7.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(43.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, -0.200000f, -5.599997f);
                                }, 250, 0),

                                //left hand places belt
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 24
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(42.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, -0.200000f, -5.599997f);
                                }, 200, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 25
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(41.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, -0.200000f, -5.599997f);
                                }, 80, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 26
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, -0.200000f, -5.599997f);
                                }, 90, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 27
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, -0.200000f, -5.599997f);
                                }, 110, 0),

                                //left hand grabs latch

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(14.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(38.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, -0.04000f, -5.599997f);
                                }, 350, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(14.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(1.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, -0.00000f, -5.599997f);
                                }, 80, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(14.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, -0.00000f, -5.599997f);
                                }, 110, 0),

                                //left hand closes latch

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(17.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.200000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.1500f, -5.599997f);
                                }, 140, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(14.700000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(36.900000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(1.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.09000f, -5.599997f);
                                }, 80, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(15.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.50000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.10000f, -5.599997f);
                                }, 90, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(15.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.10000f, -5.599997f);
                                }, 110, 0),

                                //hand goes to action

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(38.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(4.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.020000f, -5.599997f);
                                }, 350, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(38.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(8.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.000000f, -5.599997f);
                                }, 60, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(38.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.000000f, -5.599997f);
                                }, 80, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(38.400000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(6.50000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.000000f, -5.599997f);
                                }, 100, 0),

                                //hand pulls action back

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(11.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.000000f, -5.359997f);
                                }, 140, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(36.900000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(9.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.000000f, -5.299997f);
                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.600000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.100000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.000000f, -5.369997f);
                                }, 90, 0),

                                //hand pushes action

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(38.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(4.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.000000f, -5.699997f);
                                }, 110, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(38.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(1.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.000000f, -5.599997f);
                                }, 80, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(38.400000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.50000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.000000f, -5.599997f);
                                }, 100, 0)

                                //44 transitions
                        )

                        .withFirstPersonPositioningUnloading(

                                //left hand grabs magazine
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(9.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(23.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.100000f, -5.699997f);
                                }, 400, 0),

                                // left hand pulls magazine out

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(12.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(23.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(23.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.120000f, -5.699997f);
                                }, 250, 0),

                                //left hand drops magazine
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(23.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(24.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.110000f, -5.699997f);
                                }, 300, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MG42action.getRenderablePart(),
                                //1
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                //2
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                //2
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                //3
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                //4
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //14
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //23
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //30
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0f, 0f, 1f);
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0f, 0f, 1f);
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0f, 0f, 1f);
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //37
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //37
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //37
                                }, 500, 1000)
                        )

                        .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.MG42action.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M60Hatch.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //5
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //14
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //27
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //40
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.M60Rail.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 2.9F, 1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M60Hatch.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M60Belt.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.75F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.5F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.95F, -0.15F, 0F);
                                    GlStateManager.rotate(70F, 0f, 0f, 1f);
                                    GlStateManager.rotate(2F, 0f, 1f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.95F, -0.3F, 0F);
                                    GlStateManager.rotate(70F, 0f, 0f, 1f);
                                    GlStateManager.rotate(1F, 0f, 1f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.9F, -0.2F, 0F);
                                    GlStateManager.rotate(70F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.9F, 0.2F, 0F);
                                    GlStateManager.rotate(70F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.9F, 0.2F, 0F);
                                    GlStateManager.rotate(70F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.9F, 0.2F, 0F);
                                    GlStateManager.rotate(70F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0.9F, 0.2F, 0F);
                                    GlStateManager.rotate(70F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.9F, 0.2F, 0F);
                                    GlStateManager.rotate(70F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //22
                                    GlStateManager.translate(0.9F, 0.2F, 0F);
                                    GlStateManager.rotate(70F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //23
                                    GlStateManager.translate(0.5F, -0.05F, 0F);
                                    GlStateManager.rotate(40F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //24
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //25
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //27
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //30
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //40
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M60Belt.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                        GlStateManager.translate(0.7F, 0.95F, 0F);
                                    } else {
                                        GlStateManager.translate(0F, 0F, 0F);
                                    }
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                        GlStateManager.translate(0.7F, 0.95F, 0F);
                                    } else {
                                        GlStateManager.translate(0.2F, -0.3F, 0F);
                                    }
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                        GlStateManager.translate(0.7F, 0.95F, 0F);
                                    } else {
                                        GlStateManager.translate(0.7F, 0.95F, 0F);
                                    }
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Magazines.M60Mag,

                                //hand grabs latch
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 300, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 60, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 300, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 60, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 70, 0),

                                //hand opens latch
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 220, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 50, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 65, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 80, 0),

                                //gun movement to indicate character grabbing new magazine
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 330, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 70, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 10
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 90, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 110, 0),

                                //magazine touches gun
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.05F, -0.4F, 0F);
                                    GlStateManager.rotate(2F, 0f, 1f, 0f);
                                }, 340, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.12F, -0.4F, 0F);
                                    GlStateManager.rotate(-2F, 0f, 1f, 0f);
                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.4F, 0F);
                                }, 90, 0),

                                //left hand pushes magazine in

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 120, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 60, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 80, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 100, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 100, 0),

                                //left hand grabs belt
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 250, 0),

                                //left hand drags belt
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 20
                                }, 200, 0),

                                //left hand places belt
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 20
                                }, 180, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 20
                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 20
                                }, 180, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 20
                                }, 70, 0),

                                //left hand grabs latch

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 300, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 90, 0),

                                //left hand closes latch

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 140, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 80, 0),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 90, 0),

                                //hand goes to action
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                //hand pulls action back
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 260, 100),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                //hand pushes action
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                }, 280, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                                //32 transitions
                        )

                        .withFirstPersonCustomPositioningUnloading(Magazines.M60Mag,

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {

                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4F, 0F);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0.3F, 0.9F, 0F);
                                    GlStateManager.rotate(-10F, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.NightRaider.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, -0.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.ACOG.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.Specter.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.Reflex.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.BijiaReflex.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.Holographic.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.HolographicAlt.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.EotechHybrid2.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.VortexRedux.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.Kobra.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.KobraGen3.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -1.6F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.MicroT1.getRenderablePart(),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.AimpointCompM5.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -1F, -2.8F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.MicroReflex.getRenderablePart(),


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.translate(0F, -0F, -3.3F);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.900000f, -0.500000f, -5.199997f);
                                }, 300, 600),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.200000f, -4.999998f);
                                }, 350, 600))

                        .withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.M60Belt.getRenderablePart(),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                        GlStateManager.translate(0.7F, 1.95F, 0F);
                                    } else {
                                        GlStateManager.translate(0F, 0F, 0F);
                                    }
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                        GlStateManager.translate(0.7F, 1.95F, 0F);
                                    } else {
                                        GlStateManager.translate(0F, 0F, 0F);
                                    }
                                }, 250, 1000))

//            .withThirdPersonPositioningReloading(
//                    //hand goes to action
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                        GlStateManager.translate(-2F, 0F, 3F);
//                        GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 430, 50),
//                    //hand pulls action back
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                        GlStateManager.translate(-2.4F, 0.5F, 3F);
//                        GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                        GlStateManager.rotate(100F, 1f, 0f, 0f);
//                    }, 200, 100),
//                    //hand pushes action
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                        GlStateManager.translate(-2F, 0F, 3F);
//                        GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 260, 10),
//                    //hand grabs latch
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                        GlStateManager.translate(-2.5F, 0F, 2.5F);
//                        GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 330, 0),
//                    //hand opens latch
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                        GlStateManager.translate(-2.5F, 0F, 2.5F);
//                        GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 280, 0),
//                    //left hand begins grabs magazine out
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                        GlStateManager.translate(-2.5F, 0F, 2.5F);
//                        GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 300, 100),
//                    //left hand drops magazine
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                        GlStateManager.translate(-2.5F, 0F, 2.5F);
//                        GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 340, 0),
//                    //gun movement to indicate character grabbing new magazine
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                        GlStateManager.translate(-2.5F, 0F, 2.5F);
//                        GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 530, 0),
//                //left hand moves magazine to position
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                    GlStateManager.translate(-2.5F, 0F, 2.5F);
//                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                    GlStateManager.rotate(90F, 1f, 0f, 0f);
//                }, 440, 10),
//                //left hand pushes magazine in
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                    GlStateManager.translate(-2.5F, 0F, 2.5F);
//                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                    GlStateManager.rotate(90F, 1f, 0f, 0f);
//                }, 240, 50),
//                //left hand grabs belt
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                    GlStateManager.translate(-2.5F, 0F, 2.5F);
//                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                    GlStateManager.rotate(90F, 1f, 0f, 0f);
//                }, 330, 0),
//                //left hand drags belt
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                    GlStateManager.translate(-2.5F, 0F, 2.5F);
//                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                    GlStateManager.rotate(90F, 1f, 0f, 0f);
//                }, 300, 0),
//              //left hand grabs latch
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                    GlStateManager.translate(-2.5F, 0F, 2.5F);
//                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                    GlStateManager.rotate(90F, 1f, 0f, 0f);
//                }, 350, 0),
//              //left hand closes latch
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                    GlStateManager.translate(-2.5F, 0F, 2.5F);
//                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                    GlStateManager.rotate(90F, 1f, 0f, 0f);
//                }, 300, 0),
//              //hand goes to action
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                    GlStateManager.translate(-2F, 0F, 3F);
//                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                    GlStateManager.rotate(90F, 1f, 0f, 0f);
//                }, 340, 0),
//                //hand pulls action back
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                    GlStateManager.translate(-2.4F, 0.5F, 3F);
//                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                    GlStateManager.rotate(100F, 1f, 0f, 0f);
//                }, 260, 100),
//                //hand pushes action
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
//                    GlStateManager.translate(-2F, 0F, 3F);
//                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
//                    GlStateManager.rotate(90F, 1f, 0f, 0f);
//                }, 280, 0)
//            )

//            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M60Hatch.getRenderablePart(),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0F, -2F, 0.1F);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0F, -2F, 0.1F);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0F, -2F, 0.1F);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0F, -2F, 0.1F);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0F, -2F, 0.1F);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0F, -2F, 0.1F);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0F, -2F, 0.1F);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0F, -2F, 0.1F);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0F, -2F, 0.1F);
//                        GlStateManager.rotate(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000)
//                        )
//
//            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M60Belt.getRenderablePart(),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0.45F, 0F, 0F);
//                    }, 500, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0.45F, 0F, 0F);
//                    }, 500, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0.45F, 0F, 0F);
//                    }, 500, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0.45F, 0F, 0F);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0.45F, 0F, 0F);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0.45F, 0F, 0F);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(1.6F, 3.5F, 0.5F);
//                        GlStateManager.rotate(10F, 0f, 0f, 1f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(1.6F, 3.5F, 0.5F);
//                        GlStateManager.rotate(10F, 0f, 0f, 1f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0.7F, 0F, 0F);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0.7F, 0F, 0F);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GlStateManager.translate(0.7F, 0F, 0F);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000)
//                        )


                        .withFirstPersonPositioningDrawing(
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(25.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.500000f, -0.200000f, -4.774998f);
                                }, 200, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(13.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(20.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.500000f, -0.200000f, -4.774998f);
                                }, 230, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.500000f, -0.200000f, -4.774998f);
                                }, 300, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.500000f, -0.200000f, -4.774998f);
                                }, 250, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-3.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.500000f, -0.200000f, -4.874998f);
                                }, 230, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.500000f, -0.200000f, -4.704998f);
                                }, 180, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, -0.200000f, -4.774998f);
                                }, 180, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.M60Belt.getRenderablePart(),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                        GlStateManager.translate(0.7F, 1.95F, 0F);
                                    } else {
                                        GlStateManager.translate(0F, 0F, 0F);
                                    }
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                        GlStateManager.translate(0.7F, 1.95F, 0F);
                                    } else {
                                        GlStateManager.translate(0F, 0F, 0F);
                                    }
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                        GlStateManager.translate(0.7F, 1.95F, 0F);
                                    } else {
                                        GlStateManager.translate(0F, 0F, 0F);
                                    }
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                        GlStateManager.translate(0.7F, 1.95F, 0F);
                                    } else {
                                        GlStateManager.translate(0F, 0F, 0F);
                                    }
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                        GlStateManager.translate(0.7F, 1.95F, 0F);
                                    } else {
                                        GlStateManager.translate(0F, 0F, 0F);
                                    }
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                        GlStateManager.translate(0.7F, 1.95F, 0F);
                                    } else {
                                        GlStateManager.translate(0F, 0F, 0F);
                                    }
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                        GlStateManager.translate(0.7F, 1.95F, 0F);
                                    } else {
                                        GlStateManager.translate(0F, 0F, 0F);
                                    }
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.19f, -0.28f, -4.7f);
                            GlStateManager.rotate(-0.55F, 1f, 0f, 0f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.06f, -0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.14f, 0.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.1f, 0.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.1f, 0.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.015f, 0.4f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.05f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.08f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.05f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.09f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.09f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.07f, 0.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.12f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.08f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.08f, 0f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.19f, -0.28f, -4.3f);
                            GlStateManager.rotate(-0.55F, 1f, 0f, 0f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.06f, -0.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.14f, -0.05f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.1f, 0.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.1f, 0.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.015f, 0.15f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.05f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.08f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.05f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.09f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.09f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.07f, -0.1f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.12f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.08f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.08f, 0f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.rotate(40F, 0f, 1f, 0f);
                            GlStateManager.scale(2f, 2f, 2f);
                            GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                            GlStateManager.rotate(5f, 1f, 0f, 0f);
                            GlStateManager.translate(-0.500000f, 0f, -4.774998f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(2f, 2f, 2f);
                            GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.950000f, -0.725000f, -5.125000f);
                        })

                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);

//                         GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(


                                //hand grabs latch
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(95.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.649999f, -0.650000f, 0.125000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(95.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.649999f, -0.650000f, 0.125000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(95.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.649999f, -0.650000f, 0.125000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(95.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.649999f, -0.650000f, 0.125000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(95.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.649999f, -0.650000f, 0.125000f);
                                }, 250, 1000),
                                //hand opens latch
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.850000f, -0.675000f, -0.575000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.850000f, -0.675000f, -0.575000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.850000f, -0.675000f, -0.575000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.850000f, -0.675000f, -0.575000f);
                                }, 250, 1000),
                                //hand grabs magazine

                                //hand stays down there
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.550000f, 0.925000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.550000f, 0.925000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.550000f, 0.925000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.550000f, 0.925000f);
                                }, 250, 1000),

                                // magazine touches gun

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.375000f, -1.624999f, 0.050000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, -1.599999f, -0.100000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.350000f, -1.624999f, -0.025000f);
                                }, 250, 1000),

                                //hand pushes in magazine

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, -1.624999f, -0.025000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, -1.624999f, -0.025000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, -1.624999f, -0.025000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, -1.624999f, -0.025000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, -1.624999f, -0.025000f);
                                }, 250, 1000),

                                //hand grabs belt

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.705000f, -1.464999f, 0.340000f);
                                }, 250, 1000),

                                //hand drags belt

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.645000f, -1.474999f, 0.190000f);
                                }, 250, 1000),

                                //hand places belt

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.785000f, -1.324999f, 0.440000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.785000f, -1.324999f, 0.440000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.785000f, -1.324999f, 0.440000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.785000f, -1.324999f, 0.440000f);
                                }, 250, 1000),

                                //hand grabs latch

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.850000f, -0.675000f, -0.575000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.850000f, -0.675000f, -0.575000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.850000f, -0.675000f, -0.575000f);
                                }, 250, 1000),

                                //hand closes latch
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(95.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.649999f, -0.650000f, 0.125000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(95.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.649999f, -0.650000f, 0.125000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(95.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.649999f, -0.650000f, 0.125000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(95.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.649999f, -0.650000f, 0.125000f);
                                }, 250, 1000),

                                // right hand goes to action

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //30
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //30
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //30
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //30
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 250, 1000),

                                // right hand pulls action

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 250, 1000),

                                // right hand pushes action

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 250, 1000))

                        .withFirstPersonRightHandPositioningReloading(


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),

                                // right hand goes to action

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -1.400000f, 0.200000f);
                                }, 500, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -1.400000f, 0.200000f);
                                }, 500, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -1.400000f, 0.200000f);
                                }, 500, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -1.400000f, 0.200000f);
                                }, 500, 1000),

                                //hand pulls action

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.440000f, -1.640000f, 0.190000f);
                                }, 500, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.440000f, -1.640000f, 0.190000f);
                                }, 500, 1000),

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.440000f, -1.640000f, 0.190000f);
                                }, 500, 1000),

                                //hand pushes action

                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -1.400000f, 0.200000f);
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -1.400000f, 0.200000f);
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -1.400000f, 0.200000f);
                                }, 500, 1000))

                        .withFirstPersonLeftHandPositioningUnloading(


                                //hand grabs magazine
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, -1.624999f, -0.025000f);
                                }, 250, 1000),
                                //hand grabs magazine
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.350000f, -1.624999f, -0.025000f);
                                }, 250, 1000),
                                //hand drops magazine
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.550000f, 0.925000f);
                                }, 250, 1000))

                        .withFirstPersonRightHandPositioningUnloading(


                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 1000))

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 250, 50),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 50),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.790000f, -1.435000f, 0.710000f);
                                }, 250, 50))

                        .withThirdPersonLeftHandPositioningReloading(
                                //does nothing
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 500, 1000),
                                //does nothing
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 500, 1000),
                                //does nothing
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 500, 1000),
                                //hand grabs latch
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.075000f, 0.100000f);
                                }, 250, 1000),
                                //hand opens latch
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.100000f, 0.200000f);
                                }, 250, 1000),
                                //hand grabs magazine
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.100000f, 0.075000f);
                                }, 250, 1000),
                                //hand drops magazine
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, 0.025000f, 0.025000f);
                                }, 250, 1000),
                                //hand stays down there
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, 0.025000f, 0.025000f);
                                }, 250, 1000),
                                //hand pulls up new magazine
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.075000f, 0.100000f);
                                }, 250, 1000),
                                //hand pushes in magazine
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.075000f, 0.100000f);
                                }, 250, 1000),
                                //hand grabs belt
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.025000f, 0.125000f);
                                }, 250, 1000),
                                //hand drags belt
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.050000f, 0.150000f);
                                }, 250, 1000),
                                //hand grabs latch
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.100000f, 0.200000f);
                                }, 250, 1000),
                                //hand closes latch
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.075000f, 0.100000f);
                                }, 250, 1000),
                                //hand lifts up
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 250, 1000),
                                //hand smacks latch
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 250, 1000))

                        .withThirdPersonRightHandPositioningReloading(
                                //hand grabs action
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.100000f, 0.050000f);
                                }, 500, 1000),
                                //hand pulls action
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.175000f, 0.050000f);
                                }, 500, 1000),
                                //hand pushes action
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.100000f, 0.050000f);
                                }, 500, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 500, 1000),
                                //hand pulls action
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.175000f, 0.050000f);
                                }, 500, 1000),
                                //hand pushes action
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.100000f, 0.050000f);
                                }, 500, 1000))

                        .withFirstPersonLeftHandPositioningDrawing(
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 150, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 130, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 200, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 200, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 130, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 200, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -1.100000f, 0.275000f);
                                }, 200, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 150, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 130, 0),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 250, 100),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 250, 100),
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 500, 1000),
                                //hand pulls action
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 500, 1000),
                                //hand pushes action
                                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 500, 1000)
                        )

                        .build())
                .withSpawnEntityDamage(10f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}

