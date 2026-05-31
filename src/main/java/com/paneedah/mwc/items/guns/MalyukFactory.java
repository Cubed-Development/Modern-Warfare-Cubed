package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
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

public class MalyukFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("malyuk")
                .withFireRate(0.6f)
                .withRecoil(3.5f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.RIFLE)
                .hasFlashPedals()
                .withMuzzlePosition(new Vec3d(-0.12000000357627887, -0.7399999922513956, -3.7999999195337324))
                .withMaxShots(1, Integer.MAX_VALUE)
                //.withMaxShots(5)
                .withShootSound("ak47")
                .withSilencedShootSound("ak15_silenced")
                .withReloadSound("ak_reload")
                .withUnloadSound("ak_unload")
                .withInspectSound("inspection")
                .withDrawSound("ak_draw")
                .withReloadingTime(45)
                .withFlashIntensity(0.6f)
                .withFlashScale(() -> 0.5f)
                .withFlashOffsetX(() -> 0.12f)
                .withFlashOffsetY(() -> 0.16f)
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
                        1.5f, // x
                        1.5f, // y
                        4f) // z

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 8), new
                        CraftingEntry(MWCItems.gunmetalPlate, 10), new
                        CraftingEntry(MWCItems.steelIngot, 3))

                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Malyukaction, true, (model) -> {
//          GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Magazines.AK15Mag, (model) -> {
                    GlStateManager.translate(0F, 0.2F, 3.1F);
                })
                .withCompatibleAttachment(Magazines.AK47PMAGTan, (model) -> {
                    GlStateManager.translate(0F, 0.2F, 3.1F);
                })
                .withCompatibleAttachment(Magazines.AK47Mag, (model) -> {
                    GlStateManager.translate(0F, 0.2F, 3.1F);
//            GlStateManager.rotate(-10F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Magazines.AK50Mag, (model) -> {
                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                    GlStateManager.translate(0f, 0.35f, 3);
                })
                .withCompatibleAttachment(Magazines.AK75Mag, (model) -> {
                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                    GlStateManager.translate(0f, 0.35f, 3);
                    GlStateManager.scale(1.2F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Magazines.AK100Mag, (model) -> {
                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                    GlStateManager.translate(0f, 0.35f, 3);
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GlStateManager.translate(-0.21F, -1.4F, -1.2F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.32F, -1.4F, -0);
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

                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
                    GlStateManager.translate(-0.155F, -1.23F, -1.2F);
                    GlStateManager.scale(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.076F, -0.67F, 4.0251F);
                        GlStateManager.scale(0.04F, 0.04F, 0.04F);
                    }
                })

                .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
                    GlStateManager.translate(-0.195F, -1.05F, -0.5F);
                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GlStateManager.translate(-0.15F, -1.91F, -0.5F);
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
                    GlStateManager.translate(-0.185F, -1.41F, -0.5F);
                    GlStateManager.scale(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.185F, -1.41F, -0.5F);
                    GlStateManager.scale(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GlStateManager.translate(-0.06F, -1.18F, -1);
                    GlStateManager.scale(0.52F, 0.52F, 0.52F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GlStateManager.translate(-0.055F, -1.16F, -1);
                    GlStateManager.scale(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.68F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(-0.035F, -1.25F, -1);
                    GlStateManager.scale(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(-0.035F, -1.25F, -1);
                    GlStateManager.scale(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GlStateManager.translate(-0.035F, -1.25F, -1.4F);
                    GlStateManager.scale(0.73F, 0.73F, 0.73F);
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
                    GlStateManager.translate(-0.33F, -1.44F, -1);
                    GlStateManager.scale(0.52F, 0.52F, 0.52F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(0.395F, -0.33F, -0.1F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(-0.04F, -1.24F, -0.5F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GlStateManager.translate(-0.04F, -1.24F, -0.5F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MBUSRearSights, true, (model) -> {
                    GlStateManager.translate(-0.16F, -1.51F, 0.4F);
                    GlStateManager.scale(0.35F, 0.35F, 0.35F);
                })
                .withCompatibleAttachment(Attachments.MBUSFrontSight, true, (model) -> {
                    GlStateManager.translate(-0.16F, -1.51F, -2F);
                    GlStateManager.scale(0.35F, 0.35F, 0.35F);
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GlStateManager.translate(-0.18F, -0.15F, -2.6F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GlStateManager.translate(-0.2F, -0.1F, -2F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.1F, -2F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GlStateManager.translate(-0.2F, 0.05F, -2.4F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.1F, -2);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
                    GlStateManager.translate(-0.3F, -0.35F, -2.5F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Silencer762x39, renderContext -> {
                    GlStateManager.translate(-0.2F, -0.95F, -4.8F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withTextureNames("malyuk")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new Malyuk())
                        .withActionPiece(AuxiliaryAttachments.Malyukaction)
                        .withActionTransform(new Transform().withPosition(0, 0, 1))
                        .withADSBeizer(new Vec3d(0.2, 1.7, -1))
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
                            GlStateManager.translate(-1.8F, -1.1F, 2F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.425000f, 3.985000f, -4.965000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                        .withScale(3, 3, 3)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.250000f, 0.545000f, 0.260000f)
                                        .withBBRotation(-7.1415F, -27.3003F, 52.6433F)
                                        .withScale(2.8F, 2.8F, 4)
                                        .withPivotPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.240000f, 0.180000f, 1.960000f)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3, 3, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("malyuk", AuxiliaryAttachments.Malyukaction)
                        .setupModernMagazineAnimations("malyuk",
                                Magazines.AK47Mag,
                                Magazines.AK15Mag,
                                Magazines.AK47PMAGTan,
                                Magazines.AK50Mag,
                                Magazines.AK75Mag,
                                Magazines.AK100Mag)

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


                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.AKaction.getRenderablePart(),
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
//                GlStateManager.rotate(45F, 0f, 1f, 0f);
//                GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.18f, -0.23f, 0.7f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.22f, -0.8f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.23f, -0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.26f, -0.4f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.18f, -0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.18f, -0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.22f, 0);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.25f, 0);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.25f, 0);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.2f, 0);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.19f, 0);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.26f, 0);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.26f, 0);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.28f, 0);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.28f, -0.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.24f, -0.1f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.24f, -0.1f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AK15ironsight)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.008f, 0f);
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

                        .build())
                .withSpawnEntityDamage(6.6f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}

