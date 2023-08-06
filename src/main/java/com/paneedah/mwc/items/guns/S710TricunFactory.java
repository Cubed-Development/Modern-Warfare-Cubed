package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class S710TricunFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("s7_10_tricun")
                .withFireRate(0.85f)
                .withRecoil(2.3f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.SMG)
                .withMaxShots(1, Integer.MAX_VALUE)
                .withShootSound("mpx")
                .withSilencedShootSound("m110_silenced")
                .withReloadSound("m4a1_reload")
                .withUnloadSound("scar_unload")
                .withEndOfShootSound("gun_click")
                .withInspectSound("m4a1_inspection")
                .withDrawSound("m4_draw")
                .withReloadingTime(50)
                .withCrosshair("gun")
                .withCrosshairRunning("Running")
                .withCrosshairZoomed("Sight")
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.11f)
                .withFlashOffsetY(() -> 0.16f)
                .withShellCasingForwardOffset(0.05f)
                .withShellCasingVerticalOffset(-0.03f)
//		.withShellCasingEjectEnabled(false)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withInformationProvider(stack -> Arrays.asList(
                        "Type: Submachine Gun",
                        "Damage: 5.4",
                        "Cartridge: 10mm",
                        "Fire Rate: SEMI, AUTO",
                        "Rate of Fire: 80/100",
                        "Magazines:",
                        "30rnd 10mm Magazine"))

                .withScreenShaking(RenderableState.SHOOTING,
                        2f, // x
                        0.5f, // y
                        2.5f) // z

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)

                .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(-0.205F, -1.45F, -2F);
                        GL11.glScaled(0.6F, 0.6F, 0.65F);
                    } else if (model instanceof AKRail2) {
                        GL11.glTranslatef(-0.205F, -1.45F, -3.27F);
                        GL11.glScaled(0.6F, 0.6F, 0.65F);
                    } else if (model instanceof AKRail3) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKRail4) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKRail5) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(Attachments.S710Receiver, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.MagpulCTRStock, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.HeraArmsStock, (model) -> {
                    GL11.glTranslatef(0.01f, -0.1f, -0.2f);
                    GL11.glScaled(1.1F, 1.2F, 1F);
                })
                .withCompatibleAttachment(Attachments.MilSpecStock, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.HK416Stock, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.M16Stock, (model) -> {
                    GL11.glTranslatef(0f, 0.0f, -0.04f);
                    GL11.glScaled(1F, 1F, 0.85F);
                })
                .withCompatibleAttachment(Attachments.MagpulCTRStockTan, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.MilSpecStockTan, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.HK416StockTan, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.PRSPrecisionStock, (model) -> {
//            GL11.glTranslatef(0f, -0.28f, -0.55f);
                    GL11.glScaled(1F, 1F, 0.85F);
                })
                .withCompatibleAttachment(Attachments.HK416FrontSight, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.Mk18HandGuard) {
                            GL11.glTranslatef(0F, 0F, -0.35F);
                            GL11.glScaled(1F, 1F, 1F);
                        } else if (activeAttachment == Attachments.M16A4HandGuard) {
                            GL11.glTranslatef(0F, 0F, -0.8F);
                            GL11.glScaled(1F, 1F, 1F);
                        } else {
                            GL11.glTranslatef(0F, -0.01F, 0.5F);
                            GL11.glScaled(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof G95_upright_frontsights) {
                        GL11.glTranslatef(-0.155F, -1.55F, -3.5F);
                        GL11.glScaled(0.32F, 0.32F, 0.32F);
                    }
                }, false, false)

                .withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.Mk18HandGuard) {
                            GL11.glTranslatef(0F, 0F, -0.6F);
                            GL11.glScaled(1F, 1F, 1F);
                        } else if (activeAttachment == Attachments.M38HandGuard) {
                            GL11.glTranslatef(0F, 0F, -0.4F);
                            GL11.glScaled(1F, 1F, 1F);
                        } else if (activeAttachment == Attachments.M16A4HandGuard) {
                            GL11.glTranslatef(0F, 0F, -1.2F);
                            GL11.glScaled(1F, 1F, 1F);
                        } else {
                            GL11.glTranslatef(0F, -0.02F, 0.5F);
                            GL11.glScaled(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof MBUSFrontSight) {
                        GL11.glTranslatef(-0.16F, -1.5F, -3.3F);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    }
                }, true, false)

                .withCompatibleAttachment(Attachments.M38FrontSight, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.Mk18HandGuard) {
                            GL11.glTranslatef(-0.004F, -0.1F, 2.5F);
                            GL11.glScaled(1F, 1F, 1F);
                        } else {
                            GL11.glTranslatef(0F, -0.03F, 0.5F);
                            GL11.glScaled(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof AKMiron2) {
                        GL11.glTranslatef(-0.18F, -1.5F, -3.73F);
                        GL11.glScaled(0.55F, 0.55F, 1F);
                    } else if (model instanceof FALIron) {
                        GL11.glTranslatef(-0.1F, -1.34F, -3.7F);
                        GL11.glScaled(0.1F, 0.9F, 0.3F);
                        GL11.glRotatef(180F, 0f, 0f, 1f);
                    } else if (model instanceof AK47iron) {
                        GL11.glTranslatef(-0.235F, -1.85F, -3.7F);
                        GL11.glScaled(0.75F, 0.95F, 0.3F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.S710Handguard, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.S710TricunGrip, true, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.M4Grip, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.HeraArmsGrip, (model) -> {
                    GL11.glTranslatef(0F, -0.05F, 0F);
                    GL11.glScaled(1F, 0.95F, 1F);
                })
                .withCompatibleAttachment(Magazines.S710TricunMag, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.S710TricunActionPully, true, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.S710TricunActionEjector, true, (model) -> {

                })
                .withCompatibleAttachment(Attachments.TritiumRearSights, (model) -> {
                    if (model instanceof TritiumRearSights) {
                        GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    }
                })
                .withCompatibleAttachment(Attachments.HK416RearSights, true, (model) -> {
                    if (model instanceof G95_upright_rearsights) {
                        GL11.glTranslatef(-0.158F, -1.5F, -0.2F);
                        GL11.glScaled(0.32F, 0.32F, 0.32F);
                    }
                })
                .withCompatibleAttachment(Attachments.MBUSRearSights, (model) -> {
                    if (model instanceof MBUSRearSight) {
                        GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    }
                })

                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GL11.glTranslatef(-0.21F, -1.5F, -2F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GL11.glTranslatef(-0.295F, -1.52F, -0.7F);
                    GL11.glScaled(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })

                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
                    GL11.glTranslatef(-0.155F, -1.38F, -1.8F);
                    GL11.glScaled(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                        GL11.glScaled(0.04F, 0.04F, 0.04F);
                    }
                })

                .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
                    GL11.glTranslatef(-0.185F, -1.22F, -1F);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GL11.glTranslatef(-0.15F, -2.05F, -1F);
                    GL11.glScaled(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    } else if (model instanceof SightMount) {
                        //        	GL11.glTranslatef(-0.15F, -1.82F, -1F);
                        //            GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GL11.glTranslatef(-0.177F, -1.52F, -1.2F);
                    GL11.glScaled(0.36F, 0.36F, 0.36F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GL11.glTranslatef(-0.177F, -1.52F, -1.2F);
                    GL11.glScaled(0.36F, 0.36F, 0.36F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GL11.glTranslatef(-0.065F, -1.34F, -1.2F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GL11.glTranslatef(-0.066F, -1.32F, -1.2F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GL11.glTranslatef(-0.042F, -1.38F, -1.2F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GL11.glTranslatef(-0.042F, -1.38F, -1.2F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GL11.glTranslatef(-0.042F, -1.38F, -1.2F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof EotechScopeRing) {
                        GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
                        GL11.glScaled(0.05F, 0.05F, 0.05F);
                    }
                })

                .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
                    GL11.glTranslatef(-0.3F, -1.55F, -1.3F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GL11.glTranslatef(-0.044F, -1.39F, -1F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GL11.glTranslatef(-0.044F, -1.39F, -1F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
                    GL11.glTranslatef(-0.23F, -0.7F, -2.81F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.35F, -2.8F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GL11.glTranslatef(-0.18F, -0.38F, -2.5F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })
                .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
                    GL11.glTranslatef(-0.10F, -1.18F, -3F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                })
                .withTextureNames("s710tricun")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new S710Tricun())
                        .withADSBeizer(new Vec3d(0.2, 1.7, 0.5))
                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(0, 0f, 3f);
                            GL11.glRotatef(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(1, 2f, -1.2f);
                            GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-1.7F, -0.8F, 1.9F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })
                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.425000f, 3.825000f, -2.525000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                                        .withScale(3.0, 3.0, 3.0)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.050000f, 0.025000f, -0.260000f)
                                        .withBBRotation(-8.1997, -23.6991, 57.7232)
                                        .withScale(2.6, 2.6, 4.0)
                                        .withRotationPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.2, 0.1, 2)
                                        .withRotation(-5.4027, -4.7805, -1.6694)
                                        .withScale(3.5, 3.5, 3.5)
                                        .withRotationPoint(0, 0, 0)

                        )

                        .setupModernAnimations("s710tricun", AuxiliaryAttachments.AKaction)
                        .setupModernMagazineAnimations("s710tricun", Magazines.S710TricunMag)

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.S710TricunActionEjector.getRenderablePart(), (renderContext) -> {
                            GL11.glTranslatef(0f, 0f, 0.5f);
                        })
                        .withFirstPersonCustomPositioning(Magazines.S710TricunMag, (renderContext) -> {
                        })

                        .withThirdPersonPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 180, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 240, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 260, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 240, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 170, 170),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 260, 10),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 100, 50)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                            GL11.glTranslatef(0.18f, -0.028f, 0.6f);


                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.12f, 0.25f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.145f, 0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.14f, 0.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.11f, 0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.145f, 0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.12f, 0.9f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.13f, 0.9f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.125f, 0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.10f, 0.6f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.16f, 0.4f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.16f, 0.4f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.16f, 0.1f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.16f, 0.6f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.15f, 0.4f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.15f, 0.4f);
                            }

                            // Everything else
                            else {
                            }

                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.905000f, 4.065000f, -3.645000f)
                                    .withRotation(0.000000f, -30.514396f, -26.062789f)
                                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .doGLDirect();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.425000f, 3.545000f, -5.685000f)
                                    .withRotation(-0.187566f, -46.164037f, -11.869230f)
                                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .doGLDirect();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(1.730000f, 0.065000f, -0.980000f)
                                            .withRotation(93.414678f, 23.699100f, 15.553163f)
                                            .withScale(2.6, 2.6, 4.0)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.2, 0.1, 2)
                                            .withRotation(-5.4027, -4.7805, -1.6694)
                                            .withScale(3.5, 3.5, 3.5)
                                            .withRotationPoint(0, 0, 0)
                                            .doGLDirect();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.450000f, -0.335000f, -0.660000f)
                                            .withRotation(93.766422f, 50.841130f, 4.679372f)
                                            .withScale(2.600000f, 2.600000f, 4.000000f)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.600000f, 0.340000f, 1.880000f)
                                            .withRotation(-12.193518f, -4.780500f, 1.399459f)
                                            .withScale(3.5, 3.5, 3.5)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                })

                        .withThirdPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.075000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                                }, 250, 0))

                        .withThirdPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.325000f, -0.150000f, 0.375000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0))

                        .build())
                .withSpawnEntityDamage(5.4f)
                .withSpawnEntityGravityVelocity(0.0118f)


                .build(MWC.modContext);
    }
}
