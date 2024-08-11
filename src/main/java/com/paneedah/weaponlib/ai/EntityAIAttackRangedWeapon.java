package com.paneedah.weaponlib.ai;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.EnumHand;

import java.util.HashSet;
import java.util.Set;

public class EntityAIAttackRangedWeapon extends EntityAIBase {
    private static final float DEFAULT_SECONDARY_EQUIPMENT_USE_CHANCE = 0.25f;

    private final EntityCustomMob entity;
    private final double moveSpeedAmp;
    private int attackCooldown;
    private final float maxAttackDistanceSquared;
    private int attackTime = -1;
    private int seeTime;
    private boolean strafingClockwise;
    private boolean strafingBackwards;
    private int strafingTime = -1;
    private Set<Class<?>> attackWithItemType;
    private float secondaryEquipmentUseChance;

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
        for (Class<?> c : attackWithItemType) {
            this.attackWithItemType.add(c);
        }

        this.entity = customMob;
        this.moveSpeedAmp = speedAmplifier;
        this.attackCooldown = delay;
        this.maxAttackDistanceSquared = maxDistance * maxDistance;
        this.secondaryEquipmentUseChance = secondaryEquipmentUseChance;
        this.setMutexBits(3);
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
        return entity.getHeldItemMainhand() != null
                && (attackWithItemType.isEmpty()
                || attackWithItemType.stream().anyMatch(a -> a.isInstance(entity.getHeldItemMainhand().getItem())));
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    @Override
    public boolean shouldContinueExecuting() {
        return (shouldExecute() || !this.entity.getNavigator().noPath());
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
        EntityLivingBase attackTarget = this.entity.getAttackTarget();

        if (attackTarget != null) {

            this.entity.getLookHelper().setLookPosition(attackTarget.posX, attackTarget.posY + attackTarget.getEyeHeight() * this.entity.getConfiguration().getLookHeightMultiplier(), attackTarget.posZ, 30f, 30f);
            //this.entity.getLookHelper().setLookPositionWithEntity(attackTarget, 30.0F, 30.0F);

            double d0 = this.entity.getDistanceSq(attackTarget.posX, attackTarget.getEntityBoundingBox().minY, attackTarget.posZ);
            boolean canSeeTarget = this.entity.getEntitySenses().canSee(attackTarget);
            boolean flag1 = this.seeTime > 0;

            if (canSeeTarget != flag1) {
                this.seeTime = 0;
            }

            if (canSeeTarget) {
                ++this.seeTime;
            } else {
                --this.seeTime;
            }

            if (d0 <= (double) this.maxAttackDistanceSquared && this.seeTime >= 20) {
                this.entity.getNavigator().clearPath();
                ++this.strafingTime;
            } else {
                this.entity.getNavigator().tryMoveToEntityLiving(attackTarget, this.moveSpeedAmp);
                this.strafingTime = -1;
            }

            if (this.strafingTime >= 20) {
                if ((double) this.entity.getRNG().nextFloat() < 0.3D) {
                    this.strafingClockwise = !this.strafingClockwise;
                }

                if ((double) this.entity.getRNG().nextFloat() < 0.3D) {
                    this.strafingBackwards = !this.strafingBackwards;
                }

                this.strafingTime = 0;
            }

            if (this.strafingTime > -1) {
                if (d0 > (double) (this.maxAttackDistanceSquared * 0.75F)) {
                    this.strafingBackwards = false;
                } else if (d0 < (double) (this.maxAttackDistanceSquared * 0.25F)) {
                    this.strafingBackwards = true;
                }

                this.entity.getMoveHelper().strafe(this.strafingBackwards ? -0.5F : 0.5F, this.strafingClockwise ? 0.5F : -0.5F);
                this.entity.faceEntity(attackTarget, 30.0F, 30.0F);
            } else {
                this.entity.getLookHelper().setLookPositionWithEntity(attackTarget, 30.0F, 30.0F);
            }

            if (this.entity.isHandActive()) {
                if (!canSeeTarget && this.seeTime < -60) {
                    this.entity.resetActiveHand();
                } else if (canSeeTarget) {
                    if (Math.abs((-(this.entity.posX - attackTarget.posX) / (this.entity.posZ - attackTarget.posZ)) - Math.tan(this.entity.renderYawOffset / 180f * Math.PI)) < 5.0) {
                        this.entity.resetActiveHand();
                        if (entity.getSecondaryEquipment() != null && entity.getRNG().nextFloat() < secondaryEquipmentUseChance) {
                            this.entity.attackWithSecondaryEquipment(attackTarget, 0); // TODO: set some distance factor
                        } else {
                            this.entity.attackEntityWithRangedAttack(attackTarget, 0);
                            // TODO: set some distance factor
                        }
                        this.attackTime = (this.attackCooldown >> 1) + this.entity.getRNG().nextInt(this.attackCooldown << 1);
                    }
                }
            } else if (--this.attackTime <= 0 && this.seeTime >= -60) {
                this.entity.setActiveHand(EnumHand.MAIN_HAND);
            }
        }
    }
}
