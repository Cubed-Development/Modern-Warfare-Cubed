package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class G11Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("g11")
        .withFireRate(0.9f)
        .withRecoil(1f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.RIFLES)
        .withMaxShots(1, 3, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("g11")
        .withSilencedShootSound("mp5_silenced")
        .withReloadSound("g11_reload")
        .withUnloadSound("g11_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.14f)
        .withFlashOffsetY(() -> 0.18f)
        .withShellCasingEjectEnabled(false)
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
        
         .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
         .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
             GL11.glTranslatef(0.01f, -0.19f, -0.4f);
             GL11.glScaled(0F, 0F, 0F);
         })
         .withCompatibleAttachment(Attachments.G11HandguardK1, (model) -> {
//             GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//             GL11.glScaled(0F, 0F, 0F);
         })
         .withCompatibleAttachment(Attachments.G11HandguardK2, true, (model) -> {
//           GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//           GL11.glScaled(0F, 0F, 0F);
         })
        .withCompatibleAttachment(Magazines.G11Mag, (model) -> {
//            GL11.glTranslatef(0F, -0.12F, 2F);
//            GL11.glRotatef(5F, 1f, 0f, 0f);
//            GL11.glRotatef(-10F, 0f, 1f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.G11Action, true, (model) -> {
//          GL11.glTranslatef(0F, -0.12F, 2F);
//          GL11.glRotatef(5F, 1f, 0f, 0f);
//          GL11.glRotatef(-10F, 0f, 1f, 0f);
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
            GL11.glTranslatef(-0.16F, -1.67F, -1.55F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.24F, -1.9F, -1.6F);
            GL11.glScaled(1F, 1F, 1F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.362F, -1.85F, 0.15F);
            GL11.glScaled(1F, 1F, 1F);
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
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.2F, -1.9F, -0.3F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.2F, -1.9F, -0.3F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.47F, -0.35F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.05F, -1.63F, -0.8F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.05F, -1.61F, -0.8F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(-0.018F, -1.7F, -0.4F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                GL11.glTranslatef(-0.018F, -1.7F, -0.4F);
                GL11.glScaled(0.85F, 0.85F, 0.85F);
        },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.018F, -1.7F, -0.7F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
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
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.01F, -1.68F, -0.3F);
                GL11.glScaled(0.85F, 0.85F, 0.85F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
            GL11.glTranslatef(-0.01F, -1.68F, -0.3F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
                GL11.glTranslatef(-0.194F, -1.9F, -0.3F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.15F, -0.03F, -1.5F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            }
        })
//        .withCompatibleAttachment(Attachments.SilencerMP5, (model) -> {
//            GL11.glTranslatef(-0.2F, -1.08F, -4.6F);
//            GL11.glScaled(1F, 1F, 1F);
//        })
        .withTextureNames("g11")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new G11())
            //.withTextureName("AK47")
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
                GL11.glTranslatef(-2.2F, -1.1F, 2.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.425000f, 5.545000f, -5.765000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
					.withRotationPoint(-0.350000f, -3.460000f, -0.580000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.090000f, 0.185000f, 0.180000f)
                        .withBBRotation(-8.1997, -23.6991, 57.7232)
                        .withScale(2.6, 2.6, 4.0)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.200000f, 0.340000f, 2.000000f)
                        .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3.5, 3.5, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("g11", AuxiliaryAttachments.G11Action)
                .setupModernMagazineAnimations("g11", 
                		Magazines.G11Mag)
                
//                .withFirstPersonCustomPositioning(AuxiliaryAttachments.G11Action.getRenderablePart(), (renderContext) -> {
//                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
//                        GL11.glTranslatef(0F, 0F, 1F);
//                    }
//                })
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.13f, 1.65f, -1f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.07f, 0.1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, -0.1f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.035f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.03f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, -0.03f, 0.5f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.01F, -0.1f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.07f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.11f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.02f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.02f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.15f, 0.2f);
                } 
                
                // Everything else
                else {
                }
            
                })
             
            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-1.985000f, 5.145000f, -5.245000f)
				 .withRotation(0.000000f, -30.514396f, -26.062789f)
				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-1.265000f, 4.745000f, -8.285000f)
				 .withRotation(2.793742f, -46.352252f, -19.231070f)
				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
			 })
					 
			.withFirstPersonHandPositioningModifying(
              (renderContext) -> {
             	 new Transform()
             	.withPosition(2.330000f, 0.065000f, 0.140000f)
             	.withRotation(78.544055f, 23.699100f, 18.430633f)
                  .withScale(2.6, 2.6, 4.0)
                  .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                  .doGLDirect();
              }, 
              (renderContext) -> {
             	 new Transform()
             	.withPosition(-0.200000f, -0.180000f, 1.760000f)
               .withRotation(-5.4027, -4.7805, -1.6694)
                  .withScale(3.5, 3.5, 3.5)
                  .withRotationPoint(0, 0, 0)
                  .doGLDirect();
              })
              
		     .withFirstPersonHandPositioningModifyingAlt(
		     		(renderContext) -> {
		            	 new Transform()
		            	 .withPosition(2.330000f, 0.065000f, 0.140000f)
		              	.withRotation(78.544055f, 23.699100f, 18.430633f)
		            	 	.withScale(2.600000f, 2.600000f, 4.000000f)
		                 .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
		                 .doGLDirect();
		             }, 
		             (renderContext) -> {
		            	 new Transform()
		            	.withPosition(-0.200000f, -0.180000f, 1.760000f)
		               .withRotation(-5.4027, -4.7805, -1.6694)
		                 .withScale(3.5, 3.5, 3.5)
		                 .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
		                 .doGLDirect();
		             })
             
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

