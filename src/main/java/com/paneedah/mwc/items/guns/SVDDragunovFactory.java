package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;


public class SVDDragunovFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
                .withName("svd_dragunov")
                .withFireRate(0.3f)
                .withRecoil(8f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.SNIPER_RIFLE)
                .withMuzzlePosition(new Vec3d(-.15, -1, -10.8))
                .hasFlashPedals()
                .withMaxShots(1)
                .withShootSound("m110")
                .withSilencedShootSound("ak15_silenced")
                .withReloadSound("ak_reload")
                .withUnloadSound("ak_unload")
                .withInspectSound("inspection")
                .withDrawSound("ak_draw")
                .withReloadingTime(45)
                .withFlashIntensity(0.4f)
                .withFlashScale(() -> 0.5f)
                .withFlashOffsetX(() -> 0.12f)
                .withFlashOffsetY(() -> 0.16f)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        35.0,
                        25.0,
                        50.0,
                        0.5625,
                        0.2625,
                        0.0,
                        0.0,
                        1.0
                ))


                .withScreenShaking(RenderableState.SHOOTING,
                        1.5f,
                        1.5f,
                        4f)

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)

                .withModernRecipe(new CraftingEntry(MWCItems.steelIngot, 12), new
                        CraftingEntry(MWCItems.carbonComposite, 14), new
                        CraftingEntry(MWCItems.gunmetalPlate, 18), new
                        CraftingEntry(Blocks.PLANKS, 10))

                .withCompatibleAttachment(Attachments.DragunovGripStock, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.Dragunov98Stock, (model) -> {
                })
                .withCompatibleAttachment(Attachments.DragunovDustCover, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.Dragunov98DustCover, (model) -> {
                })
                .withCompatibleAttachment(Attachments.DragunovHandguard, true, (model) -> {
                    if (model instanceof AKMiron2) {
                        GL11.glTranslatef(-0.185F, -1.39F, -10.35F);
                        GL11.glScaled(0.55F, 0.55F, 1.2F);
                    } else if (model instanceof AK47iron) {
                        GL11.glTranslatef(-0.25F, -1.7F, -3.9F);
                        GL11.glScaled(0.8F, 0.7F, 0.7F);
                    }
                })
                .withCompatibleAttachment(Attachments.Dragunov98Handguard, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.DragunovAction, true, (model) -> {
                })
                .withCompatibleAttachment(Magazines.DragunovMag, (model) -> {
                })
                .withCompatibleAttachment(Attachments.NightRaider, () -> {
                    GL11.glTranslatef(-0.21F, -1.4F, -2.65F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, () -> {
                    GL11.glTranslatef(-0.32F, -1.4F, -1.5F);
                    GL11.glScaled(0.83F, 0.83F, 0.83F);
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })

                .withCompatibleAttachment(Attachments.LeupoldRailScope, () -> {
                    GL11.glTranslatef(-0.155F, -1.23F, -2.8F);
                    GL11.glScaled(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                        GL11.glScaled(0.04F, 0.04F, 0.04F);
                    }
                })

                .withCompatibleAttachment(Attachments.Specter, () -> {
                    GL11.glTranslatef(-0.195F, -1.05F, -1.9F);
                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroReflex, () -> {
                    GL11.glTranslatef(-0.15F, -1.91F, -1.9F);
                    GL11.glScaled(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroT1, () -> {
                    GL11.glTranslatef(-0.185F, -1.41F, -1.7F);
                    GL11.glScaled(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, () -> {
                    GL11.glTranslatef(-0.185F, -1.41F, -1.7F);
                    GL11.glScaled(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, () -> {
                    GL11.glTranslatef(-0.06F, -1.18F, -2.2F);
                    GL11.glScaled(0.52F, 0.52F, 0.52F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
                    GL11.glTranslatef(-0.055F, -1.16F, -2.0F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, () -> {
                    GL11.glTranslatef(-0.035F, -1.25F, -1.95F);
                    GL11.glScaled(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, () -> {
                    GL11.glTranslatef(-0.035F, -1.25F, -1.95F);
                    GL11.glScaled(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.EotechHybrid2, () -> {
                    GL11.glTranslatef(-0.035F, -1.25F, -2.3F);
                    GL11.glScaled(0.73F, 0.73F, 0.73F);
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
                    GL11.glTranslatef(-0.33F, -1.44F, -2.4F);
                    GL11.glScaled(0.52F, 0.52F, 0.52F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, () -> {
                    GL11.glTranslatef(-0.04F, -1.24F, -1.8F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, () -> {
                    GL11.glTranslatef(-0.04F, -1.24F, -1.8F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.PSO1, () -> {
                    GL11.glTranslatef(0.14F, -0.9F, -1.5F);
                    GL11.glScaled(1.2F, 1.2F, 1.2F);
                }, (model) -> {
                    if (model instanceof PSO1reticle) {
                        GL11.glTranslatef(-0.212F, -0.486F, 1.27F);
                        GL11.glScaled(0.017F, 0.017F, 0.017F);
                    } else if (model instanceof PSO12) {
                        GL11.glTranslatef(-0.27F, -0.6F, 1.21F);
                        GL11.glScaled(0.8F, 0.8F, 0.8F);
                    }
                })
                .withCompatibleAttachment(Attachments.OKP7, () -> {
                    GL11.glTranslatef(-0.2F, -0.65F, -1F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof OKP7reticle) {
                        GL11.glTranslatef(0.17F, -1.15F, -0.6F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraMount, () -> {
                    GL11.glTranslatef(-0.035F, -1.23F, -0.6F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Silencer762x54, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.Dragunov98Handguard) {
                            GL11.glTranslatef(-0.2F, -1.08F, -11F);
                            GL11.glScaled(1F, 1F, 1F);
                        } else {
                            GL11.glTranslatef(-0.2F, -1.14F, -12F);
                            GL11.glScaled(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof AcogReticle) {
                        GL11.glTranslatef(0F, 0F, 0f);
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }, false, false)

                .withTextureNames("dragunov")
                .withRenderer(new WeaponRenderer.Builder()
                        .withModel(new Dragunov())
                        .withActionPiece(AuxiliaryAttachments.DragunovAction)
                        .withActionTransform(new Transform().withPosition(0, 0, 1))
                        .withADSBeizer(new Vec3d(0.2F, 1.7, 0.5F))

                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(0, 0f, 3f);
                            GL11.glRotatef(0F, 0f, 0f, 4f);
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
                                        .withPosition(-1.225000f, 3.825000f, -1.605000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.350000f, -1.780000f, -0.100000f)
                                        .withScale(3.0F, 3.0F, 3.0F)
                        )

                        .withFirstPersonHandPositioning(


                                new Transform()
                                        .withPosition(1.170000f, 0.265000f, -1.300000f)
                                        .withBBRotation(-7.1415F, -27.3003F, 52.6433F)
                                        .withScale(2.8F, 2.8F, 4.0F)
                                        .withPivotPoint(0, 0, 0),


                                new Transform()
                                        .withPosition(-0.200000f, 0.100000f, 1.840000f)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3, 3, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("dragunov", AuxiliaryAttachments.DragunovAction)
                        .setupModernMagazineAnimations("dragunov",
                                Magazines.DragunovMag)

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
                            GL11.glTranslatef(0.18f, -0.20f, 1f);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider))
                                GL11.glTranslatef(0F, 0.2f, 0.6f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG))
                                GL11.glTranslatef(0F, 0.23f, 0.8f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope))
                                GL11.glTranslatef(0F, 0.15f, 0.8f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter))
                                GL11.glTranslatef(0F, 0.15f, 0.75f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex))
                                GL11.glTranslatef(0F, 0.19f, 0.7f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1))
                                GL11.glTranslatef(0F, 0.22f, 0.7f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5))
                                GL11.glTranslatef(0F, 0.22f, 0.7f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex))
                                GL11.glTranslatef(0F, 0.18f, 0.7f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex))
                                GL11.glTranslatef(0F, 0.16f, 0.6f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic))
                                GL11.glTranslatef(0F, 0.23f, 0.6f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt))
                                GL11.glTranslatef(0F, 0.23f, 0.6f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2))
                                GL11.glTranslatef(0F, 0.25f, 0.6f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux))
                                GL11.glTranslatef(0F, 0.25f, 0.7f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra))
                                GL11.glTranslatef(0F, 0.21f, 0.7f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3))
                                GL11.glTranslatef(0F, 0.21f, 0.7f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraMount))
                                GL11.glTranslatef(0F, 0.2f, -0.4f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7))
                                GL11.glTranslatef(-0.05F, 0.1f, -0.2f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1))
                                GL11.glTranslatef(-0.01F, 0.13f, -0.3f);
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
                .withSpawnEntityDamage(14f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}