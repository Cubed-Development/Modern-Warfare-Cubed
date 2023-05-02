package com.paneedah.mwc.models;

import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.VehicleModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class SampleVehicleControlArm extends ModelBase implements VehicleModel
{
    public ModelRenderer Wheel1;
    public ModelRenderer Wheel2;
    public ModelRenderer Wheel3;
    public ModelRenderer Wheel4;
    public ModelRenderer WheelAxle1;
    public ModelRenderer WheelAxle2;
    public ModelRenderer WheelAxle3;
    public ModelRenderer WheelAxle4;
    public ModelRenderer WheelSwingArm1;
    public ModelRenderer WheelSwingArm2;
    public ModelRenderer WheelSwingArm3;
    public ModelRenderer WheelSwingArm4;

    public SampleVehicleControlArm()
    {
        textureWidth = 200;
        textureHeight = 200;

        Wheel1 = new ModelRenderer(this, 0, 150);
        
//        Wheel1.flip = true;
        Wheel1.setRotationPoint(9.5F, 2F, -18F);
//        Wheel1.addCylinder(0F, 0F, 0F, 9, 8, 40);
        Wheel1.rotateAngleX = 0F;
        Wheel1.rotateAngleY = 0F;
        Wheel1.rotateAngleZ = -1.570796F;
        Wheel2 = new ModelRenderer(this, 37, 150);
//        Wheel2.flip = true;
        Wheel2.setRotationPoint(-9.5F, 2F, -18F);
//        Wheel2.addCylinder(0F, -8F, 0F, 9, 8, 40);
        Wheel2.rotateAngleX = 0F;
        Wheel2.rotateAngleY = 0F;
        Wheel2.rotateAngleZ = -1.570796F;
        Wheel3 = new ModelRenderer(this, 0, 150);
//        Wheel3.flip = true;
        Wheel3.setRotationPoint(9.5F, 2F, 19F);
//        Wheel3.addCylinder(0F, 0F, 0F, 9, 8, 40);
        Wheel3.rotateAngleX = 0F;
        Wheel3.rotateAngleY = 0F;
        Wheel3.rotateAngleZ = -1.570796F;
        Wheel4 = new ModelRenderer(this, 37, 150);
//        Wheel4.flip = true;
        Wheel4.setRotationPoint(-9.5F, 2F, 19F);
//        Wheel4.addCylinder(0F, -8F, 0F, 9, 8, 40);
        Wheel4.rotateAngleX = 0F;
        Wheel4.rotateAngleY = 0F;
        Wheel4.rotateAngleZ = -1.570796F;
        WheelAxle1 = new ModelRenderer(this, 74, 150);
//        WheelAxle1.flip = true;
        WheelAxle1.setRotationPoint(6.5F, 1F, -17F);
//        WheelAxle1.addCylinder(-1.5F, 0F, -1.5F, 3, 3, 25);
        WheelAxle1.rotateAngleX = 0F;
        WheelAxle1.rotateAngleY = 0F;
        WheelAxle1.rotateAngleZ = -1.570796F;
        WheelAxle2 = new ModelRenderer(this, 87, 150);
//        WheelAxle2.flip = true;
        WheelAxle2.setRotationPoint(-6.5F, 1F, -17F);
//        WheelAxle2.addCylinder(-1.5F, -3F, -1.5F, 3, 3, 25);
        WheelAxle2.rotateAngleX = 0F;
        WheelAxle2.rotateAngleY = 0F;
        WheelAxle2.rotateAngleZ = -1.570796F;
        WheelAxle3 = new ModelRenderer(this, 74, 160);
//        WheelAxle3.flip = true;
        WheelAxle3.setRotationPoint(6.5F, 1F, 20F);
//        WheelAxle3.addCylinder(-1.5F, 0F, -1.5F, 3, 3, 25);
        WheelAxle3.rotateAngleX = 0F;
        WheelAxle3.rotateAngleY = 0F;
        WheelAxle3.rotateAngleZ = -1.570796F;
        WheelAxle4 = new ModelRenderer(this, 87, 160);
//        WheelAxle4.flip = true;
        WheelAxle4.setRotationPoint(-6.5F, 1F, 20F);
//        WheelAxle4.addCylinder(-1.5F, -3F, -1.5F, 3, 3, 25);
        WheelAxle4.rotateAngleX = 0F;
        WheelAxle4.rotateAngleY = 0F;
        WheelAxle4.rotateAngleZ = -1.570796F;
        WheelSwingArm1 = new ModelRenderer(this, 130, 131);
        WheelSwingArm1.addBox(-1F, -1F, -16F, 2, 3, 16, 0F);
        WheelSwingArm1.setRotationPoint(8F, -7F, -6F);
        WheelSwingArm1.rotateAngleX = 0.5934119F;
        WheelSwingArm1.rotateAngleY = 0F;
        WheelSwingArm1.rotateAngleZ = 0F;
        WheelSwingArm1.mirror = false;
        WheelSwingArm2 = new ModelRenderer(this, 130, 131);
        WheelSwingArm2.addBox(-1F, -1F, -16F, 2, 3, 16, 0F);
        WheelSwingArm2.setRotationPoint(-8F, -7F, -6F);
        WheelSwingArm2.rotateAngleX = 0.5934119F;
        WheelSwingArm2.rotateAngleY = 0F;
        WheelSwingArm2.rotateAngleZ = 0F;
        WheelSwingArm2.mirror = false;
        WheelSwingArm3 = new ModelRenderer(this, 168, 134);
        WheelSwingArm3.addBox(-1F, -1F, 0F, 2, 3, 13, 0F);
        WheelSwingArm3.setRotationPoint(8F, -7F, 10F);
        WheelSwingArm3.rotateAngleX = -0.7679449F;
        WheelSwingArm3.rotateAngleY = 0F;
        WheelSwingArm3.rotateAngleZ = 0F;
        WheelSwingArm3.mirror = false;
        WheelSwingArm4 = new ModelRenderer(this, 168, 134);
        WheelSwingArm4.addBox(-1F, -1F, 0F, 2, 3, 13, 0F);
        WheelSwingArm4.setRotationPoint(-8F, -7F, 10F);
        WheelSwingArm4.rotateAngleX = -0.7679449F;
        WheelSwingArm4.rotateAngleY = 0F;
        WheelSwingArm4.rotateAngleZ = 0F;
        WheelSwingArm4.mirror = false;
    }

    public void render(EntityVehicle entity, float f5)
    {
//        Wheel1.rotateAngleX = Wheel1.rotateAngleY = Wheel1.rotateAngleZ = 0f;
//        //Wheel1.rotateAngleY = entity.getRotateWheelSpeed();
//        //System.out.println("Rotate angle y: " + Wheel1.rotateAngleY);
//        Wheel2.rotateAngleY = entity.getRotateWheelSpeed();
//        Wheel3.rotateAngleY = entity.getRotateWheelSpeed();
//        Wheel4.rotateAngleY = entity.getRotateWheelSpeed();
//        //Wheel1.rotateAngleX = (float)Math.cos(entity.getWheelTurnAngle());
//        //Wheel1.rotateAngleZ = (float)-Math.sin(entity.getWheelTurnAngle()) - 1.570796F;
//        //Wheel2.rotateAngleX = entity.getWheelTurnAngle();
//        Wheel1.rotateAngleX = 0F;
//        Wheel1.rotateAngleZ = -1.570796F;
//        //Wheel2.rotateAngleX = (float)Math.cos(entity.getWheelTurnAngle()-180F) * (float)Math.sin(Math.toRadians(entity.getWheelSpeed()-180F));
//        //Wheel2.rotateAngleZ = (float)Math.sin(entity.getWheelTurnAngle()-180F) * (float)Math.cos(Math.toRadians(entity.getWheelSpeed()-180F)) - 1.570796F;
//        Wheel2.rotateAngleX = 0F;
//        Wheel2.rotateAngleZ = -1.570796F;
////        WheelAxle1.rotateAngleX = entity.getWheelTurnAngle();
////        WheelAxle2.rotateAngleX = entity.getWheelTurnAngle();

        renderModel(f5);
    }

    @Override
    public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        super.render(entity, par2, par3, par4, par5, par6, par7);
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, entity);
        this.renderModel(par7);
    }

    private void renderModel(float f5)
    {
//        Wheel1.render(f5);
//        Wheel2.render(f5);
//        Wheel3.render(f5);
//        Wheel4.render(f5);
        WheelAxle1.render(f5);
//        WheelAxle2.render(f5);
//        WheelAxle3.render(f5);
//        WheelAxle4.render(f5);
        //WheelSwingArm1.render(f5);
//        WheelSwingArm2.render(f5);
//        WheelSwingArm3.render(f5);
//        WheelSwingArm4.render(f5);
    }
}
