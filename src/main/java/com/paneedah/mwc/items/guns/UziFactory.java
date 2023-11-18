package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class UziFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("uzi")
        .withFireRate(0.7f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SMG)
        .withShellType(Type.PISTOL)
        .withMuzzlePosition(new Vec3d(-0.12400000369548798, -0.7799999934434887, -3.427999908447264))
        .withMaxShots(1, Integer.MAX_VALUE)
        .withShootSound("uzi")
        .withSilencedShootSound("m9a1_silenced")
        .withDrawSound("uzi_draw")
        .withReloadingTime(90)
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 1f)
        .withFlashOffsetX(() -> 0.17f)
        .withFlashOffsetY(() -> 0.23f)
        .withInaccuracy(3)
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
         .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 0.1f, // y
                 3f) // z
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 8), new
        		CraftingEntry(MWCItems.gunmetalPlate, 6), new
        		CraftingEntry(MWCItems.steelIngot, 5))
		 
        .withCompatibleAttachment(Magazines.UziMag, (model) -> {
        })
        .withCompatibleAttachment(Magazines.UziMag45, (model) -> {
        })
		.withCompatibleAttachment(Magazines.UziDrumMag, (model) -> {
        })
		.withCompatibleAttachment(Attachments.UziWoodStock, (model) -> {
		})
		.withCompatibleAttachment(Attachments.UziFoldingStockOpened, (model) -> {
		})
		.withCompatibleAttachment(Attachments.UziMLOKHandguard, (model) -> {
		})
		.withCompatibleAttachment(Attachments.UziSightRail, (model) -> {
            if(model instanceof UziSightRail) {
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.205F, -1.43F, -0.68f);
                GL11.glScaled(0.62F, 0.65F, 0.50F);
            }
        })
		.withCompatibleAttachment(Attachments.UziFoldingStockClosed, true, (model) -> {
		})	
        .withCompatibleAttachment(AuxiliaryAttachments.UziAction, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.UziRelease, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.UziIronSight, true, (model) -> {
            if(model instanceof UziRearSight) {
                GL11.glTranslatef(-0.274F, -1.415F, 0.78F);
                GL11.glScaled(0.48F, 0.47F, 0.67F);
            } else if(model instanceof UziFrontSight) {
                GL11.glTranslatef(-0.25F, -1.415F, -2.3F);
                GL11.glScaled(0.4F, 0.47F, 0.67F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.17F, -1.42F, 0.43F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(-0.11F, -1.29F, -9.7F);
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
                GL11.glTranslatef(-0.03F, -1.5F, -4.5F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, -1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.207F, -1.245F, -9.165F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.11F, -1.2F, -2.3F);
                GL11.glScaled(0.13F, 0.5F, 0.8F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
            GL11.glTranslatef(-0.22F, -1.11F, -4.7F);
            GL11.glScaled(1.3F, 1.3F, 1.3F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.25F, -2.23F);
            GL11.glScaled(1F, 1F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.25F, -2.23F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.StubbyGripTan, (model) -> {
            GL11.glTranslatef(-0.2F, -0.25F, -2.23F);
            GL11.glScaled(1F, 1F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.Grip2Tan, (model) -> {
            GL11.glTranslatef(-0.2F, -0.25F, -2.23F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.ACOG, () -> {
            GL11.glTranslatef(-0.288F, -1.47F, 0.05F);
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
        .withCompatibleAttachment(Attachments.Reflex, () -> {
            GL11.glTranslatef(-0.07F, -1.32F, -0.16F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof Reflex2) {
             GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
             GL11.glScaled(0.15F, 0.15F, 0.15F);
             }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
              GL11.glTranslatef(-0.065F, -1.30F, -0.18F);
              GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
             if(model instanceof Reflex2) {
              GL11.glTranslatef(-0.125F, -0.68F, -0.35F);
              GL11.glScaled(0.15F, 0.15F, 0.15F);
              }
        })
        .withCompatibleAttachment(Attachments.Holographic, () -> {
              GL11.glTranslatef(-0.035F, -1.35F, -0.19F);
              GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
             if(model instanceof Holo2) {
              GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
              GL11.glScaled(0.1F, 0.1F, 0.1F);
             }
        })
        .withCompatibleAttachment(Attachments.HolographicAlt, () -> {
              GL11.glTranslatef(-0.035F, -1.35F, -0.13F);
              GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
             if(model instanceof Holo2) {
              GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
              GL11.glScaled(0.1F, 0.1F, 0.1F);
              }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, () -> {
              GL11.glTranslatef(-0.035F, -1.35F, -0.35F);
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
        .withCompatibleAttachment(Attachments.MicroReflex, () -> {
              GL11.glTranslatef(-0.15F, -2.0F, -0.17F);
              GL11.glScaled(0.35F, 0.35F, 0.35F);
        },(model) -> {
             if(model instanceof Reflex2) {
              GL11.glTranslatef(0.08F, 0.97F, -0.4F);
              GL11.glScaled(0.15F, 0.15F, 0.15F);
             } else if (model instanceof SightMount) {
             }
        })
        .withCompatibleAttachment(Attachments.Kobra, () -> {
              GL11.glTranslatef(-0.043F, -1.25F, -0F);
              GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
             if(model instanceof Reflex2) {
              GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
              GL11.glScaled(0.15F, 0.15F, 0.15F);
             }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, () -> {
                    GL11.glTranslatef(-0.043F, -1.25F, -0F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
             if(model instanceof Reflex2) {
              GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
              GL11.glScaled(0.15F, 0.15F, 0.15F);
             }
        })

        .withTextureNames("uzi")
        .withRenderer(new WeaponRenderer.Builder()
            .withModel(new Uzi())
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(0, 0f, 3f);
                GL11.glRotatef(0F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.265000f, 4.225000f, -5.765000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0F, 3.0F, 3.0F)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.210000f, 0.505000f, 0.620000f)
                        .withBBRotation(-7.2749F, -30.8463F, 56.4758F)
                        .withScale(2.6F, 2.6F, 4.0F)
                        .withPivotPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.2F, 0.1F, 2)
                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                        .withScale(3.5F, 3.5F, 3.5F)
                        .withPivotPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("uzi", AuxiliaryAttachments.UziRelease)
                .setupModernMagazineAnimations("uzi", 
                		Magazines.UziMag,
						Magazines.UziMag45,
						Magazines.UziDrumMag)
                    
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.14f, 0.79f, -1.6f);

                if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    GL11.glTranslatef(0F, 0.345f, 0.9f);
                }
                if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    GL11.glTranslatef(0F, 0.335f, 1f);
                }

                if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    GL11.glTranslatef(0F, 0.353f, 1f);
                }

                if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    GL11.glTranslatef(0F, 0.343f, 1f);
                }

                if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    GL11.glTranslatef(0F, 0.355f, 0.8f);
                }

                if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    GL11.glTranslatef(0F, 0.364f, 0.8f);
                }

                if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    GL11.glTranslatef(0F, 0.425f, 0.6f);
                }

                if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 1f);
                }

                if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 1f);
                }

                else {
                }
            
                })
                
            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-0.945000f, 3.625000f, -7.165000f)
				 .withRotation(-4.041486f, -30.854630f, -19.420376f)
				 .withPivotPoint(-0.120000f, -0.360000f, 0.040000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .applyTransformations();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-0.945000f, 3.625000f, -7.885000f)
				 .withRotation(-4.041486f, -45.595835f, -21.768277f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .applyTransformations();
			 })
        
			 .withFirstPersonHandPositioningModifying(
                 (renderContext) -> {
                	 new Transform()
                	 .withPosition(2.770000f, 1.225000f, 0.140000f)
                	 .withRotation(73.670132f, -70.659155f, 41.991085f)
                     .withScale(2.6F, 2.6F, 4.0F)
                     .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                     .applyTransformations();
                 }, 
                 (renderContext) -> {
                	 new Transform()
                	 .withPosition(-0.320000f, 0.140000f, 2.040000f)
                     .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                     .withScale(3, 3, 3.5F)
                     .withPivotPoint(0, 0, 0)
                     .applyTransformations();
                 })
                 
        .withFirstPersonHandPositioningModifyingAlt(
        		(renderContext) -> {
               	 new Transform()
	                   	 .withPosition(2.770000f, 1.225000f, 0.140000f)
	                   	 .withRotation(73.670132f, -70.659155f, 41.991085f)
                    .withScale(2.6F, 2.6F, 4.0F)
                    .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                    .applyTransformations();
                }, 
                (renderContext) -> {
               	 new Transform()
               	 .withPosition(-0.320000f, 0.140000f, 2.040000f)
                    .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                    .withScale(3, 3, 3.5F)
                    .withPivotPoint(0, 0, 0)
                    .applyTransformations();
                })
                  
           .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(MWC.modContext);
    }
}