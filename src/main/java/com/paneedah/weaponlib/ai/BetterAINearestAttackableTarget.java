package com.paneedah.weaponlib.ai;


import com.google.common.base.Function;
import com.google.common.base.Predicate;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;
import java.util.List;

public class BetterAINearestAttackableTarget<T extends EntityLivingBase> extends EntityAINearestAttackableTarget<T> {

    private static final int targetChance = 10;
    private final String enemyName;

    public BetterAINearestAttackableTarget(EntityCreature creature, Class<T> classTarget, String name, boolean checkSight) {
        super(creature, classTarget, checkSight);
        // TODO Auto-generated constructor stub
        enemyName = name;
    }


    @Override
    public boolean shouldExecute() {
        if (targetChance > 0 && taskOwner.getRNG().nextInt(targetChance) != 0) {
            return false;
        } else if (targetClass != EntityPlayer.class && targetClass != EntityPlayerMP.class) {
            List<T> list = taskOwner.world.getEntitiesWithinAABB(targetClass, getTargetableArea(getTargetDistance()), targetEntitySelector);
            list.removeIf(s -> {
                if (s instanceof EntityCustomMob) {
                    return !((EntityCustomMob) s).getMobName().equals(enemyName);
                } else {
                    return false;
                }

            });

            if (list.isEmpty()) {
                return false;
            } else {
                list.sort(sorter);
                targetEntity = list.get(0);
                return true;
            }
        } else {
            targetEntity = (T) taskOwner.world.getNearestAttackablePlayer(taskOwner.posX, taskOwner.posY + (double) taskOwner.getEyeHeight(), taskOwner.posZ, getTargetDistance(), getTargetDistance(), new Function<EntityPlayer, Double>() {
                public Double apply(@Nullable EntityPlayer p_apply_1_) {
                    assert p_apply_1_ != null;
                    ItemStack itemstack = p_apply_1_.getItemStackFromSlot(EntityEquipmentSlot.HEAD);

                    if (itemstack.getItem() == Items.SKULL) {
                        int i = itemstack.getItemDamage();
                        boolean flag = taskOwner instanceof EntitySkeleton && i == 0;
                        boolean flag1 = taskOwner instanceof EntityZombie && i == 2;
                        boolean flag2 = taskOwner instanceof EntityCreeper && i == 4;

                        if (flag || flag1 || flag2) {
                            return Double.valueOf(0.5D);
                        }
                    }

                    return Double.valueOf(1.0D);
                }
            }, (Predicate<EntityPlayer>) targetEntitySelector);
            return targetEntity != null;
        }
    }

}
