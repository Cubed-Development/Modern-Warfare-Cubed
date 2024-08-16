package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G3HandguardRailed extends ModelWithAttachments {
    private final ModelRenderer handguard_a3;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;

    public G3HandguardRailed() {
        textureWidth = 300;
        textureHeight = 300;

        handguard_a3 = new ModelRenderer(this);
        handguard_a3.setRotationPoint(1.0F, -11.2F, -31.5F);


        cube_r47 = new ModelRenderer(this);
        cube_r47.setRotationPoint(-5.0F, 0.6F, 1.0F);
        handguard_a3.addChild(cube_r47);
        setRotationAngle(cube_r47, 0.0087F, -0.015F, -0.5411F);
        cube_r47.cubeList.add(new ModelBox(cube_r47, 112, 35, 0.0F, 0.0F, -32.0F, 1, 1, 32, 0.0F, false));

        cube_r48 = new ModelRenderer(this);
        cube_r48.setRotationPoint(0.0F, 0.6F, 1.0F);
        handguard_a3.addChild(cube_r48);
        setRotationAngle(cube_r48, 0.0087F, 0.015F, 0.5411F);
        cube_r48.cubeList.add(new ModelBox(cube_r48, 106, 140, -1.0F, 0.0F, -32.0F, 1, 1, 32, 0.0F, false));

        cube_r49 = new ModelRenderer(this);
        cube_r49.setRotationPoint(-3.1F, -0.4F, -30.8F);
        handguard_a3.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.0F, 0.0175F, 0.0F);
        cube_r49.cubeList.add(new ModelBox(cube_r49, 49, 12, -1.05F, -1.6F, 0.0F, 1, 1, 2, 0.0F, false));

        cube_r50 = new ModelRenderer(this);
        cube_r50.setRotationPoint(-0.8F, -0.4F, -30.8F);
        handguard_a3.addChild(cube_r50);
        setRotationAngle(cube_r50, 0.0F, 0.0175F, 0.0F);
        cube_r50.cubeList.add(new ModelBox(cube_r50, 58, 12, -1.05F, -1.6F, 0.0F, 1, 1, 2, 0.0F, false));

        cube_r51 = new ModelRenderer(this);
        cube_r51.setRotationPoint(-3.1F, -0.4F, -31.0F);
        handguard_a3.addChild(cube_r51);
        setRotationAngle(cube_r51, -0.1571F, 0.0175F, 0.0F);
        cube_r51.cubeList.add(new ModelBox(cube_r51, 58, 4, -1.05F, -1.6F, 0.0F, 1, 1, 2, 0.0F, false));
        cube_r51.cubeList.add(new ModelBox(cube_r51, 27, 29, -1.051F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        cube_r52 = new ModelRenderer(this);
        cube_r52.setRotationPoint(-0.8F, -0.4F, -31.0F);
        handguard_a3.addChild(cube_r52);
        setRotationAngle(cube_r52, -0.1571F, 0.0175F, 0.0F);
        cube_r52.cubeList.add(new ModelBox(cube_r52, 58, 21, -1.05F, -1.6F, 0.0F, 1, 1, 2, 0.0F, false));
        cube_r52.cubeList.add(new ModelBox(cube_r52, 58, 29, -1.049F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        cube_r53 = new ModelRenderer(this);
        cube_r53.setRotationPoint(0.0F, 0.0F, 1.0F);
        handguard_a3.addChild(cube_r53);
        setRotationAngle(cube_r53, 0.0F, 0.0175F, 0.0F);
        cube_r53.cubeList.add(new ModelBox(cube_r53, 34, 143, -1.0F, -0.4F, -32.0F, 1, 1, 32, 0.0F, false));
        cube_r53.cubeList.add(new ModelBox(cube_r53, 146, 0, -1.0F, -1.0F, -30.0F, 1, 1, 30, 0.0F, false));

        cube_r54 = new ModelRenderer(this);
        cube_r54.setRotationPoint(-5.0F, 0.6F, 1.0F);
        handguard_a3.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.0F, -0.0175F, 0.0F);
        cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 142, 0.0F, -1.0F, -32.0F, 1, 1, 32, 0.0F, false));
        cube_r54.cubeList.add(new ModelBox(cube_r54, 68, 144, 0.0F, -1.6F, -30.0F, 1, 1, 30, 0.0F, false));

        cube_r55 = new ModelRenderer(this);
        cube_r55.setRotationPoint(-3.5F, 2.0F, 1.0F);
        handguard_a3.addChild(cube_r55);
        setRotationAngle(cube_r55, -0.0087F, -0.0122F, 0.4712F);
        cube_r55.cubeList.add(new ModelBox(cube_r55, 72, 111, -1.0F, -1.0F, -32.0F, 1, 1, 32, 0.0F, false));

        cube_r56 = new ModelRenderer(this);
        cube_r56.setRotationPoint(-1.5F, 2.0F, 1.0F);
        handguard_a3.addChild(cube_r56);
        setRotationAngle(cube_r56, -0.0087F, 0.0122F, -0.4712F);
        cube_r56.cubeList.add(new ModelBox(cube_r56, 112, 0, 0.0F, -1.0F, -32.0F, 1, 1, 32, 0.0F, false));

        cube_r57 = new ModelRenderer(this);
        cube_r57.setRotationPoint(-3.5F, 2.0F, 1.0F);
        handguard_a3.addChild(cube_r57);
        setRotationAngle(cube_r57, -0.0017F, -0.0148F, 0.0F);
        cube_r57.cubeList.add(new ModelBox(cube_r57, 38, 110, 0.0F, -1.0F, -32.0F, 1, 1, 32, 0.0F, false));

        cube_r58 = new ModelRenderer(this);
        cube_r58.setRotationPoint(-1.5F, 2.0F, 1.0F);
        handguard_a3.addChild(cube_r58);
        setRotationAngle(cube_r58, -0.0017F, 0.0148F, 0.0F);
        cube_r58.cubeList.add(new ModelBox(cube_r58, 140, 141, -1.0F, -1.0F, -32.0F, 1, 1, 32, 0.0F, false));

        cube_r59 = new ModelRenderer(this);
        cube_r59.setRotationPoint(-5.0F, -1.0F, 1.0F);
        handguard_a3.addChild(cube_r59);
        setRotationAngle(cube_r59, -0.0122F, -0.0122F, 0.8029F);
        cube_r59.cubeList.add(new ModelBox(cube_r59, 144, 68, 0.0F, -2.0F, -30.0F, 1, 2, 30, 0.0F, false));

        cube_r60 = new ModelRenderer(this);
        cube_r60.setRotationPoint(0.0F, -1.0F, 1.0F);
        handguard_a3.addChild(cube_r60);
        setRotationAngle(cube_r60, -0.0122F, 0.0122F, -0.8029F);
        cube_r60.cubeList.add(new ModelBox(cube_r60, 144, 105, -1.0F, -2.0F, -30.0F, 1, 2, 30, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        handguard_a3.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
