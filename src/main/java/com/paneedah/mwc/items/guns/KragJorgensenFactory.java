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

public class KragJorgensenFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("Krag_Jorgensen")
//      .ModelRenderer(CommonProxy.XWPMag)
                .withAmmoCapacity(5)
                .withFireRate(0.16f)
                .withIteratedLoad()
                .withEjectRoundRequired()
                .withEjectSpentRoundSound("krag_boltaction")
                .withRecoil(6f)
                .withZoom(0.8f)
                .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
                .withMaxShots(1)
                .withShootSound("kragjorgensen")
                .withPumpTimeout(950)
                //.withSilencedShootSound("AR15silenced")
                .withReloadSound("krag_chamberopen")
                .withAllReloadIterationsCompletedSound("krag_chamberclosed")
                .withReloadIterationSound("loadbullet")
                .withDrawSound("noaction_draw")
//       .withReloadSound("drawweapon")
//        .withReloadIterationSound("loadshell")
                .withReloadingTime(500)
                .withFlashIntensity(0.4f)
                .withFlashScale(() -> 1f)
                .withFlashOffsetX(() -> 0.08f)
                .withFlashOffsetY(() -> 0.16f)
                .withShellCasingEjectEnabled(false)

                .withScreenShaking(RenderableState.SHOOTING,
                        3f, // x
                        2f, // y
                        7f) // z

                .withCreativeTab(MWC.WEAPONS_TAB)

                .withCompatibleAttachment(AuxiliaryAttachments.KragAction1, true, (model) -> {
                    if (model instanceof KragJorgensenAction1) {
//                GlStateManager.translate(-1.38F, -1.05F, 0.59F);
//                GlStateManager.rotate(90f, 0f, 0f, 1f);
                    }
                })
                .withCompatibleAttachment(AuxiliaryAttachments.KragAction2, true, (model) -> {
                    if (model instanceof KragJorgensenAction2) {
//                GlStateManager.translate(1F, -0.4F, 0F);
//                GlStateManager.rotate(-45F, 0f, 0f, 1f);
                    }
                })
                .withCompatibleAttachment(AuxiliaryAttachments.KragChamber, true, (model) -> {
                    if (model instanceof KragJorgensenChamber) {
//              GlStateManager.translate(0.5F, -1F, 0F);
//              GlStateManager.rotate(-70F, 0f, 0f, 1f);
                    }
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Bullet, true, (model) -> {
                    if (model instanceof BulletBig) {
                        GlStateManager.scale(0.4F, 0.4F, 0.6F);
                        GlStateManager.translate(-0.52F, -2.9F, -3.5F);
                        GlStateManager.rotate(90f, 1f, 0f, 0f);


//                GlStateManager.scale(0.4F, 0.4F, 0.6F);
//                GlStateManager.translate(-0.95F, -3.1F, -3.5F);
//                GlStateManager.rotate(70f, 1f, 0f, 0f);
//                GlStateManager.rotate(5f, 0f, 1f, 0f);
                    }
                })
                .withCompatibleBullet(Bullets.Bullet8x58, (model) -> {})
                .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
                    if (model instanceof M4Iron1) {
                        GlStateManager.translate(0.17F, -1.42F, 0.43F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GlStateManager.translate(-0.11F, -1.29F, -9.7F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GlStateManager.translate(0.26F, -1.55F, -2.35F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron1) {
                        GlStateManager.translate(0.125F, -1.8F, -0.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GlStateManager.translate(0.13F, -1.55F, -3.05F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GlStateManager.translate(-0.29F, -1.71F, -4.5F);
                        GlStateManager.scale(0.8F, 0.7F, 1F);
                    } else if (model instanceof G36CIron1) {
                        GlStateManager.translate(-0.22F, -1.94F, -1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof G36CIron2) {
                        GlStateManager.translate(-0.21F, -1.37F, -10F);
                        GlStateManager.scale(0.3F, 0.43F, 1.2F);
                    } else if (model instanceof ScarIron1) {
                        GlStateManager.translate(0.165F, -1.65F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof ScarIron2) {
                        GlStateManager.translate(0.25F, -1.55F, -2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof FALIron) {
                        GlStateManager.translate(-0.13F, -1.39F, -9.7F);
                        GlStateManager.scale(0F, 0F, 0F);
                        GlStateManager.rotate(-180F, 0f, 0f, 1f);
                    } else if (model instanceof M14Iron) {
                        GlStateManager.translate(0.129F, -1.63F, -2.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withTextureNames("KragJorgensen")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new KragJorgensen())
                        .withPrepareFirstLoadIterationAnimationDuration(1000)
                        .withAllLoadIterationAnimationsCompletedDuration(400)
                        //.withTextureName("AWP")
                        //.withWeaponProximity(0.99F)
                        //.withYOffsetZoom(5F)
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.35F, 0.35F, 0.35F);
                            GlStateManager.rotate(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.32F, 0.32F, 0.32F);
                            GlStateManager.translate(1, 0.8f, 0);
                            GlStateManager.rotate(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
                            GlStateManager.translate(-1.8F, -1.1F, 2F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.rotate(10F, 0f, 0f, 1f);
                            GlStateManager.translate(-0.150000f, 1.000000f, 0.600000f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.rotate(10F, 0f, 0f, 1f);
                            GlStateManager.translate(-0.150000f, 1.000000f, 1.00000f);
                            GlStateManager.rotate(-2F, 1f, 0f, 0f);
                        })

                        .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.KragChamber.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.5F, -1F, 0F);
                            GlStateManager.rotate(-70F, 0f, 0f, 1f);
                        })

                        .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.Bullet.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(-0.5F, 1.5F, -1F);
                            GlStateManager.rotate(-20f, 1f, 0f, 0f);
                            GlStateManager.rotate(0f, 0f, 1f, 0f);
                        })

                        .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
                            GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                            GlStateManager.rotate(43.3F, 0f, 1f, 0f);
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.rotate(21F, 0f, 0f, 1f);
                            GlStateManager.translate(0.05f, 1f, 1f);
                            GlStateManager.rotate(-2.8F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningEjectSpentRound(
                                // grabs bolt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(3.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, 1.03f, 0.56f);
                                }, 120, 0),
                                // bolt up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(4.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, 1.050000f, 0.56f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(6.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-6.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, 1.050000f, 0.55f);
                                }, 70, 0),
                                // bolt back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(3.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, 1.050000f, 0.7f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(4.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-6.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, 1.050000f, 0.66f);
                                }, 70, 0),
                                // bolt forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(4.700000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, 1.050000f, 0.525000f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(4.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, 1.02f, 0.57f);
                                }, 70, 0),
                                // bolt down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(2.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, 1.01f, 0.56f);
                                }, 80, 0)

                        )

                        .withFirstPersonPositioningEjectSpentRoundAimed(
                                // grabs bolt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(3.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, 0.93f, 0.96f);
                                }, 120, 0),
                                // bolt up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(4.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, 0.950000f, 0.96f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(6.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-6.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, 0.950000f, 0.95f);
                                }, 70, 0),
                                // bolt back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(3.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, 0.950000f, 1.1f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(4.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-6.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, 0.950000f, 1.06f);
                                }, 70, 0),
                                // bolt forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(4.700000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, 0.950000f, 0.925000f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(4.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(44.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, 0.92f, 0.97f);
                                }, 70, 0),
                                // bolt down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(2.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.425000f, 0.91f, 0.96f);
                                }, 80, 0)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.KragAction1.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position

                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-1.38F, -1.05F, 0F);
                                    GlStateManager.rotate(90f, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-1.38F, -1.05F, 0F);
                                    GlStateManager.rotate(90f, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-1.38F, -1.05F, 0.59F);
                                    GlStateManager.rotate(90f, 0f, 0f, 1f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-1.38F, -1.05F, 0.59F);
                                    GlStateManager.rotate(90f, 0f, 0f, 1f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-1.38F, -1.05F, 0F);
                                    GlStateManager.rotate(90f, 0f, 0f, 1f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-1.38F, -1.05F, 0F);
                                    GlStateManager.rotate(90f, 0f, 0f, 1f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.KragAction2.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.59F);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.59F);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0)

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

                        .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.KragAction1.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-1.38F, -1.05F, 0F);
                                    GlStateManager.rotate(90f, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-1.38F, -1.05F, 0F);
                                    GlStateManager.rotate(90f, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-1.38F, -1.05F, 0.59F);
                                    GlStateManager.rotate(90f, 0f, 0f, 1f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-1.38F, -1.05F, 0.59F);
                                    GlStateManager.rotate(90f, 0f, 0f, 1f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-1.38F, -1.05F, 0F);
                                    GlStateManager.rotate(90f, 0f, 0f, 1f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-1.38F, -1.05F, 0F);
                                    GlStateManager.rotate(90f, 0f, 0f, 1f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.KragAction2.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.59F);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 0.59F);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0)

                        )

//            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.Bullet.getRenderablePart(),
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

                        .withFirstPersonPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(7F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.05f, 1f, 1f);
                                    GlStateManager.rotate(-4F, 1f, 0f, 0f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(14F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.05f, 1f, 1f);
                                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(22F, 0f, 0f, 1f);
                                    GlStateManager.translate(0.02f, 1f, 1f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(20F, 0f, 0f, 1f);
                                    GlStateManager.translate(0.03f, 1f, 1f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                                    GlStateManager.rotate(42.3F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(19F, 0f, 0f, 1f);
                                    GlStateManager.translate(0.02f, 1f, 1f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(20F, 0f, 0f, 1f);
                                    GlStateManager.translate(0.03f, 1f, 1f);
                                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                                }, 140, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.KragChamber.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.5F, -1F, 0F);
                                    GlStateManager.rotate(-70F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.5F, -1F, 0F);
                                    GlStateManager.rotate(-70F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.5F, -1F, 0F);
                                    GlStateManager.rotate(-70F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.5F, -1F, 0F);
                                    GlStateManager.rotate(-70F, 0f, 0f, 1f);
                                }, 250, 50)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Bullet.getRenderablePart(),
                                new Transition((renderContext) -> {

                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {

                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50)
                        )

                        .withFirstPersonPositioningLoadIteration(
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(20F, 0f, 0f, 1f);
                                    GlStateManager.translate(0.05f, 1f, 1f);
                                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                                }, 120, 0),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                                    GlStateManager.rotate(42.5F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(20F, 0f, 0f, 1f);
                                    GlStateManager.translate(0.05f, 1.01f, 1f);
                                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                                }, 90, 0),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(20F, 0f, 0f, 1f);
                                    GlStateManager.translate(0.05f, 1.05f, 1f);
                                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                                }, 70, 0),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                                    GlStateManager.rotate(42.5F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(21F, 0f, 0f, 1f);
                                    GlStateManager.translate(0.05f, 1.03f, 1f);
                                    GlStateManager.rotate(-2.5F, 1f, 0f, 0f);
                                }, 80, 0),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(20F, 0f, 0f, 1f);
                                    GlStateManager.translate(0.05f, 1f, 1f);
                                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                                }, 110, 0))

                        .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.KragAction1.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50))

                        .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.KragAction2.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50))

                        .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.KragChamber.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.5F, -1F, 0F);
                                    GlStateManager.rotate(-70F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.5F, -1F, 0F);
                                    GlStateManager.rotate(-70F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.5F, -1F, 0F);
                                    GlStateManager.rotate(-70F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.5F, -1F, 0F);
                                    GlStateManager.rotate(-70F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.5F, -1F, 0F);
                                    GlStateManager.rotate(-70F, 0f, 0f, 1f);
                                }, 250, 50))

                        .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.Bullet.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.5F, 1.5F, -1F);
                                    GlStateManager.rotate(-20f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0f, 0f, 1f, 0f);

                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.5F, 1.5F, -1.8F);
                                    GlStateManager.rotate(-60f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0f, 0f, 1f, 0f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.33F, 0.3F, -0.05F);
                                    GlStateManager.rotate(0f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0f, 0f, 1f, 0f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.15F, 0.6F, -0.05F);
                                    GlStateManager.rotate(0f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0f, 0f, 1f, 0f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.15F, 0.6F, -0.05F);
                                    GlStateManager.rotate(0f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0f, 0f, 1f, 0f);
                                }, 250, 50))

                        .withFirstPersonPositioningAllLoadIterationsCompleted(
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(22F, 0f, 0f, 1f);
                                    GlStateManager.translate(0.03f, 1f, 1f);
                                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                                }, 100, 0),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(-0.5f, 0.2f, -0.5f);

                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(20F, 0f, 0f, 1f);
                                    GlStateManager.translate(0.05f, 1f, 1f);
                                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                                }, 140, 0))

                        .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.KragChamber.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.5F, -1F, 0F);
                                    GlStateManager.rotate(-70F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50))

                        .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.Bullet.getRenderablePart(),
                                new Transition((renderContext) -> {
//                        GlStateManager.translate(-0F, 0.5F, 0F);
                                    GlStateManager.rotate(0f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0f, 0f, 1f, 0f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
//                        GlStateManager.translate(-0F, 0.5F, 0F);
                                    GlStateManager.rotate(0f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0f, 0f, 1f, 0f);
                                }, 250, 50))

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.325000f, 0.625000f, 0.375000f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, 1.2f, 0.6f);
                                }, 350, 600)
                        )

                        .withThirdPersonPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, -1.1F, 2.8F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, -1.1F, 2.8F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, -1.1F, 2.8F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0), new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, -1.1F, 2.8F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, -1.1F, 2.8F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, -1.1F, 2.8F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0), new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, -1.1F, 2.8F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, -1.1F, 2.8F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0)
                        )

//            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.KS23pump.getRenderablePart(),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition((renderContext) -> {
//                        GlStateManager.translate(0f, 0f, 0.8f);
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                    }, 250, 1000)
//                        )

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
                                    GlStateManager.rotate(8F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, 0.84f, 0.850000f);
                                }, 250, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.39f, 0.86f, 0.400000f);

                            // Scope Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                                //System.out.println("Position me for Scope");
                            }

                            // Everything else
                            else {
                            }

                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.39f, 0.9f, 0.8f);
                            GlStateManager.rotate(-1F, 1f, 0f, 0f);

                            // Scope Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                                //System.out.println("Position me for Scope");
                            }

                            // Everything else
                            else {
                            }

                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.075000f, 1.224999f, 0.500000f);
                        })
                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.325000f, 0.625000f, 0.375000f);
                        })
                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.350000f, 0.025000f);

//                         GlStateManager.scale(3f, 3f, 3f);
//                         GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
//                         GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
//                         GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
//                         GlStateManager.translate(0.000000f, -0.250000f, 0.000000f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.025000f, 0.175000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.350000f, 0.025000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.025000f, 0.175000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.350000f, 0.025000f);
                                })

                        .withFirstPersonHandPositioningRunning(
                                (renderContext) -> {
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.075000f, 0.175000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.350000f, 0.025000f);
                                })

                        .withFirstPersonHandPositioningLoadIterationCompleted(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, -0.050000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 50, 200)
                        )

                        .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 250, 1000))

                        .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, 0.100000f, 0.200000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, 0.100000f, 0.050000f);
                                }, 250, 1000))

                        .withFirstPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.350000f, 0.025000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, 0.100000f, 0.050000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, 0.100000f, 0.200000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.250000f, 0.000000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.250000f, 0.000000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, -0.050000f);
                                }, 250, 1000)

                        )

                        .withFirstPersonLeftHandPositioningLoadIteration(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 50, 200)
                        )

                        .withFirstPersonRightHandPositioningLoadIteration(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, -0.050000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.125000f, 0.025000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.050000f, -0.050000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.125000f, 0.025000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, -0.050000f);
                                }, 50, 200)
                        )

                        .withFirstPersonLeftHandPositioningEjectSpentRound(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.625000f, 0.075000f, 0.265000f);
                                }, 250, 50)

                        )

                        .withFirstPersonRightHandPositioningEjectSpentRound(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.150000f, 0.000000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.03f, -0.07f, -0.03f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.03f, -0.07f, -0.03f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.06f, -0.25f, -0.150000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.06f, -0.25f, -0.150000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.125000f, -0.200000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.125000f, -0.200000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.225000f, -0.200000f);
                                }, 250, 1000)
                        )

                        .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.025000f, 0.175000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.025000f, 0.175000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.025000f, 0.175000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.025000f, 0.175000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.025000f, 0.175000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.025000f, 0.175000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.025000f, 0.175000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.025000f, 0.175000f);
                                }, 250, 50)

                        )

                        .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.150000f, 0.000000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.03f, -0.07f, -0.03f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.03f, -0.07f, -0.03f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.06f, -0.25f, -0.150000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.06f, -0.25f, -0.150000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.125000f, -0.200000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.125000f, -0.200000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -0.225000f, -0.200000f);
                                }, 250, 1000)
                        )

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.025000f, 0.175000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.475000f, -0.025000f, -0.025000f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.350000f, 0.025000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.350000f, 0.025000f);
                                }, 250, 50))

                        .withThirdPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.000000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, 0.075000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.000000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, 0.075000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.000000f, 0.075000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, 0.050000f, 0.075000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, 0.050000f, 0.075000f);
                                }, 50, 200))

                        .withThirdPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.125000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.125000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.225000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.075000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.075000f, 0.000000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.075000f, 0.000000f);
                                }, 250, 50))

                        .withFirstPersonLeftHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.025000f, 0.175000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.3f, -0.05f, 0.15f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.3f, -0.08f, 0.15f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, 0.275000f, 0.225000f);
                                }, 200, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.350000f, 0.025000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.350000f, 0.025000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.350000f, 0.025000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.350000f, 0.025000f);
                                }, 250, 100)
                        )

                        .build())
                .withSpawnEntityDamage(13.8f)
                .withSpawnEntityGravityVelocity(0f)


                .build(MWC.modContext);
    }
}
