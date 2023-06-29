package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class StonerA1Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("stonera1")
        .withFireRate(0.8f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.HEAVY)
        .withMaxShots(Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("m249")
        .withSilencedShootSound("ak15_silenced")
        .withReloadSound("mg42_reload")
        .withUnloadSound("mg42_unload")
        .withInspectSound("inspection")
        .withDrawSound("mg42_draw")
//        .withDrawSound("mg42_reload")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.11f)
        .withFlashOffsetY(() -> 0.15f)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Light Machine Gun",
        "Damage: 6", 
        "Cartridge: 5.56x45mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 75/100",
        "Magazines:",
        "100rnd 5.56x45mm Stoner Magazine"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 2.5f, // x 
                 1f, // y
                 3f) // z
         
         .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
         .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
         .withCompatibleAttachment(Attachments.M249Stock, true, (model) -> {
             GL11.glTranslatef(0f, 0f, -0.3f);
         })
         .withCompatibleAttachment(Attachments.M38FrontSight, true, (model) -> {
             if(model instanceof AKMiron2) {
                 GL11.glTranslatef(-0.015F, -1.03F, -0.33F);
                 GL11.glScaled(0.55F, 0.55F, 1F);
           } else if(model instanceof FALIron) {
               GL11.glTranslatef(0.065F, -0.85F, -0.3F);
               GL11.glScaled(0.1F, 1F, 0.3F);
               GL11.glRotatef(180F, 0f, 0f, 1f);
           } else if(model instanceof AK47iron) {
               GL11.glTranslatef(-0.1F, -1.51F, -0.3F);
               GL11.glScaled(0.85F, 1.3F, 0.25F);
           }
         })
         .withCompatibleAttachment(Attachments.StonerHANDGUARD, true, (model) -> {
             if(model instanceof StonerHANDGUARD) {
                 GL11.glTranslatef(0F, 0F, 0F);
                 GL11.glScaled(1F, 1F, 1F);
             } else if(model instanceof AKRail) {
                 GL11.glTranslatef(-0.085F, -0.75F, -0.5F);
                 GL11.glScaled(0.9F, 0.9F, 1.15F);
             } else if(model instanceof AKRail2) {
                 GL11.glTranslatef(0.12F, 0.3F, 0.1F);
                 GL11.glScaled(0.6F, 0.6F, 0.7F);
                 GL11.glRotatef(180F, 0f, 0f, 1f);
             }
       })
         .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
             GL11.glTranslatef(0.01f, -0.19f, -0.4f);
             GL11.glScaled(0F, 0F, 0F);
         })
        .withCompatibleAttachment(AuxiliaryAttachments.M249Action, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.StonerHATCH, true, (model) -> {
            if(model instanceof StonerA1HATCH) {
//            	GL11.glTranslatef(-0F, 2.45F, 3.8F);
//                GL11.glRotatef(90F, 1f, 0f, 0f);
            } else if(model instanceof M27rearsight) {
                GL11.glTranslatef(0f, -1.05f, 5.8f);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.StonerBELT, true, (model) -> {
//            GL11.glTranslatef(0.3F, 0.1F, 0F);
//          GL11.glRotatef(-15F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Magazines.StonerMag, (model) -> {
//            GL11.glTranslatef(0.3F, 0.1F, 0F);
//            GL11.glRotatef(-15F, 0f, 0f, 1f);
            
//            GL11.glTranslatef(0.15F, 0.9F, 0F);
//            GL11.glRotatef(10F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(-0.085F, -0.86F, 4.1F);
                GL11.glScaled(0.9F, 0.9F, 0.8F);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.085F, -0.75F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail3) {
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail4) {
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail5) {
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.183F, -1.32F, -5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.25F, -1.65F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.155F, -1.74F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.26F, -1.53F, -2.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.005F, -0.88F, 0.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron1) {
                    GL11.glTranslatef(0.165F, -1.65F, 1F);
                    GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                    GL11.glTranslatef(0.25F, -1.55F, -2F);
                    GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
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
                GL11.glTranslatef(0.125F, -1.8F, -1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.18F, -1.5F, -3.73F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.22F, -1.85F, -3.7F);
                GL11.glScaled(0F, 0F, 0F); 
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
                GL11.glTranslatef(-0.1F, -1.34F, -3.7F);
                GL11.glScaled(0F, 0F, 0F); 
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof M27rearsight) {
                GL11.glTranslatef(0f, -1.05f, 5.8f);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            } else if(model instanceof MBUSiron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.05F, -0.95F, 3.8F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.155F, -1F, 5.3F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        },(model) -> {
            if(model instanceof AcogScope2) {
                GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            else if(model instanceof AcogReticle) {
                GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.035F, -0.6F, 4.7F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(0.1F, -0.78F, 4.6F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(0.1F, -0.74F, 4.6F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(0.12F, -0.8F, 4.6F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(0.12F, -0.8F, 4.6F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
            GL11.glTranslatef(0.12F, -0.8F, 4.8F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof EotechScopeRing) {
                GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
//        .withCompatibleAttachment(Attachments.Vortex, (player, stack) -> {
//            GL11.glTranslatef(-0.12F, -1F, 4.3F);
//            GL11.glScaled(0.4F, 0.4F, 0.5F);
//            },(model) -> {
//                if(model instanceof Holo2) {
//                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
//                    GL11.glScaled(0.15F, 0.15F, 0.15F);
//                }
//            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef(0.125F, -0.83F, 4.8F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef(-0.04F, -1.05F, 4.7F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.04F, -1.05F, 4.7F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.05F, 0.75F, 1.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.05F, 1.75F, 0.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.05F, 1.85F, 0.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.05F, 1.75F, 0.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
        	GL11.glTranslatef(-0.05F, 0.83F, 0.9F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(-0.06F, -0.6F, 1.5F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
            GL11.glRotatef(-90F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(-0.06F, -0.62F, 1.5F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
            GL11.glRotatef(-90F, 0f, 0f, 1f);
        })
        .withTextureNames("gun")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new StonerA1())
            //.withTextureName("AK47")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.28F, 0.28F, 0.28F);
                GL11.glTranslatef(1, -0.8f, 1.5f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-0.6F, 3.5F, 0.5F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
                 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glScalef(2.5f, 2.5f, 2.5f);
                 GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.445000f, 0.700000f, -6.300000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.5f, 2.5f, 2.5f);
                GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.445000f, 0.700000f, -6.000000f);
                GL11.glRotatef(-0.500000f, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, -0.400000f, -5.074998f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, -0.400000f, -4.774998f);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.StonerBELT.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0.1F, -0.1F, 0F);
                GL11.glRotatef(25F, 0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.StonerBELT.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0.1F, -0.1F, 0F);
                GL11.glRotatef(25F, 0f, 0f, 1f);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.StonerBELT.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(-0.5F, -0.4F, 0F);
                    GL11.glRotatef(40F, 0f, 0f, 1f);
//                    GL11.glRotatef(30F, 1f, 0f, 0f);
                }
            })
            
            .withFirstPersonPositioningReloading(
                    
                    //hand grabs latch
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(16.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(17.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 0.800000f, -6.074996f);
                    }, 350, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 0.805f, -6.074996f);
                    }, 90, 0),
                    //hand opens latch
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(16.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(14.600000f, 0f, 1f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 0.81f, -6.1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(15.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(14.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 0.78f, -6.08f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(15.200000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 0.73f, -6.04f);
                    }, 90, 0),
                    // gun moves as hand goes down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(16.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.55f, 0.67f, -6.24f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(15.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(24.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.62f, 0.72f, -6.3f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(13.600000f, 1f, 0f, 0f);
                        GL11.glRotatef(27.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.64f, 0.78f, -6.35f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(12.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.67f, 0.83f, -6.42f);
                    }, 100, 0),
                // mag touches gun
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(12.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(33.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.75f, 0.81f, -6.474996f);
                }, 250, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(11.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.73f, 0.805f, -6.474996f);
                }, 80, 0),
                // mag inserts
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(11.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.200000f, 0f, 1f, 0f);
                    GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.9f, 0.77f, -6.474996f);
                }, 100, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(11.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.500000f, 0f, 1f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.86f, 0.77f, -6.474996f);
                }, 70, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(11.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.300000f, 0f, 1f, 0f);
                    GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.82f, 0.77f, -6.474996f);
                }, 80, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(11.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.500000f, 0f, 1f, 0f);
                    GL11.glRotatef(-5.800000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.8f, 0.77f, -6.474996f);
                }, 90, 0),
                //left hand grabs belt
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(36.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.7f, 0.800000f, -6.474996f);
                }, 200, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(38.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.6f, 0.800000f, -6.474996f);
                }, 100, 0),
                //left hand drags belt
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(39.300000f, 0f, 1f, 0f);
                	GL11.glRotatef(4.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.5f, 0.800000f, -6.474996f);
                }, 240, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.300000f, 0f, 1f, 0f);
                	GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.50f, 0.800000f, -6.474996f);
                }, 240, 0),
                // places belt
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(13.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.83f, -6.474996f);
                }, 110, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(12.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.81f, -6.474996f);
                }, 80, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(12.500000f, 1f, 0f, 0f);
                	GL11.glRotatef(38.300000f, 0f, 1f, 0f);
                	GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.815f, -6.474996f);
                }, 90, 0),
                // gun moves
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(13.500000f, 1f, 0f, 0f);
                	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.815f, -6.474996f);
                }, 150, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(15.500000f, 1f, 0f, 0f);
                	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.815f, -6.474996f);
                }, 150, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(18.500000f, 1f, 0f, 0f);
                	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.815f, -6.474996f);
                }, 150, 0),
              // grabs latch
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 0.900000f, -6.374996f);
                }, 250, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(11.500000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 0.87f, -6.374996f);
                }, 80, 0),
              //left hand closes latch
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 1.11f, -6.374996f);
                }, 110, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 1.02f, -6.374996f);
                }, 60, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(22.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 1.08f, -6.4f);
                }, 70, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(12.500000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 1.05f, -6.5f);
                }, 80, 0),
              //hand goes to action
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(36.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 1.000000f, -6.3f);
                }, 340, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(10.500000f, 1f, 0f, 0f);
                	GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(23.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 1.000000f, -6.2f);
                }, 70, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(10.200000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(21.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 1.000000f, -6.1f);
                }, 80, 0),
                //hand pulls action back
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(9.400000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.400000f, 0f, 1f, 0f);
                	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 1.000000f, -6f);
                }, 140, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(8.70000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.900000f, 0f, 1f, 0f);
                	GL11.glRotatef(22.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 1.000000f, -5.974996f);
                }, 70, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(8.900000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.700000f, 0f, 1f, 0f);
                	GL11.glRotatef(23.500000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 1.000000f, -5.974996f);
                }, 80, 0),
                //hand pushes action
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(9.400000f, 1f, 0f, 0f);
                	GL11.glRotatef(39.700000f, 0f, 1f, 0f);
                	GL11.glRotatef(18.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 1.000000f, -6.15f);
                }, 110, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(10.600000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.300000f, 0f, 1f, 0f);
                	GL11.glRotatef(21.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 1.000000f, -6.12f);
                }, 60, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(10.100000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.100000f, 0f, 1f, 0f);
                	GL11.glRotatef(20.500000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 1.000000f, -6.19f);
                }, 70, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(10.400000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(19.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 1.000000f, -6.174996f);
                }, 80, 0)
            )
            
			.withFirstPersonPositioningUnloading(
			        
			        //left hand begins grabs magazine out
			          new Transition((renderContext) -> { // Reload position
			              GL11.glRotatef(42F, 0f, 1f, 0f);
			              GL11.glScalef(2.5f, 2.5f, 2.5f);
			              GL11.glRotatef(6.000000f, 0f, 0f, 1f);
			              GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
			              GL11.glTranslatef(-0.545000f, 0.750000f, -6.500000f);
			          }, 300, 100),
			          //left hand begins grabs magazine out
			          new Transition((renderContext) -> { // Reload position
			              GL11.glRotatef(41F, 0f, 1f, 0f);
			              GL11.glScalef(2.5f, 2.5f, 2.5f);
			              GL11.glRotatef(7.000000f, 0f, 0f, 1f);
			              GL11.glTranslatef(-0.545000f, 0.80000f, -6.500000f);
			          }, 300, 0),
			          //left hand drops magazine
			          new Transition((renderContext) -> { // Reload position
			              GL11.glRotatef(41.5F, 0f, 1f, 0f);
			              GL11.glScalef(2.5f, 2.5f, 2.5f);
			              GL11.glRotatef(9.000000f, 0f, 0f, 1f);
			              GL11.glRotatef(4.000000f, 1f, 0f, 0f);
			              GL11.glTranslatef(-0.545000f, 0.780000f, -6.550000f);
			          }, 340, 0)
			  )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M249Action.getRenderablePart(),
            		//hand grabs latch
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    //hand opens latch
                    new Transition((renderContext) -> { // Reload position
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 80, 0),
                    // hand moves down
                    new Transition((renderContext) -> { // Reload position
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 300, 0),
	                // mag touches gun
	                new Transition((renderContext) -> { // Reload position
	                }, 250, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 70, 0),
	                // mag inserts
	                new Transition((renderContext) -> { // Reload position
	                }, 130, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 70, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	                //left hand grabs belt
	                new Transition((renderContext) -> { // Reload position
	                }, 200, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	                //left hand drags belt
	                new Transition((renderContext) -> { // Reload position
	                }, 400, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 400, 0),
	             // places belt
	                new Transition((renderContext) -> { // Reload position
	                }, 150, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 60, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 70, 0),
	             // gun moves
	                new Transition((renderContext) -> { // Reload position
	                }, 90, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 90, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 90, 0),
	              // grabs latch
	                new Transition((renderContext) -> { // Reload position
	                }, 170, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	              //left hand closes latch
	                new Transition((renderContext) -> { // Reload position
	                }, 160, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 70, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	              //hand goes to action
	                new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 1f);
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 1f);
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 1f);
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000)
                        )
                        
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.StonerHATCH.getRenderablePart(),
            		//hand grabs latch
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    //hand opens latch
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 80, 0),
                    // hand moves down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 0),
	                // mag touches gun
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 250, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 70, 0),
	                // mag inserts
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 130, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 70, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 80, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 80, 0),
	                //left hand grabs belt
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 200, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 80, 0),
	                //left hand drags belt
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 400, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 400, 0),
	             // places belt
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 150, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 60, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 70, 0),
	             // gun moves
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 90, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 90, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 90, 0),
	              // grabs latch
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 170, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
	                }, 80, 0),
	              //left hand closes latch
	                new Transition((renderContext) -> { // Reload position
	                }, 160, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 70, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	              //hand goes to action
	                new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000)
                        )
                        
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.StonerBELT.getRenderablePart(),
            		//hand grabs latch
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.65F, 0.95F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.65F, 0.95F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 70, 0),
                    //hand opens latch
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.65F, 0.95F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.65F, 0.95F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.65F, 0.95F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 80, 0),
                    // hand moves down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.65F, 0.95F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.65F, 0.95F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.65F, 0.95F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.65F, 0.95F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 300, 0),
	                // mag touches gun
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(0.45F, 0.35F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
	                }, 250, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(0.45F, 0.35F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
	                }, 70, 0),
	                // mag inserts
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(0.15F, 0.35F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
	                }, 130, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(0.15F, 0.35F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
	                }, 70, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(0.15F, 0.35F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
	                }, 80, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(0.15F, 0.35F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
	                }, 80, 0),
	                //left hand grabs belt
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(0.15F, 0.35F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
	                }, 200, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(0.15F, 0.35F, 0F);
	                    GL11.glRotatef(45F, 0f, 0f, 1f);
	                }, 80, 0),
	                //left hand drags belt
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(0.2F, -0.25F, 0F);
	                    GL11.glRotatef(50F, 0f, 0f, 1f);
	                }, 400, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glTranslatef(0.05F, -0.15F, 0F);
	                    GL11.glRotatef(25F, 0f, 0f, 1f);
	                }, 400, 0),
	             // places belt
	                new Transition((renderContext) -> { // Reload position
	                }, 150, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 60, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 70, 0),
	             // gun moves
	                new Transition((renderContext) -> { // Reload position
	                }, 90, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 90, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 90, 0),
	              // grabs latch
	                new Transition((renderContext) -> { // Reload position
	                }, 170, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	              //left hand closes latch
	                new Transition((renderContext) -> { // Reload position
	                }, 160, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 70, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	              //hand goes to action
	                new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000)
                        )
                        
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.StonerBELT.getRenderablePart(),
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.45F, 0.2F, 0F);
                        GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.4F, 1.8F, 0F);
                        GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.StonerMag,
            		//hand grabs latch
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    //hand opens latch
                    new Transition((renderContext) -> { // Reload position
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 80, 0),
                    // hand moves down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.6F, 1F, 0F);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.6F, 1F, 0F);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.6F, 1F, 0F);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.6F, 1F, 0F);
                    }, 300, 0),
	                // mag touches gun
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glTranslatef(0.4F, 0F, 0F);
	                }, 250, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glTranslatef(0.4F, 0F, 0F);
	                }, 70, 0),
	                // mag inserts
	                new Transition((renderContext) -> { // Reload position
	                }, 130, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 70, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	                //left hand grabs belt
	                new Transition((renderContext) -> { // Reload position
	                }, 200, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	                //left hand drags belt
	                new Transition((renderContext) -> { // Reload position
	                }, 400, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 400, 0),
	             // places belt
	                new Transition((renderContext) -> { // Reload position
	                }, 150, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 60, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 70, 0),
	             // gun moves
	                new Transition((renderContext) -> { // Reload position
	                }, 90, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 90, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 90, 0),
	              // grabs latch
	                new Transition((renderContext) -> { // Reload position
	                }, 170, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	              //left hand closes latch
	                new Transition((renderContext) -> { // Reload position
	                }, 160, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 70, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 80, 0),
	              //hand goes to action
	                new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
	                new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
                    new Transition((renderContext) -> { // Reload position
	                }, 340, 0),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000)
                        )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.StonerMag,
            		new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 0.1F, 0F);
                        GL11.glRotatef(-15F, 0f, 0f, 1f);
                        
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, 0.925000f, -1.125000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(2f, 2f, 2f);
                      GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(-0.525000f, 1.174999f, -1.125000f);
                  }, 350, 600))
              
      .withFirstPersonPositioningDrawing(
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                  GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.574998f);
              }, 200, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                  GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.574998f);
              }, 230, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                  GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.574998f);
              }, 300, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                  GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.574998f);
              }, 250, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                  GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.574998f);
              }, 230, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                  GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.504998f);
              }, 180, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.574998f);
              }, 180, 0)
              )
              
         .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.StonerBELT.getRenderablePart(),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 200, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 230, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 300, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 250, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 230, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 180, 100),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 180, 0)
              )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.19f, 0.32f, -6.2f);
                GL11.glRotatef(-0.55F, 1f, 0f, 0f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.6f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.27f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.18f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.21f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.16f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.19f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.5f);
                } 
                
//             // ACOG Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Acog");
//                    GL11.glTranslatef(0F, 0.21f, 0.6f);
//                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.26f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.165f, 0.3f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.19f, 0.32f, -6.05f);
                GL11.glRotatef(-0.55F, 1f, 0f, 0f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.5f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.27f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.18f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.21f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.16f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.19f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.5f);
                } 
                
//             // ACOG Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Acog");
//                    GL11.glTranslatef(0F, 0.21f, 0.6f);
//                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.26f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.165f, 0.3f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glScalef(2.5f, 2.5f, 2.5f);
                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.445000f, 1.45f, -5.900000f);
                GL11.glRotatef(5.000000f, 1f, 0f, 0f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(2f, 2f, 2f);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.950000f, -0.125000f, -6.125000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                     })
                     
            .withFirstPersonHandPositioningProning(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
            		//hand grabs latch
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.125000f, -1.299999f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.125000f, -1.299999f, 0.000000f);
                    }, 70, 0),
                    //hand opens latch
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-1.050000f, -1.050000f, 0.200000f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-1.050000f, -1.050000f, 0.200000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-1.050000f, -1.050000f, 0.200000f);
                    }, 80, 0),
                    // hand moves down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, -1.699999f, -0.050000f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, -1.699999f, -0.050000f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, -1.699999f, -0.050000f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, -1.699999f, -0.050000f);
                    }, 300, 0),
	                // mag touches gun
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
	                	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
	                	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
	                	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
	                	GL11.glTranslatef(-0.550000f, -1.699999f, -0.050000f);
	                }, 250, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
	                	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
	                	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
	                	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
	                	GL11.glTranslatef(-0.550000f, -1.699999f, -0.050000f);
	                }, 70, 0),
	                // mag inserts
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, -1.674999f, 0.025000f);
	                }, 130, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, -1.674999f, 0.025000f);
	                }, 70, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, -1.674999f, 0.025000f);
	                }, 80, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, -1.674999f, 0.025000f);
	                }, 80, 0),
	                //left hand grabs belt
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.675000f, -1.649999f, 0.325000f);
	                }, 200, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
	                	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.675000f, -1.649999f, 0.325000f);
	                }, 80, 0),
	                //left hand drags belt
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
	                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                	GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
	                	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
	                	GL11.glTranslatef(-0.675000f, -1.649999f, 0.025000f);
	                }, 400, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
	                	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
	                	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
	                	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
	                	GL11.glTranslatef(-0.850000f, -1.549999f, 0.200000f);
	                }, 400, 0),
	             // places belt
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
	                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                	GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
	                	GL11.glTranslatef(-0.950000f, -1.499999f, 0.125000f);
	                }, 150, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
	                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                	GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
	                	GL11.glTranslatef(-0.950000f, -1.499999f, 0.125000f);
	                }, 60, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
	                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                	GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
	                	GL11.glTranslatef(-0.950000f, -1.499999f, 0.125000f);
	                }, 70, 0),
	             // gun moves
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
	                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
	                	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
	                	GL11.glTranslatef(-0.875000f, -1.624999f, 0.075000f);
	                }, 90, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
	                	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
	                	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
	                	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                	GL11.glTranslatef(-0.850000f, -1.874999f, 0.250000f);
	                }, 90, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
	                	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
	                	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
	                	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
	                	GL11.glTranslatef(-0.825000f, -2.074999f, 0.050000f);
	                }, 90, 0),
	              // grabs latch
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
	                	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
	                	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
	                	GL11.glRotatef(80.000000f, 0f, 0f, 1f);
	                	GL11.glTranslatef(-1.050000f, -1.050000f, 0.200000f);
	                }, 170, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
	                	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
	                	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
	                	GL11.glRotatef(80.000000f, 0f, 0f, 1f);
	                	GL11.glTranslatef(-1.050000f, -1.050000f, 0.200000f);
	                }, 80, 0),
	              //left hand closes latch
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.125000f, -1.299999f, 0.000000f);
	                }, 160, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.125000f, -1.299999f, 0.000000f);
	                }, 70, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.125000f, -1.299999f, 0.000000f);
	                }, 80, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.125000f, -1.299999f, 0.000000f);
	                }, 80, 0),
	              //hand goes to action
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.710000f, -1.285000f, 0.130000f);
	                }, 340, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.710000f, -1.285000f, 0.130000f);
	                }, 340, 0),
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.710000f, -1.285000f, 0.130000f);
	                }, 340, 0),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.710000f, -1.285000f, 0.130000f);
                    }, 500, 1000),
                    new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.710000f, -1.285000f, 0.130000f);
	                }, 340, 0),
                    new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.710000f, -1.285000f, 0.130000f);
	                }, 340, 0),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.710000f, -1.285000f, 0.130000f);
                    }, 500, 1000),
                    new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.710000f, -1.285000f, 0.130000f);
	                }, 340, 0),
                    new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.710000f, -1.285000f, 0.130000f);
	                }, 340, 0),
                    new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.710000f, -1.285000f, 0.130000f);
	                }, 340, 0)
                        )
                    
            .withFirstPersonRightHandPositioningReloading(
            		//hand grabs latch
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 70, 0),
                    //hand opens latch
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 80, 0),
                    // hand moves down
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 300, 0),
	                // mag touches gun
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 250, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 70, 0),
	                // mag inserts
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 130, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 70, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 80, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 80, 0),
	                //left hand grabs belt
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 200, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 80, 0),
	                //left hand drags belt
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 400, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 400, 0),
	             // places belt
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 150, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 60, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 70, 0),
	             // gun moves
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 90, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 90, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 90, 0),
	              // grabs latch
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 170, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 80, 0),
	              //left hand closes latch
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 160, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 70, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 80, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
	                }, 80, 0),
	              //hand goes to action
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-130.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(1.230000f, -1.010000f, 0.190000f);
                         
                         GL11.glTranslatef(0f, 0.03f, 0f);
	                }, 340, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-130.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(1.230000f, -1.010000f, 0.190000f);
                         
                         GL11.glTranslatef(0f, 0.03f, 0f);
	                }, 340, 0),
	                new Transition((renderContext) -> { // Reload position
	                	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-130.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(1.230000f, -1.010000f, 0.190000f);
                         
                         GL11.glTranslatef(0f, 0.03f, 0f);
	                }, 340, 0),
	                // pulls action
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-130.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.510000f, -0.940000f, 0.220000f);
                    	
                    	GL11.glTranslatef(0f, 0.03f, 0f);
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-130.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.510000f, -0.940000f, 0.220000f);
                    	
                    	GL11.glTranslatef(0f, 0.03f, 0f);
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-130.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.510000f, -0.940000f, 0.220000f);
                    	
                    	GL11.glTranslatef(0f, 0.03f, 0f);
                    }, 500, 1000),
                    // pushes action
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-130.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(1.230000f, -1.010000f, 0.190000f);
                         
                         GL11.glTranslatef(0f, 0.03f, 0f);
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-130.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(1.230000f, -1.010000f, 0.190000f);
                         
                         GL11.glTranslatef(0f, 0.03f, 0f);
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-130.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(1.230000f, -1.010000f, 0.190000f);
                         
                         GL11.glTranslatef(0f, 0.03f, 0f);
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-130.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(1.230000f, -1.010000f, 0.190000f);
                         
                         GL11.glTranslatef(0f, 0.03f, 0f);
                    }, 500, 1000)
                        )
                    
            .withFirstPersonLeftHandPositioningUnloading(
                  //hand grabs magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.490000f, -1.695000f, 0.170000f);
                    }, 250, 1000),
                    //hand grabs magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.310000f, -1.715000f, 0.070000f);
                    }, 250, 1000),
                    //hand drops magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.010000f, -1.855000f, -0.030000f);
                    }, 250, 1000))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.200000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.200000f, 0.175000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.650000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.650000f, 0.175000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    //does nothing
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 500, 1000),
                  //does nothing
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 500, 1000),
                  //does nothing
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 500, 1000),
                    //hand grabs latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, 0.100000f);
                    }, 250, 1000),
                    //hand opens latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.200000f);
                    }, 250, 1000),
                    //hand grabs magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.100000f, 0.075000f);
                    }, 250, 1000),
                    //hand drops magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.025000f, 0.025000f);
                    }, 250, 1000),
                    //hand stays down there
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.025000f, 0.025000f);
                    }, 250, 1000),
                    //hand pulls up new magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.075000f, 0.100000f);
                    }, 250, 1000),
                    //hand pushes in magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.075000f, 0.100000f);
                    }, 250, 1000),
                    //hand grabs belt
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.025000f, 0.125000f);
                    }, 250, 1000),
                    //hand drags belt
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.050000f, 0.150000f);
                    }, 250, 1000),
                    //hand grabs latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.200000f);
                    }, 250, 1000),
                    //hand closes latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, 0.100000f);
                    }, 250, 1000),
                    //hand lifts up
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 250, 1000),
                    //hand smacks latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 250, 1000))
                    
            .withThirdPersonRightHandPositioningReloading(
                    //hand grabs action
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.100000f, 0.050000f);
                    }, 500, 1000),
                    //hand pulls action
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.175000f, 0.050000f);
                    }, 500, 1000),
                    //hand pushes action
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.100000f, 0.050000f);
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 500, 1000),
                    //hand pulls action
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.175000f, 0.050000f);
                    }, 500, 1000),
                    //hand pushes action
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.100000f, 0.050000f);
                    }, 500, 1000))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0f, 0f, 0f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0f, 0f, 0f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0f, 0f, 0f);
                    }, 250, 100),
                    new Transition((renderContext) -> {
                        GL11.glScalef(0f, 0f, 0f);
                    }, 500, 1000),
                    //hand pulls action
                    new Transition((renderContext) -> {
                        GL11.glScalef(0f, 0f, 0f);
                    }, 500, 1000),
                    //hand pushes action
                    new Transition((renderContext) -> {
                        GL11.glScalef(0f, 0f, 0f);
                    }, 500, 1000)
                    )
             
            .build())
        .withSpawnEntityDamage(6f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

