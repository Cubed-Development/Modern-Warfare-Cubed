package com.paneedah.weaponlib.compatibility;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.WorldGeneratorEventHandler;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.mwc.vectors.Vector3D;
import com.paneedah.weaponlib.Explosion;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.ai.EntityCustomMob;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.particle.ParticleBlood;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatBase;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

@Deprecated
public class Compatibility1_12_2 implements Compatibility {

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
    public <T, E> T getPrivateValue(Class<? super E> classToAccess, E instance, String... fieldNames) {
        return ObfuscationReflectionHelper.getPrivateValue(classToAccess, instance, fieldNames);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getButton(MouseEvent event) {
        return event.getButton();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void setNewFov(FOVUpdateEvent event, float fov) {
        event.setNewfov(fov);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public GuiScreen getGui(GuiOpenEvent event) {
        return event.getGui();
    }

    @Override
    public RayTraceResult getObjectMouseOver() {
        return mc.objectMouseOver;
    }

    @Override
    public IBlockState getBlockAtPosition(World world, RayTraceResult position) {
        IBlockState iBlockState = world.getBlockState(new BlockPos(position.getBlockPos().getX(), position.getBlockPos().getY(), position.getBlockPos().getZ()));
        return iBlockState;
    }

    @Override
    public void destroyBlock(World world, RayTraceResult position) {
        world.destroyBlock(new BlockPos(new BlockPos(position.getBlockPos().getX(), position.getBlockPos().getY(), position.getBlockPos().getZ())), true);
    }

    @Override
    public boolean consumeInventoryItem(InventoryPlayer inventoryPlayer, Item item) {
        for (int i = 0; i < inventoryPlayer.getSizeInventory(); i++) {
            ItemStack itemstack = inventoryPlayer.getStackInSlot(i);

            if (itemstack.getItem() == item) {
                itemstack.shrink(1);
                return true;
            }
        }

        return false;
    }

    @Override
    public void consumeInventoryItemFromSlot(EntityPlayer player, int slot) {
        if (player.inventory.getStackInSlot(slot) == null) {
            return;
        }

        player.inventory.getStackInSlot(slot).shrink(1);
        if (player.inventory.mainInventory.get(slot).getCount() <= 0) {
            player.inventory.removeStackFromSlot(slot);
        }
    }

    @Override
    public void addShapedRecipe(ItemStack itemStack, Object... materials) {
        //GameRegistry.addShapedRecipe(itemStack, materials);
        ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, materials).setMirrored(false).setRegistryName(ModReference.id, itemStack.getItem().getTranslationKey() + "_recipe"));
    }

    @Override
    public void addChatMessage(Entity entity, String message) {
        entity.sendMessage(new TextComponentString(message));
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

    private static int findGreatesItemIndex(Collection<? extends Item> compatibleItems, Comparator<ItemStack> comparator, EntityPlayer player) {
        ItemStack maxStack = null;
        int maxItemIndex = -1;
        for (int i = 0; i < player.inventory.mainInventory.size(); ++i) {
            if (player.inventory.getStackInSlot(i) != null && compatibleItems.contains(player.inventory.getStackInSlot(i).getItem()) && (maxStack == null || comparator.compare(player.inventory.getStackInSlot(i), maxStack) > 0)) {
                maxStack = player.inventory.getStackInSlot(i);
                maxItemIndex = i;
            }
        }
        return maxItemIndex;
    }

    @Override
    public ItemStack tryConsumingCompatibleItem(Collection<? extends Item> compatibleItems, Comparator<ItemStack> comparator, EntityPlayer player) {
        int maxSize = 1;

        int i = findGreatesItemIndex(compatibleItems, comparator, player);

        if (i < 0) {
            return null;
        } else {
            ItemStack stackInSlot = player.inventory.getStackInSlot(i);
            int consumedStackSize = maxSize >= stackInSlot.getCount() ? stackInSlot.getCount() : maxSize;
            ItemStack result = stackInSlot.splitStack(consumedStackSize);
            if (stackInSlot.getCount() <= 0) {
                player.inventory.removeStackFromSlot(i);
            }
            return result;
        }
    }

    private static int itemSlotIndex(Item item, Predicate<ItemStack> condition, EntityPlayer player) {
        for (int i = 0; i < player.inventory.mainInventory.size(); ++i) {
            if (player.inventory.getStackInSlot(i) != null && player.inventory.getStackInSlot(i).getItem() == item && condition.test(player.inventory.getStackInSlot(i))) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public ItemStack consumeInventoryItem(Item item, Predicate<ItemStack> condition, EntityPlayer player, int maxSize) {

        if (maxSize <= 0) {
            return null;
        }

        int i = itemSlotIndex(item, condition, player);

        if (i < 0) {
            return null;
        } else {
            ItemStack stackInSlot = player.inventory.getStackInSlot(i);
            int consumedStackSize = maxSize >= stackInSlot.getCount() ? stackInSlot.getCount() : maxSize;
            ItemStack result = stackInSlot.splitStack(consumedStackSize);
            if (stackInSlot.getCount() <= 0) {
                player.inventory.removeStackFromSlot(i);
            }
            return result;
        }
    }

    public ItemStack tryConsumingCompatibleItem(List<? extends Item> compatibleParts, int maxSize, EntityPlayer player, @SuppressWarnings("unchecked") Predicate<ItemStack>... conditions) {
        ItemStack resultStack = null;
        for (Predicate<ItemStack> condition : conditions) {
            for (Item item : compatibleParts) {
                if ((resultStack = consumeInventoryItem(item, condition, player, maxSize)) != null) {
                    break;
                }
            }
            if (resultStack != null) break;
        }

        return resultStack;
    }

    @Override
    public AxisAlignedBB expandEntityBoundingBox(Entity entity1, double f1, double f2, double f3) {
        return entity1.getEntityBoundingBox().expand(f1, f2, f3);
    }

    @Override
    public List<Entity> getEntitiesWithinAABBExcludingEntity(World world, Entity entity, AxisAlignedBB boundingBox) {
        return world.getEntitiesWithinAABBExcludingEntity(entity, boundingBox);
    }

    @Override
    public void spawnParticle(World world, String particleName, double xCoord, double yCoord, double zCoord,
                              double xSpeed, double ySpeed, double zSpeed) {


        EnumParticleTypes particleType = EnumParticleTypes.getByName(particleName);
        if (particleType != null) {
            world.spawnParticle(particleType, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed);
        }
    }

    @Override
    public IBlockState getBlockAtPosition(World world, BlockPos blockPos) {
        return world.getBlockState(blockPos);
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
    public boolean isBlockPenetratableByBullets(IBlockState blockState) {
        return isBlockPenetratableByBullets(blockState.getBlock());
    }

    @Override
    public boolean canCollideCheck(Block block, IBlockState iBlockState, boolean hitIfLiquid) {
        //return false;

        //	return block == Blocks.STAINED_GLASS;
        return block.canCollideCheck(iBlockState, hitIfLiquid);
    }

    @Override
    public float getCompatibleShellCasingForwardOffset() {
        return 0.1F;
    }


    @Override
    public boolean madeFromHardMaterial(IBlockState iBlockState) {
        Material material = iBlockState.getMaterial();

        return material == Material.ROCK || material == Material.IRON || material == Material.ICE || material == Material.WOOD;
    }

    @Override
    public void playSoundAtEntity(Entity entity, SoundEvent sound, float volume, float pitch) {
        if (sound != null) {
            entity.playSound(sound, volume, pitch);
        }
    }

    private net.minecraft.world.Explosion getCompatibleExplosion(Explosion e) {
        return new net.minecraft.world.Explosion(e.getWorld(), e.getExploder(), e.getExplosionX(), e.getExplosionY(), e.getExplosionZ(), e.getExplosionSize(), false, true);
    }

    @Override
    public boolean canDropBlockFromExplosion(IBlockState iBlockState, Explosion e) {
        return iBlockState.getBlock().canDropFromExplosion(getCompatibleExplosion(e));
    }

    @Override
    public void onBlockExploded(World world, IBlockState blockState, BlockPos blockpos, Explosion explosion) {
        blockState.getBlock().onBlockExploded(world, blockpos, getCompatibleExplosion(explosion));
    }

    @Override
    public float getExplosionResistance(World worldObj, IBlockState blockState, BlockPos blockpos, Entity entity, Explosion explosion) {
        return blockState.getBlock().getExplosionResistance(entity);
    }

    @Override
    public float getExplosionResistance(World worldObj, Entity exploder, Explosion explosion, BlockPos blockpos, IBlockState blockState) {
        return exploder.getExplosionResistance(getCompatibleExplosion(explosion), worldObj, blockpos, blockState);
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
    public void setBlockToFire(World world, BlockPos blockpos1) {
        world.setBlockState(blockpos1, Blocks.FIRE.getDefaultState());
    }

    @Override
    public double getBlastDamageReduction(EntityLivingBase entity, double d10) {
        return EnchantmentProtection.getBlastDamageReduction((EntityLivingBase) entity, d10);
    }

    @Override
    public boolean verifyExplosion(World worldObj, Entity exploder, Explosion explosion, BlockPos blockpos, IBlockState blockState, float f) {
        return exploder.canExplosionDestroyBlock(getCompatibleExplosion(explosion), worldObj, blockpos, blockState, f);
        //return exploder.verifyExplosion(getCompatibleExplosion(explosion), worldObj, blockpos, blockState.getBlockState(), f);
    }

    @Override
    public boolean isFullBlock(IBlockState blockState) {
        return blockState.isFullBlock();
    }

    @Override
    public void dropBlockAsItemWithChance(World world, IBlockState blockState, BlockPos blockpos, float f, int i) {
        blockState.getBlock().dropBlockAsItemWithChance(world, blockpos, blockState, f, i);
    }

    @Override
    public IBlockState getBlockBelow(World world, BlockPos blockPos) {
        return world.getBlockState(blockPos.down());
    }

    @Override
    public DamageSource genericDamageSource() {
        return new DamageSource("thrown");
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
    public void registerEgg(ModContext context, Class<? extends Entity> entityClass, String entityName, int primaryEggColor, int secondaryEggColor) {
        EntityRegistry.registerEgg(EntityList.getKey(entityClass), primaryEggColor, secondaryEggColor);
    }

    @Override
    public void setItemStackToSlot(Entity entity, EntityEquipmentSlot compatibleEquipmentSlot, ItemStack itemStack) {
        entity.setItemStackToSlot(compatibleEquipmentSlot, itemStack);
    }

    @Override
    public void setEntityAttribute(EntityLivingBase entity, IAttribute attributes, double value) {
        entity.getEntityAttribute(attributes).setBaseValue(value);
    }

    @Override
    public void addStat(EntityPlayer entityplayer, StatBase statBase) {
        entityplayer.addStat(statBase);
    }

    @Override
    public float getLightBrightness(World world, BlockPos pos) {
        return world.getLightBrightness(pos);
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
    public float getCompatibleAimingRotationYaw(EntityLivingBase thrower) {
        return thrower.rotationYaw;
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
        return new EntityAINearestAttackableTarget<>((EntityCreature) e, targetClass, checkSight);
    }

    @Override
    public EntityAIBase createAiAvoidEntity(EntityLivingBase e, Class<? extends EntityLivingBase> entityClassToAvoid,
                                            float avoidDistanceIn, double farSpeedIn, double nearSpeedIn) {
        return new EntityAIAvoidEntity<>((EntityCreature) e, entityClassToAvoid, avoidDistanceIn, farSpeedIn, nearSpeedIn);
    }

    @Override
    public ShaderGroup getShaderGroup(EntityRenderer entityRenderer) {
        return entityRenderer.getShaderGroup();
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
    public boolean areOptifineShadersOn() {
        try {
            Class<?> shadersClass = Class.forName("net.optifine.shaders.Shaders");
            Field shaderPackLoadedField = shadersClass.getDeclaredField("shaderPackLoaded");
            shaderPackLoadedField.setAccessible(true);

            return (boolean) shaderPackLoadedField.get(null);
        } catch (NoSuchFieldException | ClassNotFoundException e) {
            return false;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public ItemStack findNextBestItem(Collection<? extends Item> compatibleItems, Comparator<ItemStack> comparator, EntityPlayer player) {
        int i = findGreatesItemIndex(compatibleItems, comparator, player);

        if (i < 0)
            return null;

        return player.inventory.getStackInSlot(i).copy().splitStack(Math.min(player.inventory.getStackInSlot(i).copy().getCount(), 1));
    }
}
