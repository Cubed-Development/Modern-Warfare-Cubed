package com.paneedah.weaponlib.vehicle.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SuspensionModel extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer bone7;
    private final ModelRenderer bone3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer bone4;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer bone5;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer bone6;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer bone8;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;

    public SuspensionModel() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0013F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-0.95F, 26.0F, 0.0007F);
        bone.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.0436F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 23, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.95F, 26.0F, 0.0007F);
        bone.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.0436F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 25, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 18.25F, -0.0013F);
        bone.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.7854F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 4, 0, -1.0F, -10.25F, -1.0F, 2, 14, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -0.5F, -18.25F, -0.5F, 1, 25, 1, 0.0F, false));

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0213F, -16.0F, -0.0777F);
        bone2.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.1309F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 0, -2.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F, false));

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, -10.0F, 0.0F);
        bone2.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 1.5272F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 5, -1.5F, -5.5F, -1.5F, 3, 6, 3, 0.0F, false));
        cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 14, -1.5F, 7.25F, -1.5F, 3, 1, 3, 0.0F, false));

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, -3.25F, 0.0F);
        bone2.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 4, 18, -1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(-0.3F, 26.0F, -0.5513F);
        bone.addChild(bone7);


        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0F, -21.5F, 1.0F);
        bone7.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0F, -0.1309F);
        bone3.cubeList.add(new ModelBox(bone3, 30, 16, -0.6983F, -0.5261F, -3.0F, 2, 1, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 0, 30, -0.7427F, 0.5775F, 1.1F, 2, 1, 1, 0.0F, false));

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-2.5F, -0.75F, -0.201F);
        bone3.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.3491F, 0.0873F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 12, 0.3161F, -0.5638F, -1.4008F, 1, 1, 2, 0.0F, false));

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(0.5705F, -1.3019F, 1.6F);
        bone3.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.2618F, 0.1309F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 0, -0.8447F, -0.3F, -1.0796F, 2, 1, 1, 0.0F, false));

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(2.7464F, 0.0F, 1.1536F);
        bone3.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.6981F, 0.0F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 29, -1.5943F, 0.5906F, -1.2597F, 2, 1, 1, 0.0F, false));

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-2.1553F, 1.5863F, 1.7536F);
        bone3.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, -0.6981F, -0.2618F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 0, -0.2493F, -2.7424F, -2.5659F, 2, 1, 1, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 9, -0.9016F, -0.6017F, -1.6269F, 2, 1, 1, 0.0F, false));

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(-2.7464F, 0.0F, -1.1536F);
        bone3.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.6981F, 0.3054F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 29, 14, 0.5886F, -1.114F, -0.2113F, 2, 1, 1, 0.0F, false));

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(2.7464F, 0.0F, -1.1536F);
        bone3.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, -0.6981F, 0.3054F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 29, -2.1493F, -0.0887F, -0.58F, 2, 1, 1, 0.0F, false));

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(2.5F, 0.0F, -1.5F);
        bone3.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 18, -1.3609F, -1.6359F, 0.5872F, 1, 1, 2, 0.0F, false));

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(2.5F, 0.0F, -1.5F);
        bone3.addChild(cube_r13);
        setRotationAngle(cube_r13, -0.3491F, 0.0F, 0.0F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 22, -0.5522F, -0.1273F, 0.1356F, 1, 1, 2, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, -19.0F, 1.0F);
        bone7.addChild(bone4);
        setRotationAngle(bone4, 0.0F, 0.0F, -0.1309F);
        bone4.cubeList.add(new ModelBox(bone4, 29, 7, -0.6983F, -0.5261F, -3.0F, 2, 1, 1, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 18, 28, -0.7427F, 0.5775F, 1.1F, 2, 1, 1, 0.0F, false));

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(-2.5F, -0.75F, -0.201F);
        bone4.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.3491F, 0.0873F, 0.0F);
        cube_r14.cubeList.add(new ModelBox(cube_r14, 4, 22, 0.3161F, -0.5638F, -1.4008F, 1, 1, 2, 0.0F, false));

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(2.7464F, 0.0F, 1.1536F);
        bone4.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.6981F, 0.0F);
        cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 28, -1.5943F, 0.5906F, -1.2597F, 2, 1, 1, 0.0F, false));

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(-2.1553F, 1.5863F, 1.7536F);
        bone4.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, -0.6981F, -0.2618F);
        cube_r16.cubeList.add(new ModelBox(cube_r16, 29, 1, -0.9016F, -0.6017F, -1.6269F, 2, 1, 1, 0.0F, false));

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(-2.7464F, 0.0F, -1.1536F);
        bone4.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.6981F, 0.3054F);
        cube_r17.cubeList.add(new ModelBox(cube_r17, 29, 3, 0.5886F, -1.114F, -0.2113F, 2, 1, 1, 0.0F, false));

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(2.7464F, 0.0F, -1.1536F);
        bone4.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, -0.6981F, 0.3054F);
        cube_r18.cubeList.add(new ModelBox(cube_r18, 6, 29, -2.1493F, -0.0887F, -0.58F, 2, 1, 1, 0.0F, false));

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(2.5F, 0.0F, -1.5F);
        bone4.addChild(cube_r19);
        setRotationAngle(cube_r19, -0.3491F, 0.0F, 0.0F);
        cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 22, -0.5522F, -0.1273F, 0.1356F, 1, 1, 2, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, -16.5F, 1.0F);
        bone7.addChild(bone5);
        setRotationAngle(bone5, 0.0F, 0.0F, -0.1309F);
        bone5.cubeList.add(new ModelBox(bone5, 13, 27, -0.6983F, -0.5261F, -3.0F, 2, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 26, 12, -0.7427F, 0.5775F, 1.1F, 2, 1, 1, 0.0F, false));

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(-2.5F, -0.75F, -0.201F);
        bone5.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.3491F, 0.0873F, 0.0F);
        cube_r20.cubeList.add(new ModelBox(cube_r20, 21, 17, 0.3161F, -0.5638F, -1.4008F, 1, 1, 2, 0.0F, false));

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(2.7464F, 0.0F, 1.1536F);
        bone5.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.0F, 0.6981F, 0.0F);
        cube_r21.cubeList.add(new ModelBox(cube_r21, 26, 22, -1.5943F, 0.5906F, -1.2597F, 2, 1, 1, 0.0F, false));

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(-2.1553F, 1.5863F, 1.7536F);
        bone5.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.0F, -0.6981F, -0.2618F);
        cube_r22.cubeList.add(new ModelBox(cube_r22, 26, 24, -0.9016F, -0.6017F, -1.6269F, 2, 1, 1, 0.0F, false));

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(-2.7464F, 0.0F, -1.1536F);
        bone5.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.6981F, 0.3054F);
        cube_r23.cubeList.add(new ModelBox(cube_r23, 26, 26, 0.5886F, -1.114F, -0.2113F, 2, 1, 1, 0.0F, false));

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(2.7464F, 0.0F, -1.1536F);
        bone5.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0F, -0.6981F, 0.3054F);
        cube_r24.cubeList.add(new ModelBox(cube_r24, 7, 27, -2.1493F, -0.0887F, -0.58F, 2, 1, 1, 0.0F, false));

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(2.5F, 0.0F, -1.5F);
        bone5.addChild(cube_r25);
        setRotationAngle(cube_r25, -0.3491F, 0.0F, 0.0F);
        cube_r25.cubeList.add(new ModelBox(cube_r25, 21, 20, -0.5522F, -0.1273F, 0.1356F, 1, 1, 2, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, -14.0F, 1.0F);
        bone7.addChild(bone6);
        setRotationAngle(bone6, 0.0F, 0.0F, -0.1309F);
        bone6.cubeList.add(new ModelBox(bone6, 25, 20, -0.6983F, -0.5261F, -3.0F, 2, 1, 1, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 24, 15, -0.7427F, 0.5775F, 1.1F, 2, 1, 1, 0.0F, false));

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(-2.5F, -0.75F, -0.201F);
        bone6.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.3491F, 0.0873F, 0.0F);
        cube_r26.cubeList.add(new ModelBox(cube_r26, 17, 19, 0.3161F, -0.5638F, -1.4008F, 1, 1, 2, 0.0F, false));

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(2.7464F, 0.0F, 1.1536F);
        bone6.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0F, 0.6981F, 0.0F);
        cube_r27.cubeList.add(new ModelBox(cube_r27, 25, 5, -1.5943F, 0.5906F, -1.2597F, 2, 1, 1, 0.0F, false));

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(-2.1553F, 1.5863F, 1.7536F);
        bone6.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.0F, -0.6981F, -0.2618F);
        cube_r28.cubeList.add(new ModelBox(cube_r28, 7, 25, -0.9016F, -0.6017F, -1.6269F, 2, 1, 1, 0.0F, false));

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(-2.7464F, 0.0F, -1.1536F);
        bone6.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, 0.6981F, 0.3054F);
        cube_r29.cubeList.add(new ModelBox(cube_r29, 13, 25, 0.5886F, -1.114F, -0.2113F, 2, 1, 1, 0.0F, false));

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(2.7464F, 0.0F, -1.1536F);
        bone6.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, -0.6981F, 0.3054F);
        cube_r30.cubeList.add(new ModelBox(cube_r30, 25, 17, -2.1493F, -0.0887F, -0.58F, 2, 1, 1, 0.0F, false));

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(2.5F, 0.0F, -1.5F);
        bone6.addChild(cube_r31);
        setRotationAngle(cube_r31, -0.3491F, 0.0F, 0.0F);
        cube_r31.cubeList.add(new ModelBox(cube_r31, 21, 5, -0.5522F, -0.1273F, 0.1356F, 1, 1, 2, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, -11.5F, 1.0F);
        bone7.addChild(bone8);
        setRotationAngle(bone8, 0.0F, 0.0F, -0.1309F);


        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(-2.5F, -0.75F, -0.201F);
        bone8.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.3491F, 0.0873F, 0.0F);
        cube_r32.cubeList.add(new ModelBox(cube_r32, 18, 14, 0.3161F, -0.5638F, -1.4008F, 1, 1, 2, 0.0F, false));

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(-2.7464F, 0.0F, -1.1536F);
        bone8.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.0F, 0.6981F, 0.3054F);
        cube_r33.cubeList.add(new ModelBox(cube_r33, 24, 2, 0.5886F, -1.114F, -0.2113F, 2, 1, 1, 0.0F, false));

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(1.8321F, 0.143F, -1.9536F);
        bone8.addChild(cube_r34);
        setRotationAngle(cube_r34, 0.0F, -1.0908F, 0.3054F);
        cube_r34.cubeList.add(new ModelBox(cube_r34, 24, 8, -0.5962F, -0.3494F, 0.0237F, 2, 1, 1, 0.0F, false));

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(1.5F, 0.0F, -2.3F);
        bone8.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.0F, -0.2618F, 0.0F);
        cube_r35.cubeList.add(new ModelBox(cube_r35, 24, 10, -2.0815F, -0.427F, -0.2137F, 2, 1, 1, 0.0F, false));
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
