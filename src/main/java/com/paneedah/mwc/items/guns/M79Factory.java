package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Bullets;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class M79Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("m79")
        .withAmmoCapacity(1)
        .withFireRate(0.7f)
        .withRecoil(5f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withShootSound("m79")
        .withReloadSound("m79_reload")
        .withReloadingTime(50)
        .withFlashIntensity(0f)
        .withFlashScale(() -> 0f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.101f)
        .withShellCasingEjectEnabled(false)
        .withDestroyingBlocks(false)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
            // The weapons power
            10.0,
            // Muzzle climb divisor
            25.75,
            // "Stock Length"
            50.0,
            // Recovery rate from initial shot
            0.4,
            // Recovery rate @ "stock"
            0.3125,
            // Recoil rotation (Y)
            0.01,
            // Recoil rotation (Z)
            -0.025,
            // Ads similarity divisor
            1.0
        ))
		
        .withScreenShaking(RenderableState.SHOOTING, 
                4f, // x 
                3f, // y
                2f) // z
        
        .withCompatibleAttachment(Bullets.Grenade40mm, (model) -> {})
        
        .withCompatibleAttachment(AuxiliaryAttachments.M79grenade, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M79Sight, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M79Cartridge, true, (model) -> {
        })
        .withTextureNames("m79")
        .withRenderer(new WeaponRenderer.Builder()

            .withModel(new M79())
            .withEntityPositioning(itemStack -> {
                    GL11.glScaled(0.35F, 0.35F, 0.35F);
                    GL11.glRotatef(0F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                    GL11.glTranslatef(1, 2f, -1.2f);
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
		    .withPosition(-2.425000f, 3.825000f, -3.425000f)
		    .withRotation(-2.000000f, 1.000000f, 7.300000f)
                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0F, 3.0F, 3.0F)
            )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.250000f, 0.265000f, -0.620000f)
                        .withBBRotation(-8.1997F, -23.6991F, 57.7232F)
                        .withScale(2.6F, 2.6F, 4.0F)
                        .withPivotPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.2F, 0.1F, 2)
                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                        .withScale(3.5F, 3.5F, 3.5F)
                        .withPivotPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("taurus", AuxiliaryAttachments.AKaction)
                .setupCustomKeyedPart(AuxiliaryAttachments.M79Cartridge, "taurus", "chamber")
                .setupCustomKeyedPart(AuxiliaryAttachments.M79grenade, "taurus", "loader")

            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(-0.07f, 0.96f, 0.3f);

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
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
            .withSpawnEntityDamage(70f)
            .withSpawnEntityGravityVelocity(0.3f)
            .withSpawnEntitySpeed(5f)
            .withSpawnEntityExplosionRadius(4f)
            .build(MWC.modContext);
        }
    }
