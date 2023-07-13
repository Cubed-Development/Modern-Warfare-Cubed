package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class APC9Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		
		.withName("apc9")
		//.withAmmoCapacity(30)
		.withFireRate(0.85f)
		.withRecoil(2f)
		.withZoom(0.9f)
		.withConfigGroup(GunConfigurationGroup.SMG)
		.withMaxShots(1, Integer.MAX_VALUE)
		.withShootSound("apc9")
		.withSilencedShootSound("mp5_silenced")
		.withReloadSound("mpx_reload")
		.withUnloadSound("mpx_unload")
		.withEndOfShootSound("gun_click")
		.withInspectSound("inspection")
		.withDrawSound("noaction_draw")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.5f)
		.withFlashScale(() -> 0.6f)
		.withFlashOffsetX(() -> 0.12f)
		.withFlashOffsetY(() -> 0.15f)
		.withShellCasingForwardOffset(0.05f)
		.withShellCasingVerticalOffset(-0.03f)
		.withInaccuracy(1f)
//		.withShellCasingEjectEnabled(false)
		.withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
		.withInformationProvider(stack -> Arrays.asList(
		"Type: Submachine Gun", 
		"Damage: 5", 
		"Cartridge: 9x19mm",
		"Fire Rate: SEMI, AUTO",
		"Rate of Fire: 85/100",
		"Magazines:",
        "30rnd 9x19mm APC9 Magazine"))
		 
		 .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 0.1f, // y
                 3f) // z
		 
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.APC9Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.APC9Action, true, (model) -> {
//          GL11.glTranslatef(-0.175F, -1.58F, -0.86F);
//          GL11.glScaled(0.75F, 0.43F, 0.75F);
      })
		.withCompatibleAttachment(Magazines.APC9Mag, (model) -> {
//		    GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
//            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
		.withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.Mk18HandGuard) {
                    GL11.glTranslatef(0F, 0F, -0.6F);
                    GL11.glScaled(1F, 1F, 1F);
                } else if(activeAttachment == Attachments.M38HandGuard) {
                    GL11.glTranslatef(0F, 0F, -0.4F);
                    GL11.glScaled(1F, 1F, 1F);
                } else if(activeAttachment == Attachments.M16A4HandGuard) {
                    GL11.glTranslatef(0F, 0F, -1.2F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof MBUSFrontSight) {
            	GL11.glTranslatef(-0.16F, -1.8F, -2.5F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
              }
        }, true, false)
		.withCompatibleAttachment(Attachments.MBUSRearSights, true, (model) -> {
	           if(model instanceof MBUSRearSight) {
	        	   GL11.glTranslatef(-0.159F, -1.8F, -0.1F);
	               GL11.glScaled(0.35F, 0.35F, 0.35F);
	           }
	       })
		.withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.215F, -1.645F, -3.65f);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail2) {
            	GL11.glTranslatef(-0.23F, -1.6F, -2.8f);
                GL11.glScaled(0.8F, 0.8F, 1.2F);
            } else if(model instanceof AKRail3) {
            	GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail4) {
            	GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail5) {
            	GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GL11.glTranslatef(-0.215F, -1.68F, -2.1F);
                    GL11.glScaled(0.85F, 0.85F, 0.85F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        
		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GL11.glTranslatef(-0.31F, -1.73F, -0.7F);
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
                    GL11.glTranslatef(-0.195F, -1.35F, -1F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.15F, -2.3F, -1F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                } else if (model instanceof SightMount) {
//                	GL11.glTranslatef(-0.15F, -1.82F, -1F);
//                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }
            })
		
		.withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GL11.glTranslatef(-0.056F, -1.5F, -1.3F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
		},(model) -> {
            if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
			}
		})
		.withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
	                    GL11.glTranslatef(-0.05F, -1.47F, -1.3F);
	                    GL11.glScaled(0.53F, 0.53F, 0.53F);
			},(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
			})
		
		.withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GL11.glTranslatef(-0.025F, -1.54F, -1.2F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
			},(model) -> {
	            if(model instanceof Holo2) {
	                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
	                GL11.glScaled(0.1F, 0.1F, 0.1F);
	            }
	        })
		
		.withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
				 GL11.glTranslatef(-0.025F, -1.54F, -1.2F);
	             GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
				 GL11.glTranslatef(-0.025F, -1.54F, -1.2F);
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
	            GL11.glTranslatef(-0.335F, -1.76F, -1.4F);
	            GL11.glScaled(0.55F, 0.55F, 0.55F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
	    
		.withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GL11.glTranslatef(-0.026F, -1.54F, -1F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
		},(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		
		.withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
					GL11.glTranslatef(-0.026F, -1.54F, -1F);
		            GL11.glScaled(0.75F, 0.75F, 0.75F);
		},(model) -> {
		    if(model instanceof Reflex2) {
		        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
		    }
		})
		
		.withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GL11.glTranslatef(-0.183F, -1.74F, -1F);
                    GL11.glScaled(0.43F, 0.43F, 0.43F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
		
		.withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
					GL11.glTranslatef(-0.183F, -1.74F, -1F);
		            GL11.glScaled(0.43F, 0.43F, 0.43F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		.withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(-0.04F, -1.2F, -3.2F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
        	GL11.glTranslatef(-0.04F, -1.2F, -3.2F);
            GL11.glScaled(1F, 1F, 1F);
        })
		.withCompatibleAttachment(Attachments.Grip2, (model) -> {
			GL11.glTranslatef(-0.2F, -0.35F, -2.8F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.35F, -2.8F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.VGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.35F, -2.8F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
			GL11.glTranslatef(-0.2F, -1.235F, -4.8F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("apc9")
		.withRenderer(new WeaponRenderer.Builder()
			
			.withModel(new APC9())
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
			    GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glTranslatef(-1.7F, -0.8F, 1.9F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioning((renderContext) -> {
	                GL11.glRotatef(45F, 0f, 1f, 0f);
	                GL11.glRotatef(8F, 0f, 0f, 1f);
	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
	                GL11.glTranslatef(-0.300000f, 1.449999f, -0.925000f);
	                
//	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
//            		GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
//            		GL11.glRotatef(25.000000f, 0f, 1f, 0f);
//            		GL11.glRotatef(75.000000f, 0f, 0f, 1f);
//            		GL11.glTranslatef(0.900000f, 2.100000f, -1.075000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8F, 0f, 0f, 1f);
                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
                GL11.glTranslatef(-0.300000f, 1.449999f, -0.525000f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
            })
                
            .withFirstPersonPositioningProning((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(14F, 0f, 0f, 1f);
                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
                GL11.glTranslatef(-0.300000f, 1.259999f, -0.925000f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(14F, 0f, 0f, 1f);
                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
                GL11.glTranslatef(-0.300000f, 1.259999f, -0.525000f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
			
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.APC9Action.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.6F);
                }
            })
			
			.withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.APC9Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.6F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.APC9Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.6F);
                })
                
            .withFirstPersonCustomPositioning(Magazines.APC9Mag, (renderContext) -> {
//            	GL11.glTranslatef(0f, 0.5f, 0f);
                })
				
			.withFirstPersonPositioningReloading(
			        
					// mag is at bottom
					
			        new Transition((renderContext) -> {
			        	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			                GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
			                GL11.glRotatef(35.100000f, 0f, 1f, 0f);
			                GL11.glRotatef(-3.500000f, 0f, 0f, 1f);
			                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
                    }, 300, 0),
			        
			        //mag touches gun
			        
			        new Transition((renderContext) -> { 
			        	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			                GL11.glRotatef(-24.500000f, 1f, 0f, 0f);
			                GL11.glRotatef(34.900000f, 0f, 1f, 0f);
			                GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
			                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
                    }, 210, 0),
			        
			        new Transition((renderContext) -> { 
			        	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			                GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
			                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
			                GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
			                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
			        }, 60, 0),
			        
			        //mag gets pushed in
			        
			        new Transition((renderContext) -> {
			        	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			                GL11.glRotatef(-28.400000f, 1f, 0f, 0f);
			                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
			                GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
			                GL11.glTranslatef(-0.925000f, 1.58f, -0.725000f);
                    }, 100, 0),
			        
			        new Transition((renderContext) -> {
			        	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			                GL11.glRotatef(-27.500000f, 1f, 0f, 0f);
			                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
			                GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
			                GL11.glTranslatef(-0.925000f, 1.55f, -0.725000f);
			        }, 80, 0),
			        
			        new Transition((renderContext) -> {
			        	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			                GL11.glRotatef(-27.800000f, 1f, 0f, 0f);
			                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
			                GL11.glRotatef(-5.500000f, 0f, 0f, 1f);
			                GL11.glTranslatef(-0.925000f, 1.62f, -0.725000f);
			        }, 110, 0),
                    
                    // left hand goes left
                    
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
     	                GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
     	                GL11.glRotatef(35.300000f, 0f, 1f, 0f);
     	                GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
     	                GL11.glTranslatef(-0.925000f, 1.72f, -0.725000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> {
                   	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
    	                GL11.glRotatef(-23.500000f, 1f, 0f, 0f);
    	                GL11.glRotatef(35.300000f, 0f, 1f, 0f);
    	                GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
    	                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
                   }, 80, 0),
                    
                    // left hand hits button thingy thing
                    
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
     	                GL11.glRotatef(-23.500000f, 1f, 0f, 0f);
     	                GL11.glRotatef(35.300000f, 0f, 1f, 0f);
     	                GL11.glRotatef(2.000000f, 0f, 0f, 1f);
     	                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
                    }, 50, 0),
                    
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
     	                GL11.glRotatef(-23.500000f, 1f, 0f, 0f);
     	                GL11.glRotatef(35.300000f, 0f, 1f, 0f);
     	                GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
     	                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
     	                GL11.glRotatef(-23.500000f, 1f, 0f, 0f);
     	                GL11.glRotatef(35.300000f, 0f, 1f, 0f);
     	                GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
     	                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
                    }, 80, 0)
			        )
			        
			.withFirstPersonPositioningUnloading(
			        
			        new Transition((renderContext) -> {
			        	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			                GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
			                GL11.glRotatef(0.000000f, 0f, 1f, 0f);
			                GL11.glRotatef(70.000000f, 0f, 0f, 1f);
			                GL11.glTranslatef(0.450000f, 1.949999f, -0.450000f);
                    }, 190, 0),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			        	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(10.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(78.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.475000f, 3.125003f, -0.425000f);
                    }, 100, 0),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			        	GL11.glRotatef(-8.300000f, 1f, 0f, 0f);
			        	GL11.glRotatef(9.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(74.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.44f, 3.135003f, -0.425000f);
                    }, 70, 0),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			        	GL11.glRotatef(-7.500000f, 1f, 0f, 0f);
			        	GL11.glRotatef(8.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(71.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.44f, 3.125003f, -0.425000f);
                    }, 100, 0)
                    )
			
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.APC9Action.getRenderablePart(),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 0.6F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 0.6F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 0.6F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 0.6F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 0.6F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 0.6F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 0.6F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 0.6F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 0.6F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.APC9Action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 0.6F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 0.6F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 0.6F);
                }, 250, 1000)
                    )
                    
			.withFirstPersonCustomPositioningReloading(Magazines.APC9Mag,
					new Transition((renderContext) -> {
						GL11.glTranslatef(0F, 2.5F, 0F);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.5f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.5f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.APC9Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2.5F, 0F);
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    	  GL11.glTranslatef(0F, 2.5F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2.5F, 0F);
                  }, 250, 1000)
                    )
					
		    .withFirstPersonPositioningInspecting(
		    		new Transition((renderContext) -> {
		    			GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
		                GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-1.300000f, 1.600000f, -0.575000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                		GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
                		GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                		GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                		GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                		GL11.glTranslatef(0.900000f, 2.100000f, -1.075000f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 180, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 100),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 170),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 10),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 100, 50)
                    )
                    
                    
            .withFirstPersonPositioningDrawing(
            		new Transition((renderContext) -> { // Reload position
            			GL11.glRotatef(45F, 0f, 1f, 0f);
    	                GL11.glRotatef(16F, 0f, 0f, 1f);
    	                GL11.glRotatef(25F, 1f, 0f, 0f);
    	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
    	                GL11.glTranslatef(-0.300000f, 1.449999f, -0.925000f);
                    }, 60, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
    	                GL11.glRotatef(14F, 0f, 0f, 1f);
    	                GL11.glRotatef(17F, 1f, 0f, 0f);
    	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
    	                GL11.glTranslatef(-0.300000f, 1.449999f, -0.925000f);
                    }, 60, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
    	                GL11.glRotatef(12F, 0f, 0f, 1f);
    	                GL11.glRotatef(10F, 1f, 0f, 0f);
    	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
    	                GL11.glTranslatef(-0.300000f, 1.449999f, -1.125000f);
                    }, 140, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
    	                GL11.glRotatef(10F, 0f, 0f, 1f);
    	                GL11.glRotatef(4F, 1f, 0f, 0f);
    	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
    	                GL11.glTranslatef(-0.300000f, 1.449999f, -0.905000f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
    	                GL11.glRotatef(8F, 0f, 0f, 1f);
    	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
    	                GL11.glTranslatef(-0.300000f, 1.449999f, -0.925000f);
                    }, 170, 0)
                    )
			
            .withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(0.347f, 1.338f, -0.3f);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                        GL11.glTranslatef(0F, -0.03f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        GL11.glTranslatef(0F, 0.02f, 0.3f);
				} 
				
				// Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                	 GL11.glTranslatef(-0.003F, 0f, 0.3f);
                } 
                
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					 GL11.glTranslatef(-0.003F, 0.04f, 0.6f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        GL11.glTranslatef(-0.003F, -0.02f, 0.4f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        GL11.glTranslatef(0F, -0.02f, 0.3f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                		GL11.glTranslatef(0F, -0.035f, 0.3f);
                } 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
						GL11.glTranslatef(0F, 0.04f, 0.3f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                		GL11.glTranslatef(0F, 0.04f, 0.3f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                		GL11.glTranslatef(0F, 0.04f, 0.15f);
                } 
				
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                		GL11.glTranslatef(0F, 0.08f, 0.3f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
						GL11.glTranslatef(0F, 0.04f, 0.3f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
						GL11.glTranslatef(0F, 0.04f, 0.3f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                		GL11.glTranslatef(0F, 0.03f, 0.3f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                		GL11.glTranslatef(0F, 0.03f, 0.3f);
                } 
				
				// Everything else
				else {
				}
				
			
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(0.347f, 1.338f, -0.1f);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                        GL11.glTranslatef(0F, -0.03f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        GL11.glTranslatef(0F, 0.02f, 0.3f);
				} 
				
				// Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                	 GL11.glTranslatef(-0.003F, 0f, 0.2f);
                } 
                
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					 GL11.glTranslatef(-0.003F, 0.04f, 0.5f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        GL11.glTranslatef(-0.003F, -0.02f, 0.3f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        GL11.glTranslatef(0F, -0.02f, 0.3f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                		GL11.glTranslatef(0F, -0.035f, 0.3f);
                } 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
						GL11.glTranslatef(0F, 0.04f, 0.3f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                		GL11.glTranslatef(0F, 0.04f, 0.3f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                		GL11.glTranslatef(0F, 0.04f, 0.05f);
                } 
				
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                		GL11.glTranslatef(0F, 0.08f, 0.3f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
						GL11.glTranslatef(0F, 0.04f, 0.3f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
						GL11.glTranslatef(0F, 0.04f, 0.3f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                		GL11.glTranslatef(0F, 0.03f, 0.3f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                		GL11.glTranslatef(0F, 0.03f, 0.3f);
                } 
				
				// Everything else
				else {
				}
				
			
				})
				
				
			.withFirstPersonPositioningRunning((renderContext) -> {
				GL11.glScalef(1.50000f, 1.500000f, 1.500000f);
                GL11.glRotatef(12.000000f, 1f, 0f, 0f);
                GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.300000f, 1.299999f, -0.525000f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.925000f, 1.10000f, -0.800000f);
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.825000f, 1.00000f, -0.700000f);
             })
			 
			 .withFirstPersonHandPositioning(
			         (renderContext) -> {
                         RenderContext<?> rc = (RenderContext<?>) renderContext;
                         ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                 AttachmentCategory.GRIP, rc.getWeaponInstance());
                         if(activeAttachment == Attachments.Grip2 ||
                                activeAttachment == Attachments.StubbyGrip || 
                                activeAttachment == Attachments.VGrip) {
                        	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                        	 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        	 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        	 GL11.glTranslatef(0.350000f, -0.075000f, 0.020000f);
                         } else if(activeAttachment == Attachments.AngledGrip) {
                        	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                        	 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        	 GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        	 GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        	 GL11.glTranslatef(0.425000f, -0.150000f, -0.025000f);
                         } else {
                             GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.285000f, -0.390000f, -0.015000f);
                             
//                             GL11.glScalef(4f, 4f, 4f);
                         }
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.385000f, -0.400000f, 0.200000f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 ||
                               activeAttachment == Attachments.StubbyGrip || 
                               activeAttachment == Attachments.VGrip) {
                       	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                       	 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.350000f, -0.075000f, 0.020000f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                       	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                       	 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.425000f, -0.150000f, -0.025000f);
                        } else {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.250000f, -0.290000f, 0.110000f);
                            
//                            GL11.glScalef(4f, 4f, 4f);
                        }
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.425000f, 0.150000f);
                    })
					 
			.withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, 0.025000f, 0.250000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })
                     
            .withFirstPersonHandPositioningModifyingAlt(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, 0.025000f, 0.250000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.425000f, 0.150000f);
                     })
					 
			.withFirstPersonLeftHandPositioningReloading(
			        
					// mag is at bottom
					
			        new Transition((renderContext) -> {
			        	GL11.glScalef(4f, 4f, 4f);
			        	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.650000f, -0.525000f, 0.275000f);
			        	
                    }, 300, 0),
			        
			        //mag touches gun
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(4f, 4f, 4f);
			        	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.250000f, -0.425000f, 0.050000f);
                    }, 210, 0),
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(4f, 4f, 4f);
			        	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.250000f, -0.425000f, 0.050000f);
			        }, 40, 0),
			        
			        //mag gets pushed in
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.050000f);
                    }, 120, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.050000f);
			        }, 60, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.050000f);
			        }, 90, 0),
                    
                    // left hand goes left
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.425000f, 0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.425000f, 0.100000f);
                    }, 250, 0),
                    
                    // left hand hits button thingy thing
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.425000f, 0.100000f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.425000f, 0.100000f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.425000f, 0.100000f);
                    }, 80, 0)
			        )
					
			.withFirstPersonRightHandPositioningReloading(
			       
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 1000),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 1000),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 1000),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 1000),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 1000),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 1000),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 50),
					new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.025000f, 0.275000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, 0.000000f, 0.200000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, 0.000000f, 0.200000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.450000f, -0.475000f, 0.100000f);
                    }, 250, 50)
                    )
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.075000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                    }, 250, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.150000f, 0.375000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.285000f, -0.390000f, -0.015000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.285000f, -0.390000f, -0.015000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.285000f, -0.390000f, -0.015000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.285000f, -0.390000f, -0.015000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.285000f, -0.390000f, -0.015000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
            		new Transition((renderContext) -> { // Reload position
            			 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.385000f, -0.400000f, 0.200000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.385000f, -0.400000f, 0.200000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.385000f, -0.400000f, 0.200000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.385000f, -0.400000f, 0.200000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.385000f, -0.400000f, 0.200000f);
                    }, 110, 0)
                    )
					
			.build())
		.withSpawnEntityDamage(5f)
		.withSpawnEntityGravityVelocity(0.0118f)
				
		 
		.build(MWC.modContext);
	}
}
