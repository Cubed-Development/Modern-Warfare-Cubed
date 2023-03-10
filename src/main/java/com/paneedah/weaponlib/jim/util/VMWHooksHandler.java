package com.paneedah.weaponlib.jim.util;

import com.paneedah.weaponlib.ItemAttachment;
import com.paneedah.weaponlib.Weapon;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import java.lang.reflect.Field;

public class VMWHooksHandler {

	private static ItemAttachment<Weapon> magicMagazine;
	
	private static boolean checkedServer;
	private static boolean minecraftClassExists;
	
	public static boolean isOnServer() {
		if(checkedServer) return minecraftClassExists;
		checkedServer = true;
		try {
			Class clazz = Class.forName("net.minecraft.client.Minecraft");
		} catch (ClassNotFoundException e) {
			minecraftClassExists = true;
			return true;
		}
		minecraftClassExists = false;
		return false;
	}
	
	
	private static Field getFastField(Class<?> clazz, String name) {
		Field f = ReflectionHelper.findField(clazz, name);
		return f;
	}
	 
	

}
