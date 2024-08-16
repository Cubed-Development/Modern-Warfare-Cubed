package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ARCarryHandle extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone3;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone23;

    public ARCarryHandle() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, -4.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 62, 0, -1.0F, -1.0F, -1.0F, 1, 5, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 10, 54, 2.0F, -1.0F, -1.0F, 1, 5, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 21, 23, 0.0F, 1.0F, -1.0F, 2, 3, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 8, 36, 0.0F, -2.0F, -1.0F, 2, 1, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 8, 71, -3.5F, 4.0F, -6.0F, 9, 3, 11, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 88, 0, -2.51F, 4.05F, -67.0F, 7, 1, 61, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 144, 62, -2.52F, 1.15F, -42.0F, 1, 3, 36, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 142, 143, 3.48F, 1.15F, -42.0F, 1, 3, 36, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 71, 143, -1.5F, 5.05F, -67.0F, 5, 1, 61, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 21, 52, -1.5F, 6.05F, -63.5F, 5, 8, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 73, 71, -2.5F, 7.0F, -6.0F, 7, 2, 12, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 21, 28, 0.0F, 6.99F, 5.5F, 2, 2, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, 13.0F, -12.0F, 7, 3, 20, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, 13.2F, -69.5F, 10, 3, 68, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 73, 85, -2.49F, 5.0F, -12.0F, 7, 8, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 42, 79, -2.5F, 5.75F, -69.51F, 7, 8, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 8, 85, -3.0F, 9.1F, -5.5F, 8, 3, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 21, 44, -4.5F, 9.09F, -3.0F, 11, 3, 5, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 12, -2.49F, 9.0F, 5.0F, 7, 4, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 25, 52, -2.499F, 12.3F, -6.0F, 7, 1, 13, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 88, 14, -3.5F, 1.0F, -6.0F, 1, 3, 11, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 88, 0, 4.5F, 1.0F, -6.0F, 1, 3, 11, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 73, 71, 3.75F, -1.0F, -9.75F, 2, 8, 4, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 44, -3.75F, -1.0F, -9.75F, 2, 8, 4, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 141, 6.0F, 14.0F, -70.001F, 1, 2, 69, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 44, -5.0F, 12.7F, -18.0F, 2, 4, 17, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 23, -5.0F, 12.7F, -70.0F, 2, 4, 17, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 2.0F, 0.0F);
        bone.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.0F, 0.7854F);
        bone2.cubeList.add(new ModelBox(bone2, 10, 26, -1.4F, -1.0F, -1.01F, 1, 1, 2, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(2.3F, -0.3F, 0.0F);
        bone.addChild(bone4);
        setRotationAngle(bone4, 0.0F, 0.0F, 0.7854F);
        bone4.cubeList.add(new ModelBox(bone4, 10, 23, -1.0F, -1.001F, -0.99F, 1, 1, 2, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 23, -1.4F, -1.0F, -1.01F, 1, 1, 2, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(2.0F, 2.0F, 0.0F);
        bone.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0F, 0.7854F);
        bone3.cubeList.add(new ModelBox(bone3, 0, 26, -1.0F, -1.4F, -1.01F, 1, 1, 2, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(-0.3F, -0.3F, 0.0F);
        bone.addChild(bone5);
        setRotationAngle(bone5, 0.0F, 0.0F, 0.7854F);
        bone5.cubeList.add(new ModelBox(bone5, 0, 3, -1.001F, -1.0F, -0.99F, 1, 1, 2, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -1.0F, -1.4F, -1.01F, 1, 1, 2, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(-2.0F, 3.6F, -0.7F);
        bone.addChild(bone6);
        setRotationAngle(bone6, -0.4538F, 0.0F, 0.0F);
        bone6.cubeList.add(new ModelBox(bone6, 0, 17, -1.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F, false));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(5.5F, 1.0F, 5.0F);
        bone.addChild(bone7);
        setRotationAngle(bone7, 2.5831F, 0.0F, 0.0F);
        bone7.cubeList.add(new ModelBox(bone7, 51, 97, -1.01F, -4.0F, 0.0F, 1, 4, 6, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 38, 34, -8.99F, -4.0F, 0.0F, 1, 4, 6, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(5.5F, -2.2F, -0.1F);
        bone.addChild(bone8);
        setRotationAngle(bone8, -1.501F, 0.0F, 0.0F);
        bone8.cubeList.add(new ModelBox(bone8, 88, 0, -0.99F, 0.0F, 0.0F, 1, 6, 4, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 37, 71, -1.74F, 5.7674F, 0.0478F, 2, 7, 3, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 8, 71, -9.24F, 5.7674F, 0.0478F, 2, 7, 3, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 8, 85, -9.01F, 0.0F, 0.0F, 1, 6, 4, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.0F, 7.0F, 7.0F);
        bone.addChild(bone9);
        setRotationAngle(bone9, -1.1345F, 0.0F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 88, 50, 0.0F, -0.5438F, 0.2536F, 2, 2, 9, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 21, 23, -2.51F, 1.1782F, -0.2F, 7, 2, 9, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, -0.4532F, 0.2113F);
        bone9.addChild(bone10);
        setRotationAngle(bone10, 0.0F, 0.0F, -0.5934F);
        bone10.cubeList.add(new ModelBox(bone10, 88, 39, -2.9493F, -0.0751F, 0.0423F, 3, 2, 9, 0.0F, false));

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(2.0F, -0.4532F, 0.2113F);
        bone9.addChild(bone11);
        setRotationAngle(bone11, 0.0F, 0.0F, 0.5934F);
        bone11.cubeList.add(new ModelBox(bone11, 88, 28, -0.0507F, -0.0751F, 0.0423F, 3, 2, 9, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, 7.0F, 7.5F);
        bone.addChild(bone12);
        setRotationAngle(bone12, 0.0F, -0.5934F, 0.0F);
        bone12.cubeList.add(new ModelBox(bone12, 0, 65, -3.0F, 0.01F, -2.0F, 3, 1, 2, 0.0F, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(2.0F, 7.0F, 7.5F);
        bone.addChild(bone13);
        setRotationAngle(bone13, 0.0F, 0.5934F, 0.0F);
        bone13.cubeList.add(new ModelBox(bone13, 0, 56, 0.0F, 0.01F, -2.0F, 3, 1, 2, 0.0F, false));

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(6.5F, 14.0F, -70.0F);
        bone.addChild(bone14);
        setRotationAngle(bone14, 0.0F, 0.0F, 0.7854F);
        bone14.cubeList.add(new ModelBox(bone14, 0, 71, -1.6464F, -0.3536F, 0.0F, 2, 1, 69, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 73, 72, 0.7678F, 1.0607F, 0.0F, 1, 2, 69, 0.0F, false));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(6.5F, 10.5F, 2.0F);
        bone.addChild(bone15);
        setRotationAngle(bone15, 0.0F, -0.5411F, 0.0F);
        bone15.cubeList.add(new ModelBox(bone15, 44, 0, -2.0F, -1.39F, 0.0F, 2, 3, 3, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(6.5F, 10.5F, -3.0F);
        bone.addChild(bone16);
        setRotationAngle(bone16, 0.0F, 0.5411F, 0.0F);
        bone16.cubeList.add(new ModelBox(bone16, 31, 34, -2.0F, -1.39F, -3.0F, 2, 3, 3, 0.0F, false));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(-4.5F, 10.5F, -3.0F);
        bone.addChild(bone17);
        setRotationAngle(bone17, 0.0F, -0.5411F, 0.0F);
        bone17.cubeList.add(new ModelBox(bone17, 21, 34, 0.0F, -1.39F, -3.0F, 2, 3, 3, 0.0F, false));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(-4.5F, 10.5F, -3.0F);
        bone.addChild(bone18);
        setRotationAngle(bone18, 0.0F, 0.5411F, 0.0F);
        bone18.cubeList.add(new ModelBox(bone18, 10, 0, -2.5752F, -1.39F, 4.2858F, 2, 3, 3, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(4.5F, 5.75F, -69.5F);
        bone.addChild(bone19);
        setRotationAngle(bone19, -0.8203F, 0.0F, 0.0F);
        bone19.cubeList.add(new ModelBox(bone19, 47, 71, -7.01F, -4.0F, -0.01F, 1, 4, 4, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 44, 23, -0.99F, -4.0F, -0.01F, 1, 4, 4, 0.0F, false));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(4.5F, 3.05F, -66.7F);
        bone.addChild(bone20);
        setRotationAngle(bone20, -1.4923F, 0.0F, 0.0F);
        bone20.cubeList.add(new ModelBox(bone20, 0, 71, -7.0F, -61.0F, -0.01F, 1, 61, 3, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 54, 0, -1.0F, -61.0F, -0.01F, 1, 61, 3, 0.0F, false));

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(6.0F, 7.2F, -9.5F);
        bone.addChild(bone21);
        setRotationAngle(bone21, 0.4887F, 0.0F, 0.0F);
        bone21.cubeList.add(new ModelBox(bone21, 20, 98, -2.26F, -6.294F, -0.1268F, 2, 6, 4, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 8, 98, -9.76F, -6.294F, -0.1268F, 2, 6, 4, 0.0F, false));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(8.0F, 16.0F, -15.0F);
        bone.addChild(bone22);
        setRotationAngle(bone22, -0.4189F, 0.0F, 0.0F);
        bone22.cubeList.add(new ModelBox(bone22, 94, 94, -1.0F, -5.0F, 0.0F, 4, 5, 5, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 39, 93, -1.0F, 16.557F, -48.4179F, 4, 5, 5, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 34, 0, 3.0F, 16.0905F, -49.0014F, 2, 6, 6, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 0, 23, 3.0F, -5.4666F, -0.5835F, 2, 6, 6, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 0, 0, -13.5F, -20.9032F, 4.5847F, 2, 6, 6, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 44, 12, -14.5F, -19.9032F, 5.5847F, 1, 4, 4, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 34, 12, -3.0F, -19.9032F, 5.5847F, 1, 4, 4, 0.0F, false));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(0.0F, 2.7F, 0.4F);
        bone.addChild(bone23);
        setRotationAngle(bone23, 0.384F, 0.0F, 0.0F);
        bone23.cubeList.add(new ModelBox(bone23, 0, 35, -0.99F, -1.0F, 0.0F, 4, 2, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
