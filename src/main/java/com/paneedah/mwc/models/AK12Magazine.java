// Date: 2/19/2017 1:59:55 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class AK12Magazine extends ModelBase {
    //fields
    ModelRenderer Mag1;
    ModelRenderer Mag2;
    ModelRenderer Mag3;
    ModelRenderer Mag4;
    ModelRenderer Mag5;
    ModelRenderer Mag6;

    public AK12Magazine() {
        textureWidth = 64;
        textureHeight = 32;

        Mag1 = new ModelRenderer(this, 0, 0);
        Mag1.addBox(0F, 0F, 0F, 4, 7, 6);
        Mag1.setRotationPoint(-3.5F, -8.5F, -19.3F);
        Mag1.setTextureSize(64, 32);
        Mag1.mirror = true;
        setRotation(Mag1, -0.1115358F, 0F, 0F);
        Mag2 = new ModelRenderer(this, 0, 0);
        Mag2.addBox(0F, 0F, 0F, 4, 6, 6);
        Mag2.setRotationPoint(-3.5F, -0.9F, -14.1F);
        Mag2.setTextureSize(64, 32);
        Mag2.mirror = true;
        setRotation(Mag2, -1.821752F, 0F, 0F);
        Mag3 = new ModelRenderer(this, 0, 0);
        Mag3.addBox(0F, 0F, 0F, 4, 6, 7);
        Mag3.setRotationPoint(-3.5F, 4.9F, -15.55F);
        Mag3.setTextureSize(64, 32);
        Mag3.mirror = true;
        setRotation(Mag3, -1.970466F, 0F, 0F);
        Mag4 = new ModelRenderer(this, 0, 0);
        Mag4.addBox(0F, 0F, 0F, 3, 7, 2);
        Mag4.setRotationPoint(-3F, -8.65F, -20.6F);
        Mag4.setTextureSize(64, 32);
        Mag4.mirror = true;
        setRotation(Mag4, -0.1115358F, 0F, 0F);
        Mag5 = new ModelRenderer(this, 0, 0);
        Mag5.addBox(0F, 0F, 0F, 3, 2, 6);
        Mag5.setRotationPoint(-3F, -2.2F, -19.2F);
        Mag5.setTextureSize(64, 32);
        Mag5.mirror = true;
        setRotation(Mag5, -1.821752F, 0F, 0F);
        Mag6 = new ModelRenderer(this, 0, 0);
        Mag6.addBox(0F, 0F, 0F, 3, 2, 7);
        Mag6.setRotationPoint(-3F, 2.9F, -20.4F);
        Mag6.setTextureSize(64, 32);
        Mag6.mirror = true;
        setRotation(Mag6, -1.970466F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Mag1.render(f5);
        Mag2.render(f5);
        Mag3.render(f5);
        Mag4.render(f5);
        Mag5.render(f5);
        Mag6.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
