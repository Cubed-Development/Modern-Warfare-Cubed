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

public class L96A1Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("l96a1")
        .withFireRate(0.16f)
        .withEjectRoundRequired()
        .withEjectSpentRoundSound("l96a1_bolt_action")
        .withRecoil(8f)
        .withZoom(0.8f)
        .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
        .withMaxShots(1)
        .withShootSound("l96a1")
        .withPumpTimeout(1000)
        .withSilencedShootSound("sniper_silenced")
        .withReloadSound("l96a1_reload")
        .withUnloadSound("m40a6_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(40)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.08f)
        .withFlashOffsetY(() -> 0.08f)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Sniper Rifle",
        "Damage: 14", 
        "Cartridge: 7.62x54mm",
        "Fire Rate: BOLT ACTION",
        "Rate of Fire: 16/100",
        "Magazines:",
        "10rnd 7.62x54mm LAPUA Magazine"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                3f, // x 
                2f, // y
                7f) // z
        
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Magazines.L96A1Mag, (model) -> {
            GL11.glScaled(1.55F, 1.6F, 1.6F);
            GL11.glTranslatef(-0.28F, 0.51F, -0.97F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.L115Bolt1, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.L115Bolt2, true, (model) -> {
            GL11.glTranslatef(-0.35F, 0.35F, -1.56F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.HK416FrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.Mk18HandGuard) {
                    GL11.glTranslatef(0F, 0F, -0.35F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof G95_upright_frontsights) {
            	GL11.glTranslatef(-0.15F, -1.6F, -2.7F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
              }
        }, true, false)
		.withCompatibleAttachment(Attachments.TritiumRearSights, true, (model) -> {
	           if(model instanceof TritiumRearSights) {
	           	 GL11.glTranslatef(-0.166F, -1.55F, -1.2F);
	                GL11.glScaled(0.4F, 0.4F, 0.4F);
	           }
	       })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.45F, -2.2F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
         .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.327F, -1.47F, -1.4F);
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
            GL11.glTranslatef(-0.19F, -1.15F, -1.6F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
        	GL11.glTranslatef(-0.153F, -1.3F, -2.5F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                GL11.glTranslatef(-0.058F, -1.25F, -2F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.066F, -1.25F, -1.7F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(-0.035F, -1.3F, -2F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(-0.035F, -1.3F, -2F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
            GL11.glTranslatef(-0.3F, -1.49F, -2.1F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef(-0.035F, -1.3F, -1.7F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef(-0.19F, -1.5F, -1.7F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.19F, -1.5F, -1.7F);
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
      .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(-0.22F, -1.36F, -3.15F);
                GL11.glScaled(0.7F, 0.8F, 0.9F);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.37F, -1.005F, -3.5F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(-0.37F, -1.005F, -3.5F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(-0.37F, -1.005F, -3.5F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail5) {
                GL11.glTranslatef(-0.37F, -1.005F, -3.5F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Bullet, true, (model) -> {
            if(model instanceof BulletBig) {
                GL11.glScaled(0.6F, 0.6F, 0.8F);
                GL11.glTranslatef(-0.3F, -1.6F, -2.2F);
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
        .withTextureNames("l96")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new L96())
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
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(7f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.350000f, 1.274999f, -0.525000f);
                
//                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                GL11.glRotatef(42F, 0f, 1f, 0f);
//                GL11.glRotatef(-2f, 0f, 0f, 1f);
//                GL11.glRotatef(2f, 1f, 0f, 0f);
//                GL11.glTranslatef(-0.40000f, 1.274999f, -0.525000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(7f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.350000f, 1.274999f, -0.025000f);
                GL11.glRotatef(-1f, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.4f, 1.05f, -0.4f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
            	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glRotatef(8f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.4f, 1.05f, -0f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.L115Bolt1.getRenderablePart(), (renderContext) -> {
//            	GL11.glTranslatef(0F, 0F, 1.05F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.L115Bolt2.getRenderablePart(), (renderContext) -> {
//            	GL11.glRotatef(50F, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                })
                
            .withFirstPersonPositioningEjectSpentRound(
            		
            		// right hand grabs bolt action
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(6f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, 1.274999f, -0.525000f);
                    }, 170, 0),
                    
                    // right hand pushes bolt action up
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(9f, 0f, 0f, 1f);
                        GL11.glRotatef(-0.7f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.350000f, 1.274999f, -0.425000f);
                    }, 130, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8f, 0f, 0f, 1f);
                        GL11.glRotatef(-0.5f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.350000f, 1.274999f, -0.425000f);
                    }, 70, 0),
                    
                    // right hand pulls back bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(3f, 0f, 0f, 1f);
                        GL11.glRotatef(-1.3f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.350000f, 1.274999f, -0.225000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(4f, 0f, 0f, 1f);
                        GL11.glRotatef(-1f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.350000f, 1.274999f, -0.225000f);
                    }, 40, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(2f, 0f, 0f, 1f);
                        GL11.glRotatef(-1.1f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.350000f, 1.274999f, -0.225000f);
                    }, 70, 0),
                    
                    // right hand pushes bolt action forward
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(6f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, 1.274999f, -0.625000f);
                    }, 100, 0),
                    
                    // right hand pulls down bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, 1.274999f, -0.525000f);
                    }, 80, 0)
                    
                    )
            
            .withFirstPersonPositioningEjectSpentRoundAimed(
            		// right hand grabs bolt action
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(6f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 1.274999f, -0.325000f);
                    }, 170, 0),
                    
                    // right hand pushes bolt action up
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(9f, 0f, 0f, 1f);
                        GL11.glRotatef(-0.7f, 1f, 0f, 0f);
                        GL11.glTranslatef(0.250000f, 1.274999f, -0.225000f);
                    }, 130, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8f, 0f, 0f, 1f);
                        GL11.glRotatef(-0.5f, 1f, 0f, 0f);
                        GL11.glTranslatef(0.250000f, 1.274999f, -0.225000f);
                    }, 70, 0),
                    
                    // right hand pulls back bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(3f, 0f, 0f, 1f);
                        GL11.glRotatef(-1.3f, 1f, 0f, 0f);
                        GL11.glTranslatef(0.250000f, 1.274999f, -0.025000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(4f, 0f, 0f, 1f);
                        GL11.glRotatef(-1f, 1f, 0f, 0f);
                        GL11.glTranslatef(0.250000f, 1.274999f, -0.025000f);
                    }, 40, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(2f, 0f, 0f, 1f);
                        GL11.glRotatef(-1.1f, 1f, 0f, 0f);
                        GL11.glTranslatef(0.250000f, 1.274999f, -0.025000f);
                    }, 70, 0),
                    
                    // right hand pushes bolt action forward
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(6f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 1.274999f, -0.425000f);
                    }, 100, 0),
                    
                    // right hand pulls down bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.2250000f, 1.274999f, -0.325000f);
                    }, 80, 0)
                    
                    )
                    
//            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.Bullet.getRenderablePart(),
//                    new Transition((renderContext) -> { // Reload position
////                        GL11.glScaled(0.4F, 0.4F, 0.6F);
////                        GL11.glTranslatef(-0.52F, -2.9F, -3.5F);
////                        GL11.glRotatef(90f, 1f, 0f, 0f);
//                    }, 250, 50),
//                    new Transition((renderContext) -> { // Reload position
////                        GL11.glTranslatef(0F, -0.5F, 0F);
////                        GL11.glRotatef(60f, 1f, 0f, 0f);
////                        GL11.glRotatef(45f, 0f, 1f, 0f);
//                    }, 250, 300),
//                    new Transition((renderContext) -> { // Reload position
////                        GL11.glScaled(0.4F, 0.4F, 0.6F);
//                        GL11.glTranslatef(-2F, -1F, -6F);
//                        GL11.glRotatef(60f, 1f, 0f, 0f);
//                        GL11.glRotatef(45f, 0f, 1f, 0f);
//                    }, 250, 0),
//                    new Transition((renderContext) -> { // Reload position
////                        GL11.glScaled(0.4F, 0.4F, 0.6F);
//                        GL11.glTranslatef(-4F, 0F, -6F);
//                        GL11.glRotatef(60f, 1f, 0f, 0f);
//                        GL11.glRotatef(45f, 0f, 1f, 0f);
//                    }, 250, 0),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(-0.52F, 3F, -6F);
//                        GL11.glRotatef(60f, 1f, 0f, 0f);
//                        GL11.glRotatef(45f, 0f, 1f, 0f);
//                    }, 250, 0)
//                    
//                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.L115Bolt1.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(0F, 0F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(0F, 0F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(0F, 0F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                  
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.L115Bolt2.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 0F);
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 0F);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 0F);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.L115Bolt1.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(0F, 0F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(0F, 0F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(0F, 0F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                  
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.L115Bolt2.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 0F);
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 0F);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 0F);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                
            .withFirstPersonPositioningReloading(
              		 
            		// reload
            		 
            		 // left hand reaches down
            		 
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                         GL11.glRotatef(42.2F, 0f, 1f, 0f);
                         GL11.glRotatef(-1f, 0f, 0f, 1f);
                         GL11.glRotatef(2f, 1f, 0f, 0f);
                         GL11.glTranslatef(-0.40000f, 1.274999f, -0.525000f);
                     }, 270, 0),
                     
                     // mag touches gun
                     
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(42.5F, 0f, 1f, 0f);
                        GL11.glRotatef(-4f, 0f, 0f, 1f);
                        GL11.glRotatef(1.5f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.254999f, -0.525000f);
                    }, 320, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    	GL11.glRotatef(42.5F, 0f, 1f, 0f);
                        GL11.glRotatef(-3f, 0f, 0f, 1f);
                        GL11.glRotatef(1.5f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.254999f, -0.525000f);
                   }, 60, 0),
                    
                    // mag goes up halfway
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glRotatef(-2f, 0f, 0f, 1f);
                        GL11.glRotatef(-0.7f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.244999f, -0.525000f);
                   }, 80, 0),
                    
                    // mag inserts
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(-4f, 0f, 0f, 1f);
                        GL11.glRotatef(-1.3f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.234999f, -0.525000f);
                    }, 70, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(-3f, 0f, 0f, 1f);
                        GL11.glRotatef(-1f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.264999f, -0.525000f);
                    }, 70, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(42.5F, 0f, 1f, 0f);
                        GL11.glRotatef(-3.5f, 0f, 0f, 1f);
                        GL11.glRotatef(-1.1f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.264999f, -0.525000f);
                    }, 80, 0),
                    
                    // bolt action
                    
                    // right hand grabs bolt action
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(-2f, 0f, 0f, 1f);
                        GL11.glRotatef(-0.8f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.234999f, -0.525000f);
                    }, 170, 0),
                    
                    // right hand pushes bolt action up
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(-1f, 0f, 0f, 1f);
                        GL11.glRotatef(-1.2f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.234999f, -0.525000f);
                    }, 130, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(-1f, 0f, 0f, 1f);
                        GL11.glRotatef(-1f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.234999f, -0.505000f);
                    }, 70, 0),
                    
                    // right hand pulls back bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(-4f, 0f, 0f, 1f);
                        GL11.glRotatef(-3f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.234999f, -0.255000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(-1f, 0f, 0f, 1f);
                        GL11.glRotatef(-2.5f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.234999f, -0.265000f);
                    }, 40, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(-3f, 0f, 0f, 1f);
                        GL11.glRotatef(-2.7f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.234999f, -0.250000f);
                    }, 70, 0),
                    
                    // right hand pushes bolt action forward
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(-1f, 0f, 0f, 1f);
                        GL11.glRotatef(-1.7f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.234999f, -0.530000f);
                    }, 100, 0),
                    
                    // right hand pulls down bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(0f, 0f, 0f, 1f);
                        GL11.glRotatef(-1.2f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.40000f, 1.234999f, -0.50000f);
                    }, 80, 0)
                    
                    )
                    
             .withFirstPersonPositioningUnloading(
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                         GL11.glRotatef(43F, 0f, 1f, 0f);
                         GL11.glRotatef(-1f, 0f, 0f, 1f);
                         GL11.glRotatef(1.5f, 1f, 0f, 0f);
                         GL11.glTranslatef(-0.40000f, 1.274999f, -0.525000f);
                     }, 310, 0),
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                         GL11.glRotatef(42.4F, 0f, 1f, 0f);
                         GL11.glRotatef(-1.5f, 0f, 0f, 1f);
                         GL11.glRotatef(2.3f, 1f, 0f, 0f);
                         GL11.glTranslatef(-0.40000f, 1.274999f, -0.525000f);
                     }, 80, 0),
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                         GL11.glRotatef(41.8F, 0f, 1f, 0f);
                         GL11.glRotatef(-3f, 0f, 0f, 1f);
                         GL11.glRotatef(2.6f, 1f, 0f, 0f);
                         GL11.glTranslatef(-0.40000f, 1.274999f, -0.525000f);
                     }, 180, 0),
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                         GL11.glRotatef(42F, 0f, 1f, 0f);
                         GL11.glRotatef(-1f, 0f, 0f, 1f);
                         GL11.glRotatef(2f, 1f, 0f, 0f);
                         GL11.glTranslatef(-0.40000f, 1.274999f, -0.525000f);
                     }, 200, 0))
            
            .withFirstPersonCustomPositioningReloading(Magazines.L96A1Mag,
            		new Transition((renderContext) -> {
            			GL11.glTranslatef(0F, 0.2F, 0.35F);
                        GL11.glRotatef(20f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.6F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.6F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.3F, 0F);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.L96A1Mag,
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
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.L115Bolt1.getRenderablePart(),
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
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                          GL11.glTranslatef(0F, 0F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(0F, 0F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(0F, 0F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.L115Bolt2.getRenderablePart(),
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
                    	GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 0F);
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 0F);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 0F);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                        
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.825000f, 0.750000f, 0.000000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.300000f, 1.349999f, 0.000000f);
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
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.L115Bolt1.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.L115Bolt2.getRenderablePart(),
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
                         GL11.glRotatef(10F, 0f, 1f, 0f);
                         GL11.glRotatef(17f, 0f, 0f, 1f);
                         GL11.glRotatef(15f, 1f, 0f, 0f);
                         GL11.glTranslatef(-0.40000f, 1.474999f, -0.225000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                         GL11.glRotatef(21F, 0f, 1f, 0f);
                         GL11.glRotatef(12f, 0f, 0f, 1f);
                         GL11.glRotatef(10f, 1f, 0f, 0f);
                         GL11.glTranslatef(-0.40000f, 1.374999f, -0.225000f);
                    }, 230, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                         GL11.glRotatef(30F, 0f, 1f, 0f);
                         GL11.glRotatef(7f, 0f, 0f, 1f);
                         GL11.glRotatef(5f, 1f, 0f, 0f);
                         GL11.glTranslatef(-0.40000f, 1.274999f, -0.325000f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                         GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glRotatef(7f, 0f, 0f, 1f);
                         GL11.glRotatef(-1f, 1f, 0f, 0f);
                         GL11.glTranslatef(-0.350000f, 1.274999f, -0.585000f);
                    }, 250, 0)
                    )
              
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.82f, -0.125000f);
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.26f, 0.6f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.26f, 0.8f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.32f, 1.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.23f, 1.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.315f, 1.4f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.315f, 1.4f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.245f, 1.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.22f, 0.4f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.29f, 1.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.29f, 1.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.27f, 1.2f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.28f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0.002F, 0.24f, 1f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.225f, 0.82f, 0.05f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.26f, 0.5f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0F, 0.26f, 0.7f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.32f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.23f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.315f, 1.4f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.315f, 1.4f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.245f, 1.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.22f, 0.4f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.29f, 1.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.29f, 1.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.27f, 1.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.28f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0.002F, 0.24f, 1f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.200000f, 1.149999f, -0.325000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3f, 3f, 3f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.825000f, 0.750000f, 0.000000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                         
                     }, 
                     (renderContext) -> {
//                         GL11.glScalef(3.5f, 3.5f, 3.5f);
//                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
//                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
//                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                         GL11.glTranslatef(0.375000f, -0.475000f, 0.250000f);
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
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
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
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
            		
            		// reload
            		
            		// left hand reaches down
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.200000f, -0.450000f, 0.200000f);
                    }, 50, 200),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.275000f, -0.475000f, 0.000000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.275000f, -0.475000f, 0.000000f);
                    }, 50, 200),
                    
                    //mag inserts halfway
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.275000f, -0.500000f, 0.025000f);
                    }, 50, 200),
                    
                    // mag inserts
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.250000f, -0.500000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.250000f, -0.500000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.250000f, -0.500000f, 0.025000f);
                    }, 50, 200),
                    
                    // bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.425000f, 0.100000f);
                   }, 50, 200),
                   
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.300000f, -0.425000f, 0.100000f);
                   }, 50, 200),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.300000f, -0.425000f, 0.100000f);
                  }, 50, 200),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.300000f, -0.425000f, 0.100000f);
                   }, 50, 200),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.300000f, -0.425000f, 0.100000f);
                   }, 50, 200),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.300000f, -0.425000f, 0.100000f);
                   }, 50, 200),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.300000f, -0.425000f, 0.100000f);
                   }, 50, 200),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.300000f, -0.425000f, 0.100000f);
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
                    
                    // bolt action
                    
                    // right hand grabs bolt action
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.275000f, 0.150000f);
                    }, 160, 0),
                    
                    // right hand pushes bolt action up
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.095000f, -0.250000f, 0.025000f);
                    }, 110, 70),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.095000f, -0.250000f, 0.025000f);
                    }, 110, 70),
                    
                    // right hand pulls back bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.225000f, -0.360000f, -0.035000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.225000f, -0.360000f, -0.035000f);
                    }, 20, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.225000f, -0.360000f, -0.035000f);
                    }, 70, 0),
                    
                    // right hand pushes bolt action forward
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.095000f, -0.250000f, 0.025000f);
                    }, 100, 0),
                    
                    // right hand pulls down bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.275000f, 0.150000f);
                    }, 80, 0)
                    
                    )
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.400000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.400000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.200000f, -0.450000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.200000f, -0.450000f, 0.200000f);
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
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
                    
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRound(
            		// right hand grabs bolt action
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.275000f, 0.150000f);
                    }, 160, 0),
                    
                    // right hand pushes bolt action up
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.095000f, -0.250000f, 0.025000f);
                    }, 110, 70),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.095000f, -0.250000f, 0.025000f);
                    }, 110, 70),
                    
                    // right hand pulls back bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.225000f, -0.360000f, -0.035000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.225000f, -0.360000f, -0.035000f);
                    }, 20, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.225000f, -0.360000f, -0.035000f);
                    }, 70, 0),
                    
                    // right hand pushes bolt action forward
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.095000f, -0.250000f, 0.025000f);
                    }, 100, 0),
                    
                    // right hand pulls down bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.275000f, 0.150000f);
                    }, 80, 0)
                    
                    )
            
            .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
                    
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                   }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
            		// right hand grabs bolt action
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.275000f, 0.150000f);
                    }, 160, 0),
                    
                    // right hand pushes bolt action up
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.095000f, -0.250000f, 0.025000f);
                    }, 110, 70),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.095000f, -0.250000f, 0.025000f);
                    }, 110, 70),
                    
                    // right hand pulls back bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.225000f, -0.360000f, -0.035000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.225000f, -0.360000f, -0.035000f);
                    }, 20, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.225000f, -0.360000f, -0.035000f);
                    }, 70, 0),
                    
                    // right hand pushes bolt action forward
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.095000f, -0.250000f, 0.025000f);
                    }, 100, 0),
                    
                    // right hand pulls down bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.275000f, 0.150000f);
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
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.225000f, 0.000000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
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
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.050000f, 0.070000f);
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
        .withSpawnEntityDamage(14f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(MWC.modContext);
    }
}
