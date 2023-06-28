package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class ScorpionEVO3A1Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		
		.withName("scorpion_evo3_a1")
		//.withAmmoCapacity(30)
		.withFireRate(0.999f)
		.withRecoil(1.5f)
		.withZoom(0.9f)
		.withConfigGroup(GunConfigurationGroup.SMG)
		.withShellType(Type.PISTOL)
		.withMaxShots(1, Integer.MAX_VALUE)
		.withShootSound("scorpion")
		.withSilencedShootSound("m4a1_silenced")
		.withReloadSound("scorpion_reload")
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
//		.withShellCasingEjectEnabled(false)
		.withInaccuracy(2f)
		.withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
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
		.withInformationProvider(stack -> Arrays.asList(
		"Type: Pistol Caliber Carbine/ Submachine Gun", 
		"Damage: 5", 
		"Cartridge: 9x19mm",
		"Fire Rate: SEMI, AUTO",
		"Rate of Fire: 99/100",
		"Magazines:",
        "30rnd 9x19mm EVO Magazine"))
		 
		 .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 0.1f, // y
                 2.5f) // z
		 
		 .withModernRecipe( new
	        		CraftingEntry(MWCItems.carbonComposite, 7), new
	        		CraftingEntry(MWCItems.gunmetalPlate, 7), new
	        		CraftingEntry(MWCItems.steelIngot, 4))
		 
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.ScorpionRearSight, true, (model) -> {
            GL11.glTranslatef(-0.117f, -2.37f, -0.8f);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        })
        .withCompatibleAttachment(Attachments.ScorpionFrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.ScorpionHandguardLong) {
                	GL11.glTranslatef(-0.117f, -2.37f, -3.5f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                } else {
                	GL11.glTranslatef(-0.117f, -2.37f, -2f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }
            }
        },(model) -> {
            if(model instanceof G95_upright_frontsights) {
            	GL11.glTranslatef(-0.155F, -1.55F, -3.3F);
                GL11.glScaled(0.32F, 0.32F, 0.32F);
              }
        }, true, false)
		.withCompatibleAttachment(Magazines.ScorpionMag, (model) -> {
//		    GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
//            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
		.withCompatibleAttachment(AuxiliaryAttachments.ScorpionAction, true, (model) -> {
//            GL11.glTranslatef(-0.175F, -1.58F, -0.86F);
//            GL11.glScaled(0.75F, 0.43F, 0.75F);
        })
//		.withCompatibleAttachment(AuxiliaryAttachments.AR15Action, true, (model) -> {
//            GL11.glTranslatef(-0.175F, -1.58F, -0.86F);
//            GL11.glScaled(0.75F, 0.43F, 0.75F);
//        })
		.withCompatibleAttachment(Attachments.ScorpionHandguardShort, true, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.215F, -1.645F, -3f);
                GL11.glScaled(0.7F, 0.8F, 0.5F);
            } else if(model instanceof AKRail2) {
            	GL11.glTranslatef(0.1F, -1.25F, -3.6f);
                GL11.glScaled(0.7F, 0.8F, 0.45F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
            	GL11.glTranslatef(-0.35F, -1.03F, -3.6f);
                GL11.glScaled(0.7F, 0.8F, 0.45F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail4) {
            	GL11.glTranslatef(-0.02F, -0.83F, -3.6f);
                GL11.glScaled(0.7F, 0.8F, 0.45F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            }
        })
		.withCompatibleAttachment(Attachments.ScorpionHandguardLong, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.215F, -1.645F, -4.8f);
                GL11.glScaled(0.7F, 0.8F, 1F);
            }
        })
		.withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.215F, -1.645F, -2.46f);
            	GL11.glScaled(0.7F, 0.8F, 1F);
            } else if(model instanceof AKRail2) {
            	GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail3) {
            	GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail4) {
            	GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail5) {
            	GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GL11.glTranslatef(-0.215F, -1.72F, -2.3F);
                    GL11.glScaled(0.85F, 0.85F, 0.85F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        
		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GL11.glTranslatef(-0.31F, -1.75F, -0.7F);
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
                    GL11.glTranslatef(-0.195F, -1.4F, -1F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.15F, -2.35F, -1F);
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
                    GL11.glTranslatef(-0.056F, -1.53F, -1.3F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
		},(model) -> {
            if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
			}
		})
		.withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
	                    GL11.glTranslatef(-0.05F, -1.52F, -1.3F);
	                    GL11.glScaled(0.53F, 0.53F, 0.53F);
			},(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
			})
		
		.withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GL11.glTranslatef(-0.025F, -1.58F, -1.2F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
			},(model) -> {
	            if(model instanceof Holo2) {
	                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
	                GL11.glScaled(0.1F, 0.1F, 0.1F);
	            }
	        })
		
		.withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
				 GL11.glTranslatef(-0.025F, -1.58F, -1.2F);
	             GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
				 GL11.glTranslatef(-0.025F, -1.58F, -1.2F);
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
	            GL11.glTranslatef(-0.335F, -1.81F, -1.4F);
	            GL11.glScaled(0.55F, 0.55F, 0.55F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
	    
		.withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GL11.glTranslatef(-0.026F, -1.58F, -1F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
		},(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		
		.withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
					GL11.glTranslatef(-0.026F, -1.58F, -1F);
		            GL11.glScaled(0.75F, 0.75F, 0.75F);
		},(model) -> {
		    if(model instanceof Reflex2) {
		        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
		    }
		})
		
		.withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GL11.glTranslatef(-0.183F, -1.77F, -1F);
                    GL11.glScaled(0.43F, 0.43F, 0.43F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
		
		.withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
					GL11.glTranslatef(-0.183F, -1.77F, -1F);
		            GL11.glScaled(0.43F, 0.43F, 0.43F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		.withCompatibleAttachment(Attachments.Grip2, (model) -> {
			GL11.glTranslatef(-0.21F, -0.35F, -3F);
			GL11.glScaled(1.1F, 1.1F, 1.1F);
		})
		.withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.35F, -3F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.VGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.35F, -2.8F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(-0.05F, -1.25F, -3.7F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
        	GL11.glTranslatef(-0.05F, -1.25F, -3.7F);
            GL11.glScaled(1F, 1F, 1F);
        })
		.withCompatibleAttachment(Attachments.Silencer9mm, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.ScorpionHandguardLong) {
                	GL11.glTranslatef(-0.2F, -1.35F, -7.5F);
        			GL11.glScaled(1F, 1F, 1F);
                } else {
                	GL11.glTranslatef(-0.2F, -1.35F, -5.35F);
        			GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(-0.19F, -0.6F, -7.8F);
                GL11.glScaled(0F, 0F, 0F);
            }
        }, false, false)
		.withTextureNames("scorpionevo3a1")
		.withRenderer(new WeaponRenderer.Builder()
			
			.withModel(new ScorpionEVO3A1())
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
                GL11.glTranslatef(-2F, -0.8F, 2.1F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
				})
			
			.withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.465000f, 5.105000f, -3.685000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
					.withRotationPoint(-0.350000f, -2.140000f, -0.700000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.090000f, 0.065000f, -0.620000f)
                        .withBBRotation(-8.1997, -23.6991, 57.7232)
                        .withScale(2.8, 2.8, 4.0)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.200000f, -0.140000f, 1.840000f)
                        .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3, 3, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("evo", AuxiliaryAttachments.ScorpionAction)
                .setupModernMagazineAnimations("evo", 
                		Magazines.ScorpionMag)
		
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.ScorpionAction.getRenderablePart(), (renderContext) -> {
//			    GL11.glTranslatef(0f, 0f, 0.7f);
                })
                
            .withFirstPersonCustomPositioning(Magazines.ScorpionMag, (renderContext) -> {
//            	 GL11.glTranslatef(0f, 0.5f, 0f);
//            	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                })
                    
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
			
            .withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(0.14f, 1.4f, -0.3f);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ScorpionRearSight)) {
                        GL11.glTranslatef(0F, -0.17f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        GL11.glTranslatef(0F, 0.07f, 0f);
				} 
				
				// Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                	 GL11.glTranslatef(-0.003F, 0.03f, 0.1f);
                } 
                
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					 GL11.glTranslatef(-0.003F, 0.06f, 0.3f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        GL11.glTranslatef(-0.003F, 0.02f, 0.1f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        GL11.glTranslatef(0F, 0.01f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                		GL11.glTranslatef(0F, 0.01f, 0.1f);
                } 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
						GL11.glTranslatef(0F, 0.08f, 0.1f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                		GL11.glTranslatef(0F, 0.08f, 0.1f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                		GL11.glTranslatef(0F, 0.08f, -0.15f);
                } 
				
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                		GL11.glTranslatef(0F, 0.12f, 0.1f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
						GL11.glTranslatef(0F, 0.07f, 0.1f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
						GL11.glTranslatef(0F, 0.07f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                		GL11.glTranslatef(0F, 0.0555f, 0.1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                		GL11.glTranslatef(0F, 0.0555f, 0.1f);
                } 
				
				// Everything else
				else {
				}
				})
            
            .withFirstPersonPositioningModifying((renderContext) -> {
 				 new Transform()
 				.withPosition(-1.465000f, 5.345000f, -5.205000f)
 				.withRotation(0.000000f, -28.959393f, -20.248323f)
 				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
 				 .withScale(3.000000f, 3.000000f, 3.000000f)
 				 .doGLDirect();
 			 })
 			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
 				 new Transform()
 				.withPosition(-1.465000f, 5.345000f, -6.165000f)
 				.withRotation(0.000000f, -42.129878f, -20.248323f)
 				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
 				 .withScale(3.000000f, 3.000000f, 3.000000f)
 				 .doGLDirect();
             })
 					 
 			.withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                    	 new Transform()
                    	 .withPosition(3.090000f, 0.265000f, -0.620000f)
                    	 .withRotation(89.070002f, 33.851942f, 20.019402f)
                         .withScale(2.6, 2.6, 4.0)
                         .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                         .doGLDirect();
                     }, 
                     (renderContext) -> {
                    	 new Transform()
                    	 .withPosition(-0.200000f, -0.140000f, 1.840000f)
                         .withRotation(-5.4027, -4.7805, -1.6694)
                         .withScale(3.5, 3.5, 3.5)
                         .withRotationPoint(0, 0, 0)
                         .doGLDirect();
                     })
                     
            .withFirstPersonHandPositioningModifyingAlt(
            		(renderContext) -> {
                   	 new Transform()
	                   	.withPosition(3.090000f, 0.265000f, -0.620000f)
	                   	.withRotation(89.070002f, 33.851942f, 20.019402f)
                   	 	.withScale(2.600000f, 2.600000f, 4.000000f)
                        .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                        .doGLDirect();
                    }, 
                    (renderContext) -> {
                   	 new Transform()
	                   	.withPosition(-0.200000f, -0.140000f, 1.840000f)
	                    .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3.5, 3.5, 3.5)
                        .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                        .doGLDirect();
                    })
                    
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
					
			.build())
		.withSpawnEntityDamage(5f)
		.withSpawnEntityGravityVelocity(0.0118f)
				
		 
		.build(MWC.modContext);
	}
}
