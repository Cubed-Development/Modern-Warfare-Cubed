package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.ClientValueRepo;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.inventory.CustomPlayerInventory;
import com.paneedah.weaponlib.numerical.LissajousCurve;
import com.paneedah.weaponlib.render.NewScreenshakingManager;
import com.paneedah.weaponlib.render.bgl.PostProcessPipeline;
import com.paneedah.weaponlib.render.cam.NaturalCamera;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.RenderVehicle2;
import com.paneedah.weaponlib.vehicle.VehicleSuspensionStrategy;
import com.paneedah.weaponlib.vehicle.jimphysics.stability.InertialStabilizer;
import com.paneedah.weaponlib.vehicle.smoothlib.QPTI;
import com.paneedah.weaponlib.vehicle.smoothlib.VehicleRFCam;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static com.paneedah.mwc.proxies.ClientProxy.mc;


public class Interceptors {
	
	public static final int OPTIMIZATION_MODE_MIN = 400;
	
	public static InertialStabilizer thirdPersonCameraStabilizer = new InertialStabilizer(new Vec3d(1,1,1));
	
	public static float authenticFOV = 0f;
	
	public static VehicleRFCam firstPersonCamera = new VehicleRFCam();
    
    public static boolean is3dRenderableItem(Item item) {
        return item instanceof ItemBlock;
    }
    
    public static NaturalCamera nc = new NaturalCamera();

    public static void setupCameraTransformAfterHurtCameraEffect(float partialTicks) {
    	//if(1+1==2) return;
    	
    	//if(true) return;
    	
    	
    	//GlStateManager.rotate((float) -ClientValueRepo.walkingGun.getLerpedPosition()*4, 0, 0, 1);
    	
    	
    	PlayerWeaponInstance weaponInstance = getPlayerWeaponInstance();
        EntityPlayer player = FMLClientHandler.instance().getClientPlayerEntity();
    	
        
        
        	if(authenticFOV != 0.0f && mc.gameSettings.fovSetting == 80.0f) {
        		mc.gameSettings.fovSetting = authenticFOV;
        		authenticFOV = 0.0f;
        	}
        
        	
        
        if(player.isRiding() && player.getRidingEntity() instanceof EntityVehicle && mc.gameSettings.thirdPersonView == 0) {
        	EntityVehicle vehicle = (EntityVehicle) player.getRidingEntity();
        	// DEBUG //
        	//GL11.glRotated(-vehicle.rotationPitch*0.1, 1, 0, 0);
        	//GL11.glRotated(vehicle.sideLean, 0.0, 0.0, 1.0);
        	
        	
        	//mc.setRenderViewEntity(vehicle);
        	
        	
        	
        	if(mc.gameSettings.thirdPersonView == 0) {
        		
        		if(mc.gameSettings.fovSetting != 80.0f) {
        			authenticFOV = mc.gameSettings.fovSetting;
        			mc.gameSettings.fovSetting = 80.0f;
        		}
        		
        		
        		//MatrixHelper.applyMatrix(RenderVehicle2.tm);
        		//vehicle.rotationPitch = 0;
        		float mu = (float) ((1 - Math.cos(mc.getRenderPartialTicks() * Math.PI)) / 2f);
        		
        		/*
        		 * BEGIN YAW & PITCH
        		 */
        		
        		
        		if(vehicle.getRealSpeed() != 0.0 && vehicle.getPassengers().indexOf(player) == 0) {
        			player.rotationYaw = vehicle.rotationYaw;
            		player.prevRotationYaw = vehicle.prevRotationYaw;
            		
            		
            		player.rotationPitch = -vehicle.rotationPitch;
            		player.prevRotationPitch = -vehicle.prevRotationPitch;
        		}
        		
        		
        		
        		
        		/*
        		 * END YAW & PITCH
        		 */
        		
        		
        		
        		//player.rotationYaw = vehicle.rotationYaw;
        		//player.prevRotationYaw = vehicle.prevRotationYaw;
        		
        		
        		//player.rotationPitch = -vehicle.rotationPitch;
        		//player.prevRotationPitch = -vehicle.prevRotationPitch;
        		
        		
        		double dist = vehicle.prevRotationPitch + (vehicle.rotationPitch-vehicle.prevRotationPitch)*mu;
        		float roll = (vehicle.prevRotationRollH+vehicle.prevRotationRoll) + ((vehicle.rotationRoll+vehicle.rotationRollH)-(vehicle.prevRotationRoll+vehicle.prevRotationRollH))*mu;
        		
        		
        		
        		if(Double.isNaN(dist)) dist = 0;
        		if(Double.isNaN(roll)) roll = 0;
        		
        		
        		GL11.glTranslated(0.0, 0.0, -dist*0.025);
        		//GL11.glTranslated(0.0, Math.abs(0.8*(vehicle.rotationPitch/45)), 0.0);

        		
        		GL11.glTranslated(roll*0.025, 0.0, 0.0);
            	
        		GL11.glRotatef(-roll, 0.0f, 0.0f, 1.0f);
        		
        		
        		
        		double iSL = QPTI.pti(vehicle.prevSideLean, vehicle.sideLean);
        		
        		if(Double.isNaN(iSL)) iSL = 0.0;
        		GL11.glRotated(iSL*2, 0.0, 0.0, 1.0);
        		
        		GL11.glTranslated(iSL/100, 0, -Math.min(vehicle.getRealSpeed()/150, 0.6));
        		
        		
        		//GL11.glRotated(Math.toDegrees(vehicle.steerangle)/2, 0.0, 0.0, 1.0);
        		
        		}

        }
        
        
    	if(player.isRiding() && player.getRidingEntity() instanceof EntityVehicle && mc.gameSettings.thirdPersonView == 1) {
    		EntityVehicle vehicle = (EntityVehicle) player.getRidingEntity();
    		
    		/*
    		double cRY = player.rotationYaw-vehicle.rotationYaw;
    		double cPRY = player.rotationYaw-vehicle.rotationYaw;
    		if(cRY > 90) cRY = 0;
    		if(cPRY > 90) cPRY = 0;
    		
    		player.rotationYaw -= cRY*0.005;
    		player.prevRotationYaw -= cPRY*0.005;*/
    		/*
    		player.rotationYaw = vehicle.rotationYaw;
    		player.prevRotationYaw = vehicle.prevRotationYaw;*/
    		
    		
    		//Vec3d vcv = vehicle.getSolver().getVelocityVector().scale(0.1);
    		//GL11.glTranslated(vcv.x, vcv.y, vcv.z);
    		
    		//mc.gameSettings.fovSetting = (float) (70f + ((vehicle.getSolver().currentRPM)/500.0f) + (vehicle.getRealSpeed()/2));
    		Vec3d pV = player.getPositionVector();
    		//GL11.glTranslated(-pV.x, -pV.y, -pV.z);
    		
    		//thirdPersonCameraStabilizer.position = Vec3d.ZERO;
    		/*
    		if(thirdPersonCameraStabilizer.position.length() == 0.0) {
    			thirdPersonCameraStabilizer.setPosition(vehicle.getPositionVector());
    
    		} else {
    			thirdPersonCameraStabilizer.setPositionTarget(vehicle.getPositionVector());
    		}
    		
    		thirdPersonCameraStabilizer.tensor = vehicle.getSolver().getOreintationVector();
    		
    	
    		thirdPersonCameraStabilizer.rotationYaw = vehicle.rotationYaw;
    		thirdPersonCameraStabilizer.updateCameraTransforms();
    		*/
    		
    		//GL11.glTranslated(0.0, vehicle.getInterpolatedLiftOffset(), 0.0);
    		
    		/*
    		if(vehicle.rotationPitch > 5) {
    			Vec3d startLift = InterpolationKit.interpolatedEntityPosition(vehicle);
    			Vec3d endLift = startLift.subtract(new Vec3d(0, 10, 0).rotatePitch((float) Math.toRadians(vehicle.rotationPitch)).rotateYaw((float) Math.toRadians(-vehicle.rotationYaw)));
    			RayTraceResult rtr = vehicle.world.rayTraceBlocks(startLift, endLift, false, true, false);
    			if(rtr != null) {
    				GL11.glTranslated(0.0, rtr.hitVec.subtract(startLift).length(), 0.0);
    			}
    		}*/
    		
    		if(!vehicle.getConfiguration().shiftWithRight() ) {
    			GL11.glTranslated(-0.3, 1.0 /*+ vehicle.getInterpolatedLiftOffset()/2*/, -4.0);
        		
    		} else {
    			GL11.glTranslated(-0.525, 1.0 /*+ vehicle.getInterpolatedLiftOffset()/2*/, -4.0);
        		
    		}
    		
    		//GL11.glTranslated(-0.525, 1.0 /*+ vehicle.getInterpolatedLiftOffset()/2*/, -4.0);
    		GL11.glTranslated(0.0, 0.5, -2.5);
    		
    		
    		
    		
    		/*
    		float muRoll = (float) ((1 - Math.cos(mc.getRenderPartialTicks() * Math.PI)) / 2f);
    		float roll = (vehicle.prevRotationRollH+vehicle.prevRotationRoll) + ((vehicle.rotationRoll+vehicle.rotationRollH)-(vehicle.prevRotationRoll+vehicle.prevRotationRollH))*muRoll;
    		
    		GL11.glRotated(-roll, 0.0, 0.0, 1.0);
    		//System.out.println(vehicle.liftOffset);
    		GL11.glTranslated(-0.525, 1.0 + vehicle.getInterpolatedLiftOffset()/2, -3.0);
    		GL11.glTranslated(0.0, 0.5, -2.5);
    		*/
    	
    		/*
    		vehicle.rotationYaw = 0;
    		vehicle.prevRotationYaw = 0;
    		
    		
    		if(player.rotationYaw == vehicle.rotationYaw) {
    			
    		} else if(player.rotationYaw > vehicle.rotationYaw) {
    			player.rotationYaw += (player.rotationYaw-vehicle.rotationYaw)*0.05;
    		} else if(player.rotationYaw < vehicle.rotationYaw) {
    			player.rotationYaw -= (player.rotationYaw-vehicle.rotationYaw)*0.05;
    		}
    		
    		if(player.prevRotationYaw == vehicle.prevRotationYaw) {
    			
    		} else if(player.prevRotationYaw > vehicle.prevRotationYaw) {
    			player.prevRotationYaw += (player.prevRotationYaw-vehicle.prevRotationYaw)*0.05;
    		} else if(player.prevRotationYaw < vehicle.prevRotationYaw) {
    			player.prevRotationYaw -= (player.prevRotationYaw-vehicle.prevRotationYaw)*0.05;
    		}
    		
    		System.out.println(player.rotationYaw + " | " + player.prevRotationYaw);
    		//sysou
    		*/
    		
    		
    		
    		double targ = vehicle.rotationYaw;
    		double diff = player.rotationYaw - targ;
    		if(diff != 0.0) {
    			double mod = 0.12*(Math.min(vehicle.getRealSpeed()/60.0, 1.0));
    			if(vehicle.getRealSpeed() > 5) {

    				
    				if(Math.abs(diff) > 120) mod = 1;
    				
    			}
    			if(player.rotationYaw < targ) {
    				
    				player.rotationYaw -= diff*mod;
    			} else if(player.rotationYaw > targ) {
    				

    				player.rotationYaw -= diff*mod;
    			}
    		}
    		
    		
    		
    		
    		player.prevRotationYaw = player.rotationYaw;
    		//player.prevRotationYaw = vehicle.prevRotationYaw;
    		
    		
    		double targ2 = -vehicle.rotationPitch + 15;
    		
    		double pitchDiff = player.rotationPitch - targ2;
    		if(pitchDiff != 0.0) {
    			double mod = 0.12*(Math.min(vehicle.getRealSpeed()/60.0, 1.0));
    			if(vehicle.getRealSpeed() > 5) {
    				if(Math.abs(diff) > 90) mod = 1;
    			}
    			if(player.rotationPitch < targ2) {
    				player.rotationPitch -= pitchDiff*mod;
    			} else if(player.rotationPitch > targ2) {
    				player.rotationPitch -= pitchDiff*mod;
    			}
    		}
    		player.prevRotationPitch = player.rotationPitch;
    	
    		
    		//player.rotationPitch = 15;
    		//player.prevRotationPitch = 15;
    		
    		
    	}
    	
        
    	//GlStateManager.rotate(10f, 0, 1, 0);
       
    	
    	if(weaponInstance != null) {
    		if(weaponInstance.getState() != WeaponState.READY) {
    			
    		}
    	
    		//nc.update();
    	}
    	
   	nsm.applyWorld();
    	
    	/*
    	if(weaponInstance != null) {
      		   ClientModContext context = (ClientModContext) weaponInstance.getWeapon().getModContext();
              MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager = weaponInstance.getWeapon().getRenderer().getStateManager(player);
             
              ScreenShakingAnimationManager yawPitchAnimationManager = context.getPlayerRawPitchAnimationManager();
              yawPitchAnimationManager.update(player, weaponInstance, stateManager != null ? stateManager.getLastState() : null);
         }
    		*/
    	
    	
    	
    	
    }
    
    private static PlayerWeaponInstance getPlayerWeaponInstance() {
        EntityPlayer player = FMLClientHandler.instance().getClientPlayerEntity();
        ItemStack itemStack = player.getHeldItemMainhand();
        PlayerWeaponInstance weaponInstance = null;
        if(itemStack != null) {
            Item item = itemStack.getItem();
            if(item != null && item instanceof Weapon) {
                Weapon weapon = (Weapon) item;
                ClientModContext context = (ClientModContext) weapon.getModContext();
                weaponInstance = context.getMainHeldWeapon();
            }
        }
        return weaponInstance;
    }
    
    public static boolean setupViewBobbing(float partialTicks) {
    	
    	/*
    	GlStateManager.translate(2.0, 0.0, 0.0);
    	GlStateManager.rotate(45f, 0, 1, 0);
    	*/
    	if(AnimationModeProcessor.getInstance().getFPSMode()) {
    		AnimationModeProcessor.getInstance().applyCameraTransforms();
        	
    	}
    	
    
    	if(ClientModContext.getContext() != null && ClientModContext.getContext().getMainHeldWeapon() != null) {
    		PlayerWeaponInstance pwi = ClientModContext.getContext().getMainHeldWeapon();
    		
    	
    		
    		nc.update();
    		
    		//System.out.println(ClientModContext.getContext());
    	}
    	
    	
    	//GlStateManager.translate(0, ClientValueRepo.rise, 0);
    	
    	GlStateManager.rotate((float) ClientValueRepo.jumpingSpring.getLerpedPosition(), 1, 0, 0);
        if(!(mc.getRenderViewEntity() instanceof EntityPlayer)) {
            return true;
        }
        
        float scalar = 0.0f;
     
        /*
        if(ClientValueRepo.gunPow > 30) {
        	scalar = (float) (ClientValueRepo.gunPow-30)/50f;
        }
        */
        
        GlStateManager.rotate(-2f*scalar, 0, 0, 1);
       // System.out.println(scalar);
       // GlStateManager.translate(0.0, 0.0, -0.2*scalar);
        
       //GlStateManager.rotate(3f*scalar, 0, 1, 0);
      // GlStateManager.rotate(2f*scalar, 1, 0, 0);
       
        EntityPlayer entityplayer = (EntityPlayer)mc.getRenderViewEntity();

        //ClientValueRepo.forward += mc.player.moveForward/25f;
        
        
        PlayerWeaponInstance pwi = ClientModContext.getContext().getMainHeldWeapon();
        
        
        
      
        
        if(pwi == null || !pwi.isAimed()) {
        	
        	
        	float sMult = 1.0f;
        	float speed = sMult/1.0f;
        	
        	float f =entityplayer.distanceWalkedModified - entityplayer.prevDistanceWalkedModified;
            float f1 = -(entityplayer.distanceWalkedModified + f * partialTicks);
            float f2 = entityplayer.prevCameraYaw + (entityplayer.cameraYaw - entityplayer.prevCameraYaw) * partialTicks;
            float f3 = entityplayer.prevCameraPitch + (entityplayer.cameraPitch - entityplayer.prevCameraPitch) * partialTicks;
            
            float xWiggle = (float) LissajousCurve.getXOffsetOnCurve(3, 1, 2, Math.PI, f1);
            
            GL11.glTranslatef(MathHelper.sin(f1 * (float)Math.PI*speed) * f2 * 0.5F, -Math.abs(MathHelper.cos(f1 * (float)Math.PI) * f2)*0.5f, 0.0F);
            GL11.glRotatef(MathHelper.sin(f1 * (float)Math.PI*speed) * f2 * 3.0F*sMult, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(Math.abs(MathHelper.cos((f1 * (float)Math.PI - 0.2F)*speed) * f2) * 5.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(f3*sMult, 1.0F, 0.0F, 0.0F);
        	
        	/*
            float f =entityplayer.distanceWalkedModified - entityplayer.prevDistanceWalkedModified;
            float f1 = -(entityplayer.distanceWalkedModified + f * partialTicks);
            float f2 = entityplayer.prevCameraYaw + (entityplayer.cameraYaw - entityplayer.prevCameraYaw) * partialTicks;
            float f3 = entityplayer.prevCameraPitch + (entityplayer.cameraPitch - entityplayer.prevCameraPitch) * partialTicks;
            
            float xWiggle = (float) LissajousCurve.getXOffsetOnCurve(3, 1, 2, Math.PI, f1);
            
            GL11.glTranslatef(MathHelper.sin(f1 * (float)Math.PI*speed) * f2 * 0.5F, -Math.abs(MathHelper.cos(f1 * (float)Math.PI) * f2)*0.5f, 0.0F);
            GL11.glRotatef(MathHelper.sin(f1 * (float)Math.PI*speed) * f2 * 3.0F*sMult, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(Math.abs(MathHelper.cos((f1 * (float)Math.PI - 0.2F)*speed) * f2) * 5.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(f3*sMult, 1.0F, 0.0F, 0.0F);
            */
        } else {
        	
        	
        	
        		
        			 float f =entityplayer.distanceWalkedModified - entityplayer.prevDistanceWalkedModified;
                     float f1 = -(entityplayer.distanceWalkedModified + f * partialTicks);
                     float f2 = entityplayer.prevCameraYaw + (entityplayer.cameraYaw - entityplayer.prevCameraYaw) * partialTicks;
                     float f3 = entityplayer.prevCameraPitch + (entityplayer.cameraPitch - entityplayer.prevCameraPitch) * partialTicks;
                     GL11.glTranslatef(MathHelper.sin(f1 * (float)Math.PI) * f2 * 0.2F, -Math.abs(MathHelper.cos(f1 * (float)Math.PI) * f2)*0.2f, 0.0F);
                     GL11.glRotatef(MathHelper.sin(f1 * (float)Math.PI) * f2 * 3.0F, 0.0F, 0.0F, 1.0F);
                     GL11.glRotatef(Math.abs(MathHelper.cos(f1 * (float)Math.PI - 0.2F) * f2) * 5.0F, 1.0F, 0.0F, 0.0F);
                    
                     GL11.glRotatef(f3, 1.0F, 0.0F, 0.0F);
        		
        	
        }
        
        
        {
            SpreadableExposure spreadableExposure = CompatibleExposureCapability.getExposure(entityplayer, SpreadableExposure.class);

            if(spreadableExposure != null) {
                float totalDose = spreadableExposure.getTotalDose();
                
                float f1 = totalDose; // * partialTicks;
                if(f1 > 1f) {
                    f1 = 1f;
                }
                float speed = 0.4f;//

                float f2 = 5f / (f1 * f1 + 5f) - f1 * 0.01F;
                f2 = f2 * f2;
                GL11.glRotatef(((float)spreadableExposure.getTickCount() + partialTicks) * speed, 0.0F, 1.0F, 1.0F);
                GL11.glScalef(1.0F / f2, 1.0F, 1.0F);
                GL11.glRotatef(-((float)spreadableExposure.getTickCount() + partialTicks) * speed, 0.0F, 1.0F, 1.0F);
                spreadableExposure.incrementTickCount();
            }
        }
        
        
        
        if(entityplayer.getRidingEntity() instanceof EntityVehicle) {
        	//if(1+1==2) return false;
            EntityVehicle vehicle = (EntityVehicle) entityplayer.getRidingEntity();
            if(vehicle.getControllingPassenger() != entityplayer) return false;
            double lastYawDelta = vehicle.getLastYawDelta();
            double speed = vehicle.getSpeed();
            
            
            VehicleSuspensionStrategy suspensionStrategy = vehicle.getSuspensionStrategy();
            //System.out.printf("Rate: %.5f, amp: %.5f\n", suspensionStrategy.getRate(), suspensionStrategy.getAmplitude());
            //Matrix4f transformMatrix = vehicle.getRandomizer().update(suspensionStrategy.getRate(),  suspensionStrategy.getAmplitude());
            
            // jim hack
            
            float amplitude = 0.02f;
            float frequency = 15f;
            
            double hillFrac = (vehicle.getSolver().getVelocityVector().length()*(vehicle.rotationPitch/2))/20;
            amplitude += Math.abs(hillFrac)/250;
            frequency += Math.abs(hillFrac)/250;
            
            
            if(vehicle.getSolver().materialBelow != Material.ROCK) {
            	amplitude += 0.1f;
            	frequency += 2f;
    
            	amplitude *= vehicle.getRealSpeed()/25.0;
            	frequency *= vehicle.getRealSpeed()/25.0;
            	
            	
            }
            
            float appliedAmplitude = 0.0f;
            if(mc.gameSettings.thirdPersonView != 0) {
            	appliedAmplitude = amplitude;
            } else appliedAmplitude = amplitude/7.5f;
            
            if(vehicle.getSolver().velocity.length() > 10) {
            	appliedAmplitude += vehicle.getSolver().getSideSlipAngle()/45;
            }
            
           // System.out.println(vehicle.getSolver().getVelocityVector().length());
            
            if(vehicle.getSolver().getVelocityVector().length() != 0.0) {
            	  NoiseGeneratorPerlin ngo = new NoiseGeneratorPerlin(new Random(45302), 1);
                  double val = ngo.getValue(vehicle.posX, vehicle.posZ)/25;
                 // System.out.println(val);
                  appliedAmplitude += val;
                  frequency += val*2;
            }
          
           
            
            Matrix4f transformMatrix = vehicle.getRandomizer().update(frequency,  appliedAmplitude*0.8f);
           //
            
            //RenderVehicle2.captureCameraTransform(transformMatrix);
            //System.out.printf("Yaw delta: %.5f, speed: %.5f\n", lastYawDelta, speed);
            
            
            if(Math.abs(lastYawDelta) > 0.3) {
              //  GL11.glRotatef(-(float)lastYawDelta * 2f, 0.0F, 1.0f, 0.0f);
            }
        } else {
        	
            RenderVehicle2.captureCameraTransform(null);
        }
        
        
        nsm.applyHead();
        //nsm.update();
        
        
      // if(true) return false;
        
       
     
        if(ModernConfigManager.enableAllShaders && ModernConfigManager.enableScreenShaders) {
        	GlStateManager.disableLighting();
    		GlStateManager.disableBlend();
    		
    		//GlStateManager.enableBlend();
    		
    		PostProcessPipeline.doPostProcess();
    		
    		GlStateManager.enableDepth();
        }
		
      //  System.out.println("hi");
        return false;
    }
    
    public static void renderLastEvent() {
    	
    }
    
    public static NewScreenshakingManager nsm = new NewScreenshakingManager();
    
    public static boolean hurtCameraEffect(float partialTicks) {
//	    if(1+1==2) return false;  
        if(!(mc.getRenderViewEntity() instanceof EntityPlayer)) {
            return true;
        }
        
        
        
        boolean allowDefaultEffect = false;

        EntityPlayer entitylivingbase = (EntityPlayer)mc.getRenderViewEntity();
        float f = (float) entitylivingbase.hurtTime - partialTicks;

        if (entitylivingbase.getHealth() <= 0.0F) {
            float f1 = (float) entitylivingbase.deathTime + partialTicks;
            GL11.glRotatef(40.0F - 8000.0F / (f1 + 200.0F), 0.0F, 0.0F, 1.0F);
        }

        if (f < 0.0F) {
            return allowDefaultEffect;
        }

        f = f / (float) entitylivingbase.maxHurtTime;
        f = MathHelper.sin(f * f * f * f * (float) Math.PI);
        float f2 = entitylivingbase.attackedAtYaw;
        GL11.glRotatef(-f2, 0.0F, 1.0F, 0.0F);
        SpreadableExposure spreadableExposure = CompatibleExposureCapability.getExposure(entitylivingbase, SpreadableExposure.class);

        if(spreadableExposure != null) {
            GL11.glRotatef(-f * 4.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-f * 1.0F, 0.0F, 0.0F, 1.0F);
        } else {
            GL11.glRotatef(-f * 14.0F, 0.0F, 0.0F, 1.0F);
        }
        
        GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
        
        

        return allowDefaultEffect;
    }
        
    public static boolean nauseaCameraEffect(float partialTicks) {
        boolean allowDefaultEffect = false;

//        float f1 = mc.thePlayer.prevTimeInPortal + (mc.thePlayer.timeInPortal - mc.thePlayer.prevTimeInPortal) * partialTicks;
//
//        int i = 1;
//
//        float f2 = 5.0F / (f1 * f1 + 5.0F) - f1 * 0.04F;
//        f2 = f2 * f2;
//        GlStateManager.rotate(((float)rendererUpdateCount + partialTicks) * (float)i, 0.0F, 1.0F, 1.0F);
//        GlStateManager.scale(1.0F / f2, 1.0F, 1.0F);
//        GlStateManager.rotate(-((float)rendererUpdateCount + partialTicks) * (float)i, 0.0F, 1.0F, 1.0F);

        //rendererUpdateCount++;
        return allowDefaultEffect;
    }
    

    private static Map<Entity, PlayerRenderer> renderers = new HashMap<>();
    
    public static PlayerRenderer getPlayerRenderer(Entity entity) {
    	
        return renderers.get(entity);
    }
    
    public static void render2(ModelBase modelBase, Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
    	//if(1+1==2) return;
    	
    	
    	
    	if(entityIn instanceof EntityPlayer) {
    		EntityPlayer player = (EntityPlayer) entityIn;
    		if(player.isRiding() && player.getRidingEntity() instanceof EntityVehicle) {
    			double b = ((EntityPlayer) entityIn).limbSwing;
    			if(b != 39.0) return;    			
    		}
    	}
    	
    	
        if(entityIn instanceof EntityPlayer && modelBase instanceof ModelPlayer) {
            
            ModelPlayer modelPlayer = (ModelPlayer) modelBase;
            EntityPlayer player = (EntityPlayer) entityIn;

            PlayerRenderer playerRenderer = renderers.computeIfAbsent(entityIn, 
                    e -> new PlayerRenderer((EntityPlayer) entityIn, ClientModContext.getContext()));
            
            
            playerRenderer.renderModel(modelPlayer, player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            
            
            
            CustomPlayerInventory capability = CompatibleCustomPlayerInventoryCapability.getInventory(player);
            if(capability != null) {
                ItemStack backpackStack = capability.getStackInSlot(0); // TODO: replace 0 with constant for backpack slot 
                if(backpackStack != null) {
                    GL11.glPushMatrix();
                    adjustBodyWearablePosition(player);
                    mc.getItemRenderer().renderItem(player, backpackStack, null);
                    GL11.glPopMatrix();
                }
                ItemStack vestStack = capability.getStackInSlot(1); // TODO: replace 0 with constant for backpack slot 
                if(vestStack != null) {
                    GL11.glPushMatrix();
                    adjustBodyWearablePosition(player);
                    mc.getItemRenderer().renderItem(player, vestStack, null);
                    GL11.glPopMatrix();
                }
            }
        } else {
            modelBase.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
        
        
    }
    
    private static void adjustBodyWearablePosition(EntityPlayer player) {
//        GL11.glScalef(0.8f, 0.8f, 0.8f);
//        GL11.glTranslatef(-0.02f, 0.69f, -0.35f);
//        GL11.glRotatef(180f, 0, 0, 1);
//        if(isProning(player)) {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(-0.02f, -3f, -0.35f);
//            GL11.glRotatef(180f, 0, 0, 1);
//        } else {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(-0.02f, 0.69f, -0.35f);
//            GL11.glRotatef(180f, 0, 0, 1);
//        }
        
    }

    public static void renderArmorLayer(ModelBase modelBase, Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
       
        if(entityIn instanceof EntityPlayer) { 
            PlayerRenderer playerRenderer = renderers.get(entityIn);
            EntityPlayer player = (EntityPlayer) entityIn;
            if(playerRenderer == null || !playerRenderer.renderArmor((ModelBiped) modelBase, player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale)) {
                modelBase.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            }
        } else {
            modelBase.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
    }
    
    public static boolean layerRendererHookSetup = false;
    public static Field layerRendererField;
    public static Method translateItemField;
    public static HashMap<RenderLivingBase<?>, LayerHeldItem> sidePositioningMap = new HashMap<>();
    
    public static void checkLayerRenderersHooks() {
    	layerRendererHookSetup = true;
    	
    	layerRendererField = ReflectionHelper.findField(RenderLivingBase.class, "layerRenderers", "field_177097_h");
    	translateItemField = ReflectionHelper.findMethod(LayerHeldItem.class, "translateToHand", "func_191361_a", EnumHandSide.class);
		 }
    
    @SuppressWarnings("unchecked")
	public static LayerHeldItem extractLayerHeldItem(RenderLivingBase<?> rlb) {
    	List<LayerRenderer<?>> list = null;
    	
    	try {
			list = (List<LayerRenderer<?>>) layerRendererField.get(rlb);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
    	
    	for(LayerRenderer<?> lr : list) {
    		if(lr instanceof LayerHeldItem) {
    		
    			return (LayerHeldItem) lr;
    		}
    	}
    	
    	// If nothing above works
    	return null;
    	
    }
   

    public static void positionItemSide(RenderLivingBase<?> livingEntityRenderer, EntityLivingBase entity,
            ItemStack itemStack, TransformType transformType, EnumHandSide handSide) {
    	
    	
        if(entity instanceof EntityPlayer /* && isProning((EntityPlayer) entity)*/) { 
            PlayerRenderer playerRenderer = renderers.get(entity);
            EntityPlayer player = (EntityPlayer) entity;
            if(playerRenderer == null || !playerRenderer.positionItemSide(player, itemStack, transformType, handSide)) {
                ((ModelBiped)livingEntityRenderer.getMainModel()).postRenderArm(0.0625F, handSide);
            }
        } else {
        	
        	/*
        	 * This is a pretty complex fix, essentially this method replaces something that can be
        	 * overriden in a few small cases, and the fix that was here before was to cast it to a (ModelBiped) and
        	 * call the postRenderArm method. Unfortunately- the illager does not abide by that fix. To actually fix it,
        	 * what we do is we find the layerRenderers method from RenderLivingBase, and use it to get the LayerHeldItem
        	 * which we can then invoke. This fix is complex because this entire method is based around ASM.
        	 */
        	
        	if(!layerRendererHookSetup) {
        		checkLayerRenderersHooks();
        	}
        	
        	
        	if(!sidePositioningMap.containsKey(livingEntityRenderer)) {
        		LayerHeldItem lhi = extractLayerHeldItem(livingEntityRenderer);
        		if(lhi == null) {
        			((ModelBiped) livingEntityRenderer.getMainModel()).postRenderArm(0.0625F, handSide);
        		}
        		
        		sidePositioningMap.put(livingEntityRenderer, lhi);
        		
        		
        		
        	}
        	
        	
        
        	if(sidePositioningMap.containsKey(livingEntityRenderer)) {
        		try {
					translateItemField.invoke(sidePositioningMap.get(livingEntityRenderer), handSide);
				} catch (IllegalAccessException e) {
					((ModelBiped) livingEntityRenderer.getMainModel()).postRenderArm(0.0625F, handSide);
			          
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					((ModelBiped) livingEntityRenderer.getMainModel()).postRenderArm(0.0625F, handSide);
			          
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					((ModelBiped) livingEntityRenderer.getMainModel()).postRenderArm(0.0625F, handSide);
			          
					e.printStackTrace();
				}
        	}
        }
    }
    
    public static boolean isProning(EntityPlayer player) {
        return (CompatibleExtraEntityFlags.getFlags(player) & CompatibleExtraEntityFlags.PRONING) != 0;
    }
    
    public static float adjustCameraPosition(EntityLivingBase player, float position) {
    
        return player instanceof EntityPlayer && isProning((EntityPlayer) player) 
                && mc.gameSettings.thirdPersonView == 0 ? position 
                + player.getEyeHeight() * 1.6f : position;
    }
    

    
    public static void turn(EntityPlayer player, float yawDelta, float pitchDelta) {
    	//if(1+1==2) return;'
    	
    	if(ClientModContext.getContext() != null && ClientModContext.getContext().getMainHeldWeapon() != null) {
    		PlayerWeaponInstance pwi = ClientModContext.getContext().getMainHeldWeapon();
    		if(CustomGui.isInModifyingState(pwi) || CustomGui.isInAltModifyingState(pwi)) {
    			yawDelta *= 0.01f;
    			pitchDelta *= 0.01f;
    		}
    	}
    	
    	//Animation mdoe on
    	if(AnimationModeProcessor.getInstance().getFPSMode() && Mouse.isButtonDown(0)) {
    		Mouse.getEventDWheel();
    		AnimationModeProcessor amp = AnimationModeProcessor.getInstance();
    		amp.rot = amp.rot.add(pitchDelta, yawDelta, 0);
    		yawDelta = 0;
        	pitchDelta = 0;
    	}
    	
    
    	
    	if(ClientValueRepo.recoilWoundY > 0) {
    		ClientValueRepo.recoilWoundY -= Math.abs(pitchDelta) * 0.15;
    		if(ClientValueRepo.recoilWoundY < 0) {
    			ClientValueRepo.recoilWoundY = 0;
    		}
    	}
    	
    //	System.out.println(ClientValueRepo.recoilWoundY);
    //	ClientValueRepo.recoilWoundY -= pitchDelta*0.2;
    	
    	
    	//ClientValueRepo.gunPow.velocity += yawDelta*0.02;
    	
    	//compatibility.addChatMessage(mc.player, "Working " + mc.player.ticksExisted);
    	
    	
    	
    	float yawAddition = -yawDelta * 1.5f;
    	float pitchAddition = pitchDelta * 2.5f;
    	
    	/*
    	if(Math.abs(Math.abs(yawAddition) - Math.abs(previousYawAddition)) > 1.0) yawAddition = (float) InterpolationKit.interpolateValue(previousYawAddition, yawAddition, 0.3f);
    	if(Math.abs(Math.abs(pitchAddition) - Math.abs(previousPitchAddition)) > 1.0) pitchAddition = (float) InterpolationKit.interpolateValue(previousPitchAddition, pitchAddition, 0.3f);
    	*/
    	//System.out.println(Math.abs(yawAddition) - Math.abs(previousYawAddition));
    	
    
    	ClientValueRepo.xInertia.velocity += yawAddition;
    	ClientValueRepo.yInertia.velocity += pitchAddition;
    	
    
    	
    	//ClientValueRepo.xInertia += yawDelta*0.02;
    	//ClientValueRepo.yInertia += pitchDelta*0.04;
    	
    	//ClientValueRepo.scopeX += (yawDelta*(0.01));
    	//ClientValueRepo.scopeY += pitchDelta*(0.01);
    	
    	
    	// Scope sensitivity adjustment
    	PlayerWeaponInstance weaponInstance = ClientModContext.getContext().getMainHeldWeapon();
    	if(weaponInstance != null && weaponInstance.isAimed() && weaponInstance.getScope() != null && weaponInstance.getScope().isOptical()) {
    		
    		//System.out.println(weaponInstance.getZoom());
    		
    		
    		
    		
    		double scalar = 0.001*(1-weaponInstance.getZoom());
    		
    		/*
    		ClientValueRepo.scopeX += (yawDelta*(0.005+scalar));
    		ClientValueRepo.scopeY += pitchDelta*(0.005+scalar);
        	*/
    		
    		ClientValueRepo.scopeX.add((yawDelta*(0.001+scalar)));
    		ClientValueRepo.scopeY.add(pitchDelta*(0.001+scalar));
    		
        	if(weaponInstance.getZoom() < 0.2f) {
    			yawDelta *= weaponInstance.getZoom()*3;
            	pitchDelta *= weaponInstance.getZoom()*3;
    		}
    	} else {
    		/*
    		ClientValueRepo.scopeX += (yawDelta*(0.005));
    		ClientValueRepo.scopeY += pitchDelta*(0.005);
    		*/
    		ClientValueRepo.scopeX.add(yawDelta*(0.005));
    		ClientValueRepo.scopeY.add(pitchDelta*(0.005));
    		
    	}
    	
    	
    	
    	
    	
    	if(Keyboard.isKeyDown(Keyboard.KEY_LCONTROL) && ClientEventHandler.freecamEnabled) {
            ClientEventHandler.yawDelta = yawDelta;
            ClientEventHandler.pitchDelta = pitchDelta;
    		return;
    	}
    	
    	float originalPitch = player.rotationPitch;
        float originalYaw = player.rotationYaw;
        //System.out.println("Yaw delta: " + yawDelta);
        
       
        
        float maxPitch = 90f;
        float maxYawDelta = 40f;
        
        yawDelta *= 0.15;
        
       
       
        boolean canChangeRotationYaw = true;
        if(player.getRidingEntity() instanceof EntityVehicle && mc.gameSettings.thirdPersonView == 0) {
        	
            maxPitch = 90f;
//            EntityVehicle entityVehicle = (EntityVehicle) player.ridingEntity;
////            maxYawDelta = 10f + 200f * (float)entityVehicle.getSpeed();
////            if(maxYawDelta > 35f) {
////                maxYawDelta = 35f;
////            }
////            System.out.println("Speed: " + entityVehicle.getSpeed() + ", maxYawD: " + maxYawDelta);
//            //canChangeRotationYaw = entityVehicle.getState() != VehicleState.STOPPING;
//            float vehicleRiderYawDelta = MathHelper.wrapAngleTo180Float(player.ridingEntity.rotationYaw - player.rotationYaw);
//            if(vehicleRiderYawDelta > maxYawDelta) {
//                vehicleRiderYawDelta = maxYawDelta;
//                yawDelta = 1f;
//            }
            
            player.rotationYaw = (float) ((double) player.rotationYaw + (double) yawDelta);
            float vehicleRiderYawDelta = (((player.getRidingEntity().rotationYaw - player.rotationYaw + 180f) % 360f + 360f) % 360f - 180f);
            //System.out.println("Proposed delta: " + yawDelta + ", allowed: " + vehicleRiderYawDelta);

            if(vehicleRiderYawDelta > maxYawDelta) {
                player.rotationYaw = player.getRidingEntity().rotationYaw - maxYawDelta;
            } 
            else if(-vehicleRiderYawDelta > maxYawDelta) {
                player.rotationYaw = player.getRidingEntity().rotationYaw + maxYawDelta;
            }
            
          // player.rotationPitch = -player.getRidingEntity().rotationPitch * 1.3f;
            
            // extra jim code :)
            //player.rotationPitch = -player.getRidingEntity().rotationPitch;
            
            
            // start
player.rotationYaw = (float) ((double) player.rotationYaw + (double) yawDelta);
            
            player.rotationPitch = (float) ((double) player.rotationPitch - (double) pitchDelta * 0.15);

            if (player.rotationPitch < -maxPitch) {
                player.rotationPitch = -maxPitch;
            }

            if (player.rotationPitch > maxPitch) {
                player.rotationPitch = maxPitch;
            }
            
            player.prevRotationPitch += player.rotationPitch - originalPitch;
            
            // end
            

        } else {
        	
            player.rotationYaw = (float) ((double) player.rotationYaw + (double) yawDelta);
            
            player.rotationPitch = (float) ((double) player.rotationPitch - (double) pitchDelta * 0.15);

            if (player.rotationPitch < -maxPitch) {
                player.rotationPitch = -maxPitch;
            }

            if (player.rotationPitch > maxPitch) {
                player.rotationPitch = maxPitch;
            }
            
            player.prevRotationPitch += player.rotationPitch - originalPitch;
        }
       
       
        player.prevRotationYaw += player.rotationYaw - originalYaw;
    }

    private static double volumeThreshold;
    
    public static void setRenderVolumeThreshold(double d) {
        volumeThreshold = d;
    }
    
    public static boolean shouldRender(List<ModelBox> cubeList) {
        if(volumeThreshold <= 0.1) {
            return true;
        }
        return ((OptimizedCubeList) cubeList).getMaxVol() > volumeThreshold;
    }
}
