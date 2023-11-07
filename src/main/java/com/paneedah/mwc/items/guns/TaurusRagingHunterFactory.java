package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.Reflex2;
import com.paneedah.mwc.models.weapons.TaurusRagingHunter;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Bullets;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class TaurusRagingHunterFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("taurus_raging_hunter")
        .withAmmoCapacity(6)
        .withFireRate(0.2f)
        .withRecoil(7f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.REVOLVER)
        .withMaxShots(1)
        .withShootSound("magnum44")
//		.withIteratedLoad()
        .withReloadSound("revolver_reload")
        .withReloadIterationSound("revolver_insert_bullet")
        .withAllReloadIterationsCompletedSound("revolver_load_complete")
//        .withReloadingTime(2690)
        .withFlashIntensity(0.5f)
		.withFlashScale(() -> 0.6f)
		.withFlashOffsetX(() -> 0.1f)
		.withFlashOffsetY(() -> 0.15f)
        .withInaccuracy(2)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
        		// The weapons power
        		85.0,
        		// Muzzle climb divisor
        		13.125,
        		// "Stock Length"
        		50.0,
        		// Recovery rate from initial shot
        		0.3625,
        		// Recovery rate @ "stock"
        		0.325,
        		// Recoil rotation (Y)
        		0.0,
        		// Recoil rotation (Z)
        		0.0,
        		// Ads similarity divisor
        		1.0
        ))
        
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.MagnumChamber, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.RevolverSpeedLoader, true, (model) -> {
//			GL11.glTranslatef(-0f, -0.1f, 0.7f);
//			GL11.glRotatef(30F, 0f, 1f, 0f);
//            GL11.glRotatef(25F, 0f, 0f, 1f);
//            GL11.glRotatef(-10F, 1f, 0f, 0f);
            })
		.withCompatibleAttachment(AuxiliaryAttachments.RevolverSpeedLoaderBullets, true, (model) -> {
			
//			GL11.glTranslatef(-0.35f, -0.1f, 0.4f);
//            GL11.glRotatef(25F, 0f, 0f, 1f);
		})
//        .withCompatibleAttachment(Attachments.DanWessonLaser, () -> {
//            GL11.glTranslatef(0.01F, -1.45F, -2.6F);
//            GL11.glScaled(0.9F, 0.9F, 0.9F);
//        })
        .withCompatibleAttachment(Attachments.RMR, () -> {
            GL11.glTranslatef(-0.19F, -1.40F, -1.7F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.1F, -0.5F);
	            GL11.glScaled(0.2F, 0.2F, 0.2F);
	        }
	    })
	    .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
	        GL11.glTranslatef(-0.05F, -1.15F, -2.1F);
	        GL11.glScaled(0.6F, 0.6F, 0.6F);
	    },(model) -> {
	    if(model instanceof Reflex2) {
	        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
	        GL11.glScaled(0.15F, 0.15F, 0.15F);
	    }
	    })
        .withCompatibleBullet(Bullets.Bullet44, (model) -> {})
        .withTextureNames("taurusraginghunter")
        .withRenderer(new WeaponRenderer.Builder()
			.withActionPiece(
					AuxiliaryAttachments.MagnumChamber,
					AuxiliaryAttachments.RevolverSpeedLoaderBullets)
			.withActionTransform(
					new Transform()
							.withPivotPoint(0.13F, 0.87F, 0.0F)
							.withRotation(0f, 0f, 90f)
			)
            .withModel(new TaurusRagingHunter())
            //.withTextureName("XEagle")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
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
					.withPosition(-0.945000f, 4.065000f, -7.845000f)
					.withRotation(0.000000f, 1.000000f, 0.681469f)
					.withPivotPoint(-0.12000000357627871F, -0.36000001072883614F, 0.040000001192092904F)
                    .withScale(3.0F, 3.0F, 3.0F)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.370000f, 1.025000f, 2.140000f)
                        .withBBRotation(-12.9672F, -29.0825F, 67.8433F)
                        .withScale(3, 3, 4)
                        .withPivotPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.320000f, 0.260000f, 1.920000f)
                        .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                        .withScale(3, 3, 3.5F)
                        .withPivotPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("taurus", Attachments.P226Slide)
                .setupCustomKeyedPart(AuxiliaryAttachments.MagnumChamber, "taurus", "chamber")
                .setupCustomKeyedPart(AuxiliaryAttachments.RevolverSpeedLoader, "taurus", "loader")
                .setupCustomKeyedPart(AuxiliaryAttachments.RevolverSpeedLoaderBullets, "taurus", "bullets")
                    
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.14f, 0.78f, -2.0f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.2f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.32f, 1f);
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
        .withSpawnEntityDamage(11f)
        .withSpawnEntityGravityVelocity(0.016f)
        
         
        .build(MWC.modContext);
    }
}
