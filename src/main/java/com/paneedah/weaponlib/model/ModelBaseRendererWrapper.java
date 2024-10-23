package com.paneedah.weaponlib.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import org.lwjgl.opengl.GL11;

public class ModelBaseRendererWrapper extends ModelRenderer {

    private final WrappableModel model;

    public ModelBaseRendererWrapper(WrappableModel model) {
        super(new ModelBase() {});
        this.model = model;
    }

    @Override
    public void render(float scale) {
        if (!isHidden) {
            if (showModel) {

                GL11.glPushMatrix();
                GL11.glTranslatef(rotationPointX * scale, rotationPointY * scale, rotationPointZ * scale);

                if (rotateAngleY != 0.0F) {
                    GL11.glRotatef(rotateAngleY * (180F / (float) Math.PI), 0.0F, 1.0F, 0.0F);
                }

                if (rotateAngleX != 0.0F) {
                    GL11.glRotatef(rotateAngleX * (180F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                }

                if (rotateAngleZ != 0.0F) {
                    GL11.glRotatef(rotateAngleZ * (180F / (float) Math.PI), 0.0F, 0.0F, 1.0F);
                }

                model.render(scale);

                GL11.glPopMatrix();
            }
        }

    }

}
