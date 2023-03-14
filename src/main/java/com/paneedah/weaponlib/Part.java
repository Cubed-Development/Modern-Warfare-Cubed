package com.paneedah.weaponlib;

public interface Part {

	public static final Part MAIN_ITEM = new DefaultPart("MAIN_ITEM");
	public static final Part MAIN = new DefaultPart("MAIN");
	public static final Part HEAD = new DefaultPart("HEAD");
	public static final Part BODY = new DefaultPart("BODY");
	public static final Part RIGHT_HAND = new DefaultPart("RIGHT_HAND");
	public static final Part LEFT_HAND = new DefaultPart("LEFT_HAND");
	public static final Part RIGHT_LEG = new DefaultPart("RIGHT_LEG");
	public static final Part LEFT_LEG = new DefaultPart("LEFT_LEG");

	public static final Part INVENTORY = new DefaultPart("INVENTORY");
    public static final Part NONE = new DefaultPart("NONE");
}