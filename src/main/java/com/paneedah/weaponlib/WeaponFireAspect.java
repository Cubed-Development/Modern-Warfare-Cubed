package com.paneedah.weaponlib;

import com.paneedah.weaponlib.animation.ClientValueRepo;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.jim.util.VMWHooksHandler;
import com.paneedah.weaponlib.network.packets.BulletShellClient;
import com.paneedah.weaponlib.network.packets.GunFXPacket;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell;
import com.paneedah.weaponlib.state.Aspect;
import com.paneedah.weaponlib.state.PermitManager;
import com.paneedah.weaponlib.state.StateManager;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.LOG;


/*
 * On a client side this class is used from within a separate client "ticker" thread
 */
public class WeaponFireAspect implements Aspect<WeaponState, PlayerWeaponInstance> {

    private static final float FLASH_X_OFFSET_ZOOMED = -0.03f;

    private static final long ALERT_TIMEOUT = 500;
    
//    private static <T> Predicate<T> logging(Predicate<T> predicate, String message) {
//        return t -> {
//            boolean result = predicate.test(t);
//            log.debug(message, result);
//            return result;
//        };
//    }

    private static Predicate<PlayerWeaponInstance> readyToShootAccordingToFireRate = instance ->
    System.currentTimeMillis() - instance.getLastFireTimestamp() >= 50f / BalancePackManager.getFirerate(instance.getWeapon());
        
    //System.currentTimeMillis() - instance.getLastFireTimestamp() >= 50f / instance.getWeapon().builder.fireRate;
        
    private static Predicate<PlayerWeaponInstance> postBurstTimeoutExpired = instance ->
        System.currentTimeMillis() - instance.getLastBurstEndTimestamp()
            >= instance.getWeapon().builder.burstTimeoutMilliseconds;

    private static Predicate<PlayerWeaponInstance> readyToShootAccordingToFireMode =
            instance -> instance.getSeriesShotCount() < instance.getMaxShots();
            
    private static Predicate<PlayerWeaponInstance> oneClickBurstEnabled = PlayerWeaponInstance::isOneClickBurstAllowed;
    
    private static Predicate<PlayerWeaponInstance> seriesResetAllowed = PlayerWeaponInstance::isSeriesResetAllowed;

    private static Predicate<PlayerWeaponInstance> hasAmmo = instance -> instance.getAmmo() > 0
            && Tags.getAmmo(instance.getItemStack()) > 0;

    private static Predicate<PlayerWeaponInstance> ejectSpentRoundRequired = instance -> instance.getWeapon().ejectSpentRoundRequired();

    private static Predicate<PlayerWeaponInstance> ejectSpentRoundTimeoutExpired = instance -> {
    	
    	boolean time = System.currentTimeMillis() >= instance.getWeapon().builder.pumpTimeoutMilliseconds + instance.getStateUpdateTimestamp();

    	// HERE
    
    	return time;
    	
    };
        
    private static Predicate<PlayerWeaponInstance> alertTimeoutExpired = instance ->
        System.currentTimeMillis() >= ALERT_TIMEOUT + instance.getStateUpdateTimestamp();

    private static Predicate<PlayerWeaponInstance> sprinting = instance -> instance.getPlayer().isSprinting();

    private static final Set<WeaponState> allowedFireOrEjectFromStates = new HashSet<>(
            Arrays.asList(WeaponState.READY, WeaponState.PAUSED, WeaponState.EJECT_REQUIRED));

    private static final Set<WeaponState> allowedUpdateFromStates = new HashSet<>(
            Arrays.asList(WeaponState.EJECTING, WeaponState.PAUSED, WeaponState.FIRING,
                    WeaponState.RECOILED, WeaponState.PAUSED, WeaponState.ALERT));

    private ModContext modContext;

    private StateManager<WeaponState, ? super PlayerWeaponInstance> stateManager;

    public WeaponFireAspect(CommonModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public void setPermitManager(PermitManager permitManager) {}

    @Override
    public void setStateManager(StateManager<WeaponState, ? super PlayerWeaponInstance> stateManager) {
        this.stateManager = stateManager;

        stateManager

        .in(this).change(WeaponState.READY).to(WeaponState.ALERT)
        .when(hasAmmo.negate())
        .withAction(this::cannotFire)
        .manual() // on start fire

        .in(this).change(WeaponState.ALERT).to(WeaponState.READY)
        .when(alertTimeoutExpired)
        .automatic() //

        .in(this).change(WeaponState.READY).to(WeaponState.FIRING)
        .when(hasAmmo.and(sprinting.negate()).and(readyToShootAccordingToFireRate))
        .withAction(this::fire)
        .manual() // on start fire

        .in(this).change(WeaponState.FIRING).to(WeaponState.RECOILED)
        .automatic() // unconditional

        .in(this).change(WeaponState.RECOILED).to(WeaponState.PAUSED)
        .automatic() // unconditional

        .in(this).change(WeaponState.PAUSED).to(WeaponState.EJECT_REQUIRED)
        .when(ejectSpentRoundRequired)
        .manual() // on stop

        .in(this).change(WeaponState.EJECT_REQUIRED).to(WeaponState.EJECTING)
        .withAction(this::ejectSpentRound)
        .manual() // on fire ?

        .in(this).change(WeaponState.EJECTING).to(WeaponState.READY)
        .when(ejectSpentRoundTimeoutExpired) // TODO: enforce it only if a trigger was released
        .automatic() // on stop fire and eject animation completed

        .in(this).change(WeaponState.PAUSED).to(WeaponState.FIRING)
        .when(hasAmmo
                .and(sprinting.negate())
                .and(readyToShootAccordingToFireMode)
                .and(readyToShootAccordingToFireRate)
                )
        .withAction(this::fire)
        .manual() // on fire, requires fire button to be down
        
        /// Applies 
        .in(this).change(WeaponState.PAUSED).to(WeaponState.FIRING)
        .when(hasAmmo.and(sprinting.negate())
                .and(oneClickBurstEnabled)
                .and(readyToShootAccordingToFireMode)
                .and((readyToShootAccordingToFireRate))
                )
        .withAction(this::fire)
        .automatic() // on update
        
        .in(this).change(WeaponState.PAUSED).to(WeaponState.READY)
        .when(ejectSpentRoundRequired.negate()
                .and(oneClickBurstEnabled)
                .and(readyToShootAccordingToFireMode.negate().or(hasAmmo.negate()))
                .and(seriesResetAllowed)
                .and(postBurstTimeoutExpired)
                )
        .withAction(PlayerWeaponInstance::resetCurrentSeries)
        .automatic() // on update
        
        .in(this).change(WeaponState.PAUSED).to(WeaponState.READY)
        .when(ejectSpentRoundRequired.negate().and(oneClickBurstEnabled.negate()))
        .withAction(PlayerWeaponInstance::resetCurrentSeries)
        .manual() // on stop

        ;
    }

    void onFireButtonDown(EntityPlayer player) {
        PlayerWeaponInstance weaponInstance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
        if(weaponInstance != null) {
        	
            stateManager.changeStateFromAnyOf(this, weaponInstance, allowedFireOrEjectFromStates, WeaponState.FIRING, WeaponState.EJECTING, WeaponState.ALERT);
        }
    }

    void onFireButtonRelease(EntityPlayer player) {
        PlayerWeaponInstance weaponInstance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
        if(weaponInstance != null) {
            weaponInstance.setSeriesResetAllowed(true);
            stateManager.changeState(this, weaponInstance, WeaponState.EJECT_REQUIRED, WeaponState.READY);
        }
    }

    void onUpdate(EntityPlayer player) {
        PlayerWeaponInstance weaponInstance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
        if(weaponInstance != null) {
            stateManager.changeStateFromAnyOf(this, weaponInstance, allowedUpdateFromStates); // triggers "auto" state transitions
        }
    }

    private void cannotFire(PlayerWeaponInstance weaponInstance) {
  
        if(weaponInstance.getAmmo() == 0 || Tags.getAmmo(weaponInstance.getItemStack()) == 0) {
            String message;
            if(weaponInstance.getWeapon().getAmmoCapacity() == 0
                    && modContext.getAttachmentAspect().getActiveAttachment(weaponInstance, AttachmentCategory.MAGAZINE) == null) {
                message = I18n.translateToLocalFormatted("gui.noMagazine");
            } else {
                message = I18n.translateToLocalFormatted("gui.noAmmo");
            }
            modContext.getStatusMessageCenter().addAlertMessage(message, 3, 250, 200);
            if(weaponInstance.getPlayer() instanceof EntityPlayer) {
                weaponInstance.getPlayer().playSound(modContext.getNoAmmoSound(), 1, 1);
            }
        }
    }

    @SideOnly(Side.CLIENT)
    private void playShootSound(PositionedSoundRecord psr) {
    	mc.getSoundHandler().playSound(psr);
    }
    
    
    private void fire(PlayerWeaponInstance weaponInstance) {
    	
    	
    
    	
        EntityLivingBase player = weaponInstance.getPlayer();
        Weapon weapon = (Weapon) weaponInstance.getItem();
        Random random = player.getRNG();

        
       
        //System.out.println(weaponInstance.getWeapon().getName());
        
        
        //if(true) return;
        modContext.getChannel().sendToServer(new TryFireMessage(true, 
                oneClickBurstEnabled.test(weaponInstance) && weaponInstance.getSeriesShotCount() ==  0, weaponInstance.isAimed()));

        
    	
        boolean silencerOn = modContext.getAttachmentAspect().isSilencerOn(weaponInstance);



        SoundEvent shootSound = null;
        /*
         * If oneClickBurstEnabled and it's a first shot and burst sound is defined, then play a burst sound
         */
        if(oneClickBurstEnabled.test(weaponInstance)) {

            SoundEvent burstShootSound = null;
            if(silencerOn) {
                burstShootSound = weapon.getSilencedBurstShootSound();
            }
            if(burstShootSound == null) {
                burstShootSound = weapon.getBurstShootSound();
            }
            if(burstShootSound != null) {
                if(weaponInstance.getSeriesShotCount() == 0) {
                    // Play burst sound only on start of the series
                    shootSound = burstShootSound;
                }
            } else {
                shootSound = silencerOn ? weapon.getSilencedShootSound() : weapon.getShootSound();
            }
        } else {
            shootSound = silencerOn ? weapon.getSilencedShootSound() : weapon.getShootSound();
        }
        
        if(shootSound != null) {
        	/*
        	try {
        		JSoundEngine.getInstance().playSound();
        	} catch(Exception e) {
        		e.printStackTrace();
        	}*/
        	
        	// Should prevent sound from being one sided
        
        	if(!VMWHooksHandler.isOnServer()) {
        		
        		//
        		PositionedSoundRecord psr = new PositionedSoundRecord(shootSound, SoundCategory.PLAYERS, silencerOn ? weapon.getSilencedShootSoundVolume() * 0.4f : weapon.getShootSoundVolume() * 0.4f, 1.0F, mc.player.getPosition().up(5));
            	playShootSound(psr);
        		//mc.getSoundHandler().playSound(psr);
        	}
        	
        	
        	
        	
        	//mc.getSoundHandler().playSound(new PositionedSoundRecord(shootSound.getSound(), SoundCategory.PLAYERS,silencerOn ? weapon.getSilencedShootSoundVolume() : weapon.getShootSoundVolume(), 1f, mc.player.getPosition()));
            /*
        	player.playSound(shootSound, silencerOn ? weapon.getSilencedShootSoundVolume() : weapon.getShootSoundVolume(), 1);
                    */
        }
        
        int currentAmmo = weaponInstance.getAmmo();
        if(currentAmmo == 1 && weapon.getEndOfShootSound() != null && !VMWHooksHandler.isOnServer()) {
        	PositionedSoundRecord psr = new PositionedSoundRecord(weapon.getEndOfShootSound(), SoundCategory.PLAYERS, 1.0F, 1.0F, mc.player.getPosition().up(5));
        	playShootSound(psr);
        	//mc.getSoundHandler().playSound(psr);
        }

        if(currentAmmo == 1)
        	 weaponInstance.setSlideLock(true);

        float recoilAmount = weaponInstance.getRecoil();
        recoilAmount *= BalancePackManager.getGlobalRecoilMultiplier();
        recoilAmount *= BalancePackManager.getGroupRecoilMultiplier(weapon.getConfigurationGroup());
        
        player.rotationPitch = player.rotationPitch - recoilAmount * 0.7f;
        float rotationYawFactor = -1.0f + random.nextFloat() * 2.0f;
        
        player.rotationYaw = player.rotationYaw + recoilAmount * rotationYawFactor * 0.4f;
		
        ClientValueRepo.recoilWoundY += recoilAmount * 0.7f;
        

        if(ModernConfigManager.enableMuzzleEffects && weapon.builder.flashIntensity > 0) {
            modContext.getEffectManager().spawnFlashParticle(player, weapon.builder.flashIntensity, weapon.builder.flashScale.get(),
                    weaponInstance.isAimed() ? FLASH_X_OFFSET_ZOOMED : -0.1f + weapon.builder.flashOffsetX.get(),
                    weaponInstance.isAimed() ? -1.55f : -1.7f + weapon.builder.flashOffsetY.get(), weapon.builder.flashTexture);
        }
        
       
        //ClientValueRepo.gunPow.prevPosition = ClientValueRepo.gunPow.position;
        ClientValueRepo.fireWeapon(weaponInstance);

        if(weapon.isSmokeEnabled()) {
            modContext.getEffectManager().spawnSmokeParticle(player, -0.1f + weapon.builder.smokeOffsetX.get(), -1.7f + weapon.builder.smokeOffsetY.get()+0.3f);
        }

        if(weapon.isShellCasingEjectEnabled())  {

        	float fovMult = mc.gameSettings.fovSetting < 70f ? (mc.gameSettings.fovSetting/50) : -(mc.gameSettings.fovSetting/200f);

            // Panda: Replaced this with the above line, undo if it breaks anything for whatever reason.
        	//if (mc.gameSettings.fovSetting < 70f) fovMult = (mc.gameSettings.fovSetting/50);
        	//else fovMult = -(mc.gameSettings.fovSetting/200f);
        	
        	Vec3d pos = player.getPositionEyes(1.0f);
        	Vec3d weaponDir = new Vec3d(0, -0.1, 1.0 + fovMult).rotatePitch((float) Math.toRadians(-player.rotationPitch)).rotateYaw((float) Math.toRadians(-player.rotationYaw));
        	
        	Vec3d velocity = new Vec3d(-0.3, 0.1, 0.0);
    		velocity = velocity.rotateYaw((float) Math.toRadians(-player.rotationYaw));
    		Shell shell = new Shell(weapon.getShellType(), pos.add(weaponDir), new Vec3d(-90, 0, 180 + player.rotationYaw), velocity);
            ClientEventHandler.SHELL_MANAGER.enqueueShell(shell);
    	
        	//Shell
        	
        	/*
        	// Change the raw position
        	Vec3d rawPosition = new Vec3d(ClientEventHandler.NEW_POS.get(0), ClientEventHandler.NEW_POS.get(1), ClientEventHandler.NEW_POS.get(2));
        	
        	
        	// Calculate the final position of the bullet spawn point
        	// by changing it's position along its own vector
        	double distance = 0.5;
			Vec3d eyePos = mc.player.getPositionEyes(1.0f);
			Vec3d finalPosition = rawPosition.subtract(eyePos).normalize().scale(distance).add(eyePos);
			
        	// Calculate velocity as 90 degrees to player
			Vec3d velocity = new Vec3d(-0.3, 0.1, 0.0);
    		velocity = velocity.rotateYaw((float) Math.toRadians(-mc.player.rotationYaw));
    		
    		// Spawn in shell
    		Shell shell = new Shell(weaponInstance.getWeapon().getShellType(), new Vec3d(finalPosition.x, finalPosition.y, finalPosition.z), new Vec3d(90, 0, 90), velocity);
        	ClientEventHandler.shellManager.enqueueShell(shell);
        	*/
        }
        
        int seriesShotCount = weaponInstance.getSeriesShotCount();
        if(seriesShotCount == 0) {
            weaponInstance.setSeriesResetAllowed(false);
        }

        weaponInstance.setSeriesShotCount(seriesShotCount + 1);
        if(currentAmmo == 1 || weaponInstance.getSeriesShotCount() == weaponInstance.getMaxShots()) {
            weaponInstance.setLastBurstEndTimestamp(System.currentTimeMillis());
        }
        weaponInstance.setLastFireTimestamp(System.currentTimeMillis());
        weaponInstance.setAmmo(currentAmmo - 1);
    }

    private void ejectSpentRound(PlayerWeaponInstance weaponInstance) {
        EntityLivingBase player = weaponInstance.getPlayer();
        player.playSound(weaponInstance.getWeapon().getEjectSpentRoundSound(), 1, 1);
    }

    //(weapon, player) 
    public void serverFire(EntityLivingBase player, ItemStack itemStack, boolean isBurst, boolean isAimed) {
        serverFire(player, itemStack, null, isBurst, isAimed, 1.0f);
    }
    
    public void serverFire(EntityLivingBase player, ItemStack itemStack, BiFunction<Weapon, EntityLivingBase, ? extends WeaponSpawnEntity> spawnEntityWith, boolean isBurst, boolean isAimed, float damageMultiplier) {
        if(!(itemStack.getItem() instanceof Weapon)) {
            return;
        }
        
        TargetPoint tp = new TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 100);
        modContext.getChannel().sendToAllAround(new GunFXPacket(player.getEntityId()), tp);
        

        Weapon weapon = (Weapon) itemStack.getItem();
        
        int currentServerAmmo = Tags.getAmmo(itemStack);
        
        if(currentServerAmmo <= 0) {
            LOG.error("No server ammo");
            return;
        }
        
        Tags.setAmmo(itemStack, --currentServerAmmo);
        
        if(spawnEntityWith == null) {
            spawnEntityWith = weapon.builder.spawnEntityWith;
        }
        
        //System.out.println(isAimed);
      
        /*
        int itemIndex = 0;
        EntityPlayer realPlayer = (EntityPlayer) player;
        for(int i = 0; i < realPlayer.inventory.getSizeInventory(); ++i) {
        	if(ItemStack.areItemStacksEqual(realPlayer.inventory.getStackInSlot(i), itemStack)) {
        		itemIndex = i;
        	}
        }
        
        
        
        PlayerWeaponInstance pwi = new PlayerWeaponInstance(itemIndex, player, itemStack);
        System.out.println(pwi.isAimed());
            	*/
        
        
        
        for(int i = 0; i < weapon.builder.pellets; i++) {
        	double damage = weapon.getSpawnEntityDamage(), hipFireSpread = 2.6;
            if(BalancePackManager.hasActiveBalancePack()) {
            	if(BalancePackManager.shouldChangeWeaponDamage(weapon)) damage = BalancePackManager.getNewWeaponDamage(weapon);
            	damage *= BalancePackManager.getGroupDamageMultiplier(weapon.getConfigurationGroup());
            	damage *= BalancePackManager.getGlobalDamageMultiplier();
                hipFireSpread = BalancePackManager.getGlobalHipFireSpread();
                hipFireSpread *= BalancePackManager.getGroupHipFireSpread(weapon.getConfigurationGroup());
            }
       	
            damage *= damageMultiplier;
            
           // System.out.println(weapon.getName() + " | " + spawnEntityRocketParticles);

           WeaponSpawnEntity bullet = new WeaponSpawnEntity(weapon, player.world, player, weapon.getSpawnEntityVelocity(),
                   weapon.getSpawnEntityGravityVelocity(), BalancePackManager.getInaccuracy(weapon) + (isAimed ? 0.0f : (float) hipFireSpread), (float) damage, weapon.getSpawnEntityExplosionRadius(),
                   weapon.isDestroyingBlocks(), weapon.hasRocketParticles(), weapon.getParticleAgeCoefficient(), weapon.getSmokeParticleAgeCoefficient(),
                   weapon.getExplosionScaleCoefficient(), weapon.getSmokeParticleScaleCoefficient(),
                   0, 
                   0);

           bullet.setPositionAndDirection(isAimed);
           player.world.spawnEntity(bullet);
          // return bullet;
/*            WeaponSpawnEntity spawnEntity = spawnEntityWith.apply(weapon, player);
            if(player != null)
                player.world.spawnEntity(spawnEntity);*/

        }

        PlayerWeaponInstance playerWeaponInstance = Tags.getInstance(itemStack, PlayerWeaponInstance.class);

        if(playerWeaponInstance != null) {
        	
        	Vec3d pos = player.getPositionEyes(1.0f);
        	Vec3d weaponDir = new Vec3d(0, -0.1, 1).rotatePitch((float) Math.toRadians(-player.rotationPitch)).rotateYaw((float) Math.toRadians(-player.rotationYaw));
        	
        	Vec3d velocity = new Vec3d(-0.3, 0.1, 0.0);
    		velocity = velocity.rotateYaw((float) Math.toRadians(-player.rotationYaw));
        	modContext.getChannel().sendToAllAround(new BulletShellClient(player.getEntityId(), playerWeaponInstance.getWeapon().getShellType(), pos.add(weaponDir), velocity), tp);
        }






        SoundEvent shootSound = null;
        
        boolean silencerOn = playerWeaponInstance != null && modContext.getAttachmentAspect().isSilencerOn(playerWeaponInstance);
        if(isBurst && weapon.builder.isOneClickBurstAllowed) {

            SoundEvent burstShootSound = null;
            if(silencerOn) {
                burstShootSound = weapon.getSilencedBurstShootSound();
            }
            if(burstShootSound == null) {
                burstShootSound = weapon.getBurstShootSound();
            }
            if(burstShootSound != null) {
                shootSound = burstShootSound;
            } else {
                shootSound = silencerOn ? weapon.getSilencedShootSound() : weapon.getShootSound();
            }
        } else {
            shootSound = silencerOn ? weapon.getSilencedShootSound() : weapon.getShootSound();
        }

        player.world.playSound(player instanceof EntityPlayer ? (EntityPlayer) player : null, player.posX, player.posY, player.posZ, shootSound, player.getSoundCategory(), silencerOn ? weapon.getSilencedShootSoundVolume() : weapon.getShootSoundVolume(), 1.0f);

    }

}
