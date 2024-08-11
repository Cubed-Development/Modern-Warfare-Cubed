package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACRAction2 extends ModelWithAttachments {
    private final ModelRenderer action2;
    private final ModelRenderer ACR140_r1;
    private final ModelRenderer ACR139_r1;

    public ACRAction2() {
        textureWidth = 400;
        textureHeight = 400;

        action2 = new ModelRenderer(this);
        action2.setRotationPoint(-1.1443F, -16.189F, -28.8415F);
        action2.cubeList.add(new ModelBox(action2, 68, 169, -2.4557F, 1.689F, 6.8415F, 1, 2, 10, 0.0F, false));
        action2.cubeList.add(new ModelBox(action2, 116, 67, -2.3557F, 0.689F, 6.8415F, 1, 2, 10, 0.0F, false));

        ACR140_r1 = new ModelRenderer(this);
        ACR140_r1.setRotationPoint(-22.358F, -33.3746F, 28.8415F);
        action2.addChild(ACR140_r1);
        setRotationAngle(ACR140_r1, 0.0F, 0.0F, 2.5133F);
        ACR140_r1.cubeList.add(new ModelBox(ACR140_r1, 32, 184, 0.2F, -40.6F, -36.0F, 1, 1, 14, 0.0F, false));

        ACR139_r1 = new ModelRenderer(this);
        ACR139_r1.setRotationPoint(32.5118F, 21.3543F, 28.8415F);
        action2.addChild(ACR139_r1);
        setRotationAngle(ACR139_r1, 0.0F, 0.0F, -0.9295F);
        ACR139_r1.cubeList.add(new ModelBox(ACR139_r1, 32, 184, -3.1F, -40.7F, -36.0F, 1, 1, 14, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        action2.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
