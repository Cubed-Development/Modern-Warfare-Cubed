package com.paneedah.weaponlib.perspective;

import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.RenderingPhase;
import com.paneedah.weaponlib.compatibility.MWCParticleManager;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.Entity;
import net.minecraft.stats.StatisticsManager;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public abstract class RemoteFirstPersonPerspective extends Perspective<RenderableState> {

    private long renderEndNanoTime;

    protected EntityPlayerSP watchablePlayer;

    public RemoteFirstPersonPerspective() {
        this.renderEndNanoTime = System.nanoTime();
        this.width = 427; //mc.displayWidth >> 1;
        this.height = 240; //mc.displayHeight >> 1;
        WorldClient world = (WorldClient) mc.player.world;
        this.watchablePlayer = new EntityPlayerSP(mc, world, mc.getConnection(), new StatisticsManager(), null);
    }

    @Override
    public void update(TickEvent.RenderTickEvent event) {
        
        if(mc.isGamePaused()) {
            return;
        }

        EntityPlayerSP origPlayer = mc.player;

        if(origPlayer == null) {
            return;
        }

        updateWatchablePlayer();

        RenderGlobal origRenderGlobal = mc.renderGlobal;
        Entity origRenderViewEntity = mc.getRenderViewEntity();
        EntityRenderer origEntityRenderer = mc.entityRenderer;
        int origDisplayWidth = mc.displayWidth;
        int origDisplayHeight = mc.displayHeight;

        mc.displayWidth = this.width;
        mc.displayHeight = this.height;

        framebuffer.bindFramebuffer(true);

        mc.effectRenderer = MWCParticleManager.getParticleManager();

        mc.entityRenderer = this.entityRenderer;
        if (watchablePlayer != null && !watchablePlayer.isDead) {

            mc.setRenderViewEntity(watchablePlayer);
            mc.player = watchablePlayer;

            modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.RENDER_PERSPECTIVE);

            this.entityRenderer.setPrepareTerrain(true);
            this.entityRenderer.updateRenderer();
            long p_78471_2_ = this.renderEndNanoTime + (long) (1000000000 / 60);
            this.entityRenderer.renderWorld(event.renderTickTime, p_78471_2_);

            modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.NORMAL);

            mc.setRenderViewEntity(origRenderViewEntity);
            mc.player = origPlayer;
        }

        renderOverlay();

        mc.getFramebuffer().bindFramebuffer(true);

        mc.renderGlobal = origRenderGlobal;
        mc.effectRenderer = MWCParticleManager.getParticleManager();

        mc.displayWidth = origDisplayWidth;
        mc.displayHeight = origDisplayHeight;
        mc.entityRenderer = origEntityRenderer;

        this.renderEndNanoTime = System.nanoTime();
    }

    protected abstract void updateWatchablePlayer();

    protected void renderOverlay() {
        this.entityRenderer.setupOverlayRendering();
    }
}
