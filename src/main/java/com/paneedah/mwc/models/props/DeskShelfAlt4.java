package com.paneedah.mwc.models.props;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

/**
 * Made with Blockbench 4.8.1
 *
 * @author Developer: Desoroxx
 */
@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class DeskShelfAlt4 extends ModelBase implements IModernModel {

    private final ModelRenderer shelf;
    private final ModelRenderer shelf13_r1;
    private final ModelRenderer shelf12_r1;
    private final ModelRenderer shelf7_r1;
    private final ModelRenderer shelf6_r1;
    private final ModelRenderer shelf4_r1;

    public DeskShelfAlt4() {
        textureWidth = 256;
        textureHeight = 256;

        shelf = new ModelRenderer(this);
        shelf.setRotationPoint(0.0F, 23.1166F, 0.4769F);
        shelf.cubeList.add(new ModelBox(shelf, 0, 0, -7.0F, -8.1166F, -0.4769F, 15, 2, 8, 0.0F, true));
        shelf.cubeList.add(new ModelBox(shelf, 0, 50, -6.5F, -13.1166F, 2.0231F, 2, 5, 5, 0.0F, true));
        shelf.cubeList.add(new ModelBox(shelf, 0, 90, -2.5F, -13.6166F, 2.5231F, 2, 6, 4, 0.0F, true));
        shelf.cubeList.add(new ModelBox(shelf, 0, 110, -8.0F, -14.1166F, -6.4769F, 1, 15, 14, 0.0F, true));

        shelf13_r1 = new ModelRenderer(this);
        shelf13_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        shelf.addChild(shelf13_r1);
        setRotationAngle(shelf13_r1, 0.1859F, 0.0F, 0.0F);
        shelf13_r1.cubeList.add(new ModelBox(shelf13_r1, 0, 0, -3.0F, -3.0F, -4.5F, 2, 3, 1, 0.0F, true));

        shelf12_r1 = new ModelRenderer(this);
        shelf12_r1.setRotationPoint(0.0F, 1.8361F, -2.1179F);
        shelf.addChild(shelf12_r1);
        setRotationAngle(shelf12_r1, -0.2974F, 0.0F, 0.0F);
        shelf12_r1.cubeList.add(new ModelBox(shelf12_r1, 0, 0, -4.0F, -5.0F, -4.0F, 4, 5, 1, 0.0F, true));
        shelf12_r1.cubeList.add(new ModelBox(shelf12_r1, 50, 0, -3.0F, -4.5F, -4.1F, 2, 4, 1, 0.0F, true));

        shelf7_r1 = new ModelRenderer(this);
        shelf7_r1.setRotationPoint(0.0F, -0.7297F, -2.0542F);
        shelf.addChild(shelf7_r1);
        setRotationAngle(shelf7_r1, -0.3718F, 0.0F, 0.0F);
        shelf7_r1.cubeList.add(new ModelBox(shelf7_r1, 40, 30, 0.5F, -5.0F, 3.5F, 4, 2, 1, 0.0F, true));

        shelf6_r1 = new ModelRenderer(this);
        shelf6_r1.setRotationPoint(-2.2541F, 0.8834F, -0.9419F);
        shelf.addChild(shelf6_r1);
        setRotationAngle(shelf6_r1, 0.0F, 0.5205F, 0.0F);
        shelf6_r1.cubeList.add(new ModelBox(shelf6_r1, 0, 30, -2.0F, -4.0F, 4.0F, 8, 4, 4, 0.0F, true));

        shelf4_r1 = new ModelRenderer(this);
        shelf4_r1.setRotationPoint(-3.9591F, 1.309F, -0.4769F);
        shelf.addChild(shelf4_r1);
        setRotationAngle(shelf4_r1, 0.0F, 0.0F, 0.2974F);
        shelf4_r1.cubeList.add(new ModelBox(shelf4_r1, 0, 70, -3.4F, -13.0F, 3.5F, 1, 4, 4, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        shelf.render(scale);
    }
}
