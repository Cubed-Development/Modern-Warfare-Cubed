package com.paneedah.weaponlib.perspective;

import com.paneedah.weaponlib.ClientModContext;
import com.paneedah.weaponlib.PlayerItemInstance;
import com.paneedah.weaponlib.compatibility.CompatibleWorldRenderer;
import com.paneedah.weaponlib.compatibility.MWCParticleManager;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderGlobal;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.log;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class PerspectiveManager {

    private Perspective<?> currentPerspective;
    private ClientModContext clientModContext;
    private CompatibleWorldRenderer entityRenderer;
    private RenderGlobal renderGlobal;
    private MWCParticleManager effectRenderer;
    //private DynamicShaderGroupManager shaderGroupManager;

    public PerspectiveManager(ClientModContext clientModContext) {
        this.clientModContext = clientModContext;
        //this.shaderGroupManager = new DynamicShaderGroupManager();
    }

    public Perspective<?> getPerspective(PlayerItemInstance<?> currentInstance, boolean init) {

        if(currentInstance == null || (currentPerspective == null && !init)) {
            return null;
        }

        Class<? extends Perspective<?>> perspectiveClass = currentInstance.getRequiredPerspectiveType();

        if (perspectiveClass != null) {
            if(currentPerspective == null) {
                currentPerspective = createActivePerspective(perspectiveClass);
            } else if(!perspectiveClass.isInstance(currentPerspective)) {
                currentPerspective.deactivate(clientModContext);
                currentPerspective = createActivePerspective(perspectiveClass);
            }
        } else if (currentPerspective != null) {
            if(init) {
                currentPerspective.deactivate(clientModContext);
                currentPerspective = null;
            }

        }

        return currentPerspective;
    }

    private Perspective<?> createActivePerspective(Class<? extends Perspective<?>> perspectiveClass) {
        Perspective<?> result = null;

        try {
            result = perspectiveClass.newInstance();
            result.activate(clientModContext, this);
        } catch (InstantiationException | IllegalAccessException e) {
            log.error("Failed to create view of {} - {}", perspectiveClass, e, e);
        }
        return result;
    }

    CompatibleWorldRenderer getEntityRenderer() {
        if(entityRenderer == null) {
            entityRenderer = new CompatibleWorldRenderer(mc,
                    mc.getResourceManager());
        }
        return entityRenderer;
    }

    RenderGlobal getRenderGlobal() {
        if(renderGlobal == null) {
            renderGlobal = compatibility.createCompatibleRenderGlobal();
            WorldClient world = (WorldClient) compatibility.world(compatibility.clientPlayer());
            renderGlobal.setWorldAndLoadRenderers(world);
        }
        return renderGlobal;
    }

    MWCParticleManager getEffectRenderer() {
        if(effectRenderer == null) {
            WorldClient world = (WorldClient) compatibility.world(compatibility.clientPlayer());
            effectRenderer = MWCParticleManager.getParticleManager();
        }
        return effectRenderer;
    }

//    DynamicShaderGroupManager getShaderGroupManager() {
//        return shaderGroupManager;
//    }

}
