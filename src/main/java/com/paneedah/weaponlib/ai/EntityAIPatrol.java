package com.paneedah.weaponlib.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIWander;

public class EntityAIPatrol extends EntityAIWander {

    public EntityAIPatrol(EntityCreature creatureIn, double speedIn, int chance) {
        super(creatureIn, speedIn, chance);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean shouldExecute() {
        // TODO Auto-generated method stub
        return super.shouldExecute();
    }

    @Override
    public boolean shouldContinueExecuting() {
        // TODO Auto-generated method stub
        return super.shouldContinueExecuting();
    }

    @Override
    public void updateTask() {
        // TODO Auto-generated method stub


        super.updateTask();

    }

}
