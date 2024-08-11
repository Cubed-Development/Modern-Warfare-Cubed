package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class K2C1Grip extends ModelWithAttachments {
    private final ModelRenderer Grip;
    private final ModelRenderer bone9_r1;
    private final ModelRenderer bone10_r1;
    private final ModelRenderer bone12_r1;
    private final ModelRenderer bone11_r1;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone10;
    private final ModelRenderer bone64;
    private final ModelRenderer bone9;

    public K2C1Grip() {
        textureWidth = 256;
        textureHeight = 256;

        Grip = new ModelRenderer(this);
        Grip.setRotationPoint(0.0F, 24.0F, 0.0F);
        Grip.cubeList.add(new ModelBox(Grip, 60, 85, -3.499F, -31.5598F, -5.3144F, 4, 3, 6, 0.0F, false));
        Grip.cubeList.add(new ModelBox(Grip, 36, 103, -3.5F, -31.7007F, -5.6818F, 4, 3, 1, 0.0F, false));

        bone9_r1 = new ModelRenderer(this);
        bone9_r1.setRotationPoint(-1.5F, -30.0F, 0.3F);
        Grip.addChild(bone9_r1);
        setRotationAngle(bone9_r1, 2.4871F, 0.0F, 0.0F);


        bone10_r1 = new ModelRenderer(this);
        bone10_r1.setRotationPoint(-1.5F, -27.0F, 1.3F);
        Grip.addChild(bone10_r1);
        setRotationAngle(bone10_r1, -2.4435F, 0.0F, 0.0F);


        bone12_r1 = new ModelRenderer(this);
        bone12_r1.setRotationPoint(-1.5F, -26.5F, -3.95F);
        Grip.addChild(bone12_r1);
        setRotationAngle(bone12_r1, -2.618F, 0.0F, 0.0F);


        bone11_r1 = new ModelRenderer(this);
        bone11_r1.setRotationPoint(-1.5F, -26.75F, 1.55F);
        Grip.addChild(bone11_r1);
        setRotationAngle(bone11_r1, -2.4435F, 0.0F, 0.0F);


        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(-1.5F, -26.75F, 1.55F);
        Grip.addChild(bone11);
        setRotationAngle(bone11, -2.4435F, 0.0F, 0.0F);
        bone11.cubeList.add(new ModelBox(bone11, 60, 0, -2.001F, -7.1955F, -0.4447F, 4, 11, 5, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(-1.5F, -26.5F, -3.95F);
        Grip.addChild(bone12);
        setRotationAngle(bone12, -2.618F, 0.0F, 0.0F);
        bone12.cubeList.add(new ModelBox(bone12, 27, 59, -2.0F, -8.2282F, -2.6006F, 4, 11, 3, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(-1.5F, -27.0F, 1.3F);
        Grip.addChild(bone10);
        setRotationAngle(bone10, -2.4435F, 0.0F, 0.0F);
        bone10.cubeList.add(new ModelBox(bone10, 0, 13, -2.0F, -7.2282F, -0.6006F, 4, 9, 1, 0.0F, false));

        bone64 = new ModelRenderer(this);
        bone64.setRotationPoint(0.0F, 10.25F, -4.25F);
        Grip.addChild(bone64);
        bone64.cubeList.add(new ModelBox(bone64, 43, 67, -3.5F, -31.5598F, 3.9356F, 4, 3, 3, 0.0F, false));
        bone64.cubeList.add(new ModelBox(bone64, 88, 95, -3.499F, -32.8098F, 3.6856F, 4, 4, 3, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(-1.5F, -30.0F, 0.3F);
        Grip.addChild(bone9);
        setRotationAngle(bone9, 2.4871F, 0.0F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 86, 43, -2.0F, -1.2282F, -0.6006F, 4, 3, 3, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        Grip.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
