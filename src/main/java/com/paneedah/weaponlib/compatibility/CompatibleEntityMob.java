package com.paneedah.weaponlib.compatibility;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

import java.util.Arrays;

public abstract class CompatibleEntityMob extends EntityMob {
    
    protected CompatibleDataManager compatibleDataManager;

    public CompatibleEntityMob(World worldIn) {
        super(worldIn);
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        compatibleDataManager = new CompatibleDataManager(dataManager);
    }

    @Override
    protected final SoundEvent getAmbientSound() {
        CompatibleSound sound = getCompatibleAmbientSound();
        return sound != null ? sound.getSound() : null;
    }

    protected CompatibleSound getCompatibleAmbientSound() {
        return null;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
        return getHurtSound();
    }
    
    protected final SoundEvent getHurtSound() {
        CompatibleSound sound = getCompatibleHurtSound();
        return sound != null ? sound.getSound() : null;
    }

    protected  CompatibleSound getCompatibleHurtSound() {
        return null;
    }

    @Override
    protected final SoundEvent getDeathSound() {
        CompatibleSound sound = getCompatibleDeathSound();
        return sound != null ? sound.getSound() : null;
    }
    
    protected CompatibleSound getCompatibleDeathSound() {
        return null;
    }

    protected void playStepSound(BlockPos pos, Block block) {
        playStepSound(new CompatibleBlockPos(pos), block);
    }
    
    protected void playStepSound(CompatibleBlockPos pos, Block blockIn) {}
    
    @Override
    public void setActiveHand(EnumHand hand) {
        ItemStack itemstack = this.getHeldItem(hand);

        if (itemstack != null && !this.isHandActive()) {
            // int duration = net.minecraftforge.event.ForgeEventFactory.onItemUseStart(this, itemstack, itemstack.getMaxItemUseDuration());
            // if (duration <= 0) return;
            this.activeItemStack = itemstack;
            this.activeItemStackUseCount = 100;

            if (!this.world.isRemote) {
                int i = 1;

                if (hand == EnumHand.OFF_HAND) {
                    i |= 2;
                }

                this.dataManager.set(HAND_STATES, Byte.valueOf((byte) i));
            }
        }
    }

    public float getBlockPathWeight(BlockPos pos) {
        return getCompatibleBlockPathWeight(new CompatibleBlockPos(pos));
    }
    
    public float getCompatibleBlockPathWeight(CompatibleBlockPos pos) {
        return super.getBlockPathWeight(pos.getBlockPos());
    }
    
    protected void setCompatibleInventoryHandsDropChances(float chance) {
        Arrays.fill(this.inventoryHandsDropChances, chance);
    }
    
    protected void setCompatibleInventoryArmorDropChances(float chance) {
        Arrays.fill(this.inventoryArmorDropChances, chance);
    }
    
    @Override
    protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
        super.setEquipmentBasedOnDifficulty(difficulty);
    }
    
    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);

        return livingdata;
    }

    protected void setEnchantmentBasedOnDifficulty(DifficultyInstance difficulty) {
        setEnchantmentBasedOnDifficulty(difficulty);
    }
    
    public void setActiveMainHand() {
        setActiveHand(EnumHand.MAIN_HAND);
    }
    
    public boolean isFacingEntity(EntityLivingBase otherEntity) {
//        double dx = this.posX - otherEntity.posX;
//        double dz = this.posZ - otherEntity.posZ;
//        double tan1 = -dx/dz;
//        double tan2 = Math.tan(this.renderYawOffset / 180f * Math.PI);
//        return Math.abs(tan1 - tan2) < 5.0;
        return true;
    }
}
