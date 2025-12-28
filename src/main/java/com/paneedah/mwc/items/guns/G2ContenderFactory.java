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

public class G2ContenderFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("g2_contender")
                .withAmmoCapacity(1)
                .withFireRate(0.3f)
                .withRecoil(9f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.HANDGUN)
                .withMaxShots(1)
                .withShootSound("g2contender")
                .withSilencedShootSound("ShotgunSilenced")
                .withReloadSound("g2contender_reload")
                .withDrawSound("noaction_draw")
                .withReloadingTime(15)
                .withShellCasingEjectEnabled(false)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.09f)
                .withFlashOffsetY(() -> 0.09f)

                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        3f, // x
                        2f, // y
                        6f) // z

                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withCompatibleAttachment(Attachments.G2ContenderBarrelShort, true, (model) -> {
                    if (model instanceof G2ContenderBarrelShort) {
                        GlStateManager.translate(0F, -0F, 0f);
//                GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GlStateManager.translate(-0.175F, -0.9F, -0.3f);
                        GlStateManager.scale(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof FALIron) {
                        GlStateManager.translate(-0.07F, -0.6F, -2.7f);
                        GlStateManager.scale(0.1F, 0.3F, 0.6F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    }
                })
                .withCompatibleAttachment(Attachments.G2ContenderBarrelLong, (model) -> {
                    if (model instanceof G2ContenderBarrelShort) {
                        GlStateManager.translate(0F, -0F, 0f);
//                GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GlStateManager.translate(-0.175F, -0.9F, -0.3f);
                        GlStateManager.scale(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof FALIron) {
                        GlStateManager.translate(-0.07F, -0.6F, -5f);
                        GlStateManager.scale(0.1F, 0.3F, 0.6F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail) {
                        GlStateManager.translate(-0.16F, -0.65F, -2f);
                        GlStateManager.scale(0.6F, 0.6F, 0.6F);
//                GlStateManager.rotate(180F, 0f, 0f, 1f);
                    }
                })
                .withCompatibleAttachment(Attachments.G2ContenderGrip, true, (model) -> {
//          GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.G2ContenderStock, (model) -> {
//          GlStateManager.translate(0.01f, -0.19f, -0.4f);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.BulletSmall, true, (model) -> {
                    GlStateManager.translate(-0.14f, -0.44f, 0.03f);
                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                })
                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
                    GlStateManager.translate(-0.115F, -0.57F, -2F);
                    GlStateManager.scale(0.48F, 0.48F, 0.48F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.076F, -0.67F, 4.0251F);
                        GlStateManager.scale(0.04F, 0.04F, 0.04F);
                    }
                })
                .withCompatibleBullet(Bullets.Bullet4570, (model) -> {})
                .withTextureNames("g2contender")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new G2Contender())
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
//                GlStateManager.rotate(45F, 0f, 1f, 0f);
//                GlStateManager.rotate(5F, 0f, 0f, 1f);
//                GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
//                GlStateManager.translate(-0.150000f, 0.335000f, -1.049999f);

                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(12F, 0f, 0f, 1f);
                            GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                            GlStateManager.translate(-0.110000f, 0.355000f, -1.449999f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(12F, 0f, 0f, 1f);
                            GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                            GlStateManager.translate(-0.110000f, 0.355000f, -0.849999f);
                            GlStateManager.rotate(-3F, 1f, 0f, 0f);
                        })

                        .withFirstPersonCustomPositioning(Attachments.G2ContenderBarrelShort.getRenderablePart(), (renderContext) -> {
//            	GlStateManager.translate(0f, -0.1f, 0f);
//                GlStateManager.rotate(35F, 1f, 0f, 0f);
//                GlStateManager.scale(1f, 1f, 1f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.BulletSmall.getRenderablePart(), (renderContext) -> {
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
                                }, 150, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(42.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.330000f, -0.950000f);
                                }, 40, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-4.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.325000f, -0.950000f);
                                }, 60, 0),

                                // left hand brings down barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.43000f, -1.000000f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(3.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.980000f);
                                }, 40, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(2.700000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.920000f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(2.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.950000f);
                                }, 70, 0),

                                // left hand reaches down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(36.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.950000f);
                                }, 220, 0),

                                // left hand brings up shotgun shells

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-11.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(36.500000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.950000f);
                                }, 180, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.950000f);
                                }, 110, 0),

                                // shotgun shells touches insertion point

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-8.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.410000f, -0.950000f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-9.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.410000f, -0.950000f);
                                }, 60, 0),

                                // shells insert

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.380000f, -0.950000f);
                                }, 70, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.380000f, -0.950000f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(37.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.380000f, -0.950000f);
                                }, 80, 0),

                                // left hand grabs double-barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-4.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.950000f);
                                }, 180, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.40000f, -0.950000f);
                                }, 60, 0),

                                // left hand snaps barrel into place

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-13.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.38000f, -0.900000f);
                                }, 100, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.34000f, -0.940000f);
                                }, 40, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-10.500000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.35000f, -0.950000f);
                                }, 60, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.500000f, 2.500000f, 2.500000f);
                                    GlStateManager.rotate(-11.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.35000f, -0.950000f);
                                }, 80, 0)
                        )

                        // 20 transitions total

                        .withFirstPersonCustomPositioningReloading(Attachments.G2ContenderBarrelShort.getRenderablePart(),
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

                        .withFirstPersonCustomPositioningReloading(Attachments.G2ContenderBarrelLong.getRenderablePart(),
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

                        .withFirstPersonCustomPositioningReloading(Attachments.LeupoldRailScope.getRenderablePart(),
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
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 120, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // left hand reaches down

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // left hand brings up shotgun shells

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // shotgun shells touches insertion point

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // shells insert

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // left hand grabs double-barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 2.4f, 0.2f);
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

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.BulletSmall.getRenderablePart(),
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
                                    GlStateManager.translate(0f, -0.24f, 0.23f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.24f, 0.23f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // shells insert

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.105f, 0.005f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.105f, 0.005f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.105f, 0.005f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // left hand grabs double-barrel

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.105f, 0.005f);
                                    GlStateManager.rotate(35F, 1f, 0f, 0f);
                                    GlStateManager.scale(1f, 1f, 1f);
                                }, 260, 0),

                                // jiggle

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, -0.105f, 0.005f);
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
                            GlStateManager.translate(0.250000f, 0.23f, -1f);

//              // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.27f, 1f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                            GlStateManager.translate(0.25f, 0.23f, -0.4f);
                            GlStateManager.rotate(-5F, 1f, 0f, 1f);
//                GlStateManager.rotate(-2.5F, 0f, 1f, 0f);

//              // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.27f, 0.5f);
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
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, 0.125000f, 0.650000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.520000f, -0.730000f, 0.270000f);
                                })

                        .withFirstPersonHandPositioningRunning(
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.160000f, -0.525000f, 0.250000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.475000f, -0.675000f, 0.325000f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.160000f, -0.525000f, 0.250000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.535000f, -0.700000f, 0.275000f);
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
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.475000f, -0.675000f, 0.325000f);
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
                .withSpawnEntityDamage(6.5f)
                .withSpawnEntityGravityVelocity(0.8f)


                .build(MWC.modContext);
    }
}
