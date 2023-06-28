package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingComplexity;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class AK74Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("ak74")
//        .withAmmoCapacity(30)
        .withFireRate(0.6f)
        .withRecoil(3f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.RIFLES)
        .hasFlashPedals()
        .withMaxShots(1, Integer.MAX_VALUE)
        .withMuzzlePosition(new Vec3d(-0.16400000488758082, -1.0, -6.5))
        //.withMaxShots(5)
        .withShootSound("ak101")
        .withSilencedShootSound("ak15_silenced")
        .withReloadSound("ak_reload")
        .withUnloadSound("ak_unload")
        .withInspectSound("inspection")
        .withDrawSound("ak_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.6f)
        .withFlashScale(() -> 0.5f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.16f)
//        .withSpawnEntityModel(ammoModel)
//        .withSpawnEntityModelTexture(ammoModelTextureName)
        .withShellCasingVerticalOffset(-0.05f)
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
        "Type: Assault Rifle",
        "Damage: 6", 
        "Cartridge: 5.56x45mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 60/100",
        "Magazines:",
        "30rnd 5.56x45mm Magazine",
        "60rnd 5.56x45mm Magazine"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                1.5f, // x 
                3f, // y
                3f) // z
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 8), new
        		CraftingEntry(MWCItems.gunmetalPlate, 12), new
        		CraftingEntry(MWCItems.steelIngot, 5))
        
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCrafting(CraftingComplexity.MEDIUM,
                MWCItems.gunmetalIngot,
                MWCItems.gunmetalPlate)
//        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.AK47Stock, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK101Stock, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK74Stock, true, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK47DustCover, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AKMDustCover, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK47HandleGuard, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK101HandGuard, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK74Handguard, true, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
      })
        .withCompatibleAttachment(Attachments.AKMagpulHandleGuard, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AKMagpulHandleGuardTan, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.MLOKHandguard, (model) -> {
            if(model instanceof MLOKHandguard) {
//                GL11.glScaled(1F, 0.98F, 1);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.22F, -1.3F, -4.3f);
                GL11.glScaled(0.7F, 0.8F, 0.4F);
            } else if(model instanceof AKRail2) {   
                GL11.glTranslatef(-0.02F, -0.5F, -4.3f);
                GL11.glScaled(0.7F, 0.8F, 0.4F);
                GL11.glRotatef(180.000000f, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(Attachments.MLOKExtendedHandguard, (model) -> {
            if(model instanceof MLOKExtendedHandguard) {
//                GL11.glScaled(1F, 0.98F, 1);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.22F, -1.3F, -5.6f);
                GL11.glScaled(0.7F, 0.8F, 1F);
            } else if(model instanceof AKRail2) {   
                GL11.glTranslatef(-0.02F, -0.5F, -5.6f);
                GL11.glScaled(0.7F, 0.8F, 1F);
                GL11.glRotatef(180.000000f, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(Attachments.AK15HandleGuard, (model) -> {
            if(model instanceof AK15HandleGuard) {
//                GL11.glScaled(1F, 0.98F, 1);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.22F, -1.3F, -4.3f);
                GL11.glScaled(0.7F, 0.8F, 0.4F);
            } else if(model instanceof AKRail2) {   
                GL11.glTranslatef(-0.02F, -0.5F, -4.3f);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(180.000000f, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(Attachments.AK101DustCover, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.VeprDustCover, (model) -> {
            if(model instanceof VeprDustCover) {
                GL11.glScaled(1F, 0.98F, 1);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.22F, -1.3F, -2.75f);
                GL11.glScaled(0.7F, 0.8F, 1.1F);
            }
        })
        .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
            GL11.glTranslatef(0.02f, 0.2f, -0.2f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.MagpulCTRStock, (model) -> {
            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.MilSpecStock, (model) -> {
            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AK47Grip, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AK101Grip, true, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AKErgoGrip, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AKErgoGripTan, (model) -> {
//          GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//          GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AK15action, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AKpart, true, (model) -> {
            GL11.glTranslatef(-0.14F, -0.81F, -5.96F);
            GL11.glScaled(0.5F, 0.5F, 3F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AKMuzzle, true, (model) -> {
            GL11.glTranslatef(-0.19F, -1.01F, -6.92F);
            GL11.glScaled(0.8F, 0.8F, 0.6F);
        })
        .withCompatibleAttachment(Attachments.AKIron, true, (model) -> {
            if(model instanceof AKiron3) {
                GL11.glTranslatef(-0.195F, -1.06F, -5.96F);
                GL11.glScaled(0.9F, 0.55F, 0.5F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.185F, -1.32F, -5.95F);
                GL11.glScaled(0.55F, 0.55F, 0.68F);
            }
        })
        .withCompatibleAttachment(Magazines.AK74Mag, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
//            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(Magazines.AK74Mag60, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
//            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(Magazines.AK12Mag545x39, (model) -> {
        })
        .withCompatibleAttachment(Magazines.AK75Mag545x39, (model) -> {
            GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
            GL11.glTranslatef(0f, 0.35f, 0.35f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.Silencer545x39, (model) -> {
          GL11.glTranslatef(-0.2F, -1.06F, -7.55F);
          GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.185F, -1.32F, -5.95F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.25F, -1.65F, -3.05F);
                GL11.glScaled(0.8F, 0.7F, 0.6F);
            } else if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.155F, -1.74F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
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
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
        	GL11.glTranslatef(-0.18F, -0.15F, -4F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.1F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.1F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.2F, 0.05F, -4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.1F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.PSO1, (player, stack) -> {
            
            GL11.glTranslatef(0.14F, -0.9F, -1.1F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        },(model) -> {
            if(model instanceof PSO1reticle) {
                GL11.glTranslatef(-0.212F, -0.483F, 1.27F);
                GL11.glScaled(0.017F, 0.017F, 0.017F);
            }
             else if(model instanceof PSO12) {
                 GL11.glTranslatef(-0.27F, -0.6F, 1.21F);
                 GL11.glScaled(0.8F, 0.8F, 0.8F);
             }
        })
        .withCompatibleAttachment(Attachments.OKP7, (player, stack) -> {
        	GL11.glTranslatef(-0.2F, -0.65F, -1F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Reflex2) {
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.4F, -2.1F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.32F, -1.4F, -1F);
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
        
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.155F, -1.23F, -1.9F);
		            GL11.glScaled(0.43F, 0.43F, 0.43F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
		            GL11.glTranslatef(-0.195F, -1.05F, -1.3F);
		            GL11.glScaled(0.47F, 0.47F, 0.47F);
		},(model) -> {
		    if(model instanceof Acog2) {
		        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
		        GL11.glScaled(0.1F, 0.1F, 0.1F);
		    }
		})
        
		.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(-0.15F, -1.91F, -1F);
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
        
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.185F, -1.41F, -1.2F);
                GL11.glScaled(0.43F, 0.43F, 0.43F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.185F, -1.41F, -1.2F);
            GL11.glScaled(0.43F, 0.43F, 0.43F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.06F, -1.18F, -1.6F);
            GL11.glScaled(0.52F, 0.52F, 0.52F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.055F, -1.16F, -1.4F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0.035F, -1.25F, -1.4F);
                GL11.glScaled(0.73F, 0.73F, 0.73F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.035F, -1.25F, -1.4F);
            GL11.glScaled(0.73F, 0.73F, 0.73F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.035F, -1.25F, -1.8F);
            GL11.glScaled(0.73F, 0.73F, 0.73F);
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
            GL11.glTranslatef(-0.33F, -1.44F, -1.6F);
            GL11.glScaled(0.52F, 0.52F, 0.52F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.04F, -1.24F, -1F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
        	GL11.glTranslatef(-0.04F, -1.24F, -1F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withTextureNames("bareak")
        .withRenderer(new WeaponRenderer.Builder()
        
                .withModel(new AK101())
                .withActionPiece(AuxiliaryAttachments.AK15action)
                .withActionTransform(new Transform().withPosition(0, 0, 1))
                .withADSBeizer(new Vec3d(0.2, 1.7, 0.5))
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
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-1.8F, -1.1F, 2F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(70F, 1f, 0f, 0f);
                    })
                
                .withFirstPersonPositioning(
    					new Transform()
    					.withPosition(-1.225000f, 3.705000f, -2.525000f)
    					.withRotation(0.000000f, 1.000000f, 6.300000f)
                        .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                        .withScale(3.0, 3.0, 3.0)
                    )
                    
                    .withFirstPersonHandPositioning(
                            
                            // Left hand
                            new Transform()
                            .withPosition(1.210000f, 0.265000f, -0.820000f)
                            .withBBRotation(-7.1415, -27.3003, 52.6433)
                            .withScale(2.8, 2.8, 4.0)
                            .withRotationPoint(0, 0, 0),
                            
                            
                            
                            // Right hand
                            new Transform()
                            .withPosition(-0.200000f, 0.180000f, 1.960000f)
                            .withRotation(-5.4027, -4.7805, -1.6694)
                            .withScale(3, 3, 3.5)
                            .withRotationPoint(0, 0, 0)
                    
                    )
                    
                    .setupModernAnimations("ak47", AuxiliaryAttachments.AK15action)
                    .setupModernMagazineAnimations("ak47", 
                    		Magazines.AK74Mag,
                    		Magazines.AK74Mag60,
                    		Magazines.AK12Mag545x39,
                    		Magazines.AK75Mag545x39)
                
                .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.AK15action.getRenderablePart(), (renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 1f);
                    })
                    
                .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.AK15action.getRenderablePart(), (renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 1f);
                    })
                        
                .withThirdPersonPositioningReloading(
//                        new Transition((renderContext) -> { // Reload position
//                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                            GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
//                            GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                            GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                            GL11.glTranslatef(0.150000f, 1.149999f, 0.175000f);
//                        }, 200, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 210, 100),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 130, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 240, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 400, 150),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 300, 60),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 120, 190),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                    }, 300, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 3.6F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(95F, 1f, 0f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                    }, 120, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                    }, 120, 0)
//                    }, 100, 0)
                )
                
                        
                .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.AK15action.getRenderablePart(),
//                        new Transition((renderContext) -> {
//                        }, 500, 1000),
                        new Transition((renderContext) -> {
                        }, 500, 1000),
                        new Transition((renderContext) -> {
                        }, 500, 1000),
                        new Transition((renderContext) -> {
                        }, 500, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                            GL11.glTranslatef(0f, 0f, 1f);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000)
                            )
                
                .withFirstPersonPositioningZooming((renderContext) -> {
//                    GL11.glRotatef(45F, 0f, 1f, 0f);
//                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                	GL11.glTranslatef(0.18f, -0.23f, 0.7f);

                    
                	// ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.23f, 0.7f);
                    } 
                    
                    // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.26f, 0.9f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.18f, 0.5f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.18f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.22f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.25f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                        //System.out.println("Position me for Acog");
                    	 GL11.glTranslatef(0F, 0.25f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.2f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.19f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.26f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                        //System.out.println("Position me for Acog");
                    	 GL11.glTranslatef(0F, 0.26f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                        //System.out.println("Position me for Acog");
                    	 GL11.glTranslatef(0F, 0.28f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.28f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.24f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                        //System.out.println("Position me for Acog");
                    	 GL11.glTranslatef(0F, 0.24f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AK15ironsight)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.008f, 0f);
                    } 
                    
                    // Everything else
                    else {
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
//                        new Transition((renderContext) -> { // Reload position
//                            GL11.glScalef(3.5f, 3.5f, 3.5f);
//                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                            GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                            GL11.glTranslatef(0.250000f, -0.175000f, 0.225000f);
//                        }, 50, 200),
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
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 250, 100),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 280, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 280, 0))
                        
                .withThirdPersonRightHandPositioningReloading(
//                        new Transition((renderContext) -> { // Reload position
//                            GL11.glScalef(4f, 4f, 5f);
//                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
//                        }, 250, 1000),
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
                            GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                        }, 250, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.075000f, -0.075000f, 0.025000f);
                        }, 250, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                        }, 300, 0))
                 
                .build())
            .withSpawnEntityDamage(6f)
            .withSpawnEntityGravityVelocity(0.0118f)
                    
            .build(MWC.modContext);
        }
    }

