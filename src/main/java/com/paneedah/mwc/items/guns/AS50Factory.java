package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class AS50Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("as50")
        .withFireRate(0.1f)
        .withRecoil(14f)
        .withZoom(0.8f)
        .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
        .withMuzzlePosition(new Vec3d(0.1120000033378601, -1.7240000156164168, -11.052000076055524))
        .withMaxShots(1)
        .withShootSound("as50")
        .withPumpTimeout(1000)
        .withSilencedShootSound("as50_silenced")
        .withDrawSound("as50_draw")
        .withReloadingTime(40)
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.08f)
        .withFlashOffsetY(() -> 0.11f)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
        		// The weapons power
        		35.0,
        		// Muzzle climb divisor
        		25.0,
        		// "Stock Length"
        		46.25,
        		// Recovery rate from initial shot
        		0.3,
        		// Recovery rate @ "stock"
        		0.425,
        		// Recoil rotation (Y)
        		0.025,
        		// Recoil rotation (Z)
        		0.025,
        		// Ads similarity divisor
        		1.0
        ))
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
        })
       .withCompatibleAttachment(Magazines.AS50Mag, (model) -> {
        })
       .withCompatibleAttachment(Attachments.HK416FrontSight, true, (model) -> {
           if(model instanceof G95_upright_frontsights) {
               GL11.glTranslatef(-0.199F, -2.03F, -4.4F);
               GL11.glScaled(0.35F, 0.35F, 0.35F);
             }
       })
       .withCompatibleAttachment(Attachments.HK416RearSights, true, (model) -> {
           if(model instanceof G95_upright_rearsights) {
               GL11.glTranslatef(-0.199F, -2.01F, -0.7F);
               GL11.glScaled(0.35F, 0.34F, 0.35F);
           }
       })
       .withCompatibleAttachment(Attachments.ACOG, () -> {
            GL11.glTranslatef(-0.38F, -1.88F, -1F);
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
        .withCompatibleAttachment(Attachments.Specter, () -> {
            GL11.glTranslatef(-0.215F, -1.5F, -1.3F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, () -> {
            GL11.glTranslatef(-0.205F, -1.68F, -2.5F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        .withCompatibleAttachment(Attachments.MicroReflex, () -> {
		    GL11.glTranslatef(-0.18F, -2.5F, -1.2F);
		    GL11.glScaled(0.42F, 0.42F, 0.42F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        } else if (model instanceof SightMount) {
		        }
		    })
        .withCompatibleAttachment(Attachments.Reflex, () -> {
                GL11.glTranslatef(-0.095F, -1.64F, -1.5F);
                GL11.glScaled(0.57F, 0.57F, 0.57F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
            GL11.glTranslatef(-0.0871F, -1.6F, -1.5F);
            GL11.glScaled(0.62F, 0.62F, 0.62F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, () -> {
            GL11.glTranslatef(-0.07F, -1.75F, -1.5F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, () -> {
            GL11.glTranslatef(-0.07F, -1.75F, -1.5F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.EotechHybrid2, () -> {
            GL11.glTranslatef(-0.07F, -1.75F, -1.5F);
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
        .withCompatibleAttachment(Attachments.VortexRedux, () -> {
                GL11.glTranslatef(-0.350F, -1.95F, -1.5F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
    	    },(model) -> {
    	        if(model instanceof Holo2) {
    	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
    	            GL11.glScaled(0.15F, 0.15F, 0.15F);
    	        }
    	    })
        .withCompatibleAttachment(Attachments.Kobra, () -> {
                GL11.glTranslatef(-0.075F, -1.7F, -1.1F);
                GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, () -> {
                GL11.glTranslatef(-0.075F, -1.7F, -1.1F);
                GL11.glScaled(0.75F, 0.75F, 0.75F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.MicroT1, () -> {
                GL11.glTranslatef(-0.24F, -1.95F, -1.3F);
                GL11.glScaled(0.48F, 0.48F, 0.48F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM5, () -> {
            GL11.glTranslatef(-0.24F, -1.95F, -1.3F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
          GL11.glTranslatef(-0.25F, -0.3F, -3.6F);
          GL11.glScaled(1.2F, 1.2F, 1.2F);
      })
        .withCompatibleAttachment(Attachments.Silencer50BMG, (model) -> {
            GL11.glTranslatef(-0.25F, -1.3F, -11F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser2, () -> {
            GL11.glTranslatef(0.1F, -1.3F, -5.0F);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
		})
		.withCompatibleAttachment(Attachments.Laser, () -> {
            GL11.glTranslatef(0.1F, -1.3F, -5.0F);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
		})
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.24F, -1.3F, -5.4F);
                GL11.glScaled(1F, 1F, 0.5F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.52F, -1.0F, -5.4F);
                GL11.glScaled(1F, 1F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(-0.02F, -4F, -4.3F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(-0.275F, -1.787F, -3.47f);
                GL11.glScaled(0.85F, 0.85F, 1.3F);
            } else if(model instanceof AKRail5) {
                GL11.glTranslatef(-0.275F, -1.787F, -5.3f);
                GL11.glScaled(0.85F, 0.85F, 1.3F);
            }
        })
        .withTextureNames("as50")
        .withRenderer(new WeaponRenderer.Builder()

            .withModel(new AS50())
            .withActionPiece(AuxiliaryAttachments.AS50Action)
            .withActionTransform(new Transform().withPosition(0, 0, 1.5F))
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0f, 3f);
                GL11.glRotatef(0F, 0f, 0f, 4f);
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

            .withFirstPersonPositioning(
                     new Transform()
                     .withPosition(-1.705000f, 4.705000f, -3.445000f)
                     .withRotation(0.000000f, 1.000000f, 6.300000f)
                     .withPivotPoint(-0.230000f, -1.740000f, 0.140000f)
                     .withScale(3.0F, 3.0F, 3.0F)
                 )

                 .withFirstPersonHandPositioning(

                        // Left hand
                        new Transform()
                                .withPosition(1.150000f, 0.065000f, -0.980000f)
                                .withBBRotation(-8.1997F, -23.6991F, 57.7232F)
                                .withScale(2.6F, 2.6F, 4.0F)
                                .withPivotPoint(0, 0, 0),



                        // Right hand
                        new Transform()
                                .withPosition(-0.160000f, 0.060000f, 1.640000f)
                                .withRotation(-5.4027F, -6.7805F, -1.6694F)
                                .withScale(3.0F, 3.0F, 3.0F)
                                .withPivotPoint(0, 0, 0)

                 )

                 .setupModernAnimations("m82", AuxiliaryAttachments.AS50Action)
                 .setupModernMagazineAnimations("m82",
                		Magazines.AS50Mag)
 
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.19f, 1.38f, -0.745f);
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.014f, 0.02f, 0.0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.012F, 0.23f, 0.55f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.01F, 0.24f, 1.0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.025F, 0.126f, 1.1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.03F, 0.235f, 0.7f);
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
                    GL11.glTranslatef(-0.01F, 0.25f, 0.75f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.014f, 0.24f, 1f);
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
                
                // Everything else
                else {
                }
                
            
                })
                
           .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-1.905000f, 4.065000f, -3.645000f)
				 .withRotation(0.000000f, -30.514396f, -26.062789f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(2.300000f, 2.300000f, 2.300000f)
				 .applyTransformations();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-1.425000f, 3.545000f, -5.685000f)
				 .withRotation(-0.187566f, -46.164037f, -11.869230f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(2.300000f, 2.300000f, 2.300000f)
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

            .build())
        .withSpawnEntityDamage(25f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(MWC.modContext);
    }
}