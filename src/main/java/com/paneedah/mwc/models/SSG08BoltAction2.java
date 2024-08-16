package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SSG08BoltAction2 extends ModelWithAttachments {
    private final ModelRenderer bolt_action_2;
    private final ModelRenderer bone138;
    private final ModelRenderer bone140;
    private final ModelRenderer bone139;
    private final ModelRenderer ball;

    public SSG08BoltAction2() {
        textureWidth = 512;
        textureHeight = 512;

        bolt_action_2 = new ModelRenderer(this);
        bolt_action_2.setRotationPoint(-4.0F, -14.0F, -13.0F);
        setRotationAngle(bolt_action_2, 0.0F, 0.0F, 0.1309F);


        bone138 = new ModelRenderer(this);
        bone138.setRotationPoint(0.0F, 0.0F, 0.0F);
        bolt_action_2.addChild(bone138);
        setRotationAngle(bone138, 0.0F, 0.0F, -0.6109F);
        bone138.cubeList.add(new ModelBox(bone138, 49, 57, -0.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        bone140 = new ModelRenderer(this);
        bone140.setRotationPoint(-0.0991F, 0.0131F, 0.0F);
        bolt_action_2.addChild(bone140);
        setRotationAngle(bone140, 0.2618F, 0.0F, 0.0F);


        bone139 = new ModelRenderer(this);
        bone139.setRotationPoint(0.0F, -0.0259F, -0.0966F);
        bone140.addChild(bone139);
        setRotationAngle(bone139, -0.1562F, 0.1048F, -1.367F);
        bone139.cubeList.add(new ModelBox(bone139, 29, 53, -3.2706F, -0.6533F, -0.5F, 3, 1, 1, 0.0F, false));

        ball = new ModelRenderer(this);
        ball.setRotationPoint(-4.7846F, -0.9745F, 5.2124F);
        bone139.addChild(ball);
        ball.cubeList.add(new ModelBox(ball, 95, 18, -0.011F, -0.1148F, -6.2596F, 2, 2, 2, 0.0F, false));
        ball.cubeList.add(new ModelBox(ball, 0, 0, 0.489F, 1.1352F, -6.5096F, 1, 1, 1, 0.0F, false));
        ball.cubeList.add(new ModelBox(ball, 0, 0, 1.239F, 0.3852F, -6.5096F, 1, 1, 1, 0.0F, false));
        ball.cubeList.add(new ModelBox(ball, 0, 0, -0.261F, 0.3852F, -6.5096F, 1, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bolt_action_2.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
