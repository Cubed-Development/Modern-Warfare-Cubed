package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.Minecraft;
import net.minecraft.launchwrapper.Launch;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.reflect.Field;

/**
 * Better reflection class that enables the lookup of
 * fields.
 * 
 * 
 * @author Jim Holden, 2022
 */
public class CompatibleReflection extends ReflectionHelper {
	
	private static boolean hasCheckedServer = false;
	private static boolean isOnServer = false;
	
	/**
	 * Checks if this has access to the Minecraft class, which indicates
	 * if it can access client-sided classes.
	 * 
	 * @return Are we on server side?
	 */
	public static boolean isOnServer() {
		if(hasCheckedServer) {
			return isOnServer;
		} else {
			try {
				Class clazz = Minecraft.class.getClass();
			} catch(Throwable e) {
				isOnServer = true;
			}
			hasCheckedServer = true;
		}
		return isOnServer;
		
	}


    @Nonnull
    public static Field findField(Class<?> clazz, @Nonnull String fieldName, @Nullable String fieldSRGName)
    {
    	
    	
        String nameToFind;
        if (fieldSRGName == null || (Boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment"))
        {
            nameToFind = fieldName;
        }
        else
        {
            nameToFind = fieldSRGName;
        }
        
        
        return ReflectionHelper.findField(clazz, nameToFind);

    }
	
	
	
	

}
