package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class MAC10Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
                .withName("mac10")
                .withFireRate(0.999f)
                .withRecoil(2.5f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.SUBMACHINE_GUN)
                .withShellType(Type.PISTOL)
                .withMuzzlePosition(new Vec3d(-.16, -0.95, -2.8))
                .withMaxShots(1, Integer.MAX_VALUE)
                .withShootSound("mac10")
                .withSilencedShootSound("mp5_silenced")
                .withReloadSound("mac10_reload")
                .withUnloadSound("mac10_unload")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(45)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.16f)
                .withFlashOffsetY(() -> 0.16f)
                .withInaccuracy(2f)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        15.0,
                        15.75,
                        50.0,
                        0.4,
                        0.3125,
                        0.0,
                        0.0,
                        1.0
                ))

                .withScreenShaking(RenderableState.SHOOTING,
                        2f,
                        1f,
                        3f)

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 8), new
                        CraftingEntry(MWCItems.gunmetalPlate, 5), new
                        CraftingEntry(MWCItems.steelIngot, 4))

                .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withCompatibleAttachment(Attachments.MAC10Body, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.MAC10Grip, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.MAC10Stock, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.MAC10Action, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.MAC21Stock, (model) -> {
                })
                .withCompatibleAttachment(Magazines.MAC10Mag, (model) -> {
                })

                .withCompatibleAttachment(Attachments.NightRaider, (player, itemStack) -> {
                    GL11.glTranslatef(-0.235F, -1.65F, -1.0F);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, itemStack) -> {
                    GL11.glTranslatef(-0.35F, -1.65F, 0.7F);
                    GL11.glScaled(0.96F, 0.96F, 0.96F);
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.Specter, (player, itemStack) -> {
                    GL11.glTranslatef(-0.22F, -1.28F, -0.0F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroReflex, (player, itemStack) -> {
                    GL11.glTranslatef(-0.16F, -2.45F, -0.1F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroT1, (player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -1.74F, 0.3F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -1.74F, 0.3F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM2, (player, itemStack) -> {
                    GL11.glTranslatef(-0.12F, -0.86F, 0.5F);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.005F, -0.89F, -1.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.RMR, (player, itemStack) -> {
                    GL11.glTranslatef(-0.19F, -1.73F, 0.2F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.1F, -0.5F);
                        GL11.glScaled(0.2F, 0.2F, 0.2F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, itemStack) -> {
                    GL11.glTranslatef(-0.045F, -1.42F, -0.1F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, itemStack) -> {
                    GL11.glTranslatef(-0.045F, -1.42F, -0.05F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, itemStack) -> {
                    GL11.glTranslatef(-0.025F, -1.5F, -0.1F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, itemStack) -> {
                    GL11.glTranslatef(-0.025F, -1.5F, -0.1F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, itemStack) -> {
                    GL11.glTranslatef(-0.025F, -1.5F, -0.1F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
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

                .withCompatibleAttachment(Attachments.VortexRedux, (player, itemStack) -> {
                    GL11.glTranslatef(-0.36F, -1.75F, -0.4F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, (player, itemStack) -> {
                    GL11.glTranslatef(-0.02F, -1.5F, 0.3F);
                    GL11.glScaled(0.85F, 0.85F, 0.85F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, (player, itemStack) -> {
                    GL11.glTranslatef(-0.02F, -1.5F, 0.3F);
                    GL11.glScaled(0.85F, 0.85F, 0.85F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
                    GL11.glTranslatef(-0.25F, -1.32F, -5F);
                    GL11.glScaled(1.8F, 1.8F, 1.8F);
                })
                .withTextureNames("gun")
                .withRenderer(new WeaponRenderer.Builder()
                        .withModel(new MAC10())
                        .withADSBeizer(new Vec3d(0.0, 4, -3))
                        .withActionPiece(Attachments.MAC10Action)
                        .withActionTransform(new Transform().withPosition(0, 0, 1))
                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(0, 0f, 3f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.28F, 0.28F, 0.28F);
                            GL11.glTranslatef(1, 2f, -1.2f);
                            GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-1.8F, -1.1F, 2F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-2.065000f, 5.145000f, -6.925000f)
                                        .withRotation(0.000000f, 1.000000f, 10.681469f)
                                        .withRotationPoint(-0.280000f, -1.600000f, 0.040000f)
                                        .withScale(3.0F, 3.0F, 3.0F)
                        )

                        .withFirstPersonHandPositioning(


                                new Transform()
                                        .withPosition(1.290000f, 0.425000f, 0.620000f)
                                        .withBBRotation(-9.034F, -30.4206F, 59.9273F)
                                        .withScale(3, 3, 4)
                                        .withRotationPoint(0, 0, 0),


                                new Transform()
                                        .withPosition(-0.320000f, 0.260000f, 2.040000f)
                                        .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                                        .withScale(3, 3, 3.5F)
                                        .withRotationPoint(0, 0, 0)

                        )

                        .setupModernAnimations("mac10", Attachments.MAC10Action)
                        .setupModernMagazineAnimations("mac10", Magazines.MAC10Mag)

                        .withThirdPersonPositioningReloading(
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 210, 100),
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 130, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 240, 0),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 400, 150),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 300, 60),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 120, 190),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                    GL11.glRotatef(12F, 0f, 0f, 1f);
                                }, 300, 100),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.2F, -2F, 3.6F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(95F, 1f, 0f, 0f);
                                    GL11.glRotatef(12F, 0f, 0f, 1f);
                                }, 120, 100),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                    GL11.glRotatef(12F, 0f, 0f, 1f);
                                }, 120, 0)
                        )

                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.AKaction.getRenderablePart(),
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
                                    GL11.glTranslatef(0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glTranslatef(0.18F, -0.11F, -0.9F);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider))
                                GL11.glTranslatef(-0.002F, 0.42f, 0.25f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG))
                                GL11.glTranslatef(-0.002F, 0.43f, 0.3f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter))
                                GL11.glTranslatef(0F, 0.44f, 0.45f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex))
                                GL11.glTranslatef(0F, 0.5f, 0.2f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1))
                                GL11.glTranslatef(0.002F, 0.49f, 0.2f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5))
                                GL11.glTranslatef(0.002F, 0.49f, 0.2f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2))
                                GL11.glTranslatef(0F, 0.45f, 0.4f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex))
                                GL11.glTranslatef(0F, 0.43f, 0f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex))
                                GL11.glTranslatef(0F, 0.41f, 0.1f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic))
                                GL11.glTranslatef(-0.003F, 0.425f, 0.3f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt))
                                GL11.glTranslatef(-0.003F, 0.425f, 0.3f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2))
                                GL11.glTranslatef(0F, 0.44f, 0.15f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux))
                                GL11.glTranslatef(-0.002F, 0.5f, 0.2f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra))
                                GL11.glTranslatef(0F, 0.47f, 0.1f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3))
                                GL11.glTranslatef(0F, 0.47f, 0.1f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR))
                                GL11.glTranslatef(0F, 0.345f, 0.1f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-0.945000f, 3.625000f, -7.165000f)
                                    .withRotation(-4.041486f, -30.854630f, -19.420376f)
                                    .withRotationPoint(-0.120000f, -0.360000f, 0.040000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .doGLDirect();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-0.945000f, 3.625000f, -7.885000f)
                                    .withRotation(-4.041486f, -45.595835f, -21.768277f)
                                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .doGLDirect();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.770000f, 1.225000f, 0.140000f)
                                            .withRotation(73.670132f, -70.659155f, 41.991085f)
                                            .withScale(2.6F, 2.6F, 4.0F)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.320000f, 0.140000f, 2.040000f)
                                            .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                                            .withScale(3, 3, 3.5F)
                                            .withRotationPoint(0, 0, 0)
                                            .doGLDirect();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.770000f, 1.225000f, 0.140000f)
                                            .withRotation(73.670132f, -70.659155f, 41.991085f)
                                            .withScale(2.6F, 2.6F, 4.0F)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.320000f, 0.140000f, 2.040000f)
                                            .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                                            .withScale(3, 3, 3.5F)
                                            .withRotationPoint(0, 0, 0)
                                            .doGLDirect();
                                })

                        .withThirdPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                                }, 330, 200),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                                }, 50, 200),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                                }, 250, 0),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                                }, 250, 0),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                                }, 50, 200),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                                }, 50, 200),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                                }, 250, 0),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-48.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(43.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                                }, 250, 0))

                        .withThirdPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-66.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-57.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0))

                        .build())
                .withSpawnEntityDamage(5.3f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}