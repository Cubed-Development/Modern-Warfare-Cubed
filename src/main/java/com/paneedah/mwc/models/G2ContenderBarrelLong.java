package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G2ContenderBarrelLong extends ModelWithAttachments {
    private final ModelRenderer barrel_LONG;
    private final ModelRenderer barrel_long3;
    private final ModelRenderer barrel2;
    private final ModelRenderer underbarrel2;
    private final ModelRenderer bone28;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer bone29;
    private final ModelRenderer cube_r47;
    private final ModelRenderer bone30;
    private final ModelRenderer cube_r48;
    private final ModelRenderer bone31;
    private final ModelRenderer cube_r49;
    private final ModelRenderer bone32;
    private final ModelRenderer cube_r50;
    private final ModelRenderer bone33;
    private final ModelRenderer cube_r51;
    private final ModelRenderer bone34;
    private final ModelRenderer cube_r52;
    private final ModelRenderer bone35;
    private final ModelRenderer cube_r53;
    private final ModelRenderer bone36;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer bone37;
    private final ModelRenderer bone38;
    private final ModelRenderer cube_r56;
    private final ModelRenderer bone39;
    private final ModelRenderer cube_r57;
    private final ModelRenderer bone40;
    private final ModelRenderer cube_r58;
    private final ModelRenderer bone41;
    private final ModelRenderer bone42;
    private final ModelRenderer bone43;
    private final ModelRenderer cube_r59;
    private final ModelRenderer bone44;
    private final ModelRenderer bone45;

    public G2ContenderBarrelLong() {
        textureWidth = 512;
        textureHeight = 512;

        barrel_LONG = new ModelRenderer(this);
        barrel_LONG.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotationAngle(barrel_LONG, 0.0F, 3.1416F, 0.0F);


        barrel_long3 = new ModelRenderer(this);
        barrel_long3.setRotationPoint(-7.5F, -32.0F, 16.0F);
        barrel_LONG.addChild(barrel_long3);


        barrel2 = new ModelRenderer(this);
        barrel2.setRotationPoint(0.0F, -2.25F, 11.5F);
        barrel_long3.addChild(barrel2);
        barrel2.cubeList.add(new ModelBox(barrel2, 140, 209, 8.25F, 4.25F, -30.0F, 1, 1, 68, 0.0F, false));
        barrel2.cubeList.add(new ModelBox(barrel2, 70, 208, 7.5F, 4.0F, -30.0F, 1, 1, 68, 0.0F, false));
        barrel2.cubeList.add(new ModelBox(barrel2, 0, 207, 7.5F, 3.0F, -30.0F, 1, 1, 68, 0.0F, false));
        barrel2.cubeList.add(new ModelBox(barrel2, 140, 69, 8.5F, 3.0F, -30.0F, 1, 1, 68, 0.0F, false));
        barrel2.cubeList.add(new ModelBox(barrel2, 140, 0, 8.75F, 3.25F, -30.0F, 1, 1, 68, 0.0F, false));
        barrel2.cubeList.add(new ModelBox(barrel2, 140, 140, 8.75F, 3.75F, -30.0F, 1, 1, 68, 0.0F, false));
        barrel2.cubeList.add(new ModelBox(barrel2, 70, 139, 7.25F, 3.75F, -30.0F, 1, 1, 68, 0.0F, false));
        barrel2.cubeList.add(new ModelBox(barrel2, 0, 138, 7.25F, 3.25F, -30.0F, 1, 1, 68, 0.0F, false));
        barrel2.cubeList.add(new ModelBox(barrel2, 70, 1, 8.5F, 4.0F, -30.0F, 1, 1, 68, 0.0F, false));
        barrel2.cubeList.add(new ModelBox(barrel2, 70, 70, 8.25F, 2.75F, -30.0F, 1, 1, 68, 0.0F, false));
        barrel2.cubeList.add(new ModelBox(barrel2, 0, 69, 7.75F, 2.75F, -30.0F, 1, 1, 68, 0.0F, false));
        barrel2.cubeList.add(new ModelBox(barrel2, 0, 0, 7.75F, 4.25F, -30.0F, 1, 1, 68, 0.0F, false));

        underbarrel2 = new ModelRenderer(this);
        underbarrel2.setRotationPoint(-1.5F, 32.0F, -16.0F);
        barrel_long3.addChild(underbarrel2);


        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(0.5F, -30.0F, 15.0F);
        underbarrel2.addChild(bone28);


        cube_r44 = new ModelRenderer(this);
        cube_r44.setRotationPoint(-0.0154F, -0.3874F, 15.0719F);
        bone28.addChild(cube_r44);
        setRotationAngle(cube_r44, 0.0436F, 0.0F, 0.0873F);
        cube_r44.cubeList.add(new ModelBox(cube_r44, 70, 0, 7.8163F, 2.2392F, -26.1306F, 2, 1, 29, 0.0F, false));

        cube_r45 = new ModelRenderer(this);
        cube_r45.setRotationPoint(1.9051F, -0.3826F, 15.0719F);
        bone28.addChild(cube_r45);
        setRotationAngle(cube_r45, 0.0436F, 0.0F, -0.0873F);
        cube_r45.cubeList.add(new ModelBox(cube_r45, 70, 30, 7.119F, 3.7195F, -26.1952F, 2, 1, 29, 0.0F, false));

        cube_r46 = new ModelRenderer(this);
        cube_r46.setRotationPoint(1.0F, -0.2123F, 9.0776F);
        bone28.addChild(cube_r46);
        setRotationAngle(cube_r46, 0.0436F, 0.0F, 0.0F);
        cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 31, 6.5F, 0.9946F, -20.1635F, 4, 3, 29, 0.0F, false));

        bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(1.5F, -30.9472F, 15.9696F);
        underbarrel2.addChild(bone29);
        setRotationAngle(bone29, -0.5672F, 0.0F, 0.0F);


        cube_r47 = new ModelRenderer(this);
        cube_r47.setRotationPoint(0.0F, 0.0737F, 7.9277F);
        bone29.addChild(cube_r47);
        setRotationAngle(cube_r47, 0.1309F, 0.0F, 0.0F);
        cube_r47.cubeList.add(new ModelBox(cube_r47, 10, 82, 6.5F, 6.9853F, -17.2321F, 4, 2, 1, 0.0F, false));

        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(1.5F, -30.9472F, 15.9696F);
        underbarrel2.addChild(bone30);
        setRotationAngle(bone30, -0.9599F, 0.0F, 0.0F);


        cube_r48 = new ModelRenderer(this);
        cube_r48.setRotationPoint(0.0F, 0.2426F, 7.6118F);
        bone30.addChild(cube_r48);
        setRotationAngle(cube_r48, 0.1309F, 0.0F, 0.0F);
        cube_r48.cubeList.add(new ModelBox(cube_r48, 81, 75, 6.5F, 9.6811F, -13.3202F, 4, 2, 1, 0.0F, false));

        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(1.5F, -30.9472F, 15.9696F);
        underbarrel2.addChild(bone31);
        setRotationAngle(bone31, -1.7017F, 0.0F, 0.0F);


        cube_r49 = new ModelRenderer(this);
        cube_r49.setRotationPoint(0.0F, 0.3945F, 8.0658F);
        bone31.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.1309F, 0.0F, 0.0F);
        cube_r49.cubeList.add(new ModelBox(cube_r49, 10, 87, 6.5F, 11.0F, -4.5F, 4, 1, 1, 0.0F, false));

        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(1.5F, -31.4472F, 15.9696F);
        underbarrel2.addChild(bone32);
        setRotationAngle(bone32, -1.7017F, 0.0F, 0.0F);


        cube_r50 = new ModelRenderer(this);
        cube_r50.setRotationPoint(0.0F, 0.3945F, 8.0658F);
        bone32.addChild(cube_r50);
        setRotationAngle(cube_r50, 0.1309F, 0.0F, 0.0F);
        cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 87, 6.5F, 11.0F, -4.5F, 4, 1, 1, 0.0F, false));

        bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(1.5F, -31.4472F, 15.9696F);
        underbarrel2.addChild(bone33);
        setRotationAngle(bone33, -2.0071F, 0.0F, 0.0F);


        cube_r51 = new ModelRenderer(this);
        cube_r51.setRotationPoint(0.0F, 0.5215F, 7.6894F);
        bone33.addChild(cube_r51);
        setRotationAngle(cube_r51, 0.1309F, 0.0F, 0.0F);
        cube_r51.cubeList.add(new ModelBox(cube_r51, 80, 86, 6.5F, 9.2649F, -1.227F, 4, 1, 1, 0.0F, false));

        bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(1.5F, -31.4472F, 15.9696F);
        underbarrel2.addChild(bone34);
        setRotationAngle(bone34, -2.4435F, 0.0F, 0.0F);


        cube_r52 = new ModelRenderer(this);
        cube_r52.setRotationPoint(0.0F, 0.7371F, 7.6598F);
        bone34.addChild(cube_r52);
        setRotationAngle(cube_r52, 0.1309F, 0.0F, 0.0F);
        cube_r52.cubeList.add(new ModelBox(cube_r52, 70, 86, 6.5F, 5.2763F, 2.2184F, 4, 1, 1, 0.0F, false));

        bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(1.5F, -31.4472F, 15.9696F);
        underbarrel2.addChild(bone35);
        setRotationAngle(bone35, -2.7925F, 0.0F, 0.0F);


        cube_r53 = new ModelRenderer(this);
        cube_r53.setRotationPoint(0.0F, 0.9665F, 7.5118F);
        bone35.addChild(cube_r53);
        setRotationAngle(cube_r53, 0.1309F, 0.0F, 0.0F);
        cube_r53.cubeList.add(new ModelBox(cube_r53, 20, 85, 6.5F, 1.2621F, 3.5476F, 4, 1, 1, 0.0F, false));

        bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(1.5F, -31.4472F, 15.9696F);
        underbarrel2.addChild(bone36);
        bone36.cubeList.add(new ModelBox(bone36, 0, 0, 6.5F, 1.2926F, -11.5806F, 4, 1, 30, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 70, 101, 6.5F, 2.2926F, -12.5806F, 4, 1, 20, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 10, 85, 6.5F, 3.2926F, -12.5806F, 4, 1, 1, 0.0F, false));

        cube_r54 = new ModelRenderer(this);
        cube_r54.setRotationPoint(-1.3728F, -2.3809F, 8.9194F);
        bone36.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.0F, 0.0F, 1.2654F);
        cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 69, 5.8709F, -7.4038F, -20.5F, 1, 1, 30, 0.0F, false));

        cube_r55 = new ModelRenderer(this);
        cube_r55.setRotationPoint(1.3728F, -2.3809F, 8.9194F);
        bone36.addChild(cube_r55);
        setRotationAngle(cube_r55, 0.0F, 0.0F, -1.2654F);
        cube_r55.cubeList.add(new ModelBox(cube_r55, 70, 70, -1.7589F, 8.8094F, -20.5F, 1, 1, 30, 0.0F, false));

        bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(0.25F, 1.6156F, 0.0474F);
        bone36.addChild(bone37);


        bone38 = new ModelRenderer(this);
        bone38.setRotationPoint(1.5F, -31.6972F, 33.4696F);
        underbarrel2.addChild(bone38);


        cube_r56 = new ModelRenderer(this);
        cube_r56.setRotationPoint(0.0F, -0.3428F, 11.3604F);
        bone38.addChild(cube_r56);
        setRotationAngle(cube_r56, -0.5236F, 0.0F, 0.0F);
        cube_r56.cubeList.add(new ModelBox(cube_r56, 53, 75, 6.5F, 8.7141F, -8.9593F, 4, 1, 2, 0.0F, false));

        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(1.5F, -32.04F, 44.8299F);
        underbarrel2.addChild(bone39);
        setRotationAngle(bone39, 0.48F, 0.0F, 0.0F);


        cube_r57 = new ModelRenderer(this);
        cube_r57.setRotationPoint(0.0F, -0.3583F, 0.343F);
        bone39.addChild(cube_r57);
        setRotationAngle(cube_r57, -0.5236F, 0.0F, 0.0F);
        cube_r57.cubeList.add(new ModelBox(cube_r57, 51, 57, 6.5F, 3.9978F, -12.3146F, 4, 1, 2, 0.0F, false));

        bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(1.5F, -32.04F, 44.8299F);
        underbarrel2.addChild(bone40);
        setRotationAngle(bone40, 0.5672F, 0.0F, 0.0F);


        cube_r58 = new ModelRenderer(this);
        cube_r58.setRotationPoint(0.0F, -1.096F, 0.8628F);
        bone40.addChild(cube_r58);
        setRotationAngle(cube_r58, -0.5236F, 0.0F, 0.0F);
        cube_r58.cubeList.add(new ModelBox(cube_r58, 52, 0, 6.5F, 2.9946F, -12.6635F, 4, 1, 2, 0.0F, false));

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(1.5F, -32.04F, 44.8299F);
        underbarrel2.addChild(bone41);
        setRotationAngle(bone41, 0.9599F, 0.0F, 0.0F);


        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(1.5F, -33.1665F, 46.4359F);
        underbarrel2.addChild(bone42);


        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(1.5F, -32.8011F, 33.2766F);
        underbarrel2.addChild(bone43);
        setRotationAngle(bone43, -0.5236F, 0.0F, 0.0F);


        cube_r59 = new ModelRenderer(this);
        cube_r59.setRotationPoint(0.0F, -4.6845F, 10.27F);
        bone43.addChild(cube_r59);
        setRotationAngle(cube_r59, -0.5236F, 0.0F, 0.0F);
        cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 75, 6.5F, 11.4593F, -3.2859F, 4, 1, 2, 0.0F, false));

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(1.5F, -40.4431F, 41.7065F);
        underbarrel2.addChild(bone44);
        setRotationAngle(bone44, -0.829F, 0.0F, 0.0F);


        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(1.5F, -32.8011F, 33.2766F);
        underbarrel2.addChild(bone45);
        setRotationAngle(bone45, -1.1781F, 0.0F, 0.0F);

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        barrel_LONG.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
