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
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class ScarLFactory implements GunFactory {

    @SuppressWarnings("unchecked")
	public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("scar_l")
        .withFireRate(0.6f)
        .withRecoil(3f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.RIFLES)
        .hasFlashPedals()
        .withMaxShots(1, Integer.MAX_VALUE)
        .withShootSound("scar_l")
        .withSilencedShootSound("m4a1_silenced")
        .withReloadSound("scar_reload")
        .withUnloadSound("scar_unload")
        .withEndOfShootSound("gun_click")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.17f)
        .withShellCasingForwardOffset(0.05f)
        .withShellCasingVerticalOffset(-0.03f)
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
        "Type: Carbine", 
        "Damage: 6", 
        "Cartridge: 5.56x45mm NATO",
        "Fire Rate: SEMI, AUTO",
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
	        		CraftingEntry(MWCItems.gunmetalPlate, 13), new
	        		CraftingEntry(MWCItems.steelIngot, 3))
         
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withCompatibleAttachment(Attachments.ScarHandGuard, true, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.ScarMidWestIndustriesHandGuard, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.ScarMLOKHandguard, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.ScarStock, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.ScarHStock, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
      })
        .withCompatibleAttachment(Attachments.ScarRetractableStock, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.ScarAdapterStock, (model) -> {
       	 if(model instanceof MilSpecStock) {
       		GL11.glTranslatef(0f, -0.28f, 0.2f);
//               GL11.glScaled(1.2F, 1.2F, 1.2F);
           } 
       })
        .withCompatibleAttachment(Attachments.ScarLReceiver, true, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.M4Grip, (model) -> {
        	 GL11.glTranslatef(0f, 0.04f, -0.08f);
        })
        .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
        	 GL11.glTranslatef(0f, 0.04f, -0.08f);
        })
        .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
        	 GL11.glTranslatef(0f, 0.04f, -0.08f);
        })
        .withCompatibleAttachment(Attachments.M110Grip, true, (model) -> {
          GL11.glTranslatef(0f, 0.04f, -0.08f);
      })
        .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
		    GL11.glTranslatef(-0.335F, 0.4F, -1.4F);
            GL11.glScaled(1.04F, 1.25F, 1.25F);
            
//            GL11.glTranslatef(0F, 0.35F, 0F);
        })
		.withCompatibleAttachment(Magazines.SOCOM_Mag, (model) -> {
			GL11.glTranslatef(-0.335F, 0.4F, -1.4F);
            GL11.glScaled(1.04F, 1.25F, 1.25F);
        })
        .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
        	GL11.glTranslatef(-0.335F, 0.4F, -1.4F);
            GL11.glScaled(1.04F, 1.25F, 1.25F);
        })
        .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
        	GL11.glTranslatef(0F, 0.05F, -0.16F);
        })
        .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
        	GL11.glRotatef(-10F, 1f, 0f, 0f);
            GL11.glTranslatef(0F, 0.25F, -0.16F);
        })
        .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
        	GL11.glTranslatef(-0.35F, 0.69F, -1.4F);
            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.ScarAction, true, (model) -> {
//        	 GL11.glTranslatef(0F, 0F, 0.2F);
        })
         .withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
             if(model instanceof M4Iron1) {
                 GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
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
                 GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof AK47iron) {
                 GL11.glTranslatef(0.092F, -1.91F, -0.9F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof G36CIron1) {
                 GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof G36CIron2) {
                 GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof ScarIron1) {
                 GL11.glTranslatef(-0.1635F, -1.71F, -0.1F);
                 GL11.glScaled(0.36F, 0.36F, 0.36F);
             } else if(model instanceof ScarIron2) {
                 GL11.glTranslatef(-0.085F, -1.67F, -4.15F);
                 GL11.glScaled(0.45F, 0.45F, 0.45F);
             } else if(model instanceof FALIron) {
                 GL11.glTranslatef(-0.11F, -1.78F, -4.1F);
                 GL11.glScaled(0.07F, 0.25F, 0.2F);
                 GL11.glRotatef(180F, 0f, 0f, 1f);
             } else if(model instanceof M14Iron) {
                 GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof MP5Iron) {
                 GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof MBUSiron) {
                 GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof M27rearsight) {
                 GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                 GL11.glScaled(0F, 0F, 0F);
             }
         })
         .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.212F, -1.6F, -1.9F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.31F, -1.65F, -0.7F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
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
            GL11.glTranslatef(-0.19F, -1.30F, -1.3F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
            GL11.glTranslatef(-0.155F, -1.46F, -2F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.066F, -1.44F, -1.1F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.148F, -2.14F, -1F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                } else if (model instanceof SightMount) {
//                	GL11.glTranslatef(-0.15F, -1.82F, -1F);
//                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.06F, -1.41F, -1F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
		},(model) -> {
		if(model instanceof Reflex2) {
		    GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
		    GL11.glScaled(0.15F, 0.15F, 0.15F);
		}
		})
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(-0.035F, -1.46F, -1.1F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.03F, -1.46F, -1.1F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.035F, -1.46F, -1.4F);
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
                GL11.glTranslatef(-0.32F, -1.67F, -1.3F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
        	GL11.glTranslatef(-0.03F, -1.44F, -1F);
            GL11.glScaled(0.73F, 0.73F, 0.73F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
        	 GL11.glTranslatef(-0.03F, -1.44F, -1F);
             GL11.glScaled(0.73F, 0.73F, 0.73F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef(-0.175F, -1.65F, -1F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.175F, -1.65F, -1F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM2, (player, stack) -> {
            GL11.glTranslatef(-0.12F, -1.02F, -1F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.005F, -0.89F, -1.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.32F, -3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.32F, -3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.14F, -3.2F);
//          GL11.glRotatef(180F, 0f, 1f, 0f);
          GL11.glScaled(1.1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
            GL11.glTranslatef(-0.23F, -0.74F, -3.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.32F, -3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
            GL11.glTranslatef(-0.2F, -0.27F, -3.5F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(-0.25F, -0.9F, -4F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            GL11.glRotatef(180F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
        	GL11.glTranslatef(-0.25F, -0.9F, -4F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            GL11.glRotatef(180F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
            GL11.glTranslatef(-0.2F, -1.18F, -7F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("scarl")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new ScarL())
            .withActionPiece(AuxiliaryAttachments.ScarAction)
            .withActionTransform(new Transform().withPosition(0, 0, 1.3))
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
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-2F, -1.2F, 2.2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.265000f, 4.625000f, -3.765000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.050000f, 0.065000f, -0.500000f)
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
                
                .setupModernAnimations("scar", AuxiliaryAttachments.ScarAction)
                .setupModernMagazineAnimations("scar", 
                		Magazines.M4A1Mag, 
                		Magazines.M38Mag, 
                		Magazines.Stanag100,
                		Magazines.Stanag50,
                		Magazines.Stanag60,
                		Magazines.SOCOM_Mag)
        
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.ScarAction.getRenderablePart(), (renderContext) -> {
              if(renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef(0F, 0F, 1.3F);
              }
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
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.14f, 1.3f, -0.5f);
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.01f, 0.5f);
                } 
                
//                // Standard Iron Sight Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
//                    //System.out.println("Position me for Acog");
//                    GL11.glTranslatef(0F, -0.115f, 0.7f);
//                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.005F, 0.06f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0F, -0.04f, 0.8f);
                } 

                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.015f, 0.5f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, -0.02f, 0.4f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.01f, 0.4f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, -0.02f, 0.4f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.01f, 0.4f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Reflex");
                	 GL11.glTranslatef(0F, 0.01f, 0.4f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.02f, 0.6f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0F, 0.02f, 0.6f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0F, 0f, 0.8f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.044f, 0.4f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0.005F, 0.032f, 0.4f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0.005F, 0.032f, 0.4f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0.004F, 0.04f, 0.4f);
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
                      .withPosition(-0.2, 0.1, 2)
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
