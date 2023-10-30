package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class StonerA1BELT extends ModelWithAttachments {
	private final ModelRenderer belt;
	private final ModelRenderer Belt18_r1;
	private final ModelRenderer Belt17_r1;
	private final ModelRenderer Belt16_r1;
	private final ModelRenderer Belt15_r1;
	private final ModelRenderer Belt14_r1;
	private final ModelRenderer Belt13_r1;
	private final ModelRenderer Belt12_r1;
	private final ModelRenderer Belt11_r1;
	private final ModelRenderer Belt10_r1;
	private final ModelRenderer Belt8_r1;
	private final ModelRenderer Belt7_r1;
	private final ModelRenderer Belt6_r1;
	private final ModelRenderer Belt5_r1;
	private final ModelRenderer Belt4_r1;
	private final ModelRenderer Belt3_r1;
	private final ModelRenderer Belt2_r1;
	private final ModelRenderer Belt1_r1;

	public StonerA1BELT() {
		textureWidth = 256;
		textureHeight = 256;

		belt = new ModelRenderer(this);
		belt.setRotationPoint(-23.221F, 11.9609F, 0.0F);
		belt.cubeList.add(new ModelBox(belt, 0, 200, 25.421F, -19.6609F, 43.5F, 1, 1, 7, 0.0F, true));

		Belt18_r1 = new ModelRenderer(this);
		Belt18_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		belt.addChild(Belt18_r1);
		setRotationAngle(Belt18_r1, 0.0F, 0.0F, 0.8551F);
		Belt18_r1.cubeList.add(new ModelBox(Belt18_r1, 0, 130, 1.6F, -31.5F, 45.5F, 1, 2, 4, 0.0F, true));

		Belt17_r1 = new ModelRenderer(this);
		Belt17_r1.setRotationPoint(-5.4308F, -17.0899F, 0.0F);
		belt.addChild(Belt17_r1);
		setRotationAngle(Belt17_r1, 0.0F, 0.0F, 1.3756F);
		Belt17_r1.cubeList.add(new ModelBox(Belt17_r1, 0, 130, 3.4F, -32.0F, 45.5F, 1, 2, 4, 0.0F, true));

		Belt16_r1 = new ModelRenderer(this);
		Belt16_r1.setRotationPoint(1.3016F, -34.1955F, 0.0F);
		belt.addChild(Belt16_r1);
		setRotationAngle(Belt16_r1, 0.0F, 0.0F, 1.8589F);
		Belt16_r1.cubeList.add(new ModelBox(Belt16_r1, 0, 130, 6.3F, -31.3F, 45.5F, 1, 3, 4, 0.0F, true));

		Belt15_r1 = new ModelRenderer(this);
		Belt15_r1.setRotationPoint(20.381F, -45.0029F, 0.0F);
		belt.addChild(Belt15_r1);
		setRotationAngle(Belt15_r1, 0.0F, 0.0F, 2.491F);
		Belt15_r1.cubeList.add(new ModelBox(Belt15_r1, 0, 130, 8.2F, -29.0F, 45.5F, 1, 3, 4, 0.0F, true));

		Belt14_r1 = new ModelRenderer(this);
		Belt14_r1.setRotationPoint(32.5396F, -42.4457F, 0.0F);
		belt.addChild(Belt14_r1);
		setRotationAngle(Belt14_r1, 0.0F, 0.0F, 2.8256F);
		Belt14_r1.cubeList.add(new ModelBox(Belt14_r1, 0, 130, 9.0F, -26.5F, 45.5F, 1, 3, 4, 0.0F, true));

		Belt13_r1 = new ModelRenderer(this);
		Belt13_r1.setRotationPoint(33.7066F, -37.6316F, 0.0F);
		belt.addChild(Belt13_r1);
		setRotationAngle(Belt13_r1, 0.0F, 0.0F, 2.8256F);
		Belt13_r1.cubeList.add(new ModelBox(Belt13_r1, 0, 130, 9.2F, -24.0F, 45.5F, 1, 3, 4, 0.0F, true));

		Belt12_r1 = new ModelRenderer(this);
		Belt12_r1.setRotationPoint(38.6469F, -32.5436F, 0.0F);
		belt.addChild(Belt12_r1);
		setRotationAngle(Belt12_r1, 0.0F, 0.0F, 2.9371F);
		Belt12_r1.cubeList.add(new ModelBox(Belt12_r1, 0, 130, 10.0F, -21.5F, 45.5F, 1, 3, 4, 0.0F, true));

		Belt11_r1 = new ModelRenderer(this);
		Belt11_r1.setRotationPoint(13.3038F, 10.1616F, 0.0F);
		belt.addChild(Belt11_r1);
		setRotationAngle(Belt11_r1, 0.0F, 0.0F, 0.3346F);
		Belt11_r1.cubeList.add(new ModelBox(Belt11_r1, 0, 200, 0.6F, -30.3F, 43.5F, 1, 1, 7, 0.0F, true));

		Belt10_r1 = new ModelRenderer(this);
		Belt10_r1.setRotationPoint(-1.2169F, -1.8173F, 0.0F);
		belt.addChild(Belt10_r1);
		setRotationAngle(Belt10_r1, 0.0F, 0.0F, 0.9295F);
		Belt10_r1.cubeList.add(new ModelBox(Belt10_r1, 0, 200, 1.6F, -31.3F, 43.5F, 1, 1, 7, 0.0F, true));

		Belt8_r1 = new ModelRenderer(this);
		Belt8_r1.setRotationPoint(-2.924F, -27.561F, 0.0F);
		belt.addChild(Belt8_r1);
		setRotationAngle(Belt8_r1, 0.0F, 0.0F, 1.673F);
		Belt8_r1.cubeList.add(new ModelBox(Belt8_r1, 0, 200, 4.8F, -31.6F, 43.5F, 1, 1, 7, 0.0F, true));

		Belt7_r1 = new ModelRenderer(this);
		Belt7_r1.setRotationPoint(7.2507F, -41.1888F, 0.0F);
		belt.addChild(Belt7_r1);
		setRotationAngle(Belt7_r1, 0.0F, 0.0F, 2.1564F);
		Belt7_r1.cubeList.add(new ModelBox(Belt7_r1, 0, 200, 6.3F, -30.9F, 43.5F, 1, 1, 7, 0.0F, true));

		Belt6_r1 = new ModelRenderer(this);
		Belt6_r1.setRotationPoint(9.5535F, -40.6248F, 0.0F);
		belt.addChild(Belt6_r1);
		setRotationAngle(Belt6_r1, 0.0F, 0.0F, 2.1564F);
		Belt6_r1.cubeList.add(new ModelBox(Belt6_r1, 0, 200, 7.3F, -30.0F, 43.5F, 1, 1, 7, 0.0F, true));

		Belt5_r1 = new ModelRenderer(this);
		Belt5_r1.setRotationPoint(23.6416F, -45.0771F, 0.0F);
		belt.addChild(Belt5_r1);
		setRotationAngle(Belt5_r1, 0.0F, 0.0F, 2.6025F);
		Belt5_r1.cubeList.add(new ModelBox(Belt5_r1, 0, 200, 8.1F, -28.5F, 43.5F, 1, 1, 7, 0.0F, true));

		Belt4_r1 = new ModelRenderer(this);
		Belt4_r1.setRotationPoint(25.7124F, -42.6492F, 0.0F);
		belt.addChild(Belt4_r1);
		setRotationAngle(Belt4_r1, 0.0F, 0.0F, 2.6025F);
		Belt4_r1.cubeList.add(new ModelBox(Belt4_r1, 0, 200, 8.8F, -27.0F, 43.5F, 1, 1, 7, 0.0F, true));

		Belt3_r1 = new ModelRenderer(this);
		Belt3_r1.setRotationPoint(30.8759F, -40.327F, 0.0F);
		belt.addChild(Belt3_r1);
		setRotationAngle(Belt3_r1, 0.0F, 0.0F, 2.7884F);
		Belt3_r1.cubeList.add(new ModelBox(Belt3_r1, 0, 200, 8.5F, -25.5F, 43.5F, 1, 1, 7, 0.0F, true));

		Belt2_r1 = new ModelRenderer(this);
		Belt2_r1.setRotationPoint(29.5101F, -37.4491F, 0.0F);
		belt.addChild(Belt2_r1);
		setRotationAngle(Belt2_r1, 0.0F, 0.0F, 2.6769F);
		Belt2_r1.cubeList.add(new ModelBox(Belt2_r1, 0, 200, 9.0F, -24.0F, 43.5F, 1, 1, 7, 0.0F, true));

		Belt1_r1 = new ModelRenderer(this);
		Belt1_r1.setRotationPoint(33.8519F, -34.858F, 0.0F);
		belt.addChild(Belt1_r1);
		setRotationAngle(Belt1_r1, 0.0F, 0.0F, 2.7884F);
		Belt1_r1.cubeList.add(new ModelBox(Belt1_r1, 0, 200, 9.5F, -22.5F, 43.5F, 1, 1, 7, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		belt.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
