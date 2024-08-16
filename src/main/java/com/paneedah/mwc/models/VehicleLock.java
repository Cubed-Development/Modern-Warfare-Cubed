// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports
package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class VehicleLock extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer K20_r1;
    private final ModelRenderer K19_r1;
    private final ModelRenderer K15_r1;
    private final ModelRenderer K16_r1;
    private final ModelRenderer K14_r1;
    private final ModelRenderer K13_r1;
    private final ModelRenderer bone2;
    private final ModelRenderer K8_r1;
    private final ModelRenderer K9_r1;
    private final ModelRenderer K7_r1;
    private final ModelRenderer K8_r2;
    private final ModelRenderer K5_r1;
    private final ModelRenderer K6_r1;
    private final ModelRenderer K4_r1;
    private final ModelRenderer K3_r1;

    public VehicleLock() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 38, 7, -3.0F, -17.0F, -0.3F, 6, 2, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 40, -3.0F, -15.0F, 0.7F, 6, 8, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 3, -2.0F, -7.0F, 0.7F, 4, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 17, 31, -0.1F, -15.5F, 1.0F, 3, 1, 11, 0.001F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 16, -0.1F, -14.5F, 5.0F, 3, 1, 1, 0.001F, false));
        bone.cubeList.add(new ModelBox(bone, 38, 0, -0.35F, -14.5F, 6.0F, 3, 1, 6, 0.001F, false));
        bone.cubeList.add(new ModelBox(bone, 35, 44, -0.35F, -14.5F, 1.0F, 3, 1, 3, 0.001F, false));
        bone.cubeList.add(new ModelBox(bone, 7, 17, 1.4F, -14.5F, 4.0F, 1, 1, 1, 0.001F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 28, -2.9F, -15.5F, 1.0F, 3, 1, 11, 0.002F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 14, -2.9F, -14.5F, 5.0F, 3, 1, 1, 0.001F, false));
        bone.cubeList.add(new ModelBox(bone, 26, 43, -2.65F, -14.5F, 1.0F, 3, 1, 3, 0.001F, false));
        bone.cubeList.add(new ModelBox(bone, 34, 31, -2.65F, -14.5F, 6.0F, 3, 1, 6, 0.001F, false));
        bone.cubeList.add(new ModelBox(bone, 7, 15, -2.4F, -14.5F, 4.0F, 1, 1, 1, 0.001F, false));
        bone.cubeList.add(new ModelBox(bone, 19, 3, -1.99F, -16.0F, 1.0F, 4, 1, 11, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.99F, -12.0F, 1.0F, 4, 3, 11, -0.001F, false));
        bone.cubeList.add(new ModelBox(bone, 14, 43, -1.99F, -15.0F, 12.0F, 4, 4, 2, 0.0F, false));

        K20_r1 = new ModelRenderer(this);
        K20_r1.setRotationPoint(-2.91F, -13.5F, 1.0F);
        bone.addChild(K20_r1);
        setRotationAngle(K20_r1, 0.0F, 0.0F, -0.2269F);
        K20_r1.cubeList.add(new ModelBox(K20_r1, 0, 14, 0.01F, 0.0F, 0.0F, 3, 3, 11, 0.0F, false));

        K19_r1 = new ModelRenderer(this);
        K19_r1.setRotationPoint(2.91F, -13.5F, 1.0F);
        bone.addChild(K19_r1);
        setRotationAngle(K19_r1, 0.0F, 0.0F, 0.2269F);
        K19_r1.cubeList.add(new ModelBox(K19_r1, 17, 17, -3.01F, 0.0F, 0.0F, 3, 3, 11, 0.0F, false));

        K15_r1 = new ModelRenderer(this);
        K15_r1.setRotationPoint(-7.6546F, -3.1693F, -0.02F);
        bone.addChild(K15_r1);
        setRotationAngle(K15_r1, 0.0F, 0.0F, 0.7854F);
        K15_r1.cubeList.add(new ModelBox(K15_r1, 17, 15, 0.9969F, -7.0F, 0.73F, 1, 1, 1, 0.0F, false));

        K16_r1 = new ModelRenderer(this);
        K16_r1.setRotationPoint(-7.9497F, -3.4645F, -0.01F);
        bone.addChild(K16_r1);
        setRotationAngle(K16_r1, 0.0F, 0.0F, 0.7854F);
        K16_r1.cubeList.add(new ModelBox(K16_r1, 17, 17, 1.0F, -6.9965F, 0.73F, 1, 1, 1, 0.0F, false));

        K14_r1 = new ModelRenderer(this);
        K14_r1.setRotationPoint(-3.364F, -3.4645F, 0.0F);
        bone.addChild(K14_r1);
        setRotationAngle(K14_r1, 0.0F, 0.0F, 0.7854F);
        K14_r1.cubeList.add(new ModelBox(K14_r1, 0, 18, 1.0F, -7.0F, 0.71F, 1, 1, 1, 0.0F, false));

        K13_r1 = new ModelRenderer(this);
        K13_r1.setRotationPoint(-3.6569F, -3.1716F, 0.0F);
        bone.addChild(K13_r1);
        setRotationAngle(K13_r1, 0.0F, 0.0F, 0.7854F);
        K13_r1.cubeList.add(new ModelBox(K13_r1, 4, 18, 0.9969F, -7.0F, 0.72F, 1, 1, 1, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, -13.0F, 1.0F);
        bone.addChild(bone2);
        bone2.cubeList.add(new ModelBox(bone2, 34, 15, -0.99F, -1.0F, 11.0F, 2, 2, 9, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 41, 39, -0.99F, -0.5F, 20.0F, 2, 1, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -2.0F, -1.0F, -0.999F, 4, 2, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 6, 5, 0.25F, -1.0F, -1.9F, 1, 2, 1, -0.1F, false));
        bone2.cubeList.add(new ModelBox(bone2, 6, 8, -1.25F, -1.0F, -1.9F, 1, 2, 1, -0.1F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 5, -1.0F, -2.0F, -1.0F, 2, 4, 1, 0.0F, false));

        K8_r1 = new ModelRenderer(this);
        K8_r1.setRotationPoint(-9.494F, 11.8907F, -1.004F);
        bone2.addChild(K8_r1);
        setRotationAngle(K8_r1, 0.0F, 0.0F, 0.7854F);
        K8_r1.cubeList.add(new ModelBox(K8_r1, 19, 0, -1.9876F, -14.0F, 0.006F, 1, 1, 1, 0.0F, false));

        K9_r1 = new ModelRenderer(this);
        K9_r1.setRotationPoint(-9.8358F, 12.2855F, -1.006F);
        bone2.addChild(K9_r1);
        setRotationAngle(K9_r1, 0.0F, 0.0F, 0.7854F);
        K9_r1.cubeList.add(new ModelBox(K9_r1, 19, 2, -2.4393F, -14.5155F, 0.009F, 1, 1, 1, 0.0F, false));

        K7_r1 = new ModelRenderer(this);
        K7_r1.setRotationPoint(-7.2011F, 9.5978F, -1.003F);
        bone2.addChild(K7_r1);
        setRotationAngle(K7_r1, 0.0F, 0.0F, 0.7854F);
        K7_r1.cubeList.add(new ModelBox(K7_r1, 19, 4, -1.9876F, -14.0F, 0.006F, 1, 1, 1, 0.0F, false));

        K8_r2 = new ModelRenderer(this);
        K8_r2.setRotationPoint(-7.5429F, 9.9926F, -1.005F);
        bone2.addChild(K8_r2);
        setRotationAngle(K8_r2, 0.0F, 0.0F, 0.7854F);
        K8_r2.cubeList.add(new ModelBox(K8_r2, 19, 6, -2.4393F, -14.5226F, 0.007F, 1, 1, 1, 0.0F, false));

        K5_r1 = new ModelRenderer(this);
        K5_r1.setRotationPoint(-7.1924F, 11.6066F, -1.002F);
        bone2.addChild(K5_r1);
        setRotationAngle(K5_r1, 0.0F, 0.0F, 0.7854F);
        K5_r1.cubeList.add(new ModelBox(K5_r1, 7, 19, -1.9876F, -14.0F, 0.005F, 1, 1, 1, 0.0F, false));

        K6_r1 = new ModelRenderer(this);
        K6_r1.setRotationPoint(-7.8536F, 12.2678F, -1.005F);
        bone2.addChild(K6_r1);
        setRotationAngle(K6_r1, 0.0F, 0.0F, 0.7854F);
        K6_r1.cubeList.add(new ModelBox(K6_r1, 19, 8, -2.0F, -14.5208F, 0.007F, 1, 1, 1, 0.0F, false));

        K4_r1 = new ModelRenderer(this);
        K4_r1.setRotationPoint(-10.1464F, 9.9749F, -1.003F);
        bone2.addChild(K4_r1);
        setRotationAngle(K4_r1, 0.0F, 0.0F, 0.7854F);
        K4_r1.cubeList.add(new ModelBox(K4_r1, 17, 19, -2.0F, -14.5208F, 0.005F, 1, 1, 1, 0.0F, false));

        K3_r1 = new ModelRenderer(this);
        K3_r1.setRotationPoint(-9.4853F, 9.3137F, -1.001F);
        bone2.addChild(K3_r1);
        setRotationAngle(K3_r1, 0.0F, 0.0F, 0.7854F);
        K3_r1.cubeList.add(new ModelBox(K3_r1, 0, 20, -1.9947F, -14.0F, 0.004F, 1, 1, 1, 0.0F, false));
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount,
                                    float partialTickTime) {


        bone2.rotateAngleZ = (float) Math.toRadians(limbSwing);

        //super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
    }


    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone.rotateAngleX = (float) Math.toRadians(f);
        bone.rotateAngleY = (float) Math.toRadians(f1);
        bone.rotateAngleZ = (float) Math.toRadians(f2);

        bone.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
