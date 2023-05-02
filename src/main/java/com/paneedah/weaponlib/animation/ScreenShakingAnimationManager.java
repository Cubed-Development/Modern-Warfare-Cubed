package com.paneedah.weaponlib.animation;

import com.paneedah.weaponlib.PlayerWeaponInstance;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.animation.ScreenShakeAnimation.Builder;
import net.minecraft.entity.player.EntityPlayer;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ScreenShakingAnimationManager {
    
    public static enum State { 
        SHOOTING(0, 0.1f), RELOADING(-5, 0f), AIMING(-10, 0f), DEFAULT(Integer.MIN_VALUE, 0f);
        
        private int priority;
        private float stepAdjustement;
        State(int priority, float stepAdjustement) {
            this.priority = priority;
        }
        
        int getPriority() {
            return priority;
        }
        
        public float getStepAdjustement() {
            return stepAdjustement;
        }
    }
    
    private static class Key {
        UUID playerId;
        State state;
        Weapon weapon;
        
        public Key(EntityPlayer player, State state, Weapon weapon) {
            this.playerId = player.getPersistentID();
            this.state = state;
            this.weapon = weapon;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
            result = prime * result + ((state == null) ? 0 : state.hashCode());
            result = prime * result + ((weapon == null) ? 0 : weapon.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Key other = (Key) obj;
            if (playerId == null) {
                if (other.playerId != null)
                    return false;
            } else if (!playerId.equals(other.playerId))
                return false;
            if (state != other.state)
                return false;
            if (weapon == null) {
                if (other.weapon != null)
                    return false;
            } else if (!weapon.equals(other.weapon))
                return false;
            return true;
        }
        
        
    }

    private Map<Key, PlayerAnimation> allPlayerAnimations = new HashMap<>();
    private Map<EntityPlayer, PlayerAnimation> activeAnimations = new HashMap<>();
    private float maxYaw = 2f;
    private float maxPitch = 2f;
    private long transitionDuration = 2000;
    private State lastTargetState;
    
    public ScreenShakingAnimationManager setMaxYaw(float maxYaw) {
        this.maxYaw = maxYaw;
        return this;
    }

    public ScreenShakingAnimationManager setMaxPitch(float maxPitch) {
        this.maxPitch = maxPitch;
        return this;
    }

    public ScreenShakingAnimationManager setTransitionDuration(long transitionDuration) {
        this.transitionDuration = transitionDuration;
        return this;
    }
    
    public void update(EntityPlayer player, PlayerWeaponInstance weaponInstance, RenderableState weaponState) {
        State targetState = toManagedState(weaponState);
        
//        System.out.println("Target state: " + targetState + ", render state: " + weaponState);
        PlayerAnimation activeAnimation = activeAnimations.get(player);
//        activeAnimations.clear();
//        allPlayerAnimations.clear();
        boolean fadeOut = true;
        if(activeAnimation == null) {
            activeAnimation = getAnimationForManagedState(player, weaponInstance, targetState);
            activeAnimations.put(player, activeAnimation);
        } else {
            State currentAnimationState = activeAnimation.getState();
//            System.out.println("Current state: " + currentState);
            
           // System.out.println(currentAnimationState.getPriority() + " | " + targetState.getPriority());
            
           
            if(currentAnimationState == targetState) {
            	
                if(targetState != lastTargetState) {
//                    System.out.println("Target state: " + targetState + ", last: " + lastTargetState + ", resetting...");
                    activeAnimation.reset(player, false);
                }
            }  else if(currentAnimationState.getPriority() < targetState.getPriority() || activeAnimation.isCompleted()) {
                
            	activeAnimation = getAnimationForManagedState(player, weaponInstance, targetState);
                activeAnimation.reset(player, true);
                activeAnimations.put(player, activeAnimation);
            }
        }
        
        activeAnimation.update(player, fadeOut);
        lastTargetState = targetState;
    }

    public void reset(EntityPlayer player, RenderableState weaponState) {
//        PlayerAnimation activeAnimation = getActiveAnimation(player, weaponState);
//        activeAnimation.reset(player);
    }
    
    public static State toManagedState(RenderableState weaponState) {
        if(weaponState == null) {
            return State.DEFAULT;
        }
        State managedState;
        switch(weaponState) {
        case SHOOTING: case ZOOMING_SHOOTING: //case RECOILED: case ZOOMING_RECOILED:
            managedState = State.SHOOTING;
            break;
        case RELOADING:
            managedState = State.RELOADING;
            break;
        case ZOOMING:
            managedState = State.AIMING;
            break;
        default:
            managedState = State.DEFAULT;
        }
        return managedState;
    }
    
    private PlayerAnimation createAnimationForManagedState(EntityPlayer player, State managedState, Weapon weapon) {
    	
    	PlayerAnimation animation;
        switch(managedState) {
        case AIMING:
            animation = new PlayerRawPitchAnimation(managedState)
                    .setMaxPitch(maxPitch)
                    .setMaxYaw(maxYaw)
                    .setPlayer(player)
                    .setTransitionDuration(transitionDuration);
            break;
        case SHOOTING:
            Builder builder = weapon.getScreenShakeAnimationBuilder(RenderableState.SHOOTING);
//            ScreenShaking weaponScreenShaking = weapon.getScreenShaking(RenderableState.SHOOTING);
//            animation = new ScreenShakeAnimation.Builder()
//                    .withState(managedState)
//                    .withRotationAttenuation(0.5f)
//                    .withTranslationAttenuation(0.05f)
//                    .withZRotationCoefficient(weaponScreenShaking != null ? weaponScreenShaking.getZRotationCoefficient(): 2f)
//                    .withTransitionDuration(50)
//                    .build();
            animation = builder.build();
            break;
        case DEFAULT: default:
            animation = PlayerAnimation.NO_ANIMATION;
            break;
        }
        return animation;
    }

    private PlayerAnimation getAnimationForManagedState(EntityPlayer player, PlayerWeaponInstance instance, State managedState) {
        return allPlayerAnimations.computeIfAbsent(new Key(player, managedState, instance.getWeapon()), 
                k -> createAnimationForManagedState(player, k.state, instance.getWeapon()));
    }

}
