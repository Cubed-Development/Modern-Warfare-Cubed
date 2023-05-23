package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.paneedah.weaponlib.compatibility.CompatibleServerEventHandler;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.electronics.ItemHandheld;
import com.paneedah.weaponlib.inventory.CustomPlayerInventory;
import com.paneedah.weaponlib.inventory.EntityInventorySyncMessage;
import com.paneedah.weaponlib.jim.util.HitUtil;
import com.paneedah.weaponlib.network.packets.HeadshotSFXPacket;
import com.paneedah.weaponlib.tracking.PlayerEntityTracker;
import com.paneedah.weaponlib.tracking.SyncPlayerEntityTrackerMessage;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.Collection;
import java.util.Iterator;

import static com.paneedah.mwc.utils.ModReference.log;

/**
 * TODO: rename to common event handler, since it's invoked on both sides
 */
public class ServerEventHandler extends CompatibleServerEventHandler {

    private ModContext modContext;

    public ServerEventHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public ModContext getModContext() {
        return modContext;
    }

    @Override
    protected void onCompatibleServerTickEvent(TickEvent.ServerTickEvent e) {
        CommonModContext.currentContext.set(modContext);
    }

    @Override
	public void onEquipmentChange(LivingEquipmentChangeEvent e) {

	}

    @SubscribeEvent
    protected void onCompatibleLivingUpdateEvent(LivingEvent.LivingUpdateEvent livingUpdateEvent) {
    	//if(!compatibility.world(livingUpdateEvent.getEntity()).isRemote && livingUpdateEvent.getEntityLiving() instanceof EntityPlayer) {
    	//	//modContext.getChannel().sendTo(new HeadshotSFXPacket(), (EntityPlayerMP) livingUpdateEvent.getEntityLiving());
    	//}

        if(!livingUpdateEvent.getEntity().world.isRemote) {
//            if(livingUpdateEvent.getEntity() instanceof EntityPlayer) {
//                System.out.println(System.currentTimeMillis() + ": " + compatibility.world(livingUpdateEvent.getEntity()).getTotalWorldTime());
//            }
            
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
                    //System.out.println("Removing expired exposure " + exposure);
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

    @Override
    protected void onCompatibleItemToss(ItemTossEvent itemTossEvent) {}

    @Override
    protected void onCompatibleEntityJoinWorld(EntityJoinWorldEvent e) {
        if(e.getEntity() instanceof Contextual) {
            ((Contextual)e.getEntity()).setContext(modContext);
        }
        if(e.getEntity() instanceof EntityPlayerMP && !e.getWorld().isRemote) {
            log.debug("Player {} joined the world", e.getEntity());
            PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityPlayer) e.getEntity());
            if(tracker != null) {
                modContext.getChannel().sendTo(new SyncPlayerEntityTrackerMessage(tracker),
                        (EntityPlayerMP)e.getEntity());
            }
            EntityPlayer player = (EntityPlayer) e.getEntity();
            modContext.getChannel().sendTo(
                    new EntityControlMessage(player, CompatibleExtraEntityFlags.getFlags(player)),
                    (EntityPlayerMP)e.getEntity());
                        
            modContext.getChannel().sendToAll(
                    new EntityInventorySyncMessage(e.getEntity(), 
                            CompatibleCustomPlayerInventoryCapability.getInventory(player), false));
        }
    }

    @SubscribeEvent
    protected void onPlayerStartedTracking(PlayerEvent.StartTracking e) {
        if(e.getTarget() instanceof EntityPlayer && !e.getTarget().world.isRemote) {
            modContext.getChannel().sendTo(
                    new EntityInventorySyncMessage(e.getTarget(), 
                            CompatibleCustomPlayerInventoryCapability.getInventory((EntityLivingBase) e.getTarget()), false), 
                            (EntityPlayerMP) e.getEntityPlayer());
            System.out.println("Player " + e.getEntityPlayer() + " started tracking "  + e.getTarget());
            return;
        }
        if(e.getTarget() instanceof EntityProjectile || e.getTarget() instanceof EntityBounceable) {
            return;
        }
        PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityPlayer) e.getEntity());
        if (tracker != null && tracker.updateTrackableEntity(e.getTarget())) {
            log.debug("Player {} started tracking {} with uuid {}", e.getEntityPlayer(), e.getTarget(), e.getTarget().getUniqueID());
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
        if (inventory != null && inventory.getStackInSlot(1) != null) {
            NonNullList<ItemStack> stackList = NonNullList.create();

            ItemStack[] itemStacks = new ItemStack[] { inventory.getStackInSlot(1) };

            for (int i = 0; i < itemStacks.length; i++) {
                stackList.add(itemStacks[i]);
            }

            float amt = ISpecialArmor.ArmorProperties.applyArmor(livingHurtEvent.getEntityLiving(), stackList, livingHurtEvent.getSource(), livingHurtEvent.getAmount());
            livingHurtEvent.setAmount(amt);
        }
        
        if(livingHurtEvent.getSource().getImmediateSource() instanceof EntityProjectile) {
        	RayTraceResult hit = HitUtil.traceProjectilehit(livingHurtEvent.getSource().getImmediateSource(), livingHurtEvent.getEntityLiving());
        	if(hit != null) {
        		Vec3d eyes = livingHurtEvent.getEntityLiving().getPositionEyes(1.0f);
            	if(hit.hitVec.distanceTo(eyes) < 0.6f) {
            		
            		//tSystem.out.println("Current headshot multiplier is " + BalancePackManager.getHeadshotMultiplier());
            		livingHurtEvent.setAmount((float) (livingHurtEvent.getAmount()*BalancePackManager.getHeadshotMultiplier()));
            		
            		if(livingHurtEvent.getSource().getTrueSource() instanceof EntityPlayer) {
            			//System.out.println(livingHurtEvent.getSource().getTrueSource());
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

    @Override
    protected void onCompatiblePlayerLoggedIn(PlayerLoggedInEvent e) {
    }
}
