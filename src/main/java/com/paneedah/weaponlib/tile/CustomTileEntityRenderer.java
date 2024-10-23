package com.paneedah.weaponlib.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.function.Consumer;

/**
 * Custom renderer for TileEntity with a specified model and texture.
 *
 * @param <T> The type of CustomTileEntity being rendered.
 */
public class CustomTileEntityRenderer<T extends CustomTileEntity<?>>
        extends net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<T> {

    private static final float TRANSLATE_Y = 1.0F;
    private static final float SCALE_FACTOR = 1.0F;
    private static final float ROTATION_ANGLE = 90f;
    private static final float MODEL_RENDER_SCALE = 0.0625f;

    private final ModelBase model;
    private final ResourceLocation textureResource;
    private final Consumer<TileEntity> positioning;

    public CustomTileEntityRenderer(ModelBase model, ResourceLocation textureResource,
                                    Consumer<TileEntity> positioning) {
        this.model = model;
        this.textureResource = textureResource;
        this.positioning = positioning;
    }

    /**
     * Renders the tile entity with appropriate transformations.
     *
     * @param tileEntity    The tile entity being rendered.
     * @param posX         The x position for rendering.
     * @param posY         The y position for rendering.
     * @param posZ         The z position for rendering.
     * @param partialTicks  Partial ticks for smoother rendering.
     * @param destroyStage  The destroy stage of the block.
     * @param alpha        The alpha value for transparency.
     */
    @Override
    public void render(T tileEntity, double posX, double posY, double posZ,
                       float partialTicks, int destroyStage, float alpha) {
        GL11.glPushMatrix();
        bindTexture(textureResource);
        setupRenderingTransformations(tileEntity, posX, posY, posZ);

        // Call the positioning consumer to apply additional transformations if necessary
        positioning.accept(tileEntity);

        // Render the model
        model.render(null, 0f, 0f, 0f, 0f, 0f, MODEL_RENDER_SCALE);

        GL11.glPopMatrix();
    }

    /**
     * Sets up the rendering transformations based on tile entity's position and orientation.
     *
     * @param tileEntity The tile entity being rendered.
     * @param posX      The x position for rendering.
     * @param posY      The y position for rendering.
     * @param posZ      The z position for rendering.
     */
    private void setupRenderingTransformations(T tileEntity, double posX, double posY, double posZ) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glTranslatef((float) posX, (float) posY + TRANSLATE_Y, (float) posZ + TRANSLATE_Y);
        GL11.glScalef(SCALE_FACTOR, -SCALE_FACTOR, -SCALE_FACTOR);
        GL11.glTranslatef(0.5F, 0.5F, 0.5F);

        // Rotate based on the side of the tile entity
        GL11.glRotatef(ROTATION_ANGLE * tileEntity.getSide(), 0, 1f, 0);
        GL11.glRotatef(-ROTATION_ANGLE, 0, 1f, 0);

        GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
        GL11.glTranslatef(0F, -0.5F, 0F);
    }
}
