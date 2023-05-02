package com.paneedah.mwc.weaponlib.ai;

import com.paneedah.mwc.weaponlib.*;
import com.paneedah.mwc.weaponlib.ai.EntityConfiguration.Equipment;
import com.paneedah.mwc.weaponlib.ai.EntityConfiguration.TexturedModel;
import com.paneedah.mwc.weaponlib.compatibility.*;
import com.paneedah.mwc.weaponlib.grenade.GrenadeAttackAspect;
import com.paneedah.mwc.weaponlib.grenade.ItemGrenade;
import com.paneedah.mwc.weaponlib.grenade.PlayerGrenadeInstance;
import com.paneedah.mwc.weaponlib.network.packets.HighIQPickupPacket;
import net.minecraft.block.Block;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class EntityCustomMob extends CompatibleEntityMob
        implements IRangedAttackMob, Contextual, Configurable<EntityConfiguration> {

    private static final float FLAT_WORLD_SPAWN_CHANCE = 0.01f;
    private static final CompatibleDataManager.Key VARIANT = CompatibleDataManager.createKey(EntityCustomMob.class,
            int.class);
    private static final CompatibleDataManager.Key SWINGING_ARMS = CompatibleDataManager
            .createKey(EntityCustomMob.class, boolean.class);
    private static final CompatibleDataManager.Key DELAYED_ATTACK_TIMER_INCREMENT = CompatibleDataManager
            .createKey(EntityCustomMob.class, int.class);
    private static final CompatibleDataManager.Key DELAYED_ATTACK_STARTED = CompatibleDataManager
            .createKey(EntityCustomMob.class, boolean.class);

    private ModContext modContext;

    private EntityConfiguration configuration;

    private ItemStack secondaryEquipment;

    private int delayedAttackTimer;

    private EntityPlayer customer;
    
  
   

    public EntityCustomMob(World worldIn) {
        super(worldIn);
        //System.out.println(getConfiguration());
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
        compatibility.setEntityAttribute(this, CompatibleSharedMonsterAttributes.FOLLOW_RANGE,
                getConfiguration().getFollowRange());
        compatibility.setEntityAttribute(this, CompatibleSharedMonsterAttributes.MOVEMENT_SPEED,
                getConfiguration().getMaxSpeed());
        compatibility.setEntityAttribute(this, CompatibleSharedMonsterAttributes.MAX_HEALTH,
                getConfiguration().getMaxHealth());
        compatibility.setEntityAttribute(this, CompatibleSharedMonsterAttributes.ATTACK_DAMAGE,
                getConfiguration().getCollisionAttackDamage());
    }
    


    protected void entityInit() {
        super.entityInit();
        compatibleDataManager.register(VARIANT, Integer.valueOf(0));
        compatibleDataManager.register(SWINGING_ARMS, Boolean.valueOf(false));
        compatibleDataManager.register(DELAYED_ATTACK_TIMER_INCREMENT, Integer.valueOf(0));
        compatibleDataManager.register(DELAYED_ATTACK_STARTED, Boolean.valueOf(false));
    }

    @Override
    protected CompatibleSound getCompatibleAmbientSound() {
        return getConfiguration().getAmbientSound();
    }

    @Override
    protected CompatibleSound getCompatibleHurtSound() {
        return getConfiguration().getHurtSound();
    }

    @Override
    protected CompatibleSound getCompatibleDeathSound() {
        return getConfiguration().getDeathSound();
    }

    @Override
    protected void playStepSound(CompatibleBlockPos pos, Block blockIn) {
        compatibility.playSound(this, getConfiguration().getStepSound(), 0.15F, 1.0F);
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
        ItemStack itemStack = compatibility.getHeldItemMainHand(this); // getItemStackFromSlot(EntityEquipmentSlot.MAINHAND);

        if (!compatibility.world(this).isRemote && itemStack != null) {
            initAmmo(itemStack);
        }

        super.onDeath(cause);

        Entity trueDamageSource = compatibility.getTrueDamageSource(cause);
        if (trueDamageSource instanceof EntityPlayer) {
            EntityPlayer entityplayer = (EntityPlayer) trueDamageSource;
            compatibility.addStat(entityplayer, CompatibleAchievement.KILL_ENEMY);
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
                maxAmmo = existingMagazine.getAmmo();
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
    protected void setEquipmentBasedOnDifficulty(CompatibleDifficulty difficulty) {
        setArmorEquipment();
        setPrimaryEquipment();
        setSecondaryEquipment();
    }

    private void setArmorEquipment() {
        EntityConfiguration configuration = getConfiguration();
        setCompatibleInventoryArmorDropChances(configuration.getArmorDropChance());
        for (CustomArmor armor : configuration.getArmorSet()) {
            compatibility.setItemStackToSlot(this, armor.getCompatibleEquipmentSlot(), new ItemStack(armor));
        }
    }

    private void setSecondaryEquipment() {
        EntityConfiguration configuration = getConfiguration();
        Equipment secondaryEquipment = configuration.getSecondaryEquipmentOptions()
                .pick(compatibility.getDifficulty(compatibility.world(this)));
        if (secondaryEquipment != null) {
            ItemStack equipmentItemStack = new ItemStack(secondaryEquipment.item);
            if (secondaryEquipment.item instanceof ItemGrenade) {
                initGrenade(secondaryEquipment, equipmentItemStack);
            }
            this.secondaryEquipment = equipmentItemStack;
        }
    }

    private void setPrimaryEquipment() {
        EntityConfiguration configuration = getConfiguration();
        Equipment equipment = configuration.getEquipmentOptions().pick(compatibility.getDifficulty(compatibility.world(this)));

        setCompatibleInventoryHandsDropChances(configuration.getPrimaryEquipmentDropChance());
        if (equipment != null) {
            ItemStack equipmentItemStack = new ItemStack(equipment.item);
            if (equipment.item instanceof Weapon) {
                initWeaponWithAttachments(equipment, equipmentItemStack);
            } else if (equipment.item instanceof ItemGrenade) {
                initGrenade(equipment, equipmentItemStack);
            }

            compatibility.setItemStackToSlot(this, CompatibleEntityEquipmentSlot.MAIN_HAND, equipmentItemStack);
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
    public IEntityLivingData onCompatibleSpawn(CompatibleDifficulty difficulty,
            @Nullable IEntityLivingData livingdata) {
        livingdata = super.onCompatibleSpawn(difficulty, livingdata);

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

        ItemStack itemStack = compatibility.getHeldItemMainHand(this);

        if (itemStack == null) {
            return;
        }

        if (itemStack.getItem() instanceof Weapon) {
            WeaponFireAspect fireAspect = modContext.getWeaponFireAspect();

            BiFunction<Weapon, EntityLivingBase, ? extends WeaponSpawnEntity> spawnEntityWith = (weapon, player) -> {
                int difficultyId = compatibility.getDifficulty(compatibility.world(this)).getId();
                float inaccuracy = weapon.getInaccuracy() + (3f - difficultyId) * 0.5f; // *
                                                                                        // 2
                                                                                        // +
                                                                                        // distanceFactor
                                                                                        // *
                                                                                        // 3f;
                WeaponSpawnEntity bullet = new WeaponSpawnEntity(weapon, compatibility.world(player), player,
                        weapon.getSpawnEntityVelocity(), weapon.getSpawnEntityGravityVelocity(), inaccuracy,
                        weapon.getSpawnEntityDamage() * 0.01f * 0.2f, weapon.getSpawnEntityExplosionRadius(), false, false, 1f, 1f, 1.5f, 1f,
                        -1, -1);
                bullet.setPositionAndDirection();
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
            this.secondaryEquipment = compatibility.createItemStack(secondaryNbt);
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
    public float getCompatibleBlockPathWeight(CompatibleBlockPos pos) {
        return getConfiguration().getMaxTolerableLightBrightness()
                - compatibility.getLightBrightness(compatibility.world(this), pos);
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
        boolean canSpawn = compatibility.getWorldType(compatibility.world(this)) != WorldType.FLAT
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
        	
        
        	
    
        	modContext.getChannel().getChannel().sendToServer(new HighIQPickupPacket(player.getEntityId(), getEntityId()));
        	
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

    /*
    @SideOnly(Side.CLIENT)
    protected void displayTradeGui(EntityPlayer player) {
        Collection<MissionOffering> redeemableMissionOfferings = Missions.getRedeemableMissionOfferings(this, player);
        if(!redeemableMissionOfferings.isEmpty()) {
            mc.displayGuiScreen(
                    new MissionAcceptGui(
                            true, 
                            redeemableMissionOfferings.iterator().next(), 
                            this, player, modContext, 
                            getConfiguration().getDialogBackground(), 
                            getConfiguration().getRewardsBackground(),
                            null));
        } else {
            mc.displayGuiScreen(
                    new MissionIntroGui(this, player, modContext, 
                            getConfiguration().getDialogContent(), 
                            getConfiguration().getDialogBackground(),
                            getConfiguration().getIntroImage(),
                            getConfiguration().getRewardsBackground(),
                            getConfiguration().getMissionSelectionBackground()
                            ));
        }
        
    }

    public void setCustomer(EntityPlayer customer) {
        this.customer = customer;
    }

    public EntityPlayer getCustomer() {
        return customer;
    }

    protected boolean isTrading() {
        return customer != null;
    }

    @Override
    public void redeem(Mission mission, EntityPlayer player) {
        
        MissionOffering missionOffering = getMissionOfferings().get(mission.getMissionOfferingId());
        
        if(missionOffering != null && !mission.isRedeemed() && mission.isCompleted(player)
                && !mission.isExpired(compatibility.world(player).getTotalWorldTime())
                && mission.getAssignerId().equals(getUniqueID())) {
            boolean goalsMet = true;
            for(Goal goal: mission.getGoals()) {
                if(goal.getRequiredAction() instanceof ObtainItemAction) {
                    if(compatibility.removeMatchingInventoryItemStacks(player, 
                            ((ObtainItemAction)goal.getRequiredAction()).getItem(), goal.getQuantity())
                            < goal.getQuantity()) {
                        goalsMet = false;
                        break;
                    }
                }
            }
            if(goalsMet) {
                mission.setRedeemed(compatibility.world(player).getTotalWorldTime());
                missionOffering.getRewards().forEach(reward -> reward.redeem(player));
                CompatibleMissionCapability.updateMission(player, mission);
                modContext.getChannel().getChannel().sendTo(
                        new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions(player)),
                        (EntityPlayerMP)player);
            }
        } 
    }

    @Override
    public void assign(MissionOffering offering, EntityPlayer player) {
        if(offering.isAvailableFor(player)) {
            CompatibleMissionCapability.updateMission(player, 
                    new Mission(offering.getId(), this, compatibility.world(player).getTotalWorldTime(),
                            offering.getMaxDuration(),
                            offering.createGoals()));
            modContext.getChannel().getChannel().sendTo(
                    new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions(player)),
                    (EntityPlayerMP)player);
            customer = null;
        }
    }
	*/

}
