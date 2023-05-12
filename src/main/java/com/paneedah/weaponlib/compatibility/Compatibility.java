package com.paneedah.weaponlib.compatibility;

import com.paneedah.mwc.vectors.Vector3D;
import com.paneedah.weaponlib.Explosion;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.ai.EntityCustomMob;
import com.paneedah.weaponlib.inventory.GuiHandler;
import com.paneedah.weaponlib.tile.CustomTileEntityRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderManager;
import net.minecraft.client.shader.ShaderUniform;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.stats.StatBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Pre;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public interface Compatibility {

	public World world(Entity entity);

	public EntityPlayer clientPlayer();

    public void setClientPlayer(EntityPlayer player);

	public IAttribute getMovementSpeedAttribute();

	public NBTTagCompound getTagCompound(ItemStack itemStack);

	public void setTagCompound(ItemStack itemStack, NBTTagCompound tagCompound);

	public ItemStack getItemStack(ItemTossEvent event);

	public EntityPlayer getPlayer(ItemTossEvent event);

	public ItemStack getHeldItemMainHand(EntityLivingBase player);

	public boolean consumeInventoryItem(EntityPlayer player, Item item);

	public int getCurrentInventoryItemIndex(EntityPlayer player);

	public void ensureTagCompound(ItemStack itemStack);

    public void playSound(EntityLivingBase player, SoundEvent sound, float volume, float pitch);

    public void playSoundToNearExcept(EntityLivingBase player, SoundEvent object, float volume, float pitch);

	public boolean isClientSide();

	public EntityPlayer getClientPlayer();

	public FontRenderer getFontRenderer();

	public ScaledResolution getResolution(Pre event);

	public ElementType getEventType(Pre event);

	public ItemStack getHelmet();

    public ItemStack getHelmet(EntityLivingBase entity);

	public Vector3D getLookVec(EntityPlayer player);

	public void registerKeyBinding(KeyBinding key);

	public void registerWithEventBus(Object object);

	public void registerWithFmlEventBus(Object object);

	public void registerSound(SoundEvent sound);

	public void registerItem(Item item, String name);
	
	public void registerItem(Item item, ResourceLocation name);

	public void runInMainClientThread(Runnable runnable);

	public void registerModEntity(Class<? extends Entity> class1, String string, int i, Object mod, int j, int k, boolean b);

	public void registerRenderingRegistry(CompatibleRenderingRegistry rendererRegistry);

	public <T, E> T getPrivateValue(Class<? super E> classToAccess, E instance, String... fieldNames);

	public int getButton(MouseEvent event);

	public EntityPlayer getEntity(FOVUpdateEvent event);

    public EntityLivingBase getEntity(@SuppressWarnings("rawtypes") RenderLivingEvent.Pre event);

	public void setNewFov(FOVUpdateEvent event, float fov);

    public RenderPlayer getRenderer(@SuppressWarnings("rawtypes") RenderLivingEvent.Pre event);

	public GuiScreen getGui(GuiOpenEvent event);

	public void setAimed(RenderPlayer rp, boolean aimed);

	public RayTraceResult getObjectMouseOver();

	public IBlockState getBlockAtPosition(World world, RayTraceResult position);

	public void destroyBlock(World world, RayTraceResult position);

	public boolean addItemToPlayerInventory(EntityPlayer player, final Item item, int slot);

	public boolean consumeInventoryItem(InventoryPlayer inventoryPlayer, Item item);

	public ItemStack itemStackForItem(Item item, Predicate<ItemStack> condition, EntityPlayer player);

	public boolean isGlassBlock(IBlockState block);

	public float getEffectOffsetX();

	public float getEffectOffsetY();

	public float getEffectScaleFactor();

    public void spawnEntity(EntityLivingBase player, Entity entity);

	public void moveParticle(Particle particle, double motionX, double motionY, double motionZ);

	public int getStackSize(ItemStack consumedStack);

	public ItemStack consumeInventoryItem(Item item, Predicate<ItemStack> condition, EntityPlayer player, int maxSize);

	public ItemStack getInventoryItemStack(EntityPlayer player, int inventoryItemIndex);

	public int getInventorySlot(EntityPlayer player, ItemStack itemStack);

	public boolean consumeInventoryItemFromSlot(EntityPlayer player, int nextAttachmentSlot);

	public void addShapedRecipe(ItemStack itemStack, Object... materials);

    public void addShapedOreRecipe(ItemStack itemStack, Object... materials);

	public void disableLightMap();

	public void enableLightMap();

	public void registerBlock(ModContext context, Block block, String name);

	public void registerWorldGenerator(CompatibleWorldGenerator worldGeneratorEventHandler, int i);

	public ArmorMaterial addArmorMaterial(String name, String textureName, int durability, int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip, float toughness);

	public boolean inventoryHasFreeSlots(EntityPlayer player);

    public void addBlockHitEffect(BlockPos pos, double x, double y, double z, EnumFacing enumFacing);

    public String getDisplayName(EntityPlayer player);

    public String getPlayerName(EntityPlayer player);

    public void clickBlock(BlockPos blockPos, EnumFacing sideHit);

    public boolean isAirBlock(World world, BlockPos blockPos);

    public void addChatMessage(Entity entity, String message);

    public Entity getRenderViewEntity();

    public void setRenderViewEntity(Entity entity);

    public void addBreakingParticle(ModContext modContext, double x, double y, double z);

    public float getAspectRatio(ModContext modContext);

    public void setStackSize(ItemStack itemStack, int size);

    public ItemStack tryConsumingCompatibleItem(List<? extends Item> compatibleParts, int maxSize, EntityPlayer player, @SuppressWarnings("unchecked") Predicate<ItemStack> ...conditions);

    public Item findItemByName(String itemName);

    public RayTraceResult rayTraceBlocks(Entity entity, Vector3D vec3, Vector3D vec31);

    public AxisAlignedBB expandEntityBoundingBox(Entity entity, double f, double f2, double f3);

    public AxisAlignedBB getBoundingBox(Entity entity);

    public List<Entity> getEntitiesWithinAABBExcludingEntity(World world, Entity entity, AxisAlignedBB boundingBox);

    public void spawnParticle(World world, String particleName, double d, double e, double f, double motionX, double motionY, double motionZ);

    public IBlockState getBlockAtPosition(World world, BlockPos blockPos);

    public boolean isBlockPenetratableByBullets(Block block);
    
    public boolean isBlockPenetratableByBullets(IBlockState blockState);

    public boolean canCollideCheck(Block block, IBlockState metadata, boolean hitIfLiquid);

    public float getCompatibleShellCasingForwardOffset();

    public boolean madeFromHardMaterial(IBlockState iBlockState);

    public void playSoundAtEntity(Entity entity, SoundEvent explosionSound, float volume, float pitch);

    public double getBlockDensity(World world, Vector3D vec3d, AxisAlignedBB boundingBox);

    public boolean isImmuneToExplosions(Entity entity);

    public boolean isAirBlock(IBlockState blockState);

    public boolean canDropBlockFromExplosion(IBlockState block, Explosion explosion);

    public void onBlockExploded(World worldObj, IBlockState blockState, BlockPos blockpos, Explosion explosion);

    public float getExplosionResistance(World world, IBlockState block, BlockPos blockpos, Entity entity,
            Explosion explosion);

    public float getExplosionResistance(World worldObj, Entity exploder, Explosion explosion, BlockPos blockpos, IBlockState blockState);

    public boolean isSpectator(EntityPlayer entityplayer);

    public boolean isCreative(EntityPlayer entityplayer);

    public void setBlockToFire(World world, BlockPos blockpos1);

    public DamageSource getDamageSource(Explosion explosion);

    public double getBlastDamageReduction(EntityLivingBase entity, double d10);

    public boolean verifyExplosion(World world, Entity exploder, Explosion explosion, BlockPos blockpos, IBlockState blockState, float f);

    public boolean isFullBlock(IBlockState blockState);

    public void dropBlockAsItemWithChance(World world, IBlockState blockState, BlockPos blockpos, float f, int i);

    public IBlockState getBlockBelow(World world, BlockPos blockpos1);

    public void playSound(World world, double posX, double posY, double posZ, SoundEvent explosionSound, float volume, float pitch);

    public boolean isBlockPenetratableByGrenades(Block block);

    public DamageSource genericDamageSource();

    public boolean isCollided(Particle particle);

    public void addSmelting(Block block, ItemStack output, float f);

    public void addSmelting(Item item, ItemStack output, float f);

    public boolean isFlying(EntityPlayer player);

    public String getLocalizedString(String format, Object...args);

    public ShaderUniform getShaderUniform(ShaderManager shaderManager, String uniformName);

    public void setUniform(ShaderUniform uniform, float value);

    public void setUniform(ShaderUniform uniform, float value1, float value2);

    public void setUniform(ShaderUniform uniform, float value1, float value2, float value3);

    public void setUniform(ShaderUniform uniform, float value1, float value2, float value3, float value4);

    public Vector3D getLookVec(EntityLivingBase player);

    public void setEntityAttribute(EntityLivingBase entity, IAttribute attributes, double value);

    public EnumDifficulty getDifficulty(World world);

    public void addStat(EntityPlayer entityplayer, StatBase achievementList);

    public float getLightBrightness(World world, BlockPos pos);

    public void setItemStackToSlot(Entity entity, CompatibleEntityEquipmentSlot compatibleEquipmentSlot, ItemStack itemStack);

    public boolean isStrafingSupported();

    public void strafe(EntityCustomMob entity, float forward, float strafe);
    
    public void addSpawn(Class<? extends EntityLiving> entity, int weightedProb, int min, int max, BiomeDictionary.Type... biomeTypes);

    public void registerEgg(ModContext context, Class<? extends Entity> entityClass, String entityName, int primaryEggColor, int secondaryEggColor);

    public void useShader(EntityRenderer entityRenderer, boolean value);

    public boolean is3dRenderable(Item item);

    public float getCompatibleAimingRotationYaw(EntityLivingBase thrower);
    
    public <T> void setPrivateValue(Class<T> class1, T instance, Object value, String...fieldNames);

    public ItemStack createItemStack(NBTTagCompound tagCompound);

    public EntityAITarget createAINearestAttackableTarget(EntityLivingBase e, Class<? extends EntityLivingBase> targetClass, boolean checkSight);
    
    public EntityAIBase createAiAvoidEntity(EntityLivingBase e, Class<? extends EntityLivingBase> entityClassToAvoid,
            float avoidDistanceIn, double farSpeedIn, double nearSpeedIn);

    public Entity getTrueDamageSource(DamageSource cause);

    public ShaderGroup getShaderGroup(EntityRenderer entityRenderer);

    public void setShaderGroup(EntityRenderer entityRenderer, ShaderGroup shaderGroup);

    public WorldType getWorldType(World world);

    ItemStack findNextBestItem(Collection<? extends Item> compatibleItems, Comparator<ItemStack> comparator,
            EntityPlayer player);
    
    ItemStack tryConsumingCompatibleItem(Collection<? extends Item> compatibleItems, Comparator<ItemStack> comparator,
            EntityPlayer player);

    public ItemStack getItemStackFromSlot(CompatibleEntityEquipmentSlot compatibleSlot);

    public boolean isStencilEnabled(Framebuffer framebuffer);

    public void enableStencil(Framebuffer framebuffer);

    public void resizeEntityBoundingBox(Entity entity, double x, double y, double z);

    public void renderRightLegwear(ModelBiped modelPlayer, float scale);
    
    public void renderLeftLegwear(ModelBiped modelPlayer, float scale);
    
    public void renderRightArmwear(ModelBiped modelPlayer, float scale);
    
    public void renderLeftArmwear(ModelBiped modelPlayer, float scale);
    
    public void renderBodywear(ModelBiped model, float scale);
    
    public void renderHeadwear(ModelBiped model, float scale);

    public boolean isShadersModEnabled();

    public float getFlashIntencityFactor();
    
    public void setUniqueId(NBTTagCompound tagCompound, String tag, UUID uuid);
    
    public UUID getUniqueId(NBTTagCompound tagCompound, String tag);

    public Entity getEntityByUuid(UUID uuid, World world);

    public TileEntity getTileEntity(World world, BlockPos pos);

    public void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String name);

    //public void bindTileEntitySpecialRenderer(Class<? extends TileEntity> tileEntityClass, CustomTileEntityRenderer customTileEntityRenderer);
    
    public <T extends TileEntity> void bindTileEntitySpecialRenderer(Class<? extends TileEntity> tileEntityClass,
            CustomTileEntityRenderer customTileEntityRenderer);

    public boolean isValidArmor(ItemStack itemstack, CompatibleEntityEquipmentSlot compatibleEntityEquipementSlot,
            Entity entity);

    public CompatibleEntityEquipmentSlot getArmorType(ItemArmor item);

    public double getEntityYOffset(Entity entity);

    public NBTTagCompound readTagCompound(PacketBuffer packetBuf) throws IOException;

    public void writeTagCompound(PacketBuffer packetBuf, NBTTagCompound tagCompound) throws IOException;

    public void closeScreen();

    public void applyArmor(LivingHurtEvent event, EntityLivingBase entityLiving, ItemStack[] itemStacks, DamageSource damageSource, float amount);

    public void dropItem(EntityPlayer player, ItemStack stack, boolean dropAround, boolean traceItem);

    public void registerGuiHandler(Object mod, GuiHandler guiHandler);

    public void renderItem(EntityPlayer player, ItemStack stack);

    public float getSmokeEffectScaleFactor();

    public void adjustCustomEquippedPosition();

    public void markBlockForUpdate(World world, BlockPos pos);
    
    public boolean getGameRulesBooleanValue(GameRules rules, String ruleName);

    public ItemStack getEntityItem(EntityItem entityItem);

    public DamageSource mobDamageSource(EntityLivingBase thrower);

    public ItemStack stackForEmptySlot();

    public float getBlockDensity(World world, Vector3D vec, AxisAlignedBB boundingBox, BiPredicate<Block, IBlockState> isCollidable);

    public int removeMatchingInventoryItemStacks(EntityPlayer player, Item item, int quantity);

    public int getMatchingInventoryItemStack(EntityPlayer player, Item item);

	public void addBloodParticle(ModContext modContext, double x, double y, double z, double velX, double velY, double velZ);
}
