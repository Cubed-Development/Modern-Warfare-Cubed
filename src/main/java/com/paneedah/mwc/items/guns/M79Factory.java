package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.M79;
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

public class M79Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("m79")
//      .withCapacity(CommonProxy.AR15Mag)
        .withAmmoCapacity(1)
        .withFireRate(0.7f)
        .withRecoil(5f)
        .withZoom(0.9f)
        .withMaxShots(1)
        //.withMaxShots(5)
        .withShootSound("m79")
        .withReloadSound("m79_reload")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0f)
        .withFlashScale(() -> 0f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.101f)
        .withShellCasingEjectEnabled(false)
        .withDestroyingBlocks(false)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        
        .withScreenShaking(RenderableState.SHOOTING, 
                4f, // x 
                3f, // y
                2f) // z
        
        .withInformationProvider(stack -> Arrays.asList("Type: Grenade Launcher", "Damage: 70", 
        "Cartridge: 40mm Grenade", "Fire Rate: Semi"))
        .withCompatibleAttachment(Bullets.Grenade40mm, (model) -> {})
        
        .withCompatibleAttachment(AuxiliaryAttachments.M79grenade, true, (model) -> {
            GL11.glTranslatef(-1.76F, 0.6f, 0.5F);
//            GL11.glScaled(1F, 1F, 1F);
            GL11.glRotatef(90F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M79Cartridge, true, (model) -> {
        })
        .withTextureNames("m79")
        .withRenderer(new WeaponRenderer.Builder()

            .withModel(new M79())
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
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-0.7F, -0.3F, 0.7F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(7F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.700000f, -0.200000f, -3.024999f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(7F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.700000f, -0.150000f, -2.424999f);
                GL11.glRotatef(-6F, 1f, 0f, 0f); 
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M79grenade.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M79Cartridge.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glRotatef(-30F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.700000f, 0.500000f, -2.324999f);
                    }, 400, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glRotatef(-65F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.700000f, 1.3f, -2.124999f);
                    }, 430, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glRotatef(-55F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.700000f, 1.55f, -2.124999f);
                    }, 200, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(43F, 0f, 1f, 0f);
                    GL11.glRotatef(7F, 0f, 0f, 1f);
                    GL11.glRotatef(-13F, 1f, 0f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-0.700000f, 0.700000f, -2.424999f);
                }, 300, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(44F, 0f, 1f, 0f);
                    GL11.glRotatef(7F, 0f, 0f, 1f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-0.700000f, 0.400000f, -3.024999f);
                }, 260, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(8F, 0f, 0f, 1f);
                    GL11.glRotatef(1F, 1f, 0f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-0.700000f, -0.200000f, -3.024999f);
                }, 250, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(13F, 0f, 0f, 1f);
                    GL11.glRotatef(3F, 1f, 0f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-0.700000f, -0.200000f, -3.024999f);
                }, 230, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(4F, 0f, 0f, 1f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-0.700000f, -0.200000f, -3.024999f);
                }, 170, 0)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M79grenade.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.55f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.55f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.95f, 2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.95f, 2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.95f, 2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, 0.5F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.55f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
             .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M79Cartridge.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.6f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(19F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.6f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(19F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.6f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(19F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.6f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(19F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.6f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(19F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.6f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(19F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.6f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(19F, 1f, 0f, 0f);
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
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.700000f, -0.200000f, -3.024999f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glRotatef(9F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.700000f, -0.200000f, -3.024999f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glRotatef(4F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.700000f, -0.200000f, -3.024999f);
                    }, 180, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.700000f, -0.200000f, -2.924999f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.700000f, -0.200000f, -3.024999f);
                    }, 140, 0)
                    )
           
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.2f, -0.3f, -2.8f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.2f, -0.1f, -2.3f);
                GL11.glRotatef(-6F, 1f, 0f, 0f); 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(35F, 0f, 1f, 0f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glRotatef(10F, 1f, 0f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.700000f, -0.000000f, -3.024999f);
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
                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.225000f, -0.800000f, 0.275000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
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
                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, -0.800000f, 0.225000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -0.825000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.975000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.800000f, -1.374999f, 0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.800000f, -1.174999f, 0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, -1.050000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.275000f, -0.950000f, 0.175000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, -0.900000f, 0.425000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
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
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.800000f, 0.275000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.800000f, 0.275000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.800000f, 0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.800000f, 0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.800000f, 0.275000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -1.174999f, 0.350000f);
                    }, 280, 0)
                    )
                    
            .build())
            .withSpawnEntityDamage(70f)
            .withSpawnEntityGravityVelocity(0.3f)
            .withSpawnEntitySpeed(5f)
            .withSpawnEntityExplosionRadius(4f)
            .build(MWC.modContext);
        }
    }
