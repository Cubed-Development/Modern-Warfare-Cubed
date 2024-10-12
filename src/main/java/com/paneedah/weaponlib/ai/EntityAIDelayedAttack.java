package com.paneedah.weaponlib.ai;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIDelayedAttack extends EntityAIBase {

    private final EntityCustomMob entityCustomMob;
    private EntityLivingBase targetEntity;

    public EntityAIDelayedAttack(EntityCustomMob entityCustomMob) {
        this.entityCustomMob = entityCustomMob;
        setMutexBits(1);
    }

    public boolean shouldExecute() {
        EntityLivingBase entitylivingbase = entityCustomMob.getAttackTarget();
        return entityCustomMob.getDelayedAttackTimerIncrement() > 0 || entitylivingbase != null
                && entityCustomMob.getDistanceSq(entitylivingbase) < 9.0D;
    }

    public void startExecuting() {
        entityCustomMob.getNavigator().clearPath();
        targetEntity = entityCustomMob.getAttackTarget();
    }

    public void resetTask() {
        targetEntity = null;
    }

    public void updateTask() {
        if (targetEntity == null) {
            entityCustomMob.setDelayedAttackTimerIncrement(-1);
        } else if (entityCustomMob.getDistanceSq(targetEntity) > 49.0D) {
            entityCustomMob.setDelayedAttackTimerIncrement(-1);
        } else if (!entityCustomMob.getEntitySenses().canSee(targetEntity)) {
            entityCustomMob.setDelayedAttackTimerIncrement(-1);
        } else {
            entityCustomMob.setDelayedAttackTimerIncrement(1);
        }
    }

    @Override
    public boolean shouldContinueExecuting() {
        return (shouldExecute() || !entityCustomMob.getNavigator().noPath());
    }


}
