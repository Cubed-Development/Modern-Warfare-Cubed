package com.paneedah.weaponlib;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.paneedah.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.crafting.CraftingFileManager;
import com.paneedah.weaponlib.electronics.ItemHandheld;
import com.paneedah.weaponlib.inventory.CustomPlayerInventory;
import com.paneedah.weaponlib.inventory.EntityInventorySyncMessage;
import com.paneedah.weaponlib.jim.util.ByteArrayUtils;
import com.paneedah.weaponlib.jim.util.HitUtil;
import com.paneedah.weaponlib.network.packets.BalancePackClient;
import com.paneedah.weaponlib.network.packets.CraftingClientPacket;
import com.paneedah.weaponlib.network.packets.HeadshotSFXPacket;
import com.paneedah.weaponlib.tracking.PlayerEntityTracker;
import com.paneedah.weaponlib.tracking.SyncPlayerEntityTrackerMessage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.Iterator;

import static com.paneedah.mwc.utils.ModReference.LOG;


/**
 * Handles server events
 *
 * @author Victor Matskiv Sr.
 * @since October 23rd, 2022 by Homer Riva-Cambrin
 * - Re-factored class
 * - Added TO-DOs for necessary sections
 */
// Todo: Rename to common event handler, since it's invoked on both sides
// Todo: Cleanup this mess
public class ServerEventHandler {

    private ModContext modContext;

    public ServerEventHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    public ModContext getModContext() {
        return modContext;
    }

    @SubscribeEvent
    public void onTick(TickEvent.ServerTickEvent serverTickEvent) {
        if(serverTickEvent.phase == TickEvent.Phase.START)
            CommonModContext.currentContext = modContext;
    }

    @SubscribeEvent
    protected void onCompatibleLivingUpdateEvent(LivingEvent.LivingUpdateEvent livingUpdateEvent) {
    	//if(!compatibility.world(livingUpdateEvent.getEntity()).isRemote && livingUpdateEvent.getEntityLiving() instanceof EntityPlayer) {
    	//	//modContext.getChannel().sendTo(new HeadshotSFXPacket(), (EntityPlayerMP) livingUpdateEvent.getEntityLiving());
    	//}

        if(!livingUpdateEvent.getEntity().world.isRemote) {
            NBTTagCompound doseNbt = null;
            ItemStack itemStack = livingUpdateEvent.getEntityLiving().getHeldItemMainhand();
            if(itemStack != null && itemStack.getItem() instanceof ItemHandheld) {
                if (itemStack.getTagCompound() == null)
                    itemStack.setTagCompound(new NBTTagCompound());
                doseNbt = itemStack.getTagCompound();
            }
            
            boolean effectiveUpdate = false;
            Collection<? extends Exposure> exposures = CompatibleExposureCapability.getExposures(livingUpdateEvent.getEntity());
            for(Iterator<? extends Exposure> iterator = exposures.iterator(); iterator.hasNext();) {
                Exposure exposure = iterator.next();
                exposure.update(livingUpdateEvent.getEntity());
                if(doseNbt != null && exposure instanceof SpreadableExposure) {
                    doseNbt.setFloat("dose", ((SpreadableExposure) exposure).getLastDose());
                }
                if(!exposure.isEffective(livingUpdateEvent.getEntity().world)) {
                    iterator.remove();
                    effectiveUpdate = true;
                }
            }
            if(effectiveUpdate) {
                CompatibleExposureCapability.updateExposures(livingUpdateEvent.getEntity(), exposures);
            }
            
            long lastExposuresUpdateTimestamp = CompatibleExposureCapability.getLastUpdateTimestamp(livingUpdateEvent.getEntity());
            long lastSyncTimestamp = CompatibleExposureCapability.getLastSyncTimestamp(livingUpdateEvent.getEntity());
            if(lastSyncTimestamp + 5 < livingUpdateEvent.getEntity().world.getTotalWorldTime()
                    /*&& lastExposuresUpdateTimestamp > lastSyncTimestamp */ && livingUpdateEvent.getEntity() instanceof EntityPlayerMP) {
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
    public void onEntityJoinWorld(EntityJoinWorldEvent entityJoinWorldEvent) {
        if(entityJoinWorldEvent.getEntity() instanceof Contextual)
            ((Contextual)entityJoinWorldEvent.getEntity()).setContext(modContext);

        if(entityJoinWorldEvent.getEntity() instanceof EntityPlayerMP && !entityJoinWorldEvent.getWorld().isRemote) {
            LOG.debug("Player {} joined the world", entityJoinWorldEvent.getEntity());
            PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityPlayer) entityJoinWorldEvent.getEntity());

            if(tracker != null)
                modContext.getChannel().sendTo(new SyncPlayerEntityTrackerMessage(tracker), (EntityPlayerMP)entityJoinWorldEvent.getEntity());

            EntityPlayer player = (EntityPlayer) entityJoinWorldEvent.getEntity();
            modContext.getChannel().sendTo(new EntityControlMessage(player, CompatibleExtraEntityFlags.getFlags(player)), (EntityPlayerMP)entityJoinWorldEvent.getEntity());
            modContext.getChannel().sendToAll(new EntityInventorySyncMessage(entityJoinWorldEvent.getEntity(), CompatibleCustomPlayerInventoryCapability.getInventory(player), false));
        }
    }

    @SubscribeEvent
    protected void onPlayerStartedTracking(PlayerEvent.StartTracking e) {
        if(e.getTarget() instanceof EntityPlayer && !e.getTarget().world.isRemote) {
            modContext.getChannel().sendTo(
                    new EntityInventorySyncMessage(e.getTarget(), 
                            CompatibleCustomPlayerInventoryCapability.getInventory((EntityLivingBase) e.getTarget()), false), 
                            (EntityPlayerMP) e.getEntityPlayer());
            return;
        }
        if(e.getTarget() instanceof EntityProjectile || e.getTarget() instanceof EntityBounceable) {
            return;
        }
        PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityPlayer) e.getEntity());
        if (tracker != null && tracker.updateTrackableEntity(e.getTarget())) {
            LOG.debug("Player {} started tracking {} with uuid {}", e.getEntityPlayer(), e.getTarget(), e.getTarget().getUniqueID());
            modContext.getChannel().sendTo(new SyncPlayerEntityTrackerMessage(tracker),
                    (EntityPlayerMP)e.getEntityPlayer());
            
            EntityPlayer player = (EntityPlayer) e.getEntity();
            modContext.getChannel().sendTo(
                    new EntityControlMessage(player, CompatibleExtraEntityFlags.getFlags(player)),
                    (EntityPlayerMP)e.getEntity());
        }
    }

    @SubscribeEvent
    protected void onPlayerStoppedTracking(PlayerEvent.StopTracking playerStopTrackingEvent) {
        /*if(playerStopTrackingEvent.getTarget() instanceof EntityProjectile || playerStopTrackingEvent.getTarget() instanceof EntityBounceable) {
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
        }*/
    }

    @SubscribeEvent
    protected void onCompatibleLivingDeathEvent(LivingDeathEvent livingDeathEvent) {
        final EntityLivingBase entity = livingDeathEvent.getEntityLiving();

        if(entity instanceof EntityPlayer && !entity.world.isRemote) {

            if(!entity.world.getGameRules().getBoolean("keepInventory")) {
                CustomPlayerInventory inventory = CompatibleCustomPlayerInventoryCapability.getInventory(entity);
                
                for(int slotIndex = 0; slotIndex < inventory.getSizeInventory(); slotIndex++) {
                    ItemStack stackInSlot = inventory.getStackInSlot(slotIndex);
                    if(stackInSlot != null) {
                        EntityPlayer player = (EntityPlayer) entity;
                        player.dropItem(stackInSlot, true, false);
                        inventory.setInventorySlotContents(slotIndex, null);
                    }
                }
            }
        }
    }

    @SubscribeEvent
    protected void onLivingHurtEvent(LivingHurtEvent livingHurtEvent) {
        CustomPlayerInventory inventory = CompatibleCustomPlayerInventoryCapability
                .getInventory(livingHurtEvent.getEntityLiving());
        if (inventory != null && inventory.getStackInSlot(1).getItem() != Items.AIR) {
            NonNullList<ItemStack> stackList = NonNullList.create();

            ItemStack[] itemStacks = new ItemStack[]{inventory.getStackInSlot(1)};

            for (int i = 0; i < itemStacks.length; i++) {
                stackList.add(itemStacks[i]);
            }

            Item DamageBlocked = inventory.getStackInSlot(1).getItem();
            livingHurtEvent.setAmount((float) (livingHurtEvent.getAmount() * (1 - ((ItemVest) DamageBlocked).getDamageBlocked())));
        }
        
        if(livingHurtEvent.getSource().getImmediateSource() instanceof EntityProjectile) {
        	RayTraceResult hit = HitUtil.traceProjectilehit(livingHurtEvent.getSource().getImmediateSource(), livingHurtEvent.getEntityLiving());
        	if(hit != null) {
        		Vec3d eyes = livingHurtEvent.getEntityLiving().getPositionEyes(1.0f);
            	if(hit.hitVec.distanceTo(eyes) < 0.6f) {

            		livingHurtEvent.setAmount((float) (livingHurtEvent.getAmount()*BalancePackManager.getHeadshotMultiplier()));
            		
            		if(livingHurtEvent.getSource().getTrueSource() instanceof EntityPlayer) {
            			modContext.getChannel().sendTo(new HeadshotSFXPacket(), (EntityPlayerMP) livingHurtEvent.getSource().getTrueSource());
            		}
                	
            		
            	}
        	}
        }
    }

    @SubscribeEvent
    public void playerDroppedItem(PlayerDropsEvent playerDropsEvent) {
        for(Iterator<EntityItem> it = playerDropsEvent.getDrops().iterator(); it.hasNext();) {
            EntityItem entityItem = it.next();
            // TODO: check if this item is item storage and prevent dropping if necessary, add it back to player inventory
            if(entityItem.getItem().getItem() instanceof ItemStorage) {
                it.remove();
            }
        }
    }

    @SubscribeEvent
    protected void onPlayerCloneEvent(PlayerEvent.Clone playerCloneEvent) {
        CustomPlayerInventory originalInventory = CompatibleCustomPlayerInventoryCapability.getInventory(playerCloneEvent.getOriginal());

        if(originalInventory != null) {
            CompatibleCustomPlayerInventoryCapability.setInventory(playerCloneEvent.getEntityPlayer(), originalInventory);
            originalInventory.setContext(modContext);
            originalInventory.setOwner(playerCloneEvent.getEntityPlayer());
            //modContext.getChannel().sendToAll(new EntityInventorySyncMessage(playerCloneEvent.getPlayer(), originalInventory, false));
        }
    }

    @SubscribeEvent
    protected void onPlayerRespawnEvent(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent playerRespawnEvent) {
        modContext.getChannel().sendToAll(new EntityInventorySyncMessage(playerRespawnEvent.player, CompatibleCustomPlayerInventoryCapability.getInventory(playerRespawnEvent.player), false));
    }

    @SubscribeEvent
    protected void onCompatiblePlayerInteractInteractEvent(PlayerInteractEvent.EntityInteract playerInteractEvent) {
    }

    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerLoggedInEvent event) {
        // Todo: Can we cache balance packs similar to crafting files? Maybe they could use the same system? This could crash a server if a large amount of players join.
        getModContext().getChannel().sendTo(new BalancePackClient(BalancePackManager.getActiveBalancePack()), (EntityPlayerMP) event.player);
    }

    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof EntityPlayer) {
            ResourceLocation PLAYER_ENTITY_TRACKER = new ResourceLocation(ModReference.ID, "PLAYER_ENTITY_TRACKER");
            event.addCapability(PLAYER_ENTITY_TRACKER, new CompatiblePlayerEntityTrackerProvider());

            ResourceLocation extraFlagsResourceLocation = new ResourceLocation(ModReference.ID, "PLAYER_ENTITY_FLAGS");
            event.addCapability(extraFlagsResourceLocation, new CompatibleExtraEntityFlags());

            ResourceLocation customInventoryLocation = new ResourceLocation(ModReference.ID, "PLAYER_CUSTOM_INVENTORY");
            event.addCapability(customInventoryLocation, new CompatibleCustomPlayerInventoryCapability());
        }

        ResourceLocation exposureResourceLocation = new ResourceLocation(ModReference.ID, "EXPOSURE");
        event.addCapability(exposureResourceLocation, new CompatibleExposureCapability());
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
        if (event.phase == TickEvent.Phase.END) {
            int updatedFlags = CompatibleExtraEntityFlags.getFlags(event.player);
            if ((updatedFlags & CompatibleExtraEntityFlags.PRONING) != 0) {
                // If the player is proning, change their hitbox. TO-DO: Is there a more
                // efficient way to do this?
                setSize(event.player, 0.6f, 0.6f); //player.width, player.width);
            }
        }
    }

    @SubscribeEvent
    public final void onEntityJoinedEvent(EntityJoinWorldEvent evt) {
        // We are only interested in the player. We also only want to deal with this if the server and the client
        // are operating off of DIFFERENT file systems (hence the dedicated server check!).
        if (!(evt.getEntity() instanceof EntityPlayer) || FMLCommonHandler.instance().getMinecraftServerInstance() == null || !FMLCommonHandler.instance().getMinecraftServerInstance().isDedicatedServer())
            return;

        EntityPlayer player = (EntityPlayer) evt.getEntity();

        // Create a hash stream and make sure it's not null (not errored out)
        ByteArrayOutputStream baos = ByteArrayUtils.createByteArrayOutputStreamFromBytes(CraftingFileManager.getInstance().getCurrentFileHash());
        if (baos == null) return;

        // Send the player the hash
        getModContext().getChannel().sendTo(new CraftingClientPacket(baos, true), (EntityPlayerMP) player);
    }
}
