package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;

public class M16A1Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("m16a1")
                //.withAmmoCapacity(30)
                .withFireRate(0.8f)
                .withRecoil(3f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.RIFLE)
                .hasFlashPedals()
                .withMaxShots(1, Integer.MAX_VALUE)
                .withShootSound("m16a1")
                .withSilencedShootSound("m4a1_silenced")
                .withReloadSound("m4a1_reload")
                .withUnloadSound("m4a1_unload")
                .withEndOfShootSound("gun_click")
                .withInspectSound("m4a1_inspection")
                .withDrawSound("m4_draw")
                .withReloadingTime(50)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.09f)
                .withFlashOffsetY(() -> 0.13f)
                .withShellCasingForwardOffset(0.05f)
                .withShellCasingVerticalOffset(-0.03f)
//		.withShellCasingEjectEnabled(false)
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
                        1f, // x
                        2f, // y
                        4f) // z

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 8), new
                        CraftingEntry(MWCItems.gunmetalPlate, 13), new
                        CraftingEntry(MWCItems.steelIngot, 3))

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withCompatibleAttachment(Attachments.M16A1ScopeMount, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(-0.2F, -1.74F, -2.1f);
                        GlStateManager.scale(0.55F, 0.5F, 0.7F);
                    }
                })
                .withCompatibleAttachment(Attachments.M16A1PicatinnyRail, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(-0.046F, -0.78F, -4.9f);
                        GlStateManager.scale(0.55F, 0.5F, 0.65F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    }
                })
                .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.MagpulCTRStock, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.HeraArmsStock, (model) -> {
                    GlStateManager.translate(0.01f, -0.1f, -0.2f);
                    GlStateManager.scale(1.1F, 1.2F, 1F);
                })
                .withCompatibleAttachment(Attachments.MilSpecStock, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.HK416Stock, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.M16Stock, true, (model) -> {
//            GlStateManager.translate(0f, -0.28f, -0.55f);
//            GlStateManager.scale(1F, 1F, 0.85F);
                })
                .withCompatibleAttachment(Attachments.MagpulCTRStockTan, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.MilSpecStockTan, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.HK416StockTan, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.M16A1RearSights, true, (model) -> {
                    GlStateManager.translate(-0.145f, -1.565f, -0.33f);
                    GlStateManager.scale(0.27F, 0.27F, 0.27F);
                })
                .withCompatibleAttachment(Attachments.M4FrontSight, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.Mk18HandGuard) {
                            GlStateManager.translate(0F, 0F, -0.6F);
                            GlStateManager.scale(1F, 1F, 1F);
                        } else if (activeAttachment == Attachments.M16A4HandGuard) {
                            GlStateManager.translate(0F, 0F, -1.2F);
                            GlStateManager.scale(1F, 1F, 1F);
                        } else {
                            GlStateManager.translate(0F, 0.11F, -1.3F);
                            GlStateManager.scale(1F, 1.1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof M4Iron2) {
                        GlStateManager.translate(-0.055F, -1.35F, -4.05F);
                        GlStateManager.scale(0.8F, 0.68F, 1F);
                    } else if (model instanceof FALIron) {
                        GlStateManager.translate(-0.185F, -1.55F, -4.05F);
                        GlStateManager.scale(0.55F, 0.5F, 1F);
                    }
                }, true, false)

                .withCompatibleAttachment(Attachments.M16A1Handguard, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.M4Grip, true, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.HeraArmsGrip, (model) -> {
                    GlStateManager.translate(0F, -0.05F, 0F);
                    GlStateManager.scale(1F, 0.95F, 1F);
                })
                .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
                    GlStateManager.translate(-0.335F, 0.4F, -1.25F);
                    GlStateManager.scale(1.05F, 1.2F, 1.15F);

//            GlStateManager.translate(0F, 0.35F, 0F);
                })
                .withCompatibleAttachment(Magazines.SOCOM_Mag, (model) -> {
                    GlStateManager.translate(-0.335F, 0.4F, -1.25F);
                    GlStateManager.scale(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
                    GlStateManager.translate(-0.335F, 0.4F, -1.25F);
                    GlStateManager.scale(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
                    GlStateManager.translate(0F, 0.05F, 0F);
//            GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
                    GlStateManager.rotate(-10F, 1f, 0f, 0f);
                    GlStateManager.translate(0F, 0.25F, -0F);
//            GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
                    GlStateManager.translate(-0.35F, 0.69F, -1.25F);
                    GlStateManager.scale(1.15F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.AR15Action, true, (model) -> {
                    GlStateManager.translate(-0.175F, -1.28F, -0.67F);
                    GlStateManager.scale(0.7F, 0.4F, 0.7F);
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GlStateManager.translate(-0.21F, -1.8F, -2F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })

                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.29F, -1.83F, -0.7F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
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
                    GlStateManager.translate(-0.185F, -1.55F, -1F);
                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
                    GlStateManager.translate(-0.151F, -1.68F, -1.8F);
                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.076F, -0.67F, 4.0251F);
                        GlStateManager.scale(0.04F, 0.04F, 0.04F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GlStateManager.translate(-0.15F, -2.36F, -1F);
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

                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GlStateManager.translate(-0.066F, -1.64F, -1.3F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GlStateManager.translate(-0.07F, -1.62F, -1.3F);
                    GlStateManager.scale(0.48F, 0.48F, 0.48F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.68F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(-0.041F, -1.68F, -1.2F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(-0.041F, -1.68F, -1.2F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GlStateManager.translate(-0.041F, -1.68F, -1.5F);
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
                    GlStateManager.translate(-0.3F, -1.88F, -1.4F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(0.395F, -0.33F, -0.1F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(-0.041F, -1.69F, -1F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GlStateManager.translate(-0.041F, -1.69F, -1F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GlStateManager.translate(-0.18F, -1.85F, -1F);
                    GlStateManager.scale(0.38F, 0.38F, 0.38F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.18F, -1.85F, -1F);
                    GlStateManager.scale(0.38F, 0.38F, 0.38F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GlStateManager.translate(-0.2F, -0.35F, -3.8F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.35F, -3.8F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.3F, -3.8F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.35F, -3.8F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GlStateManager.translate(-0.2F, -0.35F, -4F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
                    GlStateManager.translate(-0.2F, -1.235F, -8.2F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withTextureNames("m16a1")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new M16A1())
                        .withADSBeizer(new Vec3d(0.2, 1.7, 0.5))
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
                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.425000f, 3.825000f, -2.525000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                        .withScale(3, 3, 3)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.050000f, 0.025000f, -0.500000f)
                                        .withBBRotation(-8.1997F, -23.6991F, 57.7232F)
                                        .withScale(2.6F, 2.6F, 4)
                                        .withPivotPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.2F, 0.1F, 2)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3.5F, 3.5F, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("m4a1", AuxiliaryAttachments.AKaction)
                        .setupModernMagazineAnimations("m4a1",
                                Magazines.M4A1Mag,
                                Magazines.M38Mag,
                                Magazines.Stanag100,
                                Magazines.Stanag50,
                                Magazines.Stanag60,
                                Magazines.SOCOM_Mag)

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.AR15Action.getRenderablePart(), (renderContext) -> {
//			    GlStateManager.translate(0f, 0f, 0.5f);
                        })

                        .withFirstPersonCustomPositioning(Magazines.M4A1Mag, (renderContext) -> {
//            	 GlStateManager.translate(0.2f, 0.35f, 0f);
//            	 GlStateManager.rotate(-20F, 0f, 0f, 1f);
                        })

                        .withThirdPersonPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 180, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 240, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 260, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 240, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 170, 170),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 260, 10),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 100, 50)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
//				GlStateManager.rotate(45F, 0f, 1f, 0f);
//				GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.18f, 0.03f, 0.6f);

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                GlStateManager.translate(0F, 0.415f, 0f);
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                GlStateManager.translate(-0.003F, 0.37f, 0.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                GlStateManager.translate(-0.003F, 0.4f, 0.4f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                GlStateManager.translate(-0.003F, 0.35f, 0.4f);
                            }

                            // HP Zoomw
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                GlStateManager.translate(-0.003F, 0.35f, 0.35f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                GlStateManager.translate(0F, 0.365f, 0.1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                GlStateManager.translate(0F, 0.365f, 0.1f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                GlStateManager.translate(0F, 0.41f, 0.1f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                GlStateManager.translate(0F, 0.41f, 0.1f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                GlStateManager.translate(0F, 0.41f, 0.3f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                GlStateManager.translate(0F, 0.44f, 0.1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                GlStateManager.translate(0F, 0.42f, 0f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                GlStateManager.translate(0F, 0.42f, 0f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                GlStateManager.translate(0F, 0.405f, 0.3f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                GlStateManager.translate(0F, 0.405f, 0.3f);
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
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.075000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.025000f, 0.000000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.025000f, 0.000000f);
                                }, 250, 0))

                        .withThirdPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.150000f, 0.375000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-26.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-26.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(1.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-53.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-53.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-54.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(1.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-24.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-24.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-26.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0))

                        .build())
                .withSpawnEntityDamage(6f)
                .withSpawnEntityGravityVelocity(0.0118f)


                .build(MWC.modContext);
    }
}
