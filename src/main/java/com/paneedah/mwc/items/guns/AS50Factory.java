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

public class AS50Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("as50")
        .withFireRate(0.1f)
        .withRecoil(14f)
        .withZoom(0.8f)
        .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
        .withMaxShots(1)
        .withShootSound("as50")
        .withPumpTimeout(1000)
        .withSilencedShootSound("as50_silenced")
        .withReloadSound("as50_reload")
        .withUnloadSound("as50_unload")
        .withInspectSound("inspection")
        .withDrawSound("as50_draw")
        .withReloadingTime(40)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.08f)
        .withFlashOffsetY(() -> 0.11f)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Anti-Materiel Sniper Rifle",
        "Damage: 25", 
        "Cartridge: .50 BMG",
        "Fire Rate: SEMI",
        "Rate of Fire: 10/100",
        "Magazines:",
        "10rnd .50 BMG Magazine (AS50)"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                6f, // x 
                -5f, // y
                12f) // z
        		
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.LaserPlaceholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AS50Action, true, (model) -> {
//        	GL11.glTranslatef(0f, 0f, 1.5f);
//            GL11.glTranslatef(0F, 0F, 1.5F);
        })
       .withCompatibleAttachment(Magazines.AS50Mag, (model) -> {
//    	   GL11.glTranslatef(0f, 0.9f, -0.7f);
//        	 GL11.glRotatef(-20F, 1f, 0f, 0f);
    	   
//    	   GL11.glTranslatef(0f, 4f, 2f);
//      	 GL11.glRotatef(50F, 1f, 0f, 0f);
        })
       .withCompatibleAttachment(Attachments.HK416FrontSight, true, (model) -> {
           if(model instanceof G95_upright_frontsights) {
           	GL11.glTranslatef(0.115F, -2.98F, -4.4F);
               GL11.glScaled(0.35F, 0.35F, 0.35F);
             }
       })
       .withCompatibleAttachment(Attachments.HK416RearSights, true, (model) -> {
           if(model instanceof G95_upright_rearsights) {
        	   GL11.glTranslatef(0.115F, -2.96F, -0.7F);
               GL11.glScaled(0.35F, 0.34F, 0.35F);
           }
       })
         .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.06F, -2.88F, -1F);
            GL11.glScaled(0.93F, 0.93F, 0.93F);
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
            GL11.glTranslatef(0.087F, -2.5F, -1.3F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
            GL11.glTranslatef(0.11F, -2.65F, -2.5F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(0.12F, -3.5F, -1.2F);
		    GL11.glScaled(0.42F, 0.42F, 0.42F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        } else if (model instanceof SightMount) {
		//        	GL11.glTranslatef(-0.15F, -1.82F, -1F);
		//            GL11.glScaled(0.4F, 0.4F, 0.4F);
		        }
		    })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                GL11.glTranslatef(0.225F, -2.62F, -1.5F);
                GL11.glScaled(0.57F, 0.57F, 0.57F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(0.235F, -2.6F, -1.5F);
            GL11.glScaled(0.62F, 0.62F, 0.62F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(0.251F, -2.68F, -1.5F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(0.251F, -2.68F, -1.5F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(0.251F, -2.68F, -1.5F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
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
                GL11.glTranslatef(-0.038F, -2.9F, -1.5F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
    	    },(model) -> {
    	        if(model instanceof Holo2) {
    	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
    	            GL11.glScaled(0.15F, 0.15F, 0.15F);
    	        }
    	    })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(0.25F, -2.68F, -1F);
                GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
        	GL11.glTranslatef(0.25F, -2.68F, -1F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(0.085F, -2.9F, -1.3F);
                GL11.glScaled(0.48F, 0.48F, 0.48F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(0.085F, -2.9F, -1.3F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
          GL11.glTranslatef(0.04F, -0.95F, -3.6F);
          GL11.glScaled(1.5F, 1.5F, 1.5F);
      })
        .withCompatibleAttachment(Attachments.Silencer50BMG, (model) -> {
            GL11.glTranslatef(-0F, -2.4F, -13.5F);
            GL11.glScaled(2F, 2F, 2F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
		    GL11.glTranslatef(0.4F, -2.25F, -5F);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
		})
		.withCompatibleAttachment(Attachments.Laser, (p, s) -> {
			GL11.glTranslatef(0.4F, -2.25F, -5F);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
		})
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.55F, -2.25F, -5.5F);
                GL11.glScaled(1F, 1F, 0.5F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.21F, -1.95F, -5.45F);
                GL11.glScaled(1F, 1F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(-0.02F, -4F, -4.3F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(0.044F, -2.75F, -3.47f);
                GL11.glScaled(0.85F, 0.85F, 1.3F);
            } else if(model instanceof AKRail5) {
                GL11.glTranslatef(0.044F, -2.75F, -5.3f);
                GL11.glScaled(0.85F, 0.85F, 1.3F);
            }
        })
        .withTextureNames("as50")
        .withRenderer(new WeaponRenderer.Builder()

            .withModel(new AS50())
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
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(-3F, -0.8F, 2.8F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScalef(2.5f, 2.5f, 2.5f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.600000f, 2.500000f, -0.725000f);
                
//                GL11.glScalef(2.5f, 2.5f, 2.5f);
//                GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(25.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-1.399999f, 2.975002f, 0.675000f);
                
//                GL11.glScalef(2.5f, 2.5f, 2.5f);
//                GL11.glRotatef(-3.500000f, 1f, 0f, 0f);
//                GL11.glRotatef(30.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(34.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(0.025000f, 2.874999f, -0.125000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glScalef(2.5f, 2.5f, 2.5f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.600000f, 2.500000f, -0.1f);
                GL11.glRotatef(-3f, 1f, 0f, 0f);
                })
                
             .withFirstPersonPositioningProning((renderContext) -> {
                 GL11.glScalef(2.5f, 2.5f, 2.5f);
                 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glRotatef(8f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.6f, 2.2f, -1.2f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScalef(2.5f, 2.5f, 2.5f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(12f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.6f, 2.2f, -1f);
//                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
                
             .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.AS50Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.AS50Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningReloading(
           		 
            		// mag touches gun
                     
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-61.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-1.399999f, 3.175002f, 0.675000f);
                     }, 360, 0),
            		 
            		 // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-64.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.399999f, 3.075002f, 0.675000f);
                    }, 350, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.399999f, 3.075002f, 0.675000f);
                    }, 80, 0),
                    
                    // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-64.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.399999f, 3.075002f, 0.675000f);
                }, 110, 0),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.399999f, 3.075002f, 0.675000f);
                }, 80, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-68.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(16.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.399999f, 2.975002f, 0.675000f);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-68.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.399999f, 2.975002f, 0.675000f);
                }, 75, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.399999f, 2.975002f, 0.675000f);
                }, 80, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.399999f, 2.975002f, 0.675000f);
                }, 110, 0),
                
                // gun rotates left - right hand grabs action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(33.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.025000f, 2.874999f, -0.125000f);
                }, 360, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-4.800000f, 1f, 0f, 0f);
                    GL11.glRotatef(31.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(29.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.025000f, 2.874999f, -0.125000f);
                }, 80, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-5.100000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.100000f, 0f, 1f, 0f);
                    GL11.glRotatef(31.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.025000f, 2.874999f, -0.125000f);
                }, 100, 0),
                
                // right hand pulls action half way
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(33.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.025000f, 2.874999f, 0.105000f);
                }, 250, 0),
                
                // right hand finishes pulling
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(36.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.025000f, 2.874999f, 0.235000f);
                }, 90, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-9.200000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(32.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.025000f, 2.874999f, 0.245000f);
                }, 70, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-8.800000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.025000f, 2.874999f, 0.225000f);
                }, 90, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-8.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(34.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.025000f, 2.874999f, 0.228000f);
                }, 100, 0),
                
                // right hand lets go of action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.025000f, 2.874999f, -0.165000f);
                }, 100, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-4.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.025000f, 2.874999f, -0.115000f);
                }, 70, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-3.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(34.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.025000f, 2.874999f, -0.125000f);
                }, 80, 0)
            )
            
            .withFirstPersonPositioningUnloading(
            		
            		// left hand moves to lever
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-27.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.875000f, 2.554999f, -0.750000f);
                    }, 300, 80),
                    
                    // left hand pushes lever
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(4.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.875000f, 2.564999f, -0.750000f);
                    }, 120, 50),
                    
                    // left hand grabs mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.875000f, 2.534999f, -0.750000f);
                    }, 250, 0),
                    
                    // left hand drops mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.875000f, 2.774999f, -0.750000f);
                    }, 260, 0),
                    
                    // left hand drops mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.875000f, 2.654999f, -0.750000f);
                    }, 200, 0)
            )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AS50Action.getRenderablePart(),
            		// mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 400, 150),
            		
            		// mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 400, 150),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 300, 60),
                    
                    // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 100, 170),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                }, 350, 100),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 220, 200),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 220, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // gun rotates left - right hand grabs action
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // right hand pulls action half way
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, 0f, 0.8f);
                }, 450, 0),
                
                // right hand finishes pulling
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0f, 1.5f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0f, 1.5f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0f, 1.5f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0f, 1.5f);
                }, 450, 0),
                
                // right hand lets go of action
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0)
            )
                        
             .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AS50Action.getRenderablePart(),
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
                    
            .withFirstPersonCustomPositioningReloading(Magazines.AS50Mag,
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.5f, 2.5f);
                     	 GL11.glRotatef(50F, 1f, 0f, 0f);
                    }, 400, 150),
            		
            		// mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0.9f, -0.7f);
                   	 GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0.9f, -0.7f);
                   	 GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 300, 60),
                    
                    // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.9f, -0.7f);
               	 GL11.glRotatef(-20F, 1f, 0f, 0f);
                }, 100, 170),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                }, 350, 100),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 220, 200),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 220, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // gun rotates left - right hand grabs action
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // right hand pulls action half way
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // right hand finishes pulling
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // right hand lets go of action
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0)
            )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.AS50Mag,
            		new Transition((renderContext) -> {
                    }, 250, 1000),
                      new Transition((renderContext) -> {
                    	  GL11.glTranslatef(0f, 0.9f, -0.7f);
                        	 GL11.glRotatef(-20F, 1f, 0f, 0f);
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    	  GL11.glTranslatef(0f, 0.9f, -0.7f);
                        	 GL11.glRotatef(-20F, 1f, 0f, 0f);
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    	  GL11.glTranslatef(0f, 2.5f, 2.5f);
                      	 GL11.glRotatef(50F, 1f, 0f, 0f);
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    	  GL11.glTranslatef(0f, 2.5f, 2.5f);
                      	 GL11.glRotatef(50F, 1f, 0f, 0f);
                      }, 250, 1000)
                      )
                        
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.125000f, 1.949999f, -1.474999f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(-0.000000f, 2.375000f, -1.424999f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.150000f, 1.149999f, 0.175000f);
//                    }, 200, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.47F, 0.47F, 0.47F);
                        GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.47F, 0.47F, 0.47F);
                        GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.47F, 0.47F, 0.47F);
                        GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.47F, 0.47F, 0.47F);
                        GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.47F, 0.47F, 0.47F);
                        GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 60),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                    GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 100, 170),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                    GL11.glTranslatef(-3.8F, -2F, 4F);
                    GL11.glRotatef(-60F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 350, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                    GL11.glTranslatef(-3.8F, -2F, 4F);
                    GL11.glRotatef(-60F, 0f, 1f, 0f);
                    GL11.glRotatef(100F, 1f, 0f, 0f);
                }, 220, 200),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                    GL11.glTranslatef(-3.8F, -2F, 4F);
                    GL11.glRotatef(-60F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 220, 0)
//                }, 100, 0)
            )
            
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.AS50Action.getRenderablePart(),
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
                        GL11.glTranslatef(0f, 0f, 1.3f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(32F, 0f, 1f, 0f);
                        GL11.glRotatef(15f, 0f, 0f, 1f);
                        GL11.glRotatef(8f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.4f, 2.8f, -0.4f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(34F, 0f, 1f, 0f);
                        GL11.glRotatef(15f, 0f, 0f, 1f);
                        GL11.glRotatef(4f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.4f, 2.6f, -0.3f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(37F, 0f, 1f, 0f);
                        GL11.glRotatef(15f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.5f, 2.500000f, -0.3f);
                    }, 390, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(10f, 0f, 0f, 1f);
                        GL11.glRotatef(-2f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.5f, 2.500000f, -0.1f);
                    }, 280, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(14f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.5f, 2.500000f, -0.3f);
                    }, 280, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.AS50Action.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 1.3f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
              
            .withFirstPersonPositioningZooming((renderContext) -> {
//                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glTranslatef(0.07f, 2.3f, -0.5f);
                
                GL11.glScalef(2.5f, 2.5f, 2.5f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glTranslatef(0.12f, 2.175f, -0.525000f);
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.23f, 0.7f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.007F, 0.27f, 1.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.135f, 1.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.25f, 0.8f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.26f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.26f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.2f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.21f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.225f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.225f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.225f, 0.7f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.24f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.22f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.22f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.17f, 0.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
//                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glTranslatef(-0.2f, 2.3f, -0.45f);
//                GL11.glRotatef(5F, 0f, 0f, 1f);
                
            	GL11.glScalef(2.5f, 2.5f, 2.5f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glTranslatef(0.12f, 2.175f, -0.125000f);
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.23f, 0.5f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.007F, 0.27f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.135f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.25f, 0.8f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.26f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.26f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.2f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.21f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.225f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.225f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.225f, 0.7f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.24f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.22f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.22f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.17f, 0.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(1f, 1f, 1f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.300000f, 1.699999f, -0.075000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-2f, 1.7f, -1.5f);
             })
             
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-2f, 1.7f, -1.5f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                         
//                         GL11.glScalef(4.5f, 4.5f, 4.5f);
//                         GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
//                         GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
//                         GL11.glRotatef(20.000000f, 0f, 0f, 1f);
//                         GL11.glTranslatef(0.500000f, -0.175000f, -0.125000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                         
//                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                     })
                     
            .withFirstPersonHandPositioningProning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.12f, -0.4f, -0.250000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.650000f, 0.100000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(5f, 5f, 5f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.050000f, -0.4f, 0.075000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                     })
            
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.4f, 0.075000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
            		
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.175000f, -0.125000f);
                    }, 400, 150),
            		
            		// mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.025000f, -0.275000f, -0.025000f);
                    }, 400, 150),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.025000f, -0.275000f, -0.025000f);
                    }, 300, 60),
                    
                    // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.025000f, -0.275000f, -0.025000f);
                }, 100, 170),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.200000f, -0.300000f, -0.100000f);
                }, 350, 100),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.200000f, -0.300000f, -0.100000f);
                }, 220, 200),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.200000f, -0.300000f, -0.100000f);
                }, 220, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.200000f, -0.300000f, -0.100000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.200000f, -0.300000f, -0.100000f);
                }, 450, 0),
                
                // gun rotates left - right hand grabs action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                }, 450, 0),
                
                // right hand pulls action half way
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                }, 450, 0),
                
                // right hand finishes pulling
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                }, 450, 0),
                
                // right hand lets go of action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                }, 450, 0)
            )
                    
            .withFirstPersonRightHandPositioningReloading(
            		
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    }, 400, 150),
            		
            		// mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    }, 400, 150),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    }, 300, 60),
                    
                    // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                     GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                }, 100, 170),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                     GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                }, 350, 100),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                     GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                }, 220, 200),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                     GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                }, 220, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                     GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                     GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                }, 450, 0),
                
                // gun rotates left - right hand grabs action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.050000f, 0.025000f, 0.075000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.050000f, 0.025000f, 0.075000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.050000f, 0.025000f, 0.075000f);
                }, 450, 0),
                
                // right hand pulls action half way
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.025000f, -0.125000f, 0.100000f);
                }, 450, 0),
                
                // right hand finishes pulling
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.025000f, -0.225000f, 0.075000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.025000f, -0.225000f, 0.075000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.025000f, -0.225000f, 0.075000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.025000f, -0.225000f, 0.075000f);
                }, 450, 0),
                
                // right hand lets go of action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.200000f, -0.350000f, 0.075000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.200000f, -0.350000f, 0.075000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.200000f, -0.350000f, 0.075000f);
                }, 450, 0)
            )
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, -0.300000f, -0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.025000f, -0.275000f, -0.025000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.025000f, -0.275000f, -0.025000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.175000f, -0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.175000f, -0.125000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0f, -0.15f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.55f, -0.35f, 0.2f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(3.5f, 3.5f, 3.5f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.250000f, -0.175000f, 0.225000f);
//                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.050000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.050000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.050000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.050000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.050000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.050000f, 0.175000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.150000f, 0.100000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.150000f, 0.100000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.150000f, 0.100000f);
                    }, 280, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 5f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
//                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.100000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-58.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-23.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.100000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-59.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-21.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.100000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.100000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.100000f, 0.125000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.100000f, 0.125000f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.100000f, 0.275000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.175000f, 0.275000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.100000f, 0.275000f);
                    }, 300, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, 0.075000f, 0.025000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, 0.000000f, -0.225000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.250000f, -0.100000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, 0.000000f, -0.225000f);
                    }, 280, 0)
                    )
                    
            
                    
            .build())
        .withSpawnEntityDamage(25f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(MWC.modContext);
    }
}
