package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SupernovaPump extends ModelWithAttachments {
	private final ModelRenderer Maingun;
	private final ModelRenderer gun20_r1;
	private final ModelRenderer gun19_r1;
	private final ModelRenderer gun123TRIGGER;
	private final ModelRenderer gun122TRIGGER;
	private final ModelRenderer gun22LOADINGAREA;
	private final ModelRenderer gun21LOADINGAREA;
	private final ModelRenderer gun20LOADINGAREA;
	private final ModelRenderer maingunBARRELS;
	private final ModelRenderer gun51BARREL;
	private final ModelRenderer gun50BARREL;
	private final ModelRenderer gun41BARREL;
	private final ModelRenderer gun40barrel;
	private final ModelRenderer gun39BARREL;
	private final ModelRenderer gun38BARREL;
	private final ModelRenderer gun37BARREL;
	private final ModelRenderer gun36BARREL;
	private final ModelRenderer gun29BARREL;
	private final ModelRenderer gun30BARREL;
	private final ModelRenderer gun512;
	private final ModelRenderer gun511;
	private final ModelRenderer gun510;
	private final ModelRenderer gun508;
	private final ModelRenderer gun25;
	private final ModelRenderer gun507;
	private final ModelRenderer gun509_r1;
	private final ModelRenderer gun508_r1;
	private final ModelRenderer gun22;
	private final ModelRenderer gun510_r1;
	private final ModelRenderer gun509_r2;
	private final ModelRenderer gun21;
	private final ModelRenderer gun509_r3;
	private final ModelRenderer gun23;
	private final ModelRenderer gun510_r2;
	private final ModelRenderer gun505;
	private final ModelRenderer gun509_r4;
	private final ModelRenderer gun508_r2;
	private final ModelRenderer gun508_r3;
	private final ModelRenderer gun507_r1;
	private final ModelRenderer gun508_r4;
	private final ModelRenderer gun507_r2;
	private final ModelRenderer gun504;
	private final ModelRenderer gun503;
	private final ModelRenderer gun502;
	private final ModelRenderer gun501;
	private final ModelRenderer gun500;
	private final ModelRenderer gun499;
	private final ModelRenderer gun498;
	private final ModelRenderer gun497;
	private final ModelRenderer gun496;
	private final ModelRenderer gun495;
	private final ModelRenderer gun443;
	private final ModelRenderer gun406;
	private final ModelRenderer gun405;
	private final ModelRenderer gun404;
	private final ModelRenderer gun403;
	private final ModelRenderer gun402;
	private final ModelRenderer gun401;
	private final ModelRenderer gun400;
	private final ModelRenderer gun399;
	private final ModelRenderer gun398;
	private final ModelRenderer gun397;
	private final ModelRenderer gun395;
	private final ModelRenderer gun394;
	private final ModelRenderer gun393;
	private final ModelRenderer gun392;
	private final ModelRenderer gun391;
	private final ModelRenderer gun390;
	private final ModelRenderer gun389;
	private final ModelRenderer gun388;
	private final ModelRenderer gun387;
	private final ModelRenderer gun386;
	private final ModelRenderer gun385;
	private final ModelRenderer gun384;
	private final ModelRenderer gun383;
	private final ModelRenderer gun382;
	private final ModelRenderer gun381;
	private final ModelRenderer gun380;
	private final ModelRenderer gun379;
	private final ModelRenderer gun378;
	private final ModelRenderer gun377;
	private final ModelRenderer gun376;
	private final ModelRenderer gun375;
	private final ModelRenderer gun325;
	private final ModelRenderer gun324;
	private final ModelRenderer gun323;
	private final ModelRenderer gun234;
	private final ModelRenderer gun233;
	private final ModelRenderer gun228;
	private final ModelRenderer gun227;
	private final ModelRenderer gun121;
	private final ModelRenderer gun120;
	private final ModelRenderer gun119;
	private final ModelRenderer gun118;
	private final ModelRenderer gun114;
	private final ModelRenderer gun113;
	private final ModelRenderer gun112;
	private final ModelRenderer gun111;
	private final ModelRenderer gun110;
	private final ModelRenderer gun72;
	private final ModelRenderer gun68;
	private final ModelRenderer gun46;
	private final ModelRenderer gun42;
	private final ModelRenderer gun31;
	private final ModelRenderer gun24;
	private final ModelRenderer gun18;
	private final ModelRenderer gun17;
	private final ModelRenderer gun16;
	private final ModelRenderer gun15;
	private final ModelRenderer gun14;
	private final ModelRenderer gun13;
	private final ModelRenderer gun12;
	private final ModelRenderer gun11;
	private final ModelRenderer gun10;
	private final ModelRenderer gun9;
	private final ModelRenderer gun8;
	private final ModelRenderer gun7;
	private final ModelRenderer gun6;
	private final ModelRenderer gun5;
	private final ModelRenderer gun3;
	private final ModelRenderer gun2;
	private final ModelRenderer gun1;
	private final ModelRenderer Scopes;
	private final ModelRenderer gun494;
	private final ModelRenderer gun66;
	private final ModelRenderer gun65;
	private final ModelRenderer gun68_r1;
	private final ModelRenderer gun71_r1;
	private final ModelRenderer gun72_r1;
	private final ModelRenderer gun72_r2;
	private final ModelRenderer gun71_r2;
	private final ModelRenderer gun70_r1;
	private final ModelRenderer gun71_r3;
	private final ModelRenderer gun72_r3;
	private final ModelRenderer gun70_r2;
	private final ModelRenderer gun71_r4;
	private final ModelRenderer gun70_r3;
	private final ModelRenderer gun69_r1;
	private final ModelRenderer gun4;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun6_r2;
	private final ModelRenderer gun6_r3;
	private final ModelRenderer gun5_r2;
	private final ModelRenderer gun5_r3;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun4_r2;
	private final ModelRenderer gun5_r4;
	private final ModelRenderer gun4_r3;
	private final ModelRenderer gun8_r2;
	private final ModelRenderer gun5_r5;
	private final ModelRenderer gun4_r4;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun20;
	private final ModelRenderer gun73_r1;
	private final ModelRenderer gun72_r4;
	private final ModelRenderer gun72_r5;
	private final ModelRenderer gun71_r5;
	private final ModelRenderer gun74_r1;
	private final ModelRenderer gun73_r2;
	private final ModelRenderer gun72_r6;
	private final ModelRenderer gun74_r2;
	private final ModelRenderer gun73_r3;
	private final ModelRenderer Pump;
	private final ModelRenderer pump37;
	private final ModelRenderer pump36;
	private final ModelRenderer pump35;
	private final ModelRenderer pump34;
	private final ModelRenderer pump33;
	private final ModelRenderer pump32;
	private final ModelRenderer pump31;
	private final ModelRenderer pump30;
	private final ModelRenderer pump29;
	private final ModelRenderer pump28;
	private final ModelRenderer pump27;
	private final ModelRenderer pump26;
	private final ModelRenderer pump25;
	private final ModelRenderer pump24;
	private final ModelRenderer pump23;
	private final ModelRenderer pump22;
	private final ModelRenderer pump21;
	private final ModelRenderer pump20;
	private final ModelRenderer pump19;
	private final ModelRenderer pump18;
	private final ModelRenderer pump17;
	private final ModelRenderer pump16;
	private final ModelRenderer pump15;
	private final ModelRenderer pump14;
	private final ModelRenderer pump1333;
	private final ModelRenderer pump133;
	private final ModelRenderer pump13;
	private final ModelRenderer pump12;
	private final ModelRenderer pump11;
	private final ModelRenderer pump10;
	private final ModelRenderer pump9;
	private final ModelRenderer pump8;
	private final ModelRenderer pump7;
	private final ModelRenderer pump6;
	private final ModelRenderer pump5;
	private final ModelRenderer pump4;
	private final ModelRenderer pump3;
	private final ModelRenderer pump2;
	private final ModelRenderer pump1;
	private final ModelRenderer MaingunACTION;
	private final ModelRenderer action5;
	private final ModelRenderer action6;
	private final ModelRenderer action7;
	private final ModelRenderer Stock;
	private final ModelRenderer stock24;
	private final ModelRenderer stock23;
	private final ModelRenderer stock22;
	private final ModelRenderer stock21;
	private final ModelRenderer stock20;
	private final ModelRenderer stock19;
	private final ModelRenderer stock18;
	private final ModelRenderer stock19_r1;
	private final ModelRenderer stock17;
	private final ModelRenderer stock16;
	private final ModelRenderer stock15;
	private final ModelRenderer stock14;
	private final ModelRenderer stock16_r1;
	private final ModelRenderer stock16_r2;
	private final ModelRenderer stock13;
	private final ModelRenderer stock16_r3;
	private final ModelRenderer stock15_r1;
	private final ModelRenderer stock12;
	private final ModelRenderer stock11;
	private final ModelRenderer stock13_r1;
	private final ModelRenderer stock13_r2;
	private final ModelRenderer stock8;
	private final ModelRenderer stock7;
	private final ModelRenderer stock6;
	private final ModelRenderer stock5;
	private final ModelRenderer stock4;
	private final ModelRenderer stock3;
	private final ModelRenderer stock2;
	private final ModelRenderer stock1;

	public SupernovaPump() {
		textureWidth = 256;
		textureHeight = 256;

		Maingun = new ModelRenderer(this);
		Maingun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun20_r1 = new ModelRenderer(this);
		gun20_r1.setRotationPoint(0.0F, -24.5F, -1.0F);
		Maingun.addChild(gun20_r1);
		setRotationAngle(gun20_r1, 0.0F, 0.0F, 2.3562F);
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 144, 150, -1.5F, -0.1F, 2.0F, 2, 1, 9, -0.1F, true));

		gun19_r1 = new ModelRenderer(this);
		gun19_r1.setRotationPoint(-2.0F, -24.5F, -1.0F);
		Maingun.addChild(gun19_r1);
		setRotationAngle(gun19_r1, 0.0F, 0.0F, -2.3562F);
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 144, 150, -0.5F, -0.1F, 2.0F, 2, 1, 9, -0.1F, false));

		gun123TRIGGER = new ModelRenderer(this);
		gun123TRIGGER.setRotationPoint(-1.5F, -23.3F, 8.0F);
		Maingun.addChild(gun123TRIGGER);
		setRotationAngle(gun123TRIGGER, -2.1328F, 0.0F, 0.0F);
		gun123TRIGGER.cubeList.add(new ModelBox(gun123TRIGGER, 72, 70, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun122TRIGGER = new ModelRenderer(this);
		gun122TRIGGER.setRotationPoint(-1.5F, -24.5F, 7.3F);
		Maingun.addChild(gun122TRIGGER);
		setRotationAngle(gun122TRIGGER, -0.2603F, 0.0F, 0.0F);
		gun122TRIGGER.cubeList.add(new ModelBox(gun122TRIGGER, 24, 73, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun22LOADINGAREA = new ModelRenderer(this);
		gun22LOADINGAREA.setRotationPoint(-2.0F, -24.5F, -12.0F);
		Maingun.addChild(gun22LOADINGAREA);
		setRotationAngle(gun22LOADINGAREA, -2.618F, 0.0F, 0.0F);
		gun22LOADINGAREA.cubeList.add(new ModelBox(gun22LOADINGAREA, 71, 8, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		gun21LOADINGAREA = new ModelRenderer(this);
		gun21LOADINGAREA.setRotationPoint(-2.0F, -24.5F, -2.0F);
		Maingun.addChild(gun21LOADINGAREA);
		setRotationAngle(gun21LOADINGAREA, -2.0944F, 0.0F, 0.0F);
		gun21LOADINGAREA.cubeList.add(new ModelBox(gun21LOADINGAREA, 71, 35, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		gun20LOADINGAREA = new ModelRenderer(this);
		gun20LOADINGAREA.setRotationPoint(-2.0F, -25.9F, -11.0F);
		Maingun.addChild(gun20LOADINGAREA);
		gun20LOADINGAREA.cubeList.add(new ModelBox(gun20LOADINGAREA, 67, 66, 0.0F, 0.0F, -1.0F, 2, 1, 10, 0.0F, false));

		maingunBARRELS = new ModelRenderer(this);
		maingunBARRELS.setRotationPoint(0.0F, 0.0F, 0.0F);
		Maingun.addChild(maingunBARRELS);
		

		gun51BARREL = new ModelRenderer(this);
		gun51BARREL.setRotationPoint(-1.5F, -27.7F, -59.0F);
		maingunBARRELS.addChild(gun51BARREL);
		setRotationAngle(gun51BARREL, 0.0F, 0.0F, -2.3562F);
		gun51BARREL.cubeList.add(new ModelBox(gun51BARREL, 47, 49, 0.0F, 0.0F, -0.001F, 1, 1, 45, 0.0F, false));

		gun50BARREL = new ModelRenderer(this);
		gun50BARREL.setRotationPoint(-2.5F, -28.7F, -59.0F);
		maingunBARRELS.addChild(gun50BARREL);
		setRotationAngle(gun50BARREL, 0.0F, 0.0F, -0.7854F);
		gun50BARREL.cubeList.add(new ModelBox(gun50BARREL, 51, 1, -0.01F, 0.0F, 0.01F, 1, 1, 45, 0.0F, false));

		gun41BARREL = new ModelRenderer(this);
		gun41BARREL.setRotationPoint(-2.5F, -29.7F, -59.0F);
		maingunBARRELS.addChild(gun41BARREL);
		setRotationAngle(gun41BARREL, 0.0F, 0.0F, -0.7854F);
		gun41BARREL.cubeList.add(new ModelBox(gun41BARREL, 0, 94, 0.0F, 0.0F, 0.01F, 1, 1, 45, 0.0F, false));

		gun40barrel = new ModelRenderer(this);
		gun40barrel.setRotationPoint(-1.5F, -30.7F, -59.0F);
		maingunBARRELS.addChild(gun40barrel);
		setRotationAngle(gun40barrel, 0.0F, 0.0F, 0.7854F);
		gun40barrel.cubeList.add(new ModelBox(gun40barrel, 94, 47, -0.01F, 0.0F, -0.002F, 1, 1, 45, 0.0F, false));

		gun39BARREL = new ModelRenderer(this);
		gun39BARREL.setRotationPoint(-0.5F, -27.7F, -59.0F);
		maingunBARRELS.addChild(gun39BARREL);
		setRotationAngle(gun39BARREL, 0.0F, 0.0F, -2.3562F);
		gun39BARREL.cubeList.add(new ModelBox(gun39BARREL, 94, 93, 0.0F, 0.0F, 0.01F, 1, 1, 45, 0.0F, false));

		gun38BARREL = new ModelRenderer(this);
		gun38BARREL.setRotationPoint(0.5F, -28.7F, -59.0F);
		maingunBARRELS.addChild(gun38BARREL);
		setRotationAngle(gun38BARREL, 0.0F, 0.0F, 2.3562F);
		gun38BARREL.cubeList.add(new ModelBox(gun38BARREL, 47, 95, 0.0F, -0.01F, -0.002F, 1, 1, 45, 0.0F, false));

		gun37BARREL = new ModelRenderer(this);
		gun37BARREL.setRotationPoint(0.5F, -29.7F, -59.0F);
		maingunBARRELS.addChild(gun37BARREL);
		setRotationAngle(gun37BARREL, 0.0F, 0.0F, 2.3562F);
		gun37BARREL.cubeList.add(new ModelBox(gun37BARREL, 98, 0, 0.0F, 0.0F, -0.001F, 1, 1, 45, 0.0F, false));

		gun36BARREL = new ModelRenderer(this);
		gun36BARREL.setRotationPoint(-0.5F, -30.7F, -59.0F);
		maingunBARRELS.addChild(gun36BARREL);
		setRotationAngle(gun36BARREL, 0.0F, 0.0F, 0.8029F);
		gun36BARREL.cubeList.add(new ModelBox(gun36BARREL, 94, 139, 0.0F, 0.0F, 0.01F, 1, 1, 45, 0.0F, false));

		gun29BARREL = new ModelRenderer(this);
		gun29BARREL.setRotationPoint(-1.5F, -30.7F, -59.0F);
		maingunBARRELS.addChild(gun29BARREL);
		gun29BARREL.cubeList.add(new ModelBox(gun29BARREL, 0, 46, 0.0F, 0.0F, 0.02F, 1, 3, 45, 0.0F, false));

		gun30BARREL = new ModelRenderer(this);
		gun30BARREL.setRotationPoint(-2.5F, -29.7F, -59.0F);
		maingunBARRELS.addChild(gun30BARREL);
		gun30BARREL.cubeList.add(new ModelBox(gun30BARREL, 0, 0, 0.0F, 0.0F, 0.0F, 3, 1, 45, 0.0F, false));

		gun512 = new ModelRenderer(this);
		gun512.setRotationPoint(-2.8F, -27.6F, -14.0F);
		Maingun.addChild(gun512);
		gun512.cubeList.add(new ModelBox(gun512, 37, 141, 0.3F, 0.0F, 0.0F, 1, 2, 14, 0.0F, false));
		gun512.cubeList.add(new ModelBox(gun512, 141, 62, 0.301F, -0.3F, 0.0F, 1, 1, 14, 0.0F, false));

		gun511 = new ModelRenderer(this);
		gun511.setRotationPoint(-0.2F, -27.6F, -14.0F);
		Maingun.addChild(gun511);
		gun511.cubeList.add(new ModelBox(gun511, 0, 140, -0.3F, -1.0F, 0.0F, 1, 3, 14, 0.0F, false));

		gun510 = new ModelRenderer(this);
		gun510.setRotationPoint(-2.0F, -31.15F, 0.2F);
		Maingun.addChild(gun510);
		gun510.cubeList.add(new ModelBox(gun510, 0, 9, 0.0F, 0.0F, 1.7F, 2, 1, 6, 0.0F, false));

		gun508 = new ModelRenderer(this);
		gun508.setRotationPoint(-3.1F, -30.2F, 0.5F);
		Maingun.addChild(gun508);
		setRotationAngle(gun508, 0.0F, 0.0F, -2.3051F);
		gun508.cubeList.add(new ModelBox(gun508, 47, 56, -1.0F, 0.0F, 1.7F, 1, 1, 6, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(1.1F, -30.2F, 0.5F);
		Maingun.addChild(gun25);
		setRotationAngle(gun25, 0.0F, 0.0F, 2.3051F);
		gun25.cubeList.add(new ModelBox(gun25, 51, 38, 0.0F, 0.0F, 1.7F, 1, 1, 6, 0.0F, false));

		gun507 = new ModelRenderer(this);
		gun507.setRotationPoint(1.1F, -30.2F, 0.5F);
		Maingun.addChild(gun507);
		setRotationAngle(gun507, 0.0F, 0.0F, 2.3051F);
		gun507.cubeList.add(new ModelBox(gun507, 0, 65, 0.01F, 0.4F, 1.71F, 1, 1, 6, 0.0F, false));

		gun509_r1 = new ModelRenderer(this);
		gun509_r1.setRotationPoint(0.01F, 1.4F, 7.71F);
		gun507.addChild(gun509_r1);
		setRotationAngle(gun509_r1, 0.0528F, 0.157F, 0.0034F);
		gun509_r1.cubeList.add(new ModelBox(gun509_r1, 79, 62, 0.001F, -1.4F, 0.001F, 1, 1, 2, 0.0F, false));

		gun508_r1 = new ModelRenderer(this);
		gun508_r1.setRotationPoint(0.01F, 1.4F, 7.71F);
		gun507.addChild(gun508_r1);
		setRotationAngle(gun508_r1, 0.1051F, 0.157F, 0.0034F);
		gun508_r1.cubeList.add(new ModelBox(gun508_r1, 8, 80, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-3.1F, -30.2F, 0.5F);
		Maingun.addChild(gun22);
		setRotationAngle(gun22, 0.0F, 0.0F, -2.3051F);
		gun22.cubeList.add(new ModelBox(gun22, 0, 56, -1.01F, 0.4F, 1.71F, 1, 1, 6, 0.0F, false));

		gun510_r1 = new ModelRenderer(this);
		gun510_r1.setRotationPoint(-0.01F, 1.4F, 7.71F);
		gun22.addChild(gun510_r1);
		setRotationAngle(gun510_r1, 0.0528F, -0.157F, -0.0034F);
		gun510_r1.cubeList.add(new ModelBox(gun510_r1, 77, 78, -1.001F, -1.4F, 0.001F, 1, 1, 2, 0.0F, false));

		gun509_r2 = new ModelRenderer(this);
		gun509_r2.setRotationPoint(-0.01F, 1.4F, 7.71F);
		gun22.addChild(gun509_r2);
		setRotationAngle(gun509_r2, 0.1051F, -0.157F, -0.0034F);
		gun509_r2.cubeList.add(new ModelBox(gun509_r2, 4, 79, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-3.1F, -30.2F, 0.5F);
		Maingun.addChild(gun21);
		setRotationAngle(gun21, 0.0F, 0.0F, -2.3051F);
		gun21.cubeList.add(new ModelBox(gun21, 40, 61, -0.9F, -0.1F, 0.8F, 1, 1, 1, -0.1F, false));
		gun21.cubeList.add(new ModelBox(gun21, 38, 80, -0.701F, -0.3F, -0.1F, 1, 1, 2, -0.3F, false));
		gun21.cubeList.add(new ModelBox(gun21, 32, 80, -0.601F, 0.4F, 0.5F, 1, 1, 2, -0.4F, false));
		gun21.cubeList.add(new ModelBox(gun21, 26, 80, -0.601F, 0.6F, 0.8F, 1, 1, 2, -0.4F, false));
		gun21.cubeList.add(new ModelBox(gun21, 20, 80, -0.601F, 0.8F, 1.0F, 1, 1, 2, -0.4F, false));
		gun21.cubeList.add(new ModelBox(gun21, 60, 56, -0.601F, 0.2F, 0.3F, 1, 1, 1, -0.4F, false));
		gun21.cubeList.add(new ModelBox(gun21, 20, 60, -0.601F, 0.0F, 0.3F, 1, 1, 1, -0.4F, false));
		gun21.cubeList.add(new ModelBox(gun21, 41, 59, -0.601F, 0.0F, 0.1F, 1, 1, 1, -0.4F, false));
		gun21.cubeList.add(new ModelBox(gun21, 20, 58, -0.601F, -0.4F, -0.4F, 1, 1, 1, -0.4F, false));

		gun509_r3 = new ModelRenderer(this);
		gun509_r3.setRotationPoint(0.0F, 0.0F, -0.3F);
		gun21.addChild(gun509_r3);
		setRotationAngle(gun509_r3, 0.8727F, 0.0F, 0.0F);
		gun509_r3.cubeList.add(new ModelBox(gun509_r3, 28, 0, -0.599F, 0.6F, -0.401F, 1, 2, 1, -0.4F, false));
		gun509_r3.cubeList.add(new ModelBox(gun509_r3, 20, 34, -0.6F, -0.2F, -0.4F, 1, 2, 1, -0.4F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(1.1F, -30.2F, 0.5F);
		Maingun.addChild(gun23);
		setRotationAngle(gun23, 0.0F, 0.0F, 2.3051F);
		gun23.cubeList.add(new ModelBox(gun23, 51, 27, -0.1F, -0.1F, 0.8F, 1, 1, 1, -0.1F, false));
		gun23.cubeList.add(new ModelBox(gun23, 57, 78, -0.299F, -0.3F, -0.1F, 1, 1, 2, -0.3F, false));
		gun23.cubeList.add(new ModelBox(gun23, 78, 40, -0.399F, 0.4F, 0.5F, 1, 1, 2, -0.4F, false));
		gun23.cubeList.add(new ModelBox(gun23, 12, 78, -0.399F, 0.6F, 0.8F, 1, 1, 2, -0.4F, false));
		gun23.cubeList.add(new ModelBox(gun23, 0, 78, -0.399F, 0.8F, 1.0F, 1, 1, 2, -0.4F, false));
		gun23.cubeList.add(new ModelBox(gun23, 26, 51, -0.399F, 0.2F, 0.3F, 1, 1, 1, -0.4F, false));
		gun23.cubeList.add(new ModelBox(gun23, 20, 51, -0.399F, 0.0F, 0.3F, 1, 1, 1, -0.4F, false));
		gun23.cubeList.add(new ModelBox(gun23, 40, 49, -0.399F, 0.0F, 0.1F, 1, 1, 1, -0.4F, false));
		gun23.cubeList.add(new ModelBox(gun23, 33, 49, -0.399F, -0.4F, -0.4F, 1, 1, 1, -0.4F, false));

		gun510_r2 = new ModelRenderer(this);
		gun510_r2.setRotationPoint(0.0F, 0.0F, -0.3F);
		gun23.addChild(gun510_r2);
		setRotationAngle(gun510_r2, 0.8727F, 0.0F, 0.0F);
		gun510_r2.cubeList.add(new ModelBox(gun510_r2, 23, 12, -0.401F, 0.6F, -0.401F, 1, 2, 1, -0.4F, false));
		gun510_r2.cubeList.add(new ModelBox(gun510_r2, 25, 22, -0.4F, -0.2F, -0.4F, 1, 2, 1, -0.4F, false));

		gun505 = new ModelRenderer(this);
		gun505.setRotationPoint(0.1F, -30.2F, 3.5F);
		Maingun.addChild(gun505);
		gun505.cubeList.add(new ModelBox(gun505, 33, 37, 0.0F, 0.0F, -0.3F, 1, 3, 5, 0.0F, false));

		gun509_r4 = new ModelRenderer(this);
		gun509_r4.setRotationPoint(-3.2F, 0.0F, 4.7F);
		gun505.addChild(gun509_r4);
		setRotationAngle(gun509_r4, -0.4538F, 0.0349F, 0.0F);
		gun509_r4.cubeList.add(new ModelBox(gun509_r4, 47, 79, -0.001F, -0.65F, 1.9F, 1, 1, 2, 0.0F, false));

		gun508_r2 = new ModelRenderer(this);
		gun508_r2.setRotationPoint(-3.2F, 0.0F, 4.7F);
		gun505.addChild(gun508_r2);
		setRotationAngle(gun508_r2, -0.1222F, 0.0349F, 0.0F);
		gun508_r2.cubeList.add(new ModelBox(gun508_r2, 59, 61, 0.0F, 1.0F, 2.0F, 1, 2, 2, 0.0F, false));
		gun508_r2.cubeList.add(new ModelBox(gun508_r2, 0, 9, 0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

		gun508_r3 = new ModelRenderer(this);
		gun508_r3.setRotationPoint(1.0F, 0.0F, 4.7F);
		gun505.addChild(gun508_r3);
		setRotationAngle(gun508_r3, -0.4538F, -0.0349F, 0.0F);
		gun508_r3.cubeList.add(new ModelBox(gun508_r3, 53, 79, -0.999F, -0.65F, 1.9F, 1, 1, 2, 0.0F, false));

		gun507_r1 = new ModelRenderer(this);
		gun507_r1.setRotationPoint(1.0F, 0.0F, 4.7F);
		gun505.addChild(gun507_r1);
		setRotationAngle(gun507_r1, -0.1222F, -0.0349F, 0.0F);
		gun507_r1.cubeList.add(new ModelBox(gun507_r1, 0, 65, -1.0F, 1.0F, 2.0F, 1, 2, 2, 0.0F, false));
		gun507_r1.cubeList.add(new ModelBox(gun507_r1, 10, 9, -1.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

		gun508_r4 = new ModelRenderer(this);
		gun508_r4.setRotationPoint(-3.2F, 0.0F, 4.7F);
		gun505.addChild(gun508_r4);
		setRotationAngle(gun508_r4, -1.0996F, 0.0349F, 0.0F);
		gun508_r4.cubeList.add(new ModelBox(gun508_r4, 0, 56, 0.001F, -1.1F, 2.8F, 1, 2, 2, 0.0F, false));

		gun507_r2 = new ModelRenderer(this);
		gun507_r2.setRotationPoint(1.0F, 0.0F, 4.7F);
		gun505.addChild(gun507_r2);
		setRotationAngle(gun507_r2, -1.0996F, -0.0349F, 0.0F);
		gun507_r2.cubeList.add(new ModelBox(gun507_r2, 47, 56, -1.001F, -1.1F, 2.8F, 1, 2, 2, 0.0F, false));

		gun504 = new ModelRenderer(this);
		gun504.setRotationPoint(-3.1F, -30.2F, 3.5F);
		Maingun.addChild(gun504);
		gun504.cubeList.add(new ModelBox(gun504, 33, 46, 0.0F, 0.0F, -0.3F, 1, 3, 5, 0.0F, false));

		gun503 = new ModelRenderer(this);
		gun503.setRotationPoint(-3.1F, -25.2F, 3.2F);
		Maingun.addChild(gun503);
		setRotationAngle(gun503, 1.9705F, 0.0F, 0.0F);
		gun503.cubeList.add(new ModelBox(gun503, 0, 22, 0.001F, 0.0F, 0.0F, 1, 5, 3, 0.0F, false));

		gun502 = new ModelRenderer(this);
		gun502.setRotationPoint(0.1F, -25.2F, 3.2F);
		Maingun.addChild(gun502);
		setRotationAngle(gun502, 1.9705F, 0.0F, 0.0F);
		gun502.cubeList.add(new ModelBox(gun502, 10, 22, -0.001F, 0.0F, 0.0F, 1, 5, 3, 0.0F, false));

		gun501 = new ModelRenderer(this);
		gun501.setRotationPoint(1.1F, -25.2F, 0.5F);
		Maingun.addChild(gun501);
		setRotationAngle(gun501, 0.0F, 0.0F, 0.8923F);
		gun501.cubeList.add(new ModelBox(gun501, 51, 9, -1.0F, 0.0F, -0.3F, 1, 2, 3, 0.0F, false));

		gun500 = new ModelRenderer(this);
		gun500.setRotationPoint(-3.1F, -25.2F, 0.5F);
		Maingun.addChild(gun500);
		setRotationAngle(gun500, 0.0F, 0.0F, -0.8923F);
		gun500.cubeList.add(new ModelBox(gun500, 55, 56, 0.0F, 0.0F, -0.3F, 1, 2, 3, 0.0F, false));

		gun499 = new ModelRenderer(this);
		gun499.setRotationPoint(0.1F, -30.2F, 0.5F);
		Maingun.addChild(gun499);
		gun499.cubeList.add(new ModelBox(gun499, 20, 22, 0.0F, 0.0F, -0.3F, 1, 5, 3, 0.0F, false));

		gun498 = new ModelRenderer(this);
		gun498.setRotationPoint(-3.1F, -30.2F, 0.5F);
		Maingun.addChild(gun498);
		gun498.cubeList.add(new ModelBox(gun498, 0, 46, 0.0F, 0.0F, -0.3F, 1, 5, 3, 0.0F, false));

		gun497 = new ModelRenderer(this);
		gun497.setRotationPoint(0.1F, -28.6F, -2.0F);
		Maingun.addChild(gun497);
		setRotationAngle(gun497, 0.632F, 0.0F, 0.0F);
		gun497.cubeList.add(new ModelBox(gun497, 10, 46, 0.001F, 0.0F, -0.3F, 1, 4, 3, 0.0F, false));

		gun496 = new ModelRenderer(this);
		gun496.setRotationPoint(-3.1F, -28.6F, -2.0F);
		Maingun.addChild(gun496);
		setRotationAngle(gun496, 0.632F, 0.0F, 0.0F);
		gun496.cubeList.add(new ModelBox(gun496, 47, 47, -0.001F, 0.0F, -0.3F, 1, 4, 3, 0.0F, false));
		gun496.cubeList.add(new ModelBox(gun496, 57, 34, -0.35F, 2.6123F, 0.3785F, 1, 1, 1, -0.3F, false));
		gun496.cubeList.add(new ModelBox(gun496, 26, 53, -0.25F, 7.2796F, 6.7525F, 1, 1, 1, -0.3F, false));
		gun496.cubeList.add(new ModelBox(gun496, 51, 29, 3.55F, 2.6123F, 0.3785F, 1, 1, 1, -0.3F, false));
		gun496.cubeList.add(new ModelBox(gun496, 20, 53, 3.45F, 7.2796F, 6.7525F, 1, 1, 1, -0.3F, false));

		gun495 = new ModelRenderer(this);
		gun495.setRotationPoint(-0.9F, -28.6F, -14.0F);
		Maingun.addChild(gun495);
		gun495.cubeList.add(new ModelBox(gun495, 98, 16, 0.2F, -0.1F, -0.2F, 2, 1, 15, -0.2F, false));
		gun495.cubeList.add(new ModelBox(gun495, 94, 95, -0.2F, 2.6F, -0.3F, 2, 1, 15, -0.3F, false));
		gun495.cubeList.add(new ModelBox(gun495, 47, 95, -2.0F, 2.6F, -0.3F, 2, 1, 15, -0.3F, false));
		gun495.cubeList.add(new ModelBox(gun495, 98, 0, -2.4F, -0.1F, -0.2F, 2, 1, 15, -0.2F, false));

		gun443 = new ModelRenderer(this);
		gun443.setRotationPoint(-1.5F, -27.6F, -38.0F);
		Maingun.addChild(gun443);
		gun443.cubeList.add(new ModelBox(gun443, 71, 4, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun406 = new ModelRenderer(this);
		gun406.setRotationPoint(-1.5F, -24.6F, -45.0F);
		Maingun.addChild(gun406);
		setRotationAngle(gun406, 0.0F, 0.0F, -2.3562F);
		gun406.cubeList.add(new ModelBox(gun406, 141, 46, 0.0F, -0.01F, -0.01F, 1, 1, 31, 0.0F, false));

		gun405 = new ModelRenderer(this);
		gun405.setRotationPoint(-2.5F, -25.6F, -45.0F);
		Maingun.addChild(gun405);
		setRotationAngle(gun405, 0.0F, 0.0F, -0.7854F);
		gun405.cubeList.add(new ModelBox(gun405, 141, 93, 0.0F, 0.0F, 0.01F, 1, 1, 31, 0.0F, false));

		gun404 = new ModelRenderer(this);
		gun404.setRotationPoint(-2.5F, -26.6F, -45.0F);
		Maingun.addChild(gun404);
		setRotationAngle(gun404, 0.0F, 0.0F, -0.7854F);
		gun404.cubeList.add(new ModelBox(gun404, 141, 139, 0.0F, 0.0F, 0.01F, 1, 1, 31, 0.0F, false));

		gun403 = new ModelRenderer(this);
		gun403.setRotationPoint(-1.5F, -26.6F, -45.0F);
		Maingun.addChild(gun403);
		gun403.cubeList.add(new ModelBox(gun403, 37, 141, 0.0F, 0.0F, -0.002F, 1, 2, 31, 0.0F, false));

		gun402 = new ModelRenderer(this);
		gun402.setRotationPoint(-0.5F, -24.6F, -45.0F);
		Maingun.addChild(gun402);
		setRotationAngle(gun402, 0.0F, 0.0F, -2.3562F);
		gun402.cubeList.add(new ModelBox(gun402, 70, 143, 0.01F, 0.0F, -0.001F, 1, 1, 31, 0.0F, false));

		gun401 = new ModelRenderer(this);
		gun401.setRotationPoint(0.5F, -25.6F, -45.0F);
		Maingun.addChild(gun401);
		setRotationAngle(gun401, 0.0F, 0.0F, 2.3562F);
		gun401.cubeList.add(new ModelBox(gun401, 145, 0, 0.0F, 0.0F, 0.01F, 1, 1, 31, 0.0F, false));

		gun400 = new ModelRenderer(this);
		gun400.setRotationPoint(-2.5F, -26.6F, -45.0F);
		Maingun.addChild(gun400);
		gun400.cubeList.add(new ModelBox(gun400, 0, 140, 0.0F, 0.0F, 0.0F, 3, 1, 31, 0.0F, false));

		gun399 = new ModelRenderer(this);
		gun399.setRotationPoint(0.5F, -26.6F, -45.0F);
		Maingun.addChild(gun399);
		setRotationAngle(gun399, 0.0F, 0.0F, 2.3562F);
		gun399.cubeList.add(new ModelBox(gun399, 155, 171, 0.0F, 0.0F, -0.01F, 1, 1, 31, 0.0F, false));

		gun398 = new ModelRenderer(this);
		gun398.setRotationPoint(-1.2F, -27.3F, -45.0F);
		Maingun.addChild(gun398);
		gun398.cubeList.add(new ModelBox(gun398, 0, 172, 0.0F, 0.0F, 0.0F, 1, 1, 31, 0.0F, false));

		gun397 = new ModelRenderer(this);
		gun397.setRotationPoint(-1.8F, -27.3F, -45.0F);
		Maingun.addChild(gun397);
		gun397.cubeList.add(new ModelBox(gun397, 174, 32, 0.0F, 0.0F, 0.02F, 1, 1, 31, 0.0F, false));

		gun395 = new ModelRenderer(this);
		gun395.setRotationPoint(-2.8F, -27.0F, -44.5F);
		Maingun.addChild(gun395);
		setRotationAngle(gun395, 0.0F, 0.0F, -0.5205F);
		gun395.cubeList.add(new ModelBox(gun395, 87, 1, 0.0F, 0.0F, -0.01F, 1, 1, 2, 0.0F, false));

		gun394 = new ModelRenderer(this);
		gun394.setRotationPoint(-2.8F, -25.0F, -44.5F);
		Maingun.addChild(gun394);
		setRotationAngle(gun394, 0.0F, 0.0F, -0.8179F);
		gun394.cubeList.add(new ModelBox(gun394, 87, 4, 0.0F, 0.0F, -0.01F, 1, 1, 2, 0.0F, false));

		gun393 = new ModelRenderer(this);
		gun393.setRotationPoint(0.8F, -25.0F, -44.5F);
		Maingun.addChild(gun393);
		setRotationAngle(gun393, 0.0F, 0.0F, 2.4166F);
		gun393.cubeList.add(new ModelBox(gun393, 6, 87, 0.0F, 0.0F, -0.01F, 1, 1, 2, 0.0F, false));

		gun392 = new ModelRenderer(this);
		gun392.setRotationPoint(0.0F, -27.5F, -44.5F);
		Maingun.addChild(gun392);
		setRotationAngle(gun392, 0.0F, 0.0F, 0.5949F);
		gun392.cubeList.add(new ModelBox(gun392, 87, 7, 0.0F, 0.0F, -0.01F, 1, 1, 2, 0.0F, false));

		gun391 = new ModelRenderer(this);
		gun391.setRotationPoint(-2.0F, -27.5F, -44.5F);
		Maingun.addChild(gun391);
		gun391.cubeList.add(new ModelBox(gun391, 33, 54, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun390 = new ModelRenderer(this);
		gun390.setRotationPoint(-2.0F, -25.3F, -44.5F);
		Maingun.addChild(gun390);
		gun390.cubeList.add(new ModelBox(gun390, 59, 34, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun389 = new ModelRenderer(this);
		gun389.setRotationPoint(-0.2F, -27.0F, -44.5F);
		Maingun.addChild(gun389);
		gun389.cubeList.add(new ModelBox(gun389, 12, 74, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun388 = new ModelRenderer(this);
		gun388.setRotationPoint(-2.8F, -27.0F, -44.5F);
		Maingun.addChild(gun388);
		gun388.cubeList.add(new ModelBox(gun388, 74, 38, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun387 = new ModelRenderer(this);
		gun387.setRotationPoint(-2.0F, -27.6F, -40.0F);
		Maingun.addChild(gun387);
		setRotationAngle(gun387, -3.0486F, 0.0F, 0.0F);
		gun387.cubeList.add(new ModelBox(gun387, 71, 23, 0.0F, 0.0F, 0.0F, 2, 1, 2, -0.001F, false));

		gun386 = new ModelRenderer(this);
		gun386.setRotationPoint(-2.0F, -27.6F, -43.0F);
		Maingun.addChild(gun386);
		setRotationAngle(gun386, 1.2641F, 0.0F, 0.0F);
		gun386.cubeList.add(new ModelBox(gun386, 53, 63, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.001F, false));

		gun385 = new ModelRenderer(this);
		gun385.setRotationPoint(-1.5F, -24.4F, -42.5F);
		Maingun.addChild(gun385);
		setRotationAngle(gun385, 0.0F, 0.0F, -2.3562F);
		gun385.cubeList.add(new ModelBox(gun385, 47, 68, 0.0F, -0.01F, 0.0F, 1, 1, 1, 0.0F, false));

		gun384 = new ModelRenderer(this);
		gun384.setRotationPoint(-2.7F, -25.6F, -42.5F);
		Maingun.addChild(gun384);
		setRotationAngle(gun384, 0.0F, 0.0F, -0.7854F);
		gun384.cubeList.add(new ModelBox(gun384, 33, 69, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun383 = new ModelRenderer(this);
		gun383.setRotationPoint(-2.7F, -26.6F, -42.5F);
		Maingun.addChild(gun383);
		setRotationAngle(gun383, 0.0F, 0.0F, -0.7854F);
		gun383.cubeList.add(new ModelBox(gun383, 40, 69, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun382 = new ModelRenderer(this);
		gun382.setRotationPoint(0.7F, -25.6F, -42.5F);
		Maingun.addChild(gun382);
		setRotationAngle(gun382, 0.0F, 0.0F, 2.3562F);
		gun382.cubeList.add(new ModelBox(gun382, 6, 72, 0.0F, -0.01F, 0.0F, 1, 1, 1, 0.0F, false));

		gun381 = new ModelRenderer(this);
		gun381.setRotationPoint(-0.5F, -24.4F, -42.5F);
		Maingun.addChild(gun381);
		setRotationAngle(gun381, 0.0F, 0.0F, -2.3562F);
		gun381.cubeList.add(new ModelBox(gun381, 27, 72, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun380 = new ModelRenderer(this);
		gun380.setRotationPoint(0.7F, -26.6F, -42.5F);
		Maingun.addChild(gun380);
		setRotationAngle(gun380, 0.0F, 0.0F, 2.3562F);
		gun380.cubeList.add(new ModelBox(gun380, 72, 47, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun379 = new ModelRenderer(this);
		gun379.setRotationPoint(-2.0F, -28.6F, -43.0F);
		Maingun.addChild(gun379);
		gun379.cubeList.add(new ModelBox(gun379, 8, 56, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.001F, false));

		gun378 = new ModelRenderer(this);
		gun378.setRotationPoint(-2.0F, -27.6F, -42.5F);
		Maingun.addChild(gun378);
		gun378.cubeList.add(new ModelBox(gun378, 67, 55, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun377 = new ModelRenderer(this);
		gun377.setRotationPoint(-1.5F, -25.4F, -42.5F);
		Maingun.addChild(gun377);
		gun377.cubeList.add(new ModelBox(gun377, 51, 72, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun376 = new ModelRenderer(this);
		gun376.setRotationPoint(-0.3F, -26.6F, -42.5F);
		Maingun.addChild(gun376);
		gun376.cubeList.add(new ModelBox(gun376, 72, 51, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun375 = new ModelRenderer(this);
		gun375.setRotationPoint(-2.7F, -26.6F, -42.5F);
		Maingun.addChild(gun375);
		gun375.cubeList.add(new ModelBox(gun375, 72, 66, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun325 = new ModelRenderer(this);
		gun325.setRotationPoint(-3.0F, -28.2F, 9.8F);
		Maingun.addChild(gun325);
		gun325.cubeList.add(new ModelBox(gun325, 10, 42, 0.0F, 0.0F, 0.0F, 4, 1, 1, -0.001F, false));

		gun324 = new ModelRenderer(this);
		gun324.setRotationPoint(-3.0F, -27.5F, 9.8F);
		Maingun.addChild(gun324);
		

		gun323 = new ModelRenderer(this);
		gun323.setRotationPoint(-3.0F, -29.7F, 10.65F);
		Maingun.addChild(gun323);
		setRotationAngle(gun323, -0.2974F, 0.0F, 0.0F);
		gun323.cubeList.add(new ModelBox(gun323, 71, 12, 0.0F, 0.1F, 0.0F, 4, 3, 2, 0.0F, false));

		gun234 = new ModelRenderer(this);
		gun234.setRotationPoint(-3.0F, -26.5F, 9.5F);
		Maingun.addChild(gun234);
		gun234.cubeList.add(new ModelBox(gun234, 71, 31, 0.0F, -1.0F, 0.0F, 4, 2, 2, 0.001F, false));

		gun233 = new ModelRenderer(this);
		gun233.setRotationPoint(-3.0F, -28.3F, 9.0F);
		Maingun.addChild(gun233);
		gun233.cubeList.add(new ModelBox(gun233, 0, 42, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun228 = new ModelRenderer(this);
		gun228.setRotationPoint(-3.0F, -28.5F, 3.0F);
		Maingun.addChild(gun228);
		gun228.cubeList.add(new ModelBox(gun228, 71, 19, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun227 = new ModelRenderer(this);
		gun227.setRotationPoint(-3.0F, -29.3F, -4.0F);
		Maingun.addChild(gun227);
		gun227.cubeList.add(new ModelBox(gun227, 141, 78, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun121 = new ModelRenderer(this);
		gun121.setRotationPoint(-2.0F, -24.3F, 8.0F);
		Maingun.addChild(gun121);
		setRotationAngle(gun121, 0.7064F, 0.0F, 0.0F);
		gun121.cubeList.add(new ModelBox(gun121, 0, 69, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.001F, false));

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(-2.0F, -23.3F, 3.7F);
		Maingun.addChild(gun120);
		setRotationAngle(gun120, -1.3134F, 0.0F, 0.0F);
		gun120.cubeList.add(new ModelBox(gun120, 71, 26, 0.001F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));
		gun120.cubeList.add(new ModelBox(gun120, 12, 36, 0.001F, 1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(-2.0F, -24.3F, 4.5F);
		Maingun.addChild(gun119);
		setRotationAngle(gun119, -2.5281F, 0.0F, 0.0F);
		gun119.cubeList.add(new ModelBox(gun119, 8, 69, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.001F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(-2.0F, -24.3F, 4.0F);
		Maingun.addChild(gun118);
		setRotationAngle(gun118, -1.8961F, 0.0F, 0.0F);
		gun118.cubeList.add(new ModelBox(gun118, 51, 0, -0.003F, 0.0F, 0.0F, 2, 4, 2, -0.001F, false));

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(-2.0F, -24.1F, -1.0F);
		Maingun.addChild(gun114);
		setRotationAngle(gun114, 0.8717F, 0.0F, 0.0F);
		gun114.cubeList.add(new ModelBox(gun114, 57, 47, 0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F, false));

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(-2.0F, -21.2F, 3.3F);
		Maingun.addChild(gun113);
		setRotationAngle(gun113, 0.2201F, 0.0F, 0.0F);
		gun113.cubeList.add(new ModelBox(gun113, 67, 58, 0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(-2.0F, -22.7F, 9.34F);
		Maingun.addChild(gun112);
		setRotationAngle(gun112, -0.7436F, 0.0F, 0.0F);
		gun112.cubeList.add(new ModelBox(gun112, 12, 87, 0.0F, 0.0F, -1.0F, 2, 2, 1, 0.001F, false));

		gun111 = new ModelRenderer(this);
		gun111.setRotationPoint(-2.0F, -24.6F, 10.0F);
		Maingun.addChild(gun111);
		setRotationAngle(gun111, -0.3346F, 0.0F, 0.0F);
		gun111.cubeList.add(new ModelBox(gun111, 87, 15, 0.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		gun110 = new ModelRenderer(this);
		gun110.setRotationPoint(-2.0F, -25.1F, 0.0F);
		Maingun.addChild(gun110);
		gun110.cubeList.add(new ModelBox(gun110, 112, 64, 0.002F, 0.0F, -1.0F, 2, 1, 11, 0.0F, false));

		gun72 = new ModelRenderer(this);
		gun72.setRotationPoint(-3.0F, -30.0F, 0.0F);
		Maingun.addChild(gun72);
		gun72.cubeList.add(new ModelBox(gun72, 98, 32, 0.0F, 1.0F, 0.0F, 4, 3, 10, 0.002F, false));

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-3.0F, -30.0F, 10.0F);
		Maingun.addChild(gun68);
		setRotationAngle(gun68, -0.4461F, 0.0F, 0.0F);
		

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(-1.5F, -27.6F, -38.0F);
		Maingun.addChild(gun46);
		setRotationAngle(gun46, 0.0F, 0.0F, 0.7854F);
		gun46.cubeList.add(new ModelBox(gun46, 63, 176, -0.01F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(-0.5F, -27.6F, -38.0F);
		Maingun.addChild(gun42);
		setRotationAngle(gun42, 0.0F, 0.0F, 0.8029F);
		gun42.cubeList.add(new ModelBox(gun42, 178, 0, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-3.0F, -26.5F, 0.0F);
		Maingun.addChild(gun31);
		gun31.cubeList.add(new ModelBox(gun31, 94, 81, 0.0F, 0.0F, 0.0F, 4, 1, 10, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-3.0F, -29.2F, -12.2F);
		Maingun.addChild(gun24);
		setRotationAngle(gun24, -0.7854F, 0.0F, 0.0F);
		gun24.cubeList.add(new ModelBox(gun24, 73, 55, 0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(0.0F, -24.5F, -1.0F);
		Maingun.addChild(gun18);
		setRotationAngle(gun18, 0.0F, 0.0F, -2.3562F);
		

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-2.0F, -25.5F, -1.0F);
		Maingun.addChild(gun17);
		gun17.cubeList.add(new ModelBox(gun17, 103, 141, 0.001F, 0.0F, -1.0F, 2, 1, 14, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-3.0F, -25.5F, -14.0F);
		Maingun.addChild(gun16);
		setRotationAngle(gun16, 0.0F, 0.0F, -0.7854F);
		gun16.cubeList.add(new ModelBox(gun16, 89, 185, 0.2121F, 0.2121F, -0.01F, 1, 1, 24, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-2.0F, -24.5F, -13.0F);
		Maingun.addChild(gun15);
		setRotationAngle(gun15, 0.0F, 0.0F, -2.3562F);
		gun15.cubeList.add(new ModelBox(gun15, 18, 87, 0.0F, 0.1414F, -1.0F, 1, 1, 2, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(0.0F, -24.5F, -13.0F);
		Maingun.addChild(gun14);
		setRotationAngle(gun14, 0.0F, 0.0F, -2.3562F);
		gun14.cubeList.add(new ModelBox(gun14, 87, 18, 0.1414F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(0.8F, -25.5F, -14.0F);
		Maingun.addChild(gun13);
		setRotationAngle(gun13, 0.0F, 0.0F, 2.3562F);
		gun13.cubeList.add(new ModelBox(gun13, 115, 186, 0.1414F, 0.1414F, -0.01F, 1, 1, 24, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(1.0F, -30.0F, -14.0F);
		Maingun.addChild(gun12);
		setRotationAngle(gun12, 0.0F, 0.0F, 2.3562F);
		gun12.cubeList.add(new ModelBox(gun12, 142, 203, 0.0F, 0.0F, 0.0F, 1, 1, 23, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(0.0F, -31.0F, -14.0F);
		Maingun.addChild(gun11);
		setRotationAngle(gun11, 0.0F, 0.0F, 0.8029F);
		gun11.cubeList.add(new ModelBox(gun11, 0, 204, 0.0F, 0.0F, 0.01F, 1, 1, 23, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.0F, -30.0F, -4.0F);
		Maingun.addChild(gun10);
		setRotationAngle(gun10, 0.0F, 0.0F, -0.7854F);
		gun10.cubeList.add(new ModelBox(gun10, 17, 111, 0.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-3.0F, -30.0F, -14.0F);
		Maingun.addChild(gun9);
		setRotationAngle(gun9, 0.0F, 0.0F, -0.7854F);
		gun9.cubeList.add(new ModelBox(gun9, 87, 21, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-2.0F, -31.0F, -14.0F);
		Maingun.addChild(gun8);
		setRotationAngle(gun8, 0.0F, 0.0F, 0.7854F);
		gun8.cubeList.add(new ModelBox(gun8, 204, 0, -0.001F, 0.0F, 0.01F, 1, 1, 23, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.1F, -28.6F, -14.0F);
		Maingun.addChild(gun7);
		

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(0.0F, -30.0F, -14.0F);
		Maingun.addChild(gun6);
		gun6.cubeList.add(new ModelBox(gun6, 141, 46, 0.0F, 0.0F, -0.001F, 1, 2, 14, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-2.0F, -25.5F, -13.0F);
		Maingun.addChild(gun5);
		gun5.cubeList.add(new ModelBox(gun5, 0, 72, 0.0F, 0.1F, -1.1F, 2, 1, 2, -0.1F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.0F, -30.0F, -4.0F);
		Maingun.addChild(gun3);
		gun3.cubeList.add(new ModelBox(gun3, 141, 93, -0.001F, 0.0F, 0.001F, 1, 1, 10, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.0F, -30.0F, -14.0F);
		Maingun.addChild(gun2);
		gun2.cubeList.add(new ModelBox(gun2, 57, 74, 0.0F, 0.0F, -0.001F, 1, 2, 2, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-2.0F, -31.0F, -14.0F);
		Maingun.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 67, 210, 0.0F, 0.0F, 0.0F, 2, 1, 22, 0.0F, false));

		Scopes = new ModelRenderer(this);
		Scopes.setRotationPoint(0.0F, 0.0F, 0.0F);
		Maingun.addChild(Scopes);
		

		gun494 = new ModelRenderer(this);
		gun494.setRotationPoint(-1.5F, -31.8F, -54.3F);
		Scopes.addChild(gun494);
		setRotationAngle(gun494, -1.0782F, 0.0F, 0.0F);
		gun494.cubeList.add(new ModelBox(gun494, 59, 85, 0.0F, 1.0981F, -0.7529F, 1, 1, 2, -0.1F, false));

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(-1.5F, -31.8F, -56.3F);
		Scopes.addChild(gun66);
		setRotationAngle(gun66, -0.8551F, 0.0F, 0.0F);
		gun66.cubeList.add(new ModelBox(gun66, 40, 46, 0.0F, 0.7854F, -0.9084F, 1, 2, 1, -0.1F, false));

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(-1.5F, -31.8F, -56.3F);
		Scopes.addChild(gun65);
		gun65.cubeList.add(new ModelBox(gun65, 85, 54, -0.001F, -0.1F, -1.3F, 1, 1, 2, -0.1F, false));
		gun65.cubeList.add(new ModelBox(gun65, 8, 72, -0.001F, -0.9F, -1.3F, 1, 2, 2, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 67, 60, -0.201F, -1.4F, 63.2F, 1, 1, 1, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 65, 22, -0.001F, -1.4F, 63.2F, 1, 1, 1, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 13, 65, 0.199F, -1.4F, 63.2F, 1, 1, 1, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 40, 63, -0.201F, -0.6F, 63.2F, 1, 1, 1, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 34, 62, -0.001F, -0.6F, 63.2F, 1, 1, 1, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 13, 62, 0.199F, -0.6F, 63.2F, 1, 1, 1, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 33, 46, 0.399F, -1.2F, 63.2F, 1, 2, 1, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 41, 22, 0.599F, -1.0F, 63.2F, 1, 2, 1, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 41, 0, -0.601F, -1.0F, 63.2F, 1, 2, 1, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 40, 39, -0.401F, -1.2F, 63.2F, 1, 2, 1, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 53, 85, -0.5F, -0.401F, -1.6F, 1, 1, 2, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 85, 51, -0.501F, -0.402F, -1.0F, 1, 1, 2, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 85, 48, 0.499F, -0.402F, -1.0F, 1, 1, 2, -0.4F, false));
		gun65.cubeList.add(new ModelBox(gun65, 47, 85, 0.5F, -0.401F, -1.6F, 1, 1, 2, -0.4F, false));

		gun68_r1 = new ModelRenderer(this);
		gun68_r1.setRotationPoint(1.101F, 0.1F, -1.3F);
		gun65.addChild(gun68_r1);
		setRotationAngle(gun68_r1, 0.0F, 0.0F, 0.1396F);
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 80, 59, -0.6F, -1.0F, -0.3F, 1, 1, 2, -0.45F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 67, 80, -0.6F, -0.9F, -0.3F, 1, 1, 2, -0.45F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 73, 80, -0.6F, -0.7F, -0.3F, 1, 1, 2, -0.45F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 81, 15, -0.6F, -0.8F, -0.3F, 1, 1, 2, -0.45F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 81, 33, -0.6F, -0.5F, -0.3F, 1, 1, 2, -0.45F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 81, 47, -0.6F, -0.6F, -0.3F, 1, 1, 2, -0.45F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 81, 50, -0.599F, -0.5F, 0.3F, 1, 1, 2, -0.45F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 81, 53, -0.599F, -0.7F, 0.3F, 1, 1, 2, -0.45F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 57, 81, -0.599F, -0.6F, 0.3F, 1, 1, 2, -0.45F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 81, 66, -0.599F, -0.8F, 0.3F, 1, 1, 2, -0.45F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 81, 69, -0.599F, -0.9F, 0.3F, 1, 1, 2, -0.45F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 81, 80, -0.599F, -1.001F, 0.3F, 1, 1, 2, -0.45F, false));

		gun71_r1 = new ModelRenderer(this);
		gun71_r1.setRotationPoint(1.101F, 0.1F, -1.3F);
		gun65.addChild(gun71_r1);
		setRotationAngle(gun71_r1, 0.0F, 0.0F, 0.5236F);
		gun71_r1.cubeList.add(new ModelBox(gun71_r1, 81, 72, -0.8F, -1.1F, 0.3F, 1, 1, 2, -0.45F, false));
		gun71_r1.cubeList.add(new ModelBox(gun71_r1, 77, 81, -0.799F, -1.0F, -0.3F, 1, 1, 2, -0.45F, false));
		gun71_r1.cubeList.add(new ModelBox(gun71_r1, 81, 77, -0.8F, -1.0F, 0.3F, 1, 1, 2, -0.45F, false));
		gun71_r1.cubeList.add(new ModelBox(gun71_r1, 82, 38, -0.8F, -1.2F, 0.3F, 1, 1, 2, -0.45F, false));
		gun71_r1.cubeList.add(new ModelBox(gun71_r1, 82, 41, -0.8F, -1.3F, 0.3F, 1, 1, 2, -0.45F, false));
		gun71_r1.cubeList.add(new ModelBox(gun71_r1, 83, 0, -0.799F, -1.1F, -0.3F, 1, 1, 2, -0.45F, false));

		gun72_r1 = new ModelRenderer(this);
		gun72_r1.setRotationPoint(-0.101F, 0.1F, -1.3F);
		gun65.addChild(gun72_r1);
		setRotationAngle(gun72_r1, 0.0F, 0.0F, -0.1396F);
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 83, 3, -0.401F, -0.6F, 0.3F, 1, 1, 2, -0.45F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 83, 6, -0.401F, -0.7F, 0.3F, 1, 1, 2, -0.45F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 83, 12, -0.401F, -0.8F, 0.3F, 1, 1, 2, -0.45F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 83, 19, -0.401F, -0.9F, 0.3F, 1, 1, 2, -0.45F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 83, 22, -0.401F, -1.001F, 0.3F, 1, 1, 2, -0.45F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 83, 25, -0.401F, -0.5F, 0.3F, 1, 1, 2, -0.45F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 36, 83, -0.4F, -0.5F, -0.3F, 1, 1, 2, -0.45F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 83, 83, -0.4F, -0.6F, -0.3F, 1, 1, 2, -0.45F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 0, 84, -0.4F, -0.7F, -0.3F, 1, 1, 2, -0.45F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 6, 84, -0.4F, -0.8F, -0.3F, 1, 1, 2, -0.45F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 12, 84, -0.4F, -0.9F, -0.3F, 1, 1, 2, -0.45F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 85, 34, -0.4F, -1.0F, -0.3F, 1, 1, 2, -0.45F, false));

		gun72_r2 = new ModelRenderer(this);
		gun72_r2.setRotationPoint(-0.101F, 0.1F, -1.3F);
		gun65.addChild(gun72_r2);
		setRotationAngle(gun72_r2, 0.0F, 0.0F, -0.5236F);
		gun72_r2.cubeList.add(new ModelBox(gun72_r2, 18, 84, -0.2F, -1.3F, 0.3F, 1, 1, 2, -0.45F, false));
		gun72_r2.cubeList.add(new ModelBox(gun72_r2, 24, 84, -0.2F, -1.2F, 0.3F, 1, 1, 2, -0.45F, false));
		gun72_r2.cubeList.add(new ModelBox(gun72_r2, 30, 84, -0.2F, -1.1F, 0.3F, 1, 1, 2, -0.45F, false));
		gun72_r2.cubeList.add(new ModelBox(gun72_r2, 84, 58, -0.201F, -1.1F, -0.3F, 1, 1, 2, -0.45F, false));
		gun72_r2.cubeList.add(new ModelBox(gun72_r2, 84, 61, -0.2F, -1.0F, 0.3F, 1, 1, 2, -0.45F, false));
		gun72_r2.cubeList.add(new ModelBox(gun72_r2, 85, 31, -0.201F, -1.0F, -0.3F, 1, 1, 2, -0.45F, false));

		gun71_r2 = new ModelRenderer(this);
		gun71_r2.setRotationPoint(0.199F, 0.0F, 63.8F);
		gun65.addChild(gun71_r2);
		setRotationAngle(gun71_r2, 0.0F, 0.0F, -0.7854F);
		gun71_r2.cubeList.add(new ModelBox(gun71_r2, 65, 24, -0.399F, -0.68F, -0.598F, 1, 1, 1, -0.4F, false));

		gun70_r1 = new ModelRenderer(this);
		gun70_r1.setRotationPoint(0.199F, 0.0F, 63.8F);
		gun65.addChild(gun70_r1);
		setRotationAngle(gun70_r1, 0.0F, 0.0F, -0.7854F);
		gun70_r1.cubeList.add(new ModelBox(gun70_r1, 65, 31, -0.4F, -0.6F, -0.599F, 1, 1, 1, -0.4F, false));

		gun71_r3 = new ModelRenderer(this);
		gun71_r3.setRotationPoint(0.801F, 0.0F, 63.8F);
		gun65.addChild(gun71_r3);
		setRotationAngle(gun71_r3, 0.0F, 0.0F, 0.7854F);
		gun71_r3.cubeList.add(new ModelBox(gun71_r3, 65, 33, -0.6F, -0.6F, -0.599F, 1, 1, 1, -0.4F, false));

		gun72_r3 = new ModelRenderer(this);
		gun72_r3.setRotationPoint(0.801F, 0.0F, 63.8F);
		gun65.addChild(gun72_r3);
		setRotationAngle(gun72_r3, 0.0F, 0.0F, 0.7854F);
		gun72_r3.cubeList.add(new ModelBox(gun72_r3, 66, 41, -0.601F, -0.68F, -0.598F, 1, 1, 1, -0.4F, false));

		gun70_r2 = new ModelRenderer(this);
		gun70_r2.setRotationPoint(0.801F, -1.0F, 63.8F);
		gun65.addChild(gun70_r2);
		setRotationAngle(gun70_r2, 0.0F, 0.0F, -0.7854F);
		gun70_r2.cubeList.add(new ModelBox(gun70_r2, 47, 66, -0.6F, -0.4F, -0.599F, 1, 1, 1, -0.4F, false));

		gun71_r4 = new ModelRenderer(this);
		gun71_r4.setRotationPoint(0.801F, -1.0F, 63.8F);
		gun65.addChild(gun71_r4);
		setRotationAngle(gun71_r4, 0.0F, 0.0F, -0.7854F);
		gun71_r4.cubeList.add(new ModelBox(gun71_r4, 33, 67, -0.601F, -0.32F, -0.598F, 1, 1, 1, -0.4F, false));

		gun70_r3 = new ModelRenderer(this);
		gun70_r3.setRotationPoint(0.199F, -1.0F, 63.8F);
		gun65.addChild(gun70_r3);
		setRotationAngle(gun70_r3, 0.0F, 0.0F, 0.7854F);
		gun70_r3.cubeList.add(new ModelBox(gun70_r3, 40, 67, -0.399F, -0.32F, -0.598F, 1, 1, 1, -0.4F, false));

		gun69_r1 = new ModelRenderer(this);
		gun69_r1.setRotationPoint(0.199F, -1.0F, 63.8F);
		gun65.addChild(gun69_r1);
		setRotationAngle(gun69_r1, 0.0F, 0.0F, 0.7854F);
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 67, 58, -0.4F, -0.4F, -0.599F, 1, 1, 1, -0.4F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-2.0F, -31.0F, -15.0F);
		Maingun.addChild(gun4);
		gun4.cubeList.add(new ModelBox(gun4, 20, 58, 0.0F, -0.7F, 18.5F, 2, 1, 5, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 31, 37, 0.0F, -0.9F, 21.9F, 2, 1, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 35, 22, -0.4F, -1.3F, 18.0F, 1, 2, 4, -0.4F, false));
		gun4.cubeList.add(new ModelBox(gun4, 35, 0, 1.4F, -1.3F, 18.0F, 1, 2, 4, -0.4F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(2.1F, -1.9F, 19.6F);
		gun4.addChild(gun6_r1);
		setRotationAngle(gun6_r1, 0.0F, 0.0F, 0.1222F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 33, 60, -0.4F, 0.6F, -1.599F, 1, 2, 5, -0.4F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(2.2F, -1.9F, 21.6F);
		gun4.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.5236F, 0.0F, -0.0349F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 61, 4, -0.64F, -0.4F, -2.6F, 1, 1, 3, -0.4F, false));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(2.2F, -1.9F, 22.8F);
		gun4.addChild(gun4_r1);
		setRotationAngle(gun4_r1, 0.0F, 0.0F, -0.0349F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 51, 38, -0.639F, -0.4F, -1.6F, 1, 2, 2, -0.4F, false));
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 25, 65, -0.638F, 0.2F, -2.6F, 1, 1, 2, -0.4F, false));
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 64, 38, -0.638F, -0.2F, -1.9F, 1, 1, 2, -0.4F, false));
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 62, 19, -0.638F, 0.0F, -2.3F, 1, 1, 2, -0.4F, false));
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 29, 58, -0.638F, 0.4F, -2.95F, 1, 1, 3, -0.4F, false));

		gun6_r2 = new ModelRenderer(this);
		gun6_r2.setRotationPoint(2.2F, -1.9F, 22.8F);
		gun4.addChild(gun6_r2);
		setRotationAngle(gun6_r2, 0.2269F, 0.0F, -0.0349F);
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 53, 76, -0.641F, 0.5F, -1.2F, 1, 1, 2, -0.4F, false));
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 0, 3, -0.641F, -0.1F, -0.55F, 1, 1, 1, -0.4F, false));
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 47, 76, -0.641F, 0.1F, -1.4F, 1, 1, 2, -0.4F, false));
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 4, 76, -0.641F, 0.3F, -1.3F, 1, 1, 2, -0.4F, false));

		gun6_r3 = new ModelRenderer(this);
		gun6_r3.setRotationPoint(2.2F, -1.0F, 23.5F);
		gun4.addChild(gun6_r3);
		setRotationAngle(gun6_r3, 0.2594F, -0.036F, 0.1349F);
		gun6_r3.cubeList.add(new ModelBox(gun6_r3, 12, 32, -0.602F, -0.36F, -1.57F, 1, 2, 2, -0.4F, false));

		gun5_r2 = new ModelRenderer(this);
		gun5_r2.setRotationPoint(2.2F, -1.9F, 22.8F);
		gun4.addChild(gun5_r2);
		setRotationAngle(gun5_r2, 0.6632F, 0.0F, -0.0349F);
		gun5_r2.cubeList.add(new ModelBox(gun5_r2, 0, 0, -0.64F, -0.4F, -0.6F, 1, 2, 1, -0.4F, false));

		gun5_r3 = new ModelRenderer(this);
		gun5_r3.setRotationPoint(-0.2F, -1.0F, 23.5F);
		gun4.addChild(gun5_r3);
		setRotationAngle(gun5_r3, 0.2594F, 0.036F, -0.1349F);
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 12, 70, -0.398F, -0.36F, -1.57F, 1, 2, 2, -0.4F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(-0.2F, -1.9F, 22.8F);
		gun4.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 0.2269F, 0.0F, 0.0349F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 20, 37, -0.359F, -0.1F, -0.55F, 1, 1, 1, -0.4F, false));
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 76, 58, -0.359F, 0.1F, -1.4F, 1, 1, 2, -0.4F, false));
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 8, 77, -0.359F, 0.3F, -1.3F, 1, 1, 2, -0.4F, false));
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 20, 77, -0.359F, 0.5F, -1.2F, 1, 1, 2, -0.4F, false));

		gun4_r2 = new ModelRenderer(this);
		gun4_r2.setRotationPoint(-0.2F, -1.9F, 22.8F);
		gun4.addChild(gun4_r2);
		setRotationAngle(gun4_r2, 0.6632F, 0.0F, 0.0349F);
		gun4_r2.cubeList.add(new ModelBox(gun4_r2, 40, 36, -0.36F, -0.4F, -0.6F, 1, 2, 1, -0.4F, false));

		gun5_r4 = new ModelRenderer(this);
		gun5_r4.setRotationPoint(-0.1F, -1.9F, 19.6F);
		gun4.addChild(gun5_r4);
		setRotationAngle(gun5_r4, 0.0F, 0.0F, -0.1222F);
		gun5_r4.cubeList.add(new ModelBox(gun5_r4, 33, 67, -0.6F, 0.6F, -1.599F, 1, 2, 5, -0.4F, false));

		gun4_r3 = new ModelRenderer(this);
		gun4_r3.setRotationPoint(-0.2F, -1.9F, 21.6F);
		gun4.addChild(gun4_r3);
		setRotationAngle(gun4_r3, 0.5236F, 0.0F, 0.0349F);
		gun4_r3.cubeList.add(new ModelBox(gun4_r3, 20, 69, -0.36F, -0.4F, -2.6F, 1, 1, 3, -0.4F, false));

		gun8_r2 = new ModelRenderer(this);
		gun8_r2.setRotationPoint(-0.2F, -1.9F, 22.6F);
		gun4.addChild(gun8_r2);
		setRotationAngle(gun8_r2, 0.0F, 0.0F, 0.0349F);
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 25, 69, -0.362F, -0.2F, -1.7F, 1, 1, 2, -0.4F, false));
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 20, 73, -0.362F, 0.0F, -2.1F, 1, 1, 2, -0.4F, false));
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 0, 75, -0.362F, 0.2F, -2.4F, 1, 1, 2, -0.4F, false));
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 59, 38, -0.362F, 0.4F, -2.75F, 1, 1, 3, -0.4F, false));
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 61, 0, -0.362F, 0.6F, -3.1F, 1, 1, 3, -0.4F, false));
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 59, 70, -0.361F, -0.4F, -1.4F, 1, 2, 2, -0.4F, false));

		gun5_r5 = new ModelRenderer(this);
		gun5_r5.setRotationPoint(2.2F, -1.7F, 22.6F);
		gun4.addChild(gun5_r5);
		setRotationAngle(gun5_r5, 0.2793F, 0.0F, 0.0F);
		gun5_r5.cubeList.add(new ModelBox(gun5_r5, 11, 0, -0.55F, -0.4F, -1.6F, 1, 2, 2, -0.6F, false));

		gun4_r4 = new ModelRenderer(this);
		gun4_r4.setRotationPoint(-0.3F, -1.7F, 22.6F);
		gun4.addChild(gun4_r4);
		setRotationAngle(gun4_r4, 0.2793F, 0.0F, 0.0F);
		gun4_r4.cubeList.add(new ModelBox(gun4_r4, 0, 32, -0.35F, -0.4F, -1.6F, 1, 2, 2, -0.6F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(2.0F, -0.7F, 23.5F);
		gun4.addChild(gun3_r1);
		setRotationAngle(gun3_r1, -1.309F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 0, 36, -2.0F, -0.1F, 0.0F, 2, 1, 1, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-2.0F, -30.8F, 10.1F);
		Maingun.addChild(gun20);
		setRotationAngle(gun20, -0.4484F, 0.0F, 0.0F);
		gun20.cubeList.add(new ModelBox(gun20, 18, 42, 0.0F, 0.0F, 1.0F, 2, 1, 2, 0.0F, false));
		gun20.cubeList.add(new ModelBox(gun20, 73, 77, 1.2F, -0.201F, -0.2F, 1, 1, 2, -0.2F, false));
		gun20.cubeList.add(new ModelBox(gun20, 67, 77, -0.2F, -0.201F, -0.2F, 1, 1, 2, -0.2F, false));
		gun20.cubeList.add(new ModelBox(gun20, 26, 77, 0.5F, 0.0308F, 0.0365F, 1, 1, 2, 0.0F, false));

		gun73_r1 = new ModelRenderer(this);
		gun73_r1.setRotationPoint(2.0F, 0.0F, 0.2F);
		gun20.addChild(gun73_r1);
		setRotationAngle(gun73_r1, 0.0F, 0.0F, -0.5934F);
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 57, 66, -2.8581F, -1.1194F, 0.2F, 1, 1, 3, 0.0F, false));

		gun72_r4 = new ModelRenderer(this);
		gun72_r4.setRotationPoint(2.0F, 0.0F, 0.2F);
		gun20.addChild(gun72_r4);
		setRotationAngle(gun72_r4, 0.0F, 0.0F, -0.5934F);
		gun72_r4.cubeList.add(new ModelBox(gun72_r4, 20, 65, -2.6581F, -1.1184F, 0.1F, 1, 1, 3, 0.0F, false));

		gun72_r5 = new ModelRenderer(this);
		gun72_r5.setRotationPoint(2.0F, 0.0F, 0.2F);
		gun20.addChild(gun72_r5);
		setRotationAngle(gun72_r5, 0.0F, 0.0F, 0.5934F);
		gun72_r5.cubeList.add(new ModelBox(gun72_r5, 67, 51, 0.2F, -0.001F, 0.2F, 1, 1, 3, 0.0F, false));

		gun71_r5 = new ModelRenderer(this);
		gun71_r5.setRotationPoint(2.0F, 0.0F, 0.2F);
		gun20.addChild(gun71_r5);
		setRotationAngle(gun71_r5, 0.0F, 0.0F, 0.5934F);
		gun71_r5.cubeList.add(new ModelBox(gun71_r5, 67, 66, 0.0F, 0.0F, 0.1F, 1, 1, 3, 0.0F, false));

		gun74_r1 = new ModelRenderer(this);
		gun74_r1.setRotationPoint(2.0F, 0.0F, 0.0F);
		gun20.addChild(gun74_r1);
		setRotationAngle(gun74_r1, 0.2814F, -0.1068F, -0.0338F);
		gun74_r1.cubeList.add(new ModelBox(gun74_r1, 61, 13, -1.0875F, -0.3059F, -2.6765F, 1, 1, 3, -0.3F, false));

		gun73_r2 = new ModelRenderer(this);
		gun73_r2.setRotationPoint(2.0F, 0.0F, 0.0F);
		gun20.addChild(gun73_r2);
		setRotationAngle(gun73_r2, 0.2814F, 0.1068F, 0.0338F);
		gun73_r2.cubeList.add(new ModelBox(gun73_r2, 61, 27, -1.9F, -0.3F, -2.9F, 1, 1, 3, -0.3F, false));

		gun72_r6 = new ModelRenderer(this);
		gun72_r6.setRotationPoint(2.0F, 0.0F, 0.0F);
		gun20.addChild(gun72_r6);
		setRotationAngle(gun72_r6, 0.2793F, 0.0F, 0.0F);
		gun72_r6.cubeList.add(new ModelBox(gun72_r6, 8, 65, -2.2F, -0.2F, -2.8F, 1, 1, 3, -0.2F, false));
		gun72_r6.cubeList.add(new ModelBox(gun72_r6, 61, 9, -1.5F, 0.0308F, -2.9635F, 1, 1, 3, 0.0F, false));
		gun72_r6.cubeList.add(new ModelBox(gun72_r6, 67, 47, -0.8F, -0.2F, -2.8F, 1, 1, 3, -0.2F, false));

		gun74_r2 = new ModelRenderer(this);
		gun74_r2.setRotationPoint(2.0F, 31.0F, -10.0F);
		gun20.addChild(gun74_r2);
		setRotationAngle(gun74_r2, 0.0F, -0.1571F, 0.0F);
		gun74_r2.cubeList.add(new ModelBox(gun74_r2, 32, 77, 0.4746F, -31.302F, 9.6229F, 1, 1, 2, -0.3F, false));

		gun73_r3 = new ModelRenderer(this);
		gun73_r3.setRotationPoint(2.0F, 31.0F, -10.0F);
		gun20.addChild(gun73_r3);
		setRotationAngle(gun73_r3, 0.0F, 0.1571F, 0.0F);
		gun73_r3.cubeList.add(new ModelBox(gun73_r3, 38, 77, -3.45F, -31.302F, 9.31F, 1, 1, 2, -0.3F, false));

		Pump = new ModelRenderer(this);
		Pump.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		pump37 = new ModelRenderer(this);
		pump37.setRotationPoint(-2.5F, -28.5F, -39.0F);
		Pump.addChild(pump37);
		setRotationAngle(pump37, 0.0F, 0.0F, -0.7808F);
		pump37.cubeList.add(new ModelBox(pump37, 116, 124, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		pump36 = new ModelRenderer(this);
		pump36.setRotationPoint(-0.9F, -28.5F, -39.0F);
		Pump.addChild(pump36);
		setRotationAngle(pump36, 0.0F, 0.0F, -0.7808F);
		pump36.cubeList.add(new ModelBox(pump36, 22, 125, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		pump35 = new ModelRenderer(this);
		pump35.setRotationPoint(1.0F, -26.6F, -39.0F);
		Pump.addChild(pump35);
		setRotationAngle(pump35, 0.0F, 0.0F, 1.0782F);
		pump35.cubeList.add(new ModelBox(pump35, 47, 128, -2.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		pump34 = new ModelRenderer(this);
		pump34.setRotationPoint(-3.0F, -26.6F, -39.0F);
		Pump.addChild(pump34);
		setRotationAngle(pump34, 0.0F, 0.0F, -1.0782F);
		pump34.cubeList.add(new ModelBox(pump34, 70, 141, 1.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		pump33 = new ModelRenderer(this);
		pump33.setRotationPoint(-3.0F, -26.6F, -39.0F);
		Pump.addChild(pump33);
		setRotationAngle(pump33, 0.0F, 0.0F, -1.0782F);
		pump33.cubeList.add(new ModelBox(pump33, 0, 46, 0.0F, 0.0F, 0.0F, 1, 1, 18, 0.0F, false));

		pump32 = new ModelRenderer(this);
		pump32.setRotationPoint(1.0F, -26.6F, -39.0F);
		Pump.addChild(pump32);
		setRotationAngle(pump32, 0.0F, 0.0F, 1.0782F);
		pump32.cubeList.add(new ModelBox(pump32, 47, 47, -1.0F, 0.0F, 0.0F, 1, 1, 18, 0.0F, false));

		pump31 = new ModelRenderer(this);
		pump31.setRotationPoint(-0.6F, -28.8F, -39.0F);
		Pump.addChild(pump31);
		pump31.cubeList.add(new ModelBox(pump31, 23, 0, 0.0F, 0.0F, -0.01F, 1, 2, 10, 0.0F, false));

		pump30 = new ModelRenderer(this);
		pump30.setRotationPoint(-2.4F, -28.8F, -39.0F);
		Pump.addChild(pump30);
		pump30.cubeList.add(new ModelBox(pump30, 71, 0, 0.0F, 0.0F, -0.01F, 1, 2, 10, 0.0F, false));

		pump29 = new ModelRenderer(this);
		pump29.setRotationPoint(-3.0F, -26.6F, -16.0F);
		Pump.addChild(pump29);
		setRotationAngle(pump29, 0.0F, 0.0F, -1.3384F);
		pump29.cubeList.add(new ModelBox(pump29, 85, 64, 0.2F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		pump28 = new ModelRenderer(this);
		pump28.setRotationPoint(-3.0F, -26.6F, -16.0F);
		Pump.addChild(pump28);
		setRotationAngle(pump28, 0.0F, 0.0F, -1.3384F);
		pump28.cubeList.add(new ModelBox(pump28, 65, 85, 0.0F, -0.01F, -0.001F, 1, 1, 2, 0.0F, false));

		pump27 = new ModelRenderer(this);
		pump27.setRotationPoint(1.0F, -26.6F, -16.0F);
		Pump.addChild(pump27);
		setRotationAngle(pump27, 0.0F, 0.0F, 1.3384F);
		pump27.cubeList.add(new ModelBox(pump27, 85, 67, -1.2F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		pump26 = new ModelRenderer(this);
		pump26.setRotationPoint(1.0F, -26.6F, -16.0F);
		Pump.addChild(pump26);
		setRotationAngle(pump26, 0.0F, 0.0F, 1.3384F);
		pump26.cubeList.add(new ModelBox(pump26, 85, 70, -1.0F, -0.01F, -0.001F, 1, 1, 2, 0.0F, false));

		pump25 = new ModelRenderer(this);
		pump25.setRotationPoint(0.7F, -27.8F, -29.0F);
		Pump.addChild(pump25);
		setRotationAngle(pump25, 0.0F, 0.0F, 1.2269F);
		pump25.cubeList.add(new ModelBox(pump25, 67, 70, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		pump24 = new ModelRenderer(this);
		pump24.setRotationPoint(-0.3F, -27.8F, -29.0F);
		Pump.addChild(pump24);
		pump24.cubeList.add(new ModelBox(pump24, 94, 111, 0.0F, 0.0F, 0.0F, 1, 2, 15, 0.0F, false));

		pump23 = new ModelRenderer(this);
		pump23.setRotationPoint(-2.7F, -27.8F, -29.0F);
		Pump.addChild(pump23);
		setRotationAngle(pump23, 0.0F, 0.0F, -1.2269F);
		pump23.cubeList.add(new ModelBox(pump23, 71, 0, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		pump22 = new ModelRenderer(this);
		pump22.setRotationPoint(-2.7F, -27.8F, -29.0F);
		Pump.addChild(pump22);
		pump22.cubeList.add(new ModelBox(pump22, 0, 94, 0.0F, -0.01F, 0.0F, 3, 2, 15, 0.0F, false));

		pump21 = new ModelRenderer(this);
		pump21.setRotationPoint(-2.0F, -24.2F, -12.6F);
		Pump.addChild(pump21);
		setRotationAngle(pump21, -2.8256F, 0.0F, 0.0F);
		pump21.cubeList.add(new ModelBox(pump21, 39, 34, 0.0F, -0.01F, 1.5F, 2, 1, 1, 0.001F, false));

		pump20 = new ModelRenderer(this);
		pump20.setRotationPoint(-2.0F, -24.2F, -13.6F);
		Pump.addChild(pump20);
		setRotationAngle(pump20, 0.0F, 0.0F, -2.3051F);
		pump20.cubeList.add(new ModelBox(pump20, 51, 42, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		pump19 = new ModelRenderer(this);
		pump19.setRotationPoint(0.0F, -24.2F, -13.6F);
		Pump.addChild(pump19);
		setRotationAngle(pump19, 0.0F, 0.0F, 2.3051F);
		pump19.cubeList.add(new ModelBox(pump19, 39, 54, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		pump18 = new ModelRenderer(this);
		pump18.setRotationPoint(-3.2F, -27.6F, -13.2F);
		Pump.addChild(pump18);
		setRotationAngle(pump18, -1.1897F, 0.0F, 0.0F);
		pump18.cubeList.add(new ModelBox(pump18, 71, 85, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		pump17 = new ModelRenderer(this);
		pump17.setRotationPoint(0.2F, -27.6F, -13.2F);
		Pump.addChild(pump17);
		setRotationAngle(pump17, -1.1897F, 0.0F, 0.0F);
		pump17.cubeList.add(new ModelBox(pump17, 85, 73, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		pump16 = new ModelRenderer(this);
		pump16.setRotationPoint(0.0F, -24.2F, -14.2F);
		Pump.addChild(pump16);
		setRotationAngle(pump16, 0.0F, 0.0F, 2.3051F);
		pump16.cubeList.add(new ModelBox(pump16, 59, 42, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		pump15 = new ModelRenderer(this);
		pump15.setRotationPoint(-2.0F, -24.2F, -14.2F);
		Pump.addChild(pump15);
		setRotationAngle(pump15, 0.0F, 0.0F, -2.3051F);
		pump15.cubeList.add(new ModelBox(pump15, 0, 60, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		pump14 = new ModelRenderer(this);
		pump14.setRotationPoint(-2.0F, -24.2F, -12.6F);
		Pump.addChild(pump14);
		setRotationAngle(pump14, -2.8256F, 0.0F, 0.0F);
		pump14.cubeList.add(new ModelBox(pump14, 51, 34, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		pump1333 = new ModelRenderer(this);
		pump1333.setRotationPoint(-3.2F, -27.6F, -14.2F);
		Pump.addChild(pump1333);
		setRotationAngle(pump1333, 0.0F, 0.0F, -1.5243F);
		pump1333.cubeList.add(new ModelBox(pump1333, 47, 60, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		pump133 = new ModelRenderer(this);
		pump133.setRotationPoint(1.2F, -27.6F, -14.2F);
		Pump.addChild(pump133);
		setRotationAngle(pump133, 0.0F, 0.0F, 1.5243F);
		pump133.cubeList.add(new ModelBox(pump133, 47, 63, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		pump13 = new ModelRenderer(this);
		pump13.setRotationPoint(1.0F, -26.6F, -16.0F);
		Pump.addChild(pump13);
		setRotationAngle(pump13, 0.0F, 0.0F, 0.2974F);
		pump13.cubeList.add(new ModelBox(pump13, 77, 85, -0.999F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		pump12 = new ModelRenderer(this);
		pump12.setRotationPoint(-3.0F, -26.6F, -16.0F);
		Pump.addChild(pump12);
		setRotationAngle(pump12, 0.0F, 0.0F, -0.2974F);
		pump12.cubeList.add(new ModelBox(pump12, 85, 78, -0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		pump11 = new ModelRenderer(this);
		pump11.setRotationPoint(0.6F, -25.2F, -25.0F);
		Pump.addChild(pump11);
		setRotationAngle(pump11, 0.0F, 0.0F, 2.0076F);
		pump11.cubeList.add(new ModelBox(pump11, 20, 46, 0.4F, -0.01F, 0.0F, 1, 1, 11, 0.0F, false));

		pump10 = new ModelRenderer(this);
		pump10.setRotationPoint(0.6F, -25.2F, -30.0F);
		Pump.addChild(pump10);
		setRotationAngle(pump10, 0.0F, 0.0F, 2.0076F);
		pump10.cubeList.add(new ModelBox(pump10, 94, 47, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		pump9 = new ModelRenderer(this);
		pump9.setRotationPoint(-2.6F, -25.2F, -25.0F);
		Pump.addChild(pump9);
		setRotationAngle(pump9, 0.0F, 0.0F, -2.0076F);
		pump9.cubeList.add(new ModelBox(pump9, 20, 65, -1.4F, -0.01F, 0.0F, 1, 1, 11, 0.0F, false));

		pump8 = new ModelRenderer(this);
		pump8.setRotationPoint(-2.6F, -25.2F, -30.0F);
		Pump.addChild(pump8);
		setRotationAngle(pump8, 0.0F, 0.0F, -2.0076F);
		pump8.cubeList.add(new ModelBox(pump8, 94, 64, -1.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		pump7 = new ModelRenderer(this);
		pump7.setRotationPoint(-2.6F, -25.2F, -39.0F);
		Pump.addChild(pump7);
		setRotationAngle(pump7, 0.0F, 0.0F, -2.1935F);
		pump7.cubeList.add(new ModelBox(pump7, 51, 0, -1.0F, 0.0F, 0.0F, 1, 1, 18, 0.0F, false));

		pump6 = new ModelRenderer(this);
		pump6.setRotationPoint(0.6F, -25.2F, -39.0F);
		Pump.addChild(pump6);
		setRotationAngle(pump6, 0.0F, 0.0F, 2.1935F);
		pump6.cubeList.add(new ModelBox(pump6, 51, 19, 0.0F, 0.0F, 0.0F, 1, 1, 18, 0.0F, false));

		pump5 = new ModelRenderer(this);
		pump5.setRotationPoint(-2.0F, -24.3F, -39.0F);
		Pump.addChild(pump5);
		setRotationAngle(pump5, 1.5429F, 0.0F, 0.0F);
		pump5.cubeList.add(new ModelBox(pump5, 36, 94, 0.0F, 0.0F, 0.0F, 2, 24, 2, 0.0F, false));

		pump4 = new ModelRenderer(this);
		pump4.setRotationPoint(1.0F, -26.6F, -39.0F);
		Pump.addChild(pump4);
		setRotationAngle(pump4, 0.0F, 0.0F, 0.2974F);
		pump4.cubeList.add(new ModelBox(pump4, 174, 78, -1.0F, 0.5F, 0.0F, 1, 1, 25, 0.0F, false));

		pump3 = new ModelRenderer(this);
		pump3.setRotationPoint(1.0F, -26.6F, -39.0F);
		Pump.addChild(pump3);
		setRotationAngle(pump3, 0.0F, 0.0F, 0.2974F);
		pump3.cubeList.add(new ModelBox(pump3, 0, 65, -0.999F, 0.0F, -0.01F, 1, 1, 18, 0.0F, false));

		pump2 = new ModelRenderer(this);
		pump2.setRotationPoint(-3.0F, -26.6F, -39.0F);
		Pump.addChild(pump2);
		setRotationAngle(pump2, 0.0F, 0.0F, -0.2974F);
		pump2.cubeList.add(new ModelBox(pump2, 174, 125, 0.0F, 0.5F, 0.0F, 1, 1, 25, 0.0F, false));

		pump1 = new ModelRenderer(this);
		pump1.setRotationPoint(-3.0F, -26.6F, -39.0F);
		Pump.addChild(pump1);
		setRotationAngle(pump1, 0.0F, 0.0F, -0.2974F);
		pump1.cubeList.add(new ModelBox(pump1, 47, 66, -0.01F, 0.0F, -0.01F, 1, 1, 18, 0.0F, false));

		MaingunACTION = new ModelRenderer(this);
		MaingunACTION.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pump.addChild(MaingunACTION);
		

		action5 = new ModelRenderer(this);
		action5.setRotationPoint(-2.7F, -29.8F, -12.0F);
		MaingunACTION.addChild(action5);
		action5.cubeList.add(new ModelBox(action5, 51, 9, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		action6 = new ModelRenderer(this);
		action6.setRotationPoint(-2.7F, -29.8F, -12.0F);
		MaingunACTION.addChild(action6);
		setRotationAngle(action6, 0.0F, 0.0F, -0.7854F);
		action6.cubeList.add(new ModelBox(action6, 51, 0, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		action7 = new ModelRenderer(this);
		action7.setRotationPoint(-2.7F, -28.8F, -12.0F);
		MaingunACTION.addChild(action7);
		setRotationAngle(action7, 0.0F, 0.0F, -0.5995F);
		action7.cubeList.add(new ModelBox(action7, 0, 22, 0.0F, 0.0F, 0.0F, 1, 2, 18, 0.0F, false));

		Stock = new ModelRenderer(this);
		Stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		stock24 = new ModelRenderer(this);
		stock24.setRotationPoint(-3.1F, -26.7F, 22.5F);
		Stock.addChild(stock24);
		setRotationAngle(stock24, -0.1487F, 0.0F, 0.0F);
		stock24.cubeList.add(new ModelBox(stock24, 0, 22, 0.01F, 3.0F, 12.0F, 1, 2, 8, 0.0F, false));

		stock23 = new ModelRenderer(this);
		stock23.setRotationPoint(0.1F, -26.7F, 22.5F);
		Stock.addChild(stock23);
		setRotationAngle(stock23, -0.1487F, 0.0F, 0.0F);
		stock23.cubeList.add(new ModelBox(stock23, 0, 46, -0.01F, 3.0F, 12.0F, 1, 2, 8, 0.0F, false));

		stock22 = new ModelRenderer(this);
		stock22.setRotationPoint(0.1F, -22.1F, 25.5F);
		Stock.addChild(stock22);
		setRotationAngle(stock22, -0.3718F, 0.0F, 0.0F);
		stock22.cubeList.add(new ModelBox(stock22, 168, 205, 0.0F, -3.0F, -5.0F, 1, 3, 22, 0.0F, false));

		stock21 = new ModelRenderer(this);
		stock21.setRotationPoint(-3.1F, -22.1F, 25.5F);
		Stock.addChild(stock21);
		setRotationAngle(stock21, -0.3718F, 0.0F, 0.0F);
		stock21.cubeList.add(new ModelBox(stock21, 207, 24, 0.0F, -3.0F, -5.0F, 1, 3, 22, 0.0F, false));

		stock20 = new ModelRenderer(this);
		stock20.setRotationPoint(-2.0F, -27.0F, 11.5F);
		Stock.addChild(stock20);
		stock20.cubeList.add(new ModelBox(stock20, 65, 38, 0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

		stock19 = new ModelRenderer(this);
		stock19.setRotationPoint(-2.5F, -22.1F, 25.5F);
		Stock.addChild(stock19);
		setRotationAngle(stock19, -0.3718F, 0.0F, 0.0F);
		stock19.cubeList.add(new ModelBox(stock19, 0, 0, 0.0F, -4.0F, 0.0F, 3, 5, 17, 0.0F, false));

		stock18 = new ModelRenderer(this);
		stock18.setRotationPoint(-2.5F, -24.0F, 15.5F);
		Stock.addChild(stock18);
		setRotationAngle(stock18, -0.2974F, 0.0F, 0.0F);
		stock18.cubeList.add(new ModelBox(stock18, 66, 95, 0.0F, -3.0F, 2.0F, 3, 3, 10, 0.002F, false));
		stock18.cubeList.add(new ModelBox(stock18, 47, 111, -0.599F, -3.0F, -3.0F, 1, 2, 15, 0.0F, false));
		stock18.cubeList.add(new ModelBox(stock18, 0, 111, 2.601F, -3.0F, -3.0F, 1, 2, 15, 0.0F, false));

		stock19_r1 = new ModelRenderer(this);
		stock19_r1.setRotationPoint(2.5F, 24.0F, -15.5F);
		stock18.addChild(stock19_r1);
		setRotationAngle(stock19_r1, -0.3491F, 0.0F, 0.0F);
		stock19_r1.cubeList.add(new ModelBox(stock19_r1, 51, 27, -2.499F, -31.6F, 4.2F, 3, 3, 4, 0.002F, false));

		stock17 = new ModelRenderer(this);
		stock17.setRotationPoint(-3.1F, -26.7F, 22.5F);
		Stock.addChild(stock17);
		setRotationAngle(stock17, -0.1487F, 0.0F, 0.0F);
		stock17.cubeList.add(new ModelBox(stock17, 51, 19, -0.011F, 3.0F, 20.0F, 4, 5, 3, 0.0F, false));
		stock17.cubeList.add(new ModelBox(stock17, 33, 12, 0.589F, 7.82F, 20.0185F, 3, 1, 3, 0.0F, false));

		stock16 = new ModelRenderer(this);
		stock16.setRotationPoint(0.1F, -26.7F, 22.5F);
		Stock.addChild(stock16);
		setRotationAngle(stock16, -0.1487F, 0.0F, 0.0F);
		stock16.cubeList.add(new ModelBox(stock16, 23, 0, 0.01F, 0.99F, 20.01F, 1, 7, 3, 0.0F, false));

		stock15 = new ModelRenderer(this);
		stock15.setRotationPoint(0.1F, -26.7F, 22.5F);
		Stock.addChild(stock15);
		setRotationAngle(stock15, -0.1487F, 0.0F, 0.0F);
		stock15.cubeList.add(new ModelBox(stock15, 188, 151, 0.02F, 0.19F, 0.0F, 1, 3, 23, 0.0F, false));

		stock14 = new ModelRenderer(this);
		stock14.setRotationPoint(-2.0F, -29.0F, 14.5F);
		Stock.addChild(stock14);
		setRotationAngle(stock14, -0.2231F, 0.0F, 0.0F);
		stock14.cubeList.add(new ModelBox(stock14, 67, 47, 0.0F, -0.02F, -1.0F, 2, 1, 10, 0.0F, false));

		stock16_r1 = new ModelRenderer(this);
		stock16_r1.setRotationPoint(2.0F, -0.02F, -1.0F);
		stock14.addChild(stock16_r1);
		setRotationAngle(stock16_r1, 0.0F, 0.0F, -0.5061F);
		stock16_r1.cubeList.add(new ModelBox(stock16_r1, 117, 0, -2.7492F, -0.9696F, 0.0F, 1, 1, 10, 0.0F, false));
		stock16_r1.cubeList.add(new ModelBox(stock16_r1, 113, 95, -2.9892F, -0.9706F, 0.001F, 1, 1, 10, 0.0F, false));

		stock16_r2 = new ModelRenderer(this);
		stock16_r2.setRotationPoint(2.0F, -0.02F, -1.0F);
		stock14.addChild(stock16_r2);
		setRotationAngle(stock16_r2, 0.0F, 0.0F, 0.5061F);
		stock16_r2.cubeList.add(new ModelBox(stock16_r2, 117, 16, 0.24F, -0.001F, 0.001F, 1, 1, 10, 0.0F, false));
		stock16_r2.cubeList.add(new ModelBox(stock16_r2, 69, 124, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		stock13 = new ModelRenderer(this);
		stock13.setRotationPoint(-2.0F, -27.1F, 22.5F);
		Stock.addChild(stock13);
		setRotationAngle(stock13, -0.1487F, 0.0F, 0.0F);
		stock13.cubeList.add(new ModelBox(stock13, 188, 177, 0.0F, -0.04F, -0.001F, 2, 1, 23, -0.001F, false));

		stock16_r3 = new ModelRenderer(this);
		stock16_r3.setRotationPoint(2.0F, -0.04F, 0.0F);
		stock13.addChild(stock16_r3);
		setRotationAngle(stock16_r3, 0.0F, 0.0F, -0.5061F);
		stock16_r3.cubeList.add(new ModelBox(stock16_r3, 201, 64, -2.9892F, -0.9706F, 0.001F, 1, 1, 23, -0.001F, false));
		stock16_r3.cubeList.add(new ModelBox(stock16_r3, 41, 201, -2.7492F, -0.9696F, 0.0F, 1, 1, 23, -0.001F, false));

		stock15_r1 = new ModelRenderer(this);
		stock15_r1.setRotationPoint(2.0F, -0.04F, 0.0F);
		stock13.addChild(stock15_r1);
		setRotationAngle(stock15_r1, 0.0F, 0.0F, 0.5061F);
		stock15_r1.cubeList.add(new ModelBox(stock15_r1, 201, 104, 0.24F, -0.001F, 0.001F, 1, 1, 23, -0.001F, false));
		stock15_r1.cubeList.add(new ModelBox(stock15_r1, 196, 201, 0.0F, 0.0F, 0.0F, 1, 1, 23, -0.001F, false));

		stock12 = new ModelRenderer(this);
		stock12.setRotationPoint(-3.1F, -26.7F, 22.5F);
		Stock.addChild(stock12);
		setRotationAngle(stock12, -0.1487F, 0.0F, 0.0F);
		stock12.cubeList.add(new ModelBox(stock12, 33, 174, -0.01F, 0.2F, 0.001F, 4, 3, 23, 0.0F, false));

		stock11 = new ModelRenderer(this);
		stock11.setRotationPoint(-2.0F, -26.6F, 11.5F);
		Stock.addChild(stock11);
		setRotationAngle(stock11, 1.2641F, 0.0F, 0.0F);
		stock11.cubeList.add(new ModelBox(stock11, 35, 86, 0.0F, 0.1F, 2.22F, 2, 2, 1, 0.0F, false));

		stock13_r1 = new ModelRenderer(this);
		stock13_r1.setRotationPoint(2.0F, 0.1F, 3.2F);
		stock11.addChild(stock13_r1);
		setRotationAngle(stock13_r1, 0.0F, -0.5061F, 0.0F);
		stock13_r1.cubeList.add(new ModelBox(stock13_r1, 35, 22, -2.7492F, 0.07F, -0.0104F, 1, 2, 1, 0.0F, false));
		stock13_r1.cubeList.add(new ModelBox(stock13_r1, 35, 0, -2.9792F, 0.069F, -0.0094F, 1, 2, 1, 0.0F, false));

		stock13_r2 = new ModelRenderer(this);
		stock13_r2.setRotationPoint(2.0F, 0.1F, 3.2F);
		stock11.addChild(stock13_r2);
		setRotationAngle(stock13_r2, 0.0F, 0.5061F, 0.0F);
		stock13_r2.cubeList.add(new ModelBox(stock13_r2, 40, 16, 0.23F, 0.069F, -0.979F, 1, 2, 1, 0.0F, false));
		stock13_r2.cubeList.add(new ModelBox(stock13_r2, 40, 19, 0.0F, 0.07F, -0.98F, 1, 2, 1, 0.0F, false));

		stock8 = new ModelRenderer(this);
		stock8.setRotationPoint(-3.1F, -26.6F, 11.5F);
		Stock.addChild(stock8);
		setRotationAngle(stock8, 1.1897F, 0.0F, 0.0F);
		stock8.cubeList.add(new ModelBox(stock8, 47, 72, -0.01F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		stock7 = new ModelRenderer(this);
		stock7.setRotationPoint(-3.1F, -26.6F, 11.5F);
		Stock.addChild(stock7);
		setRotationAngle(stock7, 1.2641F, 0.0F, 0.0F);
		stock7.cubeList.add(new ModelBox(stock7, 83, 86, 0.0F, 0.2F, 1.6F, 2, 2, 1, 0.0F, false));

		stock6 = new ModelRenderer(this);
		stock6.setRotationPoint(-0.9F, -26.6F, 11.5F);
		Stock.addChild(stock6);
		setRotationAngle(stock6, 1.2641F, 0.0F, 0.0F);
		stock6.cubeList.add(new ModelBox(stock6, 0, 87, 0.0F, 0.2F, 1.6F, 2, 2, 1, 0.0F, false));

		stock5 = new ModelRenderer(this);
		stock5.setRotationPoint(0.1F, -26.6F, 11.5F);
		Stock.addChild(stock5);
		setRotationAngle(stock5, 1.1897F, 0.0F, 0.0F);
		stock5.cubeList.add(new ModelBox(stock5, 53, 72, 0.011F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		stock4 = new ModelRenderer(this);
		stock4.setRotationPoint(0.1F, -26.6F, 11.5F);
		Stock.addChild(stock4);
		stock4.cubeList.add(new ModelBox(stock4, 20, 51, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		stock3 = new ModelRenderer(this);
		stock3.setRotationPoint(0.1F, -28.6F, 14.5F);
		Stock.addChild(stock3);
		setRotationAngle(stock3, -0.2231F, 0.0F, 0.0F);
		stock3.cubeList.add(new ModelBox(stock3, 71, 19, 0.01F, 0.2F, -1.05F, 1, 2, 10, 0.0F, false));

		stock2 = new ModelRenderer(this);
		stock2.setRotationPoint(-3.1F, -26.6F, 11.5F);
		Stock.addChild(stock2);
		stock2.cubeList.add(new ModelBox(stock2, 94, 128, 0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

		stock1 = new ModelRenderer(this);
		stock1.setRotationPoint(-3.1F, -28.6F, 14.5F);
		Stock.addChild(stock1);
		setRotationAngle(stock1, -0.2231F, 0.0F, 0.0F);
		stock1.cubeList.add(new ModelBox(stock1, 112, 47, 0.0F, 0.2F, -1.0F, 3, 2, 10, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		Maingun.render(f5);
		Pump.render(f5);
//		Stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
