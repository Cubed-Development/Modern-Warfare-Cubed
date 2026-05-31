package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class SCCYCPX2Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("sccy_cpx_2")
                .withFireRate(0.5f)
                .withRecoil(2f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.HANDGUN)
                .withShellType(Type.PISTOL)
                .withMaxShots(1)
                .withShootSound("m9a1")
                .withSilencedShootSound("m9a1_silenced")
                .withReloadSound("m9a1_reload")
                .withUnloadSound("pistol_unload")
                .withInspectSound("inspection")
                .withDrawSound("handgun_draw")
                .withReloadingTime(50)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.13f)
                .withFlashOffsetY(() -> 0.18f)
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


                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 7), new
                        CraftingEntry(MWCItems.gunmetalPlate, 3), new
                        CraftingEntry(MWCItems.steelIngot, 3))

                .withScreenShaking(RenderableState.SHOOTING,
                        2.5f, // x
                        0.1f, // y
                        0.5f) // z
                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withCompatibleAttachment(Attachments.SCCYCPX2Body, true, (model) -> {
//           GlStateManager.translate(0.01f, -0.19f, -0.4f);
//           GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.SCCYCPX2BodyTan, (model) -> {
//          GlStateManager.translate(0.01f, -0.19f, -0.4f);
//          GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.SCCYCPX2GripTape, (model) -> {
//          GlStateManager.translate(0.01f, -0.19f, -0.4f);
//          GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.SCCYCPX2Slide, true, (model) -> {
                    if (model instanceof SCCYCPX2Slide) {
                        GlStateManager.scale(1F, 1F, 1F);
//                GlStateManager.translate(0F, 0F, 0.5F);
                    } else if (model instanceof M9A1rearsight) {
                        GlStateManager.translate(-0.155F, -1.095F, -0.15F);
                        GlStateManager.scale(0.3F, 0.3F, 0.4F);
                    } else if (model instanceof M9A1frontsight) {
                        GlStateManager.translate(-0.15F, -1.11F, -1.8F);
                        GlStateManager.scale(0.2F, 0.2F, 0.25F);
                    }
                })
                .withCompatibleAttachment(Attachments.SCCYCPX2BSlide, (model) -> {
                    if (model instanceof SCCYCPX2Slide) {
                        GlStateManager.scale(1F, 1F, 1F);
//                GlStateManager.translate(0F, 0F, 0.5F);
                    } else if (model instanceof M9A1rearsight) {
                        GlStateManager.translate(-0.155F, -1.095F, -0.15F);
                        GlStateManager.scale(0.3F, 0.3F, 0.4F);
                    } else if (model instanceof M9A1frontsight) {
                        GlStateManager.translate(-0.15F, -1.11F, -1.8F);
                        GlStateManager.scale(0.2F, 0.2F, 0.25F);
                    }
                })
                .withCompatibleAttachment(Magazines.SCCYCPX2Mag, (model) -> {
                })
                .withCompatibleAttachment(Magazines.SCCYCPX2MagExt, (model) -> {
                })
                .withCompatibleAttachment(Attachments.SCCYCPX2Laser, (p, s) -> {
//            GlStateManager.translate(0.01F, -0.65F, -2.3F);
//            GlStateManager.scale(1.2F, 1.2F, 1.2F);
//            GlStateManager.rotate(-90F, 0f, 0f, -4f);
                })
                .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
                    GlStateManager.translate(-0.22F, -1.12F, -4.06F);
                    GlStateManager.scale(1.3F, 1.3F, 1.3F);
                })
                .withTextureNames("glock18c")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new Glock18C())
                        .withActionPiece(
                                Attachments.SCCYCPX2Slide,
                                Attachments.SCCYCPX2BSlide)
                        .withActionTransform(new Transform().withPosition(0, 0, 0.5F))
                        //.withTextureName("M9")
                        //.withWeaponProximity(0.99F)
                        //.withYOffsetZoom(5F)
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.4F, 0.4F, 0.4F);
                            GlStateManager.rotate(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.35F, 0.35F, 0.35F);
                            GlStateManager.translate(0, 0.8f, 0);
                            GlStateManager.rotate(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
                            GlStateManager.translate(-1.8F, -1F, 2F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-0.945000f, 3.865000f, -6.965000f)
                                        .withRotation(0.000000f, 1.000000f, 10.681469f)
                                        .withPivotPoint(-0.12000000357627871F, -0.36000001072883614F, 0.040000001192092904F)
                                        .withScale(3, 3, 3)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.370000f, 0.985000f, 2.020000f)
                                        .withBBRotation(-12.9672F, -29.0825F, 67.8433F)
                                        .withScale(3, 3, 4)
                                        .withPivotPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.320000f, 0.260000f, 1.920000f)
                                        .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                                        .withScale(2.8F, 2.8F, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("cpx2", Attachments.SCCYCPX2Slide)
                        .setupModernMagazineAnimations("cpx2",
                                Magazines.SCCYCPX2Mag,
                                Magazines.SCCYCPX2MagExt)

                        .withFirstPersonCustomPositioning(Attachments.SCCYCPX2Slide.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GlStateManager.translate(0F, 0F, 0.6F);
                            }
                        })

                        .withFirstPersonCustomPositioning(Attachments.SCCYCPX2BSlide.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GlStateManager.translate(0F, 0F, 0.6F);
                            }
                        })

                        .withThirdPersonPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 200, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 130, 10),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 200, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 200, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 270, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.3F, -1F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 70, 50)
                        )

                        .withThirdPersonCustomPositioningReloading(Attachments.SCCYCPX2Slide.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0.5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 0F);
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.scale(3F, 3F, 3F);
                            GlStateManager.translate(0.145f, 0.60f, -2f);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.22f, 0f);
                            }

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.32f, 0f);
                            }

                            // Everything else
                            else {
                            }

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
                                            .withScale(2.6F, 2.6F, 4)
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
                                            .withScale(2.6F, 2.6F, 4)
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


                        .withThirdPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.100000f, 0.100000f);
                                }, 330, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.100000f, 0.125000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.050000f, 0.025000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.050000f, 0.025000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.100000f, 0.125000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.100000f, 0.100000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.100000f, 0.100000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-48.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(43.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.100000f, 0.100000f);
                                }, 250, 0))

                        .withThirdPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-67.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-11.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-67.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-66.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-9.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-62.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-62.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-57.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0))

                        .build())
                .withSpawnEntityDamage(5f)
                .withSpawnEntityGravityVelocity(0.02f)


                .build(MWC.modContext);
    }
}
