package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class APShammer extends ModelWithAttachments {
    private final ModelRenderer hammer;
    private final ModelRenderer gun1822;
    private final ModelRenderer gun168;
    private final ModelRenderer gun169;
    private final ModelRenderer gun167;
    private final ModelRenderer gun183;

    public APShammer() {
        textureWidth = 150;
        textureHeight = 150;

        hammer = new ModelRenderer(this);
        hammer.setRotationPoint(0.0F, -9.4F, 2.3F);
        setRotationAngle(hammer, -0.8378F, 0.0F, 0.0F);


        gun1822 = new ModelRenderer(this);
        gun1822.setRotationPoint(-2.0F, -2.0F, 0.7F);
        hammer.addChild(gun1822);
        setRotationAngle(gun1822, -0.7436F, 0.0F, 0.0F);
        gun1822.cubeList.add(new ModelBox(gun1822, 9, 77, -0.001F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        gun168 = new ModelRenderer(this);
        gun168.setRotationPoint(-2.0F, -2.0F, 0.7F);
        hammer.addChild(gun168);
        setRotationAngle(gun168, -0.7436F, 0.0F, 0.0F);
        gun168.cubeList.add(new ModelBox(gun168, 54, 76, -0.002F, 0.3F, 0.2F, 1, 2, 1, 0.0F, false));

        gun169 = new ModelRenderer(this);
        gun169.setRotationPoint(-2.0F, -2.0F, 0.7F);
        hammer.addChild(gun169);
        setRotationAngle(gun169, -0.7436F, 0.0F, 0.0F);
        gun169.cubeList.add(new ModelBox(gun169, 50, 76, 0.0F, 0.3F, -0.2F, 1, 2, 1, 0.0F, false));

        gun167 = new ModelRenderer(this);
        gun167.setRotationPoint(-2.5F, -0.4F, 1.2F);
        hammer.addChild(gun167);
        setRotationAngle(gun167, -2.1192F, 0.0F, 0.0F);
        gun167.cubeList.add(new ModelBox(gun167, 21, 26, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        gun183 = new ModelRenderer(this);
        gun183.setRotationPoint(-2.5F, -0.4F, 1.2F);
        hammer.addChild(gun183);
        setRotationAngle(gun183, -1.45F, 0.0F, 0.0F);
        gun183.cubeList.add(new ModelBox(gun183, 42, 76, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        hammer.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
