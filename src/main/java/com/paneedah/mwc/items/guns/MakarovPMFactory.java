package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class MakarovPMFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("makarov_pm")
        .withFireRate(0.3f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SIDEARM)
        .withMaxShots(1)
        .withShootSound("makarov")
        .withSilencedShootSound("colt_m45a1_silenced")
        .withReloadSound("makarovreload")
        .withUnloadSound("makarovunload")
        .withInspectSound("inspection")
        .withDrawSound("handgun_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.19f)
//      .withShellCasingForwardOffset(0.001f)
        .withInaccuracy(3)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
        		// The weapon power
        		45.0,
        		// Muzzle climb divisor
        		13.5,
        		// "Stock Length"
        		37.5,
        		// Recovery rate from initial shot
        		0.425,
        		// Recovery rate @ "stock"
        		0.2125,
        		// Recoil rotation (Y)
        		0.0,
        		// Recoil rotation (Z)
        		0.0,
        		// Ads similarity divisor
        		1.0
        ))
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Soviet Semi-Automatic Pistol", 
        "Damage: 4.5", 
        "Cartridge: 9x18mm",
        "Fire Rate: SEMI",
        "Rate of Fire: 30/100",
        "Magazines:",
        "8rnd 9x18mm PM Magazine"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                2.5f, // x 
                0.1f, // y
                1f) // z
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 5), new
        		CraftingEntry(MWCItems.gunmetalPlate, 4), new
        		CraftingEntry(MWCItems.steelIngot, 3))
        
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
//        .withCompatibleAttachment(Attachments.PistolPlaceholder, true, (model) -> {
//            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//            GL11.glScaled(0F, 0F, 0F);
//        })
        .withCompatibleAttachment(Attachments.MakarovPBBody, (model) -> {
            if(model instanceof MakarovPBBody) {
            	GL11.glScaled(1F, 1F, 1F);
            } 
            else if(model instanceof makarovfrontsight) {
        	  GL11.glTranslatef(-0.1393F, -1.09F, -1.75F);
              GL11.glScaled(0.15F, 0.25F, 0.2F);
          } 
        })
        .withCompatibleAttachment(Attachments.MakarovBody, true, (model) -> {
//          GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//          GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.MakarovSlide, true, (model) -> {
        	if(model instanceof MakarovPMSlide) {
                GL11.glScaled(1F, 1F, 1F);
            }
            else if(model instanceof makarovrearsight) {
                GL11.glTranslatef(-0.149F, -1.07F, -0.13F);
                GL11.glScaled(0.25F, 0.25F, 0.3F);
            }
            else if(model instanceof makarovfrontsight) {
                GL11.glTranslatef(-0.1393F, -1.06F, -1.7F);
                GL11.glScaled(0.15F, 0.25F, 0.2F);
            }
        })
        .withCompatibleAttachment(Attachments.MakarovPBSlide, (model) -> {
        	if(model instanceof MakarovPMSlide) {
                GL11.glScaled(1F, 1F, 1F);
            }
            else if(model instanceof makarovrearsight) {
                GL11.glTranslatef(-0.149F, -1.09F, -0.13F);
                GL11.glScaled(0.25F, 0.25F, 0.3F);
            }
        })
        .withCompatibleAttachment(Magazines.MakarovMag, (model) -> {
//            GL11.glRotatef(-5F, 1f, 0f, 0f);
            GL11.glTranslatef(0F, 0F, 0.1F);
        })
        .withCompatibleAttachment(Attachments.SilencerPBS, (model) -> {
//            GL11.glTranslatef(-0.23F, -1.14F, -4.92F);
//            GL11.glScaled(1.5F, 1.5F, 1.5F);
        })
        .withTextureNames("makarovpm")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new Glock18C())
            .withActionPiece(
            		Attachments.MakarovSlide)
            .withActionTransform(new Transform().withPosition(0, 0, 0.5))
            //.withTextureName("M9")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-0.945000f, 4.065000f, -7.845000f)
					.withRotation(0.000000f, 1.000000f, 10.681469f)
					.withRotationPoint(-0.12000000357627871, -0.36000001072883614, 0.040000001192092904)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.370000f, 1.025000f, 2.140000f)
                        .withBBRotation(-12.9672, -29.0825, 67.8433)
                        .withScale(3, 3, 4)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.320000f, 0.260000f, 1.920000f)
                        .withBBRotation(10.0931, 10.9576, -10.0294)
                        .withScale(3, 3, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("makarovpm", Attachments.MakarovSlide)
                .setupModernMagazineAnimations("makarovpm", 
                		Magazines.MakarovMag)
                
            .withFirstPersonCustomPositioning(Attachments.MakarovSlide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.4F);
                }
            })
                
            .withFirstPersonCustomPositioning(Attachments.MakarovPBSlide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.4F);
                }
            })
                    
            .withThirdPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 10),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 270, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 70, 50)
                )
                    
            .withThirdPersonCustomPositioningReloading(Attachments.MakarovSlide.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0F);
                    }, 250, 1000)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.14f, 0.56f, -2f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MakarovPBSlide)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.02f, 0f);
                } 
                
                // Everything else
                else {
                }
            
                })
            
            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-0.945000f, 3.625000f, -7.165000f)
				 .withRotation(-4.041486f, -30.854630f, -19.420376f)
				 .withRotationPoint(-0.120000f, -0.360000f, 0.040000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-0.945000f, 3.625000f, -7.885000f)
				 .withRotation(-4.041486f, -45.595835f, -21.768277f)
				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
			 })
        
			 .withFirstPersonHandPositioningModifying(
                 (renderContext) -> {
                	 new Transform()
                	 .withPosition(2.770000f, 1.225000f, 0.140000f)
                	 .withRotation(73.670132f, -70.659155f, 41.991085f)
                     .withScale(2.6, 2.6, 4.0)
                     .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                     .doGLDirect();
                 }, 
                 (renderContext) -> {
                	 new Transform()
                	 .withPosition(-0.320000f, 0.140000f, 2.040000f)
                     .withBBRotation(10.0931, 10.9576, -10.0294)
                     .withScale(3, 3, 3.5)
                     .withRotationPoint(0, 0, 0)
                     .doGLDirect();
                 })
                 
        .withFirstPersonHandPositioningModifyingAlt(
        		(renderContext) -> {
               	 new Transform()
	                   	 .withPosition(2.770000f, 1.225000f, 0.140000f)
	                   	 .withRotation(73.670132f, -70.659155f, 41.991085f)
                    .withScale(2.6, 2.6, 4.0)
                    .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                    .doGLDirect();
                }, 
                (renderContext) -> {
               	 new Transform()
               	 .withPosition(-0.320000f, 0.140000f, 2.040000f)
                    .withBBRotation(10.0931, 10.9576, -10.0294)
                    .withScale(3, 3, 3.5)
                    .withRotationPoint(0, 0, 0)
                    .doGLDirect();
                })
                   
           .withThirdPersonLeftHandPositioningReloading(
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                   }, 330, 200),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                   }, 50, 200),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                   }, 250, 0),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                   }, 250, 0),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                   }, 50, 200),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                   }, 50, 200),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                   }, 250, 0),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-48.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(43.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                   }, 250, 0))
                   
           .withThirdPersonRightHandPositioningReloading(
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 1000),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 50),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 0),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-66.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 0),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 1000),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 50),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 0),
                   
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-57.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 0))
                         
           .build())
        .withSpawnEntityDamage(4.5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(MWC.modContext);
    }
}
