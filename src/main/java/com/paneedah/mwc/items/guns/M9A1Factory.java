package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class M9A1Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("m9a1")
                .withFireRate(0.5f)
                .withRecoil(2f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.SIDEARM)
                .withMuzzlePosition(new Vec3d(-0.14400000429153445, -0.8639999959468836, -2.355999876499175))
                .withShellType(Type.PISTOL)
                .withMaxShots(1)
                .withShootSound("m9a1")
                .withSilencedShootSound("m9a1_silenced")
                .withReloadSound("m9a1_reload")
                .withUnloadSound("pistol_unload")
                .withInspectSound("inspection")
                .withDrawSound("handgun_draw")
                .withReloadingTime(50)
                .withCrosshair("gun")
                .withCrosshairRunning("Running")
                .withCrosshairZoomed("Sight")
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.13f)
                .withFlashOffsetY(() -> 0.14f)
//      .withShellCasingForwardOffset(0.001f)
                .withInaccuracy(3)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        // The weapon power
                        45.0,
                        // Muzzle climb divisor
                        13.5,
                        // "Stock Length"
                        37.5,
                        // Recovery rate from initial shot
                        0.425,
                        // Recovery rate @ "stock"
                        0.2125,
                        // Recoil rotation (Y)
                        0.0,
                        // Recoil rotation (Z)
                        0.0,
                        // Ads similarity divisor
                        1.0
                ))


                .withScreenShaking(RenderableState.SHOOTING,
                        2.5f, // x
                        0.1f, // y
                        1f) // z

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 7), new
                        CraftingEntry(MWCItems.gunmetalPlate, 3), new
                        CraftingEntry(MWCItems.steelIngot, 3))

                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withCompatibleAttachment(AuxiliaryAttachments.M9A1hammer, true, (model) -> {
//          GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//          GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.M9A1Body, true, (model) -> {
//            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//            GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.M9A1Slide, true, (model) -> {
                    if (model instanceof M9slide) {
                        GL11.glScaled(1F, 1F, 1F);
//                GL11.glTranslatef(0F, 0F, 0.5F);
                    } else if (model instanceof M9A1rearsight) {
                        GL11.glTranslatef(-0.155F, -1.175F, -0.15F);
                        GL11.glScaled(0.3F, 0.3F, 0.4F);
                    } else if (model instanceof M9A1frontsight) {
                        GL11.glTranslatef(-0.15F, -1.175F, -2.25F);
                        GL11.glScaled(0.25F, 0.25F, 0.3F);
                    }
                })
                .withCompatibleAttachment(Attachments.SamuraiEdgeBody, (model) -> {
//          GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//          GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.SamuraiEdgeMount, (model) -> {
//          GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//          GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.SamuraiEdgeSlide, (model) -> {
                    if (model instanceof SamuraiEdgeSlide) {
                        GL11.glScaled(1F, 1F, 1F);
//              GL11.glTranslatef(0F, 0F, 0.5F);
                    } else if (model instanceof M9A1rearsight) {
                        GL11.glTranslatef(-0.155F, -1.175F, -0.15F);
                        GL11.glScaled(0.3F, 0.3F, 0.4F);
                    } else if (model instanceof M9A1frontsight) {
                        GL11.glTranslatef(-0.15F, -1.175F, -2.1F);
                        GL11.glScaled(0.25F, 0.25F, 0.2F);
                    }
                })
                .withCompatibleAttachment(Magazines.M9A1Mag, (model) -> {
//           GL11.glTranslatef(0F, 0.2F, 0.12F);
                })
                .withCompatibleAttachment(Magazines.SamuraiEdgeMag, (model) -> {
//            GL11.glTranslatef(0F, 0.2F, 0.12F);
                })
                .withCompatibleAttachment(Magazines.M9Mag30, (model) -> {
                })
                .withCompatibleAttachment(Magazines.M9DrumMag, (model) -> {
                })
                .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
                    GL11.glTranslatef(0.01F, -0.65F, -2.3F);
                    GL11.glScaled(1.2F, 1.2F, 1.2F);
                    GL11.glRotatef(-90F, 0f, 0f, -4f);
                })
                .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
                    GL11.glTranslatef(-0.22F, -1.2F, -4.6F);
                    GL11.glScaled(1.3F, 1.3F, 1.3F);
                })
                .withCompatibleAttachment(Attachments.SamuraiEdgeSuppressor, (model) -> {
//            GL11.glTranslatef(-0.22F, -1.2F, -4.35F);
//            GL11.glScaled(1.3F, 1.3F, 1.3F);
                })
                .withCompatibleAttachment(Attachments.FABDefenseMount, (model) -> {
                    GL11.glTranslatef(-0.23f, -0.53f, -1.9f);
                    GL11.glScaled(0.7F, 0.6F, 0.7F);
                })
                .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
                    GL11.glTranslatef(-0.175F, -1.35F, -1.1F);
                    GL11.glScaled(0.36F, 0.36F, 0.36F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.1F, -0.5F);
                        GL11.glScaled(0.2F, 0.2F, 0.2F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GL11.glTranslatef(-0.05F, -1.1F, -1.4F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GL11.glTranslatef(-0.155F, -1.83F, -1.2F);
                    GL11.glScaled(0.48F, 0.48F, 0.48F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    } else if (model instanceof SightMount) {
                        //        	GL11.glTranslatef(-0.15F, -1.82F, -1F);
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withTextureNames("M9A1")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new M9A1())
                        .withActionPiece(
                                Attachments.M9A1Slide,
                                Attachments.SamuraiEdgeSlide)
                        .withActionTransform(new Transform().withPosition(0, 0, 0.5))
                        //.withTextureName("M9")
                        //.withWeaponProximity(0.99F)
                        //.withYOffsetZoom(5F)
                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.4F, 0.4F, 0.4F);
                            GL11.glRotatef(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(0, 0.8f, 0);
                            GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-1.8F, -1F, 2F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-0.945000f, 4.065000f, -7.845000f)
                                        .withRotation(0.000000f, 1.000000f, 10.681469f)
                                        .withRotationPoint(-0.12000000357627871, -0.36000001072883614, 0.040000001192092904)
                                        .withScale(3.0, 3.0, 3.0)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.370000f, 0.865000f, 2.020000f)
                                        .withBBRotation(-12.9672, -29.0825, 67.8433)
                                        .withScale(3, 3, 4)
                                        .withRotationPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.320000f, 0.220000f, 2.040000f)
                                        .withBBRotation(10.0931, 10.9576, -10.0294)
                                        .withScale(3, 3, 3.5)
                                        .withRotationPoint(0, 0, 0)

                        )

                        .setupModernAnimations("m9", Attachments.M9A1Slide)
                        .setupModernMagazineAnimations("m9", Magazines.M9A1Mag)

                        .withFirstPersonPositioningCustomRecoiled(Attachments.M9A1Slide.getRenderablePart(), (renderContext) -> {
                            GL11.glTranslatef(0F, 0F, 0.6F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(Attachments.M9A1Slide.getRenderablePart(), (renderContext) -> {
                            GL11.glTranslatef(0F, 0F, 0.6F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                        })

                        .withFirstPersonCustomPositioning(Attachments.M9A1Slide.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GL11.glTranslatef(0F, 0F, 0.6F);
                            }
                        })

                        .withFirstPersonPositioningCustomRecoiled(Attachments.SamuraiEdgeSlide.getRenderablePart(), (renderContext) -> {
                            GL11.glTranslatef(0F, 0F, 0.6F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(Attachments.SamuraiEdgeSlide.getRenderablePart(), (renderContext) -> {
                            GL11.glTranslatef(0F, 0F, 0.6F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                        })

                        .withFirstPersonCustomPositioning(Attachments.SamuraiEdgeSlide.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GL11.glTranslatef(0F, 0F, 0.6F);
                            }
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.P226hammer.getRenderablePart(), (renderContext) -> {
                            GL11.glTranslatef(-0F, -0.17F, 0.53F);
                            GL11.glRotatef(45F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.P226hammer.getRenderablePart(), (renderContext) -> {
                            GL11.glTranslatef(-0F, -0.17F, 0.53F);
                            GL11.glRotatef(45F, 1f, 0f, 0f);
                        })

                        .withFirstPersonCustomPositioning(Magazines.M9A1Mag, (renderContext) -> {
//          	 GL11.glTranslatef(0.1f, 1f, 0.2f);
//          	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                        })

                        .withThirdPersonPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.3F, -1F, 3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 200, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.3F, -1F, 3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.3F, -1F, 3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 130, 10),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.3F, -1F, 3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 300, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.3F, -1F, 3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 200, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.3F, -1F, 3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 200, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.3F, -1F, 3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 270, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(-2.3F, -1F, 3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 70, 50)
                        )


                        .withThirdPersonCustomPositioningReloading(Attachments.M9A1Slide.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GL11.glTranslatef(0F, 0F, 0F);
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glScaled(3F, 3F, 3F);
                            GL11.glTranslatef(0.145f, 0.67f, -2f);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Holo");
                                GL11.glTranslatef(0f, 0.24f, 0f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Holo");
                                GL11.glTranslatef(0f, 0.34f, 0f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Holo");
                                GL11.glTranslatef(0f, 0.2f, 0f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-0.945000f, 3.625000f, -7.165000f)
                                    .withRotation(-4.041486f, -30.854630f, -19.420376f)
                                    .withRotationPoint(-0.120000f, -0.360000f, 0.040000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .doGLDirect();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-0.945000f, 3.625000f, -7.885000f)
                                    .withRotation(-4.041486f, -45.595835f, -21.768277f)
                                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .doGLDirect();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.770000f, 1.225000f, 0.140000f)
                                            .withRotation(73.670132f, -70.659155f, 41.991085f)
                                            .withScale(2.6, 2.6, 4.0)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.320000f, 0.140000f, 2.040000f)
                                            .withBBRotation(10.0931, 10.9576, -10.0294)
                                            .withScale(3, 3, 3.5)
                                            .withRotationPoint(0, 0, 0)
                                            .doGLDirect();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.770000f, 1.225000f, 0.140000f)
                                            .withRotation(73.670132f, -70.659155f, 41.991085f)
                                            .withScale(2.6, 2.6, 4.0)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.320000f, 0.140000f, 2.040000f)
                                            .withBBRotation(10.0931, 10.9576, -10.0294)
                                            .withScale(3, 3, 3.5)
                                            .withRotationPoint(0, 0, 0)
                                            .doGLDirect();
                                })

                        .withThirdPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                                }, 330, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-48.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(43.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                                }, 250, 0))

                        .withThirdPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-66.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-57.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0))

                        .build())
                .withSpawnEntityDamage(5f)
                .withSpawnEntityGravityVelocity(0.02f)


                .build(MWC.modContext);
    }
}
