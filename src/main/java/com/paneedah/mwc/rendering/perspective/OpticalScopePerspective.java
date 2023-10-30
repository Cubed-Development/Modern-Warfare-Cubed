package com.paneedah.mwc.rendering.perspective;

import com.paneedah.mwc.MWC;
import com.paneedah.weaponlib.ItemScope;
import com.paneedah.weaponlib.PlayerWeaponInstance;
import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.shader.jim.Shader;
import com.paneedah.weaponlib.shader.jim.ShaderLoader;
import com.paneedah.weaponlib.shader.jim.Uniform;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

import java.nio.FloatBuffer;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@SideOnly(Side.CLIENT)
public final class OpticalScopePerspective extends WorldPerspective {

    private static final int DEFAULT_WIDTH = 200;
    private static final int DEFAULT_HEIGHT = 200;

    public OpticalScopePerspective() {
        width = DEFAULT_WIDTH;
        height = DEFAULT_HEIGHT;
    }

    @Override
    public void init() {
        final PlayerWeaponInstance instance = MWC.modContext.getMainHeldWeapon();

        if (instance != null) {
            final ItemScope scope = instance.getScope();
            if (scope.isOptical())
                setSize(scope.getWidth(), scope.getHeight());
        }

        super.init();
    }

    @Override
    public float getBrightness(final RenderContext<RenderableState> renderContext) {
        final PlayerWeaponInstance instance = renderContext.getWeaponInstance();

        if (instance == null)
            return 0;

        final boolean aimed = instance.isAimed();
        final float transitionProgress = Math.min(1, renderContext.getTransitionProgress());

        if (isAimingState(renderContext.getFromState()) && isAimingState(renderContext.getToState()))
            return 1;

        if (transitionProgress > 0 && aimed && isAimingState(renderContext.getToState()))
            return transitionProgress;

        if (isAimingState(renderContext.getFromState()) && transitionProgress > 0 && !aimed)
            return Math.max(1 - transitionProgress, 0);

        return 0;
    }

    private static boolean isAimingState(final RenderableState renderableState) {
        return renderableState == RenderableState.ZOOMING || renderableState == RenderableState.ZOOMING_RECOILED || renderableState == RenderableState.ZOOMING_SHOOTING;
    }

    @Override
    public void update(final TickEvent.RenderTickEvent renderTickEvent) {
        if(MC.isGamePaused())
            return;

        final PlayerWeaponInstance playerWeaponInstance = MWC.modContext.getMainHeldWeapon();

        if (playerWeaponInstance == null)
            return;

        final ItemScope scope = playerWeaponInstance.getScope();

        if (!scope.isOptical())
            return;

        setSize(scope.getWidth(), scope.getHeight());

        super.update(renderTickEvent);
    }

    public static final FloatBuffer PROJECTION_MATRIX_BUFFER = GLAllocation.createDirectFloatBuffer(16);

    public static final Uniform PROJECTION_MATRIX = shader -> {
        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, PROJECTION_MATRIX_BUFFER);

        PROJECTION_MATRIX_BUFFER.rewind();

        GL20.glUniformMatrix4(GL20.glGetUniformLocation(shader, "projection"), false, PROJECTION_MATRIX_BUFFER);
    };

    public static final Shader scope = ShaderLoader.loadShader("scope").withUniforms(PROJECTION_MATRIX);
}
