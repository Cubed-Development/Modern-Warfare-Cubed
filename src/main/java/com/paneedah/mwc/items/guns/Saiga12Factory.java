package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class Saiga12Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("saiga12")
        .withFireRate(0.4f)
        .withRecoil(9f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SHOTGUN)
        .withShellType(Type.SHOTGUN)
        .withModernScreenShaking(100.0, 0.7F)
        .hasFlashPedals()
        .withMaxShots(1, Integer.MAX_VALUE)
        .withMuzzlePosition(new Vec3d(-0.16400000488758082, -1.0, -6.5))
        .withShootSound("saiga12")
        .withSilencedShootSound("ak15_silenced")
        .withReloadingTime(45)
        .withInaccuracy(10)
        .withPellets(10)
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 1f)
        .withFlashOffsetX(() -> 0.05f)
        .withFlashOffsetY(() -> 0.15f)
        .withShellCasingModel(new Shotgun12Gauge())
        .withShellCasingModelTexture("shotgun12gauge")
        .withShellCasingForwardOffset(0.01f)
        .withShellCasingVerticalOffset(-0.03f)
        .withCreativeTab(MWC.WEAPONS_TAB)
		.useNewSystem()
        .withRecoilParam(new RecoilParam(
				// The weapon power
				40.0,
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
                 5f, // x 
                 1f, // y
                 10f) // z
        
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
		
        .withCompatibleAttachment(AuxiliaryAttachments.Saiga12action, true, (model) -> {
        })
	.withCompatibleAttachment(Attachments.Saiga12Handguard, true, (model) -> {
	})
	.withCompatibleAttachment(Attachments.Saiga12Stock, true, (model) -> {
	})		
        .withCompatibleAttachment(Magazines.SaigaMag, (model) -> {
        })
	.withCompatibleAttachment(Magazines.SaigaMagExtended, (model) -> {
        })
        .withCompatibleAttachment(Attachments.Silencer12Gauge, (model) -> {
          GL11.glTranslatef(-0.2F, -1.1F, -9.35F);
          GL11.glScaled(1.5F, 1.5F, 1.5F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Saiga12sights, true, (model) -> {
            if(model instanceof makarovrearsight) {
                GL11.glTranslatef(-0.1393F, -1.3F, -2.85F);
                GL11.glScaled(0.2F, 0.22F, 0.2F);
            }
            else if(model instanceof makarovfrontsight) {
                GL11.glTranslatef(-0.124F, -1.29F, -4.9F);
                GL11.glScaled(0.1F, 0.1F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.PSO1, () -> {
            GL11.glTranslatef(0.118F, -1.0F, -1.1F);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        },(model) -> {
            if(model instanceof PSO1reticle) {
                GL11.glTranslatef(-0.212F, -0.486F, 1.27F);
                GL11.glScaled(0.017F, 0.017F, 0.017F);
            }
             else if(model instanceof PSO12) {
                 GL11.glTranslatef(-0.27F, -0.6F, 1.21F);
                 GL11.glScaled(0.8F, 0.8F, 0.8F);
             }
        })
        .withCompatibleAttachment(Attachments.OKP7, () -> {
            GL11.glTranslatef(-0.2F, -0.65F, -1F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof OKP7reticle) {
                GL11.glTranslatef(0.2F, -1.15F, -0.6F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withTextureNames("gun.png")
        .withRenderer(new WeaponRenderer.Builder()
            .withModel(new Saiga12())
            .withActionPiece(AuxiliaryAttachments.Saiga12action)
            .withActionTransform(new Transform().withPosition(0, 0, 1))
            .withADSBeizer(new Vec3d(0.2, 1.7, 0.5))
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
                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0F, 3.0F, 3.0F)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.210000f, 0.265000f, -0.820000f)
                        .withBBRotation(-7.1415F, -27.3003F, 52.6433F)
                        .withScale(2.8F, 2.8F, 4.0F)
                        .withPivotPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.200000f, 0.180000f, 1.960000f)
                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                        .withScale(3, 3, 3.5F)
                        .withPivotPoint(0, 0, 0)
                
                )
                    
                    .setupModernAnimations("ak47", AuxiliaryAttachments.Saiga12action)
                    .setupModernMagazineAnimations("ak47",
                    		Magazines.SaigaMag,
                    		Magazines.SaigaMagExtended)
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.Saiga12action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.Saiga12action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                    
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glTranslatef(0.18f, -0.25f, 0.7f);


                // ACOG Zoom
                if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.014f, 0.217f, -0.3f);
                }

                // ACOG Zoom
                if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.01f, 0.12f, -0.2f);
                }

            })
             
            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-1.545000f, 5.305000f, -5.205000f)
				 .withRotation(-3.220844f, -26.042916f, -15.848692f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .applyTransformations();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-1.545000f, 5.305000f, -6.765000f)
				 .withRotation(-3.220844f, -42.465731f, -15.848692f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .applyTransformations();
           })
					 
			.withFirstPersonHandPositioningModifying(
                   (renderContext) -> {
                  	 new Transform()
                  	.withPosition(4.370000f, 0.705000f, 2.100000f)
                  	.withRotation(77.474485f, 36.548800f, 14.076018f)
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
                 	.withPosition(4.370000f, 0.705000f, 2.100000f)
                 	.withRotation(77.474485f, 36.548800f, 14.076018f)
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
