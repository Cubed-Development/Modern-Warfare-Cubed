package com.paneedah.mwc.models.props.electronics;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Made with Blockbench 4.8.1
 *
 * @author Developer: Desoroxx
 */
@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class Laptop extends ModelBase implements IModernModel {

    private final ModelRenderer keyboard;
    private final ModelRenderer Keyboard2_r1;
    private final ModelRenderer Trackpad_r1;
    private final ModelRenderer monitor;
    private final ModelRenderer Monitor7_r1;
    private final ModelRenderer Monitor1_r1;

    public Laptop() {
        textureWidth = 512;
        textureHeight = 512;

        keyboard = new ModelRenderer(this);
        keyboard.setRotationPoint(0.0F, 24.0F, 0.0F);
        keyboard.cubeList.add(new ModelBox(keyboard, 0, 0, -2.0F, -2.0F, -9.0F, 10, 1, 17, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -2.5F, -8.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -2.5F, -6.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -2.5F, -5.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -2.5F, -3.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -2.5F, -2.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -2.5F, -0.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -2.5F, 1.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -2.5F, 2.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -2.5F, 6.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -2.5F, 5.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.4F, -8.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.4F, -7.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.4F, -5.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.4F, -4.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.4F, -2.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.4F, -1.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.4F, 0.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.4F, 2.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.4F, 3.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.4F, 5.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.4F, 6.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.3F, -8.5F, 1, 1, 2, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.3F, -6.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.3F, -4.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.3F, -3.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.3F, -1.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.3F, 0.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.3F, 1.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.3F, 3.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.3F, 4.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.3F, 6.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.3F, -8.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.3F, -7.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.3F, -5.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.3F, -4.0F, 1, 1, 6, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.3F, 2.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.3F, 4.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.3F, 5.5F, 1, 1, 2, 0.0F, true));

        Keyboard2_r1 = new ModelRenderer(this);
        Keyboard2_r1.setRotationPoint(-0.1135F, 0.084F, 0.0F);
        keyboard.addChild(Keyboard2_r1);
        setRotationAngle(Keyboard2_r1, 0.0F, 0.0F, 0.0455F);
        Keyboard2_r1.cubeList.add(new ModelBox(Keyboard2_r1, 0, 0, -1.9F, -2.45F, -9.0F, 10, 1, 17, 0.0F, true));

        Trackpad_r1 = new ModelRenderer(this);
        Trackpad_r1.setRotationPoint(-0.11F, -0.2595F, 0.0F);
        keyboard.addChild(Trackpad_r1);
        setRotationAngle(Trackpad_r1, 0.0F, 0.0F, 0.0524F);
        Trackpad_r1.cubeList.add(new ModelBox(Trackpad_r1, 100, 0, 4.9F, -2.23F, -4.5F, 3, 1, 5, 0.0F, true));

        monitor = new ModelRenderer(this);
        monitor.setRotationPoint(0.4728F, 23.5614F, 0.0F);

        Monitor7_r1 = new ModelRenderer(this);
        monitor.addChild(Monitor7_r1);
        setRotationAngle(Monitor7_r1, 0.0F, 0.0F, -0.1396F);
        Monitor7_r1.cubeList.add(new ModelBox(Monitor7_r1, 200, 0, -2.7F, -11.6F, -8.0F, 1, 8, 15, 0.0F, true));
        Monitor7_r1.cubeList.add(new ModelBox(Monitor7_r1, 200, 0, -3.1F, -12.1F, -8.5F, 1, 9, 16, 0.0F, true));
        Monitor7_r1.cubeList.add(new ModelBox(Monitor7_r1, 200, 0, -2.6F, -12.6F, -9.0F, 1, 1, 17, 0.0F, true));
        Monitor7_r1.cubeList.add(new ModelBox(Monitor7_r1, 200, 0, -2.6F, -11.6F, 7.0F, 1, 8, 1, 0.0F, true));
        Monitor7_r1.cubeList.add(new ModelBox(Monitor7_r1, 200, 0, -2.6F, -11.6F, -9.0F, 1, 8, 1, 0.0F, true));
        Monitor7_r1.cubeList.add(new ModelBox(Monitor7_r1, 200, 0, -2.6F, -3.6F, -9.0F, 1, 1, 17, 0.0F, true));

        Monitor1_r1 = new ModelRenderer(this);
        Monitor1_r1.setRotationPoint(0.0369F, -0.0936F, 0.0F);
        monitor.addChild(Monitor1_r1);
        setRotationAngle(Monitor1_r1, 0.0F, 0.0F, -0.1859F);
        Monitor1_r1.cubeList.add(new ModelBox(Monitor1_r1, 200, 0, -2.6F, -3.0F, -8.0F, 1, 2, 15, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        keyboard.render(scale);
        monitor.render(scale);
    }
}
