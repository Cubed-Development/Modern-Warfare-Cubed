package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class Spas12Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("spas_12")
//      .withCapacity(CommonProxy.Remington870Mag)
                .withAmmoCapacity(7)
                .withMaxBulletsPerReload(7)
                .withFireRate(0.2f)
                .withIteratedLoad()
                .withFireRate(0.2f)
                .withRecoil(7f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.SHOTGUN)
                .withShellType(Type.SHOTGUN)
                .withMaxShots(1)
                .withShootSound("spas12")
                .withSilencedShootSound("ShotgunSilenced")
                .withReloadSound("drawweapon")
                .withReloadIterationSound("load_shell2")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(15)
                .withShellCasingModel(new com.paneedah.mwc.models.Shotgun12Gauge())
                .withShellCasingModelTexture("shotgun12gauge")
                .withInaccuracy(8)
                .withPellets(10)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.12f)
                .withFlashOffsetY(() -> 0.12f)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        5f, // x
                        4f, // y
                        8f) // z

                .withCompatibleAttachment(Attachments.Spas12Stock, true, (model) -> {
//          GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.M1014Stock, (model) -> {
//            GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.M4BenelliStock, (model) -> {
//          GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.ShotgunRail, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(-0.156F, -0.61F, -1.1f);
                        GlStateManager.scale(0.55F, 0.4F, 0.4F);
                    }
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M1014Action, true, (model) -> {
//          GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.ShotgunShell, true, (model) -> {
                    GlStateManager.translate(-0.12F, -0.08F, -1F);
                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.ShotgunInsertion, true, (model) -> {
//          GlStateManager.translate(0.01f, -0.19f, -0.4f);
//          GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
                    if (model instanceof M4Iron1) {
                        GlStateManager.translate(0.162F, -1.75F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GlStateManager.translate(-0.055F, -1.35F, -4.05F);
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
                        GlStateManager.translate(0.092F, -1.91F, -0.9F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof G36CIron1) {
                        GlStateManager.translate(-0.04F, -0.635F, -1.378F);
                        GlStateManager.scale(0.2F, 0.2F, 0.2F);
                        GlStateManager.rotate(-180F, 0f, 1f, 0f);
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
                        GlStateManager.translate(-0.065F, -0.525F, -4.5F);
                        GlStateManager.scale(0.12F, 0.5F, 1F);
                        GlStateManager.rotate(-180F, 0f, 0f, 1f);
                    } else if (model instanceof M14Iron) {
                        GlStateManager.translate(-0.145F, -0.84F, 0.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GlStateManager.translate(-0.04F, -0.53F, -0.6F);
                    GlStateManager.scale(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(-0.013F, -0.57F, -0.6F);
                    GlStateManager.scale(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(-0.013F, -0.57F, -0.6F);
                    GlStateManager.scale(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
//         .withCompatibleAttachment(Attachments.Vortex, (player, stack) -> {
//                 GlStateManager.translate(-0.2F, -0.72F, -0.9F);
//                 GlStateManager.scale(0.3F, 0.3F, 0.4F);
//             },(model) -> {
//                 if(model instanceof Holo2) {
//                     GlStateManager.translate(0.395F, -0.33F, -0.1F);
//                     GlStateManager.scale(0.15F, 0.15F, 0.15F);
//                 }
//             })
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(-0.025F, -0.58F, -0.4F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GlStateManager.translate(-0.125F, -0.7F, -0.3F);
                    GlStateManager.scale(0.28F, 0.28F, 0.28F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.125F, -0.7F, -0.3F);
                    GlStateManager.scale(0.28F, 0.28F, 0.28F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
                    GlStateManager.translate(-0.12F, -0.7F, -0.4F);
                    GlStateManager.scale(0.26F, 0.26F, 0.26F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.15F, -0.03F, -1.5F);
                        GlStateManager.scale(0.3F, 0.3F, 0.3F);
                    }
                })
//      .withCompatibleAttachment(Attachments.Silencer12Gauge, (model) -> {
//          GlStateManager.translate(-0.19F, -0.6F, -8F);
//          GlStateManager.scale(1.4F, 1.4F, 1.4F);
//      })
                .withCompatibleBullet(Bullets.Shotgun12Guage, (model) -> {})
                .withTextureNames("spas12")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new Spas12())
                        //.withTextureName("Remington900")
                        //.withWeaponProximity(0.99F)
                        //.withYOffsetZoom(5F)
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
                            GlStateManager.rotate(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.35F, 0.35F, 0.35F);
                            GlStateManager.translate(1, 0.8f, 0);
                            GlStateManager.rotate(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GlStateManager.scale(0.6F, 0.6F, 0.6F);
                            GlStateManager.translate(-0.9F, 0.4F, 1F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(165.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(0.900000f, -0.075000f, -0.150000f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(6F, 0f, 0f, 1f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(-0.250000f, 0.425000f, -0.875000f);

//                GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
//                GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
//                GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//                GlStateManager.rotate(165.000000f, 0f, 0f, 1f);
//                GlStateManager.translate(0.900000f, -0.075000f, -0.150000f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(6F, 0f, 0f, 1f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(-0.250000f, 0.425000f, -0.075000f);
                            GlStateManager.rotate(-5F, 1f, 0f, 0f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), (renderContext) -> {

                            // back

//            	GlStateManager.translate(0.06F, -0F, 0.5F);
//                GlStateManager.rotate(17F, 1f, 0f, 0f);


                            // forward

//          	  	GlStateManager.translate(0.07F, 0.43F, 0.2F);
//                GlStateManager.rotate(-20F, 1f, 0f, 0f);
//                GlStateManager.rotate(5F, 0f, 1f, 0f);

                            //about to be inserted

//            	GlStateManager.translate(0F, 0.12F, 0.2F);
//                GlStateManager.rotate(-6F, 1f, 0f, 0f);

                            // inserted

//            	GlStateManager.translate(0, -0.03F, -0.075F);
                        })

                        .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.17F, 0.15F, 1.1F);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.M1014Action.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, 0F, 0F);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.ShotgunInsertion.getRenderablePart(), (renderContext) -> {
//            	GlStateManager.translate(0F, -0.012F, 0F);
//                GlStateManager.rotate(1F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M1014Action.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0f, 0f, 0.5f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M1014Action.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0f, 0f, 0.5f);
                        })

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 2F);
                                }, 250, 50)
                        )

                        .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 2F);
                                }, 250, 50)
                        )

                        .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.06F, -0F, 0.5F);
                                    GlStateManager.rotate(17F, 1f, 0f, 0f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.07F, 0.43F, 0.2F);
                                    GlStateManager.rotate(-20F, 1f, 0f, 0f);
                                    GlStateManager.rotate(5F, 0f, 1f, 0f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.12F, 0.2F);
                                    GlStateManager.rotate(-6F, 1f, 0f, 0f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0, -0.03F, -0.075F);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0, -0.05F, -0.075F);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0, -0.05F, -0.075F);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.06F, -0.05F, 1.1F);
                                }, 250, 50)
                        )

                        .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.ShotgunInsertion.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
//                  			GlStateManager.translate(0.06F, -0F, 0.5F);
//                              GlStateManager.rotate(17F, 1f, 0f, 0f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
//                        	  GlStateManager.translate(0F, 0.033F, 0F);
//                              GlStateManager.rotate(-6F, 1f, 0f, 0f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.044F, 0F);
                                    GlStateManager.rotate(-8F, 1f, 0f, 0f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.044F, 0F);
                                    GlStateManager.rotate(-8F, 1f, 0f, 0f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.044F, 0F);
                                    GlStateManager.rotate(-8F, 1f, 0f, 0f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.044F, 0F);
                                    GlStateManager.rotate(-8F, 1f, 0f, 0f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.005F, 0F);
                                    GlStateManager.rotate(0.7F, 1f, 0f, 0f);
                                }, 250, 50)
                        )

                        .withFirstPersonPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(165.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -0.075000f, -0.150000f);
                                }, 250, 0)
                        )

                        .withFirstPersonPositioningAllLoadIterationsCompleted(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(6F, 0f, 0f, 1f);
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.translate(-0.250000f, 0.425000f, -0.875000f);
                                }, 290, 0)
                        )

                        .withFirstPersonPositioningLoadIteration(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-54.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(164.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -0.075000f, -0.120000f);
                                }, 160, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-54.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(166.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -0.075000f, -0.130000f);
                                }, 140, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(165.500000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -0.075000f, -0.125000f);
                                }, 140, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-56.700000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(166.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -0.075000f, -0.23000f);
                                }, 70, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-57.100000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.300000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(163.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -0.075000f, -0.21000f);
                                }, 70, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-55.900000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.100000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(164.500000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -0.075000f, -0.220000f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(165.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.900000f, -0.075000f, -0.140000f);
                                }, 180, 0)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.6f, 0.000000f, -1.2f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 0.4f, -1.2f);
                                }, 350, 600)
                        )

                        .withThirdPersonPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-1.5F, 0.4F, 2F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-1.5F, 0.4F, 2F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-1.5F, 0.4F, 2F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0), new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-1.5F, 0.4F, 2F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-1.5F, 0.4F, 2F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-1.5F, 0.4F, 2F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0), new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-1.5F, 0.4F, 2F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-1.5F, 0.4F, 2F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 0)
                        )

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(15F, 0f, 1f, 0f);
                                    GlStateManager.rotate(13F, 0f, 0f, 1f);
                                    GlStateManager.rotate(25F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.25f, 0.7f, -1.3f);
                                }, 160, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(28F, 0f, 1f, 0f);
                                    GlStateManager.rotate(9F, 0f, 0f, 1f);
                                    GlStateManager.rotate(15F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.25f, 0.7f, -1.2f);
                                }, 210, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(38F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8F, 0f, 0f, 1f);
                                    GlStateManager.rotate(6F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.25f, 0.6f, -1.2f);
                                }, 270, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(6F, 0f, 0f, 1f);
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.translate(-0.250000f, 0.425000f, -0.875000f);
                                }, 240, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(1F, 1f, 0f, 0f);
                            GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                            GlStateManager.translate(0.250000f, 0.22f, -1.1f);

//             // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.13f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.2f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.2f, 0f);
                            }

//             // Holo Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Holo");
//                    GlStateManager.translate(0f, 0.15f, 0f);
//                } 

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.15f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.15f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.15f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.07f, 0f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                            GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                            GlStateManager.translate(0.250000f, 0.22f, -0.7f);

//              // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.13f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.2f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.2f, 0f);
                            }

//             // Holo Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Holo");
//                    GlStateManager.translate(0f, 0.15f, 0f);
//                } 

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.15f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.15f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.15f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.07f, 0f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.rotate(35F, 0f, 1f, 0f);
                            GlStateManager.rotate(20F, 0f, 0f, 1f);
                            GlStateManager.rotate(5F, 1f, 0f, 0f);
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.translate(-0.2f, 0.4f, -0.6f);
                        })
                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                            GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.6f, 0.000000f, -1.2f);
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                            GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-1.100000f, 0.100000f, -1.700000f);
                        })
                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.400000f, 0.275000f);

//                         GlStateManager.scale(4f, 4f, 4f);
//                         GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
//                         GlStateManager.rotate(65.000000f, 0f, 1f, 0f);
//                         GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
//                         GlStateManager.translate(-0.325000f, -0.575000f, 0.075000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.600000f, -0.775000f, 0.250000f);

//                         GlStateManager.scale(3f, 3f, 3f);
                                })

                        .withFirstPersonHandPositioningLoadIterationCompleted(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.325000f, -0.575000f, 0.075000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.600000f, -0.775000f, 0.250000f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -0.450000f, 0.200000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.600000f, -0.775000f, 0.250000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-85.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.750000f, 0.050000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.600000f, -0.775000f, 0.250000f);
                                })
                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.675000f, 0.175000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.450000f, -0.925000f, 0.075000f);
                                })
                        .withFirstPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.325000f, -0.575000f, 0.075000f);
                                }, 250, 50)
                        )

                        .withFirstPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-75.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.675000f, -0.850000f, 0.150000f);
                                }, 250, 1000)
                        )

                        .withFirstPersonLeftHandPositioningLoadIteration(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.325000f, -0.575000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.325000f, -0.575000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.325000f, -0.575000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.325000f, -0.575000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.325000f, -0.575000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.325000f, -0.575000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.325000f, -0.575000f, 0.075000f);
                                }, 250, 50)
                        )

                        .withFirstPersonRightHandPositioningLoadIteration(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(160.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.550000f, 0.175000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-130.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(160.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.525000f, 0.150000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(160.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.120000f, -0.435000f, 0.175000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(160.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.160000f, -0.365000f, 0.175000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(160.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.160000f, -0.365000f, 0.175000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(160.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.160000f, -0.365000f, 0.175000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(160.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.320000f, -0.735000f, 0.185000f);
                                }, 250, 50)
                        )

                        .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.400000f, 0.275000f);
                                }, 250, 50)

                        )

                        .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-75.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.675000f, -0.850000f, 0.150000f);
                                }, 250, 1000)
                        )

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-85.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.750000f, 0.050000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-85.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.8f, -0.03f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.600000f, -0.775000f, 0.250000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.600000f, -0.775000f, 0.250000f);
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
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.400000f, 0.275000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.400000f, 0.275000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.400000f, 0.275000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.400000f, 0.275000f);
                                }, 200, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.600000f, -0.775000f, 0.250000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.600000f, -0.775000f, 0.250000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.600000f, -0.775000f, 0.250000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.600000f, -0.775000f, 0.250000f);
                                }, 250, 100)
                        )

                        .build())
                .withSpawnEntityDamage(6f)
                .withSpawnEntityGravityVelocity(0.8f)


                .build(MWC.modContext);
    }
}
