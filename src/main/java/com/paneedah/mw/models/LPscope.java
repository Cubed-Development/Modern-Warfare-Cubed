package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class LPscope extends ModelBase
{
  //fields
    ModelRenderer gun1;
    ModelRenderer gun4;
    ModelRenderer gun7;
    ModelRenderer gun9;
    ModelRenderer gun10;
    ModelRenderer gun11;
    ModelRenderer gun12;
  
  public LPscope()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      gun1 = new ModelRenderer(this, 0, 0);
      gun1.addBox(0F, 0F, 0F, 12, 1, 0);
      gun1.setRotationPoint(-5.5F, -10F, 0F);
      gun1.setTextureSize(64, 32);
      gun1.mirror = true;
      setRotation(gun1, 0F, 0F, 0F);
      gun4 = new ModelRenderer(this, 0, 0);
      gun4.addBox(0F, 0F, 0F, 1, 12, 0);
      gun4.setRotationPoint(0F, -15.5F, 0F);
      gun4.setTextureSize(64, 32);
      gun4.mirror = true;
      setRotation(gun4, 0F, 0F, 0F);
      gun7 = new ModelRenderer(this, 0, 20);
      gun7.addBox(0F, 0F, 0F, 1, 5, 0);
      gun7.setRotationPoint(0F, -3.5F, 0F);
      gun7.setTextureSize(64, 32);
      gun7.mirror = true;
      setRotation(gun7, 0F, 0F, 0F);
      gun9 = new ModelRenderer(this, 0, 20);
      gun9.addBox(0F, 0F, 0F, 1, 20, 0);
      gun9.setRotationPoint(0F, -35.5F, 0F);
      gun9.setTextureSize(64, 32);
      gun9.mirror = true;
      setRotation(gun9, 0F, 0F, 0F);
      gun10 = new ModelRenderer(this, 0, 20);
      gun10.addBox(0F, 0F, 0F, 22, 1, 0);
      gun10.setRotationPoint(6.5F, -10F, 0F);
      gun10.setTextureSize(64, 32);
      gun10.mirror = true;
      setRotation(gun10, 0F, 0F, 0F);
      gun11 = new ModelRenderer(this, 0, 20);
      gun11.addBox(0F, 0F, 0F, 22, 1, 0);
      gun11.setRotationPoint(-27.5F, -10F, 0F);
      gun11.setTextureSize(64, 32);
      gun11.mirror = true;
      setRotation(gun11, 0F, 0F, 0F);
      gun12 = new ModelRenderer(this, 0, 20);
      gun12.addBox(0F, 0F, 0F, 1, 15, 0);
      gun12.setRotationPoint(0F, 1.5F, 0F);
      gun12.setTextureSize(64, 32);
      gun12.mirror = true;
      setRotation(gun12, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    gun1.render(f5);
    gun4.render(f5);
    gun7.render(f5);
    gun9.render(f5);
    gun10.render(f5);
    gun11.render(f5);
    gun12.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
