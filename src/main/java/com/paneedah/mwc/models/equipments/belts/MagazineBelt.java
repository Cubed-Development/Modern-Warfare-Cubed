package com.paneedah.mwc.models.equipments.belts;

import com.paneedah.mwc.models.IModernModel;
import com.paneedah.mwc.models.equipments.IEquipmentModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

/**
 * Made with Blockbench 4.7.4
 *
 * @author Designer: Braiam23
 * @author Developer: Desoroxx
 */
public final class MagazineBelt extends ModelBiped implements IModernModel, IEquipmentModel {

    private final ModelRenderer body;
    private final ModelRenderer belt;
    private final ModelRenderer belt1;
    private final ModelRenderer belt2;
    private final ModelRenderer belt3;
    private final ModelRenderer belt4;
    private final ModelRenderer holders;
    private final ModelRenderer holder;
    private final ModelRenderer holder1;
    private final ModelRenderer holder2;
    private final ModelRenderer holder3;
    private final ModelRenderer holder4;
    private final ModelRenderer holder5;
    private final ModelRenderer magazines;
    private final ModelRenderer magazine;
    private final ModelRenderer magazine1;
    private final ModelRenderer magazine2;
    private final ModelRenderer magazine3;
    private final ModelRenderer magazine4;
    private final ModelRenderer magazine5;
    private final ModelRenderer satchel;
    private final ModelRenderer button;

    public MagazineBelt() {
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.cubeList.add(new ModelBox(body, 0, 16, -4, 0, -2, 8, 12, 4, 0, false));

        belt = new ModelRenderer(this);
        belt.setRotationPoint(0.1043F, 11.0035F, 0.0666F);
        body.addChild(belt);
        belt.cubeList.add(new ModelBox(belt, 28, 32, -4.6043F, -1.4035F, 1.5334F, 9, 1, 1, 0, false));

        belt1 = new ModelRenderer(this);
        belt1.setRotationPoint(0.2514F, -0.1478F, 0.311F);
        belt.addChild(belt1);
        setRotationAngle(belt1, 0.3142F, 0, 0);
        belt1.cubeList.add(new ModelBox(belt1, 32, 36, -4.8557F, -0.7696F, -2.3609F, 1, 1, 4, 0, false));
        belt1.cubeList.add(new ModelBox(belt1, 38, 34, 3.1443F, -0.7078F, -2.1707F, 1, 1, 4, 0, false));

        belt2 = new ModelRenderer(this);
        belt2.setRotationPoint(0.2514F, -0.1478F, 0.311F);
        belt.addChild(belt2);
        setRotationAngle(belt2, 0.3689F, -0.4885F, -0.1128F);
        belt2.cubeList.add(new ModelBox(belt2, 0, 6, 0.6354F, -0.9293F, -3.8965F, 2, 1, 1, 0, false));

        belt3 = new ModelRenderer(this);
        belt3.setRotationPoint(0.2514F, -0.1478F, 0.311F);
        belt.addChild(belt3);
        setRotationAngle(belt3, 0.3689F, 0.4885F, 0.1128F);
        belt3.cubeList.add(new ModelBox(belt3, 24, 5, -3.2596F, -0.9743F, -4.3348F, 2, 1, 1, 0, false));

        belt4 = new ModelRenderer(this);
        belt4.setRotationPoint(0.2514F, -0.1478F, 0.311F);
        belt.addChild(belt4);
        setRotationAngle(belt4, 0.192F, 0, 0);
        belt4.cubeList.add(new ModelBox(belt4, 35, 51, -0.9557F, -0.4513F, -3.2923F, 1, 1, 1, 0.1F, false));
        belt4.cubeList.add(new ModelBox(belt4, 28, 34, -3.3557F, -0.4513F, -3.1923F, 6, 1, 1, 0, false));

        holders = new ModelRenderer(this);
        holders.setRotationPoint(0.2514F, -0.4478F, 1.011F);
        belt.addChild(holders);

        holder = new ModelRenderer(this);
        holders.addChild(holder);
        setRotationAngle(holder, 0.3142F, 0, 0);
        holder.cubeList.add(new ModelBox(holder, 25, 52, 4.1443F, -1.3078F, -1.0707F, 1, 4, 2, 0, false));

        holder1 = new ModelRenderer(this);
        holder1.setRotationPoint(0, 0.1F, -0.2F);
        holders.addChild(holder1);
        setRotationAngle(holder1, 2.9395F, -0.1113F, 3.0577F);
        holder1.cubeList.add(new ModelBox(holder1, 42, 52, 4.2744F, -2.0737F, -0.3257F, 1, 4, 1, 0, false));
        holder1.cubeList.add(new ModelBox(holder1, 31, 52, 4.2744F, -2.0737F, 1.1743F, 1, 4, 1, 0, false));

        holder2 = new ModelRenderer(this);
        holder2.setRotationPoint(-0.3F, 0.3F, -0.2F);
        holders.addChild(holder2);
        setRotationAngle(holder2, 0.5133F, -1.0807F, -0.3924F);
        holder2.cubeList.add(new ModelBox(holder2, 19, 52, -4.9757F, -1.2918F, 1.1699F, 1, 4, 2, 0, false));

        holder3 = new ModelRenderer(this);
        holder3.setRotationPoint(0, 0.3F, -0.3F);
        holders.addChild(holder3);
        setRotationAngle(holder3, 2.131F, 1.2944F, 2.0795F);
        holder3.cubeList.add(new ModelBox(holder3, 51, 51, 3.4445F, -1.6396F, -2.2104F, 1, 4, 2, 0, false));

        holder4 = new ModelRenderer(this);
        holder4.setRotationPoint(0, 0.3F, -0.7F);
        holders.addChild(holder4);
        setRotationAngle(holder4, 1.6952F, 1.4236F, 1.6291F);
        holder4.cubeList.add(new ModelBox(holder4, 46, 52, 2.764F, -0.7889F, 0.5263F, 1, 4, 1, 0, false));
        holder4.cubeList.add(new ModelBox(holder4, 35, 53, 2.764F, -0.7889F, 1.7263F, 1, 4, 1, 0, false));

        holder5 = new ModelRenderer(this);
        holder5.setRotationPoint(0, 0.3F, -0.1F);
        holders.addChild(holder5);
        setRotationAngle(holder5, 0.3615F, 0.8585F, 0.2096F);
        holder5.cubeList.add(new ModelBox(holder5, 51, 51, 4.2445F, -1.0396F, 0.1896F, 1, 4, 2, 0, false));

        magazines = new ModelRenderer(this);
        magazines.setRotationPoint(-0.3557F, 13.4443F, -1.0776F);
        holders.addChild(magazines);

        magazine = new ModelRenderer(this);
        magazine.setRotationPoint(0.3557F, -13.3443F, 0.8776F);
        magazines.addChild(magazine);
        setRotationAngle(magazine, 2.9395F, -0.1113F, 3.0577F);
        magazine.cubeList.add(new ModelBox(magazine, 20, 16, 4.2744F, -3.1737F, -0.3257F, 1, 3, 1, -0.1F, false));
        magazine.cubeList.add(new ModelBox(magazine, 0, 16, 4.2744F, -3.1737F, 1.1743F, 1, 3, 1, -0.1F, false));

        magazine1 = new ModelRenderer(this);
        magazine1.setRotationPoint(0.0557F, -13.3443F, 0.8776F);
        magazines.addChild(magazine1);
        setRotationAngle(magazine1, 0.5133F, -1.0807F, -0.3924F);
        magazine1.cubeList.add(new ModelBox(magazine1, 40, 21, -4.9757F, -2.4918F, 1.1424F, 1, 3, 2, -0.1F, false));

        magazine2 = new ModelRenderer(this);
        magazine2.setRotationPoint(0.3557F, -13.6443F, 1.0776F);
        magazines.addChild(magazine2);
        setRotationAngle(magazine2, 0.3142F, 0, 0);
        magazine2.cubeList.add(new ModelBox(magazine2, 40, 26, 4.1443F, -2.7078F, -1.0707F, 1, 3, 2, -0.1F, false));

        magazine3 = new ModelRenderer(this);
        magazine3.setRotationPoint(0.3557F, -13.1443F, 0.3776F);
        magazines.addChild(magazine3);
        setRotationAngle(magazine3, 1.6952F, 1.4236F, 1.6291F);
        magazine3.cubeList.add(new ModelBox(magazine3, 30, 0, 2.764F, -1.7889F, 0.5263F, 1, 3, 1, -0.1F, false));
        magazine3.cubeList.add(new ModelBox(magazine3, 0, 32, 2.764F, -1.7889F, 1.7263F, 1, 3, 1, -0.1F, false));

        magazine4 = new ModelRenderer(this);
        magazine4.setRotationPoint(0.3557F, -13.3443F, 0.7776F);
        magazines.addChild(magazine4);
        setRotationAngle(magazine4, 2.1045F, 1.2989F, 2.052F);
        magazine4.cubeList.add(new ModelBox(magazine4, 24, 0, 3.4445F, -2.7396F, -2.2776F, 1, 3, 2, -0.1F, false));

        magazine5 = new ModelRenderer(this);
        magazine5.setRotationPoint(0.3557F, -13.3443F, 0.9776F);
        magazines.addChild(magazine5);
        setRotationAngle(magazine5, 0.3615F, 0.8585F, 0.2096F);
        magazine5.cubeList.add(new ModelBox(magazine5, 24, 0, 4.2445F, -2.5396F, 0.1896F, 1, 3, 2, -0.1F, false));

        satchel = new ModelRenderer(this);
        satchel.setRotationPoint(0.2514F, -0.1478F, 0.311F);
        belt.addChild(satchel);

        button = new ModelRenderer(this);
        satchel.addChild(button);
        setRotationAngle(button, -0.2182F, 0.48F, 0);
        button.cubeList.add(new ModelBox(button, 52, 16, 1.0589F, -1.8853F, 3.5957F, 1, 1, 1, -0.2F, false));
        button.cubeList.add(new ModelBox(button, 0, 0, -0.0411F, -2.1853F, 2.9957F, 3, 3, 1, 0, false));
        button.cubeList.add(new ModelBox(button, 0, 4, -0.0411F, -2.5853F, 3.0957F, 3, 1, 1, 0.1F, false));

        hideBiped(this, body);
    }
}
