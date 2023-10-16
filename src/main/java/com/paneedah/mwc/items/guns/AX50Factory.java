package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.animation.jim.BBLoader;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class AX50Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("ax50")
                .withRecoil(15f)
                .withZoom(0.8f)
                .withFireRate(0.1f)
                .withEjectRoundRequired()
                .withEjectSpentRoundSound("ax50_boltaction")
                .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
                .withMuzzlePosition(new Vec3d(-0.1480000044107437, -1.0880000026226049, -10.836000129222878))
                .withMaxShots(1)
                .withShootSound("ax50")
                .withPumpTimeout(1100)
                .withSilencedShootSound("as50_silenced")
                .withDrawSound("as50_draw")
                .withReloadingTime(40)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.8f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.14f)
                .withShellCasingEjectEnabled(false)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        // The weapons power
                        85.0,
                        // Muzzle climb divisor
                        30.0,
                        // "Stock Length"
                        36.25,
                        // Recovery rate from initial shot
                        0.4,
                        // Recovery rate @ "stock"
                        0.425,
                        // Recoil rotation (Y)
                        -0.020,
                        // Recoil rotation (Z)
                        0.025,
                        // Ads similarity divisor
                        1.0
                ))

                .withScreenShaking(RenderableState.SHOOTING,
                        7f, // x
                        2f, // y
                        16f) // z

         .withModernRecipe( new
	        		CraftingEntry(MWCItems.carbonComposite, 18), new
	        		CraftingEntry(MWCItems.gunmetalPlate, 16), new
	        		CraftingEntry(MWCItems.steelIngot, 12))
					
                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.M40A6GripPlaceholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Magazines.AX50Mag, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.AX50BoltAction, true, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.G95IronSights, true, (model) -> {
                    if (model instanceof G95_rearsights) {
                        GL11.glTranslatef(-0.155F, -1.82F, -0.9F);
                        GL11.glScaled(0.29F, 0.29F, 0.29F);
                    } else if (model instanceof G95_frontsights) {
                        GL11.glTranslatef(-0.155F, -1.82F, -7.5F);
                        GL11.glScaled(0.29F, 0.29F, 0.29F);
                    }
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(-0.205F, -1.6F, -8.1f);
                        GL11.glScaled(0.6F, 0.6F, 1.55F);
                    } else if (model instanceof AKRail2) {
                        GL11.glTranslatef(-0.205F, -1.63F, -3.65f);
                        GL11.glScaled(0.6F, 0.6F, 1.25F);
                    } else if (model instanceof AKRail3) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKRail4) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKRail5) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(Attachments.PMII525x56P4FLScope, true, () -> {
                    GL11.glTranslatef(-0.16F, -1.83F, -1F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.084F, -0.13F, 1.496F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, () -> {
                    GL11.glTranslatef(-0.22F, -1.68F, -3.2F);
                    GL11.glScaled(0.9F, 0.9F, 0.9F);
                },(model) -> {
                    if(model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, () -> {
                    GL11.glTranslatef(-0.328F, -1.7F, -1.85F);
                    GL11.glScaled(0.9F, 0.9F, 0.9F);
                },(model) -> {
                    if(model instanceof AcogScope2) {
                        GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                    else if(model instanceof AcogReticle) {
                        GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.Specter, () -> {
                    GL11.glTranslatef(-0.19F, -1.4F, -2.1F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                },(model) -> {
                    if(model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.LeupoldRailScope, () -> {
                    GL11.glTranslatef(-0.155F, -1.5F, -2.75F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                },(model) -> {
                    if(model instanceof JPUreticle) {
                        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                        GL11.glScaled(0.04F, 0.04F, 0.04F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroReflex, () -> {
                    GL11.glTranslatef(-0.145F, -2.3F, -2.1F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
                },(model) -> {
                    if(model instanceof Reflex2) {
                        GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    } else if (model instanceof SightMount) {
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, () -> {
                    GL11.glTranslatef(-0.045F, -1.55F, -2.0F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                },(model) -> {
                    if(model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
                    GL11.glTranslatef(-0.04F, -1.53F, -2.0F);
                    GL11.glScaled(0.63F, 0.63F, 0.63F);
                },(model) -> {
                    if(model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, () -> {
                    GL11.glTranslatef(-0.015F, -1.6F, -2.1F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                },(model) -> {
                    if(model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, () -> {
                    GL11.glTranslatef(-0.015F, -1.6F, -2.1F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                },(model) -> {
                    if(model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, () -> {
                    GL11.glTranslatef(-0.015F, -1.6F, -2.3F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                },(model) -> {
                    if(model instanceof EotechScopeRing) {
                        GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                    if(model instanceof Holo2) {
                        GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
                        GL11.glScaled(0.05F, 0.05F, 0.05F);
                    }
                })
                .withCompatibleAttachment(Attachments.VortexRedux, () -> {
                    GL11.glTranslatef(-0.315F, -1.81F, -2.15F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                },(model) -> {
                    if(model instanceof Holo2) {
                        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, () -> {
                    GL11.glTranslatef(-0.025F, -1.55F, -1.7F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                },(model) -> {
                    if(model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, () -> {
                    GL11.glTranslatef(-0.025F, -1.55F, -1.7F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                },(model) -> {
                    if(model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, () -> {
                    GL11.glTranslatef(-0.186F, -1.8F, -2.0F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                },(model) -> {
                    if(model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, () -> {
                    GL11.glTranslatef(-0.186F, -1.8F, -2.0F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                },(model) -> {
                    if(model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GL11.glTranslatef(-0.18F, -0.4F, -7.9F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Silencer50BMG, (model) -> {
                    GL11.glTranslatef(-0.23F, -1.4F, -12.4F);
                    GL11.glScaled(1.5F, 1.5F, 1.5F);
                })

                .withTextureNames("ax50")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new AX50())
                        .withADSBeizer(new Vec3d(-0.2F, 5.0, -1.0))
                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glRotatef(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.28F, 0.28F, 0.28F);
                            GL11.glTranslatef(1, 2f, -1.2f);
                            GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.42F, 0.42F, 0.42F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                            GL11.glTranslatef(0.100000f, 2.550000f, 2.200000f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.705000f, 4.705000f, -2.145000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.230000f, -1.740000f, 0.140000f)
                                        .withScale(3.2F, 3.2F, 3.2F)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.250000f, 0.265000f, -0.980000f)
                                        .withBBRotation(-6.645F, -32.8876F, 56.8877F)
                                        .withScale(2.6F, 2.6F, 4.0F)
                                        .withPivotPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.160000f, 0.060000f, 1.640000f)
                                        .withBBRotation(5.4027F, 4.7805F, -1.6694F)
                                        .withScale(3.0F, 3.0F, 3.0F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("m40a6", AuxiliaryAttachments.AX50BoltAction)
                        .setupCustomKeyedPart(AuxiliaryAttachments.AX50BoltAction, "m40a6", BBLoader.KEY_BOLT_ACTION)
                        .setupModernMagazineAnimations("m40a6",
                                Magazines.AX50Mag)

                        .withFirstPersonCustomPositioning(Magazines.AX50Mag, (renderContext) -> {
                        })

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                            GL11.glTranslatef(0.15F, 1.19f, 0.369f);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PMII525x56P4FLScope)) {
                                GL11.glTranslatef(-0.01F, 0.22f, -0.08f);
                            }

                            // ACOG Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                GL11.glTranslatef(-0.01F, 0.21f, 0.4f);
                            }

                            // ACOG Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                GL11.glTranslatef(-0.01F, 0.25f, 0.73f);
                            }

                            // ACOG Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                GL11.glTranslatef(-0.01f, 0.25f, 0.5f);
                            }

                            // HP Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                GL11.glTranslatef(-0.02f, 0.21f, -0.15f);
                            }

                            // HP Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                GL11.glTranslatef(-0.01f, 0.24f, 0.4f);
                            }

                            // HP Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                GL11.glTranslatef(-0.01f, 0.25f, 0.4f);
                            }

                            // HP Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                GL11.glTranslatef(-0.01f, 0.27f, 0.4f);
                            }

                            // HP Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                GL11.glTranslatef(-0.01F, 0.28f, 0.5f);
                            }

                            // HP Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                GL11.glTranslatef(-0.01F, 0.28f, 0.5f);
                            }

                            // HP Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                GL11.glTranslatef(-0.01F, 0.32f, 0.17f);
                            }

                            // HP Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                GL11.glTranslatef(0.01F, 0.28f, 0.5f);
                            }

                            // HP Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                GL11.glTranslatef(0f, 0.25f, 0.3f);
                            }

                            // HP Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                GL11.glTranslatef(0f, 0.25f, 0.3f);
                            }

                            // HP Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                GL11.glTranslatef(0f, 0.26f, 0.4f);
                            }

                            // HP Zoom
                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                GL11.glTranslatef(0f, 0.29f, 0.4f);
                            }

                            else {
                            }

                        })

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

                        .build())
                .withSpawnEntityDamage(27f)
                .withSpawnEntityGravityVelocity(0f)


                .build(MWC.modContext);
    }
}