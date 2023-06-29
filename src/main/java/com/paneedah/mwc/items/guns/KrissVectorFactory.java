package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class KrissVectorFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("kriss_vector")
        .withFireRate(0.999f)
        .withRecoil(2.5f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SMG)
        .withShellType(Type.PISTOL)
        .withMaxShots(1, Integer.MAX_VALUE)
        .withMuzzlePosition(new Vec3d(-0.09600000286102293, -0.13599997425079366, -4.6919999461174))
        //.withMaxShots(5)
        .withShootSound("vector")
        .withSilencedShootSound("mp5_silenced")
        .withReloadSound("vector_reload")
        .withUnloadSound("vector_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.6f)
        .withFlashScale(() -> 0.5f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.22f)
        .withInaccuracy(2f)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
				// The weapon power
				15.0,
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
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Submachine Gun",
        "Damage: 5.3", 
        "Cartridge: .45 ACP",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 99/100",
        "Magazines:",
        "25rnd .45 ACP Vector Magazine",
        "30rnd 5.56x45mm NATO STANAG Magazine (w/ Vector 5.56 Handguard)",
        "30rnd 5.56x45mm NATO PMAG Magazine (w/ Vector 5.56 Handguard)",
        "50rnd 5.56x45mm NATO STANAG Drum Magazine (w/ Vector 5.56 Handguard)",
        "60rnd 5.56x45mm NATO STANAG Drum Magazine (w/ Vector 5.56 Handguard)",
        "100rnd 5.56x45mm NATO STANAG Drum Magazine (w/ Vector 5.56 Handguard)"))
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        
        
        .withScreenShaking(RenderableState.SHOOTING, 
                2f, // x 
                0.1f, // y
                3f) // z
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 5), new
        		CraftingEntry(MWCItems.gunmetalPlate, 8), new
        		CraftingEntry(MWCItems.steelIngot, 3))
        
        .withCompatibleAttachment(Attachments.RailRiser, (model) -> {
            if(model instanceof KrissVectorRailRiser) {
                GL11.glTranslatef(0f, 0f, 0f);
                GL11.glScaled(1F, 1F, 1F);
          } else if(model instanceof AKRail) {
              GL11.glTranslatef(-0.245F, -1.48F, -4.19f);
              GL11.glScaled(0.9F, 0.9F, 1.38F);
          }
        })
        .withCompatibleAttachment(Attachments.KrissVectorReceiver, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.Vector556Handguard, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.VectorMk1ModularHandguard, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.VectorCarbineHandguard, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.VectorTapedGrip, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.VectorStock, true, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.2f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.VectorStockAdapter, (model) -> {
       	 if(model instanceof MilSpecStock) {
       		 GL11.glTranslatef(0.185f, 0.7f, 5.9f);
                GL11.glScaled(1.2F, 1.2F, 1.2F);
            } 
        })
        .withCompatibleAttachment(Magazines.VectorMag, (model) -> {
//            GL11.glTranslatef(-0.43F, 0.8F, 0.2F);
//            GL11.glScaled(1.5F, 1.5F, 1.5F);
//            GL11.glRotatef(17F, 1f, 0f, 0f);		
        })
        .withCompatibleAttachment(Magazines.VectorDrumMag, (model) -> {
//          GL11.glTranslatef(-0.43F, 0.8F, 0.2F);
//          GL11.glScaled(1.5F, 1.5F, 1.5F);
//          GL11.glRotatef(17F, 1f, 0f, 0f);		
      })
        .withCompatibleAttachment(Magazines.FamasF1Mag, (model) -> {
        	GL11.glRotatef(20F, 1f, 0f, 0f);
        	GL11.glScaled(1.3F, 1.3F, 1.3F);
            GL11.glTranslatef(0.03f, 0.2f, -2.8f);
        })
//        .withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
//          GL11.glTranslatef(-0.2F, -1.06F, -7.55F);
//          GL11.glScaled(1F, 1F, 1F);
//        })
        .withCompatibleAttachment(Attachments.TritiumRearSights, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                	GL11.glTranslatef(0.058F, 0.47F, -0.7F);
                    GL11.glScaled(1.5F, 1.5F, 1.5F);
                } else {
                    GL11.glTranslatef(0.058F, 0.87F, 0.2F);
                    GL11.glScaled(1.5F, 1.5F, 1.5F);
                }
            }
        },(model) -> {
            if(model instanceof TritiumRearSights) {
            	 GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                 GL11.glScaled(0.35F, 0.35F, 0.35F);
            }
        }, true, false)
        
        .withCompatibleAttachment(Attachments.MBUSRearSights, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                	GL11.glTranslatef(0.048F, 0.31F, -0.6F);
                    GL11.glScaled(1.4F, 1.4F, 1.4F);
                } else {
                	GL11.glTranslatef(0.048F, 0.71F, 0.3F);
                    GL11.glScaled(1.4F, 1.4F, 1.4F);
                }
            }
        },(model) -> {
            if(model instanceof MBUSRearSight) {
            	 GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                 GL11.glScaled(0.35F, 0.35F, 0.35F);
            }
        }, false, false)
        
        .withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
            	 ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                         AttachmentCategory.RAILING, instance);
                 if(activeAttachment == Attachments.RailRiser) {
                	 GL11.glTranslatef(0.05F, 0.31F, 1.2F);
                     GL11.glScaled(1.4F, 1.4F, 1.4F);
                } else {
                	GL11.glTranslatef(0.05F, 0.71F, 1.2F);
                    GL11.glScaled(1.4F, 1.4F, 1.4F);
                }
            }
        },(model) -> {
            if(model instanceof MBUSFrontSight) {
            	GL11.glTranslatef(-0.16F, -1.5F, -3.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
              }
        }, true, false)
        
        .withCompatibleAttachment(Attachments.NightRaider, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.238F, -1.6F, -3F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(-0.238F, -1.24F, -2.7F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.ACOG, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.358F, -1.65F, -1.5F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(-0.358F, -1.28F, -0.5F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof AcogScope2) {
                GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            else if(model instanceof AcogReticle) {
                GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.Specter, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.22F, -1.2F, -2.2F);
                    GL11.glScaled(0.62F, 0.62F, 0.62F);
                } else {
                    GL11.glTranslatef(-0.22F, -0.83F, -1.5F);
                    GL11.glScaled(0.62F, 0.62F, 0.62F);
                }
            }
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.MicroReflex, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
				    GL11.glTranslatef(-0.16F, -2.35F, -1.8F);
				    GL11.glScaled(0.5F, 0.5F, 0.5F);
                } else {
                	GL11.glTranslatef(-0.16F, -2F, -1F);
    			    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }
            }
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        } else if (model instanceof SightMount) {
	//        	GL11.glTranslatef(-0.15F, -1.82F, -1F);
	//            GL11.glScaled(0.4F, 0.4F, 0.4F);
	        }
	    }, false, false)
        .withCompatibleAttachment(Attachments.Reflex, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.045F, -1.35F, -2F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                } else {
                    GL11.glTranslatef(-0.045F, -1F, -2F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }
            }
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.BijiaReflex, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.035F, -1.3F, -2F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                } else {
                    GL11.glTranslatef(-0.035F, -0.95F, -2F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }
            }
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        }, false, false)
        .withCompatibleAttachment(Attachments.Holographic, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.005F, -1.4F, -2F);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                } else {
                    GL11.glTranslatef(-0.005F, -1.05F, -1.5F);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                }
            }
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            }, false, false)
        .withCompatibleAttachment(Attachments.HolographicAlt, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.005F, -1.4F, -2F);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                } else {
                    GL11.glTranslatef(-0.005F, -1.05F, -1.5F);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                }
            }
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.EotechHybrid2, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.005F, -1.4F, -2.5F);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                } else {
                    GL11.glTranslatef(-0.005F, -1.05F, -1.5F);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                }
            }
        },(model) -> {
            if(model instanceof EotechScopeRing) {
                GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.VortexRedux, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.355F, -1.66F, -2F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                } else {
                    GL11.glTranslatef(-0.355F, -1.28F, -1.5F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }
            }
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            }, false, false)
        .withCompatibleAttachment(Attachments.Kobra, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.025F, -1.45F, -2F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                } else {
                    GL11.glTranslatef(-0.025F, -1.05F, -1F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }
            }
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.MicroT1, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.2F, -1.65F, -2F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                } else {
                    GL11.glTranslatef(-0.2F, -1.3F, -1.5F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }
            }
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            }, false, false)
        .withCompatibleAttachment(Attachments.AimpointCompM5, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.2F, -1.65F, -2F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                } else {
                    GL11.glTranslatef(-0.2F, -1.3F, -1.5F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }
            }
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.RMR, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.19F, -1.6F, -2F);
                    GL11.glScaled(0.42F, 0.42F, 0.42F);
                } else {
                    GL11.glTranslatef(-0.19F, -1.25F, -2F);
                    GL11.glScaled(0.42F, 0.42F, 0.42F);
                }
            }
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.15F, -0.03F, -1.5F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.Bipod, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.Vector556Handguard) {
                    GL11.glTranslatef(-0.23F, 0.8F, -6F);
                    GL11.glScaled(1.4F, 1.4F, 1.4F);
                } else {
                    GL11.glTranslatef(-0.23F, 0.8F, -3.5F);
                    GL11.glScaled(1.4F, 1.4F, 1.4F);
                }
            }
        },(model) -> {
            if(model instanceof Bipod) {
//                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
//                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.23F, 0.8F, -3.5F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.23F, 0.8F, -3.5F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.23F, 1F, -4F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.23F, 0.8F, -3.5F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
        })
        .withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
			GL11.glTranslatef(-0.24F, -0.6F, -6.5F);
			GL11.glScaled(1.5F, 1.5F, 1.5F);
		})
        .withTextureNames("krissvector")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new KrissVector())
            .withADSBeizer(new Vec3d(0.2, 1.7, 0.5))
            //.withTextureName("AK47")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
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
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(-2.2F, -1.1F, 2.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
             
             .withFirstPersonPositioning(
 					new Transform()
 					.withPosition(-1.705000f, 3.985000f, -4.845000f)
 					.withRotation(0.000000f, 1.000000f, 6.300000f)
 					.withRotationPoint(-0.190000f, -1.220000f, -0.060000f)
                    .withScale(3.0, 3.0, 3.0)
                 )
                 
                 .withFirstPersonHandPositioning(
                         
                         // Left hand
                         new Transform()
                         .withPosition(1.290000f, 1.065000f, -0.340000f)
                         .withBBRotation(-8.6414, -29.6346, 58.706)
                         .withScale(2.6, 2.6, 4.0)
                         .withRotationPoint(0, 0, 0),
                         
                         
                         
                         // Right hand
                         new Transform()
                         .withPosition(-0.2, 0.1, 2)
                         .withRotation(-5.4027, -4.7805, -1.6694)
                         .withScale(3.5, 3.5, 3.5)
                         .withRotationPoint(0, 0, 0)
                 
                 )
                 
                 .setupModernAnimations("vector", AuxiliaryAttachments.AKaction)
                 .setupModernMagazineAnimations("vector", 
                 		Magazines.VectorMag, 
                 		Magazines.VectorDrumMag, 
                 		Magazines.FamasF1Mag)
            
            .withFirstPersonCustomPositioning(Magazines.VectorMag, (renderContext) -> {
            })
                    
            .withThirdPersonPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.150000f, 1.149999f, 0.175000f);
//                    }, 200, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 60),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 120, 190),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                }, 300, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 3.6F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(95F, 1f, 0f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                }, 120, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                }, 120, 0)
//                }, 100, 0)
            )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.18f, -0.15f, 0.6f);

                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    	GL11.glTranslatef(0F, 0.44f, 0.2f);
                    } else {
                        GL11.glTranslatef(0F, 0.045f, -0.4f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.44f, 0.2f);
                    } else {
                        GL11.glTranslatef(0F, 0.045f, -0.6f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.42f, 0.3f);
                    } else {
                        GL11.glTranslatef(0F, 0.06f, 0f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.48f, 0.7f);
                    } else {
                        GL11.glTranslatef(0F, 0.12f, -0.2f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.41f, 1f);
                    } else {
                        GL11.glTranslatef(0F, 0.045f, 0.2f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.45f, 0.5f);
                    } else {
                        GL11.glTranslatef(0F, 0.1f, -0.2f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.36f, 0.5f);
                    } else {
                        GL11.glTranslatef(0F, 0f, 0.2f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.375f, 0.3f);
                    } else {
                        GL11.glTranslatef(0F, 0.03f, 0.2f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.47f, 0.3f);
                    } else {
                        GL11.glTranslatef(0F, 0.12f, 0f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.47f, 0.3f);
                    } else {
                        GL11.glTranslatef(0F, 0.12f, 0f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.47f, 0.4f);
                    } else {
                        GL11.glTranslatef(0F, 0.12f, -0.5f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.46f, 0.4f);
                    } else {
                        GL11.glTranslatef(0F, 0.082f, 0f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.42f, 0.8f);
                    } else {
                        GL11.glTranslatef(0F, 0.025f, -0.2f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.45f, 0.8f);
                    } else {
                        GL11.glTranslatef(0F, 0.1f, 0.2f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.45f, 0.8f);
                    } else {
                        GL11.glTranslatef(0F, 0.1f, 0.2f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.23f, 0.8f);
                    } else {
                        GL11.glTranslatef(0F, -0.12f, 0.5f);
                    }
                } 
                
                // Everything else
                else {
                }
                
            
                })
             
            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-1.905000f, 4.065000f, -3.645000f)
				 .withRotation(0.000000f, -30.514396f, -26.062789f)
				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-1.425000f, 3.545000f, -5.685000f)
				 .withRotation(-0.187566f, -46.164037f, -11.869230f)
				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
            })
					 
			.withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                   	 new Transform()
                   	 .withPosition(1.730000f, 0.065000f, -0.980000f)
                   	 .withRotation(93.414678f, 23.699100f, 15.553163f)
                        .withScale(2.6, 2.6, 4.0)
                        .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                        .doGLDirect();
                    }, 
                    (renderContext) -> {
                   	 new Transform()
                        .withPosition(-0.2, 0.1, 2)
                        .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3.5, 3.5, 3.5)
                        .withRotationPoint(0, 0, 0)
                        .doGLDirect();
                    })
                    
           .withFirstPersonHandPositioningModifyingAlt(
           		(renderContext) -> {
                  	 new Transform()
                  	 	.withPosition(2.450000f, -0.335000f, -0.660000f)
                  	 	.withRotation(93.766422f, 50.841130f, 4.679372f)
                  	 	.withScale(2.600000f, 2.600000f, 4.000000f)
                       .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                       .doGLDirect();
                   }, 
                   (renderContext) -> {
                  	 new Transform()
                  	 	.withPosition(-0.600000f, 0.340000f, 1.880000f)
                  	 	.withRotation(-12.193518f, -4.780500f, 1.399459f)
                       .withScale(3.5, 3.5, 3.5)
                       .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                       .doGLDirect();
                   })
                    
            .withThirdPersonLeftHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(3.5f, 3.5f, 3.5f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.250000f, -0.175000f, 0.225000f);
//                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 280, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 5f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
//                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-49.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.025000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                    }, 300, 0))
             
            .build())
        .withSpawnEntityDamage(5.3f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

