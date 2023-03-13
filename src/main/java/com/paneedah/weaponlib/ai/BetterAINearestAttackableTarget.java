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
		this.enemyName = name;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean shouldExecute() {
		if (this.targetChance > 0 && this.taskOwner.getRNG().nextInt(this.targetChance) != 0)
            return false;

        else if (this.targetClass != EntityPlayer.class && this.targetClass != EntityPlayerMP.class) {
            List<T> list = this.taskOwner.world.<T>getEntitiesWithinAABB(this.targetClass, this.getTargetableArea(this.getTargetDistance()), this.targetEntitySelector);
            list.removeIf(s -> {
            	if(s instanceof EntityCustomMob) {
            		return ((EntityCustomMob) s).getMobName() != this.enemyName;
            	} else return false;
            	
            });
            
            if (list.isEmpty())
                return false;

            else {
                list.sort(this.sorter);
                this.targetEntity = list.get(0);
                return true;
            }
        }

        else {
            this.targetEntity = (T)this.taskOwner.world.getNearestAttackablePlayer(this.taskOwner.posX, this.taskOwner.posY + (double)this.taskOwner.getEyeHeight(), this.taskOwner.posZ, this.getTargetDistance(), this.getTargetDistance(), new Function<EntityPlayer, Double>() {
                public Double apply(@Nullable EntityPlayer p_apply_1_) {
                    ItemStack itemstack = p_apply_1_.getItemStackFromSlot(EntityEquipmentSlot.HEAD);

                    if (itemstack.getItem() == Items.SKULL) {
                        int i = itemstack.getItemDamage();
                        boolean flag = BetterAINearestAttackableTarget.this.taskOwner instanceof EntitySkeleton && i == 0;
                        boolean flag1 = BetterAINearestAttackableTarget.this.taskOwner instanceof EntityZombie && i == 2;
                        boolean flag2 = BetterAINearestAttackableTarget.this.taskOwner instanceof EntityCreeper && i == 4;

                        if (flag || flag1 || flag2) {
                            return 0.5D;
                        }
                    }

                    return 1.0D;
                }
            }, (Predicate<EntityPlayer>)this.targetEntitySelector);
            return this.targetEntity != null;
        }
	}

}
