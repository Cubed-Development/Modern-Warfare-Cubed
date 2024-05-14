package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class ARX160Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
                .withName("arx160")
                .withFireRate(0.75f)
                .withRecoil(2.8f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.ASSAULT_RIFLE)
                .hasFlashPedals()
                .withMaxShots(1, 3, Integer.MAX_VALUE)
                .withMuzzlePosition(new Vec3d(-.1, -1.4, -6.3))
                .withShootSound("arx160")
                .withSilencedShootSound("m4a1_silenced")
                .withReloadSound("g36c_reload")
                .withUnloadSound("g36c_unload")
                .withEndOfShootSound("gun_click")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(50)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.15f)
                .withShellCasingForwardOffset(0.05f)
                .withShellCasingVerticalOffset(-0.03f)
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
                        0.5f,
                        0f,
                        3.5f)

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 6), new
                        CraftingEntry(MWCItems.gunmetalPlate, 10), new
                        CraftingEntry(MWCItems.steelIngot, 3))

                .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.ARX160Chassis, true, (model) -> {
                })
                .withCompatibleAttachment(Magazines.SOCOM_Mag, (model) -> {
                    GL11.glTranslatef(-0.325F, 0.1F, -1.49F);
                    GL11.glScaled(1F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
                    GL11.glTranslatef(-0.325F, 0.1F, -1.49F);
                    GL11.glScaled(1F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
                    GL11.glTranslatef(-0.325F, 0.1F, -1.49F);
                    GL11.glScaled(1F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
                    GL11.glTranslatef(0F, -0.35F, -0.2F);
                })
                .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glTranslatef(0F, -0.1F, -0.3F);
                })
                .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
                    GL11.glTranslatef(-0.35F, 0.3F, -1.4F);
                    GL11.glScaled(1.15F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.ARX160Action, true, (model) -> {
                })
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
                            GL11.glTranslatef(0F, 0F, 0F);
                            GL11.glScaled(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof MBUSFrontSight) {
                        GL11.glTranslatef(-0.16F, -2.1F, -3.5F);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    }
                }, true, false)
                .withCompatibleAttachment(Attachments.MBUSRearSights, true, (model) -> {
                    if (model instanceof MBUSRearSight) {
                        GL11.glTranslatef(-0.159F, -2.1F, -0.2F);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, itemStack) -> {
                    GL11.glTranslatef(-0.21F, -2F, -2.4F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, itemStack) -> {
                    GL11.glTranslatef(-0.31F, -2F, -1F);
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
                    GL11.glTranslatef(-0.19F, -1.66F, -1.4F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, itemStack) -> {
                    GL11.glTranslatef(-0.06F, -1.8F, -1.8F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, itemStack) -> {
                    GL11.glTranslatef(-0.06F, -1.8F, -1.8F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroReflex, (player, itemStack) -> {
                    GL11.glTranslatef(-0.15F, -2.51F, -1F);
                    GL11.glScaled(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, itemStack) -> {
                    GL11.glTranslatef(-0.034F, -1.83F, -1.4F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, itemStack) -> {
                    GL11.glTranslatef(-0.034F, -1.83F, -1.4F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, itemStack) -> {
                    GL11.glTranslatef(-0.034F, -1.83F, -1.8F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
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
                    GL11.glTranslatef(-0.33F, -2.05F, -1.8F);
                    GL11.glScaled(0.53F, 0.53F, 0.53F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, (player, itemStack) -> {
                    GL11.glTranslatef(-0.03F, -1.84F, -1.4F);
                    GL11.glScaled(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, (player, itemStack) -> {
                    GL11.glTranslatef(-0.03F, -1.84F, -1.4F);
                    GL11.glScaled(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, (player, itemStack) -> {
                    GL11.glTranslatef(-0.195F, -2.04F, -1.5F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.15F, -0.4F, -0.35F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, itemStack) -> {
                    GL11.glTranslatef(-0.195F, -2.04F, -1.5F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.15F, -0.4F, -0.35F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM2, (player, itemStack) -> {
                    GL11.glTranslatef(-0.12F, -1.4F, -1F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.005F, -0.89F, -1.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.57F, -3.3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.57F, -3.3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.5F, -3.5F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.57F, -3.3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Grip2Tan, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.57F, -3.3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGripTan, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.57F, -3.3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AngledGripTan, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.5F, -3.5F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.VGripTan, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.57F, -3.3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GL11.glTranslatef(-0.18F, -0.6F, -3.5F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })
                .withCompatibleAttachment(Attachments.Laser2, (player, itemStack) -> {
                    GL11.glTranslatef(0F, -1.6F, -4.3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Laser, (player, itemStack) -> {
                    GL11.glTranslatef(0F, -1.6F, -4.3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
                    GL11.glTranslatef(-0.2F, -1.5F, -7.4F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(-0.217F, -1.9F, -2.22F);
                        GL11.glScaled(0.67F, 0.675F, 0.9F);
                    } else if (model instanceof AKRail2) {
                        GL11.glTranslatef(-0.217F, -1.9F, -3.93F);
                        GL11.glScaled(0.67F, 0.675F, 0.9F);
                    } else if (model instanceof AKRail3) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKRail4) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKRail5) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withTextureNames("arx160")
                .withRenderer(new WeaponRenderer.Builder()
                        .withModel(new Glock18C())
                        .withADSBeizer(new Vec3d(0, 5, 0))
                        .withActionPiece(AuxiliaryAttachments.ARX160Action)
                        .withActionTransform(new Transform().withPosition(0, 0, 1))
                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(0, 0f, 3f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(1, 2f, -1.2f);
                            GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.6F, 0.6F, 0.6F);
                            GL11.glTranslatef(-2F, -0.9F, 2.1F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.425000f, 5.705000f, -3.005000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withRotationPoint(-0.350000f, -3.460000f, -0.580000f)
                                        .withScale(3.0F, 3.0F, 3.0F)
                        )

                        .withFirstPersonHandPositioning(


                                new Transform()
                                        .withPosition(1.090000f, -0.255000f, -0.500000f)
                                        .withBBRotation(-8.1997F, -23.6991F, 57.7232F)
                                        .withScale(2.6F, 2.6F, 4.0F)
                                        .withRotationPoint(0, 0, 0),


                                new Transform()
                                        .withPosition(-0.200000f, -0.180000f, 1.760000f)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3.5F, 3.5F, 3.5F)
                                        .withRotationPoint(0, 0, 0)

                        )

                        .setupModernAnimations("arx160", AuxiliaryAttachments.ARX160Action)
                        .setupModernMagazineAnimations("arx160",
                                Magazines.M4A1Mag,
                                Magazines.M38Mag,
                                Magazines.Stanag100,
                                Magazines.Stanag50,
                                Magazines.Stanag60,
                                Magazines.SOCOM_Mag)

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.ARX160Action.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GL11.glTranslatef(0F, 0F, 1F);
                            }
                        })

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glTranslatef(0.176F, 0.574f, 0.3F);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider))
                                GL11.glTranslatef(0F, 0.03f, 1f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG))
                                GL11.glTranslatef(0F, 0.047f, 1f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter))
                                GL11.glTranslatef(0F, -0.035f, 1.05f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex))
                                GL11.glTranslatef(0.005F, 0.01f, 0.85f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex))
                                GL11.glTranslatef(0F, -0.01f, 0.85f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex))
                                GL11.glTranslatef(0F, 0.01f, 0.4f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra))
                                GL11.glTranslatef(0F, 0.06f, 0.85f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3))
                                GL11.glTranslatef(0F, 0.06f, 0.85f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic))
                                GL11.glTranslatef(0F, 0.05f, 0.55f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt))
                                GL11.glTranslatef(0F, 0.05f, 0.55f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2))
                                GL11.glTranslatef(0.005F, 0.06f, 0.7f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux))
                                GL11.glTranslatef(0F, 0.09f, 0.7f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1))
                                GL11.glTranslatef(0F, 0.075f, 0.75f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5))
                                GL11.glTranslatef(0F, 0.075f, 0.75f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2))
                                GL11.glTranslatef(0F, 0f, 0.75f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.985000f, 5.145000f, -5.245000f)
                                    .withRotation(0.000000f, -30.514396f, -26.062789f)
                                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .doGLDirect();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.265000f, 4.745000f, -8.285000f)
                                    .withRotation(2.793742f, -46.352252f, -19.231070f)
                                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .doGLDirect();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.330000f, 0.065000f, 0.140000f)
                                            .withRotation(78.544055f, 23.699100f, 18.430633f)
                                            .withScale(2.6F, 2.6F, 4.0F)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.200000f, -0.180000f, 1.760000f)
                                            .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withRotationPoint(0, 0, 0)
                                            .doGLDirect();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.330000f, 0.065000f, 0.140000f)
                                            .withRotation(78.544055f, 23.699100f, 18.430633f)
                                            .withScale(2.600000f, 2.600000f, 4.000000f)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.200000f, -0.180000f, 1.760000f)
                                            .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                })

                        .build())
                .withSpawnEntityDamage(6f)
                .withSpawnEntityGravityVelocity(0.0118f)


                .build(MWC.modContext);
    }
}