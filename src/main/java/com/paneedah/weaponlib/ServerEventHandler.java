package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.*;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.electronics.ItemHandheld;
import com.paneedah.weaponlib.inventory.CustomPlayerInventory;
import com.paneedah.weaponlib.inventory.EntityInventorySyncMessage;
import com.paneedah.weaponlib.jim.util.HitUtil;
import com.paneedah.weaponlib.mission.*;
import com.paneedah.weaponlib.network.packets.HeadshotSFXPacket;
import com.paneedah.weaponlib.tracking.PlayerEntityTracker;
import com.paneedah.weaponlib.tracking.SyncPlayerEntityTrackerMessage;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

import java.util.Collection;
import java.util.Iterator;

import static com.paneedah.mw.utils.ModReference.log;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

/**
 * TODO: rename to common event handler, since it's invoked on both sides
 */
public class ServerEventHandler extends CompatibleServerEventHandler {

    private ModContext modContext;
    private String modId;

    public ServerEventHandler(ModContext modContext, String modId) {
        this.modContext = modContext;
        this.modId = modId;
    }
    
    @Override
    public ModContext getModContext() {
        return modContext;
    }

    @Override
    protected void onCompatibleServerTickEvent(CompatibleServerTickEvent e) {
        CommonModContext.currentContext.set(modContext);
    }

    @Override
	public void onEquipmentChange(LivingEquipmentChangeEvent e) {

	}
    
    @Override
    protected void onCompatibleLivingUpdateEvent(CompatibleLivingUpdateEvent e) {
    	//if(!compatibility.world(e.getEntity()).isRemote && e.getEntityLiving() instanceof EntityPlayer) {
    	//	//modContext.getChannel().getChannel().sendTo(new HeadshotSFXPacket(), (EntityPlayerMP) e.getEntityLiving());
    	//}
    	
        if(!compatibility.world(e.getEntity()).isRemote) {
//            if(e.getEntity() instanceof EntityPlayer) {
//                System.out.println(System.currentTimeMillis() + ": " + compatibility.world(e.getEntity()).getTotalWorldTime());
//            }
            
            NBTTagCompound doseNbt = null;
            ItemStack itemStack = compatibility.getHeldItemMainHand(e.getEntityLiving());
            if(itemStack != null && itemStack.getItem() instanceof ItemHandheld) {
                compatibility.ensureTagCompound(itemStack);
                doseNbt = compatibility.getTagCompound(itemStack);
            }
            
            boolean effectiveUpdate = false;
            Collection<? extends Exposure> exposures = CompatibleExposureCapability.getExposures(e.getEntity());
            for(Iterator<? extends Exposure> iterator = exposures.iterator(); iterator.hasNext();) {
                Exposure exposure = iterator.next();
                exposure.update(e.getEntity());
                if(doseNbt != null && exposure instanceof SpreadableExposure) {
                    doseNbt.setFloat("dose", ((SpreadableExposure) exposure).getLastDose());
                }
                if(!exposure.isEffective(compatibility.world(e.getEntity()))) {
                    System.out.println("Removing expired exposure " + exposure);
                    iterator.remove();
                    effectiveUpdate = true;
                }
            }
            if(effectiveUpdate) {
                CompatibleExposureCapability.updateExposures(e.getEntity(), exposures);
            }
            
            long lastExposuresUpdateTimestamp = CompatibleExposureCapability.getLastUpdateTimestamp(e.getEntity());
            long lastSyncTimestamp = CompatibleExposureCapability.getLastSyncTimestamp(e.getEntity());
            if(lastSyncTimestamp + 5 < compatibility.world(e.getEntity()).getTotalWorldTime() 
                    /*&& lastExposuresUpdateTimestamp > lastSyncTimestamp */ && e.getEntity() instanceof EntityPlayerMP) {
                modContext.getChannel().getChannel().sendTo(new ExposureMessage(exposures), (EntityPlayerMP) e.getEntity());
                CompatibleExposureCapability.setLastSyncTimestamp(e.getEntity(), compatibility.world(e.getEntity()).getTotalWorldTime());
            }
            
//            SpreadableExposure exposure = CompatibleExposureCapability.getExposure(e.getEntity(), SpreadableExposure.class);
//            if(exposure != null) {
//                boolean stillEffective = exposure.isEffective(compatibility.world(e.getEntity()));
//                exposure.update(e.getEntity());
//                if(e.getEntity() instanceof EntityPlayerMP && 
//                        System.currentTimeMillis() - exposure.getLastSyncTimestamp() > 500) {
//                    modContext.getChannel().getChannel().sendTo(
//                            new SpreadableExposureMessage(stillEffective ? exposure : null),
//                            (EntityPlayerMP) e.getEntity());
//                    exposure.setLastSyncTimestamp(System.currentTimeMillis()); 
//                }
//                if(!stillEffective) {
//                    CompatibleExposureCapability.removeExposure(e.getEntity(), SpreadableExposure.class);
//                }
//                
//                ItemStack itemStack = compatibility.getHeldItemMainHand(e.getEntityLiving());
//                if(itemStack != null && itemStack.getItem() instanceof ItemHandheld) {
//                    compatibility.ensureTagCompound(itemStack);
//                    NBTTagCompound nbt = compatibility.getTagCompound(itemStack);
//                    nbt.setFloat("dose", exposure.getLastDose());
//                }
//            }
            if(e.getEntity() instanceof EntityPlayer) {
                Missions.update((EntityPlayer)e.getEntity(), 
                        new GoToLocationAction((float)(e.getEntity().posX), (float)(e.getEntity().posY), (float)(e.getEntity().posZ), 0), 
                        modContext);
            }
            
        }
    }

    @Override
    protected void onCompatibleItemToss(ItemTossEvent itemTossEvent) {}

    @Override
    protected void onCompatibleEntityJoinWorld(CompatibleEntityJoinWorldEvent e) {
        if(e.getEntity() instanceof Contextual) {
            ((Contextual)e.getEntity()).setContext(modContext);
        }
        if(e.getEntity() instanceof EntityPlayerMP && !e.getWorld().isRemote) {
            log.debug("Player {} joined the world", e.getEntity());
            PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityPlayer) e.getEntity());
            if(tracker != null) {
                modContext.getChannel().getChannel().sendTo(new SyncPlayerEntityTrackerMessage(tracker),
                        (EntityPlayerMP)e.getEntity());
            }
            EntityPlayer player = (EntityPlayer) e.getEntity();
            modContext.getChannel().getChannel().sendTo(
                    new EntityControlMessage(player, CompatibleExtraEntityFlags.getFlags(player)),
                    (EntityPlayerMP)e.getEntity());
                        
            modContext.getChannel().getChannel().sendToAll(
                    new EntityInventorySyncMessage(e.getEntity(), 
                            CompatibleCustomPlayerInventoryCapability.getInventory(player), false));
            
            modContext.getChannel().getChannel().sendTo(
                    new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions(player)),
                    (EntityPlayerMP)e.getEntity());
        }
    }

    @Override
    protected void onCompatiblePlayerStartedTracking(CompatibleStartTrackingEvent e) {
        if(e.getTarget() instanceof EntityPlayer && !compatibility.world(e.getTarget()).isRemote) {
            modContext.getChannel().getChannel().sendTo(
                    new EntityInventorySyncMessage(e.getTarget(), 
                            CompatibleCustomPlayerInventoryCapability.getInventory((EntityLivingBase) e.getTarget()), false), 
                            (EntityPlayerMP) e.getPlayer());
            System.out.println("Player " + e.getPlayer() + " started tracking "  + e.getTarget());
            return;
        }
        if(e.getTarget() instanceof EntityProjectile || e.getTarget() instanceof EntityBounceable) {
            return;
        }
        PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityPlayer) e.getEntity());
        if (tracker != null && tracker.updateTrackableEntity(e.getTarget())) {
            log.debug("Player {} started tracking {} with uuid {}", e.getPlayer(), e.getTarget(), e.getTarget().getUniqueID());
            modContext.getChannel().getChannel().sendTo(new SyncPlayerEntityTrackerMessage(tracker),
                    (EntityPlayerMP)e.getPlayer());
            
            EntityPlayer player = (EntityPlayer) e.getEntity();
            modContext.getChannel().getChannel().sendTo(
                    new EntityControlMessage(player, CompatibleExtraEntityFlags.getFlags(player)),
                    (EntityPlayerMP)e.getEntity());
            
            modContext.getChannel().getChannel().sendTo(
                    new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions(player)),
                    (EntityPlayerMP)e.getEntity());
        }
    }

    @Override
    protected void onCompatiblePlayerStoppedTracking(CompatibleStopTrackingEvent e) {
        if(e.getTarget() instanceof EntityProjectile || e.getTarget() instanceof EntityBounceable) {
            return;
        }
        PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityPlayer) e.getEntity());
        if (tracker != null && tracker.updateTrackableEntity(e.getTarget())) {
            log.debug("Player {} stopped tracking {}", e.getPlayer(), e.getTarget());
            modContext.getChannel().getChannel().sendTo(new SyncPlayerEntityTrackerMessage(tracker),
                    (EntityPlayerMP)e.getPlayer());
            
            EntityPlayer player = (EntityPlayer) e.getEntity();
            modContext.getChannel().getChannel().sendTo(
                    new EntityControlMessage(player, CompatibleExtraEntityFlags.getFlags(player)),
                    (EntityPlayerMP)e.getEntity());
            
            modContext.getChannel().getChannel().sendTo(
                    new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions(player)),
                    (EntityPlayerMP)e.getEntity());
        }
    }

    @Override
    protected void onCompatibleLivingDeathEvent(CompatibleLivingDeathEvent event) {

        final EntityLivingBase entity = event.getEntity();
        if(!compatibility.world(entity).isRemote) {
            DamageSource damageSource = event.getDamageSource();
            if(damageSource.getTrueSource() instanceof EntityPlayer) {
                Missions.update((EntityPlayer)damageSource.getTrueSource(), new KillEntityAction(entity), modContext);
            }
        }
        if(entity instanceof EntityPlayer && !compatibility.world(entity).isRemote) {
            if(!compatibility.getGameRulesBooleanValue(compatibility.world(entity).getGameRules(), "keepInventory")) {
                CustomPlayerInventory inventory = CompatibleCustomPlayerInventoryCapability.getInventory(entity);
                
                for(int slotIndex = 0; slotIndex < inventory.getSizeInventory(); slotIndex++) {
                    ItemStack stackInSlot = inventory.getStackInSlot(slotIndex);
                    if(stackInSlot != null) {
                        compatibility.dropItem((EntityPlayer)entity, stackInSlot, true, false);
                        inventory.setInventorySlotContents(slotIndex, null);
                    }
                }
            }
        }
    }

    @Override
    public String getModId() {
        return modId;
    }

    @Override
    protected void onCompatibleLivingHurtEvent(CompatibleLivingHurtEvent e) {
        CustomPlayerInventory inventory = CompatibleCustomPlayerInventoryCapability
                .getInventory(e.getEntityLiving());
        if (inventory != null && inventory.getStackInSlot(1) != null) {
            compatibility.applyArmor(e, e.getEntityLiving(),
                    new ItemStack[] { inventory.getStackInSlot(1) }, e.getDamageSource(), e.getAmount());
        }
        
        if(e.getDamageSource().getImmediateSource() instanceof EntityProjectile) {
        	RayTraceResult hit = HitUtil.traceProjectilehit(e.getDamageSource().getImmediateSource(), e.getEntityLiving());
        	if(hit != null) {
        		Vec3d eyes = e.getEntityLiving().getPositionEyes(1.0f);
            	if(hit.hitVec.distanceTo(eyes) < 0.6f) {
            		
            		//tSystem.out.println("Current headshot multiplier is " + BalancePackManager.getHeadshotMultiplier());
            		e.setAmount((float) (e.getAmount()*BalancePackManager.getHeadshotMultiplier()));
            		
            		if(e.getDamageSource().getTrueSource() instanceof EntityPlayer) {
            			//System.out.println(e.getDamageSource().getTrueSource());
            			modContext.getChannel().getChannel().sendTo(new HeadshotSFXPacket(), (EntityPlayerMP) e.getDamageSource().getTrueSource());
            		}
                	
            		
            	}
        	}
        }
    }

    @Override
    protected void onCompatiblePlayerDropsEvent(CompatiblePlayerDropsEvent e) {
        for(Iterator<EntityItem> it = e.getDrops().iterator(); it.hasNext();) {
            EntityItem entityItem = it.next();
            // TODO: check if this item is item storage and prevent dropping if necessary, add it back to player inventory
            if(compatibility.getEntityItem(entityItem).getItem() instanceof ItemStorage) {
                it.remove();
            }
        }
    }

    @Override
    protected void onCompatiblePlayerCloneEvent(CompatiblePlayerCloneEvent compatiblePlayerCloneEvent) {
        CustomPlayerInventory originalInventory = CompatibleCustomPlayerInventoryCapability.getInventory(compatiblePlayerCloneEvent.getOriginalPlayer());
        if(originalInventory != null) {
            CompatibleCustomPlayerInventoryCapability.setInventory(compatiblePlayerCloneEvent.getPlayer(), originalInventory);
            originalInventory.setContext(modContext);
            originalInventory.setOwner(compatiblePlayerCloneEvent.getPlayer());
//            modContext.getChannel().getChannel().sendToAll(
//                    new EntityInventorySyncMessage(compatiblePlayerCloneEvent.getPlayer(), originalInventory, false));
        }       
        
    }

    @Override
    protected void onCompatiblePlayerRespawnEvent(CompatiblePlayerRespawnEvent compatiblePlayerRespawnEvent) {
        modContext.getChannel().getChannel().sendToAll(
                new EntityInventorySyncMessage(compatiblePlayerRespawnEvent.getPlayer(), 
                        CompatibleCustomPlayerInventoryCapability.getInventory(compatiblePlayerRespawnEvent.getPlayer()), false));
    }

    @Override
    protected void onCompatiblePlayerInteractInteractEvent(CompatiblePlayerEntityInteractEvent compatiblePlayerInteractEvent) {
        //
    }

    @Override
    protected void onCompatiblePlayerLoggedIn(PlayerLoggedInEvent e) {
        MissionManager missionManager = modContext.getMissionManager();
        if(missionManager != null ) {
        	
            modContext.getChannel().getChannel().sendTo(
                    new MissionOfferingSyncMessage(missionManager.getOfferings()), (EntityPlayerMP)e.player);
            modContext.getChannel().getChannel().sendTo(
                    new EntityMissionOfferingSyncMessage(missionManager.getEntityMissionOfferings()), (EntityPlayerMP)e.player);
        }
    }
}
