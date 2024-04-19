package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PGMHecateIIBoltAction extends ModelWithAttachments {
	private final ModelRenderer boltaction;
	private final ModelRenderer bone96;
	private final ModelRenderer bone95;
	private final ModelRenderer bone93;
	private final ModelRenderer bone102;
	private final ModelRenderer bone103;
	private final ModelRenderer bone104;
	private final ModelRenderer bone94;
	private final ModelRenderer bone97;
	private final ModelRenderer bone98;
	private final ModelRenderer bone99;
	private final ModelRenderer bone100;
	private final ModelRenderer bone101;
	private final ModelRenderer bone108;
	private final ModelRenderer bone109;
	private final ModelRenderer bone107;
	private final ModelRenderer boltprime;
	private final ModelRenderer bone58;
	private final ModelRenderer bone68;

	public PGMHecateIIBoltAction() {
		textureWidth = 360;
		textureHeight = 360;

		boltaction = new ModelRenderer(this);
		boltaction.setRotationPoint(-1.0F, 27.0F, 53.5F);
		boltaction.cubeList.add(new ModelBox(boltaction, 56, 75, -1.25F, -43.75F, -61.499F, 1, 2, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 74, 36, -0.75F, -43.75F, -61.5F, 1, 2, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 44, 14, -1.0F, -44.0F, -61.501F, 1, 3, 1, 0.0F, false));

		bone96 = new ModelRenderer(this);
		bone96.setRotationPoint(-0.5F, -44.5F, -91.0F);
		boltaction.addChild(bone96);
		

		bone95 = new ModelRenderer(this);
		bone95.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone96.addChild(bone95);
		setRotationAngle(bone95, 0.0F, 0.0F, 1.117F);
		bone95.cubeList.add(new ModelBox(bone95, 193, 259, 0.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone95.cubeList.add(new ModelBox(bone95, 164, 258, -0.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone93 = new ModelRenderer(this);
		bone93.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone96.addChild(bone93);
		setRotationAngle(bone93, 0.0F, 0.0F, -1.117F);
		bone93.cubeList.add(new ModelBox(bone93, 260, 92, -1.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone93.cubeList.add(new ModelBox(bone93, 258, 0, -1.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone102 = new ModelRenderer(this);
		bone102.setRotationPoint(-0.5F, -41.5F, -91.0F);
		boltaction.addChild(bone102);
		setRotationAngle(bone102, 0.0F, 0.0F, -3.1416F);
		

		bone103 = new ModelRenderer(this);
		bone103.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone102.addChild(bone103);
		setRotationAngle(bone103, 0.0F, 0.0F, 1.117F);
		bone103.cubeList.add(new ModelBox(bone103, 232, 217, 0.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone103.cubeList.add(new ModelBox(bone103, 225, 185, -0.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone104 = new ModelRenderer(this);
		bone104.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone102.addChild(bone104);
		setRotationAngle(bone104, 0.0F, 0.0F, -1.117F);
		bone104.cubeList.add(new ModelBox(bone104, 225, 157, -1.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone104.cubeList.add(new ModelBox(bone104, 161, 224, -1.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone94 = new ModelRenderer(this);
		bone94.setRotationPoint(1.0F, -43.0F, -91.0F);
		boltaction.addChild(bone94);
		setRotationAngle(bone94, 0.0F, 0.0F, 1.5708F);
		

		bone97 = new ModelRenderer(this);
		bone97.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone94.addChild(bone97);
		setRotationAngle(bone97, 0.0F, 0.0F, 1.117F);
		bone97.cubeList.add(new ModelBox(bone97, 254, 176, 0.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone97.cubeList.add(new ModelBox(bone97, 254, 148, -0.001F, 0.1F, -26.002F, 1, 1, 27, 0.0F, false));

		bone98 = new ModelRenderer(this);
		bone98.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone94.addChild(bone98);
		setRotationAngle(bone98, 0.0F, 0.0F, -1.117F);
		bone98.cubeList.add(new ModelBox(bone98, 97, 254, -1.0F, 0.0F, -25.999F, 1, 1, 27, 0.0F, false));
		bone98.cubeList.add(new ModelBox(bone98, 68, 253, -1.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone99 = new ModelRenderer(this);
		bone99.setRotationPoint(-2.0F, -43.0F, -91.0F);
		boltaction.addChild(bone99);
		setRotationAngle(bone99, 0.0F, 0.0F, -1.5708F);
		

		bone100 = new ModelRenderer(this);
		bone100.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone99.addChild(bone100);
		setRotationAngle(bone100, 0.0F, 0.0F, 1.117F);
		bone100.cubeList.add(new ModelBox(bone100, 0, 253, 0.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone100.cubeList.add(new ModelBox(bone100, 135, 252, -0.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone101 = new ModelRenderer(this);
		bone101.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone99.addChild(bone101);
		setRotationAngle(bone101, 0.0F, 0.0F, -1.117F);
		bone101.cubeList.add(new ModelBox(bone101, 39, 252, -1.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone101.cubeList.add(new ModelBox(bone101, 244, 245, -1.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone108 = new ModelRenderer(this);
		bone108.setRotationPoint(0.25F, -41.75F, -61.501F);
		boltaction.addChild(bone108);
		setRotationAngle(bone108, 0.0F, 0.0F, 1.0472F);
		bone108.cubeList.add(new ModelBox(bone108, 25, 82, -1.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		bone109 = new ModelRenderer(this);
		bone109.setRotationPoint(-1.25F, -41.75F, -61.501F);
		boltaction.addChild(bone109);
		setRotationAngle(bone109, 0.0F, 0.0F, -1.0472F);
		bone109.cubeList.add(new ModelBox(bone109, 16, 82, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		bone107 = new ModelRenderer(this);
		bone107.setRotationPoint(0.2F, -43.2F, -61.25F);
		boltaction.addChild(bone107);
		setRotationAngle(bone107, 0.0F, 0.0F, -0.7854F);
		bone107.cubeList.add(new ModelBox(bone107, 82, 62, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		boltprime = new ModelRenderer(this);
		boltprime.setRotationPoint(-3.5F, -14.25F, -13.0F);
		setRotationAngle(boltprime, 0.0F, 0.0F, -0.48F);
		boltprime.cubeList.add(new ModelBox(boltprime, 74, 59, -0.463F, -1.4429F, -0.75F, 2, 1, 1, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 80, 26, -0.464F, -0.943F, -0.751F, 2, 1, 1, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 72, 78, -0.463F, -0.9429F, -0.25F, 2, 1, 1, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 76, 52, -0.464F, -1.443F, -0.251F, 2, 1, 1, 0.0F, false));

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(-2.0F, 0.5F, -0.5F);
		boltprime.addChild(bone58);
		bone58.cubeList.add(new ModelBox(bone58, 15, 30, -1.463F, -1.6929F, 0.0F, 3, 1, 1, 0.0F, false));

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(-4.0462F, 1.3387F, 0.25F);
		boltprime.addChild(bone68);
		bone68.cubeList.add(new ModelBox(bone68, 56, 70, -1.3339F, -3.0161F, -1.3F, 2, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		boltaction.render(f5);
		boltprime.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
