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

public class HS12Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("hs12")
        .withAmmoCapacity(2)
        .withMaxBulletsPerReload(4)
        .withFireRate(0.3f)
        .withRecoil(9f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SHOTGUN)
        .withMaxShots(1)
        .withShootSound("mp43e")
        .withSilencedShootSound("ShotgunSilenced")
        .withDrawSound("noaction_draw")
        .withReloadingTime(15)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")    
        .withShellCasingEjectEnabled(false)
        .withCrosshairZoomed("Sight")
        .withInaccuracy(8)
        .withPellets(10)
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.09f)
        .withFlashOffsetY(() -> 0.12f)
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 5f, // x 
                 1f, // y
                 10f) // z
         
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Double-Barrel Shotgun",
        "Damage per Pellet: 6",
        "Pellets per Shot: 10", 
        "Cartridge: 12 Gauge Shotgun Shell",
        "Fire Rate: SEMI ACTION",
        "Rate of Fire: 30/100"))
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.HS12Barrels, true, (model) -> {
            if(model instanceof HS12Barrels) {
//              GL11.glScaled(1F, 0.98F, 1);
          } else if(model instanceof AKRail) {
              GL11.glTranslatef(-0.148F, -0.75F, -0.91f);
              GL11.glScaled(0.5F, 0.6F, 0.4F);
          } else if(model instanceof M1911frontsight) {
              GL11.glTranslatef(-0.1F, -0.71F, -4.3f);
              GL11.glScaled(0.2F, 0.4F, 0.4F);
          } else if(model instanceof AKRail2) {   
              GL11.glTranslatef(-0.01F, -0.1F, -4.4f);
              GL11.glScaled(0.5F, 0.6F, 0.33F);
              GL11.glRotatef(180.000000f, 0f, 0f, 1f);
          }
      })
        .withCompatibleAttachment(AuxiliaryAttachments.ShotgunShellDouble, true, (model) -> {
            if(model instanceof Shotgun12Gauge) {
            	GL11.glTranslatef(-0.135F, -0.485F, -0.02F);
                GL11.glRotatef(90F, 1f, 0f, 0f);
                GL11.glScaled(0.47F, 0.47F, 0.47F);
          } else if(model instanceof Shotgun12Gauge2) {
        	  GL11.glTranslatef(-0.135F, -0.3F, -0.02F);
              GL11.glRotatef(90F, 1f, 0f, 0f);
              GL11.glScaled(0.47F, 0.47F, 0.47F);
              }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.245F, -0.85F, -0.1F);
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
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.035F, -0.66F, -0.6F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
    },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
    })
    .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
        GL11.glTranslatef(-0.01F, -0.7F, -0.35F);
        GL11.glScaled(0.55F, 0.55F, 0.55F);
    },(model) -> {
        if(model instanceof Holo2) {
            GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
            GL11.glScaled(0.1F, 0.1F, 0.1F);
        }
    })
    .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        GL11.glTranslatef(-0.01F, -0.7F, -0.35F);
        GL11.glScaled(0.55F, 0.55F, 0.55F);
    },(model) -> {
        if(model instanceof Holo2) {
            GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
            GL11.glScaled(0.1F, 0.1F, 0.1F);
        }
    })
//    .withCompatibleAttachment(Attachments.Vortex, (player, stack) -> {
//            GL11.glTranslatef(-0.2F, -0.86F, -0.7F);
//            GL11.glScaled(0.3F, 0.3F, 0.4F);
//        },(model) -> {
//            if(model instanceof Holo2) {
//                GL11.glTranslatef(0.395F, -0.33F, -0.1F);
//                GL11.glScaled(0.15F, 0.15F, 0.15F);
//            }
//        })
    .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef(-0.025F, -0.71F, -0.3F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
    },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
    })
    .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef(-0.12F, -0.85F, -0.3F);
            GL11.glScaled(0.28F, 0.28F, 0.28F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
    .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        GL11.glTranslatef(-0.12F, -0.85F, -0.3F);
        GL11.glScaled(0.28F, 0.28F, 0.28F);
    },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
    })
    .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
        GL11.glTranslatef(-0.12F, -0.82F, -0.4F);
        GL11.glScaled(0.26F, 0.26F, 0.26F);
    },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(0.15F, -0.03F, -1.5F);
            GL11.glScaled(0.3F, 0.3F, 0.3F);
        }
    })
        .withCompatibleAttachment(Attachments.Silencer12Gauge, (model) -> {
            GL11.glTranslatef(-0.19F, -0.6F, -8F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
        })
        .withCompatibleBullet(Bullets.Shotgun12Guage, (model) -> {})
        .withTextureNames("gun")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new HS12())
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
                
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glRotatef(3F, 1f, 0f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.2f, 0.6f, -0.8f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.175000f, 0.525000f, -0.875000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.175000f, 0.525000f, -0.275000f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.HS12Barrels.getRenderablePart(), (renderContext) -> {
                })
            
            .withFirstPersonPositioningReloading(
            		
            		// left hand grabs double-barrel
                    
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.320000f, -0.950000f);
                }, 200, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.330000f, -0.950000f);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-4.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.325000f, -0.950000f);
                }, 80, 0),
                
                // left hand brings down barrel
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.43000f, -1.000000f);
                }, 120, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.980000f);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(2.700000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.920000f);
                }, 80, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.950000f);
                }, 90, 0),
                
                // left hand reaches down
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(36.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.950000f);
                }, 250, 0),
                
                // left hand brings up shotgun shells
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-11.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(36.500000f, 0f, 1f, 0f);
                    GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.950000f);
                }, 220, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.950000f);
                }, 140, 0),
                
                // shotgun shells touches insertion point
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-8.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(4.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.410000f, -0.950000f);
                }, 160, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-9.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.410000f, -0.950000f);
                }, 70, 0),
                
                // shells insert
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.380000f, -0.950000f);
                }, 110, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.380000f, -0.950000f);
                }, 70, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.380000f, -0.950000f);
                }, 90, 0),
                
                // left hand grabs double-barrel
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-4.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.950000f);
                }, 200, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.40000f, -0.950000f);
                }, 70, 0),
                
                // left hand snaps barrel into place
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.38000f, -0.900000f);
                }, 120, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.34000f, -0.940000f);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-10.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.35000f, -0.950000f);
                }, 80, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.2f, 0.2f);
                	
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-11.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.35000f, -0.950000f);
                }, 100, 0)
            )
            
            // 20 transitions total
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.HS12Barrels.getRenderablePart(),
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
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.ShotgunShellDouble.getRenderablePart(),
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
                    	GL11.glTranslatef(0f, -0.28f, 0.23f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.28f, 0.23f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // shells insert
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.125f, 0.005f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.125f, 0.005f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.125f, 0.005f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // left hand grabs double-barrel
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.125f, 0.005f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -0.125f, 0.005f);
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
                GL11.glTranslatef(0.250000f, 0.31f, -0.8f);
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.3f, 0.6f);
                } 
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.18f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.255f, 0.3f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.255f, 0.3f);
                } 
                
//             // Holo Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Holo");
//                    GL11.glTranslatef(0f, 0.235f, 0.7f);
//                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.2f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.23f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.23f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.122f, 0.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.250000f, 0.31f, -0.6f);
                GL11.glRotatef(-2.5F, 1f, 0f, 0f);
//                GL11.glRotatef(-2.5F, 0f, 1f, 0f);
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.3f, 0.4f);
                } 
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.18f, 0.6f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.255f, 0.3f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.255f, 0.3f);
                } 
                
//             // Holo Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Holo");
//                    GL11.glTranslatef(0f, 0.235f, 0.7f);
//                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.2f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.23f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.23f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.122f, 0.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(35F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glTranslatef(-0.175000f, 0.925000f, -0.875000f);
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
                         GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.250000f, -0.375000f, 0.250000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                     })
                     
            .withFirstPersonHandPositioningRunning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.850000f, -0.075000f);
                     })
                     
            .withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.050000f, -1.025000f, 0.675000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                    	 GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.250000f, -0.375000f, 0.250000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
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
                         GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
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
        .withSpawnEntityDamage(6f)
        .withSpawnEntityGravityVelocity(0.8f)
        
         
        .build(MWC.modContext);
    }
}
