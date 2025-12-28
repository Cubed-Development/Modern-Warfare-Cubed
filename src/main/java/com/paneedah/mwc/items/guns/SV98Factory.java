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

public class SV98Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("sv98")
                .withFireRate(0.16f)
                .withEjectRoundRequired()
                .withEjectSpentRoundSound("sv98_bolt_action")
                .withRecoil(9f)
                .withZoom(0.8f)
                .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
                .withMaxShots(1)
                .withShootSound("sv98")
                .withPumpTimeout(1000)
                .withSilencedShootSound("sniper_silenced")
                .withReloadSound("sv98_reload")
                .withUnloadSound("m40a6_unload")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(40)
                .withFlashIntensity(0.4f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.09f)
                .withShellCasingEjectEnabled(false)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        3f, // x
                        2f, // y
                        6f) // z

                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Magazines.SV98Mag, (model) -> {
//            GlStateManager.scale(1.55F, 1.6F, 1.6F);
//            GlStateManager.translate(-0.28F, 0.51F, -0.97F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.SV98BoltAction, true, (model) -> {
//            GlStateManager.translate(-0.08F, 0.01F, 0.02F);

//            GlStateManager.rotate(50F, 0f, 0f, 1f);
//            GlStateManager.translate(-0.85F, 0.5F, 0F);

//              GlStateManager.rotate(50F, 0f, 0f, 1f);
//              GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GlStateManager.translate(-0.21F, -1.45F, -2.2F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.327F, -1.47F, -1.4F);
                    GlStateManager.scale(0.88F, 0.88F, 0.88F);
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
                    GlStateManager.translate(-0.19F, -1.15F, -1.6F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
                    GlStateManager.translate(-0.155F, -1.28F, -2.5F);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.076F, -0.67F, 4.0251F);
                        GlStateManager.scale(0.04F, 0.04F, 0.04F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GlStateManager.translate(-0.058F, -1.25F, -2F);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(-0.035F, -1.3F, -2F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(-0.035F, -1.3F, -2F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GlStateManager.translate(-0.035F, -1.3F, -2F);
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
                .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
                    GlStateManager.translate(-0.3F, -1.47F, -1.7F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(0.395F, -0.33F, -0.1F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(-0.035F, -1.3F, -1.7F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GlStateManager.translate(-0.035F, -1.3F, -1.7F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GlStateManager.translate(-0.19F, -1.5F, -1.7F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.19F, -1.5F, -1.7F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GlStateManager.translate(-0.2F, -0.3F, -5.85F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Silencer762x54, (model) -> {
                    GlStateManager.translate(-0.22F, -1.3F, -12.2F);
                    GlStateManager.scale(1.2F, 1.2F, 1.5F);
                })
                .withTextureNames("sv98")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new SV98())
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
                            GlStateManager.rotate(6f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.325000f, 1.299999f, -0.450000f);

//                GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(6f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.325000f, 1.299999f, -0.050000f);
                            GlStateManager.rotate(-2f, 1f, 0f, 0f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.SV98BoltAction.getRenderablePart(), (renderContext) -> {
                        })

                        .withFirstPersonPositioningEjectSpentRound(
                                // grabs bolt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(46.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(28.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.575000f);
                                }, 160, 0),
                                // bolt up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(22.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.575000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.575000f);
                                }, 60, 0),
                                // bolt back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-2.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(43.600000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(24.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.375000f);
                                }, 120, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(43.200000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(27.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.405000f);
                                }, 80, 0),
                                // bolt forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.575000f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(26.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.575000f);
                                }, 60, 0),
                                // bolt down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.575000f);
                                }, 80, 0)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.SV98BoltAction.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonPositioningEjectSpentRoundAimed(
                                // grabs bolt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(46.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(28.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, 1.624999f, -0.575000f);
                                }, 160, 0),
                                // bolt up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(22.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, 1.624999f, -0.575000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.3225000f, 1.624999f, -0.575000f);
                                }, 60, 0),
                                // bolt back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-2.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(43.600000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(24.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.3225000f, 1.624999f, -0.375000f);
                                }, 120, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(43.200000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(27.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.3225000f, 1.624999f, -0.405000f);
                                }, 80, 0),
                                // bolt forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.3225000f, 1.624999f, -0.575000f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(26.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.3225000f, 1.624999f, -0.575000f);
                                }, 60, 0),
                                // bolt down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.3225000f, 1.624999f, -0.575000f);
                                }, 80, 0)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.SV98BoltAction.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.SV98BoltAction.getRenderablePart(),
                                // hand reaches down
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                // mag touches gun
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                }, 180, 0),
                                // mag inserts
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                }, 160, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                }, 180, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 1.05F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(50F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.85F, 0.5F, 0F);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonPositioningReloading(
                                // mag reaches down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3f, 0f, 0f, 1f);
                                    GlStateManager.rotate(4f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.525000f, 1.22f, -0.450000f);
                                }, 240, 0),
                                // mag touches gun
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2f, 0f, 0f, 1f);
                                    GlStateManager.rotate(2f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.525000f, 1.199999f, -0.450000f);
                                }, 220, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(43.3F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-1f, 0f, 0f, 1f);
                                    GlStateManager.rotate(3.2f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.525000f, 1.199999f, -0.450000f);
                                }, 60, 0),
                                // mag inserts
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4f, 0f, 0f, 1f);
                                    GlStateManager.rotate(2f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.525000f, 1.13f, -0.450000f);
                                }, 110, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44.4F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2f, 0f, 0f, 1f);
                                    GlStateManager.rotate(0.6f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.525000f, 1.13f, -0.450000f);
                                }, 70, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44.2F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10f, 0f, 0f, 1f);
                                    GlStateManager.rotate(0.2f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.45f, 1.4f, -0.450000f);
                                }, 80, 0),
                                // grabs bolt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(16.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.575000f);
                                }, 160, 0),
                                // bolt up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(22.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.575000f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.575000f);
                                }, 60, 0),
                                // bolt back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-2.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(43.600000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(24.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.375000f);
                                }, 120, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(43.200000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(27.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.405000f);
                                }, 80, 0),
                                // bolt forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.575000f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(26.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.575000f);
                                }, 60, 0),
                                // bolt down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, 1.624999f, -0.575000f);
                                }, 80, 0)

                        )

                        .withFirstPersonPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3f, 0f, 0f, 1f);
                                    GlStateManager.rotate(4f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.525000f, 1.199999f, -0.450000f);
                                }, 270, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(43.4F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-1f, 0f, 0f, 1f);
                                    GlStateManager.rotate(6f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.525000f, 1.22f, -0.450000f);
                                }, 240, 0))

                        .withFirstPersonCustomPositioningReloading(Magazines.SV98Mag,
                                // hand reaches down
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.05F, 2.8F, -1F);
                                    GlStateManager.rotate(-30f, 1f, 0f, 0f);
                                }, 250, 1000),
                                // mag touches gun
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.31F, 0F);
                                }, 250, 1000),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.31F, 0F);
                                }, 180, 0),
                                // mag inserts
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                }, 160, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                }, 180, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
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

                        .withFirstPersonCustomPositioningUnloading(Magazines.SV98Mag,
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.05F, 2.8F, -1F);
                                    GlStateManager.rotate(-30f, 1f, 0f, 0f);
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.500000f, 1.300000f, 0.025000f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(1.000000f, 1.600000f, -0.200000f);
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


                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.SV98BoltAction.getRenderablePart(),
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
                                    GlStateManager.rotate(25F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(18F, 0f, 0f, 1f);
                                    GlStateManager.rotate(7F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.125000f, 1.25f, 0.750000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(35F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(18F, 0f, 0f, 1f);
                                    GlStateManager.rotate(2F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.125000f, 1f, 0.750000f);
                                }, 230, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(15F, 0f, 0f, 1f);
                                    GlStateManager.rotate(3F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.125000f, 0.875000f, 0.65f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(9F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, 0.88f, 0.45f);
                                    GlStateManager.rotate(1F, 1f, 0f, 0f);
                                }, 250, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.350000f, 0.82f, 0.425000f);

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.25f, 0.3f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.26f, 0.3f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.32f, 0.75f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.23f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.315f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.315f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.245f, 0.6f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.285f, 0.6f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.285f, 0.6f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.285f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.25f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.28f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.28f, 0.5f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.23f, 0.82f, 0.45f);
                            GlStateManager.rotate(5F, 0f, 0f, 1f);

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.25f, 0.25f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.26f, 0.3f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.32f, 0.75f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.23f, 0.8f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.315f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.315f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.245f, 0.6f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.285f, 0.6f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.285f, 0.6f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.285f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.25f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.28f, 0.5f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0F, 0.28f, 0.5f);
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
                            GlStateManager.translate(-0.300000f, 1.4f, -0.0f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(3f, 3f, 3f);
                            GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-1.225000f, 0.950000f, 0.000000f);
                        })

                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);

//                         GlStateManager.scale(4f, 4f, 4f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);

//                         GlStateManager.scale(3f, 3f, 3f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
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
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.475000f, -0.325000f, -0.100000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(
                                // reaches down to get mag
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.475000f, -0.400000f, 0.200000f);
                                }, 50, 200),
                                // mag touches gun
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.425000f, 0.175000f);
                                }, 50, 200),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.425000f, 0.175000f);
                                }, 50, 200),
                                // mag inserts
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.350000f, 0.125000f);
                                }, 50, 200),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.350000f, 0.125000f);
                                }, 50, 200),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.350000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200)

                        )

                        .withFirstPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 50, 200),
                                // grabs bolt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-140.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.150000f, -0.225000f, 0.250000f);
                                }, 50, 200),
                                // bolt up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.145000f, 0.285000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.145000f, 0.285000f);
                                }, 50, 200),
                                // bolt back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.265000f, -0.325000f, 0.015000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.265000f, -0.325000f, 0.015000f);
                                }, 50, 200),
                                // bolt forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.145000f, 0.285000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.145000f, 0.285000f);
                                }, 50, 200),
                                // bolt down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -0.175000f, 0.195000f);
                                }, 50, 200))

                        .withFirstPersonLeftHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.150000f, -0.300000f, 0.150000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.475000f, -0.125000f, 0.175000f);
                                }, 50, 200))

                        .withFirstPersonRightHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.500000f, 0.200000f);
                                }, 50, 200))

                        .withFirstPersonLeftHandPositioningEjectSpentRound(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200)

                        )

                        .withFirstPersonRightHandPositioningEjectSpentRound(
                                // grabs bolt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-140.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.150000f, -0.225000f, 0.250000f);
                                }, 50, 200),
                                // bolt up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.145000f, 0.285000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.145000f, 0.285000f);
                                }, 50, 200),
                                // bolt back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.265000f, -0.325000f, 0.015000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.265000f, -0.325000f, 0.015000f);
                                }, 50, 200),
                                // bolt forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.145000f, 0.285000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.145000f, 0.285000f);
                                }, 50, 200),
                                // bolt down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -0.175000f, 0.195000f);
                                }, 50, 200))

                        .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.490000f, -0.125000f, 0.055000f);
                                }, 50, 200)

                        )

                        .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
                                // grabs bolt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-140.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.150000f, -0.225000f, 0.250000f);
                                }, 50, 200),
                                // bolt up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.145000f, 0.285000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.145000f, 0.285000f);
                                }, 50, 200),
                                // bolt back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.265000f, -0.325000f, 0.015000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.265000f, -0.325000f, 0.015000f);
                                }, 50, 200),
                                // bolt forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.145000f, 0.285000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.145000f, 0.285000f);
                                }, 50, 200),
                                // bolt down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -0.175000f, 0.195000f);
                                }, 50, 200))

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.200000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.350000f, -0.225000f, -0.100000f);
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
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, 0.025000f, 0.225000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, 0.025000f, 0.225000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, 0.025000f, 0.225000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, 0.025000f, 0.225000f);
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
