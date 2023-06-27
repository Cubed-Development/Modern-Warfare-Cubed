package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.ChiappaRhino;
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

public class ChiappaRhinoFactory implements GunFactory {

    @SuppressWarnings("unchecked")
	public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("chiappa_rhino")
        .withAmmoCapacity(6)
        .withMaxBulletsPerReload(6)
        .withFireRate(0.2f)
        .withRecoil(6f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.REVOLVER)
        .withMaxShots(1)
        .withShootSound("chiapparhino")
        //.withSilencedShootSound("M9silenced")
//        .withIteratedLoad()
        .withReloadSound("revolver_reload")
        .withReloadIterationSound("revolver_insert_bullet")
        .withAllReloadIterationsCompletedSound("revolver_load_complete")
        .withReloadingTime(25)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.15f)
        .withInaccuracy(3)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        
        .withInformationProvider(stack -> Arrays.asList(
                "Type: Revolver",
                "Damage: 5.4",
                "Cartridge: .357 Bullet", 
                "Fire Rate: Semi",
                "Rate of Fire: 20/100"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                4f, // x 
                1.0f, // y
                3.5f) // z
        
        .withCompatibleAttachment(AuxiliaryAttachments.RhinoChamber, true, (model) -> {
//          GL11.glTranslatef(-0.35f, -0.1f, 0f);
//            GL11.glRotatef(25F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.RevolverSpeedLoader, true, (model) -> {
//			GL11.glTranslatef(-0f, -0.1f, 0.7f);
//			GL11.glRotatef(30F, 0f, 1f, 0f);
//            GL11.glRotatef(25F, 0f, 0f, 1f);
//            GL11.glRotatef(-10F, 1f, 0f, 0f);
            })
		.withCompatibleAttachment(AuxiliaryAttachments.RevolverSpeedLoaderBullets, true, (model) -> {
			GL11.glTranslatef(0f, 0f, 0.001f);
			
//			GL11.glTranslatef(-0.35f, -0.1f, 0.4f);
//            GL11.glRotatef(25F, 0f, 0f, 1f);
		})
        .withCompatibleBullet(Bullets.Bullet357, (model) -> {})
        .withTextureNames("chiapparhino")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new ChiappaRhino()) 
            //.withTextureName("XEagle")
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
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-2.6F, -0.2F, 2.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, 1.725000f, -2.599999f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, 1.765000f, -1.7f);
                GL11.glRotatef(-9F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
            	GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.300000f, 1.524999f, -1.549999f);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.RhinoChamber.getRenderablePart(), (renderContext) -> {
//            	GL11.glTranslatef(-0.35f, -0.1f, 0f);
//                GL11.glRotatef(25F, 0f, 0f, 1f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.RevolverSpeedLoader.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                GL11.glRotatef(25F, 0f, 0f, 1f);
                GL11.glRotatef(25F, 0f, 1f, 0f);
                GL11.glRotatef(-15F, 1f, 0f, 0f);
				})
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.RevolverSpeedLoaderBullets.getRenderablePart(), (renderContext) -> {
//            	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
//                GL11.glRotatef(25F, 0f, 0f, 1f);
//                GL11.glRotatef(25F, 0f, 1f, 0f);
//                GL11.glRotatef(-15F, 1f, 0f, 0f);
				})
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.03f, 1.52f, -2.299999f);
                GL11.glRotatef(-8F, 1f, 0f, 0f);
                GL11.glRotatef(-3F, 0f, 0f, 1f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.2f, 0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.2f, 0f);
                } 
                
                // Everything else
                else {
                }

                })
            
            .withFirstPersonPositioningReloading(
            		// left hand grabs chamber
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.485000f, 1.474999f, -2.449999f);
                    }, 190, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.485000f, 1.474999f, -2.449999f);
                    }, 60, 0),
                    
                    // left hand opens chamber
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.465000f, 1.474999f, -2.449999f);
                    }, 160, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(12.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.445000f, 1.474999f, -2.449999f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(9.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(33.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.38f, 1.6f, -2.449999f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(29.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.25f, 1.6f, -2.449999f);
                    }, 100, 0),
                    
                    // gun goes to the side
                        
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                    	GL11.glRotatef(-52.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.299999f, 2.475000f, -1.324999f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                    	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(63.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.299999f, 2.475000f, -1.324999f);
                    }, 50, 0),
                    
                    // shells fall out 
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(64.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(1.299999f, 2.550000f, -0.849999f);
                    }, 110, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(66.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(1.299999f, 2.550000f, -0.879999f);
                    }, 60, 0),
                    
                    // gun goes up
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-50.400000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.500000f, 0f, 0f, 1f);
                        GL11.glTranslatef(1.299999f, 2.455000f, -1.294999f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScaled(2F, 2F, 2F);
                         GL11.glRotatef(-50.400000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(63.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(1.299999f, 2.455000f, -1.274999f);
                    }, 50, 0),
                    
                    // shells fall out 
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(64.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(1.349999f, 2.550000f, -0.725000f);
                    }, 100, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(63.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(1.349999f, 2.550000f, -0.705000f);
                    }, 90, 0),
                    
                    // hand reaches speedloader
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(16.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, 1.850000f, -2.1f);
                    }, 300, 0),
                    
                    // speedloader up
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(8.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, 1.850000f, -2.32f);
                    }, 100, 0),
                    
                    // speedloader touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(6.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, 1.850000f, -2.365f);
                    }, 160, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, 1.850000f, -2.375000f);
                    }, 30, 0),
                    
                    // speedloader inserts
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(7.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.600000f, 0f, 1f, 0f);
                        GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, 1.850000f, -2.5f);
                    }, 130, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(6.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, 1.850000f, -2.43f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(6.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, 1.850000f, -2.47f);
                    }, 95, 0),
                    
                    // speedloader out
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, 1.850000f, -2.2f);
                    }, 150, 0),
                    
                    // speedloader down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(34.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(16.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.600000f, 1.850000f, -2f);
                    }, 180, 0),
                    
                    // gun turns left
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(2F, 2F, 2F);
                    GL11.glRotatef(-11.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(32.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.800000f, 1.849999f, -2f);
                }, 160, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(2F, 2F, 2F);
                    GL11.glRotatef(-11.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(31.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.800000f, 1.849999f, -2f);
                }, 30, 0),
                
                // gun is flicked
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(2F, 2F, 2F);
                    GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.990000f, 1.849999f, -2f);
                }, 110, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(2F, 2F, 2F);
                    GL11.glRotatef(-16.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.990000f, 1.849999f, -2f);
                }, 50, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(2F, 2F, 2F);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-13.500000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.990000f, 1.849999f, -2f);
                }, 70, 0)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.RhinoChamber.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position\
                   	 GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position\
                   	 GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position\
                      	 GL11.glTranslatef(-0.35f, -0.1f, 0f);
                           GL11.glRotatef(25F, 0f, 0f, 1f);
                       }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position\
                      	 GL11.glTranslatef(-0.35f, -0.1f, 0f);
                           GL11.glRotatef(25F, 0f, 0f, 1f);
                       }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position\
                   	 GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50))
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.RevolverSpeedLoader.getRenderablePart(),
            		// left hand grabs chamber
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 190, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 60, 0),
                    
                    // left hand opens chamber
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 160, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 100, 0),
                    
                    // gun goes to the side
                        
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 50, 0),
                    
                    // shells fall out 
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 110, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 60, 0),
                    
                    // gun goes up
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 50, 0),
                    
                    // shells fall out 
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 100, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 1.4f, 1.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 90, 0),
                    
                    // hand reaches speedloader
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.7f, 0.8f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 250, 0),
                    
                    // speedloader up 
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.05f, 0.1f, 0.7f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-6F, 1f, 0f, 0f);
                    }, 250, 0),
                    
                    // speedloader touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 0),
                    
                    // speedloader inserts
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 200),
                    
                    // speedloader out
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0f, -0.1f, 0.7f);
            			GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                    }, 250, 200),
                    
                    // speedloader down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.7f, 0.8f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position\
                    	GL11.glTranslatef(0.1f, 0.7f, 0.8f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position\
                    	GL11.glTranslatef(0.1f, 0.7f, 0.8f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.7f, 0.8f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.7f, 0.8f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.7f, 0.8f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 250, 50))
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.RevolverSpeedLoaderBullets.getRenderablePart(),
            		// left hand grabs chamber
            		
                    new Transition((renderContext) -> { // Reload position
                    }, 190, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 60, 0),
                    
                    // left hand opens chamber
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 160, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 100, 0),
                    
                    // gun goes to the side
                        
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 50, 0),
                    
                    // shells fall out 
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0.1f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 110, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0f, 0.9f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 60, 0),
                    
                    // gun goes up
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0f, 1f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0f, 1.3f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 50, 0),
                    
                    // shells fall out 
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 1.4f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 100, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 1.4f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 90, 0),
                    
                    // hand reaches speedloader
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.7f, 0.8f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 250, 0),
                    
                    // speedloader up 
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.05f, 0.1f, 0.7f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(-6F, 1f, 0f, 0f);
                    }, 250, 0),
                    
                    // speedloader touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0.4f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 0),
                    
                    // speedloader inserts
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 200),
                    
                    // speedloader out
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 200),
                    
                    // speedloader down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position\
           			 GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position\
                   	 GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50))
            
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScaled(3F, 3F, 3F);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.300000f, 1.300000f, -1.250000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScaled(2F, 2F, 2F);
                      GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.2f, 1.5f, -1.3f);
                  }, 350, 600)
                    )
            
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.450000f, 1.725000f, -2.599999f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.450000f, 1.725000f, -2.599999f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.490000f, 1.725000f, -2.599999f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScaled(2F, 2F, 2F);
                         GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.500000f, 1.725000f, -2.599999f);
                    }, 240, 0)
                    )
                    
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.03f, 1.52f, -2.999999f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.2f, 0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.2f, 0f);
                } 
                
                // Everything else
                else {
                }
                
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                GL11.glRotatef(7F, 1f, 0f, 0f);
                GL11.glTranslatef(-0.100000f, 1.725000f, -2.999999f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(3F, 3F, 3F);
                 GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-2.700000f, 1.700000f, -2.350000f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                    	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(-0.250000f, -0.900000f, -0.050000f);
                    	 
//                    	 GL11.glScalef(4f, 4f, 4f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                     GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                     GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(-0.175000f, -0.850000f, -0.050000f);
                    }, 
                    (renderContext) -> {
                     GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                     GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    })
        
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    // speedloader down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.210000f, -1.085000f, -0.140000f);
                    }, 250, 0),
                    
                    // speedloader up
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
	                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(-0.335000f, -0.985000f, -0.175000f);
                    }, 250, 0),
                    
                    // speedloader touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.375000f, -0.815000f, -0.145000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.375000f, -0.815000f, -0.145000f);
                    }, 250, 0),
                    
                    // speedloader inserts
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.245000f, -0.775000f, -0.115000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.245000f, -0.775000f, -0.115000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.245000f, -0.775000f, -0.115000f);
                    }, 250, 0),
                    
                    // speedloader out
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.300000f, -0.915000f, -0.200000f);
                    }, 250, 0),
                    
                    // speedloader down (6 from bottom)
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.210000f, -1.085000f, -0.140000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                   }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                   }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4f, 4f, 4f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                      }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4f, 4f, 4f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                      }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4f, 4f, 4f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                      }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    // 7
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.610000f, -0.580000f, 0.005000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.610000f, -0.580000f, 0.005000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.610000f, -0.580000f, 0.005000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.610000f, -0.580000f, 0.005000f);
                   }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.610000f, -0.580000f, 0.005000f);
                   }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.610000f, -0.580000f, 0.005000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.610000f, -0.580000f, 0.005000f);
                    }, 250, 1000),
                    
                    // 6 from the bottom
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.250000f, -0.900000f, -0.050000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.615000f, -0.550000f, -0.025000f);
                    })
            
            .withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.270000f, -0.820000f, -0.130000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.270000f, -0.820000f, -0.130000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.270000f, -0.820000f, -0.130000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                   	 	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                   	 	GL11.glTranslatef(-0.325000f, -0.725000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.290000f, -0.740000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.270000f, -0.820000f, -0.130000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.270000f, -0.820000f, -0.130000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.775000f, -0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.775000f, -0.075000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.550000f, -0.025000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.550000f, -0.025000f);
                    }, 250, 50))
            
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.250000f, -0.900000f, -0.050000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.250000f, -0.900000f, -0.050000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.250000f, -0.900000f, -0.050000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.250000f, -0.900000f, -0.050000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 100)
                    )
            
            .build())
        .withSpawnEntityDamage(5.4f)
        .withSpawnEntityGravityVelocity(0.016f)
        
         
        .build(MWC.modContext);
    }
}
