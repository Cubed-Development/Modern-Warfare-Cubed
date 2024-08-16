package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Remington870Barrel extends ModelWithAttachments {
    private final ModelRenderer barrel;
    private final ModelRenderer barrel50_r1;
    private final ModelRenderer barrel47_r1;
    private final ModelRenderer barrel46_r1;
    private final ModelRenderer barrel43_r1;
    private final ModelRenderer barrel42_r1;
    private final ModelRenderer barrel40_r1;
    private final ModelRenderer barrel39_r1;
    private final ModelRenderer barrel38_r1;
    private final ModelRenderer barrel37_r1;
    private final ModelRenderer barrel36_r1;
    private final ModelRenderer barrel35_r1;
    private final ModelRenderer barrel31_r1;
    private final ModelRenderer barrel30_r1;
    private final ModelRenderer barrel29_r1;
    private final ModelRenderer barrel28_r1;
    private final ModelRenderer barrel27_r1;
    private final ModelRenderer barrel26_r1;
    private final ModelRenderer barrel17_r1;
    private final ModelRenderer barrel13_r1;
    private final ModelRenderer barrel10_r1;
    private final ModelRenderer barrel9_r1;
    private final ModelRenderer barrel8_r1;
    private final ModelRenderer barrel7_r1;
    private final ModelRenderer barrel6_r1;
    private final ModelRenderer barrel5_r1;
    private final ModelRenderer barrel4_r1;
    private final ModelRenderer barrel3_r1;
    private final ModelRenderer barrel3_r2;
    private final ModelRenderer barrel3_r3;

    public Remington870Barrel() {
        textureWidth = 410;
        textureHeight = 410;

        barrel = new ModelRenderer(this);
        barrel.setRotationPoint(-19.9555F, 16.9768F, 0.0F);
        barrel.cubeList.add(new ModelBox(barrel, 287, 0, 18.1555F, -21.5768F, -32.0F, 1, 2, 18, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 180, 108, 17.4555F, -22.6768F, -69.0F, 3, 1, 55, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 192, 174, 18.4555F, -23.6768F, -69.0F, 1, 3, 55, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 228, 232, 18.4555F, -19.5768F, -39.0F, 1, 2, 25, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 19, 105, 18.4555F, -23.9768F, -68.9F, 1, 1, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 140, 87, 17.2555F, -19.5768F, -41.5F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 83, 140, 19.6555F, -19.5768F, -41.5F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 140, 82, 18.4555F, -18.3768F, -41.5F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 118, 34, 17.9555F, -21.5768F, -40.5F, 2, 2, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 90, 83, 17.1555F, -19.9768F, -40.5F, 1, 2, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 49, 90, 19.7555F, -19.9768F, -40.5F, 1, 2, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 103, 10, 17.9555F, -18.2768F, -40.5F, 2, 1, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 324, 292, 17.4555F, -19.5768F, -39.0F, 3, 1, 25, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 151, 129, 18.4555F, -20.5768F, -38.0F, 1, 1, 6, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 26, 350, 18.7555F, -21.5768F, -38.0F, 1, 2, 24, 0.0F, false));

        barrel50_r1 = new ModelRenderer(this);
        barrel50_r1.setRotationPoint(19.9555F, -9.6077F, -44.7767F);
        barrel.addChild(barrel50_r1);
        setRotationAngle(barrel50_r1, -1.5621F, 0.0F, 0.0F);
        barrel50_r1.cubeList.add(new ModelBox(barrel50_r1, 34, 170, -1.5F, -30.9F, -14.0F, 1, 15, 1, 0.0F, false));

        barrel47_r1 = new ModelRenderer(this);
        barrel47_r1.setRotationPoint(34.7897F, -36.0323F, 0.0F);
        barrel.addChild(barrel47_r1);
        setRotationAngle(barrel47_r1, 0.0F, 0.0F, -2.3562F);
        barrel47_r1.cubeList.add(new ModelBox(barrel47_r1, 147, 334, -1.5F, -24.6F, -39.0F, 1, 1, 25, 0.0F, false));

        barrel46_r1 = new ModelRenderer(this);
        barrel46_r1.setRotationPoint(37.3252F, -2.2426F, 0.0F);
        barrel.addChild(barrel46_r1);
        setRotationAngle(barrel46_r1, 0.0F, 0.0F, -0.7854F);
        barrel46_r1.cubeList.add(new ModelBox(barrel46_r1, 199, 334, -2.5F, -25.6F, -39.0F, 1, 1, 25, 0.0F, false));

        barrel43_r1 = new ModelRenderer(this);
        barrel43_r1.setRotationPoint(36.4968F, -35.3252F, 0.0F);
        barrel.addChild(barrel43_r1);
        setRotationAngle(barrel43_r1, 0.0F, 0.0F, -2.3562F);
        barrel43_r1.cubeList.add(new ModelBox(barrel43_r1, 336, 149, -0.5F, -24.6F, -39.0F, 1, 1, 25, 0.0F, false));

        barrel42_r1 = new ModelRenderer(this);
        barrel42_r1.setRotationPoint(2.7071F, -37.0323F, 0.0F);
        barrel.addChild(barrel42_r1);
        setRotationAngle(barrel42_r1, 0.0F, 0.0F, 2.3562F);
        barrel42_r1.cubeList.add(new ModelBox(barrel42_r1, 338, 323, 0.5F, -25.6F, -39.0F, 1, 1, 25, 0.0F, false));

        barrel40_r1 = new ModelRenderer(this);
        barrel40_r1.setRotationPoint(2.0F, -38.7394F, 0.0F);
        barrel.addChild(barrel40_r1);
        setRotationAngle(barrel40_r1, 0.0F, 0.0F, 2.3562F);
        barrel40_r1.cubeList.add(new ModelBox(barrel40_r1, 339, 175, 0.5F, -26.6F, -39.0F, 1, 1, 25, 0.0F, false));

        barrel39_r1 = new ModelRenderer(this);
        barrel39_r1.setRotationPoint(38.0323F, -2.5355F, 0.0F);
        barrel.addChild(barrel39_r1);
        setRotationAngle(barrel39_r1, 0.0F, 0.0F, -0.7854F);
        barrel39_r1.cubeList.add(new ModelBox(barrel39_r1, 342, 263, -2.5F, -26.6003F, -39.0F, 1, 1, 25, 0.0F, false));

        barrel38_r1 = new ModelRenderer(this);
        barrel38_r1.setRotationPoint(33.0122F, 2.0551F, 0.0F);
        barrel.addChild(barrel38_r1);
        setRotationAngle(barrel38_r1, 0.0F, 0.0F, -0.5205F);
        barrel38_r1.cubeList.add(new ModelBox(barrel38_r1, 49, 105, -2.8F, -27.0F, -40.5F, 1, 1, 2, 0.0F, false));

        barrel37_r1 = new ModelRenderer(this);
        barrel37_r1.setRotationPoint(37.3132F, -2.9267F, 0.0F);
        barrel.addChild(barrel37_r1);
        setRotationAngle(barrel37_r1, 0.0F, 0.0F, -0.8179F);
        barrel37_r1.cubeList.add(new ModelBox(barrel37_r1, 105, 83, -2.8F, -25.0F, -40.5F, 1, 1, 2, 0.0F, false));

        barrel36_r1 = new ModelRenderer(this);
        barrel36_r1.setRotationPoint(4.7762F, -37.2201F, 0.0F);
        barrel.addChild(barrel36_r1);
        setRotationAngle(barrel36_r1, 0.0F, 0.0F, 2.4166F);
        barrel36_r1.cubeList.add(new ModelBox(barrel36_r1, 105, 88, 0.8F, -25.0F, -40.5F, 1, 1, 2, 0.0F, false));

        barrel35_r1 = new ModelRenderer(this);
        barrel35_r1.setRotationPoint(4.5447F, 2.2995F, 0.0F);
        barrel.addChild(barrel35_r1);
        setRotationAngle(barrel35_r1, 0.0F, 0.0F, 0.5949F);
        barrel35_r1.cubeList.add(new ModelBox(barrel35_r1, 106, 97, 0.0F, -27.5F, -40.5F, 1, 1, 2, 0.0F, false));

        barrel31_r1 = new ModelRenderer(this);
        barrel31_r1.setRotationPoint(34.6482F, -35.6909F, 0.0F);
        barrel.addChild(barrel31_r1);
        setRotationAngle(barrel31_r1, 0.0F, 0.0F, -2.3562F);
        barrel31_r1.cubeList.add(new ModelBox(barrel31_r1, 128, 50, -1.5F, -24.4F, -41.5F, 1, 1, 4, 0.0F, false));

        barrel30_r1 = new ModelRenderer(this);
        barrel30_r1.setRotationPoint(37.2666F, -2.3841F, 0.0F);
        barrel.addChild(barrel30_r1);
        setRotationAngle(barrel30_r1, 0.0F, 0.0F, -0.7854F);
        barrel30_r1.cubeList.add(new ModelBox(barrel30_r1, 128, 99, -2.7F, -25.6F, -41.5F, 1, 1, 4, 0.0F, false));

        barrel29_r1 = new ModelRenderer(this);
        barrel29_r1.setRotationPoint(37.9737F, -2.677F, 0.0F);
        barrel.addChild(barrel29_r1);
        setRotationAngle(barrel29_r1, 0.0F, 0.0F, -0.7854F);
        barrel29_r1.cubeList.add(new ModelBox(barrel29_r1, 130, 0, -2.7F, -26.6F, -41.5F, 1, 1, 4, 0.0F, false));

        barrel28_r1 = new ModelRenderer(this);
        barrel28_r1.setRotationPoint(3.0485F, -37.1737F, 0.0F);
        barrel.addChild(barrel28_r1);
        setRotationAngle(barrel28_r1, 0.0F, 0.0F, 2.3562F);
        barrel28_r1.cubeList.add(new ModelBox(barrel28_r1, 130, 43, 0.7F, -25.6F, -41.5F, 1, 1, 4, 0.0F, false));

        barrel27_r1 = new ModelRenderer(this);
        barrel27_r1.setRotationPoint(36.3553F, -34.9838F, 0.0F);
        barrel.addChild(barrel27_r1);
        setRotationAngle(barrel27_r1, 0.0F, 0.0F, -2.3562F);
        barrel27_r1.cubeList.add(new ModelBox(barrel27_r1, 138, 50, -0.5F, -24.4F, -41.5F, 1, 1, 4, 0.0F, false));

        barrel26_r1 = new ModelRenderer(this);
        barrel26_r1.setRotationPoint(2.3414F, -38.8808F, 0.0F);
        barrel.addChild(barrel26_r1);
        setRotationAngle(barrel26_r1, 0.0F, 0.0F, 2.3562F);
        barrel26_r1.cubeList.add(new ModelBox(barrel26_r1, 26, 140, 0.7F, -26.6F, -41.5F, 1, 1, 4, 0.0F, false));

        barrel17_r1 = new ModelRenderer(this);
        barrel17_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        barrel.addChild(barrel17_r1);
        setRotationAngle(barrel17_r1, 0.0F, 0.0F, 0.7854F);
        barrel17_r1.cubeList.add(new ModelBox(barrel17_r1, 355, 103, -1.5F, -27.6F, -38.0F, 1, 1, 24, 0.0F, false));

        barrel13_r1 = new ModelRenderer(this);
        barrel13_r1.setRotationPoint(-0.051F, -1.0446F, 0.0F);
        barrel.addChild(barrel13_r1);
        setRotationAngle(barrel13_r1, 0.0F, 0.0F, 0.8029F);
        barrel13_r1.cubeList.add(new ModelBox(barrel13_r1, 355, 289, -0.5F, -27.6F, -38.0F, 1, 1, 24, 0.0F, false));

        barrel10_r1 = new ModelRenderer(this);
        barrel10_r1.setRotationPoint(39.5172F, -3.1506F, 0.0F);
        barrel.addChild(barrel10_r1);
        setRotationAngle(barrel10_r1, 0.0F, 0.0F, -0.7854F);
        barrel10_r1.cubeList.add(new ModelBox(barrel10_r1, 0, 217, -2.5F, -28.7F, -69.0F, 1, 1, 55, 0.0F, false));

        barrel9_r1 = new ModelRenderer(this);
        barrel9_r1.setRotationPoint(-2.192F, -0.908F, 0.0F);
        barrel.addChild(barrel9_r1);
        setRotationAngle(barrel9_r1, 0.0F, 0.0F, 0.7854F);
        barrel9_r1.cubeList.add(new ModelBox(barrel9_r1, 57, 220, -1.4985F, -30.7F, -69.0F, 1, 1, 55, 0.0F, false));

        barrel8_r1 = new ModelRenderer(this);
        barrel8_r1.setRotationPoint(40.2243F, -3.4435F, 0.0F);
        barrel.addChild(barrel8_r1);
        setRotationAngle(barrel8_r1, 0.0F, 0.0F, -0.7854F);
        barrel8_r1.cubeList.add(new ModelBox(barrel8_r1, 114, 225, -2.5F, -29.7F, -69.0F, 1, 1, 55, 0.0F, false));

        barrel7_r1 = new ModelRenderer(this);
        barrel7_r1.setRotationPoint(36.9817F, -41.3243F, 0.0F);
        barrel.addChild(barrel7_r1);
        setRotationAngle(barrel7_r1, 0.0F, 0.0F, -2.3562F);
        barrel7_r1.cubeList.add(new ModelBox(barrel7_r1, 171, 232, -1.5F, -27.7F, -69.0F, 1, 1, 55, 0.0F, false));

        barrel6_r1 = new ModelRenderer(this);
        barrel6_r1.setRotationPoint(38.6888F, -40.6172F, 0.0F);
        barrel.addChild(barrel6_r1);
        setRotationAngle(barrel6_r1, 0.0F, 0.0F, -2.3562F);
        barrel6_r1.cubeList.add(new ModelBox(barrel6_r1, 228, 233, -0.5F, -27.7F, -69.0F, 1, 1, 55, 0.0F, false));

        barrel5_r1 = new ModelRenderer(this);
        barrel5_r1.setRotationPoint(0.5151F, -42.3243F, 0.0F);
        barrel.addChild(barrel5_r1);
        setRotationAngle(barrel5_r1, 0.0F, 0.0F, 2.3562F);
        barrel5_r1.cubeList.add(new ModelBox(barrel5_r1, 241, 106, 0.5F, -28.7F, -69.0F, 1, 1, 55, 0.0F, false));

        barrel4_r1 = new ModelRenderer(this);
        barrel4_r1.setRotationPoint(-0.192F, -44.0314F, 0.0F);
        barrel.addChild(barrel4_r1);
        setRotationAngle(barrel4_r1, 0.0F, 0.0F, 2.3562F);
        barrel4_r1.cubeList.add(new ModelBox(barrel4_r1, 249, 162, 0.5F, -29.7F, -69.0F, 1, 1, 55, 0.0F, false));

        barrel3_r1 = new ModelRenderer(this);
        barrel3_r1.setRotationPoint(42.1919F, -1.9911F, 0.0F);
        barrel.addChild(barrel3_r1);
        setRotationAngle(barrel3_r1, 0.0698F, 0.0F, -0.8029F);
        barrel3_r1.cubeList.add(new ModelBox(barrel3_r1, 114, 71, -1.7F, -33.2F, -20.8F, 1, 1, 9, 0.0F, false));

        barrel3_r2 = new ModelRenderer(this);
        barrel3_r2.setRotationPoint(-2.2809F, -1.9911F, 0.0F);
        barrel.addChild(barrel3_r2);
        setRotationAngle(barrel3_r2, 0.0698F, 0.0F, 0.8029F);
        barrel3_r2.cubeList.add(new ModelBox(barrel3_r2, 114, 82, -0.6F, -31.8F, -20.9F, 1, 1, 9, 0.0F, false));

        barrel3_r3 = new ModelRenderer(this);
        barrel3_r3.setRotationPoint(-2.2809F, -1.9911F, 0.0F);
        barrel.addChild(barrel3_r3);
        setRotationAngle(barrel3_r3, 0.0F, 0.0F, 0.8029F);
        barrel3_r3.cubeList.add(new ModelBox(barrel3_r3, 197, 50, -0.5F, -30.7F, -69.0F, 1, 1, 55, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        barrel.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
