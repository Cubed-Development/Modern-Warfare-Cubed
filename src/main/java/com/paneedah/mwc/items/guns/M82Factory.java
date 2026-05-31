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

public class M82Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("m82_barrett")
                .withFireRate(0.1f)
                .withRecoil(15f)
                .withZoom(0.8f)
                .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
                .withMuzzlePosition(new Vec3d(-0.1480000044107437, -1.0880000026226049, -10.836000129222878))
                .hasFlashPedals()
                .withMaxShots(1)
                .withShootSound("m82")
                .withPumpTimeout(1000)
                .withSilencedShootSound("as50_silenced")
                .withReloadSound("as50_reload")
                .withUnloadSound("as50_unload")
                .withInspectSound("inspection")
                .withDrawSound("as50_draw")
                .withReloadingTime(40)
                .withFlashIntensity(0.4f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.08f)
                .withFlashOffsetY(() -> 0.08f)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        // The weapon power
                        30.0,
                        // Muzzle climb divisor
                        25.0,
                        // "Stock Length"
                        46.25,
                        // Recovery rate from initial shot
                        0.3,
                        // Recovery rate @ "stock"
                        0.425,
                        // Recoil rotation (Y)
                        0.0,
                        // Recoil rotation (Z)
                        0.025,
                        // Ads similarity divisor
                        1.0
                ))


                .withScreenShaking(RenderableState.SHOOTING,
                        6f, // x
                        -5f, // y
                        12f) // z

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 12), new
                        CraftingEntry(MWCItems.gunmetalPlate, 15), new
                        CraftingEntry(MWCItems.steelIngot, 10))

                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.GripPlaceholder, true, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M82Action, true, (model) -> {
//        	GlStateManager.translate(0f, 0f, 0.8f);

//            GlStateManager.translate(0F, 0F, 1.5F);
                })
                .withCompatibleAttachment(Magazines.M82Mag, (model) -> {
//            GlStateManager.translate(-0.42F, 0.8F, -1.4F);
//            GlStateManager.scale(1.5F, 1.5F, 1.5F);
                })
                .withCompatibleAttachment(Attachments.M4Grip, true, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })//50
                .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GlStateManager.translate(-0.22F, -1.58F, -2.5F);
                    GlStateManager.scale(0.9F, 0.9F, 0.9F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.328F, -1.6F, -1.2F);
                    GlStateManager.scale(0.9F, 0.9F, 0.9F);
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
                    GlStateManager.translate(-0.19F, -1.22F, -1.5F);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
                    GlStateManager.translate(-0.155F, -1.4F, -2.2F);
                    GlStateManager.scale(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.076F, -0.67F, 4.0251F);
                        GlStateManager.scale(0.04F, 0.04F, 0.04F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GlStateManager.translate(-0.145F, -2.15F, -1F);
                    GlStateManager.scale(0.38F, 0.38F, 0.38F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.08F, 0.97F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    } else if (model instanceof SightMount) {
                        //        	GlStateManager.translate(-0.15F, -1.82F, -1F);
                        //            GlStateManager.scale(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GlStateManager.translate(-0.045F, -1.35F, -1.5F);
                    GlStateManager.scale(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GlStateManager.translate(-0.04F, -1.32F, -1.6F);
                    GlStateManager.scale(0.63F, 0.63F, 0.63F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.68F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(-0.015F, -1.4F, -1.5F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(-0.015F, -1.4F, -1.5F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GlStateManager.translate(-0.015F, -1.4F, -1.8F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
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
                    GlStateManager.translate(-0.315F, -1.61F, -1.5F);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(0.395F, -0.33F, -0.1F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(-0.025F, -1.42F, -1F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GlStateManager.translate(-0.025F, -1.42F, -1F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GlStateManager.translate(-0.186F, -1.6F, -1F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.186F, -1.6F, -1F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GlStateManager.translate(-0.18F, -0.15F, -4.9F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Silencer50BMG, (model) -> {
                    GlStateManager.translate(-0.23F, -1.4F, -12.4F);
                    GlStateManager.scale(1.5F, 1.5F, 1.5F);
                })
                .withTextureNames("m82")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new M82())
                        .withActionPiece(AuxiliaryAttachments.M82Action)
                        .withActionTransform(new Transform().withPosition(0, 0, 1.5F))
                        //.withTextureName("AWP")
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
                            GlStateManager.translate(-2.2F, -1.1F, 2.4F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.705000f, 4.705000f, -3.445000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.230000f, -1.740000f, 0.140000f)
                                        .withScale(3, 3, 3)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.250000f, 0.265000f, -0.980000f)
                                        .withBBRotation(-6.645F, -32.8876F, 56.8877F)
                                        .withScale(2.6F, 2.6F, 4)
                                        .withPivotPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.160000f, 0.060000f, 1.640000f)
                                        .withBBRotation(5.4027F, 4.7805F, -1.6694F)
                                        .withScale(3, 3, 3)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("m82", AuxiliaryAttachments.M82Action)
                        .setupModernMagazineAnimations("m82",
                                Magazines.M82Mag)

                        .withFirstPersonCustomPositioning(Magazines.M82Mag, (renderContext) -> {
//           	 GlStateManager.translate(0f, 0.8f, -0.3f);
//           	 GlStateManager.rotate(-20F, 1f, 0f, 0f);
                        })

                        .withThirdPersonPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
//                        GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
//                        GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
//                        GlStateManager.rotate(65.000000f, 0f, 0f, 1f);
//                        GlStateManager.translate(0.150000f, 1.149999f, 0.175000f);
//                    }, 200, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.5F, -1.8F, 3.4F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.5F, -1.8F, 3.4F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.5F, -1.8F, 3.4F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 260, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.5F, -1.8F, 3.4F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 400, 150),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.5F, -1.8F, 3.4F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 60),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.5F, -1.8F, 3.4F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 100, 170),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.8F, -2F, 4F);
                                    GlStateManager.rotate(-60F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 350, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.8F, -2F, 4F);
                                    GlStateManager.rotate(-60F, 0f, 1f, 0f);
                                    GlStateManager.rotate(100F, 1f, 0f, 0f);
                                }, 220, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.8F, -2F, 4F);
                                    GlStateManager.rotate(-60F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 220, 0)
//                }, 100, 0)
                        )

                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M82Action.getRenderablePart(),
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
                                    GlStateManager.translate(0f, 0f, 1.3f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.13f, 1.18f, -0.7f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0f, 0.12f, 0.8f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(-0.005f, 0.15f, 1.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0f, 0.05f, 1.2f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.11f, 0.6f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.1f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.08f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.1f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.14f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.14f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.135f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.11f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.12f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.12f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.11f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.11f, 0.9f);
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
                .withSpawnEntityDamage(25f)
                .withSpawnEntityGravityVelocity(0f)


                .build(MWC.modContext);
    }
}
