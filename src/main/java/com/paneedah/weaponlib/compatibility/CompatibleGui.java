package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public abstract class CompatibleGui extends Gui {

	@SubscribeEvent
	public final void onRenderHud(RenderGameOverlayEvent.Pre event) {
		onCompatibleRenderHud(event);
	}
	
	public abstract void onCompatibleRenderHud(RenderGameOverlayEvent.Pre event);
	
	@SubscribeEvent
	public final void onRenderCrosshair(RenderGameOverlayEvent.Pre event) {
		onCompatibleRenderCrosshair(event);
	}
	
	public abstract void onCompatibleRenderCrosshair(RenderGameOverlayEvent.Pre event);
	
	
}
