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

public class Mk14EBRFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("mk14_ebr")
        .withFireRate(0.7f)
        .withRecoil(4.5f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.DMR)
        .withMuzzlePosition(new Vec3d(-0.13600000405311582, -1.0, -9.12400007820129))
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("mk14ebr")
        .withSilencedShootSound("mk14ebr_silenced")
        .withReloadSound("mk14ebr_reload")
        .withUnloadSound("mk14_unload")
        .withInspectSound("inspection")
        .withDrawSound("mk14_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.08f)
        .withFlashOffsetY(() -> 0.10f)
        .withInaccuracy(1f)
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
        "Type: Battle Rifle/Designated Marksmen Rifle",
        "Damage: 10", 
        "Cartridge: 7.62x51mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 75/100",
        "Magazines:",
        "20rnd 7.62x51mm NATO EBR Magazine",
        "50rnd 7.62x51mm NATO EBR Drum Magazine"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 1f, // y
                 6f) // z
         
         .withModernRecipe( new
	        		CraftingEntry(MWCItems.carbonComposite, 8), new
	        		CraftingEntry(MWCItems.gunmetalPlate, 15), new
	        		CraftingEntry(MWCItems.steelIngot, 8))
         
//        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCompatibleAttachment(AuxiliaryAttachments.Mk14EBRaction, true, (model) -> {
//        	GL11.glTranslatef(0f, 0f, 0.73f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Mk14EBRsight, true, (model) -> {
            GL11.glTranslatef(-0.125F, -1.16F, -1.334F);
            GL11.glScaled(0.12F, 0.12F, 0.12F);
        })
        .withCompatibleAttachment(Attachments.M14Body, true, (model) -> {
        	if(model instanceof M14Body) {
//                GL11.glTranslatef(0F, 0F, 0F);
//                GL11.glScaled(1F, 1F, 1F);
              } else if(model instanceof FALIron) {
                  GL11.glTranslatef(-0.19F, -1.34F, -8.5F);
                  GL11.glScaled(0F, 0F, 0F);
              }
          })
        .withCompatibleAttachment(Attachments.M14SOCOMChassis, (model) -> {
        	if(model instanceof M14DMRSocomChassis) {
	                GL11.glTranslatef(0F, 0F, 0F);
	                GL11.glScaled(1F, 1F, 1F);
	        	} else if(model instanceof FALIron) {
	                GL11.glTranslatef(-0.19F, -1.34F, -8.5F);
	                GL11.glScaled(0F, 0F, 0F);
	            } 
	        	else if(model instanceof AKRail) {
            	  GL11.glTranslatef(-0.015F, -0.65F, -6f);
                  GL11.glScaled(0.75F, 0.8F, 1F);
                  GL11.glRotatef(180F, 0f, 0f, 1f);
              } 
        })
        .withCompatibleAttachment(Attachments.Mk14TanBody, (model) -> {
        	if(model instanceof Mk14Body) {
                GL11.glTranslatef(0F, 0F, 0F);
                GL11.glScaled(1F, 1F, 1F);
              } else if(model instanceof AKRail) {
            	  GL11.glTranslatef(-0.224F, -1.38F, -6f);
                  GL11.glScaled(0.75F, 0.75F, 1.2F);
              } else if(model instanceof AKRail2) {
            	  GL11.glTranslatef(-0.015F, -0.6F, -6f);
                  GL11.glScaled(0.75F, 0.75F, 1.2F);
                  GL11.glRotatef(180F, 0f, 0f, 1f);
              }
        })
        .withCompatibleAttachment(Attachments.Mk14SnowBody, (model) -> {
        	if(model instanceof Mk14Body) {
                GL11.glTranslatef(0F, 0F, 0F);
                GL11.glScaled(1F, 1F, 1F);
              } else if(model instanceof AKRail) {
            	  GL11.glTranslatef(-0.224F, -1.38F, -6f);
                  GL11.glScaled(0.75F, 0.75F, 1.2F);
              } else if(model instanceof AKRail2) {
            	  GL11.glTranslatef(-0.015F, -0.6F, -6f);
                  GL11.glScaled(0.75F, 0.75F, 1.2F);
                  GL11.glRotatef(180F, 0f, 0f, 1f);
              }
        })
        .withCompatibleAttachment(Attachments.Mk14BlackBody, (model) -> {
        	if(model instanceof Mk14Body) {
                GL11.glTranslatef(0F, 0F, 0F);
                GL11.glScaled(1F, 1F, 1F);
              } else if(model instanceof AKRail) {
            	  GL11.glTranslatef(-0.224F, -1.38F, -6f);
                  GL11.glScaled(0.75F, 0.75F, 1.2F);
              } else if(model instanceof AKRail2) {
            	  GL11.glTranslatef(-0.015F, -0.6F, -6f);
                  GL11.glScaled(0.75F, 0.75F, 1.2F);
                  GL11.glRotatef(180F, 0f, 0f, 1f);
              }
        })
        .withCompatibleAttachment(Attachments.M14Cover, true, (model) -> {
//          GL11.glTranslatef(-0.2F, -1.3F, -9F);
//          GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.M14TriRailCover, (model) -> {
            if(model instanceof M14TriRailCover) {
              GL11.glTranslatef(0F, 0F, 0F);
              GL11.glScaled(1F, 1F, 1F);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(0.12F, -1.25F, -6.6f);
                GL11.glScaled(0.7F, 0.75F, 0.75F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
            	GL11.glTranslatef(-0.36F, -1.04F, -6.6f);
                GL11.glScaled(0.7F, 0.75F, 0.75F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
            	GL11.glTranslatef(-0.224F, -1.38F, -6.6f);
                GL11.glScaled(0.75F, 0.75F, 1.4F);
            }
        })
        .withCompatibleAttachment(Attachments.M14Rail, (model) -> {
        	GL11.glTranslatef(-0.21F, -1.4F, -2.7F);
            GL11.glScaled(1.15F, 1F, 1F);
        })
        .withCompatibleAttachment(Magazines.Mk14EBRMag, (model) -> {
//        	GL11.glTranslatef(0F, 0.8F, -0.3F);
//            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Magazines.M14Drum50, (model) -> {
            GL11.glTranslatef(0F, 0.1F, -0.62F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
            GL11.glRotatef(-10F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Attachments.Silencer762x51, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.BACKGRIP, instance);
                if(activeAttachment == Attachments.Mk14TanBody) {
                	GL11.glTranslatef(-0.2F, -1.3F, -9.5F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                	GL11.glTranslatef(-0.2F, -1.3F, -10.3F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof AcogReticle) {
                GL11.glTranslatef(0F, 0F, 0f);
                GL11.glScaled(0F, 0F, 0F);
            }
        }, false, false)
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                		AttachmentCategory.BACKGRIP, instance);
                if(activeAttachment == Attachments.Mk14TanBody || 
                		activeAttachment == Attachments.Mk14SnowBody || 
                		activeAttachment == Attachments.Mk14BlackBody) {
                    GL11.glTranslatef(0F, 0F, 0.75F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
//                	GL11.glTranslatef(-0.2F, -1.06F, -8.8F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.183F, -1.32F, -5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.25F, -1.65F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
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
            	GL11.glTranslatef(-0.19F, -1.34F, -8.5F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        }, true, false)
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.5F, -3F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
            GL11.glTranslatef(-0.155F, -1.34F, -3F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.29F, -1.52F, -1.5F);
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
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
        	GL11.glTranslatef(-0.177F, -1.5F, -3.5F);
            GL11.glScaled(0.36F, 0.36F, 0.36F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.177F, -1.5F, -3.5F);
            GL11.glScaled(0.36F, 0.36F, 0.36F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM2, (player, stack) -> {
            GL11.glTranslatef(-0.12F, -0.74F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.005F, -0.89F, -1.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(-0.145F, -2.02F, -3.6F);
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
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.182F, -1.22F, -2F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.055F, -1.3F, -4F);
            GL11.glScaled(0.53F, 0.53F, 0.53F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.052F, -1.28F, -3.9F);
            GL11.glScaled(0.56F, 0.56F, 0.56F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
        	GL11.glTranslatef(-0.027F, -1.33F, -3.7F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(-0.027F, -1.33F, -3.7F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.027F, -1.33F, -2.4F);
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
                GL11.glTranslatef(-0.307F, -1.53F, -4F);
                GL11.glScaled(0.47F, 0.47F, 0.47F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
        	GL11.glTranslatef(-0.033F, -1.35F, -3.5F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
	            GL11.glTranslatef(-0.033F, -1.35F, -3.5F);
	            GL11.glScaled(0.7F, 0.7F, 0.7F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.21F, -0.07F, -4.8F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
        	GL11.glTranslatef(-0.21F, -0.07F, -4.8F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
        	GL11.glTranslatef(-0.21F, -0.07F, -5.3F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
        	GL11.glTranslatef(-0.21F, -0.07F, -4.8F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
        	GL11.glTranslatef(-0.21F, -0.07F, -4F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
        	 GL11.glTranslatef(0.03F, -1.25F, -5.5F);
             GL11.glScaled(0.9F, 0.9F, 0.9F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.03F, -1.25F, -5.5F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        })
        .withTextureNames("m14dmr")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new M14())
            .withActionPiece(AuxiliaryAttachments.Mk14EBRaction)
            .withActionTransform(new Transform().withPosition(0, 0, 0.95))
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
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-2.2F, -1.8F, 2.4F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.225000f, 4.065000f, -0.485000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
					.withRotationPoint(-0.350000f, -2.100000f, -1.300000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.210000f, 0.305000f, -1.380000f)
                        .withBBRotation(-7.1415, -27.3003, 52.6433)
                        .withScale(2.8, 2.8, 4.0)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.200000f, 0.180000f, 1.640000f)
                        .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3, 3, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("m14", AuxiliaryAttachments.Mk14EBRaction)
                .setupModernMagazineAnimations("m14", 
                		Magazines.Mk14EBRMag,
                		Magazines.M14Drum50)
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Mk14EBRaction.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                	GL11.glTranslatef(0f, 0f, 0.95f);
                }
              })
                    
            .withThirdPersonPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.150000f, 1.149999f, 0.175000f);
//                    }, 200, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 60),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2F, -2.5F, 2.7F);
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
//                }, 100, 0)
            )
            
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.Mk14EBRaction.getRenderablePart(),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
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
                        GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.142f, 0.85f, 0.7f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.34f, 0.4f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.35f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.305f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.305f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.36f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.35f, 0.2f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.28f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.338f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.355f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.345f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.383f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.383f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.38f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.37f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.37f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.37f, 2f);
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
//                  new Transition((renderContext) -> { // Reload position
//                      GL11.glScalef(3.5f, 3.5f, 3.5f);
//                      GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                      GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                      GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                      GL11.glTranslatef(0.250000f, -0.175000f, 0.225000f);
//                  }, 50, 200),
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
//                  new Transition((renderContext) -> { // Reload position
//                      GL11.glScalef(4f, 4f, 5f);
//                      GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                      GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                      GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                      GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
//                  }, 250, 1000),
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
        .withSpawnEntityDamage(10f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

