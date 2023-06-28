package com.paneedah.weaponlib;

import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.mwc.utils.OptiNotFine;
import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.ClientValueRepo;
import com.paneedah.weaponlib.animation.gui.AnimationGUI;
import com.paneedah.weaponlib.animation.movement.WeaponRotationHandler;
import com.paneedah.weaponlib.command.DebugCommand;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.paneedah.weaponlib.compatibility.Interceptors;
import com.paneedah.weaponlib.compatibility.ModelRegistryServerInterchange;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.particle.ParticleBlood;
import com.paneedah.weaponlib.perspective.Perspective;
import com.paneedah.weaponlib.render.HDRFramebuffer;
import com.paneedah.weaponlib.render.IHasModel;
import com.paneedah.weaponlib.render.VMWFrameTimer;
import com.paneedah.weaponlib.render.bgl.PostProcessPipeline;
import com.paneedah.weaponlib.render.shells.ShellManager;
import com.paneedah.weaponlib.shader.DynamicShaderContext;
import com.paneedah.weaponlib.shader.DynamicShaderGroupManager;
import com.paneedah.weaponlib.shader.DynamicShaderGroupSource;
import com.paneedah.weaponlib.shader.DynamicShaderPhase;
import com.paneedah.weaponlib.tracking.PlayerEntityTracker;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.collisions.OreintedBB;
import com.paneedah.weaponlib.vehicle.network.VehicleInteractPacket;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.LOG;

/**
 * Handles the client events, and apparently was my testing playground?
 *
 * @author Victor Matskiv Sr. & Homer Riva-Cambrin
 * @since October 23rd, 2022 [Homer Riva-Cambrin]
 * - Cleaned up my absolute mess
 * <p>
 * - Stopped an entire rope simulation from being run every tick
 */
// Todo: Cleanup this mess
public class ClientEventHandler {

	public static boolean freecamEnabled = false;
	public static boolean freecamLock = false;
	public static boolean muzzlePositioner = false;

	public static boolean cancelSway = false;

	public static double freeYaw = 0;
	public static double freePitch = 0;

	public static double yawDelta = 0;
	public static double pitchDelta = 0;

	// Render Managers
	public static final ShellManager SHELL_MANAGER = new ShellManager();
	public static final BulletHoleRenderer BULLET_HOLE_RENDERER = new BulletHoleRenderer();

	public static HashMap<Integer, Stack<Long>> muzzleFlashMap = new HashMap<>();
	public static Vec3d debugmuzzlePosition = new Vec3d(0, -1, -6.5);
	public static Vec3d magRotPositioner = Vec3d.ZERO;

	// Field that allows us to reset the mouse wheel rotation for the debug animation editor.
	private static Field EVENT_DWHEEL_FIELD = null;

	private Entity originalRenderViewEntity;

	private static final int DEFAULT_RECONCILE_TIMEOUT_MILLIS = 5000;

    private static final float SLOW_DOWN_WHEN_POISONED_DOSE_THRESHOLD = 0.4f;
	
    private static final UUID SLOW_DOWN_WHILE_ZOOMING_ATTRIBUTE_MODIFIER_UUID = UUID.fromString("8efa8469-0256-4f8e-bdd9-3e7b23970663");
	private static final AttributeModifier SLOW_DOWN_WHILE_ZOOMING_ATTRIBUTE_MODIFIER = (new AttributeModifier(SLOW_DOWN_WHILE_ZOOMING_ATTRIBUTE_MODIFIER_UUID, "Slow Down While Zooming", -0.3, 2)).setSaved(false);
    
	private static final UUID SLOW_DOWN_WHILE_PRONING_ATTRIBUTE_MODIFIER_UUID = UUID.fromString("a3fa1751-953d-4b6c-955b-6824a193d271");
	private static final AttributeModifier SLOW_DOWN_WHILE_PRONING_ATTRIBUTE_MODIFIER = (new AttributeModifier(SLOW_DOWN_WHILE_PRONING_ATTRIBUTE_MODIFIER_UUID, "Slow Down While Proning", -0.7, 2)).setSaved(false);

	private static final UUID SLOW_DOWN_WHILE_POISONED_ATTRIBUTE_MODIFIER_UUID = UUID.fromString("9d2eac95-9b9c-4942-8287-7952c6de353e");
    private static final AttributeModifier SLOW_DOWN_WHILE_POISONED_ATTRIBUTE_MODIFIER = (new AttributeModifier(SLOW_DOWN_WHILE_POISONED_ATTRIBUTE_MODIFIER_UUID, "Slow Down While Poisoned", -0.7, 2)).setSaved(false);

	public static Stack<MuzzleFlash> muzzleFlashStack = new Stack<>();

	private Lock mainLoopLock = new ReentrantLock();
	private SafeGlobals safeGlobals;

	private ClientModContext modContext;
    private DynamicShaderGroupManager shaderGroupManager;
    private PipelineShaderGroupSourceProvider pipelineShaderGroupSourceProvider = new PipelineShaderGroupSourceProvider();

    private int currentSlotIndex;

	protected ModContext getModContext() {
		return modContext;
	}

	public ClientEventHandler(ClientModContext modContext, Lock mainLoopLock, SafeGlobals safeGlobals
			/*, ReloadAspect reloadAspect*/) {
		this.modContext = modContext;
		this.mainLoopLock = mainLoopLock;
		this.safeGlobals = safeGlobals;
        this.shaderGroupManager = new DynamicShaderGroupManager();
        //this.reloadAspect = reloadAspect;
	}
	
	public static ArrayList<Block> BLANKMAPPED_LIST = new ArrayList<>();
	
	public static ArrayList<IHasModel> ITEM_REG = new ArrayList<>();
	
	
	@SubscribeEvent
	public void onModelRegistry(ModelRegistryEvent e) {
		//System.out.println("HOLA CHINGAS " + BLANKMAPPED_LIST);
		for(Block b : BLANKMAPPED_LIST)
			ModelLoader.setCustomStateMapper(b, BlankStateMapper.DEFAULT);
		
		
		for(IHasModel ima : ITEM_REG) {
			ima.registerModels();
		}
	
		for(Item i : ModelRegistryServerInterchange.ITEM_MODEL_REG)
			ModelLoader.setCustomModelResourceLocation(i, 0, new ModelResourceLocation(i.getRegistryName(), "inventory"));
		
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public final void onTick(TickEvent.ClientTickEvent clientTickEvent) {
		if (clientTickEvent.phase == TickEvent.ClientTickEvent.Phase.START) {
			mainLoopLock.lock();
			updateOnStartTick();
		} else if (clientTickEvent.phase == TickEvent.ClientTickEvent.Phase.END) {
			update();
			modContext.getSyncManager().run();

			PlayerEntityTracker tracker = PlayerEntityTracker.getTracker(mc.player);
			if(tracker != null)
			    tracker.update();
			
			EntityPlayer player = mc.player;
	        if (player instanceof EntityPlayerSP && player.getRidingEntity() instanceof EntityVehicle) {
	            EntityPlayerSP clientPlayer = (EntityPlayerSP) player;
	            
	            EntityVehicle entityBoat = (EntityVehicle) clientPlayer.getRidingEntity();
	            entityBoat.updateInputs(clientPlayer.movementInput.leftKeyDown, clientPlayer.movementInput.rightKeyDown, clientPlayer.movementInput.forwardKeyDown, clientPlayer.movementInput.backKeyDown);
	        }
	        
			mainLoopLock.unlock();
			safeGlobals.objectMouseOver.set(mc.objectMouseOver);
			if(mc.player != null) {
				safeGlobals.currentItemIndex.set(mc.player.inventory.currentItem);
				//reloadAspect.updateMainHeldItem(mc.player);
			}
		}

		// ModernConfigManager.init();

		EntityPlayer player = mc.player;

		if (player != null && clientTickEvent.phase == TickEvent.Phase.END) {

			double yAmount = ClientValueRepo.recoilWoundY * 0.2;
			player.rotationPitch += yAmount;
			ClientValueRepo.recoilWoundY -= yAmount;

			//TODO: Make a check to see If the ammo in the gun is greater than the max ammo in the magazine.

		}

		// Past here we only want to deal with Phase.START.
		// Also we should be in a world.
		if(clientTickEvent.phase != TickEvent.Phase.START || mc.player == null) return;

		// Run recalculations for the weather renderer
		if (ModernConfigManager.enableFancyRainAndSnow && PostProcessPipeline.getWeatherRenderer() != null && PostProcessPipeline.getWeatherRenderer().shouldRecalculateRainVectors(mc.player))
			PostProcessPipeline.getWeatherRenderer().recalculateRainVectors(mc.player, MWCUtil.getInterpolatedPlayerPos());


		if (getModContext() != null) {
			ClientValueRepo.update(getModContext());

			if (getModContext().getMainHeldWeapon() != null) {
				WeaponRotationHandler.STRAFING_ANIMATION.update(0.08f);
				WeaponRotationHandler.RUNNING_ANIMATION.update(0.08f);
				WeaponRotationHandler.WALKING_ANIMATION.update(0.08f);
			}
		}

		int ticksRequired = (int) Math.round(AnimationGUI.getInstance().debugFireRate.getValue());

		if (DebugCommand.isWorkingOnScreenShake() && mc.player.ticksExisted % 20 == 0 && getModContext().getMainHeldWeapon() != null) {
			uploadFlash(mc.player.getEntityId());
			ClientValueRepo.fireWeapon(getModContext().getMainHeldWeapon());
		}

		if (mc.player.ticksExisted % ticksRequired == 0 && AnimationModeProcessor.getInstance().getFPSMode() && !AnimationGUI.getInstance().isPanelClosed("Recoil"))
			ClientValueRepo.fireWeapon(getModContext().getMainHeldWeapon());

		ClientValueRepo.TICKER.update(mc.player.ticksExisted);

		SHELL_MANAGER.update(0.05);
	}
	
	private void updateOnStartTick() {
	    EntityPlayer player = mc.player;
	    if(player != null) {
	        int newSlotIndex = player.inventory.currentItem;
	        if(currentSlotIndex != newSlotIndex) {
	            //modContext.getWeaponReloadAspect().updateMainHeldItem(player);
	            currentSlotIndex = newSlotIndex;
//	            System.out.println("Changed active slot to " + newSlotIndex);
	            modContext.getWeaponReloadAspect().drawMainHeldItem(player);
	        }
	    }
	}

    private void update() {
		EntityPlayer player = mc.player;
		modContext.getPlayerItemInstanceRegistry().update(player);
		PlayerWeaponInstance mainHandHeldWeaponInstance = modContext.getMainHeldWeapon();
		if(player != null) {
			
			
		    if(isProning(player)) {
	            slowPlayerDown(player, SLOW_DOWN_WHILE_PRONING_ATTRIBUTE_MODIFIER);
	        } else {
	            restorePlayerSpeed(player, SLOW_DOWN_WHILE_PRONING_ATTRIBUTE_MODIFIER);
	        }
		}
		
		if(mainHandHeldWeaponInstance != null) {
			if(player.isSprinting()) {
				mainHandHeldWeaponInstance.setAimed(false);
			}
			if(mainHandHeldWeaponInstance.isAimed()) {
				slowPlayerDown(player, SLOW_DOWN_WHILE_ZOOMING_ATTRIBUTE_MODIFIER);
			} else {
				restorePlayerSpeed(player, SLOW_DOWN_WHILE_ZOOMING_ATTRIBUTE_MODIFIER);
			}
			
			if(mainHandHeldWeaponInstance != null
			        && mainHandHeldWeaponInstance.getState() == WeaponState.READY
			        && mainHandHeldWeaponInstance.getStateUpdateTimestamp() + DEFAULT_RECONCILE_TIMEOUT_MILLIS < System.currentTimeMillis()
			        && mainHandHeldWeaponInstance.getSyncStartTimestamp() == 0
			        && mainHandHeldWeaponInstance.getUpdateTimestamp() + DEFAULT_RECONCILE_TIMEOUT_MILLIS < System.currentTimeMillis()) {
			    mainHandHeldWeaponInstance.reconcile();
			}
		} else if(player != null){
			restorePlayerSpeed(player, SLOW_DOWN_WHILE_ZOOMING_ATTRIBUTE_MODIFIER);
		}
		
		if(player != null) {
		    //ItemStack helmet = compatibility.getHelmet();
		    
		    SpreadableExposure spreadableExposure = CompatibleExposureCapability.getExposure(mc.player, SpreadableExposure.class);
	        if(spreadableExposure != null && spreadableExposure.getTotalDose() > SLOW_DOWN_WHEN_POISONED_DOSE_THRESHOLD) {
	            slowPlayerDown(player, SLOW_DOWN_WHILE_POISONED_ATTRIBUTE_MODIFIER);
	        } else {
	            restorePlayerSpeed(player, SLOW_DOWN_WHILE_POISONED_ATTRIBUTE_MODIFIER);
	        }
	        
	        LightExposure lightExposure = CompatibleExposureCapability.getExposure(mc.player, LightExposure.class);
	        if(lightExposure != null) {
	            lightExposure.update(mc.player);
	        }
		}
	}
    
    private static boolean isProning(EntityPlayer player) {
        return (CompatibleExtraEntityFlags.getFlags(player) & CompatibleExtraEntityFlags.PRONING) != 0;
    }

	// TODO: create player utils, move this method
	private void restorePlayerSpeed(EntityPlayer entityPlayer, AttributeModifier modifier) {
		if(entityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED)
				.getModifier(modifier.getID()) != null) {
			entityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED)
				.removeModifier(modifier);
		}
	}

	// TODO: create player utils, move this method
	private void slowPlayerDown(EntityPlayer entityPlayer, AttributeModifier modifier) {
		if(entityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED)
				.getModifier(modifier.getID()) == null) {
			entityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED)
				.applyModifier(modifier);
		}
	}

	@SubscribeEvent
	public void onRenderHand(RenderHandEvent event) {
	    Minecraft minecraft = mc;
	    if (minecraft.gameSettings.thirdPersonView == 0 & !OptiNotFine.shadersEnabled()) {
	        PlayerWeaponInstance weaponInstance = modContext.getMainHeldWeapon();

	        DynamicShaderContext shaderContext = new DynamicShaderContext(DynamicShaderPhase.PRE_ITEM_RENDER, null, minecraft.getFramebuffer(), event.getPartialTicks()).withProperty("weaponInstance", weaponInstance);
	    //   shaderGroupManager.applyShader(shaderContext, weaponInstance);
	    }
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
    public final void onRenderTickEvent(TickEvent.RenderTickEvent event) {
		
        Minecraft minecraft = mc;
        DynamicShaderContext shaderContext = new DynamicShaderContext(DynamicShaderPhase.POST_WORLD_RENDER,
                minecraft.entityRenderer,
                minecraft.getFramebuffer(), event.renderTickTime);

        EntityPlayer clientPlayer = mc.player;
        
        if(event.phase == TickEvent.RenderTickEvent.Phase.START ) {
            ClientModContext.currentContext = modContext;
            mainLoopLock.lock();
            if(clientPlayer != null) {
                PlayerItemInstance<?> instance = modContext.getPlayerItemInstanceRegistry()
                        .getMainHandItemInstance(clientPlayer);

                //if(minecraft.gameSettings.thirdPersonView == 0) {
                    DynamicShaderGroupSource source = pipelineShaderGroupSourceProvider.getShaderSource(shaderContext.getPhase());
                    if(source != null) {
                        shaderGroupManager.loadFromSource(shaderContext, source);
//                        shaderGroupManager.removeAllShaders(shaderContext);
                    }
                //}

                if(instance != null) {
                    Perspective<?> view = modContext.getViewManager().getPerspective(instance, true);
                    if(view != null) {
                        view.update(event);
                    }
                }
            }

        } else if(event.phase == TickEvent.RenderTickEvent.Phase.END) {
            safeGlobals.renderingPhase.set(null);
            shaderGroupManager.removeStaleShaders(shaderContext);
            mainLoopLock.unlock();
        }
    }

	public VMWFrameTimer frametimer = new VMWFrameTimer();

	@SubscribeEvent
	public void onRenderWorldLastEvent(RenderWorldLastEvent renderWorldLastEvent) {
		// Fills the model view matrix & projection matrix. Only used for world rendering.
		if (ModernConfigManager.enableAllShaders && ModernConfigManager.enableWorldShaders)
			PostProcessPipeline.captureMatricesIntoBuffers();

		// Replaces the weather renderer.
		if (!ModernConfigManager.enableFancyRainAndSnow)
			PostProcessPipeline.setWorldElements();

		// Marks the frame-timer
		frametimer.markFrame();

		// Todo: Optimize this
		// Frame-timer syncs to 120
		double divisor = 120 / frametimer.getFramerate() * 0.05;
		divisor = Math.min(0.08, divisor);
		Interceptors.nsm.update();

		// wtf is bhr
		BULLET_HOLE_RENDERER.render();

		// What is this and is it necessary
		if (ClientModContext.getContext() != null && ClientModContext.getContext().getMainHeldWeapon() != null) {
			PlayerWeaponInstance pwi = ClientModContext.getContext().getMainHeldWeapon();

			if (pwi.getState() == WeaponState.READY) {
				pwi.setDelayCompoundEnd(true);
				pwi.getWeapon().getRenderer().setShouldDoEmptyVariant(false);
			}
		}

		// Hot swaps the Minecraft frame-buffer for an HDR one.

		if (ModernConfigManager.enableHDRFramebuffer) {
			// Check if our
			Framebuffer current = mc.getFramebuffer();

			if (!(current instanceof HDRFramebuffer)) {
				// Create an EXACT match, but in the HDR format. This will break w/ other mods that try to do anything similar.
				Framebuffer newFBO = new HDRFramebuffer(current.framebufferWidth, current.framebufferHeight, current.useDepth);

				mc.framebuffer = newFBO;
			}
		}

		if (getModContext() != null)
			AnimationModeProcessor.getInstance().legacyMode = getModContext().getMainHeldWeapon() == null || !getModContext().getMainHeldWeapon().getWeapon().builder.isUsingNewSystem();

		RenderingPhase phase = ClientModContext.getContext().getSafeGlobals().renderingPhase.get();

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

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
    protected void onPreRenderPlayerPreEvent(RenderPlayerEvent.Pre preRenderPlayerEvent) {
		if (preRenderPlayerEvent.getEntityPlayer().isRiding() && preRenderPlayerEvent.getEntityPlayer().getRidingEntity() instanceof EntityVehicle && preRenderPlayerEvent.getEntityPlayer().limbSwing != 39)
			preRenderPlayerEvent.setCanceled(true);

		ClientModContext modContext = (ClientModContext) getModContext();

		if (modContext.getSafeGlobals().renderingPhase.get() == RenderingPhase.RENDER_PERSPECTIVE && preRenderPlayerEvent.getEntityPlayer() instanceof EntityPlayerSP) {
			/*
			 * This is a hack to allow player to view themselves in remote perspective.
			 * By default, EntityPlayerSP ("user" playing the game) cannot see himself unless player == renderViewEntity.
			 * So, before rendering EntityPlayerSP, setting renderViewEntity to player temporarily.
			 */
			originalRenderViewEntity = preRenderPlayerEvent.getRenderer().getRenderManager().renderViewEntity;
			preRenderPlayerEvent.getRenderer().getRenderManager().renderViewEntity = preRenderPlayerEvent.getEntityPlayer();
		}
		/*
		CustomPlayerInventory capability = CompatibleCustomPlayerInventoryCapability.getInventory(preRenderPlayerEvent.getPlayer());

        if(capability != null) {
            ItemStack vestStack = capability.getStackInSlot(1);
            if(vestStack != null) {
                compatibility.renderItem(preRenderPlayerEvent.getPlayer(), vestStack);
                IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(vestStack, null);
                if(customRenderer instanceof StaticModelSourceRenderer) {
                    ((StaticModelSourceRenderer) customRenderer).renderCustomEquipped(preRenderPlayerEvent.getPlayer(), vestStack);
                }
            }
            ItemStack backpackStack = capability.getStackInSlot(0); // TODO: replace 0 with constant for backpack slot
            if(backpackStack != null) {
                IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(backpackStack, null);
                if(customRenderer instanceof StaticModelSourceRenderer) {
                    ((StaticModelSourceRenderer) customRenderer).renderCustomEquipped(preRenderPlayerEvent.getPlayer(), backpackStack);
                }
                compatibility.renderItem(preRenderPlayerEvent.getPlayer(), backpackStack);
            }
        }
        */
    }

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public final void onPostRenderPlayer(RenderPlayerEvent.Post postRenderPlayerEvent) {
		ClientModContext modContext = (ClientModContext) getModContext();

		if (modContext.getSafeGlobals().renderingPhase.get() == RenderingPhase.RENDER_PERSPECTIVE && postRenderPlayerEvent.getEntityPlayer() instanceof EntityPlayerSP) {
			/*
			 * This is a hack to allow player to view themselves in remote perspective.
			 * By default, EntityPlayerSP ("user" playing the game) cannot see himself unless player == renderViewEntity.
			 * So, before rendering EntityPlayerSP, setting renderViewEntity to player temporarily.
			 * After rendering EntityPlayerSP, restoring the original renderViewEntity.
			 */
			postRenderPlayerEvent.getRenderer().getRenderManager().renderViewEntity = originalRenderViewEntity;
		}
	}

	@SubscribeEvent
	public void onRightHandEmpty(PlayerInteractEvent.RightClickEmpty rightClickEmptyEvent) {
		final EntityPlayer player = mc.player;

		List<EntityVehicle> entityVehicleList = player.world.getEntitiesWithinAABB(EntityVehicle.class, new AxisAlignedBB(player.getPosition()).grow(10));

		if (entityVehicleList.isEmpty())
			return;

		for (EntityVehicle entityVehicle : entityVehicleList) {
			OreintedBB boundingBox = entityVehicle.getOreintedBoundingBox();

			//boundingBox.move(entityVehicle.posX, entityVehicle.posY, entityVehicle.posZ);
			Vec3d start = player.getPositionEyes(mc.getRenderPartialTicks());
			Vec3d endVec = start.add(player.getLookVec().scale(7));

			boundingBox.updateInverse();

			if (boundingBox.doRayTrace(start, endVec) != null) {
				getModContext().getChannel().sendToServer(new VehicleInteractPacket(true, entityVehicle.getEntityId(), player.getEntityId()));
				return;
			}
		}
	}

	@SubscribeEvent
	public void onLeftHandEmpty(PlayerInteractEvent.LeftClickEmpty leftClickEmptyEvent) {
		final EntityPlayer player = mc.player;

		List<EntityVehicle> entityVehicleList = player.world.getEntitiesWithinAABB(EntityVehicle.class, new AxisAlignedBB(player.getPosition()).grow(3));

		if (entityVehicleList.isEmpty())
			return;

		for (EntityVehicle entityVehicle : entityVehicleList) {
			OreintedBB boundingBox = entityVehicle.getOreintedBoundingBox();

			//boundingBox.move(entityVehicle.posX, entityVehicle.posY, entityVehicle.posZ);
			Vec3d start = player.getPositionEyes(mc.getRenderPartialTicks());
			Vec3d endVec = start.add(player.getLookVec().scale(4));

			//boundingBox.updateInverse();

			if (boundingBox.doRayTrace(start, endVec) != null) {
				getModContext().getChannel().sendToServer(new VehicleInteractPacket(false, entityVehicle.getEntityId(), player.getEntityId()));

				//entityVehicle.onKillCommand();
				//entityVehicle.setDead();
				return;
			}
		}
	}

	public static TextureAtlasSprite carParticles;

	@SubscribeEvent
	public void onTextureStitchEvent(TextureStitchEvent.Pre event) {
		event.getMap().registerSprite(getModContext().getNamedResource(ParticleBlood.texture));
		carParticles = event.getMap().registerSprite(new ResourceLocation(ModReference.ID + ":particle/carparticle"));
	}

	@SubscribeEvent
	public void mouseMove(MouseEvent mouseEvent) {
		if (!AnimationModeProcessor.getInstance().getFPSMode())
			return;

		AnimationModeProcessor animationModeProcessor = AnimationModeProcessor.getInstance();

		// Use the scroll wheel to zoom in and out the camera
		double pan = Math.max(0.01, Math.abs(animationModeProcessor.pan.z) / 10000f);
		animationModeProcessor.pan = animationModeProcessor.pan.add(0, 0, (mouseEvent.getDwheel()) * pan);

		if (EVENT_DWHEEL_FIELD == null) {
			// Usually we would include the MCP mapping, however, this tool is only ever meant to be used in the debug environment.
			EVENT_DWHEEL_FIELD = ReflectionHelper.findField(Mouse.class, "event_dwheel");
		}

		try {
			EVENT_DWHEEL_FIELD.set(null, 0);
		} catch (Exception e) {
			LOG.error("Could not assign value to EVENT_DWHEEL_FIELD!");
			e.printStackTrace();
		}
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public final void updateFOV(FOVUpdateEvent fovUpdateEvent) {
		final EntityPlayer player = fovUpdateEvent.getEntity();

		if (!player.isRiding() || !(player.getRidingEntity() instanceof EntityVehicle))
			return;

		final EntityVehicle vehicle = (EntityVehicle) player.getRidingEntity();

		fovUpdateEvent.setNewfov((float) (fovUpdateEvent.getFov() + ((vehicle.getSolver().getSyntheticAcceleration() / 55 + (vehicle.getRealSpeed() / 120)) * 0.2)));
	}

	@SubscribeEvent
	public void keyInputEvent(GuiScreenEvent.KeyboardInputEvent kie) {
		// This is used to unlock and lock free-cam.
		if (Keyboard.isKeyDown(KeyBindings.freecamLock.getKeyCode()))
			freecamLock = !freecamLock;
	}

	@SubscribeEvent
	public final void properCameraSetup(EntityViewRenderEvent.CameraSetup cameraSetupEvent) {
		if (freecamEnabled) {
			if (Keyboard.isKeyDown(KeyBindings.freecamRotate.getKeyCode()) && freecamEnabled) {
				// Rotates the free-cam if the key is down
				freeYaw += yawDelta;
				freePitch += pitchDelta;
			} else if (!freecamLock) {
				// When the player releases the key, snap back
				freeYaw = 0;
				freePitch = 0;
			}

			cameraSetupEvent.setYaw((float) (freeYaw));
			cameraSetupEvent.setPitch((float) (freePitch));
		}

		// Reset the deltas
		yawDelta = 0;
		pitchDelta = 0;
	}

	public static boolean checkShot(int entityID) {
		if (muzzleFlashMap.isEmpty() || !muzzleFlashMap.containsKey(entityID) || (muzzleFlashMap.get(entityID).isEmpty()))
			return false;

		if (System.currentTimeMillis() - muzzleFlashMap.get(entityID).peek() > 25)
			muzzleFlashMap.get(entityID).pop();

		return true;
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
}
