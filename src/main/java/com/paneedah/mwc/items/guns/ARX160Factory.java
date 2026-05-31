package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;

public class ARX160Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("arx160")
                .withFireRate(0.75f)
                .withRecoil(2.5f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.RIFLE)
                .hasFlashPedals()
                .withMaxShots(1, 3, Integer.MAX_VALUE)
                .withShootSound("arx160")
                .withSilencedShootSound("m4a1_silenced")
                .withReloadSound("g36c_reload")
                .withUnloadSound("g36c_unload")
                .withEndOfShootSound("gun_click")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(50)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.15f)
                .withShellCasingForwardOffset(0.05f)
                .withShellCasingVerticalOffset(-0.03f)
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
                        0.5f, // x
                        0f, // y
                        3.5f) // z

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 6), new
                        CraftingEntry(MWCItems.gunmetalPlate, 10), new
                        CraftingEntry(MWCItems.steelIngot, 3))

                .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.ARX160Chassis, true, (model) -> {
//            GlStateManager.translate(0.01f, -0.19f, -0.4f);
//            GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Magazines.SOCOM_Mag, (model) -> {
                    GlStateManager.translate(-0.325F, 0.1F, -1.49F);
                    GlStateManager.scale(1F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
                    GlStateManager.translate(-0.325F, 0.1F, -1.49F);
                    GlStateManager.scale(1F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
                    GlStateManager.translate(-0.325F, 0.1F, -1.49F);
                    GlStateManager.scale(1F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
                    GlStateManager.translate(0F, -0.35F, -0.2F);
//            GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
                    GlStateManager.rotate(-10F, 1f, 0f, 0f);
                    GlStateManager.translate(0F, -0.1F, -0.3F);
//            GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
                    GlStateManager.translate(-0.35F, 0.3F, -1.4F);
                    GlStateManager.scale(1.15F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.ARX160Action, true, (model) -> {
//            GlStateManager.translate(0F, 0F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.Mk18HandGuard) {
                            GlStateManager.translate(0F, 0F, -0.6F);
                            GlStateManager.scale(1F, 1F, 1F);
                        } else if (activeAttachment == Attachments.M38HandGuard) {
                            GlStateManager.translate(0F, 0F, -0.4F);
                            GlStateManager.scale(1F, 1F, 1F);
                        } else if (activeAttachment == Attachments.M16A4HandGuard) {
                            GlStateManager.translate(0F, 0F, -1.2F);
                            GlStateManager.scale(1F, 1F, 1F);
                        } else {
                            GlStateManager.translate(0F, 0F, 0F);
                            GlStateManager.scale(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof MBUSFrontSight) {
                        GlStateManager.translate(-0.16F, -2.1F, -3.5F);
                        GlStateManager.scale(0.35F, 0.35F, 0.35F);
                    }
                }, true, false)
                .withCompatibleAttachment(Attachments.MBUSRearSights, true, (model) -> {
                    if (model instanceof MBUSRearSight) {
                        GlStateManager.translate(-0.159F, -2.1F, -0.2F);
                        GlStateManager.scale(0.35F, 0.35F, 0.35F);
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GlStateManager.translate(-0.21F, -2F, -2.4F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.31F, -2F, -1F);
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
                    GlStateManager.translate(-0.19F, -1.66F, -1.4F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GlStateManager.translate(-0.06F, -1.8F, -1.8F);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GlStateManager.translate(-0.06F, -1.8F, -1.8F);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.68F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GlStateManager.translate(-0.15F, -2.51F, -1F);
                    GlStateManager.scale(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.08F, 0.97F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    } else if (model instanceof SightMount) {
//                	GlStateManager.translate(-0.15F, -1.82F, -1F);
//                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(-0.034F, -1.83F, -1.4F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(-0.034F, -1.83F, -1.4F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GlStateManager.translate(-0.034F, -1.83F, -1.8F);
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
                .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
                    GlStateManager.translate(-0.33F, -2.05F, -1.8F);
                    GlStateManager.scale(0.53F, 0.53F, 0.53F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(0.395F, -0.33F, -0.1F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(-0.03F, -1.84F, -1.4F);
                    GlStateManager.scale(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GlStateManager.translate(-0.03F, -1.84F, -1.4F);
                    GlStateManager.scale(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GlStateManager.translate(-0.195F, -2.04F, -1.5F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.15F, -0.4F, -0.35F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.195F, -2.04F, -1.5F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.15F, -0.4F, -0.35F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM2, (player, stack) -> {
                    GlStateManager.translate(-0.12F, -1.4F, -1F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.005F, -0.89F, -1.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GlStateManager.translate(-0.2F, -0.57F, -3.3F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.57F, -3.3F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.5F, -3.5F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.57F, -3.3F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GlStateManager.translate(-0.18F, -0.6F, -3.5F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                })
                .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
                    GlStateManager.translate(0F, -1.6F, -4.3F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
                    GlStateManager.translate(0F, -1.6F, -4.3F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
                    GlStateManager.translate(-0.2F, -1.5F, -6.4F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(-0.217F, -1.9F, -2.22F);
                        GlStateManager.scale(0.67F, 0.675F, 0.9F);
                    } else if (model instanceof AKRail2) {
                        GlStateManager.translate(-0.217F, -1.9F, -3.93F);
                        GlStateManager.scale(0.67F, 0.675F, 0.9F);
                    } else if (model instanceof AKRail3) {
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKRail4) {
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKRail5) {
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withTextureNames("arx160")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new Glock18C())
                        .withADSBeizer(new Vec3d(0, 5, 0))
                        .withActionPiece(AuxiliaryAttachments.ARX160Action)
                        .withActionTransform(new Transform().withPosition(0, 0, 1))
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
                            GlStateManager.translate(-2F, -0.9F, 2.1F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.425000f, 5.705000f, -3.005000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.350000f, -3.460000f, -0.580000f)
                                        .withScale(3, 3, 3)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.090000f, -0.255000f, -0.500000f)
                                        .withBBRotation(-8.1997F, -23.6991F, 57.7232F)
                                        .withScale(2.6F, 2.6F, 4)
                                        .withPivotPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.200000f, -0.180000f, 1.760000f)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3.5F, 3.5F, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("arx160", AuxiliaryAttachments.ARX160Action)
                        .setupModernMagazineAnimations("arx160",
                                Magazines.M4A1Mag,
                                Magazines.M38Mag,
                                Magazines.Stanag100,
                                Magazines.Stanag50,
                                Magazines.Stanag60,
                                Magazines.SOCOM_Mag)

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.ARX160Action.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GlStateManager.translate(0F, 0F, 1F);
                            }
                        })

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.14f, 1.44f, -0.4f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(-0.002F, 0.22f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(-0.002F, 0.25f, 0.75f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(-0.002F, 0.275f, 0.75f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.185f, 0.65f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0.005F, 0.24f, 0.85f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.21f, 0.85f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.23f, 0.4f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.27f, 0.85f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.27f, 0.85f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.26f, 0.55f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.26f, 0.55f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.28f, 0.55f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.3f, 0.85f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.285f, 0.75f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.285f, 0.75f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.22f, 0.75f);
                            }

                            // Everything else
                            else {
                            }

                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.985000f, 5.145000f, -5.245000f)
                                    .withRotation(0.000000f, -30.514396f, -26.062789f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.265000f, 4.745000f, -8.285000f)
                                    .withRotation(2.793742f, -46.352252f, -19.231070f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.330000f, 0.065000f, 0.140000f)
                                            .withRotation(78.544055f, 23.699100f, 18.430633f)
                                            .withScale(2.6F, 2.6F, 4)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.200000f, -0.180000f, 1.760000f)
                                            .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withPivotPoint(0, 0, 0)
                                            .applyTransformations();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.330000f, 0.065000f, 0.140000f)
                                            .withRotation(78.544055f, 23.699100f, 18.430633f)
                                            .withScale(2.600000f, 2.600000f, 4.000000f)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.200000f, -0.180000f, 1.760000f)
                                            .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                })

                        .build())
                .withSpawnEntityDamage(6f)
                .withSpawnEntityGravityVelocity(0.0118f)


                .build(MWC.modContext);
    }
}
