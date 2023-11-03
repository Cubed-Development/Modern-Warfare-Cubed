package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60HandGuard extends ModelWithAttachments {
	private final ModelRenderer m60guard;
	private final ModelRenderer Guard33_r1;
	private final ModelRenderer Guard32_r1;
	private final ModelRenderer Guard30_r1;
	private final ModelRenderer Guard28_r1;
	private final ModelRenderer Guard26_r1;
	private final ModelRenderer Guard22_r1;
	private final ModelRenderer Guard20_r1;
	private final ModelRenderer Guard16_r1;
	private final ModelRenderer Guard15_r1;
	private final ModelRenderer Guard13_r1;
	private final ModelRenderer Guard12_r1;
	private final ModelRenderer Guard10_r1;
	private final ModelRenderer Guard9_r1;
	private final ModelRenderer Guard4_r1;
	private final ModelRenderer Guard3_r1;

	public M60HandGuard() {
		textureWidth = 340;
		textureHeight = 340;

		m60guard = new ModelRenderer(this);
		m60guard.setRotationPoint(-1.0F, -6.9311F, -53.1969F);
		m60guard.cubeList.add(new ModelBox(m60guard, 260, 0, -2.0F, -4.5689F, 0.1969F, 5, 5, 24, 0.0F, false));
		m60guard.cubeList.add(new ModelBox(m60guard, 0, 0, -1.0333F, -0.0689F, 0.1969F, 3, 1, 24, 0.0F, false));
		m60guard.cubeList.add(new ModelBox(m60guard, 20, 190, -2.5F, -9.5689F, 2.1969F, 1, 4, 16, 0.0F, false));
		m60guard.cubeList.add(new ModelBox(m60guard, 0, 81, -2.5F, -5.5689F, 0.1969F, 1, 1, 24, 0.0F, false));
		m60guard.cubeList.add(new ModelBox(m60guard, 56, 189, 2.5F, -9.5689F, 2.1969F, 1, 4, 16, 0.0F, false));
		m60guard.cubeList.add(new ModelBox(m60guard, 60, 25, 2.5F, -5.5689F, 0.1969F, 1, 1, 24, 0.0F, false));
		m60guard.cubeList.add(new ModelBox(m60guard, 168, 55, -2.2F, -1.5689F, 1.1969F, 1, 1, 22, 0.0F, false));
		m60guard.cubeList.add(new ModelBox(m60guard, 0, 165, 2.2F, -1.5689F, 1.1969F, 1, 1, 22, 0.0F, false));
		m60guard.cubeList.add(new ModelBox(m60guard, 166, 188, 2.8F, -9.7689F, 1.6969F, 1, 1, 17, 0.0F, false));
		m60guard.cubeList.add(new ModelBox(m60guard, 0, 188, -2.8F, -9.7689F, 1.6969F, 1, 1, 17, 0.0F, false));
		m60guard.cubeList.add(new ModelBox(m60guard, 96, 56, -2.5F, -6.8689F, 18.1969F, 1, 2, 6, 0.0F, false));
		m60guard.cubeList.add(new ModelBox(m60guard, 40, 81, 2.5F, -6.8689F, 18.1969F, 1, 2, 6, 0.0F, false));
		m60guard.cubeList.add(new ModelBox(m60guard, 0, 18, -2.0F, -1.0689F, -3.8031F, 5, 2, 4, 0.0F, false));
		m60guard.cubeList.add(new ModelBox(m60guard, 14, 18, -1.5F, 0.9311F, 4.1969F, 4, 3, 1, 0.0F, false));

		Guard33_r1 = new ModelRenderer(this);
		Guard33_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		m60guard.addChild(Guard33_r1);
		setRotationAngle(Guard33_r1, -1.2641F, 0.0F, 0.0F);
		Guard33_r1.cubeList.add(new ModelBox(Guard33_r1, 56, 70, -1.5F, -4.6F, 6.0F, 4, 1, 7, 0.0F, false));

		Guard32_r1 = new ModelRenderer(this);
		Guard32_r1.setRotationPoint(0.0F, 6.7731F, -1.2779F);
		m60guard.addChild(Guard32_r1);
		setRotationAngle(Guard32_r1, -0.3718F, 0.0F, 0.0F);
		Guard32_r1.cubeList.add(new ModelBox(Guard32_r1, 0, 8, -1.5F, -5.0F, 5.0F, 4, 1, 1, 0.0F, false));

		Guard30_r1 = new ModelRenderer(this);
		Guard30_r1.setRotationPoint(0.0F, 8.2867F, 2.4975F);
		m60guard.addChild(Guard30_r1);
		setRotationAngle(Guard30_r1, 0.2974F, 0.0F, 0.0F);
		Guard30_r1.cubeList.add(new ModelBox(Guard30_r1, 60, 25, -1.5F, -8.0F, -1.0F, 4, 13, 5, 0.0F, false));

		Guard28_r1 = new ModelRenderer(this);
		Guard28_r1.setRotationPoint(0.0F, 0.809F, 13.2189F);
		m60guard.addChild(Guard28_r1);
		setRotationAngle(Guard28_r1, 1.1154F, 0.0F, 0.0F);
		Guard28_r1.cubeList.add(new ModelBox(Guard28_r1, 0, 25, 2.5F, -14.5F, 0.0F, 1, 2, 4, 0.0F, false));
		Guard28_r1.cubeList.add(new ModelBox(Guard28_r1, 56, 56, -2.5F, -14.5F, 0.0F, 1, 2, 4, 0.0F, false));

		Guard26_r1 = new ModelRenderer(this);
		Guard26_r1.setRotationPoint(0.0F, -1.553F, -6.3387F);
		m60guard.addChild(Guard26_r1);
		setRotationAngle(Guard26_r1, -0.4833F, 0.0F, 0.0F);
		Guard26_r1.cubeList.add(new ModelBox(Guard26_r1, 40, 0, 2.5F, -18.5F, 18.0F, 1, 2, 6, 0.0F, false));
		Guard26_r1.cubeList.add(new ModelBox(Guard26_r1, 100, 25, -2.5F, -18.5F, 18.0F, 1, 2, 6, 0.0F, false));

		Guard22_r1 = new ModelRenderer(this);
		Guard22_r1.setRotationPoint(0.0F, -1.8083F, -6.3743F);
		m60guard.addChild(Guard22_r1);
		setRotationAngle(Guard22_r1, -0.4833F, 0.0F, 0.0F);
		Guard22_r1.cubeList.add(new ModelBox(Guard22_r1, 136, 143, -2.8F, -18.7F, 18.5F, 1, 1, 6, 0.0F, false));
		Guard22_r1.cubeList.add(new ModelBox(Guard22_r1, 8, 144, 2.8F, -18.7F, 18.5F, 1, 1, 6, 0.0F, false));

		Guard20_r1 = new ModelRenderer(this);
		Guard20_r1.setRotationPoint(0.0F, 7.1086F, -6.4939F);
		m60guard.addChild(Guard20_r1);
		setRotationAngle(Guard20_r1, -0.3718F, 0.0F, 0.0F);
		Guard20_r1.cubeList.add(new ModelBox(Guard20_r1, 12, 0, -2.8F, -18.7F, 1.5F, 1, 4, 1, 0.0F, false));
		Guard20_r1.cubeList.add(new ModelBox(Guard20_r1, 19, 0, 2.8F, -18.7F, 1.5F, 1, 4, 1, 0.0F, false));

		Guard16_r1 = new ModelRenderer(this);
		Guard16_r1.setRotationPoint(-2.3368F, 7.7877F, 0.1969F);
		m60guard.addChild(Guard16_r1);
		setRotationAngle(Guard16_r1, 0.0F, 0.0F, 0.2602F);
		Guard16_r1.cubeList.add(new ModelBox(Guard16_r1, 56, 136, 2.2F, -9.5F, 1.0F, 1, 1, 22, 0.0F, false));

		Guard15_r1 = new ModelRenderer(this);
		Guard15_r1.setRotationPoint(2.8096F, 9.4009F, 0.1969F);
		m60guard.addChild(Guard15_r1);
		setRotationAngle(Guard15_r1, 0.0F, 0.0F, -0.2602F);
		Guard15_r1.cubeList.add(new ModelBox(Guard15_r1, 112, 136, 2.2F, -11.5F, 1.0F, 1, 1, 22, 0.0F, false));

		Guard13_r1 = new ModelRenderer(this);
		Guard13_r1.setRotationPoint(-2.7759F, 9.1436F, 0.1969F);
		m60guard.addChild(Guard13_r1);
		setRotationAngle(Guard13_r1, 0.0F, 0.0F, 0.2602F);
		Guard13_r1.cubeList.add(new ModelBox(Guard13_r1, 56, 166, -2.2F, -11.5F, 1.0F, 1, 1, 22, 0.0F, false));

		Guard12_r1 = new ModelRenderer(this);
		Guard12_r1.setRotationPoint(2.3705F, 8.045F, 0.1969F);
		m60guard.addChild(Guard12_r1);
		setRotationAngle(Guard12_r1, 0.0F, 0.0F, -0.2602F);
		Guard12_r1.cubeList.add(new ModelBox(Guard12_r1, 112, 167, -2.2F, -9.5F, 1.0F, 1, 1, 22, 0.0F, false));

		Guard10_r1 = new ModelRenderer(this);
		Guard10_r1.setRotationPoint(7.5883F, -13.8816F, 0.1969F);
		m60guard.addChild(Guard10_r1);
		setRotationAngle(Guard10_r1, 0.0F, 0.0F, -2.1331F);
		Guard10_r1.cubeList.add(new ModelBox(Guard10_r1, 56, 56, -3.5F, -13.5F, 0.0F, 1, 1, 24, 0.0F, false));

		Guard9_r1 = new ModelRenderer(this);
		Guard9_r1.setRotationPoint(-6.0552F, -14.7276F, 0.1969F);
		m60guard.addChild(Guard9_r1);
		setRotationAngle(Guard9_r1, 0.0F, 0.0F, 2.1331F);
		Guard9_r1.cubeList.add(new ModelBox(Guard9_r1, 60, 0, 3.5F, -13.5F, 0.0F, 1, 1, 24, 0.0F, false));

		Guard4_r1 = new ModelRenderer(this);
		Guard4_r1.setRotationPoint(0.1393F, -7.1019F, 0.1969F);
		m60guard.addChild(Guard4_r1);
		setRotationAngle(Guard4_r1, 0.0F, 0.0F, 2.6769F);
		Guard4_r1.cubeList.add(new ModelBox(Guard4_r1, 56, 81, 0.9667F, -8.0F, 0.0F, 1, 1, 24, 0.0F, false));

		Guard3_r1 = new ModelRenderer(this);
		Guard3_r1.setRotationPoint(1.6284F, -6.6836F, 0.1969F);
		m60guard.addChild(Guard3_r1);
		setRotationAngle(Guard3_r1, 0.0F, 0.0F, -2.6769F);
		Guard3_r1.cubeList.add(new ModelBox(Guard3_r1, 0, 110, -1.0333F, -8.0F, 0.0F, 1, 1, 24, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		m60guard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}