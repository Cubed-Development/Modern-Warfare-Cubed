package com.paneedah.weaponlib;

import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCraftingRecipe;
import com.paneedah.weaponlib.model.ModelBaseRendererWrapper;
import com.paneedah.weaponlib.model.WrappableModel;
import lombok.Getter;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

import static com.paneedah.mwc.handlers.ClientEventHandler.COOKING_QUEUE;
import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.ProjectConstants.ID;

public class CustomArmor extends ItemArmor implements ExposureProtection, ISpecialArmor, IModernCraftingRecipe {

    private static final String ACTIVE_ATTACHMENT_TAG = "ActiveAttachments";

    private static final String SHIELD_CAPACITY_TAG = "ShieldCapacity";

    private static final String SHIELD_HIT_TIMESTAMP_TAG = "ShieldHitTimestamp";

    protected String textureName;
    protected ModelBiped model;
    protected String hudTextureName;

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


                    if (ModelBiped.class.isAssignableFrom(modelClass)) {
                        helmetModel = (ModelBiped) modelClass.newInstance();
                    } else if (ModelBase.class.isAssignableFrom(modelClass)) {
                        helmetModel = new ModelBiped() {
                            {
                                bipedHead = new ModelBaseRendererWrapper((WrappableModel) modelClass.newInstance());
                                bipedHeadwear.isHidden = true;
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

                    if (ModelBiped.class.isAssignableFrom(modelClass)) {
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

        private String iconName;
        private ArmorMaterial material;
        private String unlocalizedName;
        private ModelBiped bootsModel;
        private ModelBiped chestModel;
        private ModelBiped helmetModel;
        private String modelClassName;
        private String hudTextureName;
        //private Function<Integer, ModelBiped> modelFactory;
        private final Map<ItemAttachment<CustomArmor>, CompatibleAttachment<CustomArmor>> compatibleAttachments = new HashMap<>();
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
            modelClassName = modelClass;
            return this;
        }

        public Builder withHudTextureName(String hudTextureName) {
            this.hudTextureName = hudTextureName.toLowerCase();
            return this;
        }

        public Builder withNightVision(boolean nightVision) {
            this.nightVision = nightVision;
            vignetteEnabled = nightVision;
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
            breathingSound = sound.toLowerCase();
            return this;
        }

        public Builder withCompatibleAttachment(AttachmentCategory category, ModelBase attachmentModel, String textureName,
                                                Consumer<ModelBase> positioner) {
            ItemAttachment<CustomArmor> item = new ItemAttachment<CustomArmor>(category, attachmentModel, textureName, null);
            compatibleAttachments.put(item, new CompatibleAttachment<CustomArmor>(item, positioner));
            return this;
        }

        public Builder withShieldCapacity(double capacity) {
            maxShieldCapacity = capacity;
            return this;
        }

        public Builder withShieldRegenerationTimeout(long shieldRegenerationTimeout) {
            this.shieldRegenerationTimeout = shieldRegenerationTimeout;
            return this;
        }

        public Builder withShieldRegenerationRate(double shieldRegenerationRate) {
            this.shieldRegenerationRate = shieldRegenerationRate;
            return this;
        }

        public Builder withShieldIndicatorPosition(double x, double y, double width, double height) {
            shieldIndicatorPositionX = x;
            shieldIndicatorPositionY = y;
            shieldIndicatorWidth = width;
            shieldIndicatorHeight = height;
            return this;
        }

        public Builder withShieldIndicatorTexture(String shieldIndicatorMaskTextureName, String shieldIndicatorProgressBarTextureName) {
            this.shieldIndicatorMaskTextureName = shieldIndicatorMaskTextureName.toLowerCase();
            this.shieldIndicatorProgressBarTextureName = shieldIndicatorProgressBarTextureName.toLowerCase();
            return this;
        }

        public void build(boolean isClient) {

            String unlocalizedHelmetName = unlocalizedName + "_helmet";
            CustomArmor armorHelmet = new CustomArmor(unlocalizedName, material, 4, EntityEquipmentSlot.HEAD, unlocalizedHelmetName, textureName, chestModel, hudTextureName);

            if (creativeTab != null) {
                armorHelmet.setCreativeTab(creativeTab);
            }

            armorHelmet.setTranslationKey(unlocalizedHelmetName);
            armorHelmet.setRegistryName(ID, unlocalizedHelmetName.toLowerCase()); // temporary hack
            ForgeRegistries.ITEMS.register(armorHelmet);

            String unlocalizedChestName = unlocalizedName + "_chest";
            CustomArmor armorChest = new CustomArmor(unlocalizedName, material, 4, EntityEquipmentSlot.CHEST,
                    unlocalizedChestName, textureName, chestModel, hudTextureName);
            if (creativeTab != null) {
                armorChest.setCreativeTab(creativeTab);
            }
            armorChest.setTranslationKey(unlocalizedChestName);
            armorChest.setRegistryName(ID, unlocalizedChestName.toLowerCase()); // temporary hack
            ForgeRegistries.ITEMS.register(armorChest);

            String unlocalizedBootsName = unlocalizedName + "_boots";
            CustomArmor armorBoots = new CustomArmor(unlocalizedName, material, 4, EntityEquipmentSlot.FEET,
                    unlocalizedBootsName, textureName, bootsModel, hudTextureName);

            armorBoots.setCreativeTab(creativeTab);

            armorBoots.setTranslationKey(unlocalizedBootsName);
            armorBoots.setRegistryName(ID, unlocalizedBootsName.toLowerCase()); // temporary hack
            ForgeRegistries.ITEMS.register(armorBoots);

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
            if (context.isClient() && helmetModel == null) {
                helmetModel = HelmetModelFactory.create(modelClassName);
            }

            String unlocalizedHelmetName = unlocalizedName + "_helmet";
            CustomArmor armorHelmet = new CustomArmor(unlocalizedName, material, 4, EntityEquipmentSlot.HEAD, unlocalizedHelmetName, textureName, helmetModel, hudTextureName);

            CraftingRegistry.registerHook(armorHelmet);

            armorHelmet.hasNightVision = nightVision;
            armorHelmet.vignetteEnabled = vignetteEnabled;
            armorHelmet.exposureReductionFactor = exposureReductionFactor;
            armorHelmet.setTranslationKey(unlocalizedHelmetName);
            armorHelmet.breathingSound = context.registerSound(breathingSound);
            armorHelmet.setRegistryName(ID, unlocalizedHelmetName.toLowerCase()); // temporary hack
            ForgeRegistries.ITEMS.register(armorHelmet);

            if (creativeTab != null) {
                armorHelmet.setCreativeTab(creativeTab);
            }

            if (FMLCommonHandler.instance().getSide().isClient()) {
                COOKING_QUEUE.add(armorHelmet);
            }

            return armorHelmet;
        }

        public CustomArmor buildChest(boolean isClient) {

            if (isClient && chestModel == null) {
                chestModel = ChestModelFactory.createModel(modelClassName);
            }

            String unlocalizedChestName = unlocalizedName + "_chest";
            CustomArmor armorChest = new CustomArmor(unlocalizedName, material, 4, EntityEquipmentSlot.CHEST,
                    unlocalizedChestName, textureName, chestModel, hudTextureName);

            CraftingRegistry.registerHook(armorChest);


            if (creativeTab != null) {
                armorChest.setCreativeTab(creativeTab);
            }

            armorChest.setTranslationKey(unlocalizedChestName);
            armorChest.setRegistryName(ID, unlocalizedChestName.toLowerCase()); // temporary hack
            ForgeRegistries.ITEMS.register(armorChest);

            armorChest.maxShieldCapacity = maxShieldCapacity;
            armorChest.shieldRegenerationRate = shieldRegenerationRate;
            armorChest.shieldRegenerationTimeout = shieldRegenerationTimeout;

            armorChest.shieldIndicatorPositionX = shieldIndicatorPositionX;
            armorChest.shieldIndicatorPositionY = shieldIndicatorPositionY;
            armorChest.shieldIndicatorWidth = shieldIndicatorWidth;
            armorChest.shieldIndicatorHeight = shieldIndicatorHeight;
            armorChest.shieldIndicatorMaskTextureName = shieldIndicatorMaskTextureName;
            armorChest.shieldIndicatorProgressBarTextureName = shieldIndicatorProgressBarTextureName;

            if (FMLCommonHandler.instance().getSide().isClient()) {
                COOKING_QUEUE.add(armorChest);
            }

            return armorChest;
        }

        public CustomArmor buildBoots(boolean isClient) {
            if (isClient && bootsModel == null) {
                bootsModel = BootsModelFactory.createModel(modelClassName);
            }

            String unlocalizedBootsName = unlocalizedName + "_boots";
            CustomArmor armorBoots = new CustomArmor(unlocalizedName, material, 4, EntityEquipmentSlot.FEET,
                    unlocalizedBootsName, textureName, bootsModel, hudTextureName);

            CraftingRegistry.registerHook(armorBoots);

            if (creativeTab != null) {
                armorBoots.setCreativeTab(creativeTab);
            }

            armorBoots.setTranslationKey(unlocalizedBootsName);
            armorBoots.setRegistryName(ID, unlocalizedBootsName.toLowerCase()); // temporary hack
            ForgeRegistries.ITEMS.register(armorBoots);

            if (FMLCommonHandler.instance().getSide().isClient()) {
                COOKING_QUEUE.add(armorBoots);
            }

            return armorBoots;
        }


    }

    private final Map<ItemAttachment<CustomArmor>, CompatibleAttachment<CustomArmor>> compatibleAttachments = new HashMap<>();

    //private EntityEquipmentSlot slot;
    private boolean hasNightVision;
    @Getter
    private boolean vignetteEnabled;
    private float exposureReductionFactor;

    private SoundEvent breathingSound;
    private final EntityEquipmentSlot compatibleEquipmentType;

    //private boolean shieldEnabled;
    private long shieldRegenerationTimeout = 1000;
    private double shieldRegenerationRate = 1.0; // restored shield capacity per sec
    @Getter
    private double maxShieldCapacity;
    @Getter
    private final String unlocalizedArmorSetName;
    @Getter
    private double shieldIndicatorPositionX;
    @Getter
    private double shieldIndicatorPositionY;
    @Getter
    private double shieldIndicatorWidth;
    @Getter
    private double shieldIndicatorHeight;
    private String shieldIndicatorMaskTextureName;
    private String shieldIndicatorProgressBarTextureName;

    // Modern crafting setup
    private CraftingEntry[] modernRecipe;
    private CraftingGroup craftGroup;


    private CustomArmor(String unlocalizedArmorSetName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType, String iconName, String textureName, ModelBiped model, String hudTextureName) {
        super(material, renderIndex, armorType);
        this.textureName = textureName;
        this.model = model;
        this.hudTextureName = hudTextureName;
        compatibleEquipmentType = armorType;
        this.unlocalizedArmorSetName = unlocalizedArmorSetName;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        ModelBiped armorModel = null;

        if (itemStack.getItem() instanceof CustomArmor) {
            armorModel = model;
        }

        if (armorModel != null) {

            armorModel.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
            armorModel.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
            armorModel.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST;
            armorModel.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.MAINHAND || armorSlot == EntityEquipmentSlot.OFFHAND;
            armorModel.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.MAINHAND || armorSlot == EntityEquipmentSlot.OFFHAND;

            if (entityLiving instanceof EntityPlayer) {
                Render<AbstractClientPlayer> entityRenderObject = MC.getRenderManager().getEntityRenderObject(entityLiving);
                RenderPlayer renderPlayer = (RenderPlayer) entityRenderObject;
                assert renderPlayer != null;
                ModelBiped playerModel = renderPlayer.getMainModel();

                armorModel.setModelAttributes(playerModel);
                armorModel.setLivingAnimations(entityLiving, entityLiving.limbSwing, entityLiving.limbSwingAmount, MC.getRenderPartialTicks());
            } else {
                armorModel.isSneak = entityLiving.isSneaking();
                armorModel.isRiding = entityLiving.isRiding();
                armorModel.isChild = entityLiving.isChild();
            }

            return armorModel;
        }
        return null;
    }

    public String getHudTexture() {
        if (hudTextureName == null) {
            return null;
        }

        return ID + ":textures/hud/" + hudTextureName + ".png";
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return ID + ":textures/models/" + textureName + ".png";
    }

    public String getShieldIndicatorMaskTextureName() {
        return ID + ":textures/hud/" + shieldIndicatorMaskTextureName + ".png";
    }

    public String getShieldIndicatorProgressBarTextureName() {
        return ID + ":textures/hud/" + shieldIndicatorProgressBarTextureName + ".png";
    }


    public void changeAttachment(AttachmentCategory attachmentCategory, ItemStack itemStack, EntityPlayer player) {
        if (itemStack.getTagCompound() == null) {
            itemStack.setTagCompound(new NBTTagCompound());
        }

        int[] activeAttachmentsIds = ensureActiveAttachments(itemStack);
        int activeAttachmentIdForThisCategory = activeAttachmentsIds[attachmentCategory.ordinal()];
        ItemAttachment<CustomArmor> item = null;
        if (activeAttachmentIdForThisCategory > 0) {
            item = (ItemAttachment<CustomArmor>) Item.getItemById(activeAttachmentIdForThisCategory);

            if (item.getRemove() != null) {
                item.getRemove().apply(item, this, player);
            }
        }

        ItemAttachment<CustomArmor> nextAttachment = nextCompatibleAttachment(attachmentCategory, item, player);

        if (nextAttachment != null && nextAttachment.getApply() != null) {
            nextAttachment.getApply().apply(nextAttachment, this, player);
        }

        assert nextAttachment != null;
        activeAttachmentsIds[attachmentCategory.ordinal()] = Item.getIdFromItem(nextAttachment);

        itemStack.getTagCompound().setIntArray(ACTIVE_ATTACHMENT_TAG, activeAttachmentsIds);
    }

    private ItemAttachment<CustomArmor> nextCompatibleAttachment(AttachmentCategory category, Item currentAttachment, EntityPlayer player) {

        ItemAttachment<CustomArmor> nextAttachment = null;
        boolean foundCurrent = false;
        for (int i = 0; i < 36; i++) {
            ItemStack itemStack = player.inventory.getStackInSlot(i);
            if (itemStack.getItem() instanceof ItemAttachment) {
                ItemAttachment<CustomArmor> compatibleAttachment = (ItemAttachment<CustomArmor>) itemStack.getItem();
                //System.out.println("Found compatible attachment " + compatibleAttachment);
                if (compatibleAttachment.getCategory() == category) {
                    if (foundCurrent || currentAttachment == null) {
                        nextAttachment = compatibleAttachment;
                        break;
                    } else if (currentAttachment == compatibleAttachment) {
                        foundCurrent = true;
                    }
                    //System.out.println("Compatible attachment category match for " + compatibleAttachment);
                }
                //System.out.println("Item in slot " + i + ": " + itemStack);
            }
        }

        return nextAttachment;
    }

    public ItemAttachment<CustomArmor> getActiveAttachment(ItemStack itemStack, AttachmentCategory category) {
        if (itemStack.getTagCompound() == null) {
            itemStack.setTagCompound(new NBTTagCompound());
        }

        ItemAttachment<CustomArmor> itemAttachment = null;

        int[] activeAttachmentsIds = ensureActiveAttachments(itemStack);

        for (int activeIndex : activeAttachmentsIds) {
            if (activeIndex == 0) {
                continue;
            }
            Item item = Item.getItemById(activeIndex);
            if (item instanceof ItemAttachment) {
                CompatibleAttachment<CustomArmor> compatibleAttachment = compatibleAttachments.get(item);
                if (compatibleAttachment != null && category == compatibleAttachment.getAttachment().getCategory()) {
                    itemAttachment = compatibleAttachment.getAttachment();
                    break;
                }
            }

        }
        return itemAttachment;
    }

    public List<CompatibleAttachment<CustomArmor>> getActiveAttachments(ItemStack itemStack) {
        if (itemStack.getTagCompound() == null) {
            itemStack.setTagCompound(new NBTTagCompound());
        }

        List<CompatibleAttachment<CustomArmor>> activeAttachments = new ArrayList<>();

        int[] activeAttachmentsIds = ensureActiveAttachments(itemStack);

        for (int activeIndex : activeAttachmentsIds) {
            if (activeIndex == 0) {
                continue;
            }
            Item item = Item.getItemById(activeIndex);
            if (item instanceof ItemAttachment) {
                CompatibleAttachment<CustomArmor> compatibleAttachment = compatibleAttachments.get(item);
                if (compatibleAttachment != null) {
                    activeAttachments.add(compatibleAttachment);
                }

            }

        }
        return activeAttachments;
    }

    private int[] ensureActiveAttachments(ItemStack itemStack) {
        assert itemStack.getTagCompound() != null;
        int[] activeAttachmentsIds = itemStack.getTagCompound().getIntArray(ACTIVE_ATTACHMENT_TAG);

        if (activeAttachmentsIds.length != AttachmentCategory.values.length) {
            activeAttachmentsIds = new int[AttachmentCategory.values.length];
            itemStack.getTagCompound().setIntArray(ACTIVE_ATTACHMENT_TAG, activeAttachmentsIds);
            for (CompatibleAttachment<CustomArmor> attachment : compatibleAttachments.values()) {
                if (attachment.isDefault()) {
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

    @Override
    public Function<Float, Float> getAbsorbFunction(Spreadable spreadable) {
        return dose -> Float.valueOf(dose * (1f - exposureReductionFactor));
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);

        if (!worldIn.isRemote) {
            if (maxShieldCapacity > 0.0) {
                double currentShieldCapacity = getShieldCapacity(stack);
                if (currentShieldCapacity < maxShieldCapacity) {
                    long shieldHitTimestamp = getShieldHitTimestamp(stack);
                    if (System.currentTimeMillis() - shieldHitTimestamp > shieldRegenerationTimeout) {
                        currentShieldCapacity += shieldRegenerationRate / 20.0;

                        if (currentShieldCapacity > maxShieldCapacity) {
                            currentShieldCapacity = maxShieldCapacity;
                        }
                        //System.out.println("Shield capacity increased to " + currentShieldCapacity);

                        setShieldCapacity(stack, currentShieldCapacity);
                    }
                }
            }
        }
    }

    public EntityEquipmentSlot getCompatibleEquipmentSlot() {
        return compatibleEquipmentType;
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armorStack, DamageSource source, double damage, int slot) {
        double damageReduceRatio;
        if (maxShieldCapacity > 0.0) {
            if (getShieldCapacity(armorStack) > 0.0) {
                damageReduceRatio = 1.0;
            } else {
                damageReduceRatio = 0.001;
            }
        } else {
            damageReduceRatio = damageReduceAmount / 25.0;
        }
        return new ArmorProperties(0, damageReduceRatio, Integer.MAX_VALUE);
    }

    private void ensureTagCompound(ItemStack itemStack) {
        if (itemStack.getTagCompound() == null) {
            NBTTagCompound tagCompound = new NBTTagCompound();
            itemStack.setTagCompound(tagCompound);
            tagCompound.setDouble(SHIELD_CAPACITY_TAG, maxShieldCapacity);
        }
    }

    public double getShieldCapacity(ItemStack armorStack) {
        ensureTagCompound(armorStack);
        NBTTagCompound tagCompound = armorStack.getTagCompound();
        assert tagCompound != null;
        return tagCompound.getDouble(SHIELD_CAPACITY_TAG);
    }

    private void setShieldCapacity(ItemStack armorStack, double capacity) {
        ensureTagCompound(armorStack);
        NBTTagCompound tagCompound = armorStack.getTagCompound();
        assert tagCompound != null;
        tagCompound.setDouble(SHIELD_CAPACITY_TAG, capacity);
    }

    private long getShieldHitTimestamp(ItemStack armorStack) {
        ensureTagCompound(armorStack);
        NBTTagCompound tagCompound = armorStack.getTagCompound();
        assert tagCompound != null;
        return tagCompound.getLong(SHIELD_HIT_TIMESTAMP_TAG);
    }

    private void setShieldHitTimestamp(ItemStack armorStack, long timestamp) {
        if (armorStack.getTagCompound() == null) {
            armorStack.setTagCompound(new NBTTagCompound());
        }
        NBTTagCompound tagCompound = armorStack.getTagCompound();
        tagCompound.setLong(SHIELD_HIT_TIMESTAMP_TAG, timestamp);
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
        return damageReduceAmount;
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
        if (maxShieldCapacity > 0.0) {
            double shieldCapacity = getShieldCapacity(stack) - damage;
            if (shieldCapacity < 0.0) {
                shieldCapacity = 0.0;
            }
//            System.out.println("Shield capacity decreased to " + shieldCapacity + ", health: " + entity.getHealth());
            setShieldCapacity(stack, shieldCapacity);
            setShieldHitTimestamp(stack, System.currentTimeMillis());
        } else {
            double absorb = damage * (damageReduceAmount / 25.0);
            int itemDamage = (int) (absorb / 25.0 < 1 ? 1 : absorb / 25.0);
            stack.damageItem(itemDamage, entity);
        }
    }

    @Override
    public CraftingEntry[] getModernRecipe() {
        return modernRecipe;
    }

    @Override
    public ItemStack getItemStack() {
        return new ItemStack(this);
    }

    @Override
    public CraftingGroup getCraftingGroup() {
        return craftGroup;
    }

    @Override
    public void setCraftingRecipe(CraftingEntry[] recipe) {
        modernRecipe = recipe;
    }

    @Override
    public void setCraftingGroup(CraftingGroup group) {
        craftGroup = group;
    }
}
