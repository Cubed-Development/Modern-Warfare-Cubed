package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.RPG7;
import com.paneedah.mwc.models.RPG7rocketPROJECTILE;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class RPG7Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("rpg7")
//      .withCapacity(CommonProxy.AR15Mag)
                .withAmmoCapacity(1)
                .withFireRate(0.7f)
                .withRecoil(10f)
                .withZoom(0.9f)
                .withMaxShots(1)
                //.withMaxShots(5)
                .withShootSound("rpg7")
                .withReloadSound("rpg7_reload")
                .withReloadingTime(50)
                .withFlashIntensity(0.7f)
                .withFlashScale(() -> 2f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.14f)
                .withShellCasingEjectEnabled(false)
                .withDestroyingBlocks(false)
                .withCreativeTab(MWC.WEAPONS_TAB)

                .withScreenShaking(RenderableState.SHOOTING,
                        1f, // x
                        1f, // y
                        8f) // z


                .withCompatibleAttachment(Bullets.RPGRocket, (model) -> {})
                .withCompatibleAttachment(AuxiliaryAttachments.RPG7rocket, true, (model) -> {
                })
                .withTextureNames("rpg7")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new RPG7())
                        //.withTextureName("M4A1")
                        //.withWeaponProximity(0.99F)
                        //.withYOffsetZoom(5F)
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
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
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(-3F, 0f, 0f, 1f);
                            GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                            GlStateManager.translate(-0.425000f, 0.825000f, -2.500000f);

//                GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
//                GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
//                GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
//                GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
//                GlStateManager.translate(-1.200000f, 1.200000f, 0.5f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(-3F, 0f, 0f, 1f);
                            GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                            GlStateManager.translate(-0.425000f, 0.825000f, -2.1f);
                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.03f, 0.8f, -1.6f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.26f, 1.6f);
                            }
                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.13f, 1.3f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.125f, 1f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.16f, 1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.16f, 1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.125f, 1f);
                            }

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.06f, 1.5f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.RPG7rocket.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GlStateManager.translate(-1F, 0.3F, 10F);
                            }
                        })

                        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.RPG7rocket.getRenderablePart(), (renderContext) -> {
//                GlStateManager.translate(0F, 0F, -50F);
                        })

                        .withFirstPersonPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.200000f, 1.200000f, -0.5f);
                                }, 500, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.200000f, 1.200000f, 0f);
                                }, 430, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.200000f, 1.200000f, 0.5f);
                                }, 450, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.rotate(-24.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(31.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.200000f, 1.200000f, 0.55f);
                                }, 320, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.rotate(-26.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(29.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.200000f, 1.200000f, 0.55f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.rotate(-17.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-6.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.200000f, 1.200000f, 0.5f);
                                }, 310, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.200000f, 1.200000f, -1.5f);
                                }, 290, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.200000f, 1.200000f, -2f);
                                }, 170, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.RPG7rocket.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 50F, 5F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(1.5F, 1f, 2F);
                                    GlStateManager.rotate(10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0f, -2.5F);
                                    GlStateManager.rotate(10.000000f, 1f, 0f, 0f);

                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0f, -1.7F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, 0f, -1.7F);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.GL06Cartridge.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, 0F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, 0F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, 0F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, 0F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, 0F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, 0F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, 0F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.ACOG.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.Specter.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.7f, -0.8F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.7f, -0.8F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.7f, -0.8F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.7f, -0.8F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.7f, -0.8F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.7f, -0.8F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.7f, -0.8F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.Holographic.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.Kobra.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.Reflex.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.35f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.35f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.35f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.35f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.35f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.35f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.35f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.MicroT1.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonCustomPositioningReloading(Attachments.RMR.getRenderablePart(),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.37f, -0.2F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                }, 250, 1000)
                        )

                        .withFirstPersonPositioningInspecting(
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-20.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1f, 0.8f, -0.5f);
                                }, 300, 600),
                                new Transition((renderContext) -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-10.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.225000f, 1.4f, -0.8f);
                                }, 350, 600)
                        )

                        .withFirstPersonPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3F, 0f, 0f, 1f);
                                    GlStateManager.rotate(30F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.425000f, 1f, -2.8f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3F, 0f, 0f, 1f);
                                    GlStateManager.rotate(20F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.425000f, 1f, -2.7f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3F, 0f, 0f, 1f);
                                    GlStateManager.rotate(10F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.425000f, 0.825000f, -2.6f);
                                }, 240, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-3F, 0f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.425000f, 0.825000f, -2.45f);
                                }, 230, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-3F, 0f, 0f, 1f);
                                    GlStateManager.rotate(1F, 1f, 0f, 0f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.425000f, 0.825000f, -2.500000f);
                                }, 230, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.03f, 0.8f, -2f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.26f, 1.6f);
                            }
                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GlStateManager.translate(0F, 0.13f, 1.3f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.125f, 1f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0F, 0.16f, 1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.16f, 1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.125f, 1f);
                            }

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Reflex");
                                GlStateManager.translate(0F, 0.06f, 1.5f);
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                            GlStateManager.rotate(30.000000f, 1f, 0f, 0f);
                            GlStateManager.translate(-0.575000f, 0.700000f, -3.100003f);
                        })
                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.rotate(-25.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-1f, 0.700000f, -1.3f);
                        })
                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -0.875000f, 0.150000f);

//                         GlStateManager.scale(4f, 4f, 4f);
//                         GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
//                         GlStateManager.rotate(-165.000000f, 0f, 1f, 0f);
//                         GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
//                         GlStateManager.translate(-0.425000f, 0.075000f, -0.625000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                })
                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GlStateManager.scale(2.2f, 2.2f, 2.2f);
                                    GlStateManager.rotate(-5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.75f, -0.175000f, 0.6f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.325000f, -0.550000f, 0.000000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-75.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-160.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.600000f, -0.575000f, -0.475000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-165.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.425000f, 0.075000f, -0.625000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-165.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, -0.350000f, -0.425000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-165.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.425000f, 0.075000f, -0.625000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-165.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.400000f, -0.350000f, -0.425000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -0.875000f, 0.150000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -0.875000f, 0.150000f);
                                }, 250, 0))

                        .withFirstPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                }, 250, 1000),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                }, 250, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                }, 250, 0))

                        .withFirstPersonLeftHandPositioningInspecting(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.475000f, 0.200000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.475000f, 0.200000f);
                                }, 250, 50))

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
                                }, 250, 50))

                        .withFirstPersonLeftHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -0.875000f, 0.150000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -0.875000f, 0.150000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -0.875000f, 0.150000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -0.875000f, 0.150000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 4f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -0.875000f, 0.150000f);
                                }, 50, 200)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.750000f, -1.050000f, 0.050000f);
                                }, 280, 0)
                        )

                        .build())
                .withSpawnEntityDamage(70f)
                .withSpawnEntityRocketParticles()
                .withSpawnEntitySpeed(4f)
                .withSpawnEntityGravityVelocity(0.001f)
                .withSpawnEntityExplosionRadius(4f)
                .withSpawnEntityModel(new RPG7rocketPROJECTILE())
                .withSpawnEntityModelTexture("rpg7")
                .build(MWC.modContext);
    }
}
