package com.paneedah.mwc.weaponlib.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import org.lwjgl.opengl.GL11;

public class ModelBaseRendererWrapper extends ModelRenderer {
    
    private WrappableModel model;

    public ModelBaseRendererWrapper(WrappableModel model) {
        super(new ModelBase() {});
        this.model = model;
    }
    
    @Override
    public void render(float scale) {
        if (!this.isHidden)
        {
            if (this.showModel)
            {

                GL11.glPushMatrix();
                GL11.glTranslatef(this.rotationPointX * scale, this.rotationPointY * scale, this.rotationPointZ * scale);

                if (this.rotateAngleY != 0.0F)
                {
                    GL11.glRotatef(this.rotateAngleY * (180F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
                }

                if (this.rotateAngleX != 0.0F)
                {
                    GL11.glRotatef(this.rotateAngleX * (180F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
                }

                if (this.rotateAngleZ != 0.0F)
                {
                    GL11.glRotatef(this.rotateAngleZ * (180F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
                }

                model.render(scale);
                
                GL11.glPopMatrix();
            }
        }
        
    }

}
