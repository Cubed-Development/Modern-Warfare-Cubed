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

public class DSR1Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("dsr1")
                .withFireRate(0.16f)
                .withEjectRoundRequired()
                .withEjectSpentRoundSound("l96a1_bolt_action")
                .withRecoil(8f)
                .withZoom(0.8f)
                .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
                .withMaxShots(1)
                .withShootSound("l96a1")
                .withPumpTimeout(1000)
                .withSilencedShootSound("sniper_silenced")
                .withReloadSound("l96a1_reload")
                .withUnloadSound("m40a6_unload")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(40)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.08f)
                .withFlashOffsetY(() -> 0.08f)
                .withShellCasingEjectEnabled(false)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        3f, // x
                        2f, // y
                        7f) // z

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
                .withCompatibleAttachment(Attachments.DSR1Handguard, true, (model) -> {
//            GlStateManager.translate(0.01f, -0.19f, -0.4f);
//            GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.DSR1HandguardRailed, (model) -> {
//          GlStateManager.translate(0.01f, -0.19f, -0.4f);
//          GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.DSR1Barrel, true, (model) -> {
//          GlStateManager.translate(0.01f, -0.19f, -0.4f);
//          GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.DSR1BarrelLong, (model) -> {
//          GlStateManager.translate(0.01f, -0.19f, -0.4f);
//          GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Magazines.DSR1Mag, (model) -> {
//        	GlStateManager.translate(0F, 0.6F, 0F);
                })
                .withCompatibleAttachment(Magazines.DSR1MagExt, (model) -> {
//          GlStateManager.scale(1.55F, 1.6F, 1.6F);
//          GlStateManager.translate(-0.28F, 0.51F, -0.97F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.DSR1BoltAction, true, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.DSR1BoltActionMain, true, (model) -> {
//        	GlStateManager.rotate(50F, 0f, 0f, 1f);
//            GlStateManager.translate(-0.65F, 0.55F, 0F);
                })
                .withCompatibleAttachment(Attachments.HK416FrontSight, true, (model) -> {
                    if (model instanceof G95_upright_frontsights) {
                        GlStateManager.translate(-0.147F, -1.28F, -3.5F);
                        GlStateManager.scale(0.25F, 0.25F, 0.25F);
                    }
                })
                .withCompatibleAttachment(Attachments.HK416RearSights, true, (model) -> {
                    if (model instanceof G95_upright_rearsights) {
                        GlStateManager.translate(-0.148F, -1.28F, 0F);
                        GlStateManager.scale(0.25F, 0.25F, 0.25F);
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GlStateManager.translate(-0.21F, -1.2F, -2F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.29F, -1.22F, -0.5F);
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
                    GlStateManager.translate(-0.175F, -0.93F, -0.6F);
                    GlStateManager.scale(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
                    GlStateManager.translate(-0.153F, -1.05F, -1.2F);
                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.076F, -0.67F, 4.0251F);
                        GlStateManager.scale(0.04F, 0.04F, 0.04F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GlStateManager.translate(-0.072F, -1.03F, -1);
                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GlStateManager.translate(-0.072F, -1.03F, -1);
                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.68F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(-0.047F, -1.07F, -1F);
                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(-0.047F, -1.07F, -1F);
                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GlStateManager.translate(-0.047F, -1.07F, -1F);
                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
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
                    GlStateManager.translate(-0.28F, -1.23F, -1F);
                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(0.395F, -0.33F, -0.1F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(-0.048F, -1.07F, -0.7F);
                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GlStateManager.translate(-0.048F, -1.07F, -0.7F);
                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GlStateManager.translate(-0.175F, -1.23F, -1);
                    GlStateManager.scale(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.175F, -1.23F, -1);
                    GlStateManager.scale(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM2, (player, stack) -> {
                    GlStateManager.translate(-0.12F, -0.68F, -0.5F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.005F, -0.89F, -1.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GlStateManager.translate(-0.18F, -0.15F, -3F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                })
                .withCompatibleAttachment(Attachments.Silencer762x51, (model) -> {
                    GlStateManager.translate(-0.22F, -1.1F, -7.2F);
                    GlStateManager.scale(1.2F, 1.2F, 1.5F);
                })
                .withTextureNames("dsr1")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new DSR1())
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
                            GlStateManager.translate(-1.8F, -1F, 2F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(7f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.150000f, 0.950000f, -0.625000f);

//                GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
//                GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
//                GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
//                GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
//                GlStateManager.translate(-0.500000f, 1.000000f, -1.800000f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(7f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.150000f, 0.950000f, -0.125000f);
                            GlStateManager.rotate(-1f, 1f, 0f, 0f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.DSR1BoltAction.getRenderablePart(), (renderContext) -> {
//            	GlStateManager.translate(0F, 0F, 1.05F);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.DSR1BoltActionMain.getRenderablePart(), (renderContext) -> {
//            	GlStateManager.rotate(50F, 0f, 0f, 1f);
//                GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                        })

                        .withFirstPersonPositioningEjectSpentRound(

                                // right hand grabs bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44.5F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.950000f, -0.62f);
                                }, 170, 0),

                                // right hand pushes bolt action up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(12f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.8F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.950000f, -0.60f);
                                }, 130, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44.2F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.950000f, -0.60f);
                                }, 70, 0),

                                // right hand pulls back bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(43.9F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1.2F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.950000f, -0.54f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(43.8F, 0f, 1f, 0f);
                                    GlStateManager.rotate(4f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.96f, -0.52f);
                                }, 40, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(43.8F, 0f, 1f, 0f);
                                    GlStateManager.rotate(5f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.97f, -0.53f);
                                }, 70, 0),

                                // right hand pushes bolt action forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(9f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.950000f, -0.62f);
                                }, 100, 0),

                                // right hand pulls down bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44.7F, 0f, 1f, 0f);
                                    GlStateManager.rotate(7f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.950000f, -0.61f);
                                }, 80, 0)

                        )

                        .withFirstPersonPositioningEjectSpentRoundAimed(
                                // right hand grabs bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44.5F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.30000f, 0.950000f, -0.62f);
                                }, 170, 0),

                                // right hand pushes bolt action up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(12f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.8F, 1f, 0f, 0f);
                                    GlStateManager.translate(0.30000f, 0.950000f, -0.60f);
                                }, 130, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44.2F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                    GlStateManager.translate(0.30000f, 0.950000f, -0.60f);
                                }, 70, 0),

                                // right hand pulls back bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(43.9F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1.2F, 1f, 0f, 0f);
                                    GlStateManager.translate(0.30000f, 0.950000f, -0.54f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(43.8F, 0f, 1f, 0f);
                                    GlStateManager.rotate(4f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1F, 1f, 0f, 0f);
                                    GlStateManager.translate(0.30000f, 0.96f, -0.52f);
                                }, 40, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(43.8F, 0f, 1f, 0f);
                                    GlStateManager.rotate(5f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1F, 1f, 0f, 0f);
                                    GlStateManager.translate(0.30000f, 0.97f, -0.53f);
                                }, 70, 0),

                                // right hand pushes bolt action forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(9f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                    GlStateManager.translate(0.30000f, 0.950000f, -0.62f);
                                }, 100, 0),

                                // right hand pulls down bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44.7F, 0f, 1f, 0f);
                                    GlStateManager.rotate(7f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.30000f, 0.950000f, -0.61f);
                                }, 80, 0)

                        )

//            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.Bullet.getRenderablePart(),
//                    new Transition((renderContext) -> { // Reload position
////                        GlStateManager.scale(0.4F, 0.4F, 0.6F);
////                        GlStateManager.translate(-0.52F, -2.9F, -3.5F);
////                        GlStateManager.rotate(90f, 1f, 0f, 0f);
//                    }, 250, 50),
//                    new Transition((renderContext) -> { // Reload position
////                        GlStateManager.translate(0F, -0.5F, 0F);
////                        GlStateManager.rotate(60f, 1f, 0f, 0f);
////                        GlStateManager.rotate(45f, 0f, 1f, 0f);
//                    }, 250, 300),
//                    new Transition((renderContext) -> { // Reload position
////                        GlStateManager.scale(0.4F, 0.4F, 0.6F);
//                        GlStateManager.translate(-2F, -1F, -6F);
//                        GlStateManager.rotate(60f, 1f, 0f, 0f);
//                        GlStateManager.rotate(45f, 0f, 1f, 0f);
//                    }, 250, 0),
//                    new Transition((renderContext) -> { // Reload position
////                        GlStateManager.scale(0.4F, 0.4F, 0.6F);
//                        GlStateManager.translate(-4F, 0F, -6F);
//                        GlStateManager.rotate(60f, 1f, 0f, 0f);
//                        GlStateManager.rotate(45f, 0f, 1f, 0f);
//                    }, 250, 0),
//                    new Transition((renderContext) -> { // Reload position
//                        GlStateManager.translate(-0.52F, 3F, -6F);
//                        GlStateManager.rotate(60f, 1f, 0f, 0f);
//                        GlStateManager.rotate(45f, 0f, 1f, 0f);
//                    }, 250, 0)
//                    
//                    )

                        .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.DSR1BoltAction.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.DSR1BoltActionMain.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.6F, 0F);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.6F, 0F);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.6F, 1F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.6F, 1F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.6F, 1F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.6F, 0F);

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.DSR1BoltAction.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.DSR1BoltActionMain.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.55F, 0F);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.55F, 0F);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.55F, 1F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.55F, 1F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.55F, 1F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.55F, 0F);

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonPositioningReloading(

                                // reload

                                // left hand reaches down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-13.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.00000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(6.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.98f, -1.800000f);
                                }, 270, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.95f, -1.800000f);
                                }, 290, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-14.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.95f, -1.800000f);
                                }, 60, 0),

                                // mag goes up halfway

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-14.800000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.9f, -1.800000f);
                                }, 60, 0),

                                // mag inserts

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-16.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.84f, -1.800000f);
                                }, 40, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-16.900000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 0.87f, -1.6f);
                                }, 70, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-16.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.4f, 0.88f, -1.4f);
                                }, 80, 0),

                                // bolt action

// right hand grabs bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44.5F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.3f, 0.950000f, -1.3f);
                                }, 170, 0),

                                // right hand pushes bolt action up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(12f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.8F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.2f, 0.950000f, -1f);
                                }, 130, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44.2F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.950000f, -0.7f);
                                }, 70, 0),

                                // right hand pulls back bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(43.9F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1.2F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.950000f, -0.54f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(43.8F, 0f, 1f, 0f);
                                    GlStateManager.rotate(4f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.96f, -0.52f);
                                }, 40, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(43.8F, 0f, 1f, 0f);
                                    GlStateManager.rotate(5f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.97f, -0.53f);
                                }, 70, 0),

                                // right hand pushes bolt action forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(9f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.150000f, 0.950000f, -0.62f);
                                }, 100, 0),

                                // right hand pulls down bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44.7F, 0f, 1f, 0f);
                                    GlStateManager.rotate(7f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.950000f, -0.61f);
                                }, 80, 0)

                        )

                        .withFirstPersonPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-14.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.000000f, -1.800000f);
                                }, 310, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-14.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.05f, -1.800000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-13.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.05f, -1.800000f);
                                }, 180, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-12.400000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.1f, -1.800000f);
                                }, 200, 0))

                        .withFirstPersonCustomPositioningReloading(Magazines.DSR1Mag,
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 1F, 0F);
//                        GlStateManager.rotate(20f, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.4F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.4F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.2F, 0F);
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

                        .withFirstPersonCustomPositioningUnloading(Magazines.DSR1Mag,
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.4F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 1F, 0F);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Magazines.DSR1MagExt,
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.2F, 0.35F);
                                    GlStateManager.rotate(20f, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.6F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.6F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.3F, 0F);
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

                        .withFirstPersonCustomPositioningUnloading(Magazines.DSR1MagExt,
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.4F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 1.6F, 1.7F);
                                    GlStateManager.rotate(30f, 1f, 0f, 0f);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.DSR1BoltAction.getRenderablePart(),
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

                                // bolt action

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.DSR1BoltActionMain.getRenderablePart(),
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

                                // bolt action

                                new Transition((renderContext) -> { // Reload position

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.6F, 0F);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.6F, 0F);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.6F, 1F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.6F, 1F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.6F, 1F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.65F, 0.6F, 0F);

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.825000f, 0.750000f, 0.000000f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, 1.349999f, 0.000000f);
                                }, 350, 600)
                        )

                        .withThirdPersonPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                                    GlStateManager.translate(-2.6F, -1F, 3.8F);
                                    GlStateManager.rotate(-70F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 370, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                                    GlStateManager.translate(-2.2F, -1F, 3.8F);
                                    GlStateManager.rotate(-60F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 200, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                                    GlStateManager.translate(-2.6F, -1F, 3.8F);
                                    GlStateManager.rotate(-70F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 140, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                                    GlStateManager.translate(-2.3F, -1F, 3.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 270, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                                    GlStateManager.translate(-2.3F, -1F, 3.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 240, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                                    GlStateManager.translate(-2.3F, -1F, 3.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 500, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                                    GlStateManager.translate(-2.3F, -1F, 3.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                                    GlStateManager.translate(-2.6F, -1F, 3.8F);
                                    GlStateManager.rotate(-70F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 280, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                                    GlStateManager.translate(-2.2F, -1F, 3.8F);
                                    GlStateManager.rotate(-60F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 220, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                                    GlStateManager.translate(-2.6F, -1F, 3.8F);
                                    GlStateManager.rotate(-70F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 160, 0))

                        .withThirdPersonCustomPositioningReloading(Magazines.DSR1Mag.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(2.2F, 3F, 1F);
                                    GlStateManager.rotate(-30f, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(2.2F, 3F, 1F);
                                    GlStateManager.rotate(-30f, 1f, 0f, 0f);
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

                        .withThirdPersonCustomPositioningReloading(Magazines.DSR1MagExt.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(2.2F, 3F, 1F);
                                    GlStateManager.rotate(-30f, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(2.2F, 3F, 1F);
                                    GlStateManager.rotate(-30f, 1f, 0f, 0f);
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

                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.DSR1BoltAction.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.05F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.DSR1BoltActionMain.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(10F, 0f, 1f, 0f);
                                    GlStateManager.rotate(17f, 0f, 0f, 1f);
                                    GlStateManager.rotate(15f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.40000f, 1.474999f, -0.225000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(21F, 0f, 1f, 0f);
                                    GlStateManager.rotate(12f, 0f, 0f, 1f);
                                    GlStateManager.rotate(10f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.40000f, 1.374999f, -0.225000f);
                                }, 230, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(30F, 0f, 1f, 0f);
                                    GlStateManager.rotate(7f, 0f, 0f, 1f);
                                    GlStateManager.rotate(5f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.40000f, 1.274999f, -0.325000f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(7f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.350000f, 1.274999f, -0.585000f);
                                }, 250, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.350000f, 0.76f, -0.125000f);

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.07f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.01f, 0);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.075f, 0.45f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, -0.04f, 0.4f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.05f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.05f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.03f, 0.4f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, -0.00f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, -0.00f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.07f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.07f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.06f, 0.2f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.06f, 0.4f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.055f, 0.3f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.055f, 0.3f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0.002F, 0.24f, 1f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.350000f, 0.76f, 0.125000f);
                            GlStateManager.rotate(5F, 1f, 0f, 0f);

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.07f, 0.45f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.01f, -0.05f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.075f, 0.4f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, -0.04f, 0.35f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.05f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.05f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.03f, 0.4f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, -0.00f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, -0.00f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.07f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.07f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.06f, 0.2f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.06f, 0.4f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.055f, 0.3f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.055f, 0.3f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0.002F, 0.24f, 1f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.200000f, 1.149999f, -0.325000f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(3f, 3f, 3f);
                            GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.575000f, 0.675000f, -0.600000f);
                        })

                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);

//                         GlStateManager.scale(3f, 3f, 3f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);

//                         GlStateManager.scale(4f, 4f, 4f);
//                         GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
//                         GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
//                         GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
//                         GlStateManager.translate(0.350000f, -0.525000f, 0.200000f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);

                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, 0.050000f, 0.250000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(

                                // reload

                                // left hand reaches down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.975000f, 0.425000f);
                                }, 50, 200),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.975000f, 0.425000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.975000f, 0.425000f);
                                }, 50, 200),

                                //mag inserts halfway

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.200000f, -0.975000f, 0.350000f);
                                }, 50, 200),

                                // mag inserts

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.200000f, -1.000000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.200000f, -1.000000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.200000f, -1.000000f, 0.275000f);
                                }, 50, 200),

                                // bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200)

                        )

                        .withFirstPersonRightHandPositioningReloading(
                                // reload

                                // left hand reaches down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.200000f);
                                }, 50, 200),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.200000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.200000f);
                                }, 50, 200),

                                // mag goes up halfway

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.200000f);
                                }, 50, 200),

                                // mag inserts

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.200000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.200000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.200000f);
                                }, 50, 200),

                                // bolt action

                                // right hand grabs bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.275000f, 0.150000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 160, 0),

                                // right hand pushes bolt action up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.095000f, -0.250000f, 0.025000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 110, 70),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.095000f, -0.250000f, 0.025000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 110, 70),

                                // right hand pulls back bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-140.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.360000f, -0.035000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-140.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.360000f, -0.035000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 20, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-140.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.360000f, -0.035000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 70, 0),

                                // right hand pushes bolt action forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.095000f, -0.250000f, 0.025000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 100, 0),

                                // right hand pulls down bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.275000f, 0.150000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 80, 0)

                        )

                        .withFirstPersonLeftHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.200000f, -1.000000f, 0.275000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.975000f, 0.425000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.975000f, 0.425000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.975000f, 0.425000f);
                                }, 50, 200))

                        .withFirstPersonRightHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.200000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.200000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.200000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.525000f, 0.200000f);
                                }, 50, 200))

                        .withFirstPersonLeftHandPositioningEjectSpentRound(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200)

                        )

                        .withFirstPersonRightHandPositioningEjectSpentRound(
                                // right hand grabs bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.275000f, 0.150000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 160, 0),

                                // right hand pushes bolt action up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.095000f, -0.250000f, 0.025000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 110, 70),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.095000f, -0.250000f, 0.025000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 110, 70),

                                // right hand pulls back bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-140.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.360000f, -0.035000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-140.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.360000f, -0.035000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 20, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-140.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.360000f, -0.035000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 70, 0),

                                // right hand pushes bolt action forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.095000f, -0.250000f, 0.025000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 100, 0),

                                // right hand pulls down bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.275000f, 0.150000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 80, 0)

                        )

                        .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, -0.200000f, 0.175000f);
                                }, 50, 200)

                        )

                        .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
                                // right hand grabs bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.275000f, 0.150000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 160, 0),

                                // right hand pushes bolt action up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.095000f, -0.250000f, 0.025000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 110, 70),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.095000f, -0.250000f, 0.025000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 110, 70),

                                // right hand pulls back bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-140.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.360000f, -0.035000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-140.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.360000f, -0.035000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 20, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-140.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.360000f, -0.035000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 70, 0),

                                // right hand pushes bolt action forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.095000f, -0.250000f, 0.025000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 100, 0),

                                // right hand pulls down bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.275000f, 0.150000f);

                                    GlStateManager.translate(0.350000f, -0.400000f, -0.175000f);
                                }, 80, 0)

                        )

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5.5f, 5.5f, 5.5f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.175000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.225000f, 0.000000f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 250, 50))

                        .withThirdPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.125000f, -0.025000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.125000f, -0.025000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.125000f, -0.025000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.075000f, -0.025000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.075000f, -0.100000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.075000f, -0.100000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.075000f, -0.025000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.125000f, -0.025000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.125000f, -0.025000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.125000f, -0.025000f);
                                }, 50, 200))

                        .withThirdPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.150000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.150000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.175000f, 0.150000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.150000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.150000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.150000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.150000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.175000f, 0.150000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.150000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.150000f);
                                }, 50, 200))

                        .withFirstPersonLeftHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.450000f, -0.050000f, 0.070000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.450000f, -0.050000f, 0.070000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.450000f, -0.050000f, 0.070000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.450000f, -0.050000f, 0.070000f);
                                }, 200, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 250, 100)
                        )

                        .build())
                .withSpawnEntityDamage(14f)
                .withSpawnEntityGravityVelocity(0f)


                .build(MWC.modContext);
    }
}
