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
public final class Barrier extends ModelBase implements IModernModel {

    private final ModelRenderer barrier;
    private final ModelRenderer bone6_r1;
    private final ModelRenderer bone4_r1;
    private final ModelRenderer bone5_r1;
    private final ModelRenderer bone3_r1;

    public Barrier() {
        textureWidth = 90;
        textureHeight = 90;

        barrier = new ModelRenderer(this);
        barrier.setRotationPoint(0.0F, 24.0F, 0.0F);
        barrier.cubeList.add(new ModelBox(barrier, 0, 0, -2.0397F, -13.9737F, -8.01F, 4, 13, 16, 0.0F, false));
        barrier.cubeList.add(new ModelBox(barrier, 24, 0, 2.0F, -2.0F, -2.0F, 5, 2, 4, 0.0F, false));
        barrier.cubeList.add(new ModelBox(barrier, 0, 0, 2.0F, -2.0F, 2.0F, 5, 1, 2, 0.0F, false));
        barrier.cubeList.add(new ModelBox(barrier, 0, 3, 2.0F, -2.0F, -4.0F, 5, 1, 2, 0.0F, false));
        barrier.cubeList.add(new ModelBox(barrier, 0, 6, -7.0F, -2.0F, -4.0F, 5, 1, 2, 0.0F, false));
        barrier.cubeList.add(new ModelBox(barrier, 0, 9, -7.0F, -2.0F, 2.0F, 5, 1, 2, 0.0F, false));
        barrier.cubeList.add(new ModelBox(barrier, 18, 29, -7.0F, -2.0F, -2.0F, 5, 2, 4, 0.0F, false));
        barrier.cubeList.add(new ModelBox(barrier, 0, 29, 2.0F, -2.0F, -8.0F, 5, 2, 4, 0.0F, false));
        barrier.cubeList.add(new ModelBox(barrier, 38, 2, -7.0F, -2.0F, -8.0F, 5, 2, 4, 0.0F, false));
        barrier.cubeList.add(new ModelBox(barrier, 24, 6, 2.0F, -2.0F, 4.0F, 5, 2, 4, 0.0F, false));
        barrier.cubeList.add(new ModelBox(barrier, 38, 8, -7.0F, -2.0F, 4.0F, 5, 2, 4, 0.0F, false));

        bone6_r1 = new ModelRenderer(this);
        bone6_r1.setRotationPoint(-0.3384F, -0.2473F, 0.0F);
        barrier.addChild(bone6_r1);
        setRotationAngle(bone6_r1, 0.0F, 0.0F, -0.0873F);
        bone6_r1.cubeList.add(new ModelBox(bone6_r1, 0, 36, 1.6621F, -13.2785F, -8.001F, 2, 12, 16, 0.0F, false));

        bone4_r1 = new ModelRenderer(this);
        bone4_r1.setRotationPoint(-0.4268F, 0.2177F, 0.0F);
        barrier.addChild(bone4_r1);
        setRotationAngle(bone4_r1, 0.0F, 0.0F, 0.0873F);
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 24, 24, -3.2076F, -13.8202F, -8.001F, 2, 12, 16, 0.0F, false));

        bone5_r1 = new ModelRenderer(this);
        bone5_r1.setRotationPoint(2.981F, 2.1906F, 0.0F);
        barrier.addChild(bone5_r1);
        setRotationAngle(bone5_r1, 0.0F, 0.0F, -0.6981F);
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 40, 0, -4.9523F, -9.626F, -7.999F, 6, 3, 16, 0.0F, false));

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setRotationPoint(-0.8756F, -3.5942F, 0.0F);
        barrier.addChild(bone3_r1);
        setRotationAngle(bone3_r1, 0.0F, 0.0F, 0.6981F);
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 44, 44, 1.0579F, -3.8409F, -7.999F, 6, 3, 16, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        barrier.render(scale);
    }
}
