package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.Kedr;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class KedrFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("pp91_kedr")
                .withFireRate(0.7f)
                .withRecoil(2f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.SUBMACHINE_GUN)
                .withShellType(Type.PISTOL)
                .withMaxShots(1, Integer.MAX_VALUE)
                //.withMaxShots(5)
                .withShootSound("kedr")
                .withSilencedShootSound("kbp9a91_silenced")
                .withReloadSound("kedr_reload")
                .withUnloadSound("kedr_unload")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(45)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.12f)
                .withFlashOffsetY(() -> 0.18f)
                .withInaccuracy(2f)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        2f, // x
                        0.1f, // y
                        3f) // z

                .withCompatibleAttachment(AuxiliaryAttachments.KedrAction, true, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.KedrStock, true, (model) -> {
//        	GlStateManager.translate(0F, -0.7F, 1.55F);
//        	GlStateManager.rotate(100F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Magazines.KedrMag, (model) -> {
//        	GlStateManager.translate(0F, 0.25F, 0F);
//            GlStateManager.rotate(5F, 0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
                    GlStateManager.translate(-0.25F, -1.1F, -4.8F);
                    GlStateManager.scale(1.5F, 1.5F, 1.5F);
                })
                .withTextureNames("kedr")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new Kedr())
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
                            GlStateManager.translate(-1.8F, -1.1F, 2F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2f, 2f, 2f);
                            GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.150000f, 0.850000f, -1.125000f);

//                GlStateManager.scale(2f, 2f, 2f);
//                GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
//                GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
//                GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
//                GlStateManager.translate(-0.575000f, 0.800000f, -0.775000f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2f, 2f, 2f);
                            GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.150000f, 0.850000f, -0.825000f);
                            GlStateManager.rotate(-1F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.KedrAction.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0f, 0f, 1.2f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.KedrAction.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0f, 0f, 1.2f);
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.KedrAction.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GlStateManager.translate(0F, 0F, 1.2F);
                            }
                        })

                        .withFirstPersonPositioningReloading(

                                // hand goes down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.900000f, 1.2f, -0.900000f);
                                }, 250, 0),

                                // mag touches gun
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-36.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.900000f, 1.100000f, -0.900000f);
                                }, 290, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-34.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.900000f, 1.15f, -0.900000f);
                                }, 100, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-6.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.900000f, 1.13f, -0.900000f);
                                }, 130, 0),

                                // mag inserts
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-37.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-9.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.900000f, 1f, -0.900000f);
                                }, 110, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.900000f, 1.100000f, -0.900000f);
                                }, 60, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.900000f, 1.04f, -0.900000f);
                                }, 70, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-6.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.900000f, 1.06f, -0.900000f);
                                }, 80, 0),

                                // grabs action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-24.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, 1.300000f, -1.000000f);
                                }, 240, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, 1.300000f, -1.000000f);
                                }, 70, 0),
                                // pulls action back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-28.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(1.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, 1.300000f, -0.9f);
                                }, 80, 0),
                                // action snaps forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-18.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, 1.300000f, -1.2f);
                                }, 70, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-19.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(6.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, 1.300000f, -1.1f);
                                }, 60, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-18.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, 1.300000f, -1.17f);
                                }, 70, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-17.30000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, 1.300000f, -1.13f);
                                }, 90, 0)
                        )

                        .withFirstPersonPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.3f, 1.000000f, -1.125000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(43.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.4f, 1.04f, -1.125000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-11.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(43.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-2.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.4f, 1.06f, -1.125000f);
                                }, 180, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.KedrAction.getRenderablePart(),
                                // mag down
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 250, 1000),
                                // mag touch gun
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 250, 1000),
                                // mag inserts
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 250, 1000),
                                // grabs action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 240, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 70, 0),
                                // pulls action back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 80, 0),
                                // action snaps forward
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                }, 60, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                }, 90, 0)
                        )

                        .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.KedrAction.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0F, 1.2F);
                                }, 500, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Magazines.KedrMag,
                                // mag down
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 3F, 0.4F);
                                    GlStateManager.rotate(-20F, 0f, 0f, 1f);
                                }, 250, 1000),
                                // mag touches gun
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.25F, 0F);
                                    GlStateManager.rotate(-10F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.15F, 0F);
                                    GlStateManager.rotate(5F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.2F, 0F);
                                }, 250, 1000),
                                // mag inserts
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                // grabs action
                                new Transition((renderContext) -> { // Reload position
                                }, 240, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                // pulls action back
                                new Transition((renderContext) -> { // Reload position
                                }, 80, 0),
                                // action snaps forward
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                }, 60, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                }, 70, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                }, 90, 0)
                        )

                        .withFirstPersonCustomPositioningUnloading(Magazines.KedrMag,
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0.45F, -0.15F);
                                    GlStateManager.rotate(-10F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 2F, -0.15F);
                                    GlStateManager.rotate(-10F, 1f, 0f, 0f);
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.100000f, 1.150000f, -0.500000f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, 1.050000f, -1.400000f);
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

                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.KedrAction.getRenderablePart(),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
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
                                    GlStateManager.translate(0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.575000f, 0.800000f, -0.775000f);
                                }, 120, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(18.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(13.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.575000f, 0.800000f, -0.775000f);
                                }, 120, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(17.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-11.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.575000f, 0.800000f, -0.775000f);
                                }, 270, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.275000f, 0.800000f, -0.975000f);
                                }, 190, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.175000f, 0.800000f, -1.175000f);
                                }, 190, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.KedrStock.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -2.05F, 0.75F);
                                    GlStateManager.rotate(190F, 1f, 0f, 0f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0F, -0.7F, 1.55F);
                                    GlStateManager.rotate(100F, 1f, 0f, 0f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 130, 60),
                                new Transition((renderContext) -> { // Reload position
                                }, 110, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.350000f, 0.59f, -1f);


                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(-0.07F, 0.13f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(-0.015F, 0.17f, 0.7f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.350000f, 0.59f, -0.7f);
                            GlStateManager.rotate(-0.6F, 1f, 0f, 0f);


                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(-0.07F, 0.13f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(-0.015F, 0.17f, 0.65f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.scale(1f, 1f, 1f);
                            GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.725000f, 0.800000f, -0.575000f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(2f, 2f, 2f);
                            GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.300000f, 0.400000f, -0.550000f);
                        })

                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.500000f, 0.075000f);

//                    	 GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);

//                    	 GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.375000f, 0.175000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.400000f, 0.075000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                })

                        .withFirstPersonHandPositioningRunning(
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.475000f, 0.050000f, 0.225000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(
                                // mag down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.725000f, -0.450000f, 0.075000f);
                                }, 50, 200),
                                // mag touches gun
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.500000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.475000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.525000f, 0.125000f);
                                }, 50, 200),
                                // mag inserts
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -0.475000f, 0.050000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -0.475000f, 0.050000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -0.475000f, 0.050000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -0.475000f, 0.050000f);
                                }, 250, 0),
                                // grabs action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.325000f, -0.775000f, 0.100000f);
                                }, 240, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.325000f, -0.775000f, 0.100000f);
                                }, 70, 0),
                                // pulls action back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.325000f, -0.795000f, 0.100000f);
                                }, 80, 0),
                                // action snaps forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.315000f, -0.985000f, 0.100000f);
                                }, 70, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.315000f, -0.985000f, 0.100000f);
                                }, 60, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.315000f, -0.985000f, 0.100000f);
                                }, 70, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.315000f, -0.985000f, 0.100000f);
                                }, 90, 0)
                        )

                        .withFirstPersonRightHandPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 260, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 260, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 260, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 260, 0),
                                // grabs action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 240, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 70, 0),
                                // pulls action back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 80, 0),
                                // action snaps forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 70, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 60, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 70, 0),
                                // jiggle
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 90, 0)
                        )

                        .withFirstPersonLeftHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.550000f, 0.150000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -0.475000f, 0.150000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-55.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -0.600000f, 0.100000f);
                                }, 50, 200))

                        .withFirstPersonRightHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 250, 50))

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.275000f, -0.125000f, 0.325000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.500000f, 0.025000f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.500000f, -0.475000f, 0.150000f);
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
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.475000f, 0.000000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(90.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.525000f, -0.400000f, -0.100000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(125.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.725000f, -0.450000f, 0.125000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(125.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.725000f, -0.450000f, 0.125000f);
                                }, 130, 60),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(125.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.725000f, -0.450000f, 0.125000f);
                                }, 110, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3.5f, 3.5f, 3.5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.395000f, -0.470000f, 0.190000f);
                                }, 280, 0)
                        )

                        .build())
                .withSpawnEntityDamage(5f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}

