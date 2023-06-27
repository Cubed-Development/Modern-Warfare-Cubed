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

public class M200InterventionFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("m200_intervention")
        .withFireRate(0.16f)
        .withEjectRoundRequired()
        .withEjectSpentRoundSound("m200_intervention_boltaction")
        .withRecoil(9f)
        .withZoom(0.8f)
        .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
        .withMaxShots(1)
        .withShootSound("m200_intervention")
        .withPumpTimeout(1000)
        .withSilencedShootSound("sniper_silenced")
        .withReloadSound("pgmhecateii_reload")
        .withUnloadSound("pgmhecateii_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(40)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.08f)
        .withFlashOffsetY(() -> 0.11f)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Sniper Rifle",
        "Damage: 20", 
        "Cartridge: .408 Cheyenne Tactical",
        "Fire Rate: BOLT ACTION",
        "Rate of Fire: 16/100",
        "Magazines:",
        "7rnd .408 CT Magazine"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                4f, // x 
                4f, // y
                9f) // z
        
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Magazines.InterventionMag, (model) -> {
        	
//            GL11.glTranslatef(0F, 0.2F, 0.35F);
//            GL11.glRotatef(20f, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.InterventionBoltAction, true, (model) -> {
//        	GL11.glTranslatef(-1.41f, -1.15f, 0f);
//            GL11.glRotatef(70f, 0f, 0f, 1f);
            
//        	  GL11.glTranslatef(0f, 0f, 0f);
//              GL11.glRotatef(70f, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(0.03F, -1.98F, -1.5F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
         .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.093F, -2F, -0F);
            GL11.glScaled(0.88F, 0.88F, 0.88F);
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
        	GL11.glTranslatef(0.05F, -1.7F, -0.5F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
        	GL11.glTranslatef(0.085F, -1.83F, -1.1F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                GL11.glTranslatef(0.18F, -1.8F, -0.5F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
        	GL11.glTranslatef(0.18F, -1.8F, -0.5F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
        	GL11.glTranslatef(0.09F, -2.53F, -0.5F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        } else if (model instanceof SightMount) {
		//        	GL11.glTranslatef(-0.15F, -1.82F, -1F);
		//            GL11.glScaled(0.4F, 0.4F, 0.4F);
		        }
		    })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
        	GL11.glTranslatef(0.21F, -1.85F, -0.5F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(0.21F, -1.85F, -0.5F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(0.21F, -1.85F, -0.5F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
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
        .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
        	GL11.glTranslatef(-0.08F, -2.05F, -0.7F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
        	GL11.glTranslatef(0.21F, -1.85F, -0.2F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
        	GL11.glTranslatef(0.21F, -1.85F, -0.2F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
        	GL11.glTranslatef(0.05F, -2.05F, -0.2F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(0.05F, -2.05F, -0.2F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
            GL11.glTranslatef(-0.2F, -0.3F, -5.85F);
            GL11.glScaled(1F, 1F, 1F);
      })
//      .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
//            if(model instanceof AKRail) {
//                GL11.glTranslatef(-0.22F, -1.36F, -3.15F);
//                GL11.glScaled(0.7F, 0.8F, 0.9F);
//            } else if(model instanceof AKRail2) {
//                GL11.glTranslatef(-0.37F, -1.005F, -3.5F);
//                GL11.glScaled(0F, 0F, 0F);
//                GL11.glRotatef(-90F, 0f, 0f, 1f);
//            } else if(model instanceof AKRail3) {
//                GL11.glTranslatef(-0.37F, -1.005F, -3.5F);
//                GL11.glScaled(0F, 0F, 0F);
//                GL11.glRotatef(-90F, 0f, 0f, 1f);
//            } else if(model instanceof AKRail4) {
//                GL11.glTranslatef(-0.37F, -1.005F, -3.5F);
//                GL11.glScaled(0F, 0F, 0F);
//                GL11.glRotatef(-90F, 0f, 0f, 1f);
//            } else if(model instanceof AKRail5) {
//                GL11.glTranslatef(-0.37F, -1.005F, -3.5F);
//                GL11.glScaled(0F, 0F, 0F);
//                GL11.glRotatef(-90F, 0f, 0f, 1f);
//            }
//        })
        .withCompatibleAttachment(AuxiliaryAttachments.Bullet, true, (model) -> {
            if(model instanceof BulletBig) {
                GL11.glScaled(0.5F, 0.5F, 1F);
                GL11.glTranslatef(-0F, -3F, -0.8F);
                GL11.glRotatef(90f, 1f, 0f, 0f);
                
                
//                GL11.glScaled(0.4F, 0.4F, 0.6F);
//                GL11.glTranslatef(-0.95F, -3.1F, -3.5F);
//                GL11.glRotatef(70f, 1f, 0f, 0f);
//                GL11.glRotatef(5f, 0f, 1f, 0f);
            }
        })
//        .withCompatibleAttachment(Attachments.Silencer762x54, (model) -> {
//            GL11.glTranslatef(-0.22F, -1.3F, -12.2F);
//            GL11.glScaled(1.2F, 1.2F, 1.5F);
//        })
        .withTextureNames("intervention")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new Intervention())
            //.withTextureName("AWP")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.28F, 0.28F, 0.28F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-2.3F, -0.5F, 2.2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(3f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.575000f, 1.874999f, -1.799999f);
                
//                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(75.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(0.500000f, 1.649999f, -1.000000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(3f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.575000f, 1.874999f, -1.099999f);
                GL11.glRotatef(-1.5f, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.3f, 0.95f, -0.2f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(12f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.3f, 0.95f, -0f);
                GL11.glRotatef(0.5F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.InterventionBoltAction.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningEjectSpentRound(
            		
            		// right hand grabs bolt action
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(2f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.874999f, -1.789999f);
                    }, 170, 0),
                    
                    // right hand pushes bolt action up
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(1.5f, 0f, 0f, 1f);
                        GL11.glRotatef(-1F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.575000f, 1.874999f, -1.789999f);
                    }, 130, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(2.3f, 0f, 0f, 1f);
                        GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.575000f, 1.874999f, -1.789999f);
                    }, 70, 0),
                    
                    // right hand pulls back bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-2f, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.575000f, 1.874999f, -1.299999f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-3f, 0f, 0f, 1f);
                        GL11.glRotatef(-3F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.575000f, 1.874999f, -1.3f);
                    }, 40, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-2.5f, 0f, 0f, 1f);
                        GL11.glRotatef(-2.5F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.575000f, 1.874999f, -1.25f);
                    }, 70, 0),
                    
                    // right hand pushes bolt action forward
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-1f, 0f, 0f, 1f);
                        GL11.glRotatef(-0.5f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.575000f, 1.874999f, -1.699999f);
                    }, 100, 0),
                    
                    // right hand pulls down bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(0f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.874999f, -1.799999f);
                    }, 80, 0)
                    
                    )
            
            .withFirstPersonPositioningEjectSpentRoundAimed(
            		// right hand grabs bolt action
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(2f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.275000f, 1.874999f, -1.789999f);
                    }, 170, 0),
                    
                    // right hand pushes bolt action up
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(1.5f, 0f, 0f, 1f);
                        GL11.glRotatef(-1F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.275000f, 1.874999f, -1.789999f);
                    }, 130, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(2.3f, 0f, 0f, 1f);
                        GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.275000f, 1.874999f, -1.789999f);
                    }, 70, 0),
                    
                    // right hand pulls back bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(-2f, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.275000f, 1.874999f, -1.299999f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(-3f, 0f, 0f, 1f);
                        GL11.glRotatef(-3F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.275000f, 1.874999f, -1.3f);
                    }, 40, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(-2.5f, 0f, 0f, 1f);
                        GL11.glRotatef(-2.5F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.275000f, 1.874999f, -1.25f);
                    }, 70, 0),
                    
                    // right hand pushes bolt action forward
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(-1f, 0f, 0f, 1f);
                        GL11.glRotatef(-0.5f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.275000f, 1.874999f, -1.699999f);
                    }, 100, 0),
                    
                    // right hand pulls down bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(0f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.275000f, 1.874999f, -1.799999f);
                    }, 80, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.Bullet.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.4F, -0.5F, -0F);
                          GL11.glRotatef(10f, 1f, 0f, 0f);
                          GL11.glRotatef(25f, 0f, 1f, 0f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1F, -0.3F, -0F);
                          GL11.glRotatef(30f, 1f, 0f, 0f);
                          GL11.glRotatef(35f, 0f, 1f, 0f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.4F, -0F, 0.3F);
                          GL11.glRotatef(35f, 1f, 0f, 0f);
                          GL11.glRotatef(40f, 0f, 1f, 0f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-2F, 1F, 1F);
                          GL11.glRotatef(45f, 1f, 0f, 0f);
                          GL11.glRotatef(50f, 0f, 1f, 0f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-2F, 3F, 1F);
                          GL11.glRotatef(0f, 1f, 0f, 0f);
                          GL11.glRotatef(0f, 0f, 1f, 0f);
                      }, 250, 50)
                    
                    )
            
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.Bullet.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.4F, -0.5F, -0F);
                          GL11.glRotatef(10f, 1f, 0f, 0f);
                          GL11.glRotatef(25f, 0f, 1f, 0f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1F, -0.3F, -0F);
                          GL11.glRotatef(30f, 1f, 0f, 0f);
                          GL11.glRotatef(35f, 0f, 1f, 0f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.4F, -0F, 0.3F);
                          GL11.glRotatef(35f, 1f, 0f, 0f);
                          GL11.glRotatef(40f, 0f, 1f, 0f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-2F, 1F, 1F);
                          GL11.glRotatef(45f, 1f, 0f, 0f);
                          GL11.glRotatef(50f, 0f, 1f, 0f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-2F, 3F, 1F);
                          GL11.glRotatef(0f, 1f, 0f, 0f);
                          GL11.glRotatef(0f, 0f, 1f, 0f);
                      }, 250, 50)
                    
                    )
                    
                  
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.InterventionBoltAction.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-1.41f, -1.15f, 0f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-1.41f, -1.15f, 0f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.41f, -1.15f, 1.5f);
                          GL11.glRotatef(70f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.41f, -1.15f, 1.5f);
                          GL11.glRotatef(70f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.41f, -1.15f, 1.5f);
                          GL11.glRotatef(70f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.41f, -1.15f, 0f);
                          GL11.glRotatef(70f, 0f, 0f, 1f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                  
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.InterventionBoltAction.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-1.41f, -1.15f, 0f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-1.41f, -1.15f, 0f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.41f, -1.15f, 1.5f);
                          GL11.glRotatef(70f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.41f, -1.15f, 1.5f);
                          GL11.glRotatef(70f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.41f, -1.15f, 1.5f);
                          GL11.glRotatef(70f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.41f, -1.15f, 0f);
                          GL11.glRotatef(70f, 0f, 0f, 1f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.InterventionBoltAction.getRenderablePart(),
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
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    
                    // bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                    	GL11.glTranslatef(-0.93f, -0.27f, 0f);
//                    	GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
//                    	GL11.glTranslatef(-0.93f, -0.27f, 0f);
//                    	GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
//                    	  GL11.glTranslatef(-0.93f, -0.27f, 1.5f);
//                        	GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
//                    	  GL11.glTranslatef(-0.93f, -0.27f, 1.5f);
//                      	GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
//                    	  GL11.glTranslatef(-0.93f, -0.27f, 1.5f);
//                      	GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
//                    	  GL11.glTranslatef(-0.93f, -0.27f, 0f);
//                      	GL11.glRotatef(55f, 0f, 0f, 1f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                
            .withFirstPersonPositioningReloading(
           		 
            		// reload
            		 
            		 // left hand reaches down
            		 
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                         GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-1.949999f, 2.174999f, -0.175000f);
                     }, 270, 0),
                     
                     // mag touches gun
                     
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-61.300000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.400000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.174999f, -0.175000f);
                    }, 320, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-61.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.200000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.174999f, -0.175000f);
                   }, 60, 0),
                    
                    // mag goes up halfway
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-4.800000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.174999f, -0.175000f);
                   }, 100, 0),
                    
                    // mag inserts
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-63.400000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.074999f, -0.165000f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-63.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.200000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.084999f, -0.145000f);
                    }, 70, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-63.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.700000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.094999f, -0.155000f);
                    }, 80, 0),
                    
                    // hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-59.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.214999f, -0.175000f);
                    }, 210, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-59.300000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.224999f, -0.175000f);
                    }, 60, 0),
                    
                    // hand hits mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-63.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.004999f, -0.175000f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-62.400000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.004999f, -0.175000f);
                    }, 70, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-4.600000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.004999f, -0.175000f);
                    }, 90, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-62.700000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-4.300000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.004999f, -0.175000f);
                    }, 110, 0),
                    
                    // bolt action
                    
                    // right hand grabs bolt action
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-59.700000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.084999f, -0.145000f);
                    }, 200, 0),
                    
                    // right hand pushes bolt action up
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-61.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.124999f, -0.155000f);
                    }, 130, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-60.800000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-8.500000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.174999f, -0.155000f);
                    }, 70, 0),
                    
                    // right hand pulls back bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.174999f, 0.015000f);
                    }, 140, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-62.100000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-8.100000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.174999f, 0.005000f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-61.800000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-7.700000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.174999f, 0.025000f);
                    }, 90, 0),
                    
                    // right hand pushes bolt action forward
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.174999f, -0.205000f);
                    }, 140, 0),
                    
                    // right hand pulls down bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.174999f, -0.105000f);
                    }, 100, 0)
                    
                    )
                    
            .withFirstPersonPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-59.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.174999f, -0.175000f);
                    }, 310, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-60.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.174999f, -0.155000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.174999f, -0.145000f);
                    }, 180, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.949999f, 2.174999f, -0.165000f);
                    }, 200, 0))
            
            .withFirstPersonCustomPositioningReloading(Magazines.InterventionMag,
            		new Transition((renderContext) -> {
            			GL11.glTranslatef(0F, 1.6F, 1.7F);
                        GL11.glRotatef(30f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.2F, 0.35F);
                        GL11.glRotatef(20f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.2F, 0.35F);
                        GL11.glRotatef(20f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.4F, 0F);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.InterventionMag,
            		new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.4F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 1.6F, 1.7F);
                        GL11.glRotatef(30f, 1f, 0f, 0f);
                    }, 250, 1000)
                    )
                        
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-1.425000f, 1.350000f, -1.400000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.500000f, 1.649999f, -1.000000f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.45F, 0.45F, 0.45F);
                         GL11.glTranslatef(-2.6F, -1F, 3.8F);
                         GL11.glRotatef(-70F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 370, 50),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.45F, 0.45F, 0.45F);
                         GL11.glTranslatef(-2.2F, -1F, 3.8F);
                         GL11.glRotatef(-60F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 200, 100),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.45F, 0.45F, 0.45F);
                         GL11.glTranslatef(-2.6F, -1F, 3.8F);
                         GL11.glRotatef(-70F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 140, 100),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.45F, 0.45F, 0.45F);
                         GL11.glTranslatef(-2.3F, -1F, 3.3F);
                         GL11.glRotatef(-45F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 270, 0),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.45F, 0.45F, 0.45F);
                         GL11.glTranslatef(-2.3F, -1F, 3.3F);
                         GL11.glRotatef(-45F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 240, 0),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.45F, 0.45F, 0.45F);
                         GL11.glTranslatef(-2.3F, -1F, 3.3F);
                         GL11.glRotatef(-45F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 500, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.45F, 0.45F, 0.45F);
                        GL11.glTranslatef(-2.3F, -1F, 3.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.45F, 0.45F, 0.45F);
                        GL11.glTranslatef(-2.6F, -1F, 3.8F);
                        GL11.glRotatef(-70F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 280, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.45F, 0.45F, 0.45F);
                        GL11.glTranslatef(-2.2F, -1F, 3.8F);
                        GL11.glRotatef(-60F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 220, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.45F, 0.45F, 0.45F);
                        GL11.glTranslatef(-2.6F, -1F, 3.8F);
                        GL11.glRotatef(-70F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 160, 0))
            
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.L115Mag.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(2.2F, 3F, 1F);
                        GL11.glRotatef(-30f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(2.2F, 3F, 1F);
                        GL11.glRotatef(-30f, 1f, 0f, 0f);
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
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.InterventionBoltAction.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glRotatef(10f, 0f, 0f, 1f);
                        GL11.glRotatef(25f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.575000f, 1.874999f, -1.799999f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(7f, 0f, 0f, 1f);
                        GL11.glRotatef(17f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.575000f, 1.874999f, -1.799999f);
                    }, 230, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(4f, 0f, 0f, 1f);
                        GL11.glRotatef(8f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.575000f, 1.874999f, -1.799999f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(3f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.874999f, -1.799999f);
                    }, 250, 0)
                    )
              
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.11f, 1.52f, -0.925000f);
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.08f, 0.6f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.09f, 0.25f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.15f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.08f, 0.7f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.17f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.17f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.09f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.085f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.11f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.135f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.135f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.135f, 0.2f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.16f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.13f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.13f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.09f, 0.3f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(-0.04f, 1.52f, -0.725000f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.08f, 0.5f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.09f, 0.15f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.15f, 0.4f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.08f, 0.6f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.17f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.17f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.09f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.085f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.11f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.135f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.135f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.135f, 0.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.16f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.13f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.13f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.09f, 0.3f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, 2.049999f, -1.025000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3f, 3f, 3f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.425000f, 1.350000f, -1.400000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
//                         GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
//                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
//                         GL11.glRotatef(70.000000f, 0f, 0f, 1f);
//                         GL11.glTranslatef(0.125000f, -0.625000f, -0.200000f);
                         
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
                     })
                     
            .withFirstPersonHandPositioningProning(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, 0.075000f, 0.150000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(5.5f, 5.5f, 5.5f);
                         GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.250000f, -0.175000f, 0.000000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
            		
            		// reload
            		
            		// left hand reaches down
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.300000f, -0.575000f, 0.100000f);
                    }, 50, 200),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.025000f, -0.525000f, 0.025000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.025000f, -0.525000f, 0.025000f);
                    }, 50, 200),
                    
                    //mag inserts halfway
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.050000f, -0.500000f, 0.000000f);
                    }, 50, 200),
                    
                    // mag inserts
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.550000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.550000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.550000f, 0.025000f);
                    }, 50, 200),
                    
                    // hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, -0.450000f, -0.050000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, -0.450000f, -0.050000f);
                    }, 50, 200),
                    
                    // hits mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.100000f, -0.475000f, -0.050000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.100000f, -0.475000f, -0.050000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.100000f, -0.475000f, -0.050000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.100000f, -0.475000f, -0.050000f);
                    }, 50, 200),
                    
                    // bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.100000f, -0.475000f, -0.050000f);
                   }, 50, 200),
                   
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                   	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(-0.100000f, -0.475000f, -0.050000f);
                   }, 50, 200),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                   	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(-0.100000f, -0.475000f, -0.050000f);
                  }, 50, 200),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                   	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(-0.100000f, -0.475000f, -0.050000f);
                   }, 50, 200),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                   	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(-0.100000f, -0.475000f, -0.050000f);
                   }, 50, 200),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                   	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(-0.100000f, -0.475000f, -0.050000f);
                   }, 50, 200),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                   	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(-0.100000f, -0.475000f, -0.050000f);
                   }, 50, 200),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                   	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(-0.100000f, -0.475000f, -0.050000f);
                   }, 50, 200)
                   
               )
                    
            .withFirstPersonRightHandPositioningReloading(
            		// reload
            		
            		// left hand reaches down
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    
                    // mag goes up halfway
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    
                    // mag inserts
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    
                    // hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    
                    // hits mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    
                    // bolt action
                    
                    // right hand grabs bolt action
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.650000f, -0.025000f);
                    }, 160, 0),
                    
                    // right hand pushes bolt action up
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.750000f, -0.425000f, -0.100000f);
                    	
                    }, 110, 70),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.750000f, -0.425000f, -0.100000f);
                    }, 110, 70),
                    
                    // right hand pulls back bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.025000f, -0.575000f, -0.150000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.025000f, -0.575000f, -0.150000f);
                    }, 20, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.025000f, -0.575000f, -0.150000f);
                    }, 70, 0),
                    
                    // right hand pushes bolt action forward
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.750000f, -0.425000f, -0.100000f);
                    }, 100, 0),
                    
                    // right hand pulls down bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.525000f, -0.650000f, -0.050000f);
                    }, 80, 0)
                    
                    )
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.550000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.550000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.050000f, -0.500000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.300000f, -0.575000f, 0.100000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningEjectSpentRound(
            		new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                   }, 50, 200),
                    
            		new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                   }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRound(
            		// right hand grabs bolt action
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.650000f, -0.025000f);
                    }, 160, 0),
                    
                    // right hand pushes bolt action up
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.750000f, -0.425000f, -0.100000f);
                    }, 110, 70),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.750000f, -0.425000f, -0.100000f);
                    }, 110, 70),
                    
                    // right hand pulls back bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.025000f, -0.575000f, -0.150000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.025000f, -0.575000f, -0.150000f);
                    }, 20, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.025000f, -0.575000f, -0.150000f);
                    }, 70, 0),
                    
                    // right hand pushes bolt action forward
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.375000f, -0.575000f, -0.300000f);
                    }, 100, 0),
                    
                    // right hand pulls down bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 80, 0)
                    
                    )
            
            .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
            		new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4f, 4f, 4f);
                           GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                      }, 50, 200),
                       
               		new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4f, 4f, 4f);
                           GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                      }, 50, 200),
               		new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4f, 4f, 4f);
                           GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                      }, 50, 200),
               		new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4f, 4f, 4f);
                           GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                      }, 50, 200),
               		new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4f, 4f, 4f);
                           GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                      }, 50, 200),
               		new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4f, 4f, 4f);
                           GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                      }, 50, 200),
               		new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4f, 4f, 4f);
                           GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                      }, 50, 200),
               		new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4f, 4f, 4f);
                           GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                      }, 50, 200)
                       
                   )
                    
            .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
// right hand grabs bolt action
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.650000f, -0.025000f);
                    }, 160, 0),
                    
                    // right hand pushes bolt action up
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.750000f, -0.425000f, -0.100000f);
                    }, 110, 70),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.750000f, -0.425000f, -0.100000f);
                    }, 110, 70),
                    
                    // right hand pulls back bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.025000f, -0.575000f, -0.150000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.025000f, -0.575000f, -0.150000f);
                    }, 20, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.025000f, -0.575000f, -0.150000f);
                    }, 70, 0),
                    
                    // right hand pushes bolt action forward
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.375000f, -0.575000f, -0.300000f);
                    }, 100, 0),
                    
                    // right hand pulls down bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 80, 0)
                    
                    )
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.175000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.625000f, -0.200000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.650000f, -0.675000f, 0.100000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, -0.100000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, -0.100000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.175000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.175000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	  GL11.glScalef(4f, 4f, 4f);
                          GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                          GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                          GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                          GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	  GL11.glScalef(4f, 4f, 4f);
                          GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                          GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                          GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                          GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	  GL11.glScalef(4f, 4f, 4f);
                          GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                          GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                          GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                          GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	  GL11.glScalef(4f, 4f, 4f);
                          GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                          GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                          GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                          GL11.glTranslatef(0.350000f, -0.225000f, 0.075000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 250, 100)
                    )
                    
            .build())
        .withSpawnEntityDamage(20f)
        .withSpawnEntityGravityVelocity(0f)
//        .withSpawnEntitySpeed(80f)
        
         
        .build(MWC.modContext);
    }
}
