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
public final class Sandbag extends ModelBase implements IModernModel {

    private final ModelRenderer Sandbag;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone3;
    private final ModelRenderer bone;

    public Sandbag() {
        textureWidth = 64;
        textureHeight = 64;

        Sandbag = new ModelRenderer(this);
        Sandbag.setRotationPoint(0.0F, 24.0F, 0.0F);
        Sandbag.cubeList.add(new ModelBox(Sandbag, 0, 0, -8.0F, -4.9F, -4.5F, 16, 4, 8, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, -6.3F, -0.5F);
        Sandbag.addChild(bone2);
        setRotationAngle(bone2, -0.1222F, 0.0F, 0.0873F);
        bone2.cubeList.add(new ModelBox(bone2, 28, 30, 0.0396F, 0.0F, 0.0F, 8, 2, 4, -0.001F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, -6.3F, -0.5F);
        Sandbag.addChild(bone4);
        setRotationAngle(bone4, 0.1222F, 0.0F, 0.0873F);
        bone4.cubeList.add(new ModelBox(bone4, 28, 18, 0.0396F, 0.0F, -4.0F, 8, 2, 4, -0.001F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, -6.3F, -0.5F);
        Sandbag.addChild(bone5);
        setRotationAngle(bone5, 0.1222F, 0.0F, -0.0873F);
        bone5.cubeList.add(new ModelBox(bone5, 24, 12, -7.9604F, 0.0F, -4.0F, 8, 2, 4, -0.001F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, -6.3F, -0.5F);
        Sandbag.addChild(bone6);
        setRotationAngle(bone6, -0.1222F, 0.0F, -0.0873F);
        bone6.cubeList.add(new ModelBox(bone6, 24, 24, -7.9604F, 0.0F, 0.0F, 8, 2, 4, -0.001F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.1F, -8.0F, -1.0F);
        Sandbag.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0F, 0.0873F);
        bone3.cubeList.add(new ModelBox(bone3, 0, 22, -7.403F, 6.1725F, -3.5F, 8, 2, 8, -0.001F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, -7.0F, 0.0F);
        Sandbag.addChild(bone);
        setRotationAngle(bone, 0.0F, 0.0F, -0.0873F);
        bone.cubeList.add(new ModelBox(bone, 0, 12, -0.6576F, 5.1672F, -4.5F, 8, 2, 8, -0.001F, false));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        Sandbag.render(scale);
    }
}
