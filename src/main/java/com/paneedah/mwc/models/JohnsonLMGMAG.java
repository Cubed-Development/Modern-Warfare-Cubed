package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class JohnsonLMGMAG extends ModelWithAttachments {
    private final ModelRenderer magazine;
    private final ModelRenderer MAG20_r1;
    private final ModelRenderer MAG19_r1;
    private final ModelRenderer MAG17_r1;
    private final ModelRenderer MAG2_r1;

    public JohnsonLMGMAG() {
        textureWidth = 256;
        textureHeight = 256;

        magazine = new ModelRenderer(this);
        magazine.setRotationPoint(-0.5536F, 24.0F, 15.0695F);
        magazine.cubeList.add(new ModelBox(magazine, 0, 100, 4.5536F, -20.5F, -4.0695F, 12, 2, 9, 0.0F, true));
        magazine.cubeList.add(new ModelBox(magazine, 0, 100, 4.5536F, -20.8F, -0.0695F, 12, 1, 4, 0.0F, true));
        magazine.cubeList.add(new ModelBox(magazine, 0, 100, 4.5536F, -19.2F, -0.0695F, 12, 1, 4, 0.0F, true));
        magazine.cubeList.add(new ModelBox(magazine, 0, 100, 4.5536F, -20.8F, -3.7695F, 12, 1, 3, 0.0F, true));
        magazine.cubeList.add(new ModelBox(magazine, 0, 100, 4.5536F, -19.2F, -3.7695F, 12, 1, 3, 0.0F, true));

        MAG20_r1 = new ModelRenderer(this);
        MAG20_r1.setRotationPoint(-1.8809F, 0.0F, -7.2047F);
        magazine.addChild(MAG20_r1);
        setRotationAngle(MAG20_r1, 0.0F, 0.3665F, 0.0F);
        MAG20_r1.cubeList.add(new ModelBox(MAG20_r1, 0, 100, 20.0F, -19.2F, 10.8F, 8, 1, 3, 0.0F, true));
        MAG20_r1.cubeList.add(new ModelBox(MAG20_r1, 0, 100, 20.0F, -20.8F, 10.8F, 8, 1, 3, 0.0F, true));
        MAG20_r1.cubeList.add(new ModelBox(MAG20_r1, 0, 100, 20.0F, -19.2F, 14.5F, 8, 1, 4, 0.0F, true));
        MAG20_r1.cubeList.add(new ModelBox(MAG20_r1, 0, 100, 20.0F, -20.8F, 14.5F, 8, 1, 4, 0.0F, true));
        MAG20_r1.cubeList.add(new ModelBox(MAG20_r1, 0, 100, 20.0F, -20.5F, 10.5F, 8, 2, 9, 0.0F, true));

        MAG19_r1 = new ModelRenderer(this);
        MAG19_r1.setRotationPoint(-1.0261F, 0.0F, -12.7415F);
        magazine.addChild(MAG19_r1);
        setRotationAngle(MAG19_r1, 0.0F, 0.1571F, 0.0F);
        MAG19_r1.cubeList.add(new ModelBox(MAG19_r1, 0, 100, 14.0F, -19.2F, 11.5F, 8, 1, 3, 0.0F, true));
        MAG19_r1.cubeList.add(new ModelBox(MAG19_r1, 0, 100, 14.0F, -20.8F, 11.5F, 8, 1, 3, 0.0F, true));
        MAG19_r1.cubeList.add(new ModelBox(MAG19_r1, 0, 100, 14.0F, -19.2F, 15.2F, 8, 1, 4, 0.0F, true));
        MAG19_r1.cubeList.add(new ModelBox(MAG19_r1, 0, 100, 14.0F, -20.8F, 15.2F, 8, 1, 4, 0.0F, true));
        MAG19_r1.cubeList.add(new ModelBox(MAG19_r1, 0, 100, 14.0F, -20.5F, 11.2F, 8, 2, 9, 0.0F, true));

        MAG17_r1 = new ModelRenderer(this);
        MAG17_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        magazine.addChild(MAG17_r1);
        setRotationAngle(MAG17_r1, 0.0F, 0.5585F, 0.0F);
        MAG17_r1.cubeList.add(new ModelBox(MAG17_r1, 0, 100, 26.1F, -20.8F, 8.8F, 4, 1, 3, 0.0F, true));
        MAG17_r1.cubeList.add(new ModelBox(MAG17_r1, 0, 100, 26.1F, -19.2F, 12.5F, 4, 1, 4, 0.0F, true));
        MAG17_r1.cubeList.add(new ModelBox(MAG17_r1, 0, 100, 26.1F, -20.8F, 12.5F, 4, 1, 4, 0.0F, true));
        MAG17_r1.cubeList.add(new ModelBox(MAG17_r1, 0, 100, 26.1F, -19.2F, 8.8F, 4, 1, 3, 0.0F, true));
        MAG17_r1.cubeList.add(new ModelBox(MAG17_r1, 0, 100, 26.0F, -20.5F, 8.5F, 4, 2, 9, 0.0F, true));

        MAG2_r1 = new ModelRenderer(this);
        MAG2_r1.setRotationPoint(-2.051F, -1.0156F, -15.0695F);
        magazine.addChild(MAG2_r1);
        setRotationAngle(MAG2_r1, 0.0F, 0.0F, 0.1222F);
        MAG2_r1.cubeList.add(new ModelBox(MAG2_r1, 0, 100, 7.0F, -21.8F, 14.5F, 6, 1, 3, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        magazine.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
