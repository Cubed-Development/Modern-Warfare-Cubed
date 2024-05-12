package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACRStock extends ModelWithAttachments {
	private final ModelRenderer stock;
	private final ModelRenderer ACR246_r1_r1;
	private final ModelRenderer ACR247_r1_r1;
	private final ModelRenderer stock_r1;
	private final ModelRenderer ACR176_r1;
	private final ModelRenderer ACR262_r1;
	private final ModelRenderer ACR261_r1;
	private final ModelRenderer ACR260_r1;
	private final ModelRenderer ACR259_r1;
	private final ModelRenderer ACR258_r1;
	private final ModelRenderer ACR257_r1;
	private final ModelRenderer ACR256_r1;
	private final ModelRenderer ACR255_r1;
	private final ModelRenderer ACR253_r1;
	private final ModelRenderer ACR252_r1;
	private final ModelRenderer ACR243_r1;
	private final ModelRenderer ACR241_r1;
	private final ModelRenderer ACR240_r1;
	private final ModelRenderer ACR239_r1;
	private final ModelRenderer ACR239_r1_r1;
	private final ModelRenderer ACR234_r1;
	private final ModelRenderer ACR233_r1;
	private final ModelRenderer ACR232_r1;
	private final ModelRenderer ACR231_r1;
	private final ModelRenderer ACR2211_r1;
	private final ModelRenderer ACR220_r1;
	private final ModelRenderer ACR219_r1;
	private final ModelRenderer ACR218_r1;
	private final ModelRenderer ACR217_r1;
	private final ModelRenderer ACR214_r1;
	private final ModelRenderer ACR213_r1;
	private final ModelRenderer ACR209_r1;
	private final ModelRenderer ACR208_r1;
	private final ModelRenderer ACR205_r1;
	private final ModelRenderer ACR204_r1;
	private final ModelRenderer ACR203_r1;
	private final ModelRenderer ACR202_r1;
	private final ModelRenderer ACR194_r1;
	private final ModelRenderer ACR190_r1;
	private final ModelRenderer ACR189_r1;
	private final ModelRenderer ACR188_r1;
	private final ModelRenderer ACR187_r1;
	private final ModelRenderer ACR186_r1;
	private final ModelRenderer ACR178_r1;

	public ACRStock() {
		textureWidth = 380;
		textureHeight = 380;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(-1.5485F, -11.9706F, 12.859F);
		stock.cubeList.add(new ModelBox(stock, 150, 49, -1.2515F, -4.8294F, -8.959F, 2, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 123, 146, 0.3485F, -4.8294F, -8.959F, 1, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 109, 164, -0.8515F, -3.8294F, -10.159F, 3, 3, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 131, 83, -2.0515F, -3.8294F, -10.159F, 2, 3, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 138, 157, -0.8015F, -1.4294F, -10.659F, 3, 3, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 157, 38, -2.0515F, -1.4294F, -10.659F, 3, 3, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 154, -1.4515F, -1.0794F, -10.659F, 3, 3, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 163, 111, 1.7485F, -2.8294F, -9.859F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 100, 163, 1.7485F, 0.1706F, -9.859F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 20, 67, 2.1485F, -2.3294F, -9.859F, 1, 3, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 141, 94, -0.8515F, -1.4294F, -6.559F, 3, 3, 14, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 141, 63, -2.0515F, -1.4294F, -6.559F, 3, 3, 14, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 187, 53, -1.4515F, -1.0794F, -6.559F, 3, 3, 12, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 37, 138, 1.4485F, -1.2294F, -5.559F, 1, 2, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 22, 138, -2.3515F, -1.2294F, -5.559F, 1, 2, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 77, 164, 1.4485F, -1.4294F, -5.559F, 1, 1, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 163, 133, -2.3515F, -1.4294F, -5.559F, 1, 1, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 33, 76, -2.4515F, -0.3294F, -3.059F, 5, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 92, 163, -2.2515F, 0.6706F, -4.759F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 86, 163, 1.3485F, 0.6706F, -4.759F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 21, 46, -0.8515F, -1.4294F, 7.441F, 3, 10, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 132, 31, -2.0515F, -1.4294F, 7.441F, 2, 10, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 130, 105, -1.4515F, 1.8706F, 6.541F, 3, 4, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 79, 133, -0.8515F, -3.0294F, 6.441F, 3, 2, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 161, 67, -2.0515F, -3.0294F, 6.441F, 2, 2, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 166, 157, -0.9515F, -3.5294F, 6.441F, 2, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 182, 17, -0.6515F, -2.4294F, -6.559F, 3, 1, 12, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 91, 216, -2.2515F, -2.4294F, -6.559F, 2, 1, 12, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 115, 24, -1.9515F, -2.5294F, -7.659F, 4, 4, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 92, 166, -0.9515F, 0.8706F, -7.659F, 2, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 10, 67, -0.9515F, -4.0294F, 8.441F, 2, 13, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 94, 94, -1.9515F, -3.0294F, 8.441F, 4, 11, 2, 0.0F, false));

		ACR246_r1_r1 = new ModelRenderer(this);
		ACR246_r1_r1.setRotationPoint(-1.34F, -2.9966F, -1.709F);
		stock.addChild(ACR246_r1_r1);
		setRotationAngle(ACR246_r1_r1, 0.0F, 0.0F, -0.9974F);
		ACR246_r1_r1.cubeList.add(new ModelBox(ACR246_r1_r1, 143, 17, -0.5037F, -0.5296F, 1.95F, 1, 1, 6, 0.0F, false));
		ACR246_r1_r1.cubeList.add(new ModelBox(ACR246_r1_r1, 47, 98, -0.95F, -0.5F, -5.45F, 2, 1, 1, 0.0F, false));
		ACR246_r1_r1.cubeList.add(new ModelBox(ACR246_r1_r1, 143, 38, -0.95F, -0.5F, 1.95F, 1, 1, 6, 0.0F, false));
		ACR246_r1_r1.cubeList.add(new ModelBox(ACR246_r1_r1, 161, 94, -0.95F, -0.5F, -4.85F, 2, 1, 7, 0.0F, false));

		ACR247_r1_r1 = new ModelRenderer(this);
		ACR247_r1_r1.setRotationPoint(1.4449F, -2.8707F, -1.709F);
		stock.addChild(ACR247_r1_r1);
		setRotationAngle(ACR247_r1_r1, 0.0F, 0.0F, 2.6048F);
		ACR247_r1_r1.cubeList.add(new ModelBox(ACR247_r1_r1, 117, 146, -0.4914F, -0.7735F, -5.55F, 1, 2, 1, 0.0F, false));
		ACR247_r1_r1.cubeList.add(new ModelBox(ACR247_r1_r1, 143, 24, -0.4914F, -0.7735F, 2.05F, 1, 1, 6, 0.0F, false));
		ACR247_r1_r1.cubeList.add(new ModelBox(ACR247_r1_r1, 96, 18, -0.4914F, -0.7735F, -4.85F, 1, 2, 7, 0.0F, false));

		stock_r1 = new ModelRenderer(this);
		stock_r1.setRotationPoint(1.9485F, -1.7294F, 5.841F);
		stock.addChild(stock_r1);
		setRotationAngle(stock_r1, -0.7854F, 0.0F, 0.0F);
		stock_r1.cubeList.add(new ModelBox(stock_r1, 62, 63, -4.3F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));
		stock_r1.cubeList.add(new ModelBox(stock_r1, 7, 67, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		ACR176_r1 = new ModelRenderer(this);
		ACR176_r1.setRotationPoint(1.5485F, 33.2736F, -24.8601F);
		stock.addChild(ACR176_r1);
		setRotationAngle(ACR176_r1, -0.2974F, 0.0F, 0.0F);
		ACR176_r1.cubeList.add(new ModelBox(ACR176_r1, 8, 138, -1.2F, -41.4F, 3.0F, 1, 2, 2, 0.0F, false));
		ACR176_r1.cubeList.add(new ModelBox(ACR176_r1, 161, 63, -2.8F, -41.4F, 3.0F, 2, 2, 2, 0.0F, false));

		ACR262_r1 = new ModelRenderer(this);
		ACR262_r1.setRotationPoint(1.5485F, 25.9891F, 42.0989F);
		stock.addChild(ACR262_r1);
		setRotationAngle(ACR262_r1, 1.7474F, 0.0F, 0.0F);
		ACR262_r1.cubeList.add(new ModelBox(ACR262_r1, 68, 59, -3.5F, -28.0F, 23.3F, 4, 1, 6, 0.0F, false));

		ACR261_r1 = new ModelRenderer(this);
		ACR261_r1.setRotationPoint(1.5485F, 32.0878F, -18.3803F);
		stock.addChild(ACR261_r1);
		setRotationAngle(ACR261_r1, -0.1487F, 0.0F, 0.0F);
		ACR261_r1.cubeList.add(new ModelBox(ACR261_r1, 129, 112, -3.5F, -39.0F, 23.3F, 4, 6, 1, 0.0F, false));

		ACR260_r1 = new ModelRenderer(this);
		ACR260_r1.setRotationPoint(-17.676F, -11.9089F, -12.859F);
		stock.addChild(ACR260_r1);
		setRotationAngle(ACR260_r1, 0.0F, 0.0F, 2.3423F);
		ACR260_r1.cubeList.add(new ModelBox(ACR260_r1, 150, 46, 0.5F, -28.0F, 21.3F, 1, 1, 2, 0.0F, false));

		ACR259_r1 = new ModelRenderer(this);
		ACR259_r1.setRotationPoint(20.2416F, 25.398F, -12.859F);
		stock.addChild(ACR259_r1);
		setRotationAngle(ACR259_r1, 0.0F, 0.0F, -0.7808F);
		ACR259_r1.cubeList.add(new ModelBox(ACR259_r1, 38, 150, -3.5F, -28.0F, 21.3F, 1, 1, 2, 0.0F, false));

		ACR258_r1 = new ModelRenderer(this);
		ACR258_r1.setRotationPoint(-25.5619F, -30.5779F, -12.859F);
		stock.addChild(ACR258_r1);
		setRotationAngle(ACR258_r1, 0.0F, 0.0F, 2.3423F);
		ACR258_r1.cubeList.add(new ModelBox(ACR258_r1, 149, 74, 0.5F, -39.0F, 21.3F, 1, 1, 2, 0.0F, false));

		ACR257_r1 = new ModelRenderer(this);
		ACR257_r1.setRotationPoint(-27.7989F, 23.6848F, -12.859F);
		stock.addChild(ACR257_r1);
		setRotationAngle(ACR257_r1, 0.0F, 0.0F, 0.8179F);
		ACR257_r1.cubeList.add(new ModelBox(ACR257_r1, 147, 148, -0.5F, -40.0F, 21.3F, 1, 1, 2, 0.0F, false));

		ACR256_r1 = new ModelRenderer(this);
		ACR256_r1.setRotationPoint(27.9836F, 22.2122F, -12.859F);
		stock.addChild(ACR256_r1);
		setRotationAngle(ACR256_r1, 0.0F, 0.0F, -0.7808F);
		ACR256_r1.cubeList.add(new ModelBox(ACR256_r1, 138, 148, -3.5F, -39.0F, 21.3F, 1, 1, 2, 0.0F, false));

		ACR255_r1 = new ModelRenderer(this);
		ACR255_r1.setRotationPoint(-28.4314F, 25.1442F, -12.859F);
		stock.addChild(ACR255_r1);
		setRotationAngle(ACR255_r1, 0.0F, 0.0F, 0.8179F);
		ACR255_r1.cubeList.add(new ModelBox(ACR255_r1, 148, 119, -2.5F, -40.0F, 21.3F, 1, 1, 2, 0.0F, false));

		ACR253_r1 = new ModelRenderer(this);
		ACR253_r1.setRotationPoint(1.5485F, 28.0238F, 40.5884F);
		stock.addChild(ACR253_r1);
		setRotationAngle(ACR253_r1, 1.7191F, 0.0F, 0.0F);
		ACR253_r1.cubeList.add(new ModelBox(ACR253_r1, 162, 0, -2.5F, -27.0F, 23.3F, 2, 1, 7, 0.0F, false));

		ACR252_r1 = new ModelRenderer(this);
		ACR252_r1.setRotationPoint(1.5485F, 32.0768F, -18.5285F);
		stock.addChild(ACR252_r1);
		setRotationAngle(ACR252_r1, -0.1487F, 0.0F, 0.0F);
		ACR252_r1.cubeList.add(new ModelBox(ACR252_r1, 47, 57, -2.5F, -40.0F, 23.3F, 2, 7, 1, 0.0F, false));

		ACR243_r1 = new ModelRenderer(this);
		ACR243_r1.setRotationPoint(1.5485F, 21.2076F, -29.6984F);
		stock.addChild(ACR243_r1);
		setRotationAngle(ACR243_r1, -0.5205F, 0.0F, 0.0F);
		ACR243_r1.cubeList.add(new ModelBox(ACR243_r1, 109, 146, -3.6F, -39.0F, 19.3F, 1, 2, 1, 0.0F, false));
		ACR243_r1.cubeList.add(new ModelBox(ACR243_r1, 36, 162, -2.4F, -39.0F, 19.3F, 3, 2, 1, 0.0F, false));

		ACR241_r1 = new ModelRenderer(this);
		ACR241_r1.setRotationPoint(-32.1397F, -1.2647F, -12.859F);
		stock.addChild(ACR241_r1);
		setRotationAngle(ACR241_r1, 0.0F, 0.0F, 1.6359F);
		ACR241_r1.cubeList.add(new ModelBox(ACR241_r1, 0, 43, 0.6F, -34.4F, 19.3F, 6, 1, 1, 0.0F, false));
		ACR241_r1.cubeList.add(new ModelBox(ACR241_r1, 69, 163, 0.6F, -34.4F, 16.3F, 1, 1, 1, 0.0F, false));
		ACR241_r1.cubeList.add(new ModelBox(ACR241_r1, 141, 91, 0.6F, -34.4F, 18.3F, 4, 1, 1, 0.0F, false));
		ACR241_r1.cubeList.add(new ModelBox(ACR241_r1, 74, 130, 0.6F, -34.4F, 17.3F, 3, 1, 1, 0.0F, false));

		ACR240_r1 = new ModelRenderer(this);
		ACR240_r1.setRotationPoint(5.355F, 35.3561F, -12.859F);
		stock.addChild(ACR240_r1);
		setRotationAngle(ACR240_r1, 0.0F, 0.0F, -0.1115F);
		ACR240_r1.cubeList.add(new ModelBox(ACR240_r1, 40, 64, -3.6F, -34.4F, 19.3F, 1, 6, 1, 0.0F, false));
		ACR240_r1.cubeList.add(new ModelBox(ACR240_r1, 63, 163, -3.6F, -34.4F, 16.3F, 1, 1, 1, 0.0F, false));
		ACR240_r1.cubeList.add(new ModelBox(ACR240_r1, 63, 26, -3.6F, -34.4F, 18.3F, 1, 4, 1, 0.0F, false));
		ACR240_r1.cubeList.add(new ModelBox(ACR240_r1, 65, 39, -3.6F, -34.4F, 17.3F, 1, 3, 1, 0.0F, false));

		ACR239_r1 = new ModelRenderer(this);
		ACR239_r1.setRotationPoint(-15.9923F, -37.1327F, -12.859F);
		stock.addChild(ACR239_r1);
		setRotationAngle(ACR239_r1, 0.0F, 0.0F, 2.6397F);
		

		ACR239_r1_r1 = new ModelRenderer(this);
		ACR239_r1_r1.setRotationPoint(1.1086F, -38.4735F, 11.15F);
		ACR239_r1.addChild(ACR239_r1_r1);
		setRotationAngle(ACR239_r1_r1, 0.0F, 0.0F, -0.0349F);
		ACR239_r1_r1.cubeList.add(new ModelBox(ACR239_r1_r1, 143, 8, -0.4226F, -0.1754F, 2.05F, 1, 1, 6, 0.0F, false));

		ACR234_r1 = new ModelRenderer(this);
		ACR234_r1.setRotationPoint(1.5485F, -14.7671F, -46.9459F);
		stock.addChild(ACR234_r1);
		setRotationAngle(ACR234_r1, -1.6668F, 0.0F, 0.0F);
		ACR234_r1.cubeList.add(new ModelBox(ACR234_r1, 127, 131, -2.5F, -40.85F, 6.0F, 2, 1, 3, 0.0F, false));

		ACR233_r1 = new ModelRenderer(this);
		ACR233_r1.setRotationPoint(1.5485F, -26.7456F, -31.2264F);
		stock.addChild(ACR233_r1);
		setRotationAngle(ACR233_r1, -1.6668F, 0.0F, 0.0F);
		ACR233_r1.cubeList.add(new ModelBox(ACR233_r1, 0, 67, -2.5F, -39.7F, 19.3F, 2, 14, 3, 0.0F, false));

		ACR232_r1 = new ModelRenderer(this);
		ACR232_r1.setRotationPoint(-14.2003F, 32.912F, -12.859F);
		stock.addChild(ACR232_r1);
		setRotationAngle(ACR232_r1, 0.0F, 0.0F, 0.409F);
		ACR232_r1.cubeList.add(new ModelBox(ACR232_r1, 55, 148, -0.5F, -39.5F, 19.3F, 1, 1, 2, 0.0F, false));

		ACR231_r1 = new ModelRenderer(this);
		ACR231_r1.setRotationPoint(-37.8531F, 10.7804F, -12.859F);
		stock.addChild(ACR231_r1);
		setRotationAngle(ACR231_r1, 0.0F, 0.0F, 1.2641F);
		ACR231_r1.cubeList.add(new ModelBox(ACR231_r1, 147, 143, -2.5F, -39.5F, 19.3F, 1, 1, 2, 0.0F, false));

		ACR2211_r1 = new ModelRenderer(this);
		ACR2211_r1.setRotationPoint(1.5485F, 14.9932F, 39.6521F);
		stock.addChild(ACR2211_r1);
		setRotationAngle(ACR2211_r1, 1.9705F, 0.0F, 0.0F);
		ACR2211_r1.cubeList.add(new ModelBox(ACR2211_r1, 63, 130, -3.0F, -27.9F, 19.3F, 3, 2, 5, 0.0F, false));

		ACR220_r1 = new ModelRenderer(this);
		ACR220_r1.setRotationPoint(1.5485F, 36.4975F, 18.6899F);
		stock.addChild(ACR220_r1);
		setRotationAngle(ACR220_r1, 0.9295F, 0.0F, 0.0F);
		ACR220_r1.cubeList.add(new ModelBox(ACR220_r1, 116, 74, -3.0F, -31.2F, 16.3F, 3, 1, 2, 0.0F, false));

		ACR219_r1 = new ModelRenderer(this);
		ACR219_r1.setRotationPoint(1.5485F, 8.6604F, 39.4517F);
		stock.addChild(ACR219_r1);
		setRotationAngle(ACR219_r1, 1.9705F, 0.0F, 0.0F);
		ACR219_r1.cubeList.add(new ModelBox(ACR219_r1, 15, 129, -3.0F, -31.0F, 17.1F, 3, 3, 4, 0.0F, false));

		ACR218_r1 = new ModelRenderer(this);
		ACR218_r1.setRotationPoint(1.5485F, 12.5484F, 37.4734F);
		stock.addChild(ACR218_r1);
		setRotationAngle(ACR218_r1, 1.9705F, 0.0F, 0.0F);
		ACR218_r1.cubeList.add(new ModelBox(ACR218_r1, 66, 125, -3.0F, -28.4F, 17.4F, 3, 1, 3, 0.0F, false));

		ACR217_r1 = new ModelRenderer(this);
		ACR217_r1.setRotationPoint(1.5485F, -11.1637F, 35.2513F);
		stock.addChild(ACR217_r1);
		setRotationAngle(ACR217_r1, 2.8256F, 0.0F, 0.0F);
		ACR217_r1.cubeList.add(new ModelBox(ACR217_r1, 31, 124, -3.0F, -27.4F, 20.3F, 3, 1, 3, 0.0F, false));

		ACR214_r1 = new ModelRenderer(this);
		ACR214_r1.setRotationPoint(-6.3231F, -31.5248F, -12.859F);
		stock.addChild(ACR214_r1);
		setRotationAngle(ACR214_r1, 0.0F, 0.0F, 2.8628F);
		ACR214_r1.cubeList.add(new ModelBox(ACR214_r1, 8, 163, 0.8F, -34.3F, 8.1F, 1, 1, 1, 0.0F, false));

		ACR213_r1 = new ModelRenderer(this);
		ACR213_r1.setRotationPoint(31.595F, 8.4043F, -12.859F);
		stock.addChild(ACR213_r1);
		setRotationAngle(ACR213_r1, 0.0F, 0.0F, -1.2641F);
		ACR213_r1.cubeList.add(new ModelBox(ACR213_r1, 0, 163, -3.8F, -34.3F, 8.1F, 1, 1, 1, 0.0F, false));

		ACR209_r1 = new ModelRenderer(this);
		ACR209_r1.setRotationPoint(-1.048F, 35.9706F, -13.4418F);
		stock.addChild(ACR209_r1);
		setRotationAngle(ACR209_r1, 0.0F, 0.2231F, 0.0F);
		ACR209_r1.cubeList.add(new ModelBox(ACR209_r1, 0, 138, -3.9F, -37.2F, 11.3F, 1, 2, 2, 0.0F, false));

		ACR208_r1 = new ModelRenderer(this);
		ACR208_r1.setRotationPoint(13.6822F, 35.9706F, -0.0412F);
		stock.addChild(ACR208_r1);
		setRotationAngle(ACR208_r1, -3.1416F, -1.357F, 3.1416F);
		ACR208_r1.cubeList.add(new ModelBox(ACR208_r1, 147, 140, 0.9F, -37.2F, 11.3F, 2, 2, 1, 0.0F, false));

		ACR205_r1 = new ModelRenderer(this);
		ACR205_r1.setRotationPoint(11.2559F, 35.9706F, -0.4398F);
		stock.addChild(ACR205_r1);
		setRotationAngle(ACR205_r1, -3.1416F, -1.1339F, 3.1416F);
		ACR205_r1.cubeList.add(new ModelBox(ACR205_r1, 77, 145, 0.9F, -37.2F, 9.3F, 1, 2, 1, 0.0F, false));

		ACR204_r1 = new ModelRenderer(this);
		ACR204_r1.setRotationPoint(-2.8461F, 35.9706F, -13.6315F);
		stock.addChild(ACR204_r1);
		setRotationAngle(ACR204_r1, 0.0F, 0.4461F, 0.0F);
		ACR204_r1.cubeList.add(new ModelBox(ACR204_r1, 70, 145, -3.9F, -37.2F, 9.3F, 1, 2, 1, 0.0F, false));

		ACR203_r1 = new ModelRenderer(this);
		ACR203_r1.setRotationPoint(-8.1332F, 35.9706F, -11.4811F);
		stock.addChild(ACR203_r1);
		setRotationAngle(ACR203_r1, 0.0F, 1.2641F, 0.0F);
		ACR203_r1.cubeList.add(new ModelBox(ACR203_r1, 63, 145, -3.9F, -37.2F, 7.3F, 1, 2, 1, 0.0F, false));

		ACR202_r1 = new ModelRenderer(this);
		ACR202_r1.setRotationPoint(5.323F, 35.9706F, 1.2113F);
		stock.addChild(ACR202_r1);
		setRotationAngle(ACR202_r1, -3.1416F, -0.2788F, 3.1416F);
		ACR202_r1.cubeList.add(new ModelBox(ACR202_r1, 141, 133, 0.9F, -37.2F, 7.3F, 1, 2, 1, 0.0F, false));

		ACR194_r1 = new ModelRenderer(this);
		ACR194_r1.setRotationPoint(6.8072F, 35.9706F, -8.8057F);
		stock.addChild(ACR194_r1);
		setRotationAngle(ACR194_r1, -3.1416F, -1.4686F, 3.1416F);
		ACR194_r1.cubeList.add(new ModelBox(ACR194_r1, 141, 126, 0.8F, -36.8F, 4.4F, 1, 2, 1, 0.0F, false));

		ACR190_r1 = new ModelRenderer(this);
		ACR190_r1.setRotationPoint(1.5485F, 36.0557F, -5.9718F);
		stock.addChild(ACR190_r1);
		setRotationAngle(ACR190_r1, 0.1859F, 0.0F, 0.0F);
		ACR190_r1.cubeList.add(new ModelBox(ACR190_r1, 162, 152, -4.2F, -36.9F, 3.9F, 1, 1, 1, 0.0F, false));

		ACR189_r1 = new ModelRenderer(this);
		ACR189_r1.setRotationPoint(1.5485F, 35.9834F, -5.9972F);
		stock.addChild(ACR189_r1);
		setRotationAngle(ACR189_r1, 0.1859F, 0.0F, 0.0F);
		ACR189_r1.cubeList.add(new ModelBox(ACR189_r1, 162, 150, -4.2F, -36.8F, 3.5F, 1, 1, 1, 0.0F, false));

		ACR188_r1 = new ModelRenderer(this);
		ACR188_r1.setRotationPoint(1.5485F, 35.9387F, -5.5166F);
		stock.addChild(ACR188_r1);
		setRotationAngle(ACR188_r1, 0.1859F, 0.0F, 0.0F);
		ACR188_r1.cubeList.add(new ModelBox(ACR188_r1, 141, 119, -4.2F, -39.4F, 3.5F, 1, 2, 1, 0.0F, false));

		ACR187_r1 = new ModelRenderer(this);
		ACR187_r1.setRotationPoint(1.5485F, 35.848F, -5.5437F);
		stock.addChild(ACR187_r1);
		setRotationAngle(ACR187_r1, 0.1859F, 0.0F, 0.0F);
		ACR187_r1.cubeList.add(new ModelBox(ACR187_r1, 141, 111, -4.2F, -39.3F, 3.0F, 1, 2, 1, 0.0F, false));

		ACR186_r1 = new ModelRenderer(this);
		ACR186_r1.setRotationPoint(1.5485F, 35.9086F, -5.594F);
		stock.addChild(ACR186_r1);
		setRotationAngle(ACR186_r1, 0.1859F, 0.0F, 0.0F);
		ACR186_r1.cubeList.add(new ModelBox(ACR186_r1, 63, 6, -4.0F, -39.0F, 3.3F, 1, 4, 1, 0.0F, false));

		ACR178_r1 = new ModelRenderer(this);
		ACR178_r1.setRotationPoint(1.5485F, 12.2281F, -44.878F);
		stock.addChild(ACR178_r1);
		setRotationAngle(ACR178_r1, -1.041F, 0.0F, 0.0F);
		ACR178_r1.cubeList.add(new ModelBox(ACR178_r1, 163, 126, -3.6F, -39.8F, 4.7F, 2, 2, 3, 0.0F, false));
		ACR178_r1.cubeList.add(new ModelBox(ACR178_r1, 46, 148, -2.4F, -39.8F, 4.7F, 3, 2, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}