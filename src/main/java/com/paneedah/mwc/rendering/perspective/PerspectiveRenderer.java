package com.paneedah.mwc.rendering.perspective;

import com.paneedah.mwc.models.Viewfinder;
import com.paneedah.weaponlib.CustomRenderer;
import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.RenderableState;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Arrays;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@SideOnly(Side.CLIENT)
public class PerspectiveRenderer implements CustomRenderer<RenderableState> {

    protected static final ArrayList<ItemCameraTransforms.TransformType> FIRST_PERSON_HANDS_TRANSFORM_TYPES = new ArrayList<>(Arrays.asList(
            ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND,
            ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND
    ));

    private static final Perspective STATIC_TEXTURE_PERSPECTIVE = new StaticTexturePerspective();

    protected final Runnable positioning;
    protected Viewfinder viewfinder = new Viewfinder();

    public PerspectiveRenderer(final Runnable positioning) {
        this.positioning = positioning;
    }

    @Override
    public void render(final RenderContext<RenderableState> renderContext) {
        if (!FIRST_PERSON_HANDS_TRANSFORM_TYPES.contains(renderContext.getTransformType()))
            return;

        final Perspective perspective = getPerspective(renderContext);

        final float brightness = perspective.getBrightness(renderContext);

        GL11.glPushMatrix();
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);

        positioning.run();

        //GL11.glBindTexture(GL11.GL_TEXTURE_2D, framebuffer.framebufferTexture);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, perspective.getTexture());
        MC.entityRenderer.disableLightmap();
        GL11.glEnable(GL11.GL_DEPTH_TEST);
        //GL11.glDepthMask(true);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glDisable(GL11.GL_BLEND);

        GL11.glColor4f(brightness, brightness, brightness, 1);

        viewfinder.render(
                renderContext.getEntityLiving(),
                renderContext.getLimbSwing(),
                renderContext.getFlimbSwingAmount(),
                renderContext.getAgeInTicks(),
                renderContext.getNetHeadYaw(),
                renderContext.getHeadPitch(),
                renderContext.getScale()
        );

        MC.entityRenderer.enableLightmap();

        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }

    protected final Perspective getPerspective(RenderContext<RenderableState> renderContext) {
        Perspective perspective = PerspectiveManager.getPerspective(renderContext.getPlayerItemInstance(), false);

        if (perspective == null)
            perspective = STATIC_TEXTURE_PERSPECTIVE;

        return perspective;
    }

    private static final class StaticTexturePerspective extends Perspective {

        private Integer textureId;

        @Override
        public void update(final TickEvent.RenderTickEvent renderTickEvent) {

        }

        @Override
        public int getTexture() {
            if (textureId == null) {
                final ResourceLocation textureResource = new ResourceLocation(WirelessCameraPerspective.DARK_SCREEN_TEXTURE);

                MC.getTextureManager().bindTexture(textureResource);

                final ITextureObject textureObject = MC.getTextureManager().getTexture(textureResource);
                if (textureObject != null)
                    textureId = textureObject.getGlTextureId();
            }

            return textureId;
        }

        @Override
        public float getBrightness(final RenderContext<RenderableState> context) {
            return 0;
        }
    }
}
