package com.paneedah.mwc.items.guns;
// Package

// IMPORT LIST START

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
// IMPORT LIST END


public class ACRFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		
		.withName("acr") // Name of the item and model
		.withFireRate(0.65f) // Fire rate in rounds per minute
		.withRecoil(3f) // Recoil in degrees
		.withZoom(0.9f) // Zoom factor
		.withConfigGroup(GunConfigurationGroup.RIFLES) // Config group
		.withMuzzlePosition(new Vec3d(0.0, -1.076000002264977, -6.227999991893772)) // Muzzle position
		.hasFlashPedals() // Has flash pedals
		.withMaxShots(1, 3, Integer.MAX_VALUE) // Max shots
		//.withMaxShots(5)
		.withShootSound("acr") // Shoot sound
		.withSilencedShootSound("m4a1_silenced") // Silenced shoot sound
		.withReloadSound("acr_reload") // Reload sound
		.withUnloadSound("acr_unload") // Unload sound
		.withDrawSound("acr_draw") // Draw sound
		.withReloadingTime(30) // Reloading time in ticks
		.withCrosshair("gun") // Crosshair
		.withCrosshairRunning("Running") // Running crosshair
		.withCrosshairZoomed("Sight") // Zoomed crosshair
		.withFlashIntensity(0.5f) // Flash intensity
        .withFlashScale(() -> 0.6f) // Flash scale
        .withFlashOffsetX(() -> 0.14f) // Flash offset X
        .withFlashOffsetY(() -> 0.16f) // Flash offset Y
		.withCreativeTab(MWC.ASSAULT_RIFLES_TAB) // Creative tab
		.useNewSystem() // Use new system
		.withRecoilParam(new RecoilParam( // Recoil param
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
		.withInformationProvider(stack -> Arrays.asList( // Information provider
        "Type: Modular Assault Rifle", // Information
        "Damage: 6", // Damage in Item Description
        "Cartridge: 5.56x45mm NATO", // Cartridge in Item Description
        "Fire Rate: SEMI, BURST, AUTO", // Fire Rate in Item Description
        "Rate of Fire: 65/100",// Rate of Fire in Item Description
        "Magazines:", // Magazines in Item Description
        "30rnd 5.56x45mm NATO STANAG Magazine",  // Magazines Tyoes in Item Description
        "30rnd 5.56x45mm NATO PMAG Magazine",
        "50rnd 5.56x45mm NATO STANAG Drum Magazine",
		"60rnd 5.56x45mm NATO STANAG Drum Magazine",
		"100rnd 5.56x45mm NATO STANAG Drum Magazine"))
        
        .withScreenShaking(RenderableState.SHOOTING,  // Screen shaking 
                1f, // x 
                1f, // y
                3f) // z
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 8), new
        		CraftingEntry(MWCItems.gunmetalPlate, 12), new
        		CraftingEntry(MWCItems.steelIngot, 3))
        
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)  // Creative tab

        // Unremovable attachment categories
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })

        // Compatible ACR attachment ACRStock
        .withCompatibleAttachment(Attachments.ACRStock, true, (model) -> {
//            GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })

        // Compatible ACR attachment ACRStockBlack
        .withCompatibleAttachment(Attachments.ACRStockBlack, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//          GL11.glScaled(1.15F, 1.2F, 1.2F);
      })

        // Compatible ACR attachment ACRPRSStockTan
        .withCompatibleAttachment(Attachments.ACRPRSStockTan, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//          GL11.glScaled(1.15F, 1.2F, 1.2F);
        })

        // Compatible ACR attachment ACRFixedStockTan
        .withCompatibleAttachment(Attachments.ACRFixedStockTan, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//          GL11.glScaled(1.15F, 1.2F, 1.2F);
        })

        // Compatible ACR attachment ACRLongRangeStock
        .withCompatibleAttachment(Attachments.ACRLongRangeStock, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//          GL11.glScaled(1.15F, 1.2F, 1.2F);
        })

        // Compatible ACR attachment ACRPDWStock
        .withCompatibleAttachment(Attachments.ACRPDWStock, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//          GL11.glScaled(1.15F, 1.2F, 1.2F);
        })

        // Compatible ACR attachment CollapseableMOEStock
        .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
            GL11.glTranslatef(0.01f, -0.35f, -0.15f);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })

        // Compatible ACR attachment MagpulCTRStock
        .withCompatibleAttachment(Attachments.MagpulCTRStock, (model) -> {
            GL11.glTranslatef(0.01f, -0.35f, -0.15f);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })

        // Compatible ACR attachment MilSpecStock
        .withCompatibleAttachment(Attachments.MilSpecStock, (model) -> {
            GL11.glTranslatef(0.01f, -0.35f, -0.15f);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })

        // Compatible ACR attachment HK416Stock
        .withCompatibleAttachment(Attachments.HK416Stock, (model) -> {
            GL11.glTranslatef(0.01f, -0.35f, -0.15f);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })

        // Compatible ACR attachment ACRHandGuard
        .withCompatibleAttachment(Attachments.ACRHandGuard, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.19F, -1.15F, -3.9F);
                GL11.glScaled(0.85F, 0.85F, 0.8F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.43F, -0.93F, -3.92F);
                GL11.glScaled(0.85F, 0.85F, 0.8F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
            	GL11.glTranslatef(-0.03F, -0.77F, -3.94F);
                GL11.glScaled(0.85F, 0.85F, 0.75F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            }
        })

        // Compatible ACR attachment ACRHandGuardBlack
        .withCompatibleAttachment(Attachments.ACRHandGuardBlack, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.19F, -1.15F, -3.9F);
                GL11.glScaled(0.85F, 0.85F, 0.8F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.43F, -0.93F, -3.92F);
                GL11.glScaled(0.85F, 0.85F, 0.8F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
            	GL11.glTranslatef(-0.03F, -0.77F, -3.94F);
                GL11.glScaled(0.85F, 0.85F, 0.75F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            }
        })

        // Compatible ACR attachment ACRWEMSKHandGuardTan
        .withCompatibleAttachment(Attachments.ACRWEMSKHandGuardTan, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.03F, -0.77F, -3.94F);
                GL11.glScaled(0.85F, 0.85F, 0.75F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } 
        })

        // Compatible ACR attachment ACRPrecisionHandGuardTan
        .withCompatibleAttachment(Attachments.ACRPrecisionHandGuardTan, (model) -> {
//        	GL11.glTranslatef(0.01f, -0.35f, -0.15f);
//            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })

        // Compatible ACR attachment ACRPolymerHandGuardTan
        .withCompatibleAttachment(Attachments.ACRPolymerHandGuardTan, (model) -> {
//        	GL11.glTranslatef(0.01f, -0.35f, -0.15f);
//            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })

        // Compatible ACR attachment ACRSBRHandGuardTan
        .withCompatibleAttachment(Attachments.ACRSBRHandGuardTan, (model) -> {
//        	GL11.glTranslatef(0.01f, -0.35f, -0.15f);
//            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })

        // Compatible ACR attachment ACRSquareDropHandguardTan
        .withCompatibleAttachment(Attachments.ACRSquareDropHandguardTan, (model) -> {
        	GL11.glTranslatef(0.001f, -0f, 0f);
//            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })

        // Compatible ACR attachment M4A1Mag
        .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
            GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
            GL11.glScaled(1.1F, 1.2F, 1.2F);
        })

        // Compatible ACR attachment M38Mag
        .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
            GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })

        // Compatible ACR attachment Stanag50
        .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
            GL11.glTranslatef(0F, -0.15F, -0.1F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })

        // Compatible ACR attachment Stanag60
        .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
            GL11.glRotatef(-10F, 1f, 0f, 0f);
            GL11.glTranslatef(0F, 0.08F, -0.15F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })

        // Compatible ACR attachment Stanag100
        .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
            GL11.glTranslatef(-0.35F, 0.5F, -1.31F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })

        // Compatible ACR attachment NightRaider
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.22F, -1.6F, -2F);
            GL11.glScaled(0.82F, 0.82F, 0.82F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })

        // Compatible ACR attachment ACOG
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.32F, -1.62F, -0.9F);
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

        // Compatible ACR attachment Specter
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.2F, -1.26F, -1F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })

        // Compatible ACR attachment LeupoldRailScope
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.154F, -1.45F, -1.7F);
		            GL11.glScaled(0.46F, 0.46F, 0.46F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})

        // Compatible ACR attachment MicroReflex
	    .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
			    GL11.glTranslatef(-0.148F, -2.12F, -1F);
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

        // Compatible ACR attachment Reflex
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.0555F, -1.4F, -1.5F);
            GL11.glScaled(0.52F, 0.52F, 0.52F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        
        // Compatible ACR attachment Holographic
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0.034F, -1.46F, -1.4F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })

        // Compatible ACR attachment HolographicAlt
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.034F, -1.46F, -1.4F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })

        // Compatible ACR attachment EotechHybrid2
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.034F, -1.46F, -1.4F);
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

        // Compatible ACR attachment BijiaReflex
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.054F, -1.38F, -1.3F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })

        // Compatible ACR attachment VortexRedux
        .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
            GL11.glTranslatef(-0.3F, -1.64F, -1.4F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })

        // Compatible ACR attachment Kobra
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.04F, -1.45F, -0.99F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })

        // Compatible ACR attachment KobraGen3
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
	            GL11.glTranslatef(-0.04F, -1.45F, -0.99F);
	            GL11.glScaled(0.65F, 0.65F, 0.65F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })

        // Compatible ACR attachment MicroT1
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.18F, -1.64F, -1F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.15F, -0.4F, -0.35F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })

        // Compatible ACR attachment AimpointCompM5
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.18F, -1.64F, -1F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
    },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(0.15F, -0.4F, -0.35F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
    })

        // Compatible ACR attachment Grip2
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.4F, -2.7F);
            GL11.glScaled(1F, 1F, 1F);
        })

        // Compatible ACR attachment StubbyGrip
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.4F, -2.7F);
            GL11.glScaled(1F, 1F, 1F);
        })

        // Compatible ACR attachment AngledGrip
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.3F, -2.95F);
            GL11.glScaled(1F, 1F, 1F);
        })

        // Compatible ACR attachment JunoGrip
        .withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
            GL11.glTranslatef(-0.23F, -0.62F, -2.9F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })

        // Compatible ACR attachment VGrip
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.4F, -2.7F);
            GL11.glScaled(1F, 1F, 1F);
        })

        // Compatible ACR attachment Bipod
        .withCompatibleAttachment(Attachments.Bipod, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.ACRPrecisionHandGuardTan) {
                	GL11.glTranslatef(-0.2F, -0.35F, -5F);
    	            GL11.glScaled(1F, 1F, 1F);
                } else {
                	GL11.glTranslatef(-0.18F, -0.35F, -3.5F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }
            }
        },(model) -> {
            if(model instanceof AcogReticle) {
                GL11.glTranslatef(0F, 0F, 0f);
                GL11.glScaled(0F, 0F, 0F);
            }
        }, false, false)

        // Compatible ACR attachment Laser2
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
        	GL11.glTranslatef(0.08F, -1.15F, -3F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
		})

        // Compatible ACR attachment Laser
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.08F, -1.15F, -3F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })

        // Compatible ACR attachment Silencer556x45
        .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
            GL11.glTranslatef(-0.19F, -1.205F, -6.8F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        })

        // Compatible ACR attachment TritiumRearSights
        .withCompatibleAttachment(Attachments.TritiumRearSights, (model) -> {
            if(model instanceof TritiumRearSights) {
            	 GL11.glTranslatef(-0.165F, -1.72F, -0.27F);
                 GL11.glScaled(0.38F, 0.38F, 0.38F);
            }
        })

        // Compatible ACR attachment HK416RearSights
 	   .withCompatibleAttachment(Attachments.HK416RearSights, (model) -> {
            if(model instanceof G95_upright_rearsights) {
         	   GL11.glTranslatef(-0.156F, -1.73F, -0.5F);
                GL11.glScaled(0.32F, 0.32F, 0.32F);
            }
        })

        // Compatible ACR attachment MBUSRearSights
 	   .withCompatibleAttachment(Attachments.MBUSRearSights, true, (model) -> {
            if(model instanceof MBUSRearSight) {
         	   GL11.glTranslatef(-0.16F, -1.73F, -0.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            }
        })

      // Compatible ACR attachment HK416FrontSight
 	  .withCompatibleAttachment(Attachments.HK416FrontSight, (model) -> {
 		  		if(model instanceof G95_upright_frontsights) {
 		  			GL11.glTranslatef(-0.155F, -1.76F, -3.5F);
 	                GL11.glScaled(0.32F, 0.32F, 0.32F);
 		  		}
              })
      
       // Compatible ACR attachment MBUSFrontSight
      .withCompatibleAttachment(Attachments.MBUSFrontSight, true, (model) -> {
    	  if(model instanceof MBUSFrontSight) {
    		  GL11.glTranslatef(-0.16F, -1.73F, -3.6F);
              GL11.glScaled(0.35F, 0.35F, 0.35F);
           }
      })

        // Compatible ACR attachment AKMIron
        .withCompatibleAttachment(Attachments.AKMIron, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.255F, -1.55F, -2.25F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.17F, -1.68F, -3.8F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.22F, -2F, -3.8F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.09F, -1.525F, -3.8F);
                GL11.glScaled(0F, 0F, 0F); 
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof M27rearsight) {
            	GL11.glTranslatef(-0.164F, -1.7F, -0.5F);
                GL11.glScaled(0.38F, 0.38F, 0.38F);
            } else if(model instanceof MBUSiron) {
            	 GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                 GL11.glScaled(0F, 0F, 0F); 
            }
        })
        
        // Compatible ACR attachment ACRRails
        .withCompatibleAttachment(AuxiliaryAttachments.ACRRails, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.19F, -1.15F, -3.9F);
                GL11.glScaled(0F, 0F, 0F); 
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.43F, -0.93F, -3.92F);
                GL11.glScaled(0F, 0F, 0F); 
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(-0.03F, -0.77F, -3.94F);
                GL11.glScaled(0F, 0F, 0F); 
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(-0.226F, -1.52F, -3.9F);
                GL11.glScaled(0.76F, 0.87F, 0.8F);
            } else if(model instanceof AKRail5) {
                GL11.glTranslatef(-0.226F, -1.52F, -2F);
                GL11.glScaled(0.76F, 0.87F, 0.8F);
            }
        })

        // Compatible ACR attachment ACRAction
        .withCompatibleAttachment(AuxiliaryAttachments.ACRAction, true, (model) -> {
            if(model instanceof ACRAction) {
                GL11.glTranslatef(-0.06F, -1.4F, -2.9F);
                GL11.glScaled(0.6F, 0.6F, 0.5F);
//                GL11.glRotatef(20F, 0f, 0f, 1f);
            }
            else if(model instanceof ACRAction2) {
            }
        })

        // BUILDS THE GUN
        .withTextureNames("acr")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new BushmasterACR())
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
					.withPosition(-1.425000f, 4.625000f, -2.845000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                		// Left hand
                        new Transform()
                        .withPosition(1.090000f, -0.015000f, -0.620000f)
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
                    GL11.glTranslatef(0F, 0.07f, 0f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.055f, 0f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.05f, 0f);
                }

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.08f, 0.25f);
                }
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0F, 0.11f, 0.7f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.05f, 0.3f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.06f, 0.05f);
                }
                
             // Reflex Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(-0F, 0.055f, 0.6f);
                }

                // Reflex Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(-0F, 0.055f, 0.6f);
                }
                
             // Reflex Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(-0F, 0.045f, 0.6f);
                }

                // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0F, 0.09f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                	 GL11.glTranslatef(-0F, 0.09f, 0.6f);
                }
                
                // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Holo");
                	 GL11.glTranslatef(-0F, 0.1f, 0.3f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0F, 0.08f, 0.8f);
                }

                // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.05f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.05f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0.001F, 0.08f, 0.9f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0.001F, 0.08f, 0.9f);
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
