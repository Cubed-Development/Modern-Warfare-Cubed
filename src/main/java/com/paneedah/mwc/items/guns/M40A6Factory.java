package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.jim.BBLoader;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class M40A6Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
                .withName("m40a6")
                .withFireRate(0.16f)
                .withEjectRoundRequired()
                .withEjectSpentRoundSound("m40a6_boltaction")
                .withMuzzlePosition(new Vec3d(.1, -1.5, -9.0))
                .withRecoil(9f)
                .withZoom(0.8f)
                .withConfigGroup(GunConfigurationGroup.SNIPER_RIFLE)
                .withMaxShots(1)
                .withShootSound("m40a6")
                .withPumpTimeout(1000)
                .withSilencedShootSound("as50_silenced")
                .withReloadSound("m40a6_reload")
                .withUnloadSound("m40a6_unload")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(40)
                .withFlashIntensity(0.4f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.08f)
                .withFlashOffsetY(() -> 0.10f)
                .withShellCasingEjectEnabled(false)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        30.0,
                        25.0,
                        46.25,
                        0.3,
                        0.425,
                        0.0,
                        0.025,
                        1.0
                ))

                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.M40A6GripPlaceholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })


                .withCompatibleAttachment(Magazines.M40A6Mag, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M40A6BoltAction, true, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M40A6BoltActionPrime, true, (model) -> {
                })
//        .withCompatibleBullet(Bullets.Bullet308Winchester, (model) -> {})
////        .withCompatibleAttachment(AuxiliaryAttachments.M40A6Mag, true, (model) -> {
////            GL11.glTranslatef(0.05F, 2.2F, -1F);
////            GL11.glRotatef(-30f, 1f, 0f, 0f);
////        })
                .withCompatibleAttachment(Attachments.MBUSFrontSight, true, (model) -> {
                    GL11.glTranslatef(0.08F, -2.16F, -4.5F);
                    GL11.glScaled(0.35F, 0.35F, 0.35F);
                })
                .withCompatibleAttachment(Attachments.MBUSRearSights, true, (model) -> {
                    if (model instanceof MBUSRearSight) {
                        GL11.glTranslatef(0.08F, -2.16F, -0.1F);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, itemStack) -> {
                    GL11.glTranslatef(0.03F, -2.06F, -1.5F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, itemStack) -> {
                    GL11.glTranslatef(-0.07F, -2.05F, -0.3F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
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
                    GL11.glTranslatef(0.06F, -1.75F, -0.7F);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, itemStack) -> {
                    GL11.glTranslatef(0.081F, -1.88F, -2F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                        GL11.glScaled(0.04F, 0.04F, 0.04F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroReflex, (player, itemStack) -> {
                    GL11.glTranslatef(0.09F, -2.56F, -1.2F);
                    GL11.glScaled(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, itemStack) -> {
                    GL11.glTranslatef(0.175F, -1.85F, -0.9F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, itemStack) -> {
                    GL11.glTranslatef(0.18F, -1.82F, -1.3F);
                    GL11.glScaled(0.49F, 0.49F, 0.49F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, -0.7F);
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
                .withCompatibleAttachment(Attachments.Kobra, (player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, -0.5F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, (player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, -0.5F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.VortexRedux, (player, itemStack) -> {
                    GL11.glTranslatef(-0.06F, -2.1F, -1.1F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, (player, itemStack) -> {
                    GL11.glTranslatef(0.06F, -2.05F, -0.5F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, itemStack) -> {
                    GL11.glTranslatef(0.06F, -2.05F, -0.5F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GL11.glTranslatef(-0.05F, -0.8F, -3.5F);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GL11.glTranslatef(-0.05F, -0.8F, -3.5F);
                    GL11.glScaled(1.2F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GL11.glTranslatef(-0.05F, -0.8F, -3.5F);
                    GL11.glScaled(1.2F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Attachments.Grip2Tan, (model) -> {
                    GL11.glTranslatef(-0.05F, -0.8F, -3.5F);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGripTan, (model) -> {
                    GL11.glTranslatef(-0.05F, -0.8F, -3.5F);
                    GL11.glScaled(1.2F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Attachments.VGripTan, (model) -> {
                    GL11.glTranslatef(-0.05F, -0.8F, -3.5F);
                    GL11.glScaled(1.2F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GL11.glTranslatef(0F, -0.7F, -4.3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Silencer762x51, (model) -> {
                    GL11.glTranslatef(0.035F, -1.8F, -9.6F);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                })
                .withTextureNames("gunwerkshamr")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new GunwerksHAMR())
                        .withADSBeizer(new Vec3d(-0.2F, 5.0, -1.0))
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
                            GL11.glScaled(0.52F, 0.52F, 0.52F);
                            GL11.glTranslatef(-2F, 0.3F, 1.9F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-2.265000f, 5.905000f, -5.005000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withRotationPoint(0.610000f, -2.780000f, 3.300000f)
                                        .withScale(3.0F, 3.0F, 3.0F)
                        )

                        .withFirstPersonHandPositioning(


                                new Transform()
                                        .withPosition(1.410000f, -0.375000f, 0.380000f)
                                        .withBBRotation(-8.1997F, -23.6991F, 57.7232F)
                                        .withScale(2.6F, 2.6F, 4.0F)
                                        .withRotationPoint(0, 0, 0),


                                new Transform()
                                        .withPosition(0.080000f, -0.180000f, 3.120000f)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3.5F, 3.5F, 3.5F)
                                        .withRotationPoint(0, 0, 0)

                        )

                        .setupModernAnimations("m40a6", AuxiliaryAttachments.M40A6BoltAction)
                        .setupCustomKeyedPart(AuxiliaryAttachments.M40A6BoltAction, "m40a6", BBLoader.KEY_BOLT_ACTION)
                        .setupCustomKeyedPart(AuxiliaryAttachments.M40A6BoltActionPrime, "m40a6", "boltprime")
                        .setupModernMagazineAnimations("m40a6",
                                Magazines.M40A6Mag)

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glTranslatef(-0.062F, 0.635F, 0.05F);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider))
                                GL11.glTranslatef(0F, 0.02f, 0.3f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope))
                                GL11.glTranslatef(0F, 0.02f, 0.65f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG))
                                GL11.glTranslatef(0F, 0.035f, 0.55f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter))
                                GL11.glTranslatef(0F, -0.06f, 0.8f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1))
                                GL11.glTranslatef(0F, -0.01f, 0.5f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5))
                                GL11.glTranslatef(0F, -0.01f, 0.5f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex))
                                GL11.glTranslatef(0F, 0f, 0.8f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex))
                                GL11.glTranslatef(0F, -0.05f, 0.9f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex))
                                GL11.glTranslatef(0F, -0.05f, 0.6f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic))
                                GL11.glTranslatef(0F, 0.015f, 0.4f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt))
                                GL11.glTranslatef(0F, 0.015f, 0.4f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2))
                                GL11.glTranslatef(0F, 0.015f, 0.2f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux))
                                GL11.glTranslatef(0F, 0.045f, 0.5f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra))
                                GL11.glTranslatef(0F, 0.01f, 0.3f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3))
                                GL11.glTranslatef(0F, 0.01f, 0.3f);
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
                                            .withScale(2.6F, 2.6F, 4.0F)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.2F, 0.1F, 2)
                                            .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                            .withScale(3.5F, 3.5F, 3.5F)
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
                                            .withRotation(-12.193518f, -4.7805F, 1.399459f)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                })

                        .build())
                .withSpawnEntityDamage(15f)
                .withSpawnEntityGravityVelocity(0f)


                .build(MWC.modContext);
    }
}