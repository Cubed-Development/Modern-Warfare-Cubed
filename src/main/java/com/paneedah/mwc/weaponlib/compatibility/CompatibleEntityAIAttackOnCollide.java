package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.player.EntityPlayer;

//
//import net.minecraft.entity.EntityCreature;
//import net.minecraft.entity.EntityLivingBase;
//import net.minecraft.entity.ai.EntityAIBase;
//import net.minecraft.pathfinding.PathEntity;
//import net.minecraft.pathfinding.PathPoint;
//import net.minecraft.util.math.MathHelper;
//import net.minecraft.world.World;

public class CompatibleEntityAIAttackOnCollide extends EntityAIAttackMelee {


    public CompatibleEntityAIAttackOnCollide(EntityCreature creature, Class<EntityPlayer> class1, double speedIn, boolean useLongMemory) {
        super(creature, speedIn, useLongMemory);
    }

}
