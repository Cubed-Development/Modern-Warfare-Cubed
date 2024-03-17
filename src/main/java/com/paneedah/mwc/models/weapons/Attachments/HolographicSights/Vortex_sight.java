package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Vortex_sight extends ModelWithAttachments {
	private final ModelRenderer sight;
	private final ModelRenderer Shape140_r1;
	private final ModelRenderer Shape132_r1;
	private final ModelRenderer Shape131_r1;
	private final ModelRenderer Shape130_r1;
	private final ModelRenderer Shape129_r1;
	private final ModelRenderer Shape110_r1;
	private final ModelRenderer Shape103_r1;
	private final ModelRenderer Shape102_r1;
	private final ModelRenderer Shape101_r1;
	private final ModelRenderer Shape88_r1;
	private final ModelRenderer Shape87_r1;
	private final ModelRenderer Shape84_r1;
	private final ModelRenderer Shape77_r1;
	private final ModelRenderer Shape76_r1;
	private final ModelRenderer Shape74_r1;
	private final ModelRenderer Shape73_r1;
	private final ModelRenderer Shape72_r1;
	private final ModelRenderer Shape71_r1;
	private final ModelRenderer Shape70_r1;
	private final ModelRenderer Shape69_r1;
	private final ModelRenderer Shape68_r1;
	private final ModelRenderer Shape67_r1;
	private final ModelRenderer Shape66_r1;
	private final ModelRenderer Shape65_r1;
	private final ModelRenderer Shape64_r1;
	private final ModelRenderer Shape63_r1;
	private final ModelRenderer Shape61_r1;
	private final ModelRenderer Shape60_r1;
	private final ModelRenderer Shape59_r1;
	private final ModelRenderer Shape58_r1;
	private final ModelRenderer Shape57_r1;
	private final ModelRenderer Shape56_r1;
	private final ModelRenderer Shape55_r1;
	private final ModelRenderer Shape54_r1;
	private final ModelRenderer Shape53_r1;
	private final ModelRenderer Shape51_r1;
	private final ModelRenderer Shape49_r1;
	private final ModelRenderer Shape47_r1;
	private final ModelRenderer Shape46_r1;
	private final ModelRenderer Shape45_r1;
	private final ModelRenderer Shape40_r1;
	private final ModelRenderer Shape39_r1;
	private final ModelRenderer Shape38_r1;
	private final ModelRenderer Shape37_r1;
	private final ModelRenderer Shape36_r1;
	private final ModelRenderer Shape35_r1;
	private final ModelRenderer Shape34_r1;
	private final ModelRenderer Shape33_r1;
	private final ModelRenderer Shape32_r1;
	private final ModelRenderer Shape30_r1;
	private final ModelRenderer Shape28_r1;
	private final ModelRenderer Shape27_r1;
	private final ModelRenderer Shape26_r1;
	private final ModelRenderer Shape25_r1;
	private final ModelRenderer Shape22_r1;
	private final ModelRenderer Shape17_r1;
	private final ModelRenderer Shape8_r1;
	private final ModelRenderer Shape6_r1;
	private final ModelRenderer Shape5_r1;
	private final ModelRenderer Shape3_r1;
	private final ModelRenderer rail;

	public Vortex_sight() {
		textureWidth = 256;
		textureHeight = 128;

		sight = new ModelRenderer(this);
		sight.setRotationPoint(0.0F, 26.3236F, 3.7707F);
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.0F, -28.3236F, -1.7707F, 8, 6, 14, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.0F, -22.3236F, -1.7707F, 10, 1, 6, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 200, 100, 0.5F, -34.3236F, -1.7707F, 1, 6, 10, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 200, 100, 8.5F, -34.3236F, -1.7707F, 1, 6, 10, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.0F, -28.3236F, 12.2293F, 8, 6, 3, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.0F, -28.3236F, 13.6293F, 8, 1, 1, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 200, 100, 1.5F, -29.3236F, -1.7707F, 7, 1, 17, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 200, 100, 0.0F, -35.3236F, -3.7707F, 10, 1, 13, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 200, 100, 2.0F, -35.8236F, -3.7707F, 6, 1, 12, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 200, 100, 2.0F, -34.8236F, 13.9293F, 6, 1, 1, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 9.0F, -22.3236F, 8.2293F, 1, 1, 7, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.0F, -22.3236F, 4.2293F, 8, 1, 10, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 9.0F, -19.3236F, 8.2293F, 1, 1, 7, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 9.0F, -21.3236F, 11.2293F, 1, 2, 4, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 9.5F, -21.3236F, 7.2293F, 1, 2, 3, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.1F, -22.9236F, 6.2293F, 1, 4, 4, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 100, 100, 0.0F, -21.8236F, 7.2293F, 1, 2, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 25, 98, -0.2F, -26.8236F, 12.2293F, 1, 3, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.0F, -23.3236F, 3.2293F, 1, 1, 9, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.0F, -28.3236F, 10.2293F, 1, 5, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.0F, -25.3236F, 0.2293F, 1, 3, 3, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.0F, -27.3236F, 6.2293F, 1, 3, 3, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.0F, -24.3236F, 6.7293F, 1, 1, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.0F, -28.3236F, -1.7707F, 1, 1, 14, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.0F, -24.3236F, -0.7707F, 1, 2, 1, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.2F, -28.3236F, -1.7707F, 1, 6, 14, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 94, 80, -0.2F, -26.8236F, 6.7293F, 1, 2, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 112, 88, -0.2F, -24.8236F, 0.7293F, 1, 2, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.0F, -22.0236F, 0.2293F, 8, 1, 14, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -19.3236F, 4.2293F, 1, 1, 8, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 7.5F, -19.3236F, 4.2293F, 1, 1, 8, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 6.5F, -21.7236F, 3.2293F, 2, 1, 10, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -21.7236F, 3.2293F, 2, 1, 10, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 8.8F, -28.3236F, -1.7707F, 1, 6, 14, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 9.0F, -23.3236F, 0.2293F, 1, 1, 12, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 9.0F, -25.3236F, 1.2293F, 1, 3, 8, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 9.0F, -28.3236F, -1.7707F, 1, 1, 14, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 10.0F, -26.3236F, 3.2293F, 1, 4, 4, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 9.0F, -27.3236F, 2.2293F, 1, 2, 8, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 9.0F, -27.3236F, 11.2293F, 1, 4, 1, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 100, 120, 9.2F, -24.8236F, 1.7293F, 1, 1, 1, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 100, 120, 9.2F, -26.8236F, 7.7293F, 1, 1, 1, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 11.0F, -25.3236F, 4.2293F, 2, 2, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 11.0F, -25.3236F, 3.2293F, 1, 2, 1, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 11.0F, -25.3236F, 6.2293F, 1, 2, 1, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 11.0F, -26.3236F, 4.2293F, 1, 1, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 11.0F, -23.3236F, 4.2293F, 1, 1, 2, 0.0F, true));

		Shape140_r1 = new ModelRenderer(this);
		Shape140_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		sight.addChild(Shape140_r1);
		setRotationAngle(Shape140_r1, 0.1396F, 0.0F, 0.0F);
		Shape140_r1.cubeList.add(new ModelBox(Shape140_r1, 33, 96, 2.0F, -23.8F, 19.0F, 2, 2, 1, 0.0F, true));
		Shape140_r1.cubeList.add(new ModelBox(Shape140_r1, 0, 0, 6.0F, -24.8F, 18.5F, 1, 1, 1, 0.0F, true));
		Shape140_r1.cubeList.add(new ModelBox(Shape140_r1, 0, 0, 8.0F, -24.8F, 18.5F, 1, 3, 1, 0.0F, true));
		Shape140_r1.cubeList.add(new ModelBox(Shape140_r1, 0, 0, 3.0F, -24.8F, 18.5F, 1, 1, 1, 0.0F, true));
		Shape140_r1.cubeList.add(new ModelBox(Shape140_r1, 0, 0, 1.0F, -24.8F, 18.5F, 1, 3, 1, 0.0F, true));
		Shape140_r1.cubeList.add(new ModelBox(Shape140_r1, 0, 0, 4.0F, -23.8F, 18.5F, 2, 2, 1, 0.0F, true));
		Shape140_r1.cubeList.add(new ModelBox(Shape140_r1, 0, 0, 7.0F, -25.8F, 18.5F, 2, 1, 1, 0.0F, true));
		Shape140_r1.cubeList.add(new ModelBox(Shape140_r1, 0, 0, 1.0F, -25.8F, 18.5F, 2, 1, 1, 0.0F, true));
		Shape140_r1.cubeList.add(new ModelBox(Shape140_r1, 0, 0, 1.0F, -25.8F, 18.1F, 8, 4, 1, 0.0F, true));
		Shape140_r1.cubeList.add(new ModelBox(Shape140_r1, 24, 97, 6.0F, -23.8F, 19.0F, 2, 2, 1, 0.0F, true));

		Shape132_r1 = new ModelRenderer(this);
		Shape132_r1.setRotationPoint(-11.5424F, -17.7779F, -3.7707F);
		sight.addChild(Shape132_r1);
		setRotationAngle(Shape132_r1, 0.0F, 0.0F, 0.8203F);
		Shape132_r1.cubeList.add(new ModelBox(Shape132_r1, 0, 0, 11.9F, -21.5F, 8.0F, 1, 1, 2, 0.0F, true));

		Shape131_r1 = new ModelRenderer(this);
		Shape131_r1.setRotationPoint(-13.4558F, -17.8383F, -3.7707F);
		sight.addChild(Shape131_r1);
		setRotationAngle(Shape131_r1, 0.0F, 0.0F, 0.7854F);
		Shape131_r1.cubeList.add(new ModelBox(Shape131_r1, 0, 0, 12.2F, -24.0F, 8.0F, 1, 1, 2, 0.0F, true));

		Shape130_r1 = new ModelRenderer(this);
		Shape130_r1.setRotationPoint(-4.2635F, -2.3236F, 7.9364F);
		sight.addChild(Shape130_r1);
		setRotationAngle(Shape130_r1, 0.0F, 0.7854F, 0.0F);
		Shape130_r1.cubeList.add(new ModelBox(Shape130_r1, 0, 0, 12.2F, -23.0F, 10.0F, 1, 2, 1, 0.0F, true));

		Shape129_r1 = new ModelRenderer(this);
		Shape129_r1.setRotationPoint(-1.4947F, -2.3236F, 6.5298F);
		sight.addChild(Shape129_r1);
		setRotationAngle(Shape129_r1, 0.0F, 0.7679F, 0.0F);
		Shape129_r1.cubeList.add(new ModelBox(Shape129_r1, 0, 0, 11.0F, -23.0F, 7.3F, 1, 2, 1, 0.0F, true));

		Shape110_r1 = new ModelRenderer(this);
		Shape110_r1.setRotationPoint(0.0F, -2.519F, -0.1761F);
		sight.addChild(Shape110_r1);
		setRotationAngle(Shape110_r1, 0.1396F, 0.0F, 0.0F);
		Shape110_r1.cubeList.add(new ModelBox(Shape110_r1, 0, 0, 2.0F, -23.8F, 0.4F, 6, 1, 1, 0.0F, true));
		Shape110_r1.cubeList.add(new ModelBox(Shape110_r1, 0, 0, 1.0F, -25.8F, 0.4F, 8, 2, 1, 0.0F, true));
		Shape110_r1.cubeList.add(new ModelBox(Shape110_r1, 0, 0, 1.0F, -20.8F, 0.4F, 8, 1, 1, 0.0F, true));
		Shape110_r1.cubeList.add(new ModelBox(Shape110_r1, 0, 0, 9.0F, -25.8F, 0.4F, 1, 6, 1, 0.0F, true));
		Shape110_r1.cubeList.add(new ModelBox(Shape110_r1, 0, 0, 0.0F, -25.8F, 0.4F, 1, 6, 1, 0.0F, true));
		Shape110_r1.cubeList.add(new ModelBox(Shape110_r1, 0, 0, 0.0F, -25.8F, 0.7F, 10, 6, 1, 0.0F, true));
		Shape110_r1.cubeList.add(new ModelBox(Shape110_r1, 0, 0, 0.0F, -25.8F, 1.4F, 10, 6, 1, 0.0F, true));

		Shape103_r1 = new ModelRenderer(this);
		Shape103_r1.setRotationPoint(0.0F, -11.6988F, -10.3793F);
		sight.addChild(Shape103_r1);
		setRotationAngle(Shape103_r1, -0.4538F, 0.0F, 0.0F);
		Shape103_r1.cubeList.add(new ModelBox(Shape103_r1, 0, 0, 8.5F, -19.0F, 16.0F, 1, 3, 2, 0.0F, true));

		Shape102_r1 = new ModelRenderer(this);
		Shape102_r1.setRotationPoint(0.0F, -11.8F, -10.8176F);
		sight.addChild(Shape102_r1);
		setRotationAngle(Shape102_r1, -0.4538F, 0.0F, 0.0F);
		Shape102_r1.cubeList.add(new ModelBox(Shape102_r1, 0, 0, 0.5F, -19.0F, 16.0F, 1, 3, 2, 0.0F, true));

		Shape101_r1 = new ModelRenderer(this);
		Shape101_r1.setRotationPoint(0.0F, -12.5938F, -15.9658F);
		sight.addChild(Shape101_r1);
		setRotationAngle(Shape101_r1, -0.8029F, 0.0F, 0.0F);
		Shape101_r1.cubeList.add(new ModelBox(Shape101_r1, 0, 0, 0.5F, -20.5F, 5.0F, 1, 2, 5, 0.0F, true));
		Shape101_r1.cubeList.add(new ModelBox(Shape101_r1, 0, 0, 8.5F, -20.5F, 5.0F, 1, 2, 5, 0.0F, true));

		Shape88_r1 = new ModelRenderer(this);
		Shape88_r1.setRotationPoint(-7.2817F, -2.3236F, -0.5176F);
		sight.addChild(Shape88_r1);
		setRotationAngle(Shape88_r1, 0.0F, 0.8203F, 0.0F);
		Shape88_r1.cubeList.add(new ModelBox(Shape88_r1, 0, 0, 0.1F, -20.0F, 10.0F, 1, 3, 1, 0.0F, true));

		Shape87_r1 = new ModelRenderer(this);
		Shape87_r1.setRotationPoint(-6.7748F, -2.3236F, -1.9669F);
		sight.addChild(Shape87_r1);
		setRotationAngle(Shape87_r1, 0.0F, 0.5061F, 0.0F);
		Shape87_r1.cubeList.add(new ModelBox(Shape87_r1, 0, 0, 0.1F, -20.0F, 14.0F, 1, 3, 1, 0.0F, true));

		Shape84_r1 = new ModelRenderer(this);
		Shape84_r1.setRotationPoint(14.1545F, -10.1056F, -3.7707F);
		sight.addChild(Shape84_r1);
		setRotationAngle(Shape84_r1, 0.0F, 0.0F, -1.0297F);
		Shape84_r1.cubeList.add(new ModelBox(Shape84_r1, 0, 0, 0.3F, -16.6F, 10.0F, 1, 1, 4, 0.0F, true));

		Shape77_r1 = new ModelRenderer(this);
		Shape77_r1.setRotationPoint(-22.4082F, -13.5332F, -3.7707F);
		sight.addChild(Shape77_r1);
		setRotationAngle(Shape77_r1, 0.0F, 0.0F, 0.8029F);
		Shape77_r1.cubeList.add(new ModelBox(Shape77_r1, 200, 100, 1.3F, -32.0F, 14.0F, 1, 1, 2, 0.0F, true));

		Shape76_r1 = new ModelRenderer(this);
		Shape76_r1.setRotationPoint(-20.7919F, -17.9409F, -3.7707F);
		sight.addChild(Shape76_r1);
		setRotationAngle(Shape76_r1, 0.0F, 0.0F, 0.8029F);
		Shape76_r1.cubeList.add(new ModelBox(Shape76_r1, 200, 100, 8.0F, -32.7F, 14.0F, 1, 1, 2, 0.0F, true));
		Shape76_r1.cubeList.add(new ModelBox(Shape76_r1, 200, 100, 8.0F, -32.9F, 12.0F, 1, 1, 2, 0.0F, true));

		Shape74_r1 = new ModelRenderer(this);
		Shape74_r1.setRotationPoint(-22.624F, -13.6248F, -3.7707F);
		sight.addChild(Shape74_r1);
		setRotationAngle(Shape74_r1, 0.0F, 0.0F, 0.8029F);
		Shape74_r1.cubeList.add(new ModelBox(Shape74_r1, 200, 100, 1.4F, -32.3F, 12.0F, 1, 1, 2, 0.0F, true));

		Shape73_r1 = new ModelRenderer(this);
		Shape73_r1.setRotationPoint(-17.6072F, -16.8437F, -3.7707F);
		sight.addChild(Shape73_r1);
		setRotationAngle(Shape73_r1, 0.0F, 0.0F, 0.8029F);
		Shape73_r1.cubeList.add(new ModelBox(Shape73_r1, 200, 100, 8.5F, -27.7F, 15.0F, 1, 1, 2, 0.0F, true));

		Shape72_r1 = new ModelRenderer(this);
		Shape72_r1.setRotationPoint(-17.4558F, -16.1815F, -3.7707F);
		sight.addChild(Shape72_r1);
		setRotationAngle(Shape72_r1, 0.0F, 0.0F, 0.7854F);
		Shape72_r1.cubeList.add(new ModelBox(Shape72_r1, 200, 100, 8.5F, -28.0F, 13.0F, 1, 1, 2, 0.0F, true));

		Shape71_r1 = new ModelRenderer(this);
		Shape71_r1.setRotationPoint(-19.1546F, -12.0803F, -3.7707F);
		sight.addChild(Shape71_r1);
		setRotationAngle(Shape71_r1, 0.0F, 0.0F, 0.7854F);
		Shape71_r1.cubeList.add(new ModelBox(Shape71_r1, 200, 100, 2.2F, -27.4F, 15.0F, 1, 1, 2, 0.0F, true));

		Shape70_r1 = new ModelRenderer(this);
		Shape70_r1.setRotationPoint(-19.2132F, -11.9388F, -3.7707F);
		sight.addChild(Shape70_r1);
		setRotationAngle(Shape70_r1, 0.0F, 0.0F, 0.7854F);
		Shape70_r1.cubeList.add(new ModelBox(Shape70_r1, 200, 100, 2.0F, -27.4F, 13.0F, 1, 1, 2, 0.0F, true));

		Shape69_r1 = new ModelRenderer(this);
		Shape69_r1.setRotationPoint(7.5717F, -1.4483F, -3.7707F);
		sight.addChild(Shape69_r1);
		setRotationAngle(Shape69_r1, 0.0F, 0.0F, -0.2793F);
		Shape69_r1.cubeList.add(new ModelBox(Shape69_r1, 200, 100, 7.9F, -27.0F, 17.0F, 1, 2, 2, 0.0F, true));

		Shape68_r1 = new ModelRenderer(this);
		Shape68_r1.setRotationPoint(14.2258F, -1.9165F, -3.7707F);
		sight.addChild(Shape68_r1);
		setRotationAngle(Shape68_r1, 0.0F, 0.0F, -0.5061F);
		Shape68_r1.cubeList.add(new ModelBox(Shape68_r1, 200, 100, 7.9F, -27.3F, 15.0F, 1, 2, 2, 0.0F, true));

		Shape67_r1 = new ModelRenderer(this);
		Shape67_r1.setRotationPoint(14.0946F, -1.6239F, -3.7707F);
		sight.addChild(Shape67_r1);
		setRotationAngle(Shape67_r1, 0.0F, 0.0F, -0.5061F);
		Shape67_r1.cubeList.add(new ModelBox(Shape67_r1, 200, 100, 8.4F, -27.4F, 13.0F, 1, 2, 2, 0.0F, true));

		Shape66_r1 = new ModelRenderer(this);
		Shape66_r1.setRotationPoint(-9.6433F, -6.6385F, -3.7707F);
		sight.addChild(Shape66_r1);
		setRotationAngle(Shape66_r1, 0.0F, 0.0F, 0.3142F);
		Shape66_r1.cubeList.add(new ModelBox(Shape66_r1, 200, 100, 8.8F, -32.4F, 14.7F, 1, 2, 4, 0.0F, true));

		Shape65_r1 = new ModelRenderer(this);
		Shape65_r1.setRotationPoint(-8.2085F, -5.774F, -3.7707F);
		sight.addChild(Shape65_r1);
		setRotationAngle(Shape65_r1, 0.0F, 0.0F, 0.2618F);
		Shape65_r1.cubeList.add(new ModelBox(Shape65_r1, 200, 100, 9.0F, -32.9F, 11.0F, 1, 2, 4, 0.0F, true));

		Shape64_r1 = new ModelRenderer(this);
		Shape64_r1.setRotationPoint(-2.8108F, -3.1449F, -3.7707F);
		sight.addChild(Shape64_r1);
		setRotationAngle(Shape64_r1, 0.0F, 0.0F, 0.0873F);
		Shape64_r1.cubeList.add(new ModelBox(Shape64_r1, 200, 100, 8.0F, -32.5F, 17.7F, 1, 1, 1, 0.0F, true));

		Shape63_r1 = new ModelRenderer(this);
		Shape63_r1.setRotationPoint(0.0F, -0.3297F, -0.3704F);
		sight.addChild(Shape63_r1);
		setRotationAngle(Shape63_r1, 0.1222F, 0.0F, 0.0F);
		Shape63_r1.cubeList.add(new ModelBox(Shape63_r1, 200, 100, 7.7F, -31.7F, 18.3F, 1, 6, 1, 0.0F, true));
		Shape63_r1.cubeList.add(new ModelBox(Shape63_r1, 200, 100, 1.3F, -31.7F, 18.3F, 1, 6, 1, 0.0F, true));
		Shape63_r1.cubeList.add(new ModelBox(Shape63_r1, 200, 100, 1.5F, -26.8F, 18.3F, 6, 1, 1, 0.0F, true));
		Shape63_r1.cubeList.add(new ModelBox(Shape63_r1, 200, 100, 7.5F, -31.8F, 18.3F, 1, 6, 1, 0.0F, true));
		Shape63_r1.cubeList.add(new ModelBox(Shape63_r1, 200, 100, 1.5F, -31.8F, 18.3F, 1, 6, 1, 0.0F, true));

		Shape61_r1 = new ModelRenderer(this);
		Shape61_r1.setRotationPoint(-12.9787F, -5.9388F, -3.7707F);
		sight.addChild(Shape61_r1);
		setRotationAngle(Shape61_r1, 0.0F, 0.0F, 0.5061F);
		Shape61_r1.cubeList.add(new ModelBox(Shape61_r1, 200, 100, 0.5F, -27.9F, 13.0F, 1, 2, 2, 0.0F, true));

		Shape60_r1 = new ModelRenderer(this);
		Shape60_r1.setRotationPoint(-13.1099F, -6.2313F, -3.7707F);
		sight.addChild(Shape60_r1);
		setRotationAngle(Shape60_r1, 0.0F, 0.0F, 0.5061F);
		Shape60_r1.cubeList.add(new ModelBox(Shape60_r1, 200, 100, 1.0F, -27.8F, 15.0F, 1, 2, 2, 0.0F, true));

		Shape59_r1 = new ModelRenderer(this);
		Shape59_r1.setRotationPoint(2.8364F, -2.3601F, -3.7707F);
		sight.addChild(Shape59_r1);
		setRotationAngle(Shape59_r1, 0.0F, 0.0F, -0.0873F);
		Shape59_r1.cubeList.add(new ModelBox(Shape59_r1, 200, 100, 1.0F, -32.4F, 17.7F, 1, 1, 1, 0.0F, true));

		Shape58_r1 = new ModelRenderer(this);
		Shape58_r1.setRotationPoint(7.084F, -2.9484F, -3.7707F);
		sight.addChild(Shape58_r1);
		setRotationAngle(Shape58_r1, 0.0F, 0.0F, -0.2269F);
		Shape58_r1.cubeList.add(new ModelBox(Shape58_r1, 200, 100, 0.8F, -31.4F, 16.7F, 1, 2, 2, 0.0F, true));

		Shape57_r1 = new ModelRenderer(this);
		Shape57_r1.setRotationPoint(8.4375F, -3.4344F, -3.7707F);
		sight.addChild(Shape57_r1);
		setRotationAngle(Shape57_r1, 0.0F, 0.0F, -0.2618F);
		Shape57_r1.cubeList.add(new ModelBox(Shape57_r1, 200, 100, 0.0F, -32.6F, 11.0F, 1, 2, 4, 0.0F, true));

		Shape56_r1 = new ModelRenderer(this);
		Shape56_r1.setRotationPoint(9.991F, -3.8427F, -3.7707F);
		sight.addChild(Shape56_r1);
		setRotationAngle(Shape56_r1, 0.0F, 0.0F, -0.3142F);
		Shape56_r1.cubeList.add(new ModelBox(Shape56_r1, 200, 100, 0.2F, -32.1F, 14.7F, 1, 2, 4, 0.0F, true));

		Shape55_r1 = new ModelRenderer(this);
		Shape55_r1.setRotationPoint(0.0F, -5.3602F, -9.2793F);
		sight.addChild(Shape55_r1);
		setRotationAngle(Shape55_r1, -0.1745F, 0.0F, 0.0F);
		Shape55_r1.cubeList.add(new ModelBox(Shape55_r1, 200, 100, 1.5F, -33.0F, 17.6F, 7, 1, 1, 0.0F, true));

		Shape54_r1 = new ModelRenderer(this);
		Shape54_r1.setRotationPoint(-7.5172F, -3.4363F, -3.7707F);
		sight.addChild(Shape54_r1);
		setRotationAngle(Shape54_r1, 0.0F, 0.0F, 0.2793F);
		Shape54_r1.cubeList.add(new ModelBox(Shape54_r1, 200, 100, 1.2F, -27.8F, 17.0F, 1, 2, 2, 0.0F, true));

		Shape53_r1 = new ModelRenderer(this);
		Shape53_r1.setRotationPoint(0.0F, -5.2288F, -9.9423F);
		sight.addChild(Shape53_r1);
		setRotationAngle(Shape53_r1, -0.192F, 0.0F, 0.0F);
		Shape53_r1.cubeList.add(new ModelBox(Shape53_r1, 200, 100, 1.0F, -33.5F, 12.0F, 8, 1, 6, 0.0F, true));

		Shape51_r1 = new ModelRenderer(this);
		Shape51_r1.setRotationPoint(0.0F, -4.9163F, -9.4056F);
		sight.addChild(Shape51_r1);
		setRotationAngle(Shape51_r1, -0.1745F, 0.0F, 0.0F);
		Shape51_r1.cubeList.add(new ModelBox(Shape51_r1, 200, 100, 2.0F, -33.5F, 12.0F, 6, 1, 6, 0.0F, true));

		Shape49_r1 = new ModelRenderer(this);
		Shape49_r1.setRotationPoint(0.0F, -3.4947F, -6.5925F);
		sight.addChild(Shape49_r1);
		setRotationAngle(Shape49_r1, -0.0873F, 0.0F, 0.0F);
		Shape49_r1.cubeList.add(new ModelBox(Shape49_r1, 200, 100, 2.0F, -32.9F, 17.7F, 6, 1, 1, 0.0F, true));
		Shape49_r1.cubeList.add(new ModelBox(Shape49_r1, 200, 100, 2.0F, -32.9F, 14.0F, 6, 1, 4, 0.0F, true));
		Shape49_r1.cubeList.add(new ModelBox(Shape49_r1, 200, 100, 2.0F, -32.9F, 12.0F, 6, 1, 2, 0.0F, true));

		Shape47_r1 = new ModelRenderer(this);
		Shape47_r1.setRotationPoint(1.9819F, -2.3236F, -4.9527F);
		sight.addChild(Shape47_r1);
		setRotationAngle(Shape47_r1, 0.0F, -0.1571F, 0.0F);
		Shape47_r1.cubeList.add(new ModelBox(Shape47_r1, 200, 100, 8.5F, -32.0F, 17.5F, 1, 6, 1, 0.0F, true));

		Shape46_r1 = new ModelRenderer(this);
		Shape46_r1.setRotationPoint(1.9662F, -2.3236F, -4.9539F);
		sight.addChild(Shape46_r1);
		setRotationAngle(Shape46_r1, 0.0F, -0.1571F, 0.0F);
		Shape46_r1.cubeList.add(new ModelBox(Shape46_r1, 200, 100, 8.5F, -32.0F, 11.9F, 1, 6, 6, 0.0F, true));

		Shape45_r1 = new ModelRenderer(this);
		Shape45_r1.setRotationPoint(-1.8711F, -2.3236F, -3.5447F);
		sight.addChild(Shape45_r1);
		setRotationAngle(Shape45_r1, 0.0F, 0.1571F, 0.0F);
		Shape45_r1.cubeList.add(new ModelBox(Shape45_r1, 200, 100, 0.5F, -32.0F, 17.5F, 1, 6, 1, 0.0F, false));
		Shape45_r1.cubeList.add(new ModelBox(Shape45_r1, 200, 100, 0.5F, -32.0F, 12.0F, 1, 6, 6, 0.0F, true));

		Shape40_r1 = new ModelRenderer(this);
		Shape40_r1.setRotationPoint(22.8324F, -11.2012F, -3.7707F);
		sight.addChild(Shape40_r1);
		setRotationAngle(Shape40_r1, 0.0F, 0.0F, -0.7854F);
		Shape40_r1.cubeList.add(new ModelBox(Shape40_r1, 200, 100, 0.7F, -32.0F, 1.0F, 1, 1, 12, 0.0F, true));

		Shape39_r1 = new ModelRenderer(this);
		Shape39_r1.setRotationPoint(24.912F, -6.1808F, -3.7707F);
		sight.addChild(Shape39_r1);
		setRotationAngle(Shape39_r1, 0.0F, 0.0F, -0.7854F);
		Shape39_r1.cubeList.add(new ModelBox(Shape39_r1, 200, 100, 7.8F, -32.0F, 1.0F, 1, 1, 12, 0.0F, true));

		Shape38_r1 = new ModelRenderer(this);
		Shape38_r1.setRotationPoint(21.3765F, -4.7163F, -3.7707F);
		sight.addChild(Shape38_r1);
		setRotationAngle(Shape38_r1, 0.0F, 0.0F, -0.7854F);
		Shape38_r1.cubeList.add(new ModelBox(Shape38_r1, 200, 100, 7.8F, -27.0F, 2.0F, 1, 1, 12, 0.0F, true));

		Shape37_r1 = new ModelRenderer(this);
		Shape37_r1.setRotationPoint(19.2969F, -9.7368F, -3.7707F);
		sight.addChild(Shape37_r1);
		setRotationAngle(Shape37_r1, 0.0F, 0.0F, -0.7854F);
		Shape37_r1.cubeList.add(new ModelBox(Shape37_r1, 200, 100, 0.7F, -27.0F, 2.0F, 1, 1, 11, 0.0F, true));

		Shape36_r1 = new ModelRenderer(this);
		Shape36_r1.setRotationPoint(-7.5467F, -5.4604F, -3.7707F);
		sight.addChild(Shape36_r1);
		setRotationAngle(Shape36_r1, 0.0F, 0.0F, 0.2443F);
		Shape36_r1.cubeList.add(new ModelBox(Shape36_r1, 200, 100, 9.0F, -32.3F, 0.7F, 1, 2, 11, 0.0F, true));

		Shape35_r1 = new ModelRenderer(this);
		Shape35_r1.setRotationPoint(7.7415F, -3.2742F, -3.7707F);
		sight.addChild(Shape35_r1);
		setRotationAngle(Shape35_r1, 0.0F, 0.0F, -0.2443F);
		Shape35_r1.cubeList.add(new ModelBox(Shape35_r1, 200, 100, 0.0F, -32.0F, 0.7F, 1, 2, 11, 0.0F, true));

		Shape34_r1 = new ModelRenderer(this);
		Shape34_r1.setRotationPoint(-12.8943F, -5.8652F, -3.7707F);
		sight.addChild(Shape34_r1);
		setRotationAngle(Shape34_r1, 0.0F, 0.0F, 0.5061F);
		Shape34_r1.cubeList.add(new ModelBox(Shape34_r1, 200, 100, 0.4F, -26.9F, 2.0F, 1, 1, 11, 0.0F, true));

		Shape33_r1 = new ModelRenderer(this);
		Shape33_r1.setRotationPoint(38.9893F, -19.6258F, -3.7707F);
		sight.addChild(Shape33_r1);
		setRotationAngle(Shape33_r1, 0.0F, 0.0F, -1.3788F);
		Shape33_r1.cubeList.add(new ModelBox(Shape33_r1, 200, 100, 9.0F, -33.5F, 0.0F, 1, 2, 12, 0.0F, true));

		Shape32_r1 = new ModelRenderer(this);
		Shape32_r1.setRotationPoint(-31.879F, -30.2513F, -3.7707F);
		sight.addChild(Shape32_r1);
		setRotationAngle(Shape32_r1, 0.0F, 0.0F, 1.3788F);
		Shape32_r1.cubeList.add(new ModelBox(Shape32_r1, 200, 100, 1.0F, -34.3F, 0.0F, 1, 2, 12, 0.0F, true));

		Shape30_r1 = new ModelRenderer(this);
		Shape30_r1.setRotationPoint(0.0F, -3.3159F, 4.3664F);
		sight.addChild(Shape30_r1);
		setRotationAngle(Shape30_r1, 0.2618F, 0.0F, 0.0F);
		Shape30_r1.cubeList.add(new ModelBox(Shape30_r1, 200, 100, 8.5F, -32.4F, 0.3F, 1, 7, 2, 0.0F, true));
		Shape30_r1.cubeList.add(new ModelBox(Shape30_r1, 200, 100, 0.5F, -32.4F, 0.3F, 1, 7, 2, 0.0F, true));

		Shape28_r1 = new ModelRenderer(this);
		Shape28_r1.setRotationPoint(0.0F, -7.0159F, 11.4705F);
		sight.addChild(Shape28_r1);
		setRotationAngle(Shape28_r1, 0.6283F, 0.0F, 0.0F);
		Shape28_r1.cubeList.add(new ModelBox(Shape28_r1, 200, 100, 0.5F, -25.8F, 0.4F, 9, 2, 2, 0.0F, true));

		Shape27_r1 = new ModelRenderer(this);
		Shape27_r1.setRotationPoint(13.7569F, -1.3297F, -3.7707F);
		sight.addChild(Shape27_r1);
		setRotationAngle(Shape27_r1, 0.0F, 0.0F, -0.5061F);
		Shape27_r1.cubeList.add(new ModelBox(Shape27_r1, 200, 100, 8.8F, -26.4F, 2.0F, 1, 1, 11, 0.0F, true));

		Shape26_r1 = new ModelRenderer(this);
		Shape26_r1.setRotationPoint(3.2165F, -2.3236F, -5.1749F);
		sight.addChild(Shape26_r1);
		setRotationAngle(Shape26_r1, 0.0F, -0.192F, 0.0F);
		Shape26_r1.cubeList.add(new ModelBox(Shape26_r1, 0, 0, 8.7F, -21.0F, 14.8F, 1, 1, 4, 0.0F, true));

		Shape25_r1 = new ModelRenderer(this);
		Shape25_r1.setRotationPoint(3.5211F, -2.3236F, -5.2715F);
		sight.addChild(Shape25_r1);
		setRotationAngle(Shape25_r1, 0.0F, -0.2094F, 0.0F);
		Shape25_r1.cubeList.add(new ModelBox(Shape25_r1, 0, 0, 8.9F, -22.0F, 15.4F, 1, 1, 4, 0.0F, true));

		Shape22_r1 = new ModelRenderer(this);
		Shape22_r1.setRotationPoint(4.1381F, -2.3236F, -5.4727F);
		sight.addChild(Shape22_r1);
		setRotationAngle(Shape22_r1, 0.0F, -0.2443F, 0.0F);
		Shape22_r1.cubeList.add(new ModelBox(Shape22_r1, 0, 0, 9.0F, -23.0F, 15.8F, 1, 1, 4, 0.0F, true));
		Shape22_r1.cubeList.add(new ModelBox(Shape22_r1, 0, 0, 9.0F, -26.0F, 15.3F, 1, 1, 4, 0.0F, true));
		Shape22_r1.cubeList.add(new ModelBox(Shape22_r1, 0, 0, 9.0F, -25.0F, 15.5F, 1, 1, 4, 0.0F, true));
		Shape22_r1.cubeList.add(new ModelBox(Shape22_r1, 0, 0, 9.0F, -24.0F, 15.6F, 1, 1, 4, 0.0F, true));

		Shape17_r1 = new ModelRenderer(this);
		Shape17_r1.setRotationPoint(-3.5992F, -2.3236F, -3.3606F);
		sight.addChild(Shape17_r1);
		setRotationAngle(Shape17_r1, 0.0F, 0.2269F, 0.0F);
		Shape17_r1.cubeList.add(new ModelBox(Shape17_r1, 0, 0, 0.0F, -26.0F, 15.6F, 1, 1, 4, 0.0F, true));
		Shape17_r1.cubeList.add(new ModelBox(Shape17_r1, 0, 0, 0.0F, -25.0F, 15.7F, 1, 1, 4, 0.0F, true));
		Shape17_r1.cubeList.add(new ModelBox(Shape17_r1, 0, 0, 0.2F, -21.0F, 15.1F, 1, 1, 4, 0.0F, true));
		Shape17_r1.cubeList.add(new ModelBox(Shape17_r1, 0, 0, 0.1F, -22.0F, 15.6F, 1, 1, 4, 0.0F, true));
		Shape17_r1.cubeList.add(new ModelBox(Shape17_r1, 0, 0, 0.0F, -23.0F, 16.0F, 1, 1, 4, 0.0F, true));
		Shape17_r1.cubeList.add(new ModelBox(Shape17_r1, 0, 0, 0.0F, -24.0F, 15.9F, 1, 1, 4, 0.0F, true));

		Shape8_r1 = new ModelRenderer(this);
		Shape8_r1.setRotationPoint(0.0F, -1.06F, 5.7558F);
		sight.addChild(Shape8_r1);
		setRotationAngle(Shape8_r1, 0.4538F, 0.0F, 0.0F);
		Shape8_r1.cubeList.add(new ModelBox(Shape8_r1, 0, 0, 0.0F, -20.0F, 7.5F, 10, 1, 2, 0.0F, true));

		Shape6_r1 = new ModelRenderer(this);
		Shape6_r1.setRotationPoint(0.0F, -11.0795F, -10.8158F);
		sight.addChild(Shape6_r1);
		setRotationAngle(Shape6_r1, -0.384F, 0.0F, 0.0F);
		Shape6_r1.cubeList.add(new ModelBox(Shape6_r1, 0, 0, 1.0F, -22.5F, 18.2F, 8, 1, 2, 0.0F, true));

		Shape5_r1 = new ModelRenderer(this);
		Shape5_r1.setRotationPoint(0.0F, -14.8479F, -12.3118F);
		sight.addChild(Shape5_r1);
		setRotationAngle(Shape5_r1, -0.5236F, 0.0F, 0.0F);
		Shape5_r1.cubeList.add(new ModelBox(Shape5_r1, 0, 0, 1.0F, -22.2F, 19.1F, 8, 2, 1, 0.0F, true));

		Shape3_r1 = new ModelRenderer(this);
		Shape3_r1.setRotationPoint(0.0F, -5.8417F, 8.4467F);
		sight.addChild(Shape3_r1);
		setRotationAngle(Shape3_r1, 0.6632F, 0.0F, 0.0F);
		Shape3_r1.cubeList.add(new ModelBox(Shape3_r1, 0, 0, 0.0F, -19.5F, 1.4F, 10, 1, 1, 0.0F, true));

		rail = new ModelRenderer(this);
		rail.setRotationPoint(0.0F, -2.3236F, -3.7707F);
		sight.addChild(rail);
		rail.cubeList.add(new ModelBox(rail, 0, 0, 0.5F, -21.0F, 8.0F, 1, 5, 8, 0.0F, true));
		rail.cubeList.add(new ModelBox(rail, 0, 0, 8.5F, -20.0F, 8.0F, 1, 4, 8, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}