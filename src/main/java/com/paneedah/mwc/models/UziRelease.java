package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziRelease extends ModelWithAttachments {
    private final ModelRenderer release;
    private final ModelRenderer Release7_r1;
    private final ModelRenderer Release4_r1;
    private final ModelRenderer Release3_r1;

    public UziRelease() {
        textureWidth = 256;
        textureHeight = 256;

        release = new ModelRenderer(this);
        release.setRotationPoint(19.9106F, 24.0F, -25.928F);
        release.cubeList.add(new ModelBox(release, 0, 0, -21.8106F, -39.6F, 3.428F, 1, 1, 14, 0.0F, true));
        release.cubeList.add(new ModelBox(release, 0, 0, -22.0106F, -39.6F, 3.428F, 1, 1, 14, 0.0F, true));
        release.cubeList.add(new ModelBox(release, 0, 0, -21.8106F, -40.3F, 3.628F, 1, 1, 1, 0.0F, true));
        release.cubeList.add(new ModelBox(release, 0, 0, -22.0106F, -40.3F, 3.628F, 1, 1, 1, 0.0F, true));

        Release7_r1 = new ModelRenderer(this);
        Release7_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        release.addChild(Release7_r1);
        setRotationAngle(Release7_r1, -3.1416F, 1.3942F, 3.1416F);
        Release7_r1.cubeList.add(new ModelBox(Release7_r1, 0, 0, -0.9F, -40.3F, -21.3F, 1, 1, 3, 0.0F, true));

        Release4_r1 = new ModelRenderer(this);
        Release4_r1.setRotationPoint(-48.5271F, -10.1136F, 25.928F);
        release.addChild(Release4_r1);
        setRotationAngle(Release4_r1, 0.0F, 0.0F, 0.7854F);
        Release4_r1.cubeList.add(new ModelBox(Release4_r1, 0, 0, -2.1F, -39.6F, -22.5F, 1, 1, 14, 0.0F, true));

        Release3_r1 = new ModelRenderer(this);
        Release3_r1.setRotationPoint(-48.1756F, -10.9622F, 25.928F);
        release.addChild(Release3_r1);
        setRotationAngle(Release3_r1, 0.0F, 0.0F, 0.7854F);
        Release3_r1.cubeList.add(new ModelBox(Release3_r1, 0, 0, -0.9F, -39.6F, -22.5F, 1, 1, 14, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        release.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
