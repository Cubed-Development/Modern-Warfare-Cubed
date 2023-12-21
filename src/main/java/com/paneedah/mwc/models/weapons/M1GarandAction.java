// Date: 10/13/2017 8:24:25 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class M1GarandAction extends ModelBase
{
  //fields
    
    ModelRenderer action1;
    ModelRenderer action2;
    ModelRenderer action3;
    ModelRenderer action4;
    ModelRenderer action5;
    ModelRenderer action6;
    ModelRenderer action7;
    ModelRenderer action8;
    ModelRenderer action9;
    ModelRenderer action10;
    ModelRenderer action11;
    ModelRenderer action12;
    ModelRenderer action13;
    ModelRenderer action14;
  
  public M1GarandAction()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      
      action1 = new ModelRenderer(this, 150, 0);
      action1.addBox(0F, 0F, 0F, 2, 1, 1);
      action1.setRotationPoint(-5F, -13.5F, -21F);
      action1.setTextureSize(64, 32);
      action1.mirror = true;
      setRotation(action1, 0F, 0F, 0F);
      action2 = new ModelRenderer(this, 150, 0);
      action2.addBox(0F, 0F, 0F, 1, 1, 1);
      action2.setRotationPoint(-5.5F, -13.5F, -21F);
      action2.setTextureSize(64, 32);
      action2.mirror = true;
      setRotation(action2, 0F, 0F, 0F);
      action3 = new ModelRenderer(this, 150, 0);
      action3.addBox(0F, 0F, 0F, 2, 1, 1);
      action3.setRotationPoint(-5.5F, -13.5F, -21F);
      action3.setTextureSize(64, 32);
      action3.mirror = true;
      setRotation(action3, 0F, 0.2602503F, 0F);
      action4 = new ModelRenderer(this, 150, 0);
      action4.addBox(0F, 0F, 0F, 1, 1, 1);
      action4.setRotationPoint(-1.5F, -14.5F, -22.5F);
      action4.setTextureSize(64, 32);
      action4.mirror = true;
      setRotation(action4, 0F, 0F, 1.375609F);
      action5 = new ModelRenderer(this, 150, 0);
      action5.addBox(0F, 0F, 0F, 1, 1, 1);
      action5.setRotationPoint(-1.5F, -14.5F, -22.5F);
      action5.setTextureSize(64, 32);
      action5.mirror = true;
      setRotation(action5, 0F, 0F, 0.2602503F);
      action6 = new ModelRenderer(this, 150, 0);
      action6.addBox(0F, 0F, 0F, 1, 1, 7);
      action6.setRotationPoint(-1.5F, -14F, -21.5F);
      action6.setTextureSize(64, 32);
      action6.mirror = true;
      setRotation(action6, 0F, 0F, 0.2602503F);
      action7 = new ModelRenderer(this, 150, 0);
      action7.addBox(0F, 0F, 0F, 1, 1, 7);
      action7.setRotationPoint(-1.5F, -14F, -21.5F);
      action7.setTextureSize(64, 32);
      action7.mirror = true;
      setRotation(action7, 0F, 0F, 1.375609F);
      action8 = new ModelRenderer(this, 150, 0);
      action8.addBox(0F, 0F, 0F, 1, 1, 1);
      action8.setRotationPoint(-2F, -14.4F, -22.5F);
      action8.setTextureSize(64, 32);
      action8.mirror = true;
      setRotation(action8, 0F, 0F, 1.375609F);
      action9 = new ModelRenderer(this, 150, 0);
      action9.addBox(0F, 0F, 0F, 1, 1, 7);
      action9.setRotationPoint(-2F, -13.9F, -21.5F);
      action9.setTextureSize(64, 32);
      action9.mirror = true;
      setRotation(action9, 0F, 0F, 1.375609F);
      action10 = new ModelRenderer(this, 150, 0);
      action10.addBox(0F, 0F, 0F, 1, 1, 1);
      action10.setRotationPoint(-3F, -14.2F, -22.5F);
      action10.setTextureSize(64, 32);
      action10.mirror = true;
      setRotation(action10, 0F, 0F, 0.4461433F);
      action11 = new ModelRenderer(this, 150, 0);
      action11.addBox(0F, 0F, 0F, 1, 1, 7);
      action11.setRotationPoint(-3F, -13.7F, -21.5F);
      action11.setTextureSize(64, 32);
      action11.mirror = true;
      setRotation(action11, 0F, 0F, 0.4461433F);
      action12 = new ModelRenderer(this, 150, 0);
      action12.addBox(0F, 0F, 0F, 1, 1, 1);
      action12.setRotationPoint(-4F, -14.5F, -23.5F);
      action12.setTextureSize(64, 32);
      action12.mirror = true;
      setRotation(action12, 0F, 0F, 0F);
      action13 = new ModelRenderer(this, 150, 0);
      action13.addBox(0F, 0F, 0F, 1, 1, 2);
      action13.setRotationPoint(-4F, -14.5F, -22.5F);
      action13.setTextureSize(64, 32);
      action13.mirror = true;
      setRotation(action13, -1.041001F, 0F, 0F);
      action14 = new ModelRenderer(this, 150, 0);
      action14.addBox(0F, 0F, 0F, 1, 1, 3);
      action14.setRotationPoint(-4F, -13.5F, -23.5F);
      action14.setTextureSize(64, 32);
      action14.mirror = true;
      setRotation(action14, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    action1.render(f5);
    action2.render(f5);
    action3.render(f5);
    action4.render(f5);
    action5.render(f5);
    action6.render(f5);
    action7.render(f5);
    action8.render(f5);
    action9.render(f5);
    action10.render(f5);
    action11.render(f5);
    action12.render(f5);
    action13.render(f5);
    action14.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}