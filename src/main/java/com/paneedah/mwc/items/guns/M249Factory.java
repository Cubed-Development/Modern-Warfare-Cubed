package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class M249Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("m249")
        .withFireRate(0.7f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.HEAVY)
        .withMuzzlePosition(new Vec3d(-0.13600000405311594, -1.144000004291535, -8.012000045061113))
        .withMaxShots(Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("m249")
        .withSilencedShootSound("ak15_silenced")
        .withReloadSound("mg42_reload")
        .withUnloadSound("mg42_unload")
        .withInspectSound("inspection")
        .withDrawSound("mg42_draw")
//        .withDrawSound("mg42_reload")
        .withReloadingTime(45)
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.15f)
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
         
         .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
         .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
         .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
             GL11.glTranslatef(0.01f, -0.19f, -0.4f);
             GL11.glScaled(0F, 0F, 0F);
         })
         .withCompatibleAttachment(Attachments.M249HandGuard, true, (model) -> {
         })
         .withCompatibleAttachment(Attachments.M249UpperHandGuard, true, (model) -> {
         })
         .withCompatibleAttachment(Attachments.M249Stock, true, (model) -> {
         })
         .withCompatibleAttachment(Attachments.M249ParaStock, (model) -> {
         })
         .withCompatibleAttachment(Attachments.M249MilspecStock, (model) -> {
        	 if(model instanceof MilSpecStock) {
        		 GL11.glTranslatef(0.0f, 0.0f, 0.6f);
                 GL11.glScaled(1.2F, 1.2F, 1.2F);
             } 
         })
         .withCompatibleAttachment(Attachments.M249HK416Stock, (model) -> {
        	 if(model instanceof HK416Stock) {
        		 GL11.glTranslatef(0.0f, 0.0f, 0.6f);
                 GL11.glScaled(1.2F, 1.2F, 1.2F);
             } 
         })
         .withCompatibleAttachment(Attachments.Mk48HandGuard, (model) -> {
             if(model instanceof Mk48HandGuard) {
                 GL11.glTranslatef(-0.15f, -0.75f, -5.6f);
             }
        	 if(model instanceof AKRail) {
        		 GL11.glTranslatef(0.0F, -0.4F, -4.0F);
                 GL11.glScaled(0.9F, 0.9F, 0.6F);
                 GL11.glRotatef(180F, 0f, 0f, 1f);
             } 
         })
         .withCompatibleAttachment(Attachments.Mk48UpperHandGuard, (model) -> {
             if(model instanceof Mk48UpperHandGuard) {
                 GL11.glTranslatef(-0.18f, -0.8f, -5.5f);
             }
             if(model instanceof AKRail) {
                 GL11.glTranslatef(0.3F, -1.25F, -4.57F);
                 GL11.glScaled(0.9F, 0.9F, 0.58F);
                 GL11.glRotatef(90F, 0f, 0f, 1f);
             } else if(model instanceof AKRail2) {
                 GL11.glTranslatef(-0.54F, -0.9F, -4.57F);
                 GL11.glScaled(0.9F, 0.9F, 0.58F);
                 GL11.glRotatef(-90F, 0f, 0f, 1f);
             } else if(model instanceof AKRail3) {
                 GL11.glTranslatef(-0.27F, -1.7F, -4.57F);
                 GL11.glScaled(0.9F, 0.9F, 0.58F);
             } 
         })
        .withCompatibleAttachment(AuxiliaryAttachments.M249Action, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M249Hatch, true, (model) -> {
            if(model instanceof M249Hatch) {
//            	GL11.glTranslatef(-0F, 2.45F, 3.8F);
//                GL11.glRotatef(90F, 1f, 0f, 0f);
            } else if(model instanceof M249RearSight) {
                GL11.glTranslatef(-0.13f, -1.63f, 0.5f);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            } else if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.25F, -1.7F, -2.2F);
                GL11.glScaled(0.9F, 0.9F, 0.9F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M249Belt, true, (model) -> {
//        	GL11.glTranslatef(0.15F, 0.35F, 0F);
//            GL11.glRotatef(45F, 0f, 0f, 1f);
            
//        	GL11.glTranslatef(0.2F, -0.25F, 0F);
//            GL11.glRotatef(50F, 0f, 0f, 1f);
        	
//        	GL11.glTranslatef(0.05F, -0.15F, 0F);
//            GL11.glRotatef(25F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Magazines.M249Mag, (model) -> {
//            GL11.glTranslatef(0.4F, 0F, 0F);
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
                GL11.glTranslatef(0.26F, -1.53F, -2.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.22F, -1.67F, -5.45F);
                GL11.glScaled(0.5F, 0.5F, 0.8F);
            } else if(model instanceof ScarIron1) {
                    GL11.glTranslatef(0.165F, -1.65F, 1F);
                    GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                    GL11.glTranslatef(0.25F, -1.55F, -2F);
                    GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(0.06F, -0.15F, -2.32F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, () -> {
            GL11.glTranslatef(-0.21F, -1.80F, -1.8F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, () -> {
            GL11.glTranslatef(-0.34F, -1.8f, -0.4F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
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
            GL11.glTranslatef(-0.2F, -1.48F, -0.7F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, () -> {
            GL11.glTranslatef(-0.06F, -1.62F, -1.1F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
            GL11.glTranslatef(-0.063F, -1.62F, -1.1F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, () -> {
            GL11.glTranslatef(-0.05F, -1.66F, -1.0F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, () -> {
            GL11.glTranslatef(-0.05F, -1.66F, -1.0F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, () -> {
        	GL11.glTranslatef(-0.05F, -1.66F, -1.0F);
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
            GL11.glTranslatef(-0.30F, -1.85F, -1.2F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, () -> {
            GL11.glTranslatef(-0.04F, -1.65F, -1.0F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, () -> {
            GL11.glTranslatef(-0.04F, -1.65F, -1.0F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, () -> {
            GL11.glTranslatef(-0.2F, -1.86F, -1.0F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM5, () -> {
        	GL11.glTranslatef(-0.2F, -1.86F, -1.0F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, 0.2F, -3.1F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
        	 GL11.glTranslatef(-0.2F, 0.18F, -3.3F);
             GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
        	 GL11.glTranslatef(-0.2F, 0.2F, -3.3F);
             GL11.glScaled(1F, 1F, 0.9F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
        	 GL11.glTranslatef(-0.2F, 0.2F, -3.3F);
             GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
            GL11.glTranslatef(-0.2F, -0.2F, -4.45F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser2, () -> {
        	GL11.glTranslatef(0.1F, -1.47F, -4.0F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser, () -> {
            GL11.glTranslatef(0.1F, -1.47F, -4.0F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("m249")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new M249())
            //.withTextureName("AK47")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.24F, 0.24F, 0.24F);
                GL11.glTranslatef(1, -0.8f, 1.5f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-1.7F, -0.8F, 1.9F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.825000f, 5.665000f, -5.605000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0F, 3.0F, 3.0F)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.730000f, 0.865000f, -1.146400f)
                        .withBBRotation(-15.4928F, -45.7685F, 66.3639F)
                        .withScale(2.6F, 2.6F, 4.0F)
                        .withPivotPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.2F, 0.1F, 2)
                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                        .withScale(3.5F, 3.5F, 3.5F)
                        .withPivotPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("m249", AuxiliaryAttachments.M249Action)
                .setupCustomKeyedPart(AuxiliaryAttachments.M249Belt, "m249", "belt")
//                .setupCustomKeyedPart(AuxiliaryAttachments.M249Belt2, "m249", "belt2")
                .setupCustomKeyedPart(AuxiliaryAttachments.M249Hatch, "m249", "hatch")
                .setupCustomKeyedPart(Attachments.ACOG, "m249", "scope")
                .setupCustomKeyedPart(Attachments.Specter, "m249", "scope")
                .setupCustomKeyedPart(Attachments.Reflex, "m249", "scope")
                .setupCustomKeyedPart(Attachments.NightRaider, "m249", "scope")
                .setupCustomKeyedPart(Attachments.BijiaReflex, "m249", "scope")
                .setupCustomKeyedPart(Attachments.Holographic, "m249", "scope")
                .setupCustomKeyedPart(Attachments.HolographicAlt, "m249", "scope")
                .setupCustomKeyedPart(Attachments.EotechHybrid2, "m249", "scope")
                .setupCustomKeyedPart(Attachments.MicroT1, "m249", "scope")
                .setupCustomKeyedPart(Attachments.AimpointCompM5, "m249", "scope")
                .setupCustomKeyedPart(Attachments.VortexRedux, "m249", "scope")
                .setupCustomKeyedPart(Attachments.Kobra, "m249", "scope")
                .setupCustomKeyedPart(Attachments.KobraGen3, "m249", "scope")
                .setupModernMagazineAnimations("m249", 
                		Magazines.M249Mag)
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M249Belt.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(-0.5F, -0.4F, 0F);
                    GL11.glRotatef(40F, 0f, 0f, 1f);
                }
            })
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.14f, 1.23f, -1f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.24f, 0.6f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.315f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.275f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.265f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.265f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.245f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.245f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.255f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.29f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.29f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.29f, 0.3f);
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
             
            .build())
        .withSpawnEntityDamage(6f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

