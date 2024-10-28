package com.paneedah.weaponlib.perspective;

import com.paneedah.mwc.proxies.ClientProxy;
import com.paneedah.mwc.utils.PlayerCreatureWrapper;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.RenderingPhase;
import com.paneedah.weaponlib.compatibility.MWCParticleManager;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public abstract class RemoteFirstPersonPerspective extends Perspective<RenderableState> {

    private long renderEndNanoTime;

    protected PlayerCreatureWrapper watchablePlayer;

    @SideOnly(Side.CLIENT)
    public RemoteFirstPersonPerspective() {
        renderEndNanoTime = System.nanoTime();
        width = 427; //MC.displayWidth >> 1;
        height = 240; //MC.displayHeight >> 1;
        WorldClient world = (WorldClient) MC.player.world;
        watchablePlayer = new PlayerCreatureWrapper(world);
    }

    @Override
    public void update(TickEvent.RenderTickEvent event) {

        if (MC.isGamePaused()) {
            return;
        }

        EntityPlayerSP origPlayer = MC.player;

        if (origPlayer == null) {
            return;
        }

        updateWatchablePlayer();

        RenderGlobal origRenderGlobal = MC.renderGlobal;
        Entity origRenderViewEntity = MC.getRenderViewEntity();
        EntityRenderer origEntityRenderer = MC.entityRenderer;
        int origDisplayWidth = MC.displayWidth;
        int origDisplayHeight = MC.displayHeight;

        MC.displayWidth = width;
        MC.displayHeight = height;

        framebuffer.bindFramebuffer(true);

        MC.effectRenderer = MWCParticleManager.getParticleManager();

        MC.entityRenderer = entityRenderer;
        if (watchablePlayer.getEntityLiving() != null && !watchablePlayer.getEntityLiving().isDead) {

            MC.setRenderViewEntity(watchablePlayer.getEntityLiving());
            MC.player = watchablePlayer;

            ClientProxy.renderingPhase = RenderingPhase.RENDER_PERSPECTIVE;

            entityRenderer.setPrepareTerrain(true);
            entityRenderer.updateRenderer();
            long p_78471_2_ = renderEndNanoTime + (long) (1000000000 / 60);
            entityRenderer.renderWorld(event.renderTickTime, p_78471_2_);

            ClientProxy.renderingPhase = RenderingPhase.NORMAL;

            assert origRenderViewEntity != null;
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

        renderEndNanoTime = System.nanoTime();
    }

    protected abstract void updateWatchablePlayer();

    protected void renderOverlay() {
        entityRenderer.setupOverlayRendering();
    }
}
