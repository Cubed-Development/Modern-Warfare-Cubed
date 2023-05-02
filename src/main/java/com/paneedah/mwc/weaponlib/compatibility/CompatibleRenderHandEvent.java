package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraftforge.client.event.RenderHandEvent;

public class CompatibleRenderHandEvent {

    private RenderHandEvent event;

    public CompatibleRenderHandEvent(RenderHandEvent event) {
        super();
        this.event = event;
    }

    public float getPartialTicks() {
        return event.getPartialTicks();
    }
    
    
}
