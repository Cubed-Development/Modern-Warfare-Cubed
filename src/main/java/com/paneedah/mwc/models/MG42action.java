package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MG42action extends ModelWithAttachments {
    private final ModelRenderer action;
    private final ModelRenderer action10_r1;
    private final ModelRenderer action9_r1;
    private final ModelRenderer action8_r1;
    private final ModelRenderer action7_r1;
    private final ModelRenderer action6_r1;
    private final ModelRenderer action5_r1;
    private final ModelRenderer action4_r1;
    private final ModelRenderer action3_r1;

    public MG42action() {
        textureWidth = 256;
        textureHeight = 128;

        action = new ModelRenderer(this);
        action.setRotationPoint(4.8276F, 24.0F, 16.0004F);
        action.cubeList.add(new ModelBox(action, 100, 0, -8.7276F, -38.5F, -7.0004F, 3, 9, 1, 0.0F, true));
        action.cubeList.add(new ModelBox(action, 100, 0, -7.7276F, -38.5F, -8.0004F, 1, 9, 3, 0.0F, true));

        action10_r1 = new ModelRenderer(this);
        action10_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        action.addChild(action10_r1);
        setRotationAngle(action10_r1, -3.1416F, -0.7854F, 3.1416F);
        action10_r1.cubeList.add(new ModelBox(action10_r1, 100, 0, -0.9F, -38.5F, 9.0F, 1, 9, 1, 0.0F, true));

        action9_r1 = new ModelRenderer(this);
        action9_r1.setRotationPoint(0.7071F, 0.0F, 1.7071F);
        action.addChild(action9_r1);
        setRotationAngle(action9_r1, -3.1416F, -0.7854F, 3.1416F);
        action9_r1.cubeList.add(new ModelBox(action9_r1, 100, 0, -0.9F, -38.5F, 10.0F, 1, 9, 1, 0.0F, true));

        action8_r1 = new ModelRenderer(this);
        action8_r1.setRotationPoint(-15.8492F, 0.0F, 1.4343F);
        action.addChild(action8_r1);
        setRotationAngle(action8_r1, -3.1416F, 0.7854F, 3.1416F);
        action8_r1.cubeList.add(new ModelBox(action8_r1, 100, 0, -1.9F, -38.5F, 11.0F, 1, 9, 1, 0.0F, true));

        action7_r1 = new ModelRenderer(this);
        action7_r1.setRotationPoint(-17.5564F, 0.0F, 0.7272F);
        action.addChild(action7_r1);
        setRotationAngle(action7_r1, -3.1416F, 0.7854F, 3.1416F);
        action7_r1.cubeList.add(new ModelBox(action7_r1, 100, 0, -2.9F, -38.5F, 11.0F, 1, 9, 1, 0.0F, true));

        action6_r1 = new ModelRenderer(this);
        action6_r1.setRotationPoint(-0.0201F, 0.0F, -11.6066F);
        action.addChild(action6_r1);
        setRotationAngle(action6_r1, 0.0F, -0.7854F, 0.0F);
        action6_r1.cubeList.add(new ModelBox(action6_r1, 100, 0, -2.9F, -38.5F, 8.0F, 1, 9, 1, 0.0F, true));

        action5_r1 = new ModelRenderer(this);
        action5_r1.setRotationPoint(0.2728F, 0.0F, -12.3137F);
        action.addChild(action5_r1);
        setRotationAngle(action5_r1, 0.0F, -0.7854F, 0.0F);
        action5_r1.cubeList.add(new ModelBox(action5_r1, 100, 0, -1.9F, -38.5F, 8.0F, 1, 9, 1, 0.0F, true));

        action4_r1 = new ModelRenderer(this);
        action4_r1.setRotationPoint(-12.3338F, 0.0F, -16.122F);
        action.addChild(action4_r1);
        setRotationAngle(action4_r1, 0.0F, 0.7854F, 0.0F);
        action4_r1.cubeList.add(new ModelBox(action4_r1, 100, 0, -3.9F, -38.5F, 9.0F, 1, 9, 1, 0.0F, true));

        action3_r1 = new ModelRenderer(this);
        action3_r1.setRotationPoint(-13.0409F, 0.0F, -15.8291F);
        action.addChild(action3_r1);
        setRotationAngle(action3_r1, 0.0F, 0.7854F, 0.0F);
        action3_r1.cubeList.add(new ModelBox(action3_r1, 100, 0, -3.9F, -38.5F, 10.0F, 1, 9, 1, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        action.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
