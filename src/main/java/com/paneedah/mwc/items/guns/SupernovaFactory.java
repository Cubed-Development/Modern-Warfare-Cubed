package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.wearables.Bullets;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class SupernovaFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("supernova")
//      .withCapacity(CommonProxy.Remington870Mag)
        .withAmmoCapacity(7)
        .withMaxBulletsPerReload(7)
        .withFireRate(0.5f)
        .withEjectRoundRequired()
        .withIteratedLoad()
        .withEjectSpentRoundSound("pump_action")
        .withFireRate(0.2f)
        .withRecoil(11f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SHOTGUN)
        .withMaxShots(1)
        .withPumpTimeout(600)
        .withShootSound("supernova")
        .withSilencedShootSound("ShotgunSilenced")
        .withReloadSound("drawweapon")
        .withReloadIterationSound("load_shell")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withAllReloadIterationsCompletedSound("drawweapon")
        .withReloadingTime(15)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")    
        .withShellCasingEjectEnabled(false)
        .withCrosshairZoomed("Sight")
        .withInaccuracy(15)
        .withPellets(10)
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.05f)
        .withFlashOffsetY(() -> 0.12f)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Shotgun",
        "Damage per Pellet: 6",
        "Pellets per Shot: 10", 
        "Cartridge: 12 Gauge Shotgun Shell",
        "Fire Rate: PUMP ACTION",
        "Rate of Fire: 30/100"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                5f, // x 
                1f, // y
                10f) // z
        
        .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        
        .withCompatibleAttachment(Attachments.M1014Grip, true, (model) -> {
//          GL11.glTranslatef(0.01f, -0.19f, -0.4f);
          GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.M1014Stock, (model) -> {
//            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.M4BenelliStock, true, (model) -> {
//          GL11.glTranslatef(0.01f, -0.19f, -0.4f);
          GL11.glScaled(1F, 1F, 1F);
      })
        .withCompatibleAttachment(Attachments.ShotgunRail, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(-0.156F, -0.61F, -1.1f);
                GL11.glScaled(0.55F, 0.4F, 0.4F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.ShotgunShell, true, (model) -> {
            GL11.glTranslatef(-0.12F, -0.08F, -1F);
            GL11.glRotatef(90F, 1f, 0f, 0f);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.SupernovaPump, true, (model) -> {
            GL11.glTranslatef(0.017F, 0F, 0F);
//            GL11.glRotatef(90F, 1f, 0f, 0f);
            GL11.glScaled(1.15F, 1F, 1F);
            
//            GL11.glTranslatef(0f, 0f, 0.9f);
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.17F, -0.73F, -1.3F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.25F, -0.7F, -0.2F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
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
            GL11.glTranslatef(-0.14F, -0.45F, -0.6F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                GL11.glTranslatef(-0.02F, -0.55F, -0.7F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.11F, -1.25F, -0.4F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                } else if (model instanceof SightMount) {
//                	GL11.glTranslatef(-0.15F, -1.82F, -1F);
//                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }
            })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0F, -0.58F, -0.5F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(-0F, -0.58F, -0.5F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
       	 GL11.glTranslatef(-0F, -0.58F, -0.5F);
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
        .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
                GL11.glTranslatef(-0.24F, -0.74F, -0.9F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0F, -0.58F, -0.4F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
            GL11.glTranslatef(-0F, -0.58F, -0.4F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
	     },(model) -> {
	         if(model instanceof Reflex2) {
	             GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	             GL11.glScaled(0.15F, 0.15F, 0.15F);
	         }
	     })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.14F, -0.75F, -0.5F);
                GL11.glScaled(0.38F, 0.38F, 0.38F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.14F, -0.75F, -0.5F);
            GL11.glScaled(0.38F, 0.38F, 0.38F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
	      .withCompatibleAttachment(Attachments.Silencer12Gauge, (model) -> {
	          GL11.glTranslatef(-0.19F, -0.6F, -6.8F);
	          GL11.glScaled(1.4F, 1.4F, 1.4F);
	      })
        .withCompatibleBullet(Bullets.Shotgun12Guage, (model) -> {})
        .withTextureNames("supernova")
        .withRenderer(new WeaponRenderer.Builder()

            .withModel(new Supernova())
            //.withTextureName("Remington900")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-0.9F, 0.4F, 1F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
				GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glRotatef(-6.000000f, 1f, 0f, 0f);
                GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                GL11.glRotatef(-44.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.675000f, 0.175000f, -1.349999f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(9F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.205000f, 0.575000f, -1.499999f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(7F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.205000f, 0.535000f, -1.00f);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
            	 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glRotatef(12F, 0f, 0f, 1f);
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glTranslatef(-0.205000f, 0.515000f, -1.199999f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
            	 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glRotatef(12F, 0f, 0f, 1f);
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glTranslatef(-0.205000f, 0.515000f, -0.699999f);
                GL11.glRotatef(-2F, 0f, 0f, 1f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0.07F, 1.15F, -0.3F);
//                GL11.glRotatef(-70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0.3F, 1.8F, 1.5F);
                GL11.glRotatef(-45F, 1f, 0f, 0f);
                })
                    
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.675000f, 0.175000f, -1.349999f);
                    }, 250, 0)
                )
                
            .withFirstPersonPositioningAllLoadIterationsCompleted(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.400000f, 0.600000f, -1.450000f);
                    }, 290, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(46.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.400000f, 0.550000f, -1.050000f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(46.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.400000f, 0.550000f, -1.050000f);
                }, 50, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-4.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(46.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.400000f, 0.550000f, -1.350000f);
                }, 50, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-6.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.400000f, 0.600000f, -1.40000f);
                }, 110, 0)
            )
                
                .withFirstPersonPositioningLoadIteration(   
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.675000f, 0.175000f, -1.349999f);
                    }, 160, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-43.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.675000f, 0.175000f, -1.349999f);
                    }, 140, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-44.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.675000f, 0.175000f, -1.359999f);
                    }, 140, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-47.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.675000f, 0.175000f, -1.389999f);
                    }, 70, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-12.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-43.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.675000f, 0.175000f, -1.379999f);
                    }, 70, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-12.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.675000f, 0.175000f, -1.379999f);
                    }, 100, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.675000f, 0.175000f, -1.349999f);
                    }, 180, 0)
                )
                
                .withFirstPersonPositioningEjectSpentRound(
      					new Transition((renderContext) -> { // Reload position
                        	GL11.glRotatef(46F, 0f, 1f, 0f);
                            GL11.glRotatef(7F, 0f, 0f, 1f);
                            GL11.glRotatef(-4F, 1f, 0f, 0f);
                            GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                            GL11.glTranslatef(-0.205f, 0.57f, -1.2f);
                        }, 110, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glRotatef(46.5F, 0f, 1f, 0f);
                            GL11.glRotatef(3F, 0f, 0f, 1f);
                            GL11.glRotatef(-5F, 1f, 0f, 0f);
                            GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                            GL11.glTranslatef(-0.205f, 0.57f, -1.19f);
                        }, 60, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glRotatef(46.3F, 0f, 1f, 0f);
                            GL11.glRotatef(5F, 0f, 0f, 1f);
                            GL11.glRotatef(-2F, 1f, 0f, 0f);
                            GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                            GL11.glTranslatef(-0.205f, 0.57f, -1.26f);
                        }, 80, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glRotatef(45F, 0f, 1f, 0f);
                            GL11.glRotatef(-3F, 0f, 0f, 1f);
                            GL11.glRotatef(-1F, 1f, 0f, 0f);
                            GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                            GL11.glTranslatef(-0.205f, 0.5f, -1.4f);
                        }, 90, 0)
                        
                        )
                
                .withFirstPersonPositioningEjectSpentRoundAimed(
                  		new Transition((renderContext) -> { // Reload position
                  			GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                            GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.100000f, 0.350000f, -0.925000f);
                          }, 160, 0),
                          
                          new Transition((renderContext) -> { // Reload position
                        	  GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                              GL11.glRotatef(-9.000000f, 1f, 0f, 0f);
                              GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                              GL11.glRotatef(28.000000f, 0f, 0f, 1f);
                              GL11.glTranslatef(0.100000f, 0.350000f, -0.645000f);
                          }, 70, 0),
                          
                          new Transition((renderContext) -> { // Reload position
                        	  GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                              GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
                              GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                              GL11.glRotatef(27.000000f, 0f, 0f, 1f);
                              GL11.glTranslatef(0.100000f, 0.350000f, -0.655000f);
                          }, 70, 0),
                          
                          new Transition((renderContext) -> { // Reload position
                        	  GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                              GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                              GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                              GL11.glRotatef(26.000000f, 0f, 0f, 1f);
                              GL11.glTranslatef(0.100000f, 0.400000f, -0.855000f);
                          }, 80, 0)
                          
                          )
                
                .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glTranslatef(0F, 0F, 2F);
                        }, 250, 50)
                        )
                        
                    .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),
                    		new Transition((renderContext) -> { // Reload position
                    			 GL11.glTranslatef(0F, 0F, 2F);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                                GL11.glTranslatef(0F, 0F, 2F);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                                GL11.glTranslatef(0F, 0F, 2F);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                                GL11.glTranslatef(0F, 0F, 2F);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                            	 GL11.glTranslatef(0F, 0F, 2F);
                            }, 250, 50)
                        )
                
                .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.SupernovaPump.getRenderablePart(),
                        new Transition((renderContext) -> { // Reload position\
                        }, 250, 50),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glTranslatef(0F, 0F, 0.9F);
                        }, 250, 50),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glTranslatef(0F, 0F, 0.9F);
                        }, 250, 50),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glTranslatef(0F, 0F, 0.9F);
                        }, 250, 50),
                        
                        new Transition((renderContext) -> { // Reload position
                        }, 250, 50)
                    )
                    
                    .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),  
                    		new Transition((renderContext) -> { // Reload position
                    			GL11.glTranslatef(0.07F, 2F, 0.4F);
                                GL11.glRotatef(-70F, 1f, 0f, 0f);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                            	GL11.glTranslatef(0.07F, 1.15F, -0.15F);
                                GL11.glRotatef(-70F, 1f, 0f, 0f);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                            	GL11.glTranslatef(0.1F, 0.45F, 0.3F);
                                GL11.glRotatef(-20F, 1f, 0f, 0f);
                                GL11.glRotatef(5F, 0f, 1f, 0f);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                            	GL11.glTranslatef(-0.01F, 0F, 0F);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                            	GL11.glTranslatef(-0.01F, 0F, 0F);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                            	GL11.glTranslatef(-0.01F, 0F, 0F);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                                GL11.glTranslatef(-0.01F, -0.13F, 3.5F);
                            }, 250, 50)
                        )
                    
                    .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.SupernovaPump.getRenderablePart(),
                            new Transition((renderContext) -> { // Reload position
                            	GL11.glTranslatef(0f, 0f, 0.9f);
                                
                            }, 170, 50),
                            new Transition((renderContext) -> { // Reload position
                                GL11.glTranslatef(0F, 0F, 0.9F);
                            }, 150, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                                GL11.glTranslatef(0F, 0F, 0.9F);
                            }, 150, 50),
                             
                            new Transition((renderContext) -> { // Reload position
                            }, 150, 50)
                            
                            )
                    
                    .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.SupernovaPump.getRenderablePart(),
                      		new Transition((renderContext) -> { // Reload position
                              	GL11.glTranslatef(0F, 0F, 0.9F);
                                  
                              }, 170, 50),
                              new Transition((renderContext) -> { // Reload position
                                  GL11.glTranslatef(0F, 0F, 0.9F);
                              }, 150, 50),
                              
                              new Transition((renderContext) -> { // Reload position
                                  GL11.glTranslatef(0F, 0F, 0.9F);
                              }, 150, 50),
                               
                              new Transition((renderContext) -> { // Reload position
                              }, 150, 50)
                              
                              )
            
                    .withFirstPersonPositioningInspecting(
                            new Transition((renderContext) -> {
                                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                                GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                                GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                GL11.glTranslatef(-0.8f, 0.1f, -1.2f);
                            }, 300, 600),
                          new Transition((renderContext) -> {
                              GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                              GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                              GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                              GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                              GL11.glTranslatef(0.225000f, 0.4f, -1.2f);
                          }, 350, 600)
                            )
                    
            .withThirdPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0)
            )
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M500A2pump.getRenderablePart(),
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
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M4Rail.getRenderablePart(),
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
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(Attachments.Laser2.getRenderablePart(),
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
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 0.8f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(Attachments.Laser.getRenderablePart(),
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
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(Attachments.StubbyGrip.getRenderablePart(),
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
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(Attachments.AngledGrip.getRenderablePart(),
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
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(Attachments.Grip2.getRenderablePart(),
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
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(Attachments.VGrip.getRenderablePart(),
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
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(15F, 0f, 1f, 0f);
                        GL11.glRotatef(13F, 0f, 0f, 1f);
                        GL11.glRotatef(9F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.15f, 0.7f, -1.5f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(9F, 0f, 0f, 1f);
                        GL11.glRotatef(4F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.15f, 0.5f, -1.5f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(0F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.15f, 0.4f, -1.6f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.18f, 0.5f, -1.5f);
                    }, 240, 0)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.2525f, 0.215f, -1.1f);
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.4f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.245f, 0.5f);
                } 
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.245f, 0.8f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.235f, 0.8f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.275f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.265f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.29f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.45f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.275f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.6f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.250000f, 0.21f, -0.9f);
                GL11.glRotatef(-1.5F, 1f, 0f, 0f);
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.3f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.245f, 0.4f);
                } 
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.245f, 0.7f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.235f, 0.7f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.265f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.29f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.35f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.275f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.295f, 0.6f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(35F, 0f, 1f, 0f);
                GL11.glRotatef(20F, 0f, 0f, 1f);
                GL11.glRotatef(5F, 1f, 0f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.15f, 0.65f, -1.5f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.6f, 0.000000f, -1.2f);
             }) 
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.100000f, 0.100000f, -1.700000f);
             }) 
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.300000f, -0.390000f, 0.315000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.525000f, -0.825000f, 0.300000f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.220000f, -0.540000f, 0.245000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.825000f, 0.300000f);
                    })
                     
            .withFirstPersonHandPositioningLoadIterationCompleted(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-85.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, -1.549999f, 0.075000f);
                    }, 
                    (renderContext) -> {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.690000f, -0.905000f, 0.185000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.220000f, -0.540000f, 0.245000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.825000f, 0.300000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, -0.675000f, 0.175000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                     })
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.675000f, 0.175000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.925000f, 0.075000f);
                    })
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -1.199999f, 0.175000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.675000f, -0.850000f, 0.150000f);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonLeftHandPositioningLoadIteration(
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -1.199999f, 0.175000f);
                        
                        GL11.glTranslatef(0.07f, 0.1f, -0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.075000f, -0.975000f, 0.200000f);
                    	
                    	GL11.glTranslatef(0.07f, 0.1f, -0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.000000f, -0.825000f, 0.125000f);
                    	
                    	GL11.glTranslatef(0.07f, 0.1f, -0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.775000f, 0.175000f);
                    	
                    	GL11.glTranslatef(0.07f, 0.1f, -0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.775000f, 0.175000f);
                    	
                    	GL11.glTranslatef(0.07f, 0.1f, -0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.775000f, 0.175000f);
                    	
                    	GL11.glTranslatef(0.07f, 0.1f, -0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -1.199999f, 0.175000f);
                        
                        GL11.glTranslatef(0.07f, 0.1f, -0f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.675000f, -0.850000f, 0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.675000f, -0.850000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.675000f, -0.850000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.675000f, -0.850000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.675000f, -0.850000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.675000f, -0.850000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.675000f, -0.850000f, 0.150000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.650000f, 0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.650000f, 0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.650000f, 0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 250, 50)
                    
                    )
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.675000f, -0.850000f, 0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.675000f, -0.850000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.675000f, -0.850000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.675000f, -0.850000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.675000f, -0.850000f, 0.150000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.120000f, -0.640000f, 0.365000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.120000f, -0.640000f, 0.365000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.120000f, -0.640000f, 0.365000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.390000f, 0.315000f);
                    }, 250, 50)
                    
                    )
                    
            .withFirstPersonRightHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.875000f, 0.200000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.875000f, 0.200000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.875000f, 0.200000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.875000f, 0.200000f);
                    }, 250, 50)
                    
                    )
            
            .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
            		new Transition((renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 || 
                                activeAttachment == Attachments.StubbyGrip ||
                                activeAttachment == Attachments.VGrip) {
                        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.285000f, -0.650000f, 0.250000f);
                        } else {
                        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.125000f, -0.635000f, 0.300000f);
                        }
                    }, 250, 50),
                    
                    new Transition((renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 || 
                                activeAttachment == Attachments.StubbyGrip ||
                                activeAttachment == Attachments.VGrip) {
                        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.285000f, -0.650000f, 0.250000f);
                        } else {
                        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.125000f, -0.635000f, 0.300000f);
                        }
                    }, 250, 50),
                    
                    new Transition((renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 || 
                                activeAttachment == Attachments.StubbyGrip ||
                                activeAttachment == Attachments.VGrip) {
                        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.285000f, -0.650000f, 0.250000f);
                        } else {
                        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.125000f, -0.635000f, 0.300000f);
                        }
                    }, 250, 50),
                    
                    new Transition((renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 || 
                                activeAttachment == Attachments.StubbyGrip ||
                                activeAttachment == Attachments.VGrip) {
                        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.425000f, -0.470000f, 0.190000f);
                        } else {
                        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.275000f, -0.425000f, 0.275000f);
                        }
                    }, 250, 50)
                    
                    )
                    
            .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
                    new Transition((renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.STOCK, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Remington870SawedGrip) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.650000f, -0.925000f, 0.425000f);
                        } else if(activeAttachment == Attachments.Remington870PoliceMagnumStock ||
                                activeAttachment == Attachments.Remington870MilspecStock ||
                                activeAttachment == Attachments.Remington870HK416Stock) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.575000f, -0.925000f, 0.300000f);
                        } else {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.690000f, -0.905000f, 0.185000f);
                        }
                    }, 250, 50),
                    new Transition((renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.STOCK, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Remington870SawedGrip) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.650000f, -0.925000f, 0.425000f);
                        } else if(activeAttachment == Attachments.Remington870PoliceMagnumStock ||
                                activeAttachment == Attachments.Remington870MilspecStock ||
                                activeAttachment == Attachments.Remington870HK416Stock) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.575000f, -0.925000f, 0.300000f);
                        } else {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.690000f, -0.905000f, 0.185000f);
                        }
                    }, 250, 50),
                    new Transition((renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.STOCK, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Remington870SawedGrip) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.650000f, -0.925000f, 0.425000f);
                        } else if(activeAttachment == Attachments.Remington870PoliceMagnumStock ||
                                activeAttachment == Attachments.Remington870MilspecStock ||
                                activeAttachment == Attachments.Remington870HK416Stock) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.575000f, -0.925000f, 0.300000f);
                        } else {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.690000f, -0.905000f, 0.185000f);
                        }
                    }, 250, 50),
                    new Transition((renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.STOCK, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Remington870SawedGrip) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.650000f, -0.925000f, 0.425000f);
                        } else if(activeAttachment == Attachments.Remington870PoliceMagnumStock ||
                                activeAttachment == Attachments.Remington870MilspecStock ||
                                activeAttachment == Attachments.Remington870HK416Stock) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.575000f, -0.925000f, 0.300000f);
                        } else {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.690000f, -0.905000f, 0.185000f);
                        }
                    }, 250, 50)
                    
                    )
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.650000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.150000f, -0.525000f, 0.075000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.000000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, 0.050000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, 0.050000f, 0.075000f);
                    }, 50, 200))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.225000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.000000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 100)
                    )
                    
            .build())
        .withSpawnEntityDamage(6f)
        .withSpawnEntityGravityVelocity(0.8f)
        
         
        .build(MWC.modContext);
    }
}
