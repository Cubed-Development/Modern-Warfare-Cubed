package com.paneedah.weaponlib;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.compatibility.CompatibleCustomArmor;
import com.paneedah.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import com.paneedah.weaponlib.compatibility.CompatibleSound;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCrafting;
import com.paneedah.weaponlib.model.ModelBaseRendererWrapper;
import com.paneedah.weaponlib.model.WrappableModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class CustomArmor extends CompatibleCustomArmor implements ExposureProtection , ISpecialArmor, IModernCrafting {

    private static final String ACTIVE_ATTACHMENT_TAG = "ActiveAttachments";

    private static final String SHIELD_CAPACITY_TAG = "ShieldCapacity";
    
    private static final String SHIELD_HIT_TIMESTAMP_TAG = "ShieldHitTimestamp";

    public static class Builder {
        
        private static class ChestModelFactory {
            
            private static ModelBiped createModel(String modelClassName) {
                try {
                    return (ModelBiped) Class.forName(modelClassName).newInstance();
                } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                    throw new IllegalStateException("Missing chest model", e);
                }
            }
        }
        

        private static class HelmetModelFactory {
            private static ModelBiped create(String modelClassName) {
                ModelBiped helmetModel = null;
                try {
                    Class<?> modelClass = Class.forName(modelClassName);
                    
                    
                    if(ModelBiped.class.isAssignableFrom(modelClass)) {
                        helmetModel = (ModelBiped) modelClass.newInstance();
                    } else if(ModelBase.class.isAssignableFrom(modelClass)) {
                        helmetModel = new ModelBiped() {
                            {
                                this.bipedHead = new ModelBaseRendererWrapper((WrappableModel) modelClass.newInstance());
                                this.bipedHeadwear.isHidden = true;
                            }
                        };
                    }
                } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                    throw new IllegalStateException("Missing helmet model", e);
                }
                return helmetModel;
            }
        }
        
        private static final class BootsModelFactory {
            
            private static ModelBiped createModel(String modelClassName) {
                ModelBiped bootsModel = null;
                try {
                    Class<?> modelClass = Class.forName(modelClassName);
                    
                    if(ModelBiped.class.isAssignableFrom(modelClass)) {
                        bootsModel = (ModelBiped) modelClass.newInstance();
                    } //else if(ModelBase.class.isAssignableFrom(modelClass)) {
//                            bootsModel = new ModelBiped() {
//                                {
//                                    this.bipedHead = new ModelBaseRendererWrapper((WrappableModel) modelClass.newInstance());
//                                    this.bipedHeadwear.isHidden = true;
//                                }
//                            };
                    //}
                } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                    throw new IllegalStateException("Missing boots model", e);
                }
                return bootsModel;
            }
        }
        
        private String textureName;
        @SuppressWarnings("unused")
        private String iconName;
        private ArmorMaterial material;
        private String unlocalizedName;
        private ModelBiped bootsModel;
        private ModelBiped chestModel;
        private ModelBiped helmetModel;
        private String modelClassName;
        private String hudTextureName;
        //private Function<Integer, ModelBiped> modelFactory;
        private Map<ItemAttachment<CustomArmor>, CompatibleAttachment<CustomArmor>> compatibleAttachments = new HashMap<>();
        private CreativeTabs creativeTab;
        private boolean nightVision;
        private boolean vignetteEnabled;
        private float exposureReductionFactor;
        private String breathingSound;
        private double maxShieldCapacity = 0.0;
        private long shieldRegenerationTimeout = 2000;
        private double shieldRegenerationRate = 1.0;
        private double shieldIndicatorPositionX = 15;
        private double shieldIndicatorPositionY = 20;
        private double shieldIndicatorWidth = 100;
        private double shieldIndicatorHeight = 15;
        private String shieldIndicatorMaskTextureName;
        private String shieldIndicatorProgressBarTextureName;

        public Builder withCreativeTab(CreativeTabs creativeTab) {
            this.creativeTab = creativeTab;
            return this;
        }

        public Builder withTextureName(String textureName) {
            this.textureName = textureName.toLowerCase();
            return this;
        }

        public Builder withMaterial(ArmorMaterial material) {
            this.material = material;
            return this;
        }

        public Builder withUnlocalizedName(String unlocalizedName) {
            this.unlocalizedName = unlocalizedName;
            return this;
        }

        public Builder withModelClass(String modelClass) {
            this.modelClassName = modelClass;
            return this;
        }

        public Builder withHudTextureName(String hudTextureName) {
            this.hudTextureName = hudTextureName.toLowerCase();
            return this;
        }

        public Builder withNightVision(boolean nightVision) {
            this.nightVision = nightVision;
            this.vignetteEnabled = nightVision;
            return this;
        }
        
        public Builder withNightVision(boolean nightVision, boolean vignetteEnabled) {
            this.nightVision = nightVision;
            this.vignetteEnabled = vignetteEnabled;
            return this;
        }
        
        public Builder withExposureReductionFactor(float exposureReductionFactor) {
            this.exposureReductionFactor = exposureReductionFactor;
            return this;
        }

        public Builder withBreathingSound(String sound) {
            this.breathingSound = sound.toLowerCase();
            return this;
        }
        /*
        public Builder withModelSupplier(Function<Integer, ModelBiped> modelFactory) {
            this.modelFactory = modelFactory;
            return this;
        }*/

        public Builder withCompatibleAttachment(AttachmentCategory category, ModelBase attachmentModel, String textureName,
                Consumer<ModelBase> positioner) {
            ItemAttachment<CustomArmor> item = new ItemAttachment<CustomArmor>(category, attachmentModel, textureName, null);
            compatibleAttachments.put(item, new CompatibleAttachment<CustomArmor>(item, positioner));
            return this;
        }
        
        public Builder withShieldCapacity(double capacity) {
            this.maxShieldCapacity = capacity;
            return this;
        }
        
        public Builder withShieldRegenerationTimeout(long shieldRegenerationTimeout) {
            this.shieldRegenerationTimeout  = shieldRegenerationTimeout;
            return this;
        }
        
        public Builder withShieldRegenerationRate(double shieldRegenerationRate) {
            this.shieldRegenerationRate = shieldRegenerationRate;
            return this;
        }
        
        public Builder withShieldIndicatorPosition(double x, double y, double width, double height) {
            this.shieldIndicatorPositionX = x;
            this.shieldIndicatorPositionY = y;
            this.shieldIndicatorWidth = width;
            this.shieldIndicatorHeight = height;
            return this;
        }
        
        public Builder withShieldIndicatorTexture(String shieldIndicatorMaskTextureName, String shieldIndicatorProgressBarTextureName) {
            this.shieldIndicatorMaskTextureName = shieldIndicatorMaskTextureName.toLowerCase();
            this.shieldIndicatorProgressBarTextureName = shieldIndicatorProgressBarTextureName.toLowerCase();
            return this;
        }

        public void build(boolean isClient) {

//            if(isClient) {
//              try {
//                  chestModel = (ModelBiped) Class.forName(modelClassName).newInstance();
//              } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//                  throw new IllegalStateException("Missing chest model", e);
//              }
//
//              try {
//                  bootsModel = (ModelBiped) Class.forName(modelClassName).newInstance();
//              } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//                  throw new IllegalStateException("Missing boots model", e);
//              }
//            }

            String unlocalizedHelmetName = unlocalizedName + "_helmet";
            CustomArmor armorHelmet = new CustomArmor(unlocalizedName, material, 4, CompatibleEntityEquipmentSlot.HEAD,
                    unlocalizedHelmetName, textureName, chestModel, hudTextureName);

            if (creativeTab != null)
                armorHelmet.setCreativeTab(creativeTab);

            armorHelmet.setTranslationKey(unlocalizedHelmetName);
            compatibility.registerItem(armorHelmet, unlocalizedHelmetName.toLowerCase());

            String unlocalizedChestName = unlocalizedName + "_chest";
            CustomArmor armorChest = new CustomArmor(unlocalizedName, material, 4, CompatibleEntityEquipmentSlot.CHEST,
                    unlocalizedChestName, textureName, chestModel, hudTextureName);
            if(creativeTab != null) {
                armorChest.setCreativeTab(creativeTab);
            }
            armorChest.setTranslationKey(unlocalizedChestName);
            compatibility.registerItem(armorChest, unlocalizedChestName.toLowerCase());

            String unlocalizedBootsName = unlocalizedName + "_boots";
            CustomArmor armorBoots = new CustomArmor(unlocalizedName, material, 4, CompatibleEntityEquipmentSlot.FEET,
                    unlocalizedBootsName, textureName, bootsModel, hudTextureName);

            if(armorBoots != null)
                armorBoots.setCreativeTab(creativeTab);

            armorBoots.setTranslationKey(unlocalizedBootsName);
            compatibility.registerItem(armorBoots, unlocalizedBootsName.toLowerCase());
            
            armorHelmet.maxShieldCapacity = maxShieldCapacity;
            armorHelmet.shieldRegenerationRate = shieldRegenerationRate;
            armorHelmet.shieldRegenerationTimeout = shieldRegenerationTimeout;
            
            armorHelmet.shieldIndicatorPositionX = shieldIndicatorPositionX;
            armorHelmet.shieldIndicatorPositionY = shieldIndicatorPositionY;
            armorHelmet.shieldIndicatorWidth = shieldIndicatorWidth;
            armorHelmet.shieldIndicatorHeight = shieldIndicatorHeight;
            armorHelmet.shieldIndicatorMaskTextureName = shieldIndicatorMaskTextureName;
            armorHelmet.shieldIndicatorProgressBarTextureName = shieldIndicatorProgressBarTextureName;
            
            armorBoots.maxShieldCapacity = maxShieldCapacity;
            armorBoots.shieldRegenerationRate = shieldRegenerationRate;
            armorBoots.shieldRegenerationTimeout = shieldRegenerationTimeout;
            
            armorBoots.shieldIndicatorPositionX = shieldIndicatorPositionX;
            armorBoots.shieldIndicatorPositionY = shieldIndicatorPositionY;
            armorBoots.shieldIndicatorWidth = shieldIndicatorWidth;
            armorBoots.shieldIndicatorHeight = shieldIndicatorHeight;
            armorBoots.shieldIndicatorMaskTextureName = shieldIndicatorMaskTextureName;
            armorBoots.shieldIndicatorProgressBarTextureName = shieldIndicatorProgressBarTextureName;

            armorChest.maxShieldCapacity = maxShieldCapacity;
            armorChest.shieldRegenerationRate = shieldRegenerationRate;
            armorChest.shieldRegenerationTimeout = shieldRegenerationTimeout;
            
            armorChest.shieldIndicatorPositionX = shieldIndicatorPositionX;
            armorChest.shieldIndicatorPositionY = shieldIndicatorPositionY;
            armorChest.shieldIndicatorWidth = shieldIndicatorWidth;
            armorChest.shieldIndicatorHeight = shieldIndicatorHeight;
            armorChest.shieldIndicatorMaskTextureName = shieldIndicatorMaskTextureName;
            armorChest.shieldIndicatorProgressBarTextureName = shieldIndicatorProgressBarTextureName;
        }


        public CustomArmor buildHelmet(ModContext context) {
            if(context.isClient() && helmetModel == null)
                helmetModel = HelmetModelFactory.create(modelClassName);

            String unlocalizedHelmetName = unlocalizedName + "_helmet";
            CustomArmor armorHelmet = new CustomArmor(unlocalizedName, material, 4, CompatibleEntityEquipmentSlot.HEAD,
                    unlocalizedHelmetName, textureName, helmetModel, hudTextureName);
            
            CraftingRegistry.registerHook(armorHelmet);

            armorHelmet.hasNightVision = nightVision;
            armorHelmet.vignetteEnabled = vignetteEnabled;
            armorHelmet.exposureReductionFactor = this.exposureReductionFactor;
            armorHelmet.setTranslationKey(unlocalizedHelmetName);
            armorHelmet.breathingSound = context.registerSound(breathingSound);
            compatibility.registerItem(armorHelmet, unlocalizedHelmetName.toLowerCase());

            if (creativeTab != null)
                armorHelmet.setCreativeTab(creativeTab);
            
//            armorHelmet.maxShieldCapacity = maxShieldCapacity;
//            armorHelmet.shieldRegenerationRate = shieldRegenerationRate;
//            armorHelmet.shieldRegenerationTimeout = shieldRegenerationTimeout;

            return armorHelmet;
        }

        public CustomArmor buildChest(boolean isClient) {

            if(isClient && chestModel == null) {
                chestModel = ChestModelFactory.createModel(modelClassName);
            }

            String unlocalizedChestName = unlocalizedName + "_chest";
            CustomArmor armorChest = new CustomArmor(unlocalizedName, material, 4, CompatibleEntityEquipmentSlot.CHEST,
                    unlocalizedChestName, textureName, chestModel, hudTextureName);
            
            CraftingRegistry.registerHook(armorChest);
            
            
            if(creativeTab != null)
                armorChest.setCreativeTab(creativeTab);

            armorChest.setTranslationKey(unlocalizedChestName);
            compatibility.registerItem(armorChest, unlocalizedChestName.toLowerCase());
            
            armorChest.maxShieldCapacity = maxShieldCapacity;
            armorChest.shieldRegenerationRate = shieldRegenerationRate;
            armorChest.shieldRegenerationTimeout = shieldRegenerationTimeout;
            
            armorChest.shieldIndicatorPositionX = shieldIndicatorPositionX;
            armorChest.shieldIndicatorPositionY = shieldIndicatorPositionY;
            armorChest.shieldIndicatorWidth = shieldIndicatorWidth;
            armorChest.shieldIndicatorHeight = shieldIndicatorHeight;
            armorChest.shieldIndicatorMaskTextureName = shieldIndicatorMaskTextureName;
            armorChest.shieldIndicatorProgressBarTextureName = shieldIndicatorProgressBarTextureName;

            return armorChest;
        }

        public CustomArmor buildBoots(boolean isClient) {
            if (isClient && bootsModel == null)
                bootsModel = BootsModelFactory.createModel(modelClassName);

            String unlocalizedBootsName = unlocalizedName + "_boots";
            CustomArmor armorBoots = new CustomArmor(unlocalizedName, material, 4, CompatibleEntityEquipmentSlot.FEET,
                    unlocalizedBootsName, textureName, bootsModel, hudTextureName);
            
            CraftingRegistry.registerHook(armorBoots);
            
            if (creativeTab != null)
                armorBoots.setCreativeTab(creativeTab);

            armorBoots.setTranslationKey(unlocalizedBootsName);
            compatibility.registerItem(armorBoots, unlocalizedBootsName.toLowerCase());
            
//            armorBoots.maxShieldCapacity = maxShieldCapacity;
//            armorBoots.shieldRegenerationRate = shieldRegenerationRate;
//            armorBoots.shieldRegenerationTimeout = shieldRegenerationTimeout;

            return armorBoots;
        }

        
        
    }

    private Map<ItemAttachment<CustomArmor>, CompatibleAttachment<CustomArmor>> compatibleAttachments = new HashMap<>();

    //private CompatibleEntityEquipmentSlot slot;
    private boolean hasNightVision;
    private boolean vignetteEnabled;
    private float exposureReductionFactor;
    @SuppressWarnings("unused")
    private CompatibleSound breathingSound;

    private CompatibleEntityEquipmentSlot compatibleEquipmentType;
    
//    private boolean shieldEnabled;
    private long shieldRegenerationTimeout = 1000;
    private double shieldRegenerationRate = 1.0; // restored shield capacity per sec
    private double maxShieldCapacity;
    private String unlocalizedArmorSetName;
    private double shieldIndicatorPositionX;
    private double shieldIndicatorPositionY;
    private double shieldIndicatorWidth;
    private double shieldIndicatorHeight;
    private String shieldIndicatorMaskTextureName;
    private String shieldIndicatorProgressBarTextureName;
    
 // Modern crafting setup
    private CraftingEntry[] modernRecipe;
	private CraftingGroup craftGroup;


    private CustomArmor(String unlocalizedArmorSetName, ArmorMaterial material, int renderIndex,
            CompatibleEntityEquipmentSlot armorType, String iconName, String textureName,
            ModelBiped model, String hudTextureName) {
        super(material, renderIndex, armorType, iconName.toLowerCase(), textureName, model, hudTextureName);
        this.compatibleEquipmentType = armorType;
        this.unlocalizedArmorSetName = unlocalizedArmorSetName;
    }

    public String getHudTexture() {
        return ModReference.id + ":textures/hud/" + hudTextureName + ".png";
    }
    
    public String getShieldIndicatorMaskTextureName() {
        return ModReference.id + ":textures/hud/" + shieldIndicatorMaskTextureName + ".png";
    }
    
    public String getShieldIndicatorProgressBarTextureName() {
        return ModReference.id + ":textures/hud/" + shieldIndicatorProgressBarTextureName + ".png";
    }
    
    public String getUnlocalizedArmorSetName() {
        return unlocalizedArmorSetName;
    }

    @SuppressWarnings("unchecked")
    public void changeAttachment(AttachmentCategory attachmentCategory, ItemStack itemStack, EntityPlayer player) {
        compatibility.ensureTagCompound(itemStack);

        int[] activeAttachmentsIds = ensureActiveAttachments(itemStack);
        int activeAttachmentIdForThisCategory = activeAttachmentsIds[attachmentCategory.ordinal()];
        ItemAttachment<CustomArmor> item = null;
        if(activeAttachmentIdForThisCategory > 0) {
            item = (ItemAttachment<CustomArmor>) Item.getItemById(activeAttachmentIdForThisCategory);

            if(item != null && item.getRemove() != null)
                item.getRemove().apply(item, this, player);
        }

        ItemAttachment<CustomArmor> nextAttachment = nextCompatibleAttachment(attachmentCategory, item, player);

        if(nextAttachment != null && nextAttachment.getApply() != null)
            nextAttachment.getApply().apply(nextAttachment, this, player);

        activeAttachmentsIds[attachmentCategory.ordinal()] = Item.getIdFromItem(nextAttachment);;

        compatibility.getTagCompound(itemStack).setIntArray(ACTIVE_ATTACHMENT_TAG, activeAttachmentsIds);
    }

    private ItemAttachment<CustomArmor> nextCompatibleAttachment(AttachmentCategory category, Item currentAttachment, EntityPlayer player) {

        ItemAttachment<CustomArmor> nextAttachment = null;
        boolean foundCurrent = false;
        for (int i = 0; i < 36; i++) {
            ItemStack itemStack = player.inventory.getStackInSlot(i);
            if(itemStack != null && itemStack.getItem() instanceof ItemAttachment) {
                ItemAttachment<CustomArmor> compatibleAttachment = (ItemAttachment<CustomArmor>) itemStack.getItem();
                //System.out.println("Found compatible attachment " + compatibleAttachment);
                if(compatibleAttachment.getCategory() == category) {
                    if(foundCurrent || currentAttachment == null) {
                        nextAttachment = compatibleAttachment;
                        break;
                    } else if(currentAttachment == compatibleAttachment) {
                        foundCurrent = true;
                    }
                    //System.out.println("Compatible attachment category match for " + compatibleAttachment);
                }
                //System.out.println("Item in slot " + i + ": " + itemStack);
            }
        }

        return nextAttachment;
    }

    public ItemAttachment<CustomArmor> getActiveAttachment (ItemStack itemStack, AttachmentCategory category) {
        compatibility.ensureTagCompound(itemStack);

        ItemAttachment<CustomArmor> itemAttachment = null;

        int[] activeAttachmentsIds = ensureActiveAttachments(itemStack);

        for(int activeIndex: activeAttachmentsIds) {
            if(activeIndex == 0) continue;
            Item item = Item.getItemById(activeIndex);
            if(item instanceof ItemAttachment) {
                CompatibleAttachment<CustomArmor> compatibleAttachment = compatibleAttachments.get(item);
                if(compatibleAttachment != null && category == compatibleAttachment.getAttachment().getCategory()) {
                    itemAttachment = compatibleAttachment.getAttachment();
                    break;
                }
            }

        }
        return itemAttachment;
    }

    public List<CompatibleAttachment<CustomArmor>> getActiveAttachments (ItemStack itemStack) {
        compatibility.ensureTagCompound(itemStack);

        List<CompatibleAttachment<CustomArmor>> activeAttachments = new ArrayList<>();

        int[] activeAttachmentsIds = ensureActiveAttachments(itemStack);

        for(int activeIndex: activeAttachmentsIds) {
            if(activeIndex == 0) continue;
            Item item = Item.getItemById(activeIndex);
            if(item instanceof ItemAttachment) {
                CompatibleAttachment<CustomArmor> compatibleAttachment = compatibleAttachments.get(item);
                if(compatibleAttachment != null) {
                    activeAttachments.add(compatibleAttachment);
                }

            }

        }
        return activeAttachments;
    }

    private int[] ensureActiveAttachments(ItemStack itemStack) {
        int activeAttachmentsIds[] = compatibility.getTagCompound(itemStack).getIntArray(ACTIVE_ATTACHMENT_TAG);

        if(activeAttachmentsIds == null || activeAttachmentsIds.length != AttachmentCategory.values.length) {
            activeAttachmentsIds = new int[AttachmentCategory.values.length];
            compatibility.getTagCompound(itemStack).setIntArray(ACTIVE_ATTACHMENT_TAG, activeAttachmentsIds);
            for(CompatibleAttachment<CustomArmor> attachment: compatibleAttachments.values()) {
                if(attachment.isDefault()) {
                    activeAttachmentsIds[attachment.getAttachment().getCategory().ordinal()] = Item.getIdFromItem(attachment.getAttachment());
                }
            }
        }
        return activeAttachmentsIds;
    }

    public static boolean isActiveAttachment(ItemStack itemStack, ItemAttachment<CustomArmor> attachment) {
        CustomArmor armor = (CustomArmor) itemStack.getItem();
        int[] activeAttachmentsIds = armor.ensureActiveAttachments(itemStack);
        return Arrays.stream(activeAttachmentsIds).anyMatch((attachmentId) -> attachment == Item.getItemById(attachmentId));
    }
    
    public boolean hasNightVision() {
        return hasNightVision;
    }
    
    public boolean isVignetteEnabled() {
        return vignetteEnabled;
    }

    @Override
    public Function<Float, Float> getAbsorbFunction(Spreadable spreadable) {
        return dose -> dose * (1f - exposureReductionFactor);
    }
    
    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
        
        if(!worldIn.isRemote && entityIn != null) {
            if(maxShieldCapacity > 0.0) {
                double currentShieldCapacity = getShieldCapacity(stack);
                if(currentShieldCapacity < maxShieldCapacity) {
                    long shieldHitTimestamp = getShieldHitTimestamp(stack);
                    if(System.currentTimeMillis() - shieldHitTimestamp > shieldRegenerationTimeout) {
                        currentShieldCapacity += shieldRegenerationRate / 20.0;

                        if(currentShieldCapacity > maxShieldCapacity) {
                            currentShieldCapacity = maxShieldCapacity;
                        }
                        //System.out.println("Shield capacity increased to " + currentShieldCapacity);

                        setShieldCapacity(stack, currentShieldCapacity);
                    }
                }
            }
        }
        
//        if(!worldIn.isRemote && entityIn != null) {
//            compatibility.ensureTagCompound(stack);
//            NBTTagCompound nbt = stack.getTagCompound();
//            long lastBreathTimestamp = nbt.getLong("LastBreathTimestamp");
//            
//            long breathingPeriodMillis;
//            if(entityIn.isSprinting()) {
//                long startRunningTimestamp = nbt.getLong("StartRunningTimestamp");
//                if(startRunningTimestamp == 0) {
//                    nbt.setLong("StartRunningTimestamp", System.currentTimeMillis());
//                }
//                long runningDuration = System.currentTimeMillis() - startRunningTimestamp;
//                float runningProgress = MiscUtils.clamp(((float)runningDuration) / 5000, 0.0f, 1.0f);
//                breathingPeriodMillis = 2000L - (long)(runningProgress * 1500);
//                System.out.println("Breathing period: " + breathingPeriodMillis);
//            } else {
//                nbt.setLong("StartRunningTimestamp", 0L);
//                breathingPeriodMillis = 2000;
//            }
//            
//            if(lastBreathTimestamp + breathingPeriodMillis < System.currentTimeMillis() 
//                    && entityIn instanceof EntityLivingBase) {
//                //compatibility.playSound((EntityLivingBase) entityIn, breathingSound, 1.0f, 1.0f);
//                compatibility.playSoundAtEntity((EntityLivingBase) entityIn, breathingSound, 1.0f, 1.0f);
//                System.out.println("Breathe!");
//                nbt.setLong("LastBreathTimestamp", System.currentTimeMillis());
//            }
//        }
    }

    public CompatibleEntityEquipmentSlot getCompatibleEquipmentSlot() {
        return compatibleEquipmentType;
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armorStack, DamageSource source, double damage, int slot) {
        double damageReduceRatio;
        if(maxShieldCapacity > 0.0) {
            if(getShieldCapacity(armorStack) > 0.0) {
                damageReduceRatio = 1.0;
            } else {
                damageReduceRatio = 0.001;
            }
        } else {
            damageReduceRatio = this.damageReduceAmount / 25.0;
        }
        return new ArmorProperties(0, damageReduceRatio, Integer.MAX_VALUE);
    }
    
    private void ensureTagCompound(ItemStack itemStack) {
        if (compatibility.getTagCompound(itemStack) == null) {
            NBTTagCompound tagCompound = new NBTTagCompound();
            compatibility.setTagCompound(itemStack, tagCompound);
            tagCompound.setDouble(SHIELD_CAPACITY_TAG, maxShieldCapacity);
        }
    }

    public double getShieldCapacity(ItemStack armorStack) {
        ensureTagCompound(armorStack);
        NBTTagCompound tagCompound = compatibility.getTagCompound(armorStack);
        return tagCompound.getDouble(SHIELD_CAPACITY_TAG);
    }
    
    private void setShieldCapacity(ItemStack armorStack, double capacity) {
        ensureTagCompound(armorStack);
        NBTTagCompound tagCompound = compatibility.getTagCompound(armorStack);
        tagCompound.setDouble(SHIELD_CAPACITY_TAG, capacity);
    }
    
    private long getShieldHitTimestamp(ItemStack armorStack) {
        ensureTagCompound(armorStack);
        NBTTagCompound tagCompound = compatibility.getTagCompound(armorStack);
        return tagCompound.getLong(SHIELD_HIT_TIMESTAMP_TAG);
    }
    
    private void setShieldHitTimestamp(ItemStack armorStack, long timestamp) {
        compatibility.ensureTagCompound(armorStack);
        NBTTagCompound tagCompound = compatibility.getTagCompound(armorStack);
        tagCompound.setLong(SHIELD_HIT_TIMESTAMP_TAG, timestamp);
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
        return damageReduceAmount;
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
        if(maxShieldCapacity > 0.0) {
            double shieldCapacity = getShieldCapacity(stack) - damage;
            if(shieldCapacity < 0.0) {
                shieldCapacity = 0.0;
            }
//            System.out.println("Shield capacity decreased to " + shieldCapacity + ", health: " + entity.getHealth());
            setShieldCapacity(stack, shieldCapacity);
            setShieldHitTimestamp(stack, System.currentTimeMillis());
        } else {
            double absorb = damage * (this.damageReduceAmount / 25.0);
            int itemDamage = (int)(absorb / 25.0 < 1 ? 1 : absorb / 25.0);
            stack.damageItem(itemDamage, entity);
        }
    }
    
    public double getMaxShieldCapacity() {
        return maxShieldCapacity;
    }
    
    public double getShieldIndicatorPositionX() {
        return shieldIndicatorPositionX;
    }
    
    public double getShieldIndicatorPositionY() {
        return shieldIndicatorPositionY;
    }
    
    public double getShieldIndicatorWidth() {
        return shieldIndicatorWidth;
    }
    
    public double getShieldIndicatorHeight() {
        return shieldIndicatorHeight;
    }

	@Override
	public CraftingEntry[] getModernRecipe() {
		return this.modernRecipe;
	}

	@Override
	public Item getItem() {
		return this;
	}

	@Override
	public CraftingGroup getCraftingGroup() {
		return this.craftGroup;
	}

	@Override
	public void setCraftingRecipe(CraftingEntry[] recipe) {
		this.modernRecipe = recipe;
	}

	@Override
	public void setCraftingGroup(CraftingGroup group) {
		this.craftGroup = group;
	}
}
