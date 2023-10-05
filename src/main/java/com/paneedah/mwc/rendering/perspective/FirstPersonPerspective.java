package com.paneedah.mwc.rendering.perspective;

import com.paneedah.mwc.mixininterfaces.IModernEntityRenderer;
import com.paneedah.mwc.proxies.ClientProxy;
import com.paneedah.mwc.utils.PlayerCreatureWrapper;
import com.paneedah.weaponlib.RenderingPhase;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@SideOnly(Side.CLIENT)
public abstract class FirstPersonPerspective extends Perspective {

    private long renderEndTimeNano;

    protected PlayerCreatureWrapper watchablePlayer;

    protected FirstPersonPerspective() {
        renderEndTimeNano = System.nanoTime();
        width = 427;
        height = 240;
        watchablePlayer = new PlayerCreatureWrapper(MC.player.world);
    }

    @Override
    public void update(final TickEvent.RenderTickEvent renderTickEvent) {
        if (MC.isGamePaused())
            return;

        ClientProxy.renderingPhase = RenderingPhase.RENDER_PERSPECTIVE;

        final EntityPlayerSP originalPlayer = MC.player;

        if (originalPlayer == null)
            return;

        updateWatchablePlayer();

        final int originalDisplayWidth = MC.displayWidth;
        final int originalDisplayHeight = MC.displayHeight;

        final Entity originalRenderViewEntity = MC.getRenderViewEntity();
        final EntityRenderer originalEntityRenderer = MC.entityRenderer;

        MC.displayWidth = width;
        MC.displayHeight = height;

        framebuffer.bindFramebuffer(true);

        MC.entityRenderer = entityRenderer;

        if (watchablePlayer.getEntityLiving() != null && !watchablePlayer.getEntityLiving().isDead) {

            MC.setRenderViewEntity(watchablePlayer.getEntityLiving());
            MC.player = watchablePlayer;

            ((IModernEntityRenderer) this.entityRenderer).mwc$setPrepareTerrain(true);
            this.entityRenderer.updateRenderer();
            this.entityRenderer.renderWorld(renderTickEvent.renderTickTime, renderEndTimeNano + (1000000000 / 60));

            MC.setRenderViewEntity(originalRenderViewEntity);
            MC.player = originalPlayer;
        }

        renderOverlay();

        MC.entityRenderer = originalEntityRenderer;

        MC.getFramebuffer().bindFramebuffer(true);

        MC.displayWidth = originalDisplayWidth;
        MC.displayHeight = originalDisplayHeight;

        renderEndTimeNano = System.nanoTime();

        ClientProxy.renderingPhase = RenderingPhase.NORMAL;
    }

    protected abstract void updateWatchablePlayer();

    protected void renderOverlay() {
        this.entityRenderer.setupOverlayRendering();
    }
}
