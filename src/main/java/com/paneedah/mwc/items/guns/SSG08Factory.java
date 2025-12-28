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

public class SSG08Factory implements GunFactory {


    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("ssg_08")
                .withFireRate(0.16f)
                .withEjectRoundRequired()
                .withEjectSpentRoundSound("ssg08_boltaction")
                .withRecoil(10f)
                .withZoom(0.8f)
                .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
                .withMaxShots(1)
                .withShootSound("ssg08")
                .withPumpTimeout(1100)
                .withSilencedShootSound("snipersilencer")
                .withReloadSound("ssg08_reload")
                .withUnloadSound("ssg08_unload")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(40)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.08f)
                .withShellCasingEjectEnabled(false)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        4f, // x
                        6f, // y
                        8f) // z

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withCompatibleAttachment(Magazines.SSG08Mag, (model) -> {
//        	GlStateManager.translate(0f, 0.5f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.SSG08BoltAction1, true, (model) -> {
//        	GlStateManager.translate(-0.105F, -0.585F, 0.63F);
//            GlStateManager.scale(0.62f, 0.62f, 0.5f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.SSG08BoltAction2, true, (model) -> {
//        	GlStateManager.translate(-0.105F, -0.585F, 0.63F);
//            GlStateManager.scale(0.62f, 0.62f, 0.5f);
                })
                .withCompatibleAttachment(Attachments.SSG08Chassis, true, (model) -> {
                    if (model instanceof SSG08Chassis) {
//                GlStateManager.translate(-0.055F, -1.35F, -4.6F);
//                GlStateManager.scale(0.8F, 0.68F, 1F);
                    } else if (model instanceof AKRail) {
                        GlStateManager.translate(-0.195F, -1.39F, -2.85F);
                        GlStateManager.scale(0.55F, 0.55F, 0.7F);
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GlStateManager.translate(-0.195F, -1.45F, -2.7F);
                    GlStateManager.scale(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })

                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.273F, -1.47F, -1.3F);
                    GlStateManager.scale(0.63F, 0.63F, 0.63F);
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
                    GlStateManager.translate(-0.175F, -1.22F, -1.7F);
                    GlStateManager.scale(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
                    GlStateManager.translate(-0.153F, -1.33F, -2.6F);
                    GlStateManager.scale(0.44F, 0.44F, 0.44F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.076F, -0.67F, 4.0251F);
                        GlStateManager.scale(0.04F, 0.04F, 0.04F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GlStateManager.translate(-0.145F, -1.92F, -2F);
                    GlStateManager.scale(0.3F, 0.3F, 0.3F);
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
                    GlStateManager.translate(-0.071F, -1.29F, -2F);
                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GlStateManager.translate(-0.07F, -1.28F, -1.7F);
                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.68F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(-0.052F, -1.35F, -1.7F);
                    GlStateManager.scale(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(-0.052F, -1.35F, -1.7F);
                    GlStateManager.scale(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GlStateManager.translate(-0.052F, -1.35F, -1.9F);
                    GlStateManager.scale(0.55F, 0.55F, 0.55F);
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
                    GlStateManager.translate(-0.3F, -1.45F, -1.1F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(0.395F, -0.33F, -0.1F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(-0.045F, -1.34F, -1.6F);
                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GlStateManager.translate(-0.045F, -1.34F, -1.6F);
                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GlStateManager.translate(-0.171F, -1.5F, -1.5F);
                    GlStateManager.scale(0.33F, 0.33F, 0.33F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.171F, -1.5F, -1.5F);
                    GlStateManager.scale(0.33F, 0.33F, 0.33F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GlStateManager.translate(-0.18F, -0.3F, -5.7F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                })
                .withTextureNames("SSG08")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new SSG08())
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
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                            GlStateManager.translate(0.100000f, 2.350000f, 2.275000f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(2F, 0f, 0f, 1f);
                            GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                            GlStateManager.translate(-0.175000f, 1.125000f, -0.000000f);

//                GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
//                GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
//                GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
//                GlStateManager.rotate(75.000000f, 0f, 0f, 1f);
//                GlStateManager.translate(0.350000f, 1.374999f, 0.100000f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(2F, 0f, 0f, 1f);
                            GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                            GlStateManager.translate(-0.175000f, 1.125000f, 0.600000f);
                            GlStateManager.rotate(-3f, 1f, 0f, 0f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.SSG08BoltAction1.getRenderablePart(), (renderContext) -> {
//            	 GlStateManager.translate(0.0f, 0.0f, 0.8f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.SSG08BoltAction2.getRenderablePart(), (renderContext) -> {
//            	GlStateManager.translate(-0.9f, -0.25f, 0.8f);
//            	GlStateManager.rotate(45f, 0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningEjectSpentRound(

                                // right hand grabs bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(6F, 0f, 0f, 1f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.135000f, -0.000000f);
                                }, 170, 0),

                                // right hand pushes bolt action up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(3F, 0f, 0f, 1f);
//                        GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.135000f, -0.04000f);
                                }, 130, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(5F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.4F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.16000f, 0.100000f);
                                }, 70, 0),

                                // right hand pulls back bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.rotate(9F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2.5F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.16000f, 0.300000f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2.3F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.165000f, 0.300000f);
                                }, 40, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.165000f, 0.30000f);
                                }, 70, 0),

                                // right hand pushes bolt action forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(6F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.125000f, -0.000000f);
                                }, 100, 0),

                                // right hand pulls down bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(2F, 0f, 0f, 1f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.125000f, -0.000000f);
                                }, 80, 0)

                        )

                        .withFirstPersonPositioningEjectSpentRoundAimed(
                                // right hand grabs bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(6F, 0f, 0f, 1f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(0.275000f, 1.135000f, 0.200000f);
                                }, 170, 0),

                                // right hand pushes bolt action up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(4F, 0f, 0f, 1f);
//                        GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(0.275000f, 1.135000f, 0.200000f);
                                }, 130, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(5F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.4F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(0.275000f, 1.16000f, 0.300000f);
                                }, 70, 0),

                                // right hand pulls back bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.rotate(9F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2.5F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(0.275000f, 1.16000f, 0.500000f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.rotate(7F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2.3F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(0.275000f, 1.165000f, 0.500000f);
                                }, 40, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(0.275000f, 1.165000f, 0.50000f);
                                }, 70, 0),

                                // right hand pushes bolt action forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(6F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(0.275000f, 1.125000f, 0.200000f);
                                }, 100, 0),

                                // right hand pulls down bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(2F, 0f, 0f, 1f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(0.275000f, 1.125000f, 0.200000f);
                                }, 80, 0)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.SSG08BoltAction1.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.0f, 0.0f, 0.8f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.0f, 0.0f, 0.8f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.0f, 0.0f, 0.8f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.SSG08BoltAction2.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0.8f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0.8f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0.8f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.SSG08BoltAction1.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.0f, 0.0f, 0.8f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.0f, 0.0f, 0.8f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.0f, 0.0f, 0.8f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.SSG08BoltAction2.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0.8f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0.8f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0.8f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )


                        .withFirstPersonPositioningReloading(

                                // reload

                                // left hand reaches down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(-14.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-13.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, 1.329999f, -0.150000f);
                                }, 200, 0),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(-16.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-17.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, 1.229999f, -0.150000f);
                                }, 350, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(-15.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-13.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, 1.219999f, -0.150000f);
                                }, 60, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(-15.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.00000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, 1.229999f, -0.150000f);
                                }, 70, 0),

                                // mag inserts

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(-18.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-19.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, 1.119999f, -0.150000f);
                                }, 140, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(-17.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-16.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, 1.169999f, -0.150000f);
                                }, 80, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(-17.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-17.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, 1.149999f, -0.150000f);
                                }, 110, 0),

                                // bolt action

                                // right hand grabs bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(0F, 0f, 0f, 1f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.135000f, -0.000000f);
                                }, 250, 0),

                                // right hand pushes bolt action up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(4F, 0f, 0f, 1f);
//                        GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.135000f, -0.000000f);
                                }, 130, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(5F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.4F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.16000f, 0.100000f);
                                }, 70, 0),

                                // right hand pulls back bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.rotate(9F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2.5F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.16000f, 0.300000f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2.3F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.165000f, 0.300000f);
                                }, 40, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.165000f, 0.30000f);
                                }, 70, 0),

                                // right hand pushes bolt action forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(6F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.125000f, -0.000000f);
                                }, 100, 0),

                                // right hand pulls down bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(2F, 0f, 0f, 1f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.125000f, -0.000000f);
                                }, 80, 0)

                        )

                        .withFirstPersonPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(-8.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, 1.139999f, -0.150000f);
                                }, 220, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(-13.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, 1.309999f, -0.150000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(-14.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-12.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.550000f, 1.309999f, -0.150000f);
                                }, 180, 0))

                        .withFirstPersonCustomPositioningReloading(Magazines.SSG08Mag,
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0f, 2f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0f, 0.5f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0f, 0.5f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0f, 0.5f, 0f);
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

                        .withFirstPersonCustomPositioningUnloading(Magazines.SSG08Mag,
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0f, 0.5f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0f, 2.5f, 0f);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.SSG08BoltAction1.getRenderablePart(),
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
                                    GlStateManager.translate(0.0f, 0.0f, 0.8f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.0f, 0.0f, 0.8f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.0f, 0.0f, 0.8f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.SSG08BoltAction2.getRenderablePart(),
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
                                    GlStateManager.translate(-0.9f, -0.25f, 0f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0.8f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0.8f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0.8f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.9f, -0.25f, 0f);
                                    GlStateManager.rotate(45f, 0f, 0f, 1f);

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.725000f, -0.050000f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, 1.374999f, 0.100000f);
                                }, 350, 600)
                        )

                        .withThirdPersonPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.52F, 0.52F, 0.52F);
                                    GlStateManager.translate(-3.3F, 0.2F, 3F);
                                    GlStateManager.rotate(-70F, 0f, 1f, 0f);
                                    GlStateManager.rotate(95F, 1f, 0f, 0f);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 370, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.52F, 0.52F, 0.52F);
                                    GlStateManager.translate(-3.3F, -0.2F, 3.3F);
                                    GlStateManager.rotate(-70F, 0f, 1f, 0f);
                                    GlStateManager.rotate(100F, 1f, 0f, 0f);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 200, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.52F, 0.52F, 0.52F);
                                    GlStateManager.translate(-3.3F, -0.2F, 3.3F);
                                    GlStateManager.rotate(-70F, 0f, 1f, 0f);
                                    GlStateManager.rotate(100F, 1f, 0f, 0f);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 140, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.52F, 0.52F, 0.52F);
                                    GlStateManager.translate(-2.5F, 0F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 270, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.52F, 0.52F, 0.52F);
                                    GlStateManager.translate(-2.5F, 0F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 240, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.52F, 0.52F, 0.52F);
                                    GlStateManager.translate(-2.5F, 0F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 500, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.52F, 0.52F, 0.52F);
                                    GlStateManager.translate(-2.5F, 0F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.52F, 0.52F, 0.52F);
                                    GlStateManager.translate(-3.3F, -0.2F, 3.3F);
                                    GlStateManager.rotate(-70F, 0f, 1f, 0f);
                                    GlStateManager.rotate(100F, 1f, 0f, 0f);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 280, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.52F, 0.52F, 0.52F);
                                    GlStateManager.translate(-3.3F, -0.2F, 3.3F);
                                    GlStateManager.rotate(-70F, 0f, 1f, 0f);
                                    GlStateManager.rotate(100F, 1f, 0f, 0f);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 220, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.52F, 0.52F, 0.52F);
                                    GlStateManager.translate(-3.3F, 0.2F, 3F);
                                    GlStateManager.rotate(-70F, 0f, 1f, 0f);
                                    GlStateManager.rotate(95F, 1f, 0f, 0f);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 160, 0))

                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-1.39f, -1.13f, 1.5f);
                                    GlStateManager.rotate(70f, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-1.39f, -1.13f, 1.5f);
                                    GlStateManager.rotate(70f, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-1.39f, -1.13f, 1.5f);
                                    GlStateManager.rotate(70f, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-1.39f, -1.13f, 1.5f);
                                    GlStateManager.rotate(70f, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-1.39f, -1.13f, 1.5f);
                                    GlStateManager.rotate(70f, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-1.39f, -1.13f, 1.5f);
                                    GlStateManager.rotate(70f, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(25F, 0f, 1f, 0f);
                                    GlStateManager.rotate(12F, 0f, 0f, 1f);
                                    GlStateManager.rotate(45F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.125000f, 0.400000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(30F, 0f, 1f, 0f);
                                    GlStateManager.rotate(12F, 0f, 0f, 1f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.125000f, 0.300000f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(35F, 0f, 1f, 0f);
                                    GlStateManager.rotate(12F, 0f, 0f, 1f);
                                    GlStateManager.rotate(25F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.125000f, 0.200000f);
                                }, 120, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8F, 0f, 0f, 1f);
                                    GlStateManager.rotate(15F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.125000f, 0.100000f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(3F, 0f, 0f, 1f);
                                    GlStateManager.rotate(3F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.125000f, -0.15000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(3F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1F, 1f, 0f, 0f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.125000f, -0.100000f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(2F, 0f, 0f, 1f);
                                    GlStateManager.scale(3.00000f, 3.00000f, 3.00000f);
                                    GlStateManager.translate(-0.175000f, 1.125000f, -0.000000f);
                                }, 100, 0)

                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.59F, -0.43F, 0.5F);
                                    GlStateManager.rotate(90F, 0f, 0f, 1f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.59F, -0.43F, -0.01F);
                                    GlStateManager.rotate(90F, 0f, 0f, 1f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.translate(0.35f, 0.8f, 0.4f);

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.28f, 0.6f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.24f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.265f, 0.7f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.21f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.27f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.22f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.2f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.275f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.275f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.275f, 0.6f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.273f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.273f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.283f, 0.6f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.283f, 0.6f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.translate(0.35f, 0.8f, 0.8f);
                            GlStateManager.rotate(-2F, 1f, 0f, 0f);

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.28f, 0.3f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.24f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.265f, 0.4f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.21f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.27f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.22f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.2f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.275f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.275f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.275f, 0.3f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.273f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.273f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.283f, 0.6f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.283f, 0.6f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                            GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.100000f, 1.300000f, 0.500000f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                            GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.600000f, 0.725000f, -0.450000f);
                        })

                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                            GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.600000f, 0.725000f, -0.450000f);
                        })
                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    RenderContext<?> rc = renderContext;
                                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                            AttachmentCategory.GRIP, rc.getWeaponInstance());
                                    if (activeAttachment == Attachments.Bipod) {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                    } else {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                    }
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.475000f, 0.225000f);

//                    	 GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.475000f, 0.225000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.350000f, 0.175000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.475000f, 0.225000f);
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.350000f, 0.175000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.475000f, 0.225000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(

                                // reload

                                // left hand reaches down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.280000f, -0.430000f, 0.040000f);
                                }, 50, 200),

                                // mag touches gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.190000f, -0.480000f, 0.110000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.190000f, -0.480000f, 0.110000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.190000f, -0.480000f, 0.110000f);
                                }, 50, 200),

                                // mag inserts

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.350000f, 0.010000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.350000f, 0.010000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.350000f, 0.010000f);
                                }, 50, 200),

                                // bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                }, 50, 200)

                        )

                        .withFirstPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.900000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.900000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.900000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.900000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.900000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.900000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.900000f, 0.175000f);
                                }, 50, 200),

                                // bolt action

                                // right hand grabs bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.300000f, 0.015000f);
                                }, 160, 0),

                                // right hand pushes bolt action up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.255000f, -0.230000f, 0.045000f);
                                }, 110, 70),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.255000f, -0.230000f, 0.045000f);
                                }, 110, 70),

                                // right hand pulls back bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.405000f, -0.460000f, -0.115000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.405000f, -0.460000f, -0.115000f);
                                }, 20, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.405000f, -0.460000f, -0.115000f);
                                }, 70, 0),

                                // right hand pushes bolt action forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.255000f, -0.230000f, 0.045000f);
                                }, 100, 0),

                                // right hand pulls down bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.300000f, 0.015000f);
                                }, 80, 0)

                        )

                        .withFirstPersonLeftHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.350000f, 0.010000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.190000f, -0.480000f, 0.110000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.280000f, -0.430000f, 0.040000f);
                                }, 50, 200))

                        .withFirstPersonRightHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.900000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.900000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.900000f, 0.175000f);
                                }, 50, 200))

                        .withFirstPersonLeftHandPositioningEjectSpentRound(
                                new Transition((renderContext) -> {
                                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                            AttachmentCategory.GRIP, rc.getWeaponInstance());
                                    if (activeAttachment == Attachments.Bipod) {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                    } else {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                    }
                                }, 50, 200),

                                new Transition((renderContext) -> {
                                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                            AttachmentCategory.GRIP, rc.getWeaponInstance());
                                    if (activeAttachment == Attachments.Bipod) {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                    } else {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                    }
                                }, 50, 200),
                                new Transition((renderContext) -> {
                                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                            AttachmentCategory.GRIP, rc.getWeaponInstance());
                                    if (activeAttachment == Attachments.Bipod) {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                    } else {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                    }
                                }, 50, 200),
                                new Transition((renderContext) -> {
                                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                            AttachmentCategory.GRIP, rc.getWeaponInstance());
                                    if (activeAttachment == Attachments.Bipod) {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                    } else {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                    }
                                }, 50, 200),
                                new Transition((renderContext) -> {
                                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                            AttachmentCategory.GRIP, rc.getWeaponInstance());
                                    if (activeAttachment == Attachments.Bipod) {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                    } else {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                    }
                                }, 50, 200),
                                new Transition((renderContext) -> {
                                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                            AttachmentCategory.GRIP, rc.getWeaponInstance());
                                    if (activeAttachment == Attachments.Bipod) {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                    } else {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                    }
                                }, 50, 200),
                                new Transition((renderContext) -> {
                                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                            AttachmentCategory.GRIP, rc.getWeaponInstance());
                                    if (activeAttachment == Attachments.Bipod) {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                    } else {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                    }
                                }, 50, 200),
                                new Transition((renderContext) -> {
                                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                            AttachmentCategory.GRIP, rc.getWeaponInstance());
                                    if (activeAttachment == Attachments.Bipod) {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.225000f, -0.375000f, 0.250000f);
                                    } else {
                                        GlStateManager.scale(4f, 4f, 4f);
                                        GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                        GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                        GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                        GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                    }
                                }, 50, 200)

                        )

                        .withFirstPersonRightHandPositioningEjectSpentRound(
                                // right hand grabs bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.300000f, 0.015000f);
                                }, 160, 0),

                                // right hand pushes bolt action up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.255000f, -0.230000f, 0.045000f);
                                }, 110, 70),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.255000f, -0.230000f, 0.045000f);
                                }, 110, 70),

                                // right hand pulls back bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.405000f, -0.460000f, -0.115000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.405000f, -0.460000f, -0.115000f);
                                }, 20, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.405000f, -0.460000f, -0.115000f);
                                }, 70, 0),

                                // right hand pushes bolt action forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.255000f, -0.230000f, 0.045000f);
                                }, 100, 0),

                                // right hand pulls down bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.300000f, 0.015000f);
                                }, 80, 0)

                        )

                        .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 50, 200)

                        )

                        .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
                                // right hand grabs bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.300000f, 0.015000f);
                                }, 160, 0),

                                // right hand pushes bolt action up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.255000f, -0.230000f, 0.045000f);
                                }, 110, 70),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.255000f, -0.230000f, 0.045000f);
                                }, 110, 70),

                                // right hand pulls back bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.405000f, -0.460000f, -0.115000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.405000f, -0.460000f, -0.115000f);
                                }, 20, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.405000f, -0.460000f, -0.115000f);
                                }, 70, 0),

                                // right hand pushes bolt action forward

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.255000f, -0.230000f, 0.045000f);
                                }, 100, 0),

                                // right hand pulls down bolt action

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.300000f, 0.015000f);
                                }, 80, 0)

                        )

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.350000f, 0.175000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.450000f, -0.025000f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.475000f, 0.225000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.475000f, 0.225000f);
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
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, -0.130000f, 0.055000f);
                                }, 200, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.475000f, 0.225000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.475000f, 0.225000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.475000f, 0.225000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.475000f, 0.225000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.475000f, 0.225000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.475000f, 0.225000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.475000f, 0.225000f);
                                }, 50, 200))

                        .build())
                .withSpawnEntityDamage(27f)
                .withSpawnEntityGravityVelocity(0f)


                .build(MWC.modContext);
    }
}
