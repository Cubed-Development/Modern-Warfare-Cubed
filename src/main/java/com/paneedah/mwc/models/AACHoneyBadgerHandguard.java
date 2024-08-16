package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AACHoneyBadgerHandguard extends ModelWithAttachments {
    private final ModelRenderer handguard;
    private final ModelRenderer bone5_r1;
    private final ModelRenderer bone6_r1;
    private final ModelRenderer bone4_r1;

    public AACHoneyBadgerHandguard() {
        textureWidth = 256;
        textureHeight = 256;

        handguard = new ModelRenderer(this);
        handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
        handguard.cubeList.add(new ModelBox(handguard, 102, 71, -4.0F, -38.5F, -42.7F, 1, 1, 20, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 22, 101, 0.0F, -38.5F, -42.7F, 1, 1, 20, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 54, 11, 0.01F, -37.5F, -42.7F, 1, 1, 3, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 54, 0, -3.99F, -37.5F, -42.7F, 1, 1, 3, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 39, 40, 0.01F, -37.5F, -26.7F, 1, 1, 4, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 124, 22, -3.49F, -37.5F, -36.7F, 4, 1, 14, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 39, 17, -3.99F, -37.5F, -26.7F, 1, 1, 4, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 54, 4, 0.01F, -37.5F, -34.7F, 1, 1, 3, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 27, 46, -3.99F, -37.5F, -34.7F, 1, 1, 3, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 26, 80, -2.5F, -40.1F, -42.7F, 2, 1, 20, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 102, 22, -4.0F, -36.9F, -42.7F, 1, 1, 20, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 72, 102, 0.0F, -36.9F, -42.7F, 1, 1, 20, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 79, 50, -2.4F, -35.51F, -42.7F, 2, 1, 20, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 102, 1, -2.6F, -35.5F, -42.7F, 1, 1, 20, 0.0F, false));

        bone5_r1 = new ModelRenderer(this);
        bone5_r1.setRotationPoint(-30.9225F, -10.6895F, 0.0F);
        handguard.addChild(bone5_r1);
        setRotationAngle(bone5_r1, 0.0F, 0.0F, 0.8727F);
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 6, 36, -4.0F, -40.5F, -42.7F, 1, 1, 1, 0.0F, false));
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 80, 25, -4.0F, -39.5F, -42.7F, 1, 1, 20, 0.0F, false));
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 80, 0, -4.01F, -41.0F, -42.7F, 1, 1, 20, 0.0F, false));
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 54, 37, -4.0F, -40.5F, -37.7F, 1, 1, 2, 0.0F, false));
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 38, 122, -3.5F, -40.5F, -36.7F, 1, 1, 12, 0.0F, false));
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 18, 53, -4.0F, -40.5F, -30.7F, 1, 1, 2, 0.0F, false));
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 45, 40, -4.0F, -40.5F, -24.7F, 1, 1, 2, 0.0F, false));

        bone6_r1 = new ModelRenderer(this);
        bone6_r1.setRotationPoint(-25.0923F, -11.222F, 0.0F);
        handguard.addChild(bone6_r1);
        setRotationAngle(bone6_r1, 0.0F, 0.0F, 0.7854F);
        bone6_r1.cubeList.add(new ModelBox(bone6_r1, 80, 80, 0.0F, -35.9F, -42.7F, 1, 2, 20, 0.0F, false));
        bone6_r1.cubeList.add(new ModelBox(bone6_r1, 56, 78, -2.5355F, -33.3645F, -42.7F, 2, 1, 20, 0.0F, false));

        bone4_r1 = new ModelRenderer(this);
        bone4_r1.setRotationPoint(29.8508F, -12.9877F, 0.0F);
        handguard.addChild(bone4_r1);
        setRotationAngle(bone4_r1, 0.0F, 0.0F, -0.8727F);
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 39, 3, 0.0F, -40.5F, -42.7F, 1, 1, 1, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 0, 100, 0.01F, -41.0F, -42.7F, 1, 1, 20, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 17, 58, 0.0F, -40.5F, -37.7F, 1, 1, 2, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 44, 101, -0.5F, -40.5F, -35.7F, 1, 1, 12, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 56, 56, 0.0F, -40.5F, -30.7F, 1, 1, 2, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 54, 40, 0.0F, -40.5F, -24.7F, 1, 1, 2, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 50, 99, 0.0F, -39.5F, -42.7F, 1, 1, 20, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        handguard.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
