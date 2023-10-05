package com.paneedah.mwc.rendering.perspective;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Luna Lage (Desoroxxx)
 * @since 0.1
 */
@SideOnly(Side.CLIENT)
public interface IPerspective {

    void update(final TickEvent.RenderTickEvent renderTickEvent);
}
