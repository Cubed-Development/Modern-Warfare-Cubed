package com.paneedah.mwc.items.guns;
// Package

// IMPORT LIST START

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
// IMPORT LIST END


public class ACRFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("acr") // Name of the item and model
                .withFireRate(0.65f) // Fire rate in rounds per minute
                .withRecoil(3f) // Recoil in degrees
                .withZoom(0.9f) // Zoom factor
                .withConfigGroup(GunConfigurationGroup.RIFLE) // Config group
                .withMuzzlePosition(new Vec3d(0.0, -1.076000002264977, -6.227999991893772)) // Muzzle position
                .hasFlashPedals() // Has flash pedals
                .withMaxShots(1, 3, Integer.MAX_VALUE) // Max shots
                //.withMaxShots(5)
                .withShootSound("acr") // Shoot sound
                .withSilencedShootSound("m4a1_silenced") // Silenced shoot sound
                .withReloadSound("acr_reload") // Reload sound
                .withUnloadSound("acr_unload") // Unload sound
                .withDrawSound("acr_draw") // Draw sound
                .withInspectSound("m4a1_inspection") // Inspect sound
                .withReloadingTime(30) // Reloading time in ticks
                .withFlashIntensity(0.5f) // Flash intensity
                .withFlashScale(() -> 0.6f) // Flash scale
                .withFlashOffsetX(() -> 0.14f) // Flash offset X
                .withFlashOffsetY(() -> 0.16f) // Flash offset Y
                .withCreativeTab(MWC.WEAPONS_TAB) // Creative tab
                .useNewSystem() // Use new system
                .withRecoilParam(new RecoilParam( // Recoil param
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


                .withScreenShaking(RenderableState.SHOOTING,  // Screen shaking
                        1f, // x
                        1f, // y
                        3f) // z

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 8), new
                        CraftingEntry(MWCItems.gunmetalPlate, 12), new
                        CraftingEntry(MWCItems.steelIngot, 3))

                .withCreativeTab(MWC.WEAPONS_TAB)  // Creative tab

                // Unremovable attachment categories
                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(0F, 0F, 0F);
                })

                // Compatible ACR attachment ACRStock
                .withCompatibleAttachment(Attachments.ACRStock, true, (model) -> {
//            GlStateManager.translate(-0.35F, 0.3F, -1.31F);
//            GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })

                // Compatible ACR attachment ACRStockBlack
                .withCompatibleAttachment(Attachments.ACRStockBlack, (model) -> {
//          GlStateManager.translate(-0.35F, 0.3F, -1.31F);
//          GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })

                // Compatible ACR attachment ACRPRSStockTan
                .withCompatibleAttachment(Attachments.ACRPRSStockTan, (model) -> {
//          GlStateManager.translate(-0.35F, 0.3F, -1.31F);
//          GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })

                // Compatible ACR attachment ACRFixedStockTan
                .withCompatibleAttachment(Attachments.ACRFixedStockTan, (model) -> {
//          GlStateManager.translate(-0.35F, 0.3F, -1.31F);
//          GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })

                // Compatible ACR attachment ACRLongRangeStock
                .withCompatibleAttachment(Attachments.ACRLongRangeStock, (model) -> {
//          GlStateManager.translate(-0.35F, 0.3F, -1.31F);
//          GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })

                // Compatible ACR attachment ACRPDWStock
                .withCompatibleAttachment(Attachments.ACRPDWStock, (model) -> {
//          GlStateManager.translate(-0.35F, 0.3F, -1.31F);
//          GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })

                // Compatible ACR attachment CollapseableMOEStock
                .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
                    GlStateManager.translate(0.01f, -0.35f, -0.15f);
                    GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })

                // Compatible ACR attachment MagpulCTRStock
                .withCompatibleAttachment(Attachments.MagpulCTRStock, (model) -> {
                    GlStateManager.translate(0.01f, -0.35f, -0.15f);
                    GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })

                // Compatible ACR attachment MilSpecStock
                .withCompatibleAttachment(Attachments.MilSpecStock, (model) -> {
                    GlStateManager.translate(0.01f, -0.35f, -0.15f);
                    GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })

                // Compatible ACR attachment HK416Stock
                .withCompatibleAttachment(Attachments.HK416Stock, (model) -> {
                    GlStateManager.translate(0.01f, -0.35f, -0.15f);
                    GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })

                // Compatible ACR attachment ACRHandGuard
                .withCompatibleAttachment(Attachments.ACRHandGuard, true, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(0.19F, -1.15F, -3.9F);
                        GlStateManager.scale(0.85F, 0.85F, 0.8F);
                        GlStateManager.rotate(90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail2) {
                        GlStateManager.translate(-0.43F, -0.93F, -3.92F);
                        GlStateManager.scale(0.85F, 0.85F, 0.8F);
                        GlStateManager.rotate(-90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail3) {
                        GlStateManager.translate(-0.03F, -0.77F, -3.94F);
                        GlStateManager.scale(0.85F, 0.85F, 0.75F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    }
                })

                // Compatible ACR attachment ACRHandGuardBlack
                .withCompatibleAttachment(Attachments.ACRHandGuardBlack, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(0.19F, -1.15F, -3.9F);
                        GlStateManager.scale(0.85F, 0.85F, 0.8F);
                        GlStateManager.rotate(90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail2) {
                        GlStateManager.translate(-0.43F, -0.93F, -3.92F);
                        GlStateManager.scale(0.85F, 0.85F, 0.8F);
                        GlStateManager.rotate(-90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail3) {
                        GlStateManager.translate(-0.03F, -0.77F, -3.94F);
                        GlStateManager.scale(0.85F, 0.85F, 0.75F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    }
                })

                // Compatible ACR attachment ACRWEMSKHandGuardTan
                .withCompatibleAttachment(Attachments.ACRWEMSKHandGuardTan, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(-0.03F, -0.77F, -3.94F);
                        GlStateManager.scale(0.85F, 0.85F, 0.75F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    }
                })

                // Compatible ACR attachment ACRPrecisionHandGuardTan
                .withCompatibleAttachment(Attachments.ACRPrecisionHandGuardTan, (model) -> {
//        	GlStateManager.translate(0.01f, -0.35f, -0.15f);
//            GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })

                // Compatible ACR attachment ACRPolymerHandGuardTan
                .withCompatibleAttachment(Attachments.ACRPolymerHandGuardTan, (model) -> {
//        	GlStateManager.translate(0.01f, -0.35f, -0.15f);
//            GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })

                // Compatible ACR attachment ACRSBRHandGuardTan
                .withCompatibleAttachment(Attachments.ACRSBRHandGuardTan, (model) -> {
//        	GlStateManager.translate(0.01f, -0.35f, -0.15f);
//            GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })

                // Compatible ACR attachment ACRSquareDropHandguardTan
                .withCompatibleAttachment(Attachments.ACRSquareDropHandguardTan, (model) -> {
                    GlStateManager.translate(0.001f, -0f, 0f);
//            GlStateManager.scale(1.1F, 1.1F, 1.1F);
                })

                // Compatible ACR attachment M4A1Mag
                .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
                    GlStateManager.translate(-0.35F, 0.3F, -1.31F);
                    GlStateManager.scale(1.1F, 1.2F, 1.2F);
                })

                // Compatible ACR attachment M38Mag
                .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
                    GlStateManager.translate(-0.35F, 0.3F, -1.31F);
                    GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })

                // Compatible ACR attachment Stanag50
                .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
                    GlStateManager.translate(0F, -0.15F, -0.1F);
//            GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })

                // Compatible ACR attachment Stanag60
                .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
                    GlStateManager.rotate(-10F, 1f, 0f, 0f);
                    GlStateManager.translate(0F, 0.08F, -0.15F);
//            GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })

                // Compatible ACR attachment Stanag100
                .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
                    GlStateManager.translate(-0.35F, 0.5F, -1.31F);
                    GlStateManager.scale(1.2F, 1.2F, 1.2F);
                })

                // Compatible ACR attachment NightRaider
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GlStateManager.translate(-0.22F, -1.6F, -2F);
                    GlStateManager.scale(0.82F, 0.82F, 0.82F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })

                // Compatible ACR attachment ACOG
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.32F, -1.62F, -0.9F);
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

                // Compatible ACR attachment Specter
                .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
                    GlStateManager.translate(-0.2F, -1.26F, -1F);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                // Compatible ACR attachment LeupoldRailScope
                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
                    GlStateManager.translate(-0.154F, -1.45F, -1.7F);
                    GlStateManager.scale(0.46F, 0.46F, 0.46F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.076F, -0.67F, 4.0251F);
                        GlStateManager.scale(0.04F, 0.04F, 0.04F);
                    }
                })

                // Compatible ACR attachment MicroReflex
                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GlStateManager.translate(-0.148F, -2.12F, -1F);
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

                // Compatible ACR attachment Reflex
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GlStateManager.translate(-0.0555F, -1.4F, -1.5F);
                    GlStateManager.scale(0.52F, 0.52F, 0.52F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                // Compatible ACR attachment Holographic
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(-0.034F, -1.46F, -1.4F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                // Compatible ACR attachment HolographicAlt
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(-0.034F, -1.46F, -1.4F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                // Compatible ACR attachment EotechHybrid2
                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GlStateManager.translate(-0.034F, -1.46F, -1.4F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
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

                // Compatible ACR attachment BijiaReflex
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GlStateManager.translate(-0.054F, -1.38F, -1.3F);
                    GlStateManager.scale(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.68F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                // Compatible ACR attachment VortexRedux
                .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
                    GlStateManager.translate(-0.3F, -1.64F, -1.4F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(0.395F, -0.33F, -0.1F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                // Compatible ACR attachment Kobra
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(-0.04F, -1.45F, -0.99F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                // Compatible ACR attachment KobraGen3
                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GlStateManager.translate(-0.04F, -1.45F, -0.99F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                // Compatible ACR attachment MicroT1
                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GlStateManager.translate(-0.18F, -1.64F, -1F);
                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.15F, -0.4F, -0.35F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                // Compatible ACR attachment AimpointCompM5
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.18F, -1.64F, -1F);
                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.15F, -0.4F, -0.35F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                // Compatible ACR attachment Grip2
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GlStateManager.translate(-0.2F, -0.4F, -2.7F);
                    GlStateManager.scale(1F, 1F, 1F);
                })

                // Compatible ACR attachment StubbyGrip
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.4F, -2.7F);
                    GlStateManager.scale(1F, 1F, 1F);
                })

                // Compatible ACR attachment AngledGrip
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.3F, -2.95F);
                    GlStateManager.scale(1F, 1F, 1F);
                })

                // Compatible ACR attachment JunoGrip
                .withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
                    GlStateManager.translate(-0.23F, -0.62F, -2.9F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                })

                // Compatible ACR attachment VGrip
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.4F, -2.7F);
                    GlStateManager.scale(1F, 1F, 1F);
                })

                // Compatible ACR attachment Bipod
                .withCompatibleAttachment(Attachments.Bipod, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.ACRPrecisionHandGuardTan) {
                            GlStateManager.translate(-0.2F, -0.35F, -5F);
                            GlStateManager.scale(1F, 1F, 1F);
                        } else {
                            GlStateManager.translate(-0.18F, -0.35F, -3.5F);
                            GlStateManager.scale(0.8F, 0.8F, 0.8F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof AcogReticle) {
                        GlStateManager.translate(0F, 0F, 0f);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                }, false, false)

                // Compatible ACR attachment Laser2
                .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
                    GlStateManager.translate(0.08F, -1.15F, -3F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                })

                // Compatible ACR attachment Laser
                .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
                    GlStateManager.translate(0.08F, -1.15F, -3F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                })

                // Compatible ACR attachment Silencer556x45
                .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
                    GlStateManager.translate(-0.19F, -1.205F, -6.8F);
                    GlStateManager.scale(0.9F, 0.9F, 0.9F);
                })

                // Compatible ACR attachment TritiumRearSights
                .withCompatibleAttachment(Attachments.TritiumRearSights, (model) -> {
                    if (model instanceof TritiumRearSights) {
                        GlStateManager.translate(-0.165F, -1.72F, -0.27F);
                        GlStateManager.scale(0.38F, 0.38F, 0.38F);
                    }
                })

                // Compatible ACR attachment HK416RearSights
                .withCompatibleAttachment(Attachments.HK416RearSights, (model) -> {
                    if (model instanceof G95_upright_rearsights) {
                        GlStateManager.translate(-0.156F, -1.73F, -0.5F);
                        GlStateManager.scale(0.32F, 0.32F, 0.32F);
                    }
                })

                // Compatible ACR attachment MBUSRearSights
                .withCompatibleAttachment(Attachments.MBUSRearSights, true, (model) -> {
                    if (model instanceof MBUSRearSight) {
                        GlStateManager.translate(-0.16F, -1.73F, -0.3F);
                        GlStateManager.scale(0.35F, 0.35F, 0.35F);
                    }
                })

                // Compatible ACR attachment HK416FrontSight
                .withCompatibleAttachment(Attachments.HK416FrontSight, (model) -> {
                    if (model instanceof G95_upright_frontsights) {
                        GlStateManager.translate(-0.155F, -1.76F, -3.5F);
                        GlStateManager.scale(0.32F, 0.32F, 0.32F);
                    }
                })

                // Compatible ACR attachment MBUSFrontSight
                .withCompatibleAttachment(Attachments.MBUSFrontSight, true, (model) -> {
                    if (model instanceof MBUSFrontSight) {
                        GlStateManager.translate(-0.16F, -1.73F, -3.6F);
                        GlStateManager.scale(0.35F, 0.35F, 0.35F);
                    }
                })

                // Compatible ACR attachment AKMIron
                .withCompatibleAttachment(Attachments.AKMIron, (model) -> {
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
                        GlStateManager.translate(0.125F, -1.8F, -0.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GlStateManager.translate(-0.17F, -1.68F, -3.8F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GlStateManager.translate(-0.22F, -2F, -3.8F);
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
                        GlStateManager.translate(-0.09F, -1.525F, -3.8F);
                        GlStateManager.scale(0F, 0F, 0F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    } else if (model instanceof M14Iron) {
                        GlStateManager.translate(0.129F, -1.63F, -2.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M27rearsight) {
                        GlStateManager.translate(-0.164F, -1.7F, -0.5F);
                        GlStateManager.scale(0.38F, 0.38F, 0.38F);
                    } else if (model instanceof MBUSiron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })

                // Compatible ACR attachment ACRRails
                .withCompatibleAttachment(AuxiliaryAttachments.ACRRails, true, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(0.19F, -1.15F, -3.9F);
                        GlStateManager.scale(0F, 0F, 0F);
                        GlStateManager.rotate(90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail2) {
                        GlStateManager.translate(-0.43F, -0.93F, -3.92F);
                        GlStateManager.scale(0F, 0F, 0F);
                        GlStateManager.rotate(-90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail3) {
                        GlStateManager.translate(-0.03F, -0.77F, -3.94F);
                        GlStateManager.scale(0F, 0F, 0F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail4) {
                        GlStateManager.translate(-0.226F, -1.52F, -3.9F);
                        GlStateManager.scale(0.76F, 0.87F, 0.8F);
                    } else if (model instanceof AKRail5) {
                        GlStateManager.translate(-0.226F, -1.52F, -2F);
                        GlStateManager.scale(0.76F, 0.87F, 0.8F);
                    }
                })

                // Compatible ACR attachment ACRAction
                .withCompatibleAttachment(AuxiliaryAttachments.ACRAction, true, (model) -> {
                    if (model instanceof ACRAction) {
                        GlStateManager.translate(-0.06F, -1.4F, -2.9F);
                        GlStateManager.scale(0.6F, 0.6F, 0.5F);
//                GlStateManager.rotate(20F, 0f, 0f, 1f);
                    } else if (model instanceof ACRAction2) {
                    }
                })

                // BUILDS THE GUN
                .withTextureNames("acr")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new BushmasterACR())
                        .withActionPiece(AuxiliaryAttachments.ACRAction)
                        .withActionTransform(new Transform().withPosition(0, 0, 1))
                        //.withTextureName("M4A1")
                        //.withWeaponProximity(0.99F)
                        //.withYOffsetZoom(5F)
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.35F, 0.35F, 0.35F);
                            GlStateManager.rotate(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.4F, 0.4F, 0.4F);
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
                                        .withPosition(-1.425000f, 4.625000f, -2.845000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                        .withScale(3, 3, 3)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.090000f, -0.015000f, -0.620000f)
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

                        .setupModernAnimations("acr", AuxiliaryAttachments.AKaction)
                        .setupModernMagazineAnimations("acr",
                                Magazines.M4A1Mag,
                                Magazines.M38Mag,
                                Magazines.Stanag100,
                                Magazines.Stanag50,
                                Magazines.Stanag60,
                                Magazines.SOCOM_Mag)

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.ACRAction.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GlStateManager.translate(0F, 0F, 1F);
                            }
                        })

                        .withThirdPersonPositioningReloading(
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
                            GlStateManager.scale(2F, 2F, 2);
                            GlStateManager.translate(0.148f, 0.945f, -0.1f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.07f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.055f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.05f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.08f, 0.25f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(-0F, 0.11f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.05f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.06f, 0.05f);
                            }

                            // Reflex Zoom
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(-0F, 0.055f, 0.6f);
                            }

                            // Reflex Zoom
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(-0F, 0.055f, 0.6f);
                            }

                            // Reflex Zoom
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(-0F, 0.045f, 0.6f);
                            }

                            // Holo Zoom
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(-0F, 0.09f, 0.6f);
                            }

                            // Holo Zoom
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(-0F, 0.09f, 0.6f);
                            }

                            // Holo Zoom
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(-0F, 0.1f, 0.3f);
                            }

                            // Holo Zoom
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(-0F, 0.08f, 0.8f);
                            }

                            // Holo Zoom
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.05f, 0.6f);
                            }

                            // Holo Zoom
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.05f, 0.6f);
                            }

                            // Holo Zoom
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(-0.001F, 0.08f, 0.9f);
                            }

                            // Holo Zoom
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(-0.001F, 0.08f, 0.9f);
                            }

                            // Holo Zoom
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.039f, 0.2f);
                            }

                            // Everything else
                            {
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
