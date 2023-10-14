package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.Glock18C;
import com.paneedah.mwc.models.weapons.Reflex2;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class DesertEagleFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("desert_eagle")
        .withFireRate(0.2f)
        .withRecoil(5f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SIDEARM)
        .withMuzzlePosition(new Vec3d(-0.14400000429153445, -0.8639999959468836, -2.355999876499175))
        .withShellType(Type.PISTOL)
        .withMaxShots(1)
        .withShootSound("desert_eagle")
        .withSilencedShootSound("m9a1_silenced")
        .withReloadSound("deagle_reload")
        .withUnloadSound("pistol_unload")
        .withInspectSound("inspection")
        .withDrawSound("handgun_draw")
        .withReloadingTime(50)
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.7f)
        .withFlashOffsetX(() -> 0.13f)
        .withFlashOffsetY(() -> 0.14f)
        .withInaccuracy(3)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
        		// The weapons power
        		80.0,
        		// Muzzle climb divisor
        		13.5,
        		// "Stock Length"
        		37.5,
        		// Recovery rate from initial shot
        		0.425,
        		// Recovery rate @ "stock"
        		0.2125,
        		// Recoil rotation (Y)
        		-0.030,
        		// Recoil rotation (Z)
        		-0.010,
        		// Ads similarity divisor
        		1.0
        ))
         
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withCompatibleAttachment(Attachments.PistolPlaceholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.DesertEagleBody, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.DesertEagleSlide, true, (model) -> {
        })
        .withCompatibleAttachment(Magazines.DesertEagleMag, (model) -> {
        })
        .withCompatibleAttachment(Attachments.DesertEagleLongBody, (model) -> {
        })
        .withCompatibleAttachment(Attachments.DesertEagleBodyGolden, (model) -> {
        })
        .withCompatibleAttachment(Attachments.DesertEagleSlideGolden, (model) -> {
        })
        .withCompatibleAttachment(Attachments.DesertEagleBodyBlack, (model) -> {
        })
        .withCompatibleAttachment(Attachments.DesertEagleSlideBlack, (model) -> {
        })
        .withCompatibleAttachment(Attachments.Laser, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
               ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.BACKGRIP, instance);
            if(activeAttachment == Attachments.DesertEagleLongBody) {
                GL11.glTranslatef(0.01F, -0.76F, -3.0F);
                GL11.glScaled(1.1F, 1.1F, 1.1F);
                GL11.glRotatef(-90F, 0f, 0f, -4f);
            } else {
                GL11.glTranslatef(0.01F, -0.76F, -2.1F);
                GL11.glScaled(1.1F, 1.1F, 1.1F);
                GL11.glRotatef(-90F, 0f, 0f, -4f);
            }
        }
                },(model) -> {
                    if(model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }, false, false)
		
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.38F, -1.45F);
            GL11.glScaled(1F, 1F, 1F);
        })
//        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
//            GL11.glTranslatef(-0.22F, -1.18F, -4.2F);
//            GL11.glScaled(1.3F, 1.3F, 1.3F);
//        })
        .withCompatibleAttachment(Attachments.RMR, () -> {
                GL11.glTranslatef(-0.19F, -1.3F, -1.25F);
                GL11.glScaled(0.46F, 0.46F, 0.46F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.1F, -0.5F);
                GL11.glScaled(0.2F, 0.2F, 0.2F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
            GL11.glTranslatef(-0.05F, -1F, -1.6F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withTextureNames("deagle")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new Glock18C())
			.withActionPiece(
			    Attachments.DesertEagleSlide,
				Attachments.DesertEagleSlideGolden,
				Attachments.DesertEagleSlideBlack)
		    .withActionTransform(new Transform().withPosition(0F, 0F, 0.6F))
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-1.6F, -1F, 1.8F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-0.945000f, 4.065000f, -7.845000f)
					.withRotation(0.000000f, 1.000000f, 0.681469f)
					.withPivotPoint(-0.12000000357627871F, -0.36000001072883614F, 0.040000001192092904F)
                    .withScale(3.0F, 3.0F, 3.0F)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.370000f, 0.865000f, 2.020000f)
                        .withBBRotation(-12.9672F, -29.0825F, 67.8433F)
                        .withScale(3, 3, 4)
                        .withPivotPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.320000f, 0.140000f, 2.040000f)
                        .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                        .withScale(3, 3, 3.5F)
                        .withPivotPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("deagle", Attachments.DesertEagleSlide)
                .setupModernMagazineAnimations("deagle", Magazines.DesertEagleMag)
                
            .withFirstPersonCustomPositioning(Attachments.DesertEagleSlide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.6F);
                }
            })
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.14f, 0.7f, -2.3f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                	GL11.glTranslatef(0f, 0.21f, 0.24f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.26f, 0.24f);
                } 
                
                // Everything else
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
        .withSpawnEntityDamage(12f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(MWC.modContext);
    }
}
