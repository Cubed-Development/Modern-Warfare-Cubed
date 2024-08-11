package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class CollapsableMOEStock extends ModelBase {
    private final ModelRenderer gun365;
    private final ModelRenderer gun366;
    private final ModelRenderer gun367;
    private final ModelRenderer gun369;
    private final ModelRenderer gun370;
    private final ModelRenderer gun371;
    private final ModelRenderer gun372;
    private final ModelRenderer gun373;
    private final ModelRenderer gun374;
    private final ModelRenderer gun375;
    private final ModelRenderer gun376;
    private final ModelRenderer gun377;
    private final ModelRenderer gun378;
    private final ModelRenderer gun379;
    private final ModelRenderer gun380;
    private final ModelRenderer gun381;
    private final ModelRenderer gun382;
    private final ModelRenderer gun383;
    private final ModelRenderer gun384;
    private final ModelRenderer gun385;
    private final ModelRenderer gun386;
    private final ModelRenderer gun387;
    private final ModelRenderer gun388;
    private final ModelRenderer gun389;
    private final ModelRenderer gun390;
    private final ModelRenderer gun391;
    private final ModelRenderer gun392;
    private final ModelRenderer gun393;
    private final ModelRenderer gun394;
    private final ModelRenderer gun395;
    private final ModelRenderer gun396;
    private final ModelRenderer gun397;
    private final ModelRenderer gun398;
    private final ModelRenderer gun399;
    private final ModelRenderer gun400;
    private final ModelRenderer gun401;
    private final ModelRenderer gun402;
    private final ModelRenderer gun403;
    private final ModelRenderer gun404;
    private final ModelRenderer gun405;
    private final ModelRenderer gun406;
    private final ModelRenderer gun407;
    private final ModelRenderer gun408;
    private final ModelRenderer gun409;
    private final ModelRenderer gun410;
    private final ModelRenderer gun411;
    private final ModelRenderer gun412;
    private final ModelRenderer gun413;
    private final ModelRenderer gun414;

    public CollapsableMOEStock() {
        textureWidth = 90;
        textureHeight = 90;

        gun365 = new ModelRenderer(this);
        gun365.setRotationPoint(-2.0F, -11.5F, 3.5F);
        gun365.cubeList.add(new ModelBox(gun365, 10, 10, 0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F, false));

        gun366 = new ModelRenderer(this);
        gun366.setRotationPoint(-3.0F, -10.5F, 3.5F);
        gun366.cubeList.add(new ModelBox(gun366, 0, 14, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        gun367 = new ModelRenderer(this);
        gun367.setRotationPoint(-2.0F, -11.7F, 8.0F);
        gun367.cubeList.add(new ModelBox(gun367, 24, 1, 0.0F, 0.0F, 0.0F, 1, 3, 20, 0.0F, false));

        gun369 = new ModelRenderer(this);
        gun369.setRotationPoint(-3.2F, -10.5F, 7.5F);
        gun369.cubeList.add(new ModelBox(gun369, 0, 21, 0.0F, 0.0F, 0.0F, 2, 1, 20, 0.0F, false));

        gun370 = new ModelRenderer(this);
        gun370.setRotationPoint(-1.8F, -10.5F, 7.5F);
        gun370.cubeList.add(new ModelBox(gun370, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 20, 0.0F, false));

        gun371 = new ModelRenderer(this);
        gun371.setRotationPoint(-1.0F, -11.7F, 7.5F);
        setRotationAngle(gun371, 0.0F, 0.0F, 0.7854F);
        gun371.cubeList.add(new ModelBox(gun371, 46, 42, 0.0F, -0.001F, -0.001F, 1, 1, 20, 0.0F, false));

        gun372 = new ModelRenderer(this);
        gun372.setRotationPoint(-2.0F, -11.7F, 7.5F);
        setRotationAngle(gun372, 0.0F, 0.0F, 0.7854F);
        gun372.cubeList.add(new ModelBox(gun372, 46, 21, -0.001F, 0.0F, -0.001F, 1, 1, 20, 0.0F, false));

        gun373 = new ModelRenderer(this);
        gun373.setRotationPoint(-3.2F, -10.5F, 7.5F);
        setRotationAngle(gun373, 0.0F, 0.0F, -0.7854F);
        gun373.cubeList.add(new ModelBox(gun373, 46, 0, 0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F, false));

        gun374 = new ModelRenderer(this);
        gun374.setRotationPoint(-3.2F, -9.5F, 7.5F);
        setRotationAngle(gun374, 0.0F, 0.0F, -0.7854F);
        gun374.cubeList.add(new ModelBox(gun374, 22, 45, 0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F, false));

        gun375 = new ModelRenderer(this);
        gun375.setRotationPoint(0.2F, -10.5F, 7.5F);
        setRotationAngle(gun375, 0.0F, 0.0F, 2.3562F);
        gun375.cubeList.add(new ModelBox(gun375, 0, 42, 0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F, false));

        gun376 = new ModelRenderer(this);
        gun376.setRotationPoint(0.2F, -9.5F, 7.5F);
        setRotationAngle(gun376, 0.0F, 0.0F, 2.3562F);
        gun376.cubeList.add(new ModelBox(gun376, 24, 24, 0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F, false));

        gun377 = new ModelRenderer(this);
        gun377.setRotationPoint(-2.5F, -8.3F, 7.5F);
        setRotationAngle(gun377, 0.2974F, 0.0F, 0.0F);
        gun377.cubeList.add(new ModelBox(gun377, 24, 24, -0.001F, 0.0F, 0.0F, 2, 4, 3, 0.0F, false));

        gun378 = new ModelRenderer(this);
        gun378.setRotationPoint(-2.5F, -9.3F, 7.5F);
        gun378.cubeList.add(new ModelBox(gun378, 24, 16, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        gun379 = new ModelRenderer(this);
        gun379.setRotationPoint(-2.5F, -4.5F, 8.7F);
        setRotationAngle(gun379, 1.1897F, 0.0F, 0.0F);
        gun379.cubeList.add(new ModelBox(gun379, 0, 21, -0.002F, 0.0F, 0.0F, 2, 17, 1, 0.0F, false));

        gun380 = new ModelRenderer(this);
        gun380.setRotationPoint(-2.5F, 0.9F, 24.4F);
        gun380.cubeList.add(new ModelBox(gun380, 36, 32, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        gun381 = new ModelRenderer(this);
        gun381.setRotationPoint(-3.3F, -10.9F, 27.5F);
        setRotationAngle(gun381, -0.1115F, 0.0F, 0.0F);
        gun381.cubeList.add(new ModelBox(gun381, 6, 21, 0.0F, 0.0F, 0.001F, 3, 12, 1, 0.0F, false));

        gun382 = new ModelRenderer(this);
        gun382.setRotationPoint(-0.7F, -10.9F, 27.5F);
        setRotationAngle(gun382, -0.1115F, 0.0F, 0.0F);
        gun382.cubeList.add(new ModelBox(gun382, 14, 21, 0.0F, 0.0F, 0.0F, 1, 12, 1, 0.0F, false));

        gun383 = new ModelRenderer(this);
        gun383.setRotationPoint(-2.5F, -11.8F, 27.6F);
        setRotationAngle(gun383, -0.1115F, 0.0F, 0.0F);
        gun383.cubeList.add(new ModelBox(gun383, 31, 24, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        gun384 = new ModelRenderer(this);
        gun384.setRotationPoint(-3.0F, -11.4F, 27.55F);
        setRotationAngle(gun384, -0.1115F, 0.0F, 0.0F);
        gun384.cubeList.add(new ModelBox(gun384, 35, 5, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        gun385 = new ModelRenderer(this);
        gun385.setRotationPoint(-2.0F, -11.7F, 7.5F);
        gun385.cubeList.add(new ModelBox(gun385, 0, 8, 0.0F, -0.001F, 0.001F, 1, 3, 1, 0.0F, false));

        gun386 = new ModelRenderer(this);
        gun386.setRotationPoint(-2.5F, -9.8F, 10.5F);
        gun386.cubeList.add(new ModelBox(gun386, 47, 63, 0.0F, 0.0F, 0.0F, 2, 2, 17, 0.0F, false));

        gun387 = new ModelRenderer(this);
        gun387.setRotationPoint(-2.5F, -7.9F, 10.5F);
        gun387.cubeList.add(new ModelBox(gun387, 11, 0, 0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F, false));

        gun388 = new ModelRenderer(this);
        gun388.setRotationPoint(-2.5F, -5.3F, 10.0F);


        gun389 = new ModelRenderer(this);
        gun389.setRotationPoint(-2.5F, -7.8F, 23.5F);
        gun389.cubeList.add(new ModelBox(gun389, 24, 11, 0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        gun390 = new ModelRenderer(this);
        gun390.setRotationPoint(-2.5F, -7.3F, 25.1F);
        setRotationAngle(gun390, -0.1115F, 0.0F, 0.0F);
        gun390.cubeList.add(new ModelBox(gun390, 6, 42, 0.001F, 0.0F, 0.0F, 2, 7, 1, 0.0F, false));

        gun391 = new ModelRenderer(this);
        gun391.setRotationPoint(-2.0F, -7.1F, 25.5F);
        setRotationAngle(gun391, -0.1115F, 0.0F, 0.0F);
        gun391.cubeList.add(new ModelBox(gun391, 0, 42, 0.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F, false));

        gun392 = new ModelRenderer(this);
        gun392.setRotationPoint(-2.5F, -6.8F, 23.5F);
        setRotationAngle(gun392, 1.1154F, 0.0F, 0.0F);
        gun392.cubeList.add(new ModelBox(gun392, 0, 0, -0.002F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

        gun393 = new ModelRenderer(this);
        gun393.setRotationPoint(-2.5F, -1.1F, 19.6F);
        gun393.cubeList.add(new ModelBox(gun393, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));

        gun394 = new ModelRenderer(this);
        gun394.setRotationPoint(-2.5F, 1.0F, 26.2F);
        setRotationAngle(gun394, -0.1115F, 0.0F, 0.0F);
        gun394.cubeList.add(new ModelBox(gun394, 0, 5, -0.001F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        gun395 = new ModelRenderer(this);
        gun395.setRotationPoint(-3.0F, 0.5F, 26.25F);
        setRotationAngle(gun395, -0.1115F, 0.0F, 0.0F);
        gun395.cubeList.add(new ModelBox(gun395, 10, 8, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        gun396 = new ModelRenderer(this);
        gun396.setRotationPoint(-2.5F, -6.8F, 23.5F);
        setRotationAngle(gun396, 2.082F, 0.0F, 0.0F);
        gun396.cubeList.add(new ModelBox(gun396, 12, 17, -0.001F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        gun397 = new ModelRenderer(this);
        gun397.setRotationPoint(-3.0F, -8.5F, 11.0F);
        setRotationAngle(gun397, -0.0744F, 0.0F, 0.0F);
        gun397.cubeList.add(new ModelBox(gun397, 44, 45, 0.001F, 0.0F, 0.0F, 3, 2, 8, 0.0F, false));

        gun398 = new ModelRenderer(this);
        gun398.setRotationPoint(-3.0F, -7.9F, 18.95F);
        setRotationAngle(gun398, -0.2603F, 0.0F, 0.0F);
        gun398.cubeList.add(new ModelBox(gun398, 24, 6, -0.001F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        gun399 = new ModelRenderer(this);
        gun399.setRotationPoint(-3.0F, -7.2F, 17.5F);
        gun399.cubeList.add(new ModelBox(gun399, 0, 8, 0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        gun400 = new ModelRenderer(this);
        gun400.setRotationPoint(-3.0F, -5.2F, 17.5F);
        setRotationAngle(gun400, 2.3794F, 0.0F, 0.0F);
        gun400.cubeList.add(new ModelBox(gun400, 34, 17, -0.001F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        gun401 = new ModelRenderer(this);
        gun401.setRotationPoint(-2.5F, -4.5F, 10.0F);
        gun401.cubeList.add(new ModelBox(gun401, 36, 24, 0.001F, -1.0F, 0.0F, 2, 3, 2, 0.0F, false));

        gun402 = new ModelRenderer(this);
        gun402.setRotationPoint(-2.5F, -1.8F, 24.6F);
        setRotationAngle(gun402, -0.7854F, 0.0F, 0.0F);
        gun402.cubeList.add(new ModelBox(gun402, 0, 3, -0.001F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        gun403 = new ModelRenderer(this);
        gun403.setRotationPoint(-2.0F, -0.9F, 21.5F);
        gun403.cubeList.add(new ModelBox(gun403, 24, 0, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        gun404 = new ModelRenderer(this);
        gun404.setRotationPoint(-2.0F, 0.7F, 24.0F);
        gun404.cubeList.add(new ModelBox(gun404, 12, 34, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        gun405 = new ModelRenderer(this);
        gun405.setRotationPoint(-2.0F, 0.1F, 22.5F);
        setRotationAngle(gun405, 0.7808F, 0.0F, 0.0F);
        gun405.cubeList.add(new ModelBox(gun405, 0, 14, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        gun406 = new ModelRenderer(this);
        gun406.setRotationPoint(-2.0F, -0.1F, 26.1F);
        setRotationAngle(gun406, -0.1487F, 0.0F, 0.0F);
        gun406.cubeList.add(new ModelBox(gun406, 10, 10, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        gun407 = new ModelRenderer(this);
        gun407.setRotationPoint(-1.0F, -11.5F, 3.5F);
        setRotationAngle(gun407, 0.0F, 0.0F, 0.7854F);
        gun407.cubeList.add(new ModelBox(gun407, 24, 36, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        gun408 = new ModelRenderer(this);
        gun408.setRotationPoint(-2.0F, -11.5F, 3.5F);
        setRotationAngle(gun408, 0.0F, 0.0F, 0.7854F);
        gun408.cubeList.add(new ModelBox(gun408, 6, 34, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        gun409 = new ModelRenderer(this);
        gun409.setRotationPoint(-3.0F, -10.5F, 3.5F);
        setRotationAngle(gun409, 0.0F, 0.0F, -0.7854F);
        gun409.cubeList.add(new ModelBox(gun409, 30, 32, 0.0F, -0.001F, 0.0F, 1, 1, 4, 0.0F, false));

        gun410 = new ModelRenderer(this);
        gun410.setRotationPoint(-3.0F, -9.5F, 3.5F);
        setRotationAngle(gun410, 0.0F, 0.0F, -0.7854F);
        gun410.cubeList.add(new ModelBox(gun410, 32, 12, -0.001F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        gun411 = new ModelRenderer(this);
        gun411.setRotationPoint(0.0F, -10.5F, 3.5F);
        setRotationAngle(gun411, 0.0F, 0.0F, 2.3562F);
        gun411.cubeList.add(new ModelBox(gun411, 32, 7, 0.001F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        gun412 = new ModelRenderer(this);
        gun412.setRotationPoint(0.0F, -9.5F, 3.5F);
        setRotationAngle(gun412, 0.0F, 0.0F, 2.3562F);
        gun412.cubeList.add(new ModelBox(gun412, 24, 31, 0.0F, -0.001F, 0.0F, 1, 1, 4, 0.0F, false));

        gun413 = new ModelRenderer(this);
        gun413.setRotationPoint(-2.0F, -8.5F, 3.5F);
        setRotationAngle(gun413, 0.0F, 0.0F, -2.3562F);
        gun413.cubeList.add(new ModelBox(gun413, 31, 0, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        gun414 = new ModelRenderer(this);
        gun414.setRotationPoint(-1.0F, -8.5F, 3.5F);
        setRotationAngle(gun414, 0.0F, 0.0F, -2.3562F);
        gun414.cubeList.add(new ModelBox(gun414, 30, 27, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        gun365.render(f5);
        gun366.render(f5);
        gun367.render(f5);
        gun369.render(f5);
        gun370.render(f5);
        gun371.render(f5);
        gun372.render(f5);
        gun373.render(f5);
        gun374.render(f5);
        gun375.render(f5);
        gun376.render(f5);
        gun377.render(f5);
        gun378.render(f5);
        gun379.render(f5);
        gun380.render(f5);
        gun381.render(f5);
        gun382.render(f5);
        gun383.render(f5);
        gun384.render(f5);
        gun385.render(f5);
        gun386.render(f5);
        gun387.render(f5);
        gun388.render(f5);
        gun389.render(f5);
        gun390.render(f5);
        gun391.render(f5);
        gun392.render(f5);
        gun393.render(f5);
        gun394.render(f5);
        gun395.render(f5);
        gun396.render(f5);
        gun397.render(f5);
        gun398.render(f5);
        gun399.render(f5);
        gun400.render(f5);
        gun401.render(f5);
        gun402.render(f5);
        gun403.render(f5);
        gun404.render(f5);
        gun405.render(f5);
        gun406.render(f5);
        gun407.render(f5);
        gun408.render(f5);
        gun409.render(f5);
        gun410.render(f5);
        gun411.render(f5);
        gun412.render(f5);
        gun413.render(f5);
        gun414.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
