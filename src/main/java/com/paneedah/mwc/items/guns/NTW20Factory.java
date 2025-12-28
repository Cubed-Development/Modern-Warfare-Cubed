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

public class NTW20Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("ntw_20")
                .withFireRate(0.1f)
                .withEjectRoundRequired()
                .withRecoil(13f)
                .withZoom(0.8f)
                .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
                .withMaxShots(1)
                .withShootSound("ntw20")
                .withEjectSpentRoundSound("ntw20_boltaction")
                .withPumpTimeout(1000)
                .withSilencedShootSound("snipersilencer")
                .withReloadSound("ntw20_reload")
                .withUnloadSound("as50_unload")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(40)
                .withFlashIntensity(0.6f)
                .withFlashScale(() -> 0.8f)
                .withFlashOffsetX(() -> 0.11f)
                .withFlashOffsetY(() -> 0.13f)
                .withCreativeTab(MWC.WEAPONS_TAB)


                .withScreenShaking(RenderableState.SHOOTING,
                        2f, // x
                        -2f, // y
                        7f) // z

                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withCompatibleAttachment(Attachments.NTW20HandguardRAIL, true, (player, stack) -> {
                }, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(-0.037F, -0.43F, 0.77F);
                        GlStateManager.scale(0.55F, 0.45F, 0.33F);
                    }
                })
                .withCompatibleAttachment(AuxiliaryAttachments.NTW20Barrel, true, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.NTW20Action, true, (model) -> {
                })
                .withCompatibleAttachment(Magazines.NTW20Mag, (model) -> {
                })
                .withCompatibleAttachment(Attachments.HP, true, (player, stack) -> {
                    GlStateManager.translate(-0.155F, -0.4F, 1.6F);
                    GlStateManager.scale(0.85F, 0.85F, 0.85F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.237F, -0.215F, 1.155001F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })
                .withTextureNames("gun2")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new NTW20())
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
                            GlStateManager.scale(0.6F, 0.6F, 0.6F);
                            GlStateManager.translate(0F, 2F, -0F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GlStateManager.scale(2.5f, 2.5f, 2.5f);
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.scale(2.5f, 2.5f, 2.5f);
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.400000f, 0.100000f, -3.5599999f);
                            GlStateManager.rotate(-1.000000f, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.NTW20Action.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.NTW20Action.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.NTW20Barrel.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.NTW20Barrel.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningCustomRecoiled(Magazines.NTW20Mag.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.NTW20Mag.getRenderablePart(), (renderContext) -> {
                            GlStateManager.translate(0f, 0f, 1f);
                        })

                        .withFirstPersonPositioningEjectSpentRound(
                                // goes to action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 120, 0),
                                // up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(12.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.2F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.1F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 80, 0),
                                // back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43.5F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.9F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.55f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43.1F, 0f, 1f, 0f);
                                    GlStateManager.rotate(12.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.7F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.52f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43.2F, 0f, 1f, 0f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.8F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.53f);
                                }, 100, 0),
                                // forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(44.3F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.6F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.5f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.2F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.599999f);
                                }, 80, 0),
                                // down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.63f);
                                }, 110, 0)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.NTW20Action.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 0f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 0f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 1f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 1f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 1f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 0f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 0f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonPositioningEjectSpentRoundAimed(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.translate(0.185f, 0f, -3.050000f);
                                    GlStateManager.rotate(1F, 0f, 0f, 1f);
                                }, 180, 0),
                                // up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.translate(0.185f, 0f, -3.050000f);
                                    GlStateManager.rotate(1F, 0f, 0f, 1f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.translate(0.185f, 0f, -3.050000f);
                                    GlStateManager.rotate(1F, 0f, 0f, 1f);
                                }, 170, 0),
                                // back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.translate(0.185f, 0f, -2.750000f);
                                    GlStateManager.rotate(4F, 0f, 0f, 1f);
                                }, 160, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.translate(0.185f, 0f, -2.750000f);
                                    GlStateManager.rotate(4F, 0f, 0f, 1f);
                                }, 160, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.translate(0.185f, 0f, -2.750000f);
                                    GlStateManager.rotate(4F, 0f, 0f, 1f);
                                }, 160, 0),
                                // forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.translate(0.185f, 0f, -2.850000f);
                                    GlStateManager.rotate(2F, 0f, 0f, 1f);
                                }, 180, 0),
                                // down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.translate(0.185f, 0f, -3.050000f);
                                }, 120, 0)

                        )

                        .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.NTW20Action.getRenderablePart(),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 0f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 0f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 1f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 1f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 1f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 0f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 0f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.NTW20Action.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 0f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 0f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 300),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 1f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 1f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 1f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 0f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.translate(0.05f, 0f, 0f);
                                    GlStateManager.rotate(25F, 0f, 0f, 1f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                }, 250, 50)

                        )

                        .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.NTW20Action.getRenderablePart(),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 120, 0),
                                // mag insert
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 100, 0),
                                // goes to action
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 200, 0),
                                // up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(12.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.2F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 100, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.1F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 80, 0),
                                // back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43.5F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.9F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.55f);
                                }, 80, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43.1F, 0f, 1f, 0f);
                                    GlStateManager.rotate(12.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.7F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.52f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43.2F, 0f, 1f, 0f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.8F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.53f);
                                }, 100, 0),
                                // forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(44.3F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.6F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.5f);
                                }, 90, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(-0.2F, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.599999f);
                                }, 80, 0),
                                // down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(8.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.63f);
                                }, 110, 0)
                        )

                        .withFirstPersonPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(1.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 270, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(2.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 240, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(11.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(1.000000f, 1f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 280, 0))

                        .withFirstPersonCustomPositioningReloading(Magazines.NTW20Mag,
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(1.6F, 1F, 0F);
                                    GlStateManager.rotate(50f, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.3F, -0F, 0F);
                                    GlStateManager.rotate(10f, 0f, 0f, 1f);
                                }, 250, 1000),
                                // to
                                new Transition((renderContext) -> { // Reload position
                                }, 180, 0),
                                // up
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                // back
                                new Transition((renderContext) -> { // Reload position
                                }, 160, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                // forward
                                new Transition((renderContext) -> { // Reload position
                                }, 180, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 170, 0),
                                // down
                                new Transition((renderContext) -> { // Reload position
                                }, 120, 0),
                                new Transition((renderContext) -> { // Reload position
                                }, 120, 0)

                        )

                        .withFirstPersonCustomPositioningUnloading(Magazines.NTW20Mag,
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0.5F, -0F, 0F);
                                    GlStateManager.rotate(10f, 0f, 0f, 1f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(1.6F, 1F, 0F);
                                    GlStateManager.rotate(50f, 0f, 0f, 1f);
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.125000f, 1.949999f, -1.474999f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.000000f, 2.375000f, -1.424999f);
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
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.5F, -1.8F, 3.4F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.5F, -1.8F, 3.4F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.5F, -1.8F, 3.4F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 260, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.5F, -1.8F, 3.4F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 400, 150),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.5F, -1.8F, 3.4F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 300, 60),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.5F, -1.8F, 3.4F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 100, 170),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.8F, -2F, 4F);
                                    GlStateManager.rotate(-60F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 350, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.8F, -2F, 4F);
                                    GlStateManager.rotate(-60F, 0f, 1f, 0f);
                                    GlStateManager.rotate(100F, 1f, 0f, 0f);
                                }, 220, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.47F, 0.47F, 0.47F);
                                    GlStateManager.translate(-3.8F, -2F, 4F);
                                    GlStateManager.rotate(-60F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 220, 0)
//                }, 100, 0)
                        )

                        .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M82Action.getRenderablePart(),
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
                                    GlStateManager.translate(0f, 0f, 1.3f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(10F, 0f, 1f, 0f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 270, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(15F, 0f, 1f, 0f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 270, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(25F, 0f, 1f, 0f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 0f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 450, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(35F, 0f, 1f, 0f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 340, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 350, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(2.5f, 2.5f, 2.5f);
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(7.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, 0.100000f, -3.699999f);
                                }, 400, 0)
                        )


                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.185f, 0f, -3.050000f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0f, 0.05f, 0.8f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0f, 0.125f, 1f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0f, 0.036f, 1.2f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.06f, 0.6f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.09f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.06f, 0.4f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.09f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.09f, 0.9f);
                            }

//             // HP Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Scope");
//                    GlStateManager.translate(0f, 0.13f, 0.9f);
//                } 

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.12f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, -0.01f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, -0.01f, 0.9f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.185f, 0f, -3.450000f);
                            GlStateManager.rotate(-1F, 1f, 0f, 0f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0f, 0.05f, 0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0f, 0.125f, 0.8f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0f, 0.036f, 1f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.06f, 1.1f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.09f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.06f, 0.4f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.09f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.09f, 0.9f);
                            }

//             // HP Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Scope");
//                    GlStateManager.translate(0f, 0.13f, 0.9f);
//                } 

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, 0.12f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, -0.01f, 0.9f);
                            }

                            // HP Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Scope");
                                GlStateManager.translate(0f, -0.01f, 0.9f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.scale(1f, 1f, 1f);
                            GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.300000f, -0.29999f, -2.175000f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-1.2f, -0.2f, -4f);
                        })

                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                })

                        .withFirstPersonHandPositioningZooming(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -1.424999f, -0.225000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.375000f, -1.424999f, 0.100000f);
                                }, 50, 200),

                                // to
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.450000f, -1.374999f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200)

                        )

                        .withFirstPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                }, 50, 200),
                                // to
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.525000f, -1.299999f, 0.225000f);
                                }, 50, 200),
                                // up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -1.149999f, -0.100000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -1.149999f, -0.100000f);
                                }, 50, 200),
                                // back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.925000f, -1.149999f, -0.300000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.925000f, -1.149999f, -0.300000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.925000f, -1.149999f, -0.300000f);
                                }, 50, 200),
                                // forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -1.149999f, -0.100000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -1.149999f, -0.100000f);
                                }, 50, 200),
                                // down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.525000f, -1.299999f, 0.225000f);
                                }, 50, 200))

                        .withFirstPersonLeftHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.450000f, -1.374999f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.375000f, -1.424999f, 0.08f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.400000f, -1.424999f, -0.225000f);
                                }, 50, 200))

                        .withFirstPersonRightHandPositioningUnloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                }, 50, 200))

                        .withFirstPersonLeftHandPositioningEjectSpentRound(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                // up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                // back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                // forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                // down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200)

                        )

                        .withFirstPersonRightHandPositioningEjectSpentRound(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.525000f, -1.299999f, 0.225000f);
                                }, 50, 200),
                                // up
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -1.149999f, -0.100000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -1.149999f, -0.100000f);
                                }, 50, 200),
                                // back
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.925000f, -1.149999f, -0.300000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.925000f, -1.149999f, -0.300000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.925000f, -1.149999f, -0.300000f);
                                }, 50, 200),
                                // forward
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -1.149999f, -0.100000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -1.149999f, -0.100000f);
                                }, 50, 200),
                                // down
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.525000f, -1.299999f, 0.225000f);
                                }, 50, 200))

                        .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 50, 200)

                        )

                        .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.525000f, -1.299999f, 0.225000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -1.149999f, -0.100000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -1.149999f, -0.100000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.925000f, -1.149999f, -0.300000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.925000f, -1.149999f, -0.300000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.925000f, -1.149999f, -0.300000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -1.149999f, -0.100000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.700000f, -1.149999f, -0.100000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.525000f, -1.299999f, 0.225000f);
                                }, 50, 200))

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0f, -0.15f, 0f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(5f, 5f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.55f, -0.35f, 0.2f);
                                }, 250, 50))

                        .withFirstPersonRightHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.525000f, -0.525000f, 0.050000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.525000f, -0.525000f, 0.050000f);
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
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.050000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.050000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.050000f, 0.050000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.050000f, 0.050000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.050000f, 0.175000f);
                                }, 50, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.050000f, 0.175000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.150000f, 0.100000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.150000f, 0.100000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.150000f, 0.150000f, 0.100000f);
                                }, 280, 0))

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
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.100000f, 0.125000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-58.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-23.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.100000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-59.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-21.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.100000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.100000f, 0.125000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.100000f, 0.125000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.100000f, 0.125000f);
                                }, 260, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-130.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.100000f, 0.275000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-135.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-65.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.175000f, 0.275000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-130.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.100000f, 0.275000f);
                                }, 300, 0))

                        .withFirstPersonLeftHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 130, 60),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 110, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -1.125000f, 0.125000f);
                                }, 110, 0)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-95.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.349999f, 0.450000f);
                                }, 130, 0)
                        )


                        .build())
                .withSpawnEntityDamage(35f)
                .withSpawnEntityGravityVelocity(0f)


                .build(MWC.modContext);
    }
}
