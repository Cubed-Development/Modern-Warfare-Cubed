package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.animation.jim.BBLoader;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class PGMHecateIIFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("pgm_hecate_ii")
        .withFireRate(0.16f)
        .withEjectRoundRequired()
        .withEjectSpentRoundSound("ax50_boltaction")
        .withMuzzlePosition(new Vec3d(-0.1480000044107437, -1.0880000026226049, -10.836000129222878))
        .hasFlashPedals()
        .withRecoil(12f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
        .withMaxShots(1)
        .withShootSound("ax50")
        .withPumpTimeout(1000)
        .withSilencedShootSound("as50_silenced")
        .withDrawSound("noaction_draw")
        .withReloadingTime(40)
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.08f)
        .withFlashOffsetY(() -> 0.08f)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
        		// The weapon power
        		45.0,
        		// Muzzle climb divisor
        		25.0,
        		// "Stock Length"
        		46.25,
        		// Recovery rate from initial shot
        		0.3,
        		// Recovery rate @ "stock"
        		0.425,
        		// Recoil rotation (Y)
        		0.0,
        		// Recoil rotation (Z)
        		0.025,
        		// Ads similarity divisor
        		1.0
        ))

        .withScreenShaking(RenderableState.SHOOTING,
                6f, // x
                -5f, // y
                12f) // z
        .withModernRecipe( new
	        		CraftingEntry(MWCItems.carbonComposite, 12), new
	        		CraftingEntry(MWCItems.gunmetalPlate, 10), new
	        		CraftingEntry(MWCItems.steelIngot, 7), new
        		    CraftingEntry(Blocks.PLANKS, 5))

        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)

        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Magazines.HecateIIMag, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.PGMHecateIIBoltAction, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, () -> {
            GL11.glTranslatef(-0.24F, -1.54F, -2.8F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
        },(model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0F, 0F, 0F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, () -> {
            GL11.glTranslatef(-0.22F, -1.67F, -2.5F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
         .withCompatibleAttachment(Attachments.ACOG, () -> {
             GL11.glTranslatef(-0.328F, -1.65F, -1.2F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
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
        .withCompatibleAttachment(Attachments.Specter, () -> {
            GL11.glTranslatef(-0.2F, -1.32F, -1.5F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, () -> {
            GL11.glTranslatef(-0.16F, -1.45F, -2.5F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        .withCompatibleAttachment(Attachments.Reflex, () -> {
            GL11.glTranslatef(-0.055F, -1.46F, -1.5F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, () -> {
            GL11.glTranslatef(-0.19F, -1.7F, -1.3F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Bipod, () -> {
        	GL11.glTranslatef(-0.2F, -0.28F, -3.9F);
            GL11.glScaled(1F, 1F, 1F);
        })
		
        .withTextureNames("pgmhecateii")
        .withRenderer(new WeaponRenderer.Builder()
            .withModel(new PGMHecateII())
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0f, 3f);
                GL11.glRotatef(0F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.28F, 0.28F, 0.28F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-2.2F, -1.1F, 2.4F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })

                .withFirstPersonPositioning(
                        new Transform()
                                .withPosition(-1.705000f, 4.705000f, -3.445000f)
                                .withRotation(0.000000f, 1.000000f, 6.300000f)
                                .withPivotPoint(-0.230000f, -1.740000f, 0.140000f)
                                .withScale(3.0F, 3.0F, 3.0F)
                )

                .withFirstPersonHandPositioning(

                        // Left hand
                        new Transform()
                                .withPosition(1.250000f, 0.265000f, -0.980000f)
                                .withBBRotation(-6.645F, -32.8876F, 56.8877F)
                                .withScale(2.6F, 2.6F, 4.0F)
                                .withPivotPoint(0, 0, 0),



                        // Right hand
                        new Transform()
                                .withPosition(-0.160000f, 0.060000f, 1.640000f)
                                .withBBRotation(5.4027F, 4.7805F, -1.6694F)
                                .withScale(3.0F, 3.0F, 3.0F)
                                .withPivotPoint(0, 0, 0)

                )
                
                .setupModernAnimations("M40A6", AuxiliaryAttachments.PGMHecateIIBoltAction)
                .setupCustomKeyedPart(AuxiliaryAttachments.PGMHecateIIBoltAction, "M40A6", BBLoader.KEY_BOLT_ACTION)
                .setupCustomKeyedPart(AuxiliaryAttachments.PGMHecateIIBoltAction, "m40a6", "boltprime")
                .setupModernMagazineAnimations("M40A6", 
                		Magazines.HecateIIMag)

            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Bullet.getRenderablePart(), (renderContext) -> {
            })
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.PGMHecateIIBoltAction.getRenderablePart(), (renderContext) -> {
            })
			
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.13f, 1.18f, -0.5f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    GL11.glTranslatef(0f, 0.225f, 0.65f);
                }

                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    GL11.glTranslatef(-0.0f, 2f, 1.0f);
                }

                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    GL11.glTranslatef(0.01f, 0.15f, 1.0f);
                }

                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    GL11.glTranslatef(0f, 0.16f, 0.7f);
                }

                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    GL11.glTranslatef(0f, -0.22f, 0.5f);
                }

                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    GL11.glTranslatef(0.01f, 0.21f, 1.0f);
                }

            })

            .withFirstPersonPositioningModifying((renderContext) -> {
                new Transform()
                            .withPosition(-1.905000f, 4.065000f, -3.645000f)
                            .withRotation(0.000000f, -30.514396f, -26.062789f)
                            .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                            .withScale(2.300000f, 2.300000f, 2.300000f)
                            .applyTransformations();
                })
            .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                    new Transform()
                            .withPosition(-1.425000f, 3.545000f, -5.685000f)
                            .withRotation(-0.187566f, -46.164037f, -11.869230f)
                            .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                            .withScale(2.300000f, 2.300000f, 2.300000f)
                            .applyTransformations();
                })
            .withFirstPersonHandPositioningModifying((renderContext) -> {
                    new Transform()
                            .withPosition(1.730000f, 0.065000f, -0.980000f)
                            .withRotation(93.414678f, 23.699100f, 15.553163f)
                            .withScale(2.6f, 2.6f, 4.0f)
                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                            .applyTransformations();
                }, (renderContext) -> {
                    new Transform()
                            .withPosition(-0.2f, 0.1f, 2f)
                            .withRotation(-5.4027f, -4.7805f, -1.6694f)
                            .withScale(3.5f, 3.5f, 3.5f)
                            .withPivotPoint(0f, 0f, 0f)
                            .applyTransformations();
                })

            .withFirstPersonHandPositioningModifyingAlt(
                        (renderContext) -> {
                            new Transform()
                                    .withPosition(2.450000f, -0.335000f, -0.660000f)
                                    .withRotation(93.766422f, 50.841130f, 4.679372f)
                                    .withScale(2.600000f, 2.600000f, 4.000000f)
                                    .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                    .applyTransformations();
                        }, (renderContext) -> {
                            new Transform()
                                    .withPosition(-0.600000f, 0.340000f, 1.880000f)
                                    .withRotation(-12.193518f, -4.780500f, 1.399459f)
                                    .withScale(3.5f, 3.5f, 3.5f)
                                    .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                    .applyTransformations();
                }
            )

            .build())
        .withSpawnEntityDamage(20f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(MWC.modContext);
    }
}