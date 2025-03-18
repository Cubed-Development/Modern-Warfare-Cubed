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
        if (!this.isHidden) {
            if (this.showModel) {

                GL11.glPushMatrix();
                GL11.glTranslatef(this.rotationPointX * scale, this.rotationPointY * scale, this.rotationPointZ * scale);

                if (this.rotateAngleY != 0) {
                    GL11.glRotatef(this.rotateAngleY * (180F / (float) Math.PI), 0, 1, 0);
                }

                if (this.rotateAngleX != 0) {
                    GL11.glRotatef(this.rotateAngleX * (180F / (float) Math.PI), 1, 0, 0);
                }

                if (this.rotateAngleZ != 0) {
                    GL11.glRotatef(this.rotateAngleZ * (180F / (float) Math.PI), 0, 0, 1);
                }

                model.render(scale);

                GL11.glPopMatrix();
            }
        }

    }

}
