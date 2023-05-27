package com.paneedah.weaponlib.animation.movement;

import com.paneedah.weaponlib.PlayerWeaponInstance;
import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.WeaponRenderer.StateDescriptor;
import com.paneedah.weaponlib.animation.ClientValueRepo;
import com.paneedah.weaponlib.animation.jim.BBLoader;
import com.paneedah.weaponlib.animation.jim.KeyedAnimation;
import com.paneedah.weaponlib.compatibility.CompatibleClientEventHandler;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.numerical.LissajousCurve;
import com.paneedah.weaponlib.numerical.SpringValue;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

/**
 * Class that handles weapon rotations, handles recoil animations, walking
 * animations, and any other procedural animation involving weapons in the mod.
 * 
 * [October 25th, 2022] Refactored code.
 * 
 * @author Homer Riva-Cambrin
 * @since October 25th, 2022
 */
public class WeaponRotationHandler {

	
	// One half of PI
	private static final float HALF_PI = (float) (Math.PI / 2.0f);

	
	// animations
	public static final KeyedAnimation WALKING_ANIMATION = new KeyedAnimation(BBLoader.getAnimation("universal", "walkforward", "main"));
	public static final KeyedAnimation RUNNING_ANIMATION = new KeyedAnimation(BBLoader.getAnimation("universal", "running", "main"));
	public static final KeyedAnimation STRAFING_ANIMATION = new KeyedAnimation(BBLoader.getAnimation("universal", "walk", "main"));

	
	// Rotation points
	private static final Vec3d MOVEMENT_ANIMATION_ROTATION_POINT = new Vec3d(-0.10, -1, 0);
	private static final Vec3d SWAY_ANIMATION_ROTATION_POINT = new Vec3d(0, 0, 1.5);
	private static final Vec3d RECOIL_ANIMATION_ROTATION_POINT = new Vec3d(0, 1, 0);
	
	// The walking sway is composed of the forward and strafe sway, they
	// are multiplied by this and added together
	private static final float WALKING_SWAY_COMPONENT_DIVISOR = 0.033f;
	
	// Recoil is multiplied by this before the weapon is translated.
	private static final double RECOIL_ANIMATION_AMPLITUDE = 0.008;
	
	
	private static final float SWAY_AMPLITUDE_NORMAL = 0.15f;
	private static final float SWAY_AMPLITUDE_OPTICAL_ADS = 0.03f;
	
	// Divisor multiplier if the player is using an optical scope
	private static final float DIVISOR_MULTIPLIER_OPTICAL= 0.33f;
	
	// ADS divisor values, we usually want to dimish effects in ADS
	private static final float RECOVERY_SPRING_ADS_DAMPING = 5;
	private static final float FORWARD_MAGNITUDE_ADS_DIVISOR = 0.2f; // 0.2 -> 1/5
	private static final float STRAFE_MAGNITUDE_ADS_DIVISOR = 0.33f; // 0.3 -> 1/3
	private static final float RECOIL_AMPLITUDE_ADS_DIVISOR = 0.33f; // 0.3 -> 1/3
	private static final float WEAPON_RECOVERY_ADS_DIVISOR = 0.5f; // 0.5 -> 1/2
	private static final float WALKING_SWAY_ADS_DIVISOR = 0.25f; // 0.25 -> 1/4
	
	
	
	
	/**
	 * Applies rotation at a point (xOffset, yOffset, zOffset) in degrees. By
	 * shifting the object by the inverse of that translation and shifting it back.
	 * +
	 * 
	 * @param xOffset
	 * @param yOffset
	 * @param zOffset
	 * @param xRotation
	 * @param yRotation
	 * @param zRotation
	 */
	public static void applyRotationAtPoint(float xOffset, float yOffset, float zOffset, float xRotation,
			float yRotation, float zRotation) {
		GL11.glTranslatef(-xOffset, -yOffset, -zOffset);
		GL11.glRotatef(xRotation, 1f, 0f, 0f);
		GL11.glRotatef(yRotation, 0f, 1f, 0f);
		GL11.glRotatef(zRotation, 0f, 0f, 1f);
		GL11.glTranslatef(xOffset, yOffset, zOffset);
	}
	
	public static void applyRotationAtPoint(Vec3d offset, float x, float y, float z) {
		applyRotationAtPoint((float) offset.x, (float) offset.y, (float) offset.z, x, y, z);
	}

	/**
	 * To be entirely honest, this method is a little bit confusing.
	 * It was constructed to do the procedural animations, while refactoring
	 * I thought it deserved some explanation, but largely it just applies things
	 * in an order that ended up looking good.
	 * 
	 * 1. Do movement animations (walk, strafe, and run)
	 * 2. Do the walk sway animations (translation then rotation)
	 * 3. Apply inertia translations
	 * 4. Apply weapon recovery animations
	 * 5. Apply recoil animations + stress vector
	 * 
	 * @param renderContext
	 * @param stateDescriptor
	 */
	public void run(RenderContext<RenderableState> renderContext, StateDescriptor stateDescriptor) {

		
		if(CompatibleClientEventHandler.cancelSway) return;
		
		/*
		 * Prepare values and do calculations
		 */
		
		PlayerWeaponInstance pwi = renderContext.getWeaponInstance();
		RecoilParam params = pwi.getRecoilParameters();

		// Handle the basic animations
		float forwardMagnitude = ClientValueRepo.forward.getLerpedFloat();
		float strafeMagnitude = ClientValueRepo.strafe.getLerpedFloat();
		float runningMagnitude = ClientValueRepo.running.getLerpedFloat();

		
		
		
		// Sway & walk
		float swayAmplitude = SWAY_AMPLITUDE_NORMAL;
		float walkingSwayAmplitude = strafeMagnitude * WALKING_SWAY_COMPONENT_DIVISOR
					+ forwardMagnitude * WALKING_SWAY_COMPONENT_DIVISOR;

		// Recoil
		float recoilAmplitude = ClientValueRepo.gunPow.getLerpedFloat();

		float weaponRecoveryAmplitude = ClientValueRepo.weaponRecovery.getLerpedFloat() / 15f;
		float muzzleClimbDivisor = (float) params.getMuzzleClimbDivisor();
		float rotationYDivisor = (float) params.getWeaponRotationX();
		float rotationZDivisor = (float) params.getWeaponRotationY();

		SpringValue recoverySpring = ClientValueRepo.weaponRecovery;
		
		

		if (renderContext.getWeaponInstance().isAimed()) {
			float divisorMultiplier = 1f;

		
				
				if (renderContext.getWeaponInstance().getScope() != null
						&& renderContext.getWeaponInstance().getScope().isOptical()) {
					divisorMultiplier = DIVISOR_MULTIPLIER_OPTICAL;
					swayAmplitude = SWAY_AMPLITUDE_OPTICAL_ADS;
					walkingSwayAmplitude *= 0.33f;
				}

				divisorMultiplier /= params.getADSSimilarity();

				// The spring is more obvious in first person
				// so, by increasing the damping we can make
				// it look better.
				recoverySpring.setDamping(RECOVERY_SPRING_ADS_DAMPING);

				
				
				
				
				forwardMagnitude *= FORWARD_MAGNITUDE_ADS_DIVISOR * divisorMultiplier;
				strafeMagnitude *= STRAFE_MAGNITUDE_ADS_DIVISOR * divisorMultiplier;
				recoilAmplitude *= RECOIL_AMPLITUDE_ADS_DIVISOR * divisorMultiplier;
				weaponRecoveryAmplitude *= WEAPON_RECOVERY_ADS_DIVISOR * divisorMultiplier;
				walkingSwayAmplitude *= WALKING_SWAY_ADS_DIVISOR * divisorMultiplier;
			

		}
		
		double gunSwayX = LissajousCurve.getXOffsetOnCurve(swayAmplitude, 0.25, Math.PI, 0,
				ClientValueRepo.TICKER.getLerpedFloat());
		double gunSwayY = LissajousCurve.getXOffsetOnCurve(swayAmplitude, 0.5, Math.PI, HALF_PI,
				ClientValueRepo.TICKER.getLerpedFloat());

		double walkSwayX = LissajousCurve.getXOffsetOnCurve(walkingSwayAmplitude, 0.5, Math.PI, 0,
				ClientValueRepo.TICKER.getLerpedFloat());
		double walkSwayY = LissajousCurve.getXOffsetOnCurve(walkingSwayAmplitude, 0.25, Math.PI, HALF_PI,
				ClientValueRepo.TICKER.getLerpedFloat());
		
		Vec3d stressVector = ClientValueRepo.stressVec.getInterpolatedVector(2.0);
		Vec3d recoilRotation = ClientValueRepo.recoilRotationVector.getInterpolatedVector(1.0);

		/*
		 * Carry out animations
		 */
		
		// Apply movement animations
		STRAFING_ANIMATION.doPositioning((float) strafeMagnitude, MOVEMENT_ANIMATION_ROTATION_POINT);
		WALKING_ANIMATION.doPositioning((float) Math.max(forwardMagnitude - runningMagnitude, 0),
				MOVEMENT_ANIMATION_ROTATION_POINT);
		RUNNING_ANIMATION.doPositioning((float) Math.max(runningMagnitude, 0), MOVEMENT_ANIMATION_ROTATION_POINT);
		
		// Apply sway animations
		GlStateManager.translate(walkSwayY, walkSwayX, 0);
		applyRotationAtPoint(SWAY_ANIMATION_ROTATION_POINT, (float) gunSwayX, (float) gunSwayY, 0f);

		// Apply inertia translations
		GlStateManager.rotate((float) ClientValueRepo.xInertia.getLerpedPosition(), 0, 1, 0);
		GlStateManager.rotate((float) ClientValueRepo.yInertia.getLerpedPosition(), 1, 0, 0);

		// Apply weapon recovery animation
		GlStateManager.translate(0, weaponRecoveryAmplitude / 5f, weaponRecoveryAmplitude);
		GlStateManager.rotate(weaponRecoveryAmplitude * 5f, 1, 0, 0);

		// Apply stress vector
		GlStateManager.translate(stressVector.x, stressVector.y, stressVector.z);
		
		// Apply recoil animation
		GlStateManager.translate(0, 0, recoilAmplitude * RECOIL_ANIMATION_AMPLITUDE);
		applyRotationAtPoint(RECOIL_ANIMATION_ROTATION_POINT, (float) recoilRotation.x, (float) recoilRotation.y,
				(float) recoilRotation.z);
		applyRotationAtPoint(RECOIL_ANIMATION_ROTATION_POINT, -recoilAmplitude / muzzleClimbDivisor, recoilAmplitude * rotationYDivisor,
				recoilAmplitude * rotationZDivisor);

	}

}
