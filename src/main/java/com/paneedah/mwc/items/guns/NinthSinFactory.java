package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.NinthSin;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class NinthSinFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("ninth_sin")
                .withFireRate(0.9999999f)
                .withRecoil(0.0f)
                .withZoom(0.9f)
                .withMaxShots(Integer.MAX_VALUE)
                .withShootSound("m134")
                .withSilencedShootSound("m4a1_silenced")
                .withReloadSound("m4a1_reload")
                .withUnloadSound("m4_unload")
                .withEndOfShootSound("gun_click")
                .withInspectSound("m4a1_inspection")
                .withDrawSound("m4_draw")
                .withReloadingTime(50)
                .withFlashIntensity(0.6f)
                .withFlashScale(() -> 0.7f)
                .withFlashOffsetX(() -> 0.18f)
                .withFlashOffsetY(() -> 0.2f)
                .withShellCasingForwardOffset(-0.02f)
                .withShellCasingVerticalOffset(-0.05f)
//        .withBleedingCoefficient(10f)
                .withShellCasingEjectEnabled(false)
                .withPellets(3)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        2f, // x
                        2f, // y
                        2f) // z

                .withCompatibleAttachment(Magazines.NinthSinMag, (model) -> {
//          GlStateManager.translate(-0.3F, -1.3F, 0.4F);
//          GlStateManager.rotate(-11F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.PanelUpper, true, (model) -> {
//            GlStateManager.translate(0F, -0.25F, 0.6F);
//            GlStateManager.rotate(-11F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.PanelLower, true, (model) -> {
//          GlStateManager.translate(0F, 0.35F, 0.3F);
//          GlStateManager.rotate(8F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.RegulatorUpper, true, (model) -> {
//        	GlStateManager.translate(0.2F, 0F, 0F);

//          GlStateManager.translate(0.2F, -0.7F, 1.1F);
//          GlStateManager.rotate(27F, 1f, 0f, 0);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.RegulatorLower, true, (model) -> {
//        	 GlStateManager.translate(0.2F, 0.65F, 1.4F);
//        	 GlStateManager.rotate(-12F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.RegulatorRotator, true, (model) -> {
//        	 GlStateManager.translate(0.2F, 0F, 1.5F);
//          GlStateManager.translate(0.4F, 0.4F, 0F);
//          GlStateManager.rotate(90F, 0f, 0f, 1);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.RegulatorActionUpper, true, (model) -> {
//        	GlStateManager.translate(0.2F, 0.55F, 1.6F);
//       	 GlStateManager.rotate(-12F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.RegulatorActionLower, true, (model) -> {
//        	GlStateManager.translate(0.2F, 0.75F, 1.2F);
//       	 GlStateManager.rotate(-12F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.RegulatorAction, true, (model) -> {
//        	GlStateManager.translate(0.2F, 0.775F, 1.15F);
//       	 GlStateManager.rotate(-12F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.CyclerFront, true, (model) -> {
//          GlStateManager.translate(0F, -0.35F, -0.2F);
//          GlStateManager.rotate(9F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.CyclerBackLeft, true, (model) -> {
//        	 GlStateManager.translate(0.15F, -0.15F, 0F);
//          GlStateManager.translate(0F, 0F, 2.4F);
//          GlStateManager.translate(0.4F, 0.4F, 0F);
//          GlStateManager.rotate(90F, 0f, 0f, 1);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.CyclerBackRight, true, (model) -> {
//        	 GlStateManager.translate(-0.15F, -0.15F, 0F);
//          GlStateManager.translate(0F, 0F, 2.4F);
//          GlStateManager.translate(0.4F, 0.4F, 0F);
//          GlStateManager.rotate(90F, 0f, 0f, 1);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Cycler, true, (model) -> {
//          GlStateManager.translate(0F, -0.17F, 0.3F);
//          GlStateManager.translate(0.4F, 0.4F, 0F);
//          GlStateManager.rotate(90F, 0f, 0f, 1);
                })
                .withTextureNames("ninthsin")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new NinthSin())
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
                            GlStateManager.translate(0, 0f, 3f);
                            GlStateManager.rotate(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.35F, 0.35F, 0.35F);
                            GlStateManager.translate(1, 2f, -1.2f);
                            GlStateManager.rotate(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GlStateManager.scale(0.6F, 0.6F, 0.6F);
                            GlStateManager.translate(-1.7F, -0.8F, 1.9F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.scale(1F, 1F, 1F);
                            GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                            GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                            GlStateManager.translate(-0.700000f, -0.505000f, -1.649999f);

//                GlStateManager.scale(1F, 1F, 1F);
//                GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
//                GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
//                GlStateManager.rotate(90.000000f, 0f, 0f, 1f);
//                GlStateManager.translate(0.050000f, -0.225000f, -1.549999f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.scale(1F, 1F, 1F);
                            GlStateManager.rotate(44.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                            GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                            GlStateManager.translate(-0.700000f, -0.505000f, -1.449999f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.RegulatorUpper.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, -0.7F, 1.1F);
                            GlStateManager.rotate(27F, 1f, 0f, 0);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.RegulatorUpper.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, -0.7F, 1.1F);
                            GlStateManager.rotate(27F, 1f, 0f, 0);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.RegulatorUpper.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, -0.7F, 1.1F);
                            GlStateManager.rotate(27F, 1f, 0f, 0);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.RegulatorLower.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 0.65F, 1.4F);
                            GlStateManager.rotate(-12F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.RegulatorLower.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 0.65F, 1.4F);
                            GlStateManager.rotate(-12F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.RegulatorLower.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 0.65F, 1.4F);
                            GlStateManager.rotate(-12F, 1f, 0f, 0f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.RegulatorRotator.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 0F, 1.5F);

//            	GlStateManager.translate(0.2F, 1.25F, -0.6F);
//            	GlStateManager.rotate(-180F, 1f, 0f, 0f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.RegulatorActionUpper.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 0.55F, 1.6F);
                            GlStateManager.rotate(-12F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.RegulatorActionUpper.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 0.55F, 1.6F);
                            GlStateManager.rotate(-12F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.RegulatorActionUpper.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 0.55F, 1.6F);
                            GlStateManager.rotate(-12F, 1f, 0f, 0f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.RegulatorActionLower.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 0.75F, 1.2F);
                            GlStateManager.rotate(-12F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.RegulatorActionLower.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 0.75F, 1.2F);
                            GlStateManager.rotate(-12F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.RegulatorActionLower.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 0.75F, 1.2F);
                            GlStateManager.rotate(-12F, 1f, 0f, 0f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.RegulatorAction.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 0.775F, 1.15F);
                            GlStateManager.rotate(-12F, 1f, 0f, 0f);

//             	GlStateManager.translate(0.2F, 0.55F, 1.6F);
//            	 GlStateManager.rotate(-12F, 1f, 0f, 0f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.CyclerFront.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, -0.35F, -0.2F);
                            GlStateManager.rotate(9F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.CyclerFront.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, -0.2F, 0.8F);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.CyclerFront.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, -0.2F, 0.8F);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.CyclerBackLeft.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.15F, -0.15F, 0F);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.CyclerBackLeft.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, -0.15F, 0F);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.CyclerBackLeft.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, -0.15F, 0F);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.CyclerBackRight.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(-0.15F, -0.17F, 0F);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.CyclerBackRight.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(-0.2F, -0.17F, 0F);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.CyclerBackRight.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(-0.2F, -0.17F, 0F);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.Cycler.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, -0.17F, 0.3F);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.Cycler.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, -0.17F, 0.3F);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.Cycler.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0F, -0.17F, 0.3F);
                        })
//            
                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.RegulatorAction.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 0.55F, 1.6F);
                            GlStateManager.rotate(-12F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.RegulatorAction.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 0.55F, 1.6F);
                            GlStateManager.rotate(-12F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.RegulatorRotator.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 1.2F, -0.65F);
                            GlStateManager.rotate(-180F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.RegulatorRotator.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0.2F, 1.2F, -0.65F);
                            GlStateManager.rotate(-180F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningReloading(

                                // mag spawns at bottom

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-16.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(23.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(90.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.225000f, -1.549999f);
                                }, 300, 0),

                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-16.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(23.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(90.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.225000f, -1.549999f);
                                }, 100, 0),

                                // left hand pulls out new mag

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-19.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(23.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(90.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.225000f, -1.549999f);
                                }, 300, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-19.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(23.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(92.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.225000f, -1.549999f);
                                }, 70, 0),

                                // left hand lets go of mag

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-19.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(21.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(91.500000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.225000f, -1.549999f);
                                }, 300, 0),

                                // mag flies forward, above its insertion slot

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(89.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.225000f, -1.549999f);
                                }, 150, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(92.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.225000f, -1.549999f);
                                }, 80, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(90.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.225000f, -1.549999f);
                                }, 100, 0),

                                // mag gravitates to its insertion slot

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(23.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(91.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.150000f, -0.225000f, -1.549999f);
                                }, 50, 0),


                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(21.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(94.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.120000f, -0.225000f, -1.549999f);
                                }, 80, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(22.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(92.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.140000f, -0.225000f, -1.549999f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(22.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(93.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.130000f, -0.225000f, -1.549999f);
                                }, 120, 0),

                                // lower panel moves forward and un-rotates

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(22.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(91.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.130000f, -0.225000f, -1.549999f);
                                }, 120, 0),

                                // upper panel undoes its position and rotation
                                // lower panel undoes

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(21.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(92.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.130000f, -0.225000f, -1.549999f);
                                }, 120, 0)
                        )

                        .withFirstPersonPositioningUnloading(
                                // hand turns, revealing the right side of the gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.050000f, -1.599999f);
                                }, 220, 0),

                                // upper panel shifts completely
                                // lower panel moves down and rotates

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.050000f, -1.599999f);
                                }, 260, 0),

                                // lower panel moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.050000f, -1.599999f);
                                }, 100, 0),

                                // mag ejects

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.050000f, -1.599999f);
                                }, 100, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(Magazines.NinthSinMag,

                                // mag spawns

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(2.5F, 3F, 2F);
                                }, 100, 0),

                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
//                    	GlStateManager.translate(2.5F, 3F, 2F);

                                    GlStateManager.translate(1.3F, -1.3F, 0.4F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                // left hand pulls out new mag

                                new Transition((renderContext) -> { // Reload position


                                    GlStateManager.translate(-0.3F, -1.3F, 0.4F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                    GlStateManager.rotate(11F, 0f, 1f, 0f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.3F, -1.3F, 0.4F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                    GlStateManager.rotate(11F, 0f, 1f, 0f);
                                }, 100, 0),

                                // left hand lets go of mag

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.3F, -0.7F, 0.4F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                    GlStateManager.rotate(11F, 0f, 1f, 0f);
                                }, 100, 0),

                                // mag flies forward, above its insertion slot

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.3F, 0F, 0F);
                                    GlStateManager.rotate(11F, 0f, 1f, 0f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.3F, 0F, 0F);
                                    GlStateManager.rotate(11F, 0f, 1f, 0f);
                                    GlStateManager.rotate(3F, 0f, 0f, 1f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.3F, 0F, 0F);
                                    GlStateManager.rotate(11F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3F, 0f, 0f, 1f);
                                }, 100, 0),

                                // mag gravitates to its insertion slot

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),


                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // lower panel moves forward and un-rotates

                                new Transition((renderContext) -> { // Reload position
                                }, 120, 0),

                                // upper panel undoes its position and rotation
                                // lower panel undoes

                                new Transition((renderContext) -> { // Reload position
                                }, 120, 0)
                        )

                        .withFirstPersonCustomPositioningUnloading(Magazines.NinthSinMag,
                                // hand turns, revealing the right side of the gun

                                new Transition((renderContext) -> { // Reload position
                                }, 220, 0),

                                // upper panel shifts completely
                                // lower panel moves down and rotates

                                new Transition((renderContext) -> { // Reload position
                                }, 260, 0),

                                // lower panel moves back

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // mag ejects

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-2.5F, 3F, 0.5F);
                                    GlStateManager.rotate(-41F, 0f, 0f, 1f);
                                }, 100, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.PanelUpper.getRenderablePart(),

                                // mag spawns

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                // left hand pulls out new mag

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                // left hand lets go of mag

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                // mag flies forward, above its insertion slot

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                // mag gravitates to its insertion slot

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                // lower panel moves forward and un-rotates

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 120, 0),

                                // upper panel undoes its position and rotation
                                // lower panel undoes

                                new Transition((renderContext) -> { // Reload position
                                }, 120, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.PanelLower.getRenderablePart(),

                                // mag spawns

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0),

                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0),

                                // left hand pulls out new mag

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0),

                                // left hand lets go of mag

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0),

                                // mag flies forward, above its insertion slot

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0),

                                // mag gravitates to its insertion slot

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0),

                                // lower panel moves forward and un-rotates

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.3F, 0F);
                                    GlStateManager.rotate(-8F, 1f, 0f, 0f);
                                }, 120, 0),

                                // upper panel undoes its position and rotation
                                // lower panel undoes

                                new Transition((renderContext) -> { // Reload position
                                }, 120, 0)
                        )

                        .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.PanelUpper.getRenderablePart(),
                                // hand turns, revealing the right side of the gun

                                new Transition((renderContext) -> { // Reload position
                                }, 220, 0),

                                // upper panel shifts completely
                                // lower panel moves down and rotates

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 260, 0),

                                // lower panel moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0),

                                // mag ejects

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.25F, 0.6F);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                }, 100, 0)
                        )

                        .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.PanelLower.getRenderablePart(),
                                // hand turns, revealing the right side of the gun

                                new Transition((renderContext) -> { // Reload position
                                }, 220, 0),

                                // upper panel shifts completely
                                // lower panel moves down and rotates

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.3F, 0F);
                                    GlStateManager.rotate(-8F, 1f, 0f, 0f);
                                }, 260, 0),

                                // lower panel moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0),

                                // mag ejects

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0.35F, 0.3F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 100, 0)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.8f, 0.8f, -0.5f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(50F, 0f, 1f, 0f);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(0.4f, 1.2f, -0.8f);
                                }, 350, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(50F, 0f, 1f, 0f);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-12F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(0.4f, 1.2f, -0.8f);
                                }, 300, 0),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(50F, 0f, 1f, 0f);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-12F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(0.4f, 1.2f, -0.75f);
                                }, 450, 400),
                                new Transition((renderContext) -> {
                                    GlStateManager.rotate(50F, 0f, 1f, 0f);
                                    GlStateManager.rotate(60F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-11F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(0.4f, 1.2f, -0.8f);
                                }, 350, 200)
                        )


                        .withFirstPersonPositioningDrawing(

                                //left hand grabs gauntlet

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, -0.200000f, -1.450000f);
                                }, 0, 0),

                                //left hand brings up gauntlet

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, -0.600000f, -0.950000f);
                                }, 300, 0),

                                // right hand inserts into gauntlet

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-11.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(17.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, -0.600000f, -0.880000f);
                                }, 200, 0),

                                // regulator moves left
                                // regulator upper rotates up a little bit
                                // regulator lower moves down a little bit

                                // cycler parts move up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-9.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, -0.650000f, -1.249999f);
                                }, 200, 0),

                                // regulator parts move backwards
                                // regulator upper rotates more and moves forward a bit
                                // regulator lower rotates down a little bit

                                // cycler front moves forward half way and rotates slightly
                                // cycler back parts beging moving horizontally

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-11.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, -0.650000f, -1.249999f);
                                }, 200, 0),

                                // regulator upper rotates more, moves forward
                                // regulator lower moves down and rotates

                                // cycler front rotates more and moves forward
                                // cycler back parts move horizontally more

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.500000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, -0.650000f, -1.249999f);
                                }, 200, 0),

                                // cycler emerges

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-9.800000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.875000f, -0.650000f, -1.249999f);
                                }, 200, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.RegulatorUpper.getRenderablePart(),
                                //left hand grabs gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                //left hand brings up gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // right hand inserts into gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),

                                // regulator moves left
                                // regulator upper rotates up a little bit
                                // regulator lower moves down a little bit

                                // cycler parts move up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, -0.2F, 0F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0);
                                }, 170, 0),

                                // regulator parts move backwards
                                // regulator upper rotates more and moves forward a bit
                                // regulator lower rotates down a little bit

                                // cycler front moves forward half way and rotates slightly
                                // cycler back parts beging moving horizontally

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, -0.45F, 1.4F);
                                    GlStateManager.rotate(16F, 1f, 0f, 0);
                                }, 170, 0),

                                // regulator upper rotates more, moves forward
                                // regulator lower moves down and rotates

                                // cycler front rotates more and moves forward
                                // cycler back parts move horizontally more

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, -0.7F, 1.1F);
                                    GlStateManager.rotate(27F, 1f, 0f, 0);
                                }, 170, 0),

                                // cycler emerges

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, -0.7F, 1.1F);
                                    GlStateManager.rotate(27F, 1f, 0f, 0);
                                }, 170, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.RegulatorLower.getRenderablePart(),
                                //left hand grabs gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                //left hand brings up gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // right hand inserts into gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),

                                // regulator moves left
                                // regulator upper rotates up a little bit
                                // regulator lower moves down a little bit

                                // cycler parts move up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.1F, 0F);
                                }, 170, 0),

                                // regulator parts move backwards
                                // regulator upper rotates more and moves forward a bit
                                // regulator lower rotates down a little bit

                                // cycler front moves forward half way and rotates slightly
                                // cycler back parts beging moving horizontally

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.25F, 1.5F);
                                    GlStateManager.rotate(-4F, 1f, 0f, 0f);
                                }, 170, 0),

                                // regulator upper rotates more, moves forward
                                // regulator lower moves down and rotates

                                // cycler front rotates more and moves forward
                                // cycler back parts move horizontally more

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.65F, 1.4F);
                                    GlStateManager.rotate(-12F, 1f, 0f, 0f);
                                }, 170, 0),

                                // cycler emerges

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.65F, 1.4F);
                                    GlStateManager.rotate(-12F, 1f, 0f, 0f);
                                }, 170, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.RegulatorRotator.getRenderablePart(),
                                //left hand grabs gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                //left hand brings up gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // right hand inserts into gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),

                                // regulator moves left
                                // regulator upper rotates up a little bit
                                // regulator lower moves down a little bit

                                // cycler parts move up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0F, 0F);
                                }, 170, 0),

                                // regulator parts move backwards
                                // regulator upper rotates more and moves forward a bit
                                // regulator lower rotates down a little bit

                                // cycler front moves forward half way and rotates slightly
                                // cycler back parts beging moving horizontally

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0F, 1.5F);
                                }, 170, 0),

                                // regulator upper rotates more, moves forward
                                // regulator lower moves down and rotates

                                // cycler front rotates more and moves forward
                                // cycler back parts move horizontally more

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0F, 1.5F);
                                }, 170, 0),

                                // cycler emerges

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0F, 1.5F);
                                }, 170, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.RegulatorActionUpper.getRenderablePart(),
                                //left hand grabs gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                //left hand brings up gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // right hand inserts into gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),

                                // regulator moves left
                                // regulator upper rotates up a little bit
                                // regulator lower moves down a little bit

                                // cycler parts move up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.1F, 0F);
                                }, 170, 0),

                                // regulator parts move backwards
                                // regulator upper rotates more and moves forward a bit
                                // regulator lower rotates down a little bit

                                // cycler front moves forward half way and rotates slightly
                                // cycler back parts beging moving horizontally

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.25F, 1.5F);
                                    GlStateManager.rotate(-4F, 1f, 0f, 0f);
                                }, 170, 0),

                                // regulator upper rotates more, moves forward
                                // regulator lower moves down and rotates

                                // cycler front rotates more and moves forward
                                // cycler back parts move horizontally more

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.65F, 1.4F);
                                    GlStateManager.rotate(-12F, 1f, 0f, 0f);
                                }, 170, 0),

                                // cycler emerges

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.55F, 1.6F);
                                    GlStateManager.rotate(-12F, 1f, 0f, 0f);
                                }, 170, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.RegulatorActionLower.getRenderablePart(),
                                //left hand grabs gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                //left hand brings up gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // right hand inserts into gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),

                                // regulator moves left
                                // regulator upper rotates up a little bit
                                // regulator lower moves down a little bit

                                // cycler parts move up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.1F, 0F);
                                }, 170, 0),

                                // regulator parts move backwards
                                // regulator upper rotates more and moves forward a bit
                                // regulator lower rotates down a little bit

                                // cycler front moves forward half way and rotates slightly
                                // cycler back parts beging moving horizontally

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.25F, 1.5F);
                                    GlStateManager.rotate(-4F, 1f, 0f, 0f);
                                }, 170, 0),

                                // regulator upper rotates more, moves forward
                                // regulator lower moves down and rotates

                                // cycler front rotates more and moves forward
                                // cycler back parts move horizontally more

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.65F, 1.4F);
                                    GlStateManager.rotate(-12F, 1f, 0f, 0f);
                                }, 170, 0),

                                // cycler emerges

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.75F, 1.2F);
                                    GlStateManager.rotate(-12F, 1f, 0f, 0f);
                                }, 170, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.RegulatorAction.getRenderablePart(),
                                //left hand grabs gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                //left hand brings up gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // right hand inserts into gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),

                                // regulator moves left
                                // regulator upper rotates up a little bit
                                // regulator lower moves down a little bit

                                // cycler parts move up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.1F, 0F);
                                }, 170, 0),

                                // regulator parts move backwards
                                // regulator upper rotates more and moves forward a bit
                                // regulator lower rotates down a little bit

                                // cycler front moves forward half way and rotates slightly
                                // cycler back parts beging moving horizontally

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.25F, 1.5F);
                                    GlStateManager.rotate(-4F, 1f, 0f, 0f);
                                }, 170, 0),

                                // regulator upper rotates more, moves forward
                                // regulator lower moves down and rotates

                                // cycler front rotates more and moves forward
                                // cycler back parts move horizontally more

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.775F, 1.15F);
                                    GlStateManager.rotate(-12F, 1f, 0f, 0f);
                                }, 170, 0),

                                // cycler emerges

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.2F, 0.775F, 1.15F);
                                    GlStateManager.rotate(-12F, 1f, 0f, 0f);
                                }, 170, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.CyclerFront.getRenderablePart(),
                                //left hand grabs gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                //left hand brings up gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // right hand inserts into gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),

                                // regulator moves left
                                // regulator upper rotates up a little bit
                                // regulator lower moves down a little bit

                                // cycler parts move up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.1F, 0F);
                                }, 170, 0),

                                // regulator parts move backwards
                                // regulator upper rotates more and moves forward a bit
                                // regulator lower rotates down a little bit

                                // cycler front moves forward half way and rotates slightly
                                // cycler back parts beging moving horizontally

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.35F, -0.2F);
                                    GlStateManager.rotate(9F, 1f, 0f, 0f);
                                }, 170, 0),

                                // regulator upper rotates more, moves forward
                                // regulator lower moves down and rotates

                                // cycler front rotates more and moves forward
                                // cycler back parts move horizontally more

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.35F, -0.2F);
                                    GlStateManager.rotate(9F, 1f, 0f, 0f);
                                }, 170, 0),

                                // cycler emerges

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.35F, -0.2F);
                                    GlStateManager.rotate(9F, 1f, 0f, 0f);
                                }, 170, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.CyclerBackLeft.getRenderablePart(),
                                //left hand grabs gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                //left hand brings up gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // right hand inserts into gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),

                                // regulator moves left
                                // regulator upper rotates up a little bit
                                // regulator lower moves down a little bit

                                // cycler parts move up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.1F, 0F);
                                }, 170, 0),

                                // regulator parts move backwards
                                // regulator upper rotates more and moves forward a bit
                                // regulator lower rotates down a little bit

                                // cycler front moves forward half way and rotates slightly
                                // cycler back parts beging moving horizontally

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05F, -0.15F, 0F);
                                }, 170, 0),

                                // regulator upper rotates more, moves forward
                                // regulator lower moves down and rotates

                                // cycler front rotates more and moves forward
                                // cycler back parts move horizontally more

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, -0.15F, 0F);
                                }, 170, 0),

                                // cycler emerges

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.15F, -0.15F, 0F);
                                }, 170, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.CyclerBackRight.getRenderablePart(),
                                //left hand grabs gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                //left hand brings up gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // right hand inserts into gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),

                                // regulator moves left
                                // regulator upper rotates up a little bit
                                // regulator lower moves down a little bit

                                // cycler parts move up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.1F, 0F);
                                }, 170, 0),

                                // regulator parts move backwards
                                // regulator upper rotates more and moves forward a bit
                                // regulator lower rotates down a little bit

                                // cycler front moves forward half way and rotates slightly
                                // cycler back parts beging moving horizontally

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.05F, -0.15F, 0F);
                                }, 170, 0),

                                // regulator upper rotates more, moves forward
                                // regulator lower moves down and rotates

                                // cycler front rotates more and moves forward
                                // cycler back parts move horizontally more

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.15F, -0.15F, 0F);
                                }, 170, 0),

                                // cycler emerges

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.15F, -0.15F, 0F);
                                }, 170, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.Cycler.getRenderablePart(),
                                //left hand grabs gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                //left hand brings up gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 100, 0),

                                // right hand inserts into gauntlet

                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),

                                // regulator moves left
                                // regulator upper rotates up a little bit
                                // regulator lower moves down a little bit

                                // cycler parts move up

                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),

                                // regulator parts move backwards
                                // regulator upper rotates more and moves forward a bit
                                // regulator lower rotates down a little bit

                                // cycler front moves forward half way and rotates slightly
                                // cycler back parts beging moving horizontally

                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),

                                // regulator upper rotates more, moves forward
                                // regulator lower moves down and rotates

                                // cycler front rotates more and moves forward
                                // cycler back parts move horizontally more

                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),

                                // cycler emerges

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.17F, 0.3F);
                                }, 170, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.scale(1F, 1F, 1F);
                            GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.350000f, -1.000000f, -1.274999f);

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.scale(1F, 1F, 1F);
                            GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.350000f, -1.000000f, -1.074999f);

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                            }

                            // Everything else
                            else {
                            }


                        })


                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.scale(1F, 1F, 1F);
                            GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-1.399999f, 0.675000f, -0.850000f);
                        })
                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.725000f, 0.700000f, -0.700000f);
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-1.800000f, 0.50000f, -0.400000f);
                        })
                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, 0.075000f, 0.825000f);

//                    	 GlStateManager.scale(3.8f, 3.8f, 3.8f);
//                    	 GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
//                    	 GlStateManager.rotate(170.000000f, 0f, 1f, 0f);
//                    	 GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
//                    	 GlStateManager.translate(-0.375000f, -0.550000f, -0.100000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);

//                         GlStateManager.scale(3.8f, 3.8f, 3.8f);
//                         GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
//                         GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
//                         GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
//                         GlStateManager.translate(0.150000f, -1.324999f, 0.225000f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-170.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(100.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.850000f, -0.800000f, -0.375000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, 0.075000f, 0.825000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                })
                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, 0.075000f, 0.825000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(

                                // mag spawns

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(150.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, -0.875000f, 0.075000f);
                                }, 100, 0),

                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(150.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, -0.875000f, 0.075000f);
                                }, 100, 0),

                                // left hand pulls out new mag

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(170.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.375000f, -0.550000f, -0.100000f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(170.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.375000f, -0.550000f, -0.100000f);
                                }, 100, 0),

                                //left hand lets go of mag

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.050000f, 0.300000f);
                                }, 100, 0),

                                // mag flies forward, above its insertion slot

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.050000f, 0.300000f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.050000f, 0.300000f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.050000f, 0.300000f);
                                }, 100, 0),

                                // mag gravitates to its insertion slot

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.050000f, 0.300000f);
                                }, 100, 0),


                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.050000f, 0.300000f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.050000f, 0.300000f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.050000f, 0.300000f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.050000f, 0.300000f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.050000f, 0.300000f);
                                }, 100, 0)
                        )

                        .withFirstPersonRightHandPositioningReloading(

                                // mag spawns

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),

                                // left hand goes down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),

                                // left hand pulls out new mag

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),

                                // left hand lets go of mag

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),

                                // mag flies forward, above its insertion slot

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),

                                // mag gravitates to its insertion slot

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),


                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0)
                        )

                        .withFirstPersonLeftHandPositioningUnloading(
                                // hand turns, revealing the right side of the gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, 0.075000f, 0.825000f);
                                }, 220, 0),

                                // upper panel shifts completely
                                // lower panel moves down and rotates

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, 0.075000f, 0.825000f);
                                }, 260, 0),

                                // lower panel moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, 0.075000f, 0.825000f);
                                }, 100, 0),

                                // mag ejects

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, 0.075000f, 0.825000f);
                                }, 100, 0)
                        )

                        .withFirstPersonRightHandPositioningUnloading(
                                // hand turns, revealing the right side of the gun

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 220, 0),

                                // upper panel shifts completely
                                // lower panel moves down and rotates

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 260, 0),

                                // lower panel moves back

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0),

                                // mag ejects

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 100, 0)
                        )

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.350000f, 0.225000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.125000f, -0.350000f, 0.225000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.350000f, -0.725000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.425000f, -0.775000f, -0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.350000f, -0.725000f, 0.000000f);
                                }, 250, 50)
                        )

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 50)
                        )

                        .withThirdPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.075000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.025000f, 0.000000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.025000f, 0.000000f);
                                }, 250, 0))

                        .withThirdPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.150000f, 0.375000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-26.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-26.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(1.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-53.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-53.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-54.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(1.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-24.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-24.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-26.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0))

                        .withFirstPersonLeftHandPositioningDrawing(
                                //left hand grabs gauntlet

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.775000f, 0.275000f);
                                }, 100, 0),

                                //left hand brings up gauntlet

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.775000f, 0.275000f);
                                }, 100, 0),

                                // right hand inserts into gauntlet

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.775000f, 0.275000f);
                                }, 250, 0),

                                // regulator moves left
                                // regulator upper rotates up a little bit
                                // regulator lower moves down a little bit

                                // cycler parts move up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, 0.075000f, 0.725000f);
                                }, 170, 0),

                                // regulator parts move backwards
                                // regulator upper rotates more and moves forward a bit
                                // regulator lower rotates down a little bit

                                // cycler front moves forward half way and rotates slightly
                                // cycler back parts beging moving horizontally

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, 0.075000f, 0.725000f);
                                }, 170, 0),

                                // regulator upper rotates more, moves forward
                                // regulator lower moves down and rotates

                                // cycler front rotates more and moves forward
                                // cycler back parts move horizontally more

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, 0.075000f, 0.725000f);
                                }, 170, 0),

                                // cycler emerges

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, 0.075000f, 0.725000f);
                                }, 170, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                //left hand grabs gauntlet

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-110.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.150000f, -1.324999f, 0.225000f);
                                }, 100, 0),

                                //left hand brings up gauntlet

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.475000f, -0.800000f, 0.400000f);
                                }, 100, 0),

                                // right hand inserts into gauntlet

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 250, 0),

                                // regulator moves left
                                // regulator upper rotates up a little bit
                                // regulator lower moves down a little bit

                                // cycler parts move up

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 170, 0),

                                // regulator parts move backwards
                                // regulator upper rotates more and moves forward a bit
                                // regulator lower rotates down a little bit

                                // cycler front moves forward half way and rotates slightly
                                // cycler back parts beging moving horizontally

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 170, 0),

                                // regulator upper rotates more, moves forward
                                // regulator lower moves down and rotates

                                // cycler front rotates more and moves forward
                                // cycler back parts move horizontally more

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 170, 0),

                                // cycler emerges

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.8f, 3.8f, 3.8f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.473000f, -0.430000f, 0.270000f);
                                }, 170, 0)
                        )

                        .build())
                .withSpawnEntityDamage(4f)
                .withSpawnEntityGravityVelocity(0.0118f)


                .build(MWC.modContext);
    }
}
