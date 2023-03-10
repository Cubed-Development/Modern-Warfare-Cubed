package com.paneedah.weaponlib.render.modelrepo;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashMap;

@SideOnly(Side.CLIENT)
public class GearModelRepository {
	
	public static final HashMap<String, ModelBiped> registry = new HashMap<>();
	
	
	public static ModelBiped pull(String name) {
		
		if(!registry.containsKey(name)) {
			
			// Does not exist
			if(!ServerGearModelHookRegistry.modelArray.contains(name)) return null;
			
			try {
				registry.put(name, (ModelBiped) Class.forName(name).newInstance());
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return registry.get(name);
		
	}

}
