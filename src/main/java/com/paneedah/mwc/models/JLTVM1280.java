package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class JLTVM1280 extends ModelBase {
    private final ModelRenderer interior;
    private final ModelRenderer steering_wheel;
    private final ModelRenderer bone111;
    private final ModelRenderer cube_r1;
    private final ModelRenderer bone110;
    private final ModelRenderer cube_r2;
    private final ModelRenderer bone112;
    private final ModelRenderer bone116;
    private final ModelRenderer bone117;
    private final ModelRenderer bone118;
    private final ModelRenderer bone115;
    private final ModelRenderer bone114;
    private final ModelRenderer bone113;
    private final ModelRenderer bone109;
    private final ModelRenderer cube_r3;
    private final ModelRenderer front_seats;
    private final ModelRenderer seat_driver;
    private final ModelRenderer upper_chair3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer lower_chair3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer seat_passenger;
    private final ModelRenderer upper_chair4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer lower_chair4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer backseats;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer detailing;
    private final ModelRenderer bone76;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer bone80;
    private final ModelRenderer bone93;
    private final ModelRenderer bone94;
    private final ModelRenderer bone81;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer bone3;
    private final ModelRenderer body_m1280;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer bone8;
    private final ModelRenderer cube_r46;
    private final ModelRenderer bone16;
    private final ModelRenderer cube_r47;
    private final ModelRenderer bone19;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer bone31;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer bone7;
    private final ModelRenderer cube_r52;
    private final ModelRenderer bone25;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer bone26;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer bone;
    private final ModelRenderer bone11;
    private final ModelRenderer bone9;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer bone10;
    private final ModelRenderer bone17;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer bone28;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer bone29;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer bone18;
    private final ModelRenderer bone22;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer bone21;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer bone20;
    private final ModelRenderer cube_r79;
    private final ModelRenderer bone23;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer bone32;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer bone24;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer bone30;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;

    public JLTVM1280() {
        textureWidth = 512;
        textureHeight = 512;

        interior = new ModelRenderer(this);
        interior.setRotationPoint(0.0F, 1.0F, 21.0F);


        steering_wheel = new ModelRenderer(this);
        steering_wheel.setRotationPoint(32.0F, -6.0F, -18.0F);
        interior.addChild(steering_wheel);
        setRotationAngle(steering_wheel, -0.1309F, 0.0F, 0.0F);


        bone111 = new ModelRenderer(this);
        bone111.setRotationPoint(-15.5F, -27.0F, 33.5F);
        steering_wheel.addChild(bone111);
        setRotationAngle(bone111, -1.2043F, -0.3142F, 0.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(1.5F, -1.3584F, 1.5664F);
        bone111.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.1309F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 58, 196, -2.8004F, -0.5814F, -0.0545F, 4, 2, 2, 0.0F, false));

        bone110 = new ModelRenderer(this);
        bone110.setRotationPoint(-22.5F, -27.0F, 33.5F);
        steering_wheel.addChild(bone110);
        setRotationAngle(bone110, -1.2043F, 0.3142F, 0.0F);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-1.5F, -1.3584F, 1.5664F);
        bone110.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.1309F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 208, -1.1996F, -0.5814F, -0.0545F, 4, 2, 2, 0.0F, false));

        bone112 = new ModelRenderer(this);
        bone112.setRotationPoint(-16.5F, -25.0F, 31.3F);
        steering_wheel.addChild(bone112);
        setRotationAngle(bone112, -1.0123F, 0.0F, 0.0F);
        bone112.cubeList.add(new ModelBox(bone112, 37, 76, -3.479F, -3.5853F, 4.0561F, 2, 1, 5, 0.0F, false));

        bone116 = new ModelRenderer(this);
        bone116.setRotationPoint(-20.0F, -32.0F, 32.7F);
        steering_wheel.addChild(bone116);
        setRotationAngle(bone116, 0.2269F, -0.1745F, 1.2217F);
        bone116.cubeList.add(new ModelBox(bone116, 0, 109, 0.0F, -1.0F, 0.0F, 2, 7, 2, 0.0F, false));

        bone117 = new ModelRenderer(this);
        bone117.setRotationPoint(-18.5F, -20.0F, 37.3F);
        steering_wheel.addChild(bone117);
        setRotationAngle(bone117, -0.0698F, 0.4189F, -1.8151F);
        bone117.cubeList.add(new ModelBox(bone117, 159, 25, -2.0F, -1.0F, 0.0F, 2, 6, 2, 0.0F, false));

        bone118 = new ModelRenderer(this);
        bone118.setRotationPoint(-19.5F, -20.0F, 37.3F);
        steering_wheel.addChild(bone118);
        setRotationAngle(bone118, -0.0698F, -0.4189F, 1.8151F);
        bone118.cubeList.add(new ModelBox(bone118, 189, 178, 0.0F, -1.0F, 0.0F, 2, 6, 2, 0.0F, false));

        bone115 = new ModelRenderer(this);
        bone115.setRotationPoint(-18.0F, -32.0F, 32.7F);
        steering_wheel.addChild(bone115);
        setRotationAngle(bone115, 0.2269F, 0.1745F, -1.2217F);
        bone115.cubeList.add(new ModelBox(bone115, 148, 109, -2.0F, -1.0F, 0.0F, 2, 7, 2, 0.0F, false));

        bone114 = new ModelRenderer(this);
        bone114.setRotationPoint(-24.5F, -24.0F, 35.9F);
        steering_wheel.addChild(bone114);
        setRotationAngle(bone114, 0.3665F, 0.3142F, 0.0F);
        bone114.cubeList.add(new ModelBox(bone114, 0, 42, -2.0F, -6.0F, 0.0F, 2, 10, 2, 0.0F, false));

        bone113 = new ModelRenderer(this);
        bone113.setRotationPoint(-13.5F, -24.0F, 35.9F);
        steering_wheel.addChild(bone113);
        setRotationAngle(bone113, 0.3665F, -0.3142F, 0.0F);
        bone113.cubeList.add(new ModelBox(bone113, 230, 188, 0.0F, -6.0F, 0.0F, 2, 10, 2, 0.0F, false));

        bone109 = new ModelRenderer(this);
        bone109.setRotationPoint(-18.5F, -29.0F, 32.0F);
        steering_wheel.addChild(bone109);
        setRotationAngle(bone109, -1.4137F, 0.0F, 0.0F);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-0.5F, -2.0524F, 2.0007F);
        bone109.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 76, -1.5F, 1.852F, 1.8765F, 3, 6, 2, 0.0F, false));
        cube_r3.cubeList.add(new ModelBox(cube_r3, 51, 0, -1.5F, -1.148F, 3.8765F, 3, 4, 1, 0.0F, false));
        cube_r3.cubeList.add(new ModelBox(cube_r3, 222, 86, -2.5F, -1.148F, 0.8765F, 5, 3, 3, 0.0F, false));

        front_seats = new ModelRenderer(this);
        front_seats.setRotationPoint(34.0F, -3.0F, -8.0F);
        interior.addChild(front_seats);


        seat_driver = new ModelRenderer(this);
        seat_driver.setRotationPoint(-2.0F, 0.0F, -9.0F);
        front_seats.addChild(seat_driver);


        upper_chair3 = new ModelRenderer(this);
        upper_chair3.setRotationPoint(-19.0F, -19.5106F, 54.4386F);
        seat_driver.addChild(upper_chair3);
        setRotationAngle(upper_chair3, -0.3054F, 0.0F, 0.0F);
        upper_chair3.cubeList.add(new ModelBox(upper_chair3, 64, 435, -6.0F, -7.6388F, 0.4021F, 12, 19, 3, 0.0F, false));

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, -8.2431F, 0.4948F);
        upper_chair3.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 239, 380, -5.0F, -5.2864F, -1.4453F, 10, 7, 4, 0.0F, false));

        lower_chair3 = new ModelRenderer(this);
        lower_chair3.setRotationPoint(-19.0F, -11.9039F, 42.2091F);
        seat_driver.addChild(lower_chair3);
        setRotationAngle(lower_chair3, -0.1047F, 0.0F, 0.0F);
        lower_chair3.cubeList.add(new ModelBox(lower_chair3, 0, 409, -5.0F, 1.8765F, -4.6864F, 10, 4, 14, 0.0F, false));

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(6.2336F, -0.4465F, 0.0F);
        lower_chair3.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3927F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 430, 250, -2.6418F, 0.7565F, -4.6864F, 3, 4, 14, 0.0F, false));

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-6.2336F, -0.4465F, 0.0F);
        lower_chair3.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3927F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 432, 279, -0.3582F, 0.7565F, -4.6864F, 3, 4, 14, 0.0F, false));

        seat_passenger = new ModelRenderer(this);
        seat_passenger.setRotationPoint(-28.0F, 0.0F, -9.0F);
        front_seats.addChild(seat_passenger);


        upper_chair4 = new ModelRenderer(this);
        upper_chair4.setRotationPoint(-19.0F, -19.5106F, 54.4386F);
        seat_passenger.addChild(upper_chair4);
        setRotationAngle(upper_chair4, -0.3054F, 0.0F, 0.0F);
        upper_chair4.cubeList.add(new ModelBox(upper_chair4, 34, 433, -6.0F, -7.6388F, 0.4021F, 12, 19, 3, 0.0F, false));

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(22.0F, -8.2431F, 0.4948F);
        upper_chair4.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 377, -27.0F, -5.2864F, -1.4453F, 10, 7, 4, 0.0F, false));

        lower_chair4 = new ModelRenderer(this);
        lower_chair4.setRotationPoint(-19.0F, -11.9039F, 42.2091F);
        seat_passenger.addChild(lower_chair4);
        setRotationAngle(lower_chair4, -0.1047F, 0.0F, 0.0F);
        lower_chair4.cubeList.add(new ModelBox(lower_chair4, 284, 240, -5.0F, 1.8765F, -4.6864F, 10, 4, 14, 0.0F, false));

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(6.2336F, -0.4465F, 0.0F);
        lower_chair4.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, -0.3927F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 271, 308, -2.6418F, 0.7565F, -4.6864F, 3, 4, 14, 0.0F, false));

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-6.2336F, -0.4465F, 0.0F);
        lower_chair4.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, 0.3927F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 351, 429, -0.3582F, 0.7565F, -4.6864F, 3, 4, 14, 0.0F, false));

        backseats = new ModelRenderer(this);
        backseats.setRotationPoint(-0.0769F, -22.8012F, 46.4463F);
        interior.addChild(backseats);
        backseats.cubeList.add(new ModelBox(backseats, 178, 138, -3.9231F, -12.1743F, 16.428F, 8, 3, 3, 0.0F, false));
        backseats.cubeList.add(new ModelBox(backseats, 76, 130, -21.9231F, 7.7221F, -1.5176F, 44, 4, 14, 0.0F, false));
        backseats.cubeList.add(new ModelBox(backseats, 438, 83, -21.9231F, 6.7221F, -1.5176F, 4, 1, 14, 0.0F, false));
        backseats.cubeList.add(new ModelBox(backseats, 426, 130, 18.0769F, 6.7221F, -1.5176F, 4, 1, 14, 0.0F, false));

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(-4.0792F, 7.6274F, 5.4824F);
        backseats.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, -0.48F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 205, 63, -1.0F, -0.5F, -6.0F, 2, 1, 13, 0.0F, false));

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(17.4208F, 7.6274F, 5.4824F);
        backseats.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, -0.48F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 447, 394, -1.0F, -0.5F, -7.0F, 2, 1, 14, 0.0F, false));

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(-17.2669F, 7.6274F, 5.4824F);
        backseats.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, 0.48F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 399, 447, -1.0F, -0.5F, -7.0F, 2, 1, 14, 0.0F, false));

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(4.2331F, 7.6274F, 5.4824F);
        backseats.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.0F, 0.48F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 223, 294, -1.0F, -0.5F, -6.0F, 2, 1, 13, 0.0F, false));

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(-11.4231F, -9.6743F, 17.428F);
        backseats.addChild(cube_r14);
        setRotationAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        cube_r14.cubeList.add(new ModelBox(cube_r14, 204, 111, -4.5F, -2.5F, -2.0F, 9, 5, 4, 0.0F, false));
        cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 312, 18.5F, -2.5F, -2.0F, 9, 5, 4, 0.0F, false));

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(-13.4231F, 6.7221F, 15.4824F);
        backseats.addChild(cube_r15);
        setRotationAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
        cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 352, -7.5F, -16.0F, -3.0F, 42, 21, 4, 0.0F, false));

        detailing = new ModelRenderer(this);
        detailing.setRotationPoint(-4.0922F, -15.5947F, 17.0426F);
        interior.addChild(detailing);


        bone76 = new ModelRenderer(this);
        bone76.setRotationPoint(-24.9078F, -13.1053F, -23.0426F);
        detailing.addChild(bone76);
        setRotationAngle(bone76, -0.2443F, 0.0F, 0.0F);


        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(29.0F, 8.6261F, 17.2287F);
        bone76.addChild(cube_r16);
        setRotationAngle(cube_r16, -1.0036F, 0.0F, 0.0F);
        cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 292, -24.25F, -4.976F, -7.2825F, 8, 3, 17, 0.0F, false));
        cube_r16.cubeList.add(new ModelBox(cube_r16, 114, 352, 16.25F, -4.976F, -7.2825F, 8, 3, 17, 0.0F, false));
        cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 324, -17.0F, -1.976F, -7.2825F, 34, 5, 17, 0.0F, false));

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(29.5F, -4.9167F, 16.3867F);
        bone76.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.5672F, 0.2182F, 0.1309F);
        cube_r17.cubeList.add(new ModelBox(cube_r17, 273, 280, -4.7462F, 0.9399F, -3.0532F, 8, 6, 6, 0.0F, false));

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(41.0F, -5.8288F, 14.0083F);
        bone76.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.6981F, 0.0F, 0.0F);
        cube_r18.cubeList.add(new ModelBox(cube_r18, 319, 39, -5.0F, 1.6964F, -3.3151F, 12, 6, 6, 0.0F, false));

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(29.0F, -2.5039F, 16.6929F);
        bone76.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.48F, 0.0F, 0.0F);
        cube_r19.cubeList.add(new ModelBox(cube_r19, 340, 115, -24.0F, 1.7866F, -5.3032F, 48, 4, 8, 0.0F, false));
        cube_r19.cubeList.add(new ModelBox(cube_r19, 315, 308, -24.0F, -0.2718F, -5.5463F, 48, 7, 8, 0.0F, false));

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(29.0F, 0.6778F, 16.0861F);
        bone76.addChild(cube_r20);
        setRotationAngle(cube_r20, -0.48F, 0.0F, 0.0F);
        cube_r20.cubeList.add(new ModelBox(cube_r20, 309, 153, -24.0F, -1.2531F, -2.0121F, 48, 7, 8, 0.0F, false));

        bone80 = new ModelRenderer(this);
        bone80.setRotationPoint(4.0922F, -7.9053F, -7.0426F);
        detailing.addChild(bone80);
        setRotationAngle(bone80, -0.4189F, 0.0F, 0.0F);


        bone93 = new ModelRenderer(this);
        bone93.setRotationPoint(5.0F, -1.0F, 14.0F);
        bone80.addChild(bone93);
        setRotationAngle(bone93, 0.0F, 1.3788F, 0.0F);


        bone94 = new ModelRenderer(this);
        bone94.setRotationPoint(-5.0F, -1.0F, 14.0F);
        bone80.addChild(bone94);
        setRotationAngle(bone94, 0.0F, -1.3788F, 0.0F);


        bone81 = new ModelRenderer(this);
        bone81.setRotationPoint(4.5922F, -3.6553F, 3.9574F);
        detailing.addChild(bone81);
        setRotationAngle(bone81, 0.0436F, 0.0F, 0.0F);


        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(-0.5F, -3.9131F, -7.4716F);
        bone81.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
        cube_r21.cubeList.add(new ModelBox(cube_r21, 273, 380, -4.5F, 0.2124F, -4.6256F, 9, 7, 6, 0.0F, false));

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(-0.5F, 4.9981F, 0.9128F);
        bone81.addChild(cube_r22);
        setRotationAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        cube_r22.cubeList.add(new ModelBox(cube_r22, 419, 297, -4.5F, -5.7392F, 8.0379F, 9, 4, 11, 0.0F, false));
        cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 208, -3.5F, -1.7392F, -14.9621F, 7, 11, 52, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-0.625F, -1.4402F, 3.3246F);
        bone81.addChild(bone3);
        setRotationAngle(bone3, 0.2182F, 0.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, -0.375F, 2.6423F, -1.1513F, 1, 3, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 44, 124, -1.125F, 0.6532F, -1.9016F, 2, 2, 2, 0.0F, false));

        body_m1280 = new ModelRenderer(this);
        body_m1280.setRotationPoint(0.9257F, 0.3729F, 18.9366F);
        body_m1280.cubeList.add(new ModelBox(body_m1280, 0, 0, -25.9257F, -6.1229F, 6.0634F, 50, 17, 59, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 141, 367, 18.0743F, -20.3729F, 77.0634F, 16, 9, 23, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 303, 364, -35.9257F, -20.3729F, 77.0634F, 16, 9, 23, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 348, 127, -19.9257F, -20.3729F, 71.0634F, 38, 9, 8, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 66, 271, -35.9257F, -37.3729F, 77.0634F, 3, 17, 3, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 66, 271, 31.0743F, -37.3729F, 77.0634F, 3, 17, 3, 0.0F, true));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 218, 188, -35.9257F, -37.3729F, 106.0634F, 3, 17, 3, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 218, 188, 31.0743F, -37.3729F, 106.0634F, 3, 17, 3, 0.0F, true));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 0, 208, 19.0743F, -40.3729F, 109.0634F, 15, 18, 9, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 128, 305, 19.0743F, -22.3729F, 109.0634F, 15, 2, 7, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 190, 95, -24.9257F, -37.3729F, 107.0634F, 3, 17, 2, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 42, 95, 20.0743F, -37.3729F, 107.0634F, 3, 17, 2, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 189, 190, -32.9257F, -34.3729F, 108.0634F, 8, 3, 1, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 0, 185, 23.0743F, -34.3729F, 108.0634F, 8, 3, 1, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 134, 168, 31.0743F, -40.3729F, 106.0634F, 3, 3, 3, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 66, 245, 19.0743F, -43.3729F, 100.0634F, 15, 3, 9, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 278, 33, -35.9257F, -40.3729F, 106.0634F, 67, 3, 3, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 238, 380, 31.0743F, -40.3729F, 77.0634F, 3, 3, 29, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 0, 377, -35.9257F, -40.3729F, 77.0634F, 3, 3, 29, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 0, 271, 18.0743F, -20.3729F, 100.0634F, 16, 12, 9, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 0, 235, -35.9257F, -20.3729F, 100.0634F, 16, 12, 9, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 159, 0, -19.9257F, -11.3729F, 67.1634F, 38, 10, 41, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 135, 274, -9.9257F, -2.3729F, 67.0634F, 18, 7, 41, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 342, 188, -9.9257F, 3.6271F, 71.0634F, 18, 7, 30, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 0, 172, -9.9257F, 4.6271F, -25.9366F, 18, 6, 18, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 204, 86, -16.9257F, -12.3729F, -33.9366F, 33, 14, 35, 0.0F, false));
        body_m1280.cubeList.add(new ModelBox(body_m1280, 66, 208, -10.9257F, -10.6229F, -39.9366F, 20, 1, 6, 0.0F, false));

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(10.0743F, -0.1689F, -41.4827F);
        body_m1280.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0873F, 0.0F, 0.0F);
        cube_r23.cubeList.add(new ModelBox(cube_r23, 37, 82, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));
        cube_r23.cubeList.add(new ModelBox(cube_r23, 152, 167, -24.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(-0.9257F, -2.1613F, -41.657F);
        body_m1280.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0873F, 0.0F, 0.0F);
        cube_r24.cubeList.add(new ModelBox(cube_r24, 159, 51, -13.0F, -1.0F, -1.0F, 26, 2, 2, 0.0F, false));

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(15.5743F, -11.5777F, -42.4186F);
        body_m1280.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.0873F, 0.0F, 0.0F);
        cube_r25.cubeList.add(new ModelBox(cube_r25, 121, 193, -21.5F, -6.5F, -1.0F, 10, 4, 2, 0.0F, true));
        cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 76, -2.5F, -8.5F, -1.0F, 4, 17, 2, 0.0F, false));
        cube_r25.cubeList.add(new ModelBox(cube_r25, 148, 76, -34.5F, -8.5F, -1.0F, 4, 17, 2, 0.0F, false));

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(2.5743F, -9.8448F, -42.1576F);
        body_m1280.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.0873F, 0.0F, -0.0873F);
        cube_r26.cubeList.add(new ModelBox(cube_r26, 160, 76, -0.5F, -4.5F, -1.0F, 1, 12, 2, 0.0F, false));

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(-4.4257F, -9.8448F, -42.1576F);
        body_m1280.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0873F, 0.0F, 0.0873F);
        cube_r27.cubeList.add(new ModelBox(cube_r27, 191, 13, -0.5F, -4.5F, -1.0F, 1, 12, 2, 0.0F, false));

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(-0.9257F, -12.5834F, -41.6077F);
        body_m1280.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.0873F, 0.0F, 0.0F);
        cube_r28.cubeList.add(new ModelBox(cube_r28, 374, 66, -14.0F, -7.5F, -1.0F, 28, 17, 2, 0.0F, true));

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(-0.9257F, -8.5673F, -33.8417F);
        body_m1280.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.5236F, 0.0F, 0.0F);
        cube_r29.cubeList.add(new ModelBox(cube_r29, 218, 173, -35.0F, -1.0F, -6.5F, 70, 2, 13, 0.0F, false));

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(-0.9257F, -11.8561F, -7.2663F);
        body_m1280.addChild(cube_r30);
        setRotationAngle(cube_r30, -0.7418F, 0.0F, 0.0F);
        cube_r30.cubeList.add(new ModelBox(cube_r30, 276, 147, -35.0F, -1.0F, -2.0F, 70, 2, 4, 0.0F, false));

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(-0.9257F, -13.4187F, -10.185F);
        body_m1280.addChild(cube_r31);
        setRotationAngle(cube_r31, -0.2618F, 0.0F, 0.0F);
        cube_r31.cubeList.add(new ModelBox(cube_r31, 278, 27, -35.0F, -1.0F, -2.0F, 70, 2, 4, 0.0F, false));

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(-0.9257F, -12.7361F, -20.6505F);
        body_m1280.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.1309F, 0.0F, 0.0F);
        cube_r32.cubeList.add(new ModelBox(cube_r32, 152, 154, -35.0F, -1.0F, -8.0F, 70, 2, 17, 0.0F, false));

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(-0.9257F, 0.3072F, -0.2313F);
        body_m1280.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.48F, 0.0F, 0.0F);
        cube_r33.cubeList.add(new ModelBox(cube_r33, 278, 0, -35.0F, -12.5F, -1.0F, 70, 25, 2, 0.0F, false));

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(-16.8126F, 6.1959F, -18.9366F);
        body_m1280.addChild(cube_r34);
        setRotationAngle(cube_r34, 0.0F, 0.0F, -0.2182F);
        cube_r34.cubeList.add(new ModelBox(cube_r34, 371, 168, -11.0F, -3.0F, 100.5F, 22, 6, 7, 0.0F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 371, 168, -11.0F, -3.0F, -3.5F, 22, 6, 7, 0.0F, false));

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(14.9612F, 6.1959F, -18.9366F);
        body_m1280.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.0F, 0.0F, 0.2182F);
        cube_r35.cubeList.add(new ModelBox(cube_r35, 284, 261, -11.0F, -3.0F, 100.5F, 22, 6, 7, 0.0F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 284, 261, -11.0F, -3.0F, -3.5F, 22, 6, 7, 0.0F, false));

        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(-0.9257F, 4.3771F, -35.9366F);
        body_m1280.addChild(cube_r36);
        setRotationAngle(cube_r36, -0.2618F, 0.0F, 0.0F);
        cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 198, -6.0F, -2.0F, -8.0F, 12, 2, 2, 0.0F, false));
        cube_r36.cubeList.add(new ModelBox(cube_r36, 44, 42, 6.0F, -3.0F, -9.0F, 2, 6, 5, 0.0F, false));
        cube_r36.cubeList.add(new ModelBox(cube_r36, 204, 86, -8.0F, -3.0F, -9.0F, 2, 6, 5, 0.0F, false));
        cube_r36.cubeList.add(new ModelBox(cube_r36, 380, 272, -9.0F, -3.0F, -4.0F, 18, 6, 15, 0.0F, false));

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(-27.9257F, -12.0829F, 93.1898F);
        body_m1280.addChild(cube_r37);
        setRotationAngle(cube_r37, -0.5236F, 0.0F, 0.0F);
        cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 109, -7.987F, -3.0F, -2.5F, 16, 5, 10, 0.0F, false));
        cube_r37.cubeList.add(new ModelBox(cube_r37, 148, 109, 45.987F, -3.0F, -2.5F, 16, 5, 10, 0.0F, false));

        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(21.0743F, -12.6248F, 77.3152F);
        body_m1280.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.1309F, 0.0F, 0.0F);
        cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 42, -3.05F, -2.0F, -6.0F, 16, 4, 12, 0.0F, true));
        cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 42, -56.95F, -2.0F, -6.0F, 16, 4, 12, 0.0F, false));

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(-0.9257F, -1.9557F, 103.6811F);
        body_m1280.addChild(cube_r39);
        setRotationAngle(cube_r39, -0.2618F, 0.0F, 0.0F);
        cube_r39.cubeList.add(new ModelBox(cube_r39, 375, 437, -35.0F, -1.0F, -4.0F, 9, 3, 10, 0.0F, false));
        cube_r39.cubeList.add(new ModelBox(cube_r39, 437, 437, 26.0F, -1.0F, -4.0F, 9, 3, 10, 0.0F, false));

        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(-0.9257F, -4.5902F, 98.4158F);
        body_m1280.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.5236F, 0.0F, 0.0F);
        cube_r40.cubeList.add(new ModelBox(cube_r40, 293, 409, -34.999F, -5.5F, -1.0F, 14, 9, 9, 0.0F, false));
        cube_r40.cubeList.add(new ModelBox(cube_r40, 414, 409, 20.999F, -5.5F, -1.0F, 14, 9, 9, 0.0F, false));

        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(-0.9257F, -2.0699F, 67.7414F);
        body_m1280.addChild(cube_r41);
        setRotationAngle(cube_r41, -0.2618F, 0.0F, 0.0F);
        cube_r41.cubeList.add(new ModelBox(cube_r41, 204, 135, -35.0F, -11.0F, -0.5F, 70, 10, 2, 0.0F, false));

        cube_r42 = new ModelRenderer(this);
        cube_r42.setRotationPoint(-13.6219F, -0.971F, 87.5634F);
        body_m1280.addChild(cube_r42);
        setRotationAngle(cube_r42, 0.0F, 0.0F, 0.5236F);
        cube_r42.cubeList.add(new ModelBox(cube_r42, 63, 305, -6.0F, -3.0F, -20.51F, 12, 6, 41, 0.0F, false));

        cube_r43 = new ModelRenderer(this);
        cube_r43.setRotationPoint(11.7704F, -0.971F, 87.5634F);
        body_m1280.addChild(cube_r43);
        setRotationAngle(cube_r43, 0.0F, 0.0F, -0.5236F);
        cube_r43.cubeList.add(new ModelBox(cube_r43, 315, 261, -6.0F, -3.0F, -20.51F, 12, 6, 41, 0.0F, false));

        cube_r44 = new ModelRenderer(this);
        cube_r44.setRotationPoint(30.5743F, -28.4001F, 104.7699F);
        body_m1280.addChild(cube_r44);
        setRotationAngle(cube_r44, 0.2618F, 0.0F, 0.0F);
        cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 130, 0.4F, -11.0F, -2.5F, 3, 11, 7, 0.0F, false));
        cube_r44.cubeList.add(new ModelBox(cube_r44, 76, 130, 0.4F, 0.0F, -2.5F, 3, 9, 4, 0.0F, false));

        cube_r45 = new ModelRenderer(this);
        cube_r45.setRotationPoint(27.0743F, -22.0194F, 117.0028F);
        body_m1280.addChild(cube_r45);
        setRotationAngle(cube_r45, -0.7854F, 0.0F, 0.0F);
        cube_r45.cubeList.add(new ModelBox(cube_r45, 189, 173, -8.03F, -1.0F, -1.5F, 15, 3, 2, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(21.0743F, -14.3729F, 104.5634F);
        body_m1280.addChild(bone8);
        bone8.cubeList.add(new ModelBox(bone8, 417, 146, -3.05F, 6.0F, -2.5F, 16, 7, 7, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 417, 146, -56.95F, 6.0F, -2.5F, 16, 7, 7, 0.0F, true));
        bone8.cubeList.add(new ModelBox(bone8, 122, 275, 4.5F, 10.5F, 6.0F, 8, 5, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 118, 208, 4.0F, 10.0F, 4.0F, 9, 6, 2, 0.0F, false));

        cube_r46 = new ModelRenderer(this);
        cube_r46.setRotationPoint(3.0F, 8.5179F, 4.567F);
        bone8.addChild(cube_r46);
        setRotationAngle(cube_r46, 0.5236F, 0.0F, 0.0F);
        cube_r46.cubeList.add(new ModelBox(cube_r46, 147, 290, 1.0F, -1.0F, -1.5F, 9, 3, 2, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(-22.9257F, -14.3729F, 104.5634F);
        body_m1280.addChild(bone16);
        bone16.cubeList.add(new ModelBox(bone16, 152, 186, -12.5F, 10.5F, 6.0F, 8, 5, 1, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 178, 130, -13.0F, 10.0F, 4.0F, 9, 6, 2, 0.0F, false));

        cube_r47 = new ModelRenderer(this);
        cube_r47.setRotationPoint(-3.0F, 8.5179F, 4.567F);
        bone16.addChild(cube_r47);
        setRotationAngle(cube_r47, 0.5236F, 0.0F, 0.0F);
        cube_r47.cubeList.add(new ModelBox(cube_r47, 122, 267, -10.0F, -1.0F, -1.5F, 9, 3, 2, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(-0.9257F, -9.1229F, -37.4366F);
        body_m1280.addChild(bone19);
        bone19.cubeList.add(new ModelBox(bone19, 152, 173, -15.6148F, 5.411F, -7.0F, 3, 6, 7, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 76, 190, -32.0F, 2.75F, -7.0F, 18, 2, 9, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 147, 275, -36.0F, 2.75F, -8.0F, 4, 5, 10, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 159, 25, -25.8373F, 3.9595F, -6.0F, 12, 8, 8, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 305, 86, -30.8373F, 3.9595F, -6.0F, 5, 3, 8, 0.0F, false));

        cube_r48 = new ModelRenderer(this);
        cube_r48.setRotationPoint(-29.8827F, 8.6603F, -2.5F);
        bone19.addChild(cube_r48);
        setRotationAngle(cube_r48, 0.0F, 0.0F, 0.3927F);
        cube_r48.cubeList.add(new ModelBox(cube_r48, 435, 348, -6.0F, -3.5F, -3.499F, 11, 5, 8, 0.0F, false));

        cube_r49 = new ModelRenderer(this);
        cube_r49.setRotationPoint(-14.4253F, 4.0988F, -2.5F);
        bone19.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.0F, 0.0F, -0.48F);
        cube_r49.cubeList.add(new ModelBox(cube_r49, 189, 178, -2.0F, -1.0F, -4.5F, 3, 3, 9, 0.0F, false));

        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(-0.9257F, -9.1229F, -37.4366F);
        body_m1280.addChild(bone31);
        bone31.cubeList.add(new ModelBox(bone31, 152, 173, 12.6148F, 5.411F, -7.0F, 3, 6, 7, 0.0F, true));
        bone31.cubeList.add(new ModelBox(bone31, 76, 190, 14.0F, 2.75F, -7.0F, 18, 2, 9, 0.0F, true));
        bone31.cubeList.add(new ModelBox(bone31, 147, 275, 32.0F, 2.75F, -8.0F, 4, 5, 10, 0.0F, true));
        bone31.cubeList.add(new ModelBox(bone31, 159, 25, 13.8373F, 3.9595F, -6.0F, 12, 8, 8, 0.0F, true));
        bone31.cubeList.add(new ModelBox(bone31, 305, 86, 25.8373F, 3.9595F, -6.0F, 5, 3, 8, 0.0F, true));

        cube_r50 = new ModelRenderer(this);
        cube_r50.setRotationPoint(29.8827F, 8.6603F, -2.5F);
        bone31.addChild(cube_r50);
        setRotationAngle(cube_r50, 0.0F, 0.0F, -0.3927F);
        cube_r50.cubeList.add(new ModelBox(cube_r50, 435, 348, -5.0F, -3.5F, -3.499F, 11, 5, 8, 0.0F, true));

        cube_r51 = new ModelRenderer(this);
        cube_r51.setRotationPoint(14.4253F, 4.0988F, -2.5F);
        bone31.addChild(cube_r51);
        setRotationAngle(cube_r51, 0.0F, 0.0F, 0.48F);
        cube_r51.cubeList.add(new ModelBox(cube_r51, 189, 178, -1.0F, -1.0F, -4.5F, 3, 3, 9, 0.0F, true));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(-0.9257F, -35.3729F, 12.0634F);
        body_m1280.addChild(bone7);
        setRotationAngle(bone7, -0.7854F, 0.0F, 0.0F);
        bone7.cubeList.add(new ModelBox(bone7, 234, 216, 22.0F, -10.6066F, 0.7071F, 2, 22, 3, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 58, 151, -2.0F, -8.6066F, 0.7071F, 4, 20, 3, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 218, 211, -22.0F, -10.6066F, 0.7071F, 44, 2, 3, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 222, 51, -24.0F, -10.6066F, 0.7071F, 2, 22, 3, 0.0F, false));

        cube_r52 = new ModelRenderer(this);
        cube_r52.setRotationPoint(0.0F, 6.3934F, 2.2071F);
        bone7.addChild(cube_r52);
        setRotationAngle(cube_r52, 0.0F, 0.0F, -0.7854F);
        cube_r52.cubeList.add(new ModelBox(cube_r52, 126, 437, -10.0F, -4.0F, -1.4883F, 14, 14, 3, 0.0F, false));

        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(0.0F, 0.6213F, 2.1213F);
        bone7.addChild(bone25);
        bone25.cubeList.add(new ModelBox(bone25, 90, 148, 21.0F, -8.2279F, -3.4142F, 1, 17, 2, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 148, 124, 2.0F, -9.2279F, -3.4142F, 20, 1, 2, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 187, 56, 9.0F, 8.7721F, -3.4142F, 13, 1, 2, 0.0F, false));

        cube_r53 = new ModelRenderer(this);
        cube_r53.setRotationPoint(6.1716F, 6.2365F, -2.4142F);
        bone25.addChild(cube_r53);
        setRotationAngle(cube_r53, 0.0F, 0.0F, 0.7854F);
        cube_r53.cubeList.add(new ModelBox(cube_r53, 248, 236, -6.5F, -0.5F, -1.0F, 11, 1, 2, 0.0F, false));

        cube_r54 = new ModelRenderer(this);
        cube_r54.setRotationPoint(2.1288F, -0.7142F, -2.4142F);
        bone25.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.0F, 0.0F, 0.0436F);
        cube_r54.cubeList.add(new ModelBox(cube_r54, 66, 241, -0.5F, -8.5F, -1.0F, 1, 11, 2, 0.0F, false));

        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(0.0F, 0.6213F, 2.1213F);
        bone7.addChild(bone26);
        bone26.cubeList.add(new ModelBox(bone26, 12, 76, -22.0F, -8.2279F, -3.4142F, 1, 17, 2, 0.0F, false));
        bone26.cubeList.add(new ModelBox(bone26, 0, 124, -22.0F, -9.2279F, -3.4142F, 20, 1, 2, 0.0F, false));
        bone26.cubeList.add(new ModelBox(bone26, 159, 55, -22.0F, 8.7721F, -3.4142F, 13, 1, 2, 0.0F, false));

        cube_r55 = new ModelRenderer(this);
        cube_r55.setRotationPoint(-6.1716F, 6.2365F, -2.4142F);
        bone26.addChild(cube_r55);
        setRotationAngle(cube_r55, 0.0F, 0.0F, -0.7854F);
        cube_r55.cubeList.add(new ModelBox(cube_r55, 28, 198, -4.5F, -0.5F, -1.0F, 11, 1, 2, 0.0F, false));

        cube_r56 = new ModelRenderer(this);
        cube_r56.setRotationPoint(-2.1288F, -0.7142F, -2.4142F);
        bone26.addChild(cube_r56);
        setRotationAngle(cube_r56, 0.0F, 0.0F, -0.0436F);
        cube_r56.cubeList.add(new ModelBox(cube_r56, 113, 148, -0.5F, -8.5F, -1.0F, 1, 11, 2, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(-0.9257F, -41.8729F, 50.0634F);
        body_m1280.addChild(bone);
        bone.cubeList.add(new ModelBox(bone, 343, 39, -12.0F, -2.5F, -10.0F, 24, 2, 25, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 76, -24.0F, -0.5F, -30.0F, 48, 2, 52, 0.0F, false));

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(-0.9257F, -29.3334F, -12.6077F);
        body_m1280.addChild(bone11);
        bone11.cubeList.add(new ModelBox(bone11, 218, 188, -27.0F, 2.0F, 0.0F, 54, 2, 21, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(4.0F, 2.25F, -13.0F);
        bone11.addChild(bone9);
        setRotationAngle(bone9, 0.1309F, 0.0F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 305, 86, -22.0F, 1.449F, -14.0786F, 36, 2, 27, 0.0F, false));

        cube_r57 = new ModelRenderer(this);
        cube_r57.setRotationPoint(-21.8435F, -0.5254F, 0.5811F);
        bone9.addChild(cube_r57);
        setRotationAngle(cube_r57, 0.0F, -0.2618F, 0.0F);
        cube_r57.cubeList.add(new ModelBox(cube_r57, 353, 368, -4.1354F, 2.0743F, -14.6371F, 10, 2, 28, 0.0F, false));

        cube_r58 = new ModelRenderer(this);
        cube_r58.setRotationPoint(13.8435F, -0.5254F, 0.5811F);
        bone9.addChild(cube_r58);
        setRotationAngle(cube_r58, 0.0F, 0.2618F, 0.0F);
        cube_r58.cubeList.add(new ModelBox(cube_r58, 191, 371, -5.8646F, 2.0743F, -14.6371F, 10, 2, 28, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone9.addChild(bone10);
        setRotationAngle(bone10, 0.3054F, 0.0F, 0.0F);
        bone10.cubeList.add(new ModelBox(bone10, 128, 322, -22.0F, -2.8516F, -19.8627F, 36, 2, 6, 0.0F, false));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(-0.9257F, -1.8532F, -10.0221F);
        body_m1280.addChild(bone17);
        bone17.cubeList.add(new ModelBox(bone17, 408, 201, 14.5F, -26.5197F, 6.0856F, 14, 8, 8, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 54, 305, -28.5F, -26.5197F, 6.0856F, 14, 8, 8, 0.0F, false));

        cube_r59 = new ModelRenderer(this);
        cube_r59.setRotationPoint(25.9257F, -2.7716F, 11.7998F);
        bone17.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.48F, -0.0873F, 0.0F);
        cube_r59.cubeList.add(new ModelBox(cube_r59, 212, 274, -1.0F, -11.5F, -4.5F, 2, 23, 10, 0.0F, true));

        cube_r60 = new ModelRenderer(this);
        cube_r60.setRotationPoint(-25.9257F, -2.7716F, 11.7998F);
        bone17.addChild(cube_r60);
        setRotationAngle(cube_r60, 0.48F, 0.0873F, 0.0F);
        cube_r60.cubeList.add(new ModelBox(cube_r60, 212, 274, -1.0F, -11.5F, -4.5F, 2, 23, 10, 0.0F, false));

        cube_r61 = new ModelRenderer(this);
        cube_r61.setRotationPoint(-27.0F, -17.4803F, 8.6644F);
        bone17.addChild(cube_r61);
        setRotationAngle(cube_r61, 0.0F, 0.0873F, 0.0F);
        cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 76, -1.0F, -7.0F, -9.5F, 2, 14, 19, 0.0F, false));

        cube_r62 = new ModelRenderer(this);
        cube_r62.setRotationPoint(27.0F, -17.4803F, 8.6644F);
        bone17.addChild(cube_r62);
        setRotationAngle(cube_r62, 0.0F, -0.0873F, 0.0F);
        cube_r62.cubeList.add(new ModelBox(cube_r62, 148, 76, -1.0F, -7.0F, -9.5F, 2, 14, 19, 0.0F, false));

        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(34.1001F, -33.0197F, 27.6192F);
        bone17.addChild(bone28);


        cube_r63 = new ModelRenderer(this);
        cube_r63.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone28.addChild(cube_r63);
        setRotationAngle(cube_r63, 0.0F, -0.6981F, 0.0F);
        cube_r63.cubeList.add(new ModelBox(cube_r63, 152, 192, -2.5F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));

        cube_r64 = new ModelRenderer(this);
        cube_r64.setRotationPoint(-4.9793F, 8.0F, -4.1781F);
        bone28.addChild(cube_r64);
        setRotationAngle(cube_r64, 0.0F, -0.6981F, 0.0F);
        cube_r64.cubeList.add(new ModelBox(cube_r64, 48, 85, 3.0F, -8.5F, -0.5F, 1, 9, 1, 0.0F, false));
        cube_r64.cubeList.add(new ModelBox(cube_r64, 54, 187, -5.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, false));

        cube_r65 = new ModelRenderer(this);
        cube_r65.setRotationPoint(-1.1491F, 10.0F, -0.9642F);
        bone28.addChild(cube_r65);
        setRotationAngle(cube_r65, 0.0F, -0.6981F, 0.0F);
        cube_r65.cubeList.add(new ModelBox(cube_r65, 30, 196, -10.0F, -0.5F, -0.5F, 14, 1, 1, 0.0F, false));

        cube_r66 = new ModelRenderer(this);
        cube_r66.setRotationPoint(1.6499F, 5.0F, 1.4664F);
        bone28.addChild(cube_r66);
        setRotationAngle(cube_r66, 0.0F, -0.48F, 0.0F);
        cube_r66.cubeList.add(new ModelBox(cube_r66, 190, 0, -7.0F, -4.5F, -1.0F, 3, 3, 2, 0.0F, false));

        cube_r67 = new ModelRenderer(this);
        cube_r67.setRotationPoint(1.3999F, 5.0F, 1.4664F);
        bone28.addChild(cube_r67);
        setRotationAngle(cube_r67, 0.0F, -0.48F, 0.0F);
        cube_r67.cubeList.add(new ModelBox(cube_r67, 0, 172, -2.0F, -4.5F, -2.0F, 4, 9, 4, 0.0F, false));

        bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(-34.1001F, -33.0197F, 27.6192F);
        bone17.addChild(bone29);


        cube_r68 = new ModelRenderer(this);
        cube_r68.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone29.addChild(cube_r68);
        setRotationAngle(cube_r68, 0.0F, 0.6981F, 0.0F);
        cube_r68.cubeList.add(new ModelBox(cube_r68, 121, 190, -2.5F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));

        cube_r69 = new ModelRenderer(this);
        cube_r69.setRotationPoint(4.9793F, 8.0F, -4.1781F);
        bone29.addChild(cube_r69);
        setRotationAngle(cube_r69, 0.0F, 0.6981F, 0.0F);
        cube_r69.cubeList.add(new ModelBox(cube_r69, 8, 42, -4.0F, -8.5F, -0.5F, 1, 9, 1, 0.0F, false));
        cube_r69.cubeList.add(new ModelBox(cube_r69, 0, 148, -3.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, false));

        cube_r70 = new ModelRenderer(this);
        cube_r70.setRotationPoint(1.1491F, 10.0F, -0.9642F);
        bone29.addChild(cube_r70);
        setRotationAngle(cube_r70, 0.0F, 0.6981F, 0.0F);
        cube_r70.cubeList.add(new ModelBox(cube_r70, 0, 196, -4.0F, -0.5F, -0.5F, 14, 1, 1, 0.0F, false));

        cube_r71 = new ModelRenderer(this);
        cube_r71.setRotationPoint(-1.6499F, 5.0F, 1.4664F);
        bone29.addChild(cube_r71);
        setRotationAngle(cube_r71, 0.0F, 0.48F, 0.0F);
        cube_r71.cubeList.add(new ModelBox(cube_r71, 42, 114, 4.0F, -4.5F, -1.0F, 3, 3, 2, 0.0F, false));

        cube_r72 = new ModelRenderer(this);
        cube_r72.setRotationPoint(-1.3999F, 5.0F, 1.4664F);
        bone29.addChild(cube_r72);
        setRotationAngle(cube_r72, 0.0F, 0.48F, 0.0F);
        cube_r72.cubeList.add(new ModelBox(cube_r72, 152, 154, -2.0F, -4.5F, -2.0F, 4, 9, 4, 0.0F, false));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(10.0F, -23.2303F, -13.5856F);
        bone17.addChild(bone18);
        setRotationAngle(bone18, 0.1745F, 0.0F, 0.0F);
        bone18.cubeList.add(new ModelBox(bone18, 204, 51, -37.0F, 1.0112F, -18.1541F, 54, 4, 31, 0.0F, false));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(-25.2108F, -17.7535F, -33.7298F);
        body_m1280.addChild(bone22);
        setRotationAngle(bone22, 0.0873F, -0.0436F, 0.0436F);


        cube_r73 = new ModelRenderer(this);
        cube_r73.setRotationPoint(-2.9145F, 0.1667F, -5.6789F);
        bone22.addChild(cube_r73);
        setRotationAngle(cube_r73, 0.0F, -0.48F, 0.0F);
        cube_r73.cubeList.add(new ModelBox(cube_r73, 0, 0, -1.3943F, -4.0148F, -2.3354F, 4, 15, 6, 0.0F, false));

        cube_r74 = new ModelRenderer(this);
        cube_r74.setRotationPoint(-0.9854F, 1.6709F, -0.2743F);
        bone22.addChild(cube_r74);
        setRotationAngle(cube_r74, 0.0F, 0.0873F, 0.0F);
        cube_r74.cubeList.add(new ModelBox(cube_r74, 250, 340, -4.5956F, -5.519F, -3.2106F, 11, 13, 27, 0.0F, false));

        cube_r75 = new ModelRenderer(this);
        cube_r75.setRotationPoint(1.785F, 1.6709F, -5.5964F);
        bone22.addChild(cube_r75);
        setRotationAngle(cube_r75, 0.0F, 0.0873F, 0.0F);
        cube_r75.cubeList.add(new ModelBox(cube_r75, 37, 130, -4.5956F, -5.519F, -3.2106F, 11, 15, 6, 0.0F, false));

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(23.3593F, -17.7535F, -33.7298F);
        body_m1280.addChild(bone21);
        setRotationAngle(bone21, 0.0873F, 0.0436F, -0.0436F);


        cube_r76 = new ModelRenderer(this);
        cube_r76.setRotationPoint(2.9145F, 0.1667F, -5.6789F);
        bone21.addChild(cube_r76);
        setRotationAngle(cube_r76, 0.0F, 0.48F, 0.0F);
        cube_r76.cubeList.add(new ModelBox(cube_r76, 0, 0, -2.6057F, -4.0148F, -2.3354F, 4, 15, 6, 0.0F, true));

        cube_r77 = new ModelRenderer(this);
        cube_r77.setRotationPoint(0.9854F, 1.6709F, -0.2743F);
        bone21.addChild(cube_r77);
        setRotationAngle(cube_r77, 0.0F, -0.0873F, 0.0F);
        cube_r77.cubeList.add(new ModelBox(cube_r77, 250, 340, -6.4044F, -5.519F, -3.2106F, 11, 13, 27, 0.0F, false));

        cube_r78 = new ModelRenderer(this);
        cube_r78.setRotationPoint(-1.785F, 1.6709F, -5.5964F);
        bone21.addChild(cube_r78);
        setRotationAngle(cube_r78, 0.0F, -0.0873F, 0.0F);
        cube_r78.cubeList.add(new ModelBox(cube_r78, 37, 130, -6.4044F, -5.519F, -3.2106F, 11, 15, 6, 0.0F, true));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(-23.1539F, -26.6234F, 48.3134F);
        body_m1280.addChild(bone20);
        bone20.cubeList.add(new ModelBox(bone20, 342, 225, -2.2718F, -14.5F, 21.0F, 49, 21, 4, 0.0F, false));

        cube_r79 = new ModelRenderer(this);
        cube_r79.setRotationPoint(47.9564F, 21.6337F, 14.6558F);
        bone20.addChild(cube_r79);
        setRotationAngle(cube_r79, -0.2618F, 0.0F, 0.0F);
        cube_r79.cubeList.add(new ModelBox(cube_r79, 169, 333, -50.7282F, -17.3833F, 2.0942F, 50, 30, 4, 0.0F, true));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(-25.6539F, -8.6234F, 42.0634F);
        body_m1280.addChild(bone23);
        bone23.cubeList.add(new ModelBox(bone23, 86, 154, -2.0F, -11.5F, -38.5F, 2, 29, 62, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 257, 280, -8.0F, 20.5F, -32.5F, 5, 2, 48, 0.0F, false));

        cube_r80 = new ModelRenderer(this);
        cube_r80.setRotationPoint(-3.1036F, 17.3536F, 13.5F);
        bone23.addChild(cube_r80);
        setRotationAngle(cube_r80, 0.0F, 0.0F, -0.9163F);
        cube_r80.cubeList.add(new ModelBox(cube_r80, 204, 77, -5.0F, -1.0F, -1.5F, 9, 2, 3, 0.0F, false));
        cube_r80.cubeList.add(new ModelBox(cube_r80, 204, 178, -5.0F, -1.0F, -45.75F, 9, 2, 3, 0.0F, false));

        cube_r81 = new ModelRenderer(this);
        cube_r81.setRotationPoint(-1.0F, 3.6337F, 20.9058F);
        bone23.addChild(cube_r81);
        setRotationAngle(cube_r81, -0.2618F, 0.0F, 0.0F);
        cube_r81.cubeList.add(new ModelBox(cube_r81, 257, 280, -0.8968F, -17.5F, -6.0F, 2, 30, 12, 0.0F, false));

        cube_r82 = new ModelRenderer(this);
        cube_r82.setRotationPoint(-2.0F, -5.0F, -3.0F);
        bone23.addChild(cube_r82);
        setRotationAngle(cube_r82, 0.1309F, 0.0F, 0.0F);
        cube_r82.cubeList.add(new ModelBox(cube_r82, 122, 275, -1.0F, -1.5F, -9.5F, 2, 3, 21, 0.0F, false));

        cube_r83 = new ModelRenderer(this);
        cube_r83.setRotationPoint(0.0F, -13.0F, 0.0F);
        bone23.addChild(cube_r83);
        setRotationAngle(cube_r83, 0.0873F, 0.0F, 0.0F);
        cube_r83.cubeList.add(new ModelBox(cube_r83, 128, 76, -2.1008F, -2.0F, -41.0F, 2, 6, 72, 0.0F, false));

        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(23.8025F, -8.6234F, 42.0634F);
        body_m1280.addChild(bone32);
        bone32.cubeList.add(new ModelBox(bone32, 86, 154, 0.0F, -11.5F, -38.5F, 2, 29, 62, 0.0F, true));
        bone32.cubeList.add(new ModelBox(bone32, 257, 280, 3.0F, 20.5F, -32.5F, 5, 2, 48, 0.0F, true));

        cube_r84 = new ModelRenderer(this);
        cube_r84.setRotationPoint(3.1036F, 17.3536F, 13.5F);
        bone32.addChild(cube_r84);
        setRotationAngle(cube_r84, 0.0F, 0.0F, 0.9163F);
        cube_r84.cubeList.add(new ModelBox(cube_r84, 204, 77, -4.0F, -1.0F, -1.5F, 9, 2, 3, 0.0F, true));
        cube_r84.cubeList.add(new ModelBox(cube_r84, 204, 178, -4.0F, -1.0F, -45.75F, 9, 2, 3, 0.0F, true));

        cube_r85 = new ModelRenderer(this);
        cube_r85.setRotationPoint(1.0F, 3.6337F, 20.9058F);
        bone32.addChild(cube_r85);
        setRotationAngle(cube_r85, -0.2618F, 0.0F, 0.0F);
        cube_r85.cubeList.add(new ModelBox(cube_r85, 257, 280, -1.1032F, -17.5F, -6.0F, 2, 30, 12, 0.0F, true));

        cube_r86 = new ModelRenderer(this);
        cube_r86.setRotationPoint(2.0F, -5.0F, -3.0F);
        bone32.addChild(cube_r86);
        setRotationAngle(cube_r86, 0.1309F, 0.0F, 0.0F);
        cube_r86.cubeList.add(new ModelBox(cube_r86, 122, 275, -1.0F, -1.5F, -9.5F, 2, 3, 21, 0.0F, true));

        cube_r87 = new ModelRenderer(this);
        cube_r87.setRotationPoint(0.0F, -13.0F, 0.0F);
        bone32.addChild(cube_r87);
        setRotationAngle(cube_r87, 0.0873F, 0.0F, 0.0F);
        cube_r87.cubeList.add(new ModelBox(cube_r87, 128, 76, 0.1008F, -2.0F, -41.0F, 2, 6, 72, 0.0F, true));

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(-23.9039F, -42.1234F, 46.0634F);
        body_m1280.addChild(bone24);
        setRotationAngle(bone24, 0.0F, 0.0F, 0.1309F);
        bone24.cubeList.add(new ModelBox(bone24, 64, 245, -1.1184F, 0.9743F, -27.0F, 2, 6, 54, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 204, 86, -1.1084F, 6.9743F, -9.0F, 2, 11, 14, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 54, 174, -1.1184F, 13.9743F, -38.0F, 2, 8, 5, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 191, 76, -3.1084F, 6.9743F, -9.0F, 2, 8, 1, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 140, 208, -3.1084F, 13.9743F, -33.0F, 2, 7, 1, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 63, 417, -3.1084F, 5.9743F, -25.0F, 2, 1, 17, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 447, 166, -3.1084F, 5.9743F, 4.0F, 2, 1, 14, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 185, 76, -3.1084F, 6.9743F, 4.0F, 2, 9, 1, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 13, 130, -3.1084F, 6.9743F, 17.0F, 2, 6, 1, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 171, 76, -1.1084F, 6.9743F, 17.0F, 2, 9, 10, 0.0F, false));

        cube_r88 = new ModelRenderer(this);
        cube_r88.setRotationPoint(0.0F, 4.5F, 0.0F);
        bone24.addChild(cube_r88);
        setRotationAngle(cube_r88, 0.0873F, 0.0F, 0.0F);
        cube_r88.cubeList.add(new ModelBox(cube_r88, 203, 280, -1.1195F, 11.463F, -24.2592F, 2, 3, 50, 0.0F, false));

        cube_r89 = new ModelRenderer(this);
        cube_r89.setRotationPoint(-0.1084F, 10.7525F, -32.364F);
        bone24.addChild(cube_r89);
        setRotationAngle(cube_r89, -0.7854F, 0.0F, 0.0F);
        cube_r89.cubeList.add(new ModelBox(cube_r89, 218, 216, -0.9984F, -10.0F, -3.0F, 2, 20, 6, 0.0F, false));

        cube_r90 = new ModelRenderer(this);
        cube_r90.setRotationPoint(-2.1084F, 10.353F, -28.5503F);
        bone24.addChild(cube_r90);
        setRotationAngle(cube_r90, -0.7854F, 0.0F, 0.0F);
        cube_r90.cubeList.add(new ModelBox(cube_r90, 242, 280, -1.0F, -5.5F, -0.5F, 2, 11, 1, 0.0F, false));

        cube_r91 = new ModelRenderer(this);
        cube_r91.setRotationPoint(-2.1084F, 14.0322F, 11.5757F);
        bone24.addChild(cube_r91);
        setRotationAngle(cube_r91, 0.2182F, 0.0F, 0.0F);
        cube_r91.cubeList.add(new ModelBox(cube_r91, 300, 447, -1.0F, -0.6082F, -7.4881F, 2, 1, 14, 0.0F, false));

        cube_r92 = new ModelRenderer(this);
        cube_r92.setRotationPoint(-2.1084F, 20.4743F, -19.5F);
        bone24.addChild(cube_r92);
        setRotationAngle(cube_r92, 0.2618F, 0.0F, 0.0F);
        cube_r92.cubeList.add(new ModelBox(cube_r92, 54, 271, -1.0F, -3.5F, -12.5F, 2, 1, 25, 0.0F, false));

        cube_r93 = new ModelRenderer(this);
        cube_r93.setRotationPoint(-0.1084F, 17.119F, -14.705F);
        bone24.addChild(cube_r93);
        setRotationAngle(cube_r93, 0.2618F, 0.0F, 0.0F);
        cube_r93.cubeList.add(new ModelBox(cube_r93, 35, 377, -0.9984F, -1.5F, -19.0F, 2, 3, 26, 0.0F, false));

        cube_r94 = new ModelRenderer(this);
        cube_r94.setRotationPoint(-0.1084F, 15.0085F, 11.2921F);
        bone24.addChild(cube_r94);
        setRotationAngle(cube_r94, 0.2182F, 0.0F, 0.0F);
        cube_r94.cubeList.add(new ModelBox(cube_r94, 444, 187, -0.9984F, -1.5F, -7.0F, 2, 3, 14, 0.0F, false));

        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(22.0525F, -42.1234F, 46.0634F);
        body_m1280.addChild(bone30);
        setRotationAngle(bone30, 0.0F, 0.0F, -0.1309F);
        bone30.cubeList.add(new ModelBox(bone30, 226, 220, -0.8816F, 0.9743F, -27.0F, 2, 6, 54, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 159, 0, -0.8916F, 6.9743F, -9.0F, 2, 11, 14, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 159, 0, -0.8816F, 13.9743F, -38.0F, 2, 8, 5, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 76, 190, 1.1084F, 6.9743F, -9.0F, 2, 8, 1, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 0, 208, 1.1084F, 13.9743F, -33.0F, 2, 7, 1, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 315, 280, 1.1084F, 5.9743F, -25.0F, 2, 1, 17, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 445, 298, 1.1084F, 5.9743F, 4.0F, 2, 1, 14, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 171, 76, 1.1084F, 6.9743F, 4.0F, 2, 9, 1, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 0, 130, 1.1084F, 6.9743F, 17.0F, 2, 6, 1, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 23, 76, -0.8916F, 6.9743F, 17.0F, 2, 9, 10, 0.0F, false));

        cube_r95 = new ModelRenderer(this);
        cube_r95.setRotationPoint(0.0F, 4.5F, 0.0F);
        bone30.addChild(cube_r95);
        setRotationAngle(cube_r95, 0.0873F, 0.0F, 0.0F);
        cube_r95.cubeList.add(new ModelBox(cube_r95, 0, 271, -0.8805F, 11.463F, -24.2592F, 2, 3, 50, 0.0F, false));

        cube_r96 = new ModelRenderer(this);
        cube_r96.setRotationPoint(0.1084F, 10.7525F, -32.364F);
        bone30.addChild(cube_r96);
        setRotationAngle(cube_r96, -0.7854F, 0.0F, 0.0F);
        cube_r96.cubeList.add(new ModelBox(cube_r96, 66, 215, -1.0016F, -10.0F, -3.0F, 2, 20, 6, 0.0F, false));

        cube_r97 = new ModelRenderer(this);
        cube_r97.setRotationPoint(2.1084F, 10.353F, -28.5503F);
        bone30.addChild(cube_r97);
        setRotationAngle(cube_r97, -0.7854F, 0.0F, 0.0F);
        cube_r97.cubeList.add(new ModelBox(cube_r97, 236, 280, -1.0F, -5.5F, -0.5F, 2, 11, 1, 0.0F, false));

        cube_r98 = new ModelRenderer(this);
        cube_r98.setRotationPoint(2.1084F, 14.0322F, 11.5757F);
        bone30.addChild(cube_r98);
        setRotationAngle(cube_r98, 0.2182F, 0.0F, 0.0F);
        cube_r98.cubeList.add(new ModelBox(cube_r98, 446, 413, -1.0F, -0.6082F, -7.4881F, 2, 1, 14, 0.0F, false));

        cube_r99 = new ModelRenderer(this);
        cube_r99.setRotationPoint(2.1084F, 20.4743F, -19.5F);
        bone30.addChild(cube_r99);
        setRotationAngle(cube_r99, 0.2618F, 0.0F, 0.0F);
        cube_r99.cubeList.add(new ModelBox(cube_r99, 122, 249, -1.0F, -3.5F, -12.5F, 2, 1, 25, 0.0F, false));

        cube_r100 = new ModelRenderer(this);
        cube_r100.setRotationPoint(0.1084F, 17.119F, -14.705F);
        bone30.addChild(cube_r100);
        setRotationAngle(cube_r100, 0.2618F, 0.0F, 0.0F);
        cube_r100.cubeList.add(new ModelBox(cube_r100, 218, 216, -1.0016F, -1.5F, -19.0F, 2, 3, 26, 0.0F, false));

        cube_r101 = new ModelRenderer(this);
        cube_r101.setRotationPoint(0.1084F, 15.0085F, 11.2921F);
        bone30.addChild(cube_r101);
        setRotationAngle(cube_r101, 0.2182F, 0.0F, 0.0F);
        cube_r101.cubeList.add(new ModelBox(cube_r101, 442, 5, -1.0016F, -1.5F, -7.0F, 2, 3, 14, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        interior.render(f5);
        body_m1280.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
