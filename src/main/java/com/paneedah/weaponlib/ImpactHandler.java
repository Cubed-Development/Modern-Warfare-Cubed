package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleRayTraceResult;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

@FunctionalInterface
public interface ImpactHandler {

	void onImpact(World world, EntityPlayer player, WeaponSpawnEntity entity, CompatibleRayTraceResult position);
}
