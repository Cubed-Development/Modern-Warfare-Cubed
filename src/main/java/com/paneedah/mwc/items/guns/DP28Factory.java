package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class DP28Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("dp28")
                .withFireRate(0.5f)
                .withRecoil(4f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.HEAVY)
                .withMaxShots(1, Integer.MAX_VALUE)
                //.withMaxShots(5)
                .withShootSound("dp28")
                .withSilencedShootSound("ak15_silenced")
                .withReloadSound("dp28_reload")
                .withUnloadSound("dp28_unload")
                .withInspectSound("inspection")
                .withDrawSound("dp28_draw")
                .withReloadingTime(45)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.09f)
                .withFlashOffsetY(() -> 0.14f)
                .withShellCasingEjectEnabled(false)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        2.5f, // x
                        2f, // y
                        6f) // z

                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withCompatibleAttachment(Attachments.GripPlaceholder, true, (model) -> {
                    GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Magazines.DP28Mag, (model) -> {
//            GlStateManager.translate(-0.365F, 0.4F, -1.52F);
//            GlStateManager.scale(1.2F, 1F, 1F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
                    if (model instanceof AKMiron1) {
                        GlStateManager.translate(0.125F, -1.8F, -0.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GlStateManager.translate(0.011F, -0.23F, -3.78F);
                        GlStateManager.scale(0.6F, 0.6F, 1F);
                    } else if (model instanceof AK47iron) {
                        GlStateManager.translate(-0.031F, -0.55F, 0.75F);
                        GlStateManager.scale(0.7F, 0.6F, 0.6F);
                    } else if (model instanceof M4Iron1) {
                        GlStateManager.translate(0.155F, -1.74F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GlStateManager.translate(0.26F, -1.55F, -2.35F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GlStateManager.translate(0.26F, -1.55F, -2.35F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                    if (model instanceof G36CIron1) {
                        GlStateManager.translate(-0.04F, -1.216F, -1.65F);
                        GlStateManager.scale(0F, 0F, 0F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    } else if (model instanceof G36CIron2) {
                        GlStateManager.translate(-0.18F, -1.19F, -5.63F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof ScarIron1) {
                        GlStateManager.translate(0.165F, -1.65F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof ScarIron2) {
                        GlStateManager.translate(0.25F, -1.55F, -2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof FALIron) {
                        GlStateManager.translate(0.093F, -0.28F, -3.78F);
                        GlStateManager.scale(0.08F, 0.2F, 0.6F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    } else if (model instanceof M14Iron) {
                        GlStateManager.translate(0.129F, -1.63F, -2.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GlStateManager.translate(-0.101F, -1.27F, -0.18F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GlStateManager.translate(0F, 1F, -3.5F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withTextureNames("gun")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new DP28())
                        //.withTextureName("AK47")
                        //.withWeaponProximity(0.99F)
                        //.withYOffsetZoom(5F)
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.35F, 0.35F, 0.35F);
                            GlStateManager.rotate(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.28F, 0.28F, 0.28F);
                            GlStateManager.translate(1, 2f, -1.2f);
                            GlStateManager.rotate(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
                            GlStateManager.translate(-0.8F, 0.2F, 0.8F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2.5f, 2.5f, 2.5f);
                            GlStateManager.rotate(7F, 0f, 0f, 1f);
                            GlStateManager.translate(-0.300000f, 0.125000f, -1.624999f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2.5f, 2.5f, 2.5f);
                            GlStateManager.rotate(7F, 0f, 0f, 1f);
                            GlStateManager.translate(-0.300000f, 0.125000f, -1.224999f);
                            GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(38F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(5F, 0f, 0f, 1f);
                                    GlStateManager.rotate(4F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.300000f, 0.125000f, -1.624999f);
                                }, 400, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(7F, 0f, 0f, 1f);
                                    GlStateManager.rotate(2F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.300000f, 0.125000f, -1.624999f);
                                }, 300, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(1F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.300000f, 0.125000f, -1.624999f);
                                }, 300, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(6F, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.300000f, 0.125000f, -1.624999f);
                                }, 170, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-2F, 0f, 0f, 1f);
                                    GlStateManager.rotate(5F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.300000f, 0.025000f, -1.524999f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(1F, 0f, 0f, 1f);
                                    GlStateManager.rotate(3F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.300000f, 0.125000f, -1.324999f);
                                }, 200, 0)
                        )

                        .withFirstPersonPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                    GlStateManager.rotate(3F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.300000f, 0.125000f, -1.624999f);
                                }, 240, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(35F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(12F, 0f, 0f, 1f);
                                    GlStateManager.rotate(2F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.300000f, 0.125000f, -1.624999f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(35F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(13F, 0f, 0f, 1f);
                                    GlStateManager.rotate(4F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.300000f, 0.125000f, -1.624999f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(35F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(12F, 0f, 0f, 1f);
                                    GlStateManager.rotate(4F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.300000f, 0.125000f, -1.624999f);
                                }, 280, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(Magazines.DP28Mag,
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(2.6F, 2.5F, 0F);
                                    GlStateManager.rotate(70F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.45F, -0.12F, 0F);
                                    GlStateManager.rotate(30F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.24F, 0F);
                                    GlStateManager.rotate(-10F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningUnloading(Magazines.DP28Mag,
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.24F, 0F);
                                    GlStateManager.rotate(-10F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.45F, -0.12F, 0F);
                                    GlStateManager.rotate(30F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(2.6F, 2.5F, 0F);
                                    GlStateManager.rotate(70F, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.3f, -0.175000f, -1.5f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.350000f, 0.325000f, -1.274999f);
                                }, 350, 600)
                        )

                        .withThirdPersonPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
//                        GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
//                        GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
//                        GlStateManager.rotate(65.000000f, 0f, 0f, 1f);
//                        GlStateManager.translate(0.150000f, 1.149999f, 0.175000f);
//                    }, 200, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 210, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 240, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 400, 150),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 60),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 120, 190),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 120, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 2.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 120, 0)
//                }, 100, 0)
                        )

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(15F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(7F, 0f, 0f, 1f);
                                    GlStateManager.rotate(45F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.300000f, 0.125000f, -1.624999f);
                                }, 120, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(25F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(7F, 0f, 0f, 1f);
                                    GlStateManager.rotate(30F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.300000f, 0.125000f, -1.624999f);
                                }, 120, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(35F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(7F, 0f, 0f, 1f);
                                    GlStateManager.rotate(15F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.300000f, 0.225000f, -1.624999f);
                                }, 270, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(17F, 0f, 0f, 1f);
                                    GlStateManager.rotate(1F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.300000f, 0.325000f, -1.624999f);
                                }, 240, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                    GlStateManager.rotate(5F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.300000f, 0.265000f, -1.624999f);
                                }, 100, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.15f, -0.27f, -1.3f);


                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.19f, 0.5f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.15f, -0.27f, -1f);
                            GlStateManager.rotate(-0.1F, 1f, 0f, 0f);


                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.19f, 0.45f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.450000f, 0.499999f, -1.125000f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-1.3f, -0.175000f, -1.5f);
                        })

                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.500000f, 0.350000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.500000f, 0.350000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.500000f, 0.350000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -1.349999f, -0.025000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.975000f, 0.100000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.200000f, -0.875000f, 0.175000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.175000f, -0.925000f, 0.100000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.725000f, 0.675000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.350000f, -0.750000f, 0.500000f);
                                }, 250, 0))

                        .withFirstPersonRightHandPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 260, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 280, 0))

                        .withFirstPersonLeftHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.175000f, -0.925000f, 0.100000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.200000f, -0.875000f, 0.175000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.975000f, 0.100000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -1.349999f, -0.025000f);
                                }, 50, 200))

                        .withFirstPersonRightHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 250, 50))

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.500000f, 0.350000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.500000f, 0.350000f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 250, 50))

                        .withThirdPersonLeftHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GlStateManager.scale(3.5f, 3.5f, 3.5f);
//                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
//                        GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
//                        GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
//                        GlStateManager.translate(0.250000f, -0.175000f, 0.225000f);
//                    }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, -0.075000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, -0.075000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.025000f, 0.075000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.100000f, 0.125000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.025000f, 0.075000f);
                                }, 300, 0))

                        .withThirdPersonRightHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GlStateManager.scale(4f, 4f, 5f);
//                        GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
//                        GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
//                        GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
//                        GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
//                    }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-49.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.100000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(14.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.125000f, 0.100000f);
                                }, 260, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.200000f, 0.050000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(23.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-17.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.200000f, 0.050000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(21.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.200000f, 0.050000f);
                                }, 280, 0))

                        .withFirstPersonLeftHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.750000f, 0.275000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.750000f, 0.275000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.925000f, 0.100000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.175000f, -0.825000f, -0.050000f);
                                }, 250, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.200000f, -0.825000f, 0.100000f);
                                }, 300, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.825000f, -1.025000f, 0.200000f);
                                }, 280, 0)
                        )

                        .build())
                .withSpawnEntityDamage(14f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}

