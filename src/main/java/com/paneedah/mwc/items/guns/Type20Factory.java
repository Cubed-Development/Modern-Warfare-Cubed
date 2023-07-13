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
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class Type20Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		
		.withName("type20")
		.withFireRate(0.65f)
		.withRecoil(3f)
		.withZoom(0.9f)
		.withConfigGroup(GunConfigurationGroup.RIFLES)
		.withMuzzlePosition(new Vec3d(0.0, -1.076000002264977, -6.227999991893772))
		.hasFlashPedals()
		.withMaxShots(1, 3, Integer.MAX_VALUE)
		//.withMaxShots(5)
		.withShootSound("acr")
		.withSilencedShootSound("m4a1_silenced")
		.withReloadSound("acr_reload")
		.withUnloadSound("acr_unload")
		.withDrawSound("acr_draw")
		.withReloadingTime(30)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.14f)
        .withFlashOffsetY(() -> 0.16f)
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
        "Type: Modular Assault Rifle", 
        "Damage: 6", 
        "Cartridge: 5.56x45mm NATO",
        "Fire Rate: SEMI, BURST, AUTO",
        "Rate of Fire: 65/100",
        "Magazines:",
        "30rnd 5.56x45mm NATO STANAG Magazine",
        "30rnd 5.56x45mm NATO PMAG Magazine",
        "50rnd 5.56x45mm NATO STANAG Drum Magazine",
		"60rnd 5.56x45mm NATO STANAG Drum Magazine",
		"100rnd 5.56x45mm NATO STANAG Drum Magazine"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                1f, // x 
                1f, // y
                3f) // z
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 8), new
        		CraftingEntry(MWCItems.gunmetalPlate, 12), new
        		CraftingEntry(MWCItems.steelIngot, 3))
        
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.M4Grip, true, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
	      .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
	//          GL11.glTranslatef(0f, 0f, 1f);
	      })
	      .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
	//          GL11.glTranslatef(0f, 0f, 1f);
	      })
        .withCompatibleAttachment(Attachments.Type20Handguard, true, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//          GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
            GL11.glTranslatef(-0.322F, 0.5F, -1.25F);
            GL11.glScaled(0.97F, 1.5F, 1.5F);
        })
        .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
        	GL11.glTranslatef(-0.322F, 0.5F, -1.25F);
            GL11.glScaled(0.97F, 1.5F, 1.5F);
        })
        .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
            GL11.glTranslatef(0F, -0.06F, -0.1F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
            GL11.glRotatef(-10F, 1f, 0f, 0f);
            GL11.glTranslatef(0F, 0.2F, -0.15F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
            GL11.glTranslatef(-0.36F, 0.5F, -1.31F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.22F, -1.52F, -2F);
            GL11.glScaled(0.82F, 0.82F, 0.82F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.32F, -1.53F, -0.9F);
            GL11.glScaled(0.83F, 0.83F, 0.83F);
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
            GL11.glTranslatef(-0.19F, -1.2F, -1F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.154F, -1.36F, -1.7F);
		            GL11.glScaled(0.46F, 0.46F, 0.46F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
	.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
			    GL11.glTranslatef(-0.148F, -2.05F, -1F);
			    GL11.glScaled(0.35F, 0.35F, 0.35F);
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
            GL11.glTranslatef(-0.0555F, -1.32F, -1.5F);
            GL11.glScaled(0.52F, 0.52F, 0.52F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0.034F, -1.38F, -1.4F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.034F, -1.38F, -1.4F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.034F, -1.38F, -1.4F);
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
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.054F, -1.3F, -1.3F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
            GL11.glTranslatef(-0.3F, -1.56F, -1.4F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.04F, -1.38F, -0.99F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
        	GL11.glTranslatef(-0.04F, -1.38F, -0.99F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.18F, -1.57F, -1F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.15F, -0.4F, -0.35F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.18F, -1.57F, -1F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
    },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(0.15F, -0.4F, -0.35F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
    })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.3F, -2.7F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.3F, -2.7F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.3F, -2.7F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Bipod, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.ACRPrecisionHandGuardTan
                		|| activeAttachment == Attachments.ACRPrecisionHandGuardTan) {
                	GL11.glTranslatef(-0.2F, -0.35F, -5F);
    	            GL11.glScaled(1F, 1F, 1F);
                } else {
                	GL11.glTranslatef(-0.18F, -0.24F, -2.5F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }
            }
        },(model) -> {
            if(model instanceof AcogReticle) {
                GL11.glTranslatef(0F, 0F, 0f);
                GL11.glScaled(0F, 0F, 0F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
        	GL11.glTranslatef(0.03F, -1.15F, -2.6F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.03F, -1.15F, -2.6F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
            GL11.glTranslatef(-0.19F, -1.15F, -6.6F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        })
 	   .withCompatibleAttachment(Attachments.MBUSRearSights, true, (model) -> {
            if(model instanceof MBUSRearSight) {
         	   GL11.glTranslatef(-0.16F, -1.66F, -0.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            }
        })
      .withCompatibleAttachment(Attachments.MBUSFrontSight, true, (model) -> {
    	  if(model instanceof MBUSFrontSight) {
    		  GL11.glTranslatef(-0.16F, -1.66F, -3.8F);
              GL11.glScaled(0.35F, 0.35F, 0.35F);
           }
      })
        .withTextureNames("type20")
        .withRenderer(new WeaponRenderer.Builder()

            .withModel(new Type20())
            .withActionPiece(AuxiliaryAttachments.ACRAction)
            .withActionTransform(new Transform().withPosition(0, 0, 1))
            //.withTextureName("M4A1")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
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
					.withPosition(-1.425000f, 4.265000f, -3.085000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                		// Left hand
                        new Transform()
                        .withPosition(1.130000f, 0.105000f, -0.580000f)
                        .withBBRotation(-8.1997, -23.6991, 57.7232)
                        .withScale(2.6, 2.6, 4.0)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.2, 0.1, 2)
                        .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3.5, 3.5, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("acr", AuxiliaryAttachments.AKaction)
                .setupModernMagazineAnimations("acr", 
                		Magazines.M4A1Mag, 
                		Magazines.M38Mag, 
                		Magazines.Stanag100,
                		Magazines.Stanag50,
                		Magazines.Stanag60,
                		Magazines.SOCOM_Mag)
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.ACRAction.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 1F);
                }
            })
                    
            .withThirdPersonPositioningReloading(
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
                GL11.glScaled(2F, 2F, 2);
                GL11.glTranslatef(0.148f, 0.945f, -0.1f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.0f, 0f);
                }

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.01f, 0.25f);
                }
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0F, 0.03f, 0.7f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.04f, 0.4f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.024f, 0.05f);
                }
                
             // Reflex Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(-0F, 0.0f, 0.6f);
                }

                // Reflex Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(-0F, -0.01f, 0.6f);
                }
                
             // Reflex Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(-0F, -0.02f, 0.6f);
                }

                // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0F, 0.02f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                	 GL11.glTranslatef(-0F, 0.02f, 0.6f);
                }
                
                // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Holo");
                	 GL11.glTranslatef(-0F, 0.03f, 0.3f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0F, 0.02f, 0.6f);
                }

                // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, -0.01f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, -0.01f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0.001F, 0.02f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0.001F, 0.02f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.039f, 0.2f);
                }

                // Everything else
                {
                }

                })
            
            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-1.905000f, 4.065000f, -3.645000f)
				 .withRotation(0.000000f, -30.514396f, -26.062789f)
				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-1.425000f, 3.545000f, -5.685000f)
				 .withRotation(-0.187566f, -46.164037f, -11.869230f)
				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
          })
					 
			.withFirstPersonHandPositioningModifying(
                  (renderContext) -> {
                 	 new Transform()
                 	 .withPosition(1.730000f, 0.065000f, -0.980000f)
                 	 .withRotation(93.414678f, 23.699100f, 15.553163f)
                      .withScale(2.6, 2.6, 4.0)
                      .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                      .doGLDirect();
                  }, 
                  (renderContext) -> {
                 	 new Transform()
                      .withPosition(-0.2, 0.1, 2)
                      .withRotation(-5.4027, -4.7805, -1.6694)
                      .withScale(3.5, 3.5, 3.5)
                      .withRotationPoint(0, 0, 0)
                      .doGLDirect();
                  })
                  
         .withFirstPersonHandPositioningModifyingAlt(
         		(renderContext) -> {
                	 new Transform()
                	 	.withPosition(2.450000f, -0.335000f, -0.660000f)
                	 	.withRotation(93.766422f, 50.841130f, 4.679372f)
                	 	.withScale(2.600000f, 2.600000f, 4.000000f)
                     .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                     .doGLDirect();
                 }, 
                 (renderContext) -> {
                	 new Transform()
                	 	.withPosition(-0.600000f, 0.340000f, 1.880000f)
                	 	.withRotation(-12.193518f, -4.780500f, 1.399459f)
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
		.withSpawnEntityDamage(6f)
		.withSpawnEntityGravityVelocity(0.0118f)


		.build(MWC.modContext);
	}
}
