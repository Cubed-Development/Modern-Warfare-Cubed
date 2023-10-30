package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SSG08 extends ModelWithAttachments {
	private final ModelRenderer whole_gripperoni;
	private final ModelRenderer grip1;
	private final ModelRenderer grip2;
	private final ModelRenderer grip3;
	private final ModelRenderer grip4;
	private final ModelRenderer grip5;
	private final ModelRenderer bone133;
	private final ModelRenderer grip8;
	private final ModelRenderer grip11;
	private final ModelRenderer grip12;
	private final ModelRenderer berrl;
	private final ModelRenderer theopenpart;
	private final ModelRenderer bone220;
	private final ModelRenderer bone223;
	private final ModelRenderer bone221;
	private final ModelRenderer bone222;
	private final ModelRenderer barrel_front;
	private final ModelRenderer bone122;
	private final ModelRenderer bone145;
	private final ModelRenderer bone146;
	private final ModelRenderer bone168;
	private final ModelRenderer bone169;
	private final ModelRenderer bone170;
	private final ModelRenderer bone171;
	private final ModelRenderer bone156;
	private final ModelRenderer bone157;
	private final ModelRenderer bone180;
	private final ModelRenderer Stock;
	private final ModelRenderer bone143;
	private final ModelRenderer bone142;
	private final ModelRenderer Stock_moving_thing;
	private final ModelRenderer Stock_butt;
	private final ModelRenderer bone141;

	public SSG08() {
		textureWidth = 512;
		textureHeight = 512;

		whole_gripperoni = new ModelRenderer(this);
		whole_gripperoni.setRotationPoint(-3.5F, -7.5F, -8.0F);
		

		grip1 = new ModelRenderer(this);
		grip1.setRotationPoint(0.0F, 0.0F, 0.0F);
		whole_gripperoni.addChild(grip1);
		grip1.cubeList.add(new ModelBox(grip1, 19, 86, 0.5F, 0.0F, 0.0F, 3, 4, 6, 0.0F, false));

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(0.0F, 4.0F, 1.5F);
		whole_gripperoni.addChild(grip2);
		setRotationAngle(grip2, 0.2603F, 0.0F, 0.0F);
		grip2.cubeList.add(new ModelBox(grip2, 19, 38, 0.0F, 0.0F, 0.0F, 4, 10, 5, 0.0F, false));

		grip3 = new ModelRenderer(this);
		grip3.setRotationPoint(0.0F, 7.3F, 8.5F);
		whole_gripperoni.addChild(grip3);
		setRotationAngle(grip3, -1.3384F, 0.0F, 0.0F);
		grip3.cubeList.add(new ModelBox(grip3, 19, 67, 0.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

		grip4 = new ModelRenderer(this);
		grip4.setRotationPoint(0.0F, 7.3F, 8.5F);
		whole_gripperoni.addChild(grip4);
		setRotationAngle(grip4, -2.6769F, 0.0F, 0.0F);
		grip4.cubeList.add(new ModelBox(grip4, 74, 86, 0.0F, 0.0F, 0.0F, 4, 5, 1, 0.0F, false));

		grip5 = new ModelRenderer(this);
		grip5.setRotationPoint(0.0F, 0.0F, 5.5F);
		whole_gripperoni.addChild(grip5);
		

		bone133 = new ModelRenderer(this);
		bone133.setRotationPoint(2.0F, 1.0F, 0.5F);
		grip5.addChild(bone133);
		setRotationAngle(bone133, -0.2618F, 0.0F, 0.0F);
		bone133.cubeList.add(new ModelBox(bone133, 75, 0, -1.5F, -1.4308F, -0.2362F, 3, 4, 1, 0.0F, false));

		grip8 = new ModelRenderer(this);
		grip8.setRotationPoint(0.0F, 4.0F, 0.0F);
		whole_gripperoni.addChild(grip8);
		setRotationAngle(grip8, 1.041F, 0.0F, 0.0F);
		grip8.cubeList.add(new ModelBox(grip8, 99, 76, 0.5F, 0.0F, 0.0F, 3, 3, 1, 0.0F, false));

		grip11 = new ModelRenderer(this);
		grip11.setRotationPoint(0.0F, 4.0F, 1.5F);
		whole_gripperoni.addChild(grip11);
		setRotationAngle(grip11, 0.2603F, 0.0F, 0.0F);
		grip11.cubeList.add(new ModelBox(grip11, 39, 57, 0.0F, 9.0F, -1.0F, 4, 1, 1, 0.0F, false));

		grip12 = new ModelRenderer(this);
		grip12.setRotationPoint(0.0F, 13.0F, 2.8F);
		whole_gripperoni.addChild(grip12);
		setRotationAngle(grip12, 0.9295F, 0.0F, 0.0F);
		grip12.cubeList.add(new ModelBox(grip12, 88, 65, 0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		berrl = new ModelRenderer(this);
		berrl.setRotationPoint(0.0F, 25.25F, 0.0F);
		berrl.cubeList.add(new ModelBox(berrl, 50, 27, -2.0F, -41.5F, -14.25F, 1, 2, 3, 0.0F, false));
		berrl.cubeList.add(new ModelBox(berrl, 95, 6, -0.75F, -40.25F, -14.25F, 1, 1, 3, 0.0F, false));

		theopenpart = new ModelRenderer(this);
		theopenpart.setRotationPoint(0.0F, -40.75F, -14.75F);
		berrl.addChild(theopenpart);
		theopenpart.cubeList.add(new ModelBox(theopenpart, 157, 196, -0.66F, 0.6F, -21.0F, 1, 1, 22, 0.0F, false));
		theopenpart.cubeList.add(new ModelBox(theopenpart, 105, 55, -3.34F, 0.6F, -21.0F, 1, 1, 8, 0.0F, false));
		theopenpart.cubeList.add(new ModelBox(theopenpart, 88, 0, -3.34F, 0.6F, -4.0F, 1, 1, 5, 0.0F, false));
		theopenpart.cubeList.add(new ModelBox(theopenpart, 177, 173, -1.75F, -1.0F, -21.0F, 1, 1, 22, 0.0F, false));
		theopenpart.cubeList.add(new ModelBox(theopenpart, 172, 138, -2.25F, -1.0F, -21.0F, 1, 1, 22, 0.0F, false));

		bone220 = new ModelRenderer(this);
		bone220.setRotationPoint(-2.0F, -0.5F, -10.0F);
		theopenpart.addChild(bone220);
		setRotationAngle(bone220, 0.0F, 0.0F, -0.7854F);
		bone220.cubeList.add(new ModelBox(bone220, 103, 105, -0.8232F, -0.5303F, -11.0F, 1, 1, 8, 0.0F, false));
		bone220.cubeList.add(new ModelBox(bone220, 27, 78, -0.8232F, -0.5303F, 6.0F, 1, 1, 5, 0.0F, false));

		bone223 = new ModelRenderer(this);
		bone223.setRotationPoint(-0.8536F, 0.1464F, 0.75F);
		bone220.addChild(bone223);
		setRotationAngle(bone223, 0.0F, 0.0F, -0.3927F);
		bone223.cubeList.add(new ModelBox(bone223, 17, 104, -0.713F, -0.6137F, -11.75F, 1, 1, 8, 0.0F, false));
		bone223.cubeList.add(new ModelBox(bone223, 39, 78, -0.713F, -0.6137F, 5.25F, 1, 1, 5, 0.0F, false));

		bone221 = new ModelRenderer(this);
		bone221.setRotationPoint(-0.5F, -0.5F, -10.0F);
		theopenpart.addChild(bone221);
		setRotationAngle(bone221, 0.0F, 0.0F, -0.7854F);
		bone221.cubeList.add(new ModelBox(bone221, 172, 115, -0.8232F, -0.5303F, -11.0F, 1, 1, 22, 0.0F, false));

		bone222 = new ModelRenderer(this);
		bone222.setRotationPoint(-0.5F, 0.5F, 0.0F);
		bone221.addChild(bone222);
		setRotationAngle(bone222, 0.0F, 0.0F, 0.3927F);
		bone222.cubeList.add(new ModelBox(bone222, 153, 172, -0.3863F, -0.287F, -11.0F, 1, 1, 22, 0.0F, false));

		barrel_front = new ModelRenderer(this);
		barrel_front.setRotationPoint(1.0F, -39.5F, -36.75F);
		berrl.addChild(barrel_front);
		barrel_front.cubeList.add(new ModelBox(barrel_front, 0, 171, -3.8F, -1.0F, -83.0F, 1, 1, 84, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 0, 86, -2.2F, -1.0F, -83.0F, 1, 1, 84, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 0, 0, -3.5F, -1.5F, -83.0F, 2, 2, 84, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 88, 2, -3.0F, -1.8F, -83.0F, 1, 1, 84, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 61, 86, -3.5F, -2.05F, -91.0F, 2, 1, 9, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 99, 80, -3.5F, -2.05F, -81.0F, 2, 1, 2, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 61, 49, -3.5F, -0.05F, -91.0F, 2, 1, 9, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 9, 90, -3.5F, -0.05F, -81.0F, 2, 1, 2, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 46, 68, -2.0F, -1.55F, -84.0F, 1, 2, 2, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 53, 38, -4.0F, -1.55F, -84.0F, 1, 2, 2, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 64, 10, -2.0F, -1.55F, -81.0F, 1, 2, 2, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 55, 14, -4.0F, -1.55F, -81.0F, 1, 2, 2, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 54, 21, -2.0F, -1.55F, -86.0F, 1, 2, 1, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 0, 48, -4.0F, -1.55F, -86.0F, 1, 2, 1, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 12, 48, -2.0F, -1.55F, -88.0F, 1, 2, 1, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 33, 10, -4.0F, -1.55F, -88.0F, 1, 2, 1, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 11, 65, -2.0F, -1.55F, -91.0F, 1, 2, 2, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 46, 60, -4.0F, -1.55F, -91.0F, 1, 2, 2, 0.0F, false));
		barrel_front.cubeList.add(new ModelBox(barrel_front, 86, 87, -3.0F, -0.2F, -83.0F, 1, 1, 84, 0.0F, false));

		bone122 = new ModelRenderer(this);
		bone122.setRotationPoint(-2.0F, -2.2F, 1.0F);
		barrel_front.addChild(bone122);
		setRotationAngle(bone122, 0.0349F, 0.0F, 0.0F);
		bone122.cubeList.add(new ModelBox(bone122, 127, 20, -1.0F, 0.0F, -13.0F, 1, 1, 13, 0.0F, false));

		bone145 = new ModelRenderer(this);
		bone145.setRotationPoint(-1.7F, -2.1F, 1.0F);
		barrel_front.addChild(bone145);
		setRotationAngle(bone145, 0.0349F, -0.0175F, 0.8029F);
		bone145.cubeList.add(new ModelBox(bone145, 0, 126, 0.0F, 0.0F, -13.0F, 1, 1, 13, 0.0F, false));

		bone146 = new ModelRenderer(this);
		bone146.setRotationPoint(-3.3F, -2.1F, 1.0F);
		barrel_front.addChild(bone146);
		setRotationAngle(bone146, 0.0349F, 0.0175F, -0.8029F);
		bone146.cubeList.add(new ModelBox(bone146, 56, 107, -1.0F, 0.0F, -13.0F, 1, 1, 13, 0.0F, false));

		bone168 = new ModelRenderer(this);
		bone168.setRotationPoint(-1.0F, -21.0F, -5.875F);
		berrl.addChild(bone168);
		setRotationAngle(bone168, 0.0F, 0.0F, 0.3927F);
		bone168.cubeList.add(new ModelBox(bone168, 94, 87, -7.8786F, -18.8831F, -8.375F, 1, 1, 3, 0.0F, false));

		bone169 = new ModelRenderer(this);
		bone169.setRotationPoint(-4.1893F, -20.1916F, -5.875F);
		berrl.addChild(bone169);
		setRotationAngle(bone169, 0.0F, 0.0F, 1.1781F);
		bone169.cubeList.add(new ModelBox(bone169, 9, 86, -17.6199F, -11.7952F, -8.375F, 1, 1, 3, 0.0F, false));

		bone170 = new ModelRenderer(this);
		bone170.setRotationPoint(2.7464F, -20.4786F, -5.875F);
		berrl.addChild(bone170);
		setRotationAngle(bone170, 0.0F, 0.0F, -1.1781F);
		bone170.cubeList.add(new ModelBox(bone170, 64, 14, 15.7589F, -13.124F, -6.375F, 1, 1, 1, 0.0F, false));

		bone171 = new ModelRenderer(this);
		bone171.setRotationPoint(-3.9964F, -20.5214F, -5.875F);
		bone170.addChild(bone171);
		setRotationAngle(bone171, -0.1745F, 0.0F, 0.0F);
		bone171.cubeList.add(new ModelBox(bone171, 39, 63, 19.67F, 7.1983F, 1.777F, 1, 1, 1, 0.0F, false));

		bone156 = new ModelRenderer(this);
		bone156.setRotationPoint(17.25F, -40.5F, -5.875F);
		berrl.addChild(bone156);
		setRotationAngle(bone156, 0.0F, 0.0F, -1.5708F);
		

		bone157 = new ModelRenderer(this);
		bone157.setRotationPoint(17.25F, -40.0F, -5.375F);
		berrl.addChild(bone157);
		setRotationAngle(bone157, 0.0F, 0.0F, -1.5708F);
		bone157.cubeList.add(new ModelBox(bone157, 54, 34, -1.05F, -20.5F, -5.975F, 1, 1, 1, 0.0F, false));

		bone180 = new ModelRenderer(this);
		bone180.setRotationPoint(17.25F, -40.5F, -5.875F);
		berrl.addChild(bone180);
		setRotationAngle(bone180, 0.0F, 0.0F, -1.5708F);
		bone180.cubeList.add(new ModelBox(bone180, 10, 34, -1.55F, -20.501F, -6.375F, 1, 1, 1, 0.0F, false));

		Stock = new ModelRenderer(this);
		Stock.setRotationPoint(1.0F, -14.25F, -37.0F);
		Stock.cubeList.add(new ModelBox(Stock, 43, 21, -4.499F, 3.75F, 41.49F, 4, 3, 3, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 29, 0, -2.0F, 4.5F, 42.5F, 2, 4, 2, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 0, 65, -1.25F, 2.95F, 43.0F, 1, 2, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 94, 49, -4.5F, 6.75F, 43.49F, 4, 2, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 19, 53, -4.5F, 6.75F, 42.5F, 4, 1, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 74, 92, -4.0F, 8.25F, 44.0F, 3, 1, 2, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 174, 44, -4.5F, 3.75F, 44.25F, 4, 1, 20, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 174, 21, -4.0F, 4.75F, 44.5F, 3, 3, 20, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 174, 0, -4.5F, 7.75F, 44.5F, 4, 1, 20, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 39, 39, -4.25F, 5.75F, 44.5F, 1, 1, 20, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 65, 49, -4.25F, 4.75F, 44.5F, 1, 1, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 64, 17, -4.25F, 6.75F, 44.5F, 1, 1, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 40, 80, -1.5F, 4.4377F, 52.4395F, 1, 1, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 34, 80, -1.5F, 7.1877F, 55.1895F, 1, 1, 1, 0.0F, false));

		bone143 = new ModelRenderer(this);
		bone143.setRotationPoint(-2.5F, 11.25F, 54.5F);
		Stock.addChild(bone143);
		setRotationAngle(bone143, -0.3054F, 0.0F, 0.0F);
		bone143.cubeList.add(new ModelBox(bone143, 181, 196, -1.5F, -0.2108F, -9.2703F, 3, 1, 20, 0.0F, false));

		bone142 = new ModelRenderer(this);
		bone142.setRotationPoint(-2.5F, 8.25F, 55.0F);
		Stock.addChild(bone142);
		setRotationAngle(bone142, -0.5672F, 0.0F, 0.0F);
		bone142.cubeList.add(new ModelBox(bone142, 0, 57, 1.0F, -1.8123F, -5.3105F, 1, 1, 7, 0.0F, false));

		Stock_moving_thing = new ModelRenderer(this);
		Stock_moving_thing.setRotationPoint(0.0F, 0.0F, 0.0F);
		Stock.addChild(Stock_moving_thing);
		Stock_moving_thing.cubeList.add(new ModelBox(Stock_moving_thing, 60, 21, -5.0F, 4.25F, 55.5F, 1, 4, 9, 0.0F, false));
		Stock_moving_thing.cubeList.add(new ModelBox(Stock_moving_thing, 57, 60, -4.75F, 3.74F, 55.51F, 1, 5, 9, 0.0F, false));
		Stock_moving_thing.cubeList.add(new ModelBox(Stock_moving_thing, 78, 36, -5.251F, 2.75F, 60.5F, 1, 7, 2, 0.0F, false));
		Stock_moving_thing.cubeList.add(new ModelBox(Stock_moving_thing, 61, 49, -5.251F, 2.75F, 57.5F, 1, 7, 2, 0.0F, false));
		Stock_moving_thing.cubeList.add(new ModelBox(Stock_moving_thing, 27, 96, -5.25F, 9.5F, 58.5F, 1, 1, 3, 0.0F, false));
		Stock_moving_thing.cubeList.add(new ModelBox(Stock_moving_thing, 19, 96, -5.25F, 2.75F, 58.5F, 1, 1, 3, 0.0F, false));
		Stock_moving_thing.cubeList.add(new ModelBox(Stock_moving_thing, 78, 10, -6.25F, 3.75F, 59.0F, 1, 2, 2, 0.0F, false));
		Stock_moving_thing.cubeList.add(new ModelBox(Stock_moving_thing, 174, 65, -5.5F, 0.75F, 46.5F, 6, 2, 18, 0.0F, false));
		Stock_moving_thing.cubeList.add(new ModelBox(Stock_moving_thing, 125, 108, -4.5F, 0.0F, 52.4999F, 4, 3, 12, 0.0F, false));
		Stock_moving_thing.cubeList.add(new ModelBox(Stock_moving_thing, 64, 10, -4.5F, 0.0F, 46.5F, 4, 1, 6, 0.0F, false));
		Stock_moving_thing.cubeList.add(new ModelBox(Stock_moving_thing, 55, 78, -1.0F, 2.25F, 47.5F, 1, 1, 5, 0.0F, false));

		Stock_butt = new ModelRenderer(this);
		Stock_butt.setRotationPoint(0.0F, 0.0F, 0.0F);
		Stock.addChild(Stock_butt);
		Stock_butt.cubeList.add(new ModelBox(Stock_butt, 0, 22, -4.5F, 3.5F, 64.5F, 4, 13, 1, 0.0F, false));
		Stock_butt.cubeList.add(new ModelBox(Stock_butt, 39, 39, -5.0F, 3.0F, 65.0F, 5, 14, 4, 0.0F, false));
		Stock_butt.cubeList.add(new ModelBox(Stock_butt, 0, 0, -0.75F, 12.0F, 65.75F, 1, 3, 2, 0.0F, false));
		Stock_butt.cubeList.add(new ModelBox(Stock_butt, 77, 60, -0.5F, 10.0F, 65.75F, 1, 2, 2, 0.0F, false));
		Stock_butt.cubeList.add(new ModelBox(Stock_butt, 43, 14, -4.5F, 16.5F, 69.0F, 4, 1, 4, 0.0F, false));
		Stock_butt.cubeList.add(new ModelBox(Stock_butt, 46, 78, -4.5F, 2.5F, 69.0F, 4, 1, 3, 0.0F, false));
		Stock_butt.cubeList.add(new ModelBox(Stock_butt, 16, 78, -5.0F, 15.5F, 69.0F, 5, 1, 3, 0.0F, false));
		Stock_butt.cubeList.add(new ModelBox(Stock_butt, 0, 78, -5.0F, 15.5F, 69.75F, 5, 1, 3, 0.0F, false));
		Stock_butt.cubeList.add(new ModelBox(Stock_butt, 20, 10, -5.0F, 3.5F, 69.0F, 5, 1, 3, 0.0F, false));
		Stock_butt.cubeList.add(new ModelBox(Stock_butt, 88, 24, -5.0F, 12.5F, 71.5F, 5, 3, 1, 0.0F, false));
		Stock_butt.cubeList.add(new ModelBox(Stock_butt, 88, 12, -5.0F, 9.5F, 71.25F, 5, 3, 1, 0.0F, false));
		Stock_butt.cubeList.add(new ModelBox(Stock_butt, 18, 22, -5.5F, 4.5F, 69.0F, 6, 11, 3, 0.0F, false));

		bone141 = new ModelRenderer(this);
		bone141.setRotationPoint(19.75F, 38.25F, 47.25F);
		Stock_butt.addChild(bone141);
		setRotationAngle(bone141, 0.0F, -0.7854F, 0.0F);
		bone141.cubeList.add(new ModelBox(bone141, 62, 78, -3.0F, -22.0F, 28.5F, 3, 2, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		whole_gripperoni.render(f5);
		berrl.render(f5);
		Stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
