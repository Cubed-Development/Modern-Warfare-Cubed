package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
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

public class M32MGLFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("m32_mgl")
//      .withCapacity(CommonProxy.AR15Mag)
        .withAmmoCapacity(6)
        .withFireRate(0.16f)
        .withIteratedLoad()
        .withRecoil(6f)
        .withZoom(0.8f)
        .withMaxShots(1)
        .withShootSound("m32")
        .withPumpTimeout(950)
        //.withSilencedShootSound("AR15silenced")
        .withReloadSound("krag_chamberopen")
        .withAllReloadIterationsCompletedSound("krag_chamberclosed")
        .withReloadIterationSound("loadbullet")
        .withDrawSound("noaction_draw")
//       .withReloadSound("drawweapon")
//        .withReloadIterationSound("loadshell")
        .withReloadingTime(1000)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0f)
        .withFlashScale(() -> 0f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.101f)
        .withShellCasingEjectEnabled(false)
        .withDestroyingBlocks(false)
        
        .withScreenShaking(RenderableState.SHOOTING, 
                4f, // x 
                3f, // y
                2f) // z
        
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList("Type: Multiple Grenade Launcher", 
        "Cartridge: 40mm Grenade", "Fire Rate: Semi"))
        .withCompatibleAttachment(Bullets.Grenade40mm, (model) -> {})
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.M32Barrel, (model) -> {
            GL11.glTranslatef(-0.12f, -0.39f, -7.6f);
            GL11.glScaled(2F, 2F, 1F);
        })
        .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
            GL11.glTranslatef(0.21f, 0.7f, -0.1f);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
            GL11.glRotatef(-3F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Attachments.MagpulCTRStock, (model) -> {
            GL11.glTranslatef(0.21f, 0.7f, -0.1f);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
            GL11.glRotatef(-3F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Attachments.MilSpecStock, true, (model) -> {
            GL11.glTranslatef(0.21f, 0.7f, -0.1f);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
            GL11.glRotatef(-3F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Attachments.HK416Stock, (model) -> {
            GL11.glTranslatef(0.21f, 0.7f, -0.1f);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
            GL11.glRotatef(-3F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Attachments.MagpulCTRStockTan, (model) -> {
            GL11.glTranslatef(0.21f, 0.7f, -0.1f);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
            GL11.glRotatef(-3F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Attachments.MilSpecStockTan, (model) -> {
            GL11.glTranslatef(0.21f, 0.7f, -0.1f);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
            GL11.glRotatef(-3F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Attachments.HK416StockTan, (model) -> {
            GL11.glTranslatef(0.21f, 0.7f, -0.1f);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
            GL11.glRotatef(-3F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M32Cartridge, true, (model) -> {
//            GL11.glTranslatef(-0.2F, 0.1f, 0F);
//            GL11.glRotatef(-20F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M32Main1B, true, (model) -> {
            if(model instanceof M32Main1B) {
            } else if(model instanceof Suppressor) {
                GL11.glTranslatef(-0.05F, -0.6f, -0.05F);
                GL11.glScaled(1.1F, 1.1F, 0.3F);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.17F, 0.5F, -5.6f);
                GL11.glScaled(1F, 1F, 0.65F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(0.55F, -0.22F, -5.6f);
                GL11.glScaled(1F, 1F, 0.85F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(-0.45F, 0.05F, -5.6f);
                GL11.glScaled(1F, 1F, 0.85F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(-0.08F, -1.07F, -2.24f);
                GL11.glScaled(0.8F, 0.7F, 0.4F);
            } else if(model instanceof AKRail5) {
                GL11.glTranslatef(-0.1F, -0.6F, -5.2f);
                GL11.glScaled(1F, 1F, 0.7F);
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.08F, -1.2F, -2.8F);
            GL11.glScaled(0.95F, 0.95F, 0.95F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.18F, -1.1F);
            GL11.glScaled(1F, 1F, 1F);
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
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.06F, -0.8F, -1.8F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                GL11.glTranslatef(0.1F, -0.95F, -2F);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(0.1F, -0.95F, -2F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(0.13F, -1F, -1.75F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(0.13F, -1F, -1.75F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
            GL11.glTranslatef(0.13F, -1F, -1.75F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof EotechScopeRing) {
                GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
//        .withCompatibleAttachment(Attachments.Vortex, (player, stack) -> {
//                GL11.glTranslatef(-0.16F, -1.28F, -2.2F);
//                GL11.glScaled(0.5F, 0.5F, 0.6F);
//            },(model) -> {
//                if(model instanceof Holo2) {
//                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
//                    GL11.glScaled(0.15F, 0.15F, 0.15F);
//                }
//            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef(0.13F, -1F, -1.6F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.04F, -1.2F, -1.6F);
                GL11.glScaled(0.48F, 0.48F, 0.48F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.04F, -1.2F, -1.6F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
            GL11.glTranslatef(-0.03F, -1.2F, -1.6F);
            GL11.glScaled(0.38F, 0.38F, 0.38F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.15F, -0.03F, -1.5F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            }
        })
        .withCompatibleAttachment(Attachments.M2A1sight, (model) -> {
            if(model instanceof M2A1) {
                GL11.glTranslatef(-0.075F, -1.25F, -2.2F);
                GL11.glScaled(0.75F, 0.75F, 0.75F);
            } else if(model instanceof M2A1reticle) {
                GL11.glTranslatef(0.04F, -1.485F, -1.07F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0F, -2.1F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0F, -2.1F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0F, -2.1F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
            GL11.glTranslatef(-0.2F, -0F, -2.1F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(0.05F, -0.8F, -2.85F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.05F, -0.8F, -2.85F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        })
        .withTextureNames("gun")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new M32())
            .withPrepareFirstLoadIterationAnimationDuration(1800)
            .withAllLoadIterationAnimationsCompletedDuration(1400)
            //.withTextureName("M4A1")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.3F, 0.3F, 0.3F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(-1.4F, -0.8F, 1.4F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.900000f, 0.715000f, -1.374999f);
                
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glRotatef(-3F, 1f, 0f, 0f);
//                GL11.glRotatef(4F, 0f, 0f, 1f);
//                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
//                GL11.glTranslatef(-0.900000f, 0.715000f, -3.174999f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.900000f, 0.675000f, -1f);
                GL11.glRotatef(-2F, 1f, 0f, 0f); 
                })
                
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                GL11.glRotatef(-18F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.700000f, 0.825000f, -1.174999f);
                })
                
            
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M32Cartridge.getRenderablePart(), (renderContext) -> {
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M32Cartridge.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-0.2F, 0.1f, 0F);
                GL11.glRotatef(-20F, 0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M32Cartridge.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-0.2F, 0.1f, 0F);
                GL11.glRotatef(-20F, 0f, 0f, 1f);
                })
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.M32Main1B.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-0.67F, -0.43f, 0F);
                GL11.glRotatef(60F, 0f, 0f, 1f);
                })
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.CollapsableMOEStock.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-0.67F, -0.43f, 0F);
                GL11.glRotatef(60F, 0f, 0f, 1f);
                })
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.MagpulCTRStock.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-0.67F, -0.43f, 0F);
                GL11.glRotatef(60F, 0f, 0f, 1f);
                })
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.MilSpecStock.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-0.67F, -0.43f, 0F);
                GL11.glRotatef(60F, 0f, 0f, 1f);
                })
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.HK416Stock.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-0.67F, -0.43f, 0F);
                GL11.glRotatef(60F, 0f, 0f, 1f);
                })
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.MagpulCTRStockTan.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-0.67F, -0.43f, 0F);
                GL11.glRotatef(60F, 0f, 0f, 1f);
                })
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.MilSpecStockTan.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-0.67F, -0.43f, 0F);
                GL11.glRotatef(60F, 0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glRotatef(-4F, 1f, 0f, 0f);
                        GL11.glRotatef(-1F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.900000f, 0.685000f, -1.174999f);
                    }, 400, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glRotatef(2F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.900000f, 0.685000f, -1.174999f);
                    }, 430, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glRotatef(-4F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.900000f, 0.715000f, -1.174999f);
                    }, 200, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(38F, 0f, 1f, 0f);
                    GL11.glRotatef(-35F, 1f, 0f, 0f);
                    GL11.glRotatef(-8F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-1.000000f, 1.115000f, -0.074999f);
                }, 320, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(37F, 0f, 1f, 0f);
                    GL11.glRotatef(-45F, 1f, 0f, 0f);
                    GL11.glRotatef(-12F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-1.200000f, 1.315000f, 0.574999f);
                }, 260, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(41.5F, 0f, 1f, 0f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                    GL11.glRotatef(-14F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-0.700000f, 0.765000f, -1.174999f);
                }, 510, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                    GL11.glRotatef(-16F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-0.700000f, 0.795000f, -1.174999f);
                }, 290, 170),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                    GL11.glRotatef(-18F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-0.700000f, 0.825000f, -1.174999f);
                }, 170, 0)
            )
                    
             .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M32Cartridge.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
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
             
             .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M32Main1B.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.CollapsableMOEStock.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.MagpulCTRStock.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.MilSpecStock.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.HK416Stock.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.MagpulCTRStockTan.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.MilSpecStockTan.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.HK416StockTan.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 1000)
                         )
             
             .withFirstPersonPositioningLoadIteration(
                     new Transition((renderContext) -> { 
                         GL11.glRotatef(40F, 0f, 1f, 0f);
                         GL11.glRotatef(-2F, 1f, 0f, 0f);
                         GL11.glRotatef(-18F, 0f, 0f, 1f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.700000f, 0.825000f, -1.174999f);
                     }, 100, 20),
                     new Transition((renderContext) -> { 
                         GL11.glRotatef(40F, 0f, 1f, 0f);
                         GL11.glRotatef(-1F, 1f, 0f, 0f);
                         GL11.glRotatef(-18F, 0f, 0f, 1f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.700000f, 0.825000f, -1.144999f);
                     }, 130, 20),
                     new Transition((renderContext) -> { 
                         GL11.glRotatef(39F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 1f, 0f, 0f);
                         GL11.glRotatef(-18F, 0f, 0f, 1f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.700000f, 0.825000f, -1.204999f);
                     }, 160, 20),
                     new Transition((renderContext) -> { 
                         GL11.glRotatef(40F, 0f, 1f, 0f);
                         GL11.glRotatef(-1F, 1f, 0f, 0f);
                         GL11.glRotatef(-18F, 0f, 0f, 1f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.700000f, 0.825000f, -1.134999f);
                     }, 130, 0),
                     new Transition((renderContext) -> { 
                         GL11.glRotatef(40F, 0f, 1f, 0f);
                         GL11.glRotatef(-2F, 1f, 0f, 0f);
                         GL11.glRotatef(-18F, 0f, 0f, 1f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.700000f, 0.825000f, -1.174999f);
                     }, 150, 20))
                     
             .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.M32Cartridge.getRenderablePart(), 
                     new Transition((renderContext) -> { 
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(0.2F, 0.07f, 0F);
                         GL11.glRotatef(25F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(0.2F, 0.07f, 0F);
                         GL11.glRotatef(30F, 0f, 0f, 1f);
                     }, 250, 50))
             
             .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.M32Main1B.getRenderablePart(), 
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50))
             
             .withFirstPersonCustomPositioningLoadIteration(Attachments.CollapsableMOEStock.getRenderablePart(), 
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50))
             
             .withFirstPersonCustomPositioningLoadIteration(Attachments.MagpulCTRStock.getRenderablePart(), 
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50))
             
             .withFirstPersonCustomPositioningLoadIteration(Attachments.MilSpecStock.getRenderablePart(), 
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50))
             
             .withFirstPersonCustomPositioningLoadIteration(Attachments.HK416Stock.getRenderablePart(), 
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50))
             
             .withFirstPersonCustomPositioningLoadIteration(Attachments.MagpulCTRStockTan.getRenderablePart(), 
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50))
             
             .withFirstPersonCustomPositioningLoadIteration(Attachments.MilSpecStockTan.getRenderablePart(), 
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50))
             
             .withFirstPersonCustomPositioningLoadIteration(Attachments.HK416StockTan.getRenderablePart(), 
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50),
                     new Transition((renderContext) -> { 
                         GL11.glTranslatef(-0.67F, -0.43f, 0F);
                         GL11.glRotatef(60F, 0f, 0f, 1f);
                     }, 250, 50))
             
             .withFirstPersonPositioningAllLoadIterationsCompleted(
                     new Transition((renderContext) -> { 
                         GL11.glRotatef(40F, 0f, 1f, 0f);
                         GL11.glRotatef(2F, 1f, 0f, 0f);
                         GL11.glRotatef(-18F, 0f, 0f, 1f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.700000f, 0.825000f, -1.174999f);
                     }, 250, 0),
                     new Transition((renderContext) -> { 
                         GL11.glRotatef(40F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 1f, 0f, 0f);
                         GL11.glRotatef(-10F, 0f, 0f, 1f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.700000f, 0.825000f, -1.374999f);
                     }, 250, 0),
                     new Transition((renderContext) -> { 
                         GL11.glRotatef(43F, 0f, 1f, 0f);
                         GL11.glRotatef(-4F, 1f, 0f, 0f);
                         GL11.glRotatef(2F, 0f, 0f, 1f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.900000f, 0.825000f, -1.674999f);
                     }, 200, 0),
                     new Transition((renderContext) -> { 
                         GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glRotatef(-2F, 1f, 0f, 0f);
                         GL11.glRotatef(4F, 0f, 0f, 1f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.900000f, 0.725000f, -1.374999f);
                     }, 140, 0))
                    
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
                        GL11.glRotatef(20F, 1f, 0f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.900000f, 0.715000f, -1.374999f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.900000f, 0.715000f, -1.574999f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(2F, 1f, 0f, 0f);
                        GL11.glRotatef(5F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.900000f, 0.715000f, -1.574999f);
                    }, 180, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-3F, 1f, 0f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.900000f, 0.715000f, -1.674999f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-3F, 1f, 0f, 0f);
                        GL11.glRotatef(2F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.900000f, 0.715000f, -1.374999f);
                    }, 140, 0)
                    )
           
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.20000f, 0.6f, -1.1f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.M2A1sight)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.26f, 1.6f);
                } 
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.28f, 1.4f);
                } 
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.28f, 1.4f);
                } 
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.28f, 1.5f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.21f, 1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.21f, 1f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.25f, 1f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.25f, 1f);
                } 
                
//             // Holo Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Holo");
//                    GL11.glTranslatef(0F, 0.32f, 1f);
//                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.24f, 1.3f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.24f, 1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.26f, 1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.26f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.1f, 1f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.20000f, 0.6f, -0.9f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.M2A1sight)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.26f, 1.6f);
                } 
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.28f, 1.4f);
                } 
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.28f, 1.4f);
                } 
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.28f, 1.5f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.21f, 1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.21f, 1f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.25f, 1f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.25f, 1f);
                } 
                
//             // Holo Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Holo");
//                    GL11.glTranslatef(0F, 0.32f, 1f);
//                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.24f, 1.3f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.24f, 1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.26f, 1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.26f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.1f, 1f);
                } 
                
            })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(39F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 1f, 0f, 0f);
                GL11.glRotatef(20F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.700000f, 1.215000f, -1.074999f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-2f, 0.500000f, -0.5f);
             })
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-2f, 0.000000f, -2.0f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(5f, 5f, 5f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.500000f, 0.275000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                     })
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(5f, 5f, 5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.100000f, -0.750000f, 0.000000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                     })
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.700000f, -0.025000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    })
            .withFirstPersonHandPositioningLoadIterationCompleted(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, 0.025000f, 0.275000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.675000f, 0.250000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.675000f, 0.250000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.675000f, 0.250000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.675000f, 0.250000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, 0.025000f, 0.275000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, 0.025000f, 0.275000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
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
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.275000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.275000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.275000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 280, 0)
                    )
            
            .withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, 0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, 0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, 0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, 0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, 0.025000f, 0.275000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 50, 200)
                    )
            
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, 0.025000f, 0.275000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, 0.025000f, 0.275000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.275000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.275000f);
                    }, 250, 1000))
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.725000f, 0.450000f);
                    }, 250, 1000))
                    
            .build())
            .withSpawnEntityDamage(70f)
            .withSpawnEntityGravityVelocity(0.3f)
            .withSpawnEntitySpeed(5f)
            .withSpawnEntityExplosionRadius(3f)
            .build(MWC.modContext);
        }
    }
