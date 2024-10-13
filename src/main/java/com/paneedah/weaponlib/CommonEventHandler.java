package com.paneedah.weaponlib;

import com.paneedah.mwc.capabilities.EquipmentCapability;
import com.paneedah.mwc.equipment.inventory.EquipmentInventory;
import com.paneedah.mwc.items.equipment.carryable.ItemBackpack;
import com.paneedah.mwc.network.messages.*;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.crafting.CraftingFileManager;
import com.paneedah.weaponlib.electronics.ItemHandheld;
import com.paneedah.weaponlib.jim.util.ByteArrayUtils;
import com.paneedah.weaponlib.tracking.LivingEntityTracker;
import lombok.Getter;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
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

import static com.paneedah.mwc.MWC.CHANNEL;
import static com.paneedah.mwc.network.handlers.CraftingClientMessageHandler.RECEIVE_HASH;
import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.ProjectConstants.LOGGER;

/**
 * Handles server events
 *
 * @author Victor Matskiv Sr.
 * @since October 23rd, 2022 by Homer Riva-Cambrin
 * - Re-factored class
 */
// Todo: Cleanup this mess
@Getter
public class CommonEventHandler {

    private final ModContext modContext;

    public CommonEventHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @SubscribeEvent
    public void onTick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            CommonModContext.currentContext = modContext;
        }
    }

    @SubscribeEvent
    protected void onCompatibleLivingUpdateEvent(LivingEvent.LivingUpdateEvent livingUpdateEvent) {
        if (!livingUpdateEvent.getEntity().world.isRemote) {
            final ItemStack itemStack = livingUpdateEvent.getEntityLiving().getHeldItemMainhand();

            NBTTagCompound doseNbt = null;
            if (itemStack.getItem() instanceof ItemHandheld) {
                if (itemStack.getTagCompound() == null) {
                    itemStack.setTagCompound(new NBTTagCompound());
                }

                doseNbt = itemStack.getTagCompound();
            }

            boolean effectiveUpdate = false;
            Collection<? extends Exposure> exposures = CompatibleExposureCapability.getExposures(livingUpdateEvent.getEntity());
            for (Iterator<? extends Exposure> iterator = exposures.iterator(); iterator.hasNext(); ) {
                final Exposure exposure = iterator.next();

                exposure.update(livingUpdateEvent.getEntity());

                if (doseNbt != null && exposure instanceof SpreadableExposure) {
                    doseNbt.setFloat("dose", ((SpreadableExposure) exposure).getLastDose());
                }

                if (!exposure.isEffective(livingUpdateEvent.getEntity().world)) {
                    iterator.remove();
                    effectiveUpdate = true;
                }
            }

            if (effectiveUpdate) {
                CompatibleExposureCapability.updateExposures(livingUpdateEvent.getEntity(), exposures);
            }

            //final long lastExposuresUpdateTimestamp = CompatibleExposureCapability.getLastUpdateTimestamp(livingUpdateEvent.getEntity());
            final long lastSyncTimestamp = CompatibleExposureCapability.getLastSyncTimestamp(livingUpdateEvent.getEntity());
            if (lastSyncTimestamp + 5 < livingUpdateEvent.getEntity().world.getTotalWorldTime() && livingUpdateEvent.getEntity() instanceof EntityPlayerMP /*&& lastExposuresUpdateTimestamp > lastSyncTimestamp */) {
                CHANNEL.sendTo(new ExposureMessage(exposures), (EntityPlayerMP) livingUpdateEvent.getEntity());
                CompatibleExposureCapability.setLastSyncTimestamp(livingUpdateEvent.getEntity(), livingUpdateEvent.getEntity().world.getTotalWorldTime());
            }

            SpreadableExposure exposure = CompatibleExposureCapability.getExposure(livingUpdateEvent.getEntity(), SpreadableExposure.class);
            if (exposure != null) {
                boolean stillEffective = exposure.isEffective(livingUpdateEvent.getEntity().world);
                exposure.update(livingUpdateEvent.getEntity());
                if (livingUpdateEvent.getEntity() instanceof EntityPlayerMP &&
                        System.currentTimeMillis() - exposure.getLastSyncTimestamp() > 500) {
                    CHANNEL.sendTo(
                            new SpreadableExposureMessage(stillEffective ? exposure : null),
                            (EntityPlayerMP) livingUpdateEvent.getEntity());
                    exposure.setLastSyncTimestamp(System.currentTimeMillis());
                }
                if (!stillEffective) {
                    CompatibleExposureCapability.removeExposure(livingUpdateEvent.getEntity(), SpreadableExposure.class);
                }

                ItemStack itemStack1 = livingUpdateEvent.getEntityLiving().getHeldItemMainhand();
                if (itemStack1.getItem() instanceof ItemHandheld) {
                    if (itemStack1.getTagCompound() == null) {
                        itemStack1.setTagCompound(new NBTTagCompound());
                    }
                    NBTTagCompound nbt = itemStack1.getTagCompound();
                    nbt.setFloat("dose", exposure.getLastDose());
                }
            }
        }
    }

    @SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent event) {
        final Entity entity = event.getEntity();

        if (entity instanceof Contextual) {
            ((Contextual) entity).setContext(modContext);
        }

        if (entity instanceof EntityPlayerMP && !event.getWorld().isRemote) {
            LOGGER.debug("Player {} joined the world", event.getEntity());

            final EntityPlayer player = (EntityPlayer) entity;
            final LivingEntityTracker tracker = LivingEntityTracker.getTracker(player);

            if (tracker != null) {
                CHANNEL.sendTo(new LivingEntityTrackerMessage(tracker, null), (EntityPlayerMP) entity);
            }

            CHANNEL.sendToAll(new EntityInventorySyncMessage(entity, false, EquipmentCapability.getInventory(player)));
        }
    }

    @SubscribeEvent
    protected void onPlayerStartedTracking(PlayerEvent.StartTracking event) {
        if (event.getTarget() instanceof EntityPlayer && !event.getTarget().world.isRemote) {
            CHANNEL.sendTo(new EntityInventorySyncMessage(event.getTarget(), false, EquipmentCapability.getInventory((EntityLivingBase) event.getTarget())), (EntityPlayerMP) event.getEntityPlayer());
            return;
        }

        if (event.getTarget() instanceof EntityProjectile || event.getTarget() instanceof EntityBounceable) {
            return;
        }

        LivingEntityTracker tracker = LivingEntityTracker.getTracker((EntityPlayer) event.getEntity());
        if (tracker != null && tracker.updateTrackableEntity(event.getTarget())) {
            LOGGER.debug("Player {} started tracking {} with uuid {}", event.getEntityPlayer(), event.getTarget(), event.getTarget().getUniqueID());
            CHANNEL.sendTo(new LivingEntityTrackerMessage(tracker, null), (EntityPlayerMP) event.getEntityPlayer());
        }
    }

    @SubscribeEvent
    protected void onCompatibleLivingDeathEvent(LivingDeathEvent event) {
        final EntityLivingBase entity = event.getEntityLiving();
        if (entity instanceof EntityPlayer && !entity.world.isRemote && !entity.world.getGameRules().getBoolean("keepInventory")) {
            final EquipmentInventory inventory = EquipmentCapability.getInventory(entity);
            for (int slotIndex = 0; slotIndex < inventory.getSizeInventory(); slotIndex++) {
                final ItemStack stackInSlot = inventory.getStackInSlot(slotIndex);
                if (stackInSlot == null) {
                    continue;
                }
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

        if (originalInventory == null) {
            return;
        }

        EquipmentCapability.setInventory(event.getEntityPlayer(), originalInventory);
        originalInventory.setContext(modContext);
        originalInventory.setOwner(event.getEntityPlayer());
        //CHANNEL.sendToAll(new EntityInventorySyncMessage(playerCloneEvent.getPlayer(), originalInventory, false));
    }

    @SubscribeEvent
    protected void onPlayerRespawnEvent(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent event) {
        CHANNEL.sendToAll(new EntityInventorySyncMessage(event.player, false, EquipmentCapability.getInventory(event.player)));
    }

    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerLoggedInEvent event) {
        // Todo: Can we cache balance packs similar to crafting files? Maybe they could use the same system? This could crash a server if a large amount of players join.
        CHANNEL.sendTo(new BalancePackClientMessage(BalancePackManager.getActiveBalancePack()), (EntityPlayerMP) event.player);
    }

    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof EntityPlayer) {
            event.addCapability(new ResourceLocation(ID, "PLAYER_ENTITY_TRACKER"), new CompatiblePlayerEntityTrackerProvider());
            event.addCapability(new ResourceLocation(ID, "PLAYER_CUSTOM_INVENTORY"), new EquipmentCapability());
        }

        event.addCapability(new ResourceLocation(ID, "EXPOSURE"), new CompatibleExposureCapability());
    }

    /**
     * Sets player size by modifying bounding box
     *
     * @param entityPlayer - player that we want to change hitbox of
     * @param width - new width of hitbox
     * @param height - new height of hitbox
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
    public final void onEntityJoinedEvent(EntityJoinWorldEvent event) {
        // We are only interested in the player. We also only want to deal with this if the server and the client
        // are operating off of DIFFERENT file systems (hence the dedicated server check!).
        if (!(event.getEntity() instanceof EntityPlayer) || FMLCommonHandler.instance().getMinecraftServerInstance() == null || !FMLCommonHandler.instance().getMinecraftServerInstance().isDedicatedServer()) {
            return;
        }

        final EntityPlayer player = (EntityPlayer) event.getEntity();

        // Create a hash stream and make sure it's not null (not errored out)
        final ByteArrayOutputStream baos = ByteArrayUtils.createByteArrayOutputStreamFromBytes(CraftingFileManager.getInstance().getCurrentFileHash());
        if (baos == null) {
            return;
        }

        // Send the player the hash
        CHANNEL.sendTo(new CraftingClientMessage(RECEIVE_HASH, baos), (EntityPlayerMP) player);
    }
}
