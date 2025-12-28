package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class M32MGLFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("m32_mgl")
//      .withCapacity(CommonProxy.AR15Mag)
                .withAmmoCapacity(6)
                .withFireRate(0.16f)
                .withIteratedLoad()
                .withRecoil(6f)
                .withZoom(0.8f)
                .withMaxShots(1)
                .withShootSound("m32")
                .withPumpTimeout(950)
                //.withSilencedShootSound("AR15silenced")
                .withReloadSound("krag_chamberopen")
                .withAllReloadIterationsCompletedSound("krag_chamberclosed")
                .withReloadIterationSound("loadbullet")
                .withDrawSound("noaction_draw")
//       .withReloadSound("drawweapon")
//        .withReloadIterationSound("loadshell")
                .withReloadingTime(1000)
                .withFlashIntensity(0f)
                .withFlashScale(() -> 0f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.101f)
                .withShellCasingEjectEnabled(false)
                .withDestroyingBlocks(false)

                .withScreenShaking(RenderableState.SHOOTING,
                        4f, // x
                        3f, // y
                        2f) // z

                .withCreativeTab(MWC.WEAPONS_TAB)

                .withCompatibleAttachment(Bullets.Grenade40mm, (model) -> {})
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.M32Barrel, (model) -> {
                    GlStateManager.translate(-0.12f, -0.39f, -7.6f);
                    GlStateManager.scale(2F, 2F, 1F);
                })
                .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
                    GlStateManager.translate(0.21f, 0.7f, -0.1f);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Attachments.MagpulCTRStock, (model) -> {
                    GlStateManager.translate(0.21f, 0.7f, -0.1f);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Attachments.MilSpecStock, true, (model) -> {
                    GlStateManager.translate(0.21f, 0.7f, -0.1f);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Attachments.HK416Stock, (model) -> {
                    GlStateManager.translate(0.21f, 0.7f, -0.1f);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Attachments.MagpulCTRStockTan, (model) -> {
                    GlStateManager.translate(0.21f, 0.7f, -0.1f);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Attachments.MilSpecStockTan, (model) -> {
                    GlStateManager.translate(0.21f, 0.7f, -0.1f);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Attachments.HK416StockTan, (model) -> {
                    GlStateManager.translate(0.21f, 0.7f, -0.1f);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M32Cartridge, true, (model) -> {
//            GlStateManager.translate(-0.2F, 0.1f, 0F);
//            GlStateManager.rotate(-20F, 0f, 0f, 1f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M32Main1B, true, (model) -> {
                    if (model instanceof M32Main1B) {
                    } else if (model instanceof Suppressor) {
                        GlStateManager.translate(-0.05F, -0.6f, -0.05F);
                        GlStateManager.scale(1.1F, 1.1F, 0.3F);
                        GlStateManager.rotate(-1F, 1f, 0f, 0f);
                    }
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(0.17F, 0.5F, -5.6f);
                        GlStateManager.scale(1F, 1F, 0.65F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail2) {
                        GlStateManager.translate(0.55F, -0.22F, -5.6f);
                        GlStateManager.scale(1F, 1F, 0.85F);
                        GlStateManager.rotate(90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail3) {
                        GlStateManager.translate(-0.45F, 0.05F, -5.6f);
                        GlStateManager.scale(1F, 1F, 0.85F);
                        GlStateManager.rotate(-90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail4) {
                        GlStateManager.translate(-0.08F, -1.07F, -2.24f);
                        GlStateManager.scale(0.8F, 0.7F, 0.4F);
                    } else if (model instanceof AKRail5) {
                        GlStateManager.translate(-0.1F, -0.6F, -5.2f);
                        GlStateManager.scale(1F, 1F, 0.7F);
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GlStateManager.translate(-0.08F, -1.2F, -2.8F);
                    GlStateManager.scale(0.95F, 0.95F, 0.95F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.21F, -1.18F, -1.1F);
                    GlStateManager.scale(1F, 1F, 1F);
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
                    GlStateManager.translate(-0.06F, -0.8F, -1.8F);
                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GlStateManager.translate(0.1F, -0.95F, -2F);
                    GlStateManager.scale(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GlStateManager.translate(0.1F, -0.95F, -2F);
                    GlStateManager.scale(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.68F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(0.13F, -1F, -1.75F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(0.13F, -1F, -1.75F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GlStateManager.translate(0.13F, -1F, -1.75F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
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
//        .withCompatibleAttachment(Attachments.Vortex, (player, stack) -> {
//                GlStateManager.translate(-0.16F, -1.28F, -2.2F);
//                GlStateManager.scale(0.5F, 0.5F, 0.6F);
//            },(model) -> {
//                if(model instanceof Holo2) {
//                    GlStateManager.translate(0.395F, -0.33F, -0.1F);
//                    GlStateManager.scale(0.15F, 0.15F, 0.15F);
//                }
//            })
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(0.13F, -1F, -1.6F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GlStateManager.translate(-0.04F, -1.2F, -1.6F);
                    GlStateManager.scale(0.48F, 0.48F, 0.48F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.04F, -1.2F, -1.6F);
                    GlStateManager.scale(0.48F, 0.48F, 0.48F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
                    GlStateManager.translate(-0.03F, -1.2F, -1.6F);
                    GlStateManager.scale(0.38F, 0.38F, 0.38F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.15F, -0.03F, -1.5F);
                        GlStateManager.scale(0.3F, 0.3F, 0.3F);
                    }
                })
                .withCompatibleAttachment(Attachments.M2A1sight, (model) -> {
                    if (model instanceof M2A1) {
                        GlStateManager.translate(-0.075F, -1.25F, -2.2F);
                        GlStateManager.scale(0.75F, 0.75F, 0.75F);
                    } else if (model instanceof M2A1reticle) {
                        GlStateManager.translate(0.04F, -1.485F, -1.07F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GlStateManager.translate(-0.2F, -0F, -2.1F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0F, -2.1F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0F, -2.1F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GlStateManager.translate(-0.2F, -0F, -2.1F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
                    GlStateManager.translate(0.05F, -0.8F, -2.85F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                })
                .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
                    GlStateManager.translate(0.05F, -0.8F, -2.85F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                })
                .withTextureNames("gun")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new M32())
                        .withPrepareFirstLoadIterationAnimationDuration(1800)
                        .withAllLoadIterationAnimationsCompletedDuration(1400)
                        //.withTextureName("M4A1")
                        //.withWeaponProximity(0.99F)
                        //.withYOffsetZoom(5F)
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.3F, 0.3F, 0.3F);
                            GlStateManager.rotate(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.35F, 0.35F, 0.35F);
                            GlStateManager.translate(1, 2f, -1.2f);
                            GlStateManager.rotate(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GlStateManager.scale(0.4F, 0.4F, 0.4F);
                            GlStateManager.translate(-1.4F, -0.8F, 1.4F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(-3F, 1f, 0f, 0f);
                            GlStateManager.rotate(4F, 0f, 0f, 1f);
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.translate(-0.900000f, 0.715000f, -1.374999f);

//                GlStateManager.rotate(45F, 0f, 1f, 0f);
//                GlStateManager.rotate(-3F, 1f, 0f, 0f);
//                GlStateManager.rotate(4F, 0f, 0f, 1f);
//                GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
//                GlStateManager.translate(-0.900000f, 0.715000f, -3.174999f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(-2F, 1f, 0f, 0f);
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.translate(-0.900000f, 0.675000f, -1f);
                            GlStateManager.rotate(-2F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
                            GlStateManager.rotate(40F, 0f, 1f, 0f);
                            GlStateManager.rotate(-2F, 1f, 0f, 0f);
                            GlStateManager.rotate(-18F, 0f, 0f, 1f);
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.translate(-0.700000f, 0.825000f, -1.174999f);
                        })


                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.M32Cartridge.getRenderablePart(), (renderContext) -> {
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M32Cartridge.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(-0.2F, 0.1f, 0F);
                            GlStateManager.rotate(-20F, 0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M32Cartridge.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(-0.2F, 0.1f, 0F);
                            GlStateManager.rotate(-20F, 0f, 0f, 1f);
                        })

                        .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.M32Main1B.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(-0.67F, -0.43f, 0F);
                            GlStateManager.rotate(60F, 0f, 0f, 1f);
                        })

                        .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.CollapsableMOEStock.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(-0.67F, -0.43f, 0F);
                            GlStateManager.rotate(60F, 0f, 0f, 1f);
                        })

                        .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.MagpulCTRStock.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(-0.67F, -0.43f, 0F);
                            GlStateManager.rotate(60F, 0f, 0f, 1f);
                        })

                        .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.MilSpecStock.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(-0.67F, -0.43f, 0F);
                            GlStateManager.rotate(60F, 0f, 0f, 1f);
                        })

                        .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.HK416Stock.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(-0.67F, -0.43f, 0F);
                            GlStateManager.rotate(60F, 0f, 0f, 1f);
                        })

                        .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.MagpulCTRStockTan.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(-0.67F, -0.43f, 0F);
                            GlStateManager.rotate(60F, 0f, 0f, 1f);
                        })

                        .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.MilSpecStockTan.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(-0.67F, -0.43f, 0F);
                            GlStateManager.rotate(60F, 0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-1F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.900000f, 0.685000f, -1.174999f);
                                }, 400, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.rotate(2F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.900000f, 0.685000f, -1.174999f);
                                }, 430, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-4F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.900000f, 0.715000f, -1.174999f);
                                }, 200, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(38F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-8F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-1.000000f, 1.115000f, -0.074999f);
                                }, 320, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(37F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-12F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-1.200000f, 1.315000f, 0.574999f);
                                }, 260, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41.5F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-14F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.700000f, 0.765000f, -1.174999f);
                                }, 510, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-16F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.700000f, 0.795000f, -1.174999f);
                                }, 290, 170),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-18F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.700000f, 0.825000f, -1.174999f);
                                }, 170, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M32Cartridge.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
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

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M32Main1B.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.CollapsableMOEStock.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.MagpulCTRStock.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.MilSpecStock.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.HK416Stock.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.MagpulCTRStockTan.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.MilSpecStockTan.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.HK416StockTan.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningLoadIteration(
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-18F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.700000f, 0.825000f, -1.174999f);
                                }, 100, 20),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-1F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-18F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.700000f, 0.825000f, -1.144999f);
                                }, 130, 20),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(39F, 0f, 1f, 0f);
                                    GlStateManager.rotate(0F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-18F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.700000f, 0.825000f, -1.204999f);
                                }, 160, 20),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-1F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-18F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.700000f, 0.825000f, -1.134999f);
                                }, 130, 0),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-18F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.700000f, 0.825000f, -1.174999f);
                                }, 150, 20))

                        .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.M32Cartridge.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.2F, 0.07f, 0F);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.2F, 0.07f, 0F);
                                    GlStateManager.rotate(30F, 0f, 0f, 1f);
                                }, 250, 50))

                        .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.M32Main1B.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50))

                        .withFirstPersonCustomPositioningLoadIteration(Attachments.CollapsableMOEStock.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50))

                        .withFirstPersonCustomPositioningLoadIteration(Attachments.MagpulCTRStock.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50))

                        .withFirstPersonCustomPositioningLoadIteration(Attachments.MilSpecStock.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50))

                        .withFirstPersonCustomPositioningLoadIteration(Attachments.HK416Stock.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50))

                        .withFirstPersonCustomPositioningLoadIteration(Attachments.MagpulCTRStockTan.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50))

                        .withFirstPersonCustomPositioningLoadIteration(Attachments.MilSpecStockTan.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50))

                        .withFirstPersonCustomPositioningLoadIteration(Attachments.HK416StockTan.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.67F, -0.43f, 0F);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                }, 250, 50))

                        .withFirstPersonPositioningAllLoadIterationsCompleted(
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.rotate(2F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-18F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.700000f, 0.825000f, -1.174999f);
                                }, 250, 0),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.rotate(0F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.700000f, 0.825000f, -1.374999f);
                                }, 250, 0),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4F, 1f, 0f, 0f);
                                    GlStateManager.rotate(2F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.900000f, 0.825000f, -1.674999f);
                                }, 200, 0),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.rotate(4F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.900000f, 0.725000f, -1.374999f);
                                }, 140, 0))

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1f, 0.8f, -0.5f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 1.4f, -0.8f);
                                }, 350, 600)
                        )

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(20F, 1f, 0f, 0f);
                                    GlStateManager.rotate(4F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.900000f, 0.715000f, -1.374999f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10F, 1f, 0f, 0f);
                                    GlStateManager.rotate(4F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.900000f, 0.715000f, -1.574999f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(2F, 1f, 0f, 0f);
                                    GlStateManager.rotate(5F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.900000f, 0.715000f, -1.574999f);
                                }, 180, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                                    GlStateManager.rotate(7F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.900000f, 0.715000f, -1.674999f);
                                }, 160, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                                    GlStateManager.rotate(2F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.900000f, 0.715000f, -1.374999f);
                                }, 140, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.20000f, 0.6f, -1.1f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.M2A1sight)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.26f, 1.6f);
                            }
                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.28f, 1.4f);
                            }
                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.28f, 1.4f);
                            }
                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.28f, 1.5f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.21f, 1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.21f, 1f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.25f, 1f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.25f, 1f);
                            }

//             // Holo Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Holo");
//                    GlStateManager.translate(0F, 0.32f, 1f);
//                } 

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.24f, 1.3f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.24f, 1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.26f, 1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.26f, 1f);
                            }

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.1f, 1f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.20000f, 0.6f, -0.9f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.M2A1sight)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.26f, 1.6f);
                            }
                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.28f, 1.4f);
                            }
                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.28f, 1.4f);
                            }
                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.28f, 1.5f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.21f, 1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.21f, 1f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.25f, 1f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.25f, 1f);
                            }

//             // Holo Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Holo");
//                    GlStateManager.translate(0F, 0.32f, 1f);
//                } 

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.24f, 1.3f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.24f, 1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.26f, 1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.26f, 1f);
                            }

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.1f, 1f);
                            }

                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.rotate(39F, 0f, 1f, 0f);
                            GlStateManager.rotate(4F, 1f, 0f, 0f);
                            GlStateManager.rotate(20F, 0f, 0f, 1f);
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.translate(-0.700000f, 1.215000f, -1.074999f);
                        })
                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-2f, 0.500000f, -0.5f);
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-2f, 0.000000f, -2.0f);
                        })
                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.275000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                })
                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.750000f, 0.000000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                })
                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.700000f, -0.025000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                })
                        .withFirstPersonHandPositioningLoadIterationCompleted(
                                (renderContext) -> {
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 0.025000f, 0.275000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.275000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.275000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.675000f, 0.250000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.675000f, 0.250000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.675000f, 0.250000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.675000f, 0.250000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 0.025000f, 0.275000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 0.025000f, 0.275000f);
                                }, 250, 0))

                        .withFirstPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 0))

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.475000f, 0.200000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.475000f, 0.200000f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 50))

                        .withFirstPersonLeftHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.275000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.275000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.275000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.275000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.275000f);
                                }, 50, 200)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 280, 0)
                        )

                        .withFirstPersonLeftHandPositioningLoadIteration(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 0.025000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 0.025000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 0.025000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 0.025000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 0.025000f, 0.275000f);
                                }, 50, 200)
                        )

                        .withFirstPersonRightHandPositioningLoadIteration(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 50, 200)
                        )

                        .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 0.025000f, 0.275000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 0.025000f, 0.275000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.275000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.275000f);
                                }, 250, 1000))

                        .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.725000f, 0.450000f);
                                }, 250, 1000))

                        .build())
                .withSpawnEntityDamage(70f)
                .withSpawnEntityGravityVelocity(0.3f)
                .withSpawnEntitySpeed(5f)
                .withSpawnEntityExplosionRadius(3f)
                .build(MWC.modContext);
    }
}
