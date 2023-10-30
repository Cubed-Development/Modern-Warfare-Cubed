package com.paneedah.mwc.rendering.perspective;

import com.paneedah.mwc.mixininterfaces.IModernEntityRenderer;
import com.paneedah.weaponlib.PlayerItemInstance;
import com.paneedah.weaponlib.shader.DynamicShaderGroupManager;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@SideOnly(Side.CLIENT)
public final class PerspectiveManager {

    public static final EntityRenderer ENTITY_RENDERER = new EntityRenderer(MC, MC.getResourceManager());
    public static final DynamicShaderGroupManager DYNAMIC_SHADER_GROUP_MANAGER = new DynamicShaderGroupManager();

    private static Perspective activePerspective;

    public static void init() {
        ((IModernEntityRenderer) ENTITY_RENDERER).mwc$setRenderHand(false);
    }

    public static Perspective getPerspective(final PlayerItemInstance<?> currentInstance, final boolean reinitialize) {
        if (currentInstance == null || (activePerspective == null && !reinitialize))
            return null;

        final Perspective newPerspective = currentInstance.getRequiredPerspectiveType();

        if (newPerspective != null) {
            if (newPerspective.getClass().isInstance(activePerspective))
                return activePerspective;

            if (activePerspective != null)
                activePerspective.releaseResources();

            activePerspective = newPerspective;
            activePerspective.init();
        } else if (reinitialize && activePerspective != null) {
            activePerspective.releaseResources();
            activePerspective = null;
        }

        return activePerspective;
    }
}
