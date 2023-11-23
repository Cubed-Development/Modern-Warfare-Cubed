package com.paneedah.mwc.models.props;

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
public final class Monitor extends ModelBase implements IModernModel {

    private final ModelRenderer keyboard;
    private final ModelRenderer Keyboard2_r1;
    private final ModelRenderer mouse;
    private final ModelRenderer monitor;
    private final ModelRenderer Monitor9_r1;

    public Monitor() {
        textureWidth = 512;
        textureHeight = 512;

        keyboard = new ModelRenderer(this);
        keyboard.setRotationPoint(0.0F, 24.0F, 0.0F);
        keyboard.cubeList.add(new ModelBox(keyboard, 0, 0, -1.0F, -2.0F, -9.0F, 6, 1, 17, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, -8.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, -6.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, -5.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, -3.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, -2.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, -0.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, 1.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, 2.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, 6.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, 5.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, -8.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, -7.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, -5.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, -4.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, -2.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, -1.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, 0.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, 2.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, 3.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, 5.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, 6.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, -8.5F, 1, 1, 2, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, -6.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, -4.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, -3.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, -1.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, 0.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, 1.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, 3.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, 4.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, 6.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, -8.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, -7.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, -5.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, -4.0F, 1, 1, 6, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, 2.5F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, 4.0F, 1, 1, 1, 0.0F, true));
        keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, 5.5F, 1, 1, 2, 0.0F, true));

        Keyboard2_r1 = new ModelRenderer(this);
        Keyboard2_r1.setRotationPoint(-0.4804F, 0.1039F, 0.0F);
        keyboard.addChild(Keyboard2_r1);
        setRotationAngle(Keyboard2_r1, 0.0F, 0.0F, 0.1571F);
        Keyboard2_r1.cubeList.add(new ModelBox(Keyboard2_r1, 0, 0, -0.9F, -3.0F, -9.0F, 6, 1, 17, 0.0F, true));

        mouse = new ModelRenderer(this);
        mouse.setRotationPoint(0.0F, 24.0F, 0.0F);
        mouse.cubeList.add(new ModelBox(mouse, 150, 0, 0.0F, -2.0F, 10.5F, 4, 1, 3, 0.0F, true));
        mouse.cubeList.add(new ModelBox(mouse, 150, 0, 1.0F, -2.2F, 10.5F, 3, 1, 3, 0.0F, true));
        mouse.cubeList.add(new ModelBox(mouse, 150, 0, -0.1F, -2.2F, 10.5F, 1, 1, 1, 0.0F, true));
        mouse.cubeList.add(new ModelBox(mouse, 150, 0, -0.1F, -2.2F, 12.5F, 1, 1, 1, 0.0F, true));
        mouse.cubeList.add(new ModelBox(mouse, 150, 30, -0.1F, -2.4F, 11.5F, 1, 1, 1, 0.0F, true));

        monitor = new ModelRenderer(this);
        monitor.setRotationPoint(2.7153F, 22.8312F, 0.0F);
        monitor.cubeList.add(new ModelBox(monitor, 200, 0, -10.7153F, -0.8312F, -5.0F, 6, 1, 9, 0.0F, true));
        monitor.cubeList.add(new ModelBox(monitor, 200, 0, -8.7153F, -7.8312F, -2.0F, 1, 7, 3, 0.0F, true));

        Monitor9_r1 = new ModelRenderer(this);
        Monitor9_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        monitor.addChild(Monitor9_r1);
        setRotationAngle(Monitor9_r1, 0.0F, 0.0F, -0.1396F);
        Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 0, -6.7F, -7.0F, -9.0F, 1, 1, 17, 0.0F, true));
        Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 0, -6.7F, -20.0F, -9.0F, 1, 1, 17, 0.0F, true));
        Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 0, -6.7F, -20.0F, -10.0F, 1, 14, 1, 0.0F, true));
        Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 0, -6.7F, -20.0F, 8.0F, 1, 14, 1, 0.0F, true));
        Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 40, -6.9F, -19.5F, -9.5F, 1, 13, 18, 0.0F, true));
        Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 0, -7.5F, -19.5F, -9.5F, 1, 13, 18, 0.0F, true));
        Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 0, -7.0F, -20.0F, -10.0F, 1, 14, 19, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        keyboard.render(scale);
        mouse.render(scale);
        monitor.render(scale);
    }
}
