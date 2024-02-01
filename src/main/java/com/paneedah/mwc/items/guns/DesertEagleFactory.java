package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.jim.BBLoader;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class DesertEagleFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
                .withName("desert_eagle")
                .withFireRate(0.2f)
                .withRecoil(15f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.HANDGUN)
                .withMuzzlePosition(new Vec3d(-.15, -0.8, -3.3))
                .withShellType(Type.PISTOL)
                .withMaxShots(1)
                .withShootSound("desert_eagle")
                .withSilencedShootSound("m9a1_silenced")
                .withDrawSound("handgun_draw")
                .withReloadingTime(40)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.7f)
                .withFlashOffsetX(() -> 0.13f)
                .withFlashOffsetY(() -> 0.14f)
                .withInaccuracy(2)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        65.0,
                        13.125,
                        30.0,
                        0.3625,
                        0.325,
                        0.020,
                        0.0,
                        1.0
                ))

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withCompatibleAttachment(Attachments.PistolPlaceholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.DesertEagleBody, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.DesertEagleSlide, true, (model) -> {
                })
                .withCompatibleAttachment(Magazines.DesertEagleMag, (model) -> {
                })
                .withCompatibleAttachment(Attachments.DesertEagleBodyGolden, (model) -> {
                })
                .withCompatibleAttachment(Attachments.DesertEagleSlideGolden, (model) -> {
                })

                .withCompatibleAttachment(Attachments.RMR, () -> {
                    GL11.glTranslatef(-0.19F, -1.5F, -1.25F);
                    GL11.glScaled(0.46F, 0.46F, 0.46F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.1F, -0.5F);
                        GL11.glScaled(0.2F, 0.2F, 0.2F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
                    GL11.glTranslatef(-0.05F, -1.1F, -1.6F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.VortexRedux, () -> {
                            GL11.glTranslatef(-0.35F, -1.45F, -2.0F);
                            GL11.glScaled(0.6F, 0.6F, 0.6F);
                        }, (model) -> {
                            if (model instanceof Holo2) {
                                GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                                GL11.glScaled(0.15F, 0.15F, 0.15F);
                            }
                        })

                .withCompatibleAttachment(Attachments.Laser, () -> {
                    GL11.glTranslatef(0.01F, -0.76F, -2.4F);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                    GL11.glRotatef(90F, 0f, 0f, 1f);
                })

                .withTextureNames("deagle")
                .withRenderer(new WeaponRenderer.Builder()
                        .withModel(new Glock18C())
                        .withActionPiece(
                                Attachments.DesertEagleSlide,
                                Attachments.DesertEagleSlideGolden)
                        .withActionTransform(new Transform().withPosition(0F, 0F, 0.6F))
                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.4F, 0.4F, 0.4F);
                            GL11.glTranslatef(0, 0f, 3f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(0, 0.8f, 0);
                            GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.45F, 0.45F, 0.45F);
                            GL11.glTranslatef(-1.6F, -1F, 1.8F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.145000f, 4.165000f, -8.295000f)
                                        .withRotation(0.000000f, -2.000000f, 6.681469f)
                                        .withPivotPoint(-0.12000000357627871F, -0.36000001072883614F, 0.040000001192092904F)
                                        .withScale(3.0F, 3.0F, 3.0F)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.370000f, 0.865000f, 2.020000f)
                                        .withBBRotation(-12.9672F, -29.0825F, 67.8433F)
                                        .withScale(3, 3, 4)
                                        .withPivotPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.320000f, 0.140000f, 2.040000f)
                                        .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                                        .withScale(3.2F, 3.2F, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("deagle", Attachments.DesertEagleSlide)
                        .setupModernMagazineAnimations("deagle", Magazines.DesertEagleMag)
                        .setupCustomKeyedPart(Attachments.DesertEagleSlideGolden, "deagle", BBLoader.KEY_ACTION)

                        .withFirstPersonCustomPositioning(Attachments.DesertEagleSlide.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GL11.glTranslatef(0F, 0F, 0.6F);
                            }
                        })
                        .withFirstPersonCustomPositioning(Attachments.DesertEagleSlideGolden.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GL11.glTranslatef(0F, 0F, 0.6F);
                            }
                        })

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glTranslatef(0.178f, -0.15f, -1.5f);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR))
                                GL11.glTranslatef(-0.007f, 0.16f, 1f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex))
                                GL11.glTranslatef(0.005f, 0.12f, 1.15f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                GL11.glTranslatef(-0.01f, 0.235f, 1.45f);
                            }
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-0.945000f, 3.625000f, -7.165000f)
                                    .withRotation(-4.041486f, -30.854630f, -19.420376f)
                                    .withPivotPoint(-0.120000f, -0.360000f, 0.040000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-0.945000f, 3.625000f, -7.885000f)
                                    .withRotation(-4.041486f, -45.595835f, -21.768277f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.770000f, 1.225000f, 0.140000f)
                                            .withRotation(73.670132f, -70.659155f, 41.991085f)
                                            .withScale(2.6F, 2.6F, 4.0F)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.320000f, 0.140000f, 2.040000f)
                                            .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                                            .withScale(3, 3, 3.5F)
                                            .withPivotPoint(0, 0, 0)
                                            .applyTransformations();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.770000f, 1.225000f, 0.140000f)
                                            .withRotation(73.670132f, -70.659155f, 41.991085f)
                                            .withScale(2.6F, 2.6F, 4.0F)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.320000f, 0.140000f, 2.040000f)
                                            .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                                            .withScale(3, 3, 3.5F)
                                            .withPivotPoint(0, 0, 0)
                                            .applyTransformations();
                                })

                        .build())
                .withSpawnEntityDamage(12f)
                .withSpawnEntityGravityVelocity(0.02f)

                .build(MWC.modContext);
    }
}
