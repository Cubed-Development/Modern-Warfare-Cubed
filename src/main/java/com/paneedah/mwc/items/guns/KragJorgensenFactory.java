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
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class KragJorgensenFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("Krag_Jorgensen")
//      .QRenderer(CommonProxy.XWPMag)
        .withAmmoCapacity(5)
        .withFireRate(0.16f)
        .withIteratedLoad()
        .withEjectRoundRequired()
        .withEjectSpentRoundSound("krag_boltaction")
        .withRecoil(6f)
        .withZoom(0.8f)
        .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
        .withMaxShots(1)
        .withShootSound("kragjorgensen")
        .withPumpTimeout(950)
        //.withSilencedShootSound("AR15silenced")
        .withReloadSound("krag_chamberopen")
        .withAllReloadIterationsCompletedSound("krag_chamberclosed")
        .withReloadIterationSound("loadbullet")
        .withDrawSound("noaction_draw")
//       .withReloadSound("drawweapon")
//        .withReloadIterationSound("loadshell")
        .withReloadingTime(500)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 1f)
        .withFlashOffsetX(() -> 0.08f)
        .withFlashOffsetY(() -> 0.16f)
        .withShellCasingEjectEnabled(false)
        
        .withScreenShaking(RenderableState.SHOOTING, 
                3f, // x 
                2f, // y
                7f) // z
        
        .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Repeating Bolt-action rifle",
        "Damage: 13.8",
        "Cartridge: 8x58mmR", 
        "Fire Rate: Bolt Action",
        "Rate of Fire: 16/100"))
        .withCompatibleAttachment(AuxiliaryAttachments.KragAction1, true, (model) -> {
            if(model instanceof KragJorgensenAction1) {
//                GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
//                GL11.glRotatef(90f, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.KragAction2, true, (model) -> {
            if(model instanceof KragJorgensenAction2) {
//                GL11.glTranslatef(1F, -0.4F, 0F);
//                GL11.glRotatef(-45F, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.KragChamber, true, (model) -> {
            if(model instanceof KragJorgensenChamber) {
//              GL11.glTranslatef(0.5F, -1F, 0F);
//              GL11.glRotatef(-70F, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Bullet, true, (model) -> {
            if(model instanceof BulletBig) {
                GL11.glScaled(0.4F, 0.4F, 0.6F);
                GL11.glTranslatef(-0.52F, -2.9F, -3.5F);
                GL11.glRotatef(90f, 1f, 0f, 0f);
                
                
//                GL11.glScaled(0.4F, 0.4F, 0.6F);
//                GL11.glTranslatef(-0.95F, -3.1F, -3.5F);
//                GL11.glRotatef(70f, 1f, 0f, 0f);
//                GL11.glRotatef(5f, 0f, 1f, 0f);
            }
        })
        .withCompatibleBullet(Bullets.Bullet8x58, (model) -> {})
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.17F, -1.42F, 0.43F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(-0.11F, -1.29F, -9.7F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.29F, -1.71F, -4.5F);
                GL11.glScaled(0.8F, 0.7F, 1F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, -1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.21F, -1.37F, -10F);
                GL11.glScaled(0.3F, 0.43F, 1.2F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.13F, -1.39F, -9.7F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withTextureNames("KragJorgensen")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new KragJorgensen())
            .withPrepareFirstLoadIterationAnimationDuration(1000)
            .withAllLoadIterationAnimationsCompletedDuration(400)
            //.withTextureName("AWP")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.32F, 0.32F, 0.32F);
                GL11.glTranslatef(1, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(10F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.150000f, 1.000000f, 0.600000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(10F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.150000f, 1.000000f, 1.00000f);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.1f, 0.7f, 0.6f);
                
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
//                GL11.glRotatef(0.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.100000f, 0.900000f, 0.850000f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.12f, 0.7f, 0.8f);
                GL11.glRotatef(1F, 0f, 0f, 1f);
                })
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.KragChamber.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0.5F, -1F, 0F);
                GL11.glRotatef(-70F, 0f, 0f, 1f);
                })
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.Bullet.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-0.5F, 1.5F, -1F);
                GL11.glRotatef(-20f, 1f, 0f, 0f);
                GL11.glRotatef(0f, 0f, 1f, 0f);
                })
                
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
            	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
            	
                GL11.glRotatef(43.3F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(21F, 0f, 0f, 1f);
                GL11.glTranslatef(0.05f, 1f, 1f);
                GL11.glRotatef(-2.8F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningEjectSpentRound(
            		// grabs bolt
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, 1.03f, 0.56f);
                    }, 120, 0),
                    // bolt up
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, 1.050000f, 0.56f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(6.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, 1.050000f, 0.55f);
                    }, 70, 0),
                    // bolt back
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, 1.050000f, 0.7f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, 1.050000f, 0.66f);
                    }, 70, 0),
                    // bolt forward
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(4.700000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, 1.050000f, 0.525000f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, 1.02f, 0.57f);
                    }, 70, 0),
                    // bolt down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, 1.01f, 0.56f);
                    }, 80, 0)
                    
                    )
            
            .withFirstPersonPositioningEjectSpentRoundAimed(
            		// grabs bolt
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, 0.93f, 0.96f);
                    }, 120, 0),
                    // bolt up
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, 0.950000f, 0.96f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(6.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, 0.950000f, 0.95f);
                    }, 70, 0),
                    // bolt back
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, 0.950000f, 1.1f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, 0.950000f, 1.06f);
                    }, 70, 0),
                    // bolt forward
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(4.700000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, 0.950000f, 0.925000f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, 0.92f, 0.97f);
                    }, 70, 0),
                    // bolt down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, 0.91f, 0.96f);
                    }, 80, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.KragAction1.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0)
                    
                    )

            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.KragAction2.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.59F);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.59F);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0)
                    
                    )
                    
//            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.Bullet.getRenderablePart(),
//                    new Transition((renderContext) -> { // Reload position
////                        GL11.glScaled(0.4F, 0.4F, 0.6F);
////                        GL11.glTranslatef(-0.52F, -2.9F, -3.5F);
////                        GL11.glRotatef(90f, 1f, 0f, 0f);
//                    }, 250, 50),
//                    new Transition((renderContext) -> { // Reload position
////                        GL11.glTranslatef(0F, -0.5F, 0F);
////                        GL11.glRotatef(60f, 1f, 0f, 0f);
////                        GL11.glRotatef(45f, 0f, 1f, 0f);
//                    }, 250, 300),
//                    new Transition((renderContext) -> { // Reload position
////                        GL11.glScaled(0.4F, 0.4F, 0.6F);
//                        GL11.glTranslatef(-2F, -1F, -6F);
//                        GL11.glRotatef(60f, 1f, 0f, 0f);
//                        GL11.glRotatef(45f, 0f, 1f, 0f);
//                    }, 250, 0),
//                    new Transition((renderContext) -> { // Reload position
////                        GL11.glScaled(0.4F, 0.4F, 0.6F);
//                        GL11.glTranslatef(-4F, 0F, -6F);
//                        GL11.glRotatef(60f, 1f, 0f, 0f);
//                        GL11.glRotatef(45f, 0f, 1f, 0f);
//                    }, 250, 0),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(-0.52F, 3F, -6F);
//                        GL11.glRotatef(60f, 1f, 0f, 0f);
//                        GL11.glRotatef(45f, 0f, 1f, 0f);
//                    }, 250, 0)
//                    
//                    )
            
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.KragAction1.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0)
                    
                    )

            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.KragAction2.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.59F);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.59F);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0)
                    
                    )
                    
//            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.Bullet.getRenderablePart(),
//                    new Transition((renderContext) -> { // Reload position
////                        GL11.glScaled(0.4F, 0.4F, 0.6F);
////                        GL11.glTranslatef(-0.52F, -2.9F, -3.5F);
////                        GL11.glRotatef(90f, 1f, 0f, 0f);
//                    }, 250, 50),
//                    new Transition((renderContext) -> { // Reload position
////                        GL11.glTranslatef(0F, -0.5F, 0F);
////                        GL11.glRotatef(60f, 1f, 0f, 0f);
////                        GL11.glRotatef(45f, 0f, 1f, 0f);
//                    }, 250, 300),
//                    new Transition((renderContext) -> { // Reload position
////                        GL11.glScaled(0.4F, 0.4F, 0.6F);
//                        GL11.glTranslatef(-2F, -1F, -6F);
//                        GL11.glRotatef(60f, 1f, 0f, 0f);
//                        GL11.glRotatef(45f, 0f, 1f, 0f);
//                    }, 250, 0),
//                    new Transition((renderContext) -> { // Reload position
////                        GL11.glScaled(0.4F, 0.4F, 0.6F);
//                        GL11.glTranslatef(-4F, 0F, -6F);
//                        GL11.glRotatef(60f, 1f, 0f, 0f);
//                        GL11.glRotatef(45f, 0f, 1f, 0f);
//                    }, 250, 0),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(-0.52F, 3F, -6F);
//                        GL11.glRotatef(60f, 1f, 0f, 0f);
//                        GL11.glRotatef(45f, 0f, 1f, 0f);
//                    }, 250, 0)
//                    
//                    )
                    
            .withFirstPersonPositioningReloading(
                    
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
                	
                    GL11.glRotatef(42F, 0f, 1f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(7F, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.05f, 1f, 1f);
                    GL11.glRotatef(-4F, 1f, 0f, 0f);
                }, 150, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
                	
                    GL11.glRotatef(43F, 0f, 1f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(14F, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.05f, 1f, 1f);
                    GL11.glRotatef(-3F, 1f, 0f, 0f);
                }, 130, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
                	
                    GL11.glRotatef(44F, 0f, 1f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(22F, 0f, 0f, 1f);
                    GL11.glTranslatef(0.02f, 1f, 1f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                }, 130, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
                	
                    GL11.glRotatef(42F, 0f, 1f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(20F, 0f, 0f, 1f);
                    GL11.glTranslatef(0.03f, 1f, 1f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                }, 170, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
                	
                    GL11.glRotatef(42.3F, 0f, 1f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(19F, 0f, 0f, 1f);
                    GL11.glTranslatef(0.02f, 1f, 1f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                }, 200, 0),
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
                	
                    GL11.glRotatef(42F, 0f, 1f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(20F, 0f, 0f, 1f);
                    GL11.glTranslatef(0.03f, 1f, 1f);
                    GL11.glRotatef(-3F, 1f, 0f, 0f);
                }, 140, 0)
            )
                
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.KragChamber.getRenderablePart(),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(0.5F, -1F, 0F);
                    GL11.glRotatef(-70F, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(0.5F, -1F, 0F);
                    GL11.glRotatef(-70F, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(0.5F, -1F, 0F);
                    GL11.glRotatef(-70F, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(0.5F, -1F, 0F);
                    GL11.glRotatef(-70F, 0f, 0f, 1f);
                }, 250, 50)
                )
                
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Bullet.getRenderablePart(),
                new Transition((renderContext) -> {
                    
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> {
                    
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50)
                )
                
            .withFirstPersonPositioningLoadIteration(
                    new Transition((renderContext) -> { 
                    	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
                    	
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(20F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.05f, 1f, 1f);
                        GL11.glRotatef(-3F, 1f, 0f, 0f);
                    }, 120, 0),
                    new Transition((renderContext) -> { 
                    	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
                    	
                        GL11.glRotatef(42.5F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(20F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.05f, 1.01f, 1f);
                        GL11.glRotatef(-3F, 1f, 0f, 0f);
                    }, 90, 0),
                    new Transition((renderContext) -> { 
                    	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
                    	
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(20F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.05f, 1.05f, 1f);
                        GL11.glRotatef(-3F, 1f, 0f, 0f);
                    }, 70, 0),
                    new Transition((renderContext) -> { 
                    	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
                    	
                        GL11.glRotatef(42.5F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(21F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.05f, 1.03f, 1f);
                        GL11.glRotatef(-2.5F, 1f, 0f, 0f);
                    }, 80, 0),
                    new Transition((renderContext) -> { 
                    	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
                    	
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(20F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.05f, 1f, 1f);
                        GL11.glRotatef(-3F, 1f, 0f, 0f);
                    }, 110, 0))
                    
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.KragAction1.getRenderablePart(), 
                    new Transition((renderContext) -> { 
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50))
                    
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.KragAction2.getRenderablePart(), 
                    new Transition((renderContext) -> { 
                    }, 250, 50),
                    new Transition((renderContext) -> {
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50))
                    
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.KragChamber.getRenderablePart(), 
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0.5F, -1F, 0F);
                        GL11.glRotatef(-70F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0.5F, -1F, 0F);
                        GL11.glRotatef(-70F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0.5F, -1F, 0F);
                        GL11.glRotatef(-70F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0.5F, -1F, 0F);
                        GL11.glRotatef(-70F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0.5F, -1F, 0F);
                        GL11.glRotatef(-70F, 0f, 0f, 1f);
                    }, 250, 50))
                    
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.Bullet.getRenderablePart(), 
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-0.5F, 1.5F, -1F);
                        GL11.glRotatef(-20f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.5F, 1.5F, -1.8F);
                        GL11.glRotatef(-60f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-0.33F, 0.3F, -0.05F);
                        GL11.glRotatef(0f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.15F, 0.6F, -0.05F);
                        GL11.glRotatef(0f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.15F, 0.6F, -0.05F);
                        GL11.glRotatef(0f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50))
                    
            .withFirstPersonPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { 
                    	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
                    	
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(22F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.03f, 1f, 1f);
                        GL11.glRotatef(-3F, 1f, 0f, 0f);
                    }, 100, 0),
                    new Transition((renderContext) -> { 
                    	GL11.glTranslatef(-0.5f, 0.2f, -0.5f);
                    	
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(20F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.05f, 1f, 1f);
                        GL11.glRotatef(-3F, 1f, 0f, 0f);
                    }, 140, 0))
                    
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.KragChamber.getRenderablePart(), 
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0.5F, -1F, 0F);
                        GL11.glRotatef(-70F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50))
                    
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.Bullet.getRenderablePart(), 
                    new Transition((renderContext) -> { 
//                        GL11.glTranslatef(-0F, 0.5F, 0F);
                        GL11.glRotatef(0f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
//                        GL11.glTranslatef(-0F, 0.5F, 0F);
                        GL11.glRotatef(0f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50))
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.325000f, 0.625000f, 0.375000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                      GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.075000f, 1.2f, 0.6f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0)
            )
                    
//            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.KS23pump.getRenderablePart(),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition((renderContext) -> {
//                        GL11.glTranslatef(0f, 0f, 0.8f);
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                    }, 250, 1000)
//                        )
            
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(18F, 0f, 0f, 1f);
                        GL11.glRotatef(7F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.125000f, 1.25f, 0.750000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(18F, 0f, 0f, 1f);
                        GL11.glRotatef(2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.125000f, 1f, 0.750000f);
                    }, 230, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(15F, 0f, 0f, 1f);
                        GL11.glRotatef(3F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.125000f, 0.875000f, 0.65f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, 0.84f, 0.850000f);
                    }, 250, 0)
                    )
                    
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.39f, 0.86f, 0.400000f);
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Scope");
                }   

                // Everything else
                else {
                }   
            
                })
            
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.39f, 0.9f, 0.8f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Scope");
                }   

                // Everything else
                else {
                }   
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.075000f, 1.224999f, 0.500000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.325000f, 0.625000f, 0.375000f);
             })
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                         
//                         GL11.glScalef(3f, 3f, 3f);
//                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
//                         GL11.glRotatef(30.000000f, 0f, 1f, 0f);
//                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
//                         GL11.glTranslatef(0.000000f, -0.250000f, 0.000000f);
                     })
                     
            .withFirstPersonHandPositioningProning(
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, 0.050000f, 0.175000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                         
//                         GL11.glScalef(3f, 3f, 3f);
//                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
//                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                         GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
//                         GL11.glTranslatef(0.03f, -0.07f, -0.03f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    })
                    
             .withFirstPersonHandPositioningRunning(
                    (renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.075000f, 0.175000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    })
                    
            .withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.025000f, -0.075000f, -0.050000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 250, 1000))
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, 0.100000f, 0.200000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, 0.100000f, 0.050000f);
                    }, 250, 1000))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, 0.100000f, 0.050000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, 0.100000f, 0.200000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.250000f, 0.000000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.250000f, 0.000000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.050000f);
                    }, 250, 1000)
                    
            )
                    
            .withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.125000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.050000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.125000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.050000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonLeftHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, 0.075000f, 0.265000f);
                    }, 250, 50)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.150000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.03f, -0.07f, -0.03f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.03f, -0.07f, -0.03f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.06f, -0.25f, -0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.06f, -0.25f, -0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.125000f, -0.200000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.125000f, -0.200000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.225000f, -0.200000f);
                    }, 250, 1000)
                    )
            
            .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                   }, 250, 50),
                   
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(3.5f, 3.5f, 3.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                   }, 250, 50),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(3.5f, 3.5f, 3.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                   }, 250, 50),
                   
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(3.5f, 3.5f, 3.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                   }, 250, 50),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(3.5f, 3.5f, 3.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                   }, 250, 50),
                   
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(3.5f, 3.5f, 3.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                   }, 250, 50),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(3.5f, 3.5f, 3.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                   }, 250, 50),
                   
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(3.5f, 3.5f, 3.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                   }, 250, 50)
                   
               )
                    
            .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
            		new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.150000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.03f, -0.07f, -0.03f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.03f, -0.07f, -0.03f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.06f, -0.25f, -0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.06f, -0.25f, -0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.125000f, -0.200000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.125000f, -0.200000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.225000f, -0.200000f);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, -0.025000f, -0.025000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.000000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, 0.050000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, 0.050000f, 0.075000f);
                    }, 50, 200))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.225000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.000000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3f, -0.05f, 0.15f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3f, -0.08f, 0.15f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, 0.275000f, 0.225000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    }, 250, 100)
                    )
                    
            .build())
        .withSpawnEntityDamage(13.8f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(MWC.modContext);
    }
}
