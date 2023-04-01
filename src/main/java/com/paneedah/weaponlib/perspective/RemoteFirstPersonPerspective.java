package com.paneedah.weaponlib.perspective;

import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.RenderingPhase;
import com.paneedah.weaponlib.compatibility.CompatiblePlayerCreatureWrapper;
import com.paneedah.weaponlib.compatibility.CompatibleRenderTickEvent;
import com.paneedah.weaponlib.compatibility.MWCParticleManager;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public abstract class RemoteFirstPersonPerspective extends Perspective<RenderableState> {

    private long renderEndNanoTime;

    protected CompatiblePlayerCreatureWrapper watchablePlayer;

    public RemoteFirstPersonPerspective() {
        this.renderEndNanoTime = System.nanoTime();
        this.width = 427; //mc.displayWidth >> 1;
        this.height = 240; //mc.displayHeight >> 1;
        WorldClient world = (WorldClient) compatibility.world(compatibility.clientPlayer());
        this.watchablePlayer = new CompatiblePlayerCreatureWrapper(mc, world);
    }

    @Override
    public void update(CompatibleRenderTickEvent event) {
        
        if(mc.isGamePaused()) {
            return;
        }

        EntityPlayer origPlayer = compatibility.clientPlayer();

        if(origPlayer == null) {
            return;
        }

        updateWatchablePlayer();

        RenderGlobal origRenderGlobal = mc.renderGlobal;
        Entity origRenderViewEntity = compatibility.getRenderViewEntity();
        EntityRenderer origEntityRenderer = mc.entityRenderer;
        int origDisplayWidth = mc.displayWidth;
        int origDisplayHeight = mc.displayHeight;

        mc.displayWidth = this.width;
        mc.displayHeight = this.height;

        framebuffer.bindFramebuffer(true);

        mc.effectRenderer = MWCParticleManager.getParticleManager();

        mc.entityRenderer = this.entityRenderer;
        if (watchablePlayer.getEntityLiving() != null && !watchablePlayer.getEntityLiving().isDead) {

            compatibility.setRenderViewEntity(watchablePlayer.getEntityLiving());
            compatibility.setClientPlayer(watchablePlayer);

            modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.RENDER_PERSPECTIVE);

            this.entityRenderer.setPrepareTerrain(true);
            this.entityRenderer.updateRenderer();
            long p_78471_2_ = this.renderEndNanoTime + (long) (1000000000 / 60);
            this.entityRenderer.renderWorld(event.getRenderTickTime(), p_78471_2_);

            modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.NORMAL);

            compatibility.setRenderViewEntity(origRenderViewEntity);
            compatibility.setClientPlayer(origPlayer);
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
