package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK47Action extends ModelWithAttachments {
    private final ModelRenderer action;
    private final ModelRenderer action17;
    private final ModelRenderer action16;
    private final ModelRenderer action15;
    private final ModelRenderer action14;
    private final ModelRenderer action12;
    private final ModelRenderer action11;
    private final ModelRenderer action10;
    private final ModelRenderer action9;
    private final ModelRenderer action8;
    private final ModelRenderer action7;
    private final ModelRenderer action6;
    private final ModelRenderer action4;
    private final ModelRenderer action5;
    private final ModelRenderer action2;
    private final ModelRenderer action1;
    private final ModelRenderer action3;

    public AK47Action() {
        textureWidth = 200;
        textureHeight = 200;

        action = new ModelRenderer(this);
        action.setRotationPoint(0.0F, 24.0F, 0.0F);


        action17 = new ModelRenderer(this);
        action17.setRotationPoint(-5.8F, -36.3F, -32.0F);
        action.addChild(action17);
        setRotationAngle(action17, 0.0F, 2.6025F, 0.0F);
        action17.cubeList.add(new ModelBox(action17, 0, 65, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        action16 = new ModelRenderer(this);
        action16.setRotationPoint(-3.8F, -36.5F, -32.8F);
        action.addChild(action16);
        setRotationAngle(action16, 0.0F, 0.0F, 1.3384F);
        action16.cubeList.add(new ModelBox(action16, 34, 65, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        action15 = new ModelRenderer(this);
        action15.setRotationPoint(-3.8F, -36.3F, -31.5F);
        action.addChild(action15);
        setRotationAngle(action15, 0.0F, 2.7512F, 0.0F);
        action15.cubeList.add(new ModelBox(action15, 65, 49, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        action14 = new ModelRenderer(this);
        action14.setRotationPoint(-3.8F, -36.3F, -31.6F);
        action.addChild(action14);
        setRotationAngle(action14, 0.0F, 2.9743F, 0.0F);
        action14.cubeList.add(new ModelBox(action14, 17, 59, 0.0F, -0.001F, 0.0F, 2, 1, 1, 0.0F, false));

        action12 = new ModelRenderer(this);
        action12.setRotationPoint(-3.8F, -36.2F, -33.5F);
        action.addChild(action12);
        action12.cubeList.add(new ModelBox(action12, 85, 49, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        action11 = new ModelRenderer(this);
        action11.setRotationPoint(-3.8F, -36.5F, -33.5F);
        action.addChild(action11);
        action11.cubeList.add(new ModelBox(action11, 85, 54, -0.001F, 0.0F, -0.001F, 1, 1, 2, 0.0F, false));

        action10 = new ModelRenderer(this);
        action10.setRotationPoint(-3.3F, -37.0F, -25.5F);
        action.addChild(action10);
        setRotationAngle(action10, 0.0F, 0.0F, -2.1564F);
        action10.cubeList.add(new ModelBox(action10, 88, 124, -1.0F, 0.0F, -0.001F, 1, 1, 7, 0.0F, false));

        action9 = new ModelRenderer(this);
        action9.setRotationPoint(-3.5F, -37.0F, -33.5F);
        action.addChild(action9);
        setRotationAngle(action9, 0.0F, 0.0F, -2.1564F);
        action9.cubeList.add(new ModelBox(action9, 118, 106, -1.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

        action8 = new ModelRenderer(this);
        action8.setRotationPoint(0.5F, -37.0F, -33.5F);
        action.addChild(action8);
        setRotationAngle(action8, 0.0F, 0.0F, 2.1564F);
        action8.cubeList.add(new ModelBox(action8, 0, 54, 0.0F, 0.0F, -0.001F, 1, 1, 15, 0.0F, false));

        action7 = new ModelRenderer(this);
        action7.setRotationPoint(-2.4F, -38.5F, -33.5F);
        action.addChild(action7);
        setRotationAngle(action7, 0.0F, 0.0F, 0.2974F);
        action7.cubeList.add(new ModelBox(action7, 0, 80, 0.0F, 0.0F, 0.0F, 1, 2, 12, 0.0F, false));

        action6 = new ModelRenderer(this);
        action6.setRotationPoint(-0.6F, -38.5F, -33.5F);
        action.addChild(action6);
        setRotationAngle(action6, 0.0F, 0.0F, -0.2974F);
        action6.cubeList.add(new ModelBox(action6, 82, 75, -1.0F, 0.0F, 0.0F, 1, 2, 12, 0.0F, false));

        action4 = new ModelRenderer(this);
        action4.setRotationPoint(-1.5F, -39.0F, -39.5F);
        action.addChild(action4);
        setRotationAngle(action4, 0.0F, 0.0F, -1.1154F);
        action4.cubeList.add(new ModelBox(action4, 0, 19, -1.0F, 0.0F, -0.002F, 1, 1, 18, 0.0F, false));

        action5 = new ModelRenderer(this);
        action5.setRotationPoint(-1.5F, -39.0F, -39.5F);
        action.addChild(action5);
        setRotationAngle(action5, 0.0F, 0.0F, 1.1154F);
        action5.cubeList.add(new ModelBox(action5, 0, 0, 0.0F, 0.0F, -0.001F, 1, 1, 18, 0.0F, false));

        action2 = new ModelRenderer(this);
        action2.setRotationPoint(-3.5F, -37.0F, -33.5F);
        action.addChild(action2);
        action2.cubeList.add(new ModelBox(action2, 94, 49, 0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F, false));

        action1 = new ModelRenderer(this);
        action1.setRotationPoint(-3.3F, -37.0F, -25.5F);
        action.addChild(action1);
        action1.cubeList.add(new ModelBox(action1, 58, 40, 0.0F, 0.0F, 0.0F, 1, 2, 7, 0.0F, false));

        action3 = new ModelRenderer(this);
        action3.setRotationPoint(-0.5F, -37.0F, -33.5F);
        action.addChild(action3);
        action3.cubeList.add(new ModelBox(action3, 41, 40, 0.0F, 0.0F, 0.0F, 1, 2, 15, 0.0F, false));
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
