package com.paneedah.weaponlib.ai;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.ai.EntityConfiguration.Equipment;
import com.paneedah.weaponlib.ai.EntityConfiguration.TexturedModel;
import com.paneedah.weaponlib.compatibility.CompatibleDataManager;
import com.paneedah.weaponlib.grenade.GrenadeAttackAspect;
import com.paneedah.weaponlib.grenade.ItemGrenade;
import com.paneedah.weaponlib.grenade.PlayerGrenadeInstance;
import com.paneedah.weaponlib.network.packets.HighIQPickupPacket;
import net.minecraft.block.Block;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.entity.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class EntityCustomMob extends EntityMob implements IRangedAttackMob, Contextual, Configurable<EntityConfiguration> {

    private static final float FLAT_WORLD_SPAWN_CHANCE = 0.01f;
    private static final CompatibleDataManager.Key VARIANT = CompatibleDataManager.createKey(EntityCustomMob.class, int.class);
    private static final CompatibleDataManager.Key SWINGING_ARMS = CompatibleDataManager.createKey(EntityCustomMob.class, boolean.class);
    private static final CompatibleDataManager.Key DELAYED_ATTACK_TIMER_INCREMENT = CompatibleDataManager.createKey(EntityCustomMob.class, int.class);
    private static final CompatibleDataManager.Key DELAYED_ATTACK_STARTED = CompatibleDataManager.createKey(EntityCustomMob.class, boolean.class);

    protected CompatibleDataManager compatibleDataManager;

    private ModContext modContext;

    private EntityConfiguration configuration;

    private ItemStack secondaryEquipment;

    private int delayedAttackTimer;

    private EntityPlayer customer;

    public EntityCustomMob(World worldIn) {
        super(worldIn);
        setSize(getConfiguration().getSizeWidth(), getConfiguration().getSizeHeight());
        
        //this.setSize(0.6F, 1.99F);
      
    }
    
    @Override
    public Vec3d getPositionEyes(float partialTicks) {
    	// TODO Auto-generated method stub
    	return super.getPositionEyes(partialTicks);
    }
    
    public String getMobName() {
    	return configuration.getMobName();
    }

    @Override
    public EntityConfiguration getConfiguration() {
        if (configuration == null) {
            configuration = EntityClassFactory.getInstance().getConfiguration(getClass());
        }
        return configuration;
    }
    
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox() {
    	// TODO Auto-generated method stub
    	return super.getCollisionBoundingBox();
    }
    
    @Override
    public AxisAlignedBB getEntityBoundingBox() {
    	// TODO Auto-generated method stub
    	return super.getEntityBoundingBox();
    }
    
    @Override
    public void setEntityBoundingBox(AxisAlignedBB bb) {
    	// TODO Auto-generated method stub
    	super.setEntityBoundingBox(bb);
    }
    

    @Override
    protected void initEntityAI() {
    //	System.out.println("A la verga: " + getConfiguration().getSizeWidth() + " | " + getConfiguration().getSizeHeight());
    	setSize(getConfiguration().getSizeWidth(), getConfiguration().getSizeHeight());
        getConfiguration().addAiTasks(this, this.tasks);
        getConfiguration().addAiTargetTasks(this, this.targetTasks);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(getConfiguration().getFollowRange());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(getConfiguration().getMaxSpeed());
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(getConfiguration().getMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(getConfiguration().getCollisionAttackDamage());
    }
    


    protected void entityInit() {
        super.entityInit();
        compatibleDataManager = new CompatibleDataManager(dataManager);
        compatibleDataManager.register(VARIANT, Integer.valueOf(0));
        compatibleDataManager.register(SWINGING_ARMS, Boolean.valueOf(false));
        compatibleDataManager.register(DELAYED_ATTACK_TIMER_INCREMENT, Integer.valueOf(0));
        compatibleDataManager.register(DELAYED_ATTACK_STARTED, Boolean.valueOf(false));
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return getConfiguration().getAmbientSound();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return getConfiguration().getHurtSound();
    }

    @Override
    protected SoundEvent getDeathSound() {
        return getConfiguration().getDeathSound();
    }

    @Override
    protected void playStepSound(BlockPos pos, Block blockIn) {
        this.playSound(getConfiguration().getStepSound(), 0.15F, 1);
    }

    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return getConfiguration().getCreatureAttribute();
    }

    /**
     * Called frequently so the entity can update its state every tick as
     * required. For example, zombies and skeletons use this to react to
     * sunlight and start to burn.
     */
    public void onLivingUpdate() {

    	
    	
        if (this.isEntityAlive() && getConfiguration().getDelayedAttack() != null) {

            if (isDelayedAttackStarted()) {
                setDelayedAttackTimerIncrement(1);
            }

            int delayedAttackTimerIncrement = getDelayedAttackTimerIncrement();

            delayedAttackTimer += delayedAttackTimerIncrement;

            if (delayedAttackTimer < 0) {
                delayedAttackTimer = 0;
            }

            if (delayedAttackTimer >= ((Timeable) getConfiguration().getDelayedAttack()).getDuration()) {
                // delayedAttacekTimer = delayedAttackDuration;
                completeDelayedAttack();
            }
        }

        super.onLivingUpdate();
    }

    private void completeDelayedAttack() {
        CustomMobAttack delayedAttack = configuration.getDelayedAttack();
        if (delayedAttack != null) {
            delayedAttack.attackEntity(this, getAttackTarget());
        }
    }

    @Override
    public void onDeath(DamageSource cause) {
        ItemStack itemStack = this.getHeldItemMainhand(); // getItemStackFromSlot(EntityEquipmentSlot.MAINHAND);

        if (!world.isRemote && itemStack != null) {
            initAmmo(itemStack);
        }

        super.onDeath(cause);

        Entity trueDamageSource = cause.getTrueSource();
        if (trueDamageSource instanceof EntityPlayer) {
            EntityPlayer entityplayer = (EntityPlayer) trueDamageSource;
            entityplayer.addStat(StatList.MOB_KILLS);
        }

        if (secondaryEquipment != null) {
            if (rand.nextFloat() < getConfiguration().getPrimaryEquipmentDropChance()) {
                entityDropItem(secondaryEquipment, 0);
            }
        }
    }

    private void initAmmo(ItemStack itemStack) {
        PlayerItemInstance<?> instance = Tags.getInstance(itemStack);
        if (instance instanceof PlayerWeaponInstance) {
            PlayerWeaponInstance weaponInstance = (PlayerWeaponInstance) instance;
            ItemMagazine existingMagazine = (ItemMagazine) WeaponAttachmentAspect
                    .getActiveAttachment(AttachmentCategory.MAGAZINE, weaponInstance);
            int maxAmmo = 0;
            if (existingMagazine != null) {
                maxAmmo = existingMagazine.getCapacity();
            } else if (weaponInstance.getWeapon().getAmmoCapacity() > 0) {
                maxAmmo = weaponInstance.getWeapon().getAmmoCapacity();
            }
            if (maxAmmo > 0) {
                weaponInstance.setAmmo(rand.nextInt(maxAmmo));
                Tags.setInstance(itemStack, weaponInstance);
            }
        }
    }

    @Nullable
    @Override
    protected ResourceLocation getLootTable() {
        return getConfiguration().getLootTable();
    }

    /**
     * Gives armor or weapon for entity based on given DifficultyInstance
     */
    @Override
    protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
        setArmorEquipment();
        setPrimaryEquipment();
        setSecondaryEquipment();
    }

    private void setArmorEquipment() {
        EntityConfiguration configuration = getConfiguration();
        Arrays.fill(this.inventoryArmorDropChances, configuration.getArmorDropChance());
        for (CustomArmor armor : configuration.getArmorSet()) {
            this.setItemStackToSlot(armor.getCompatibleEquipmentSlot(), new ItemStack(armor));
        }
    }

    private void setSecondaryEquipment() {
        EntityConfiguration configuration = getConfiguration();
        Equipment secondaryEquipment = configuration.getSecondaryEquipmentOptions().pick(world.getDifficulty());
        if (secondaryEquipment != null) {
            ItemStack equipmentItemStack = new ItemStack(secondaryEquipment.item);
            if (secondaryEquipment.item instanceof ItemGrenade) {
                initGrenade(secondaryEquipment, equipmentItemStack);
            }
            this.secondaryEquipment = equipmentItemStack;
        }
    }

    @Override
    public void setActiveHand(EnumHand hand)
    {
        ItemStack itemstack = this.getHeldItem(hand);

        if (itemstack != null && !this.isHandActive())
        {
            // int duration = net.minecraftforge.event.ForgeEventFactory.onItemUseStart(this, itemstack, itemstack.getMaxItemUseDuration());
            // if (duration <= 0) return;
            this.activeItemStack = itemstack;
            this.activeItemStackUseCount = 100;

            if (!this.world.isRemote)
            {
                int i = 1;

                if (hand == EnumHand.OFF_HAND)
                {
                    i |= 2;
                }

                this.dataManager.set(HAND_STATES, Byte.valueOf((byte) i));
            }
        }
    }

    private void setPrimaryEquipment() {
        EntityConfiguration configuration = getConfiguration();
        Equipment equipment = configuration.getEquipmentOptions().pick(world.getDifficulty());

        Arrays.fill(this.inventoryHandsDropChances, configuration.getPrimaryEquipmentDropChance());
        if (equipment != null) {
            ItemStack equipmentItemStack = new ItemStack(equipment.item);
            if (equipment.item instanceof Weapon) {
                initWeaponWithAttachments(equipment, equipmentItemStack);
            } else if (equipment.item instanceof ItemGrenade) {
                initGrenade(equipment, equipmentItemStack);
            }

            this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, equipmentItemStack);
        }
    }

    @SuppressWarnings("unchecked")
    private void initWeaponWithAttachments(Equipment equipment, ItemStack itemStack) {
        if (equipment.attachments != null && equipment.item instanceof Weapon
                && equipment.item instanceof PlayerItemInstanceFactory) {
            PlayerWeaponInstance weaponInstance = (PlayerWeaponInstance) ((PlayerItemInstanceFactory<?, ?>) equipment.item)
                    .createItemInstance(this, new ItemStack(equipment.item), 0);
            for (ItemAttachment<?> attachment : equipment.attachments) {
                Set<ItemAttachment<Weapon>> compatibleAttachments = weaponInstance.getWeapon()
                        .getCompatibleAttachments().keySet();
                compatibleAttachments.contains(attachment);
                WeaponAttachmentAspect.addAttachment((ItemAttachment<Weapon>) attachment, weaponInstance);
            }
            Tags.setInstance(itemStack, weaponInstance);
            Tags.setAmmo(itemStack, getConfiguration().getMaxAmmo());
        }
    }

    private void initGrenade(Equipment equipment, ItemStack itemStack) {
        if (equipment.item instanceof ItemGrenade) {
            PlayerGrenadeInstance grenadeInstance = (PlayerGrenadeInstance) ((PlayerItemInstanceFactory<?, ?>) equipment.item)
                    .createItemInstance(this, new ItemStack(equipment.item), 0);
            grenadeInstance.setThrowingFar(true);
            Tags.setInstance(itemStack, grenadeInstance);
        }
    }

    /**
     * Called only once on an entity when first time spawned, via egg, mob
     * spawner, natural spawning etc, but not called when entity is reloaded
     * from nbt. Mainly used for initializing attributes and inventory
     */
    @Nullable
    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);

        List<TexturedModel> variants = this.getConfiguration().getTexturedModelVariants();
        int variant = 0;
        if (!variants.isEmpty()) {
            variant = this.rand.nextInt(variants.size());
        }
        setVariant(variant);

        this.setEquipmentBasedOnDifficulty(difficulty);
        this.setEnchantmentBasedOnDifficulty(difficulty);

        this.setCanPickUpLoot(this.rand.nextFloat() < 0.55F * difficulty.getClampedAdditionalDifficulty());

        return livingdata;
    }

    @Override
    public boolean attackEntityAsMob(Entity target) {
        EntityConfiguration configuration = getConfiguration();

        CustomMobAttack collisionAttack = configuration.getCollisionAttack();
        if (collisionAttack != null) {
            return collisionAttack.attackEntity(this, target);
        }
        return super.attackEntityAsMob(target);
    }

    /**
     * Attack the specified entity using a ranged attack.
     * 
     * @param distanceFactor
     *            How far the target is, normalized and clamped between 0.1 and
     *            1.0
     */
    public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor) {
        if (modContext == null) {
            return;
        }

        ItemStack itemStack = this.getHeldItemMainhand();

        if (itemStack == null) {
            return;
        }

        if (itemStack.getItem() instanceof Weapon) {
            WeaponFireAspect fireAspect = modContext.getWeaponFireAspect();

            BiFunction<Weapon, EntityLivingBase, ? extends WeaponSpawnEntity> spawnEntityWith = (weapon, player) -> {
                int difficultyId = world.getDifficulty().getId();
                float inaccuracy = weapon.getInaccuracy() + (3f - difficultyId) * 0.5f; // *
                                                                                        // 2
                                                                                        // +
                                                                                        // distanceFactor
                                                                                        // *
                                                                                        // 3f;
                WeaponSpawnEntity bullet = new WeaponSpawnEntity(weapon, world, player,
                        weapon.getSpawnEntityVelocity(), weapon.getSpawnEntityGravityVelocity(), inaccuracy,
                        weapon.getSpawnEntityDamage() * 0.01f * 0.2f, weapon.getSpawnEntityExplosionRadius(), false, false, 1f, 1f, 1.5f, 1f,
                        -1, -1);
                bullet.setPositionAndDirection(true);
                return bullet;
            };

            fireAspect.serverFire(this, itemStack, spawnEntityWith, false, false, 0.2f);
        } else if (itemStack.getItem() instanceof ItemGrenade) {
            float rotationPitchAdjustment = 20f;
            this.rotationPitch -= rotationPitchAdjustment;
            PlayerGrenadeInstance grenadeInstance = (PlayerGrenadeInstance) Tags.getInstance(itemStack);
            GrenadeAttackAspect.serverThrowGrenade(modContext, this, grenadeInstance,
                    System.currentTimeMillis() + 2000L);
            this.rotationPitch += rotationPitchAdjustment;
        }
    }

    void attackWithSecondaryEquipment(EntityLivingBase target, float distanceFactor) {
        if (modContext == null) {
            return;
        }

        if (secondaryEquipment == null
        /*
         * || this.rand.nextFloat() >=
         * getConfiguration().getSecondaryEquipmentUseChance()
         */) {
            return;
        }

        if (secondaryEquipment.getItem() instanceof ItemGrenade) {
            float rotationPitchAdjustment = 20f;
            this.rotationPitch -= rotationPitchAdjustment;
            PlayerGrenadeInstance grenadeInstance = (PlayerGrenadeInstance) Tags.getInstance(secondaryEquipment);
            GrenadeAttackAspect.serverThrowGrenade(modContext, this, grenadeInstance,
                    System.currentTimeMillis() + 2000L);
            this.rotationPitch += rotationPitchAdjustment;
        }
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        int variant = compound.getInteger("Variant");
        setVariant(variant);
        int delayedAttackTimerIncrement = compound.getInteger("DATI");
        setDelayedAttackTimerIncrement(delayedAttackTimerIncrement);

        NBTTagCompound secondaryNbt = compound.getCompoundTag("Secondary");
        if (secondaryNbt != null) {
            this.secondaryEquipment = new ItemStack(secondaryNbt);;
        }
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setInteger("Variant", getVariant());
        compound.setInteger("DATI", getDelayedAttackTimerIncrement());

        if (secondaryEquipment != null) {
            compound.setTag("Secondary", secondaryEquipment.writeToNBT(new NBTTagCompound()));
        }
    }

    @Override
    public float getEyeHeight() {
    	return super.getEyeHeight();
       // return 1.74F;
    }

    /**
     * Returns the Y Offset of this entity.
     */
    @Override
    public double getYOffset() {
        return -0.35D;
    }

    public int getVariant() {
        return this.compatibleDataManager.get(VARIANT).intValue();
    }

    public void setVariant(int variant) {
        this.compatibleDataManager.set(VARIANT, Integer.valueOf(variant));
    }

    public boolean isSwingingArms() {
        return this.compatibleDataManager.get(SWINGING_ARMS).booleanValue();
    }

    public void setSwingingArms(boolean swingingArms) {
        this.compatibleDataManager.set(SWINGING_ARMS, Boolean.valueOf(swingingArms));
    }

    @Override
    protected boolean isValidLightLevel() {
        Predicate<Entity> predicate = getConfiguration().isValidLightLevel();
        return predicate != null ? predicate.test(this) : super.isValidLightLevel();
    }

    @Override
    public float getBlockPathWeight(BlockPos pos) {
        return getConfiguration().getMaxTolerableLightBrightness() - world.getLightBrightness(pos);
    }
    
    @Override
    protected boolean canDespawn() {
        return getConfiguration().isDespawnable();
    }
    
    @Override
    public void applyEntityCollision(Entity entityIn) {
    	if(canBePushed()) super.applyEntityCollision(entityIn);
    }
    
    @Override
    protected void collideWithEntity(Entity entityIn) {
    	// TODO Auto-generated method stub
    	if(canBePushed()) super.collideWithEntity(entityIn);
    	//System.out.println("fuck");
    }
    
    @Override
    public void onCollideWithPlayer(EntityPlayer entityIn) {
    	// TODO Auto-generated method stub
    	super.onCollideWithPlayer(entityIn);
    }
    
    
    
    
    @Override
    public EnumPushReaction getPushReaction() {
    	if(canBePushed()) {
    		return super.getPushReaction();
    	} else return EnumPushReaction.IGNORE;	
    }
    
    @Override
    public boolean canBePushed() {
        return getConfiguration().isPushable();
    }
    
    @Override
    public boolean isEntityInvulnerable(DamageSource source) {
        return getConfiguration().isInvulnerable() || super.isEntityInvulnerable(source);
    }
    
    @Override
    public boolean canBeCollidedWith() {
        return getConfiguration().isCollidable() || super.canBeCollidedWith();
    }

    @Override
    public boolean getCanSpawnHere() {
        boolean canSpawn = world.getWorldType() != WorldType.FLAT
                || rand.nextFloat() > (1f - FLAT_WORLD_SPAWN_CHANCE);
        Predicate<Entity> predicate = getConfiguration().getCanSpawnHere();
        return canSpawn && (predicate != null ? predicate.test(this) : super.getCanSpawnHere());
    }

    @Override
    public void setContext(ModContext modContext) {
        this.modContext = modContext;
    }

    public ItemStack getSecondaryEquipment() {
        return secondaryEquipment;
    }

    public void setDelayedAttackTimerIncrement(int increment) {
        this.compatibleDataManager.set(DELAYED_ATTACK_TIMER_INCREMENT, Integer.valueOf(increment));
    }

    public int getDelayedAttackTimerIncrement() {
        return this.compatibleDataManager.get(DELAYED_ATTACK_TIMER_INCREMENT).intValue();
    }

    public boolean isDelayedAttackStarted() {
        return this.compatibleDataManager.get(DELAYED_ATTACK_STARTED).booleanValue();
    }

    public void startDelayedAttack() {
        this.compatibleDataManager.set(DELAYED_ATTACK_STARTED, Boolean.valueOf(true));
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) {
        ItemStack itemstack = player.getHeldItem(hand);
        boolean flag = itemstack.getItem() == Items.NAME_TAG;

        
        if(configuration.getPickupItemID() != -1) {
        	
        
        	
    
        	modContext.getChannel().sendToServer(new HighIQPickupPacket(player.getEntityId(), getEntityId()));
        	
        	return true;
        }
        
        if (flag) {
            itemstack.interactWithEntity(player, this, hand);
            return true;
        } else if (this.isEntityAlive() && /*!this.isTrading() &&*/ !player.isSneaking()) {
        	/*
            // if (this.buyingList == null)
            // {
            // this.populateBuyingList();
            // }

            // if (hand == EnumHand.MAIN_HAND) {
            // player.addStat(StatList.TALKED_TO_VILLAGER);
            // }
            Map<UUID, MissionOffering> missionOfferings = getMissionOfferings();
            if (!missionOfferings.isEmpty() || !getConfiguration().getDialogContent().isEmpty()) {
                setCustomer(player);
                if(this.world.isRemote) {
                    displayTradeGui(player);
                }
            } else if (missionOfferings.isEmpty()) {
                return super.processInteract(player, hand);
            }

            return true;
            */
        	return false;
        } else {
            return super.processInteract(player, hand);
        }
    }
}
