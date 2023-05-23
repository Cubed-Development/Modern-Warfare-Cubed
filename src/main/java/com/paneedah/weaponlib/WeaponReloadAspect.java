package com.paneedah.weaponlib;

import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.state.Aspect;
import com.paneedah.weaponlib.state.Permit;
import com.paneedah.weaponlib.state.Permit.Status;
import com.paneedah.weaponlib.state.PermitManager;
import com.paneedah.weaponlib.state.StateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.paneedah.mwc.utils.ModReference.log;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class WeaponReloadAspect implements Aspect<WeaponState, PlayerWeaponInstance> {

	private static final long ALERT_TIMEOUT = 500;
	private static final long INSPECT_TIMEOUT = 500;
	
	private static final long UNLOAD_TIMEOUT = 1000;
	private static final long AWAIT_FURTHER_LOAD_INSTRUCTIONS_TIMEOUT = 100;

	static {
		TypeRegistry.getInstance().register(CompoundPermit.class);
		TypeRegistry.getInstance().register(UnloadPermit.class);
		TypeRegistry.getInstance().register(LoadPermit.class);
		TypeRegistry.getInstance().register(PlayerWeaponInstance.class); // TODO: move it out
	}

	private static final Set<WeaponState> allowedUpdateFromStates = new HashSet<>(
			Arrays.asList(
			        WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS,
			        WeaponState.COMPOUND_REQUESTED,
			        WeaponState.COMPOUND_RELOAD,
			        WeaponState.COMPOUND_RELOAD_EMPTY,
			        WeaponState.COMPOUND_RELOAD_FINISH,
			        WeaponState.COMPOUND_RELOAD_FINISHED,
			        WeaponState.TACTICAL_RELOAD,
					WeaponState.LOAD_REQUESTED,
					WeaponState.LOAD,
					WeaponState.LOAD_ITERATION,
					WeaponState.LOAD_ITERATION_COMPLETED,
					WeaponState.ALL_LOAD_ITERATIONS_COMPLETED,
					WeaponState.UNLOAD_PREPARING,
					WeaponState.UNLOAD_REQUESTED,
					WeaponState.UNLOAD,
					WeaponState.ALERT,
					WeaponState.INSPECTING,
					WeaponState.DRAWING));

	public static class CompoundPermit extends Permit<WeaponState> {
		
		public CompoundPermit() {}
		
		public CompoundPermit(WeaponState state) {
			super(state);
		}
		
	}
	
	
	public static class UnloadPermit extends Permit<WeaponState> {

		public UnloadPermit() {}

		public UnloadPermit(WeaponState state) {
			super(state);
		}
	}

	public static class LoadPermit extends Permit<WeaponState> {

		public LoadPermit() {}

		public LoadPermit(WeaponState state) {
			super(state);
		}
	}

	@SuppressWarnings("unused")
    private static Predicate<PlayerWeaponInstance> sprinting = instance -> instance.getPlayer().isSprinting();
    
    private static Predicate<PlayerWeaponInstance> hasNextLoadIteration = 
            weaponInstance -> weaponInstance.getWeapon().hasIteratedLoad() 
            && weaponInstance.getLoadIterationCount() > 0;

	private static Predicate<PlayerWeaponInstance> supportsDirectBulletLoad =
			weaponInstance -> weaponInstance.getWeapon().getAmmoCapacity() > 0;

	private static Predicate<PlayerWeaponInstance> magazineAttached =
			weaponInstance -> WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, weaponInstance) != null;

			
	private static Predicate<PlayerWeaponInstance> hasAmmo = (i) -> i.getAmmo() != 0;
			
	private static Predicate<PlayerWeaponInstance> loadIterationCompleted = weaponInstance ->
	        System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp()
	            + Math.max(weaponInstance.getWeapon().builder.loadIterationTimeout,
	                    weaponInstance.getWeapon().getTotalLoadIterationDuration() + 250);
	        
    private static Predicate<PlayerWeaponInstance> allLoadIterationsCompleted = weaponInstance ->
        System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp()
            + weaponInstance.getWeapon().getAllLoadIterationAnimationsCompletedDuration(); 
	        
	private static Predicate<PlayerWeaponInstance> reloadAnimationCompleted = weaponInstance -> {
		
		
		long maxTime = (long) (weaponInstance.getAnimationDuration());
		
		/*
		if(weaponInstance.getState() == WeaponState.COMPOUND_RELOAD) {
			maxTime /= 4;
		} else if(weaponInstance.getState() == WeaponState.COMPOUND_RELOAD_EMPTY) {
			maxTime /= 1.5;
		}
		
		
		
		*/
		
	
		//return System.currentTimeMillis() - weaponInstance.getStateUpdateTimestamp() > 2116;
		
		return System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp()
	
			+ Math.max(weaponInstance.getWeapon().builder.reloadingTimeout,
					maxTime);
		
			
		};
	
 
		
		
	private static Predicate<PlayerWeaponInstance> reloadMostlyCompleted = weaponInstance -> {
		
		boolean val = System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp()
				+ Math.max(weaponInstance.getWeapon().builder.reloadingTimeout,
						weaponInstance.getWeapon().getTotalReloadingDuration() * 1.1);
		
		
		
		
		return val; };
		
	private static Predicate<PlayerWeaponInstance> magSwapCompleted = weaponInstance -> weaponInstance.isMagSwapDone();
		
		
		private static Predicate<PlayerWeaponInstance> reloadMidpoint = weaponInstance ->
		Math.abs((System.currentTimeMillis()-(weaponInstance.getReloadTimestamp()))/((double) weaponInstance.getWeapon().getTotalReloadingDuration()*0.5)-0.5) < 0.01;
		
	
	private static Predicate<PlayerWeaponInstance> unloadTimeoutExpired = weaponInstance ->
	    System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + UNLOAD_TIMEOUT;
	    
	private static Predicate<PlayerWeaponInstance> awaitFurtherLoadInstructionCompleted = weaponInstance ->
        System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + 295;
		
  
        
        
    private static Predicate<PlayerWeaponInstance> loadAfterUnloadEnabled = PlayerWeaponInstance::isLoadAfterUnloadEnabled;
		
	private static Predicate<PlayerWeaponInstance> unloadAnimationCompleted = weaponInstance ->
		System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp()
			+ weaponInstance.getWeapon().getTotalUnloadingDuration() * 1.1;
		
	private static Predicate<PlayerWeaponInstance> prepareFirstLoadIterationAnimationCompleted = weaponInstance ->
        System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp()
            + weaponInstance.getWeapon().getPrepareFirstLoadIterationAnimationDuration() * 1.1;	
		
        
   
        
    private static Predicate<PlayerWeaponInstance> shouldFinishCompoundReload = weaponInstance -> {
    
    	
    	if(weaponInstance.isDelayCompoundEnd()) {
    		return true;
    	} else {
    		
    		long maxTime = (long) (weaponInstance.getAnimationDuration()*1.2);
    		
    	
    		return System.currentTimeMillis() >= weaponInstance.getReloadTimestamp()
    	
    			+ maxTime;

    		
    	}
    	
    
    };
        

	private Predicate<PlayerWeaponInstance> inventoryHasFreeSlots = weaponInstance -> weaponInstance.getPlayer() instanceof EntityPlayer && !(((EntityPlayer) weaponInstance.getPlayer()).inventory.getFirstEmptyStack() == -1);

	private static Predicate<PlayerWeaponInstance> alertTimeoutExpired = instance ->
		System.currentTimeMillis() >= ALERT_TIMEOUT + instance.getStateUpdateTimestamp();
		
	private static Predicate<PlayerWeaponInstance> inspectTimeoutExpired = instance ->
	    System.currentTimeMillis() >= INSPECT_TIMEOUT + instance.getStateUpdateTimestamp();
        
    private static Predicate<PlayerWeaponInstance> drawingAnimationCompleted = weaponInstance ->
        System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp()
            + weaponInstance.getWeapon().getTotalDrawingDuration() * 1.0;

	private ModContext modContext;

	private PermitManager permitManager;

	private StateManager<WeaponState, ? super PlayerWeaponInstance> stateManager;
	
	public WeaponReloadAspect(ModContext modContext) {
		this.modContext = modContext;
	}

	@Override
	public void setStateManager(StateManager<WeaponState, ? super PlayerWeaponInstance> stateManager) {

		if(permitManager == null) {
			throw new IllegalStateException("Permit manager not initialized");
		}
		
		
		
		
		this.stateManager = stateManager
			
		        
		.in(this)
	         .change(WeaponState.READY).to(WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS)
	         .manual()
	         
	         .in(this)
	         .change(WeaponState.READY).to(WeaponState.COMPOUND_REQUESTED)
	         .manual()
	     
	    .in(this)
	    .change(WeaponState.COMPOUND_RELOAD_EMPTY).to(WeaponState.COMPOUND_RELOAD_EMPTY)
	    .when(reloadMidpoint.and(magSwapCompleted.negate()))

	    .withAction(this::clientCompoundReload)
	    .automatic()
	    
	    .in(this)
	    .change(WeaponState.COMPOUND_RELOAD).to(WeaponState.COMPOUND_RELOAD)
	    .when(reloadMidpoint.and(magSwapCompleted.negate()))
	    .withAction(this::clientCompoundReload)
	    .automatic()
	         
	    .in(this)
	    
	    	.change(WeaponState.READY).to(WeaponState.COMPOUND_RELOAD)
	
	    	//.withAction(this::clientCompoundReload)
	    	
	    	/*
	    	.withPermit((s, es) -> new LoadPermit(s),
					modContext.getPlayerItemInstanceRegistry()::update,
					permitManager)
	    	.withAction((c, f, t, p) -> completeClientLoad(c, (LoadPermit)p))
	    	*/
	    	.manual()
	    
	    .in(this)
	    	.change(WeaponState.READY).to(WeaponState.COMPOUND_RELOAD_EMPTY)
	    	.manual()
	    	
	    .in(this)
		    .change(WeaponState.READY).to(WeaponState.TACTICAL_RELOAD)
		    .manual()
	    
	    /*
	    .in(this)
             .change(WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS).to(WeaponState.LOAD)
             .when(hasAmmo.and(magazineAttached))
            // .withAction(this::noFurtherLoadInstructionsReceived)
             .automatic()
	    */
	    .in(this)
             .change(WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS).to(WeaponState.READY)
             .when(awaitFurtherLoadInstructionCompleted)
             .withAction(this::noFurtherLoadInstructionsReceived)
             .automatic()
             
        .in(this)
             .change(WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS).to(WeaponState.READY)
             .withAction(this::furtherLoadInstructionsReceived)
             .manual()
         
             
         .in(this)
             .change(WeaponState.COMPOUND_REQUESTED).to(WeaponState.READY)
             .when(awaitFurtherLoadInstructionCompleted)
             .withAction(this::noCompoundInstructionsReceived)
             .automatic()
             
        .in(this)
             .change(WeaponState.COMPOUND_REQUESTED).to(WeaponState.READY)
             .withAction(this::compoundInstructionsReceived)
             .manual()
           
        
        
		.in(this)
			.change(WeaponState.READY).to(WeaponState.LOAD)
			.when(supportsDirectBulletLoad.or(magazineAttached.negate()))
			.withPermit((s, es) -> new LoadPermit(s),
					modContext.getPlayerItemInstanceRegistry()::update,
					permitManager)
			.withAction((c, f, t, p) -> completeClientLoad(c, (LoadPermit)p))
			.manual()
		
	     .in(this)
            .change(WeaponState.UNLOAD).to(WeaponState.LOAD)
            .when(loadAfterUnloadEnabled.and(supportsDirectBulletLoad.or(magazineAttached.negate())))
            .withPermit((s, es) -> new LoadPermit(s),
                    modContext.getPlayerItemInstanceRegistry()::update,
                    permitManager)
            .withAction((c, f, t, p) -> completeClientLoad(c, (LoadPermit)p))
            .manual()
			
	    .in(this)
            .change(WeaponState.LOAD).to(WeaponState.READY)
            .when(reloadAnimationCompleted.and(hasNextLoadIteration.negate()))
            .automatic()
            
            
         .in(this)	
            .change(WeaponState.TACTICAL_RELOAD).to(WeaponState.COMPOUND_RELOAD_FINISH)
            .when(reloadAnimationCompleted.and(hasNextLoadIteration.negate()))
            .withAction((c, f, t, p) -> obamaCorporation(c))
            .automatic()
            
        .in(this)
        	
            .change(WeaponState.COMPOUND_RELOAD).to(WeaponState.COMPOUND_RELOAD_FINISH)
            .when(reloadAnimationCompleted.and(hasNextLoadIteration.negate()))
            .withAction((c, f, t, p) -> obamaCorporation(c))
            .automatic()
            
        .in(this)
            .change(WeaponState.COMPOUND_RELOAD_EMPTY).to(WeaponState.COMPOUND_RELOAD_FINISH)
            .when(reloadAnimationCompleted.and(hasNextLoadIteration.negate()))
            .withAction((c, f, t, p) -> obamaCorporation(c))
            .automatic()
         
         .in(this)
         	.change(WeaponState.COMPOUND_RELOAD_FINISH).to(WeaponState.COMPOUND_RELOAD_FINISHED)
         	.withPermit((s, es) -> new CompoundPermit(s),
                    modContext.getPlayerItemInstanceRegistry()::update,
                    permitManager)
         	.manual()
         	
         .in(this)
         	.change(WeaponState.COMPOUND_RELOAD_FINISHED).to(WeaponState.READY)
         	.when(shouldFinishCompoundReload)
         	.automatic()

            
		.in(this)
            .change(WeaponState.LOAD).to(WeaponState.LOAD_ITERATION)
            .when(hasNextLoadIteration.and(prepareFirstLoadIterationAnimationCompleted))
            .withAction(this::startLoadIteration)
            .automatic()
            
        .in(this)
            .change(WeaponState.LOAD_ITERATION).to(WeaponState.LOAD_ITERATION_COMPLETED)
            .when(loadIterationCompleted)
            .withAction(this::completeLoadIteration)
            .automatic()
            
        .in(this)
            .change(WeaponState.LOAD_ITERATION_COMPLETED).to(WeaponState.LOAD_ITERATION)
            .when(hasNextLoadIteration)
            .withAction(this::startLoadIteration)
            .automatic()
            
        .in(this)
            .change(WeaponState.LOAD_ITERATION_COMPLETED).to(WeaponState.ALL_LOAD_ITERATIONS_COMPLETED)
            .when(hasNextLoadIteration.negate())
            .automatic()
            
        .in(this)
            .change(WeaponState.ALL_LOAD_ITERATIONS_COMPLETED).to(WeaponState.READY)
            .when(allLoadIterationsCompleted)
            .withAction(this::completeAllLoadIterations)
            .automatic()

            
		.in(this)
			.prepare((c, f, t) -> { prepareUnload(c); }, unloadAnimationCompleted)
			.change(WeaponState.READY).to(WeaponState.UNLOAD)
			.when(magazineAttached.and(inventoryHasFreeSlots))
			.withPermit((s, c) -> new UnloadPermit(s),
					modContext.getPlayerItemInstanceRegistry()::update,
					permitManager)
			.withAction((c, f, t, p) -> completeClientUnload(c, (UnloadPermit)p))
			.manual()
			

		.in(this)
			.change(WeaponState.UNLOAD).to(WeaponState.READY)
		    .when(loadAfterUnloadEnabled.negate().or(unloadTimeoutExpired))
			.automatic()

		.in(this)
			.change(WeaponState.READY).to(WeaponState.ALERT)
			.when(inventoryHasFreeSlots.negate())
			.withAction(this::inventoryFullAlert)
			.manual()

		.in(this).change(WeaponState.ALERT).to(WeaponState.READY)
			.when(alertTimeoutExpired)
			.automatic() 
			
	    .in(this)
            .change(WeaponState.READY).to(WeaponState.INSPECTING)
            .withAction(this::inspect)
            .manual()
		
		.in(this)
		    .change(WeaponState.INSPECTING).to(WeaponState.READY)
            .when(inspectTimeoutExpired)
            .automatic() 
            
            
        .in(this)
            .change(WeaponState.READY).to(WeaponState.DRAWING)
            
            .withAction(this::draw)
         //   .automatic()
            .manual()
            
            
        .in(this)
            .change(WeaponState.DRAWING).to(WeaponState.READY)
            .when(drawingAnimationCompleted)
            .automatic()
            
        ;
	}
	
	public ItemAttachment<Weapon> previousMagazine;

	@Override
	public void setPermitManager(PermitManager permitManager) {
		this.permitManager = permitManager;
		permitManager.registerEvaluator(LoadPermit.class, PlayerWeaponInstance.class, (p, c) -> { processLoadPermit(p, c); });
		permitManager.registerEvaluator(UnloadPermit.class, PlayerWeaponInstance.class, (p, c) -> { processUnloadPermit(p, c); });
		permitManager.registerEvaluator(CompoundPermit.class, PlayerWeaponInstance.class, (p, c) -> { processCompoundPermit(p, c); });
	}
	
	
	
		
		public void processCompoundPermit(CompoundPermit p, PlayerWeaponInstance pwi) {
			
		
			processActualCompoundPermit(p, pwi);
			
			
			
			//processUnloadPermit(new UnloadPermit(p.getState()), pwi);
			//p.setStatus(Status.GRANTED);
			
			previousMagazine = null;
		}
		
		
	public void obamaCorporation(PlayerWeaponInstance instance) {
		stateManager.changeState(this, instance, WeaponState.COMPOUND_RELOAD_FINISHED);
	}
	
	public void clientCompoundReload(PlayerWeaponInstance instance) {
		
		
		
		if(instance == null) return;
		

		
		instance.completeMagSwap();
		
		instance.getWeapon().getRenderer().setMagicMagPermit(true);
		
		if(instance.getState() == WeaponState.COMPOUND_RELOAD) {
			stateManager.changeState(this, instance, WeaponState.COMPOUND_RELOAD);
		} else {
			stateManager.changeState(this, instance, WeaponState.COMPOUND_RELOAD_EMPTY);
		}
		
		
		
		//processUnloadPermit(new UnloadPermit(instance.getState()), instance);
		
		
		// Send request to the server
		//permitManager.request(new CompoundPermit(instance.getState()), instance, (a, b) -> {});
		
		
		
		//processUnloadPermit(new UnloadPermit(instance.getState()), instance);
		//processLoadPermit(new LoadPermit(instance.getState()), instance);
		
		previousMagazine = null;
		
	}

	public void reloadMainHeldItem(EntityPlayer player) {
		PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
		if(instance != null) {

		
			
			/*
			if(WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, instance) == null) {
				instance.getWeapon().getRenderer().compoundReloadEmpty = false;
				instance.getWeapon().getRenderer().compoundReload = false;
				
			} else {
				if(instance.getAmmo() == 0) {
					instance.getWeapon().getRenderer().compoundReload = false;
					instance.getWeapon().getRenderer().compoundReloadEmpty = true;
				} else {
					instance.getWeapon().getRenderer().compoundReloadEmpty = false;
					instance.getWeapon().getRenderer().compoundReload = true;
				}
				
				
				
			}*/
			
			/*
			if(WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, instance) == null) {
				stateManager.changeState(this, instance, WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS, WeaponState.READY);
			} else {
				if(instance.getAmmo() == 0) {
					stateManager.changeState(this, instance, WeaponState.COMPOUND_RELOAD_EMPTY);
				} else {
					stateManager.changeState(this, instance, WeaponState.COMPOUND_RELOAD);
				}
			}
		    */
			
			
			
	//		stateManager.changeState(this, instance, WeaponState.LOAD, WeaponState.ALERT);
			
			if(AnimationModeProcessor.getInstance().isLegacyMode()) {
				//stateManager.changeState(this, instance, WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS, WeaponState.READY);
				furtherLoadInstructionsReceived(instance);
				stateManager.changeState(this, instance, WeaponState.READY);
				
			} else {
				if(WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, instance) == null) {
					ItemStack nextAttachment = getNextBestMagazineStack(instance);
					if(instance.getWeapon().getRenderer().getBuilder().isHasLoadEmpty() && nextAttachment != null && Tags.getAmmo(nextAttachment) == 0) {
						instance.getWeapon().getRenderer().setShouldDoEmptyVariant(true);
					}
					
					
					
					stateManager.changeState(this, instance, WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS, WeaponState.READY);
				} else {
					
					
					
					if(instance.getState() != WeaponState.READY && instance.getState() != WeaponState.COMPOUND_REQUESTED) return;
					
					ItemAttachment<Weapon> nextAttachment = getNextMagazine(instance);
					
					
					
					
					
					instance.markReloadDirt();
					instance.markMagSwapReady();
					if(instance.getAmmo() == 0) {
						
						
						
						if(nextAttachment != null) {
							instance.getWeapon().getRenderer().setMagicMag(instance, nextAttachment, WeaponState.COMPOUND_RELOAD_EMPTY);
						
						} else return;
						
						stateManager.changeState(this, instance, WeaponState.COMPOUND_RELOAD_EMPTY);
					} else {
						if(nextAttachment != null) {
							instance.getWeapon().getRenderer().setMagicMag(instance, nextAttachment, WeaponState.COMPOUND_RELOAD);
						} else return;
						instance.setIsAwaitingCompoundInstructions(true);
						stateManager.changeState(this, instance, WeaponState.COMPOUND_REQUESTED, WeaponState.READY);
						
						
						
						
						//stateManager.changeState(this, instance, WeaponState.COMPOUND_RELOAD);
					}
				}
			}
			
			
		 //   stateManager.changeState(this, instance, WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS, WeaponState.READY);
		}
	}
	
	public void unloadMainHeldItem(EntityPlayer player) {
	
        PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
        if(instance != null) {
        	instance.getWeapon().getRenderer().compoundReloadEmpty = false;
        	instance.getWeapon().getRenderer().compoundReload = false;
            instance.setLoadAfterUnloadEnabled(false);
            
            
            ItemAttachment<Weapon> currentMagazine = modContext.getAttachmentAspect().getActiveAttachment(instance, AttachmentCategory.MAGAZINE);
            if(instance.getWeapon().getRenderer().getBuilder().isHasUnloadEmpty() && currentMagazine != null && instance.getAmmo() == 0) {
            	instance.getWeapon().getRenderer().setShouldDoEmptyVariant(true);
            }
            
             stateManager.changeState(this, instance, WeaponState.UNLOAD, WeaponState.ALERT);
        }
    }

	void updateMainHeldItem(EntityPlayer player) {
	
		PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
		if(instance != null) {
			stateManager.changeStateFromAnyOf(this, instance, allowedUpdateFromStates); // no target state specified, will trigger auto-transitions
		}
	}
	
	public void inspectMainHeldItem(EntityPlayer player) {
        PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
        if(instance != null) {
            stateManager.changeState(this, instance, WeaponState.INSPECTING);
        }
    }
	
	public void drawMainHeldItem(EntityPlayer player) {
		
        PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
       	
        if(instance != null) {
        	stateManager.changeState(this, instance, WeaponState.DRAWING);
        }
    }
	
	private ItemAttachment<Weapon> getNextMagazine(PlayerWeaponInstance weaponInstance) {
		EntityPlayer player = (EntityPlayer) weaponInstance.getPlayer();
		Weapon weapon = (Weapon) weaponInstance.getItem();
		
		List<ItemMagazine> compatibleMagazines = weapon.getCompatibleMagazines()
		        .stream()
		        .filter(compatibleMagazine -> WeaponAttachmentAspect.hasRequiredAttachments(
		                compatibleMagazine, weaponInstance)).collect(Collectors.toList());
		
		if(compatibleMagazines.isEmpty()) return null;
		
		ItemStack magazineItemStack = compatibility.findNextBestItem(compatibleMagazines,
                (stack1, stack2) -> Integer.compare(Tags.getAmmo(stack1), Tags.getAmmo(stack2)), player);
		
		if(magazineItemStack == null) return null;
		
		return (ItemAttachment<Weapon>) magazineItemStack.getItem();
        
	}
	
	private ItemStack getNextBestMagazineStack(PlayerWeaponInstance weaponInstance) {
		EntityPlayer player = (EntityPlayer) weaponInstance.getPlayer();
		Weapon weapon = (Weapon) weaponInstance.getItem();
		
		List<ItemMagazine> compatibleMagazines = weapon.getCompatibleMagazines()
		        .stream()
		        .filter(compatibleMagazine -> WeaponAttachmentAspect.hasRequiredAttachments(
		                compatibleMagazine, weaponInstance)).collect(Collectors.toList());
		
		if(compatibleMagazines.isEmpty()) return null;
		
		ItemStack magazineItemStack = compatibility.findNextBestItem(compatibleMagazines,
                (stack1, stack2) -> Integer.compare(Tags.getAmmo(stack1), Tags.getAmmo(stack2)), player);
		
		return magazineItemStack;
        
	}
	
	
	
	private void processActualCompoundPermit(CompoundPermit p, PlayerWeaponInstance instance) {
		
		
		
		//System.out.println("hi");
		ItemStack weaponItemStack = instance.getItemStack();
		EntityPlayer player = (EntityPlayer) instance.getPlayer();
		Weapon weapon = instance.getWeapon();
		
		List<ItemMagazine> compatibleMagazines = weapon.getCompatibleMagazines()
		        .stream()
		        .filter(compatibleMagazine -> WeaponAttachmentAspect.hasRequiredAttachments(
		                compatibleMagazine, instance)).collect(Collectors.toList());
		
		
		// Unload weapon
		
		ItemAttachment<Weapon> attachment = modContext.getAttachmentAspect().removeAttachment(AttachmentCategory.MAGAZINE, instance);
		
		
	
	//	processUnloadPermit(new UnloadPermit(p.getState()), instance);
		
		int originalAmmo = instance.getAmmo();
		
		
		// Mag list is empty
		
		
		if(compatibleMagazines.isEmpty()) return;
		
		ItemStack magazineStack = compatibility.tryConsumingCompatibleItem(compatibleMagazines,
                (stack1, stack2) -> Integer.compare(Tags.getAmmo(stack1), Tags.getAmmo(stack2)), player);
        
		if(magazineStack == null) return;
		
		//ItemStack magazineStack = ItemStack.EMPTY;
		int ammo = Tags.getAmmo(magazineStack);
        Tags.setAmmo(weaponItemStack, ammo);
        WeaponAttachmentAspect.addAttachment((ItemAttachment<Weapon>) magazineStack.getItem(), instance);
        instance.setAmmo(ammo);
	
		
		p.setStatus(Status.GRANTED);
		
		
		if(attachment == null) {
			p.setStatus(Status.DENIED);
			return;
		} else if(attachment instanceof ItemMagazine) {
			ItemStack attachmentItemStack = ((ItemMagazine) attachment).createItemStack();
 			Tags.setAmmo(attachmentItemStack, originalAmmo);
 			if(!player.inventory.addItemStackToInventory(attachmentItemStack)) {
 				log.error("Cannot add attachment " + attachment + " for " + instance + "back to the inventory");
 			}
 			

 			p.setStatus(Status.GRANTED);
		}
	
         
         
    }

	@SuppressWarnings("unchecked")
	private void processLoadPermit(LoadPermit p, PlayerWeaponInstance weaponInstance) {
	//	System.out.println("Processing load permit " + weaponInstance.getPlayer().world.isRemote);
		log.debug("Processing load permit on server for {}", weaponInstance);

		ItemStack weaponItemStack = weaponInstance.getItemStack();

		if(weaponItemStack == null || !(weaponInstance.getPlayer() instanceof EntityPlayer)) {
			// Since reload request was sent for an item, the item was removed from the original slot
		    // Also if instance is not owner by entity player , do not allow load
			return;
		}
		EntityPlayer player = (EntityPlayer) weaponInstance.getPlayer();
		Status status = Status.GRANTED;
		weaponInstance.setLoadIterationCount(0); // TODO: review if this is really necessary
		Weapon weapon = (Weapon) weaponInstance.getItem();
		if(compatibility.getTagCompound(weaponItemStack) == null) {
		    weaponItemStack.setTagCompound(new NBTTagCompound());
		}
		//if (!player.isSprinting()) {
		List<ItemMagazine> compatibleMagazines = weapon.getCompatibleMagazines()
		        .stream()
		        .filter(compatibleMagazine -> WeaponAttachmentAspect.hasRequiredAttachments(
		                compatibleMagazine, weaponInstance)).collect(Collectors.toList());
		List<ItemAttachment<Weapon>> compatibleBullets = weapon.getCompatibleAttachments(ItemBullet.class);
		ItemStack consumedStack;
		if(!compatibleMagazines.isEmpty()) {
			
		    ItemAttachment<Weapon> existingMagazine = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, weaponInstance);
		    int ammo = Tags.getAmmo(weaponItemStack);
		    if(existingMagazine == null) {
		        ammo = 0;
		        ItemStack magazineItemStack = compatibility.tryConsumingCompatibleItem(compatibleMagazines,
		                (stack1, stack2) -> Integer.compare(Tags.getAmmo(stack1), Tags.getAmmo(stack2)), player);
		       
		        if(magazineItemStack != null) {
		            ammo = Tags.getAmmo(magazineItemStack);
		            Tags.setAmmo(weaponItemStack, ammo);
		            log.debug("Setting server side ammo for {} to {}", weaponInstance, ammo);
		            WeaponAttachmentAspect.addAttachment((ItemAttachment<Weapon>) magazineItemStack.getItem(), weaponInstance);
		            player.world.playSound(player instanceof EntityPlayer ? (EntityPlayer) player : null, player.posX, player.posY, player.posZ, weapon.getReloadSound(), player.getSoundCategory(),1.0f, 1.0F);
		        } else {
		            status = Status.DENIED;
		        }
		    }
		    // Update permit instead: modContext.getChannel().sendTo(new ReloadMessage(weapon, ReloadMessage.Type.LOAD, newMagazine, ammo), (EntityPlayerMP) player);
		    weaponInstance.setAmmo(ammo);
		} else if(!compatibleBullets.isEmpty() && (consumedStack = compatibility.tryConsumingCompatibleItem(compatibleBullets,
		        Math.min(weapon.getMaxBulletsPerReload(), weapon.getAmmoCapacity() - weaponInstance.getAmmo()), player, i -> true)) != null) {
		    int ammo = weaponInstance.getAmmo() + consumedStack.getCount();
		    Tags.setAmmo(weaponItemStack, ammo);
		    // Update permit instead modContext.getChannel().sendTo(new ReloadMessage(weapon, ammo), (EntityPlayerMP) player);
		    weaponInstance.setAmmo(ammo);
		    if(weapon.hasIteratedLoad()) {
		        weaponInstance.setLoadIterationCount(consumedStack.getCount());
		    }
		    player.world.playSound(player instanceof EntityPlayer ? (EntityPlayer) player : null, player.posX, player.posY, player.posZ, weapon.getReloadSound(), player.getSoundCategory(), 1.0F, 1.0F);
		} else if (compatibility.consumeInventoryItem(player.inventory, weapon.builder.ammo)) {
		    Tags.setAmmo(weaponItemStack, weapon.builder.ammoCapacity);
		    // Update permit instead: modContext.getChannel().sendTo(new ReloadMessage(weapon, weapon.builder.ammoCapacity), (EntityPlayerMP) player);
		    weaponInstance.setAmmo(weapon.builder.ammoCapacity);
		    player.world.playSound(player instanceof EntityPlayer ? (EntityPlayer) player : null, player.posX, player.posY, player.posZ, weapon.getReloadSound(), player.getSoundCategory(), 1.0F, 1.0F);
		} else {
		    log.debug("No suitable ammo found for {}. Permit denied.", weaponInstance);
		    //				Tags.setAmmo(weaponItemStack, 0);
		    //				weaponInstance.setAmmo(0);
		    status = Status.DENIED;
		    // Update permit instead: modContext.getChannel().sendTo(new ReloadMessage(weapon, 0), (EntityPlayerMP) player);
		}
		/*} else {
		    status = Status.DENIED;
		}*/

//		Tags.setInstance(weaponItemStack, weaponInstance);

		p.setStatus(status);
	}

	
	
	private void prepareUnload(PlayerWeaponInstance weaponInstance) {
		weaponInstance.getPlayer().playSound(weaponInstance.getWeapon().getUnloadSound(), 1.0F, 1.0F);
	}

	private void processUnloadPermit(UnloadPermit p, PlayerWeaponInstance weaponInstance) {
		
		
		log.debug("Processing unload permit on server for {}", weaponInstance);
		if(!(weaponInstance.getPlayer() instanceof EntityPlayer)) {
		    log.warn("Not a player");
            return;
        }
		ItemStack weaponItemStack = weaponInstance.getItemStack();
		
		EntityPlayer player = (EntityPlayer) weaponInstance.getPlayer();

		Weapon weapon = (Weapon) weaponItemStack.getItem();
		if (compatibility.getTagCompound(weaponItemStack) != null /* && !player.isSprinting()*/) {
			ItemAttachment<Weapon> attachment = modContext.getAttachmentAspect().removeAttachment(AttachmentCategory.MAGAZINE, weaponInstance);
			//System.out.println("Unloading " + attachment);
			if(attachment == null) {
			    // Attachment can be null if it's in use and cannot be removed
			    p.setStatus(Status.DENIED);
			    return;
			} 
			
			if(attachment instanceof ItemMagazine) {
				
				previousMagazine = attachment;
				
				ItemStack attachmentItemStack = ((ItemMagazine) attachment).createItemStack();
				
				
				Tags.setAmmo(attachmentItemStack, weaponInstance.getAmmo());

				if(!player.inventory.addItemStackToInventory(attachmentItemStack)) {
					log.error("Cannot add attachment " + attachment + " for " + weaponInstance + "back to the inventory");
				}
			} else {
				//throw new IllegalStateException();
			}

			Tags.setAmmo(weaponItemStack, 0);
			weaponInstance.setAmmo(0);
			player.world.playSound(player instanceof EntityPlayer ? (EntityPlayer) player : null, player.posX, player.posY, player.posZ, weapon.getUnloadSound(), player.getSoundCategory(), 1.0F, 1.0F);

			p.setStatus(Status.GRANTED);
		} else {
			p.setStatus(Status.DENIED);
		}

//		Tags.setInstance(weaponItemStack, weaponInstance); // to sync immediately without waiting for tick sync
		p.setStatus(Status.GRANTED);
	}

	private void completeClientLoad(PlayerWeaponInstance weaponInstance, LoadPermit permit) {
	    weaponInstance.setLoadAfterUnloadEnabled(false);
		if(permit == null) {
			log.error("Permit is null, something went wrong");
			return;
		}

		
		
		if(permit.getStatus() == Status.GRANTED) {
		
			
			compatibility.playSound(weaponInstance.getPlayer(), weaponInstance.getWeapon().getReloadSound(), 1.0F, 1.0F);
		}
	}

	private void completeClientUnload(PlayerWeaponInstance weaponInstance, UnloadPermit p) {
	    if(weaponInstance.isLoadAfterUnloadEnabled()) {
	       stateManager.changeState(this, weaponInstance, WeaponState.LOAD, WeaponState.ALERT);
	        weaponInstance.setLoadAfterUnloadEnabled(false);
	    }
	}

	public void inventoryFullAlert(PlayerWeaponInstance weaponInstance) {
		modContext.getStatusMessageCenter().addAlertMessage(compatibility.getLocalizedString("gui.inventoryFull"), 3, 250, 200);
	}
	
	public void inspect(PlayerWeaponInstance weaponInstance) {
        compatibility.playSound(weaponInstance.getPlayer(), weaponInstance.getWeapon().getInspectSound(), 1.0F, 1.0F);
    }
	
	public void draw(PlayerWeaponInstance weaponInstance) {
	    compatibility.playSound(weaponInstance.getPlayer(), weaponInstance.getWeapon().getDrawSound(), 1.0F, 1.0F);
	}
	
	public void startLoadIteration(PlayerWeaponInstance weaponInstance) {
        compatibility.playSound(weaponInstance.getPlayer(), weaponInstance.getWeapon().getReloadIterationSound(), 1.0F, 1.0F);
    }
	
	public void completeLoadIteration(PlayerWeaponInstance weaponInstance) {
        weaponInstance.setLoadIterationCount(weaponInstance.getLoadIterationCount() - 1);
    }
	
	public void completeAllLoadIterations(PlayerWeaponInstance weaponInstance) {
        compatibility.playSound(weaponInstance.getPlayer(), weaponInstance.getWeapon().getAllReloadIterationsCompletedSound(), 1.0F, 1.0F);
    }
	
	public void noCompoundInstructionsReceived(PlayerWeaponInstance weaponInstance) {
		weaponInstance.setDelayCompoundEnd(false);
		weaponInstance.setIsAwaitingCompoundInstructions(false);
		stateManager.changeState(this, weaponInstance, WeaponState.COMPOUND_RELOAD);
	}
	
	public void compoundInstructionsReceived(PlayerWeaponInstance weaponInstance) {
		weaponInstance.setIsAwaitingCompoundInstructions(false);
		// If it doesn't have a tactical reload just do the normal compound
		// reload
		if(!weaponInstance.getWeapon().getRenderer().getBuilder().isHasTacticalReload()) {
			stateManager.changeState(this, weaponInstance, WeaponState.COMPOUND_RELOAD);
			return;
		}
		
		weaponInstance.getWeapon().getRenderer().setMagicMag(weaponInstance, weaponInstance.getWeapon().getRenderer().magicMagReplacement, WeaponState.TACTICAL_RELOAD);
		
		stateManager.changeState(this, weaponInstance, WeaponState.TACTICAL_RELOAD);
	}
	
	
	public void noFurtherLoadInstructionsReceived(PlayerWeaponInstance weaponInstance) {
	    //System.out.println("-------No further load instructions received");
	    stateManager.changeState(this, weaponInstance, WeaponState.LOAD, WeaponState.ALERT);
	}
	
	public void furtherLoadInstructionsReceived(PlayerWeaponInstance weaponInstance) {
       // System.out.println("\nFurther load instructions received!\n");
        weaponInstance.setLoadAfterUnloadEnabled(true);
        stateManager.changeState(this, weaponInstance, WeaponState.UNLOAD, WeaponState.LOAD, WeaponState.ALERT);
    }
	
}
