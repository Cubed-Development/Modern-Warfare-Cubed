package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AUG9mmConversionkit extends ModelWithAttachments {
    private final ModelRenderer conversionkit9mm;
    private final ModelRenderer conversionkit18_r1;
    private final ModelRenderer conversionkit17_r1;
    private final ModelRenderer conversionkit15_r1;
    private final ModelRenderer conversionkit14_r1;
    private final ModelRenderer conversionkit12_r1;
    private final ModelRenderer conversionkit9_r1;
    private final ModelRenderer conversionkit7_r1;
    private final ModelRenderer conversionkit4_r1;

    public AUG9mmConversionkit() {
        textureWidth = 300;
        textureHeight = 300;

        conversionkit9mm = new ModelRenderer(this);
        conversionkit9mm.setRotationPoint(-1.3611F, 1.993F, 15.7098F);


        conversionkit18_r1 = new ModelRenderer(this);
        conversionkit18_r1.setRotationPoint(1.3611F, 21.9904F, -16.6018F);
        conversionkit9mm.addChild(conversionkit18_r1);
        setRotationAngle(conversionkit18_r1, -0.0372F, 0.0F, 0.0F);
        conversionkit18_r1.cubeList.add(new ModelBox(conversionkit18_r1, 88, 62, -3.0F, -19.1F, 10.8F, 3, 1, 1, 0.0F, false));

        conversionkit17_r1 = new ModelRenderer(this);
        conversionkit17_r1.setRotationPoint(1.3611F, 21.5808F, -16.6351F);
        conversionkit9mm.addChild(conversionkit17_r1);
        setRotationAngle(conversionkit17_r1, -0.0372F, 0.0F, 0.0F);
        conversionkit17_r1.cubeList.add(new ModelBox(conversionkit17_r1, 47, 41, -0.8F, -19.1F, 11.1F, 1, 1, 5, 0.0F, false));
        conversionkit17_r1.cubeList.add(new ModelBox(conversionkit17_r1, 72, 71, -3.2F, -19.1F, 11.1F, 1, 1, 5, 0.0F, false));
        conversionkit17_r1.cubeList.add(new ModelBox(conversionkit17_r1, 22, 60, -1.3F, -25.1F, 15.7F, 1, 7, 1, 0.0F, false));
        conversionkit17_r1.cubeList.add(new ModelBox(conversionkit17_r1, 0, 27, -2.7F, -25.1F, 15.7F, 2, 7, 1, 0.0F, false));
        conversionkit17_r1.cubeList.add(new ModelBox(conversionkit17_r1, 17, 27, -2.5F, -25.1F, 11.0F, 2, 7, 1, 0.0F, false));
        conversionkit17_r1.cubeList.add(new ModelBox(conversionkit17_r1, 67, 18, -3.0F, -25.1F, 11.3F, 3, 7, 5, 0.0F, false));

        conversionkit15_r1 = new ModelRenderer(this);
        conversionkit15_r1.setRotationPoint(1.3611F, 21.3875F, -16.6315F);
        conversionkit9mm.addChild(conversionkit15_r1);
        setRotationAngle(conversionkit15_r1, -0.0372F, 0.0F, 0.0F);
        conversionkit15_r1.cubeList.add(new ModelBox(conversionkit15_r1, 0, 15, -2.5F, -25.1F, 16.2F, 2, 6, 2, 0.0F, false));

        conversionkit14_r1 = new ModelRenderer(this);
        conversionkit14_r1.setRotationPoint(1.3611F, -29.5634F, 8.2211F);
        conversionkit9mm.addChild(conversionkit14_r1);
        setRotationAngle(conversionkit14_r1, -2.4538F, 0.0F, 0.0F);
        conversionkit14_r1.cubeList.add(new ModelBox(conversionkit14_r1, 32, 0, -1.7F, -21.5F, 21.2F, 1, 4, 4, 0.0F, false));
        conversionkit14_r1.cubeList.add(new ModelBox(conversionkit14_r1, 32, 12, -2.3F, -21.5F, 21.2F, 1, 4, 4, 0.0F, false));

        conversionkit12_r1 = new ModelRenderer(this);
        conversionkit12_r1.setRotationPoint(1.3611F, -31.0888F, 0.8498F);
        conversionkit9mm.addChild(conversionkit12_r1);
        setRotationAngle(conversionkit12_r1, -2.1935F, 0.0F, 0.0F);
        conversionkit12_r1.cubeList.add(new ModelBox(conversionkit12_r1, 14, 0, -1.7F, -22.3F, 21.9F, 1, 4, 1, 0.0F, false));
        conversionkit12_r1.cubeList.add(new ModelBox(conversionkit12_r1, 21, 0, -2.3F, -22.3F, 21.9F, 1, 4, 1, 0.0F, false));

        conversionkit9_r1 = new ModelRenderer(this);
        conversionkit9_r1.setRotationPoint(1.3611F, 8.9454F, 24.4802F);
        conversionkit9mm.addChild(conversionkit9_r1);
        setRotationAngle(conversionkit9_r1, 2.1118F, 0.0F, 0.0F);
        conversionkit9_r1.cubeList.add(new ModelBox(conversionkit9_r1, 17, 15, -2.5F, -17.9F, 16.4F, 2, 7, 1, 0.0F, false));

        conversionkit7_r1 = new ModelRenderer(this);
        conversionkit7_r1.setRotationPoint(1.3611F, 22.6917F, 2.121F);
        conversionkit9mm.addChild(conversionkit7_r1);
        setRotationAngle(conversionkit7_r1, 0.6692F, 0.0F, 0.0F);
        conversionkit7_r1.cubeList.add(new ModelBox(conversionkit7_r1, 77, 40, -3.0F, -25.3F, 9.9F, 3, 3, 1, 0.0F, false));

        conversionkit4_r1 = new ModelRenderer(this);
        conversionkit4_r1.setRotationPoint(1.3611F, 19.7057F, -20.3984F);
        conversionkit9mm.addChild(conversionkit4_r1);
        setRotationAngle(conversionkit4_r1, -0.1859F, 0.0F, 0.0F);
        conversionkit4_r1.cubeList.add(new ModelBox(conversionkit4_r1, 88, 64, -3.3F, -26.3F, 17.7F, 3, 1, 1, 0.0F, false));
        conversionkit4_r1.cubeList.add(new ModelBox(conversionkit4_r1, 38, 0, -0.7F, -26.3F, 17.7F, 1, 1, 1, 0.0F, false));
        conversionkit4_r1.cubeList.add(new ModelBox(conversionkit4_r1, 8, 71, -0.7F, -26.3F, 10.0F, 1, 1, 8, 0.0F, false));
        conversionkit4_r1.cubeList.add(new ModelBox(conversionkit4_r1, 88, 60, -3.3F, -26.3F, 10.0F, 3, 1, 8, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        conversionkit9mm.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
