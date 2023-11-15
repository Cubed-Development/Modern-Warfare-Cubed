package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DeskLeftAlt1 extends ModelBase implements IModernModel {
	private final ModelRenderer destkleftA1;
	private final ModelRenderer desk9_r1;
	private final ModelRenderer desk10_r1;

	public DeskLeftAlt1() {
		textureWidth = 256;
		textureHeight = 256;

		destkleftA1 = new ModelRenderer(this);
		destkleftA1.setRotationPoint(-3.3841F, 24.0F, 1.7085F);
		destkleftA1.cubeList.add(new ModelBox(destkleftA1, 0, 0, -3.6159F, -16.0F, 4.7915F, 15, 15, 1, 0.0F, true));
		destkleftA1.cubeList.add(new ModelBox(destkleftA1, 0, 0, -4.6159F, -16.0F, -8.2085F, 16, 4, 13, 0.0F, true));
		destkleftA1.cubeList.add(new ModelBox(destkleftA1, 0, 0, 3.3841F, -15.95F, -8.0085F, 2, 16, 13, 0.0F, true));
		destkleftA1.cubeList.add(new ModelBox(destkleftA1, 0, 0, -4.6159F, -15.95F, 3.8915F, 2, 16, 2, 0.0F, true));
		destkleftA1.cubeList.add(new ModelBox(destkleftA1, 0, 0, 9.3841F, -15.95F, -8.0085F, 2, 16, 13, 0.0F, true));
		destkleftA1.cubeList.add(new ModelBox(destkleftA1, 0, 0, 5.3841F, -15.95F, -7.8085F, 4, 16, 13, 0.0F, true));

		desk9_r1 = new ModelRenderer(this);
		desk9_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		destkleftA1.addChild(desk9_r1);
		setRotationAngle(desk9_r1, 0.0F, -0.5205F, 0.0F);
		desk9_r1.cubeList.add(new ModelBox(desk9_r1, 0, 50, -3.9F, -7.0F, -5.5F, 3, 7, 1, 0.0F, true));
		desk9_r1.cubeList.add(new ModelBox(desk9_r1, 0, 50, -0.9F, -7.0F, -5.5F, 1, 7, 5, 0.0F, true));
		desk9_r1.cubeList.add(new ModelBox(desk9_r1, 0, 50, -4.9F, -7.0F, -5.5F, 1, 7, 5, 0.0F, true));

		desk10_r1 = new ModelRenderer(this);
		desk10_r1.setRotationPoint(3.3841F, 0.0F, -1.7085F);
		destkleftA1.addChild(desk10_r1);
		setRotationAngle(desk10_r1, 0.0F, -0.5205F, 0.0F);
		desk10_r1.cubeList.add(new ModelBox(desk10_r1, 0, 50, -6.0F, -7.0F, 1.7F, 3, 7, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		destkleftA1.render(f5);
	}
}