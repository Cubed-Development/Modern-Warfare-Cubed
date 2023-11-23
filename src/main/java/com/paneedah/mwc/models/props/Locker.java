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
public final class Locker extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer Shape69_r1;
    private final ModelRenderer Shape63_r1;
    private final ModelRenderer door;

    public Locker() {
        textureWidth = 512;
        textureHeight = 512;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, 8.5F, -18.0F, 6.7F, 2, 4, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -10.0F, -7.0F, -8.0F, 20, 3, 16, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -8.0F, -7.0F, 8.0F, 16, 3, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -8.0F, -7.0F, -10.0F, 16, 3, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -66.0F, 8.0F, 16, 59, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -66.0F, -10.0F, 16, 59, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -10.0F, -66.0F, -8.0F, 2, 59, 16, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -10.0F, -69.0F, -8.0F, 20, 3, 16, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -8.0F, -69.0F, 8.0F, 16, 3, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -8.0F, -69.0F, -10.0F, 16, 3, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -25.0F, -8.0F, 16, 1, 16, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -53.0F, -8.0F, 16, 1, 16, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 8.5F, -58.0F, 6.7F, 2, 4, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 8.5F, -41.0F, 6.7F, 2, 4, 2, 0.0F, true));

        Shape69_r1 = new ModelRenderer(this);
        Shape69_r1.setRotationPoint(-8.5858F, 0.0F, -4.7279F);
        bone.addChild(Shape69_r1);
        setRotationAngle(Shape69_r1, 0.0F, 0.7854F, 0.0F);
        Shape69_r1.cubeList.add(new ModelBox(Shape69_r1, 100, 0, 14.0F, -69.0F, 8.4F, 2, 3, 2, 0.0F, true));
        Shape69_r1.cubeList.add(new ModelBox(Shape69_r1, 0, 0, 14.0F, -66.0F, 8.4F, 2, 59, 2, 0.0F, true));
        Shape69_r1.cubeList.add(new ModelBox(Shape69_r1, 100, 0, 14.0F, -7.0F, 8.4F, 2, 3, 2, 0.0F, true));
        Shape69_r1.cubeList.add(new ModelBox(Shape69_r1, 100, 0, -10.0F, -7.0F, 8.4F, 2, 3, 2, 0.0F, true));
        Shape69_r1.cubeList.add(new ModelBox(Shape69_r1, 0, 0, -10.0F, -66.0F, 8.4F, 2, 59, 2, 0.0F, true));
        Shape69_r1.cubeList.add(new ModelBox(Shape69_r1, 100, 0, -10.0F, -69.0F, 8.4F, 2, 3, 2, 0.0F, true));

        Shape63_r1 = new ModelRenderer(this);
        Shape63_r1.setRotationPoint(-4.0208F, 0.0F, 8.2929F);
        bone.addChild(Shape63_r1);
        setRotationAngle(Shape63_r1, 0.0F, 0.7854F, 0.0F);
        Shape63_r1.cubeList.add(new ModelBox(Shape63_r1, 100, 0, 7.7F, -69.0F, -16.0F, 2, 3, 2, 0.0F, true));
        Shape63_r1.cubeList.add(new ModelBox(Shape63_r1, 0, 0, 7.7F, -66.0F, -16.0F, 2, 59, 2, 0.0F, true));
        Shape63_r1.cubeList.add(new ModelBox(Shape63_r1, 100, 0, 7.7F, -7.0F, -16.0F, 2, 3, 2, 0.0F, true));
        Shape63_r1.cubeList.add(new ModelBox(Shape63_r1, 0, 0, 7.7F, -66.0F, 8.0F, 2, 59, 2, 0.0F, true));
        Shape63_r1.cubeList.add(new ModelBox(Shape63_r1, 100, 0, 7.7F, -69.0F, 8.0F, 2, 3, 2, 0.0F, true));
        Shape63_r1.cubeList.add(new ModelBox(Shape63_r1, 100, 0, 7.7F, -7.0F, 8.0F, 2, 3, 2, 0.0F, true));

        door = new ModelRenderer(this);
        door.setRotationPoint(0.0F, 24.0F, 0.0F);
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -20.0F, -5.0F, 1, 1, 12, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.0F, -19.0F, -8.0F, 1, 12, 16, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.0F, -66.0F, -8.0F, 1, 8, 16, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.0F, -45.0F, -3.0F, 1, 14, 11, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -57.0F, -6.0F, 1, 1, 12, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -55.0F, -6.0F, 1, 1, 12, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -53.0F, -6.0F, 1, 1, 12, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -51.0F, -6.0F, 1, 1, 12, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -49.0F, -6.0F, 1, 1, 12, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -47.0F, -6.0F, 1, 1, 12, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -58.0F, -7.0F, 1, 13, 2, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -58.0F, 6.0F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -58.0F, -1.5F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -58.0F, 1.5F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -58.0F, 0.0F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -58.0F, 4.5F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -58.0F, 3.0F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -58.0F, -3.0F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -58.0F, -4.5F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -64.0F, -7.0F, 1, 6, 14, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 8.8F, -42.0F, -8.0F, 1, 7, 5, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.0F, -41.0F, -5.5F, 1, 5, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.0F, -58.0F, 7.0F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.0F, -58.0F, -8.0F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.0F, -45.0F, -8.0F, 1, 3, 5, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.0F, -35.0F, -8.0F, 1, 4, 5, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.0F, -31.0F, -8.0F, 1, 12, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.0F, -31.0F, 7.0F, 1, 12, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -45.0F, -2.0F, 1, 14, 9, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -45.0F, -7.0F, 1, 2, 5, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -34.0F, -7.0F, 1, 3, 5, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -19.0F, -7.0F, 1, 11, 14, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -31.0F, -7.0F, 1, 12, 2, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -32.0F, -4.5F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -32.0F, -3.0F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -32.0F, -1.5F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -32.0F, 0.0F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -32.0F, 1.5F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -32.0F, 3.0F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -32.0F, 4.5F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -32.0F, 6.0F, 1, 13, 1, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -30.0F, -5.0F, 1, 1, 12, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -28.0F, -5.0F, 1, 1, 12, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -26.0F, -5.0F, 1, 1, 12, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -24.0F, -5.0F, 1, 1, 12, 0.0F, true));
        door.cubeList.add(new ModelBox(door, 0, 0, 9.3F, -22.0F, -5.0F, 1, 1, 12, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        bone.render(scale);
        door.render(scale);
    }
}
