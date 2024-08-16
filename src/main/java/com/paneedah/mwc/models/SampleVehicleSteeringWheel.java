package com.paneedah.mwc.models;

import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.VehicleModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SampleVehicleSteeringWheel extends ModelBase implements VehicleModel {

    public ModelRenderer SteeringWheel1;
    public ModelRenderer SteeringWheel2;
    public ModelRenderer SteeringWheel3;

    public SampleVehicleSteeringWheel() {
        textureWidth = 200;
        textureHeight = 200;

        SteeringWheel1 = new ModelRenderer(this, 28, 121);
        SteeringWheel1.addBox(-2F, -1.2F, 0F, 4, 2, 3, 0F);
//        SteeringWheel1.setRotationPoint(0F, -15.3F, -13F);
//        SteeringWheel1.rotateAngleX = -0.733038286F;
        SteeringWheel1.mirror = false;
        SteeringWheel2 = new ModelRenderer(this, 28, 119);
        SteeringWheel2.addBox(1F, -1F, 0.6F, 11, 1, 1, 0F);
//        SteeringWheel2.setRotationPoint(0F, -15.3F, -13F);
//        SteeringWheel2.rotateAngleX = -0.733038286F;
//        SteeringWheel2.rotateAngleZ = 0.087266463F;
        SteeringWheel2.mirror = false;
        SteeringWheel3 = new ModelRenderer(this, 28, 117);
        SteeringWheel3.addBox(-12F, -1F, 0.6F, 11, 1, 1, 0F);
//        SteeringWheel3.setRotationPoint(0F, -15.3F, -13F);
//        SteeringWheel3.rotateAngleX = -0.733038286F;
//        SteeringWheel3.rotateAngleZ = -0.087266463F;
        SteeringWheel3.mirror = false;
    }

    public void render(EntityVehicle entity, float f5) {
//        SteeringWheel1.rotateAngleY = entity.getSteeringTurnAngle();
//        SteeringWheel2.rotateAngleY = entity.getSteeringTurnAngle() + -0.174532925F;
//        SteeringWheel3.rotateAngleY = entity.getSteeringTurnAngle() + 0.174532925F;

        SteeringWheel1.setRotationPoint(0f, 0f, 0f);
        SteeringWheel2.setRotationPoint(0f, 0f, 0f);
        SteeringWheel3.setRotationPoint(0f, 0f, 0f);
        
//        SteeringWheel1.setRotationPoint(0F, -15.3F, -13F);
//        SteeringWheel2.setRotationPoint(0F, -15.3F, -13F);
//        SteeringWheel3.setRotationPoint(0F, -15.3F, -13F);
        
        SteeringWheel1.rotateAngleX = 0f; //-0.733038286F;
        SteeringWheel1.rotateAngleZ = 0f; //-0.733038286F;
        SteeringWheel2.rotateAngleX = 0f; //-0.733038286F;
        SteeringWheel2.rotateAngleZ = 0f; //0.087266463F;
        SteeringWheel3.rotateAngleX = 0f; //-0.733038286F;
        SteeringWheel3.rotateAngleZ = 0f; //-0.087266463F;
        
        renderModel(f5);
    }

    @Override
    public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
        super.render(entity, par2, par3, par4, par5, par6, par7);
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, entity);
        this.renderModel(par7);
    }

    private void renderModel(float f5) {
        SteeringWheel1.render(f5);
        SteeringWheel2.render(f5);
        SteeringWheel3.render(f5);
    }
}
