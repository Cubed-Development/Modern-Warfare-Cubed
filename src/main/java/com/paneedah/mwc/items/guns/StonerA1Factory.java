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

public class StonerA1Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("stonera1")
                .withFireRate(0.8f)
                .withRecoil(2f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.HEAVY)
                .withMaxShots(Integer.MAX_VALUE)
                //.withMaxShots(5)
                .withShootSound("m249")
                .withSilencedShootSound("ak15_silenced")
                .withReloadSound("mg42_reload")
                .withUnloadSound("mg42_unload")
                .withInspectSound("inspection")
                .withDrawSound("mg42_draw")
//        .withDrawSound("mg42_reload")
                .withReloadingTime(45)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.11f)
                .withFlashOffsetY(() -> 0.15f)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        2.5f, // x
                        1f, // y
                        3f) // z

                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withCompatibleAttachment(Attachments.M249Stock, true, (model) -> {
                    GlStateManager.translate(0f, 0f, -0.3f);
                })
                .withCompatibleAttachment(Attachments.M38FrontSight, true, (model) -> {
                    if (model instanceof AKMiron2) {
                        GlStateManager.translate(-0.015F, -1.03F, -0.33F);
                        GlStateManager.scale(0.55F, 0.55F, 1F);
                    } else if (model instanceof FALIron) {
                        GlStateManager.translate(0.065F, -0.85F, -0.3F);
                        GlStateManager.scale(0.1F, 1F, 0.3F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    } else if (model instanceof AK47iron) {
                        GlStateManager.translate(-0.1F, -1.51F, -0.3F);
                        GlStateManager.scale(0.85F, 1.3F, 0.25F);
                    }
                })
                .withCompatibleAttachment(Attachments.StonerHANDGUARD, true, (model) -> {
                    if (model instanceof StonerHANDGUARD) {
                        GlStateManager.translate(0F, 0F, 0F);
                        GlStateManager.scale(1F, 1F, 1F);
                    } else if (model instanceof AKRail) {
                        GlStateManager.translate(-0.085F, -0.75F, -0.5F);
                        GlStateManager.scale(0.9F, 0.9F, 1.15F);
                    } else if (model instanceof AKRail2) {
                        GlStateManager.translate(0.12F, 0.3F, 0.1F);
                        GlStateManager.scale(0.6F, 0.6F, 0.7F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    }
                })
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M249Action, true, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.StonerHATCH, true, (model) -> {
                    if (model instanceof StonerA1HATCH) {
//            	GlStateManager.translate(-0F, 2.45F, 3.8F);
//                GlStateManager.rotate(90F, 1f, 0f, 0f);
                    } else if (model instanceof M27rearsight) {
                        GlStateManager.translate(0f, -1.05f, 5.8f);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(AuxiliaryAttachments.StonerBELT, true, (model) -> {
//            GlStateManager.translate(0.3F, 0.1F, 0F);
//          GlStateManager.rotate(-15F, 0f, 0f, 1f);
                })
                .withCompatibleAttachment(Magazines.StonerMag, (model) -> {
//            GlStateManager.translate(0.3F, 0.1F, 0F);
//            GlStateManager.rotate(-15F, 0f, 0f, 1f);

//            GlStateManager.translate(0.15F, 0.9F, 0F);
//            GlStateManager.rotate(10F, 0f, 0f, 1f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(-0.085F, -0.86F, 4.1F);
                        GlStateManager.scale(0.9F, 0.9F, 0.8F);
                    } else if (model instanceof AKRail2) {
                        GlStateManager.translate(-0.085F, -0.75F, -0.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKRail3) {
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKRail4) {
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKRail5) {
                        GlStateManager.scale(0F, 0F, 0F);
                    }
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
                        GlStateManager.translate(0.26F, -1.53F, -2.05F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GlStateManager.translate(0.26F, -1.55F, -2.35F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof G36CIron1) {
                        GlStateManager.translate(-0.22F, -1.94F, 0.13F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof G36CIron2) {
                        GlStateManager.translate(-0.005F, -0.88F, 0.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof ScarIron1) {
                        GlStateManager.translate(0.165F, -1.65F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof ScarIron2) {
                        GlStateManager.translate(0.25F, -1.55F, -2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof FALIron) {
                        GlStateManager.translate(0.129F, -1.63F, -2.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M14Iron) {
                        GlStateManager.translate(0.129F, -1.63F, -2.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
                    if (model instanceof M4Iron1) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GlStateManager.translate(0.255F, -1.55F, -2.25F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GlStateManager.translate(0.26F, -1.55F, -2.35F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron1) {
                        GlStateManager.translate(0.125F, -1.8F, -1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GlStateManager.translate(-0.18F, -1.5F, -3.73F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GlStateManager.translate(-0.22F, -1.85F, -3.7F);
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
                        GlStateManager.translate(-0.1F, -1.34F, -3.7F);
                        GlStateManager.scale(0F, 0F, 0F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    } else if (model instanceof M14Iron) {
                        GlStateManager.translate(0.129F, -1.63F, -2.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M27rearsight) {
                        GlStateManager.translate(0f, -1.05f, 5.8f);
                        GlStateManager.scale(0.35F, 0.35F, 0.35F);
                    } else if (model instanceof MBUSiron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GlStateManager.translate(-0.05F, -0.95F, 3.8F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.155F, -1F, 5.3F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
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
                    GlStateManager.translate(-0.035F, -0.6F, 4.7F);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GlStateManager.translate(0.1F, -0.78F, 4.6F);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GlStateManager.translate(0.1F, -0.74F, 4.6F);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.68F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(0.12F, -0.8F, 4.6F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(0.12F, -0.8F, 4.6F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GlStateManager.translate(0.12F, -0.8F, 4.8F);
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
//        .withCompatibleAttachment(Attachments.Vortex, (player, stack) -> {
//            GlStateManager.translate(-0.12F, -1F, 4.3F);
//            GlStateManager.scale(0.4F, 0.4F, 0.5F);
//            },(model) -> {
//                if(model instanceof Holo2) {
//                    GlStateManager.translate(0.395F, -0.33F, -0.1F);
//                    GlStateManager.scale(0.15F, 0.15F, 0.15F);
//                }
//            })
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(0.125F, -0.83F, 4.8F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GlStateManager.translate(-0.04F, -1.05F, 4.7F);
                    GlStateManager.scale(0.48F, 0.48F, 0.48F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.04F, -1.05F, 4.7F);
                    GlStateManager.scale(0.48F, 0.48F, 0.48F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GlStateManager.translate(-0.05F, 0.75F, 1.4F);
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
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GlStateManager.translate(-0.05F, 0.83F, 0.9F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
                    GlStateManager.translate(-0.06F, -0.6F, 1.5F);
                    GlStateManager.scale(0.85F, 0.85F, 0.85F);
                    GlStateManager.rotate(-90F, 0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
                    GlStateManager.translate(-0.06F, -0.62F, 1.5F);
                    GlStateManager.scale(0.85F, 0.85F, 0.85F);
                    GlStateManager.rotate(-90F, 0f, 0f, 1f);
                })
                .withTextureNames("gun")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new StonerA1())
                        //.withTextureName("AK47")
                        //.withWeaponProximity(0.99F)
                        //.withYOffsetZoom(5F)
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.35F, 0.35F, 0.35F);
                            GlStateManager.rotate(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.28F, 0.28F, 0.28F);
                            GlStateManager.translate(1, -0.8f, 1.5f);
                            GlStateManager.rotate(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GlStateManager.scale(0.45F, 0.45F, 0.45F);
                            GlStateManager.translate(-0.6F, 3.5F, 0.5F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2.5f, 2.5f, 2.5f);
                            GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.445000f, 0.700000f, -6.300000f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2.5f, 2.5f, 2.5f);
                            GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.445000f, 0.700000f, -6.000000f);
                            GlStateManager.rotate(-0.500000f, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.StonerBELT.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.1F, -0.1F, 0F);
                            GlStateManager.rotate(25F, 0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.StonerBELT.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.1F, -0.1F, 0F);
                            GlStateManager.rotate(25F, 0f, 0f, 1f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.StonerBELT.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GlStateManager.translate(-0.5F, -0.4F, 0F);
                                GlStateManager.rotate(40F, 0f, 0f, 1f);
//                    GlStateManager.rotate(30F, 1f, 0f, 0f);
                            }
                        })

                        .withFirstPersonPositioningReloading(

                                //hand grabs latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(16.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(17.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.800000f, -6.074996f);
                                }, 350, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.805f, -6.074996f);
                                }, 90, 0),
                                //hand opens latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(16.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(14.600000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(13.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.81f, -6.1f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(15.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(14.100000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.78f, -6.08f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(15.200000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.200000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(12.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.73f, -6.04f);
                                }, 90, 0),
                                // gun moves as hand goes down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(16.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(22.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.55f, 0.67f, -6.24f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(15.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(24.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.62f, 0.72f, -6.3f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(13.600000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(27.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.64f, 0.78f, -6.35f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(12.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.67f, 0.83f, -6.42f);
                                }, 100, 0),
                                // mag touches gun
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(12.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(33.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.75f, 0.81f, -6.474996f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.73f, 0.805f, -6.474996f);
                                }, 80, 0),
                                // mag inserts
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.200000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.9f, 0.77f, -6.474996f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.86f, 0.77f, -6.474996f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-6.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.82f, 0.77f, -6.474996f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.800000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.8f, 0.77f, -6.474996f);
                                }, 90, 0),
                                //left hand grabs belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(36.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.7f, 0.800000f, -6.474996f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.300000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(38.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.6f, 0.800000f, -6.474996f);
                                }, 100, 0),
                                //left hand drags belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(39.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.5f, 0.800000f, -6.474996f);
                                }, 240, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.50f, 0.800000f, -6.474996f);
                                }, 240, 0),
                                // places belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(13.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.83f, -6.474996f);
                                }, 110, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(12.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(39.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.81f, -6.474996f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(12.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(38.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.815f, -6.474996f);
                                }, 90, 0),
                                // gun moves
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(13.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.815f, -6.474996f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(15.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.815f, -6.474996f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(18.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.815f, -6.474996f);
                                }, 150, 0),
                                // grabs latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(13.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.900000f, -6.374996f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(11.500000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 0.87f, -6.374996f);
                                }, 80, 0),
                                //left hand closes latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 1.11f, -6.374996f);
                                }, 110, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 1.02f, -6.374996f);
                                }, 60, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(22.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(13.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 1.08f, -6.4f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(12.500000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.700000f, 1.05f, -6.5f);
                                }, 80, 0),
                                //hand goes to action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(36.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.000000f, -6.3f);
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(39.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(23.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.000000f, -6.2f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.200000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(21.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.000000f, -6.1f);
                                }, 80, 0),
                                //hand pulls action back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(9.400000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.400000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.000000f, -6f);
                                }, 140, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.70000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.900000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(22.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.000000f, -5.974996f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.900000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.700000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(23.500000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.000000f, -5.974996f);
                                }, 80, 0),
                                //hand pushes action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(9.400000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(39.700000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(18.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.000000f, -6.15f);
                                }, 110, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.600000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(21.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.000000f, -6.12f);
                                }, 60, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.100000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.100000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.500000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.000000f, -6.19f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.400000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(19.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.000000f, -6.174996f);
                                }, 80, 0)
                        )

                        .withFirstPersonPositioningUnloading(

                                //left hand begins grabs magazine out
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(6.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.545000f, 0.750000f, -6.500000f);
                                }, 300, 100),
                                //left hand begins grabs magazine out
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.545000f, 0.80000f, -6.500000f);
                                }, 300, 0),
                                //left hand drops magazine
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41.5F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(9.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(4.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.545000f, 0.780000f, -6.550000f);
                                }, 340, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M249Action.getRenderablePart(),
                                //hand grabs latch
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                //hand opens latch
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                // hand moves down
                                new Transition((renderContext) -> { // Reload position
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 300, 0),
                                // mag touches gun
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                // mag inserts
                                new Transition((renderContext) -> { // Reload position
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                //left hand grabs belt
                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                //left hand drags belt
                                new Transition((renderContext) -> { // Reload position
                                }, 400, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 400, 0),
                                // places belt
                                new Transition((renderContext) -> { // Reload position
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 60, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                // gun moves
                                new Transition((renderContext) -> { // Reload position
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 90, 0),
                                // grabs latch
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                //left hand closes latch
                                new Transition((renderContext) -> { // Reload position
                                }, 160, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                //hand goes to action
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0f, 0f, 1f);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0f, 0f, 1f);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0f, 0f, 1f);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.StonerHATCH.getRenderablePart(),
                                //hand grabs latch
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                //hand opens latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 80, 0),
                                // hand moves down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 0),
                                // mag touches gun
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 70, 0),
                                // mag inserts
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 80, 0),
                                //left hand grabs belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 80, 0),
                                //left hand drags belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 400, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 400, 0),
                                // places belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 60, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 70, 0),
                                // gun moves
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 90, 0),
                                // grabs latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0F, 2.45F, 3.8F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 80, 0),
                                //left hand closes latch
                                new Transition((renderContext) -> { // Reload position
                                }, 160, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                //hand goes to action
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.StonerBELT.getRenderablePart(),
                                //hand grabs latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.65F, 0.95F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.65F, 0.95F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 70, 0),
                                //hand opens latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.65F, 0.95F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.65F, 0.95F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.65F, 0.95F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 80, 0),
                                // hand moves down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.65F, 0.95F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.65F, 0.95F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.65F, 0.95F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.65F, 0.95F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 300, 0),
                                // mag touches gun
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.45F, 0.35F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.45F, 0.35F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 70, 0),
                                // mag inserts
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.35F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.35F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.35F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.35F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 80, 0),
                                //left hand grabs belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.35F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, 0.35F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 80, 0),
                                //left hand drags belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, -0.25F, 0F);
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                }, 400, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05F, -0.15F, 0F);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 400, 0),
                                // places belt
                                new Transition((renderContext) -> { // Reload position
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 60, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                // gun moves
                                new Transition((renderContext) -> { // Reload position
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 90, 0),
                                // grabs latch
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                //left hand closes latch
                                new Transition((renderContext) -> { // Reload position
                                }, 160, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                //hand goes to action
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000)
                        )

                        .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.StonerBELT.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.45F, 0.2F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.4F, 1.8F, 0F);
                                    GlStateManager.rotate(45F, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Magazines.StonerMag,
                                //hand grabs latch
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                //hand opens latch
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                // hand moves down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.6F, 1F, 0F);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.6F, 1F, 0F);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.6F, 1F, 0F);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.6F, 1F, 0F);
                                }, 300, 0),
                                // mag touches gun
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.4F, 0F, 0F);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.4F, 0F, 0F);
                                }, 70, 0),
                                // mag inserts
                                new Transition((renderContext) -> { // Reload position
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                //left hand grabs belt
                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                //left hand drags belt
                                new Transition((renderContext) -> { // Reload position
                                }, 400, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 400, 0),
                                // places belt
                                new Transition((renderContext) -> { // Reload position
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 60, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                // gun moves
                                new Transition((renderContext) -> { // Reload position
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 90, 0),
                                // grabs latch
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                //left hand closes latch
                                new Transition((renderContext) -> { // Reload position
                                }, 160, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                //hand goes to action
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 340, 0),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000)
                        )

                        .withFirstPersonCustomPositioningUnloading(Magazines.StonerMag,
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.3F, 0.1F, 0F);
                                    GlStateManager.rotate(-15F, 0f, 0f, 1f);

                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.350000f, 0.925000f, -1.125000f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.525000f, 1.174999f, -1.125000f);
                                }, 350, 600))

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(25.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.500000f, -5.574998f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(13.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(20.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.500000f, -5.574998f);
                                }, 230, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.500000f, -5.574998f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.500000f, -5.574998f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-3.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.500000f, -5.574998f);
                                }, 230, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.500000f, -5.504998f);
                                }, 180, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.500000f, -5.574998f);
                                }, 180, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.StonerBELT.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.5F, -0.4F, 0F);
                                    GlStateManager.rotate(40F, 0f, 0f, 1f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.5F, -0.4F, 0F);
                                    GlStateManager.rotate(40F, 0f, 0f, 1f);
                                }, 230, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.5F, -0.4F, 0F);
                                    GlStateManager.rotate(40F, 0f, 0f, 1f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.5F, -0.4F, 0F);
                                    GlStateManager.rotate(40F, 0f, 0f, 1f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.5F, -0.4F, 0F);
                                    GlStateManager.rotate(40F, 0f, 0f, 1f);
                                }, 230, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.5F, -0.4F, 0F);
                                    GlStateManager.rotate(40F, 0f, 0f, 1f);
                                }, 180, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.5F, -0.4F, 0F);
                                    GlStateManager.rotate(40F, 0f, 0f, 1f);
                                }, 180, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.19f, 0.32f, -6.2f);
                            GlStateManager.rotate(-0.55F, 1f, 0f, 0f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.2f, 0.6f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.27f, 0.6f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.18f, 0.6f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.21f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.16f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.2f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.2f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.19f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.33f, 0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.33f, 0.5f);
                            }

//             // ACOG Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Acog");
//                    GlStateManager.translate(0F, 0.21f, 0.6f);
//                } 

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.26f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.165f, 0.3f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.19f, 0.32f, -6.05f);
                            GlStateManager.rotate(-0.55F, 1f, 0f, 0f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.2f, 0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.27f, 0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.18f, 0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.21f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.16f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.2f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.2f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.19f, 0.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.33f, 0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.33f, 0.5f);
                            }

//             // ACOG Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Acog");
//                    GlStateManager.translate(0F, 0.21f, 0.6f);
//                } 

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.26f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.165f, 0.3f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.rotate(40F, 0f, 1f, 0f);
                            GlStateManager.scale(2.5f, 2.5f, 2.5f);
                            GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.445000f, 1.45f, -5.900000f);
                            GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(2f, 2f, 2f);
                            GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.950000f, -0.125000f, -6.125000f);
                        })

                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.425000f, -1.199999f, 0.075000f);

//                         GlStateManager.scale(4f, 4f, 4f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.425000f, -1.199999f, 0.075000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.425000f, -1.199999f, 0.075000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(
                                //hand grabs latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.125000f, -1.299999f, 0.000000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.125000f, -1.299999f, 0.000000f);
                                }, 70, 0),
                                //hand opens latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, -1.050000f, 0.200000f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, -1.050000f, 0.200000f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, -1.050000f, 0.200000f);
                                }, 80, 0),
                                // hand moves down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, -1.699999f, -0.050000f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, -1.699999f, -0.050000f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, -1.699999f, -0.050000f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, -1.699999f, -0.050000f);
                                }, 300, 0),
                                // mag touches gun
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, -1.699999f, -0.050000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, -1.699999f, -0.050000f);
                                }, 70, 0),
                                // mag inserts
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, -1.674999f, 0.025000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, -1.674999f, 0.025000f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, -1.674999f, 0.025000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, -1.674999f, 0.025000f);
                                }, 80, 0),
                                //left hand grabs belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.675000f, -1.649999f, 0.325000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.675000f, -1.649999f, 0.325000f);
                                }, 80, 0),
                                //left hand drags belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.675000f, -1.649999f, 0.025000f);
                                }, 400, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.850000f, -1.549999f, 0.200000f);
                                }, 400, 0),
                                // places belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.950000f, -1.499999f, 0.125000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.950000f, -1.499999f, 0.125000f);
                                }, 60, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.950000f, -1.499999f, 0.125000f);
                                }, 70, 0),
                                // gun moves
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, -1.624999f, 0.075000f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.850000f, -1.874999f, 0.250000f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.825000f, -2.074999f, 0.050000f);
                                }, 90, 0),
                                // grabs latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, -1.050000f, 0.200000f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.050000f, -1.050000f, 0.200000f);
                                }, 80, 0),
                                //left hand closes latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.125000f, -1.299999f, 0.000000f);
                                }, 160, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.125000f, -1.299999f, 0.000000f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.125000f, -1.299999f, 0.000000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.125000f, -1.299999f, 0.000000f);
                                }, 80, 0),
                                //hand goes to action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.710000f, -1.285000f, 0.130000f);
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.710000f, -1.285000f, 0.130000f);
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.710000f, -1.285000f, 0.130000f);
                                }, 340, 0),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.710000f, -1.285000f, 0.130000f);
                                }, 500, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.710000f, -1.285000f, 0.130000f);
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.710000f, -1.285000f, 0.130000f);
                                }, 340, 0),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.710000f, -1.285000f, 0.130000f);
                                }, 500, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.710000f, -1.285000f, 0.130000f);
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.710000f, -1.285000f, 0.130000f);
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.710000f, -1.285000f, 0.130000f);
                                }, 340, 0)
                        )

                        .withFirstPersonRightHandPositioningReloading(
                                //hand grabs latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 70, 0),
                                //hand opens latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 80, 0),
                                // hand moves down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 300, 0),
                                // mag touches gun
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 70, 0),
                                // mag inserts
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 80, 0),
                                //left hand grabs belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 80, 0),
                                //left hand drags belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 400, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 400, 0),
                                // places belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 60, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 70, 0),
                                // gun moves
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 90, 0),
                                // grabs latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 80, 0),
                                //left hand closes latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 160, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 70, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 80, 0),
                                //hand goes to action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-130.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(1.230000f, -1.010000f, 0.190000f);

                                    GlStateManager.translate(0f, 0.03f, 0f);
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-130.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(1.230000f, -1.010000f, 0.190000f);

                                    GlStateManager.translate(0f, 0.03f, 0f);
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-130.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(1.230000f, -1.010000f, 0.190000f);

                                    GlStateManager.translate(0f, 0.03f, 0f);
                                }, 340, 0),
                                // pulls action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-130.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(1.510000f, -0.940000f, 0.220000f);

                                    GlStateManager.translate(0f, 0.03f, 0f);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-130.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(1.510000f, -0.940000f, 0.220000f);

                                    GlStateManager.translate(0f, 0.03f, 0f);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-130.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(1.510000f, -0.940000f, 0.220000f);

                                    GlStateManager.translate(0f, 0.03f, 0f);
                                }, 500, 1000),
                                // pushes action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-130.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(1.230000f, -1.010000f, 0.190000f);

                                    GlStateManager.translate(0f, 0.03f, 0f);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-130.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(1.230000f, -1.010000f, 0.190000f);

                                    GlStateManager.translate(0f, 0.03f, 0f);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-130.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(1.230000f, -1.010000f, 0.190000f);

                                    GlStateManager.translate(0f, 0.03f, 0f);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-130.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(1.230000f, -1.010000f, 0.190000f);

                                    GlStateManager.translate(0f, 0.03f, 0f);
                                }, 500, 1000)
                        )

                        .withFirstPersonLeftHandPositioningUnloading(
                                //hand grabs magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.490000f, -1.695000f, 0.170000f);
                                }, 250, 1000),
                                //hand grabs magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.310000f, -1.715000f, 0.070000f);
                                }, 250, 1000),
                                //hand drops magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.010000f, -1.855000f, -0.030000f);
                                }, 250, 1000))

                        .withFirstPersonRightHandPositioningUnloading(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -1.774999f, 0.450000f);
                                }, 250, 1000))

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 50))

                        .withThirdPersonLeftHandPositioningReloading(
                                //does nothing
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 500, 1000),
                                //does nothing
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 500, 1000),
                                //does nothing
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 500, 1000),
                                //hand grabs latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.075000f, 0.100000f);
                                }, 250, 1000),
                                //hand opens latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.100000f, 0.200000f);
                                }, 250, 1000),
                                //hand grabs magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.100000f, 0.075000f);
                                }, 250, 1000),
                                //hand drops magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, 0.025000f, 0.025000f);
                                }, 250, 1000),
                                //hand stays down there
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, 0.025000f, 0.025000f);
                                }, 250, 1000),
                                //hand pulls up new magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.075000f, 0.100000f);
                                }, 250, 1000),
                                //hand pushes in magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.075000f, 0.100000f);
                                }, 250, 1000),
                                //hand grabs belt
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.025000f, 0.125000f);
                                }, 250, 1000),
                                //hand drags belt
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.050000f, 0.150000f);
                                }, 250, 1000),
                                //hand grabs latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.100000f, 0.200000f);
                                }, 250, 1000),
                                //hand closes latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.075000f, 0.100000f);
                                }, 250, 1000),
                                //hand lifts up
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 250, 1000),
                                //hand smacks latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 250, 1000))

                        .withThirdPersonRightHandPositioningReloading(
                                //hand grabs action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.100000f, 0.050000f);
                                }, 500, 1000),
                                //hand pulls action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.175000f, 0.050000f);
                                }, 500, 1000),
                                //hand pushes action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.100000f, 0.050000f);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 500, 1000),
                                //hand pulls action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.175000f, 0.050000f);
                                }, 500, 1000),
                                //hand pushes action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.100000f, 0.050000f);
                                }, 500, 1000))

                        .withFirstPersonLeftHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.425000f, -1.199999f, 0.075000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.425000f, -1.199999f, 0.075000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.425000f, -1.199999f, 0.075000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.425000f, -1.199999f, 0.075000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.425000f, -1.199999f, 0.075000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.425000f, -1.199999f, 0.075000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.425000f, -1.199999f, 0.075000f);
                                }, 200, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 250, 100),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 500, 1000),
                                //hand pulls action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 500, 1000),
                                //hand pushes action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(0f, 0f, 0f);
                                }, 500, 1000)
                        )

                        .build())
                .withSpawnEntityDamage(6f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}

