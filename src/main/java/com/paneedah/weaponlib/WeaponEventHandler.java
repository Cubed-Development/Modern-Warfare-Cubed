package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.compatibility.Interceptors;
import com.paneedah.weaponlib.grenade.PlayerGrenadeInstance;
import com.paneedah.weaponlib.melee.PlayerMeleeInstance;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.*;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class WeaponEventHandler {

	private SafeGlobals safeGlobals;
	private ModContext modContext;

	public WeaponEventHandler(ModContext modContext, SafeGlobals safeGlobals) {
		this.modContext = modContext;
		this.safeGlobals = safeGlobals;
	}

	@SubscribeEvent
	public void onGuiOpenEvent(GuiOpenEvent event) {
		safeGlobals.guiOpen.set(event.getGui() != null);
	}

	@SubscribeEvent
	public void zoom(FOVUpdateEvent event) {
		
		
		
		/*
		 * TODO: if optical zoom is on then
		 * 			if rendering phase is "render viewfinder" then
		 * 				setNewFov(getZoom());
		 *          else if rendering phase is normal then
		 *              setNewFov(1);
		 *       else if optical zoom is off
		 *       	setNewFov(getZoom())
		 */
		
		
		

		//ItemStack stack = compatibility.getHeldItemMainHand(compatibility.getEntity(event));
		//ClientModContext modContext = ClientModContext.getContext();
		PlayerWeaponInstance instance = modContext.getMainHeldWeapon();
		EntityPlayer clientPlayer = mc.player;
		if (instance != null) {
		   
		    float fov;
		    if(instance.isAttachmentZoomEnabled()) {
		    	fov = instance.getWeapon().getADSZoom();
		    	 if(safeGlobals.renderingPhase.get() == RenderingPhase.RENDER_PERSPECTIVE) {
		           
		        	fov = instance.getZoom();
		        } else {
		        	
		            fov = clientPlayer.capabilities.isFlying ? 1.1f : 1.0f;
		        }
		    } else {
		    	 fov = mc.player.capabilities.isFlying ? 1.1f : 1.0f;
		    	//fov = instance.isAimed() ? instance.getZoom() : 1f;
		       // fov = compatibility.isFlying(mc.player) ? 1.1f : 1.0f; //instance.isAimed() ? instance.getZoom() : 1f;
		    }

		   RenderingPhase phase = (((ClientModContext) modContext).getSafeGlobals().renderingPhase).get();
		 
		     if(instance.isAimed() && phase == null) {
		    	fov = 0.7f;
		    }
		     
		    if(mc.player.isSprinting()) {
		    	fov *= 1.2;
		    }
		    
		    //fov = 0.3f;
			event.setNewfov(fov);
		} else {
		    SpreadableExposure spreadableExposure = CompatibleExposureCapability.getExposure(mc.player, SpreadableExposure.class);
            if(spreadableExposure != null && spreadableExposure.getTotalDose() > 0f) {
                float fov = mc.player.capabilities.isFlying ? 1.1f : 1.0f;
				event.setNewfov(fov);
            }
		}
		
	}

	@SubscribeEvent
	public void onMouse(MouseEvent event) {
		
		if(event.getButton() == 0 || event.getButton() == 1) {
			// If the current player holds the weapon in their main hand, cancel default minecraft mouse processing
		    PlayerItemInstance<?> instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(mc.player);
		    //PlayerWeaponInstance mainHandHeldWeaponInstance = modContext.getMainHeldWeapon();
			if(instance instanceof PlayerWeaponInstance || instance instanceof PlayerMeleeInstance
			        || instance instanceof PlayerGrenadeInstance) { // TODO: introduce common action handler interface and check instanceof ActionHandler instead
				event.setCanceled(true);
			}
		}
	}

	@SubscribeEvent
	public void onRenderLivingEvent(RenderLivingEvent.Pre event) {
		if ((event.isCanceled()) || (!(event.getEntity() instanceof EntityPlayer)))
			return;

		ItemStack itemStack = event.getEntity().getHeldItemMainhand();
		if (itemStack != null && itemStack.getItem() instanceof Weapon) {
			RenderPlayer rp = (RenderPlayer) event.getRenderer();

			if (itemStack != null) {
			    EntityPlayer player = (EntityPlayer)event.getEntity();
			    PlayerItemInstance<?> instance = modContext.getPlayerItemInstanceRegistry()
			            .getItemInstance(player, itemStack);
			    if(instance instanceof PlayerWeaponInstance) {
			        PlayerWeaponInstance weaponInstance = (PlayerWeaponInstance) instance;
					if (!Interceptors.isProning(player) && (weaponInstance.isAimed() || weaponInstance.getState() == WeaponState.FIRING || weaponInstance.getState() == WeaponState.RECOILED || weaponInstance.getState() == WeaponState.PAUSED)) {
						rp.getMainModel().leftArmPose = ModelBiped.ArmPose.BOW_AND_ARROW;
						rp.getMainModel().rightArmPose = ModelBiped.ArmPose.BOW_AND_ARROW;
					} else {
						rp.getMainModel().leftArmPose = ModelBiped.ArmPose.EMPTY;
						rp.getMainModel().rightArmPose = ModelBiped.ArmPose.ITEM;
					}
			    }
			}
		}
	}
	
    @SideOnly(Side.CLIENT)
	@SubscribeEvent
	public final void onRenderItemEvent(RenderHandEvent event) {
	    if (mc.player.getRidingEntity() instanceof EntityVehicle)
	    	event.setCanceled(true);
	}

	@SubscribeEvent
	public void onEntityJoinedWorldEvent(EntityJoinWorldEvent entityJoinWorldEvent) {
	    if(entityJoinWorldEvent.getEntity() instanceof Contextual) {
	        ((Contextual) entityJoinWorldEvent.getEntity()).setContext(modContext);
	    }
	}

    protected ModContext getModContext() {
        return modContext;
    }
}
