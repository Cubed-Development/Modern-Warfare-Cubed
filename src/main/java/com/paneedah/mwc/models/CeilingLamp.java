// Date: 2/18/2019 4:54:45 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CeilingLamp extends ModelBase {
    //fields
    ModelRenderer light1;
    ModelRenderer light2;
    ModelRenderer light3;
    ModelRenderer light4;

    public CeilingLamp() {
        textureWidth = 128;
        textureHeight = 128;

        light1 = new ModelRenderer(this, 0, 0);
        light1.addBox(0F, 0F, 0F, 16, 3, 3);
        light1.setRotationPoint(-8F, 14F, -1.5F);
        light1.setTextureSize(128, 128);
        light1.mirror = true;
        setRotation(light1, 0F, 0F, 0F);
        light2 = new ModelRenderer(this, 0, 60);
        light2.addBox(0F, 0F, 0F, 16, 2, 2);
        light2.setRotationPoint(-8F, 17.5F, -1.4F);
        light2.setTextureSize(128, 128);
        light2.mirror = true;
        setRotation(light2, 0.7853982F, 0F, 0F);
        light3 = new ModelRenderer(this, 0, 20);
        light3.addBox(0F, 0F, 0F, 1, 3, 3);
        light3.setRotationPoint(-0.5F, 17.2F, -2.1F);
        light3.setTextureSize(128, 128);
        light3.mirror = true;
        setRotation(light3, 0.7853982F, 0F, 0F);
        light4 = new ModelRenderer(this, 0, 20);
        light4.addBox(0F, 0F, 0F, 1, 35, 1);
        light4.setRotationPoint(-0.7F, -21F, 0F);
        light4.setTextureSize(128, 128);
        light4.mirror = true;
        setRotation(light4, 0F, 0.7853982F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        light1.render(f5);
        light2.render(f5);
        light3.render(f5);
        light4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
