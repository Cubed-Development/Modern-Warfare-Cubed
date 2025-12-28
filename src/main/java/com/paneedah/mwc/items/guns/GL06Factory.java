package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class GL06Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("gl06")
//      .withCapacity(CommonProxy.AR15Mag)
                .withAmmoCapacity(1)
                .withFireRate(0.7f)
                .withRecoil(5f)
                .withZoom(0.9f)
                .withMaxShots(1)
                //.withMaxShots(5)
                .withShootSound("m79")
                .withReloadSound("m79_reload")
                .withReloadingTime(50)
                .withFlashIntensity(0f)
                .withFlashScale(() -> 0f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.101f)
                .withShellCasingEjectEnabled(false)
                .withDestroyingBlocks(false)

                .withScreenShaking(RenderableState.SHOOTING,
                        4f, // x
                        3f, // y
                        2f) // z

                .withCreativeTab(MWC.WEAPONS_TAB)

                .withCompatibleAttachment(Bullets.Grenade40mm, (model) -> {})

                .withCompatibleAttachment(AuxiliaryAttachments.GLgrenade, true, (model) -> {
//            GlStateManager.translate(0F, -0.4f, 0F);
//            GlStateManager.scale(1F, 1F, 1F);
//            GlStateManager.rotate(8F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.GL06Cartridge, true, (model) -> {
//            GlStateManager.translate(0F, -0.4f, 0F);
//            GlStateManager.scale(1F, 1F, 1F);
//            GlStateManager.rotate(8F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.31F, -1.41F, -0.7F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GlStateManager.translate(-0.018F, -0.25F, 0.13F);
                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GlStateManager.translate(0.243F, -0.23F, 0.68f);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
                    GlStateManager.translate(-0.17F, -1.14F, -0.45F);
                    GlStateManager.scale(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (model) -> {
                    if (model instanceof Reflex) {
                        GlStateManager.translate(-0.072F, -1.2F, -0.9F);
                        GlStateManager.scale(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.123F, -1.47F, -0.9F);
                        GlStateManager.scale(0.07F, 0.07F, 0.07F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (model) -> {
                    if (model instanceof Holographic2) {
                        GlStateManager.translate(-0.053F, -1.25F, -0.6F);
                        GlStateManager.scale(0.55F, 0.55F, 0.55F);
                    } else if (model instanceof Holo2) {
                        GlStateManager.translate(-0.12F, -1.52F, -0.5F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, (model) -> {
                    if (model instanceof Kobra) {
                        GlStateManager.translate(-0.053F, -1.25F, -0.6F);
                        GlStateManager.scale(0.55F, 0.55F, 0.55F);
                    } else if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.122F, -1.5F, -1.05F);
                        GlStateManager.scale(0.07F, 0.07F, 0.07F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, (model) -> {
                    if (model instanceof MicroT1) {
                        GlStateManager.translate(-0.17F, -1.36F, -0.6F);
                        GlStateManager.scale(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -1.465F, -0.7F);
                        GlStateManager.scale(0.07F, 0.07F, 0.07F);
                    }
                })
                .withCompatibleAttachment(Attachments.RMR, (model) -> {
                    if (model instanceof RMRsight) {
                        GlStateManager.translate(-0.163F, -1.38F, -0.5F);
                        GlStateManager.scale(0.28F, 0.28F, 0.28F);
                    } else if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.123F, -1.38F, -0.8F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GlStateManager.translate(-0.2F, -0F, -2.1F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0F, -2.1F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0F, -2.1F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GlStateManager.translate(-0.2F, -0F, -2.1F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
                    GlStateManager.translate(0.05F, -0.8F, -2.85F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                })
                .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
                    GlStateManager.translate(0.05F, -0.8F, -2.85F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                })
                .withTextureNames("GL06")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new GL06())
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
                            GlStateManager.rotate(7F, 0f, 0f, 1f);
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.translate(-0.275000f, 0.775000f, -1.125000f);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.rotate(7F, 0f, 0f, 1f);
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.translate(-0.275000f, 0.775000f, -0.65f);
                            GlStateManager.rotate(-6F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.350000f, 0.85f, -1.05f);
                            GlStateManager.rotate(-1F, 1f, 0f, 0f);

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

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.GLgrenade.getRenderablePart(), (renderContext) -> {
                        })

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.GL06Cartridge.getRenderablePart(), (renderContext) -> {
                        })

                        .withFirstPersonCustomPositioning(Attachments.ACOG.getRenderablePart(), (renderContext) -> {
                        })

                        .withFirstPersonCustomPositioning(Attachments.Specter.getRenderablePart(), (renderContext) -> {
                        })

                        .withFirstPersonCustomPositioning(Attachments.Holographic.getRenderablePart(), (renderContext) -> {
                        })

                        .withFirstPersonCustomPositioning(Attachments.Kobra.getRenderablePart(), (renderContext) -> {
                        })

                        .withFirstPersonCustomPositioning(Attachments.Reflex.getRenderablePart(), (renderContext) -> {
                        })

                        .withFirstPersonCustomPositioning(Attachments.MicroT1.getRenderablePart(), (renderContext) -> {
                        })

                        .withFirstPersonCustomPositioning(Attachments.RMR.getRenderablePart(), (renderContext) -> {
                        })

                        .withFirstPersonPositioningReloading(

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(6F, 0f, 0f, 1f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.500000f, 1.2f, -1.5f);
                                    GlStateManager.rotate(7F, 1f, 0f, 0f);
                                }, 400, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5F, 0f, 0f, 1f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.500000f, 1.2f, -1.5f);
                                    GlStateManager.rotate(-45F, 1f, 0f, 0f);
                                }, 430, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4F, 0f, 0f, 1f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.500000f, 1.2f, -1.5f);
                                    GlStateManager.rotate(-47F, 1f, 0f, 0f);
                                }, 200, 50),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-5F, 0f, 0f, 1f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.500000f, 1.2f, -1.5f);
                                    GlStateManager.rotate(-46F, 1f, 0f, 0f);
                                }, 300, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-4F, 0f, 0f, 1f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.500000f, 1.2f, -1.5f);
                                    GlStateManager.rotate(-45F, 1f, 0f, 0f);
                                }, 260, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(20F, 0f, 0f, 1f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.2f, 1.3f, -1.5f);
                                    GlStateManager.rotate(-16F, 1f, 0f, 0f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(22F, 0f, 0f, 1f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.2f, 1.3f, -1.5f);
                                    GlStateManager.rotate(-10F, 1f, 0f, 0f);
                                }, 230, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(21F, 0f, 0f, 1f);
                                    GlStateManager.scale(4.000000f, 4.000000f, 4.000000f);
                                    GlStateManager.translate(-0.2f, 1.3f, -1.5f);
                                    GlStateManager.rotate(-4F, 1f, 0f, 0f);
                                }, 170, 0)
                        )

                        .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.GLgrenade.getRenderablePart(),
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
                                    GlStateManager.translate(0F, -0.4f, 1F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, 1F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, 1F);
                                    GlStateManager.scale(1F, 1F, 1F);
                                    GlStateManager.rotate(8F, 1f, 0f, 0f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GlStateManager.translate(0F, -0.4f, 0.5F);
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
                                    GlStateManager.rotate(40F, 0f, 1f, 0f);
                                    GlStateManager.rotate(0F, 0f, 0f, 1f);
                                    GlStateManager.rotate(15F, 1f, 0f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.275000f, 1f, -1.125000f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(42F, 0f, 1f, 0f);
                                    GlStateManager.rotate(5F, 0f, 0f, 1f);
                                    GlStateManager.rotate(5F, 1f, 0f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.275000f, 0.8775000f, -1f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(43F, 0f, 1f, 0f);
                                    GlStateManager.rotate(10F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-3F, 1f, 0f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.25f, 0.775000f, -1f);
                                }, 180, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(44F, 0f, 1f, 0f);
                                    GlStateManager.rotate(7F, 0f, 0f, 1f);
                                    GlStateManager.rotate(-1F, 1f, 0f, 0f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.25f, 0.775000f, -1.125000f);
                                }, 160, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.rotate(45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(4F, 0f, 0f, 1f);
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.translate(-0.25f, 0.775000f, -1.125000f);
                                }, 140, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.rotate(45F, 0f, 1f, 0f);
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.350000f, 0.8f, -1.1f);

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
                            GlStateManager.rotate(40F, 0f, 1f, 0f);
                            GlStateManager.rotate(20F, 0f, 0f, 1f);
                            GlStateManager.rotate(7F, 1f, 0f, 0f);
                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                            GlStateManager.translate(-0.125000f, 0.975000f, -1.025000f);
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
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.475000f, 0.200000f);
                                },
                                (renderContext) -> {
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
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
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                })

                        .withFirstPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-115.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-20.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, -0.375000f, 0.250000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -0.6f, -0.1f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -0.8f, -0f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-107.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.35f, -0.7f, -0.25f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-107.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(25.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.35f, -0.8f, -0.23f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.350000f, -0.650000f, -0.175000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.475000f, 0.200000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.475000f, 0.200000f);
                                }, 250, 0))

                        .withFirstPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 1000),

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
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
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
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.475000f, 0.200000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.475000f, 0.200000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.475000f, 0.200000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.475000f, 0.200000f);
                                }, 50, 200),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(3f, 3f, 3f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.300000f, -0.475000f, 0.200000f);
                                }, 50, 200)
                        )

                        .withFirstPersonRightHandPositioningDrawing(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 150, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 130, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(4f, 4f, 5f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.375000f, -0.500000f, 0.150000f);
                                }, 280, 0)
                        )

                        .build())
                .withSpawnEntityDamage(70f)
                .withSpawnEntityGravityVelocity(0.3f)
                .withSpawnEntitySpeed(5f)
                .withSpawnEntityExplosionRadius(4f)
                .build(MWC.modContext);
    }
}
