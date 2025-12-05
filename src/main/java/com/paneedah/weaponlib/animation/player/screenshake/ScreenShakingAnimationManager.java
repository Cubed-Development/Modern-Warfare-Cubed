package com.paneedah.weaponlib.animation.player.screenshake;

import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.animation.player.PlayerAnimation;
import com.paneedah.weaponlib.animation.player.PlayerRawPitchAnimation;
import lombok.*;
import net.minecraft.entity.player.EntityPlayer;

import java.util.*;

public final class ScreenShakingAnimationManager {

	private static final long TRANSITION_DURATION = 2000;

	private static final float MAX_YAW = 2f;
	private static final float MAX_PITCH = 2f;

	private static final Map<Key, PlayerAnimation> ALL_PLAYER_ANIMATIONS = new HashMap<>();
	private static final Map<EntityPlayer, PlayerAnimation> ACTIVE_ANIMATIONS = new HashMap<>();

	private static State lastTargetState;

	public static void update(final EntityPlayer player, final PlayerWeaponInstance instance, final RenderableState state) {
		final State targetState = toManagedState(state);

		PlayerAnimation activeAnimation = ACTIVE_ANIMATIONS.get(player);
		if (activeAnimation == null) {
			activeAnimation = getAnimationForManagedState(player, instance, targetState);

			ACTIVE_ANIMATIONS.put(player, activeAnimation);
		} else {
			final State currentAnimationState = activeAnimation.getState();

			if (currentAnimationState == targetState) {
				if (targetState != lastTargetState)
					activeAnimation.reset(player, false);
			} else if (currentAnimationState.getPriority() < targetState.getPriority() || activeAnimation.isCompleted()) {
				activeAnimation = getAnimationForManagedState(player, instance, targetState);

				activeAnimation.reset(player, true);

				ACTIVE_ANIMATIONS.put(player, activeAnimation);
			}
		}

		activeAnimation.update(player, true);
		lastTargetState = targetState;
	}

	public static State toManagedState(final RenderableState state) {
		if (state == null)
			return State.DEFAULT;

		switch (state) {
			case SHOOTING:
			case ZOOMING_SHOOTING: //case RECOILED: case ZOOMING_RECOILED:
				return State.SHOOTING;
			case RELOADING:
				return State.RELOADING;
			case ZOOMING:
				return State.AIMING;
			default:
				return State.DEFAULT;
		}
	}

	private static PlayerAnimation createAnimationForManagedState(EntityPlayer player, State managedState, Weapon weapon) {
		switch (managedState) {
			case AIMING:
				return new PlayerRawPitchAnimation(managedState)
						.setMaxPitch(MAX_PITCH)
						.setMaxYaw(MAX_YAW)
						.setPlayer(player)
						.setTransitionDuration(TRANSITION_DURATION);
			case SHOOTING:
				return weapon.getScreenShakeAnimationBuilder(RenderableState.SHOOTING).build();
//            final ScreenShaking weaponScreenShaking = weapon.getScreenShaking(RenderableState.SHOOTING);
//            return new ScreenShakeAnimation.Builder()
//                    .withState(managedState)
//                    .withRotationAttenuation(0.5f)
//                    .withTranslationAttenuation(0.05f)
//                    .withZRotationCoefficient(weaponScreenShaking != null ? weaponScreenShaking.getZRotationCoefficient(): 2f)
//                    .withTransitionDuration(50)
//		            .build();
			default:
				return PlayerAnimation.NO_ANIMATION;
		}
	}

	private static PlayerAnimation getAnimationForManagedState(final EntityPlayer player, final PlayerWeaponInstance instance, State state) {
		return ALL_PLAYER_ANIMATIONS.computeIfAbsent(new Key(player.getPersistentID(), state, instance.getWeapon()), key -> createAnimationForManagedState(player, key.state, instance.getWeapon()));
	}

	@Getter
	@RequiredArgsConstructor
	public enum State {

		SHOOTING(0, 0.1F),
		RELOADING(-5, 0),
		AIMING(-10, 0),
		DEFAULT(Integer.MIN_VALUE, 0);

		private final int priority;
		private final float stepAdjustment;
	}

	@EqualsAndHashCode
	@RequiredArgsConstructor
	private static class Key {

		private final UUID playerUUID;
		private final State state;
		private final Weapon weapon;
	}
}
