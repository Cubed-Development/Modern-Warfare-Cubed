package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.wearables.Bullets;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class G2ContenderFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("g2_contender")
        .withAmmoCapacity(1)
        .withFireRate(0.3f)
        .withRecoil(9f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SIDEARM)
        .withMaxShots(1)
        .withShootSound("g2contender")
        .withSilencedShootSound("ShotgunSilenced")
        .withReloadSound("g2contender_reload")
        .withDrawSound("noaction_draw")
        .withReloadingTime(15)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")    
        .withShellCasingEjectEnabled(false)
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.09f)
        .withFlashOffsetY(() -> 0.09f)
        
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Break-Action",
        "Damage: 6.5", 
        "Cartridge: .45-70 Government",
        "Fire Rate: SEMI",
        "Rate of Fire: 30/100"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                3f, // x 
                2f, // y
                6f) // z
        
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCompatibleAttachment(Attachments.G2ContenderBarrelShort, true, (model) -> {
            if(model instanceof G2ContenderBarrelShort) {
            	GL11.glTranslatef(0F, -0F, 0f);
//                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
            	GL11.glTranslatef(-0.175F, -0.9F, -0.3f);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
            } else if(model instanceof FALIron) {
            	GL11.glTranslatef(-0.07F, -0.6F, -2.7f);
            	GL11.glScaled(0.1F, 0.3F, 0.6F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            }  
        })
        .withCompatibleAttachment(Attachments.G2ContenderBarrelLong, (model) -> {
            if(model instanceof G2ContenderBarrelShort) {
            	GL11.glTranslatef(0F, -0F, 0f);
//                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
            	GL11.glTranslatef(-0.175F, -0.9F, -0.3f);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
            } else if(model instanceof FALIron) {
            	GL11.glTranslatef(-0.07F, -0.6F, -5f);
            	GL11.glScaled(0.1F, 0.3F, 0.6F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.16F, -0.65F, -2f);
            	GL11.glScaled(0.6F, 0.6F, 0.6F);
//                GL11.glRotatef(180F, 0f, 0f, 1f);
            }   
        })
        .withCompatibleAttachment(Attachments.G2ContenderGrip, true, (model) -> {
//          GL11.glTranslatef(0.01f, -0.19f, -0.4f);
          GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.G2ContenderStock, (model) -> {
//          GL11.glTranslatef(0.01f, -0.19f, -0.4f);
          GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.BulletSmall, true, (model) -> {
          GL11.glTranslatef(-0.14f, -0.44f, 0.03f);
        	GL11.glRotatef(90F, 1f, 0f, 0f);
          GL11.glScaled(0.5F, 0.5F, 0.5F);
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
        	GL11.glTranslatef(-0.115F, -0.57F, -2F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        .withCompatibleBullet(Bullets.Bullet4570, (model) -> {})
        .withTextureNames("g2contender")
        .withRenderer(new WeaponRenderer.Builder()

            .withModel(new G2Contender())
            //.withTextureName("Remington900")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.3F, -0.1F, 1.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glRotatef(5F, 0f, 0f, 1f);
//                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
//                GL11.glTranslatef(-0.150000f, 0.335000f, -1.049999f);
                
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(12F, 0f, 0f, 1f);
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glTranslatef(-0.110000f, 0.355000f, -1.449999f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(12F, 0f, 0f, 1f);
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glTranslatef(-0.110000f, 0.355000f, -0.849999f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(Attachments.G2ContenderBarrelShort.getRenderablePart(), (renderContext) -> {
//            	GL11.glTranslatef(0f, -0.1f, 0f);
//                GL11.glRotatef(35F, 1f, 0f, 0f);
//                GL11.glScalef(1f, 1f, 1f);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.BulletSmall.getRenderablePart(), (renderContext) -> {
            	// inserted
            	
//            	GL11.glTranslatef(0f, -0.125f, 0.005f);
//                GL11.glRotatef(35F, 1f, 0f, 0f);
//                GL11.glScalef(1f, 1f, 1f);
                
            	// about to insert
            	
//                GL11.glTranslatef(0f, -0.28f, 0.23f);
//                GL11.glRotatef(35F, 1f, 0f, 0f);
//                GL11.glScalef(1f, 1f, 1f);
            	
            	// being carried by left hand
            	
//            	GL11.glTranslatef(0.5f, 0.2f, 0.6f);
//                GL11.glRotatef(25F, 1f, 1f, 0f);
//                GL11.glScalef(1f, 1f, 1f);
                
                // being carried by left hand PT 2
                
//                GL11.glTranslatef(0.35f, -0.15f, 0.5f);
//                GL11.glRotatef(25F, 1f, 1f, 0f);
//                GL11.glScalef(1f, 1f, 1f);
                })
                
            .withFirstPersonPositioningReloading(
            		
            		// left hand grabs double-barrel
                    
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.320000f, -0.950000f);
                }, 150, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.330000f, -0.950000f);
                }, 40, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-4.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.325000f, -0.950000f);
                }, 60, 0),
                
                // left hand brings down barrel
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.43000f, -1.000000f);
                }, 100, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.980000f);
                }, 40, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(2.700000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.920000f);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.950000f);
                }, 70, 0),
                
                // left hand reaches down
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(36.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.950000f);
                }, 220, 0),
                
                // left hand brings up shotgun shells
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-11.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(36.500000f, 0f, 1f, 0f);
                    GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.950000f);
                }, 180, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.950000f);
                }, 110, 0),
                
                // shotgun shells touches insertion point
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-8.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(4.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.410000f, -0.950000f);
                }, 120, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-9.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.410000f, -0.950000f);
                }, 60, 0),
                
                // shells insert
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.380000f, -0.950000f);
                }, 70, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.380000f, -0.950000f);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.380000f, -0.950000f);
                }, 80, 0),
                
                // left hand grabs double-barrel
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-4.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.950000f);
                }, 180, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.950000f);
                }, 60, 0),
                
                // left hand snaps barrel into place
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.38000f, -0.900000f);
                }, 100, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.34000f, -0.940000f);
                }, 40, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-10.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.35000f, -0.950000f);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-11.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.35000f, -0.950000f);
                }, 80, 0)
            )
            
            // 20 transitions total
            
            .withFirstPersonCustomPositioningReloading(Attachments.G2ContenderBarrelShort.getRenderablePart(),
            		// left hand grabs double-barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // left hand brings down barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand reaches down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand brings up shotgun shells
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // shotgun shells touches insertion point
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // shells insert
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand grabs double-barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand snaps barrel into place
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0)
                )
            
            .withFirstPersonCustomPositioningReloading(Attachments.G2ContenderBarrelLong.getRenderablePart(),
            		// left hand grabs double-barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // left hand brings down barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand reaches down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand brings up shotgun shells
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // shotgun shells touches insertion point
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // shells insert
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand grabs double-barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.1f, 0f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand snaps barrel into place
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0)
                )
            
            .withFirstPersonCustomPositioningReloading(Attachments.LeupoldRailScope.getRenderablePart(),
            		// left hand grabs double-barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // left hand brings down barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand reaches down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand brings up shotgun shells
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // shotgun shells touches insertion point
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // shells insert
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand grabs double-barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 2.4f, 0.2f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand snaps barrel into place
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0)
                )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.BulletSmall.getRenderablePart(),
            		// left hand grabs double-barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // left hand brings down barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.7f, 1f);
                        GL11.glRotatef(30F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                        
                        // change this so that it looks like the shells are flying out
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.2f, -0.7f, 0.7f);
                        GL11.glRotatef(-35F, 1f, 1f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.2f, -0.8f, 1.5f);
                        GL11.glRotatef(-85F, 1f, 1f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.2f, -0.8f, 2f);
                        GL11.glRotatef(-85F, 1f, 1f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    	
                    }, 260, 0),
                    
                    // left hand reaches down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.8f, 1f, 1f);
                        GL11.glRotatef(25F, 1f, 1f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand brings up shotgun shells
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.5f, 0.2f, 0.8f);
                        GL11.glRotatef(25F, 1f, 1f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.35f, -0.15f, 0.5f);
                        GL11.glRotatef(25F, 1f, 1f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // shotgun shells touches insertion point
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.24f, 0.23f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.24f, 0.23f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // shells insert
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.105f, 0.005f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.105f, 0.005f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.105f, 0.005f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand grabs double-barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.105f, 0.005f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.105f, 0.005f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand snaps barrel into place
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 260, 0)
                )
            
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.150000f, -0.950000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(-0.375000f, 0.700000f, -0.825000f);
                  }, 350, 600)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(15F, 0f, 1f, 0f);
                        GL11.glRotatef(13F, 0f, 0f, 1f);
                        GL11.glRotatef(9F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.2f, 0.7f, -1.4f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(9F, 0f, 0f, 1f);
                        GL11.glRotatef(6F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.2f, 0.5f, -1.4f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(4F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.2f, 0.4f, -1.4f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.2f, 0.45f, -1.4f);
                    }, 240, 0)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.250000f, 0.23f, -1f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Holo");
                	GL11.glTranslatef(0f, 0.27f, 1f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.25f, 0.23f, -0.4f);
                GL11.glRotatef(-5F, 1f, 0f, 1f);
//                GL11.glRotatef(-2.5F, 0f, 1f, 0f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Holo");
                	GL11.glTranslatef(0f, 0.27f, 0.5f);
                } 
                
                // Everything else
                else {
                }
                
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.350000f, 0.6f, -0.6f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.725000f, 0.1f, -1.324999f);
             }) 
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.375000f, 0.125000f, 0.650000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.520000f, -0.730000f, 0.270000f);
                     })
                     
            .withFirstPersonHandPositioningRunning(
            		(renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.160000f, -0.525000f, 0.250000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.475000f, -0.675000f, 0.325000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.160000f, -0.525000f, 0.250000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(0.535000f, -0.700000f, 0.275000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.075000f, 0.175000f, 0.450000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.475000f, -0.675000f, 0.325000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
            		// left hand grabs double-barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.600000f, 0.200000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.600000f, 0.200000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.600000f, 0.200000f);
                    }, 200, 0),
                    
                    // left hand brings down barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.200000f, -0.525000f, 0.225000f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.200000f, -0.525000f, 0.225000f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.200000f, -0.525000f, 0.225000f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.200000f, -0.525000f, 0.225000f);
                    }, 260, 0),
                    
                    // left hand reaches down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.125000f, 0.425000f);
                    }, 260, 0),
                    
                    // left hand brings up shotgun shells
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.350000f, -1.100000f, 0.175000f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.420000f, -0.975000f, 0.025000f);
                    }, 260, 0),
                    
                    // shotgun shells touches insertion point
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.370000f, -0.765000f, 0.175000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.370000f, -0.765000f, 0.175000f);
                    }, 260, 0),
                    
                    // shells insert
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.270000f, -0.725000f, 0.235000f);
                    	
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.270000f, -0.725000f, 0.235000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.270000f, -0.725000f, 0.235000f);
                    }, 260, 0),
                    
                    // left hand grabs double-barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.375000f, 0.225000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.400000f, 0.225000f);
                    }, 260, 0),
                    
                    // left hand snaps barrel into place
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, -0.450000f, 0.240000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, -0.450000f, 0.240000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, -0.450000f, 0.240000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, -0.450000f, 0.240000f);
                    }, 260, 0)
                )
            
            .withFirstPersonRightHandPositioningReloading(
            		// left hand grabs double-barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 200, 0),
                    
                    // left hand brings down barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 120, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0),
                    
                    // left hand reaches down
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0),
                    
                    // left hand brings up shotgun shells
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                   }, 260, 0),
                    
                    // shotgun shells touches insertion point
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0),
                    
                    // shells insert
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0),
                    
                    // left hand grabs double-barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0),
                    
                    // left hand snaps barrel into place
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.543000f, -0.825000f, 0.185000f);
                    }, 260, 0)
                )
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 250, 100)
                    )
                    
            .build())
        .withSpawnEntityDamage(6.5f)
        .withSpawnEntityGravityVelocity(0.8f)
        
         
        .build(MWC.modContext);
    }
}
