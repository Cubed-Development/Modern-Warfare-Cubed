package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M134 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer Maintenance4_r1;
	private final ModelRenderer Maintenance3_r1;
	private final ModelRenderer Maintenance2_r1;
	private final ModelRenderer MaintenanceHtch5_r1;
	private final ModelRenderer MaintenanceHtch4_r1;
	private final ModelRenderer MaintenanceHtch1_r1;
	private final ModelRenderer Clutch2_r1;
	private final ModelRenderer CasingejectPort5_r1;
	private final ModelRenderer MagFastener10_r1;
	private final ModelRenderer MagFastener9_r1;
	private final ModelRenderer MagFastener6_r1;
	private final ModelRenderer Main65_r1;
	private final ModelRenderer Main56_r1;
	private final ModelRenderer Main55_r1;
	private final ModelRenderer Main54_r1;
	private final ModelRenderer Main53_r1;
	private final ModelRenderer Main47_r1;
	private final ModelRenderer Main45_r1;
	private final ModelRenderer Main44_r1;
	private final ModelRenderer Main43_r1;
	private final ModelRenderer Main42_r1;
	private final ModelRenderer Main41_r1;
	private final ModelRenderer Main40_r1;
	private final ModelRenderer Main39_r1;
	private final ModelRenderer Main38_r1;
	private final ModelRenderer Main37_r1;
	private final ModelRenderer Main36_r1;
	private final ModelRenderer Main31_r1;
	private final ModelRenderer Main26_r1;
	private final ModelRenderer Main25_r1;
	private final ModelRenderer Main24_r1;
	private final ModelRenderer Main20_r1;
	private final ModelRenderer Main18_r1;
	private final ModelRenderer Main17_r1;
	private final ModelRenderer Main8_r1;
	private final ModelRenderer Main7_r1;
	private final ModelRenderer Main6_r1;
	private final ModelRenderer Main48_r1;
	private final ModelRenderer rail;
	private final ModelRenderer WiresMotorBattery;
	private final ModelRenderer GripCarcass12_r1;
	private final ModelRenderer Delinker3_r1;
	private final ModelRenderer Delinker2_r1;
	private final ModelRenderer Delinker19_r1;
	private final ModelRenderer Delinker18_r1;
	private final ModelRenderer Delinker17_r1;
	private final ModelRenderer Delinker16_r1;
	private final ModelRenderer Delinker11_r1;
	private final ModelRenderer Delinker10_r1;
	private final ModelRenderer Delinker7_r1;
	private final ModelRenderer Delinker6_r1;
	private final ModelRenderer Delinker5_r1;
	private final ModelRenderer Delinker4_r1;
	private final ModelRenderer Delinker33_r1;
	private final ModelRenderer ElectricWires14_r1;
	private final ModelRenderer ElectricWires13_r1;
	private final ModelRenderer ElectricWires11_r1;
	private final ModelRenderer ElectricWires10_r1;
	private final ModelRenderer ElectricWires9_r1;
	private final ModelRenderer ElectricWires6_r1;
	private final ModelRenderer ElectricWires5_r1;
	private final ModelRenderer ElectricWires4_r1;
	private final ModelRenderer ElectricWires2_r1;
	private final ModelRenderer ElectricWires1_r1;
	private final ModelRenderer ElectricWires15_r1;
	private final ModelRenderer GripNuclearBattery4_r1;
	private final ModelRenderer RotorMotor1_r1;
	private final ModelRenderer RotorMotor25_r1;
	private final ModelRenderer RotorMotor23_r1;
	private final ModelRenderer RotorMotor22_r1;
	private final ModelRenderer RotorMotor21_r1;
	private final ModelRenderer RotorMotor17_r1;
	private final ModelRenderer RotorMotor9_r1;
	private final ModelRenderer RotorMotor8_r1;
	private final ModelRenderer RotorMotor7_r1;
	private final ModelRenderer RotorMotor6_r1;
	private final ModelRenderer RotorMotor5_r1;
	private final ModelRenderer RotorMotor4_r1;
	private final ModelRenderer RotorMotor3_r1;
	private final ModelRenderer grip;
	private final ModelRenderer MagFastener3_r1;
	private final ModelRenderer MagFastener3_r2;
	private final ModelRenderer MagFastener3_r3;
	private final ModelRenderer MagFastener3_r4;
	private final ModelRenderer MagFastener3_r5;
	private final ModelRenderer MagFastener3_r6;
	private final ModelRenderer GripCarcass8_r1;
	private final ModelRenderer GripCarcass5_r1;
	private final ModelRenderer GripCarcass3_r1;
	private final ModelRenderer GripPowerBoxSwitch_r1;
	private final ModelRenderer GripRecoilNegator7_r1;
	private final ModelRenderer GripRecoilNegator7_r2;
	private final ModelRenderer GripRecoilNegator6_r1;
	private final ModelRenderer GripRecoilNegator5_r1;
	private final ModelRenderer GripRecoilNegator9_r1;
	private final ModelRenderer SECONDGRIP2_r1;
	private final ModelRenderer SECONDGRIP1_r1;
	private final ModelRenderer GRIPMAIN11TRIGGER_r1;
	private final ModelRenderer GRIPMAIN10_r1;
	private final ModelRenderer GRIPMAIN5_r1;
	private final ModelRenderer GRIPMAIN3_r1;

	public M134() {
		textureWidth = 600;
		textureHeight = 600;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(6.935F, 19.8863F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 130, 65, -10.935F, -15.8863F, -6.0F, 1, 3, 21, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 129, -7.935F, -10.8863F, 1.0F, 3, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 95, 0, -2.935F, -15.8863F, 0.0F, 1, 3, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 95, 84, -2.935F, -15.8863F, -6.0F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 76, -5.935F, -18.8863F, -1.0F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 105, 65, -7.935F, -18.8863F, 9.0F, 3, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 123, -7.935F, -10.8863F, -6.0F, 3, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 65, -7.935F, -10.8863F, -5.0F, 2, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 33, -11.935F, -16.8863F, -9.0F, 2, 5, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 105, 78, -8.935F, -10.8863F, -9.0F, 5, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 128, -2.935F, -16.8863F, -9.0F, 2, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 130, 32, -2.935F, -14.8863F, -9.0F, 2, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 122, 43, -2.935F, -12.8863F, -7.0F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 106, 18, -7.935F, -18.8863F, -6.0F, 3, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 106, -8.935F, -19.8863F, -9.0F, 5, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 0, -9.435F, -17.8863F, 14.0F, 6, 7, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 105, 84, -9.935F, -16.8863F, 14.0F, 7, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 113, -9.435F, -15.8863F, 14.5F, 6, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 77, -7.935F, -17.3863F, 14.5F, 3, 6, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 41, -6.935F, -16.8863F, 15.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 77, -5.435F, -13.3863F, 15.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 77, -8.435F, -13.3863F, 15.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 103, 10, -7.435F, -15.5863F, 14.7F, 2, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 64, -11.435F, -15.8863F, -6.5F, 1, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 77, -11.935F, -14.8863F, -5.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 76, -11.935F, -14.8863F, -4.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 64, -6.935F, -10.3863F, -8.0F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 123, -11.935F, -17.3863F, 0.5F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 123, -11.935F, -17.3863F, 8.5F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 117, -8.935F, -10.3863F, -1.0F, 1, 8, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 46, -8.935F, -10.3863F, 11.0F, 1, 8, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 64, -18.935F, -1.8863F, 0.0F, 3, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 95, 40, -1.935F, -15.8863F, -7.5F, 2, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 90, -2.935F, -15.3863F, -7.5F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 7, -2.935F, -15.3863F, -0.5F, 4, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 77, -2.935F, -13.3863F, -7.5F, 3, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 6, 64, -12.135F, -15.8863F, 14.0F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 87, 75, -12.435F, -16.3863F, 13.5F, 2, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 64, -7.935F, -19.2863F, -1.0F, 2, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 121, 84, -8.435F, -19.8863F, -2.5F, 2, 1, 1, 0.0F, false));

		Maintenance4_r1 = new ModelRenderer(this);
		Maintenance4_r1.setRotationPoint(-13.6635F, 3.5897F, 0.0F);
		gun.addChild(Maintenance4_r1);
		setRotationAngle(Maintenance4_r1, 0.0F, 0.0F, 0.2793F);
		Maintenance4_r1.cubeList.add(new ModelBox(Maintenance4_r1, 56, 117, -1.5F, -24.2F, 9.5F, 2, 1, 1, 0.0F, false));

		Maintenance3_r1 = new ModelRenderer(this);
		Maintenance3_r1.setRotationPoint(5.7721F, -1.7846F, 0.0F);
		gun.addChild(Maintenance3_r1);
		setRotationAngle(Maintenance3_r1, 0.0F, 0.0F, -0.6109F);
		Maintenance3_r1.cubeList.add(new ModelBox(Maintenance3_r1, 56, 108, -3.0F, -23.1F, 9.5F, 2, 2, 1, 0.0F, false));

		Maintenance2_r1 = new ModelRenderer(this);
		Maintenance2_r1.setRotationPoint(3.5587F, 0.0014F, 0.0F);
		gun.addChild(Maintenance2_r1);
		setRotationAngle(Maintenance2_r1, 0.0F, 0.0F, -0.4887F);
		Maintenance2_r1.cubeList.add(new ModelBox(Maintenance2_r1, 111, 120, -3.0F, -23.1F, -2.5F, 2, 1, 1, 0.0F, false));

		MaintenanceHtch5_r1 = new ModelRenderer(this);
		MaintenanceHtch5_r1.setRotationPoint(-0.2891F, 2.5825F, 0.0F);
		gun.addChild(MaintenanceHtch5_r1);
		setRotationAngle(MaintenanceHtch5_r1, 0.0F, 0.0F, -0.2967F);
		MaintenanceHtch5_r1.cubeList.add(new ModelBox(MaintenanceHtch5_r1, 122, 28, -2.3F, -24.0F, 7.0F, 2, 1, 1, 0.0F, false));
		MaintenanceHtch5_r1.cubeList.add(new ModelBox(MaintenanceHtch5_r1, 65, 65, -1.8F, -23.1F, -1.0F, 1, 1, 10, 0.0F, false));
		MaintenanceHtch5_r1.cubeList.add(new ModelBox(MaintenanceHtch5_r1, 79, 29, -1.8F, -23.8F, 6.0F, 1, 1, 6, 0.0F, false));
		MaintenanceHtch5_r1.cubeList.add(new ModelBox(MaintenanceHtch5_r1, 48, 95, -1.8F, -22.7F, 9.0F, 1, 1, 6, 0.0F, false));
		MaintenanceHtch5_r1.cubeList.add(new ModelBox(MaintenanceHtch5_r1, 112, 97, -1.8F, -22.7F, -6.0F, 1, 1, 5, 0.0F, false));

		MaintenanceHtch4_r1 = new ModelRenderer(this);
		MaintenanceHtch4_r1.setRotationPoint(-0.1429F, 2.5606F, 0.0F);
		gun.addChild(MaintenanceHtch4_r1);
		setRotationAngle(MaintenanceHtch4_r1, 0.0F, 0.0F, -0.2967F);
		MaintenanceHtch4_r1.cubeList.add(new ModelBox(MaintenanceHtch4_r1, 113, 90, -1.8F, -23.5F, -2.0F, 1, 1, 2, 0.0F, false));

		MaintenanceHtch1_r1 = new ModelRenderer(this);
		MaintenanceHtch1_r1.setRotationPoint(3.5997F, -0.3703F, 0.0F);
		gun.addChild(MaintenanceHtch1_r1);
		setRotationAngle(MaintenanceHtch1_r1, 0.0F, 0.0F, -0.5236F);
		MaintenanceHtch1_r1.cubeList.add(new ModelBox(MaintenanceHtch1_r1, 65, 0, -3.1F, -22.3F, -1.0F, 2, 1, 10, 0.0F, false));
		MaintenanceHtch1_r1.cubeList.add(new ModelBox(MaintenanceHtch1_r1, 77, 76, -3.1F, -21.9F, 9.0F, 2, 1, 6, 0.0F, false));
		MaintenanceHtch1_r1.cubeList.add(new ModelBox(MaintenanceHtch1_r1, 108, 105, -3.1F, -21.9F, -6.0F, 2, 1, 5, 0.0F, false));

		Clutch2_r1 = new ModelRenderer(this);
		Clutch2_r1.setRotationPoint(-3.8802F, 2.9289F, 0.0F);
		gun.addChild(Clutch2_r1);
		setRotationAngle(Clutch2_r1, 0.0F, 0.0F, -0.1571F);
		Clutch2_r1.cubeList.add(new ModelBox(Clutch2_r1, 120, 71, -5.5F, -19.5F, 10.5F, 1, 1, 3, 0.0F, false));
		Clutch2_r1.cubeList.add(new ModelBox(Clutch2_r1, 118, 58, -6.0F, -20.0F, 11.0F, 2, 2, 3, 0.0F, false));

		CasingejectPort5_r1 = new ModelRenderer(this);
		CasingejectPort5_r1.setRotationPoint(-11.5655F, 1.8262F, 0.0F);
		gun.addChild(CasingejectPort5_r1);
		setRotationAngle(CasingejectPort5_r1, 0.0F, 0.0F, 0.2443F);
		CasingejectPort5_r1.cubeList.add(new ModelBox(CasingejectPort5_r1, 95, 75, 7.0F, -20.0F, -7.5F, 1, 1, 8, 0.0F, false));

		MagFastener10_r1 = new ModelRenderer(this);
		MagFastener10_r1.setRotationPoint(0.5525F, -0.1389F, 0.0F);
		gun.addChild(MagFastener10_r1);
		setRotationAngle(MagFastener10_r1, 0.0F, 0.0F, -0.6109F);
		MagFastener10_r1.cubeList.add(new ModelBox(MagFastener10_r1, 87, 69, -3.0F, -14.0F, -0.5F, 2, 1, 1, 0.0F, false));
		MagFastener10_r1.cubeList.add(new ModelBox(MagFastener10_r1, 87, 8, -3.0F, -14.0F, 11.5F, 2, 1, 1, 0.0F, false));

		MagFastener9_r1 = new ModelRenderer(this);
		MagFastener9_r1.setRotationPoint(4.7795F, -2.7328F, 0.0F);
		gun.addChild(MagFastener9_r1);
		setRotationAngle(MagFastener9_r1, 0.0F, 0.0F, -0.6109F);
		MagFastener9_r1.cubeList.add(new ModelBox(MagFastener9_r1, 51, 67, -5.0F, -21.4F, 9.0F, 1, 1, 1, 0.0F, false));
		MagFastener9_r1.cubeList.add(new ModelBox(MagFastener9_r1, 65, 67, -5.0F, -21.4F, 2.0F, 1, 1, 1, 0.0F, false));

		MagFastener6_r1 = new ModelRenderer(this);
		MagFastener6_r1.setRotationPoint(-5.8733F, 2.2154F, 0.0F);
		gun.addChild(MagFastener6_r1);
		setRotationAngle(MagFastener6_r1, 0.0F, 0.0F, -0.2094F);
		MagFastener6_r1.cubeList.add(new ModelBox(MagFastener6_r1, 100, 58, -9.5F, -6.0F, 11.0F, 8, 1, 2, 0.0F, false));
		MagFastener6_r1.cubeList.add(new ModelBox(MagFastener6_r1, 105, 75, -9.5F, -6.0F, -1.0F, 8, 1, 2, 0.0F, false));

		Main65_r1 = new ModelRenderer(this);
		Main65_r1.setRotationPoint(3.5971F, -0.1617F, 0.0F);
		gun.addChild(Main65_r1);
		setRotationAngle(Main65_r1, 0.0F, 0.0F, -0.5061F);
		Main65_r1.cubeList.add(new ModelBox(Main65_r1, 16, 75, -3.0F, -22.5F, 13.0F, 1, 1, 1, 0.0F, false));

		Main56_r1 = new ModelRenderer(this);
		Main56_r1.setRotationPoint(4.4585F, -2.8449F, 0.0F);
		gun.addChild(Main56_r1);
		setRotationAngle(Main56_r1, 0.0F, 0.0F, -0.8029F);
		Main56_r1.cubeList.add(new ModelBox(Main56_r1, 56, 105, -2.5F, -16.9F, 14.5F, 2, 2, 1, 0.0F, false));

		Main55_r1 = new ModelRenderer(this);
		Main55_r1.setRotationPoint(7.635F, -1.5615F, 0.0F);
		gun.addChild(Main55_r1);
		setRotationAngle(Main55_r1, 0.0F, 0.0F, -0.8029F);
		Main55_r1.cubeList.add(new ModelBox(Main55_r1, 105, 65, 0.6F, -20.0F, 14.5F, 2, 2, 1, 0.0F, false));

		Main54_r1 = new ModelRenderer(this);
		Main54_r1.setRotationPoint(5.5075F, -0.5735F, 0.0F);
		gun.addChild(Main54_r1);
		setRotationAngle(Main54_r1, 0.0F, 0.0F, -0.8029F);
		Main54_r1.cubeList.add(new ModelBox(Main54_r1, 95, 10, 0.7F, -17.0F, 14.5F, 2, 2, 1, 0.0F, false));

		Main53_r1 = new ModelRenderer(this);
		Main53_r1.setRotationPoint(6.6885F, -3.7914F, 0.0F);
		gun.addChild(Main53_r1);
		setRotationAngle(Main53_r1, 0.0F, 0.0F, -0.8029F);
		Main53_r1.cubeList.add(new ModelBox(Main53_r1, 105, 68, -2.5F, -20.0F, 14.5F, 2, 2, 1, 0.0F, false));

		Main47_r1 = new ModelRenderer(this);
		Main47_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(Main47_r1);
		setRotationAngle(Main47_r1, 0.0F, 0.0F, -0.4712F);
		Main47_r1.cubeList.add(new ModelBox(Main47_r1, 10, 128, -5.1F, -16.5F, -9.0F, 2, 1, 3, 0.0F, false));

		Main45_r1 = new ModelRenderer(this);
		Main45_r1.setRotationPoint(-15.1279F, -0.5434F, 0.0F);
		gun.addChild(Main45_r1);
		setRotationAngle(Main45_r1, 0.0F, 0.0F, 0.5411F);
		Main45_r1.cubeList.add(new ModelBox(Main45_r1, 31, 128, 4.3F, -17.1F, -9.0F, 2, 1, 3, 0.0F, false));

		Main44_r1 = new ModelRenderer(this);
		Main44_r1.setRotationPoint(-19.3707F, 3.096F, 0.0F);
		gun.addChild(Main44_r1);
		setRotationAngle(Main44_r1, 0.0F, 0.0F, 0.576F);
		Main44_r1.cubeList.add(new ModelBox(Main44_r1, 41, 128, -4.5F, -21.5F, -9.0F, 2, 1, 3, 0.0F, false));

		Main43_r1 = new ModelRenderer(this);
		Main43_r1.setRotationPoint(0.4174F, 3.1433F, 0.0F);
		gun.addChild(Main43_r1);
		setRotationAngle(Main43_r1, 0.0F, 0.0F, -0.5061F);
		Main43_r1.cubeList.add(new ModelBox(Main43_r1, 120, 34, 1.8F, -14.7F, -9.0F, 1, 2, 3, 0.0F, false));

		Main42_r1 = new ModelRenderer(this);
		Main42_r1.setRotationPoint(4.0944F, -0.2386F, 0.0F);
		gun.addChild(Main42_r1);
		setRotationAngle(Main42_r1, 0.0F, 0.0F, -0.5061F);
		Main42_r1.cubeList.add(new ModelBox(Main42_r1, 130, 15, -2.9F, -23.5F, -9.0F, 1, 2, 3, 0.0F, false));

		Main41_r1 = new ModelRenderer(this);
		Main41_r1.setRotationPoint(-18.1943F, -0.3498F, 0.0F);
		gun.addChild(Main41_r1);
		setRotationAngle(Main41_r1, 0.0F, 0.0F, 0.5061F);
		Main41_r1.cubeList.add(new ModelBox(Main41_r1, 130, 22, 3.0F, -24.0F, -9.0F, 1, 2, 3, 0.0F, false));

		Main40_r1 = new ModelRenderer(this);
		Main40_r1.setRotationPoint(-14.5298F, 3.0806F, 0.0F);
		gun.addChild(Main40_r1);
		setRotationAngle(Main40_r1, 0.0F, 0.0F, 0.5061F);
		Main40_r1.cubeList.add(new ModelBox(Main40_r1, 130, 27, -1.8F, -15.2F, -9.0F, 1, 2, 3, 0.0F, false));

		Main39_r1 = new ModelRenderer(this);
		Main39_r1.setRotationPoint(8.1201F, -7.6187F, 0.0F);
		gun.addChild(Main39_r1);
		setRotationAngle(Main39_r1, 0.0F, 0.0F, -0.9076F);
		Main39_r1.cubeList.add(new ModelBox(Main39_r1, 34, 7, -4.5F, -21.3F, -9.0F, 3, 2, 3, 0.0F, false));

		Main38_r1 = new ModelRenderer(this);
		Main38_r1.setRotationPoint(4.3057F, 0.9654F, 0.0F);
		gun.addChild(Main38_r1);
		setRotationAngle(Main38_r1, 0.0F, 0.0F, -0.8203F);
		Main38_r1.cubeList.add(new ModelBox(Main38_r1, 33, 71, 2.0F, -14.5F, -9.0F, 3, 2, 3, 0.0F, false));

		Main37_r1 = new ModelRenderer(this);
		Main37_r1.setRotationPoint(-23.9159F, -8.0703F, 0.0F);
		gun.addChild(Main37_r1);
		setRotationAngle(Main37_r1, 0.0F, 0.0F, 0.9076F);
		Main37_r1.cubeList.add(new ModelBox(Main37_r1, 51, 71, 4.0F, -23.5F, -9.0F, 3, 2, 3, 0.0F, false));

		Main36_r1 = new ModelRenderer(this);
		Main36_r1.setRotationPoint(-21.4842F, -0.056F, 0.0F);
		gun.addChild(Main36_r1);
		setRotationAngle(Main36_r1, 0.0F, 0.0F, 0.9076F);
		Main36_r1.cubeList.add(new ModelBox(Main36_r1, 95, 115, -3.0F, -17.0F, -9.0F, 3, 2, 3, 0.0F, false));

		Main31_r1 = new ModelRenderer(this);
		Main31_r1.setRotationPoint(-2.5131F, 3.9012F, 0.0F);
		gun.addChild(Main31_r1);
		setRotationAngle(Main31_r1, 0.0F, 0.0F, -0.2967F);
		Main31_r1.cubeList.add(new ModelBox(Main31_r1, 78, 43, 1.5F, -14.9F, -6.0F, 1, 1, 1, 0.0F, false));
		Main31_r1.cubeList.add(new ModelBox(Main31_r1, 34, 0, 1.5F, -14.9F, 1.0F, 1, 1, 12, 0.0F, false));
		Main31_r1.cubeList.add(new ModelBox(Main31_r1, 47, 79, 1.5F, -14.9F, 14.0F, 1, 1, 1, 0.0F, false));

		Main26_r1 = new ModelRenderer(this);
		Main26_r1.setRotationPoint(-9.8438F, 4.1225F, 0.0F);
		gun.addChild(Main26_r1);
		setRotationAngle(Main26_r1, 0.0F, 0.0F, 0.192F);
		Main26_r1.cubeList.add(new ModelBox(Main26_r1, 130, 193, -1.5F, -15.1F, -6.0F, 1, 1, 21, 0.0F, false));

		Main25_r1 = new ModelRenderer(this);
		Main25_r1.setRotationPoint(-11.3287F, 3.344F, 0.0F);
		gun.addChild(Main25_r1);
		setRotationAngle(Main25_r1, 0.0F, 0.0F, 0.192F);
		Main25_r1.cubeList.add(new ModelBox(Main25_r1, 195, 0, 1.8F, -23.1F, -6.0F, 1, 1, 21, 0.0F, false));

		Main24_r1 = new ModelRenderer(this);
		Main24_r1.setRotationPoint(2.2638F, 2.4246F, 0.0F);
		gun.addChild(Main24_r1);
		setRotationAngle(Main24_r1, 0.0F, 0.0F, -0.6283F);
		Main24_r1.cubeList.add(new ModelBox(Main24_r1, 9, 123, 2.0F, -15.0F, -6.0F, 2, 1, 1, 0.0F, false));
		Main24_r1.cubeList.add(new ModelBox(Main24_r1, 95, 18, 3.0F, -15.0F, -5.0F, 1, 1, 9, 0.0F, false));
		Main24_r1.cubeList.add(new ModelBox(Main24_r1, 74, 123, 2.0F, -15.0F, 14.0F, 2, 1, 1, 0.0F, false));
		Main24_r1.cubeList.add(new ModelBox(Main24_r1, 0, 13, 2.0F, -15.0F, 1.0F, 2, 1, 12, 0.0F, false));

		Main20_r1 = new ModelRenderer(this);
		Main20_r1.setRotationPoint(-14.1915F, 0.5453F, 0.0F);
		gun.addChild(Main20_r1);
		setRotationAngle(Main20_r1, 0.0F, 0.0F, 0.4538F);
		Main20_r1.cubeList.add(new ModelBox(Main20_r1, 51, 64, 4.1F, -17.5F, 14.0F, 1, 2, 1, 0.0F, false));
		Main20_r1.cubeList.add(new ModelBox(Main20_r1, 95, 65, 4.1F, -17.5F, -6.0F, 1, 2, 8, 0.0F, false));
		Main20_r1.cubeList.add(new ModelBox(Main20_r1, 34, 13, 4.1F, -17.5F, 2.0F, 1, 2, 11, 0.0F, false));

		Main18_r1 = new ModelRenderer(this);
		Main18_r1.setRotationPoint(-16.817F, 2.5275F, 0.0F);
		gun.addChild(Main18_r1);
		setRotationAngle(Main18_r1, 0.0F, 0.0F, 0.6283F);
		Main18_r1.cubeList.add(new ModelBox(Main18_r1, 130, 0, -2.5F, -16.0F, -6.0F, 2, 1, 21, 0.0F, false));

		Main17_r1 = new ModelRenderer(this);
		Main17_r1.setRotationPoint(-19.9766F, -1.7483F, 0.0F);
		gun.addChild(Main17_r1);
		setRotationAngle(Main17_r1, 0.0F, 0.0F, 0.6283F);
		Main17_r1.cubeList.add(new ModelBox(Main17_r1, 130, 22, 2.5F, -23.0F, -6.0F, 2, 1, 21, 0.0F, false));

		Main8_r1 = new ModelRenderer(this);
		Main8_r1.setRotationPoint(0.1125F, 0.6398F, 0.0F);
		gun.addChild(Main8_r1);
		setRotationAngle(Main8_r1, 0.0F, 0.0F, -0.4538F);
		Main8_r1.cubeList.add(new ModelBox(Main8_r1, 130, 89, -4.0F, -17.0F, -6.0F, 1, 2, 21, 0.0F, false));

		Main7_r1 = new ModelRenderer(this);
		Main7_r1.setRotationPoint(2.77F, 3.3507F, 0.0F);
		gun.addChild(Main7_r1);
		setRotationAngle(Main7_r1, 0.0F, 0.0F, -0.4538F);
		Main7_r1.cubeList.add(new ModelBox(Main7_r1, 130, 129, 3.2F, -21.4F, -6.0F, 1, 2, 21, 0.0F, false));

		Main6_r1 = new ModelRenderer(this);
		Main6_r1.setRotationPoint(-16.8052F, 3.2664F, 0.0F);
		gun.addChild(Main6_r1);
		setRotationAngle(Main6_r1, 0.0F, 0.0F, 0.4538F);
		Main6_r1.cubeList.add(new ModelBox(Main6_r1, 0, 152, -3.1F, -21.8F, -6.0F, 1, 2, 21, 0.0F, false));

		Main48_r1 = new ModelRenderer(this);
		Main48_r1.setRotationPoint(2.9222F, 3.5718F, 0.0F);
		gun.addChild(Main48_r1);
		setRotationAngle(Main48_r1, 0.0F, 0.0F, -0.4712F);
		Main48_r1.cubeList.add(new ModelBox(Main48_r1, 117, 123, 3.8F, -20.8F, -9.0F, 2, 1, 3, 0.0F, false));

		rail = new ModelRenderer(this);
		rail.setRotationPoint(-6.935F, 4.1137F, 0.0F);
		gun.addChild(rail);
		rail.cubeList.add(new ModelBox(rail, 77, 72, 0.0F, -14.5F, -10.0F, 7, 2, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 95, 49, 2.0F, -14.2F, -10.5F, 1, 1, 2, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 48, 95, 0.5F, -14.2F, -10.5F, 1, 1, 2, 0.0F, false));

		WiresMotorBattery = new ModelRenderer(this);
		WiresMotorBattery.setRotationPoint(-16.5352F, 11.4302F, 0.0F);
		WiresMotorBattery.cubeList.add(new ModelBox(WiresMotorBattery, 33, 33, 14.2352F, -14.4302F, 0.0F, 1, 1, 14, 0.0F, false));
		WiresMotorBattery.cubeList.add(new ModelBox(WiresMotorBattery, 75, 48, 18.7352F, -14.2302F, 8.0F, 1, 1, 8, 0.0F, false));
		WiresMotorBattery.cubeList.add(new ModelBox(WiresMotorBattery, 33, 64, 20.5352F, 1.5698F, 3.0F, 1, 2, 1, 0.0F, false));
		WiresMotorBattery.cubeList.add(new ModelBox(WiresMotorBattery, 47, 13, 19.3352F, -2.9302F, -5.0F, 2, 3, 6, 0.0F, false));
		WiresMotorBattery.cubeList.add(new ModelBox(WiresMotorBattery, 65, 29, 18.5352F, -2.4302F, 1.5F, 3, 4, 8, 0.0F, false));
		WiresMotorBattery.cubeList.add(new ModelBox(WiresMotorBattery, 65, 11, 16.5352F, -1.9302F, -5.0F, 6, 4, 6, 0.0F, false));
		WiresMotorBattery.cubeList.add(new ModelBox(WiresMotorBattery, 95, 29, 16.5352F, -1.9302F, 1.5F, 1, 3, 8, 0.0F, false));
		WiresMotorBattery.cubeList.add(new ModelBox(WiresMotorBattery, 8, 13, 17.5352F, -1.4302F, 9.0F, 1, 3, 1, 0.0F, false));
		WiresMotorBattery.cubeList.add(new ModelBox(WiresMotorBattery, 0, 13, 17.5352F, -1.4302F, 1.0F, 1, 3, 1, 0.0F, false));
		WiresMotorBattery.cubeList.add(new ModelBox(WiresMotorBattery, 117, 86, 19.5352F, 1.5698F, 3.5F, 1, 2, 4, 0.0F, false));
		WiresMotorBattery.cubeList.add(new ModelBox(WiresMotorBattery, 65, 65, 21.5352F, 0.5698F, 3.5F, 1, 3, 4, 0.0F, false));
		WiresMotorBattery.cubeList.add(new ModelBox(WiresMotorBattery, 40, 64, 20.5352F, 1.5698F, 7.0F, 1, 2, 1, 0.0F, false));

		GripCarcass12_r1 = new ModelRenderer(this);
		GripCarcass12_r1.setRotationPoint(30.7475F, 4.704F, 0.0F);
		WiresMotorBattery.addChild(GripCarcass12_r1);
		setRotationAngle(GripCarcass12_r1, 0.0F, 0.0F, -0.6807F);
		GripCarcass12_r1.cubeList.add(new ModelBox(GripCarcass12_r1, 119, 94, -6.0F, -24.0F, -6.0F, 1, 3, 3, 0.0F, false));

		Delinker3_r1 = new ModelRenderer(this);
		Delinker3_r1.setRotationPoint(17.3912F, 12.8564F, 0.0F);
		WiresMotorBattery.addChild(Delinker3_r1);
		setRotationAngle(Delinker3_r1, 0.0F, 0.0F, -0.0524F);
		Delinker3_r1.cubeList.add(new ModelBox(Delinker3_r1, 65, 94, 5.9F, -16.2F, -8.0F, 1, 1, 28, 0.0F, false));

		Delinker2_r1 = new ModelRenderer(this);
		Delinker2_r1.setRotationPoint(27.5655F, 10.2242F, 0.0F);
		WiresMotorBattery.addChild(Delinker2_r1);
		setRotationAngle(Delinker2_r1, 0.0F, 0.0F, -0.8727F);
		Delinker2_r1.cubeList.add(new ModelBox(Delinker2_r1, 0, 0, 4.0F, -13.0F, -8.0F, 3, 5, 28, 0.0F, false));
		Delinker2_r1.cubeList.add(new ModelBox(Delinker2_r1, 520, 0, 3.0F, -12.0F, -8.0F, 5, 3, 28, 0.0F, false));

		Delinker19_r1 = new ModelRenderer(this);
		Delinker19_r1.setRotationPoint(5.3742F, 4.2384F, 0.0F);
		WiresMotorBattery.addChild(Delinker19_r1);
		setRotationAngle(Delinker19_r1, 0.0F, 0.0F, 0.8203F);
		Delinker19_r1.cubeList.add(new ModelBox(Delinker19_r1, 6, 0, 4.0F, -17.0F, 13.0F, 1, 3, 1, 0.0F, false));

		Delinker18_r1 = new ModelRenderer(this);
		Delinker18_r1.setRotationPoint(20.7473F, 12.54F, 0.0F);
		WiresMotorBattery.addChild(Delinker18_r1);
		setRotationAngle(Delinker18_r1, 0.0F, 0.0F, -0.2793F);
		Delinker18_r1.cubeList.add(new ModelBox(Delinker18_r1, 95, 0, 2.0F, -15.0F, 12.5F, 1, 2, 2, 0.0F, false));

		Delinker17_r1 = new ModelRenderer(this);
		Delinker17_r1.setRotationPoint(30.2208F, 9.9186F, 0.0F);
		WiresMotorBattery.addChild(Delinker17_r1);
		setRotationAngle(Delinker17_r1, 0.0F, 0.0F, -0.8727F);
		Delinker17_r1.cubeList.add(new ModelBox(Delinker17_r1, 24, 123, 1.5F, -16.0F, 12.5F, 4, 2, 2, 0.0F, false));

		Delinker16_r1 = new ModelRenderer(this);
		Delinker16_r1.setRotationPoint(23.2185F, 10.4449F, 0.0F);
		WiresMotorBattery.addChild(Delinker16_r1);
		setRotationAngle(Delinker16_r1, 0.0F, 0.0F, -0.7156F);
		Delinker16_r1.cubeList.add(new ModelBox(Delinker16_r1, 0, 75, -0.5F, -10.0F, 1.5F, 4, 1, 8, 0.0F, false));

		Delinker11_r1 = new ModelRenderer(this);
		Delinker11_r1.setRotationPoint(22.9928F, 11.5407F, 0.0F);
		WiresMotorBattery.addChild(Delinker11_r1);
		setRotationAngle(Delinker11_r1, 0.0F, 0.0F, -0.4538F);
		Delinker11_r1.cubeList.add(new ModelBox(Delinker11_r1, 95, 0, 1.0F, -14.5F, -5.0F, 1, 1, 6, 0.0F, false));

		Delinker10_r1 = new ModelRenderer(this);
		Delinker10_r1.setRotationPoint(24.523F, 11.4263F, 0.0F);
		WiresMotorBattery.addChild(Delinker10_r1);
		setRotationAngle(Delinker10_r1, 0.0F, 0.0F, -0.5585F);
		Delinker10_r1.cubeList.add(new ModelBox(Delinker10_r1, 95, 7, 2.0F, -14.5F, -5.0F, 1, 1, 6, 0.0F, false));

		Delinker7_r1 = new ModelRenderer(this);
		Delinker7_r1.setRotationPoint(17.2912F, 12.838F, 0.0F);
		WiresMotorBattery.addChild(Delinker7_r1);
		setRotationAngle(Delinker7_r1, 0.0F, 0.0F, -0.0524F);
		Delinker7_r1.cubeList.add(new ModelBox(Delinker7_r1, 0, 64, 5.5F, -14.3F, -8.5F, 2, 2, 29, 0.0F, false));

		Delinker6_r1 = new ModelRenderer(this);
		Delinker6_r1.setRotationPoint(17.2467F, 12.7397F, 0.0F);
		WiresMotorBattery.addChild(Delinker6_r1);
		setRotationAngle(Delinker6_r1, 0.0F, 0.0F, -0.0524F);
		Delinker6_r1.cubeList.add(new ModelBox(Delinker6_r1, 65, 0, 3.6F, -13.5F, -8.0F, 1, 1, 28, 0.0F, false));

		Delinker5_r1 = new ModelRenderer(this);
		Delinker5_r1.setRotationPoint(17.2795F, 12.9902F, 0.0F);
		WiresMotorBattery.addChild(Delinker5_r1);
		setRotationAngle(Delinker5_r1, 0.0F, 0.0F, -0.0524F);
		Delinker5_r1.cubeList.add(new ModelBox(Delinker5_r1, 65, 29, 8.4F, -14.0F, -8.0F, 1, 1, 28, 0.0F, false));

		Delinker4_r1 = new ModelRenderer(this);
		Delinker4_r1.setRotationPoint(17.1404F, 12.8787F, 0.0F);
		WiresMotorBattery.addChild(Delinker4_r1);
		setRotationAngle(Delinker4_r1, 0.0F, 0.0F, -0.0524F);
		Delinker4_r1.cubeList.add(new ModelBox(Delinker4_r1, 65, 65, 6.2F, -11.4F, -8.0F, 1, 1, 28, 0.0F, false));

		Delinker33_r1 = new ModelRenderer(this);
		Delinker33_r1.setRotationPoint(27.5913F, 9.2795F, 0.0F);
		WiresMotorBattery.addChild(Delinker33_r1);
		setRotationAngle(Delinker33_r1, 0.0F, 0.0F, -0.8727F);
		Delinker33_r1.cubeList.add(new ModelBox(Delinker33_r1, 106, 24, 2.0F, -13.5F, 5.0F, 5, 2, 1, 0.0F, false));
		Delinker33_r1.cubeList.add(new ModelBox(Delinker33_r1, 112, 12, 2.0F, -13.5F, 10.0F, 5, 2, 1, 0.0F, false));

		ElectricWires14_r1 = new ModelRenderer(this);
		ElectricWires14_r1.setRotationPoint(16.0921F, 12.5485F, 0.0F);
		WiresMotorBattery.addChild(ElectricWires14_r1);
		setRotationAngle(ElectricWires14_r1, 0.0F, 0.0F, 0.0175F);
		ElectricWires14_r1.cubeList.add(new ModelBox(ElectricWires14_r1, 113, 103, -2.0F, -25.4F, 16.0F, 3, 1, 1, 0.0F, false));

		ElectricWires13_r1 = new ModelRenderer(this);
		ElectricWires13_r1.setRotationPoint(18.0494F, -13.0215F, 16.0F);
		WiresMotorBattery.addChild(ElectricWires13_r1);
		setRotationAngle(ElectricWires13_r1, 0.0F, 0.384F, -0.4712F);
		ElectricWires13_r1.cubeList.add(new ModelBox(ElectricWires13_r1, 113, 94, -1.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		ElectricWires11_r1 = new ModelRenderer(this);
		ElectricWires11_r1.setRotationPoint(34.037F, 7.6556F, 0.0F);
		WiresMotorBattery.addChild(ElectricWires11_r1);
		setRotationAngle(ElectricWires11_r1, 0.0F, 0.0F, -0.6981F);
		ElectricWires11_r1.cubeList.add(new ModelBox(ElectricWires11_r1, 48, 10, 2.0F, -26.5F, 8.0F, 4, 1, 1, 0.0F, false));

		ElectricWires10_r1 = new ModelRenderer(this);
		ElectricWires10_r1.setRotationPoint(24.2114F, 12.8757F, 0.0F);
		WiresMotorBattery.addChild(ElectricWires10_r1);
		setRotationAngle(ElectricWires10_r1, 0.0F, 0.0F, -0.2618F);
		ElectricWires10_r1.cubeList.add(new ModelBox(ElectricWires10_r1, 73, 91, 5.0F, -29.0F, 8.0F, 2, 1, 1, 0.0F, false));

		ElectricWires9_r1 = new ModelRenderer(this);
		ElectricWires9_r1.setRotationPoint(-0.3805F, 2.0453F, 0.0F);
		WiresMotorBattery.addChild(ElectricWires9_r1);
		setRotationAngle(ElectricWires9_r1, 0.0F, 0.0F, 0.6981F);
		ElectricWires9_r1.cubeList.add(new ModelBox(ElectricWires9_r1, 95, 4, 6.0F, -29.8F, 8.0F, 2, 1, 1, 0.0F, false));

		ElectricWires6_r1 = new ModelRenderer(this);
		ElectricWires6_r1.setRotationPoint(16.5352F, 3.7837F, -8.3352F);
		WiresMotorBattery.addChild(ElectricWires6_r1);
		setRotationAngle(ElectricWires6_r1, -0.4189F, 0.0F, 0.0F);
		ElectricWires6_r1.cubeList.add(new ModelBox(ElectricWires6_r1, 47, 86, -3.3F, -24.0F, 15.5F, 1, 1, 6, 0.0F, false));

		ElectricWires5_r1 = new ModelRenderer(this);
		ElectricWires5_r1.setRotationPoint(16.5352F, -14.4681F, -14.9987F);
		WiresMotorBattery.addChild(ElectricWires5_r1);
		setRotationAngle(ElectricWires5_r1, -1.0821F, 0.0F, 0.0F);
		ElectricWires5_r1.cubeList.add(new ModelBox(ElectricWires5_r1, 95, 52, -2.8F, -26.0F, 15.0F, 1, 1, 2, 0.0F, false));

		ElectricWires4_r1 = new ModelRenderer(this);
		ElectricWires4_r1.setRotationPoint(14.7352F, -13.3384F, 14.2407F);
		WiresMotorBattery.addChild(ElectricWires4_r1);
		setRotationAngle(ElectricWires4_r1, -0.835F, -0.1528F, 0.1914F);
		ElectricWires4_r1.cubeList.add(new ModelBox(ElectricWires4_r1, 56, 95, -0.7F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		ElectricWires2_r1 = new ModelRenderer(this);
		ElectricWires2_r1.setRotationPoint(21.9684F, 11.263F, 0.0F);
		WiresMotorBattery.addChild(ElectricWires2_r1);
		setRotationAngle(ElectricWires2_r1, 0.0F, 0.0F, -0.2094F);
		ElectricWires2_r1.cubeList.add(new ModelBox(ElectricWires2_r1, 48, 117, -3.5F, -26.5F, 0.0F, 2, 1, 1, 0.0F, false));

		ElectricWires1_r1 = new ModelRenderer(this);
		ElectricWires1_r1.setRotationPoint(16.5352F, 11.6785F, 5.8231F);
		WiresMotorBattery.addChild(ElectricWires1_r1);
		setRotationAngle(ElectricWires1_r1, 0.2269F, 0.0F, 0.0F);
		ElectricWires1_r1.cubeList.add(new ModelBox(ElectricWires1_r1, 48, 98, -3.8F, -26.0F, -1.0F, 1, 1, 2, 0.0F, false));

		ElectricWires15_r1 = new ModelRenderer(this);
		ElectricWires15_r1.setRotationPoint(20.3317F, 12.5698F, 1.0801F);
		WiresMotorBattery.addChild(ElectricWires15_r1);
		setRotationAngle(ElectricWires15_r1, 0.0F, -0.2443F, 0.0F);
		ElectricWires15_r1.cubeList.add(new ModelBox(ElectricWires15_r1, 117, 112, -2.5F, -25.0F, 16.0F, 1, 1, 4, 0.0F, false));

		GripNuclearBattery4_r1 = new ModelRenderer(this);
		GripNuclearBattery4_r1.setRotationPoint(-9.7789F, 0.3638F, 0.0F);
		WiresMotorBattery.addChild(GripNuclearBattery4_r1);
		setRotationAngle(GripNuclearBattery4_r1, 0.0F, 0.0F, 1.0821F);
		GripNuclearBattery4_r1.cubeList.add(new ModelBox(GripNuclearBattery4_r1, 76, 107, -2.2F, -28.3F, -7.5F, 2, 1, 5, 0.0F, false));
		GripNuclearBattery4_r1.cubeList.add(new ModelBox(GripNuclearBattery4_r1, 56, 98, -2.0F, -27.5F, -1.8F, 2, 2, 1, 0.0F, false));
		GripNuclearBattery4_r1.cubeList.add(new ModelBox(GripNuclearBattery4_r1, 95, 65, -3.2F, -26.0F, -6.5F, 1, 3, 3, 0.0F, false));
		GripNuclearBattery4_r1.cubeList.add(new ModelBox(GripNuclearBattery4_r1, 0, 33, -3.0F, -28.0F, -9.0F, 4, 7, 8, 0.0F, false));
		GripNuclearBattery4_r1.cubeList.add(new ModelBox(GripNuclearBattery4_r1, 33, 64, 0.2F, -25.0F, -7.5F, 1, 2, 5, 0.0F, false));

		RotorMotor1_r1 = new ModelRenderer(this);
		RotorMotor1_r1.setRotationPoint(0.3498F, 3.0391F, 0.0F);
		WiresMotorBattery.addChild(RotorMotor1_r1);
		setRotationAngle(RotorMotor1_r1, 0.0F, 0.0F, 0.6981F);
		RotorMotor1_r1.cubeList.add(new ModelBox(RotorMotor1_r1, 0, 128, 5.0F, -27.0F, -7.0F, 5, 3, 21, 0.0F, false));
		RotorMotor1_r1.cubeList.add(new ModelBox(RotorMotor1_r1, 65, 129, 6.0F, -28.0F, -7.0F, 3, 5, 21, 0.0F, false));

		RotorMotor25_r1 = new ModelRenderer(this);
		RotorMotor25_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		WiresMotorBattery.addChild(RotorMotor25_r1);
		setRotationAngle(RotorMotor25_r1, 0.0F, 0.0F, 0.6981F);
		RotorMotor25_r1.cubeList.add(new ModelBox(RotorMotor25_r1, 87, 85, 8.0F, -28.5F, 7.5F, 1, 2, 2, 0.0F, false));
		RotorMotor25_r1.cubeList.add(new ModelBox(RotorMotor25_r1, 65, 0, 9.0F, -29.0F, 7.0F, 2, 4, 3, 0.0F, false));

		RotorMotor23_r1 = new ModelRenderer(this);
		RotorMotor23_r1.setRotationPoint(1.9614F, 2.6413F, 0.0F);
		WiresMotorBattery.addChild(RotorMotor23_r1);
		setRotationAngle(RotorMotor23_r1, 0.0F, 0.0F, 0.7679F);
		RotorMotor23_r1.cubeList.add(new ModelBox(RotorMotor23_r1, 95, 49, 3.0F, -23.0F, -8.9F, 4, 2, 6, 0.0F, false));

		RotorMotor22_r1 = new ModelRenderer(this);
		RotorMotor22_r1.setRotationPoint(24.4017F, 11.1827F, 0.0F);
		WiresMotorBattery.addChild(RotorMotor22_r1);
		setRotationAngle(RotorMotor22_r1, 0.0F, 0.0F, -0.3491F);
		RotorMotor22_r1.cubeList.add(new ModelBox(RotorMotor22_r1, 16, 58, 0.0F, -23.0F, 11.0F, 4, 1, 1, 0.0F, false));

		RotorMotor21_r1 = new ModelRenderer(this);
		RotorMotor21_r1.setRotationPoint(35.9652F, 5.3055F, 0.0F);
		WiresMotorBattery.addChild(RotorMotor21_r1);
		setRotationAngle(RotorMotor21_r1, 0.0F, 0.0F, -0.8901F);
		RotorMotor21_r1.cubeList.add(new ModelBox(RotorMotor21_r1, 51, 128, 2.6F, -21.4F, -7.1F, 4, 3, 1, 0.0F, false));
		RotorMotor21_r1.cubeList.add(new ModelBox(RotorMotor21_r1, 120, 129, 4.4F, -23.2F, -7.1F, 3, 4, 1, 0.0F, false));
		RotorMotor21_r1.cubeList.add(new ModelBox(RotorMotor21_r1, 65, 129, 2.6F, -24.0F, -7.1F, 4, 3, 1, 0.0F, false));
		RotorMotor21_r1.cubeList.add(new ModelBox(RotorMotor21_r1, 130, 0, 1.8F, -23.2F, -7.1F, 3, 4, 1, 0.0F, false));
		RotorMotor21_r1.cubeList.add(new ModelBox(RotorMotor21_r1, 130, 5, 1.8F, -23.2F, 13.1F, 3, 4, 1, 0.0F, false));
		RotorMotor21_r1.cubeList.add(new ModelBox(RotorMotor21_r1, 130, 10, 4.4F, -23.2F, 13.1F, 3, 4, 1, 0.0F, false));
		RotorMotor21_r1.cubeList.add(new ModelBox(RotorMotor21_r1, 75, 129, 2.6F, -21.4F, 13.1F, 4, 3, 1, 0.0F, false));
		RotorMotor21_r1.cubeList.add(new ModelBox(RotorMotor21_r1, 92, 129, 2.6F, -24.0F, 13.1F, 4, 3, 1, 0.0F, false));

		RotorMotor17_r1 = new ModelRenderer(this);
		RotorMotor17_r1.setRotationPoint(19.4476F, 12.9412F, 0.0F);
		WiresMotorBattery.addChild(RotorMotor17_r1);
		setRotationAngle(RotorMotor17_r1, 0.0F, 0.0F, -0.1047F);
		RotorMotor17_r1.cubeList.add(new ModelBox(RotorMotor17_r1, 40, 13, 5.0F, -27.6F, -7.1F, 1, 7, 1, 0.0F, false));
		RotorMotor17_r1.cubeList.add(new ModelBox(RotorMotor17_r1, 77, 83, 2.0F, -24.6F, -7.1F, 7, 1, 1, 0.0F, false));
		RotorMotor17_r1.cubeList.add(new ModelBox(RotorMotor17_r1, 102, 61, 2.0F, -24.6F, 13.1F, 7, 1, 1, 0.0F, false));
		RotorMotor17_r1.cubeList.add(new ModelBox(RotorMotor17_r1, 88, 36, 5.0F, -27.6F, 13.1F, 1, 7, 1, 0.0F, false));

		RotorMotor9_r1 = new ModelRenderer(this);
		RotorMotor9_r1.setRotationPoint(0.9051F, 2.5133F, 0.0F);
		WiresMotorBattery.addChild(RotorMotor9_r1);
		setRotationAngle(RotorMotor9_r1, 0.0F, 0.0F, 0.6981F);
		RotorMotor9_r1.cubeList.add(new ModelBox(RotorMotor9_r1, 130, 65, 6.0F, -26.5F, -7.5F, 3, 3, 1, 0.0F, false));

		RotorMotor8_r1 = new ModelRenderer(this);
		RotorMotor8_r1.setRotationPoint(1.0291F, 2.0048F, 0.0F);
		WiresMotorBattery.addChild(RotorMotor8_r1);
		setRotationAngle(RotorMotor8_r1, 0.0F, 0.0F, 0.7854F);
		RotorMotor8_r1.cubeList.add(new ModelBox(RotorMotor8_r1, 14, 64, 4.5F, -24.0F, -8.0F, 2, 4, 1, 0.0F, false));

		RotorMotor7_r1 = new ModelRenderer(this);
		RotorMotor7_r1.setRotationPoint(1.6821F, 3.3784F, 0.0F);
		WiresMotorBattery.addChild(RotorMotor7_r1);
		setRotationAngle(RotorMotor7_r1, 0.0F, 0.0F, 0.6981F);
		RotorMotor7_r1.cubeList.add(new ModelBox(RotorMotor7_r1, 130, 49, 5.2F, -26.0F, -8.5F, 2, 2, 2, 0.0F, false));

		RotorMotor6_r1 = new ModelRenderer(this);
		RotorMotor6_r1.setRotationPoint(18.2982F, 13.053F, 0.0F);
		WiresMotorBattery.addChild(RotorMotor6_r1);
		setRotationAngle(RotorMotor6_r1, 0.0F, 0.0F, -0.0698F);
		RotorMotor6_r1.cubeList.add(new ModelBox(RotorMotor6_r1, 130, 152, 7.8F, -25.0F, -7.0F, 1, 1, 21, 0.0F, false));

		RotorMotor5_r1 = new ModelRenderer(this);
		RotorMotor5_r1.setRotationPoint(18.2516F, 12.7194F, 0.0F);
		WiresMotorBattery.addChild(RotorMotor5_r1);
		setRotationAngle(RotorMotor5_r1, 0.0F, 0.0F, -0.0698F);
		RotorMotor5_r1.cubeList.add(new ModelBox(RotorMotor5_r1, 65, 155, 3.0F, -24.5F, -7.0F, 1, 1, 21, 0.0F, false));

		RotorMotor4_r1 = new ModelRenderer(this);
		RotorMotor4_r1.setRotationPoint(18.1047F, 12.9131F, 0.0F);
		WiresMotorBattery.addChild(RotorMotor4_r1);
		setRotationAngle(RotorMotor4_r1, 0.0F, 0.0F, -0.0698F);
		RotorMotor4_r1.cubeList.add(new ModelBox(RotorMotor4_r1, 0, 192, 5.7F, -22.3F, -7.0F, 1, 1, 21, 0.0F, false));

		RotorMotor3_r1 = new ModelRenderer(this);
		RotorMotor3_r1.setRotationPoint(18.4313F, 12.8668F, 0.0F);
		WiresMotorBattery.addChild(RotorMotor3_r1);
		setRotationAngle(RotorMotor3_r1, 0.0F, 0.0F, -0.0698F);
		RotorMotor3_r1.cubeList.add(new ModelBox(RotorMotor3_r1, 65, 193, 5.2F, -27.0F, -7.0F, 1, 1, 21, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 28.2344F, 9.8708F);
		grip.cubeList.add(new ModelBox(grip, 87, 65, -1.3F, -31.9344F, 12.1292F, 1, 2, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 48, -2.0F, -29.7344F, 8.1292F, 5, 2, 8, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 47, 77, -1.0F, -30.2344F, 10.6292F, 3, 2, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 109, 49, -1.0F, -40.2344F, 7.6292F, 3, 2, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 119, 100, -1.0F, -39.7344F, 7.1292F, 3, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 33, 25, -4.3F, -36.5344F, -25.4708F, 10, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 65, 41, -1.5F, -28.2344F, 7.6292F, 4, 10, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 65, 94, -2.0F, -26.7344F, 7.8292F, 5, 8, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 95, 84, -3.8F, -24.2344F, 5.1292F, 1, 3, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 95, 75, 3.8F, -24.2344F, 5.1292F, 1, 3, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 116, -7.5F, -31.2344F, -26.8708F, 16, 2, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 34, 0, 5.5F, -29.5344F, -26.8708F, 1, 2, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 51, 64, 7.5F, -29.5344F, -26.8708F, 1, 2, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 48, 0, -1.0F, -28.2344F, 12.1292F, 3, 6, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 33, 33, -3.5F, -29.7344F, 9.1292F, 1, 4, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 34, 0, -3.5F, -29.7344F, 14.3292F, 1, 4, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 33, 33, -4.0F, -30.2344F, 10.1292F, 2, 5, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 71, 65, -4.7F, -29.7344F, 10.6292F, 1, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 56, 102, 1.5F, -31.4344F, 1.1292F, 2, 2, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 12, 123, -1.0F, -27.0344F, 5.1292F, 3, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 123, -1.0F, -19.5344F, 5.1292F, 3, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 33, -1.0F, -30.7344F, -22.3708F, 3, 1, 27, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 87, 123, 2.0F, -30.7344F, -20.3708F, 2, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 77, 123, -3.0F, -30.7344F, -20.3708F, 2, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 26, -6.0F, -30.7344F, -21.3708F, 13, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 71, 72, 0.0F, -31.2344F, -17.8708F, 1, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 103, 120, -5.0F, -30.7344F, -21.8708F, 3, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 95, 120, 3.0F, -30.7344F, -21.8708F, 3, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 33, 43, -3.0F, -31.2344F, -16.3708F, 4, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 103, 7, -2.5F, -31.4344F, -7.8708F, 2, 2, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 103, 3, -2.5F, -31.4344F, -2.8708F, 2, 2, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 103, 0, -2.5F, -31.4344F, 2.1292F, 2, 2, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 104, 116, -3.0F, -31.6344F, 12.6292F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 6, 71, -3.5F, -31.2344F, 12.6292F, 1, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 21, 81, 6.5F, -29.6344F, -25.9708F, 1, 6, 3, -0.15F, false));
		grip.cubeList.add(new ModelBox(grip, 65, 76, -5.9F, -29.6344F, -25.9708F, 1, 6, 3, -0.15F, false));
		grip.cubeList.add(new ModelBox(grip, 65, 123, -0.634F, -18.1026F, -25.9708F, 3, 1, 3, -0.15F, false));

		MagFastener3_r1 = new ModelRenderer(this);
		MagFastener3_r1.setRotationPoint(-1.066F, -17.0026F, -24.4708F);
		grip.addChild(MagFastener3_r1);
		setRotationAngle(MagFastener3_r1, 0.0F, 0.0F, -1.2654F);
		MagFastener3_r1.cubeList.add(new ModelBox(MagFastener3_r1, 130, 37, 0.2F, -1.4F, -1.5F, 1, 2, 3, -0.15F, false));

		MagFastener3_r2 = new ModelRenderer(this);
		MagFastener3_r2.setRotationPoint(-5.4F, -22.6344F, -24.4708F);
		grip.addChild(MagFastener3_r2);
		setRotationAngle(MagFastener3_r2, 0.0F, 0.0F, -0.6981F);
		MagFastener3_r2.cubeList.add(new ModelBox(MagFastener3_r2, 95, 18, -0.8F, 2.1F, -1.5F, 1, 4, 3, -0.15F, false));

		MagFastener3_r3 = new ModelRenderer(this);
		MagFastener3_r3.setRotationPoint(-5.4F, -22.6344F, -24.4708F);
		grip.addChild(MagFastener3_r3);
		setRotationAngle(MagFastener3_r3, 0.0F, 0.0F, -0.3491F);
		MagFastener3_r3.cubeList.add(new ModelBox(MagFastener3_r3, 0, 95, 0.0F, -1.5F, -1.5F, 1, 4, 3, -0.15F, false));

		MagFastener3_r4 = new ModelRenderer(this);
		MagFastener3_r4.setRotationPoint(2.666F, -17.0026F, -24.4708F);
		grip.addChild(MagFastener3_r4);
		setRotationAngle(MagFastener3_r4, 0.0F, 0.0F, 1.2654F);
		MagFastener3_r4.cubeList.add(new ModelBox(MagFastener3_r4, 130, 44, -1.2F, -1.4F, -1.5F, 1, 2, 3, -0.15F, false));

		MagFastener3_r5 = new ModelRenderer(this);
		MagFastener3_r5.setRotationPoint(7.0F, -22.6344F, -24.4708F);
		grip.addChild(MagFastener3_r5);
		setRotationAngle(MagFastener3_r5, 0.0F, 0.0F, 0.6981F);
		MagFastener3_r5.cubeList.add(new ModelBox(MagFastener3_r5, 95, 29, -0.2F, 2.1F, -1.5F, 1, 4, 3, -0.15F, false));

		MagFastener3_r6 = new ModelRenderer(this);
		MagFastener3_r6.setRotationPoint(7.0F, -22.6344F, -24.4708F);
		grip.addChild(MagFastener3_r6);
		setRotationAngle(MagFastener3_r6, 0.0F, 0.0F, 0.3491F);
		MagFastener3_r6.cubeList.add(new ModelBox(MagFastener3_r6, 55, 84, -1.0F, -1.5F, -1.5F, 1, 4, 3, -0.15F, false));

		GripCarcass8_r1 = new ModelRenderer(this);
		GripCarcass8_r1.setRotationPoint(0.0F, -1.5386F, -0.8911F);
		grip.addChild(GripCarcass8_r1);
		setRotationAngle(GripCarcass8_r1, 0.3142F, 0.0F, 0.0F);
		GripCarcass8_r1.cubeList.add(new ModelBox(GripCarcass8_r1, 71, 67, 0.0F, -27.0F, 13.0F, 1, 1, 1, 0.0F, false));

		GripCarcass5_r1 = new ModelRenderer(this);
		GripCarcass5_r1.setRotationPoint(0.0F, -3.1502F, -15.5553F);
		grip.addChild(GripCarcass5_r1);
		setRotationAngle(GripCarcass5_r1, -0.2094F, 0.0F, 0.0F);
		GripCarcass5_r1.cubeList.add(new ModelBox(GripCarcass5_r1, 130, 56, -1.0F, -26.5F, -8.0F, 3, 3, 1, 0.0F, false));

		GripCarcass3_r1 = new ModelRenderer(this);
		GripCarcass3_r1.setRotationPoint(0.0F, -1.2336F, -1.9498F);
		grip.addChild(GripCarcass3_r1);
		setRotationAngle(GripCarcass3_r1, 0.2967F, 0.0F, 0.0F);
		GripCarcass3_r1.cubeList.add(new ModelBox(GripCarcass3_r1, 112, 129, -1.0F, -26.0F, 14.0F, 3, 4, 1, 0.0F, false));

		GripPowerBoxSwitch_r1 = new ModelRenderer(this);
		GripPowerBoxSwitch_r1.setRotationPoint(3.011F, -5.0057F, -9.8708F);
		grip.addChild(GripPowerBoxSwitch_r1);
		setRotationAngle(GripPowerBoxSwitch_r1, 0.0F, 0.0F, -0.1222F);
		GripPowerBoxSwitch_r1.cubeList.add(new ModelBox(GripPowerBoxSwitch_r1, 57, 33, -4.8F, -25.0F, 22.0F, 1, 3, 2, 0.0F, false));

		GripRecoilNegator7_r1 = new ModelRenderer(this);
		GripRecoilNegator7_r1.setRotationPoint(9.5F, -28.5344F, -24.8708F);
		grip.addChild(GripRecoilNegator7_r1);
		setRotationAngle(GripRecoilNegator7_r1, 0.6545F, 0.0F, 0.0F);
		GripRecoilNegator7_r1.cubeList.add(new ModelBox(GripRecoilNegator7_r1, 40, 67, -1.4F, -1.0F, 0.3F, 1, 1, 1, -0.04F, false));
		GripRecoilNegator7_r1.cubeList.add(new ModelBox(GripRecoilNegator7_r1, 33, 67, -17.5F, -1.0F, 0.3F, 1, 1, 1, -0.04F, false));

		GripRecoilNegator7_r2 = new ModelRenderer(this);
		GripRecoilNegator7_r2.setRotationPoint(-8.4F, -28.5344F, -24.8708F);
		grip.addChild(GripRecoilNegator7_r2);
		setRotationAngle(GripRecoilNegator7_r2, 0.7941F, 0.0F, 0.0F);
		GripRecoilNegator7_r2.cubeList.add(new ModelBox(GripRecoilNegator7_r2, 130, 69, -0.4F, -0.9F, -0.5F, 1, 1, 3, -0.04F, false));
		GripRecoilNegator7_r2.cubeList.add(new ModelBox(GripRecoilNegator7_r2, 130, 73, 17.3F, -0.9F, -0.5F, 1, 1, 3, -0.04F, false));

		GripRecoilNegator6_r1 = new ModelRenderer(this);
		GripRecoilNegator6_r1.setRotationPoint(8.0775F, -4.2344F, -9.5161F);
		grip.addChild(GripRecoilNegator6_r1);
		setRotationAngle(GripRecoilNegator6_r1, 0.0F, -0.4712F, 0.0F);
		GripRecoilNegator6_r1.cubeList.add(new ModelBox(GripRecoilNegator6_r1, 0, 13, 3.3F, -20.5F, 17.0F, 2, 4, 4, 0.0F, false));

		GripRecoilNegator5_r1 = new ModelRenderer(this);
		GripRecoilNegator5_r1.setRotationPoint(-8.6078F, -4.2344F, -9.7249F);
		grip.addChild(GripRecoilNegator5_r1);
		setRotationAngle(GripRecoilNegator5_r1, 0.0F, 0.4712F, 0.0F);
		GripRecoilNegator5_r1.cubeList.add(new ModelBox(GripRecoilNegator5_r1, 16, 13, -4.0F, -20.5F, 18.0F, 2, 4, 4, 0.0F, false));

		GripRecoilNegator9_r1 = new ModelRenderer(this);
		GripRecoilNegator9_r1.setRotationPoint(0.0F, -23.8188F, -18.2516F);
		grip.addChild(GripRecoilNegator9_r1);
		setRotationAngle(GripRecoilNegator9_r1, -0.7156F, 0.0F, 0.0F);
		GripRecoilNegator9_r1.cubeList.add(new ModelBox(GripRecoilNegator9_r1, 117, 65, -1.0F, -21.0F, 24.0F, 3, 4, 2, 0.0F, false));

		SECONDGRIP2_r1 = new ModelRenderer(this);
		SECONDGRIP2_r1.setRotationPoint(4.3255F, -3.9774F, -10.4708F);
		grip.addChild(SECONDGRIP2_r1);
		setRotationAngle(SECONDGRIP2_r1, 0.0F, 0.0F, -0.1396F);
		SECONDGRIP2_r1.cubeList.add(new ModelBox(SECONDGRIP2_r1, 46, 12, 4.9F, -31.5F, -15.5F, 1, 5, 3, 0.0F, false));

		SECONDGRIP1_r1 = new ModelRenderer(this);
		SECONDGRIP1_r1.setRotationPoint(-4.3533F, -3.9794F, -10.4708F);
		grip.addChild(SECONDGRIP1_r1);
		setRotationAngle(SECONDGRIP1_r1, 0.0F, 0.0F, 0.1396F);
		SECONDGRIP1_r1.cubeList.add(new ModelBox(SECONDGRIP1_r1, 48, 32, -4.5F, -31.8F, -15.5F, 1, 5, 3, 0.0F, false));

		GRIPMAIN11TRIGGER_r1 = new ModelRenderer(this);
		GRIPMAIN11TRIGGER_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(GRIPMAIN11TRIGGER_r1);
		setRotationAngle(GRIPMAIN11TRIGGER_r1, 0.2793F, 0.0F, 0.0F);
		GRIPMAIN11TRIGGER_r1.cubeList.add(new ModelBox(GRIPMAIN11TRIGGER_r1, 41, 0, 0.0F, -35.0F, 19.2F, 1, 4, 1, 0.0F, false));
		GRIPMAIN11TRIGGER_r1.cubeList.add(new ModelBox(GRIPMAIN11TRIGGER_r1, 34, 13, 0.7F, -34.0F, 20.5F, 1, 9, 2, 0.0F, false));
		GRIPMAIN11TRIGGER_r1.cubeList.add(new ModelBox(GRIPMAIN11TRIGGER_r1, 57, 48, -0.7F, -34.0F, 20.5F, 1, 9, 2, 0.0F, false));
		GRIPMAIN11TRIGGER_r1.cubeList.add(new ModelBox(GRIPMAIN11TRIGGER_r1, 83, 94, -0.5F, -34.0F, 20.0F, 2, 10, 3, 0.0F, false));

		GRIPMAIN10_r1 = new ModelRenderer(this);
		GRIPMAIN10_r1.setRotationPoint(0.0F, -8.3932F, -14.4063F);
		grip.addChild(GRIPMAIN10_r1);
		setRotationAngle(GRIPMAIN10_r1, -0.1745F, 0.0F, 0.0F);
		GRIPMAIN10_r1.cubeList.add(new ModelBox(GRIPMAIN10_r1, 121, 39, -0.5F, -28.0F, 21.5F, 2, 2, 1, 0.0F, false));

		GRIPMAIN5_r1 = new ModelRenderer(this);
		GRIPMAIN5_r1.setRotationPoint(0.0F, 0.544F, 17.2007F);
		grip.addChild(GRIPMAIN5_r1);
		setRotationAngle(GRIPMAIN5_r1, 0.6981F, 0.0F, 0.0F);
		GRIPMAIN5_r1.cubeList.add(new ModelBox(GRIPMAIN5_r1, 116, 117, -1.0F, -34.8F, 19.1F, 3, 1, 3, 0.0F, false));

		GRIPMAIN3_r1 = new ModelRenderer(this);
		GRIPMAIN3_r1.setRotationPoint(0.0F, 1.294F, 7.3017F);
		grip.addChild(GRIPMAIN3_r1);
		setRotationAngle(GRIPMAIN3_r1, 0.4712F, 0.0F, 0.0F);
		GRIPMAIN3_r1.cubeList.add(new ModelBox(GRIPMAIN3_r1, 39, 122, -1.0F, -34.0F, 20.1F, 3, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
		WiresMotorBattery.render(f5);
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
