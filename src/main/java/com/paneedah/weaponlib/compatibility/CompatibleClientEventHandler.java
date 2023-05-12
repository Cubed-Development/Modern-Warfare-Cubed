package com.paneedah.weaponlib.compatibility;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.ClientValueRepo;
import com.paneedah.weaponlib.animation.gui.AnimationGUI;
import com.paneedah.weaponlib.command.DebugCommand;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.particle.ParticleBlood;
import com.paneedah.weaponlib.render.HDRFramebuffer;
import com.paneedah.weaponlib.render.VMWFrameTimer;
import com.paneedah.weaponlib.render.bgl.PostProcessPipeline;
import com.paneedah.weaponlib.render.shells.ShellManager;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.collisions.OreintedBB;
import com.paneedah.weaponlib.vehicle.network.VehicleInteractPacket;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.GuiScreenEvent.KeyboardInputEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import static com.paneedah.mwc.proxies.ClientProxy.mc;


/**
 * Handles the client events, and apparently was my testing playground?
 * 
 * @author Victor Matskiv Sr. & Homer Riva-Cambrin
 * @since October 23rd, 2022 [Homer Riva-Cambrin]
 * - Cleaned up my absolute mess
 * - Stopped an entire rope simulation from being run every tick
 */
public abstract class CompatibleClientEventHandler {

	private Entity origRenderVeiwEntity;

	public static boolean freecamEnabled = false;
	public static boolean freecamLock = false;
	public static boolean muzzlePositioner = false;
	
	
	public static boolean cancelSway = false;

	public static double freeYaw = 0;
	public static double freePitch = 0;

	public static double yawDelta = 0;
	public static double pitchDelta = 0;

	// Field that allows us to reset the mouse wheel
	// rotation for the debug animation editor.
	private static Field EVENT_DWHEEL_FIELD = null;


	// Render Managers
	public static final ShellManager SHELL_MANAGER = new ShellManager();
	public static final BulletHoleRenderer BULLET_HOLE_RENDERER = new BulletHoleRenderer();


	public static HashMap<Integer, Stack<Long>> muzzleFlashMap = new HashMap<>();
	public static Vec3d debugmuzzlePosition = new Vec3d(0, -1, -6.5);
	public static Vec3d magRotPositioner = Vec3d.ZERO;
	public static Stack<MuzzleFlash> muzzleFlashStack = new Stack<>();
	public static ResourceLocation FLASH = new ResourceLocation(ModReference.id + ":textures/flashes/flash1.png");
	public static ResourceLocation FLASHF = new ResourceLocation(ModReference.id + ":textures/flashes/flashfront2.png");


	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public final void updateFOV(FOVUpdateEvent e) {

		EntityPlayer player = mc.player;
		if (player == null || !player.isRiding() || !(player.getRidingEntity() instanceof EntityVehicle))
			return;
		EntityVehicle vehicle = (EntityVehicle) player.getRidingEntity();

		double fA = (vehicle.getSolver().getSyntheticAcceleration() / 55 + (vehicle.getRealSpeed() / 120)) * 0.2;

		
		e.setNewfov((float) (e.getFov() + fA));

	}
	
	
	@SubscribeEvent
	public void livingHurtEvent(LivingHurtEvent event) {
		
	}
	

	@SubscribeEvent
	public void keyInputEvent(KeyboardInputEvent kie) {
		// This is used to unlock and lock freecam.
		if (Keyboard.isKeyDown(KeyBindings.freecamLock.getKeyCode()))
			freecamLock = !freecamLock;
		
	}

	@SubscribeEvent
	public final void properCameraSetup(EntityViewRenderEvent.CameraSetup e) {
		if (freecamEnabled) {
			if (Keyboard.isKeyDown(KeyBindings.freecamRotate.getKeyCode()) && freecamEnabled) {
				// Rotates the freecam if the key is down
				freeYaw += yawDelta;
				freePitch += pitchDelta;
			} else if (!freecamLock) {
				// When the player releases the key, snap back
				freeYaw = 0;
				freePitch = 0;
			}

			e.setYaw((float) (freeYaw));
			e.setPitch((float) (freePitch));
		}

		// Reset the deltas
		yawDelta = 0;
		pitchDelta = 0;
	}

	
	
	public static boolean checkShot(int entityID) {
		if (muzzleFlashMap.isEmpty() || !muzzleFlashMap.containsKey(entityID)
				|| (muzzleFlashMap.get(entityID).isEmpty())) {
			return false;
		} else {
			if (System.currentTimeMillis() - muzzleFlashMap.get(entityID).peek() > 25) {
				muzzleFlashMap.get(entityID).pop();
			}
			return true;
		}
	}

	public static void uploadFlash(int entityID) {
		if (muzzleFlashMap.containsKey(entityID)) {
			muzzleFlashMap.get(entityID).push(System.currentTimeMillis());
		} else {
			Stack<Long> stack = new Stack<>();
			stack.push(System.currentTimeMillis());
			muzzleFlashMap.put(entityID, stack);
		}

	}

	
	public static class MuzzleFlash {
		public Vec3d pos;
		public float yaw;
		public Vec3d thirdPersonPos;
		public float pitch;
		public double scale;

		public MuzzleFlash(Vec3d pos, Vec3d thirdPersonPos, float yaw, float pitch, double scale) {
			this.pos = pos;
			this.thirdPersonPos = thirdPersonPos;
			this.yaw = yaw;
			this.pitch = pitch;
			this.scale = scale;

		}
	}

	@SubscribeEvent
	public void mouseMove(MouseEvent me) {

		if (AnimationModeProcessor.getInstance().getFPSMode()) {
			AnimationModeProcessor amp = AnimationModeProcessor.getInstance();

			// Use the scroll wheel to zoom in and out the camera
			double pan = Math.max(0.01, Math.abs(amp.pan.z) / 10000f);
			amp.pan = amp.pan.add(0, 0, (me.getDwheel()) * pan);

			if (EVENT_DWHEEL_FIELD == null) {
				// Usually we would include the MCP mapping, however this tool is
				// only ever meant to be used in the debug environment.
				EVENT_DWHEEL_FIELD = ReflectionHelper.findField(Mouse.class, "event_dwheel");
			}

			try {
				EVENT_DWHEEL_FIELD.set(null, 0);
			} catch (Exception e) {
				System.err.println("Could not assign value to EVENT_DWHEEL_FIELD!");
				e.printStackTrace();
			}
		}

	}





	/**
	 * Gets interpolated player coordinates using the current partial render tick
	 * value.
	 * 
	 * @return intepolated player coordinates
	 */
	public static Vec3d getInterpolatedPlayerCoords() {
		EntityPlayer p = mc.player;
		float mu = mc.getRenderPartialTicks();
		double interpolatedX = (p.posX - p.prevPosX) * mu + p.prevPosX;
		double interpolatedY = (p.posY - p.prevPosY) * mu + p.prevPosY;
		double interpolatedZ = (p.posZ - p.prevPosZ) * mu + p.prevPosZ;
		return new Vec3d(interpolatedX, interpolatedY, interpolatedZ);
	}

	public VMWFrameTimer frametimer = new VMWFrameTimer();

	@SubscribeEvent
	public void connectedToServerEvent(FMLNetworkEvent.ClientConnectedToServerEvent evt) {
		mc.addScheduledTask(() -> {

			if (evt.isLocal()) {

			}

		});
	}

	@SubscribeEvent
	public void renderWorrldLastEvent(RenderWorldLastEvent evt) {

		if (ModernConfigManager.enableAllShaders && ModernConfigManager.enableWorldShaders) {
			// Fills the model view matrix & projection matrix. Only used for world
			// rendering.
			PostProcessPipeline.captureMatricesIntoBuffers();
		}

		// Replaces the weather renderer.
		if (!ModernConfigManager.enableFancyRainAndSnow) {
			PostProcessPipeline.setWorldElements();
		}


		// Marks the frametimer
		frametimer.markFrame();

		// Frametimer syncs to 120 TO-DO: Optimize this
		double divisor = 120 / frametimer.getFramerate() * 0.05;
		divisor = Math.min(0.08, divisor);
		Interceptors.nsm.update();

		// wtf is bhr
		BULLET_HOLE_RENDERER.render();

		// What is this and is it necessary
		if (ClientModContext.getContext() != null && ClientModContext.getContext().getMainHeldWeapon() != null) {
			PlayerWeaponInstance pwi = ClientModContext.getContext().getMainHeldWeapon();

			// if(pwi.getState() != WeaponState.READY) System.out.println(pwi.getState());

			// System.out.println(pwi.getState());

			if (pwi.getState() == WeaponState.READY) {
				pwi.setDelayCompoundEnd(true);
				pwi.getWeapon().getRenderer().setShouldDoEmptyVariant(false);
			}

		}

		// Hot swaps the Minecraft framebuffer for an HDR one.

		if (ModernConfigManager.enableHDRFramebuffer) {
			// Check if our
			Framebuffer current = mc.getFramebuffer();

			if (!(current instanceof HDRFramebuffer)) {
				// Create an EXACT match, but in the HDR format. This will break w/ other mods
				// that try to do
				// anything similar.
				Framebuffer newFBO = new HDRFramebuffer(current.framebufferWidth, current.framebufferHeight, current.useDepth);

				mc.framebuffer = newFBO;
			}
		}

		if (getModContext() != null) {
			if (getModContext().getMainHeldWeapon() != null
					&& getModContext().getMainHeldWeapon().getWeapon().builder.isUsingNewSystem()) {
				AnimationModeProcessor.getInstance().legacyMode = false;
			} else {
				AnimationModeProcessor.getInstance().legacyMode = true;
			}
		}

		RenderingPhase phase = ClientModContext.getContext().getSafeGlobals().renderingPhase.get();

		// System.out.println(GL11.glGetInteger(GL30.GL_FRAMEBUFFER));
		// System.out.println("yo " +
		// ClientModContext.getContext().getSafeGlobals().renderingPhase.get());
		if (phase == RenderingPhase.RENDER_PERSPECTIVE) {

			// PostProcessPipeline.blitDepth();
			return;
		}

		SHELL_MANAGER.render();



		if (AnimationModeProcessor.getInstance().getFPSMode()) {
			mc.setIngameNotInFocus();

			// mc.mouseHelper.ungrabMouseCursor();
			AnimationModeProcessor.getInstance().onTick();

			mc.player.inventory.currentItem = 0;

			return;
		}

		if (ModernConfigManager.enableAllShaders && ModernConfigManager.enableWorldShaders) {
			PostProcessPipeline.blitDepth();

			// PostProcessPipeline.setupDistortionBufferEffects();

			PostProcessPipeline.doWorldProcessing();
		}

	}
	
	



	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public final void onClientTick(TickEvent.ClientTickEvent event) {
		onCompatibleClientTick(event);

		// ModernConfigManager.init();
		
	
		

		EntityPlayer player = mc.player;
		if (player != null && event.phase == Phase.END) {

			double yAmount = ClientValueRepo.recoilWoundY * 0.2;
			player.rotationPitch += yAmount;
			ClientValueRepo.recoilWoundY -= yAmount;

			//TODO: Make a check to see If the ammo in the gun is greater than the max ammo in the magazine.

		}
		
		// Past here we only want to deal with Phase.START.
		// Also we should be in a world.
		if(event.phase != Phase.START || mc.player == null) return;

		// Run recalculations for the weather renderer
		if (ModernConfigManager.enableFancyRainAndSnow && PostProcessPipeline.getWeatherRenderer() != null &&
				PostProcessPipeline.getWeatherRenderer().shouldRecalculateRainVectors(mc.player)) {
			PostProcessPipeline.getWeatherRenderer().recalculateRainVectors(mc.player,
					getInterpolatedPlayerCoords());
		
		}
			

		if (getModContext() != null) {

			ClientValueRepo.update(getModContext());

			if (getModContext().getMainHeldWeapon() != null) {
				CompatibleWeaponRenderer.wrh.STRAFING_ANIMATION.update(0.08f);
				CompatibleWeaponRenderer.wrh.RUNNING_ANIMATION.update(0.08f);
				CompatibleWeaponRenderer.wrh.WALKING_ANIMATION.update(0.08f);
			}

		}

		int ticksRequired = (int) Math.round(AnimationGUI.getInstance().debugFireRate.getValue());


		if (DebugCommand.isWorkingOnScreenShake()
				&& mc.player.ticksExisted % 20 == 0
				&& getModContext().getMainHeldWeapon() != null) {
			
			CompatibleClientEventHandler.uploadFlash(mc.player.getEntityId());
			ClientValueRepo.fireWeapon(getModContext().getMainHeldWeapon());
		}

		if (mc.player.ticksExisted % ticksRequired == 0
				&& AnimationModeProcessor.getInstance().getFPSMode()
				&& !AnimationGUI.getInstance().isPanelClosed("Recoil")) {

			ClientValueRepo.fireWeapon(getModContext().getMainHeldWeapon());
		}

		ClientValueRepo.TICKER.update(mc.player.ticksExisted);

		SHELL_MANAGER.update(0.05);

	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public final void onRenderTickEvent(TickEvent.RenderTickEvent event) {
		onCompatibleRenderTickEvent(event);
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public final void onPreRenderPlayer(RenderPlayerEvent.Pre event) {

		if (event.getEntityPlayer().isRiding() && event.getEntityPlayer().getRidingEntity() instanceof EntityVehicle
				&& event.getEntityPlayer().limbSwing != 39) {
			event.setCanceled(true);
		}

		ClientModContext modContext = (ClientModContext) getModContext();
		if (modContext.getSafeGlobals().renderingPhase.get() == RenderingPhase.RENDER_PERSPECTIVE
				&& event.getEntityPlayer() instanceof EntityPlayerSP) {
			/*
			 * This is a hack to allow player to view him/herself in remote perspective. By
			 * default EntityPlayerSP ("user" playing the game) cannot see himself unless
			 * player == renderViewEntity. So, before rendering EntityPlayerSP, setting
			 * renderViewEntity to player temporarily.
			 */
			origRenderVeiwEntity = event.getRenderer().getRenderManager().renderViewEntity;
			event.getRenderer().getRenderManager().renderViewEntity = event.getEntityPlayer();
		}

		onCompatibleRenderPlayerPreEvent(event);
	}

	protected abstract ModContext getModContext();

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public final void onPostRenderPlayer(RenderPlayerEvent.Post event) {
		ClientModContext modContext = (ClientModContext) getModContext();
		if (modContext.getSafeGlobals().renderingPhase.get() == RenderingPhase.RENDER_PERSPECTIVE
				&& event.getEntityPlayer() instanceof EntityPlayerSP) {
			/*
			 * This is a hack to allow player to view him/herself in remote perspective. By
			 * default EntityPlayerSP ("user" playing the game) cannot see himself unless
			 * player == renderViewEntity. So, before rendering EntityPlayerSP, setting
			 * renderViewEntity to player temporarily. After rendering EntityPlayerSP,
			 * restoring the original renderViewEntity.
			 */
			event.getRenderer().getRenderManager().renderViewEntity = origRenderVeiwEntity;
		}
	}

	@SubscribeEvent
	public void onRightHandEmpty(PlayerInteractEvent.RightClickEmpty evt) {

		ClientModContext context = (ClientModContext) getModContext();
		EntityPlayer player = mc.player;

		List<EntityVehicle> i = player.world.getEntitiesWithinAABB(EntityVehicle.class,
				new AxisAlignedBB(player.getPosition()).grow(10));

		if (i == null || i.isEmpty()) {
			return;
		} else {

			for (EntityVehicle v : i) {

				OreintedBB bb = v.getOreintedBoundingBox();

				// bb.move(v.posX, v.posY, v.posZ);
				Vec3d start = player.getPositionEyes(mc.getRenderPartialTicks());
				Vec3d endVec = start.add(player.getLookVec().scale(7));

				bb.updateInverse();
				RayTraceResult rtr = bb.doRayTrace(start, endVec);
				if (rtr != null) {
					// System.out.println("sending");
					context.getChannel().getChannel()
							.sendToServer(new VehicleInteractPacket(true, v.getEntityId(), player.getEntityId()));
					return;
				}

			}

		}

	}

	@SubscribeEvent
	public void onLeftHandEmpty(PlayerInteractEvent.LeftClickEmpty evt) {

		ClientModContext context = (ClientModContext) getModContext();
		EntityPlayer player = mc.player;

		List<EntityVehicle> i = player.world.getEntitiesWithinAABB(EntityVehicle.class,
				new AxisAlignedBB(player.getPosition()).grow(3));

		if (i == null || i.isEmpty()) {
			return;
		} else {

			for (EntityVehicle v : i) {

				OreintedBB bb = v.getOreintedBoundingBox();

				// bb.move(v.posX, v.posY, v.posZ);
				Vec3d start = player.getPositionEyes(mc.getRenderPartialTicks());
				Vec3d endVec = start.add(player.getLookVec().scale(4));

				// bb.updateInverse();
				RayTraceResult rtr = bb.doRayTrace(start, endVec);

				if (rtr != null) {

					context.getChannel().getChannel()
							.sendToServer(new VehicleInteractPacket(false, v.getEntityId(), player.getEntityId()));

					// v.onKillCommand();
					// v.setDead();
					return;
				}

			}

		}
	}

	public static TextureAtlasSprite carParticles;
	public static TextureAtlasSprite smoke1;

	@SubscribeEvent
	public void onTextureStitchEvent(TextureStitchEvent.Pre event) {
		event.getMap().registerSprite(getModContext().getNamedResource(ParticleBlood.texture));
		carParticles = event.getMap().registerSprite(new ResourceLocation(ModReference.id + ":particle/carparticle"));
		//smoke1 = event.getMap().registerSprite(new ResourceLocation(ModReference.id + ":smokes/smokesheet"));
	}

	protected abstract void onCompatibleRenderTickEvent(TickEvent.RenderTickEvent compatibleRenderTickEvent);

	protected abstract void onCompatibleClientTick(TickEvent.ClientTickEvent compatibleClientTickEvent);

	protected abstract void onCompatibleRenderPlayerPreEvent(RenderPlayerEvent.Pre event);

}
