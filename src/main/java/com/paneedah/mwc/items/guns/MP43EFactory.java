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

public class MP43EFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("MP43E")
                .withAmmoCapacity(2)
                .withFireRate(0.3f)
                .withRecoil(14f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.SHOTGUN)
                .withMaxShots(1)
                .withShootSound("mp43e")
                .withSilencedShootSound("ShotgunSilenced")
                .withReloadSound("mp43ereload")
                .withReloadIterationSound("load_shell")
                .withDrawSound("noaction_draw")
                .withAllReloadIterationsCompletedSound("mp43ereloadfin")
                .withReloadingTime(15)
                .withShellCasingEjectEnabled(false)
                .withInaccuracy(10)
                .withPellets(10)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.09f)
                .withFlashOffsetY(() -> 0.09f)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        5f, // x
                        4f, // y
                        10f) // z

                .withCompatibleAttachment(AuxiliaryAttachments.MP43Edoublebarrel, true, (model) -> {
                    GlStateManager.scale(1f, 1f, 1f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.ShotgunShellDouble, true, (model) -> {
                    if (model instanceof Shotgun12Gauge) {
                        GlStateManager.translate(-0.06F, -0.42F, -0.02F);
                        GlStateManager.rotate(90F, 1f, 0f, 0f);
                        GlStateManager.scale(0.47F, 0.47F, 0.47F);
                    } else if (model instanceof Shotgun12Gauge2) {
                        GlStateManager.translate(-0.22F, -0.42F, -0.02F);
                        GlStateManager.rotate(90F, 1f, 0f, 0f);
                        GlStateManager.scale(0.47F, 0.47F, 0.47F);
                    }
                })
//        .withCompatibleAttachment(Attachments.Silencer12Gauge, (model) -> {
//            GlStateManager.translate(-0.19F, -0.6F, -8F);
//            GlStateManager.scale(1.4F, 1.4F, 1.4F);
//        })
                .withCompatibleBullet(Bullets.Shotgun12Guage, (model) -> {})
                .withTextureNames("MP43E")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new MP43E())
                        //.withTextureName("Remington900")
                        //.withWeaponProximity(0.99F)
                        //.withYOffsetZoom(5F)
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
                            GlStateManager.rotate(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.35F, 0.35F, 0.35F);
                            GlStateManager.translate(1, 0.8f, 0);
                            GlStateManager.rotate(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
                            GlStateManager.translate(-1.3F, -0.1F, 1.3F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(5F, 0f, 0f, 1f);
                            GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                            GlStateManager.translate(-0.150000f, 0.275000f, -1.249999f);

//                GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
//                GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
//                GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
//                GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
//                GlStateManager.translate(-0.150000f, 0.350000f, -0.950000f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(5F, 0f, 0f, 1f);
                            GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                            GlStateManager.translate(-0.150000f, 0.275000f, -0.549999f);
                            GlStateManager.rotate(-6F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                            GlStateManager.translate(0.2f, 0.23f, -0.8f);
                            GlStateManager.rotate(-5F, 1f, 0f, 1f);
//                GlStateManager.rotate(-2.5F, 0f, 1f, 0f);

//              // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                                //System.out.println("Position me for Holo");
                            }

                            // Everything else
                            else {
                            }

                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.MP43Edoublebarrel.getRenderablePart(), (renderContext) -> {
//            	GlStateManager.translate(0f, -0.1f, 0f);
//                GlStateManager.rotate(35F, 1f, 0f, 0f);
//                GlStateManager.scale(1f, 1f, 1f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.ShotgunShellDouble.getRenderablePart(), (renderContext) -> {
                            // inserted

//            	GlStateManager.translate(0f, -0.125f, 0.005f);
//                GlStateManager.rotate(35F, 1f, 0f, 0f);
//                GlStateManager.scale(1f, 1f, 1f);

                            // about to insert

//                GlStateManager.translate(0f, -0.28f, 0.23f);
//                GlStateManager.rotate(35F, 1f, 0f, 0f);
//                GlStateManager.scale(1f, 1f, 1f);

                            // being carried by left hand

//            	GlStateManager.translate(0.5f, 0.2f, 0.6f);
//                GlStateManager.rotate(25F, 1f, 1f, 0f);
//                GlStateManager.scale(1f, 1f, 1f);

                            // being carried by left hand PT 2

//                GlStateManager.translate(0.35f, -0.15f, 0.5f);
//                GlStateManager.rotate(25F, 1f, 1f, 0f);
//                GlStateManager.scale(1f, 1f, 1f);
                        })

                        .withFirstPersonPositioningReloading(

                                // left hand grabs double-barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-3.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(43.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.320000f, -0.950000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(42.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.330000f, -0.950000f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-4.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.325000f, -0.950000f);
                                }, 80, 0),

                                // left hand brings down barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.43000f, -1.000000f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(3.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.980000f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(2.700000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.920000f);
                                }, 80, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(2.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.950000f);
                                }, 90, 0),

                                // left hand reaches down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(36.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.950000f);
                                }, 250, 0),

                                // left hand brings up shotgun shells

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-11.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(36.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.950000f);
                                }, 220, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.950000f);
                                }, 140, 0),

                                // shotgun shells touches insertion point

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-8.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.410000f, -0.950000f);
                                }, 160, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-9.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.410000f, -0.950000f);
                                }, 70, 0),

                                // shells insert

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.380000f, -0.950000f);
                                }, 110, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.380000f, -0.950000f);
                                }, 70, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.380000f, -0.950000f);
                                }, 90, 0),

                                // left hand grabs double-barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-4.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.950000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.950000f);
                                }, 70, 0),

                                // left hand snaps barrel into place

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-13.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.38000f, -0.900000f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.34000f, -0.940000f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-10.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.35000f, -0.950000f);
                                }, 80, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-11.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.35000f, -0.950000f);
                                }, 100, 0)
                        )

                        // 20 transitions total

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MP43Edoublebarrel.getRenderablePart(),
                                // left hand grabs double-barrel

                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),

                                // left hand brings down barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // left hand reaches down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // left hand brings up shotgun shells

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // shotgun shells touches insertion point

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // shells insert

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // left hand grabs double-barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.1f, 0f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // left hand snaps barrel into place

                                new Transition((renderContext) -> { // Reload position
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 260, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.ShotgunShellDouble.getRenderablePart(),
                                // left hand grabs double-barrel

                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),

                                // left hand brings down barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.7f, 1f);
                                    GlStateManager.rotate(30F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);

                                    // change this so that it looks like the shells are flying out
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.2f, -0.7f, 0.7f);
                                    GlStateManager.rotate(-35F, 1f, 1f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.2f, -0.8f, 1.5f);
                                    GlStateManager.rotate(-85F, 1f, 1f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(-0.2f, -0.8f, 2f);
                                    GlStateManager.rotate(-85F, 1f, 1f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);

                                }, 260, 0),

                                // left hand reaches down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.8f, 1f, 1f);
                                    GlStateManager.rotate(25F, 1f, 1f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // left hand brings up shotgun shells

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.5f, 0.2f, 0.8f);
                                    GlStateManager.rotate(25F, 1f, 1f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.35f, -0.15f, 0.5f);
                                    GlStateManager.rotate(25F, 1f, 1f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // shotgun shells touches insertion point

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.28f, 0.23f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.28f, 0.23f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // shells insert

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.125f, 0.005f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.125f, 0.005f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.125f, 0.005f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // left hand grabs double-barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.125f, 0.005f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.125f, 0.005f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // left hand snaps barrel into place

                                new Transition((renderContext) -> { // Reload position
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                }, 260, 0)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.475000f, 0.150000f, -0.950000f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.375000f, 0.700000f, -0.825000f);
                                }, 350, 600)
                        )

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(15F, 0f, 1f, 0f);
                                    GlStateManager.rotate(13F, 0f, 0f, 1f);
                                    GlStateManager.rotate(9F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.2f, 0.7f, -1.4f);
                                }, 160, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(25F, 0f, 1f, 0f);
                                    GlStateManager.rotate(9F, 0f, 0f, 1f);
                                    GlStateManager.rotate(6F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.2f, 0.5f, -1.4f);
                                }, 210, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(35F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8F, 0f, 0f, 1f);
                                    GlStateManager.rotate(4F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.2f, 0.4f, -1.4f);
                                }, 270, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-2F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.2f, 0.45f, -1.4f);
                                }, 240, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                            GlStateManager.translate(0.250000f, 0.23f, -1.5f);

//              // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                                //System.out.println("Position me for Holo");
                            }

                            // Everything else
                            else {
                            }


                        })
                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.scale(2f, 2f, 2f);
                            GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.350000f, 0.6f, -0.6f);
                        })
                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                            GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.725000f, 0.1f, -1.324999f);
                        })
                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.600000f, 0.150000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                })

                        .withFirstPersonHandPositioningRunning(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.600000f, 0.150000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.600000f, 0.150000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, 0.175000f, 0.450000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(
                                // left hand grabs double-barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.600000f, 0.200000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.600000f, 0.200000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.600000f, 0.200000f);
                                }, 200, 0),

                                // left hand brings down barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.525000f, 0.225000f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.525000f, 0.225000f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.525000f, 0.225000f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.525000f, 0.225000f);
                                }, 260, 0),

                                // left hand reaches down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.125000f, 0.425000f);
                                }, 260, 0),

                                // left hand brings up shotgun shells

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.350000f, -1.100000f, 0.175000f);
                                }, 260, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.420000f, -0.975000f, 0.025000f);
                                }, 260, 0),

                                // shotgun shells touches insertion point

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.370000f, -0.765000f, 0.175000f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.370000f, -0.765000f, 0.175000f);
                                }, 260, 0),

                                // shells insert

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.270000f, -0.725000f, 0.235000f);

                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.270000f, -0.725000f, 0.235000f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.270000f, -0.725000f, 0.235000f);
                                }, 260, 0),

                                // left hand grabs double-barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.375000f, 0.225000f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, -0.400000f, 0.225000f);
                                }, 260, 0),

                                // left hand snaps barrel into place

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.450000f, 0.240000f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.450000f, 0.240000f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.450000f, 0.240000f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.450000f, 0.240000f);
                                }, 260, 0)
                        )

                        .withFirstPersonRightHandPositioningReloading(
                                // left hand grabs double-barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 200, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 200, 0),

                                // left hand brings down barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                // left hand reaches down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                // left hand brings up shotgun shells

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                // shotgun shells touches insertion point

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                // shells insert

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                // left hand grabs double-barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                // left hand snaps barrel into place

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.543000f, -0.825000f, 0.185000f);
                                }, 260, 0)
                        )

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.675000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.675000f, 0.125000f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -0.925000f, 0.030000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -0.925000f, 0.030000f);
                                }, 250, 50))

                        .withFirstPersonLeftHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.675000f, 0.125000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.675000f, 0.125000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.675000f, 0.125000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.675000f, 0.125000f);
                                }, 200, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -0.925000f, 0.030000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -0.925000f, 0.030000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -0.925000f, 0.030000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -0.925000f, 0.030000f);
                                }, 250, 100)
                        )

                        .build())
                .withSpawnEntityDamage(6f)
                .withSpawnEntityGravityVelocity(0.8f)


                .build(MWC.modContext);
    }
}
