package com.paneedah.mwc.rendering.renderer;

import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.tile.CustomTileEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.function.Consumer;

public class CustomTileEntityRenderer extends net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<CustomTileEntity<?>> {

    private boolean modern;

    private Transform transform;

    private ModelBase model;
    private ResourceLocation textureResource;
    private Consumer<TileEntity> positioning;

    public CustomTileEntityRenderer(ModelBase model, ResourceLocation textureResource, Consumer<TileEntity> positioning, boolean modern, Transform transform) {
        this.model = model;
        this.textureResource = textureResource;
        this.positioning = positioning;
        this.modern = modern;
        this.transform = transform;
    }

    @Override
    public void render(CustomTileEntity<?> tileEntity, double posX, double posY, double posZ, float partialTicks, int destroyStage, float alpha) {
        GL11.glPushMatrix();

        bindTexture(textureResource);

        GL11.glColor4f(1F, 1F, 1F, 1F);

        if (modern) {
            GL11.glTranslatef((float) posX + 0.5F, (float) posY + 1.5F, (float) posZ + 0.5F);

            GL11.glRotatef(-90F * tileEntity.getSide(), 0F, 1F, 0F);

            GL11.glScalef(1F, -1F, -1F);

            transform.applyTransformations();
        } else {
            GL11.glTranslatef((float) posX, (float) posY + 1F, (float) posZ + 1F);

            GL11.glScalef(1F, -1F, -1F);

            GL11.glTranslatef(0.5F, 0.5F, 0.5F);

            GL11.glRotatef(90F * tileEntity.getSide(), 0F, 1f, 0F);

            GL11.glRotatef(-90F, 0F, 1F, 0F);

            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);

            GL11.glTranslatef(0F, -0.5F, 0F);

            positioning.accept(tileEntity);
        }

        model.render(null, 0F, 0F, 0F, 0F, 0F, 0.0625F);

        GL11.glPopMatrix();
    }
}
