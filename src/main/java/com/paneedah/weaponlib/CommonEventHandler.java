package com.paneedah.weaponlib;

import com.paneedah.mwc.capabilities.EquipmentCapability;
import com.paneedah.mwc.equipment.inventory.EquipmentInventory;
import com.paneedah.mwc.items.equipment.carryable.ItemBackpack;
import com.paneedah.mwc.network.messages.CraftingClientMessage;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.paneedah.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.crafting.CraftingFileManager;
import com.paneedah.weaponlib.electronics.ItemHandheld;
import com.paneedah.weaponlib.inventory.EntityInventorySyncMessage;
import com.paneedah.weaponlib.jim.util.ByteArrayUtils;
import com.paneedah.weaponlib.jim.util.HitUtil;
import com.paneedah.weaponlib.network.packets.BalancePackClient;
import com.paneedah.weaponlib.network.packets.HeadshotSFXPacket;
import com.paneedah.weaponlib.tracking.PlayerEntityTracker;
import com.paneedah.weaponlib.tracking.SyncPlayerEntityTrackerMessage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import static com.paneedah.mwc.utils.ModReference.ID;
import static com.paneedah.mwc.utils.ModReference.LOG;

/**
 * Handles server events
 *
 * @author Victor Matskiv Sr.
 * @since October 23rd, 2022 by Homer Riva-Cambrin
 * - Re-factored class
 */
// Todo: Cleanup this mess
public class CommonEventHandler {

    private final ModContext modContext;

    public CommonEventHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    public ModContext getModContext() {
        return modContext;
    }

    @SubscribeEvent
    public void onTick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.START)
            CommonModContext.currentContext = modContext;
    }

    @SubscribeEvent
    protected void onCompatibleLivingUpdateEvent(LivingEvent.LivingUpdateEvent livingUpdateEvent) {
        //if(!compatibility.world(livingUpdateEvent.getEntity()).isRemote && livingUpdateEvent.getEntityLiving() instanceof EntityPlayer) {
        //	//modContext.getChannel().sendTo(new HeadshotSFXPacket(), (EntityPlayerMP) livingUpdateEvent.getEntityLiving());
        //}

        if (!livingUpdateEvent.getEntity().world.isRemote) {
            final ItemStack itemStack = livingUpdateEvent.getEntityLiving().getHeldItemMainhand();

            NBTTagCompound doseNbt = null;
            if (itemStack != null && itemStack.getItem() instanceof ItemHandheld) {
                if (itemStack.getTagCompound() == null)
                    itemStack.setTagCompound(new NBTTagCompound());

                doseNbt = itemStack.getTagCompound();
            }

            boolean effectiveUpdate = false;
            Collection<? extends Exposure> exposures = CompatibleExposureCapability.getExposures(livingUpdateEvent.getEntity());
            for (Iterator<? extends Exposure> iterator = exposures.iterator(); iterator.hasNext(); ) {
                final Exposure exposure = iterator.next();

                exposure.update(livingUpdateEvent.getEntity());

                if (doseNbt != null && exposure instanceof SpreadableExposure)
                    doseNbt.setFloat("dose", ((SpreadableExposure) exposure).getLastDose());

                if (!exposure.isEffective(livingUpdateEvent.getEntity().world)) {
                    iterator.remove();
                    effectiveUpdate = true;
                }
            }

            if (effectiveUpdate)
                CompatibleExposureCapability.updateExposures(livingUpdateEvent.getEntity(), exposures);

            //long lastExposuresUpdateTimestamp = CompatibleExposureCapability.getLastUpdateTimestamp(livingUpdateEvent.getEntity());
            final long lastSyncTimestamp = CompatibleExposureCapability.getLastSyncTimestamp(livingUpdateEvent.getEntity());
            if (lastSyncTimestamp + 5 < livingUpdateEvent.getEntity().world.getTotalWorldTime() && livingUpdateEvent.getEntity() instanceof EntityPlayerMP /*&& lastExposuresUpdateTimestamp > lastSyncTimestamp */) {
                modContext.getChannel().sendTo(new ExposureMessage(exposures), (EntityPlayerMP) livingUpdateEvent.getEntity());
                CompatibleExposureCapability.setLastSyncTimestamp(livingUpdateEvent.getEntity(), livingUpdateEvent.getEntity().world.getTotalWorldTime());
            }
            
            /*
            SpreadableExposure exposure = CompatibleExposureCapability.getExposure(livingUpdateEvent.getEntity(), SpreadableExposure.class);
            if(exposure != null) {
                boolean stillEffective = exposure.isEffective(compatibility.world(livingUpdateEvent.getEntity()));
                exposure.update(livingUpdateEvent.getEntity());
                if(livingUpdateEvent.getEntity() instanceof EntityPlayerMP &&
                        System.currentTimeMillis() - exposure.getLastSyncTimestamp() > 500) {
                    modContext.getChannel().sendTo(
                            new SpreadableExposureMessage(stillEffective ? exposure : null),
                            (EntityPlayerMP) livingUpdateEvent.getEntity());
                    exposure.setLastSyncTimestamp(System.currentTimeMillis());
                }
                if(!stillEffective) {
                    CompatibleExposureCapability.removeExposure(livingUpdateEvent.getEntity(), SpreadableExposure.class);
                }

                ItemStack itemStack = compatibility.getHeldItemMainHand(livingUpdateEvent.getEntityLiving());
                if(itemStack != null && itemStack.getItem() instanceof ItemHandheld) {
                    if (itemStack.getTagCompound() == null)
                        itemStack.setTagCompound(new NBTTagCompound());
                    NBTTagCompound nbt = itemStack.getTagCompound();
                    nbt.setFloat("dose", exposure.getLastDose());
                }
            }
            */
        }
    }

    @SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent event) {
        final Entity entity = event.getEntity();

        if (entity instanceof Contextual)
            ((Contextual)entity).setContext(modContext);

        if (entity instanceof EntityPlayerMP && !event.getWorld().isRemote) {
            LOG.debug("Player {} joined the world", event.getEntity());

            final EntityPlayer player = (EntityPlayer)entity;
            final PlayerEntityTracker tracker = PlayerEntityTracker.getTracker(player);

            if (tracker != null)
                modContext.getChannel().sendTo(new SyncPlayerEntityTrackerMessage(tracker), (EntityPlayerMP)entity);

            modContext.getChannel().sendTo(new EntityControlMessage(player, CompatibleExtraEntityFlags.getFlags(player)), (EntityPlayerMP)entity);
            modContext.getChannel().sendToAll(new EntityInventorySyncMessage(entity, EquipmentCapability.getInventory(player), false));
        }
    }

    @SubscribeEvent
    protected void onPlayerStartedTracking(PlayerEvent.StartTracking event) {
        if (event.getTarget() instanceof EntityPlayer && !event.getTarget().world.isRemote) {
            modContext.getChannel().sendTo(new EntityInventorySyncMessage(event.getTarget(), EquipmentCapability.getInventory((EntityLivingBase) event.getTarget()), false), (EntityPlayerMP) event.getEntityPlayer());
            return;
        }

        if (event.getTarget() instanceof EntityProjectile || event.getTarget() instanceof EntityBounceable)
            return;

        PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityPlayer) event.getEntity());
        if (tracker != null && tracker.updateTrackableEntity(event.getTarget())) {
            LOG.debug("Player {} started tracking {} with uuid {}", event.getEntityPlayer(), event.getTarget(), event.getTarget().getUniqueID());
            modContext.getChannel().sendTo(new SyncPlayerEntityTrackerMessage(tracker), (EntityPlayerMP) event.getEntityPlayer());

            final EntityPlayer player = (EntityPlayer) event.getEntity();

            modContext.getChannel().sendTo(new EntityControlMessage(player, CompatibleExtraEntityFlags.getFlags(player)), (EntityPlayerMP) event.getEntity());
        }
    }

    /*@SubscribeEvent
    protected void onPlayerStoppedTracking(PlayerEvent.StopTracking playerStopTrackingEvent) {
        if(playerStopTrackingEvent.getTarget() instanceof EntityProjectile || playerStopTrackingEvent.getTarget() instanceof EntityBounceable) {
            return;
        }
        PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityPlayer) playerStopTrackingEvent.getEntity());
        if (tracker != null && tracker.updateTrackableEntity(playerStopTrackingEvent.getTarget())) {
            log.debug("Player {} stopped tracking {}", playerStopTrackingEvent.getEntityPlayer(), playerStopTrackingEvent.getTarget());
            modContext.getChannel().sendTo(new SyncPlayerEntityTrackerMessage(tracker),
                    (EntityPlayerMP)playerStopTrackingEvent.getEntityPlayer());

            EntityPlayer player = (EntityPlayer) playerStopTrackingEvent.getEntity();
            modContext.getChannel().sendTo(
                    new EntityControlMessage(player, CompatibleExtraEntityFlags.getFlags(player)),
                    (EntityPlayerMP)playerStopTrackingEvent.getEntity());
        }
    }*/

    @SubscribeEvent
    protected void onCompatibleLivingDeathEvent(LivingDeathEvent event) {
        final EntityLivingBase entity = event.getEntityLiving();
        if (entity instanceof EntityPlayer && !entity.world.isRemote && !entity.world.getGameRules().getBoolean("keepInventory")) {
            final EquipmentInventory inventory = EquipmentCapability.getInventory(entity);
            for (int slotIndex = 0; slotIndex < inventory.getSizeInventory(); slotIndex++) {
                final ItemStack stackInSlot = inventory.getStackInSlot(slotIndex);
                if (stackInSlot == null) continue;
                ((EntityPlayer) entity).dropItem(stackInSlot, true, false);
                inventory.setInventorySlotContents(slotIndex, null);
            }
        }
    }

    @SubscribeEvent
    // Todo: Fix this for the new equipment inventory
    protected void onLivingHurtEvent(LivingHurtEvent event) {
        final EntityLivingBase entityLiving = event.getEntityLiving();
        final EquipmentInventory equipmentInventory = EquipmentCapability.getInventory(entityLiving);

        if (equipmentInventory != null && equipmentInventory.getStackInSlot(1).getItem() != Items.AIR) {
            final NonNullList<ItemStack> stackList = NonNullList.create();
            final ItemStack[] itemStacks = new ItemStack[]{equipmentInventory.getStackInSlot(1)};
            stackList.addAll(Arrays.asList(itemStacks));
            event.setAmount((float) (event.getAmount() * (1 - ((ItemVest) equipmentInventory.getStackInSlot(1).getItem()).getDamageBlocked())));
        }

        final DamageSource source = event.getSource();

        if (source.getImmediateSource() instanceof EntityProjectile) {
            final RayTraceResult hit = HitUtil.traceProjectilehit(source.getImmediateSource(), entityLiving);
            if (hit != null && hit.hitVec.distanceTo(entityLiving.getPositionEyes(1.0f)) < 0.6f) {
                event.setAmount((float) (event.getAmount() * BalancePackManager.getHeadshotMultiplier()));
                if (source.getTrueSource() instanceof EntityPlayer)
                    modContext.getChannel().sendTo(new HeadshotSFXPacket(), (EntityPlayerMP) source.getTrueSource());
            }
        }
    }

    @SubscribeEvent
    public void playerDroppedItem(PlayerDropsEvent event) {
        // TODO: check if this item is item storage and prevent dropping if necessary, add it back to player inventory
        event.getDrops().removeIf(entityItem -> entityItem.getItem().getItem() instanceof ItemBackpack);

        /* Panda: Original code, replaced this with the code above. Reverse this if it doesn't work.
        for (Iterator<EntityItem> it = playerDropsEvent.getDrops().iterator(); it.hasNext(); ) {
            EntityItem entityItem = it.next();
            // TODO: check if this item is item storage and prevent dropping if necessary, add it back to player inventory
            if (entityItem.getItem().getItem() instanceof ItemBackpack) {
                it.remove();
            }
        }*/
    }

    @SubscribeEvent
    protected void onPlayerCloneEvent(PlayerEvent.Clone event) {
        final EquipmentInventory originalInventory = EquipmentCapability.getInventory(event.getOriginal());

        if (originalInventory == null)
            return;

        EquipmentCapability.setInventory(event.getEntityPlayer(), originalInventory);
        originalInventory.setContext(modContext);
        originalInventory.setOwner(event.getEntityPlayer());
        //modContext.getChannel().sendToAll(new EntityInventorySyncMessage(playerCloneEvent.getPlayer(), originalInventory, false));
    }

    @SubscribeEvent
    protected void onPlayerRespawnEvent(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent event) {
        modContext.getChannel().sendToAll(new EntityInventorySyncMessage(event.player, EquipmentCapability.getInventory(event.player), false));
    }

    /*@SubscribeEvent
    protected void onCompatiblePlayerInteractInteractEvent(PlayerInteractEvent.EntityInteract event) {
    }*/

    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerLoggedInEvent event) {
        // Todo: Can we cache balance packs similar to crafting files? Maybe they could use the same system? This could crash a server if a large amount of players join.
        getModContext().getChannel().sendTo(new BalancePackClient(BalancePackManager.getActiveBalancePack()), (EntityPlayerMP) event.player);
    }

    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof EntityPlayer) {
            event.addCapability(new ResourceLocation(ID, "PLAYER_ENTITY_TRACKER"), new CompatiblePlayerEntityTrackerProvider());
            event.addCapability(new ResourceLocation(ID, "PLAYER_ENTITY_FLAGS"), new CompatibleExtraEntityFlags());
            event.addCapability(new ResourceLocation(ID, "PLAYER_CUSTOM_INVENTORY"), new EquipmentCapability());
        }

        event.addCapability(new ResourceLocation(ID, "EXPOSURE"), new CompatibleExposureCapability());
    }

    /**
     * Sets player size by modifying bounding box
     *
     * @param entityPlayer - player that we want to change hitbox of
     * @param width        - new width of hitbox
     * @param height       - new height of hitbox
     */
    protected void setSize(EntityPlayer entityPlayer, float width, float height) {
        if (width != entityPlayer.width || height != entityPlayer.height) {
            entityPlayer.width = width;
            entityPlayer.height = height;
            AxisAlignedBB axisalignedbb = entityPlayer.getEntityBoundingBox();
            entityPlayer.setEntityBoundingBox(new AxisAlignedBB(axisalignedbb.minX, axisalignedbb.minY, axisalignedbb.minZ, axisalignedbb.minX + (double) entityPlayer.width, axisalignedbb.minY + (double) entityPlayer.height, axisalignedbb.minZ + (double) entityPlayer.width));
        }
    }

    @SubscribeEvent
    public final void onPlayerTickEvent(TickEvent.PlayerTickEvent event) {
        // We check the phase to see if it is at "Phase.END" as we
        // do not want this running twice.
        if (event.phase != TickEvent.Phase.END)
            return;

        int updatedFlags = CompatibleExtraEntityFlags.getFlags(event.player);
        if ((updatedFlags & CompatibleExtraEntityFlags.PRONING) != 0) {
            // If the player is proning, change their hitbox. TO-DO: Is there a more
            // efficient way to do this?
            setSize(event.player, 0.6f, 0.6f); //player.width, player.width);
        }
    }

    @SubscribeEvent
    public final void onEntityJoinedEvent(EntityJoinWorldEvent event) {
        // We are only interested in the player. We also only want to deal with this if the server and the client
        // are operating off of DIFFERENT file systems (hence the dedicated server check!).
        if (!(event.getEntity() instanceof EntityPlayer) || FMLCommonHandler.instance().getMinecraftServerInstance() == null || !FMLCommonHandler.instance().getMinecraftServerInstance().isDedicatedServer())
            return;

        final EntityPlayer player = (EntityPlayer) event.getEntity();

        // Create a hash stream and make sure it's not null (not errored out)
        final ByteArrayOutputStream baos = ByteArrayUtils.createByteArrayOutputStreamFromBytes(CraftingFileManager.getInstance().getCurrentFileHash());
        if (baos == null) return;

        // Send the player the hash
        getModContext().getChannel().sendTo(new CraftingClientMessage(0, baos), (EntityPlayerMP) player);
    }
}
