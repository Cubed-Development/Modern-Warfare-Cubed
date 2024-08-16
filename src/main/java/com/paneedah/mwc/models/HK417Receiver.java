package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK417Receiver extends ModelWithAttachments {
    private final ModelRenderer receiver;
    private final ModelRenderer gun259_r1;
    private final ModelRenderer gun263_r1;
    private final ModelRenderer gun142_r1;
    private final ModelRenderer gun140_r1;
    private final ModelRenderer gun105_r1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer gun264;
    private final ModelRenderer gun170;
    private final ModelRenderer gun249;

    public HK417Receiver() {
        textureWidth = 220;
        textureHeight = 220;

        receiver = new ModelRenderer(this);
        receiver.setRotationPoint(2.0F, -13.0F, -22.7F);
        receiver.cubeList.add(new ModelBox(receiver, 136, 110, -2.2F, -0.6F, -1.8F, 1, 1, 26, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 62, 36, -2.7F, -2.15F, 1.95F, 1, 2, 1, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 45, 30, -4.3F, -1.88F, 21.95F, 1, 1, 2, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 45, 22, -3.7F, -1.88F, 21.95F, 1, 1, 2, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 85, 97, -5.8F, -0.6F, -1.8F, 1, 1, 3, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 75, 20, -5.8F, -0.6F, 0.7F, 1, 1, 1, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 90, 45, -5.8F, -0.6F, 12.2F, 1, 1, 12, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 90, 0, -2.199F, 0.4F, -1.8F, 1, 1, 13, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 70, 89, -5.799F, 0.4F, -1.8F, 1, 1, 13, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 154, 0, -4.5F, -3.1F, -1.8F, 2, 1, 23, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 143, 137, -4.6F, -2.8F, -1.801F, 2, 2, 24, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 54, 47, -4.6F, -2.8F, 22.199F, 2, 1, 1, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 75, 18, -3.4F, -2.801F, 22.2F, 1, 1, 1, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 0, 152, -3.4F, -2.8F, -1.801F, 1, 2, 24, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 63, 45, -6.3F, -0.2F, 1.7F, 1, 1, 10, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 100, 142, -4.8F, -0.7F, 0.2F, 3, 2, 24, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 50, 153, -5.25F, 0.3F, 0.7F, 1, 1, 24, 0.0F, false));

        gun259_r1 = new ModelRenderer(this);
        gun259_r1.setRotationPoint(-4.8F, -2.0F, 10.7F);
        receiver.addChild(gun259_r1);
        setRotationAngle(gun259_r1, 0.0F, 0.0F, 0.632F);
        gun259_r1.cubeList.add(new ModelBox(gun259_r1, 64, 11, 0.0375F, 0.2204F, 0.0F, 1, 2, 1, 0.0F, false));
        gun259_r1.cubeList.add(new ModelBox(gun259_r1, 73, 56, 0.0375F, 0.2204F, -9.0F, 1, 2, 1, 0.0F, false));
        gun259_r1.cubeList.add(new ModelBox(gun259_r1, 63, 18, 0.0F, 0.0F, -9.0F, 1, 1, 10, 0.0F, false));

        gun263_r1 = new ModelRenderer(this);
        gun263_r1.setRotationPoint(-6.1F, 0.3F, 1.2F);
        receiver.addChild(gun263_r1);
        setRotationAngle(gun263_r1, 0.0F, 0.0F, -0.9295F);
        gun263_r1.cubeList.add(new ModelBox(gun263_r1, 19, 44, 0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

        gun142_r1 = new ModelRenderer(this);
        gun142_r1.setRotationPoint(-6.7F, -0.6F, 18.1F);
        receiver.addChild(gun142_r1);
        setRotationAngle(gun142_r1, 0.0F, -0.2603F, 0.0F);
        gun142_r1.cubeList.add(new ModelBox(gun142_r1, 54, 26, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun140_r1 = new ModelRenderer(this);
        gun140_r1.setRotationPoint(-5.1F, -0.4F, 11.6F);
        receiver.addChild(gun140_r1);
        setRotationAngle(gun140_r1, 0.0F, -0.2603F, 0.0F);
        gun140_r1.cubeList.add(new ModelBox(gun140_r1, 46, 108, -0.01F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));
        gun140_r1.cubeList.add(new ModelBox(gun140_r1, 11, 108, -0.01F, -0.4F, 0.0F, 2, 1, 7, 0.0F, false));

        gun105_r1 = new ModelRenderer(this);
        gun105_r1.setRotationPoint(-2.5F, -3.1F, 21.2F);
        receiver.addChild(gun105_r1);
        setRotationAngle(gun105_r1, -0.3142F, 0.0F, 0.0F);
        gun105_r1.cubeList.add(new ModelBox(gun105_r1, 54, 45, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-5.8F, -0.6F, 0.45F);
        receiver.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.8203F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 63, 56, 0.0F, -2.0F, 0.25F, 1, 2, 1, 0.0F, false));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 92, 0.0F, -2.0F, -2.25F, 1, 2, 3, 0.0F, false));

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-5.8F, -0.6F, 13.45F);
        receiver.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8727F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 90, 14, 0.0F, -2.0F, -1.75F, 1, 2, 12, 0.0F, false));

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-1.2F, -0.6F, -0.05F);
        receiver.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8727F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 121, -1.0F, -2.0F, -1.75F, 1, 2, 26, 0.0F, false));

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-5.8F, 0.4F, 11.2F);
        receiver.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, 0.9076F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 88, 0.0F, -1.0F, 0.0F, 1, 1, 13, 0.0F, false));

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-1.2F, 0.4F, 11.2F);
        receiver.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -0.9076F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 89, -1.0F, -1.0F, 0.0F, 1, 1, 13, 0.0F, false));

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-1.7F, -0.15F, 1.95F);
        receiver.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.8727F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 62, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(-1.7F, -0.15F, 2.95F);
        receiver.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, -0.8727F, 0.0F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 62, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        gun264 = new ModelRenderer(this);
        gun264.setRotationPoint(-6.2F, -0.4F, 2.7F);
        receiver.addChild(gun264);
        setRotationAngle(gun264, 0.0F, 0.0F, 0.2974F);
        gun264.cubeList.add(new ModelBox(gun264, 100, 64, -0.0154F, 0.6322F, 0.0F, 1, 3, 8, 0.0F, false));
        gun264.cubeList.add(new ModelBox(gun264, 36, 72, -0.2528F, 1.438F, 3.5F, 1, 2, 1, 0.0F, false));
        gun264.cubeList.add(new ModelBox(gun264, 70, 96, -0.1121F, 0.9868F, 0.25F, 1, 2, 3, 0.0F, false));
        gun264.cubeList.add(new ModelBox(gun264, 35, 95, -0.1121F, 0.9868F, 4.75F, 1, 2, 3, 0.0F, false));

        gun170 = new ModelRenderer(this);
        gun170.setRotationPoint(-5.9F, -2.2F, 12.7F);
        receiver.addChild(gun170);
        setRotationAngle(gun170, 0.0F, 0.0F, -0.192F);
        gun170.cubeList.add(new ModelBox(gun170, 90, 28, -1.3573F, 0.2945F, -1.0F, 3, 2, 1, 0.0F, false));

        gun249 = new ModelRenderer(this);
        gun249.setRotationPoint(-1.3F, 2.0F, 0.0F);
        gun170.addChild(gun249);
        setRotationAngle(gun249, 0.0F, 1.1154F, 0.0F);
        gun249.cubeList.add(new ModelBox(gun249, 78, 11, -0.0252F, -1.7055F, -0.0514F, 1, 2, 4, 0.0F, false));
        gun249.cubeList.add(new ModelBox(gun249, 54, 18, 0.9748F, -1.7055F, 1.9486F, 1, 2, 2, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        receiver.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
