package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class M60E4Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("m60e4")
        .withFireRate(0.6f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.HEAVY)
        .withMaxShots(Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("m60")
        .withSilencedShootSound("ak15_silenced")
        .withReloadSound("m60_reload")
        .withUnloadSound("m60_unload")
        .withInspectSound("inspection")
        .withDrawSound("mg42_draw")
//        .withDrawSound("mg42_reload")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.16f)
        .withInaccuracy(1f)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: General-Purpose Machine Gun",
        "Damage: 10", 
        "Cartridge: 7.62x51mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 60/100",
        "Magazines:",
        "100rnd 7.62x51mm Magazine"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 1f, // y
                 6f) // z
         
         .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
         .withCompatibleAttachment(Attachments.M60HandGuard, true, (model) -> {
//             GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//             GL11.glScaled(0F, 0F, 0F);
         })
         .withCompatibleAttachment(Attachments.M60E4HandGuard, true, (model) -> {
             if(model instanceof AKRail) {
                 GL11.glTranslatef(0.33F, 0.45F, 0.1F);
                 GL11.glScaled(0.6F, 0.6F, 0.7F);
                 GL11.glRotatef(90F, 0f, 0f, 1f);
             } else if(model instanceof AKRail2) {
                 GL11.glTranslatef(-0.25F, 0.63F, 0.1F);
                 GL11.glScaled(0.6F, 0.6F, 0.7F);
                 GL11.glRotatef(-90F, 0f, 0f, 1f);
             } else if(model instanceof AKRail3) {
                 GL11.glTranslatef(0.12F, 1.35F, -0.7F);
                 GL11.glScaled(0.6F, 0.6F, 1.05F);
                 GL11.glRotatef(180F, 0f, 0f, 1f);
             } 
       })
         .withCompatibleAttachment(Attachments.M60FrontSight, true, (model) -> {
//           GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//           GL11.glScaled(0F, 0F, 0F);
       })
         .withCompatibleAttachment(Attachments.M60Rail, (model) -> {
           GL11.glTranslatef(-0.073f, -0.12f, 2.9f);
           GL11.glScaled(0.78F, 0.83F, 0.6F);
       })
//        .withCompatibleAttachment(AuxiliaryAttachments.MG42action, true, (model) -> {
////            GL11.glTranslatef(0F, 0F, 1F); 
//        })
        .withCompatibleAttachment(AuxiliaryAttachments.M60Hatch, true, (model) -> {
//            GL11.glTranslatef(0F, 2.9F, 1.6F);
//            GL11.glRotatef(70F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M60Belt, true, (model) -> {
//            GL11.glTranslatef(-0.5F, 0.4F, 0F);
        })
        .withCompatibleAttachment(Magazines.M60Mag, (model) -> {
//            GL11.glTranslatef(0.3F, 0.1F, 0F);
//            GL11.glRotatef(-15F, 0f, 0f, 1f);
        	
//        	GL11.glTranslatef(0.12F, -0.4F, 0F);
//        	GL11.glRotatef(-2F, 0f, 1f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
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
                GL11.glTranslatef(0.06F, -0.15F, -2.32F);
                GL11.glScaled(0.15F, 0.3F, 0.8F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.05F, -0.2F, 2.8F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.16F, -0.24F, 4F);
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
            GL11.glTranslatef(-0.03F, 0.09F, 3.7F);
            GL11.glScaled(0.43F, 0.43F, 0.43F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(0.095F, -0.015F, 3.3F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(0.012F, -0.73F, 3.3F);
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
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(0.1F, -0F, 3.3F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(0.12F, -0.06F, 3.7F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(0.12F, -0.06F, 3.7F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
            GL11.glTranslatef(0.12F, -0.06F, 3.3F);
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
        .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
            GL11.glTranslatef(-0.14F, -0.26F, 3.3F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef(0.118F, -0.06F, 3.8F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
            GL11.glTranslatef(0.118F, -0.06F, 3.8F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef(-0.02F, -0.25F, 3.8F);
            GL11.glScaled(0.38F, 0.38F, 0.38F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.02F, -0.25F, 3.8F);
            GL11.glScaled(0.38F, 0.38F, 0.38F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.05F, 1.75F, 0.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.05F, 1.75F, 0.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.05F, 1.85F, 0.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.05F, 1.75F, 0.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
//        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
//            GL11.glTranslatef(-0.2F, -0.41F, -3.7F);
//            GL11.glScaled(1F, 1F, 1F);
//        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(0.2F, 0.45F, 0F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.2F, 0.45F, 0F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withTextureNames("m60")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new M60())
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
                GL11.glTranslatef(0F, 2.3F, -0F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, -0.200000f, -5.074998f);
            	 
//                GL11.glScalef(2f, 2f, 2f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, -0.200000f, -4.674998f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, -0.400000f, -5.074998f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, -0.400000f, -4.774998f);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M60Belt.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0.5F, -0.1F, 0F);
                GL11.glRotatef(40F, 0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M60Belt.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0.5F, -0.1F, 0F);
                GL11.glRotatef(40F, 0f, 0f, 1f);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M60Belt.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(-0.5F, 0.4F, 0F);
                }
            })
            
            .withFirstPersonPositioningReloading(
                    
                    //hand grabs latch
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(8.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(21.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 0.100000f, -5.699997f);
                    }, 300, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(18.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 0.130000f, -5.699997f);
                    }, 80, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(10.200000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.50000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 0.130000f, -5.699997f);
                    }, 95, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(10.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(21.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(19.800000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 0.130000f, -5.699997f);
                    }, 105, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(10.700000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.900000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.00000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 0.130000f, -5.699997f);
                    }, 115, 0),
                    
                    //hand opens latch
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(21.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 0.150000f, -5.699997f);
                    }, 220, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(14.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 0.14000f, -5.699997f);
                    }, 70, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(14.200000f, 1f, 0f, 0f);
                        GL11.glRotatef(21.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(18.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 0.130000f, -5.699997f);
                    }, 95, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(14.300000f, 1f, 0f, 0f);
                        GL11.glRotatef(21.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(19.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 0.130000f, -5.699997f);
                    }, 110, 0),
                    
                    //gun movement to indicate character grabbing new magazine
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                    	GL11.glRotatef(21.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(28.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.700000f, -0.000000f, -5.729997f);
                    }, 360, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                    	GL11.glRotatef(20.500000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.700000f, -0.000000f, -5.699997f);
                    }, 120, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 10
                    	GL11.glScalef(2f, 2f, 2f);
                    	GL11.glRotatef(18.100000f, 1f, 0f, 0f);
                    	GL11.glRotatef(32.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.700000f, 0.000000f, -5.699997f);
                    }, 140, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                    	GL11.glRotatef(17.500000f, 1f, 0f, 0f);
                    	GL11.glRotatef(34.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(10.500000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.700000f, -0.000000f, -5.699997f);
                    }, 120, 0),
                    
                //magazine touches gun
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(34.300000f, 0f, 1f, 0f);
                    GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 0.000000f, -5.699997f);
                }, 340, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(4.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(34.500000f, 0f, 1f, 0f);
                    GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 0.000000f, -5.699997f);
                }, 90, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(5.200000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 0.000000f, -5.699997f);
                }, 120, 0),
                
                //left hand pushes magazine in
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(7.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 0.120000f, -5.699997f);
                }, 120, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 0.07000f, -5.699997f);
                }, 70, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(6.00000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 0.100000f, -5.699997f);
                }, 90, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(34.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(10.8000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 0.100000f, -5.699997f);
                }, 110, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(34.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(8.00000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.700000f, 0.100000f, -5.699997f);
                }, 140, 0),
                
                //left hand grabs belt
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 22
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(8.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(41.500000f, 0f, 1f, 0f);
                	GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, -0.200000f, -5.599997f);
                }, 350, 0),
                
                //left hand drags belt
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 23
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(7.500000f, 1f, 0f, 0f);
                	GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, -0.200000f, -5.599997f);
                }, 250, 0),
                
              //left hand places belt
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 24
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, -0.200000f, -5.599997f);
                }, 200, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 25
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(41.500000f, 0f, 1f, 0f);
                	GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, -0.200000f, -5.599997f);
                }, 80, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 26
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.500000f, 0f, 1f, 0f);
                	GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, -0.200000f, -5.599997f);
                }, 90, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 27
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(0.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, -0.200000f, -5.599997f);
                }, 110, 0),
                
              //left hand grabs latch
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(14.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(38.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-4.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, -0.04000f, -5.599997f);
                }, 350, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(14.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(1.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, -0.00000f, -5.599997f);
                }, 80, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(14.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-2.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, -0.00000f, -5.599997f);
                }, 110, 0),
                
              //left hand closes latch
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(17.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(37.200000f, 0f, 1f, 0f);
                	GL11.glRotatef(5.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.1500f, -5.599997f);
                }, 140, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(14.700000f, 1f, 0f, 0f);
                	GL11.glRotatef(36.900000f, 0f, 1f, 0f);
                	GL11.glRotatef(1.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.09000f, -5.599997f);
                }, 80, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(15.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(3.50000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.10000f, -5.599997f);
                }, 90, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(15.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(2.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.10000f, -5.599997f);
                }, 110, 0),
                
              //hand goes to action
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(38.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(4.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.020000f, -5.599997f);
                }, 350, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(38.500000f, 0f, 1f, 0f);
                	GL11.glRotatef(8.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.000000f, -5.599997f);
                }, 60, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(38.300000f, 0f, 1f, 0f);
                	GL11.glRotatef(5.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.000000f, -5.599997f);
                }, 80, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(38.400000f, 0f, 1f, 0f);
                	GL11.glRotatef(6.50000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.000000f, -5.599997f);
                }, 100, 0),
                
                //hand pulls action back
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(10.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(11.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.000000f, -5.359997f);
                }, 140, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(36.900000f, 0f, 1f, 0f);
                	GL11.glRotatef(9.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.000000f, -5.299997f);
                }, 70, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(10.600000f, 1f, 0f, 0f);
                	GL11.glRotatef(37.100000f, 0f, 1f, 0f);
                	GL11.glRotatef(10.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.000000f, -5.369997f);
                }, 90, 0),
                
                //hand pushes action
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(38.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(4.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.000000f, -5.699997f);
                }, 110, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(38.500000f, 0f, 1f, 0f);
                	GL11.glRotatef(1.00000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.000000f, -5.599997f);
                }, 80, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                	GL11.glRotatef(11.300000f, 1f, 0f, 0f);
                	GL11.glRotatef(38.400000f, 0f, 1f, 0f);
                	GL11.glRotatef(2.50000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.500000f, 0.000000f, -5.599997f);
                }, 100, 0)
                
                //44 transitions
            )
            
            .withFirstPersonPositioningUnloading(
                    
                  //left hand grabs magazine
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(9.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 0.100000f, -5.699997f);
                    }, 400, 0),
                    
                    // left hand pulls magazine out
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(12.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(23.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 0.120000f, -5.699997f);
                    }, 250, 0),
                    
                    //left hand drops magazine
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(11.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 0.110000f, -5.699997f);
                    }, 300, 0)
            )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MG42action.getRenderablePart(),
                    //1
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    //2
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    //2
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    //3
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    //4
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { 
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //14
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //23
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //30
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 1f);
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 1f);
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 1f);
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //37
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //37
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //37
                    }, 500, 1000)
                        )
                        
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.MG42action.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M60Hatch.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //5
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //14
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //27
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //40
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
             .withFirstPersonCustomPositioningReloading(Attachments.M60Rail.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                        GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 2.9F, 1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
             
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M60Hatch.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M60Belt.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0.7F, 0.95F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0.7F, 0.95F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0.7F, 0.95F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0.7F, 0.95F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0.7F, 0.95F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0.7F, 0.95F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0.7F, 0.95F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0.7F, 0.95F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0.7F, 0.95F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                        GL11.glTranslatef(0.7F, 0.95F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0.7F, 0.95F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0.7F, 0.75F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0.7F, 0.5F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0.95F, -0.15F, 0F);
                        GL11.glRotatef(70F, 0f, 0f, 1f);
                        GL11.glRotatef(2F, 0f, 1f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0.95F, -0.3F, 0F);
                        GL11.glRotatef(70F, 0f, 0f, 1f);
                        GL11.glRotatef(1F, 0f, 1f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0.9F, -0.2F, 0F);
                        GL11.glRotatef(70F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0.9F, 0.2F, 0F);
                        GL11.glRotatef(70F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0.9F, 0.2F, 0F);
                        GL11.glRotatef(70F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0.9F, 0.2F, 0F);
                        GL11.glRotatef(70F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                        GL11.glTranslatef(0.9F, 0.2F, 0F);
                        GL11.glRotatef(70F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0.9F, 0.2F, 0F);
                        GL11.glRotatef(70F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //22
                    	GL11.glTranslatef(0.9F, 0.2F, 0F);
                        GL11.glRotatef(70F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //23
                        GL11.glTranslatef(0.5F, -0.05F, 0F);
                        GL11.glRotatef(40F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //24
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //25
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //27
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //30
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //40
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M60Belt.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        	 GL11.glTranslatef(0.7F, 0.95F, 0F);
                        } else {
                        	GL11.glTranslatef(0F, 0F, 0F);
                        }
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    		 GL11.glTranslatef(0.7F, 0.95F, 0F);
                        } else {
                        GL11.glTranslatef(0.2F, -0.3F, 0F);
                        }
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    		 GL11.glTranslatef(0.7F, 0.95F, 0F);
                        } else {
                        GL11.glTranslatef(0.7F, 0.95F, 0F);
                        }
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.M60Mag,
            		
            		//hand grabs latch
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 300, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 60, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 300, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 60, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 70, 0),
                    
                    //hand opens latch
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 220, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 50, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 65, 0),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 80, 0),
                    
                    //gun movement to indicate character grabbing new magazine
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 330, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 70, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 10
                    	GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 90, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 110, 0),
                    
                //magazine touches gun
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glTranslatef(-0.05F, -0.4F, 0F);
                	GL11.glRotatef(2F, 0f, 1f, 0f);
                }, 340, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glTranslatef(0.12F, -0.4F, 0F);
                	GL11.glRotatef(-2F, 0f, 1f, 0f);
                }, 70, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                	GL11.glTranslatef(0F, -0.4F, 0F);
                }, 90, 0),
                
                //left hand pushes magazine in
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 120, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 60, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 80, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 100, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 100, 0),
                
                //left hand grabs belt
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 250, 0),
                
                //left hand drags belt
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 20
                }, 200, 0),
                
              //left hand places belt
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 20
                }, 180, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 20
                }, 70, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 20
                }, 180, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position 20
                }, 70, 0),
                
              //left hand grabs latch
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 300, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 70, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 90, 0),
                
              //left hand closes latch
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 140, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 70, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 80, 0),
                
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 90, 0),
                
              //hand goes to action
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 340, 0),
                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                }, 250, 1000),
                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                }, 250, 1000),
                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                }, 250, 1000),
                //hand pulls action back
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 260, 100),
                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                }, 250, 1000),
                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                }, 250, 1000),
                //hand pushes action
                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                }, 280, 0),
                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                }, 250, 1000),
                new Transition<RenderContext<RenderableState>>((renderContext) -> {
                }, 250, 1000)
                //32 transitions
            )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.M60Mag,
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0.4F, 0F);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0.3F, 0.9F, 0F);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningReloading(Attachments.NightRaider.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, -0.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Attachments.ACOG.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Attachments.Specter.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Attachments.Reflex.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Attachments.BijiaReflex.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Attachments.Holographic.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Attachments.HolographicAlt.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Attachments.EotechHybrid2.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Attachments.VortexRedux.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Attachments.Kobra.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Attachments.KobraGen3.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -1.6F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Attachments.MicroT1.getRenderablePart(),
            		new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Attachments.AimpointCompM5.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	 GL11.glTranslatef(0F, -1F, -2.8F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Attachments.MicroReflex.getRenderablePart(),
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //18
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //26
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glTranslatef(0F, -0F, -3.3F);
                        GL11.glRotatef(70F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //34
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //42
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    }, 250, 1000)
                        )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.900000f, -0.500000f, -5.199997f);
                    }, 300, 600),
                  new Transition<RenderContext<RenderableState>>((renderContext) -> {
                      GL11.glScalef(2f, 2f, 2f);
                      GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(-0.500000f, 0.200000f, -4.999998f);
                  }, 350, 600))
            
            .withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.M60Belt.getRenderablePart(),
            		new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        	 GL11.glTranslatef(0.7F, 1.95F, 0F);
                        } else {
                        	GL11.glTranslatef(0F, 0F, 0F);
                        }
                    }, 250, 1000),
            		new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        	 GL11.glTranslatef(0.7F, 1.95F, 0F);
                        } else {
                        	GL11.glTranslatef(0F, 0F, 0F);
                        }
                    }, 250, 1000))
                    
//            .withThirdPersonPositioningReloading(
//                    //hand goes to action
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GL11.glScaled(0.5F, 0.5F, 0.5F);
//                        GL11.glTranslatef(-2F, 0F, 3F);
//                        GL11.glRotatef(-45F, 0f, 1f, 0f);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 430, 50),
//                    //hand pulls action back
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GL11.glScaled(0.5F, 0.5F, 0.5F);
//                        GL11.glTranslatef(-2.4F, 0.5F, 3F);
//                        GL11.glRotatef(-45F, 0f, 1f, 0f);
//                        GL11.glRotatef(100F, 1f, 0f, 0f);
//                    }, 200, 100),
//                    //hand pushes action
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GL11.glScaled(0.5F, 0.5F, 0.5F);
//                        GL11.glTranslatef(-2F, 0F, 3F);
//                        GL11.glRotatef(-45F, 0f, 1f, 0f);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 260, 10),
//                    //hand grabs latch
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GL11.glScaled(0.5F, 0.5F, 0.5F);
//                        GL11.glTranslatef(-2.5F, 0F, 2.5F);
//                        GL11.glRotatef(-45F, 0f, 1f, 0f);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 330, 0),
//                    //hand opens latch
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GL11.glScaled(0.5F, 0.5F, 0.5F);
//                        GL11.glTranslatef(-2.5F, 0F, 2.5F);
//                        GL11.glRotatef(-45F, 0f, 1f, 0f);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 280, 0),
//                    //left hand begins grabs magazine out
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GL11.glScaled(0.5F, 0.5F, 0.5F);
//                        GL11.glTranslatef(-2.5F, 0F, 2.5F);
//                        GL11.glRotatef(-45F, 0f, 1f, 0f);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 300, 100),
//                    //left hand drops magazine
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GL11.glScaled(0.5F, 0.5F, 0.5F);
//                        GL11.glTranslatef(-2.5F, 0F, 2.5F);
//                        GL11.glRotatef(-45F, 0f, 1f, 0f);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 340, 0),
//                    //gun movement to indicate character grabbing new magazine
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                        GL11.glScaled(0.5F, 0.5F, 0.5F);
//                        GL11.glTranslatef(-2.5F, 0F, 2.5F);
//                        GL11.glRotatef(-45F, 0f, 1f, 0f);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 530, 0),
//                //left hand moves magazine to position
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GL11.glScaled(0.5F, 0.5F, 0.5F);
//                    GL11.glTranslatef(-2.5F, 0F, 2.5F);
//                    GL11.glRotatef(-45F, 0f, 1f, 0f);
//                    GL11.glRotatef(90F, 1f, 0f, 0f);
//                }, 440, 10),
//                //left hand pushes magazine in
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GL11.glScaled(0.5F, 0.5F, 0.5F);
//                    GL11.glTranslatef(-2.5F, 0F, 2.5F);
//                    GL11.glRotatef(-45F, 0f, 1f, 0f);
//                    GL11.glRotatef(90F, 1f, 0f, 0f);
//                }, 240, 50),
//                //left hand grabs belt
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GL11.glScaled(0.5F, 0.5F, 0.5F);
//                    GL11.glTranslatef(-2.5F, 0F, 2.5F);
//                    GL11.glRotatef(-45F, 0f, 1f, 0f);
//                    GL11.glRotatef(90F, 1f, 0f, 0f);
//                }, 330, 0),
//                //left hand drags belt
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GL11.glScaled(0.5F, 0.5F, 0.5F);
//                    GL11.glTranslatef(-2.5F, 0F, 2.5F);
//                    GL11.glRotatef(-45F, 0f, 1f, 0f);
//                    GL11.glRotatef(90F, 1f, 0f, 0f);
//                }, 300, 0),
//              //left hand grabs latch
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GL11.glScaled(0.5F, 0.5F, 0.5F);
//                    GL11.glTranslatef(-2.5F, 0F, 2.5F);
//                    GL11.glRotatef(-45F, 0f, 1f, 0f);
//                    GL11.glRotatef(90F, 1f, 0f, 0f);
//                }, 350, 0),
//              //left hand closes latch
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GL11.glScaled(0.5F, 0.5F, 0.5F);
//                    GL11.glTranslatef(-2.5F, 0F, 2.5F);
//                    GL11.glRotatef(-45F, 0f, 1f, 0f);
//                    GL11.glRotatef(90F, 1f, 0f, 0f);
//                }, 300, 0),
//              //hand goes to action
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GL11.glScaled(0.5F, 0.5F, 0.5F);
//                    GL11.glTranslatef(-2F, 0F, 3F);
//                    GL11.glRotatef(-45F, 0f, 1f, 0f);
//                    GL11.glRotatef(90F, 1f, 0f, 0f);
//                }, 340, 0),
//                //hand pulls action back
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GL11.glScaled(0.5F, 0.5F, 0.5F);
//                    GL11.glTranslatef(-2.4F, 0.5F, 3F);
//                    GL11.glRotatef(-45F, 0f, 1f, 0f);
//                    GL11.glRotatef(100F, 1f, 0f, 0f);
//                }, 260, 100),
//                //hand pushes action
//                new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
//                    GL11.glScaled(0.5F, 0.5F, 0.5F);
//                    GL11.glTranslatef(-2F, 0F, 3F);
//                    GL11.glRotatef(-45F, 0f, 1f, 0f);
//                    GL11.glRotatef(90F, 1f, 0f, 0f);
//                }, 280, 0)
//            )
                        
//            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M60Hatch.getRenderablePart(),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0F, -2F, 0.1F);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0F, -2F, 0.1F);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0F, -2F, 0.1F);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0F, -2F, 0.1F);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0F, -2F, 0.1F);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0F, -2F, 0.1F);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0F, -2F, 0.1F);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0F, -2F, 0.1F);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0F, -2F, 0.1F);
//                        GL11.glRotatef(90F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000)
//                        )
//                        
//            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M60Belt.getRenderablePart(),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0.45F, 0F, 0F);
//                    }, 500, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0.45F, 0F, 0F);
//                    }, 500, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0.45F, 0F, 0F);
//                    }, 500, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0.45F, 0F, 0F);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0.45F, 0F, 0F);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0.45F, 0F, 0F);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(1.6F, 3.5F, 0.5F);
//                        GL11.glRotatef(10F, 0f, 0f, 1f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(1.6F, 3.5F, 0.5F);
//                        GL11.glRotatef(10F, 0f, 0f, 1f);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0.7F, 0F, 0F);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0.7F, 0F, 0F);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                        GL11.glTranslatef(0.7F, 0F, 0F);
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
//                    }, 250, 1000)
//                        )
                    
                    
            .withFirstPersonPositioningDrawing(
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.200000f, -4.774998f);
                    }, 200, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.200000f, -4.774998f);
                    }, 230, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.200000f, -4.774998f);
                    }, 300, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.200000f, -4.774998f);
                    }, 250, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.200000f, -4.874998f);
                    }, 230, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, -0.200000f, -4.704998f);
                    }, 180, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, -0.200000f, -4.774998f);
                    }, 180, 0)
                    )
                    
               .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.M60Belt.getRenderablePart(),
            		   new Transition<RenderContext<RenderableState>>((renderContext) -> {
                           if(renderContext.getWeaponInstance().getAmmo() == 0) {
                           	 GL11.glTranslatef(0.7F, 1.95F, 0F);
                           } else {
                           	GL11.glTranslatef(0F, 0F, 0F);
                           }
                       }, 250, 1000),
            		   new Transition<RenderContext<RenderableState>>((renderContext) -> {
                           if(renderContext.getWeaponInstance().getAmmo() == 0) {
                           	 GL11.glTranslatef(0.7F, 1.95F, 0F);
                           } else {
                           	GL11.glTranslatef(0F, 0F, 0F);
                           }
                       }, 250, 1000),
            		   new Transition<RenderContext<RenderableState>>((renderContext) -> {
                           if(renderContext.getWeaponInstance().getAmmo() == 0) {
                           	 GL11.glTranslatef(0.7F, 1.95F, 0F);
                           } else {
                           	GL11.glTranslatef(0F, 0F, 0F);
                           }
                       }, 250, 1000),
            		   new Transition<RenderContext<RenderableState>>((renderContext) -> {
                           if(renderContext.getWeaponInstance().getAmmo() == 0) {
                           	 GL11.glTranslatef(0.7F, 1.95F, 0F);
                           } else {
                           	GL11.glTranslatef(0F, 0F, 0F);
                           }
                       }, 250, 1000),
            		   new Transition<RenderContext<RenderableState>>((renderContext) -> {
                           if(renderContext.getWeaponInstance().getAmmo() == 0) {
                           	 GL11.glTranslatef(0.7F, 1.95F, 0F);
                           } else {
                           	GL11.glTranslatef(0F, 0F, 0F);
                           }
                       }, 250, 1000),
            		   new Transition<RenderContext<RenderableState>>((renderContext) -> {
                           if(renderContext.getWeaponInstance().getAmmo() == 0) {
                           	 GL11.glTranslatef(0.7F, 1.95F, 0F);
                           } else {
                           	GL11.glTranslatef(0F, 0F, 0F);
                           }
                       }, 250, 1000),
            		   new Transition<RenderContext<RenderableState>>((renderContext) -> {
                           if(renderContext.getWeaponInstance().getAmmo() == 0) {
                           	 GL11.glTranslatef(0.7F, 1.95F, 0F);
                           } else {
                           	GL11.glTranslatef(0F, 0F, 0F);
                           }
                       }, 250, 1000)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.19f, -0.28f, -4.7f);
                GL11.glRotatef(-0.55F, 1f, 0f, 0f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.06f, -0f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.14f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.1f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.1f, 0.2f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.015f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.05f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.08f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.05f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.09f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.09f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.07f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.12f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.08f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.08f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.19f, -0.28f, -4.3f);
                GL11.glRotatef(-0.55F, 1f, 0f, 0f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.06f, -0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.14f, -0.05f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.1f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.1f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(0F, 0.015f, 0.15f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.05f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.08f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.05f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.09f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.09f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.07f, -0.1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.12f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.08f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.08f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                GL11.glRotatef(5f, 1f, 0f, 0f);
                GL11.glTranslatef(-0.500000f, 0f, -4.774998f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(2f, 2f, 2f);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.950000f, -0.725000f, -5.125000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                         
//                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                     })
                     
            .withFirstPersonHandPositioningProning(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    
                  
                    //hand grabs latch
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.649999f, -0.650000f, 0.125000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.649999f, -0.650000f, 0.125000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.649999f, -0.650000f, 0.125000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.649999f, -0.650000f, 0.125000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.649999f, -0.650000f, 0.125000f);
                    }, 250, 1000),
                    //hand opens latch
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.850000f, -0.675000f, -0.575000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.850000f, -0.675000f, -0.575000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.850000f, -0.675000f, -0.575000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.850000f, -0.675000f, -0.575000f);
                    }, 250, 1000),
                    //hand grabs magazine
                    
                    //hand stays down there
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.075000f, -0.550000f, 0.925000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.075000f, -0.550000f, 0.925000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.075000f, -0.550000f, 0.925000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.075000f, -0.550000f, 0.925000f);
                    }, 250, 1000),
                    
                    // magazine touches gun
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.375000f, -1.624999f, 0.050000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.400000f, -1.599999f, -0.100000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.350000f, -1.624999f, -0.025000f);
                    }, 250, 1000),
                    
                    //hand pushes in magazine
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.150000f, -1.624999f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.150000f, -1.624999f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.150000f, -1.624999f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.150000f, -1.624999f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.150000f, -1.624999f, -0.025000f);
                    }, 250, 1000),
                    
                    //hand grabs belt
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.705000f, -1.464999f, 0.340000f);
                    }, 250, 1000),
                    
                    //hand drags belt
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.645000f, -1.474999f, 0.190000f);
                    }, 250, 1000),
                    
                    //hand places belt
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.785000f, -1.324999f, 0.440000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.785000f, -1.324999f, 0.440000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.785000f, -1.324999f, 0.440000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.785000f, -1.324999f, 0.440000f);
                    }, 250, 1000),
                    
                    //hand grabs latch
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.850000f, -0.675000f, -0.575000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.850000f, -0.675000f, -0.575000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.850000f, -0.675000f, -0.575000f);
                    }, 250, 1000),
                    
                    //hand closes latch
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.649999f, -0.650000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.649999f, -0.650000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.649999f, -0.650000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.649999f, -0.650000f, 0.125000f);
                    }, 250, 1000),
                    
                    // right hand goes to action
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //30
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //30
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //30
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //30
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 250, 1000),
                    
                    // right hand pulls action
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 250, 1000),
                    
                    // right hand pushes action
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 250, 1000))
                    
            .withFirstPersonRightHandPositioningReloading(
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //10
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { //20
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    
                    // right hand goes to action
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -1.400000f, 0.200000f);
                    }, 500, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -1.400000f, 0.200000f);
                    }, 500, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -1.400000f, 0.200000f);
                    }, 500, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -1.400000f, 0.200000f);
                    }, 500, 1000),
                    
                    //hand pulls action
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.440000f, -1.640000f, 0.190000f);
                    }, 500, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.440000f, -1.640000f, 0.190000f);
                    }, 500, 1000),
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.440000f, -1.640000f, 0.190000f);
                    }, 500, 1000),
                    
                    //hand pushes action
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -1.400000f, 0.200000f);
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -1.400000f, 0.200000f);
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -1.400000f, 0.200000f);
                    }, 500, 1000))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    
                  
                  //hand grabs magazine
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.150000f, -1.624999f, -0.025000f);
                    }, 250, 1000),
                    //hand grabs magazine
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.350000f, -1.624999f, -0.025000f);
                    }, 250, 1000),
                    //hand drops magazine
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.075000f, -0.550000f, 0.925000f);
                    }, 250, 1000))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    
                    
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 1000))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 250, 50),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 50),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.790000f, -1.435000f, 0.710000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    //does nothing
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 500, 1000),
                  //does nothing
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 500, 1000),
                  //does nothing
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 500, 1000),
                    //hand grabs latch
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, 0.100000f);
                    }, 250, 1000),
                    //hand opens latch
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.200000f);
                    }, 250, 1000),
                    //hand grabs magazine
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.100000f, 0.075000f);
                    }, 250, 1000),
                    //hand drops magazine
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.025000f, 0.025000f);
                    }, 250, 1000),
                    //hand stays down there
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.025000f, 0.025000f);
                    }, 250, 1000),
                    //hand pulls up new magazine
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.075000f, 0.100000f);
                    }, 250, 1000),
                    //hand pushes in magazine
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.075000f, 0.100000f);
                    }, 250, 1000),
                    //hand grabs belt
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.025000f, 0.125000f);
                    }, 250, 1000),
                    //hand drags belt
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.050000f, 0.150000f);
                    }, 250, 1000),
                    //hand grabs latch
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.200000f);
                    }, 250, 1000),
                    //hand closes latch
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, 0.100000f);
                    }, 250, 1000),
                    //hand lifts up
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 250, 1000),
                    //hand smacks latch
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 250, 1000))
                    
            .withThirdPersonRightHandPositioningReloading(
                    //hand grabs action
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.100000f, 0.050000f);
                    }, 500, 1000),
                    //hand pulls action
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.175000f, 0.050000f);
                    }, 500, 1000),
                    //hand pushes action
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.100000f, 0.050000f);
                    }, 500, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 500, 1000),
                    //hand pulls action
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.175000f, 0.050000f);
                    }, 500, 1000),
                    //hand pushes action
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.100000f, 0.050000f);
                    }, 500, 1000))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 150, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 130, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 200, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 200, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 130, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 200, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.100000f, 0.275000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glScalef(0f, 0f, 0f);
                    }, 150, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glScalef(0f, 0f, 0f);
                    }, 130, 0),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glScalef(0f, 0f, 0f);
                    }, 250, 100),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> { // Reload position
                        GL11.glScalef(0f, 0f, 0f);
                    }, 250, 100),
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(0f, 0f, 0f);
                    }, 500, 1000),
                    //hand pulls action
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(0f, 0f, 0f);
                    }, 500, 1000),
                    //hand pushes action
                    new Transition<RenderContext<RenderableState>>((renderContext) -> {
                        GL11.glScalef(0f, 0f, 0f);
                    }, 500, 1000)
                    )
             
            .build())
        .withSpawnEntityDamage(10f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

