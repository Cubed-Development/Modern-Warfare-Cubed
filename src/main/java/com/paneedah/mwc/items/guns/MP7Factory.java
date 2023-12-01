package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
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
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;


public class MP7Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("mp7")
        .withFireRate(0.9f)
        .withRecoil(1f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SMG)
        .withShellType(Type.PISTOL)
        .hasFlashPedals()
        .withMuzzlePosition(new Vec3d(-0.15600000464916233, -0.7239999917745591, -2.523999881505966))
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("mp7")
        .withSilencedShootSound("mp5_silenced")
        .withReloadSound("mp5_reload")
        .withUnloadSound("mp5_unload")
        .withDrawSound("noaction_draw")
        .withReloadingTime(45)
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.16f)
        .withFlashOffsetY(() -> 0.23f)
        .withInaccuracy(2f)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
				// The weapons power
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
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 7), new
        		CraftingEntry(MWCItems.gunmetalPlate, 5), new
        		CraftingEntry(MWCItems.steelIngot, 3))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 0.1f, // y
                 3f) // z
         
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
         .withCompatibleAttachment(AuxiliaryAttachments.MP7Grip, true, (model) -> {
         })
         .withCompatibleAttachment(AuxiliaryAttachments.MP7action, true, (model) -> {
       })
         .withCompatibleAttachment(Attachments.MP7Stock, true, (model) -> {
         })
         .withCompatibleAttachment(Attachments.MP7MilSpecStock, (model) -> {
        	 if(model instanceof MilSpecStock) {
       		 GL11.glTranslatef(0f, 0.22f, 0.9f);
            } 
        })
        .withCompatibleAttachment(Magazines.MP7Mag, (model) -> {
        })
        .withCompatibleAttachment(Magazines.MP7Mag20, (model) -> {
        })
        .withCompatibleAttachment(Attachments.MP7IronSights, true, (model) -> {
            if(model instanceof MP7RearSights) {
                GL11.glTranslatef(-0.12F, -0.74F, 0.63F);
                GL11.glScaled(0.2F, 0.2F, 0.2F); 
            } else if(model instanceof MP7FrontSights) {
            	GL11.glTranslatef(-0.12F, -0.74F, -0.8F);
                GL11.glScaled(0.2F, 0.2F, 0.2F); 
            } 
        })
        .withCompatibleAttachment(Attachments.MP7IronSightsStanding, (model) -> {
            if(model instanceof MP7RearSightFlipped) {
                GL11.glTranslatef(-0.12F, -0.74F, 0.63F);
                GL11.glScaled(0.2F, 0.2F, 0.2F); 
            } else if(model instanceof MP7FrontSightFlipped) {
            	GL11.glTranslatef(-0.12F, -0.74F, -0.8F);
                GL11.glScaled(0.2F, 0.2F, 0.2F); 
            } 
        })
        .withCompatibleAttachment(Attachments.NightRaider, () -> {
            GL11.glTranslatef(-0.203F, -1.07F, -1.18F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, () -> {
            GL11.glTranslatef(-0.288F, -1.07F, 0F);
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
        .withCompatibleAttachment(Attachments.MicroT1, () -> {
                GL11.glTranslatef(-0.175F, -1.1F, 0F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, () -> {
        	GL11.glTranslatef(-0.175F, -1.1F, 0F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM2, () -> {
            GL11.glTranslatef(-0.12F, -0.55F, 0.2F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.005F, -0.89F, -1.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Specter, () -> {
            GL11.glTranslatef(-0.18F, -0.8F, -0.3F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, () -> {
            GL11.glTranslatef(-0.07F, -0.92F, -0.5F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
        	GL11.glTranslatef(-0.065F, -0.90F, -0.5F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, () -> {
                GL11.glTranslatef(-0.035F, -0.94F, -0.4F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, () -> {
        	GL11.glTranslatef(-0.035F, -0.94F, -0.4F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, () -> {
        	GL11.glTranslatef(-0.035F, -0.94F, -0.7F);
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
        .withCompatibleAttachment(Attachments.VortexRedux, () -> {
                GL11.glTranslatef(-0.3F, -1.12F, -0.5F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, () -> {
                GL11.glTranslatef(-0.043F, -0.95F, 0F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, () -> {
        	GL11.glTranslatef(-0.043F, -0.95F, 0F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.MicroReflex, () -> {
            GL11.glTranslatef(-0.15F, -1.6F, -0.5F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                } else if (model instanceof SightMount) {
                }
            })
        .withCompatibleAttachment(Attachments.RMR, () -> {
            GL11.glTranslatef(-0.165F, -1.1F, -0.3F);
            GL11.glScaled(0.3F, 0.3F, 0.3F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.1F, -0.5F);
	            GL11.glScaled(0.2F, 0.2F, 0.2F);
	        }
	    })
        .withCompatibleAttachment(Attachments.LeupoldDeltapointPro, () -> {
            GL11.glTranslatef(-0.165F, -1.1F, -0.3F);
            GL11.glScaled(0.25F, 0.25F, 0.25F);
        },(model) -> {
            if(model instanceof Reflex2) {
              GL11.glTranslatef(0.155F, -0.1F, -0.5F);
              GL11.glScaled(0.2F, 0.2F, 0.2F);
           }
        })
        .withCompatibleAttachment(Attachments.Laser, () -> {
            GL11.glTranslatef(-0.0F, -0.55F, -2F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.Laser2, () -> {
        	GL11.glTranslatef(-0.0F, -0.55F, -2F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.SilencerMP7, (model) -> {
            GL11.glTranslatef(-0.21F, -0.7F, -3.8F);
            GL11.glScaled(1.1F, 1.1F, 1.0F);
        })
        .withTextureNames("mp7")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new MP7())
            .withADSBeizer(new Vec3d(0.2F, 1.7, -3))
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
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.105000f, 2.785000f, -5.045000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
					.withPivotPoint(-0.350000f, -0.900000f, 0.700000f)
                    .withScale(3.0F, 3.0F, 3.0F)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.090000f, 0.865000f, 0.860000f)
                        .withBBRotation(-18.3277F, -19.993F, 76.7174F)
                        .withScale(2.6F, 2.6F, 4.0F)
                        .withPivotPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.240000f, 0.380000f, 1.960000f)
                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                        .withScale(3.2F, 3.2F, 3.2F)
                        .withPivotPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("mp7", AuxiliaryAttachments.MP7Grip)
                .setupModernMagazineAnimations("mp7", 
                		Magazines.MP7Mag,
                		Magazines.MP7Mag20)

                    
            .withThirdPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                        GL11.glTranslatef(-3.5F, 0F, 3.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 210, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                        GL11.glTranslatef(-3.5F, 0F, 3.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                        GL11.glTranslatef(-3.5F, 0F, 3.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 240, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                        GL11.glTranslatef(-3.5F, 0F, 3.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                        GL11.glTranslatef(-3.5F, 0F, 3.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 300, 60),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                    GL11.glTranslatef(-3.5F, 0F, 3.5F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 120, 190),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                    GL11.glTranslatef(-3.5F, 0F, 3.5F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 300, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                    GL11.glTranslatef(-3.5F, 0F, 3.5F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 120, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                    GL11.glTranslatef(-3.5F, 0F, 3.5F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 120, 0)
            )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.14f, 0.58f, -1.3f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MP7IronSightsStanding)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.175f, 0f);
                } else {
                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.15f, 0.8f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.17f, 0.9f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.17f, 0.8f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.17f, 0.8f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.14f, 0.7f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.12f, 1f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.12f, 1f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.12f, 1f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.215f, 0.8f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.215f, 0.8f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.211f, 0.6f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.21f, 0.8f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.2f, 0.6f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.2f, 0.6f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.2f, 0.6f);
                    }

                    // ACOG Zoom
                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.07f, 0.6f);
                    }

                    if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldDeltapointPro)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.07f, 0.6f);
                    }

                    else {
                    }
                }
                
            
                })
             
            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-1.105000f, 3.025000f, -6.445000f)
				 .withRotation(0.000000f, -30.514396f, -26.062789f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .applyTransformations();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-1.105000f, 3.025000f, -7.485000f)
				 .withRotation(-0.187566f, -46.164037f, -11.869230f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .applyTransformations();
           })
					 
			.withFirstPersonHandPositioningModifying(
                   (renderContext) -> {
                  	 new Transform()
                  	.withPosition(3.690000f, 0.025000f, 0.860000f)
                  	.withRotation(82.522854f, 31.220711f, 8.301319f)
                       .withScale(2.6F, 2.6F, 4.0F)
                       .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                       .applyTransformations();
                   }, 
                   (renderContext) -> {
                  	 new Transform()
                  	 .withPosition(-0.240000f, 0.380000f, 1.960000f)
                     .withRotation(-5.4027F, -4.7805F, -1.6694F)
                     .withScale(3.2F, 3.2F, 3.2F)
                       .withPivotPoint(0, 0, 0)
                       .applyTransformations();
                   })
                   
          .withFirstPersonHandPositioningModifyingAlt(
          		(renderContext) -> {
                 	 new Transform()
                 	.withPosition(3.690000f, 0.025000f, 0.860000f)
                  	.withRotation(82.522854f, 31.220711f, 8.301319f)
                 	 	.withScale(2.600000f, 2.600000f, 4.000000f)
                      .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                      .applyTransformations();
                  }, 
                  (renderContext) -> {
                 	 new Transform()
                 	 .withPosition(-0.240000f, 0.380000f, 1.960000f)
                     .withRotation(-5.4027F, -4.7805F, -1.6694F)
                     .withScale(3.2F, 3.2F, 3.2F)
                      .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                      .applyTransformations();
                  })
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.025000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.100000f, 0.125000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.025000f, 0.075000f);
                    }, 300, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-49.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.200000f, 0.050000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.200000f, 0.050000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(21.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.200000f, 0.050000f);
                    }, 280, 0))
             
            .build())
        .withSpawnEntityDamage(5.5f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}