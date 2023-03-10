package com.paneedah.weaponlib.render;

import net.minecraft.util.ResourceLocation;

public class QRL {
	
	public static String modID = "mw";
	
	public static ResourceLocation quickLoc(String folder, String name) {
		//new ResourceLocation("mw" + ":" + "textures/entity/vehicleshadow.png");
		return new ResourceLocation(modID + ":textures/" + folder + "/" + name + ".png");
	}

}
