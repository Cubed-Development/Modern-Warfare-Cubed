package com.paneedah.weaponlib;

import net.minecraft.entity.EntityLivingBase;

public interface PlayerContext {

	EntityLivingBase getPlayer();
	
	void setPlayer(EntityLivingBase player);
}
