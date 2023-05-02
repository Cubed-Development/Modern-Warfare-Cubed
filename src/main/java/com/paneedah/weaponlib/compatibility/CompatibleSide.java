package com.paneedah.weaponlib.compatibility;

import net.minecraftforge.fml.relauncher.Side;

public enum CompatibleSide {
	
	CLIENT(Side.CLIENT), SERVER(Side.SERVER);
	
	private Side side;
	
	private CompatibleSide(Side side) {
		this.side = side;
	}

	public static CompatibleSide fromSide(Side side) {
		if(side == Side.SERVER) return SERVER;
		else return CLIENT;
	}

	public Side getSide() {
		return side;
	}
}
