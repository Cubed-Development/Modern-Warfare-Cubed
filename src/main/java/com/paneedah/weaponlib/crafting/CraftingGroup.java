package com.paneedah.weaponlib.crafting;

/**
 * CraftingGroup enum class used to differentiate between types of items for crafting purposes
 * (i.e. when filtering out non-guns from a CraftingRegistry query)
 *
 * GUN = 1
 * ATTACHMENT_NORMAL = 2
 * ATTACHMENT_MODIFICATION = 3
 * BULLET = 4
 * MAGAZINE = 5
 * GRENADE = 6
 * GEAR = 7
 * 
 * @author Homer Riva-Cambrin
 * @version September 23rd, 2022
 */
public enum CraftingGroup {
	GUN,
	ATTACHMENT_NORMAL,
	ATTACHMENT_MODIFICATION,
	BULLET,
	MAGAZINE,
	GRENADE,
	GEAR;
	
	
	public static CraftingGroup getValue(int id) {
		switch(id) {
			default:
				return GUN;
			case 1:
				return GUN;
			case 2:
				return ATTACHMENT_NORMAL;
			case 3:
				return ATTACHMENT_MODIFICATION;
			case 4:
				return BULLET;
			case 5:
				return MAGAZINE;
			case 6:
				return GRENADE;
			case 7:
				return GEAR;
		}
	}
	
	public int getID() {
		switch(this) {
			default:
				return 1;
			case GUN:
				return 1;
			case ATTACHMENT_NORMAL:
				return 2;
			case ATTACHMENT_MODIFICATION:
				return 3;
			case BULLET:
				return 4;
			case MAGAZINE:
				return 5;
			case GRENADE:
				return 6;
			case GEAR:
				return 7;
		}
	}

}
