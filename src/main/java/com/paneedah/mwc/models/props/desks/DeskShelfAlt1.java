package com.paneedah.mwc.models.props.desks;

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
public final class DeskShelfAlt1 extends ModelBase implements IModernModel {

    private final ModelRenderer shelf;
    private final ModelRenderer shelf7_r1;
    private final ModelRenderer shelf6_r1;

    public DeskShelfAlt1() {
        textureWidth = 256;
        textureHeight = 256;

        shelf = new ModelRenderer(this);
        shelf.setRotationPoint(0.0F, 23.6584F, -1.8164F);
        shelf.cubeList.add(new ModelBox(shelf, 0, 110, -8.0F, -14.6584F, -4.1836F, 1, 15, 14, 0.0F, true));
        shelf.cubeList.add(new ModelBox(shelf, 0, 0, -7.0F, -8.6584F, 1.8164F, 15, 2, 8, 0.0F, true));
        shelf.cubeList.add(new ModelBox(shelf, 0, 50, -6.5F, -13.6584F, 4.3164F, 2, 5, 5, 0.0F, true));
        shelf.cubeList.add(new ModelBox(shelf, 0, 90, -4.1F, -14.1584F, 4.8164F, 2, 6, 4, 0.0F, true));
        shelf.cubeList.add(new ModelBox(shelf, 0, 70, -2.0F, -12.6584F, 5.3164F, 1, 4, 4, 0.0F, true));

        shelf7_r1 = new ModelRenderer(this);
        shelf7_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        shelf.addChild(shelf7_r1);
        setRotationAngle(shelf7_r1, -0.3718F, 0.0F, 0.0F);
        shelf7_r1.cubeList.add(new ModelBox(shelf7_r1, 40, 30, -4.0F, -5.0F, 0.0F, 4, 2, 1, 0.0F, true));

        shelf6_r1 = new ModelRenderer(this);
        shelf6_r1.setRotationPoint(-1.2625F, 0.3416F, 3.292F);
        shelf.addChild(shelf6_r1);
        setRotationAngle(shelf6_r1, 0.0F, -0.3346F, 0.0F);
        shelf6_r1.cubeList.add(new ModelBox(shelf6_r1, 0, 30, -5.0F, -4.0F, -3.0F, 8, 4, 4, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        shelf.render(scale);
    }
}
