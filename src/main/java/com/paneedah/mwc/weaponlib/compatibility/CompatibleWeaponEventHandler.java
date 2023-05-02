package com.paneedah.mwc.weaponlib.compatibility;

import com.paneedah.mwc.weaponlib.ModContext;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderLivingEvent.Pre;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public abstract class CompatibleWeaponEventHandler {

	@SubscribeEvent
	public final void onGuiOpenEvent(GuiOpenEvent event) {
		onCompatibleGuiOpenEvent(event);
	}

	protected abstract void onCompatibleGuiOpenEvent(GuiOpenEvent event);

	@SubscribeEvent
	public final void zoom(FOVUpdateEvent event) {
		compatibleZoom(event);
	}

	protected abstract void compatibleZoom(FOVUpdateEvent event);

	@SubscribeEvent
	public final void onMouse(MouseEvent event) {
		onCompatibleMouse(event);
	}

	protected abstract void onCompatibleMouse(MouseEvent event);

	@SubscribeEvent
	public final void handleRenderLivingEvent(@SuppressWarnings("rawtypes") RenderLivingEvent.Pre event) {
		onCompatibleHandleRenderLivingEvent(event);
	}

	protected abstract void onCompatibleHandleRenderLivingEvent(@SuppressWarnings("rawtypes") Pre event);

	@SubscribeEvent
    public final void onEntityJoinedWorldEvent(EntityJoinWorldEvent event) {
        onCompatibleEntityJoinedWorldEvent(new CompatibleEntityJoinWorldEvent(event));
    }

    protected abstract void onCompatibleEntityJoinedWorldEvent(CompatibleEntityJoinWorldEvent compatibleEntityJoinWorldEvent);


    protected abstract ModContext getModContext();
}
