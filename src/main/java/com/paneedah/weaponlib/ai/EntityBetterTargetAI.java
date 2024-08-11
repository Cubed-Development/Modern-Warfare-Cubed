package com.paneedah.weaponlib.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.math.Vec3d;

public class EntityBetterTargetAI extends EntityAINearestAttackableTarget {

    public Vec3d lastSeen;
    public long lastSeenTimestamp;
    public long targetUnseenTicks;

    public EntityBetterTargetAI(EntityCreature creature, Class classTarget, boolean checkSight, boolean onlyNearby) {
        super(creature, classTarget, checkSight, onlyNearby);
    }

    @Override
    public boolean shouldExecute() {
        // TODO Auto-generated method stub
        return super.shouldExecute();
    }

    @Override
    public boolean shouldContinueExecuting() {
        EntityLivingBase entitylivingbase = this.taskOwner.getAttackTarget();

        if (entitylivingbase == null) {
            entitylivingbase = this.target;
        }

        if (entitylivingbase == null) {
            return false;
        } else if (!entitylivingbase.isEntityAlive()) {
            return false;
        } else {
            Team team = this.taskOwner.getTeam();
            Team team1 = entitylivingbase.getTeam();

            if (team != null && team1 == team) {
                return false;
            } else {
                double d0 = this.getTargetDistance();

                if (this.taskOwner.getDistanceSq(entitylivingbase) > d0 * d0) {
                    return false;
                } else {
                    if (this.shouldCheckSight) {
                        if (this.taskOwner.getEntitySenses().canSee(entitylivingbase)) {
                            this.targetUnseenTicks = 0;
                        } else if (++this.targetUnseenTicks > this.unseenMemoryTicks) {
                            return false;
                        }
                    }

                    if (entitylivingbase instanceof EntityPlayer && ((EntityPlayer) entitylivingbase).capabilities.disableDamage) {
                        return false;
                    } else {
                        this.taskOwner.setAttackTarget(entitylivingbase);
                        return true;
                    }
                }
            }
        }
    }

    @Override
    public void updateTask() {
        // TODO Auto-generated method stub
        super.updateTask();
    }

}
