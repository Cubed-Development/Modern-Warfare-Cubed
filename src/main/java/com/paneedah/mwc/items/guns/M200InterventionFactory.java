package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.animation.jim.BBLoader;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class M200InterventionFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
                .withName("m200_intervention")
                .withFireRate(0.1f)
                .withEjectRoundRequired()
                .withEjectSpentRoundSound("m200_intervention_boltaction")
                .withMuzzlePosition(new Vec3d(.1, -1.5, -9.0))
                .withRecoil(16f)
                .withZoom(0.8f)
                .withConfigGroup(GunConfigurationGroup.SNIPER_RIFLE)
                .withMaxShots(1, Integer.MAX_VALUE)
                .withShootSound("m200_intervention")
                .withPumpTimeout(1500)
                .withSilencedShootSound("as50_silenced")
                .withDrawSound("noaction_draw")
                .withReloadingTime(40)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.08f)
                .withFlashOffsetY(() -> 0.11f)
                .withShellCasingEjectEnabled(false)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        75.0,
                        25.0,
                        26.25,
                        0.5,
                        0.525,
                        -0.020,
                        0.025,
                        1.0
                ))
                .withScreenShaking(RenderableState.SHOOTING,
                        7f,
                        -10f,
                        12f)

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 8), new
                        CraftingEntry(MWCItems.gunmetalPlate, 12), new
                        CraftingEntry(MWCItems.steelIngot, 5))

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Magazines.InterventionMag, (model) -> {
                })
                .withCompatibleAttachment(Magazines.InterventionMagExtend, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.InterventionBoltAction, true, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.InterventionBoltActionPrime, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.InterventionStock, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.InterventionKiloTaCStock, (model) -> {
                })
                .withCompatibleAttachment(Attachments.InterventionFJXLUX7Stock, (model) -> {
                })
                .withCompatibleAttachment(Attachments.InterventionHandguard, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.InterventionQTDRifleHandguard, (model) -> {
                })
                .withCompatibleAttachment(Attachments.InterventionRailSystemHandguard, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(0.03F, -1.93F, -5.47f);
                        GL11.glScaled(0.7F, 1.0F, 1.58F);
                    }
                })
                .withCompatibleAttachment(Attachments.InterventionCarryHandle, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.InterventionKeystoneHandle, (model) -> {
                })
                .withCompatibleAttachment(Attachments.HK416FrontSight, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.InterventionHandguard) {
                            GL11.glTranslatef(0.23F, -0.18F, -0.63F);
                            GL11.glScaled(1F, 1F, 1F);
                        } else {
                            GL11.glTranslatef(0.23F, -0.18F, -2.23F);
                            GL11.glScaled(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof G95_upright_frontsights) {
                        GL11.glTranslatef(-0.155F, -1.95F, -0.5F);
                        GL11.glScaled(0.32F, 0.32F, 0.32F);
                    }
                }, true, false)
                .withCompatibleAttachment(Attachments.HK416RearSights, true, (model) -> {
                    if (model instanceof G95_upright_rearsights) {
                        GL11.glTranslatef(0.08F, -2.09F, 0.2F);
                        GL11.glScaled(0.33F, 0.33F, 0.33F);
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, () -> {
                    GL11.glTranslatef(0.03F, -1.98F, -1.5F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, () -> {
                    GL11.glTranslatef(-0.093F, -2F, -0F);
                    GL11.glScaled(0.88F, 0.88F, 0.88F);
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
                    GL11.glTranslatef(0.05F, -1.7F, -0.5F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.LeupoldRailScope, () -> {
                    GL11.glTranslatef(0.085F, -1.83F, -1.1F);
                    GL11.glScaled(0.48F, 0.48F, 0.48F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                        GL11.glScaled(0.04F, 0.04F, 0.04F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, () -> {
                    GL11.glTranslatef(0.18F, -1.8F, -0.5F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
                    GL11.glTranslatef(0.18F, -1.8F, -0.5F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, () -> {
                    GL11.glTranslatef(0.21F, -1.85F, -0.5F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, () -> {
                    GL11.glTranslatef(0.21F, -1.85F, -0.5F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, () -> {
                    GL11.glTranslatef(0.21F, -1.85F, -0.5F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
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
                    GL11.glTranslatef(-0.08F, -2.05F, -0.7F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, () -> {
                    GL11.glTranslatef(0.21F, -1.85F, -0.2F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, () -> {
                    GL11.glTranslatef(0.05F, -2.05F, -0.2F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GL11.glTranslatef(0.05F, -0.73F, -4.85F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Laser2, () -> {
                    GL11.glTranslatef(-0.0F, -1.65F, -5.9F);
                    GL11.glScaled(0.9F, 0.9F, 0.9F);
                    GL11.glRotatef(-90F, 0f, 0f, 1f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Bullet, true, (model) -> {
                    if (model instanceof BulletBig) {
                        GL11.glScaled(0.5F, 0.5F, 1F);
                        GL11.glTranslatef(0.15F, -3F, -2.2F);
                        GL11.glRotatef(90f, 1f, 0f, 0f);
                    }
                })
                .withTextureNames("intervention")
                .withRenderer(new WeaponRenderer.Builder()
                        .withModel(new Intervention())
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
                            GL11.glScaled(0.45F, 0.45F, 0.45F);
                            GL11.glTranslatef(-2.3F, -0.5F, 2.2F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-2.265000f, 5.405000f, -5.455000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(0.610000f, -2.780000f, 3.300000f)
                                        .withScale(3.0f, 3.0f, 3.0f)
                        )

                        .withFirstPersonHandPositioning(

                                new Transform()
                                        .withPosition(1.410000f, -0.175000f, 0.580000f)
                                        .withBBRotation(-8.1997f, -23.6991f, 57.7232f)
                                        .withScale(2.6f, 2.6f, 4.0f)
                                        .withPivotPoint(0, 0, 0),


                                new Transform()
                                        .withPosition(0.080000f, -0.180000f, 3.020000f)
                                        .withRotation(-5.4027f, -4.7805f, -1.6694f)
                                        .withScale(3.5f, 3.5f, 3.5f)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("m40a6", AuxiliaryAttachments.InterventionBoltAction)
                        .setupCustomKeyedPart(AuxiliaryAttachments.InterventionBoltAction, "m40a6", BBLoader.KEY_BOLT_ACTION)
                        .setupCustomKeyedPart(AuxiliaryAttachments.InterventionBoltActionPrime, "m40a6", "boltprime")
                        .setupModernMagazineAnimations("m40a6",
                                Magazines.InterventionMag,
                                Magazines.InterventionMagExtend)

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glTranslatef(-0.062F, 0.565F, -0.325F);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider))
                                GL11.glTranslatef(0F, 0.015f, 0.8f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope))
                                GL11.glTranslatef(-0.005F, 0.023f, 0.23f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG))
                                GL11.glTranslatef(0F, 0.08f, 0.55f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter))
                                GL11.glTranslatef(0F, 0.01f, 0.8f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5))
                                GL11.glTranslatef(0F, 0.09f, 0.35f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex))
                                GL11.glTranslatef(0F, 0.01f, 0.25f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex))
                                GL11.glTranslatef(0F, 0.005f, 0.35f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic))
                                GL11.glTranslatef(-0.01F, 0.055f, 0.35f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt))
                                GL11.glTranslatef(-0.01F, 0.055f, 0.35f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2))
                                GL11.glTranslatef(-0.005F, 0.065f, 0.2f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux))
                                GL11.glTranslatef(0F, 0.09f, 0.3f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra))
                                GL11.glTranslatef(0F, 0.05f, 0.35f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3))
                                GL11.glTranslatef(0F, 0.05f, 0.35f);
                        })


                        .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.Bullet.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 300),
                                new Transition((renderContext) -> {
                                }, 250, 300),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(-0.4F, -0.5F, -0F);
                                    GL11.glRotatef(10f, 1f, 0f, 0f);
                                    GL11.glRotatef(25f, 0f, 1f, 0f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(-1F, -0.3F, -0F);
                                    GL11.glRotatef(30f, 1f, 0f, 0f);
                                    GL11.glRotatef(35f, 0f, 1f, 0f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(-1.4F, -0F, 0.3F);
                                    GL11.glRotatef(35f, 1f, 0f, 0f);
                                    GL11.glRotatef(40f, 0f, 1f, 0f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(-2F, 1F, 1F);
                                    GL11.glRotatef(45f, 1f, 0f, 0f);
                                    GL11.glRotatef(50f, 0f, 1f, 0f);

                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(-2F, 3F, 1F);
                                    GL11.glRotatef(0f, 1f, 0f, 0f);
                                    GL11.glRotatef(0f, 0f, 1f, 0f);
                                }, 250, 50)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.Bullet.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                }, 250, 300),
                                new Transition((renderContext) -> {
                                }, 250, 300),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(-0.4F, -0.5F, -0F);
                                    GL11.glRotatef(10f, 1f, 0f, 0f);
                                    GL11.glRotatef(25f, 0f, 1f, 0f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(-1F, -0.3F, -0F);
                                    GL11.glRotatef(30f, 1f, 0f, 0f);
                                    GL11.glRotatef(35f, 0f, 1f, 0f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(-1.4F, -0F, 0.3F);
                                    GL11.glRotatef(35f, 1f, 0f, 0f);
                                    GL11.glRotatef(40f, 0f, 1f, 0f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(-2F, 1F, 1F);
                                    GL11.glRotatef(45f, 1f, 0f, 0f);
                                    GL11.glRotatef(50f, 0f, 1f, 0f);

                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(-2F, 3F, 1F);
                                    GL11.glRotatef(0f, 1f, 0f, 0f);
                                    GL11.glRotatef(0f, 0f, 1f, 0f);
                                }, 250, 50)

                        )

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.905000f, 4.065000f, -3.645000f)
                                    .withRotation(0.000000f, -30.514396f, -26.062789f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(2.300000f, 2.300000f, 2.300000f)
                                    .applyTransformations();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.425000f, 3.545000f, -5.685000f)
                                    .withRotation(-0.187566f, -46.164037f, -11.869230f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(2.300000f, 2.300000f, 2.300000f)
                                    .applyTransformations();
                        })
                        .withFirstPersonHandPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(1.730000f, 0.065000f, -0.980000f)
                                    .withRotation(93.414678f, 23.699100f, 15.553163f)
                                    .withScale(2.6f, 2.6f, 4.0f)
                                    .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                    .applyTransformations();
                        }, (renderContext) -> {
                            new Transform()
                                    .withPosition(-0.2f, 0.1f, 2f)
                                    .withRotation(-5.4027f, -4.7805f, -1.6694f)
                                    .withScale(3.5f, 3.5f, 3.5f)
                                    .withPivotPoint(0f, 0f, 0f)
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
                                }, (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.600000f, 0.340000f, 1.880000f)
                                            .withRotation(-12.193518f, -4.780500f, 1.399459f)
                                            .withScale(3.5f, 3.5f, 3.5f)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                }
                        )


                        .build())
                .withSpawnEntityDamage(25f)
                .withSpawnEntityGravityVelocity(0.0118f)


                .build(MWC.modContext);
    }
}