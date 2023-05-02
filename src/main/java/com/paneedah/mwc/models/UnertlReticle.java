// Date: 10/22/2017 12:23:42 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.paneedah.mwc.models;

import com.paneedah.mwc.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class UnertlReticle extends ModelWithAttachments
{
  //fields
    ModelRenderer reticle1;
    ModelRenderer reticle2;
    ModelRenderer reticle3;
    ModelRenderer reticle4;
    ModelRenderer reticle5;
    ModelRenderer reticle6;
  
  public UnertlReticle()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      reticle1 = new ModelRenderer(this, 0, 0);
      reticle1.addBox(0F, 0F, 0F, 2, 80, 0);
      reticle1.setRotationPoint(-0.5F, -56F, 0F);
      reticle1.setTextureSize(256, 256);
      reticle1.mirror = true;
      setRotation(reticle1, 0F, 0F, 0F);
      reticle2 = new ModelRenderer(this, 0, 0);
      reticle2.addBox(0F, 0F, 0F, 1, 25, 0);
      reticle2.setRotationPoint(0F, -81F, 0F);
      reticle2.setTextureSize(256, 256);
      reticle2.mirror = true;
      setRotation(reticle2, 0F, 0F, 0F);
      reticle3 = new ModelRenderer(this, 0, 0);
      reticle3.addBox(0F, 0F, 0F, 25, 1, 0);
      reticle3.setRotationPoint(-12F, -70F, 0F);
      reticle3.setTextureSize(256, 256);
      reticle3.mirror = true;
      setRotation(reticle3, 0F, 0F, 0F);
      reticle4 = new ModelRenderer(this, 0, 0);
      reticle4.addBox(0F, 0F, 0F, 2, 80, 0);
      reticle4.setRotationPoint(-0.5F, -161F, 0F);
      reticle4.setTextureSize(256, 256);
      reticle4.mirror = true;
      setRotation(reticle4, 0F, 0F, 0F);
      reticle5 = new ModelRenderer(this, 0, 0);
      reticle5.addBox(0F, 0F, 0F, 80, 2, 0);
      reticle5.setRotationPoint(-92F, -70.5F, 0F);
      reticle5.setTextureSize(256, 256);
      reticle5.mirror = true;
      setRotation(reticle5, 0F, 0F, 0F);
      reticle6 = new ModelRenderer(this, 0, 0);
      reticle6.addBox(0F, 0F, 0F, 80, 2, 0);
      reticle6.setRotationPoint(13F, -70.5F, 0F);
      reticle6.setTextureSize(256, 256);
      reticle6.mirror = true;
      setRotation(reticle6, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    reticle1.render(f5);
    reticle2.render(f5);
    reticle3.render(f5);
    reticle4.render(f5);
    reticle5.render(f5);
    reticle6.render(f5);
  }

}
