package com.paneedah.weaponlib.compatibility;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.mwc.vectors.Vector3D;
import com.paneedah.weaponlib.Explosion;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.ai.EntityCustomMob;
import com.paneedah.weaponlib.compatibility.CompatibleParticle.CompatibleParticleBreaking;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.inventory.GuiHandler;
import com.paneedah.weaponlib.particle.CompatibleBloodParticle;
import com.paneedah.weaponlib.tile.CustomTileEntityRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBiped.ArmPose;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderManager;
import net.minecraft.client.shader.ShaderUniform;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.*;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Pre;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.ISpecialArmor.ArmorProperties;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

@SuppressWarnings("deprecation")
public class Compatibility1_12_2 implements Compatibility {

    private static final float DEFAULT_SHELL_CASING_FORWARD_OFFSET = 0.1f;

    private static final DamageSource GENERIC_DAMAGE_SOURCE = new DamageSource("thrown");

    private static final CompatibleMathHelper mathHelper = new CompatibleMathHelper();

    private static final List<Block> blocksToCheck = Arrays.asList(
            Blocks.AIR,
            Blocks.TALLGRASS,
            Blocks.LEAVES,
            Blocks.LEAVES2,
            Blocks.FIRE,
            Blocks.DOUBLE_PLANT,
            Blocks.WEB,
            Blocks.WHEAT,
            Blocks.POTATOES,
            Blocks.CARROTS,
            Blocks.BEETROOTS,
            Blocks.CAKE,
            Blocks.CARPET,
            Blocks.COCOA,
            Blocks.IRON_BARS,
            Blocks.LADDER,
            Blocks.LEVER,
            Blocks.TORCH,
            Blocks.REDSTONE_TORCH,
            Blocks.SAPLING,
            Blocks.TRAPDOOR,
            Blocks.VINE,
            Blocks.WALL_BANNER,
            Blocks.WALL_SIGN,
            Blocks.WATERLILY
    );

    @Override
    public World world(Entity entity) {
        return entity.world;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EntityPlayer clientPlayer() {
        return mc.player;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void setClientPlayer(EntityPlayer player) {
        mc.player = (EntityPlayerSP) player;
    }

    @Override
    public void spawnEntity(EntityLivingBase player, Entity entity) {
        if(player != null) {
            player.world.spawnEntity(entity);
        }
    }

    @Override
    public void moveParticle(CompatibleParticle particle, double motionX, double motionY, double motionZ) {
        particle.move(motionX, motionY, motionZ);
    }

    @Override
    public int getStackSize(ItemStack consumedStack) {
        return consumedStack.getCount();
    }

    @Override
    public NBTTagCompound getTagCompound(ItemStack itemStack) {
        return itemStack.getTagCompound();
    }

    @Override
    public ItemStack getItemStack(ItemTossEvent event) {
        return event.getEntityItem().getItem();
    }

    @Override
    public EntityPlayer getPlayer(ItemTossEvent event) {
        return event.getPlayer();
    }

    @Override
    public ItemStack getHeldItemMainHand(EntityLivingBase player) {
        return player.getHeldItemMainhand();
    }

    @Override
    public boolean consumeInventoryItem(EntityPlayer player, Item item) {
        return consumeInventoryItem(player.inventory, item);
    }

    @Override
    public void ensureTagCompound(ItemStack itemStack) {
        if (itemStack.getTagCompound() == null) {
            itemStack.setTagCompound(new NBTTagCompound());
        }
    }

    @Override
    public void playSound(EntityLivingBase player, CompatibleSound sound, float volume, float pitch) {
        if(sound != null) {
            player.playSound(sound.getSound(), volume, pitch);
        }
    }

    @Override
    public IAttribute getMovementSpeedAttribute() {
        return SharedMonsterAttributes.MOVEMENT_SPEED;
    }

    @Override
    public void setTagCompound(ItemStack itemStack, NBTTagCompound tagCompound) {
        itemStack.setTagCompound(tagCompound);
    }

    @Override
    public boolean isClientSide() {
        return FMLCommonHandler.instance().getSide() == Side.CLIENT;
    }

    @Override
    public CompatibleMathHelper getMathHelper() {
        return mathHelper;
    }

    @Override
    public void playSoundToNearExcept(EntityLivingBase player, CompatibleSound sound, float volume, float pitch) {
        player.world.playSound(player instanceof EntityPlayer ? (EntityPlayer) player : null, player.posX, player.posY, player.posZ, sound.getSound(),
                player.getSoundCategory(), volume, pitch);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public EntityPlayer getClientPlayer() {
        return FMLClientHandler.instance().getClientPlayerEntity();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public FontRenderer getFontRenderer() {
        return mc.fontRenderer;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ScaledResolution getResolution(Pre event) {
        return event.getResolution();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ElementType getEventType(Pre event) {
        return event.getType();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getHelmet() {
        return mc.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
    }

    @Override
    public Vector3D getLookVec(EntityPlayer player) {
        return new Vector3D(player.getLookVec());
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerKeyBinding(KeyBinding key) {
        ClientRegistry.registerKeyBinding(key);
    }

    @Override
    public void registerWithEventBus(Object object) {
        MinecraftForge.EVENT_BUS.register(object);
    }

    @Override
    public void registerWithFmlEventBus(Object object) {
        MinecraftForge.EVENT_BUS.register(object);
    }

    @Override
    public void registerSound(CompatibleSound sound) {
        sound.getSound().setRegistryName(sound.getResourceLocation());
        ForgeRegistries.SOUND_EVENTS.register(sound.getSound());
        //GameRegistry.register(sound.getSound(), sound.getResourceLocation());
    }

    @Override
    public void registerItem(Item item, String name) {
        item.setRegistryName(ModReference.id, name); // temporary hack
        ForgeRegistries.ITEMS.register(item);
        //GameRegistry.register(item, new ResourceLocation(ModReference.id, name)); // temporary hack
    }
    
    @Override
    public void registerItem(Item item, ResourceLocation name) {
        item.setRegistryName(name); // temporary hack
        ForgeRegistries.ITEMS.register(item);
        //GameRegistry.register(item, new ResourceLocation(ModReference.id, name)); // temporary hack
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void runInMainClientThread(Runnable runnable) {
        mc.addScheduledTask(runnable);
    }

    @Override
    public void registerModEntity(Class<? extends Entity> entityClass, String entityName, int id, Object mod, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
        net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity
            (new ResourceLocation(ModReference.id, entityName), entityClass, entityName, id, mod, trackingRange, updateFrequency, sendsVelocityUpdates);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerRenderingRegistry(CompatibleRenderingRegistry rendererRegistry) {
        //MinecraftForge.EVENT_BUS.register(rendererRegistry);
    	
        //ModelLoaderRegistry.registerLoader(rendererRegistry);
    }

    @Override
    public <T, E> T getPrivateValue(Class<? super E> classToAccess, E instance, String... fieldNames) {
        return ObfuscationReflectionHelper.getPrivateValue(classToAccess, instance, fieldNames);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getButton(MouseEvent event) {
        return event.getButton();
    }

    @Override
    public EntityPlayer getEntity(FOVUpdateEvent event) {
        return event.getEntity();
    }

    @Override
    public EntityLivingBase getEntity(@SuppressWarnings("rawtypes") RenderLivingEvent.Pre event) {
        return event.getEntity();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void setNewFov(FOVUpdateEvent event, float fov) {
        event.setNewfov(fov);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public RenderPlayer getRenderer(@SuppressWarnings("rawtypes") RenderLivingEvent.Pre event) {
        return (RenderPlayer) event.getRenderer();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public GuiScreen getGui(GuiOpenEvent event) {
        return event.getGui();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void setAimed(RenderPlayer rp, boolean aimed) {
        if (aimed) {
            rp.getMainModel().leftArmPose = ArmPose.BOW_AND_ARROW;
            rp.getMainModel().rightArmPose = ArmPose.BOW_AND_ARROW;
        } else {
            rp.getMainModel().leftArmPose = ArmPose.EMPTY;
            rp.getMainModel().rightArmPose = ArmPose.ITEM;
        }
    }

    @Override
    public CompatibleRayTraceResult getObjectMouseOver() {
        return CompatibleRayTraceResult.fromRayTraceResult(mc.objectMouseOver);
    }

    @Override
    public CompatibleBlockState getBlockAtPosition(World world, CompatibleRayTraceResult position) {
        IBlockState blockState = world.getBlockState(
                new BlockPos(position.getBlockPosX(), position.getBlockPosY(), position.getBlockPosZ()));
        return CompatibleBlockState.fromBlockState(blockState);
    }

    @Override
    public void destroyBlock(World world, CompatibleRayTraceResult position) {
        world.destroyBlock(new BlockPos(position.getBlockPosX(), position.getBlockPosY(), position.getBlockPosZ()),
                true);
    }

    @Override
    public boolean consumeInventoryItem(InventoryPlayer inventoryPlayer, Item item) {
        boolean result = false;
        for (int i = 0; i < inventoryPlayer.getSizeInventory(); i++) {
            ItemStack stack = inventoryPlayer.getStackInSlot(i);
            if (stack != null && stack.getItem() == item) {
                stack.shrink(1);
                if (stack.getCount() <= 0) {
                    inventoryPlayer.setInventorySlotContents(i, null);
                }
                result = true;
                break;
            }
        }

        return result;
    }

    @Override
    public ItemStack itemStackForItem(Item item, Predicate<ItemStack> condition, EntityPlayer player) {
        ItemStack result = null;

        for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
            ItemStack stack = player.inventory.getStackInSlot(i);
            if (stack != null && stack.getItem() == item && condition.test(stack)) {
                result = stack;
                break;
            }
        }

        return result;
    }

    @Override
    public boolean isGlassBlock(CompatibleBlockState blockState) {
        Block block = blockState.getBlockState().getBlock();
        return block == Blocks.GLASS || block == Blocks.GLASS_PANE || block == Blocks.STAINED_GLASS
                || block == Blocks.STAINED_GLASS_PANE;
    }

    @Override
    public float getEffectOffsetX() {
		return -0.1f;
    }

    @Override
    public float getEffectOffsetY() {
		return -1.7f;
    }

    @Override
    public float getEffectScaleFactor() {
        return 2.0f;
    }

    @Override
    public int getCurrentInventoryItemIndex(EntityPlayer player) {
        return player.inventory.currentItem;
    }

    @Override
    public boolean addItemToPlayerInventory(EntityPlayer player, Item item, int slot) {
        boolean result = false;
        if(slot == -1) {
            player.inventory.addItemStackToInventory(new ItemStack(item));
        } else if(player.inventory.mainInventory.get(slot) == null || player.inventory.mainInventory.get(slot).getItem() == Items.AIR) {
            player.inventory.mainInventory.set(slot, new ItemStack(item));
        }
        return result;
    }

    @Override
    public ItemStack getInventoryItemStack(EntityPlayer player, int inventoryItemIndex) {
        return player.inventory.getStackInSlot(inventoryItemIndex);
    }

    @Override
    public int getInventorySlot(EntityPlayer player, ItemStack itemStack) {
        int slot = -1;
        for(int i = 0; i < player.inventory.mainInventory.size(); i++) {
            if(player.inventory.mainInventory.get(i) == itemStack) {
                slot = i;
                break;
            }
        }
        return slot;    }

    @Override
    public boolean consumeInventoryItemFromSlot(EntityPlayer player, int slot) {
        if(player.inventory.getStackInSlot(slot) == null) {
            return false;
        }

        player.inventory.getStackInSlot(slot).shrink(1);
        if (player.inventory.mainInventory.get(slot).getCount() <= 0) {
            player.inventory.removeStackFromSlot(slot);
        }
        return true;
    }
    
    @Override
    public int removeMatchingInventoryItemStacks(EntityPlayer player, Item item, int quantity) {
        return player.inventory.clearMatchingItems(item, -1, quantity, null);
    }
    
    @Override
    public int getMatchingInventoryItemStack(EntityPlayer player, Item item) {
        int count = 0;
        int inventorySize = player.inventory.getSizeInventory();
        for(int i = 0; i < inventorySize; i++) {
            ItemStack itemStack = player.inventory.getStackInSlot(i);
            if(itemStack.getItem() == item) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void addShapedRecipe(ItemStack itemStack, Object... materials) {
        //GameRegistry.addShapedRecipe(itemStack, materials);
        ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, materials)
                .setMirrored(false)
                .setRegistryName(ModReference.id, itemStack.getItem().getTranslationKey() + "_recipe"));

    }

    @Override
    public void addShapedOreRecipe(ItemStack itemStack, Object... materials) {
        //GameRegistry.addRecipe(new ShapedOreRecipe(itemStack, materials).setMirrored(false));
        ForgeRegistries.RECIPES.register(
                new ShapedOreRecipe(null, itemStack, materials)
                .setMirrored(false)
                .setRegistryName(ModReference.id, itemStack.getItem().getTranslationKey() + "_recipe") // TODO: temporary hack
                );
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void disableLightMap() {
        mc.entityRenderer.disableLightmap();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void enableLightMap() {
        mc.entityRenderer.enableLightmap();
    }

    @Override
    public void registerBlock(ModContext context, Block block, String name) {
        if(block.getRegistryName() == null) {
            if(block.getTranslationKey().length() < ModReference.id.length() + 2 + 5) {
                throw new IllegalArgumentException("Unlocalize block name too short " + block.getTranslationKey());
            }
            String unlocalizedName = block.getTranslationKey().toLowerCase();
            String registryName = unlocalizedName.substring(5 + ModReference.id.length() + 1);
            block.setRegistryName(ModReference.id, registryName);
        }

        //GameRegistry.register(block);
        ForgeRegistries.BLOCKS.register(block);
        ItemBlock itemBlock = new ItemBlock(block);
        // TODO: introduce registerItem()
        
      // System.out.println("Debug Out: " + block.getRegistryName() + " | Item Block: " + itemBlock + " | Provided name: " + name);
        context.registerRenderableItem(block.getRegistryName(), itemBlock, null);
        //GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
//        itemBlock.setRegistryName(block.getRegistryName());
//        ForgeRegistries.ITEMS.register(itemBlock);
    }

    @Override
    public void registerWorldGenerator(CompatibleWorldGenerator generator, int modGenerationWeight) {
        GameRegistry.registerWorldGenerator(generator, modGenerationWeight);
    }

    @Override
    public ArmorMaterial addArmorMaterial(String name, String textureName, int durability, int[] reductionAmounts,
            int enchantability, CompatibleSound soundOnEquip, float toughness) {
        return EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability,
                soundOnEquip != null ? soundOnEquip.getSound() : null, toughness);
    }

    @Override
    public boolean inventoryHasFreeSlots(EntityPlayer player) {
        boolean result = false;
        for(int i = 0; i < player.inventory.mainInventory.size(); i++) {
            if(player.inventory.getStackInSlot(i).isEmpty()) {
                result = true;
                break;
            }
        }
        return result;
    }

//    @Override
//    public void addBlockHitEffect(CompatibleRayTraceResult position) {
//        for(int i = 0; i < 6; i++) {
//            mc.effectRenderer.addBlockHitEffects(
//                    position.getBlockPos().getBlockPos(), position.getSideHit().getEnumFacing());
//        }
//    }

    @Override
    public String getDisplayName(EntityPlayer player) {
        return player.getDisplayNameString();
    }

    @Override
    public void clickBlock(CompatibleBlockPos blockPos, EnumFacing sideHit) {
        mc.playerController.clickBlock(blockPos.getBlockPos(), sideHit);
    }

    @Override
    public boolean isAirBlock(World world, CompatibleBlockPos blockPos) {
        return world.isAirBlock(blockPos.getBlockPos());
    }

    @Override
    public void addChatMessage(Entity entity, String message) {
        entity.sendMessage(new TextComponentString(message));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public RenderGlobal createCompatibleRenderGlobal() {
        return /*mc.renderGlobal; //*/ new CompatibleRenderGlobal(mc);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Entity getRenderViewEntity() {
        return mc.getRenderViewEntity();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void setRenderViewEntity(Entity entity) {
        mc.setRenderViewEntity(entity);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addBlockHitEffect(BlockPos blockPos, double x, double y, double z, EnumFacing sideHit) {
        for (int i = 0; i < ModernWarfareMod.bulletHitParticleMult; i++) {
            mc.effectRenderer.addBlockHitEffects(blockPos, sideHit);
            mc.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x, y, z, 0, 0, 0);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addBreakingParticle(ModContext modContext, double x, double y, double z) {
        double yOffset = 1;
        CompatibleParticleBreaking particle = CompatibleParticle.createParticleBreaking(
                modContext, world(clientPlayer()), x, y + yOffset, z);
        mc.effectRenderer.addEffect(particle);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addBloodParticle(ModContext modContext, double x, double y, double z, double velX, double velY, double velZ) {
    
    	
    	CompatibleBloodParticle cdp = new CompatibleBloodParticle(modContext, mc.world, x, y, z, velX, velY, velZ);
    
		mc.effectRenderer.addEffect(cdp);

    }

    @Override
    public float getAspectRatio(ModContext modContext) {
        return modContext.getAspectRatio();
    }
    
    private static int findGreatesItemIndex(Collection<? extends Item> compatibleItems, Comparator<ItemStack> comparator, EntityPlayer player) {
        ItemStack maxStack = null;
        int maxItemIndex = -1;
        for (int i = 0; i < player.inventory.mainInventory.size(); ++i) {
            if (player.inventory.getStackInSlot(i) != null
                    && compatibleItems.contains(player.inventory.getStackInSlot(i).getItem())
                    && (maxStack == null || comparator.compare(player.inventory.getStackInSlot(i), maxStack) > 0)) {
                maxStack = player.inventory.getStackInSlot(i);
                maxItemIndex = i;
            }
        }
        return maxItemIndex;
    }
    
    @Override
    public ItemStack tryConsumingCompatibleItem(Collection<? extends Item> compatibleItems, Comparator<ItemStack> comparator, EntityPlayer player) {

        int maxSize = 1;
//        if(maxSize <= 0) {
//            return null;
//        }

        int i = findGreatesItemIndex(compatibleItems, comparator, player);

        if (i < 0) {
            return null;
        } else {
            ItemStack stackInSlot = player.inventory.getStackInSlot(i);
            int consumedStackSize = maxSize >= getStackSize(stackInSlot) ? getStackSize(stackInSlot) : maxSize;
            ItemStack result = stackInSlot.splitStack(consumedStackSize);
            if (getStackSize(stackInSlot) <= 0) {
                player.inventory.removeStackFromSlot(i);
            }
            return result;
        }
    }


    @Override
    public void setStackSize(ItemStack itemStack, int size) {
        itemStack.setCount(size);
    }

    private static int itemSlotIndex(Item item, Predicate<ItemStack> condition, EntityPlayer player) {
        for (int i = 0; i < player.inventory.mainInventory.size(); ++i) {
            if (player.inventory.getStackInSlot(i) != null
                    && player.inventory.getStackInSlot(i).getItem() == item
                    && condition.test(player.inventory.getStackInSlot(i))) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public ItemStack consumeInventoryItem(Item item, Predicate<ItemStack> condition, EntityPlayer player, int maxSize) {

        if(maxSize <= 0) {
            return null;
        }

        int i = itemSlotIndex(item, condition, player);

        if (i < 0) {
            return null;
        } else {
            ItemStack stackInSlot = player.inventory.getStackInSlot(i);
            int consumedStackSize = maxSize >= getStackSize(stackInSlot) ? getStackSize(stackInSlot) : maxSize;
            ItemStack result = stackInSlot.splitStack(consumedStackSize);
            if (getStackSize(stackInSlot) <= 0) {
                player.inventory.removeStackFromSlot(i);
            }
            return result;
        }
    }

    public ItemStack tryConsumingCompatibleItem(List<? extends Item> compatibleParts, int maxSize,
            EntityPlayer player, @SuppressWarnings("unchecked") Predicate<ItemStack> ...conditions) {
        ItemStack resultStack = null;
        for(Predicate<ItemStack> condition: conditions) {
            for(Item item: compatibleParts) {
                if((resultStack = consumeInventoryItem(item, condition, player, maxSize)) != null) {
                    break;
                }
            }
            if(resultStack != null) break;
        }

        return resultStack;
    }

    @Override
    public CompatibleRayTraceResult rayTraceBlocks(Entity entity, Vector3D vec3, Vector3D vec31) {
        return CompatibleRayTraceResult.fromRayTraceResult(entity.getEntityWorld().rayTraceBlocks(vec3.convertToVec3d(), vec31.convertToVec3d()));
    }

    @Override
    public CompatibleAxisAlignedBB expandEntityBoundingBox(Entity entity1, double f1, double f2, double f3) {
        return new CompatibleAxisAlignedBB(entity1.getEntityBoundingBox().expand(f1, f2, f3));
    }

    @Override
    public CompatibleAxisAlignedBB getBoundingBox(Entity entity) {
        return new CompatibleAxisAlignedBB(entity.getEntityBoundingBox());
    }

    @Override
    public List<Entity> getEntitiesWithinAABBExcludingEntity(World world, Entity entity, CompatibleAxisAlignedBB boundingBox) {
        return world.getEntitiesWithinAABBExcludingEntity(entity, boundingBox.getBoundingBox());
    }

    @Override
    public void spawnParticle(World world, String particleName, double xCoord, double yCoord, double zCoord,
            double xSpeed, double ySpeed, double zSpeed) {
    	
    	
        EnumParticleTypes particleType = EnumParticleTypes.getByName(particleName);
        if(particleType != null) {
            world.spawnParticle(particleType, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed);
        }
    }

    @Override
    public CompatibleBlockState getBlockAtPosition(World world, CompatibleBlockPos blockPos) {
        return CompatibleBlockState.fromBlockState(world.getBlockState(blockPos.getBlockPos()));
    }

    @Override
    public Item findItemByName(String itemName) {
        return Item.REGISTRY.getObject(new ResourceLocation(ModReference.id, itemName));
    }

    @Override
    public String getPlayerName(EntityPlayer player) {
        return player.getName();
    }

    @Override
    public boolean isBlockPenetratableByBullets(Block block) {
        if (blocksToCheck.contains(block))
            return true;

        if (ModernConfigManager.bulletBreakGlass)
            return block.getBlockState().getBaseState().getMaterial() == Material.GLASS;

        return false;
    }
    
    @Override
    public boolean isBlockPenetratableByBullets(CompatibleBlockState blockState) {
        return isBlockPenetratableByBullets(blockState.getBlockState().getBlock());
    }

    @Override
    public boolean canCollideCheck(Block block, CompatibleBlockState metadata, boolean hitIfLiquid) {
    	//return false;
    	
    //	return block == Blocks.STAINED_GLASS;
        return block.canCollideCheck(metadata.getBlockState(), hitIfLiquid);
    }

    @Override
    public float getCompatibleShellCasingForwardOffset() {
        return DEFAULT_SHELL_CASING_FORWARD_OFFSET ;
    }


    @Override
    public boolean madeFromHardMaterial(CompatibleBlockState blockState) {
        Material material = blockState.getBlockState().getMaterial();

        return material == Material.ROCK
                || material == Material.IRON
                || material == Material.ICE
                || material == Material.WOOD;
    }

    @Override
    public void playSoundAtEntity(Entity entity, CompatibleSound sound, float volume, float pitch) {
        if(sound != null) {
            entity.playSound(sound.getSound(), volume, pitch);
        }
    }

    @Override
    public double getBlockDensity(World world, Vector3D vec3, CompatibleAxisAlignedBB boundingBox) {
        return world.getBlockDensity(vec3.convertToVec3d(), boundingBox.getBoundingBox());
    }
    
    @Override
    public float getBlockDensity(World world, Vector3D vec, CompatibleAxisAlignedBB boundingBox, BiPredicate<Block, CompatibleBlockState> isCollidable) {
        AxisAlignedBB bb = boundingBox.getBoundingBox();
        double d0 = 1.0D / ((bb.maxX - bb.minX) * 2.0D + 1.0D);
        double d1 = 1.0D / ((bb.maxY - bb.minY) * 2.0D + 1.0D);
        double d2 = 1.0D / ((bb.maxZ - bb.minZ) * 2.0D + 1.0D);
        double d3 = (1.0D - Math.floor(1.0D / d0) * d0) / 2.0D;
        double d4 = (1.0D - Math.floor(1.0D / d2) * d2) / 2.0D;

        if (d0 >= 0.0D && d1 >= 0.0D && d2 >= 0.0D)
        {
            int j2 = 0;
            int k2 = 0;

            for (float f = 0.0F; f <= 1.0F; f = (float)((double)f + d0))
            {
                for (float f1 = 0.0F; f1 <= 1.0F; f1 = (float)((double)f1 + d1))
                {
                    for (float f2 = 0.0F; f2 <= 1.0F; f2 = (float)((double)f2 + d2))
                    {
                        double d5 = bb.minX + (bb.maxX - bb.minX) * (double)f;
                        double d6 = bb.minY + (bb.maxY - bb.minY) * (double)f1;
                        double d7 = bb.minZ + (bb.maxZ - bb.minZ) * (double)f2;
                        if(CompatibleRayTracing.rayTraceBlocks(world, new Vector3D(d5 + d3, d6, d7 + d4), vec, isCollidable) == null) {
                            ++j2;
                        }
                        /*
                        if (this.rayTraceBlocks(new Vec3d(d5 + d3, d6, d7 + d4), vec) == null) {
                            ++j2;
                        }
                        */
                        ++k2;
                    }
                }
            }

            return (float)j2 / (float)k2;
        }
        else
        {
            return 0.0F;
        }
    }

    @Override
    public boolean isImmuneToExplosions(Entity entity) {
        return entity.isImmuneToExplosions();
    }

    @Override
    public boolean isAirBlock(CompatibleBlockState blockState) {
        return blockState.getBlockState().getBlock() == Blocks.AIR;
    }

    private net.minecraft.world.Explosion getCompatibleExplosion(Explosion e) {
        return new net.minecraft.world.Explosion(
                e.getWorld(), e.getExploder(),
                e.getExplosionX(), e.getExplosionY(), e.getExplosionZ(),
                e.getExplosionSize(), false, true);
    }

    @Override
    public boolean canDropBlockFromExplosion(CompatibleBlockState blockState, Explosion e) {
        return blockState.getBlockState().getBlock().canDropFromExplosion(getCompatibleExplosion(e));
    }

    @Override
    public void onBlockExploded(World world, CompatibleBlockState blockState, CompatibleBlockPos blockpos, Explosion explosion) {
        blockState.getBlockState().getBlock().onBlockExploded(world, blockpos.getBlockPos(), getCompatibleExplosion(explosion));
    }

    @Override
    public float getExplosionResistance(World worldObj, CompatibleBlockState blockState, CompatibleBlockPos blockpos, Entity entity,
            Explosion explosion) {
        return blockState.getBlockState().getBlock().getExplosionResistance(entity);
    }

    @Override
    public float getExplosionResistance(World worldObj, Entity exploder, Explosion explosion,
            CompatibleBlockPos blockpos, CompatibleBlockState blockState) {
        return exploder.getExplosionResistance(getCompatibleExplosion(explosion), worldObj, blockpos.getBlockPos(), blockState.getBlockState());
    }

    @Override
    public boolean isSpectator(EntityPlayer entityplayer) {
        return entityplayer.isSpectator();
    }

    @Override
    public boolean isCreative(EntityPlayer entityplayer) {
        return entityplayer.isCreative();
    }

    @Override
    public void setBlockToFire(World world, CompatibleBlockPos blockpos1) {
        world.setBlockState(blockpos1.getBlockPos(), Blocks.FIRE.getDefaultState());
    }

    @Override
    public DamageSource getDamageSource(Explosion explosion) {
        return DamageSource.causeExplosionDamage(getCompatibleExplosion(explosion));
    }

    @Override
    public double getBlastDamageReduction(EntityLivingBase entity, double d10) {
        return EnchantmentProtection.getBlastDamageReduction((EntityLivingBase)entity, d10);
    }

    @Override
    public boolean verifyExplosion(World worldObj, Entity exploder, Explosion explosion, CompatibleBlockPos blockpos,
            CompatibleBlockState blockState, float f) {
        return exploder.canExplosionDestroyBlock(getCompatibleExplosion(explosion), worldObj, blockpos.getBlockPos(), blockState.getBlockState(), f);
//        return exploder.verifyExplosion(getCompatibleExplosion(explosion), worldObj, blockpos.getBlockPos(),
//                blockState.getBlockState(), f);
    }

    @Override
    public boolean isFullBlock(CompatibleBlockState blockState) {
        return blockState.getBlockState().isFullBlock();
    }

    @Override
    public void dropBlockAsItemWithChance(World world, CompatibleBlockState blockState, CompatibleBlockPos blockpos, float f, int i) {
        blockState.getBlockState().getBlock().dropBlockAsItemWithChance(world, blockpos.getBlockPos(), blockState.getBlockState(), f, i);
    }

    @Override
    public CompatibleBlockState getBlockBelow(World world, CompatibleBlockPos blockPos) {
        return CompatibleBlockState.fromBlockState(world.getBlockState(blockPos.getBlockPos().down()));
    }

    @Override
    public void playSound(World world, double posX, double posY, double posZ, CompatibleSound sound,
            float volume, float pitch) {
        if(sound != null) {
            world.playSound(null, posX, posY, posZ, sound.getSound(), SoundCategory.BLOCKS, volume, pitch);
        }
    }

    @Override
    public boolean isBlockPenetratableByGrenades(Block block) {
        return block == Blocks.AIR
                || block == Blocks.TALLGRASS
                || block == Blocks.LEAVES
                || block == Blocks.LEAVES2
                || block == Blocks.FIRE
                || block == Blocks.HAY_BLOCK
                || block == Blocks.DOUBLE_PLANT
                || block == Blocks.WEB
                || block == Blocks.WHEAT;

    }
    
    @Override
    public DamageSource genericDamageSource() {
        return GENERIC_DAMAGE_SOURCE;
    }

    @Override
    public boolean isCollided(CompatibleParticle particle) {
        return particle.isCollided();
    }

    @Override
    public ItemStack createItemStack(CompatibleItems compatibleItem, int stackSize, int damage) {
        return new ItemStack(compatibleItem.getItem(), stackSize, damage);
    }

    @Override
    public void addSmelting(Block block, ItemStack output, float f) {
        GameRegistry.addSmelting(block, output, f);
    }

    @Override
    public void addSmelting(Item item, ItemStack output, float f) {
        GameRegistry.addSmelting(item, output, f);
    }

    @Override
    public boolean isFlying(EntityPlayer player) {
        return player.capabilities.isFlying;
    }

    @Override
    public String getLocalizedString(String format, Object... args) {
        return I18n.translateToLocalFormatted(format, args);
    }

    @Override
    public void registerEgg(ModContext context, Class<? extends Entity> entityClass, String entityName,
            int primaryEggColor, int secondaryEggColor) {
        EntityRegistry.registerEgg(EntityList.getKey(entityClass), primaryEggColor, secondaryEggColor);
    }

    @Override
    public void addSpawn(Class<? extends EntityLiving> entity, int weightedProb, int min, int max,
            CompatibleBiomeType... biomeTypes) {
        
        
        Set<Biome> biomes = new HashSet<>();
        for(CompatibleBiomeType compatibleType: biomeTypes) {
            for(Type incompatibleType: compatibleType.getTypes()) {
                Set<Biome> biomesForType = BiomeDictionary.getBiomes(incompatibleType);
                for(Biome b: biomesForType) {
                    biomes.add(b);
                }
            }
        }
        
        for(CompatibleBiomeType compatibleType: biomeTypes) {
            for(Type incompatibleType: compatibleType.getTypes()) {
                for(Biome biome: ForgeRegistries.BIOMES) {
                    Set<Type> types = BiomeDictionary.getTypes(biome);
                    if(types.contains(incompatibleType)) {
                        biomes.add(biome);
                    }
                }
            }
        }
        
       EntityRegistry.addSpawn(entity, weightedProb, min, max, EnumCreatureType.MONSTER, biomes.toArray(new Biome[0]));
    }

    @Override
    public void setItemStackToSlot(Entity entity, CompatibleEntityEquipmentSlot compatibleEquipmentSlot, ItemStack itemStack) {
        entity.setItemStackToSlot(compatibleEquipmentSlot.getSlot(), itemStack);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ShaderUniform getShaderUniform(ShaderManager shaderManager, String uniformName) {
        return shaderManager.getShaderUniform(uniformName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void setUniform(ShaderUniform uniform, float value) {
        uniform.set(value);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void setUniform(ShaderUniform uniform, float value1, float value2) {
        uniform.set(value1, value2);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void setUniform(ShaderUniform uniform, float value1, float value2, float value3) {
        uniform.set(value1, value2, value3);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void setUniform(ShaderUniform uniform, float value1, float value2, float value3, float value4) {
        uniform.set(value1, value2, value3, value4);
    }
    
    @Override
    public void setEntityAttribute(EntityLivingBase entity, CompatibleSharedMonsterAttributes attributes, double value) {
        entity.getEntityAttribute(attributes.getAttributes()).setBaseValue(value);
    }

    @Override
    public EnumDifficulty getDifficulty(World world) {
        return world.getDifficulty();
    }
    
    @Override
    public void addStat(EntityPlayer entityplayer, CompatibleAchievement compatibleAchievement) {
        entityplayer.addStat(compatibleAchievement.getAchievement());
    }

    @Override
    public float getLightBrightness(World world, CompatibleBlockPos pos) {
        return world.getLightBrightness(pos.getBlockPos());
    }

    @Override
    public boolean isStrafingSupported() {
        return true;
    }

    @Override
    public void strafe(EntityCustomMob entity, float forward, float strafe) {
        entity.getMoveHelper().strafe(forward, strafe);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void useShader(EntityRenderer entityRenderer, boolean value) {
        ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, entityRenderer, value, "useShader", "field_175083_ad");
    }

    @Override
    public boolean is3dRenderable(Item item) {
        return item instanceof ItemBlock;
    }
    
    @Override
    public float getCompatibleAimingRotationYaw(EntityLivingBase thrower) {
        return thrower.rotationYaw;
    }

    @Override
    public <T> void setPrivateValue(Class<T> class1, T instance, Object value, String...fieldNames) {
        ObfuscationReflectionHelper.setPrivateValue(class1, instance, value, fieldNames);
    }

    @Override
    public ItemStack getHelmet(EntityLivingBase entity) {
        return entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
    }
    
    @Override
    public Vector3D getLookVec(EntityLivingBase player) {
        return new Vector3D(player.getLookVec());
    }

    @Override
    public ItemStack createItemStack(NBTTagCompound tagCompound) {
        return new ItemStack(tagCompound);
    }
    
    @Override
    public EntityAITarget createAINearestAttackableTarget(EntityLivingBase e, Class<? extends EntityLivingBase> targetClass,
            boolean checkSight) {
        return new EntityAINearestAttackableTarget<>((EntityCreature)e, targetClass, checkSight);
    }
    
    @Override
    public EntityAIBase createAiAvoidEntity(EntityLivingBase e, Class<? extends EntityLivingBase> entityClassToAvoid,
            float avoidDistanceIn, double farSpeedIn, double nearSpeedIn) {
        return new EntityAIAvoidEntity<>((EntityCreature)e, entityClassToAvoid, avoidDistanceIn, farSpeedIn, nearSpeedIn);
    }

    @Override
    public ShaderGroup getShaderGroup(EntityRenderer entityRenderer) {
        return entityRenderer.getShaderGroup();
    }

    @Override
    public void setShaderGroup(EntityRenderer entityRenderer, ShaderGroup shaderGroup) {
        compatibility.setPrivateValue(EntityRenderer.class, entityRenderer, shaderGroup, "shaderGroup", "field_147707_d");
    }

    @Override
    public Entity getTrueDamageSource(DamageSource cause) {
        return cause.getTrueSource();
    }
    
    @Override
    public WorldType getWorldType(World world) {
        return world.getWorldType();
    }
    
    @Override
    public ItemStack getItemStackFromSlot(CompatibleEntityEquipmentSlot compatibleSlot) {
        return clientPlayer().getItemStackFromSlot(compatibleSlot.getSlot());
    }

    @Override
    public boolean isStencilEnabled(Framebuffer framebuffer) {
        return framebuffer.isStencilEnabled();
    }

    @Override
    public void enableStencil(Framebuffer framebuffer) {
        framebuffer.enableStencil();
    }

    @Override
    public void resizeEntityBoundingBox(Entity entity, double x, double y, double z) {
        AxisAlignedBB axisalignedbb = entity.getEntityBoundingBox();
        entity.setEntityBoundingBox(new AxisAlignedBB(axisalignedbb.minX, axisalignedbb.minY, axisalignedbb.minZ, 
                axisalignedbb.minX + x, axisalignedbb.minY + y, axisalignedbb.minZ + z));

    }

    @Override
    public void renderLeftLegwear(ModelBiped model, float scale) {
        if(model instanceof ModelPlayer) {
            ((ModelPlayer)model).bipedLeftLegwear.render(scale);
        }
    }
    
    @Override
    public void renderRightLegwear(ModelBiped model, float scale) {
        if(model instanceof ModelPlayer) {
            ((ModelPlayer)model).bipedRightLegwear.render(scale);
        }
    }
    
    @Override
    public void renderLeftArmwear(ModelBiped model, float scale) {
        if(model instanceof ModelPlayer) {
            ((ModelPlayer)model).bipedLeftArmwear.render(scale);
        }
    }
    
    @Override
    public void renderRightArmwear(ModelBiped model, float scale) {
        if(model instanceof ModelPlayer) {
            ((ModelPlayer)model).bipedRightArmwear.render(scale);
        }
    }
    
    @Override
    public void renderBodywear(ModelBiped model, float scale) {
        if(model instanceof ModelPlayer) {
            ((ModelPlayer)model).bipedBodyWear.render(scale);
        }
    }

    @Override
    public void renderHeadwear(ModelBiped model, float scale) {
        if(model instanceof ModelPlayer) {
            ((ModelPlayer)model).bipedHeadwear.render(scale);
        }
    }
    
private Optional<Field> shadersEnabledFieldOptional;
    
    @Override
    public boolean isShadersModEnabled() {
        boolean result = Loader.isModLoaded("shadersmod");
        if(result) {
            if(shadersEnabledFieldOptional == null) {
                try {
                    Class<?> shadersClass = Loader.instance().getModClassLoader().loadClass("shadersmodcore.client.Shaders");
                    shadersEnabledFieldOptional = Optional.of(shadersClass.getField("isInitialized"));
                } catch (Exception e) {
                    shadersEnabledFieldOptional = Optional.empty();
                }
            }

            if(shadersEnabledFieldOptional != null) {
                try {
                    Field field = shadersEnabledFieldOptional.orElse(null);
                    result = field != null && field.getBoolean(null);
                } catch (Exception e) {}
            }
        }
        
        return result;
    }

    @Override
    public float getFlashIntencityFactor() {
        return 1f;
    }
    
    @Override
    public void setUniqueId(NBTTagCompound tagCompound, String tag, UUID uuid) {
        tagCompound.setLong(tag + "Most", uuid.getMostSignificantBits());
        tagCompound.setLong(tag + "Least", uuid.getLeastSignificantBits());
    }
    
    @Override
    public UUID getUniqueId(NBTTagCompound tagCompound, String tag) {
        return new UUID(tagCompound.getLong(tag + "Most"), tagCompound.getLong(tag + "Least"));
    }

    @Override
    public Entity getEntityByUuid(UUID uuid, World world) {
        if(world instanceof WorldServer) {
            return ((WorldServer)world).getEntityFromUuid(uuid);
        }
        return null;
    }

    @Override
    public TileEntity getTileEntity(World world, CompatibleBlockPos pos) {
        return world.getTileEntity(pos.getBlockPos());
    }

    @Override
    public void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String name) {
        GameRegistry.registerTileEntity(tileEntityClass, name);
    }

    @Override
    public boolean isValidArmor(ItemStack itemstack, CompatibleEntityEquipmentSlot compatibleEntityEquipementSlot, Entity entity) {
        return itemstack.getItem().isValidArmor(itemstack, compatibleEntityEquipementSlot.getSlot(), entity);
    }

    @Override
    public CompatibleEntityEquipmentSlot getArmorType(ItemArmor item) {
        return CompatibleEntityEquipmentSlot.valueOf(item.armorType);
    }

    @Override
    public double getEntityYOffset(Entity entity) {
        return entity.getYOffset() + 0.5;
    }

    @Override
    public NBTTagCompound readTagCompound(PacketBuffer packetBuf) throws IOException {
        return packetBuf.readCompoundTag();
    }

    @Override
    public void writeTagCompound(PacketBuffer packetBuf, NBTTagCompound tagCompound) {
        packetBuf.writeCompoundTag(tagCompound);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void closeScreen() {
        clientPlayer().closeScreen();
    }

    @Override
    public void applyArmor(CompatibleLivingHurtEvent event, EntityLivingBase entityLiving, 
            ItemStack[] itemStacks, DamageSource damageSource, float amount) {
        NonNullList<ItemStack> stackList = NonNullList.create();
        for(int i = 0; i < itemStacks.length; i++) {
            stackList.add(itemStacks[i]);
        }

    
        float amt = ArmorProperties.applyArmor(entityLiving, stackList, damageSource, amount);
        event.setAmount(amt);
        
       
        //event.setAmount(amount);
        //ArmorProperties.applyArmor(entityLiving, stackList, damageSource, amount);
    }

    @Override
    public void dropItem(EntityPlayer player, ItemStack stack, boolean dropAround, boolean traceItem) {
        player.dropItem(stack, dropAround, traceItem);
    }

    @Override
    public void registerGuiHandler(Object mod, GuiHandler guiHandler) {
        NetworkRegistry.INSTANCE.registerGuiHandler(mod, guiHandler);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void renderItem(EntityPlayer player, ItemStack stack) {
        mc.getItemRenderer().renderItem(player, stack, null);
    }

    @Override
    public float getSmokeEffectScaleFactor() {
        return 1f;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void adjustCustomEquippedPosition() {
//        GL11.glScalef(0.4f, 0.4f, 0.4f);
//        GL11.glTranslatef(-0.4f, -1f, -1f);
//        GL11.glRotatef(180f, 0, 0, 1);
//        GL11.glScaled(0.4F, 0.4F, 0.4F);
//        GL11.glTranslatef(-0.4f, -1f, -0.7f);
//        GL11.glRotatef(180F, 0f, 1f, 0f);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    @SideOnly(Side.CLIENT)
    public <T extends TileEntity> void bindTileEntitySpecialRenderer(Class<? extends TileEntity> tileEntityClass,
            CustomTileEntityRenderer customTileEntityRenderer) {
        ClientRegistry.bindTileEntitySpecialRenderer(tileEntityClass, (TileEntitySpecialRenderer)customTileEntityRenderer);
    }

    @Override
    public void markBlockForUpdate(World world, CompatibleBlockPos pos) {
        world.markBlockRangeForRenderUpdate(pos.getBlockPosX(), pos.getBlockPosY(), pos.getBlockPosZ(), 
                pos.getBlockPosX(), pos.getBlockPosY(), pos.getBlockPosZ());
    }

    @Override
    public boolean getGameRulesBooleanValue(GameRules rules, String ruleName) {
        return rules.getBoolean(ruleName);
    }

    @Override
    public ItemStack getEntityItem(EntityItem entityItem) {
        return entityItem.getItem();
    }

    @Override
    public DamageSource mobDamageSource(EntityLivingBase thrower) {
        return DamageSource.causeMobDamage(thrower);
    }

    @Override
    public ItemStack stackForEmptySlot() {
        return new ItemStack(Items.AIR);
    }

	@Override
	public ItemStack findNextBestItem(Collection<? extends Item> compatibleItems, Comparator<ItemStack> comparator,
			EntityPlayer player) {
		
		        int maxSize = 1;
//		        if(maxSize <= 0) {
//		            return null;
//		        }

		        int i = findGreatesItemIndex(compatibleItems, comparator, player);

		        if (i < 0) {
		            return null;
		        } else {
		            ItemStack stackInSlot = player.inventory.getStackInSlot(i).copy();
		            int consumedStackSize = maxSize >= getStackSize(stackInSlot) ? getStackSize(stackInSlot) : maxSize;
		            ItemStack result = stackInSlot.splitStack(consumedStackSize);
		            //if (getStackSize(stackInSlot) <= 0) {
		               // player.inventory.removeStackFromSlot(i);
		            //}
		            return result;
		        }
		    
		
	}
}
