package com.paneedah.weaponlib.ai;

import com.paneedah.mwc.Grenades;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.item.Item;
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
        if (entity.getHeldItemMainhand().isEmpty()) {
            return false;
        }

        Item heldItem = entity.getHeldItemMainhand().getItem();

        // Check if the held item matches a allowed item
        boolean matchesAllowedType = attackWithItemType.isEmpty() || attackWithItemType.stream().anyMatch(a -> a.isInstance(heldItem));

        // Check for grenades
        boolean isSpecificItem = isHoldingSpecificItem(Grenades.FuseGrenade) || isHoldingSpecificItem(Grenades.ImpactGrenade) || isHoldingSpecificItem(Grenades.SmokeGrenade) || isHoldingSpecificItem(Grenades.GasGrenade) || isHoldingSpecificItem(Grenades.FlashGrenade);

        return matchesAllowedType || isSpecificItem;
    }

    /**
     * Checks if the entity is holding an item
     *
     * @param targetItem the Item to check for
     */
    protected boolean isHoldingSpecificItem(Item targetItem) {
        return !entity.getHeldItemMainhand().isEmpty() && entity.getHeldItemMainhand().getItem() == targetItem;
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

            double d0 = this.entity.getDistanceSq(attackTarget.posX, attackTarget.getEntityBoundingBox().minY, attackTarget.posZ);
            boolean canSeeTarget = this.entity.getEntitySenses().canSee(attackTarget);
            boolean flag1 = this.seeTime > 0;

            if (canSeeTarget != flag1) {
                this.seeTime = 0;
            }

            this.seeTime += canSeeTarget ? 1 : -1;

            if (d0 <= (double) this.maxAttackDistanceSquared && this.seeTime >= 20) {
                this.entity.getNavigator().clearPath();
                ++this.strafingTime;
            } else {
                this.entity.getNavigator().tryMoveToEntityLiving(attackTarget, this.moveSpeedAmp);
                this.strafingTime = -1;
            }

            updateStrafingDirection();
            executeStrafing(d0);
            handleAttack(attackTarget, canSeeTarget);
        }
    }

    private void updateStrafingDirection() {
        if (this.strafingTime >= 20) {
            if (this.entity.getRNG().nextFloat() < 0.3D) {
                this.strafingClockwise = !this.strafingClockwise;
            }
            if (this.entity.getRNG().nextFloat() < 0.3D) {
                this.strafingBackwards = !this.strafingBackwards;
            }
            this.strafingTime = 0;
        }
    }

    private void executeStrafing(double distanceSq) {
        if (this.strafingTime > -1) {
            if (distanceSq > (double) (this.maxAttackDistanceSquared * 0.75F)) {
                this.strafingBackwards = false;
            } else if (distanceSq < (double) (this.maxAttackDistanceSquared * 0.25F)) {
                this.strafingBackwards = true;
            }

            float forward = this.strafingBackwards ? -0.5F : 0.5F;
            float strafe = this.strafingClockwise ? 0.5F : -0.5F;
            this.entity.getMoveHelper().strafe(forward, strafe);
            this.entity.faceEntity(this.entity.getAttackTarget(), 30.0F, 30.0F);
        } else {
            this.entity.getLookHelper().setLookPositionWithEntity(this.entity.getAttackTarget(), 30.0F, 30.0F);
        }
    }

    private void handleAttack(EntityLivingBase attackTarget, boolean canSeeTarget) {
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
