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
public final class Barrel extends ModelBase implements IModernModel {

    private final ModelRenderer bone13;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;
    private final ModelRenderer bone6;
    private final ModelRenderer bone5;
    private final ModelRenderer bone9;
    private final ModelRenderer bone8;
    private final ModelRenderer bone12;
    private final ModelRenderer bone11;
    private final ModelRenderer bone39;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer bone35;
    private final ModelRenderer bone36;
    private final ModelRenderer bone37;
    private final ModelRenderer bone23;
    private final ModelRenderer bone24;
    private final ModelRenderer bone25;
    private final ModelRenderer bone29;
    private final ModelRenderer bone30;
    private final ModelRenderer bone31;
    private final ModelRenderer bone40;
    private final ModelRenderer bone41;
    private final ModelRenderer bone42;
    private final ModelRenderer bone43;
    private final ModelRenderer bone44;
    private final ModelRenderer bone45;
    private final ModelRenderer bone46;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer bone49;
    private final ModelRenderer bone50;
    private final ModelRenderer bone51;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone32;
    private final ModelRenderer bone33;
    private final ModelRenderer bone34;
    private final ModelRenderer bone20;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone28;

    public Barrel() {
        textureWidth = 128;
        textureHeight = 128;

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, 2.0F, -22.0F, -2.25F, 4, 1, 4, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone13.addChild(bone2);
        setRotationAngle(bone2, 0.0F, -0.4363F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 25, 25, 0.0F, -2.01F, 0.0F, 6, 21, 13, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone13.addChild(bone);
        setRotationAngle(bone, 0.0F, 0.4363F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 59, -6.0F, -1.99F, 0.0F, 6, 21, 3, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0001F, -19.0F, 8.0F);
        bone13.addChild(bone6);
        setRotationAngle(bone6, -3.1416F, 0.4363F, 3.1416F);
        bone6.cubeList.add(new ModelBox(bone6, 34, 59, 0.0F, -1.99F, 0.0F, 6, 21, 2, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0001F, -19.0F, 8.0F);
        bone13.addChild(bone5);
        setRotationAngle(bone5, 3.1416F, -0.4363F, -3.1416F);
        bone5.cubeList.add(new ModelBox(bone5, 58, 0, -6.0F, -1.99F, 0.0F, 6, 21, 4, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(8.0F, -19.0F, 0.0F);
        bone13.addChild(bone9);
        setRotationAngle(bone9, -3.1416F, -1.1345F, 3.1416F);
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, 0.0F, -2.0F, 0.0F, 6, 21, 13, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(8.0F, -19.0F, 0.0F);
        bone13.addChild(bone8);
        setRotationAngle(bone8, 0.0F, -1.1345F, 0.0F);
        bone8.cubeList.add(new ModelBox(bone8, 38, 0, -6.0F, -1.99F, 0.0F, 6, 21, 4, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(-8.5F, -19.0F, 0.0F);
        bone13.addChild(bone12);
        setRotationAngle(bone12, 0.0F, 1.1345F, 0.0F);
        bone12.cubeList.add(new ModelBox(bone12, 18, 59, 0.2113F, -2.01F, 0.4532F, 6, 21, 2, 0.0F, false));

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(-8.5F, -19.0F, 0.0F);
        bone13.addChild(bone11);
        setRotationAngle(bone11, -3.1416F, 1.1345F, 3.1416F);
        bone11.cubeList.add(new ModelBox(bone11, 0, 34, -6.2113F, -1.99F, 0.4532F, 6, 21, 4, 0.0F, false));

        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone13.addChild(bone39);

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(0.0F, -7.0F, -0.25F);
        bone39.addChild(bone17);

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone17.addChild(bone18);
        setRotationAngle(bone18, 0.0F, 0.4363F, 0.0F);
        bone18.cubeList.add(new ModelBox(bone18, 63, 40, -6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone17.addChild(bone19);
        setRotationAngle(bone19, 0.0F, -0.4363F, 0.0F);
        bone19.cubeList.add(new ModelBox(bone19, 63, 38, 0.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(0.0F, -7.0F, 0.25F);
        bone39.addChild(bone35);
        setRotationAngle(bone35, 0.0F, 3.1416F, 0.0F);

        bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone35.addChild(bone36);
        setRotationAngle(bone36, 0.0F, 0.4363F, 0.0F);
        bone36.cubeList.add(new ModelBox(bone36, 50, 35, -6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone35.addChild(bone37);
        setRotationAngle(bone37, 0.0F, -0.4363F, 0.0F);
        bone37.cubeList.add(new ModelBox(bone37, 50, 33, 0.0F, 18.01F, 0.0F, 6, 1, 1, 0.0F, false));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(0.25F, -7.0F, 0.0F);
        bone39.addChild(bone23);
        setRotationAngle(bone23, 0.0F, -1.5708F, 0.0F);

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone23.addChild(bone24);
        setRotationAngle(bone24, 0.0F, 0.4363F, 0.0F);
        bone24.cubeList.add(new ModelBox(bone24, 63, 32, -6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone23.addChild(bone25);
        setRotationAngle(bone25, 0.0F, -0.4363F, 0.0F);
        bone25.cubeList.add(new ModelBox(bone25, 63, 30, 0.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(-0.75F, -7.0F, 0.0F);
        bone39.addChild(bone29);
        setRotationAngle(bone29, 0.0F, 1.5708F, 0.0F);

        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone29.addChild(bone30);
        setRotationAngle(bone30, 0.0F, 0.4363F, 0.0F);
        bone30.cubeList.add(new ModelBox(bone30, 50, 63, -6.2113F, 18.0F, 0.4532F, 6, 1, 1, 0.0F, false));

        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone29.addChild(bone31);
        setRotationAngle(bone31, 0.0F, -0.4363F, 0.0F);
        bone31.cubeList.add(new ModelBox(bone31, 62, 58, 0.2113F, 18.0F, 0.4532F, 6, 1, 1, 0.0F, false));

        bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(0.0F, -20.25F, -0.25F);
        bone13.addChild(bone40);

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone40.addChild(bone41);
        setRotationAngle(bone41, 0.0F, 0.4363F, 0.0F);
        bone41.cubeList.add(new ModelBox(bone41, 50, 31, -6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone40.addChild(bone42);
        setRotationAngle(bone42, 0.0F, -0.4363F, 0.0F);
        bone42.cubeList.add(new ModelBox(bone42, 50, 29, 0.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(0.0F, 0.0F, 0.5F);
        bone40.addChild(bone43);
        setRotationAngle(bone43, 0.0F, 3.1416F, 0.0F);

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone43.addChild(bone44);
        setRotationAngle(bone44, 0.0F, 0.4363F, 0.0F);
        bone44.cubeList.add(new ModelBox(bone44, 50, 27, -6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone43.addChild(bone45);
        setRotationAngle(bone45, 0.0F, -0.4363F, 0.0F);
        bone45.cubeList.add(new ModelBox(bone45, 50, 25, 0.0F, 18.01F, 0.0F, 6, 1, 1, 0.0F, false));

        bone46 = new ModelRenderer(this);
        bone46.setRotationPoint(0.25F, 0.0F, 0.25F);
        bone40.addChild(bone46);
        setRotationAngle(bone46, 0.0F, -1.5708F, 0.0F);

        bone47 = new ModelRenderer(this);
        bone47.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone46.addChild(bone47);
        setRotationAngle(bone47, 0.0F, 0.4363F, 0.0F);
        bone47.cubeList.add(new ModelBox(bone47, 16, 36, -6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone48 = new ModelRenderer(this);
        bone48.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone46.addChild(bone48);
        setRotationAngle(bone48, 0.0F, -0.4363F, 0.0F);
        bone48.cubeList.add(new ModelBox(bone48, 16, 34, 0.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone49 = new ModelRenderer(this);
        bone49.setRotationPoint(-0.75F, 0.0F, 0.25F);
        bone40.addChild(bone49);
        setRotationAngle(bone49, 0.0F, 1.5708F, 0.0F);

        bone50 = new ModelRenderer(this);
        bone50.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone49.addChild(bone50);
        setRotationAngle(bone50, 0.0F, 0.4363F, 0.0F);
        bone50.cubeList.add(new ModelBox(bone50, 25, 2, -6.2113F, 18.0F, 0.4532F, 6, 1, 1, 0.0F, false));

        bone51 = new ModelRenderer(this);
        bone51.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone49.addChild(bone51);
        setRotationAngle(bone51, 0.0F, -0.4363F, 0.0F);
        bone51.cubeList.add(new ModelBox(bone51, 25, 0, 0.2113F, 18.0F, 0.4532F, 6, 1, 1, 0.0F, false));

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, -14.0F, -0.25F);
        bone13.addChild(bone14);

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone14.addChild(bone15);
        setRotationAngle(bone15, 0.0F, 0.4363F, 0.0F);
        bone15.cubeList.add(new ModelBox(bone15, 63, 44, -6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone14.addChild(bone16);
        setRotationAngle(bone16, 0.0F, -0.4363F, 0.0F);
        bone16.cubeList.add(new ModelBox(bone16, 63, 42, 0.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(0.0F, 0.0F, 0.5F);
        bone14.addChild(bone32);
        setRotationAngle(bone32, 0.0F, 3.1416F, 0.0F);

        bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone32.addChild(bone33);
        setRotationAngle(bone33, 0.0F, 0.4363F, 0.0F);
        bone33.cubeList.add(new ModelBox(bone33, 50, 61, -6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone32.addChild(bone34);
        setRotationAngle(bone34, 0.0F, -0.4363F, 0.0F);
        bone34.cubeList.add(new ModelBox(bone34, 48, 59, 0.0F, 18.01F, 0.0F, 6, 1, 1, 0.0F, false));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(0.25F, 0.0F, 0.25F);
        bone14.addChild(bone20);
        setRotationAngle(bone20, 0.0F, -1.5708F, 0.0F);

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone20.addChild(bone21);
        setRotationAngle(bone21, 0.0F, 0.4363F, 0.0F);
        bone21.cubeList.add(new ModelBox(bone21, 63, 36, -6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone20.addChild(bone22);
        setRotationAngle(bone22, 0.0F, -0.4363F, 0.0F);
        bone22.cubeList.add(new ModelBox(bone22, 63, 34, 0.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F, false));

        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(-0.75F, 0.0F, 0.25F);
        bone14.addChild(bone26);
        setRotationAngle(bone26, 0.0F, 1.5708F, 0.0F);

        bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone26.addChild(bone27);
        setRotationAngle(bone27, 0.0F, 0.4363F, 0.0F);
        bone27.cubeList.add(new ModelBox(bone27, 63, 28, -6.2113F, 18.0F, 0.4532F, 6, 1, 1, 0.0F, false));

        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone26.addChild(bone28);
        setRotationAngle(bone28, 0.0F, -0.4363F, 0.0F);
        bone28.cubeList.add(new ModelBox(bone28, 63, 26, 0.2113F, 18.0F, 0.4532F, 6, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone13.render(scale);
    }
}
