package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.configold.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class SA80Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("sa80")
        //.withAmmoCapacity(30)
        .withFireRate(0.6f)
        .withRecoil(2.5f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.RIFLES)
        .withMaxShots(Integer.MAX_VALUE, 1)
        .withShootSound("sa80")
        .withSilencedShootSound("m4a1_silenced")
        .withReloadSound("sa80_reload")
        .withUnloadSound("sa80_unload")
        .withEndOfShootSound("gun_click")
        .withInspectSound("m4a1_inspection")
        .withDrawSound("sa80_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.15f)
        .withShellCasingForwardOffset(0.05f)
        .withShellCasingVerticalOffset(-0.03f)
        
        // .withInaccuracy(1)
        
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Assault Rifle/ Carbine/ Squad-Automatic Weapon", 
        "Damage: 6", 
        "Cartridge: 5.56x45mm NATO",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 80/100",
        "Magazines:",
        "60rnd 5.56x45mm NATO STANAG Magazine"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                    3.5f, // x 
                    1f, // y
                    6f) // z
         
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
        .withUnremovableAttachmentCategories(AttachmentCategory.SCOPE)
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withUnremovableAttachmentCategories(AttachmentCategory.GRIP)
        
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.2f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Magazines.SA80Mag, (model) -> {
            GL11.glTranslatef(-0.35F, 0.5F, 1.3F);
            GL11.glScaled(1.15F, 1.25F, 1.25F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.SA80Action, true, (model) -> {
//            GL11.glTranslatef(-0.175F, -1.28F, -0.67F);
//            GL11.glScaled(0.7F, 0.4F, 0.7F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
              GL11.glTranslatef(-0.205F, -1.3F, -0.15F);
              GL11.glScaled(0.6F, 0.6F, 0.55F);
          } else if(model instanceof AKRail2) {
              GL11.glScaled(0F, 0F, 0F);
          } else if(model instanceof AKRail3) {
              GL11.glScaled(0F, 0F, 0F);
          } else if(model instanceof AKRail4) {
              GL11.glScaled(0F, 0F, 0F);
          } else if(model instanceof AKRail5) {
              GL11.glScaled(0F, 0F, 0F);
          }
        })
        .withCompatibleAttachment(Attachments.Specter, true, (player, stack) -> {
            GL11.glTranslatef(-0.178F, -1.12F, 0.5F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withTextureNames("sa80")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new SA80())
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(0, 0f, 3f);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -0.8F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(7F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.250000f, 1.199999f, -1.374999f);
                
//                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
//                GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(41.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(66.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(0.750000f, 1.4f, -2.150000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(7F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.250000f, 1.199999f, -0.974999f);
                GL11.glRotatef(-1F, 1f, 0f, 0f); 
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(1F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.18f, 1.1f, -0.75f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(1F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.18f, 1.1f, -0.6f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
        
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.SA80Action.getRenderablePart(), (renderContext) -> {
//              GL11.glTranslatef(0f, 0f, 0.5f);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.SA80Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.8f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.SA80Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.8f);
                })
                
            .withFirstPersonCustomPositioning(Magazines.SA80Mag, (renderContext) -> {
//                GL11.glTranslatef(0F, 0.5F, 0F);
                })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { 
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(28.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.975000f, 1.000000f, -1.849999f);
                    }, 330, 0),
                    
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(29.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.975000f, 1.000000f, -1.849999f);
                    }, 290, 80),
                
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(29.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.975000f, 0.9f, -1.689999f);
                    }, 90, 130),
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(85.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, 1.374999f, -2.550000f);
                    }, 320, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(86.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, 1.4f, -2.150000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(85.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, 1.374999f, -2.250000f);
                    }, 30, 0)
                    )
                    
            .withFirstPersonPositioningUnloading(
                    
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.100000f, -1.799999f);
                    }, 240, 0),
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-58.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(31.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.25000f, -1.749999f);
                    }, 120, 0),
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.200000f, -1.749999f);
                    }, 190, 0)
                    )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.SA80Action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.8F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.SA80Action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.SA80Mag,
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2F, 1.5F);
                        GL11.glRotatef(50F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0.5F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.SA80Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 3F, 0F);
//                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                          GL11.glTranslatef(0F, 5F, 1.5F);
//                          GL11.glRotatef(50F, 1f, 0f, 0f);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 0.8f, -0.5f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glRotatef(50F, 0f, 1f, 0f);
                      GL11.glRotatef(60F, 0f, 0f, 1f);
                      GL11.glRotatef(-11F, 1f, 0f, 0f);
                      GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                      GL11.glTranslatef(0.4f, 1.2f, -0.8f);
                  }, 350, 600),
                  new Transition((renderContext) -> {
                      GL11.glRotatef(50F, 0f, 1f, 0f);
                      GL11.glRotatef(60F, 0f, 0f, 1f);
                      GL11.glRotatef(-12F, 1f, 0f, 0f);
                      GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                      GL11.glTranslatef(0.4f, 1.2f, -0.8f);
                  }, 300, 0),
                new Transition((renderContext) -> {
                    GL11.glRotatef(50F, 0f, 1f, 0f);
                    GL11.glRotatef(60F, 0f, 0f, 1f);
                    GL11.glRotatef(-12F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(0.4f, 1.2f, -0.75f);
                }, 450, 400),
                new Transition((renderContext) -> {
                    GL11.glRotatef(50F, 0f, 1f, 0f);
                    GL11.glRotatef(60F, 0f, 0f, 1f);
                    GL11.glRotatef(-11F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(0.4f, 1.2f, -0.8f);
                }, 350, 200)
                    )
                    
            .withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.SA80Action.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 300, 600),
                  new Transition((renderContext) -> {
                  }, 350, 600),
                  new Transition((renderContext) -> {
                  }, 300, 0),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.4F);
                }, 450, 400),
                new Transition((renderContext) -> {
                }, 350, 0)
                    )
                    
            .withThirdPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 180, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 100),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 170),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 10),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 100, 50)
                    )
                    
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, 1.4f, -2.150000f);
                    }, 110, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(56.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, 1.4f, -2.150000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(66.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, 1.4f, -2.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(86.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, 1.4f, -2.150000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-18.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, 1.4f, -2.150000f);
                    }, 80, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.SA80Action.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.355f, 0.91f, -0.85f);
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RECEIVER, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AR57Receiver) {
                        GL11.glTranslatef(-0.0005F, 0.1f, 0f);
                    } else {
                        GL11.glTranslatef(0F, 0f, 0f);
                    }
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.355f, 0.91f, -0.75f);
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RECEIVER, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.AR57Receiver) {
                        GL11.glTranslatef(-0.0005F, 0.1f, 0f);
                    } else {
                        GL11.glTranslatef(0F, 0f, 0f);
                    }
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(2.00000f, 2.00000f, 2.00000f);
                GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(0.000000f, 1.025000f, -1.075000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.725000f, 0.700000f, -1.700000f);
             })
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.800000f, 0.50000f, -0.400000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
//                             GL11.glScalef(3.5f, 3.5f, 3.5f);
//                             GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
//                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
//                             GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                             GL11.glTranslatef(0.155000f, -0.365000f, 0.260000f);
                             
                             GL11.glScalef(3.5f, 3.5f, 3.5f);
                             GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.075000f, -0.375000f, 0.125000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
                     })
                     
            .withFirstPersonHandPositioningProning(
                    (renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.375000f, 0.125000f);
                }, 
                (renderContext) -> {
                    GL11.glScalef(4f, 4f, 5f);
                    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    
//                    GL11.glScalef(4f, 4f, 4f);
                })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.375000f, 0.125000f);
                }, 
                (renderContext) -> {
                    GL11.glScalef(4f, 4f, 5f);
                    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    
//                    GL11.glScalef(4f, 4f, 4f);
                })
                     
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.375000f, 0.125000f);
                }, 
                (renderContext) -> {
                    GL11.glScalef(4f, 4f, 5f);
                    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    
//                    GL11.glScalef(4f, 4f, 4f);
                })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.750000f, 0.375000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.750000f, 0.475000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.925000f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.625000f, -0.800000f, -0.075000f);
                        
                    }, 250, 0),
                    new Transition((renderContext) -> { 
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.865000f, -0.890000f, -0.100000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.965000f, -0.990000f, -0.100000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                   
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 1000),
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
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.875000f, 0.375000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.750000f, 0.375000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.750000f, 0.375000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, -0.725000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -0.775000f, -0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, -0.725000f, 0.000000f);
                    }, 250, 50)
                    )
                    
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
                    }, 250, 50),
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
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50)
                    )
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.075000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                    }, 250, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.150000f, 0.375000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -0.900000f, 0.000000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -0.900000f, 0.000000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.625000f, -0.800000f, -0.075000f);
                        
                    }, 250, 0),
                    new Transition((renderContext) -> { 
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.865000f, -0.890000f, -0.100000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.865000f, -0.890000f, -0.100000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 110, 0)
                    )
                    
            .build())
        .withSpawnEntityDamage(6f)
        .withSpawnEntityGravityVelocity(0.0118f)
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
