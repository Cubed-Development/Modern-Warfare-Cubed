package com.paneedah.mwc.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import com.paneedah.mwc.mixininterfaces.IModernEntityRenderer;
import com.paneedah.weaponlib.ClientModContext;
import com.paneedah.weaponlib.PlayerWeaponInstance;
import com.paneedah.weaponlib.SpreadableExposure;
import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.ClientValueRepo;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.numerical.LissajousCurve;
import com.paneedah.weaponlib.render.bgl.PostProcessPipeline;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.RenderVehicle2;
import com.paneedah.weaponlib.vehicle.VehicleSuspensionStrategy;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

import static com.paneedah.mwc.asm.Interceptors.nc;
import static com.paneedah.mwc.asm.Interceptors.nsm;
import static com.paneedah.mwc.proxies.ClientProxy.MC;

@SideOnly(Side.CLIENT)
@Mixin(EntityRenderer.class)
public final class EntityRendererMixin implements IModernEntityRenderer {

    @Shadow private boolean useShader;
    @Shadow private ShaderGroup shaderGroup;

    @Unique private boolean mwc$prepareTerrain = true;
    @Unique private boolean mwc$renderHand = true;

    /**
     * Prevent everything from disabling the use of shaders allowing for flashbangs to work at all times.
     * <p>
     * TODO(Desoroxxx): We really need something for shaders, 1.12.2 needs it, it would be a godsend.
     */
    @Inject(method = "switchUseShader", at = @At(value = "HEAD"), cancellable = true)
    private void disableSwitchUseShader(CallbackInfo callbackInfo) {
        callbackInfo.cancel();
    }

    @WrapWithCondition(method = "renderWorldPass", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;setupTerrain(Lnet/minecraft/entity/Entity;DLnet/minecraft/client/renderer/culling/ICamera;IZ)V"))
    private boolean checkPrepareTerrain(final RenderGlobal renderGlobal, final Entity entity, final double partialTicks, final ICamera camera, final int frameCount, final boolean playerSpectator) {
        return mwc$prepareTerrain;
    }

    @WrapWithCondition(method = "updateRenderer", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;updateEquippedItem()V"))
    private boolean checkRenderHandToUpdateEquippedItem(final ItemRenderer itemRenderer) {
        return mwc$renderHand;
    }

    @WrapWithCondition(method = "renderHand", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;renderItemInFirstPerson(F)V"))
    private boolean checkRenderHand(final ItemRenderer itemRenderer, final float partialTicks) {
        return mwc$renderHand;
    }

    @Inject(method = "applyBobbing", at = @At(value = "RETURN"))
    public void doALotOfRendering(final float partialTicks, CallbackInfo callbackInfo) {

    	/*
    	GlStateManager.translate(2.0, 0.0, 0.0);
    	GlStateManager.rotate(45f, 0, 1, 0);
    	*/
        if (AnimationModeProcessor.getInstance().getFPSMode())
            AnimationModeProcessor.getInstance().applyCameraTransforms();


        if (ClientModContext.getContext() != null && ClientModContext.getContext().getMainHeldWeapon() != null) {
            PlayerWeaponInstance pwi = ClientModContext.getContext().getMainHeldWeapon();

            nc.update();
        }

        //GlStateManager.translate(0, ClientValueRepo.rise, 0);

        GlStateManager.rotate((float) ClientValueRepo.jumpingSpring.getLerpedPosition(), 1, 0, 0);
        if (!(MC.getRenderViewEntity() instanceof EntityPlayer))
            return;

        float scalar = 0.0f;

//        if(ClientValueRepo.gunPow > 30)
//        	scalar = (float) (ClientValueRepo.gunPow-30)/50f;

        GlStateManager.rotate(-2f * scalar, 0, 0, 1);
        // GlStateManager.translate(0.0, 0.0, -0.2*scalar);

        //GlStateManager.rotate(3f*scalar, 0, 1, 0);
        // GlStateManager.rotate(2f*scalar, 1, 0, 0);

        EntityPlayer entityplayer = (EntityPlayer) MC.getRenderViewEntity();

        //ClientValueRepo.forward += MC.player.moveForward/25f;

        PlayerWeaponInstance pwi = ClientModContext.getContext().getMainHeldWeapon();

        if (pwi == null || !pwi.isAimed()) {
            float sMult = 1.0f;
            float speed = sMult / 1.0f;

            float f = entityplayer.distanceWalkedModified - entityplayer.prevDistanceWalkedModified;
            float f1 = -(entityplayer.distanceWalkedModified + f * partialTicks);
            float f2 = entityplayer.prevCameraYaw + (entityplayer.cameraYaw - entityplayer.prevCameraYaw) * partialTicks;
            float f3 = entityplayer.prevCameraPitch + (entityplayer.cameraPitch - entityplayer.prevCameraPitch) * partialTicks;

            float xWiggle = (float) LissajousCurve.getXOffsetOnCurve(3, 1, 2, Math.PI, f1);

            GL11.glTranslatef(MathHelper.sin(f1 * (float) Math.PI * speed) * f2 * 0.5F, -Math.abs(MathHelper.cos(f1 * (float) Math.PI) * f2) * 0.5f, 0.0F);
            GL11.glRotatef(MathHelper.sin(f1 * (float) Math.PI * speed) * f2 * 3.0F * sMult, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(Math.abs(MathHelper.cos((f1 * (float) Math.PI - 0.2F) * speed) * f2) * 5.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(f3 * sMult, 1.0F, 0.0F, 0.0F);

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
            float f = entityplayer.distanceWalkedModified - entityplayer.prevDistanceWalkedModified;
            float f1 = -(entityplayer.distanceWalkedModified + f * partialTicks);
            float f2 = entityplayer.prevCameraYaw + (entityplayer.cameraYaw - entityplayer.prevCameraYaw) * partialTicks;
            float f3 = entityplayer.prevCameraPitch + (entityplayer.cameraPitch - entityplayer.prevCameraPitch) * partialTicks;

            GL11.glTranslatef(MathHelper.sin(f1 * (float) Math.PI) * f2 * 0.2F, -Math.abs(MathHelper.cos(f1 * (float) Math.PI) * f2) * 0.2f, 0.0F);
            GL11.glRotatef(MathHelper.sin(f1 * (float) Math.PI) * f2 * 3.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(Math.abs(MathHelper.cos(f1 * (float) Math.PI - 0.2F) * f2) * 5.0F, 1.0F, 0.0F, 0.0F);

            GL11.glRotatef(f3, 1.0F, 0.0F, 0.0F);
        }


        SpreadableExposure spreadableExposure = CompatibleExposureCapability.getExposure(entityplayer, SpreadableExposure.class);

        if (spreadableExposure != null) {
            float totalDose = spreadableExposure.getTotalDose();

            float f1 = totalDose; // * partialTicks;
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


        if (entityplayer.getRidingEntity() instanceof EntityVehicle) {
            EntityVehicle vehicle = (EntityVehicle) entityplayer.getRidingEntity();
            if (vehicle.getControllingPassenger() != entityplayer)
                return;

            double lastYawDelta = vehicle.getLastYawDelta();
            double speed = vehicle.getSpeed();

            VehicleSuspensionStrategy suspensionStrategy = vehicle.getSuspensionStrategy();
            //System.out.printf("Rate: %.5f, amp: %.5f\n", suspensionStrategy.getRate(), suspensionStrategy.getAmplitude());
            //Matrix4f transformMatrix = vehicle.getRandomizer().update(suspensionStrategy.getRate(),  suspensionStrategy.getAmplitude());

            // jim hack

            float amplitude = 0.02f;
            float frequency = 15f;

            double hillFrac = (vehicle.getSolver().getVelocityVector().length() * (vehicle.rotationPitch / 2)) / 20;
            amplitude += Math.abs(hillFrac) / 250;
            frequency += Math.abs(hillFrac) / 250;


            if (vehicle.getSolver().materialBelow != Material.ROCK) {
                amplitude += 0.1f;
                frequency += 2f;

                amplitude *= vehicle.getRealSpeed() / 25.0;
                frequency *= vehicle.getRealSpeed() / 25.0;
            }

            float appliedAmplitude = 0.0f;
            if (MC.gameSettings.thirdPersonView != 0) {
                appliedAmplitude = amplitude;
            } else {
                appliedAmplitude = amplitude / 7.5f;
            }

            if (vehicle.getSolver().velocity.length() > 10) {
                appliedAmplitude += vehicle.getSolver().getSideSlipAngle() / 45;
            }

            // System.out.println(vehicle.getSolver().getVelocityVector().length());

            if (vehicle.getSolver().getVelocityVector().length() != 0.0) {
                NoiseGeneratorPerlin ngo = new NoiseGeneratorPerlin(new Random(45302), 1);
                double val = ngo.getValue(vehicle.posX, vehicle.posZ) / 25;
                // System.out.println(val);
                appliedAmplitude += val;
                frequency += val * 2;
            }


            Matrix4f transformMatrix = vehicle.getRandomizer().update(frequency, appliedAmplitude * 0.8f);

            //RenderVehicle2.captureCameraTransform(transformMatrix);
            //System.out.printf("Yaw delta: %.5f, speed: %.5f\n", lastYawDelta, speed);

//            if (Math.abs(lastYawDelta) > 0.3)
                //  GL11.glRotatef(-(float)lastYawDelta * 2f, 0.0F, 1.0f, 0.0f);
        } else {
            RenderVehicle2.captureCameraTransform(null);
        }

        nsm.applyHead();
        //nsm.update();

        if (ModernConfigManager.enableAllShaders && ModernConfigManager.enableScreenShaders) {
            GlStateManager.disableLighting();
            GlStateManager.disableBlend();

            //GlStateManager.enableBlend();
            if (mwc$prepareTerrain)
                PostProcessPipeline.doPostProcess();

            GlStateManager.enableDepth();
        }
    }

    @Override
    public void mwc$setRenderHand(final boolean renderHand) {
        mwc$renderHand = renderHand;
    }

    @Override
    public boolean mwc$getRenderHand() {
        return mwc$renderHand;
    }

    @Override
    public void mwc$setPrepareTerrain(final boolean prepareTerrain) {
        mwc$prepareTerrain = prepareTerrain;
    }

    @Override
    public void mwc$setUseShader(final boolean useShader) {
        this.useShader = useShader;
    }

    @Override
    public void mwc$setShaderGroup(final ShaderGroup shaderGroup) {
        this.shaderGroup = shaderGroup;
    }
}
