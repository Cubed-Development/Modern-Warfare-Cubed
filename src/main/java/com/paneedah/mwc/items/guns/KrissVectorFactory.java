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
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;

public class KrissVectorFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("kriss_vector")
                .withFireRate(0.999f)
                .withRecoil(2.5f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.SUBMACHINE_GUN)
                .withShellType(Type.PISTOL)
                .withMaxShots(1, Integer.MAX_VALUE)
                .withMuzzlePosition(new Vec3d(-0.09600000286102293, -0.13599997425079366, -4.6919999461174))
                //.withMaxShots(5)
                .withShootSound("vector")
                .withSilencedShootSound("mp5_silenced")
                .withReloadSound("vector_reload")
                .withUnloadSound("vector_unload")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(45)
                .withFlashIntensity(0.6f)
                .withFlashScale(() -> 0.5f)
                .withFlashOffsetX(() -> 0.12f)
                .withFlashOffsetY(() -> 0.22f)
                .withInaccuracy(2f)
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

                .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)


                .withScreenShaking(RenderableState.SHOOTING,
                        2f, // x
                        0.1f, // y
                        3f) // z

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 5), new
                        CraftingEntry(MWCItems.gunmetalPlate, 8), new
                        CraftingEntry(MWCItems.steelIngot, 3))

                .withCompatibleAttachment(Attachments.RailRiser, (model) -> {
                    if (model instanceof KrissVectorRailRiser) {
                        GlStateManager.translate(0f, 0f, 0f);
                        GlStateManager.scale(1F, 1F, 1F);
                    } else if (model instanceof AKRail) {
                        GlStateManager.translate(-0.245F, -1.48F, -4.19f);
                        GlStateManager.scale(0.9F, 0.9F, 1.38F);
                    }
                })
                .withCompatibleAttachment(Attachments.KrissVectorReceiver, true, (model) -> {
//            GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.Vector556Handguard, (model) -> {
//          GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.VectorMk1ModularHandguard, (model) -> {
//          GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.VectorCarbineHandguard, (model) -> {
//          GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.VectorTapedGrip, (model) -> {
//          GlStateManager.translate(0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.VectorStock, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.VectorStockAdapter, (model) -> {
                    if (model instanceof MilSpecStock) {
                        GlStateManager.translate(0.185f, 0.2f, 0.3f);
                        GlStateManager.scale(1.2F, 1.2F, 1.2F);
                    }
                })
                .withCompatibleAttachment(Magazines.VectorMag, (model) -> {
                })
                .withCompatibleAttachment(Magazines.VectorDrumMag, (model) -> {
                })
                .withCompatibleAttachment(Magazines.FamasF1Mag, (model) -> {
                    GlStateManager.rotate(20F, 1f, 0f, 0f);
                    GlStateManager.scale(1.3F, 1.3F, 1.3F);
                    GlStateManager.translate(0.03f, 0.2f, -2.8f);
                })
//        .withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
//          GlStateManager.translate(-0.2F, -1.06F, -7.55F);
//          GlStateManager.scale(1F, 1F, 1F);
//        })
                .withCompatibleAttachment(Attachments.TritiumRearSights, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(0.058F, 0.47F, -0.7F);
                            GlStateManager.scale(1.5F, 1.5F, 1.5F);
                        } else {
                            GlStateManager.translate(0.058F, 0.87F, 0.2F);
                            GlStateManager.scale(1.5F, 1.5F, 1.5F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof TritiumRearSights) {
                        GlStateManager.translate(-0.16F, -1.5F, -0.3F);
                        GlStateManager.scale(0.35F, 0.35F, 0.35F);
                    }
                }, true, false)

                .withCompatibleAttachment(Attachments.MBUSRearSights, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(0.048F, 0.31F, -0.6F);
                            GlStateManager.scale(1.4F, 1.4F, 1.4F);
                        } else {
                            GlStateManager.translate(0.048F, 0.71F, 0.3F);
                            GlStateManager.scale(1.4F, 1.4F, 1.4F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof MBUSRearSight) {
                        GlStateManager.translate(-0.16F, -1.5F, -0.3F);
                        GlStateManager.scale(0.35F, 0.35F, 0.35F);
                    }
                }, false, false)

                .withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(0.05F, 0.31F, 1.2F);
                            GlStateManager.scale(1.4F, 1.4F, 1.4F);
                        } else {
                            GlStateManager.translate(0.05F, 0.71F, 1.2F);
                            GlStateManager.scale(1.4F, 1.4F, 1.4F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof MBUSFrontSight) {
                        GlStateManager.translate(-0.16F, -1.5F, -3.3F);
                        GlStateManager.scale(0.35F, 0.35F, 0.35F);
                    }
                }, true, false)

                .withCompatibleAttachment(Attachments.NightRaider, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.238F, -1.6F, -3F);
                            GlStateManager.scale(1F, 1F, 1F);
                        } else {
                            GlStateManager.translate(-0.238F, -1.24F, -2.7F);
                            GlStateManager.scale(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GlStateManager.translate(0.12F, -0.2F, 2.49F);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.ACOG, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.358F, -1.65F, -1.5F);
                            GlStateManager.scale(1F, 1F, 1F);
                        } else {
                            GlStateManager.translate(-0.358F, -1.28F, -0.5F);
                            GlStateManager.scale(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GlStateManager.translate(-0.018F, -0.25F, 0.13F);
                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GlStateManager.translate(0.243F, -0.23F, 0.68f);
                        GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.Specter, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.22F, -1.2F, -2.2F);
                            GlStateManager.scale(0.62F, 0.62F, 0.62F);
                        } else {
                            GlStateManager.translate(-0.22F, -0.83F, -1.5F);
                            GlStateManager.scale(0.62F, 0.62F, 0.62F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GlStateManager.translate(0.15F, -1.035F, 1.513F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.MicroReflex, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.16F, -2.35F, -1.8F);
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
                        } else {
                            GlStateManager.translate(-0.16F, -2F, -1F);
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.08F, 0.97F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    } else if (model instanceof SightMount) {
                        //        	GlStateManager.translate(-0.15F, -1.82F, -1F);
                        //            GlStateManager.scale(0.4F, 0.4F, 0.4F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.Reflex, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.045F, -1.35F, -2F);
                            GlStateManager.scale(0.6F, 0.6F, 0.6F);
                        } else {
                            GlStateManager.translate(-0.045F, -1F, -2F);
                            GlStateManager.scale(0.6F, 0.6F, 0.6F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.7F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.BijiaReflex, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.035F, -1.3F, -2F);
                            GlStateManager.scale(0.7F, 0.7F, 0.7F);
                        } else {
                            GlStateManager.translate(-0.035F, -0.95F, -2F);
                            GlStateManager.scale(0.7F, 0.7F, 0.7F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.68F, -0.4F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.Holographic, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.005F, -1.4F, -2F);
                            GlStateManager.scale(0.95F, 0.95F, 0.95F);
                        } else {
                            GlStateManager.translate(-0.005F, -1.05F, -1.5F);
                            GlStateManager.scale(0.95F, 0.95F, 0.95F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.HolographicAlt, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.005F, -1.4F, -2F);
                            GlStateManager.scale(0.95F, 0.95F, 0.95F);
                        } else {
                            GlStateManager.translate(-0.005F, -1.05F, -1.5F);
                            GlStateManager.scale(0.95F, 0.95F, 0.95F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.125F, -0.5F, -0.1F);
                        GlStateManager.scale(0.1F, 0.1F, 0.1F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.EotechHybrid2, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.005F, -1.4F, -2.5F);
                            GlStateManager.scale(0.95F, 0.95F, 0.95F);
                        } else {
                            GlStateManager.translate(-0.005F, -1.05F, -1.5F);
                            GlStateManager.scale(0.95F, 0.95F, 0.95F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof EotechScopeRing) {
                        GlStateManager.translate(-0.2F, -0.41F, 1.8F);
                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
                    }
                    if (model instanceof Holo2) {
                        GlStateManager.translate(-0.118F, -0.535F, 1.9F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.VortexRedux, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.355F, -1.66F, -2F);
                            GlStateManager.scale(0.6F, 0.6F, 0.6F);
                        } else {
                            GlStateManager.translate(-0.355F, -1.28F, -1.5F);
                            GlStateManager.scale(0.6F, 0.6F, 0.6F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GlStateManager.translate(0.395F, -0.33F, -0.1F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.Kobra, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.025F, -1.45F, -2F);
                            GlStateManager.scale(0.8F, 0.8F, 0.8F);
                        } else {
                            GlStateManager.translate(-0.025F, -1.05F, -1F);
                            GlStateManager.scale(0.8F, 0.8F, 0.8F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(-0.125F, -0.45F, -0.85F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.MicroT1, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.2F, -1.65F, -2F);
                            GlStateManager.scale(0.55F, 0.55F, 0.55F);
                        } else {
                            GlStateManager.translate(-0.2F, -1.3F, -1.5F);
                            GlStateManager.scale(0.55F, 0.55F, 0.55F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.AimpointCompM5, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.2F, -1.65F, -2F);
                            GlStateManager.scale(0.55F, 0.55F, 0.55F);
                        } else {
                            GlStateManager.translate(-0.2F, -1.3F, -1.5F);
                            GlStateManager.scale(0.55F, 0.55F, 0.55F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.155F, -0.4F, -0.5F);
                        GlStateManager.scale(0.15F, 0.15F, 0.15F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.RMR, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, instance);
                        if (activeAttachment == Attachments.RailRiser) {
                            GlStateManager.translate(-0.19F, -1.6F, -2F);
                            GlStateManager.scale(0.42F, 0.42F, 0.42F);
                        } else {
                            GlStateManager.translate(-0.19F, -1.25F, -2F);
                            GlStateManager.scale(0.42F, 0.42F, 0.42F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GlStateManager.translate(0.15F, -0.03F, -1.5F);
                        GlStateManager.scale(0.3F, 0.3F, 0.3F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.Bipod, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.Vector556Handguard) {
                            GlStateManager.translate(-0.23F, 0.8F, -6F);
                            GlStateManager.scale(1.4F, 1.4F, 1.4F);
                        } else {
                            GlStateManager.translate(-0.23F, 0.8F, -3.5F);
                            GlStateManager.scale(1.4F, 1.4F, 1.4F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Bipod) {
//                GlStateManager.translate(0.12F, -0.2F, 2.49F);
//                GlStateManager.scale(0.03F, 0.03F, 0.03F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GlStateManager.translate(-0.23F, 0.8F, -3.5F);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GlStateManager.translate(-0.23F, 0.8F, -3.5F);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                })
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GlStateManager.translate(-0.23F, 1F, -4F);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GlStateManager.translate(-0.23F, 0.8F, -3.5F);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                })
                .withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
                    GlStateManager.translate(-0.24F, -0.6F, -6.5F);
                    GlStateManager.scale(1.5F, 1.5F, 1.5F);
                })
                .withTextureNames("krissvector")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new KrissVector())
                        .withADSBeizer(new Vec3d(0.2, 1.7, 0.5))
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
                            GlStateManager.scale(0.4F, 0.4F, 0.4F);
                            GlStateManager.translate(-2.2F, -1.1F, 2.3F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.705000f, 3.985000f, -4.845000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.190000f, -1.220000f, -0.060000f)
                                        .withScale(3, 3, 3)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.290000f, 1.065000f, -0.340000f)
                                        .withBBRotation(-8.6414F, -29.6346F, 58.706F)
                                        .withScale(2.6F, 2.6F, 4)
                                        .withPivotPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.2F, 0.1F, 2)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3.5F, 3.5F, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("vector", AuxiliaryAttachments.AKaction)
                        .setupModernMagazineAnimations("vector",
                                Magazines.VectorMag,
                                Magazines.VectorDrumMag,
                                Magazines.FamasF1Mag)

                        .withFirstPersonCustomPositioning(Magazines.VectorMag, (renderContext) -> {
                        })

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
                                    GlStateManager.translate(-2.2F, -2.7F, 3.6F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                    GlStateManager.rotate(12F, 0f, 0f, 1f);
                                }, 300, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2F, 3.6F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(95F, 1f, 0f, 0f);
                                    GlStateManager.rotate(12F, 0f, 0f, 1f);
                                }, 120, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-2.2F, -2.7F, 3.6F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(90F, 1f, 0f, 0f);
                                    GlStateManager.rotate(12F, 0f, 0f, 1f);
                                }, 120, 0)
//                }, 100, 0)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
//                GlStateManager.rotate(45F, 0f, 1f, 0f);
//                GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                            GlStateManager.translate(0.18f, -0.15f, 0.6f);


                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.44f, 0.2f);
                                } else {
                                    GlStateManager.translate(0F, 0.045f, -0.4f);
                                }
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.44f, 0.2f);
                                } else {
                                    GlStateManager.translate(0F, 0.045f, -0.6f);
                                }
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.42f, 0.3f);
                                } else {
                                    GlStateManager.translate(0F, 0.06f, 0f);
                                }
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.48f, 0.7f);
                                } else {
                                    GlStateManager.translate(0F, 0.12f, -0.2f);
                                }
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.41f, 1f);
                                } else {
                                    GlStateManager.translate(0F, 0.045f, 0.2f);
                                }
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.45f, 0.5f);
                                } else {
                                    GlStateManager.translate(0F, 0.1f, -0.2f);
                                }
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.36f, 0.5f);
                                } else {
                                    GlStateManager.translate(0F, 0f, 0.2f);
                                }
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.375f, 0.3f);
                                } else {
                                    GlStateManager.translate(0F, 0.03f, 0.2f);
                                }
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.47f, 0.3f);
                                } else {
                                    GlStateManager.translate(0F, 0.12f, 0f);
                                }
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.47f, 0.3f);
                                } else {
                                    GlStateManager.translate(0F, 0.12f, 0f);
                                }
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.47f, 0.4f);
                                } else {
                                    GlStateManager.translate(0F, 0.12f, -0.5f);
                                }
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.46f, 0.4f);
                                } else {
                                    GlStateManager.translate(0F, 0.082f, 0f);
                                }
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.42f, 0.8f);
                                } else {
                                    GlStateManager.translate(0F, 0.025f, -0.2f);
                                }
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.45f, 0.8f);
                                } else {
                                    GlStateManager.translate(0F, 0.1f, 0.2f);
                                }
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.45f, 0.8f);
                                } else {
                                    GlStateManager.translate(0F, 0.1f, 0.2f);
                                }
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Acog");
                                RenderContext<?> rc = renderContext;
                                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                                if (activeAttachment == Attachments.RailRiser) {
                                    GlStateManager.translate(0F, 0.23f, 0.8f);
                                } else {
                                    GlStateManager.translate(0F, -0.12f, 0.5f);
                                }
                            }

                            // Everything else
                            else {
                            }


                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.905000f, 4.065000f, -3.645000f)
                                    .withRotation(0.000000f, -30.514396f, -26.062789f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.425000f, 3.545000f, -5.685000f)
                                    .withRotation(-0.187566f, -46.164037f, -11.869230f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(1.730000f, 0.065000f, -0.980000f)
                                            .withRotation(93.414678f, 23.699100f, 15.553163f)
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
                                            .withPosition(2.450000f, -0.335000f, -0.660000f)
                                            .withRotation(93.766422f, 50.841130f, 4.679372f)
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
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
                                }, 250, 100),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
                                }, 280, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.100000f, -0.025000f, 0.000000f);
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
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, 0.050000f, 0.000000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.075000f, -0.075000f, 0.025000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.050000f, 0.050000f, 0.000000f);
                                }, 300, 0))

                        .build())
                .withSpawnEntityDamage(5.3f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}

