package com.paneedah.mwc.asm;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.ClientValueRepo;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.config.ModernConfigManager;
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
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
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
import java.util.Random;

import static com.paneedah.mwc.proxies.ClientProxy.MC;


public class Interceptors {

    public static final int OPTIMIZATION_MODE_MIN = 400;

    public static InertialStabilizer thirdPersonCameraStabilizer = new InertialStabilizer(new Vec3d(1, 1, 1));

    public static float authenticFOV = 0f;

    public static VehicleRFCam firstPersonCamera = new VehicleRFCam();

    public static boolean is3dRenderableItem(Item item) {
        return item instanceof ItemBlock;
    }

    public static NaturalCamera nc = new NaturalCamera();

    public static void setupCameraTransformAfterHurtCameraEffect(float partialTicks) {


        PlayerWeaponInstance weaponInstance = getPlayerWeaponInstance();
        EntityPlayer player = FMLClientHandler.instance().getClientPlayerEntity();


        if (authenticFOV != 0.0f && MC.gameSettings.fovSetting == 80.0f) {
            MC.gameSettings.fovSetting = authenticFOV;
            authenticFOV = 0.0f;
        }


        if (player.isRiding() && player.getRidingEntity() instanceof EntityVehicle && MC.gameSettings.thirdPersonView == 0) {
            EntityVehicle vehicle = (EntityVehicle) player.getRidingEntity();
            // DEBUG //


            if (MC.gameSettings.thirdPersonView == 0) {

                if (MC.gameSettings.fovSetting != 80.0f) {
                    authenticFOV = MC.gameSettings.fovSetting;
                    MC.gameSettings.fovSetting = 80.0f;
                }


                float mu = (float) ((1 - Math.cos(MC.getRenderPartialTicks() * Math.PI)) / 2f);

                /*
                 * BEGIN YAW & PITCH
                 */


                if (vehicle.getRealSpeed() != 0.0 && vehicle.getPassengers().indexOf(player) == 0) {
                    player.rotationYaw = vehicle.rotationYaw;
                    player.prevRotationYaw = vehicle.prevRotationYaw;


                    player.rotationPitch = -vehicle.rotationPitch;
                    player.prevRotationPitch = -vehicle.prevRotationPitch;
                }




                /*
                 * END YAW & PITCH
                 */


                double dist = vehicle.prevRotationPitch + (vehicle.rotationPitch - vehicle.prevRotationPitch) * mu;
                float roll = (vehicle.prevRotationRollH + vehicle.prevRotationRoll) + ((vehicle.rotationRoll + vehicle.rotationRollH) - (vehicle.prevRotationRoll + vehicle.prevRotationRollH)) * mu;


                if (Double.isNaN(dist)) {
                    dist = 0;
                }
                if (Double.isNaN(roll)) {
                    roll = 0;
                }


                GL11.glTranslated(0.0, 0.0, -dist * 0.025);
                //GL11.glTranslated(0.0, Math.abs(0.8*(vehicle.rotationPitch/45)), 0.0);


                GL11.glTranslated(roll * 0.025, 0.0, 0.0);

                GL11.glRotatef(-roll, 0.0f, 0.0f, 1.0f);


                double iSL = QPTI.pti(vehicle.prevSideLean, vehicle.sideLean);

                if (Double.isNaN(iSL)) {
                    iSL = 0.0;
                }
                GL11.glRotated(iSL * 2, 0.0, 0.0, 1.0);

                GL11.glTranslated(iSL / 100, 0, -Math.min(vehicle.getRealSpeed() / 150, 0.6));


                //GL11.glRotated(Math.toDegrees(vehicle.steerangle)/2, 0.0, 0.0, 1.0);

            }

        }


        if (player.isRiding() && player.getRidingEntity() instanceof EntityVehicle && MC.gameSettings.thirdPersonView == 1) {
            EntityVehicle vehicle = (EntityVehicle) player.getRidingEntity();


            Vec3d pV = player.getPositionVector();

            //GL11.glTranslated(0.0, vehicle.getInterpolatedLiftOffset(), 0.0);

            if (!vehicle.getConfiguration().shiftWithRight()) {
                GL11.glTranslated(-0.3, 1.0 /*+ vehicle.getInterpolatedLiftOffset()/2*/, -4.0);

            } else {
                GL11.glTranslated(-0.525, 1.0 /*+ vehicle.getInterpolatedLiftOffset()/2*/, -4.0);

            }

            //GL11.glTranslated(-0.525, 1.0 /*+ vehicle.getInterpolatedLiftOffset()/2*/, -4.0);
            GL11.glTranslated(0.0, 0.5, -2.5);


            double targ = vehicle.rotationYaw;
            double diff = player.rotationYaw - targ;
            if (diff != 0.0) {
                double mod = 0.12 * (Math.min(vehicle.getRealSpeed() / 60.0, 1.0));
                if (vehicle.getRealSpeed() > 5) {


                    if (Math.abs(diff) > 120) {
                        mod = 1;
                    }

                }
                if (player.rotationYaw < targ) {

                    player.rotationYaw -= (float) (diff * mod);
                } else if (player.rotationYaw > targ) {


                    player.rotationYaw -= (float) (diff * mod);
                }
            }


            player.prevRotationYaw = player.rotationYaw;
            //player.prevRotationYaw = vehicle.prevRotationYaw;


            double targ2 = -vehicle.rotationPitch + 15;

            double pitchDiff = player.rotationPitch - targ2;
            if (pitchDiff != 0.0) {
                double mod = 0.12 * (Math.min(vehicle.getRealSpeed() / 60.0, 1.0));
                if (vehicle.getRealSpeed() > 5) {
                    if (Math.abs(diff) > 90) {
                        mod = 1;
                    }
                }
                if (player.rotationPitch < targ2) {
                    player.rotationPitch -= (float) (pitchDiff * mod);
                } else if (player.rotationPitch > targ2) {
                    player.rotationPitch -= (float) (pitchDiff * mod);
                }
            }
            player.prevRotationPitch = player.rotationPitch;


        }


        //GlStateManager.rotate(10f, 0, 1, 0);


        if (weaponInstance != null) {

            //nc.update();
        }

        nsm.applyWorld();


    }

    private static PlayerWeaponInstance getPlayerWeaponInstance() {
        EntityPlayer player = FMLClientHandler.instance().getClientPlayerEntity();
        ItemStack itemStack = player.getHeldItemMainhand();
        PlayerWeaponInstance weaponInstance = null;
        Item item = itemStack.getItem();
        if (item instanceof Weapon) {
            Weapon weapon = (Weapon) item;
            ClientModContext context = (ClientModContext) weapon.getModContext();
            weaponInstance = context.getMainHeldWeapon();
        }
        return weaponInstance;
    }

    public static boolean setupViewBobbing(float partialTicks) {

        if (AnimationModeProcessor.getInstance().getFPSMode()) {
            AnimationModeProcessor.getInstance().applyCameraTransforms();

        }


        if (ClientModContext.getContext() != null && ClientModContext.getContext().getMainHeldWeapon() != null) {
            PlayerWeaponInstance pwi = ClientModContext.getContext().getMainHeldWeapon();


            nc.update();

            //System.out.println(ClientModContext.getContext());
        }


        //GlStateManager.translate(0, ClientValueRepo.rise, 0);

        GlStateManager.rotate((float) ClientValueRepo.jumpingSpring.getLerpedPosition(), 1, 0, 0);
        if (!(MC.getRenderViewEntity() instanceof EntityPlayer)) {
            return true;
        }

        float scalar = 0.0f;

        GlStateManager.rotate(-2f * scalar, 0, 0, 1);

        EntityPlayer entityplayer = (EntityPlayer) MC.getRenderViewEntity();

        //ClientValueRepo.forward += MC.player.moveForward/25f;


        PlayerWeaponInstance pwi = ClientModContext.getContext().getMainHeldWeapon();


        if (pwi == null || !pwi.isAimed()) {


            float sMult = 1.0f;

            float f = entityplayer.distanceWalkedModified - entityplayer.prevDistanceWalkedModified;
            float f1 = -(entityplayer.distanceWalkedModified + f * partialTicks);
            float f2 = entityplayer.prevCameraYaw + (entityplayer.cameraYaw - entityplayer.prevCameraYaw) * partialTicks;
            float f3 = entityplayer.prevCameraPitch + (entityplayer.cameraPitch - entityplayer.prevCameraPitch) * partialTicks;

            float xWiggle = LissajousCurve.getXOffsetOnCurve(3, 1, 2, Math.PI, f1);

            GL11.glTranslatef(MathHelper.sin(f1 * (float) Math.PI * sMult) * f2 * 0.5F, -Math.abs(MathHelper.cos(f1 * (float) Math.PI) * f2) * 0.5f, 0.0F);
            GL11.glRotatef(MathHelper.sin(f1 * (float) Math.PI * sMult) * f2 * 3.0F * sMult, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(Math.abs(MathHelper.cos((f1 * (float) Math.PI - 0.2F) * sMult) * f2) * 5.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(f3 * sMult, 1.0F, 0.0F, 0.0F);

        } else {


            float f = entityplayer.distanceWalkedModified - entityplayer.prevDistanceWalkedModified;
            float f1 = -(entityplayer.distanceWalkedModified + f * partialTicks);
            float f2 = entityplayer.prevCameraYaw + (entityplayer.cameraYaw - entityplayer.prevCameraYaw) * partialTicks;
            float f3 = entityplayer.prevCameraPitch + (entityplayer.cameraPitch - entityplayer.prevCameraPitch) * partialTicks;
            GL11.glTranslatef(MathHelper.sin(f1 * (float) Math.PI) * f2 * 0.2F, -Math.abs(MathHelper.cos(f1 * (float) Math.PI) * f2) * 0.2f, 0.0F);
            GL11.glRotatef(MathHelper.sin(f1 * (float) Math.PI) * f2 * 3.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(Math.abs(MathHelper.cos(f1 * (float) Math.PI - 0.2F) * f2) * 5.0F, 1.0F, 0.0F, 0.0F);

            GL11.glRotatef(f3, 1.0F, 0.0F, 0.0F);


        }


        {
            SpreadableExposure spreadableExposure = CompatibleExposureCapability.getExposure(entityplayer, SpreadableExposure.class);

            if (spreadableExposure != null) {

                float f1 = spreadableExposure.getTotalDose(); // * partialTicks;
                if (f1 > 1f) {
                    f1 = 1f;
                }
                float speed = 0.4f;//

                float f2 = 5f / (f1 * f1 + 5f) - f1 * 0.01F;
                f2 = f2 * f2;
                GL11.glRotatef(((float) spreadableExposure.getTickCount() + partialTicks) * speed, 0.0F, 1.0F, 1.0F);
                GL11.glScalef(1.0F / f2, 1.0F, 1.0F);
                GL11.glRotatef(-((float) spreadableExposure.getTickCount() + partialTicks) * speed, 0.0F, 1.0F, 1.0F);
                spreadableExposure.incrementTickCount();
            }
        }


        if (entityplayer.getRidingEntity() instanceof EntityVehicle) {
            //if(1+1==2) return false;
            EntityVehicle vehicle = (EntityVehicle) entityplayer.getRidingEntity();
            if (vehicle.getControllingPassenger() != entityplayer) {
                return false;
            }
            double lastYawDelta = vehicle.getLastYawDelta();
            double speed = vehicle.getSpeed();


            VehicleSuspensionStrategy suspensionStrategy = vehicle.getSuspensionStrategy();
            //System.out.printf("Rate: %.5f, amp: %.5f\n", suspensionStrategy.getRate(), suspensionStrategy.getAmplitude());
            //Matrix4f transformMatrix = vehicle.getRandomizer().update(suspensionStrategy.getRate(),  suspensionStrategy.getAmplitude());

            // jim hack

            float amplitude = 0.02f;
            float frequency = 15f;

            double hillFrac = (vehicle.getSolver().getVelocityVector().length() * (vehicle.rotationPitch / 2)) / 20;
            amplitude += (float) (Math.abs(hillFrac) / 250);
            frequency += (float) (Math.abs(hillFrac) / 250);


            if (vehicle.getSolver().materialBelow != Material.ROCK) {
                amplitude += 0.1f;
                frequency += 2f;

                amplitude *= (float) (vehicle.getRealSpeed() / 25.0);
                frequency *= (float) (vehicle.getRealSpeed() / 25.0);


            }

            float appliedAmplitude;
            if (MC.gameSettings.thirdPersonView != 0) {
                appliedAmplitude = amplitude;
            } else {
                appliedAmplitude = amplitude / 7.5f;
            }

            if (vehicle.getSolver().velocity.length() > 10) {
                appliedAmplitude += (float) (vehicle.getSolver().getSideSlipAngle() / 45);
            }

            // System.out.println(vehicle.getSolver().getVelocityVector().length());

            if (vehicle.getSolver().getVelocityVector().length() != 0.0) {
                NoiseGeneratorPerlin ngo = new NoiseGeneratorPerlin(new Random(45302), 1);
                double val = ngo.getValue(vehicle.posX, vehicle.posZ) / 25;
                // System.out.println(val);
                appliedAmplitude += (float) val;
                frequency += (float) (val * 2);
            }


            Matrix4f transformMatrix = vehicle.getRandomizer().update(frequency, appliedAmplitude * 0.8f);


        } else {

            RenderVehicle2.captureCameraTransform(null);
        }


        nsm.applyHead();


        if (ModernConfigManager.enableAllShaders && ModernConfigManager.enableScreenShaders) {
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
        if (!(MC.getRenderViewEntity() instanceof EntityPlayer)) {
            return true;
        }


        boolean allowDefaultEffect = false;

        EntityPlayer entitylivingbase = (EntityPlayer) MC.getRenderViewEntity();
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

        if (spreadableExposure != null) {
            GL11.glRotatef(-f * 4.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-f, 0.0F, 0.0F, 1.0F);
        } else {
            GL11.glRotatef(-f * 14.0F, 0.0F, 0.0F, 1.0F);
        }

        GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);


        return allowDefaultEffect;
    }

    public static boolean nauseaCameraEffect(float partialTicks) {

        return false;
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
        List<LayerRenderer<?>> list;

        try {
            list = (List<LayerRenderer<?>>) layerRendererField.get(rlb);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }

        for (LayerRenderer<?> lr : list) {
            if (lr instanceof LayerHeldItem) {

                return (LayerHeldItem) lr;
            }
        }

        // If nothing above works
        return null;

    }


    public static void positionItemSide(RenderLivingBase<?> livingEntityRenderer, EntityLivingBase entity,
                                        ItemStack itemStack, TransformType transformType, EnumHandSide handSide) {


        if (entity instanceof EntityPlayer) {
            ((ModelBiped) livingEntityRenderer.getMainModel()).postRenderArm(0.0625F, handSide);
        } else {

            /*
             * This is a pretty complex fix, essentially this method replaces something that can be
             * overriden in a few small cases, and the fix that was here before was to cast it to a (ModelBiped) and
             * call the postRenderArm method. Unfortunately- the illager does not abide by that fix. To actually fix it,
             * what we do is we find the layerRenderers method from RenderLivingBase, and use it to get the LayerHeldItem
             * which we can then invoke. This fix is complex because this entire method is based around ASM.
             */

            if (!layerRendererHookSetup) {
                checkLayerRenderersHooks();
            }


            if (!sidePositioningMap.containsKey(livingEntityRenderer)) {
                LayerHeldItem lhi = extractLayerHeldItem(livingEntityRenderer);
                if (lhi == null) {
                    ((ModelBiped) livingEntityRenderer.getMainModel()).postRenderArm(0.0625F, handSide);
                }

                sidePositioningMap.put(livingEntityRenderer, lhi);


            }


            if (sidePositioningMap.containsKey(livingEntityRenderer)) {
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

    public static void turn(EntityPlayer player, float yawDelta, float pitchDelta) {
        //if(1+1==2) return;'

        if (ClientModContext.getContext() != null && ClientModContext.getContext().getMainHeldWeapon() != null) {
            PlayerWeaponInstance pwi = ClientModContext.getContext().getMainHeldWeapon();
            if (CustomGui.isInModifyingState(pwi) || CustomGui.isInAltModifyingState(pwi)) {
                yawDelta *= 0.01f;
                pitchDelta *= 0.01f;
            }
        }

        //Animation mdoe on
        if (AnimationModeProcessor.getInstance().getFPSMode() && Mouse.isButtonDown(0)) {
            Mouse.getEventDWheel();
            AnimationModeProcessor amp = AnimationModeProcessor.getInstance();
            amp.rot = amp.rot.add(pitchDelta, yawDelta, 0);
            yawDelta = 0;
            pitchDelta = 0;
        }


        if (ClientValueRepo.recoilWoundY > 0) {
            ClientValueRepo.recoilWoundY -= Math.abs(pitchDelta) * 0.15;
            if (ClientValueRepo.recoilWoundY < 0) {
                ClientValueRepo.recoilWoundY = 0;
            }
        }


        float yawAddition = -yawDelta * 1.5f;
        float pitchAddition = pitchDelta * 2.5f;

        //System.out.println(Math.abs(yawAddition) - Math.abs(previousYawAddition));


        ClientValueRepo.xInertia.velocity += yawAddition;
        ClientValueRepo.yInertia.velocity += pitchAddition;


        //ClientValueRepo.xInertia += yawDelta*0.02;
        //ClientValueRepo.yInertia += pitchDelta*0.04;

        //ClientValueRepo.scopeX += (yawDelta*(0.01));
        //ClientValueRepo.scopeY += pitchDelta*(0.01);


        // Scope sensitivity adjustment
        PlayerWeaponInstance weaponInstance = ClientModContext.getContext().getMainHeldWeapon();
        if (weaponInstance != null && weaponInstance.isAimed() && weaponInstance.getScope() != null && weaponInstance.getScope().isOptical()) {

            //System.out.println(weaponInstance.getZoom());


            double scalar = 0.001 * (1 - weaponInstance.getZoom());

            ClientValueRepo.scopeX.add((yawDelta * (0.001 + scalar)));
            ClientValueRepo.scopeY.add(pitchDelta * (0.001 + scalar));

            if (weaponInstance.getZoom() < 0.2f) {
                yawDelta *= weaponInstance.getZoom() * 3;
                pitchDelta *= weaponInstance.getZoom() * 3;
            }
        } else {
            ClientValueRepo.scopeX.add(yawDelta * (0.005));
            ClientValueRepo.scopeY.add(pitchDelta * (0.005));

        }


        if (Keyboard.isKeyDown(Keyboard.KEY_LCONTROL) && ClientEventHandler.freecamEnabled) {
            ClientEventHandler.yawDelta = yawDelta;
            ClientEventHandler.pitchDelta = pitchDelta;
            return;
        }

        float originalPitch = player.rotationPitch;
        float originalYaw = player.rotationYaw;
        //System.out.println("Yaw delta: " + yawDelta);


        float maxPitch = 90f;
        float maxYawDelta = 40f;

        yawDelta *= 0.15F;


        boolean canChangeRotationYaw = true;
        if (player.getRidingEntity() instanceof EntityVehicle && MC.gameSettings.thirdPersonView == 0) {

            player.rotationYaw = (float) ((double) player.rotationYaw + (double) yawDelta);
            float vehicleRiderYawDelta = (((player.getRidingEntity().rotationYaw - player.rotationYaw + 180f) % 360f + 360f) % 360f - 180f);
            //System.out.println("Proposed delta: " + yawDelta + ", allowed: " + vehicleRiderYawDelta);

            if (vehicleRiderYawDelta > maxYawDelta) {
                player.rotationYaw = player.getRidingEntity().rotationYaw - maxYawDelta;
            } else if (-vehicleRiderYawDelta > maxYawDelta) {
                player.rotationYaw = player.getRidingEntity().rotationYaw + maxYawDelta;
            }

            // player.rotationPitch = -player.getRidingEntity().rotationPitch * 1.3f;

            // extra jim code :)
            //player.rotationPitch = -player.getRidingEntity().rotationPitch;


            // start

            // end


        }
        player.rotationYaw = (float) ((double) player.rotationYaw + (double) yawDelta);
        player.rotationPitch = (float) ((double) player.rotationPitch - (double) pitchDelta * 0.15);
        if (player.rotationPitch < -maxPitch) {
                player.rotationPitch = -maxPitch;
            }
        if (player.rotationPitch > maxPitch) {
                player.rotationPitch = maxPitch;
            }
        player.prevRotationPitch += player.rotationPitch


        player.prevRotationYaw += player.rotationYaw - originalYaw;
    }
}
