package com.paneedah.weaponlib;

import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.state.Aspect;
import com.paneedah.weaponlib.state.Permit;
import com.paneedah.weaponlib.state.Permit.Status;
import com.paneedah.weaponlib.state.PermitManager;
import com.paneedah.weaponlib.state.StateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class MagazineReloadAspect implements Aspect<MagazineState, PlayerMagazineInstance> {

    static {
        TypeRegistry.getInstance().register(LoadPermit.class);
        TypeRegistry.getInstance().register(UnloadPermit.class);
    }

    private static final Set<MagazineState> allowedUpdateFromStates = new HashSet<>(
            Arrays.asList(
                    MagazineState.LOAD_REQUESTED,
                    MagazineState.LOAD,
                    MagazineState.UNLOAD_REQUESTED,
                    MagazineState.UNLOAD));

    public static class LoadPermit extends Permit<MagazineState> {

        public LoadPermit() {}

        public LoadPermit(MagazineState state) {
            super(state);
        }
    }
    
    public static class UnloadPermit extends Permit<MagazineState> {
    	
    	public UnloadPermit() {}
    	
    	public UnloadPermit(MagazineState state) {
    		super(state);
    	}
    	
    }

    private static long reloadAnimationDuration = 1000;


    private static Predicate<PlayerMagazineInstance> reloadAnimationCompleted = es ->
        System.currentTimeMillis() >= es.getStateUpdateTimestamp() + reloadAnimationDuration; // TODO: read reload animation duration from the state itself

    private ModContext modContext;

    private PermitManager permitManager;

    private StateManager<MagazineState, ? super PlayerMagazineInstance> stateManager;

    private Predicate<PlayerMagazineInstance> notFull = instance -> {
        boolean result = Tags.getAmmo(instance.getItemStack()) < instance.getMagazine().getCapacity();
        return result;
    };
    
    private Predicate<PlayerMagazineInstance> notEmpty = instance -> {
        boolean result = Tags.getAmmo(instance.getItemStack()) != 0;
        return result;
    };

    public MagazineReloadAspect(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public void setStateManager(StateManager<MagazineState, ? super PlayerMagazineInstance> stateManager) {

        if(permitManager == null) {
            throw new IllegalStateException("Permit manager not initialized");
        }

        this.stateManager = stateManager

        .in(this)
            .change(MagazineState.READY).to(MagazineState.LOAD)
            .when(notFull)
            .withPermit((s, es) -> new LoadPermit(s),
                    modContext.getPlayerItemInstanceRegistry()::update,
                    permitManager)
            .withAction((c, f, t, p) -> doPermittedLoad(c, (LoadPermit)p))
            .manual()

        .in(this)
            .change(MagazineState.LOAD).to(MagazineState.READY)
            .when(reloadAnimationCompleted)
            .automatic()
            
         .in(this)
            .change(MagazineState.READY).to(MagazineState.UNLOAD)
            .when(notEmpty)
            .withPermit((s, es) -> new UnloadPermit(s),
                    modContext.getPlayerItemInstanceRegistry()::update,
                    permitManager)
            .withAction((c, f, t, p) -> doPermittedUnload(c, (UnloadPermit)p))
            .manual()
            
         .in(this)
            .change(MagazineState.UNLOAD).to(MagazineState.READY)
            .when(reloadAnimationCompleted)
            .automatic()
            
        ;
    }

    @Override
    public void setPermitManager(PermitManager permitManager) {
        this.permitManager = permitManager;
        permitManager.registerEvaluator(LoadPermit.class, PlayerMagazineInstance.class, (p, c) -> { evaluateLoad(p, c); });
        permitManager.registerEvaluator(UnloadPermit.class, PlayerMagazineInstance.class, (p, c) -> { evaluateUnload(p, c); });
        
    }

    public void reloadMainHeldItem(EntityPlayer player) {
        PlayerMagazineInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerMagazineInstance.class);
        stateManager.changeState(this, instance, MagazineState.LOAD);
    }
    
    public void unloadMainHeldItem(EntityPlayer player) {
        PlayerMagazineInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerMagazineInstance.class);
        stateManager.changeState(this, instance, MagazineState.UNLOAD);
    }

    void updateMainHeldItem(EntityPlayer player) {
        PlayerMagazineInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerMagazineInstance.class);
        if(instance != null) {
            stateManager.changeStateFromAnyOf(this, instance, allowedUpdateFromStates); // no target state specified, will trigger auto-transitions
        }
    }

    @SuppressWarnings("unchecked")
    private void evaluateUnload(UnloadPermit p, PlayerMagazineInstance magazineInstance) {

    	
    	
        if(!(magazineInstance.getPlayer() instanceof EntityPlayer)) {
            return;
        }
        ItemStack magazineStack = magazineInstance.getItemStack();

        Status status = Status.DENIED;
        if(magazineStack.getItem() instanceof ItemMagazine) {
            ItemStack magazineItemStack = magazineStack;
            
            EntityPlayer player = (EntityPlayer) magazineInstance.getPlayer();
            boolean originalFlag = true;
            if(magazineItemStack.getCount() > 1) {
                magazineItemStack.shrink(1);

                ItemStack copyOfStack = magazineItemStack.copy();
                copyOfStack.setCount(1);
             
                magazineItemStack = copyOfStack;
                originalFlag = false;
            }
            
            
            
            ItemMagazine magazine = (ItemMagazine) magazineItemStack.getItem();
            List<ItemBullet> compatibleBullets = magazine.getCompatibleBullets();
            int currentAmmo = originalFlag ? Tags.getAmmo(magazineStack) : Tags.getAmmo(magazineItemStack);
            
            
            ItemStack stack = new ItemStack(compatibleBullets.get(0));
            stack.setCount(currentAmmo);
            player.addItemStackToInventory(stack);
            
            if(originalFlag) {
            	 Tags.setAmmo(magazineStack, 0);
            } else {
            	 Tags.setAmmo(magazineItemStack, 0);
            }
           
            
            if(!originalFlag) player.inventory.addItemStackToInventory(magazineItemStack);
            
            
            if(magazine.getUnloadSound() != null) {
                magazineInstance.getPlayer().playSound(magazine.getUnloadSound(), 1, 1);
            }

            /*
            ItemStack consumedStack;
            if((consumedStack = compatibility.tryConsumingItem(compatibleBullets, magazine.getAmmo() - currentAmmo,
                    (EntityPlayer)magazineInstance.getPlayer(), i -> true)) != null) {
                
                ItemStack remainingStack = null;
                if(shouldSplitStack) {
                    remainingStack = magazineStack.splitStack(magazineStack.getCount() - 1);
                }
                
                Tags.setAmmo(magazineStack, Tags.getAmmo(magazineStack) + consumedStack.getCount());
                
                if(remainingStack != null) {
                    player.inventory.addItemStackToInventory(remainingStack);
                }
                
                if(magazine.getReloadSound() != null) {
                    magazineInstance.getPlayer().playSound(magazine.getReloadSound(), 1, 1);
                }
                status = Status.GRANTED;
            }*/
            status = Status.GRANTED;
        }

        p.setStatus(status);
    }
    
    
    @SuppressWarnings("unchecked")
    private void evaluateLoad(LoadPermit p, PlayerMagazineInstance magazineInstance) {

        if(!(magazineInstance.getPlayer() instanceof EntityPlayer)) {
            return;
        }
        ItemStack magazineStack = magazineInstance.getItemStack();

        Status status = Status.DENIED;
        if(magazineStack.getItem() instanceof ItemMagazine) {
            ItemStack magazineItemStack = magazineStack;
            
            EntityPlayer player = (EntityPlayer) magazineInstance.getPlayer();
            
            boolean shouldSplitStack = false;
            if(magazineItemStack.getCount() > 1) {
                shouldSplitStack = true;
                if(player.inventory.getFirstEmptyStack() < 0) {
                    p.setStatus(status);
                    return;
                }
            }
            
            ItemMagazine magazine = (ItemMagazine) magazineItemStack.getItem();
            List<ItemBullet> bullets = magazine.getCompatibleBullets();
            int currentAmmo = Tags.getAmmo(magazineStack);
            int consumedAmount;
            if (currentAmmo < magazine.getCapacity() && (consumedAmount = MWCUtil.consumeItemsFromPlayerInventory(bullets, magazine.getCapacity() - currentAmmo, (EntityPlayer) magazineInstance.getPlayer())) != 0) {
                
                ItemStack remainingStack = null;
                if(shouldSplitStack) {
                    remainingStack = magazineStack.splitStack(magazineStack.getCount() - 1);
                }
                
                Tags.setAmmo(magazineStack, Tags.getAmmo(magazineStack) + consumedAmount);
                
                if(remainingStack != null) {
                    player.inventory.addItemStackToInventory(remainingStack);
                }
                
                if(magazine.getReloadSound() != null) {
                    magazineInstance.getPlayer().playSound(magazine.getReloadSound(), 1, 1);
                }
                status = Status.GRANTED;
            }
        }

        p.setStatus(status);
    }
    
    private void doPermittedUnload(PlayerMagazineInstance weaponInstance, UnloadPermit permit) {
        if(permit == null) {
            System.err.println("Permit is null, something went wrong");
            return;
        }
//      if(permit.getStatus() == Status.GRANTED) {
//          weaponInstance.getPlayer().playSound(weaponInstance.getWeapon().getReloadSound(), 1, 1);
//      }
    }

    private void doPermittedLoad(PlayerMagazineInstance weaponInstance, LoadPermit permit) {
        if(permit == null) {
            System.err.println("Permit is null, something went wrong");
            return;
        }
//      if(permit.getStatus() == Status.GRANTED) {
//          weaponInstance.getPlayer().playSound(weaponInstance.getWeapon().getReloadSound(), 1, 1);
//      }
    }
}
