package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class M110Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("m110_sass")
        .withFireRate(0.65f)
        .withRecoil(6f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.DMR)
        .hasFlashPedals()
        .withMaxShots(1)
        .withShootSound("m110")
        .withSilencedShootSound("m110_silenced")
        .withReloadSound("m4a1_reload")
        .withUnloadSound("m4_unload")
        .withEndOfShootSound("gun_click")
        .withInspectSound("m4a1_inspection")
        .withDrawSound("m4_draw")
        .withReloadingTime(50)
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.15f)
        .withShellCasingForwardOffset(0.05f)
        .withShellCasingVerticalOffset(-0.03f)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
        		// The weapons power
        		22.5,
        		// Muzzle climb divisor
        		21.375,
        		// "Stock Length"
        		50.0,
        		// Recovery rate from initial shot
        		0.4625,
        		// Recovery rate @ "stock"
        		0.225,
        		// Recoil rotation (Y)
        		0.0,
        		// Recoil rotation (Z)
        		0.0,
        		// Ads similarity divisor
        		1.0
        ))
//        .withRecoilParam(new RecoilParam(2, 80, 1, 1, 0))
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Semi-Automatic Sniper System", 
        "Damage: 10", 
        "Cartridge: 7.62x51mm",
        "Fire Rate: SEMI",
        "Rate of Fire: 65/100",
        "Magazines:",
        "10rnd 7.62x51mm NATO Magazine"))
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 6), new
        		CraftingEntry(MWCItems.gunmetalPlate, 10), new
        		CraftingEntry(MWCItems.steelIngot, 3))
        
         .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
         .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
         .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
         .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
         .withCompatibleAttachment(Attachments.M110Handguard, true, (model) -> {
             if(model instanceof AKRail) {
               GL11.glTranslatef(0.13F, -1.135F, -5.2F);
               GL11.glScaled(0.6F, 0.6F, 1.25F);
               GL11.glRotatef(90F, 0f, 0f, 1f);
           } else if(model instanceof AKRail2) {
               GL11.glTranslatef(-0.37F, -0.96F, -5.2F);
               GL11.glScaled(0.6F, 0.6F, 1.25F);
               GL11.glRotatef(-90F, 0f, 0f, 1f);
           } else if(model instanceof AKRail3) {
               GL11.glTranslatef(-0.03F, -0.78F, -4.97F);
               GL11.glScaled(0.6F, 0.6F, 1.1F);
               GL11.glRotatef(180F, 0f, 0f, 1f);
           } else if(model instanceof AKRail5) {
               GL11.glTranslatef(-0.2F, -1.32F, -5.2f);
               GL11.glScaled(0.6F, 0.8F, 1.3F);
           }
         })
         .withCompatibleAttachment(Attachments.M110Grip, true, (model) -> {
//             GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//             GL11.glScaled(0F, 0F, 0F);
         })
         .withCompatibleAttachment(Attachments.M110Stock, true, (model) -> {
//           GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//           GL11.glScaled(0F, 0F, 0F);
       })
         .withCompatibleAttachment(Attachments.M110Receiver, true, (model) -> {
             if(model instanceof M110Receiver) {
           } else if(model instanceof AKRail) {
               GL11.glTranslatef(-0.2F, -1.319F, -2f);
               GL11.glScaled(0.6F, 0.8F, 0.85F);
           }
         })
        .withCompatibleAttachment(Magazines.M110Mag, (model) -> {
//            GL11.glTranslatef(-0.33F, 0.5F, -1.3F);
//            GL11.glScaled(1.05F, 1.2F, 1F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M110Action, true, (model) -> {
            GL11.glTranslatef(-0.175F, -1.28F, -0.67F);
            GL11.glScaled(0.7F, 0.4F, 0.7F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M110EjectorAction, true, (model) -> {
//            GL11.glTranslatef(-0.175F, -1.28F, -0.67F);
//            GL11.glScaled(0.7F, 0.4F, 0.7F);
        })
        .withCompatibleAttachment(Attachments.HK416FrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.M110Handguard) {
                    GL11.glTranslatef(0F, 0F, -0.95F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof G95_upright_frontsights) {
            	GL11.glTranslatef(-0.155F, -1.55F, -3.5F);
                GL11.glScaled(0.32F, 0.32F, 0.32F);
              }
        }, true, false)
        
        .withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.M110Handguard) {
                    GL11.glTranslatef(0F, 0F, -1.3F);
                } else {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof MBUSFrontSight) {
            	GL11.glTranslatef(-0.16F, -1.5F, -3.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
              }
        }, false, false)
        .withCompatibleAttachment(Attachments.TritiumRearSights, (model) -> {
            if(model instanceof TritiumRearSights) {
            	 GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                 GL11.glScaled(0.35F, 0.35F, 0.35F);
            }
        })
 	   .withCompatibleAttachment(Attachments.HK416RearSights, true, (model) -> {
            if(model instanceof G95_upright_rearsights) {
         	   GL11.glTranslatef(-0.158F, -1.53F, -0.2F);
                GL11.glScaled(0.32F, 0.32F, 0.32F);
            }
        })
 	   .withCompatibleAttachment(Attachments.MBUSRearSights, (model) -> {
            if(model instanceof MBUSRearSight) {
         	   GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            }
        })
         .withCompatibleAttachment(Attachments.NightRaider, () -> {
                     GL11.glTranslatef(-0.21F, -1.4F, -1.8F);
                     GL11.glScaled(0.75F, 0.75F, 0.75F);
         },(model) -> {
             if(model instanceof JPUreticle) {
                 GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                 GL11.glScaled(0.03F, 0.03F, 0.03F);
             }
         })
         
 		.withCompatibleAttachment(Attachments.ACOG, () -> {
                     GL11.glTranslatef(-0.28F, -1.41F, -0.5F);
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
 		
 		.withCompatibleAttachment(Attachments.Specter, () -> {
                     GL11.glTranslatef(-0.18F, -1.1F, -0.7F);
                     GL11.glScaled(0.4F, 0.4F, 0.4F);
         },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
             }
         })
 		
 		.withCompatibleAttachment(Attachments.LeupoldRailScope, () -> {
 		            GL11.glTranslatef(-0.151F, -1.25F, -1.6F);
 		            GL11.glScaled(0.4F, 0.4F, 0.4F);
         },(model) -> {
              if(model instanceof JPUreticle) {
                 GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                 GL11.glScaled(0.04F, 0.04F, 0.04F);
             }
         })
 		
 		.withCompatibleAttachment(Attachments.MicroReflex, () -> {
             GL11.glTranslatef(-0.15F, -1.93F, -1F);
             GL11.glScaled(0.35F, 0.35F, 0.35F);
             },(model) -> {
                 if(model instanceof Reflex2) {
                     GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                     GL11.glScaled(0.15F, 0.15F, 0.15F);
                 } else if (model instanceof SightMount) {
//                 	GL11.glTranslatef(-0.15F, -1.82F, -1F);
//                     GL11.glScaled(0.4F, 0.4F, 0.4F);
                 }
             })
 		
 		.withCompatibleAttachment(Attachments.Reflex, () -> {
                     GL11.glTranslatef(-0.066F, -1.21F, -0.9F);
                     GL11.glScaled(0.45F, 0.45F, 0.45F);
 		},(model) -> {
             if(model instanceof Reflex2) {
 			    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                 GL11.glScaled(0.15F, 0.15F, 0.15F);
 			}
 		})
 		.withCompatibleAttachment(Attachments.BijiaReflex, () -> {
 	                    GL11.glTranslatef(-0.062F, -1.2F, -1F);
 	                    GL11.glScaled(0.48F, 0.48F, 0.48F);
 			},(model) -> {
 	        if(model instanceof Reflex2) {
 	            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
 	            GL11.glScaled(0.15F, 0.15F, 0.15F);
 	        }
 			})
 		
 		.withCompatibleAttachment(Attachments.Holographic, () -> {
                     GL11.glTranslatef(-0.041F, -1.25F, -0.7F);
                     GL11.glScaled(0.65F, 0.65F, 0.65F);
 			},(model) -> {
 	            if(model instanceof Holo2) {
 	                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
 	                GL11.glScaled(0.1F, 0.1F, 0.1F);
 	            }
 	        })
 		
 		.withCompatibleAttachment(Attachments.HolographicAlt, () -> {
                     GL11.glTranslatef(-0.041F, -1.25F, -0.7F);
                     GL11.glScaled(0.65F, 0.65F, 0.65F);
         },(model) -> {
             if(model instanceof Holo2) {
                 GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
             }
         })
 		
 		.withCompatibleAttachment(Attachments.EotechHybrid2, () -> {
                     GL11.glTranslatef(-0.041F, -1.25F, -1.3F);
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
 		
 		.withCompatibleAttachment(Attachments.VortexRedux, () -> {
             GL11.glTranslatef(-0.3F, -1.45F, -1.1F);
             GL11.glScaled(0.45F, 0.45F, 0.45F);
 	    },(model) -> {
 	        if(model instanceof Holo2) {
 	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
 	            GL11.glScaled(0.15F, 0.15F, 0.15F);
 	        }
 	    })
 	    
 		.withCompatibleAttachment(Attachments.Kobra, () -> {
                     GL11.glTranslatef(-0.041F, -1.26F, -0.7F);
                     GL11.glScaled(0.65F, 0.65F, 0.65F);
 		},(model) -> {
             if(model instanceof Reflex2) {
                 GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                 GL11.glScaled(0.15F, 0.15F, 0.15F);
             }
         })
 		
 		.withCompatibleAttachment(Attachments.KobraGen3, renderContext -> {
 		    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
             if(instance != null) {
                 ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                         AttachmentCategory.GUARD, instance);
                 if(activeAttachment == Attachments.AR57Handguard) {
                     GL11.glTranslatef(-0.041F, -1.37F, -0.7F);
                     GL11.glScaled(0.65F, 0.65F, 0.65F);
                 } else {
                     GL11.glTranslatef(-0.041F, -1.26F, -0.7F);
                     GL11.glScaled(0.65F, 0.65F, 0.65F);
                     }
                 }
 		},(model) -> {
             if(model instanceof Reflex2) {
                 GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                 GL11.glScaled(0.15F, 0.15F, 0.15F);
             }
         }, false, false)
 		
 		.withCompatibleAttachment(Attachments.MicroT1, () -> {
                     GL11.glTranslatef(-0.18F, -1.45F, -1F);
                     GL11.glScaled(0.38F, 0.38F, 0.38F);
             },(model) -> {
                 if(model instanceof Reflex2) {
                     GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                     GL11.glScaled(0.15F, 0.15F, 0.15F);
                 }
             })
 		
 		.withCompatibleAttachment(Attachments.AimpointCompM5, () -> {
                     GL11.glTranslatef(-0.18F, -1.45F, -1F);
                     GL11.glScaled(0.38F, 0.38F, 0.38F);
         },(model) -> {
             if(model instanceof Reflex2) {
                 GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                 GL11.glScaled(0.15F, 0.15F, 0.15F);
             }
         })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
            GL11.glTranslatef(-0.18F, -0.3F, -4.5F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
        })
        .withCompatibleAttachment(Attachments.Laser2, () -> {
        	GL11.glTranslatef(-0.22F, -1.18F, -3.8F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            GL11.glRotatef(-90F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.Laser, () -> {
            GL11.glTranslatef(0.05F, -1.13F, -4.55F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        })
        .withCompatibleAttachment(Attachments.Silencer762x51, (model) -> {
            GL11.glTranslatef(-0.2F, -1.235F, -8.2F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("m110")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new M110())
            .withADSBeizer(new Vec3d(0.2F, 1.7, 0.5F))
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
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-1.7F, -0.8F, 1.9F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.425000f, 3.825000f, -2.525000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0F, 3.0F, 3.0F)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.050000f, 0.025000f, -0.500000f)
                        .withBBRotation(-8.1997F, -23.6991F, 57.7232F)
                        .withScale(2.6F, 2.6F, 4.0F)
                        .withPivotPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.2F, 0.1F, 2)
                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                        .withScale(3.5F, 3.5F, 3.5F)
                        .withPivotPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("m110", AuxiliaryAttachments.AKaction)
                .setupModernMagazineAnimations("m110", Magazines.M110Mag)
        
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M110EjectorAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.7f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M110EjectorAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.7f);
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
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
            	GL11.glTranslatef(0.18f, -0.02f, 0.3f);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), AuxiliaryAttachments.AR15Iron)) {
                        GL11.glTranslatef(0F, 0.028f, -0.3f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                        GL11.glTranslatef(0F, 0f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                        GL11.glTranslatef(0F, 0.03f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                	GL11.glTranslatef(0F, 0.025f, 0f);
                } 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                        GL11.glTranslatef(0F, 0f, 0f);
				} 
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                        GL11.glTranslatef(-0.01F, 0.03f, 0.7f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        GL11.glTranslatef(-0.003F, -0.05f, 0.6f);
                } 

				// HP Zoomw
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                        GL11.glTranslatef(0.001F, -0.027f, 0.5f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        GL11.glTranslatef(0F, -0.015f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                        GL11.glTranslatef(0F, -0.01f, 0f);
                } 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                        GL11.glTranslatef(0F, 0.03f, 0f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    	GL11.glTranslatef(0F, 0.03f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                	GL11.glTranslatef(-0.004F, 0.025f, 0.25f);
                } 
				
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                        GL11.glTranslatef(0F, 0.06f, 0f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                        GL11.glTranslatef(0F, 0.055f, 0.3f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                        GL11.glTranslatef(0F, 0.055f, 0.3f);
                } 
				
				// Everything else
				else {
				}
			
				})
                
			.withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-1.905000f, 4.065000f, -3.645000f)
				 .withRotation(0.000000f, -30.514396f, -26.062789f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .applyTransformations();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-1.425000f, 3.545000f, -5.685000f)
				 .withRotation(-0.187566f, -46.164037f, -11.869230f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .applyTransformations();
            })
                     
			 .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                    	 new Transform()
                    	 .withPosition(1.730000f, 0.065000f, -0.980000f)
                    	 .withRotation(93.414678f, 23.699100f, 15.553163f)
                         .withScale(2.6F, 2.6F, 4.0F)
                         .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                         .applyTransformations();
                     }, 
                     (renderContext) -> {
                    	 new Transform()
                         .withPosition(-0.2F, 0.1F, 2)
                         .withRotation(-5.4027F, -4.7805F, -1.6694F)
                         .withScale(3.5F, 3.5F, 3.5F)
                         .withPivotPoint(0, 0, 0)
                         .applyTransformations();
                     })
                     
            .withFirstPersonHandPositioningModifyingAlt(
            		(renderContext) -> {
                   	 new Transform()
                   	 	.withPosition(2.450000f, -0.335000f, -0.660000f)
                   	 	.withRotation(93.766422f, 50.841130f, 4.679372f)
                   	 	.withScale(2.600000f, 2.600000f, 4.000000f)
                        .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                        .applyTransformations();
                    }, 
                    (renderContext) -> {
                   	 new Transform()
                   	 	.withPosition(-0.600000f, 0.340000f, 1.880000f)
                   	 	.withRotation(-12.193518f, -4.7805F, 1.399459f)
                        .withScale(3.5F, 3.5F, 3.5F)
                        .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                        .applyTransformations();
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
        .withSpawnEntityDamage(10f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
         
        .build(MWC.modContext);
    }
}
