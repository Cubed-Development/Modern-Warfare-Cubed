package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.RPG7;
import com.paneedah.mwc.models.RPG7rocketPROJECTILE;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.wearables.Bullets;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transition;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class RPG7Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("rpg7")
//      .withCapacity(CommonProxy.AR15Mag)
        .withAmmoCapacity(1)
        .withFireRate(0.7f)
        .withRecoil(10f)
        .withZoom(0.9f)
        .withMaxShots(1)
        //.withMaxShots(5)
        .withShootSound("rpg7")
        .withReloadSound("rpg7_reload")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.7f)
        .withFlashScale(() -> 2f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.14f)
        .withShellCasingEjectEnabled(false)
        .withDestroyingBlocks(false)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        
        .withScreenShaking(RenderableState.SHOOTING, 
                1f, // x 
                1f, // y
                8f) // z
        
        .withInformationProvider(stack -> Arrays.asList("Type: Rocket Launcher", 
        "Cartridge: RPG-7 Rocket", "Fire Rate: Semi"))
        .withCompatibleAttachment(Bullets.RPGRocket, (model) -> {})
        .withCompatibleAttachment(AuxiliaryAttachments.RPG7rocket, true, (model) -> {
        })
        .withTextureNames("rpg7")
        .withRenderer(new WeaponRenderer.Builder()

            .withModel(new RPG7())
            //.withTextureName("M4A1")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-1.7F, -0.8F, 1.9F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(-3F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.425000f, 0.825000f, -2.500000f);
                
//                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
//                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(30.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-1.200000f, 1.200000f, 0.5f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(-3F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.425000f, 0.825000f, -2.1f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.03f, 0.8f, -1.6f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.26f, 1.6f);
                } 
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.13f, 1.3f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.125f, 1f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.16f, 1f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.16f, 1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.125f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.06f, 1.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.RPG7rocket.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(-1F, 0.3F, 10F);
                }
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.RPG7rocket.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, -50F);
                })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.200000f, 1.200000f, -0.5f);
                    }, 500, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.200000f, 1.200000f, 0f);
                    }, 430, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.200000f, 1.200000f, 0.5f);
                    }, 450, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(31.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.200000f, 1.200000f, 0.55f);
                }, 320, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-26.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(29.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.200000f, 1.200000f, 0.55f);
                }, 300, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-17.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.200000f, 1.200000f, 0.5f);
                }, 310, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.200000f, 1.200000f, -1.5f);
                }, 290, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.200000f, 1.200000f, -2f);
                }, 170, 0)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.RPG7rocket.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 50F, 5F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(1.5F, 1f, 2F);
                    GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0f, -2.5F);
                    GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                    
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0f, -1.7F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0f, -1.7F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
             .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.GL06Cartridge.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
             .withFirstPersonCustomPositioningReloading(Attachments.ACOG.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
             .withFirstPersonCustomPositioningReloading(Attachments.Specter.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.Holographic.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.Kobra.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.Reflex.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.MicroT1.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.RMR.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, 0.8f, -0.5f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.225000f, 1.4f, -0.8f);
                  }, 350, 600)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-3F, 0f, 0f, 1f);
                        GL11.glRotatef(30F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.425000f, 1f, -2.8f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-3F, 0f, 0f, 1f);
                        GL11.glRotatef(20F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.425000f, 1f, -2.7f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-3F, 0f, 0f, 1f);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.425000f, 0.825000f, -2.6f);
                    }, 240, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-3F, 0f, 0f, 1f);
                        GL11.glRotatef(-3F, 0f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.425000f, 0.825000f, -2.45f);
                    }, 230, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-3F, 0f, 0f, 1f);
                        GL11.glRotatef(1F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.425000f, 0.825000f, -2.500000f);
                    }, 230, 0)
                    )
           
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.03f, 0.8f, -2f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.26f, 1.6f);
                } 
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.13f, 1.3f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.125f, 1f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.16f, 1f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.16f, 1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.125f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.06f, 1.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glRotatef(30.000000f, 1f, 0f, 0f);
                GL11.glTranslatef(-0.575000f, 0.700000f, -3.100003f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1f, 0.700000f, -1.3f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.225000f, -0.875000f, 0.150000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
//                         GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
//                         GL11.glRotatef(-165.000000f, 0f, 1f, 0f);
//                         GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
//                         GL11.glTranslatef(-0.425000f, 0.075000f, -0.625000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                     })
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(2.2f, 2.2f, 2.2f);
                         GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.75f, -0.175000f, 0.6f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.550000f, 0.000000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-160.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, -0.575000f, -0.475000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-165.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, 0.075000f, -0.625000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-165.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.400000f, -0.350000f, -0.425000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-165.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, 0.075000f, -0.625000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-165.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.400000f, -0.350000f, -0.425000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.875000f, 0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.875000f, 0.150000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.475000f, 0.200000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.475000f, 0.200000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.875000f, 0.150000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.875000f, 0.150000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.875000f, 0.150000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.875000f, 0.150000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.875000f, 0.150000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 280, 0)
                    )
                    
            .build())
            .withSpawnEntityDamage(70f)
            .withSpawnEntityRocketParticles()
            .withSpawnEntitySpeed(4f)
            .withSpawnEntityGravityVelocity(0.001f)
            .withSpawnEntityExplosionRadius(4f)
            .withSpawnEntityModel(new RPG7rocketPROJECTILE())
            .withSpawnEntityModelTexture("rpg7")
            .build(MWC.modContext);
        }
    }
