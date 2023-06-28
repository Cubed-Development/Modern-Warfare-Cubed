package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.BrowningAuto5;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.wearables.Bullets;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class BrowningAuto5Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("browning_auto_5")
//      .withCapacity(CommonProxy.Remington870Mag)
        .withAmmoCapacity(4)
        .withMaxBulletsPerReload(4)
        .withFireRate(0.2f)
        .withIteratedLoad()
        .withRecoil(9f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SHOTGUN)
        .withMaxShots(1)
        .withPumpTimeout(800)
        .withShootSound("browningauto5")
        .withSilencedShootSound("ShotgunSilenced")
        .withReloadSound("drawweapon")
        .withInspectSound("inspection")
        .withReloadIterationSound("load_shell")
        .withReloadingTime(15)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")    
        .withShellCasingEjectEnabled(false)
        .withCrosshairZoomed("Sight")
        .withInaccuracy(20)
        .withPellets(10)
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.1f)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Semi-Automatic Shotgun",
        "Damage per Pellet: 6",
        "Pellets per Shot: 10", 
        "Cartridge: 12 Gauge Shotgun Shell",
        "Fire Rate: SEMI",
        "Rate of Fire: 20/100"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                5f, // x 
                1f, // y
                10f) // z
        
        .withCompatibleAttachment(AuxiliaryAttachments.ShotgunShell, true, (model) -> {
            GL11.glTranslatef(-0F, -0.1F, -0.5F);
            GL11.glRotatef(90F, 1f, 0f, 0f);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.BrowningAuto5Action, true, (model) -> {
        })
//        .withCompatibleAttachment(Attachments.Silencer12Gauge, (model) -> {
//            GL11.glTranslatef(-0.19F, -0.6F, -8F);
//            GL11.glScaled(1.4F, 1.4F, 1.4F);
//        })
        .withCompatibleBullet(Bullets.Shotgun12Guage, (model) -> {})
        .withTextureNames("browningauto5")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new BrowningAuto5())
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
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-0.9F, 0.4F, 1F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
            	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(0.125000f, 0.525000f, -1.874999f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.575000f, 0.350000f, -2.600001f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.575000f, 0.350000f, -1.800001f);
                GL11.glRotatef(-4F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.675000f, 0.150000f, -2.400001f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.675000f, 0.150000f, -2.200001f);
                GL11.glRotatef(1F, 0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.08f, 0.13f, -2.2f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0.07F, 1.15F, -0.3F);
//                GL11.glRotatef(-70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.BrowningAuto5Action.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(0F, 0F, 0.7F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.BrowningAuto5Action.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(0F, 0F, 0.7F);
                })
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(0.3F, 2F, 2.5F);
                GL11.glRotatef(-45F, 1f, 0f, 0f);
                })
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 2F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 2F);
                }, 250, 50)
                )
                
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 2F);
                }, 250, 50)
            )
            
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),  
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.3F, 2F, 2.5F);
                    GL11.glRotatef(-45F, 1f, 0f, 0f);
                    
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0.2F, 1.6F, 1F);
                    GL11.glRotatef(-45F, 1f, 0f, 0f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0.2F, 0.5F, 0.5F);
                    GL11.glRotatef(-45F, 1f, 0f, 0f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0.2F, 0.5F, 3F);
                    GL11.glRotatef(-45F, 1f, 0f, 0f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0.2F, 0.5F, 3F);
                    GL11.glRotatef(-45F, 1f, 0f, 0f);
                }, 250, 50)
            )
            
            .withFirstPersonPositioningReloading(
                    
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.125000f, 0.525000f, -1.874999f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.525000f, -1.874999f);
                }, 130, 0)
            )
            
            .withFirstPersonPositioningAllLoadIterationsCompleted(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, 0.525000f, -1.874999f);
                    }, 130, 0)
            )
            
            .withFirstPersonPositioningLoadIteration(   
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.525000f, -1.874999f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(81.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.545000f, -1.874999f);
                }, 120, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(83.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.565000f, -1.774999f);
                }, 90, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-9.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(82.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.545000f, -1.774999f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, 0.525000f, -1.874999f);
                }, 90, 0)
            )
            
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, 0.200000f, -2.2f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.225000f, 0.8f, -2f);
                  }, 350, 600)
                    )
                        
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(15F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.575000f, 0.550000f, -2.600001f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.575000f, 0.550000f, -2.600001f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glRotatef(5F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.575000f, 0.450000f, -2.600001f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.575000f, 0.350000f, -2.600001f);
                    }, 240, 0)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.08f, 0.13f, -2.5f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(35F, 0f, 1f, 0f);
                GL11.glRotatef(20F, 0f, 0f, 1f);
                GL11.glRotatef(5F, 1f, 0f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.55f, 0.65f, -2.3f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.3f, 0.000000f, -2.5f);
             }) 
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.050000f, -0.600000f, 0.125000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
//                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
//                         GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
//                         GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                         GL11.glTranslatef(0.025000f, -0.675000f, 0.175000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.700000f, -1.100000f, 0.225000f);
                    	 
//                    	 GL11.glScalef(4f, 4f, 4f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.600000f, 0.125000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.700000f, -1.100000f, 0.225000f);
                    })
                     
            .withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.025000f, -0.675000f, 0.175000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                    	 	GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    	 	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	 	GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    	 	GL11.glTranslatef(0.350000f, -0.125000f, 0.725000f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.600000f, 0.125000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.700000f, -1.100000f, 0.225000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
            		(renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.600000f, 0.125000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
//                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.025000f, -0.675000f, 0.175000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.700000f, -1.100000f, 0.225000f);
                   	 
//                   	 GL11.glScalef(4f, 4f, 4f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.025000f, -0.675000f, 0.175000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.025000f, -0.675000f, 0.175000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                	 	GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                	 	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                	 	GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                	 	GL11.glTranslatef(0.350000f, -0.125000f, 0.725000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                	 	GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                	 	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                	 	GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                	 	GL11.glTranslatef(0.350000f, -0.125000f, 0.725000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.025000f, -0.675000f, 0.175000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.025000f, -0.675000f, 0.175000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.025000f, -0.675000f, 0.175000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.025000f, -0.675000f, 0.175000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.025000f, -0.675000f, 0.175000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 	GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                   	 	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                   	 	GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                   	 	GL11.glTranslatef(0.350000f, -0.125000f, 0.725000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.450000f, -0.550000f, 0.650000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.500000f, -0.725000f, 0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.450000f, -0.550000f, 0.650000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 	GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                   	 	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                   	 	GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                   	 	GL11.glTranslatef(0.350000f, -0.125000f, 0.725000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.025000f, -0.675000f, 0.175000f);
                    }, 250, 50)
                    
                    )
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                	 	GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                	 	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                	 	GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                	 	GL11.glTranslatef(0.350000f, -0.125000f, 0.725000f);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.600000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.600000f, 0.125000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.700000f, -1.100000f, 0.225000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.700000f, -1.100000f, 0.225000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.050000f, -0.600000f, 0.125000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.050000f, -0.600000f, 0.125000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.050000f, -0.600000f, 0.125000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.050000f, -0.600000f, 0.125000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.700000f, -1.100000f, 0.225000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.700000f, -1.100000f, 0.225000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.700000f, -1.100000f, 0.225000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.700000f, -1.100000f, 0.225000f);
                    }, 250, 100)
                    )
                    
            .build())
        .withSpawnEntityDamage(6f)
        .withSpawnEntityGravityVelocity(0.8f)
        
         
        .build(MWC.modContext);
    }
}
