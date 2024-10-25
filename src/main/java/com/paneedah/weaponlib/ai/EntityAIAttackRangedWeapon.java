package com.paneedah.weaponlib.ai;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.EnumHand;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EntityAIAttackRangedWeapon extends EntityAIBase {
    private static final float DEFAULT_SECONDARY_EQUIPMENT_USE_CHANCE = 0.25f;

    private final EntityCustomMob entity;
    private final double moveSpeedAmp;
    private final int attackCooldown;
    private final float maxAttackDistanceSquared;
    private int attackTime = -1;
    private int seeTime;
    private boolean strafingClockwise;
    private boolean strafingBackwards;
    private int strafingTime = -1;
    private final Set<Class<?>> attackWithItemType;
    private final float secondaryEquipmentUseChance;

    private float lookHeightMultiplier;

    public EntityAIAttackRangedWeapon(EntityCustomMob customMob,
                                      double speedAmplifier, int delay, float maxDistance,
                                      Class<?>... attackWithItemType) {
        this(customMob, speedAmplifier, delay, maxDistance, DEFAULT_SECONDARY_EQUIPMENT_USE_CHANCE, attackWithItemType);
    }


    public EntityAIAttackRangedWeapon(EntityCustomMob customMob,
                                      double speedAmplifier, int delay, float maxDistance, float secondaryEquipmentUseChance,
                                      Class<?>... attackWithItemType) {
        this.attackWithItemType = new HashSet<>();
        Collections.addAll(this.attackWithItemType, attackWithItemType);

        entity = customMob;
        moveSpeedAmp = speedAmplifier;
        attackCooldown = delay;
        maxAttackDistanceSquared = maxDistance * maxDistance;
        this.secondaryEquipmentUseChance = secondaryEquipmentUseChance;
        setMutexBits(3);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    @Override
    public boolean shouldExecute() {
        if (entity.getAttackTarget() == null) {
            return false;
        }

        return isItemTypeInMainHand(); // || entity.getSecondaryEquipment() != null;
    }

    protected boolean isItemTypeInMainHand() {
        entity.getHeldItemMainhand();
        return attackWithItemType.isEmpty() || attackWithItemType.stream().anyMatch(a -> a.isInstance(entity.getHeldItemMainhand().getItem()));
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    @Override
    public boolean shouldContinueExecuting() {
        return (shouldExecute() || !entity.getNavigator().noPath());
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    @Override
    public void startExecuting() {
        super.startExecuting();
        entity.setSwingingArms(true);
    }

    /**
     * Resets the task
     */
    public void resetTask() {
        super.resetTask();
        entity.setSwingingArms(false);
        seeTime = 0;
        attackTime = -1;
        entity.resetActiveHand();
    }

    /**
     * Updates the task
     */
    public void updateTask() {
        EntityLivingBase attackTarget = entity.getAttackTarget();

        if (attackTarget != null) {

            entity.getLookHelper().setLookPosition(attackTarget.posX, attackTarget.posY + attackTarget.getEyeHeight() * entity.getConfiguration().getLookHeightMultiplier(), attackTarget.posZ, 30f, 30f);
            //this.entity.getLookHelper().setLookPositionWithEntity(attackTarget, 30.0F, 30.0F);

            double d0 = entity.getDistanceSq(attackTarget.posX, attackTarget.getEntityBoundingBox().minY, attackTarget.posZ);
            boolean canSeeTarget = entity.getEntitySenses().canSee(attackTarget);
            boolean flag1 = seeTime > 0;

            if (canSeeTarget != flag1) {
                seeTime = 0;
            }

            if (canSeeTarget) {
                ++seeTime;
            } else {
                --seeTime;
            }

            if (d0 <= (double) maxAttackDistanceSquared && seeTime >= 20) {
                entity.getNavigator().clearPath();
                ++strafingTime;
            } else {
                entity.getNavigator().tryMoveToEntityLiving(attackTarget, moveSpeedAmp);
                strafingTime = -1;
            }

            if (strafingTime >= 20) {
                if ((double) entity.getRNG().nextFloat() < 0.3D) {
                    strafingClockwise = !strafingClockwise;
                }

                if ((double) entity.getRNG().nextFloat() < 0.3D) {
                    strafingBackwards = !strafingBackwards;
                }

                strafingTime = 0;
            }

            if (strafingTime > -1) {
                if (d0 > (double) (maxAttackDistanceSquared * 0.75F)) {
                    strafingBackwards = false;
                } else if (d0 < (double) (maxAttackDistanceSquared * 0.25F)) {
                    strafingBackwards = true;
                }

                entity.getMoveHelper().strafe(strafingBackwards ? -0.5F : 0.5F, strafingClockwise ? 0.5F : -0.5F);
                entity.faceEntity(attackTarget, 30.0F, 30.0F);
            } else {
                entity.getLookHelper().setLookPositionWithEntity(attackTarget, 30.0F, 30.0F);
            }

            if (entity.isHandActive()) {
                if (!canSeeTarget && seeTime < -60) {
                    entity.resetActiveHand();
                } else if (canSeeTarget) {
                    if (Math.abs((-(entity.posX - attackTarget.posX) / (entity.posZ - attackTarget.posZ)) - Math.tan(entity.renderYawOffset / 180f * Math.PI)) < 5.0) {
                        entity.resetActiveHand();
                        if (entity.getSecondaryEquipment() != null && entity.getRNG().nextFloat() < secondaryEquipmentUseChance) {
                            entity.attackWithSecondaryEquipment(attackTarget, 0); // TODO: set some distance factor
                        } else {
                            entity.attackEntityWithRangedAttack(attackTarget, 0);
                            // TODO: set some distance factor
                        }
                        attackTime = (attackCooldown >> 1) + entity.getRNG().nextInt(attackCooldown << 1);
                    }
                }
            } else if (--attackTime <= 0 && seeTime >= -60) {
                entity.setActiveHand(EnumHand.MAIN_HAND);
            }
        }
    }
}
