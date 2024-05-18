package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.Transition;
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
        .withConfigGroup(GunConfigurationGroup.RIFLES)
        .withMaxShots(1, Integer.MAX_VALUE)
        .withShootSound("aug")
        .withSilencedShootSound("m4a1_silenced")
        .withReloadSound("m4a1_reload")
        .withUnloadSound("m4_unload")
        .withEndOfShootSound("gun_click")
        .withInspectSound("m4a1_inspection")
        .withDrawSound("m4_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.16f)
        .withShellCasingForwardOffset(0.05f)
        .withShellCasingVerticalOffset(-0.03f)
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
        -1f, // x
        -2f, // y
        3f) // z
         
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withCompatibleAttachment(Attachments.AUGA1handguard, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AUGDefaultKit, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AUGParaConversion, (model) -> {
            GL11.glTranslatef(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.AUGA2handguard, (model) -> {
            if(model instanceof AKRail) {
              GL11.glTranslatef(-0.22F, -1.6F, -1.35F);
              GL11.glScaled(0.7F, 0.7F, 0.8F);
          }
        })
        .withCompatibleAttachment(Attachments.AUGA3handguard, (model) -> {
            if(model instanceof AKRail) {
              GL11.glTranslatef(-0.23F, -1.27F, -1.53F);
              GL11.glScaled(0.8F, 0.8F, 0.95F);
//              GL11.glRotatef(90F, 0f, 0f, 1f);
          }
        })
        .withCompatibleAttachment(Attachments.EF88Handguard, (model) -> {
            if(model instanceof AKRail) {
              GL11.glTranslatef(-0.23F, -1.27F, -2.25F);
              GL11.glScaled(0.8F, 0.8F, 1.2F);
//              GL11.glRotatef(90F, 0f, 0f, 1f);
          }
        })
        .withCompatibleAttachment(Attachments.AUGA3extGuard, (model) -> {
             if(model instanceof AKRail) {
                 GL11.glTranslatef(-0.23F, -1.27F, -3.6F);
                 GL11.glScaled(0.8F, 0.8F, 0.95F);
          } else if(model instanceof AKRail2) {
              GL11.glTranslatef(0.15F, -0.935F, -3.85F);
              GL11.glScaled(0.65F, 0.65F, 0.65F);
              GL11.glRotatef(90F, 0f, 0f, 1f);
          } else if(model instanceof AKRail3) {
              GL11.glTranslatef(-0.39F, -0.755F, -3.85F);
              GL11.glScaled(0.65F, 0.65F, 0.65F);
              GL11.glRotatef(-90F, 0f, 0f, 1f);
          } else if(model instanceof AKRail4) {
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
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
         .withCompatibleAttachment(Attachments.AKMIron, renderContext -> {
             PlayerWeaponInstance instance = renderContext.getWeaponInstance();
             if(instance != null) {
                 ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                         AttachmentCategory.GUARD, instance);
                 if(activeAttachment == Attachments.AUGA2handguard) {
                     GL11.glTranslatef(0F, 0F, 0F);
                     GL11.glScaled(1F, 1F, 1F);
                 } else {
                     GL11.glTranslatef(0.013F, 0.481F, 0F);
                     GL11.glScaled(1.1F, 1.1F, 1.1F);
                 }
             }
         },(model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.255F, -1.55F, -2.25F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.175F, -1.75F, -1.15F);
                GL11.glScaled(0.45F, 0.45F, 0.3F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.225F, -2.02F, -1.15F);
                GL11.glScaled(0.65F, 0.8F, 0.3F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.131F, -1.7F, -1.12F);
                GL11.glScaled(0.08F, 0.45F, 0.1F);
                GL11.glRotatef(180F, 1f, 0f, 0f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof M27rearsight) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof MBUSiron) {
                GL11.glTranslatef(-0.174F, -1.78F, 0.45F);
                GL11.glScaled(0.45F, 0.4F, 0.4F);
            }
            
        }, false, false)
         .withCompatibleAttachment(Attachments.AUGscope, true, (player, stack) -> {
             GL11.glTranslatef(0F, 0F, 0F);
             GL11.glScaled(1F, 1F, 1F);
         },(model) -> {
             if(model instanceof JPUreticle) {
                 GL11.glTranslatef(-0.118F, -1.458F, 0.685F);
                 GL11.glScaled(0.02F, 0.02F, 0.02F);
             }
             else if(model instanceof AUGScope) {
                 GL11.glTranslatef(0F, 0F, 0F);
                 GL11.glScaled(1F, 1F, 1F);
             }
             else if(model instanceof AUGScope_scope) {
                 GL11.glTranslatef(-0.165F, -1.4F, -1.05F);
                 GL11.glScaled(0.6F, 0.6F, 0.6F);
             }
         })
        .withCompatibleAttachment(Attachments.NightRaider, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef(-0.21F, -1.68F, -1.2F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                } else {
                    GL11.glTranslatef(-0.21F, -1.37F, -1.2F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }
            }
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.ACOG, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.AUGA2handguard) {
                        GL11.glTranslatef(-0.29F, -1.7F, 0.3F);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                } else {
                    GL11.glTranslatef(-0.307F, -1.38F, 0.5F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }
            }
        },(model) -> {
            if(model instanceof AcogScope2) {
                GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            else if(model instanceof AcogReticle) {
                GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.Specter, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef(-0.185F, -1.4F, -0.3F);
                    GL11.glScaled(0.42F, 0.42F, 0.42F);
                } else {
                    GL11.glTranslatef(-0.185F, -1.05F, -0.1F);
                    GL11.glScaled(0.42F, 0.42F, 0.42F);
                }
            }
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.Reflex, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef(-0.07F, -1.5F, -0.5F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                } else {
                    GL11.glTranslatef(-0.058F, -1.17F, -0.4F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }
            }
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.BijiaReflex, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef(-0.066F, -1.47F, -0.3F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                } else {
                    GL11.glTranslatef(-0.06F, -1.17F, -0.3F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }
            }
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        }, false, false)
        .withCompatibleAttachment(Attachments.Holographic, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef(-0.041F, -1.55F, -0.3F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                } else {
                    GL11.glTranslatef(-0.041F, -1.22F, -0.2F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }
            }
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            }, false, false)
        .withCompatibleAttachment(Attachments.HolographicAlt, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef(-0.041F, -1.55F, -0.3F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                } else {
                    GL11.glTranslatef(-0.041F, -1.22F, -0.2F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }
            }
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.EotechHybrid2, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef(-0.041F, -1.55F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                } else {
                    GL11.glTranslatef(-0.041F, -1.22F, -0.4F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }
            }
        },(model) -> {
            if(model instanceof EotechScopeRing) {
                GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        }, false, false)

        .withCompatibleAttachment(Attachments.Kobra, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef(-0.041F, -1.55F, -0F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                } else {
                    GL11.glTranslatef(-0.041F, -1.22F, -0F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }
            }
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.MicroT1, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef(-0.18F, -1.72F, -0.2F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
                } else {
                    GL11.glTranslatef(-0.18F, -1.4F, -0F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
                }
            }
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            }, false, false)
        .withCompatibleAttachment(Attachments.AimpointCompM5, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef(-0.18F, -1.72F, -0.2F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
                } else {
                    GL11.glTranslatef(-0.18F, -1.4F, -0F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
                }
            }
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.RMR, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.AUGA2handguard) {
                    GL11.glTranslatef(-0.17F, -1.7F, 0F);
                    GL11.glScaled(0.32F, 0.32F, 0.32F);
                } else {
                    GL11.glTranslatef(-0.17F, -1.4F, -0F);
                    GL11.glScaled(0.32F, 0.32F, 0.32F);
                }
            }
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.15F, -0.03F, -1.5F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.AUGgrip, true, (model) -> {
            GL11.glTranslatef(0F, 0F, 0F);
            GL11.glScaled(1F, 1F, 1F);
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
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
            GL11.glTranslatef(-0.2F, -0.07F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(0.05F, -0.95F, -3.3F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.05F, -0.95F, -3.3F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
            GL11.glTranslatef(-0.2F, -1F, -5.7F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("aug")
        .withRenderer(new WeaponRenderer.Builder()
        .withActionPiece(AuxiliaryAttachments.AUGAction)
        .withActionTransform(new Transform().withPosition(0, 0, 0.7))

            .withModel(new AUG())
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(0, 0f, 3f);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
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
                    .withPosition(-1.425000f, 3.325000f, -4.725000f)
                    .withRotation(0.000000f, 1.000000f, 6.300000f)
                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.250000f, 0.545000f, 0.260000f)
                        .withBBRotation(-7.1415, -27.3003, 52.6433)
                        .withScale(2.8, 2.8, 4.0)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.240000f, 0.180000f, 1.960000f)
                        .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3, 3, 3.5)
                        .withRotationPoint(0, 0, 0)
                
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
                .withFirstPersonCustomPositioning(AuxiliaryAttachments.AUGAction.getRenderablePart(), (renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 0.0f);
                })						
                    
            .withThirdPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 60),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 120, 190),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                }, 300, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 3.6F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(95F, 1f, 0f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                }, 120, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                }, 120, 0)
//                }, 100, 0)
            )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glTranslatef(0.18f, -0.277f, -0.3f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                    GL11.glTranslatef(0F, 0.22f, -0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AUGA2handguard) {
                        GL11.glTranslatef(0F, 0.55f, 0.5f);
                    } else {
                    GL11.glTranslatef(0F, 0.23f, 0.5f);
                    }
                }
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AUGA2handguard) {
                        GL11.glTranslatef(0F, 0.57f, 0.5f);
                    } else {
                    GL11.glTranslatef(-0.01F, 0.27f, -0.3f);
                    }
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AUGA2handguard) {
                        GL11.glTranslatef(0F, 0.52f, 0.5f);
                    } else {
                    GL11.glTranslatef(0F, 0.18f, 0.5f);
                    }
                } 

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AUGA2handguard) {
                        GL11.glTranslatef(0F, 0.56f, 0.0f);
                    } else {
                    GL11.glTranslatef(0F, 0.25f, 0.0f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AUGA2handguard) {
                        GL11.glTranslatef(0F, 0.56f, 0.0f);
                    } else {
                	 GL11.glTranslatef(0F, 0.25f, 0.0f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AUGA2handguard) {
                        GL11.glTranslatef(0F, 0.52f, 0.0f);
                    } else {
                    GL11.glTranslatef(0F, 0.22f, 0.0f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AUGA2handguard) {
                        GL11.glTranslatef(0F, 0.496f, 0.0f);
                    } else {
                    GL11.glTranslatef(0F, 0.22f, 0.0f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AUGA2handguard) {
                        GL11.glTranslatef(0F, 0.56f, 0.0f);
                    } else {
                    GL11.glTranslatef(0F, 0.26f, 0.0f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AUGA2handguard) {
                        GL11.glTranslatef(0F, 0.56f, 0.0f);
                    } else {
                        GL11.glTranslatef(0F, 0.26f, 0.0f);
                    }
                }

                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AUGA2handguard) {
                        GL11.glTranslatef(0F, 0.57f, 0.4f);
                    } else {
                	 GL11.glTranslatef(0F, 0.25f, 0.0f);
                    }
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AUGA2handguard) {
                        GL11.glTranslatef(0F, 0.56f, -0.1f);
                    } else {
                    GL11.glTranslatef(0F, 0.24f, -0.1f);
                    }
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AK15ironsight)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.008f, 0f);
                }

                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AUGA2handguard) {
                        GL11.glTranslatef(0F, 0.47f, 0.0f);
                    } else {
                    GL11.glTranslatef(0F, 0.165f, 0f);
                    }
                }

                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AUGscope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.17f, 0.4f);
                }

                // Everything else
                else {
                }
                
            
                })
             
            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-1.905000f, 4.065000f, -3.645000f)
				 .withRotation(0.000000f, -30.514396f, -26.062789f)
				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-1.425000f, 3.545000f, -5.685000f)
				 .withRotation(-0.187566f, -46.164037f, -11.869230f)
				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
            })
					 
			.withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                   	 new Transform()
                   	 .withPosition(1.730000f, 0.065000f, -0.980000f)
                   	 .withRotation(93.414678f, 23.699100f, 15.553163f)
                        .withScale(2.6, 2.6, 4.0)
                        .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                        .doGLDirect();
                    }, 
                    (renderContext) -> {
                   	 new Transform()
                        .withPosition(-0.2, 0.1, 2)
                        .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3.5, 3.5, 3.5)
                        .withRotationPoint(0, 0, 0)
                        .doGLDirect();
                    })
                    
           .withFirstPersonHandPositioningModifyingAlt(
           		(renderContext) -> {
                  	 new Transform()
                  	 	.withPosition(2.450000f, -0.335000f, -0.660000f)
                  	 	.withRotation(93.766422f, 50.841130f, 4.679372f)
                  	 	.withScale(2.600000f, 2.600000f, 4.000000f)
                       .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                       .doGLDirect();
                   }, 
                   (renderContext) -> {
                  	 new Transform()
                  	 	.withPosition(-0.600000f, 0.340000f, 1.880000f)
                  	 	.withRotation(-12.193518f, -4.780500f, 1.399459f)
                       .withScale(3.5, 3.5, 3.5)
                       .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                       .doGLDirect();
                   })
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 280, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-49.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.025000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                    }, 300, 0))

            .build())
        .withSpawnEntityDamage(6f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}