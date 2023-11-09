package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.animation.jim.BBLoader;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class M1911Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("m1911")
                .withFireRate(0.5f)
                .withRecoil(3f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.SIDEARM)
                .withShellType(Type.PISTOL)
                .withMaxShots(1)
                .withShootSound("colt_m45a1")
                .withSilencedShootSound("colt_m45a1_silenced")
                .withDrawSound("handgun_draw")
                .withReloadingTime(70)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.13f)
                .withFlashOffsetY(() -> 0.12f)
                .withInaccuracy(3)
                .useNewSystem()
                .withCreativeTab(MWC.WEAPONS_TAB)
                .withScreenShaking(RenderableState.SHOOTING,
                        4f, // x
                        0.1f, // y
                        1f) // z

                .withRecoilParam(new RecoilParam(
                        // The weapons power
                        65.0,
                        // Muzzle climb divisor
                        13.125,
                        // "Stock Length"
                        30.0,
                        // Recovery rate from initial shot
                        0.3625,
                        // Recovery rate @ "stock"
                        0.325,
                        // Recoil rotation (Y)
                        0.020,
                        // Recoil rotation (Z)
                        0.0,
                        // Ads similarity divisor
                        1.0
                ))
                .withModernRecipe( new
         		        CraftingEntry(MWCItems.carbonComposite, 7), new
         		        CraftingEntry(MWCItems.gunmetalPlate, 3), new
         		        CraftingEntry(MWCItems.steelIngot, 3))
         
                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)

                .withCompatibleAttachment(Attachments.PistolPlaceholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.M1911Body, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.HardballerBody, (model) -> {
                })
                .withCompatibleAttachment(Attachments.M45A1CQBPBody, (model) -> {
                })
                .withCompatibleAttachment(Attachments.M1911Slide, true, (model) -> {
                    if (model instanceof M1911Slide) {
                    } else if (model instanceof makarovrearsight) {
                        GL11.glTranslatef(-0.21F, -1.355F, -0.09F);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof M1911FrontSight) {
                        GL11.glTranslatef(-0.215F, -1.35F, -2.35F);
                        GL11.glScaled(0.25F, 0.25F, 0.25F);
                    }
                })
            .withCompatibleAttachment(Attachments.HardballerSlide, (model) -> {
             if (model instanceof HardballerIron) {
                        GL11.glTranslatef(-0.155F, -2.17F, -1.43F);
                        GL11.glScaled(0.45F, 0.55F, 0.5F);
               }
            })
            .withCompatibleAttachment(Attachments.M45A1CQBPSlide, (model) -> {
             if (model instanceof m45a1Iron) {
                        GL11.glTranslatef(-0.155F, -2.25F, -1.13F);
                        GL11.glScaled(0.6F, 0.6F, 0.51F);
               }
            })

                .withCompatibleAttachment(Magazines.M1911Mag, (model) -> {
                })
                .withCompatibleAttachment(Magazines.M1911Mag15, (model) -> {
                })
                .withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
                    GL11.glTranslatef(-0.275F, -1.3F, -5.1F);
                    GL11.glScaled(1.5F, 1.5F, 1.5F);
                })
                .withCompatibleAttachment(Attachments.Laser, () -> {
                    GL11.glTranslatef(0.01F, -0.85F, -2.3F);
                    GL11.glScaled(1.2F, 1.2F, 1.2F);
                    GL11.glRotatef(-90F, 0f, 0f, -4f);
                })

                .withTextureNames("m1911")
                .withRenderer(new WeaponRenderer.Builder()
                        .withModel(new Glock18C())
                        .withActionPiece(
                                Attachments.M1911Slide,
                                Attachments.HardballerSlide,
                                Attachments.M45A1CQBPSlide)
                        .withActionTransform(new Transform().withPosition(0, 0, 0.55F))
                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.4F, 0.4F, 0.4F);
                            GL11.glTranslatef(0, 0f, 3f);
                            GL11.glRotatef(0F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(0, 0.7f, 0);
                            GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.45F, 0.45F, 0.45F);
                            GL11.glTranslatef(-1.8F, -1F, 2F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-0.945000f, 4.065000f, -7.845000f)
                                        .withRotation(0.000000f, 1.000000f, 10.681469f)
                                        .withPivotPoint(-0.12000000357627871F, -0.36000001072883614F, 0.040000001192092904F)
                                        .withScale(2.5F, 2.5F, 2.5F)
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
                                        .withScale(3, 3, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("m9", Attachments.M1911Slide)
                        .setupModernMagazineAnimations("m9",
                                Magazines.M1911Mag,
                                Magazines.M1911Mag15)
                        .setupCustomKeyedPart(Attachments.HardballerSlide, "m9", BBLoader.KEY_ACTION)
                        .setupCustomKeyedPart(Attachments.M45A1CQBPSlide, "m9", BBLoader.KEY_ACTION)

                        .withFirstPersonCustomPositioning(Attachments.M1911Slide.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GL11.glTranslatef(0F, 0F, 0.5F);
                            }
                        })
                        .withFirstPersonCustomPositioning(Attachments.HardballerSlide.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GL11.glTranslatef(0F, 0F, 0.5F);
                            }
                        })
                        .withFirstPersonCustomPositioning(Attachments.M45A1CQBPSlide.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GL11.glTranslatef(0F, 0F, 0.5F);
                            }
                        })

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glScaled(2F, 2F, 2);
                            GL11.glTranslatef(0.186f, 0.615f, -2f);
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
                .withSpawnEntityDamage(5.3f)
                .withSpawnEntityGravityVelocity(0.02f)


                .build(MWC.modContext);
    }
}