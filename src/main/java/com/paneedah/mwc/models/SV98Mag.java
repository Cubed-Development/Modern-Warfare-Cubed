package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SV98Mag extends ModelWithAttachments {
    private final ModelRenderer mag;
    private final ModelRenderer cube_r16_r1;
    private final ModelRenderer cube_r15_r1;
    private final ModelRenderer cube_r14_r1;
    private final ModelRenderer cube_r13_r1;
    private final ModelRenderer cube_r12_r1;
    private final ModelRenderer cube_r11_r1;
    private final ModelRenderer cube_r10_r1;
    private final ModelRenderer cube_r9_r1;
    private final ModelRenderer cube_r8_r1;
    private final ModelRenderer cube_r7_r1;
    private final ModelRenderer cube_r6_r1;
    private final ModelRenderer cube_r5_r1;
    private final ModelRenderer cube_r4_r1;
    private final ModelRenderer cube_r3_r1;
    private final ModelRenderer cube_r2_r1;
    private final ModelRenderer cube_r1_r1;

    public SV98Mag() {
        textureWidth = 430;
        textureHeight = 430;

        mag = new ModelRenderer(this);
        mag.setRotationPoint(0.75F, -2.0F, -26.7F);
        mag.cubeList.add(new ModelBox(mag, 74, 78, -1.4F, -4.7F, -2.1F, 1, 1, 2, 0.001F, false));
        mag.cubeList.add(new ModelBox(mag, 44, 66, -2.15F, -3.7F, -2.1F, 1, 2, 2, 0.2F, false));
        mag.cubeList.add(new ModelBox(mag, 47, 0, -1.4F, -3.65F, -3.15F, 1, 2, 1, 0.001F, false));
        mag.cubeList.add(new ModelBox(mag, 0, 0, -3.3F, -8.45F, -3.1F, 2, 6, 2, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 60, 36, -2.5F, -8.45F, -1.65F, 1, 6, 2, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 46, 46, -1.4F, -3.65F, -0.05F, 1, 2, 1, 0.001F, false));
        mag.cubeList.add(new ModelBox(mag, 14, 95, -1.5F, -9.1F, 4.4F, 1, 1, 6, 0.001F, false));
        mag.cubeList.add(new ModelBox(mag, 103, 30, -1.6F, -9.1F, -0.2F, 1, 1, 5, -0.001F, false));
        mag.cubeList.add(new ModelBox(mag, 0, 66, -1.6F, -8.1F, 4.4F, 1, 8, 6, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 0, 117, -1.4F, -7.1F, 0.2F, 1, 1, 4, -0.201F, false));
        mag.cubeList.add(new ModelBox(mag, 61, 74, -3.4F, -8.8F, -3.3F, 3, 1, 4, -0.198F, false));
        mag.cubeList.add(new ModelBox(mag, 69, 114, -1.4F, -5.3F, 0.4F, 1, 1, 4, -0.201F, false));
        mag.cubeList.add(new ModelBox(mag, 86, 112, -2.1F, -7.1F, -1.7F, 1, 1, 4, -0.201F, false));
        mag.cubeList.add(new ModelBox(mag, 99, 112, -2.1F, -5.3F, -1.7F, 1, 1, 4, -0.201F, false));
        mag.cubeList.add(new ModelBox(mag, 56, 114, -1.4F, -3.6F, 0.4F, 1, 1, 4, -0.201F, false));
        mag.cubeList.add(new ModelBox(mag, 38, 66, -1.85F, -8.3F, 0.4F, 1, 8, 4, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 24, 60, -4.1F, -4.7F, -2.1F, 1, 1, 2, 0.001F, false));
        mag.cubeList.add(new ModelBox(mag, 57, 87, -4.1F, -3.65F, -3.15F, 3, 2, 1, 0.002F, false));
        mag.cubeList.add(new ModelBox(mag, 33, 0, -4.1F, -3.65F, -0.05F, 1, 2, 1, 0.001F, false));
        mag.cubeList.add(new ModelBox(mag, 16, 53, -4.0F, -9.1F, 4.4F, 1, 1, 6, 0.001F, false));
        mag.cubeList.add(new ModelBox(mag, 33, 33, -3.9F, -8.1F, 4.4F, 1, 8, 6, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 86, 95, -1.6F, -0.1F, 5.4F, 1, 1, 5, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 86, 101, -3.9F, -0.1F, 5.4F, 1, 1, 5, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 130, 70, -3.9F, -9.1F, -0.2F, 3, 1, 6, -0.002F, false));
        mag.cubeList.add(new ModelBox(mag, 140, 124, -3.75F, -9.6F, 5.2F, 3, 1, 5, -0.001F, false));
        mag.cubeList.add(new ModelBox(mag, 24, 66, -3.65F, -8.3F, 0.4F, 1, 8, 4, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 89, 15, -4.1F, -7.1F, 0.2F, 1, 1, 4, -0.201F, false));
        mag.cubeList.add(new ModelBox(mag, 89, 20, -4.1F, -5.3F, 0.4F, 1, 1, 4, -0.201F, false));
        mag.cubeList.add(new ModelBox(mag, 69, 102, -4.1F, -3.6F, 0.4F, 1, 1, 4, -0.201F, false));
        mag.cubeList.add(new ModelBox(mag, 89, 7, -4.1F, -8.8F, -3.3F, 2, 1, 4, -0.199F, false));
        mag.cubeList.add(new ModelBox(mag, 69, 107, -3.5F, -5.3F, -1.7F, 1, 1, 4, -0.201F, false));
        mag.cubeList.add(new ModelBox(mag, 0, 112, -3.5F, -7.1F, -1.7F, 1, 1, 4, -0.201F, false));
        mag.cubeList.add(new ModelBox(mag, 60, 0, -3.0F, -8.45F, -1.65F, 1, 6, 2, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 30, 66, -3.35F, -3.7F, -2.1F, 1, 2, 2, 0.2F, false));

        cube_r16_r1 = new ModelRenderer(this);
        cube_r16_r1.setRotationPoint(-32.6669F, 4.9486F, 26.7F);
        mag.addChild(cube_r16_r1);
        setRotationAngle(cube_r16_r1, 0.0F, 0.0F, 1.1519F);
        cube_r16_r1.cubeList.add(new ModelBox(cube_r16_r1, 102, 88, -0.75F, -35.1F, -21.5F, 1, 1, 5, 0.0F, false));

        cube_r15_r1 = new ModelRenderer(this);
        cube_r15_r1.setRotationPoint(-11.6656F, 28.3387F, 21.0558F);
        mag.addChild(cube_r15_r1);
        setRotationAngle(cube_r15_r1, -0.1918F, 0.0847F, 0.4107F);
        cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 0, 112, -0.15F, -27.1F, -26.6F, 1, 1, 11, -0.101F, false));

        cube_r14_r1 = new ModelRenderer(this);
        cube_r14_r1.setRotationPoint(9.9063F, 27.1453F, 21.3096F);
        mag.addChild(cube_r14_r1);
        setRotationAngle(cube_r14_r1, -0.1918F, -0.0847F, -0.4107F);
        cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 56, 102, -3.85F, -27.1F, -26.601F, 1, 1, 11, -0.101F, false));

        cube_r13_r1 = new ModelRenderer(this);
        cube_r13_r1.setRotationPoint(-0.75F, 26.7917F, 25.3113F);
        mag.addChild(cube_r13_r1);
        setRotationAngle(cube_r13_r1, -0.0524F, 0.0F, 0.0F);
        cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 26, 16, -3.25F, -31.1F, -16.8F, 1, 5, 1, 0.001F, false));
        cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 41, 33, -2.75F, -31.1F, -16.801F, 3, 5, 1, 0.001F, false));

        cube_r12_r1 = new ModelRenderer(this);
        cube_r12_r1.setRotationPoint(-0.75F, 30.9188F, 20.5086F);
        mag.addChild(cube_r12_r1);
        setRotationAngle(cube_r12_r1, -0.2094F, 0.0F, 0.0F);
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 45, 16, -3.35F, -28.1F, -16.7F, 2, 1, 1, -0.003F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 27, 0, -3.55F, -28.6F, -26.4F, 1, 2, 1, -0.202F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 26, 41, -3.35F, -28.1F, -23.0F, 1, 1, 1, -0.001F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 89, 15, -3.65F, -28.7F, -26.4F, 3, 1, 11, -0.302F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 164, 194, -3.45F, -27.4F, -29.6F, 3, 1, 14, -0.1F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 61, 69, -2.45F, -27.1F, -30.0F, 3, 1, 1, -0.102F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 72, 42, -3.55F, -27.1F, -30.0F, 3, 1, 1, -0.101F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 60, 45, -3.55F, -27.1F, -29.6F, 3, 1, 4, -0.1F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 33, 52, -3.85F, -27.101F, -26.601F, 3, 1, 11, -0.1F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 14, 99, -1.65F, -28.1F, -16.7F, 2, 1, 1, -0.001F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 95, 17, -0.65F, -28.1F, -23.0F, 1, 1, 1, -0.001F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 60, 45, -0.45F, -28.6F, -26.4F, 1, 2, 1, -0.202F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 138, 49, -1.35F, -28.7F, -26.4F, 2, 1, 11, -0.3F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 195, 106, -1.55F, -27.4F, -29.6F, 2, 1, 14, -0.098F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 89, 37, -1.45F, -27.1F, -29.6F, 2, 1, 4, -0.099F, false));
        cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 139, 82, -1.15F, -27.1F, -26.6F, 2, 1, 11, -0.1F, false));

        cube_r11_r1 = new ModelRenderer(this);
        cube_r11_r1.setRotationPoint(-0.75F, 35.9586F, -2.8578F);
        mag.addChild(cube_r11_r1);
        setRotationAngle(cube_r11_r1, -0.7854F, 0.0F, 0.0F);
        cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 64, 31, -3.35F, -30.7F, -26.3F, 1, 1, 1, 0.0F, false));
        cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 64, 0, -3.35F, -30.7F, -26.8F, 1, 1, 1, -0.001F, false));
        cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 76, 91, -0.65F, -30.7F, -26.3F, 1, 1, 1, 0.0F, false));
        cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 95, 15, -0.65F, -30.7F, -26.8F, 1, 1, 1, -0.001F, false));

        cube_r10_r1 = new ModelRenderer(this);
        cube_r10_r1.setRotationPoint(-0.75F, 37.3729F, -3.4436F);
        mag.addChild(cube_r10_r1);
        setRotationAngle(cube_r10_r1, -0.7854F, 0.0F, 0.0F);
        cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 64, 36, -3.35F, -30.2F, -28.8F, 1, 1, 1, 0.0F, false));
        cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 64, 23, -3.35F, -30.7F, -28.8F, 1, 1, 1, -0.001F, false));
        cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 89, 39, -0.65F, -30.2F, -28.8F, 1, 1, 1, 0.0F, false));
        cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 25, 92, -0.65F, -30.7F, -28.8F, 1, 1, 1, -0.001F, false));

        cube_r9_r1 = new ModelRenderer(this);
        cube_r9_r1.setRotationPoint(-0.75F, 36.1095F, -0.3936F);
        mag.addChild(cube_r9_r1);
        setRotationAngle(cube_r9_r1, -0.7854F, 0.0F, 0.0F);
        cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 24, 82, -3.35F, -27.25F, -26.75F, 1, 1, 1, 0.0F, false));
        cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 65, 7, -3.35F, -27.65F, -26.75F, 1, 1, 1, -0.001F, false));
        cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 89, 32, -0.65F, -27.25F, -26.75F, 1, 1, 1, 0.0F, false));
        cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 89, 37, -0.65F, -27.65F, -26.75F, 1, 1, 1, -0.001F, false));

        cube_r8_r1 = new ModelRenderer(this);
        cube_r8_r1.setRotationPoint(-0.75F, 38.9379F, -1.5652F);
        mag.addChild(cube_r8_r1);
        setRotationAngle(cube_r8_r1, -0.7854F, 0.0F, 0.0F);
        cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 89, 3, -3.35F, -28.65F, -29.75F, 1, 1, 1, 0.0F, false));
        cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 89, 30, -0.65F, -28.65F, -29.75F, 1, 1, 1, 0.0F, false));

        cube_r7_r1 = new ModelRenderer(this);
        cube_r7_r1.setRotationPoint(-0.75F, 34.4433F, 13.4339F);
        mag.addChild(cube_r7_r1);
        setRotationAngle(cube_r7_r1, -0.384F, 0.0F, 0.0F);
        cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 89, 69, -3.75F, -29.9F, -28.35F, 2, 2, 2, -0.3F, false));
        cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 89, 73, -1.25F, -29.9F, -28.35F, 2, 2, 2, -0.3F, false));

        cube_r6_r1 = new ModelRenderer(this);
        cube_r6_r1.setRotationPoint(-0.75F, 22.828F, 31.8633F);
        mag.addChild(cube_r6_r1);
        setRotationAngle(cube_r6_r1, 0.1745F, 0.0F, 0.0F);
        cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 0, 24, -3.25F, -35.1F, -16.55F, 1, 4, 1, 0.0F, false));
        cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 57, 82, -2.75F, -35.1F, -16.551F, 3, 4, 1, 0.0F, false));

        cube_r5_r1 = new ModelRenderer(this);
        cube_r5_r1.setRotationPoint(-0.75F, 27.1112F, 25.3029F);
        mag.addChild(cube_r5_r1);
        setRotationAngle(cube_r5_r1, -0.0524F, 0.0F, 0.0F);
        cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 27, 22, -3.15F, -31.1F, -22.9F, 1, 5, 1, 0.002F, false));
        cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 47, 88, -0.85F, -31.1F, -22.9F, 1, 5, 1, 0.002F, false));

        cube_r4_r1 = new ModelRenderer(this);
        cube_r4_r1.setRotationPoint(-0.75F, 23.129F, 30.3295F);
        mag.addChild(cube_r4_r1);
        setRotationAngle(cube_r4_r1, 0.1222F, 0.0F, 0.0F);
        cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 14, 33, -3.15F, -35.1F, -22.65F, 1, 4, 1, 0.001F, false));
        cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 77, 62, -0.85F, -35.1F, -22.65F, 1, 4, 1, 0.001F, false));

        cube_r3_r1 = new ModelRenderer(this);
        cube_r3_r1.setRotationPoint(-0.75F, 22.6049F, 30.2975F);
        mag.addChild(cube_r3_r1);
        setRotationAngle(cube_r3_r1, 0.1222F, 0.0F, 0.0F);
        cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 51, 20, -3.35F, -34.9F, -26.75F, 1, 4, 1, -0.2F, false));
        cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 60, 12, -0.65F, -34.9F, -26.75F, 1, 4, 1, -0.2F, false));

        cube_r2_r1 = new ModelRenderer(this);
        cube_r2_r1.setRotationPoint(-0.75F, 27.3364F, 25.297F);
        mag.addChild(cube_r2_r1);
        setRotationAngle(cube_r2_r1, -0.0524F, 0.0F, 0.0F);
        cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 77, 49, -3.35F, -31.3F, -27.0F, 1, 5, 1, -0.199F, false));
        cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 47, 82, -0.65F, -31.3F, -27.0F, 1, 5, 1, -0.199F, false));

        cube_r1_r1 = new ModelRenderer(this);
        cube_r1_r1.setRotationPoint(29.3871F, 2.208F, 26.7F);
        mag.addChild(cube_r1_r1);
        setRotationAngle(cube_r1_r1, 0.0F, 0.0F, -1.1519F);
        cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 102, 82, -3.25F, -35.1F, -21.5F, 1, 1, 5, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        mag.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
