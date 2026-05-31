package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;

public class SIGMCXFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("sig_MCx")
                //.withAmmoCapacity(30)
                .withFireRate(0.75f)
                .withRecoil(3f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.RIFLE)
                .hasFlashPedals()
                .withMaxShots(1, Integer.MAX_VALUE)
                .withShootSound("m38_dmr")
                .withSilencedShootSound("m4a1_silenced")
                .withReloadSound("m4a1_reload")
                .withUnloadSound("m4a1_unload")
                .withEndOfShootSound("gun_click")
                .withInspectSound("m4a1_inspection")
                .withDrawSound("m4_draw")
                .withReloadingTime(50)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.11f)
                .withFlashOffsetY(() -> 0.16f)
                .withShellCasingForwardOffset(0.05f)
                .withShellCasingVerticalOffset(-0.03f)
//		.withShellCasingEjectEnabled(false)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        // The weapon power
                        15.0,
                        // Muzzle climb divisor
                        15.75,
                        // "Stock Length"
                        50.0,
                        // Recovery rate from initial shot
                        0.4,
                        // Recovery rate @ "stock"
                        0.3125,
                        // Recoil rotation (Y)
                        0.0,
                        // Recoil rotation (Z)
                        0.0,
                        // Ads similarity divisor
                        1.0
                ))


                .withScreenShaking(RenderableState.SHOOTING,
                        1f, // x
                        1f, // y
                        3f) // z

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 9), new
                        CraftingEntry(MWCItems.gunmetalPlate, 11), new
                        CraftingEntry(MWCItems.steelIngot, 3))

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
                .withCompatibleAttachment(Attachments.SIGMCXStock, true, (model) -> {
//        	GlStateManager.translate(0f, -0.28f, -0f);
//            GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.HK416Receiver, true, (model) -> {
                    if (model instanceof M4Receiver) {
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKRail) {
                        GlStateManager.translate(-0.2F, -1.375F, -1.82f);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(Attachments.HK416FrontSight, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.SIGMCXHandguardShort) {
                            GlStateManager.translate(0F, 0F, 1F);
                            GlStateManager.scale(1F, 1F, 1F);
                        } else {
                            GlStateManager.translate(0F, 0F, 0F);
                            GlStateManager.scale(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof G95_upright_frontsights) {
                        GlStateManager.translate(-0.155F, -1.85F, -4.5F);
                        GlStateManager.scale(0.32F, 0.32F, 0.32F);
                    }
                }, true, false)
                .withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.SIGMCXHandguardShort) {
                            GlStateManager.translate(0F, 0F, 1F);
                            GlStateManager.scale(1F, 1F, 1F);
                        } else {
                            GlStateManager.translate(0F, 0F, 0F);
                            GlStateManager.scale(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof MBUSFrontSight) {
                        GlStateManager.translate(-0.16F, -1.8F, -5F);
                        GlStateManager.scale(0.37F, 0.37F, 0.37F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.SIGMCXHandguard, true, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(-0.22F, -1.6F, -5.5f);
                        GlStateManager.scale(0.7F, 0.7F, 0.85F);
                    } else if (model instanceof AKRail2) {
                        GlStateManager.translate(-0.42F, -1F, -4.3F);
                        GlStateManager.scale(0.7F, 0.7F, 0.7F);
                        GlStateManager.rotate(-90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail3) {
                        GlStateManager.translate(-0.025F, -0.72F, -4.5F);
                        GlStateManager.scale(0.7F, 0.7F, 0.85F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    }
                })
                .withCompatibleAttachment(Attachments.SIGMCXHandguardShort, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(-0.22F, -1.6F, -4.6f);
                        GlStateManager.scale(0.7F, 0.7F, 0.85F);
                    } else if (model instanceof AKRail2) {
                        GlStateManager.translate(-0.42F, -1F, -4.3F);
                        GlStateManager.scale(0.7F, 0.7F, 0.7F);
                        GlStateManager.rotate(-90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail3) {
                        GlStateManager.translate(-0.025F, -0.72F, -4.5F);
                        GlStateManager.scale(0.7F, 0.7F, 0.85F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    }
                })
                .withCompatibleAttachment(Attachments.HK416Grip, true, (model) -> {
                    GlStateManager.translate(0f, -0.025f, 0f);
                })
                .withCompatibleAttachment(Attachments.M4Grip, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
                    GlStateManager.translate(-0.333F, 0.45F, -1.4F);
                    GlStateManager.scale(1.02F, 1.35F, 1.33F);

//            GlStateManager.translate(0F, 0.35F, 0F);
                })
                .withCompatibleAttachment(Magazines.SOCOM_Mag, (model) -> {
                    GlStateManager.translate(-0.333F, 0.45F, -1.4F);
                    GlStateManager.scale(1.02F, 1.35F, 1.33F);
                })
                .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
                    GlStateManager.translate(-0.333F, 0.45F, -1.4F);
                    GlStateManager.scale(1.02F, 1.35F, 1.33F);
                })
                .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
                    GlStateManager.translate(0F, 0.05F, 0.24F);
                    GlStateManager.scale(1.02F, 1.33F, 1.33F);
                })
                .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
                    GlStateManager.translate(0F, 0.05F, 0.24F);
                    GlStateManager.scale(1.02F, 1.33F, 1.33F);
//            GlStateManager.scale(1.15F, 1.2F, 1.2F);
                })
                .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
                    GlStateManager.translate(-0.35F, 0.69F, -1.37F);
                    GlStateManager.scale(1.15F, 1.3F, 1.3F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.AR15Action, true, (model) -> {
                    GlStateManager.translate(-0.175F, -1.535F, -0.7F);
                    GlStateManager.scale(0.7F, 0.4F, 0.7F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.SIGMCXAction, true, (model) -> {
//          GlStateManager.translate(-0.175F, -1.28F, -0.67F);
//          GlStateManager.scale(0.7F, 0.4F, 0.7F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
                    if (model instanceof M4Iron1) {
                        GlStateManager.translate(0.162F, -1.75F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
//				GlStateManager.translate(-0.055F, -1.35F, -4.05F);
//				GlStateManager.scale(0.8F, 0.68F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GlStateManager.translate(0.26F, -1.55F, -2.35F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron1) {
                        GlStateManager.translate(0.125F, -1.8F, -0.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GlStateManager.translate(0.13F, -1.55F, -3.05F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GlStateManager.translate(0.092F, -1.91F, -0.9F);
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
//				GlStateManager.translate(-0.185F, -1.53F, -4.05F);
//				GlStateManager.scale(0.55F, 0.5F, 1F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M14Iron) {
                        GlStateManager.translate(0.129F, -1.63F, -2.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
                    if (model instanceof AKRail) {
                        GlStateManager.translate(0.13F, -1.5F, -3.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                        GlStateManager.rotate(90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail2) {
                        GlStateManager.translate(-0.37F, -1.005F, -3.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                        GlStateManager.rotate(-90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail3) {
                        GlStateManager.scale(0F, 0F, 0F);
                        GlStateManager.rotate(180F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail4) {
                        GlStateManager.translate(-0.22F, -1.6F, -4f);
                        GlStateManager.scale(0.7F, 0.7F, 0.85F);
                    } else if (model instanceof AKRail5) {
                        GlStateManager.translate(-0.22F, -1.6F, -1.9f);
                        GlStateManager.scale(0.7F, 0.7F, 0.8F);
                    }
                })
                .withCompatibleAttachment(Attachments.TritiumRearSights, (model) -> {
                    if (model instanceof TritiumRearSights) {
                        GlStateManager.translate(-0.16F, -1.8F, -0.5F);
                        GlStateManager.scale(0.35F, 0.35F, 0.35F);
                    }
                })
                .withCompatibleAttachment(Attachments.HK416RearSights, true, (model) -> {
                    if (model instanceof G95_upright_rearsights) {
                        GlStateManager.translate(-0.157F, -1.82F, -0.5F);
                        GlStateManager.scale(0.32F, 0.32F, 0.32F);
                    }
                })
                .withCompatibleAttachment(Attachments.MBUSRearSights, (model) -> {
                    if (model instanceof MBUSRearSight) {
                        GlStateManager.translate(-0.162F, -1.8F, -0.3F);
                        GlStateManager.scale(0.37F, 0.37F, 0.37F);
                    }
                })
                .withCompatibleAttachment(Attachments.AKMIron, (model) -> {
                    if (model instanceof M4Iron1) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GlStateManager.translate(0.255F, -1.55F, -2.25F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GlStateManager.translate(0.26F, -1.55F, -2.35F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron1) {
                        GlStateManager.translate(0.125F, -1.8F, -0.5F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GlStateManager.translate(0.13F, -1.55F, -3.05F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GlStateManager.translate(0.092F, -1.91F, -0.9F);
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
                        GlStateManager.translate(0.127F, -1.77F, -2.22F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M14Iron) {
                        GlStateManager.translate(0.129F, -1.63F, -2.08F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    } else if (model instanceof M27rearsight) {
                        GlStateManager.translate(-0.16F, -1.5F, -0.3F);
                        GlStateManager.scale(0.35F, 0.35F, 0.35F);
                    } else if (model instanceof MBUSiron) {
                        GlStateManager.translate(0.215F, -1.54F, 1.2F);
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })

                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GlStateManager.translate(-0.21F, -1.67F, -1.9F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                })

                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GlStateManager.translate(-0.28F, -1.7F, -0.5F);
                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
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
                    GlStateManager.translate(-0.192F, -1.38F, -1F);
                    GlStateManager.scale(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
                    GlStateManager.translate(-0.16F, -1.53F, -1.8F);
                    GlStateManager.scale(0.46F, 0.46F, 0.46F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.076F, -0.67F, 4.0251F);
                        GlStateManager.scale(0.04F, 0.04F, 0.04F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GlStateManager.translate(-0.15F, -2.2F, -1F);
                    GlStateManager.scale(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.08F, 0.97F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    } else if (model instanceof SightMount) {
//                	GlStateManager.translate(-0.15F, -1.82F, -1F);
//                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                    }
                })

                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GlStateManager.translate(-0.06F, -1.5F, -1.2F);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GlStateManager.translate(-0.055F, -1.46F, -1.1F);
                    GlStateManager.scale(0.54F, 0.54F, 0.54F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.68F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GlStateManager.translate(-0.0265F, -1.52F, -1.1F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GlStateManager.translate(-0.0265F, -1.52F, -1.1F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GlStateManager.translate(-0.0265F, -1.52F, -1.5F);
                    GlStateManager.scale(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof EotechScopeRing) {
                        GlStateManager.translate(-0.2F, -0.41F, 1.8F);
                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
                    }
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.118F, -0.535F, 1.9F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    }
                })

                .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
                    GlStateManager.translate(-0.32F, -1.73F, -1.3F);
                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(0.395F, -0.33F, -0.1F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GlStateManager.translate(-0.032F, -1.53F, -0.9F);
                    GlStateManager.scale(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GlStateManager.translate(-0.032F, -1.53F, -0.9F);
                    GlStateManager.scale(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GlStateManager.translate(-0.187F, -1.75F, -1F);
                    GlStateManager.scale(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })

                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GlStateManager.translate(-0.187F, -1.75F, -1F);
                    GlStateManager.scale(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM2, (player, stack) -> {
                    GlStateManager.translate(-0.12F, -1.1F, -0.5F);
                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.005F, -0.89F, -1.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GlStateManager.translate(-0.2F, -0.3F, -3F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.59F, -3.37F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.3F, -3F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.3F, -3F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GlStateManager.translate(-0.2F, -0.3F, -3F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GlStateManager.translate(-0.2F, -0.3F, -4F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
                    GlStateManager.translate(-0.26F, -1.43F, -3F);
                    GlStateManager.scale(0.9F, 0.9F, 0.9F);
                    GlStateManager.rotate(-90F, 0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
                    GlStateManager.translate(-0.2F, -1.235F, -6.5F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withTextureNames("sigMCx")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new SIGMCX())
                        .withADSBeizer(new Vec3d(0, 4, 0))
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
                            GlStateManager.scale(0.45F, 0.45F, 0.45F);
                            GlStateManager.translate(-2.2F, -1F, 2.3F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.265000f, 4.985000f, -2.645000f)
                                        .withRotation(0.000000f, 1.000000f, 7.115748f)
                                        .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                        .withScale(3, 3, 3)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.490000f, -0.095000f, -0.780000f)
                                        .withBBRotation(-0.6713F, -37.4683F, 37.504F)
                                        .withScale(2.6F, 2.6F, 4)
                                        .withPivotPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.2F, 0.1F, 2)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3.5F, 3.5F, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("MCx", AuxiliaryAttachments.ScarAction)
                        .setupModernMagazineAnimations("MCx",
                                Magazines.M4A1Mag,
                                Magazines.M38Mag,
                                Magazines.Stanag100,
                                Magazines.Stanag50,
                                Magazines.Stanag60,
                                Magazines.SOCOM_Mag)

                        .withThirdPersonPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 180, 200),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 240, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 260, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 240, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 170, 170),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 260, 10),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                    GlStateManager.translate(-2F, -0.8F, 2.3F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                }, 100, 50)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.14f, 1.36f, -0.3f);

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                                GlStateManager.translate(0F, -0f, 0f);
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                                GlStateManager.translate(0F, 0.015f, 0f);
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                GlStateManager.translate(0F, 0, 0f);
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                GlStateManager.translate(0F, 0.00f, 0.2f);
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                                GlStateManager.translate(0F, 0f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                GlStateManager.translate(-0.01F, 0.02f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                GlStateManager.translate(-0.003F, -0.025f, 0.4f);
                            }

                            // HP Zoomw
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                GlStateManager.translate(0.001F, -0, 0.2f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                GlStateManager.translate(0F, 0.02f, 0.1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                GlStateManager.translate(0F, -0.01f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                GlStateManager.translate(0F, 0.053f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                GlStateManager.translate(0F, 0.053f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                GlStateManager.translate(-0.004F, 0.05f, 0.25f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                GlStateManager.translate(0F, 0.06f, 0f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                GlStateManager.translate(0F, 0.04f, 0f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                GlStateManager.translate(0F, 0.04f, 0f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                GlStateManager.translate(0F, 0.07f, 0.3f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                GlStateManager.translate(0F, 0.07f, 0.3f);
                            }

                            // Everything else
                            else {
                            }

                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.985000f, 5.145000f, -5.245000f)
                                    .withRotation(0.000000f, -30.514396f, -26.062789f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.265000f, 4.745000f, -8.285000f)
                                    .withRotation(2.793742f, -46.352252f, -19.231070f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.330000f, 0.065000f, 0.140000f)
                                            .withRotation(78.544055f, 23.699100f, 18.430633f)
                                            .withScale(2.6F, 2.6F, 4)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.2F, 0.1F, 2)
                                            .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withPivotPoint(0, 0, 0)
                                            .applyTransformations();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.330000f, 0.065000f, 0.140000f)
                                            .withRotation(78.544055f, 23.699100f, 18.430633f)
                                            .withScale(2.600000f, 2.600000f, 4.000000f)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.600000f, 0.340000f, 1.880000f)
                                            .withRotation(-12.193518f, -4.780500f, 1.399459f)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                })

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

                        .build())
                .withSpawnEntityDamage(6f)
                .withSpawnEntityGravityVelocity(0.0118f)


                .build(MWC.modContext);
    }
}
