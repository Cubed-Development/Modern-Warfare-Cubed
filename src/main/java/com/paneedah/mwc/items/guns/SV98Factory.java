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

public class SV98Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("sv98")
        .withFireRate(0.16f)
        .withEjectRoundRequired()
        .withEjectSpentRoundSound("sv98_bolt_action")
        .withRecoil(9f)
        .withZoom(0.8f)
        .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
        .withMaxShots(1)
        .withShootSound("sv98")
        .withPumpTimeout(1000)
        .withSilencedShootSound("sniper_silenced")
        .withReloadSound("sv98_reload")
        .withUnloadSound("m40a6_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(40)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.09f)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Sniper Rifle",
        "Damage: 14", 
        "Cartridge: 7.62x54mmR",
        "Fire Rate: BOLT ACTION",
        "Rate of Fire: 16/100",
        "Magazines:",
        "10rnd 7.62x54mmR Izhmash Magazine"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 3f, // x 
                 2f, // y
                 6f) // z
         
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Magazines.SV98Mag, (model) -> {
//            GL11.glScaled(1.55F, 1.6F, 1.6F);
//            GL11.glTranslatef(-0.28F, 0.51F, -0.97F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.SV98BoltAction, true, (model) -> {
//            GL11.glTranslatef(-0.08F, 0.01F, 0.02F);
            
//            GL11.glRotatef(50F, 0f, 0f, 1f);
//            GL11.glTranslatef(-0.85F, 0.5F, 0F);
            
//              GL11.glRotatef(50F, 0f, 0f, 1f);
//              GL11.glTranslatef(-0.85F, 0.5F, 1.05F);
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
            GL11.glTranslatef(-0.155F, -1.28F, -2.5F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
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
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.035F, -1.3F, -2F);
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
        	GL11.glTranslatef(-0.3F, -1.47F, -1.7F);
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
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
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
        .withCompatibleAttachment(Attachments.Silencer762x54, (model) -> {
            GL11.glTranslatef(-0.22F, -1.3F, -12.2F);
            GL11.glScaled(1.2F, 1.2F, 1.5F);
        })
        .withTextureNames("sv98")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new SV98())
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
                GL11.glRotatef(6f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.325000f, 1.299999f, -0.450000f);
                
//                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(6f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.325000f, 1.299999f, -0.050000f);
                GL11.glRotatef(-2f, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(10f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.25f, 0.95f, -0.025000f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(15f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.24f, 0.95f, 0.1f);
                GL11.glRotatef(0.5F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.SV98BoltAction.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningEjectSpentRound(
            		// grabs bolt
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(46.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(28.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.575000f);
                    }, 160, 0),
                    // bolt up
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.575000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.575000f);
                    }, 60, 0),
                    // bolt back
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.600000f, 0f, 1f, 0f);
                        GL11.glRotatef(24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.375000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(27.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.405000f);
                    }, 80, 0),
                    // bolt forward
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.575000f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.575000f);
                    }, 60, 0),
                    // bolt down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.575000f);
                    }, 80, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.SV98BoltAction.getRenderablePart(),
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
                        GL11.glTranslatef(-0.85F, 0.5F, 0F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.85F, 0.5F, 0F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                  
                  )
            
            .withFirstPersonPositioningEjectSpentRoundAimed(
            		// grabs bolt
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(46.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(28.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 1.624999f, -0.575000f);
                    }, 160, 0),
                    // bolt up
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 1.624999f, -0.575000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3225000f, 1.624999f, -0.575000f);
                    }, 60, 0),
                    // bolt back
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.600000f, 0f, 1f, 0f);
                        GL11.glRotatef(24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3225000f, 1.624999f, -0.375000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(27.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3225000f, 1.624999f, -0.405000f);
                    }, 80, 0),
                    // bolt forward
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3225000f, 1.624999f, -0.575000f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3225000f, 1.624999f, -0.575000f);
                    }, 60, 0),
                    // bolt down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3225000f, 1.624999f, -0.575000f);
                    }, 80, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.SV98BoltAction.getRenderablePart(),
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
                          GL11.glTranslatef(-0.85F, 0.5F, 0F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                          GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 0F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.SV98BoltAction.getRenderablePart(),
            		// hand reaches down
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    // mag touches gun
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    }, 180, 0),
                    // mag inserts
                    new Transition((renderContext) -> { // Reload position
                    }, 170, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    }, 160, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    }, 180, 0),
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
                          GL11.glTranslatef(-0.85F, 0.5F, 0F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                          GL11.glRotatef(50F, 0f, 0f, 1f);
                          GL11.glTranslatef(-0.85F, 0.5F, 0F);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                
             .withFirstPersonPositioningReloading(
            		 // mag reaches down
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                         GL11.glRotatef(43F, 0f, 1f, 0f);
                         GL11.glRotatef(-3f, 0f, 0f, 1f);
                         GL11.glRotatef(4f, 1f, 0f, 0f);
                         GL11.glTranslatef(-0.525000f, 1.22f, -0.450000f);
                     }, 240, 0),
                     // mag touches gun
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(-2f, 0f, 0f, 1f);
                        GL11.glRotatef(2f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.525000f, 1.199999f, -0.450000f);
                    }, 220, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(43.3F, 0f, 1f, 0f);
                        GL11.glRotatef(-1f, 0f, 0f, 1f);
                        GL11.glRotatef(3.2f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.525000f, 1.199999f, -0.450000f);
                    }, 60, 0),
                    // mag inserts
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glRotatef(-4f, 0f, 0f, 1f);
                        GL11.glRotatef(2f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.525000f, 1.13f, -0.450000f);
                    }, 110, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(44.4F, 0f, 1f, 0f);
                        GL11.glRotatef(-2f, 0f, 0f, 1f);
                        GL11.glRotatef(0.6f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.525000f, 1.13f, -0.450000f);
                    }, 70, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(44.2F, 0f, 1f, 0f);
                        GL11.glRotatef(10f, 0f, 0f, 1f);
                        GL11.glRotatef(0.2f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.45f, 1.4f, -0.450000f);
                    }, 80, 0),
                 // grabs bolt
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(16.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.575000f);
                    }, 160, 0),
                    // bolt up
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.575000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.575000f);
                    }, 60, 0),
                    // bolt back
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.600000f, 0f, 1f, 0f);
                        GL11.glRotatef(24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.375000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(27.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.405000f);
                    }, 80, 0),
                    // bolt forward
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.575000f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.575000f);
                    }, 60, 0),
                    // bolt down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 1.624999f, -0.575000f);
                    }, 80, 0)
                    
                    )
                    
            .withFirstPersonPositioningUnloading(
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                         GL11.glRotatef(44F, 0f, 1f, 0f);
                         GL11.glRotatef(-3f, 0f, 0f, 1f);
                         GL11.glRotatef(4f, 1f, 0f, 0f);
                         GL11.glTranslatef(-0.525000f, 1.199999f, -0.450000f);
                     }, 270, 0),
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                         GL11.glRotatef(43.4F, 0f, 1f, 0f);
                         GL11.glRotatef(-1f, 0f, 0f, 1f);
                         GL11.glRotatef(6f, 1f, 0f, 0f);
                         GL11.glTranslatef(-0.525000f, 1.22f, -0.450000f);
                     }, 240, 0))
            
            .withFirstPersonCustomPositioningReloading(Magazines.SV98Mag,
            		// hand reaches down
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.05F, 2.8F, -1F);
                        GL11.glRotatef(-30f, 1f, 0f, 0f);
                    }, 250, 1000),
                    // mag touches gun
                    new Transition((renderContext) -> {
                    	 GL11.glTranslatef(0F, 0.31F, 0F);
                    }, 250, 1000),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glTranslatef(0F, 0.31F, 0F);
                    }, 180, 0),
                    // mag inserts
                    new Transition((renderContext) -> { // Reload position
                    }, 170, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    }, 160, 0),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    }, 180, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.SV98Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.05F, 2.8F, -1F);
                        GL11.glRotatef(-30f, 1f, 0f, 0f);
                    }, 250, 1000)
                    )
                        
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.500000f, 1.300000f, 0.025000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(1.000000f, 1.600000f, -0.200000f);
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
            
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.SV98BoltAction.getRenderablePart(),
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
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(18F, 0f, 0f, 1f);
                        GL11.glRotatef(7F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.125000f, 1.25f, 0.750000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(18F, 0f, 0f, 1f);
                        GL11.glRotatef(2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.125000f, 1f, 0.750000f);
                    }, 230, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(15F, 0f, 0f, 1f);
                        GL11.glRotatef(3F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.125000f, 0.875000f, 0.65f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(9F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, 0.88f, 0.45f);
                        GL11.glRotatef(1F, 1f, 0f, 0f);
                    }, 250, 0)
                    )
              
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.82f, 0.425000f);
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.25f, 0.3f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.26f, 0.3f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.32f, 0.75f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.23f, 0.8f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.315f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.315f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.245f, 0.6f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.285f, 0.6f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.285f, 0.6f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.285f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.25f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.28f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.28f, 0.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.23f, 0.82f, 0.45f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.25f, 0.25f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.26f, 0.3f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.32f, 0.75f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.23f, 0.8f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.315f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.315f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.245f, 0.6f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.285f, 0.6f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.285f, 0.6f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.285f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.25f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.28f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.28f, 0.5f);
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
                GL11.glTranslatef(-0.300000f, 1.4f, -0.0f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3f, 3f, 3f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.225000f, 0.950000f, 0.000000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                         
//                         GL11.glScalef(3f, 3f, 3f);
                     })
                     
            .withFirstPersonHandPositioningProning(
                    (renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
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
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
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
                    	 GL11.glScalef(4f, 4f, 4f);
                    	 GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.475000f, -0.325000f, -0.100000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
            		// reaches down to get mag
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, -0.400000f, 0.200000f);
                    }, 50, 200),
                    // mag touches gun
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.425000f, 0.175000f);
                    }, 50, 200),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.425000f, 0.175000f);
                    }, 50, 200),
                    // mag inserts
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.350000f, 0.125000f);
                    }, 50, 200),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.350000f, 0.125000f);
                    }, 50, 200),
                    // jiggle
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.350000f, 0.125000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                 // grabs bolt
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.225000f, 0.250000f);
                    }, 50, 200),
                    // bolt up
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.145000f, 0.285000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.145000f, 0.285000f);
                    }, 50, 200),
                    // bolt back
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.265000f, -0.325000f, 0.015000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.265000f, -0.325000f, 0.015000f);
                    }, 50, 200),
                    // bolt forward
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.145000f, 0.285000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.145000f, 0.285000f);
                    }, 50, 200),
                    // bolt down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.175000f, -0.175000f, 0.195000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.300000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, -0.125000f, 0.175000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRound(
            		// grabs bolt
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.225000f, 0.250000f);
                    }, 50, 200),
                    // bolt up
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.145000f, 0.285000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.145000f, 0.285000f);
                    }, 50, 200),
                    // bolt back
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.265000f, -0.325000f, 0.015000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.265000f, -0.325000f, 0.015000f);
                    }, 50, 200),
                    // bolt forward
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.145000f, 0.285000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.145000f, 0.285000f);
                    }, 50, 200),
                    // bolt down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.175000f, -0.175000f, 0.195000f);
                    }, 50, 200))
            
            .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
            		new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.490000f, -0.125000f, 0.055000f);
                    }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
            		// grabs bolt
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.225000f, 0.250000f);
                    }, 50, 200),
                    // bolt up
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.145000f, 0.285000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.145000f, 0.285000f);
                    }, 50, 200),
                    // bolt back
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.265000f, -0.325000f, 0.015000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.265000f, -0.325000f, 0.015000f);
                    }, 50, 200),
                    // bolt forward
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.145000f, 0.285000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.145000f, 0.285000f);
                    }, 50, 200),
                    // bolt down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.175000f, -0.175000f, 0.195000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.200000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.225000f, -0.100000f);
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
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.025000f, 0.225000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.025000f, 0.225000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.025000f, 0.225000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.025000f, 0.225000f);
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
