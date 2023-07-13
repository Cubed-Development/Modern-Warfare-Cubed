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

import static com.paneedah.mwc.MWC.MC;

public abstract class RemoteFirstPersonPerspective extends Perspective<RenderableState> {

    private long renderEndNanoTime;

    protected EntityPlayerSP watchablePlayer;

    public RemoteFirstPersonPerspective() {
        this.renderEndNanoTime = System.nanoTime();
        this.width = 427; //MC.displayWidth >> 1;
        this.height = 240; //MC.displayHeight >> 1;
        WorldClient world = (WorldClient) MC.player.world;
        this.watchablePlayer = new EntityPlayerSP(MC, world, MC.getConnection(), new StatisticsManager(), null);
    }

    @Override
    public void update(TickEvent.RenderTickEvent event) {
        
        if(MC.isGamePaused()) {
            return;
        }

        EntityPlayerSP origPlayer = MC.player;

        if(origPlayer == null) {
            return;
        }

        updateWatchablePlayer();

        RenderGlobal origRenderGlobal = MC.renderGlobal;
        Entity origRenderViewEntity = MC.getRenderViewEntity();
        EntityRenderer origEntityRenderer = MC.entityRenderer;
        int origDisplayWidth = MC.displayWidth;
        int origDisplayHeight = MC.displayHeight;

        MC.displayWidth = this.width;
        MC.displayHeight = this.height;

        framebuffer.bindFramebuffer(true);

        MC.effectRenderer = MWCParticleManager.getParticleManager();

        MC.entityRenderer = this.entityRenderer;
        if (watchablePlayer != null && !watchablePlayer.isDead) {

            MC.setRenderViewEntity(watchablePlayer);
            MC.player = watchablePlayer;

            modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.RENDER_PERSPECTIVE);

            this.entityRenderer.setPrepareTerrain(true);
            this.entityRenderer.updateRenderer();
            long p_78471_2_ = this.renderEndNanoTime + (long) (1000000000 / 60);
            this.entityRenderer.renderWorld(event.renderTickTime, p_78471_2_);

            modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.NORMAL);

            MC.setRenderViewEntity(origRenderViewEntity);
            MC.player = origPlayer;
        }

        renderOverlay();

        MC.getFramebuffer().bindFramebuffer(true);

        MC.renderGlobal = origRenderGlobal;
        MC.effectRenderer = MWCParticleManager.getParticleManager();

        MC.displayWidth = origDisplayWidth;
        MC.displayHeight = origDisplayHeight;
        MC.entityRenderer = origEntityRenderer;

        this.renderEndNanoTime = System.nanoTime();
    }

    protected abstract void updateWatchablePlayer();

    protected void renderOverlay() {
        this.entityRenderer.setupOverlayRendering();
    }
}
