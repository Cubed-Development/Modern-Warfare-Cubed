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

public class MG42Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("mg42")
                .withFireRate(0.99f)
                .withRecoil(2f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.HEAVY)
                .withMaxShots(Integer.MAX_VALUE)
                //.withMaxShots(5)
                .withShootSound("mg42")
                .withSilencedShootSound("ak15_silenced")
                .withReloadSound("mg42_reload")
                .withUnloadSound("mg42_unload")
                .withInspectSound("inspection")
                .withDrawSound("mg42_draw")
//        .withDrawSound("mg42_reload")
                .withReloadingTime(45)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.15f)
                .withInaccuracy(1f)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        3f, // x
                        2f, // y
                        6f) // z

                .withCompatibleAttachment(AuxiliaryAttachments.MG42action, true, (model) -> {
//            GlStateManager.translate(0F, 0F, 1F); 
                })
                .withCompatibleAttachment(AuxiliaryAttachments.MG42latch, true, (model) -> {
//            GlStateManager.translate(0F, -2F, 0F);
//            GlStateManager.rotate(90F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.MG42Belt, true, (model) -> {
//            GlStateManager.translate(0.45F, 0F, 0F);
                })
                .withCompatibleAttachment(Magazines.MG42Mag, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
                    if (model instanceof AKMiron1) {
                        GlStateManager.translate(0.125F, -1.8F, -0.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GlStateManager.translate(-0.183F, -1.32F, -5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GlStateManager.translate(-0.25F, -1.65F, -3.05F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M4Iron1) {
                        GlStateManager.translate(0.155F, -1.74F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GlStateManager.translate(0.26F, -1.55F, -2.35F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GlStateManager.translate(0.26F, -1.55F, -2.35F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof G36CIron1) {
                        GlStateManager.translate(-0.22F, -1.94F, 0.13F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof G36CIron2) {
                        GlStateManager.translate(-0.205F, -1.9F, -3.15F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof ScarIron1) {
                        GlStateManager.translate(0.165F, -1.65F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof ScarIron2) {
                        GlStateManager.translate(0.25F, -1.55F, -2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof FALIron) {
                        GlStateManager.translate(0.26F, -1.555F, -5.4F);
                        GlStateManager.scale(0.15F, 0.3F, 0.8F);
                        GlStateManager.rotate(-180F, 0f, 0f, 1f);
                    } else if (model instanceof M14Iron) {
                        GlStateManager.translate(0.129F, -1.63F, -2.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withTextureNames("mg42")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new MG42())
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
                            GlStateManager.translate(-2.3F, -0.4F, 1.8F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2f, 2f, 2f);
                            GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.5f, 1.100000f, -1f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(2f, 2f, 2f);
                            GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.500000f, 1.100000f, -0.5f);
                            GlStateManager.rotate(-0.7F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.MG42action.getRenderablePart(), (renderContext) -> {
//                GlStateManager.translate(0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.MG42action.getRenderablePart(), (renderContext) -> {
//                GlStateManager.translate(0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningReloading(

                                //hand grabs latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.500000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.100000f, -1f);
                                    GlStateManager.rotate(1.5F, 1f, 0f, 0f);
                                }, 330, 0),
                                //hand opens latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.500000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.100000f, -1f);
                                    GlStateManager.rotate(2F, 1f, 0f, 0f);
                                }, 280, 0),

                                //gun movement to indicate character grabbing new magazine
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(41F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(7.300000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.55f, 1.13f, -0.85f);
                                    GlStateManager.rotate(1F, 1f, 0f, 0f);
                                }, 530, 0),
                                //left hand moves magazine to position
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.100000f, -0.85f);
                                    GlStateManager.rotate(1F, 1f, 0f, 0f);
                                }, 440, 10),
                                //left hand pushes magazine in
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.100000f, -0.85f);
                                    GlStateManager.rotate(1F, 1f, 0f, 0f);
                                }, 240, 50),
                                //left hand grabs belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.13f, -0.85f);
                                    GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                }, 330, 0),
                                //left hand drags belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.47f, 1.13f, -0.83f);
                                    GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                                }, 300, 0),
                                //left hand grabs latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.15f, -0.85f);
                                }, 350, 0),
                                //left hand closes latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.15f, -0.85f);
                                    GlStateManager.rotate(1F, 1f, 0f, 0f);
                                }, 300, 0),
                                //hand goes to action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.15f, -0.9f);
                                }, 340, 0),
                                //hand pulls action back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.15f, -0.85f);
                                }, 260, 100),
                                //hand pushes action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.12f, -0.9f);
                                }, 280, 0)
                        )

                        .withFirstPersonPositioningUnloading(

                                //left hand begins grabs magazine out
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(13.700000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.55f, 1.100000f, -0.85f);
                                    GlStateManager.rotate(1F, 1f, 0f, 0f);
                                }, 300, 100),
                                //left hand begins grabs magazine out
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.300000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.55f, 1.100000f, -0.85f);
                                    GlStateManager.rotate(1F, 1f, 0f, 0f);
                                }, 300, 100),
                                //left hand drops magazine
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.300000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.55f, 1.13f, -0.85f);
                                    GlStateManager.rotate(0.5F, 1f, 0f, 0f);
                                }, 340, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MG42action.getRenderablePart(),


                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0f, 0f, 1f);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000)
                        )

                        .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.MG42action.getRenderablePart(),


                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MG42latch.getRenderablePart(),


                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),

                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.MG42latch.getRenderablePart(),


                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MG42Belt.getRenderablePart(),


                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),

                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.45F, 0.9F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.45F, 0F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.MG42Belt.getRenderablePart(),


                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.45F, 0F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.45F, 0F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0.95F, 0F);
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Magazines.MG42Mag,


                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 250, 1000),

                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.3F, 0.1F, 0F);
                                    GlStateManager.rotate(-15F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningUnloading(Magazines.MG42Mag,

                                new Transition((renderContext) -> {

                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.3F, 0.1F, 0F);
                                    GlStateManager.rotate(-15F, 0f, 0f, 1f);

                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.15F, 0.9F, 0F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.350000f, 0.925000f, -1.125000f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.525000f, 1.174999f, -1.125000f);
                                }, 350, 600))

                        .withThirdPersonPositioningReloading(
                                //hand goes to action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2F, 0F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 430, 50),
                                //hand pulls action back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.4F, 0.5F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(100F, 1f, 0f, 0f);
                                }, 200, 100),
                                //hand pushes action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2F, 0F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 260, 10),
                                //hand grabs latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, 0F, 2.5F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 330, 0),
                                //hand opens latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, 0F, 2.5F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 280, 0),
                                //left hand begins grabs magazine out
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, 0F, 2.5F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 100),
                                //left hand drops magazine
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, 0F, 2.5F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 340, 0),
                                //gun movement to indicate character grabbing new magazine
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, 0F, 2.5F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 530, 0),
                                //left hand moves magazine to position
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, 0F, 2.5F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 440, 10),
                                //left hand pushes magazine in
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, 0F, 2.5F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 240, 50),
                                //left hand grabs belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, 0F, 2.5F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 330, 0),
                                //left hand drags belt
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, 0F, 2.5F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 0),
                                //left hand grabs latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, 0F, 2.5F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 350, 0),
                                //left hand closes latch
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.5F, 0F, 2.5F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 0),
                                //hand goes to action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2F, 0F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 340, 0),
                                //hand pulls action back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.4F, 0.5F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(100F, 1f, 0f, 0f);
                                }, 260, 100),
                                //hand pushes action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2F, 0F, 3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 280, 0)
                        )

                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.MG42action.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0f, 0f, 1f);
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
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0f, 0f, 1f);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000)
                        )

                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.MG42latch.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -2F, 0.1F);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.MG42Belt.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.45F, 0F, 0F);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.45F, 0F, 0F);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.45F, 0F, 0F);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.45F, 0F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.45F, 0F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.45F, 0F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(1.6F, 3.5F, 0.5F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(1.6F, 3.5F, 0.5F);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.7F, 0F, 0F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )


                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(20F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.500000f, 1.100000f, -0.6f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(23F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(13.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.500000f, 1.100000f, -0.75f);
                                }, 230, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(27F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.500000f, 1.100000f, -0.9f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(35F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(7.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.500000f, 1.100000f, -0.85f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.100000f, -0.850000f);
                                }, 230, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.500000f, 1.100000f, -0.75f);
                                }, 180, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(2f, 2f, 2f);
                                    GlStateManager.rotate(9.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.500000f, 1.100000f, -0.850000f);
                                }, 180, 0)
                        )

                        .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.MG42action.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 230, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 230, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0f, 0f, 1f);
                                }, 180, 100),
                                new Transition((renderContext) -> { // Reload position
                                }, 180, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0f, 1.1f, -1.1f);


                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.24f, 0.85f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.23f, 1.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.19f, 0.75f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.17f, 0.85f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.195f, 1.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.25f, 0.9f);
                            }

//             // ACOG Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Acog");
//                    GlStateManager.translate(0F, 0.27f, 0.9f);
//                } 

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.26f, 0.8f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(-0.05f, 1.1f, -1f);
                            GlStateManager.rotate(-0.5F, 1f, 0f, 0f);
                            GlStateManager.rotate(1.5F, 0f, 0f, 1f);


                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.24f, 0.75f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.23f, 1.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.19f, 0.75f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.17f, 0.85f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.195f, 1.2f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.25f, 0.9f);
                            }

//             // ACOG Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Acog");
//                    GlStateManager.translate(0F, 0.27f, 0.9f);
//                } 

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.26f, 0.8f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.rotate(12.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.6f, 1.2f, -1f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(2f, 2f, 2f);
                            GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.350000f, 0.925000f, -1.125000f);
                        })

                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);

//                         GlStateManager.scale(4f, 4f, 4f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(


                                //hand grabs latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.375000f, -0.775000f, -0.225000f);
                                }, 250, 1000),
                                //hand opens latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.300000f, -0.050000f);
                                }, 250, 1000),
                                //hand grabs magazine

                                //hand stays down there
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.150000f, -0.800000f, -0.075000f);
                                }, 250, 1000),
                                //hand pulls up new magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.775000f, -0.125000f);
                                }, 250, 1000),
                                //hand pushes in magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.775000f, -0.125000f);
                                }, 250, 1000),
                                //hand grabs belt
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.775000f, 0.000000f);
                                }, 250, 1000),
                                //hand drags belt
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.200000f, -0.750000f, 0.025000f);
                                }, 250, 1000),
                                //hand grabs latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.300000f, -0.050000f);
                                }, 250, 1000),
                                //hand closes latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.375000f, -0.775000f, -0.225000f);
                                }, 250, 1000),
                                //hand lifts up
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.775000f, -0.125000f);
                                }, 250, 1000),
                                //hand smacks latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.775000f, -0.125000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.775000f, -0.125000f);
                                }, 250, 1000))

                        .withFirstPersonRightHandPositioningReloading(


                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.525000f, -0.700000f, 0.025000f);
                                }, 500, 1000),
                                //hand pulls action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.675000f, -0.900000f, 0.075000f);
                                }, 500, 1000),
                                //hand pushes action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.525000f, -0.700000f, 0.025000f);
                                }, 500, 1000))

                        .withFirstPersonLeftHandPositioningUnloading(


                                //hand grabs magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.775000f, -0.125000f);
                                }, 250, 1000),
                                //hand grabs magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.025000f, -0.775000f, -0.125000f);
                                }, 250, 1000),
                                //hand drops magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.150000f, -0.800000f, -0.075000f);
                                }, 250, 1000))

                        .withFirstPersonRightHandPositioningUnloading(


                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 1000))

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 50))

                        .withThirdPersonLeftHandPositioningReloading(
                                //does nothing
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 500, 1000),
                                //does nothing
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 500, 1000),
                                //does nothing
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 500, 1000),
                                //hand grabs latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.075000f, 0.100000f);
                                }, 250, 1000),
                                //hand opens latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.100000f, 0.200000f);
                                }, 250, 1000),
                                //hand grabs magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.025000f, -0.100000f, 0.075000f);
                                }, 250, 1000),
                                //hand drops magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, 0.025000f, 0.025000f);
                                }, 250, 1000),
                                //hand stays down there
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, 0.025000f, 0.025000f);
                                }, 250, 1000),
                                //hand pulls up new magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.075000f, 0.100000f);
                                }, 250, 1000),
                                //hand pushes in magazine
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.075000f, 0.100000f);
                                }, 250, 1000),
                                //hand grabs belt
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.025000f, 0.125000f);
                                }, 250, 1000),
                                //hand drags belt
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.050000f, 0.150000f);
                                }, 250, 1000),
                                //hand grabs latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.125000f, -0.100000f, 0.200000f);
                                }, 250, 1000),
                                //hand closes latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.075000f, -0.075000f, 0.100000f);
                                }, 250, 1000),
                                //hand lifts up
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 250, 1000),
                                //hand smacks latch
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.050000f, -0.075000f, 0.075000f);
                                }, 250, 1000))

                        .withThirdPersonRightHandPositioningReloading(
                                //hand grabs action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.100000f, 0.050000f);
                                }, 500, 1000),
                                //hand pulls action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.175000f, 0.050000f);
                                }, 500, 1000),
                                //hand pushes action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.100000f, 0.050000f);
                                }, 500, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.150000f, 0.075000f);
                                }, 500, 1000),
                                //hand pulls action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.175000f, 0.050000f);
                                }, 500, 1000),
                                //hand pushes action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.000000f, -0.100000f, 0.050000f);
                                }, 500, 1000))

                        .withFirstPersonLeftHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.200000f, 0.175000f);
                                }, 200, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.650000f, -0.650000f, 0.175000f);
                                }, 250, 100),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.525000f, -0.700000f, 0.025000f);
                                }, 500, 1000),
                                //hand pulls action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.675000f, -0.900000f, 0.075000f);
                                }, 500, 1000),
                                //hand pushes action
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.525000f, -0.700000f, 0.025000f);
                                }, 500, 1000)
                        )

                        .build())
                .withSpawnEntityDamage(13.5f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}

