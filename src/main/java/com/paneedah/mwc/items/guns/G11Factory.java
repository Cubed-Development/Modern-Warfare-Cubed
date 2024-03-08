package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class G11Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
                .withName("g11")
                .withFireRate(0.9f)
                .withRecoil(1f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.ASSAULT_RIFLE)
                .withMaxShots(1, 3, Integer.MAX_VALUE)
                .withMuzzlePosition(new Vec3d(-.2, -1, -4.7))
                .withShootSound("g11")
                .withSilencedShootSound("mp5_silenced")
                .withReloadSound("g11_reload")
                .withUnloadSound("g11_unload")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(45)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.3f)
                .withFlashOffsetX(() -> 0.14f)
                .withFlashOffsetY(() -> 0.18f)
                .withShellCasingEjectEnabled(false)
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

                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.G11HandguardK1, (model) -> {
                })
                .withCompatibleAttachment(Attachments.G11HandguardK2, true, (model) -> {
                })
                .withCompatibleAttachment(Magazines.G11Mag, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.G11Action, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.NightRaider, () -> {
                    GL11.glTranslatef(-0.24F, -1.9F, -1.6F);
                    GL11.glScaled(1F, 1F, 1F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, () -> {
                    GL11.glTranslatef(-0.362F, -1.85F, 0.15F);
                    GL11.glScaled(1F, 1F, 1F);
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, () -> {
                    GL11.glTranslatef(-0.2F, -1.9F, -0.3F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, () -> {
                    GL11.glTranslatef(-0.2F, -1.9F, -0.3F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Specter, () -> {
                    GL11.glTranslatef(-0.21F, -1.47F, -0.35F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, () -> {
                    GL11.glTranslatef(-0.05F, -1.63F, -0.8F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
                    GL11.glTranslatef(-0.05F, -1.61F, -0.8F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, () -> {
                    GL11.glTranslatef(-0.018F, -1.7F, -0.4F);
                    GL11.glScaled(0.85F, 0.85F, 0.85F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, () -> {
                    GL11.glTranslatef(-0.018F, -1.7F, -0.4F);
                    GL11.glScaled(0.85F, 0.85F, 0.85F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, () -> {
                    GL11.glTranslatef(-0.018F, -1.7F, -0.7F);
                    GL11.glScaled(0.85F, 0.85F, 0.85F);
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
                .withCompatibleAttachment(Attachments.Kobra, () -> {
                    GL11.glTranslatef(-0.01F, -1.68F, -0.3F);
                    GL11.glScaled(0.85F, 0.85F, 0.85F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, () -> {
                    GL11.glTranslatef(-0.01F, -1.68F, -0.3F);
                    GL11.glScaled(0.85F, 0.85F, 0.85F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.RMR, () -> {
                    GL11.glTranslatef(-0.194F, -1.9F, -0.3F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.15F, -0.03F, -1.5F);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    }
                })


                .withTextureNames("g11")
                .withRenderer(new WeaponRenderer.Builder()
                        .withActionPiece(
                                Magazines.G11Mag)
                        .withActionTransform(new Transform().withPosition(0, 0, 0.7F))

                        .withModel(new G11())
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
                            GL11.glScaled(0.4F, 0.4F, 0.4F);
                            GL11.glTranslatef(-2.2F, -1.1F, 2.3F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.425000f, 5.545000f, -5.765000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.350000f, -3.460000f, -0.580000f)
                                        .withScale(3.0F, 3.0F, 3.0F)
                        )

                        .withFirstPersonHandPositioning(


                                new Transform()
                                        .withPosition(1.090000f, 0.185000f, 0.180000f)
                                        .withBBRotation(-8.1997F, -23.6991F, 57.7232F)
                                        .withScale(2.6F, 2.6F, 4.0F)
                                        .withPivotPoint(0, 0, 0),


                                new Transform()
                                        .withPosition(-0.200000f, 0.340000f, 2.000000f)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3.5F, 3.5F, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("g11", AuxiliaryAttachments.G11Action)
                        .setupModernMagazineAnimations("g11",
                                Magazines.G11Mag)


                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glTranslatef(0.173F, 0.56F, -0.35F);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider))
                                GL11.glTranslatef(0.005F, 0.01f, 0.15f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG))
                                GL11.glTranslatef(0.005F, -0.035f, 0.25f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1))
                                GL11.glTranslatef(0.005F, -0.025f, 0.2f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5))
                                GL11.glTranslatef(0.005F, -0.025f, 0.2f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter))
                                GL11.glTranslatef(0.01F, -0.1f, 0.35f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex))
                                GL11.glTranslatef(0.007F, -0.07f, 0.3f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex))
                                GL11.glTranslatef(0.005F, -0.11f, 0.5f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic))
                                GL11.glTranslatef(0.005F, -0.01f, 0f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt))
                                GL11.glTranslatef(0.005F, -0.01f, 0f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2))
                                GL11.glTranslatef(0.005F, 0f, 0.05f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra))
                                GL11.glTranslatef(0F, -0.02f, 0f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3))
                                GL11.glTranslatef(0F, -0.02f, 0f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR))
                                GL11.glTranslatef(0.005F, -0.15f, 0.1f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.985000f, 5.145000f, -5.245000f)
                                    .withRotation(0.000000f, -30.514396f, -26.062789f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.265000f, 4.745000f, -8.285000f)
                                    .withRotation(2.793742f, -46.352252f, -19.231070f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.330000f, 0.065000f, 0.140000f)
                                            .withRotation(78.544055f, 23.699100f, 18.430633f)
                                            .withScale(2.6F, 2.6F, 4.0F)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.200000f, -0.180000f, 1.760000f)
                                            .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withPivotPoint(0, 0, 0)
                                            .applyTransformations();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.330000f, 0.065000f, 0.140000f)
                                            .withRotation(78.544055f, 23.699100f, 18.430633f)
                                            .withScale(2.600000f, 2.600000f, 4.000000f)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.200000f, -0.180000f, 1.760000f)
                                            .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                })

                        .build())
                .withSpawnEntityDamage(5f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}
