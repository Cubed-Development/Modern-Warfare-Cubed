package com.paneedah.weaponlib;

public interface Part {

	Part MAIN_ITEM = new DefaultPart("MAIN_ITEM");
	Part MAIN = new DefaultPart("MAIN");
	Part HEAD = new DefaultPart("HEAD");
	Part BODY = new DefaultPart("BODY");
	Part RIGHT_HAND = new DefaultPart("RIGHT_HAND");
	Part LEFT_HAND = new DefaultPart("LEFT_HAND");
	Part RIGHT_LEG = new DefaultPart("RIGHT_LEG");
	Part LEFT_LEG = new DefaultPart("LEFT_LEG");

	Part INVENTORY = new DefaultPart("INVENTORY");
    Part NONE = new DefaultPart("NONE");
}
