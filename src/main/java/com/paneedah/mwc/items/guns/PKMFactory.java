package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class PKMFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("pkm")
                .withFireRate(0.5f)
                .withRecoil(3f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.HEAVY)
                .withMuzzlePosition(new Vec3d(-0.13600000405311594, -1.144000004291535, -8.512000045061113))
                .withMaxShots(Integer.MAX_VALUE)
                .withShootSound("m60")
                .withSilencedShootSound("ak15_silenced")
                .withDrawSound("mg42_draw")
                .withReloadingTime(45)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.16f)
                .withShellCasingVerticalOffset(-0.05f)
                .withShellCasingForwardOffset(-0.2f)
                .withShellCasingEjectEnabled(false)
                .withInaccuracy(1f)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        // The weapons power
                        40.0,
                        // Muzzle climb divisor
                        15.75,
                        // "Stock Length"
                        50.0,
                        // Recovery rate from initial shot
                        0.4,
                        // Recovery rate @ "stock"
                        0.3125,
                        // Recoil rotation (Y)
                        -0.0425,
                        // Recoil rotation (Z)
                        -0.0225,
                        // Ads similarity divisor
                        1.8
                ))

                .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
                .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)

        .withCompatibleAttachment(AuxiliaryAttachments.PKMAction, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.PKMHatch, true, (model) -> {
            if(model instanceof PKMrearsight) {
                GL11.glTranslatef(-0.0F, -2.44F, -1.2F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.PKMBelt, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.PKMBarrel, true, (model) -> {
            if(model instanceof PKMfrontsight) {
                GL11.glTranslatef(-0.0F, -1.93F, -8.2F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
        })
        .withCompatibleAttachment(Attachments.PechenegBarrel, (model) -> {
            if(model instanceof PKMfrontsight) {
                GL11.glTranslatef(-0.0F, -1.93F, -8.2F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
        })
        .withCompatibleAttachment(Attachments.PechenegBipod, (model) -> {
        })
        .withCompatibleAttachment(Attachments.PKMGrip, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.RK3PGrip, (model) -> {
        })
        .withCompatibleAttachment(Attachments.PKMStock, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.PT2Stock, (model) -> {
        })
        .withCompatibleAttachment(Attachments.B51ScopeMountRail, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(-0.23F, -1.95F, -2.6f);
                GL11.glScaled(0.7F, 0.6F, 0.9F);
            }
        })
        .withCompatibleAttachment(Attachments.B50PKMHandguard, (model) -> {
            GL11.glTranslatef(-0.25F, -1.64F, -4.1F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
         })
        .withCompatibleAttachment(Attachments.B50PKPHandguard, (model) -> {
            GL11.glTranslatef(-0.25F, -1.64F, -4.1F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        })
        .withCompatibleAttachment(Magazines.PKMMag, (model) -> {
        })

                .withCompatibleAttachment(Attachments.NightRaider, () -> {
                    GL11.glTranslatef(-0.2F, -2.0F, -2.3F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, () -> {
                    GL11.glTranslatef(-0.35F, -2.0F, -0.91F);
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
                .withCompatibleAttachment(Attachments.Specter, () -> {
                    GL11.glTranslatef(-0.2F, -1.65F, -1.45F);
                    GL11.glScaled(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, () -> {
                    GL11.glTranslatef(-0.1F, -1.9F, -1.8F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroReflex, () -> {
                    GL11.glTranslatef(-0.17F, -2.5F, -1.8F);
                    GL11.glScaled(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    } else if (model instanceof SightMount) {
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
                    GL11.glTranslatef(0.01F, -1.8F, -0.83F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, () -> {
                    GL11.glTranslatef(0.03F, -1.85F, -0.67F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, () -> {
                    GL11.glTranslatef(0.03F, -1.85F, -0.67F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, () -> {
                    GL11.glTranslatef(0.03F, -1.85F, -0.67F);
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
                .withCompatibleAttachment(Attachments.VortexRedux, () -> {
                    GL11.glTranslatef(-0.215F, -2.05F, -0.93F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, () -> {
                    GL11.glTranslatef(0.04f, -1.8f, -0.57f);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, () -> {
                    GL11.glTranslatef(0.04f, -1.8f, -0.57f);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, () -> {
                    GL11.glTranslatef(-0.1F, -2.0F, -0.6F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, () -> {
                    GL11.glTranslatef(-0.1F, -2.0F, -0.6F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GL11.glTranslatef(-0.1F, -0.01F, -3.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GL11.glTranslatef(-0.1F, -0.01F, -3.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GL11.glTranslatef(-0.1F, 0.11F, -3.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GL11.glTranslatef(-0.1F, -0.01F, -3.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GL11.glTranslatef(-0.1F, -0.41F, -5.4F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Laser2, () -> {
                    GL11.glTranslatef(0.125F, -1.38F, -3.86F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })
                .withCompatibleAttachment(Attachments.Laser, () -> {
                    GL11.glTranslatef(0.125F, -1.38F, -3.86F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })
                .withTextureNames("pkm")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new PKM())
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
                            GL11.glScaled(0.45F, 0.45F, 0.45F);
                            GL11.glTranslatef(-1.7F, -0.8F, 1.9F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.825000f, 5.665000f, -5.605000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                        .withScale(3.5F, 3.5F, 3.5F)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.730000f, 0.865000f, -1.146400f)
                                        .withBBRotation(-15.4928F, -45.7685F, 66.3639F)
                                        .withScale(2.6F, 2.6F, 4.0F)
                                        .withPivotPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.2F, 0.1F, 2)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3.5F, 3.5F, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("m249", AuxiliaryAttachments.PKMAction)
                        .setupCustomKeyedPart(AuxiliaryAttachments.PKMBelt, "m249", "belt")
                        .setupCustomKeyedPart(AuxiliaryAttachments.PKMHatch, "m249", "hatch")
                        .setupCustomKeyedPart(Attachments.ACOG, "m249", "scope")
                        .setupCustomKeyedPart(Attachments.Specter, "m249", "scope")
                        .setupCustomKeyedPart(Attachments.Reflex, "m249", "scope")
                        .setupCustomKeyedPart(Attachments.NightRaider, "m249", "scope")
                        .setupCustomKeyedPart(Attachments.BijiaReflex, "m249", "scope")
                        .setupCustomKeyedPart(Attachments.Holographic, "m249", "scope")
                        .setupCustomKeyedPart(Attachments.HolographicAlt, "m249", "scope")
                        .setupCustomKeyedPart(Attachments.EotechHybrid2, "m249", "scope")
                        .setupCustomKeyedPart(Attachments.MicroT1, "m249", "scope")
                        .setupCustomKeyedPart(Attachments.AimpointCompM5, "m249", "scope")
                        .setupCustomKeyedPart(Attachments.VortexRedux, "m249", "scope")
                        .setupCustomKeyedPart(Attachments.Kobra, "m249", "scope")
                        .setupCustomKeyedPart(Attachments.KobraGen3, "m249", "scope")
                        .setupCustomKeyedPart(Attachments.M60Rail, "m249", "scope")
                        .setupModernMagazineAnimations("m249",
                                Magazines.PKMMag)

              .withFirstPersonCustomPositioning(AuxiliaryAttachments.PKMBelt.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(-0.5F, 3.0F, 5F);
                }
            })

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                            GL11.glTranslatef(0.12F, 1.21F, 0.2F);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                GL11.glTranslatef(0.014F, 0.47f, 0.1f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                GL11.glTranslatef(0.05F, 0.5f, 0.1f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                GL11.glTranslatef(0F, 0.1f, 0.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                GL11.glTranslatef(0F, 0.05f, 0.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                GL11.glTranslatef(0.034F, 0.38f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                GL11.glTranslatef(0.05F, 0.5f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                GL11.glTranslatef(0.04F, 0.47f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                GL11.glTranslatef(0F, 0.05f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                GL11.glTranslatef(0F, 0.09f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                GL11.glTranslatef(0F, 0.09f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                GL11.glTranslatef(0F, 0.07f, 0.1f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                GL11.glTranslatef(0F, 0.12f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                GL11.glTranslatef(0F, 0.08f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                GL11.glTranslatef(0F, 0.08f, 0f);
                            } else {
                            }


                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.905000f, 4.065000f, -3.645000f)
                                    .withRotation(0.000000f, -30.514396f, -26.062789f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(2.000000f, 2.000000f, 2.000000f)
                                    .applyTransformations();
                        })

                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.425000f, 3.545000f, -5.685000f)
                                    .withRotation(-0.187566f, -46.164037f, -11.869230f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(2.000000f, 2.000000f, 2.000000f)
                                    .applyTransformations();
                        })
                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GL11.glScalef(4f, 4f, 4f);
                                    GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                                },
                                (renderContext) -> {
                                    GL11.glScalef(4f, 4f, 4f);
                                    GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    GL11.glScalef(4f, 4f, 4f);
                                    GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                                },
                                (renderContext) -> {
                                    GL11.glScalef(4f, 4f, 4f);
                                    GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                                })


                        .build())
                .withSpawnEntityDamage(10f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}