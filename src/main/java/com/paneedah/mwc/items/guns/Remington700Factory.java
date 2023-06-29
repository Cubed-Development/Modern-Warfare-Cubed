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

public class Remington700Factory implements GunFactory {

    @SuppressWarnings("unchecked")
	public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("remington_700")
        .withFireRate(0.16f)
        .withEjectRoundRequired()
        .withEjectSpentRoundSound("r700_boltaction")
        .withRecoil(10f)
        .withZoom(0.8f)
        .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
        .withMaxShots(1)
        .withShootSound("r700")
        .withPumpTimeout(1100)
        .withSilencedShootSound("snipersilencer")
        .withReloadSound("r700_reload")
        .withUnloadSound("r700_unload")
        .withInspectSound("inspection")
        .withDrawSound("ax50_draw")
        .withReloadingTime(40)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.8f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.14f)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Precision Sniper Rifle",
        "Damage: 14", 
        "Cartridge: 7.62x54mm",
        "Fire Rate: BOLT ACTION",
        "Rate of Fire: 16/100",
        "Magazines:",
        "5rnd 7.62x54mm M700 Magazine",
        "10rnd 7.62x54mm M700 Magazine"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 6f, // y
                 10f) // z
         
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCompatibleAttachment(Magazines.R700Mag, (model) -> {
//        	GL11.glTranslatef(0f, 0.2f, 0f);
//        	GL11.glRotatef(-20f, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Magazines.R700Mag10rnd, (model) -> {
//        	GL11.glTranslatef(0f, 0.2f, 0f);
//        	GL11.glRotatef(-20f, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Remington700BoltAction, true, (model) -> {
//        	GL11.glTranslatef(-0.105F, -0.585F, 0.63F);
//            GL11.glScalef(0.62f, 0.62f, 0.5f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Remington700BoltActionMain, true, (model) -> {
//        	GL11.glTranslatef(-0.105F, -0.585F, 0.63F);
//            GL11.glScalef(0.62f, 0.62f, 0.5f);
        })
        .withCompatibleAttachment(Attachments.Remington700Chassis, true, (model) -> {
//          GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
//          GL11.glRotatef(70f, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.Remington700APACChassis, (model) -> {
//          GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
//          GL11.glRotatef(70f, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.Remington700MDTXRSChassis, (model) -> {
//          GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
//          GL11.glRotatef(70f, 0f, 0f, 1f);
        })


		.withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
		            GL11.glTranslatef(-0.155F, -0.75F, -0.8F);
		            GL11.glScaled(0.65F, 0.65F, 0.65F);
		},(model) -> {
		    if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
		        GL11.glScaled(0.03F, 0.03F, 0.03F);
		    }
		})
		
		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
		            GL11.glTranslatef(-0.225F, -0.77F, 0.3F);
		            GL11.glScaled(0.6F, 0.6F, 0.6F);
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
		            GL11.glTranslatef(-0.135F, -0.5F, -0.1F);
		            GL11.glScaled(0.35F, 0.35F, 0.35F);
		},(model) -> {
		    if(model instanceof Acog2) {
		        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
		        GL11.glScaled(0.1F, 0.1F, 0.1F);
		    }
		})
		
		.withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.105F, -0.62F, -0.6F);
		            GL11.glScaled(0.35F, 0.35F, 0.35F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
		
		.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(-0.1F, -1.12F, -0.2F);
		    GL11.glScaled(0.25F, 0.25F, 0.25F);
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
		            GL11.glTranslatef(-0.036F, -0.6F, -0.2F);
		            GL11.glScaled(0.35F, 0.35F, 0.35F);
		},(model) -> {
		    if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
			}
		})
		.withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
		                GL11.glTranslatef(-0.036F, -0.585F, -0.2F);
		                GL11.glScaled(0.38F, 0.38F, 0.38F);
			},(model) -> {
		    if(model instanceof Reflex2) {
		        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
		    }
			})
		
		.withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
		            GL11.glTranslatef(-0.01F, -0.63F, -0.1F);
		            GL11.glScaled(0.55F, 0.55F, 0.55F);
			},(model) -> {
		        if(model instanceof Holo2) {
		            GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
		            GL11.glScaled(0.1F, 0.1F, 0.1F);
		        }
		    })
		
		.withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
			GL11.glTranslatef(-0.01F, -0.63F, -0.1F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
		},(model) -> {
		    if(model instanceof Holo2) {
		        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
		        GL11.glScaled(0.1F, 0.1F, 0.1F);
		    }
		})
		
		.withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
			GL11.glTranslatef(-0.01F, -0.63F, -0.3F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
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
		    GL11.glTranslatef(-0.22F, -0.8F, -0.2F);
		    GL11.glScaled(0.35F, 0.35F, 0.35F);
		},(model) -> {
		    if(model instanceof Holo2) {
		        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
		    }
		})
		
		.withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
		            GL11.glTranslatef(-0.015F, -0.63F, -0F);
		            GL11.glScaled(0.55F, 0.55F, 0.55F);
		},(model) -> {
		    if(model instanceof Reflex2) {
		        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
		    }
		})
		
		.withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
		        	 GL11.glTranslatef(-0.015F, -0.63F, -0F);
			            GL11.glScaled(0.55F, 0.55F, 0.55F);
		},(model) -> {
		    if(model instanceof Reflex2) {
		        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
		    }
		})
		
		.withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
		            GL11.glTranslatef(-0.12F, -0.77F, -0F);
		            GL11.glScaled(0.28F, 0.28F, 0.28F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        }
		    })
		
		.withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
			GL11.glTranslatef(-0.12F, -0.77F, -0F);
            GL11.glScaled(0.28F, 0.28F, 0.28F);
		},(model) -> {
		    if(model instanceof Reflex2) {
		        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
		    }
		})
		.withCompatibleAttachment(Attachments.AimpointCompM2, (player, stack) -> {
            GL11.glTranslatef(-0.08F, -0.26F, 0.3F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.005F, -0.89F, -1.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withTextureNames("remington700")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new Remington700())
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
            	GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-0.9F, 0.4F, 1F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.075000f, 0.250000f, -1.125000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glRotatef(4f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.075000f, 0.250000f, -0.325000f);
                 GL11.glRotatef(-2f, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.5f, 1.4f, -1.4f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.5f, 1.4f, -1.2f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(), (renderContext) -> {
            
//            	GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
//                GL11.glRotatef(90F, 0f, 0f, 1f);
//                GL11.glScalef(1f, 1f, 1f); 
                
//            	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
//                  GL11.glRotatef(90F, 0f, 0f, 1f);
//                  GL11.glScalef(1f, 1f, 1f);
            
            })
                
            .withFirstPersonPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.080000f, 0.260000f, -0.995000f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.120000f, 0.300000f, -0.998000f);
                    }, 110, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.120000f, 0.300000f, -0.998000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.300000f, -0.775000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.300000f, -0.795000f);
                    }, 20, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.300000f, -0.785000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.280000f, -0.975000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.250000f, -0.995000f);
                    }, 80, 0)
                    
                    )
            
            .withFirstPersonPositioningEjectSpentRoundAimed(
            		new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.260000f, -0.995000f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.300000f, -0.998000f);
                    }, 110, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.300000f, -0.998000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.300000f, -0.775000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.300000f, -0.795000f);
                    }, 20, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.300000f, -0.785000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.280000f, -0.975000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.250000f, -0.995000f);
                    }, 80, 0)
                    
                    )
            
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
            
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.Remington700BoltActionMain.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0F, -0F, 0.5F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0F, -0F, 0.5F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0F, -0F, 0.5F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0F, -0F, 0.5F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
            
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
            
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.Remington700BoltActionMain.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0F, -0F, 0.5F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0F, -0F, 0.5F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0F, -0F, 0.5F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0F, -0F, 0.5F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(),
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
                    new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Remington700BoltActionMain.getRenderablePart(),
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
                    new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0F, -0F, 0.5F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0F, -0F, 0.5F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0F, -0F, 0.5F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                    
                
             .withFirstPersonPositioningReloading(
            		 
            		// reload
            		 
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-9.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.225000f, -0.950000f);
                     }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.235000f, -0.950000f);
                    }, 350, 130),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.215000f, -0.950000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-10.500000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.215000f, -0.950000f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.215000f, -0.950000f);
                    }, 60, 0),
                    
                    // bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.260000f, -0.995000f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.300000f, -0.998000f);
                    }, 110, 70),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.300000f, -0.775000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.300000f, -0.795000f);
                    }, 20, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.300000f, -0.785000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.280000f, -0.975000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.250000f, -0.995000f);
                    }, 80, 0)
                    
                    )
                    
            .withFirstPersonPositioningUnloading(
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.135000f, -0.950000f);
                     }, 220, 0),
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.245000f, -0.950000f);
                     }, 100, 0),
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.225000f, -0.950000f);
                     }, 270, 0))
            
            .withFirstPersonCustomPositioningReloading(Magazines.R700Mag,
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 3f, 0f);
                    	GL11.glRotatef(15f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0.2f, 0f);
                    	GL11.glRotatef(-20f, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.R700Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0.2f, 0f);
                    	GL11.glRotatef(-20f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 3f, 0f);
                    	GL11.glRotatef(15f, 1f, 0f, 0f);
                    }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningReloading(Magazines.R700Mag10rnd,
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 3f, 0f);
                    	GL11.glRotatef(15f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0.2f, 0f);
                    	GL11.glRotatef(-20f, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.R700Mag10rnd,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0.2f, 0f);
                    	GL11.glRotatef(-20f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 3f, 0f);
                    	GL11.glRotatef(15f, 1f, 0f, 0f);
                    }, 250, 1000)
                    )
                        
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, 0.125000f, -0.925000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                	  GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                	  GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                	  GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                	  GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                	  GL11.glTranslatef(-0.050000f, 0.450000f, -0.900000f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-3.3F, 0.2F, 3F);
                         GL11.glRotatef(-70F, 0f, 1f, 0f);
                         GL11.glRotatef(95F, 1f, 0f, 0f);
                         GL11.glRotatef(10F, 0f, 0f, 1f);
                     }, 370, 50),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-3.3F, -0.2F, 3.3F);
                         GL11.glRotatef(-70F, 0f, 1f, 0f);
                         GL11.glRotatef(100F, 1f, 0f, 0f);
                         GL11.glRotatef(10F, 0f, 0f, 1f);
                     }, 200, 100),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-3.3F, -0.2F, 3.3F);
                         GL11.glRotatef(-70F, 0f, 1f, 0f);
                         GL11.glRotatef(100F, 1f, 0f, 0f);
                         GL11.glRotatef(10F, 0f, 0f, 1f);
                     }, 140, 100),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-2.5F, 0F, 3F);
                         GL11.glRotatef(-45F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 270, 0),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-2.5F, 0F, 3F);
                         GL11.glRotatef(-45F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 240, 0),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-2.5F, 0F, 3F);
                         GL11.glRotatef(-45F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 500, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.52F, 0.52F, 0.52F);
                        GL11.glTranslatef(-2.5F, 0F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.52F, 0.52F, 0.52F);
                        GL11.glTranslatef(-3.3F, -0.2F, 3.3F);
                        GL11.glRotatef(-70F, 0f, 1f, 0f);
                        GL11.glRotatef(100F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 280, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.52F, 0.52F, 0.52F);
                        GL11.glTranslatef(-3.3F, -0.2F, 3.3F);
                        GL11.glRotatef(-70F, 0f, 1f, 0f);
                        GL11.glRotatef(100F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 220, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.52F, 0.52F, 0.52F);
                        GL11.glTranslatef(-3.3F, 0.2F, 3F);
                        GL11.glRotatef(-70F, 0f, 1f, 0f);
                        GL11.glRotatef(95F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 160, 0))
            
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(16.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, 0.350000f, -0.925000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(14.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, 0.320000f, -0.925000f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(12.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(24.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(18.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, 0.280000f, -0.925000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    	 GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(30F, 0f, 1f, 0f);
                         GL11.glRotatef(16f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.075000f, 0.240000f, -1.025000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    	 GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(40F, 0f, 1f, 0f);
                         GL11.glRotatef(12f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.075000f, 0.200000f, -1.065000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glRotatef(8f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.075000f, 0.200000f, -1.125000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glRotatef(4f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.075000f, 0.200000f, -1.025000f);
                    }, 100, 0)
                    
                    )
            
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                  	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                  	  GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                  
                  )
            
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.Remington700BoltActionMain.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                  	  GL11.glTranslatef(-0F, -0F, 0.5F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                  
                  )
              
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glTranslatef(0.309f, 0.21f, -0.7f);
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.14f, 0.15f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.14f, 0.3f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.085f, 0.4f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.09f, 0.2f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.1f, 0.2f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.08f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.08f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.15f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.15f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.14f, 0.25f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.15f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.14f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.14f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.005F, 0.11f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.005F, 0.11f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0F, 0.11f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glTranslatef(0.309f, 0.21f, -0.6f);
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                	 GL11.glTranslatef(0F, 0.14f, 0.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.14f, 0.25f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.085f, 0.35f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.09f, 0.15f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.1f, 0.2f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.08f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.08f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.15f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.15f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.14f, 0.2f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.15f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.14f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.14f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.005F, 0.11f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.005F, 0.11f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0F, 0.11f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
            	GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                GL11.glRotatef(12.000000f, 1f, 0f, 0f);
                GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(0.325000f, -0.525000f, -0.675000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
            	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.175000f, 0.125000f, -0.925000f);
             })
             
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
            	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.175000f, 0.125000f, -0.925000f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.260000f, -0.415000f, 0.290000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    	 
//                    	 GL11.glScalef(3f, 3f, 3f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
            			GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.260000f, -0.415000f, 0.290000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
            		(renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    })
                     
            .withFirstPersonHandPositioningModifyingAlt(
            		(renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    })
            
            .withFirstPersonLeftHandPositioningReloading(
            		
            		// reload
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.350000f, -1.199999f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.000000f, -1.000000f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.050000f, -0.875000f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.050000f, -0.875000f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.050000f, -0.875000f, 0.250000f);
                    }, 50, 200),
                    
                    // bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.625000f, -0.600000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.325000f, -0.600000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.050000f, -0.875000f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.000000f, -1.000000f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.350000f, -1.199999f, 0.250000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                   }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.625000f, -0.600000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.325000f, -0.600000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200))
            
            .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                   }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
            		new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.625000f, -0.600000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.325000f, -0.600000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                      	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                      	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
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
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
            		new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.325000f, -0.600000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200))
                    
            .build())
        .withSpawnEntityDamage(14f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(MWC.modContext);
    }
}
