package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.*;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class M82Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
                .withName("m82_barrett")
                .withFireRate(0.1f)
                .withRecoil(15f)
                .withZoom(0.8f)
                .withConfigGroup(GunConfigurationGroup.SNIPER_RIFLE)
                .withMuzzlePosition(new Vec3d(-.1, -1.1, -10.8))
                .hasFlashPedals()
                .withMaxShots(1)
                .withShootSound("m82")
                .withPumpTimeout(1000)
                .withSilencedShootSound("as50_silenced")
                .withReloadSound("as50_reload")
                .withUnloadSound("as50_unload")
                .withInspectSound("inspection")
                .withDrawSound("as50_draw")
                .withReloadingTime(40)
                .withFlashIntensity(0.4f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.08f)
                .withFlashOffsetY(() -> 0.08f)
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

                .withScreenShaking(RenderableState.SHOOTING,
                        6f,
                        -5f,
                        12f)

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 12), new
                        CraftingEntry(MWCItems.gunmetalPlate, 15), new
                        CraftingEntry(MWCItems.steelIngot, 10))

                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.GripPlaceholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M82Action, true, (model) -> {
                })
                .withCompatibleAttachment(Magazines.M82Mag, (model) -> {
                })
                .withCompatibleAttachment(Attachments.M4Grip, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
                })
                .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
                })
                .withCompatibleAttachment(Attachments.NightRaider, () -> {
                    GL11.glTranslatef(-0.22F, -1.58F, -2.5F);
                    GL11.glScaled(0.9F, 0.9F, 0.9F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, () -> {
                    GL11.glTranslatef(-0.328F, -1.6F, -1.2F);
                    GL11.glScaled(0.9F, 0.9F, 0.9F);
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.Specter, () -> {
                    GL11.glTranslatef(-0.19F, -1.22F, -1.5F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.LeupoldRailScope, () -> {
                    GL11.glTranslatef(-0.155F, -1.4F, -2.2F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                        GL11.glScaled(0.04F, 0.04F, 0.04F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroReflex, () -> {
                    GL11.glTranslatef(-0.145F, -2.15F, -1F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, () -> {
                    GL11.glTranslatef(-0.045F, -1.35F, -1.5F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
                    GL11.glTranslatef(-0.04F, -1.32F, -1.6F);
                    GL11.glScaled(0.63F, 0.63F, 0.63F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, () -> {
                    GL11.glTranslatef(-0.015F, -1.4F, -1.5F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, () -> {
                    GL11.glTranslatef(-0.015F, -1.4F, -1.5F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, () -> {
                    GL11.glTranslatef(-0.015F, -1.4F, -1.8F);
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
                .withCompatibleAttachment(Attachments.VortexRedux, () -> {
                    GL11.glTranslatef(-0.315F, -1.61F, -1.5F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, () -> {
                    GL11.glTranslatef(-0.025F, -1.42F, -1F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, () -> {
                    GL11.glTranslatef(-0.025F, -1.42F, -1F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, () -> {
                    GL11.glTranslatef(-0.186F, -1.6F, -1F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, () -> {
                    GL11.glTranslatef(-0.186F, -1.6F, -1F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GL11.glTranslatef(-0.18F, -0.15F, -4.9F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Silencer50BMG, (model) -> {
                    GL11.glTranslatef(-0.2F, -1.35F, -11.5F);
                    GL11.glScaled(1.0F, 1.0F, 1.0F);
                })
                .withTextureNames("m82")
                .withRenderer(new WeaponRenderer.Builder()
                        .withModel(new M82())
                        .withActionPiece(AuxiliaryAttachments.M82Action)
                        .withActionTransform(new Transform().withPosition(0, 0, 1.5F))
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
                            GL11.glScaled(0.45F, 0.45F, 0.45F);
                            GL11.glTranslatef(-2.2F, -1.1F, 2.4F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.705000f, 4.705000f, -3.445000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.230000f, -1.740000f, 0.140000f)
                                        .withScale(3.0F, 3.0F, 3.0F)
                        )

                        .withFirstPersonHandPositioning(


                                new Transform()
                                        .withPosition(1.250000f, 0.265000f, -0.980000f)
                                        .withBBRotation(-6.645F, -32.8876F, 56.8877F)
                                        .withScale(2.6F, 2.6F, 4.0F)
                                        .withPivotPoint(0, 0, 0),


                                new Transform()
                                        .withPosition(-0.160000f, 0.060000f, 1.640000f)
                                        .withBBRotation(5.4027F, 4.7805F, -1.6694F)
                                        .withScale(3.0F, 3.0F, 3.0F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("m82", AuxiliaryAttachments.M82Action)
                        .setupModernMagazineAnimations("m82",
                                Magazines.M82Mag)

                        .withThirdPersonPositioningReloading(
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                                    GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 250, 100),
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                                    GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 150, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                                    GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 260, 0),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                                    GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 400, 150),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                                    GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 300, 60),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                                    GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 100, 170),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                                    GL11.glTranslatef(-3.8F, -2F, 4F);
                                    GL11.glRotatef(-60F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 350, 100),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                                    GL11.glTranslatef(-3.8F, -2F, 4F);
                                    GL11.glRotatef(-60F, 0f, 1f, 0f);
                                    GL11.glRotatef(100F, 1f, 0f, 0f);
                                }, 220, 200),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                                    GL11.glTranslatef(-3.8F, -2F, 4F);
                                    GL11.glRotatef(-60F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 220, 0)
                        )

                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M82Action.getRenderablePart(),
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
                                    GL11.glTranslatef(0f, 0f, 1.3f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glTranslatef(0.168F, 0.1F, 0.05F);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider))
                                GL11.glTranslatef(0f, 0.12f, 0.9f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG))
                                GL11.glTranslatef(0f, 0.15f, 1.3f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter))
                                GL11.glTranslatef(0f, 0.05f, 1.3f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope))
                                GL11.glTranslatef(0f, 0.12f, 0.6f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex))
                                GL11.glTranslatef(0f, 0.1f, 0.8f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex))
                                GL11.glTranslatef(0f, 0.08f, 0.9f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex))
                                GL11.glTranslatef(0f, 0.1f, 0.8f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic))
                                GL11.glTranslatef(-0.003f, 0.13f, 0.9f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt))
                                GL11.glTranslatef(-0.003f, 0.13f, 0.9f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2))
                                GL11.glTranslatef(0f, 0.135f, 0.9f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux))
                                GL11.glTranslatef(0f, 0.13f, 0.9f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra))
                                GL11.glTranslatef(0f, 0.12f, 0.5f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3))
                                GL11.glTranslatef(0f, 0.12f, 0.5f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1))
                                GL11.glTranslatef(0f, 0.11f, 0.9f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5))
                                GL11.glTranslatef(0f, 0.11f, 0.9f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.905000f, 4.065000f, -3.645000f)
                                    .withRotation(0.000000f, -30.514396f, -26.062789f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.425000f, 3.545000f, -5.685000f)
                                    .withRotation(-0.187566f, -46.164037f, -11.869230f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(1.730000f, 0.065000f, -0.980000f)
                                            .withRotation(93.414678f, 23.699100f, 15.553163f)
                                            .withScale(2.6F, 2.6F, 4.0F)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.2F, 0.1F, 2)
                                            .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withPivotPoint(0, 0, 0)
                                            .applyTransformations();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.450000f, -0.335000f, -0.660000f)
                                            .withRotation(93.766422f, 50.841130f, 4.679372f)
                                            .withScale(2.600000f, 2.600000f, 4.000000f)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.600000f, 0.340000f, 1.880000f)
                                            .withRotation(-12.193518f, -4.7805F, 1.399459f)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                })

                        .withThirdPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                                }, 50, 200),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                                }, 50, 200),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                                }, 50, 200),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                                }, 50, 200),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                                }, 50, 200),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                                }, 250, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                                }, 250, 100),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                                }, 280, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                                }, 280, 0))

                        .withThirdPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-49.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 50),

                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(14.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                                }, 260, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                                }, 250, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.075000f, -0.075000f, 0.025000f);
                                }, 250, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                                }, 300, 0))

                        .build())
                .withSpawnEntityDamage(25f)
                .withSpawnEntityGravityVelocity(0f)


                .build(MWC.modContext);
    }
}
