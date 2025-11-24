package com.paneedah.mwc.models.props.lights;

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
public final class FloodlightTowable extends ModelBase implements IModernModel {

    private final ModelRenderer Floodlight;
    private final ModelRenderer bone15;
    private final ModelRenderer bone9;
    private final ModelRenderer bone8;
    private final ModelRenderer bone7;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;
    private final ModelRenderer bone4;

    public FloodlightTowable() {
        textureWidth = 300;
        textureHeight = 300;

        Floodlight = new ModelRenderer(this);
        Floodlight.setRotationPoint(0.0F, 24.0F, 0.0F);

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(-1.0F, -14.25F, -1.25F);
        Floodlight.addChild(bone15);
        bone15.cubeList.add(new ModelBox(bone15, 90, 0, -7.0F, 0.25F, -8.751F, 16, 10, 26, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 43, 280, -6.0F, 3.25F, -9.25F, 14, 2, 1, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, 0.0F, 7.25F, -2.75F, 2, 1, 43, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 94, 249, 0.0F, 6.25F, 38.25F, 2, 1, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 42, 243, 0.0F, 2.25F, 29.25F, 2, 9, 2, -0.5F, false));
        bone15.cubeList.add(new ModelBox(bone15, 58, 116, -11.0F, 1.25F, -0.75F, 24, 2, 10, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 34, 196, -4.0F, -1.75F, 17.251F, 10, 8, 1, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 64, 83, -4.5944F, -7.3797F, -8.751F, 11, 7, 26, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 44, 222, -2.4965F, -6.5186F, 17.252F, 7, 7, 1, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 131, 165, -0.4056F, -49.1297F, 11.0F, 3, 42, 3, -0.3F, false));
        bone15.cubeList.add(new ModelBox(bone15, 50, 144, -12.4056F, -51.1297F, 11.0F, 27, 3, 3, -0.3F, false));
        bone15.cubeList.add(new ModelBox(bone15, 136, 233, 12.4F, -54.8797F, 11.01F, 2, 11, 2, -0.3F, false));
        bone15.cubeList.add(new ModelBox(bone15, 136, 233, -6.4056F, -54.8797F, 11.01F, 2, 11, 2, -0.3F, false));
        bone15.cubeList.add(new ModelBox(bone15, 136, 233, 6.5944F, -54.8797F, 11.01F, 2, 10, 2, -0.3F, false));
        bone15.cubeList.add(new ModelBox(bone15, 136, 233, -12.4F, -54.8797F, 11.01F, 2, 10, 2, -0.3F, false));
        bone15.cubeList.add(new ModelBox(bone15, 28, 243, -10.51F, 12.4216F, 2.25F, 3, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 28, 243, 9.49F, 12.4216F, 2.25F, 3, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 14, 243, -10.51F, 4.7647F, 2.25F, 3, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 14, 243, 9.49F, 4.7647F, 2.25F, 3, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 70, 254, -10.51F, 7.5931F, -0.5784F, 3, 4, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 70, 254, 9.49F, 7.5931F, -0.5784F, 3, 4, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 60, 254, -10.51F, 7.5931F, 7.0784F, 3, 4, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 60, 254, 9.49F, 7.5931F, 7.0784F, 3, 4, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 72, 196, -10.0F, 6.3F, 1.2F, 2, 7, 6, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 72, 196, 10.0F, 6.3F, 1.2F, 2, 7, 6, 0.0F, true));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(-9.4056F, -71.8797F, 11.85F);
        Floodlight.addChild(bone9);
        setRotationAngle(bone9, -0.0873F, -0.3927F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 66, 217, 3.0F, -5.0F, -1.1F, 2, 10, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 66, 217, 20.5537F, -4.3663F, -8.3433F, 2, 10, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 66, 217, 20.3241F, 11.6211F, -7.501F, 2, 10, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 66, 217, 2.7704F, 10.9874F, -0.2577F, 2, 10, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 76, 217, -5.0F, -5.0F, -1.1F, 2, 10, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 76, 217, 12.5537F, -4.3663F, -8.3433F, 2, 10, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 76, 217, 12.3241F, 11.6211F, -7.501F, 2, 10, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 76, 217, -5.2296F, 10.9874F, -0.2577F, 2, 10, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 72, 209, -4.0F, -5.0F, -1.1F, 8, 2, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 72, 209, 13.5537F, -4.3663F, -8.3433F, 8, 2, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 72, 209, 13.3241F, 11.6211F, -7.501F, 8, 2, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 72, 209, -4.2296F, 10.9874F, -0.2577F, 8, 2, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 94, 196, -4.0F, 3.0F, -1.1F, 8, 2, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 94, 196, 13.5537F, 3.6337F, -8.3433F, 8, 2, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 94, 196, 13.3241F, 19.6211F, -7.501F, 8, 2, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 94, 196, -4.2296F, 18.9874F, -0.2577F, 8, 2, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 54, 168, -4.0F, -4.0F, -3.1F, 8, 8, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 54, 168, 13.5537F, -3.3663F, -10.3433F, 8, 8, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 54, 168, 13.3241F, 12.6211F, -9.501F, 8, 8, 3, -0.3F, false));
        bone9.cubeList.add(new ModelBox(bone9, 54, 168, -4.2296F, 11.9874F, -2.2577F, 8, 8, 3, -0.3F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(5.0F, -6.0F, 9.0F);
        Floodlight.addChild(bone8);
        setRotationAngle(bone8, 0.0F, 0.48F, 0.0F);
        bone8.cubeList.add(new ModelBox(bone8, 180, 75, -1.0F, -1.0F, -26.0F, 2, 1, 40, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 66, 243, -1.0F, -1.5F, 12.0F, 2, 8, 2, -0.3F, false));
        bone8.cubeList.add(new ModelBox(bone8, 58, 243, -1.0313F, -1.5F, -26.0523F, 2, 8, 2, -0.3F, false));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(-5.0F, -6.0F, 9.0F);
        Floodlight.addChild(bone7);
        setRotationAngle(bone7, 0.0F, -0.48F, 0.0F);
        bone7.cubeList.add(new ModelBox(bone7, 0, 116, -1.0F, -1.0F, -26.0F, 2, 1, 40, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 74, 243, -1.0F, -1.5F, 12.0F, 2, 8, 2, -0.3F, false));
        bone7.cubeList.add(new ModelBox(bone7, 50, 243, -1.0191F, -1.5F, -26.1676F, 2, 8, 2, -0.3F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, -13.5F, 4.5F);
        Floodlight.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.0F, 1.2654F);
        bone2.cubeList.add(new ModelBox(bone2, 0, 44, -6.0712F, -7.7801F, -14.498F, 8, 13, 26, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 82, 243, -5.8808F, -5.5203F, 11.5F, 5, 5, 1, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, -13.5F, 4.5F);
        Floodlight.addChild(bone);
        setRotationAngle(bone, 0.0F, 0.0F, -1.2654F);
        bone.cubeList.add(new ModelBox(bone, 68, 44, -1.9288F, -7.7801F, -14.499F, 8, 13, 26, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 94, 243, 0.8808F, -5.5203F, 11.5F, 5, 5, 1, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.5F, 0.0F, 4.0F);
        Floodlight.addChild(bone4);
        setRotationAngle(bone4, 0.7854F, 0.0F, 0.0F);
        bone4.cubeList.add(new ModelBox(bone4, 0, 243, -12.01F, -1.1716F, 0.5858F, 3, 2, 4, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 243, 7.99F, -1.1716F, 0.5858F, 3, 2, 4, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 50, 254, -12.01F, -6.0F, 5.4142F, 3, 4, 2, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 50, 254, 7.99F, -6.0F, 5.4142F, 3, 4, 2, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 50, 156, -12.5F, -6.364F, 10.0208F, 24, 4, 2, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 40, 254, -12.01F, -6.0F, -2.2426F, 3, 4, 2, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 40, 254, 7.99F, -6.0F, -2.2426F, 3, 4, 2, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 78, 230, -12.01F, -8.8284F, 0.5858F, 3, 2, 4, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 78, 230, 7.99F, -8.8284F, 0.5858F, 3, 2, 4, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 50, 150, -12.5F, -13.435F, 0.9497F, 24, 2, 4, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        Floodlight.render(scale);
    }
}
