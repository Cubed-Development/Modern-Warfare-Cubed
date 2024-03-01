package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class AUGFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
                .withName("steyr_aug_a1")
                .withFireRate(0.75f)
                .withRecoil(3f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.ASSAULT_RIFLE)
                .withMaxShots(1, Integer.MAX_VALUE)
                .withMuzzlePosition(new Vec3d(-.15, -.8, -4.7))
                .withShootSound("aug")
                .withSilencedShootSound("m4a1_silenced")
                .withEndOfShootSound("gun_click")
                .withDrawSound("m4_draw")
                .withReloadingTime(50)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.12f)
                .withFlashOffsetY(() -> 0.16f)
                .withShellCasingForwardOffset(0.05f)
                .withShellCasingVerticalOffset(-0.03f)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        15.0,
                        15.75,
                        50.0,
                        0.4,
                        0.3125,
                        0.0,
                        0.0,
                        1.0
                ))

                .withScreenShaking(RenderableState.SHOOTING,
                        -1f,
                        -2f,
                        3f)
                
                .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withCompatibleAttachment(Attachments.AUGA1handguard, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.AUGDefaultKit, true, (model) -> {
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.AUGParaConversion, (model) -> {
                })
                .withCompatibleAttachment(Attachments.AUGA2handguard, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(-0.22F, -1.6F, -1.35F);
                        GL11.glScaled(0.7F, 0.7F, 0.8F);
                    }
                })
                .withCompatibleAttachment(Attachments.AUGA3handguard, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(-0.23F, -1.27F, -1.53F);
                        GL11.glScaled(0.8F, 0.8F, 0.95F);
                    }
                })
                .withCompatibleAttachment(Attachments.EF88Handguard, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(-0.23F, -1.27F, -2.25F);
                        GL11.glScaled(0.8F, 0.8F, 1.2F);
                    }
                })
                .withCompatibleAttachment(Attachments.AUGA3extGuard, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(-0.23F, -1.27F, -3.6F);
                        GL11.glScaled(0.8F, 0.8F, 0.95F);
                    } else if (model instanceof AKRail2) {
                        GL11.glTranslatef(0.15F, -0.935F, -3.85F);
                        GL11.glScaled(0.65F, 0.65F, 0.65F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail3) {
                        GL11.glTranslatef(-0.39F, -0.755F, -3.85F);
                        GL11.glScaled(0.65F, 0.65F, 0.65F);
                        GL11.glRotatef(-90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail4) {
                        GL11.glTranslatef(-0.01F, -0.48F, -3.65F);
                        GL11.glScaled(0.8F, 0.8F, 0.57F);
                        GL11.glRotatef(180F, 0f, 0f, 1f);
                    }
                })
                .withCompatibleAttachment(Magazines.AUG9mmMag, (model) -> {
                })
                .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
                    GL11.glTranslatef(-0.28F, 0.6F, 1.25F);
                    GL11.glScaled(0.8F, 1.3F, 1.4F);
                    GL11.glRotatef(-5F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
                    GL11.glTranslatef(-0.28F, 0.6F, 1.25F);
                    GL11.glScaled(0.8F, 1.3F, 1.4F);
                    GL11.glRotatef(-5F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
                    GL11.glTranslatef(0.01F, 0.5F, 2.6F);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                    GL11.glRotatef(-5F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
                    GL11.glTranslatef(0.01F, 0.5F, 2.6F);
                    GL11.glScaled(1.1F, 1.1F, 1.1F);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.9F, 1.2F);
                    GL11.glScaled(1.1F, 1.3F, 1.3F);
                    GL11.glRotatef(-5F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.AUGAction, true, (model) -> {
                    GL11.glTranslatef(-0.02F, 0.03F, 0.3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AKMIron, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, instance);
                        if (activeAttachment == Attachments.AUGA2handguard) {
                            GL11.glTranslatef(0F, 0F, 0F);
                            GL11.glScaled(1F, 1F, 1F);
                        } else {
                            GL11.glTranslatef(0.013F, 0.481F, 0F);
                            GL11.glScaled(1.1F, 1.1F, 1.1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof M4Iron1) {
                        GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GL11.glTranslatef(0.255F, -1.55F, -2.25F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKMiron1) {
                        GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GL11.glTranslatef(-0.175F, -1.75F, -1.15F);
                        GL11.glScaled(0.45F, 0.45F, 0.3F);
                    } else if (model instanceof AK47iron) {
                        GL11.glTranslatef(-0.225F, -2.02F, -1.15F);
                        GL11.glScaled(0.65F, 0.8F, 0.3F);
                    } else if (model instanceof G36CIron1) {
                        GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof G36CIron2) {
                        GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof ScarIron1) {
                        GL11.glTranslatef(0.165F, -1.65F, 1F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof ScarIron2) {
                        GL11.glTranslatef(0.25F, -1.55F, -2F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof FALIron) {
                        GL11.glTranslatef(-0.131F, -1.7F, -1.12F);
                        GL11.glScaled(0.08F, 0.45F, 0.1F);
                        GL11.glRotatef(180F, 1f, 0f, 0f);
                    } else if (model instanceof M14Iron) {
                        GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof M27rearsight) {
                        GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof MBUSiron) {
                        GL11.glTranslatef(-0.174F, -1.78F, 0.45F);
                        GL11.glScaled(0.45F, 0.4F, 0.4F);
                    }

                }, false, false)
                .withCompatibleAttachment(Attachments.AUGscope, true, () -> {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(-0.118F, -1.458F, 0.685F);
                        GL11.glScaled(0.02F, 0.02F, 0.02F);
                    } else if (model instanceof AUGScope) {
                        GL11.glTranslatef(0F, 0F, 0F);
                        GL11.glScaled(1F, 1F, 1F);
                    } else if (model instanceof AUGScope_scope) {
                        GL11.glTranslatef(-0.165F, -1.4F, -1.05F);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, instance);
                        if (activeAttachment == Attachments.AUGA2handguard) {
                            GL11.glTranslatef(-0.21F, -1.68F, -1.2F);
                            GL11.glScaled(0.75F, 0.75F, 0.75F);
                        } else {
                            GL11.glTranslatef(-0.21F, -1.37F, -1.2F);
                            GL11.glScaled(0.75F, 0.75F, 0.75F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.ACOG, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, instance);
                        if (activeAttachment == Attachments.AUGA2handguard) {
                            GL11.glTranslatef(-0.29F, -1.7F, 0.3F);
                            GL11.glScaled(0.7F, 0.7F, 0.7F);
                        } else {
                            GL11.glTranslatef(-0.307F, -1.38F, 0.5F);
                            GL11.glScaled(0.8F, 0.8F, 0.8F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.Specter, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, instance);
                        if (activeAttachment == Attachments.AUGA2handguard) {
                            GL11.glTranslatef(-0.185F, -1.4F, -0.3F);
                            GL11.glScaled(0.42F, 0.42F, 0.42F);
                        } else {
                            GL11.glTranslatef(-0.185F, -1.05F, -0.1F);
                            GL11.glScaled(0.42F, 0.42F, 0.42F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.Reflex, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, instance);
                        if (activeAttachment == Attachments.AUGA2handguard) {
                            GL11.glTranslatef(-0.07F, -1.5F, -0.5F);
                            GL11.glScaled(0.45F, 0.45F, 0.45F);
                        } else {
                            GL11.glTranslatef(-0.058F, -1.17F, -0.4F);
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.BijiaReflex, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, instance);
                        if (activeAttachment == Attachments.AUGA2handguard) {
                            GL11.glTranslatef(-0.066F, -1.47F, -0.3F);
                            GL11.glScaled(0.45F, 0.45F, 0.45F);
                        } else {
                            GL11.glTranslatef(-0.06F, -1.17F, -0.3F);
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.Holographic, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, instance);
                        if (activeAttachment == Attachments.AUGA2handguard) {
                            GL11.glTranslatef(-0.041F, -1.55F, -0.3F);
                            GL11.glScaled(0.65F, 0.65F, 0.65F);
                        } else {
                            GL11.glTranslatef(-0.041F, -1.22F, -0.2F);
                            GL11.glScaled(0.65F, 0.65F, 0.65F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.HolographicAlt, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, instance);
                        if (activeAttachment == Attachments.AUGA2handguard) {
                            GL11.glTranslatef(-0.041F, -1.55F, -0.3F);
                            GL11.glScaled(0.65F, 0.65F, 0.65F);
                        } else {
                            GL11.glTranslatef(-0.041F, -1.22F, -0.2F);
                            GL11.glScaled(0.65F, 0.65F, 0.65F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.EotechHybrid2, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, instance);
                        if (activeAttachment == Attachments.AUGA2handguard) {
                            GL11.glTranslatef(-0.041F, -1.55F, -0.7F);
                            GL11.glScaled(0.65F, 0.65F, 0.65F);
                        } else {
                            GL11.glTranslatef(-0.041F, -1.22F, -0.4F);
                            GL11.glScaled(0.65F, 0.65F, 0.65F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof EotechScopeRing) {
                        GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
                        GL11.glScaled(0.05F, 0.05F, 0.05F);
                    }
                }, false, false)

                .withCompatibleAttachment(Attachments.Kobra, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, instance);
                        if (activeAttachment == Attachments.AUGA2handguard) {
                            GL11.glTranslatef(-0.041F, -1.55F, -0F);
                            GL11.glScaled(0.65F, 0.65F, 0.65F);
                        } else {
                            GL11.glTranslatef(-0.041F, -1.22F, -0F);
                            GL11.glScaled(0.65F, 0.65F, 0.65F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.MicroT1, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, instance);
                        if (activeAttachment == Attachments.AUGA2handguard) {
                            GL11.glTranslatef(-0.18F, -1.72F, -0.2F);
                            GL11.glScaled(0.38F, 0.38F, 0.38F);
                        } else {
                            GL11.glTranslatef(-0.18F, -1.4F, -0F);
                            GL11.glScaled(0.38F, 0.38F, 0.38F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.AimpointCompM5, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, instance);
                        if (activeAttachment == Attachments.AUGA2handguard) {
                            GL11.glTranslatef(-0.18F, -1.72F, -0.2F);
                            GL11.glScaled(0.38F, 0.38F, 0.38F);
                        } else {
                            GL11.glTranslatef(-0.18F, -1.4F, -0F);
                            GL11.glScaled(0.38F, 0.38F, 0.38F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.RMR, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, instance);
                        if (activeAttachment == Attachments.AUGA2handguard) {
                            GL11.glTranslatef(-0.17F, -1.7F, 0F);
                            GL11.glScaled(0.32F, 0.32F, 0.32F);
                        } else {
                            GL11.glTranslatef(-0.17F, -1.4F, -0F);
                            GL11.glScaled(0.32F, 0.32F, 0.32F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.15F, -0.03F, -1.5F);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    }
                }, false, false)
                .withCompatibleAttachment(Attachments.AUGgrip, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.07F, -2.6F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.07F, -2.6F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, 0.05F, -3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.07F, -2.6F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Grip2Tan, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.07F, -2.6F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGripTan, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.07F, -2.6F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AngledGripTan, (model) -> {
                    GL11.glTranslatef(-0.2F, 0.05F, -3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.VGripTan, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.07F, -2.6F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.07F, -3.5F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Laser2, () -> {
                    GL11.glTranslatef(0.05F, -0.95F, -3.3F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })
                .withCompatibleAttachment(Attachments.Laser, () -> {
                    GL11.glTranslatef(0.05F, -0.95F, -3.3F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })
                .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
                    GL11.glTranslatef(-0.2F, -1F, -5.7F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withTextureNames("aug")
                .withRenderer(new WeaponRenderer.Builder()
                        .withModel(new AUG())
                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(0, 0f, 3f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(1, 2f, -1.2f);
                            GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.53F, 0.53F, 0.53F);
                            GL11.glTranslatef(-1.8F, -0.9F, 1.8F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.425000f, 3.325000f, -5.425000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                        .withScale(3.0F, 3.0F, 3.0F)
                        )

                        .withFirstPersonHandPositioning(


                                new Transform()
                                        .withPosition(1.250000f, 0.545000f, 0.260000f)
                                        .withBBRotation(-7.1415F, -27.3003F, 52.6433F)
                                        .withScale(2.8F, 2.8F, 4.0F)
                                        .withPivotPoint(0, 0, 0),


                                new Transform()
                                        .withPosition(-0.240000f, 0.180000f, 1.960000f)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3, 3, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("aug", AuxiliaryAttachments.AUGAction)
                        .setupModernMagazineAnimations("aug",
                                Magazines.M4A1Mag,
                                Magazines.M38Mag,
                                Magazines.Stanag100,
                                Magazines.Stanag50,
                                Magazines.Stanag60,
                                Magazines.SOCOM_Mag,
                                Magazines.AUG9mmMag)

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                    AttachmentCategory.FRONTSIGHT, renderContext.getWeaponInstance());
                            GL11.glTranslatef(0.175F, -0.277F, -0.3F);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                                if (activeAttachment == Attachments.AUGA2handguard)
                                    GL11.glTranslatef(0F, 0.47f, 0f);
                                else
                                    GL11.glTranslatef(0F, 0.17F, 0f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                if (activeAttachment == Attachments.AUGA2handguard)
                                    GL11.glTranslatef(0.003F, 0.55f, 0.45f);
                                else
                                    GL11.glTranslatef(0.003F, 0.247F, 0.45f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                if (activeAttachment == Attachments.AUGA2handguard)
                                    GL11.glTranslatef(0.005F, 0.57f, 0.4f);
                                else
                                    GL11.glTranslatef(0F, 0.27f, 0f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                if (activeAttachment == Attachments.AUGA2handguard)
                                    GL11.glTranslatef(0F, 0.52f, 0.65f);
                                else
                                    GL11.glTranslatef(0F, 0.18f, 0.5f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                if (activeAttachment == Attachments.AUGA2handguard)
                                    GL11.glTranslatef(0F, 0.56f, 0.0f);
                                else
                                    GL11.glTranslatef(0F, 0.25f, 0.0f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                if (activeAttachment == Attachments.AUGA2handguard)
                                    GL11.glTranslatef(0F, 0.56f, 0.0f);
                                else
                                    GL11.glTranslatef(0F, 0.25f, 0.0f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                if (activeAttachment == Attachments.AUGA2handguard)
                                    GL11.glTranslatef(0F, 0.52f, 0.0f);
                                else
                                    GL11.glTranslatef(0F, 0.22f, 0.0f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                if (activeAttachment == Attachments.AUGA2handguard)
                                    GL11.glTranslatef(0F, 0.48f, 0.0f);
                                else
                                    GL11.glTranslatef(0F, 0.22f, 0.0f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                if (activeAttachment == Attachments.AUGA2handguard)
                                    GL11.glTranslatef(0F, 0.55f, 0.0f);
                                else
                                    GL11.glTranslatef(0F, 0.23f, 0.0f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                if (activeAttachment == Attachments.AUGA2handguard)
                                    GL11.glTranslatef(0F, 0.55f, 0.0f);
                                else
                                    GL11.glTranslatef(0F, 0.23f, 0.0f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                if (activeAttachment == Attachments.AUGA2handguard)
                                    GL11.glTranslatef(0.005F, 0.57f, 0.4f);
                                else
                                    GL11.glTranslatef(0.005F, 0.25f, 0.2f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                if (activeAttachment == Attachments.AUGA2handguard)
                                    GL11.glTranslatef(0F, 0.56f, -0.1f);
                                else
                                    GL11.glTranslatef(0F, 0.24f, -0.1f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                if (activeAttachment == Attachments.AUGA2handguard)
                                    GL11.glTranslatef(0F, 0.45f, 0.0f);
                                else
                                    GL11.glTranslatef(0F, 0.15f, 0f);
                            } else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AUGscope)) {
                                GL11.glTranslatef(0F, 0.17f, 0.4f);
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
                                            .withScale(2.6F, 2.6F, 4.0F)
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
                                            .withRotation(-12.193518f, -4.7805F, 1.399459f)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                })


                        .build())
                .withSpawnEntityDamage(6f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}