package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class FNFALRearSight extends ModelBase {
    private final ModelRenderer sight17;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;

    public FNFALRearSight() {
        textureWidth = 128;
        textureHeight = 64;

        sight17 = new ModelRenderer(this);
        sight17.setRotationPoint(0.0F, 5.3F, 0.8F);
        sight17.cubeList.add(new ModelBox(sight17, 0, 0, -0.5F, -8.05F, -1.5F, 4, 7, 2, 0.0F, true));
        sight17.cubeList.add(new ModelBox(sight17, 0, 0, 2.5F, -10.05F, -1.5F, 1, 2, 2, 0.0F, false));
        sight17.cubeList.add(new ModelBox(sight17, 0, 0, -0.5F, -10.05F, -1.5F, 1, 2, 2, 0.0F, false));
        sight17.cubeList.add(new ModelBox(sight17, 0, 0, 0.5F, -11.05F, -1.5F, 2, 1, 2, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(3.3F, -7.1F, -1.45F);
        sight17.addChild(bone5);
        setRotationAngle(bone5, -0.1047F, -0.0698F, -0.576F);
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(-0.3F, -7.1F, -1.45F);
        sight17.addChild(bone6);
        setRotationAngle(bone6, -0.1047F, 0.0698F, 0.576F);
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-1.0F, -3.25F, -0.75F);
        setRotationAngle(bone2, 0.0F, 0.0F, -0.7854F);
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, 0.7071F, 0.049F, 1, 1, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 1.4142F, -0.7071F, 0.049F, 1, 1, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 1.8F, -0.7071F, 0.051F, 1, 1, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 3.2426F, 1.1213F, 0.049F, 1, 1, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 3.2426F, 0.75F, 0.051F, 1, 1, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 1.8284F, 2.5355F, 0.049F, 1, 1, 2, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(-0.5F, -0.3F, -0.85F);
        setRotationAngle(bone, -0.1396F, 0.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, 0.0F, 0.0F, 6, 6, 4, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, 2.0F, 4.0F, 6, 4, 3, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-1.0F, 2.0F, 7.0F);
        bone.addChild(bone3);
        setRotationAngle(bone3, 0.9774F, 0.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, -0.001F, -3.0F, -2.0F, 6, 3, 2, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, 0.001F, -3.6F, -1.999F, 6, 1, 2, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(5.5F, 3.2F, 0.8F);
        setRotationAngle(bone4, -0.7854F, 0.0F, 0.0F);
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, -9.0F, -3.0F, 0.0F, 9, 3, 3, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, -8.0F, -3.3536F, -0.6464F, 1, 4, 4, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        sight17.render(f5);
        bone2.render(f5);
        bone.render(f5);
        bone4.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
