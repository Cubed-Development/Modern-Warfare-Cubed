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
public final class Ammobox1 extends ModelBase implements IModernModel {

    private final ModelRenderer ammobox;
    private final ModelRenderer Shape;
    private final ModelRenderer Shape24_r1;
    private final ModelRenderer Shape23_r1;
    private final ModelRenderer Shape8_r1;
    private final ModelRenderer handle;
    private final ModelRenderer text;

    public Ammobox1() {
        textureWidth = 512;
        textureHeight = 512;

        ammobox = new ModelRenderer(this);
        ammobox.setRotationPoint(0.0F, 24.0F, 0.0F);

        Shape = new ModelRenderer(this);
        Shape.setRotationPoint(0.0F, 0.0F, 0.0F);
        ammobox.addChild(Shape);
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -3.0F, -17.0F, -11.0F, 6, 4, 1, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -6.0F, -4.0F, -10.0F, 12, 1, 25, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, 5.0F, -22.0F, -10.0F, 1, 18, 25, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -6.0F, -22.0F, -10.0F, 1, 18, 25, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -5.0F, -22.0F, -10.0F, 10, 18, 1, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -5.0F, -22.0F, 14.0F, 10, 18, 1, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -6.5F, -23.0F, -11.0F, 13, 1, 27, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -6.5F, -22.0F, -10.0F, 13, 1, 24, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -6.5F, -21.0F, -10.0F, 13, 2, 14, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -6.5F, -20.0F, -10.0F, 13, 3, 1, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -6.5F, -22.3F, 13.0F, 13, 2, 1, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -5.0F, -23.2F, 15.5F, 10, 2, 1, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -5.0F, -23.2F, 14.5F, 10, 1, 1, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -5.0F, -21.5F, 14.8F, 10, 3, 1, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -1.0F, -23.8F, 7.0F, 2, 1, 4, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -1.0F, -23.8F, -6.0F, 2, 1, 4, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -5.0F, -23.2F, -11.5F, 10, 2, 1, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -5.0F, -23.2F, -10.5F, 10, 1, 1, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -3.5F, -20.0F, -10.5F, 7, 2, 1, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -4.0F, -19.0F, -11.5F, 8, 1, 1, 0.0F, true));
        Shape.cubeList.add(new ModelBox(Shape, 0, 0, -4.0F, -18.5F, -11.7F, 8, 6, 1, 0.0F, true));

        Shape24_r1 = new ModelRenderer(this);
        Shape24_r1.setRotationPoint(5.5236F, -2.0437F, 0.0F);
        Shape.addChild(Shape24_r1);
        setRotationAngle(Shape24_r1, 0.0F, 0.0F, -0.2618F);
        Shape24_r1.cubeList.add(new ModelBox(Shape24_r1, 0, 0, -5.0F, -23.0F, -11.3F, 1, 6, 1, 0.0F, true));

        Shape23_r1 = new ModelRenderer(this);
        Shape23_r1.setRotationPoint(-5.5577F, -1.7849F, 0.0F);
        Shape.addChild(Shape23_r1);
        setRotationAngle(Shape23_r1, 0.0F, 0.0F, 0.2618F);
        Shape23_r1.cubeList.add(new ModelBox(Shape23_r1, 0, 0, 4.0F, -23.0F, -11.3F, 1, 6, 1, 0.0F, true));

        Shape8_r1 = new ModelRenderer(this);
        Shape8_r1.setRotationPoint(0.0F, -1.5669F, 2.4078F);
        Shape.addChild(Shape8_r1);
        setRotationAngle(Shape8_r1, 0.1396F, 0.0F, 0.0F);
        Shape8_r1.cubeList.add(new ModelBox(Shape8_r1, 0, 0, -6.5F, -19.0F, -9.5F, 13, 2, 23, 0.0F, true));

        handle = new ModelRenderer(this);
        handle.setRotationPoint(0.0F, 0.0F, 0.0F);
        ammobox.addChild(handle);
        handle.cubeList.add(new ModelBox(handle, 0, 0, -3.5F, -13.0F, -11.5F, 1, 4, 1, 0.0F, true));
        handle.cubeList.add(new ModelBox(handle, 0, 0, 2.5F, -13.0F, -11.5F, 1, 4, 1, 0.0F, true));
        handle.cubeList.add(new ModelBox(handle, 0, 0, -3.0F, -9.5F, -11.5F, 6, 1, 1, 0.0F, true));
        handle.cubeList.add(new ModelBox(handle, 0, 0, 0.5F, -27.5F, -4.0F, 1, 4, 1, 0.0F, true));
        handle.cubeList.add(new ModelBox(handle, 0, 0, -1.5F, -27.5F, -4.0F, 1, 4, 1, 0.0F, true));
        handle.cubeList.add(new ModelBox(handle, 0, 0, 0.5F, -27.5F, 8.0F, 1, 4, 1, 0.0F, true));
        handle.cubeList.add(new ModelBox(handle, 0, 0, -1.5F, -27.5F, 8.0F, 1, 4, 1, 0.0F, true));
        handle.cubeList.add(new ModelBox(handle, 0, 0, -1.5F, -28.0F, -3.5F, 3, 1, 12, 0.0F, true));

        text = new ModelRenderer(this);
        text.setRotationPoint(0.0F, 0.0F, 0.0F);
        ammobox.addChild(text);
        text.cubeList.add(new ModelBox(text, 0, 0, 5.1F, -17.0F, -4.0F, 1, 9, 13, 0.0F, true));
        text.cubeList.add(new ModelBox(text, 0, 0, -6.1F, -17.0F, -4.0F, 1, 9, 13, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        ammobox.render(scale);
    }
}
