package com.paneedah.mwc.weaponlib;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleEntityJoinWorldEvent;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleWeaponEventHandler;
import com.paneedah.mwc.weaponlib.compatibility.Interceptors;
import com.paneedah.mwc.weaponlib.grenade.PlayerGrenadeInstance;
import com.paneedah.mwc.weaponlib.melee.PlayerMeleeInstance;
import com.paneedah.mwc.weaponlib.vehicle.EntityVehicle;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class WeaponEventHandler extends CompatibleWeaponEventHandler {

	private SafeGlobals safeGlobals;
	private ModContext modContext;

	public WeaponEventHandler(ModContext modContext, SafeGlobals safeGlobals) {
		this.modContext = modContext;
		this.safeGlobals = safeGlobals;
	}

	@Override
	public void onCompatibleGuiOpenEvent(GuiOpenEvent event) {
		safeGlobals.guiOpen.set(compatibility.getGui(event) != null);
	}

	@Override
	public void compatibleZoom(FOVUpdateEvent event) {
		
		
		
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
		EntityPlayer clientPlayer = compatibility.clientPlayer();
		if (instance != null) {
		   
		    float fov;
		    if(instance.isAttachmentZoomEnabled()) {
		    	fov = instance.getWeapon().getADSZoom();
		    	 if(safeGlobals.renderingPhase.get() == RenderingPhase.RENDER_PERSPECTIVE) {
		           
		        	fov = instance.getZoom();
		        } else {
		        	
		            fov = compatibility.isFlying(clientPlayer) ? 1.1f : 1.0f;
		        }
		    } else {
		    	 fov = compatibility.isFlying(compatibility.clientPlayer()) ? 1.1f : 1.0f;
		    	//fov = instance.isAimed() ? instance.getZoom() : 1f;
		       // fov = compatibility.isFlying(compatibility.clientPlayer()) ? 1.1f : 1.0f; //instance.isAimed() ? instance.getZoom() : 1f;
		    }

		   RenderingPhase phase = (((ClientModContext) modContext).getSafeGlobals().renderingPhase).get();
		 
		     if(instance.isAimed() && phase == null) {
		    	fov = 0.7f;
		    }
		     
		    if(mc.player.isSprinting()) {
		    	fov *= 1.2;
		    }
		    
		    //fov = 0.3f;
		    compatibility.setNewFov(event, fov); //Tags.getZoom(stack));
		} else {
		    SpreadableExposure spreadableExposure = CompatibleExposureCapability.getExposure(compatibility.clientPlayer(), SpreadableExposure.class);
            if(spreadableExposure != null && spreadableExposure.getTotalDose() > 0f) {
                float fov = compatibility.isFlying(compatibility.clientPlayer()) ? 1.1f : 1.0f; 
                compatibility.setNewFov(event, fov);
            }
		}
		
	}

	@Override
	public void onCompatibleMouse(MouseEvent event) {
		
		if(compatibility.getButton(event) == 0 || compatibility.getButton(event) == 1) {
			// If the current player holds the weapon in their main hand, cancel default minecraft mouse processing
		    PlayerItemInstance<?> instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(compatibility.clientPlayer());
		    //PlayerWeaponInstance mainHandHeldWeaponInstance = modContext.getMainHeldWeapon();
			if(instance instanceof PlayerWeaponInstance || instance instanceof PlayerMeleeInstance
			        || instance instanceof PlayerGrenadeInstance) { // TODO: introduce common action handler interface and check instanceof ActionHandler instead
				event.setCanceled(true);
			}
		}
	}

	@Override
	public void onCompatibleHandleRenderLivingEvent(@SuppressWarnings("rawtypes") RenderLivingEvent.Pre event) {
		if ((event.isCanceled()) || (!(compatibility.getEntity(event) instanceof EntityPlayer)))
			return;

		ItemStack itemStack = compatibility.getHeldItemMainHand(compatibility.getEntity(event));
		if (itemStack != null && itemStack.getItem() instanceof Weapon) {
			RenderPlayer rp = compatibility.getRenderer(event);

			if (itemStack != null) {
			    EntityPlayer player = (EntityPlayer)compatibility.getEntity(event);
			    PlayerItemInstance<?> instance = modContext.getPlayerItemInstanceRegistry()
			            .getItemInstance(player, itemStack);
			    if(instance instanceof PlayerWeaponInstance) {
			        PlayerWeaponInstance weaponInstance = (PlayerWeaponInstance) instance;
			        compatibility.setAimed(rp, !Interceptors.isProning(player) &&
			                (weaponInstance.isAimed()
			                || weaponInstance.getState() == WeaponState.FIRING
			                || weaponInstance.getState() == WeaponState.RECOILED
			                || weaponInstance.getState() == WeaponState.PAUSED
							));
			    }
			}
		}
	}
	
    @SideOnly(Side.CLIENT)
	@SubscribeEvent
	public final void onRenderItemEvent(RenderHandEvent event) {
	    if (compatibility.clientPlayer().getRidingEntity() instanceof EntityVehicle)
	    	event.setCanceled(true);
	}

	@Override
	protected void onCompatibleEntityJoinedWorldEvent(CompatibleEntityJoinWorldEvent compatibleEntityJoinWorldEvent) {
	    if(compatibleEntityJoinWorldEvent.getEntity() instanceof Contextual) {
	        ((Contextual)compatibleEntityJoinWorldEvent.getEntity()).setContext(modContext);
	    }
	}

    @Override
    protected ModContext getModContext() {
        return modContext;
    }
}
